# ONOS_LoadBalance_Routing_Forward

LoadBalance Routing and Forwarding Application @ ONOS

If you like this project, please click **Star** at the top-right corner, thanks for your support :)

Knowledge articles:
[ONOS：负载均衡路由算法及应用开发（一）](https://www.maojianwei.com/2016/10/11/Algorithm-for-Load-Balance-Routing-theory-and-project-development-in-ONOS-1/), 
[ONOS：负载均衡路由算法及应用开发（二）](https://www.maojianwei.com/2016/12/20/Algorithm-for-Load-Balance-Routing-theory-and-project-development-in-ONOS-2/)

.

## Update Note

2019.01.17 Update and release 1.2 to adapt ONOS **2.1.0-SNAPSHOT** version, backed by Apache Karaf **4.2.2**

2018.05.15 Update and release 1.1 to adapt ONOS **1.14.0-SNAPSHOT** version, backed by Apache Karaf **3.0.8**

2017.03.28 Build, run and test. All pass. Release 1.0 for ONOS **1.9.0-SNAPSHOT** version.

.

## Demo

![ONOS_LoadBalance_Routing_Forward by Mao Jianwei](https://www.maojianwei.com/resources/picture/2016/10/onosLB/1-load-balance-example.png)

.

## Latest Instruction to Compile

1. Embed me with ONOS codebase
2. Modify the **$ONOS_ROOT/tools/build/bazel/modules.bzl** file, refer to **modules.bzl__available_example** file
3. Build whole ONOS by bazel.
   (You can use my utility script for ONOS: https://github.com/MaoJianwei/SDN_Scripts/blob/master/ONOS/autoONOS_Bazel.sh)

**Out-of-date:**
I provide pom.xml for importing this project to Intellij IDEA or other IDE by maven, but you **should NOT** use maven to compile me, and maven may fail.

.

## Backward Compatibility

You can find all milestone versions at [Release](https://github.com/MaoJianwei/ONOS_LoadBalance_Routing_Forward/releases) page.

.

If you use ONOS around 1.14.0-SNAPSHOT version, you can checkout to this commit history:

https://github.com/MaoJianwei/ONOS_LoadBalance_Routing_Forward/tree/c8133740b5522153d908dff84052f772343e65f9

.

If you use ONOS around 1.9.0-SNAPSHOT version, you can checkout to this commit history:

https://github.com/MaoJianwei/ONOS_LoadBalance_Routing_Forward/tree/f56b114e74ffce1c59192f661fa2f055b1f66e52

.

## Community Support

Long term support(LTS) from 2018.05.15, by:

:) [Jianwei Mao @ BUPT FNLab](https://www.maojianwei.com/) - ONOS China Ambassador - MaoJianwei2020@gmail.com / MaoJianwei2012@126.com 
