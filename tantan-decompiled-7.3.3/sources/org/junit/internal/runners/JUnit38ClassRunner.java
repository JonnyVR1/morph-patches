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
import p153l.mqi0;
import p153l.nqi0;
import p153l.oqi0;
import p153l.sqi0;
import p153l.tqi0;
import p153l.uqi0;

/* JADX INFO: loaded from: classes3.dex */
public class JUnit38ClassRunner extends Runner implements Filterable, Sortable {
    private volatile mqi0 test;

    public static final class OldTestClassAdaptingListener implements sqi0 {
        private final RunNotifier notifier;

        private OldTestClassAdaptingListener(RunNotifier runNotifier) {
            this.notifier = runNotifier;
        }

        private Description asDescription(mqi0 mqi0Var) {
            return mqi0Var instanceof Describable ? ((Describable) mqi0Var).getDescription() : Description.createTestDescription(getEffectiveClass(mqi0Var), getName(mqi0Var));
        }

        private Class<? extends mqi0> getEffectiveClass(mqi0 mqi0Var) {
            return mqi0Var.getClass();
        }

        private String getName(mqi0 mqi0Var) {
            return mqi0Var instanceof nqi0 ? ((nqi0) mqi0Var).m164314g() : mqi0Var.toString();
        }

        @Override // p153l.sqi0
        public void addError(mqi0 mqi0Var, Throwable th) {
            this.notifier.fireTestFailure(new Failure(asDescription(mqi0Var), th));
        }

        @Override // p153l.sqi0
        public void addFailure(mqi0 mqi0Var, AssertionFailedError assertionFailedError) {
            addError(mqi0Var, assertionFailedError);
        }

        @Override // p153l.sqi0
        public void endTest(mqi0 mqi0Var) {
            this.notifier.fireTestFinished(asDescription(mqi0Var));
        }

        @Override // p153l.sqi0
        public void startTest(mqi0 mqi0Var) {
            this.notifier.fireTestStarted(asDescription(mqi0Var));
        }
    }

    public JUnit38ClassRunner(Class<?> cls) {
        this(new uqi0(cls.asSubclass(nqi0.class)));
    }

    private static String createSuiteDescription(uqi0 uqi0Var) {
        int iMo110697b = uqi0Var.mo110697b();
        return String.format("TestSuite with %s tests%s", Integer.valueOf(iMo110697b), iMo110697b == 0 ? "" : String.format(" [example: %s]", uqi0Var.m197360n(0)));
    }

    private static Annotation[] getAnnotations(nqi0 nqi0Var) {
        try {
            return nqi0Var.getClass().getMethod(nqi0Var.m164314g(), null).getDeclaredAnnotations();
        } catch (NoSuchMethodException | SecurityException unused) {
            return new Annotation[0];
        }
    }

    private mqi0 getTest() {
        return this.test;
    }

    private static Description makeDescription(mqi0 mqi0Var) {
        if (mqi0Var instanceof nqi0) {
            nqi0 nqi0Var = (nqi0) mqi0Var;
            return Description.createTestDescription(nqi0Var.getClass(), nqi0Var.m164314g(), getAnnotations(nqi0Var));
        }
        if (!(mqi0Var instanceof uqi0)) {
            if (mqi0Var instanceof Describable) {
                return ((Describable) mqi0Var).getDescription();
            }
            return mqi0Var instanceof oqi0 ? makeDescription(((oqi0) mqi0Var).m168815g()) : Description.createSuiteDescription(mqi0Var.getClass());
        }
        uqi0 uqi0Var = (uqi0) mqi0Var;
        Description descriptionCreateSuiteDescription = Description.createSuiteDescription(uqi0Var.m197357h() == null ? createSuiteDescription(uqi0Var) : uqi0Var.m197357h(), new Annotation[0]);
        int iM197361o = uqi0Var.m197361o();
        for (int i = 0; i < iM197361o; i++) {
            descriptionCreateSuiteDescription.addChild(makeDescription(uqi0Var.m197360n(i)));
        }
        return descriptionCreateSuiteDescription;
    }

    private void setTest(mqi0 mqi0Var) {
        this.test = mqi0Var;
    }

    public sqi0 createAdaptingListener(RunNotifier runNotifier) {
        return new OldTestClassAdaptingListener(runNotifier);
    }

    @Override // org.junit.runner.manipulation.Filterable
    public void filter(Filter filter) throws NoTestsRemainException {
        if (getTest() instanceof Filterable) {
            ((Filterable) getTest()).filter(filter);
            return;
        }
        if (getTest() instanceof uqi0) {
            uqi0 uqi0Var = (uqi0) getTest();
            uqi0 uqi0Var2 = new uqi0(uqi0Var.m197357h());
            int iM197361o = uqi0Var.m197361o();
            for (int i = 0; i < iM197361o; i++) {
                mqi0 mqi0VarM197360n = uqi0Var.m197360n(i);
                if (filter.shouldRun(makeDescription(mqi0VarM197360n))) {
                    uqi0Var2.m197356c(mqi0VarM197360n);
                }
            }
            setTest(uqi0Var2);
            if (uqi0Var2.m197361o() == 0) {
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
        tqi0 tqi0Var = new tqi0();
        tqi0Var.m192310c(createAdaptingListener(runNotifier));
        getTest().mo110696a(tqi0Var);
    }

    @Override // org.junit.runner.manipulation.Sortable
    public void sort(Sorter sorter) {
        if (getTest() instanceof Sortable) {
            ((Sortable) getTest()).sort(sorter);
        }
    }

    public JUnit38ClassRunner(mqi0 mqi0Var) {
        setTest(mqi0Var);
    }
}
