package com.xmacedo.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstraExample {
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 1);
        graph.addEdge(2, 1, 2);
        graph.addEdge(1, 3, 5);
        graph.addEdge(2, 3, 8);
        graph.addEdge(3, 4, 3);

        graph.dijkstra(0);
    }


    private static class Graph {
        private int vertices;
        private List<List<Node>> adjList;

        public Graph(int vertices) {
            this.vertices = vertices;
            adjList = new ArrayList<>(vertices);
            for (int i = 0; i < vertices; i++) {
                adjList.add(new ArrayList<>());
            }
        }

        public void addEdge(int src, int dest, int weight) {
            adjList.get(src).add(new Node(dest, weight));
            adjList.get(dest).add(new Node(src, weight)); // Para grafos não direcionados
        }

        public void dijkstra(int startVertex) {
            int[] distances = new int[vertices];
            Arrays.fill(distances, Integer.MAX_VALUE);
            distances[startVertex] = 0;

            PriorityQueue<Node> pq = new PriorityQueue<>(vertices, Comparator.comparingInt(node -> node.weight));
            pq.add(new Node(startVertex, 0));

            while (!pq.isEmpty()) {
                Node node = pq.poll();
                int currentVertex = node.vertex;

                for (Node neighbor : adjList.get(currentVertex)) {
                    int edgeWeight = neighbor.weight;
                    int newDist = distances[currentVertex] + edgeWeight;

                    if (newDist < distances[neighbor.vertex]) {
                        distances[neighbor.vertex] = newDist;
                        pq.add(new Node(neighbor.vertex, newDist));
                    }
                }
            }

            printDistances(distances);
        }

        private void printDistances(int[] distances) {
            System.out.println("Distances from the starting vertex:");
            for (int i = 0; i < distances.length; i++) {
                System.out.println("Vertex " + i + " : " + distances[i]);
            }
        }

        class Node {
            int vertex, weight;

            public Node(int vertex, int weight) {
                this.vertex = vertex;
                this.weight = weight;
            }
        }
    }

}
