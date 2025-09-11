package com.xmacedo.hash;

import java.util.HashMap;

//Chapter 5, pag 104
public class Cache {
    private static HashMap<String, String> cache = new HashMap<>();
    public static void main(String[] args) {
        System.out.println(getPage("index"));
        System.out.println(getPage("about"));
        System.out.println(getPage("index"));
    }

    private static String getPage(String pagina) {
        if (!cache.isEmpty() && cache.get(pagina) != null) {
            return cache.get(pagina);
        } else {
            return getPageFromServer(pagina);
        }
    }

    private static String getPageFromServer(String pagina) {
        cache.put(pagina, "cache data");
        return "Page: Server data";
    }
}
