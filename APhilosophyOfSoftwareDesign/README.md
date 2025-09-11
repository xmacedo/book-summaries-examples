# A Philosophy Of Software Design 2nd edition

### Chapter 2 - The Nature of Complexity

#### 2.1 - Complexity defined
- Complexity is anything related to the structure of a software system that makes it hard to understand and modify the system.

#### 2.2 - Symptoms of Complexity
1. Change amplification
2. Cognitive load
3. Unknown unknowns

#### 2.3 Causes of complexity
- Dependencies are a fundamental part of software and can’t be completely eliminated.

### 2.4 Complexity is incremental

### 2.5 Conclusion
Complexity comes from an accumulation of dependencies and obscurities. 
As complexity increases, it leads to change amplification, a high cognitive load, 
and unknown unknowns. As a result, it takes more code modifications to implement 
each new feature. In addition, developers spend more time acquiring enough 
information to make the change safely and, in the worst case, they can’t even find all 
the information they need. The bottom line is that complexity makes it difficult and 
risky to modify an existing code base.

### Chapter 4 - 