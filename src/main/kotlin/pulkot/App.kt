package pulkot

import com.pulumi.Pulumi
import com.pulumi.aws.s3.BucketV2

fun main() {
  Pulumi.run { BucketV2("hello-world") }
}
