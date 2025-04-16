package pulkot

import com.pulumi.Context
import com.pulumi.aws.s3.BucketV2

fun createStack(ctx: Context) {
  ctx.log().info("hello world")
  BucketV2("hello-world")
}
