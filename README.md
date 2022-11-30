# The Pera Journey

The purpose of this repository is to give a template to keep track of a Team Member's [LeetCode](https://leetcode.com) solutions.

## HowTo

Open this project on IntelliJ Idea and run tests on the [Demo](src/main/kotlin/solutions/Demo.kt) class that's already there. If they work, then you're all set and can start coding! 🎉

## Resources

There is a section called `Resources` where you can write down useful information to solve problems in an efficient way.

## Testing

Tests should be written based on LeetCode test cases and can be put under `src/test/kotlin/XTest.kt` where `X` represents the problem name.

## Additional info

Solutions should implement Executable interface which is not related to LeetCode. Purpose of this interface to ensure consistency between problems

```
class ProblemName : Executable<ProblemArgs, ProblemReturnType> {

    override operator fun invoke(args: ProblemArgs): ProblemReturnType {
        ...
    }

    data class ProblemArgs(...)
}


// To call
val problemNameInstance = ProblemName()

val args: ProblemArgs = ProblemArgs(...)
val result: ProblemReturnType = problemNameInstance(args)
```

## Solved Problems

| Problem                                   | Solution                                     | Problem Test                               | Related Resource             |
|-------------------------------------------|----------------------------------------------|--------------------------------------------|------------------------------|
| [0. Demo](https://leetcode.com/problems/) | [Demo.kt](src/main/kotlin/solutions/Demo.kt) | [DemoTest.kt](src/test/kotlin/DemoTest.kt) | [Demo.md](resources/Demo.md) |

## Credits

[@mitsinsar](https://github.com/mitsinsar) for creating the base of this