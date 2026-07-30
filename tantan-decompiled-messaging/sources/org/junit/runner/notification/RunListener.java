package org.junit.runner.notification;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.junit.runner.Description;
import org.junit.runner.Result;

/* JADX INFO: loaded from: classes3.dex */
public class RunListener {

    @Target({ElementType.TYPE})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface ThreadSafe {
    }

    public void testAssumptionFailure(Failure failure) {
    }

    public void testFailure(Failure failure) throws Exception {
    }

    public void testFinished(Description description) throws Exception {
    }

    public void testIgnored(Description description) throws Exception {
    }

    public void testRunFinished(Result result) throws Exception {
    }

    public void testRunStarted(Description description) throws Exception {
    }

    public void testStarted(Description description) throws Exception {
    }
}
