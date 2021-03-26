Until now, we have seen Scenarios getting executed 1 by 1, but in real time we might have more than 100’s of test cases to get executed across many Feature files. In that case, executing 100’s of Scenarios 1 by 1 is going to be a painful task.

Good news, Cucumber offers us an excellent solution for executing the tests in parallel.

Using JUnit, we can execute the Feature files in parallel.

For example, if you have 5 Feature files, then at the time 5 instances of the browsers will be opened and 5 Scenarios will be executed in parallel.

That's cool, right? It can save a lot of time.

Let me tell you another cool feature.

We have used a JUnit test framework for this entire course, but TestNG Framework offers us a way to execute the Scenarios in parallel, which means irrespective of the number of feature files, all these Scenarios across the Feature files will be executed in parallel.