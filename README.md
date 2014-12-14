Continuous Integration
======================

Introduction
------------

The experience shows us that, when many developers start to build a project togeter then most likely there will appear
errors in the project. Continous Integration is a development practice to detect the errors quickly and locate them
more easily. The developers are required to integrate the code into a shared repository several times a day. Each
of this check-ins will be verified by an automated build, to detect probleams early on.
So the base concept is not to get rid of the errors/bugs, but to make finding and removeing them 
a lot easier.

Benefits
--------

Because of a frequently integrating, there is significantly less back-tracking to discover the source of the bug. 
Additionaly CI is very cheap, meaning a not time consuming action while searching for bugs in a project without CI is.
If you do not have a continous approach, you will have longer time periods between the integrations. But this makes 
it exponentially more difficult to find and fix the errors and such problems can result in a off-schedule or cause
the project to fail altogether.

A list of the abouve mentioned and more benefits of CI:

+ No more long and tense integrations
+ Greater communication
+ Catch issues fast
+ Less time debugging
+ Confidence that you're building on a solid foundation
+ Reduce integration problems

More then a process
-------------------

CI is backed by several important principles and practices. A shor overview:
Maintain a single source repository, automate the build and make it self testing, keep the build fast and make it
easy for anyone to get the latest executable. To get this things done, the developers should check out code in their 
private workspace and, when done, commiting changes into the repository. While the CI server will monitor the repository
and check out changes when they occur, building the system and running unit and integration tests, releasing 
deployable artefacts, assigning build label to the version of built code and infroming the team with status the 
built got.
If the CI alerts the team it should prioritise the fixing of the issue.

