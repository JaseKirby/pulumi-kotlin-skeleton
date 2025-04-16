package pulkot

import com.pulumi.Pulumi

fun main() {
  Pulumi.run { createStack(it) }
}
