package org.junit.experimental.results;

import java.util.Iterator;
import java.util.List;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;
import p149l.upk0;

/* JADX INFO: loaded from: classes3.dex */
class FailureList {
    private final List<Failure> failures;

    public FailureList(List<Failure> list) {
        this.failures = list;
    }

    public Result result() {
        Result result = new Result();
        RunListener runListenerCreateListener = result.createListener();
        Iterator<Failure> it = this.failures.iterator();
        while (it.hasNext()) {
            try {
                runListenerCreateListener.testFailure(it.next());
            } catch (Exception unused) {
                upk0.m194883a("I can't believe this happened");
                return null;
            }
        }
        return result;
    }
}
