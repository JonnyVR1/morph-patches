package org.junit.runner;

import org.junit.internal.JUnitSystem;
import org.junit.internal.RealSystem;
import org.junit.internal.TextListener;
import org.junit.internal.runners.JUnit38ClassRunner;
import org.junit.runner.notification.RunListener;
import org.junit.runner.notification.RunNotifier;
import p149l.k0l0;
import p149l.mhi0;

/* JADX INFO: loaded from: classes3.dex */
public class JUnitCore {
    private final RunNotifier notifier = new RunNotifier();

    public static Computer defaultComputer() {
        return new Computer();
    }

    public static void main(String... strArr) {
        System.exit(!new JUnitCore().runMain(new RealSystem(), strArr).wasSuccessful() ? 1 : 0);
    }

    public static Result runClasses(Computer computer, Class<?>... clsArr) {
        return new JUnitCore().run(computer, clsArr);
    }

    public void addListener(RunListener runListener) {
        this.notifier.addListener(runListener);
    }

    public String getVersion() {
        return k0l0.m144070a();
    }

    public void removeListener(RunListener runListener) {
        this.notifier.removeListener(runListener);
    }

    public Result run(Runner runner) {
        Result result = new Result();
        RunListener runListenerCreateListener = result.createListener();
        this.notifier.addFirstListener(runListenerCreateListener);
        try {
            this.notifier.fireTestRunStarted(runner.getDescription());
            runner.run(this.notifier);
            this.notifier.fireTestRunFinished(result);
            return result;
        } finally {
            removeListener(runListenerCreateListener);
        }
    }

    public Result runMain(JUnitSystem jUnitSystem, String... strArr) {
        jUnitSystem.out().println("JUnit version " + k0l0.m144070a());
        JUnitCommandLineParseResult jUnitCommandLineParseResult = JUnitCommandLineParseResult.parse(strArr);
        addListener(new TextListener(jUnitSystem));
        return run(jUnitCommandLineParseResult.createRequest(defaultComputer()));
    }

    public static Result runClasses(Class<?>... clsArr) {
        return runClasses(defaultComputer(), clsArr);
    }

    public Result run(Computer computer, Class<?>... clsArr) {
        return run(Request.classes(computer, clsArr));
    }

    public Result run(Request request) {
        return run(request.getRunner());
    }

    public Result run(mhi0 mhi0Var) {
        return run(new JUnit38ClassRunner(mhi0Var));
    }

    public Result run(Class<?>... clsArr) {
        return run(defaultComputer(), clsArr);
    }
}
