module com.sample.jlink {
    requires org.slf4j;
    requires org.graalvm.sdk;
    requires org.graalvm.truffle;
    exports com.sample.app;
    // export com.sample.app to com.specific.package;
}
