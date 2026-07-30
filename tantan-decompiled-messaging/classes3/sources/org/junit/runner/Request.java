package org.junit.runner;

import java.util.Comparator;
import org.junit.internal.builders.AllDefaultPossibilitiesBuilder;
import org.junit.internal.requests.ClassRequest;
import org.junit.internal.requests.FilterRequest;
import org.junit.internal.requests.SortingRequest;
import org.junit.internal.runners.ErrorReportingRunner;
import org.junit.runner.manipulation.Filter;
import org.junit.runners.model.InitializationError;
import p003l.upk0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class Request {
    public static Request aClass(Class<?> cls) {
        return new ClassRequest(cls);
    }

    public static Request classWithoutSuiteMethod(Class<?> cls) {
        return new ClassRequest(cls, false);
    }

    public static Request classes(Computer computer, Class<?>... clsArr) {
        try {
            return runner(computer.getSuite(new AllDefaultPossibilitiesBuilder(true), clsArr));
        } catch (InitializationError unused) {
            upk0.m8197a("Bug in saff's brain: Suite constructor, called as above, should always complete");
            return null;
        }
    }

    public static Request errorReport(Class<?> cls, Throwable th) {
        return runner(new ErrorReportingRunner(cls, th));
    }

    public static Request method(Class<?> cls, String str) {
        return aClass(cls).filterWith(Description.createTestDescription(cls, str));
    }

    public static Request runner(final Runner runner) {
        return new Request() { // from class: org.junit.runner.Request.1
            @Override // org.junit.runner.Request
            public Runner getRunner() {
                return runner;
            }
        };
    }

    public Request filterWith(Description description) {
        return filterWith(Filter.matchMethodDescription(description));
    }

    public abstract Runner getRunner();

    public Request sortWith(Comparator<Description> comparator) {
        return new SortingRequest(this, comparator);
    }

    public Request filterWith(Filter filter) {
        return new FilterRequest(this, filter);
    }

    public static Request classes(Class<?>... clsArr) {
        return classes(JUnitCore.defaultComputer(), clsArr);
    }
}
