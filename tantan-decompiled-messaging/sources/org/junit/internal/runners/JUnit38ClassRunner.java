package org.junit.internal.runners;

import java.lang.annotation.Annotation;
import junit.framework.AssertionFailedError;
import org.junit.runner.Describable;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.manipulation.Filter;
import org.junit.runner.manipulation.Filterable;
import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runner.manipulation.Sortable;
import org.junit.runner.manipulation.Sorter;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;
import p149l.mhi0;
import p149l.nhi0;
import p149l.ohi0;
import p149l.shi0;
import p149l.thi0;
import p149l.uhi0;

/* JADX INFO: loaded from: classes3.dex */
public class JUnit38ClassRunner extends Runner implements Filterable, Sortable {
    private volatile mhi0 test;

    public static final class OldTestClassAdaptingListener implements shi0 {
        private final RunNotifier notifier;

        private OldTestClassAdaptingListener(RunNotifier runNotifier) {
            this.notifier = runNotifier;
        }

        private Description asDescription(mhi0 mhi0Var) {
            return mhi0Var instanceof Describable ? ((Describable) mhi0Var).getDescription() : Description.createTestDescription(getEffectiveClass(mhi0Var), getName(mhi0Var));
        }

        private Class<? extends mhi0> getEffectiveClass(mhi0 mhi0Var) {
            return mhi0Var.getClass();
        }

        private String getName(mhi0 mhi0Var) {
            return mhi0Var instanceof nhi0 ? ((nhi0) mhi0Var).m159410g() : mhi0Var.toString();
        }

        @Override // p149l.shi0
        public void addError(mhi0 mhi0Var, Throwable th) {
            this.notifier.fireTestFailure(new Failure(asDescription(mhi0Var), th));
        }

        @Override // p149l.shi0
        public void addFailure(mhi0 mhi0Var, AssertionFailedError assertionFailedError) {
            addError(mhi0Var, assertionFailedError);
        }

        @Override // p149l.shi0
        public void endTest(mhi0 mhi0Var) {
            this.notifier.fireTestFinished(asDescription(mhi0Var));
        }

        @Override // p149l.shi0
        public void startTest(mhi0 mhi0Var) {
            this.notifier.fireTestStarted(asDescription(mhi0Var));
        }
    }

    public JUnit38ClassRunner(Class<?> cls) {
        this(new uhi0(cls.asSubclass(nhi0.class)));
    }

    private static String createSuiteDescription(uhi0 uhi0Var) {
        int iMo112098b = uhi0Var.mo112098b();
        return String.format("TestSuite with %s tests%s", Integer.valueOf(iMo112098b), iMo112098b == 0 ? "" : String.format(" [example: %s]", uhi0Var.m193737n(0)));
    }

    private static Annotation[] getAnnotations(nhi0 nhi0Var) {
        try {
            return nhi0Var.getClass().getMethod(nhi0Var.m159410g(), null).getDeclaredAnnotations();
        } catch (NoSuchMethodException | SecurityException unused) {
            return new Annotation[0];
        }
    }

    private mhi0 getTest() {
        return this.test;
    }

    private static Description makeDescription(mhi0 mhi0Var) {
        if (mhi0Var instanceof nhi0) {
            nhi0 nhi0Var = (nhi0) mhi0Var;
            return Description.createTestDescription(nhi0Var.getClass(), nhi0Var.m159410g(), getAnnotations(nhi0Var));
        }
        if (!(mhi0Var instanceof uhi0)) {
            if (mhi0Var instanceof Describable) {
                return ((Describable) mhi0Var).getDescription();
            }
            return mhi0Var instanceof ohi0 ? makeDescription(((ohi0) mhi0Var).m164366g()) : Description.createSuiteDescription(mhi0Var.getClass());
        }
        uhi0 uhi0Var = (uhi0) mhi0Var;
        Description descriptionCreateSuiteDescription = Description.createSuiteDescription(uhi0Var.m193734h() == null ? createSuiteDescription(uhi0Var) : uhi0Var.m193734h(), new Annotation[0]);
        int iM193738o = uhi0Var.m193738o();
        for (int i = 0; i < iM193738o; i++) {
            descriptionCreateSuiteDescription.addChild(makeDescription(uhi0Var.m193737n(i)));
        }
        return descriptionCreateSuiteDescription;
    }

    private void setTest(mhi0 mhi0Var) {
        this.test = mhi0Var;
    }

    public shi0 createAdaptingListener(RunNotifier runNotifier) {
        return new OldTestClassAdaptingListener(runNotifier);
    }

    @Override // org.junit.runner.manipulation.Filterable
    public void filter(Filter filter) throws NoTestsRemainException {
        if (getTest() instanceof Filterable) {
            ((Filterable) getTest()).filter(filter);
            return;
        }
        if (getTest() instanceof uhi0) {
            uhi0 uhi0Var = (uhi0) getTest();
            uhi0 uhi0Var2 = new uhi0(uhi0Var.m193734h());
            int iM193738o = uhi0Var.m193738o();
            for (int i = 0; i < iM193738o; i++) {
                mhi0 mhi0VarM193737n = uhi0Var.m193737n(i);
                if (filter.shouldRun(makeDescription(mhi0VarM193737n))) {
                    uhi0Var2.m193733c(mhi0VarM193737n);
                }
            }
            setTest(uhi0Var2);
            if (uhi0Var2.m193738o() == 0) {
                throw new NoTestsRemainException();
            }
        }
    }

    @Override // org.junit.runner.Runner, org.junit.runner.Describable
    public Description getDescription() {
        return makeDescription(getTest());
    }

    @Override // org.junit.runner.Runner
    public void run(RunNotifier runNotifier) {
        thi0 thi0Var = new thi0();
        thi0Var.m188915c(createAdaptingListener(runNotifier));
        getTest().mo112097a(thi0Var);
    }

    @Override // org.junit.runner.manipulation.Sortable
    public void sort(Sorter sorter) {
        if (getTest() instanceof Sortable) {
            ((Sortable) getTest()).sort(sorter);
        }
    }

    public JUnit38ClassRunner(mhi0 mhi0Var) {
        setTest(mhi0Var);
    }
}
