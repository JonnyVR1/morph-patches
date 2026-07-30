package org.junit.runners;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.internal.AssumptionViolatedException;
import org.junit.internal.runners.model.EachTestNotifier;
import org.junit.internal.runners.rules.RuleMemberValidator;
import org.junit.internal.runners.statements.RunAfters;
import org.junit.internal.runners.statements.RunBefores;
import org.junit.rules.RunRules;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.manipulation.Filter;
import org.junit.runner.manipulation.Filterable;
import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runner.manipulation.Sortable;
import org.junit.runner.manipulation.Sorter;
import org.junit.runner.notification.RunNotifier;
import org.junit.runner.notification.StoppedByUserException;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.RunnerScheduler;
import org.junit.runners.model.Statement;
import org.junit.runners.model.TestClass;
import org.junit.validator.AnnotationsValidator;
import org.junit.validator.PublicClassValidator;
import org.junit.validator.TestClassValidator;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class ParentRunner<T> extends Runner implements Filterable, Sortable {
    private static final List<TestClassValidator> VALIDATORS = Arrays.asList(new AnnotationsValidator(), new PublicClassValidator());
    private final Object childrenLock = new Object();
    private volatile Collection<T> filteredChildren = null;
    private volatile RunnerScheduler scheduler = new RunnerScheduler() { // from class: org.junit.runners.ParentRunner.1
        @Override // org.junit.runners.model.RunnerScheduler
        public void finished() {
        }

        @Override // org.junit.runners.model.RunnerScheduler
        public void schedule(Runnable runnable) {
            runnable.run();
        }
    };
    private final TestClass testClass;

    public ParentRunner(Class<?> cls) throws InitializationError {
        this.testClass = createTestClass(cls);
        validate();
    }

    private void applyValidators(List<Throwable> list) {
        if (getTestClass().getJavaClass() != null) {
            Iterator<TestClassValidator> it = VALIDATORS.iterator();
            while (it.hasNext()) {
                list.addAll(it.next().validateTestClass(getTestClass()));
            }
        }
    }

    private boolean areAllChildrenIgnored() {
        Iterator<T> it = getFilteredChildren().iterator();
        while (it.hasNext()) {
            if (!isIgnored(it.next())) {
                return false;
            }
        }
        return true;
    }

    private Comparator<? super T> comparator(final Sorter sorter) {
        return new Comparator<T>() { // from class: org.junit.runners.ParentRunner.4
            @Override // java.util.Comparator
            public int compare(T t, T t2) {
                return sorter.compare(ParentRunner.this.describeChild(t), ParentRunner.this.describeChild(t2));
            }
        };
    }

    private Collection<T> getFilteredChildren() {
        if (this.filteredChildren == null) {
            synchronized (this.childrenLock) {
                try {
                    if (this.filteredChildren == null) {
                        this.filteredChildren = Collections.unmodifiableCollection(getChildren());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.filteredChildren;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runChildren(final RunNotifier runNotifier) {
        RunnerScheduler runnerScheduler = this.scheduler;
        try {
            for (final T t : getFilteredChildren()) {
                runnerScheduler.schedule(new Runnable() { // from class: org.junit.runners.ParentRunner.3
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.lang.Runnable
                    public void run() {
                        ParentRunner.this.runChild(t, runNotifier);
                    }
                });
            }
            runnerScheduler.finished();
        } catch (Throwable th) {
            runnerScheduler.finished();
            throw th;
        }
    }

    private boolean shouldRun(Filter filter, T t) {
        return filter.shouldRun(describeChild(t));
    }

    private void validate() throws InitializationError {
        ArrayList arrayList = new ArrayList();
        collectInitializationErrors(arrayList);
        if (!arrayList.isEmpty()) {
            throw new InitializationError(arrayList);
        }
    }

    private void validateClassRules(List<Throwable> list) {
        RuleMemberValidator.CLASS_RULE_VALIDATOR.validate(getTestClass(), list);
        RuleMemberValidator.CLASS_RULE_METHOD_VALIDATOR.validate(getTestClass(), list);
    }

    private Statement withClassRules(Statement statement) {
        List<TestRule> listClassRules = classRules();
        return listClassRules.isEmpty() ? statement : new RunRules(statement, listClassRules, getDescription());
    }

    public Statement childrenInvoker(final RunNotifier runNotifier) {
        return new Statement() { // from class: org.junit.runners.ParentRunner.2
            @Override // org.junit.runners.model.Statement
            public void evaluate() {
                ParentRunner.this.runChildren(runNotifier);
            }
        };
    }

    public Statement classBlock(RunNotifier runNotifier) {
        Statement statementChildrenInvoker = childrenInvoker(runNotifier);
        return !areAllChildrenIgnored() ? withClassRules(withAfterClasses(withBeforeClasses(statementChildrenInvoker))) : statementChildrenInvoker;
    }

    public List<TestRule> classRules() {
        List<TestRule> annotatedMethodValues = this.testClass.getAnnotatedMethodValues(null, ClassRule.class, TestRule.class);
        annotatedMethodValues.addAll(this.testClass.getAnnotatedFieldValues(null, ClassRule.class, TestRule.class));
        return annotatedMethodValues;
    }

    public void collectInitializationErrors(List<Throwable> list) {
        validatePublicVoidNoArgMethods(BeforeClass.class, true, list);
        validatePublicVoidNoArgMethods(AfterClass.class, true, list);
        validateClassRules(list);
        applyValidators(list);
    }

    public TestClass createTestClass(Class<?> cls) {
        return new TestClass(cls);
    }

    public abstract Description describeChild(T t);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.junit.runner.manipulation.Filterable
    public void filter(Filter filter) throws NoTestsRemainException {
        synchronized (this.childrenLock) {
            ArrayList arrayList = new ArrayList(getFilteredChildren());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (shouldRun(filter, next)) {
                    try {
                        filter.apply(next);
                    } catch (NoTestsRemainException unused) {
                        it.remove();
                    }
                } else {
                    it.remove();
                }
            }
            this.filteredChildren = Collections.unmodifiableCollection(arrayList);
            if (this.filteredChildren.isEmpty()) {
                throw new NoTestsRemainException();
            }
        }
    }

    public abstract List<T> getChildren();

    @Override // org.junit.runner.Runner, org.junit.runner.Describable
    public Description getDescription() {
        Description descriptionCreateSuiteDescription = Description.createSuiteDescription(getName(), getRunnerAnnotations());
        Iterator<T> it = getFilteredChildren().iterator();
        while (it.hasNext()) {
            descriptionCreateSuiteDescription.addChild(describeChild(it.next()));
        }
        return descriptionCreateSuiteDescription;
    }

    public String getName() {
        return this.testClass.getName();
    }

    public Annotation[] getRunnerAnnotations() {
        return this.testClass.getAnnotations();
    }

    public final TestClass getTestClass() {
        return this.testClass;
    }

    public boolean isIgnored(T t) {
        return false;
    }

    @Override // org.junit.runner.Runner
    public void run(RunNotifier runNotifier) {
        EachTestNotifier eachTestNotifier = new EachTestNotifier(runNotifier, getDescription());
        try {
            classBlock(runNotifier).evaluate();
        } catch (AssumptionViolatedException e) {
            eachTestNotifier.addFailedAssumption(e);
        } catch (StoppedByUserException e2) {
            throw e2;
        } catch (Throwable th) {
            eachTestNotifier.addFailure(th);
        }
    }

    public abstract void runChild(T t, RunNotifier runNotifier);

    public final void runLeaf(Statement statement, Description description, RunNotifier runNotifier) {
        EachTestNotifier eachTestNotifier = new EachTestNotifier(runNotifier, description);
        eachTestNotifier.fireTestStarted();
        try {
            statement.evaluate();
        } catch (AssumptionViolatedException e) {
            eachTestNotifier.addFailedAssumption(e);
        } catch (Throwable th) {
            eachTestNotifier.addFailure(th);
        } finally {
            eachTestNotifier.fireTestFinished();
        }
    }

    public void setScheduler(RunnerScheduler runnerScheduler) {
        this.scheduler = runnerScheduler;
    }

    @Override // org.junit.runner.manipulation.Sortable
    public void sort(Sorter sorter) {
        synchronized (this.childrenLock) {
            try {
                Iterator<T> it = getFilteredChildren().iterator();
                while (it.hasNext()) {
                    sorter.apply(it.next());
                }
                ArrayList arrayList = new ArrayList(getFilteredChildren());
                Collections.sort(arrayList, comparator(sorter));
                this.filteredChildren = Collections.unmodifiableCollection(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void validatePublicVoidNoArgMethods(Class<? extends Annotation> cls, boolean z, List<Throwable> list) {
        Iterator<FrameworkMethod> it = getTestClass().getAnnotatedMethods(cls).iterator();
        while (it.hasNext()) {
            it.next().validatePublicVoidNoArg(z, list);
        }
    }

    public Statement withAfterClasses(Statement statement) {
        List<FrameworkMethod> annotatedMethods = this.testClass.getAnnotatedMethods(AfterClass.class);
        return annotatedMethods.isEmpty() ? statement : new RunAfters(statement, annotatedMethods, null);
    }

    public Statement withBeforeClasses(Statement statement) {
        List<FrameworkMethod> annotatedMethods = this.testClass.getAnnotatedMethods(BeforeClass.class);
        return annotatedMethods.isEmpty() ? statement : new RunBefores(statement, annotatedMethods, null);
    }
}
