# Circular-Dependencies
Solutions to solve circular dependencies in dependency injections


First thing you should know in dependency injection is that spring creates beans in reverse order.
i.e Bean_A ---> Bean_B ---> Bean_C

if Bean_A is dependent on Bean_B and Bean_B is dependent on Bean_C
then Spring creates Bean_C first and then injects bean_c(dependency) into Bean_B at the time of creation of Bean_B
and after the creation of Bean_B, injects bean_b into Bean_A at the time of creation of Bean_A.

So the bean creation order is
Bean_A <--- Bean_B <--- Bean_C

circular dependencies occurs when Bean_A ---> Bean_B ---> Bean_A
when A depends on B which in turn depends on A which is not yet created results in BEANCREATIONEXCEPTIONS

REASON FOR CIRCULAR DEPENDENCY:
this usually happens when you try to autowire dependencies through constructor arguements in both beans
refer for furthur queries https://www.baeldung.com/circular-dependencies-in-spring
