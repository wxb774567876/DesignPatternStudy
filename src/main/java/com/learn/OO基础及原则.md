OO基础:
抽象、封装、多态、继承

OO原则：
一、找出应用中可能需要变化的地方，把它们独立出来，不要和那些不需要变化的代码混在一起
例如：鸭子通常具备吃饭、游泳、外观展现、飞行等行为，但是也有一些特殊的鸭子不具备这些特性，例如玩具鸭、火箭鸭等
它们表现出来的呱呱叫的行为和大多数鸭子不一样，并且没有飞行的能力，针对呱呱叫和飞行这种在子类中容易发生变化的行为
我们可以考虑将这些行为独立出来，并设计为不同的行为类。从行为类中衍生出不一样的变现行为，并在父类中用has a A的方式定义
行为类的引用，这样行为类再多，不会影响太大。

二、针对接口编程，而不是针对实现编程
真正表达的含义是针对超类型编程，这里使用到的是Java多态，形象的理解就是声明的变量类型应该是超类型，使用行为类的接口或抽象类，而不是具体的实现类
程序在运行时执行到真正的行为

三、多用组合、少用继承
“有一个”可能比 “是一个“更好，每一个鸭子都具备飞行行为和呱呱叫的接口行为。使用组合建立的系统具有很大的弹性。
