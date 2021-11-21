package com.fpinkotlin.functions.exercise01


import io.kotlintest.properties.forAll
import io.kotlintest.specs.StringSpec

class FunctionsTest : StringSpec() {

    init {

        "compose" {
            forAll { x: Int ->
//                compose(::square, ::triple)(x) == square(triple(x))
                compose({ n -> square(n) }, { n -> triple(n) })(x) == square(triple(x))
            }
        }
    }
}
