# A Philosophy Of Software Design 2nd edition

## Chapter 2 - The Nature of Complexity

### 2.1 Complexity defined
- Complexity is anything related to the structure of a software system that makes it hard to understand and modify the system.

### 2.2 Symptoms of Complexity
1. Change amplification
2. Cognitive load
3. Unknown unknowns

### 2.3 Causes of complexity
- Dependencies are a fundamental part of software and can’t be completely eliminated.

### 2.4 Complexity is incremental

### 2.5 Conclusion
- Complexity comes from an accumulation of dependencies and obscurities. 


## Chapter 3 - Working Code Isn't Enough

### 3.1 Tactical programming

### 3.2 Strategic programming

### 3.3 How much to invest

### 3.4 Startups and investment

### 3.5 Conclusion
- Good design doesn’t come for free.

## Chapter 4 - Modules Should Be Deep

### 4.1 Modular design

### 4.2 What’s in an interface?

### 4.3 Abstractions

### 4.4 Deep modules

### 4.5 Shallow modules

### 4.6 Classitis
 - Controversal tip, "classes should be small"

### 4.7  Examples: Java and Unix I/O

### 4.8  Conclusion


## Chapter 5 - Information Hiding (and Leakage)

### 5.1 Information hiding

### 5.2 Information leakage
- The opposite of information hiding is information leakage. Information leakage occurs when a design decision is reflected in multiple modules. This creates a dependency between the modules: any change to that design decision will require changes to all of the involved modules.

- Information leakage occurs when the same knowledge is used in multiple places, such as two different classes that both understand the format of a particular type of file.

### 5.3 Temporal decomposition

- In temporal decomposition, execution order is reflected in the code structure: operations that happen at different times are in different methods or classes. If the same knowledge is used at different points in execution, it gets encoded in multiple places, resulting in information leakage.

### 5.4 Example: HTTP server

### 5.5 Example: too many classes

### 5.6 Example: HTTP parameter handling

### 5.7  Example: defaults in HTTP responses

### 5.8  Information hiding within a class

### 5.9  Taking it too far

### 5.10  Conclusion
- Information hiding and deep modules are closely related.

## Chapter 6 General-Purpose Modules are Deeper

### 6.1 Make classes somewhat general-purpose

### 6.2 Example: storing text for an editor

### 6.3 A moe general-purpose API

### 6.4 Gererality leads to better information hiding

### 6.5 Questions to ask yourself

### 6.6 Push specialization upwards (and downwards!)

### 6.7 Example: editor undo mechanism

### 6.8 Eliminate special cases in code

### 6.9 Conclusion
- Unnecessary specialization, is a significant contributor to software complexity. Specialization can’t be eliminated completely, but with good design you should be able to reduce it significantly and separate specialized code from general-purpose code.

## Chapter 7 - Different Layer, Different Abstraction
> Software systems are composed in layers, where higher layers use the facilities provided by lower layers.

### 7.1 Pass-through methods

### 7.2 When is interface duplication OK?

### 7.3 Decorators