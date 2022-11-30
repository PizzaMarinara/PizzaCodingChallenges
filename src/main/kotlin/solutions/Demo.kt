package solutions

import core.Executable

class Demo : Executable<Demo.DemoArgs, Demo.DemoReturn> {

    override operator fun invoke(args: DemoArgs): DemoReturn {
        return if (args.input > 0) {
            DemoReturn(1)
        } else {
            DemoReturn(-1)
        }
    }

    data class DemoArgs(
        val input: Int
    )
    data class DemoReturn(
        val output: Int
    )
}