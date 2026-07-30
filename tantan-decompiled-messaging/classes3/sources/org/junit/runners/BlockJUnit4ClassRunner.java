package org.junit.runners;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.internal.runners.model.ReflectiveCallable;
import org.junit.internal.runners.rules.RuleMemberValidator;
import org.junit.internal.runners.statements.ExpectException;
import org.junit.internal.runners.statements.Fail;
import org.junit.internal.runners.statements.FailOnTimeout;
import org.junit.internal.runners.statements.InvokeMethod;
import org.junit.internal.runners.statements.RunAfters;
import org.junit.internal.runners.statements.RunBefores;
import org.junit.rules.MethodRule;
import org.junit.rules.RunRules;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class BlockJUnit4ClassRunner extends ParentRunner<FrameworkMethod> {
    private final ConcurrentHashMap<FrameworkMethod, Description> methodDescriptions;

    public BlockJUnit4ClassRunner(Class<?> cls) throws InitializationError {
        super(cls);
        this.methodDescriptions = new ConcurrentHashMap<>();
    }

    private boolean expectsException(Test test) {
        return getExpectedException(test) != null;
    }

    private Class<? extends Throwable> getExpectedException(Test test) {
        if (test == null || test.expected() == Test.None.class) {
            return null;
        }
        return test.expected();
    }

    private List<MethodRule> getMethodRules(Object obj) {
        return rules(obj);
    }

    private long getTimeout(Test test) {
        if (test == null) {
            return 0L;
        }
        return test.timeout();
    }

    private boolean hasOneConstructor() {
        return getTestClass().getJavaClass().getConstructors().length == 1;
    }

    private void validateMethods(List<Throwable> list) {
        RuleMemberValidator.RULE_METHOD_VALIDATOR.validate(getTestClass(), list);
    }

    private Statement withMethodRules(FrameworkMethod frameworkMethod, List<TestRule> list, Object obj, Statement statement) {
        for (MethodRule methodRule : getMethodRules(obj)) {
            if (!list.contains(methodRule)) {
                statement = methodRule.apply(statement, frameworkMethod, obj);
            }
        }
        return statement;
    }

    private Statement withRules(FrameworkMethod frameworkMethod, Object obj, Statement statement) {
        List<TestRule> testRules = getTestRules(obj);
        return withTestRules(frameworkMethod, testRules, withMethodRules(frameworkMethod, testRules, obj, statement));
    }

    private Statement withTestRules(FrameworkMethod frameworkMethod, List<TestRule> list, Statement statement) {
        return list.isEmpty() ? statement : new RunRules(statement, list, describeChild(frameworkMethod));
    }

    @Override // org.junit.runners.ParentRunner
    public void collectInitializationErrors(List<Throwable> list) {
        super.collectInitializationErrors(list);
        validateNoNonStaticInnerClass(list);
        validateConstructor(list);
        validateInstanceMethods(list);
        validateFields(list);
        validateMethods(list);
    }

    public List<FrameworkMethod> computeTestMethods() {
        return getTestClass().getAnnotatedMethods(Test.class);
    }

    public Object createTest() throws Exception {
        return getTestClass().getOnlyConstructor().newInstance(null);
    }

    @Override // org.junit.runners.ParentRunner
    public Description describeChild(FrameworkMethod frameworkMethod) {
        Description description = this.methodDescriptions.get(frameworkMethod);
        if (description != null) {
            return description;
        }
        Description descriptionCreateTestDescription = Description.createTestDescription(getTestClass().getJavaClass(), testName(frameworkMethod), frameworkMethod.getAnnotations());
        this.methodDescriptions.putIfAbsent(frameworkMethod, descriptionCreateTestDescription);
        return descriptionCreateTestDescription;
    }

    @Override // org.junit.runners.ParentRunner
    public List<FrameworkMethod> getChildren() {
        return computeTestMethods();
    }

    public List<TestRule> getTestRules(Object obj) {
        List<TestRule> annotatedMethodValues = getTestClass().getAnnotatedMethodValues(obj, Rule.class, TestRule.class);
        annotatedMethodValues.addAll(getTestClass().getAnnotatedFieldValues(obj, Rule.class, TestRule.class));
        return annotatedMethodValues;
    }

    @Override // org.junit.runners.ParentRunner
    public boolean isIgnored(FrameworkMethod frameworkMethod) {
        return frameworkMethod.getAnnotation(Ignore.class) != null;
    }

    public Statement methodBlock(FrameworkMethod frameworkMethod) {
        try {
            Object objRun = new ReflectiveCallable() { // from class: org.junit.runners.BlockJUnit4ClassRunner.1
                @Override // org.junit.internal.runners.model.ReflectiveCallable
                public Object runReflectiveCall() throws Throwable {
                    return BlockJUnit4ClassRunner.this.createTest();
                }
            }.run();
            return withRules(frameworkMethod, objRun, withAfters(frameworkMethod, objRun, withBefores(frameworkMethod, objRun, withPotentialTimeout(frameworkMethod, objRun, possiblyExpectingExceptions(frameworkMethod, objRun, methodInvoker(frameworkMethod, objRun))))));
        } catch (Throwable th) {
            return new Fail(th);
        }
    }

    public Statement methodInvoker(FrameworkMethod frameworkMethod, Object obj) {
        return new InvokeMethod(frameworkMethod, obj);
    }

    public Statement possiblyExpectingExceptions(FrameworkMethod frameworkMethod, Object obj, Statement statement) {
        Test test = (Test) frameworkMethod.getAnnotation(Test.class);
        return expectsException(test) ? new ExpectException(statement, getExpectedException(test)) : statement;
    }

    public List<MethodRule> rules(Object obj) {
        List<MethodRule> annotatedMethodValues = getTestClass().getAnnotatedMethodValues(obj, Rule.class, MethodRule.class);
        annotatedMethodValues.addAll(getTestClass().getAnnotatedFieldValues(obj, Rule.class, MethodRule.class));
        return annotatedMethodValues;
    }

    @Override // org.junit.runners.ParentRunner
    public void runChild(FrameworkMethod frameworkMethod, RunNotifier runNotifier) {
        Description descriptionDescribeChild = describeChild(frameworkMethod);
        if (isIgnored(frameworkMethod)) {
            runNotifier.fireTestIgnored(descriptionDescribeChild);
        } else {
            runLeaf(methodBlock(frameworkMethod), descriptionDescribeChild, runNotifier);
        }
    }

    public String testName(FrameworkMethod frameworkMethod) {
        return frameworkMethod.getName();
    }

    public void validateConstructor(List<Throwable> list) {
        validateOnlyOneConstructor(list);
        validateZeroArgConstructor(list);
    }

    public void validateFields(List<Throwable> list) {
        RuleMemberValidator.RULE_VALIDATOR.validate(getTestClass(), list);
    }

    @Deprecated
    public void validateInstanceMethods(List<Throwable> list) {
        validatePublicVoidNoArgMethods(After.class, false, list);
        validatePublicVoidNoArgMethods(Before.class, false, list);
        validateTestMethods(list);
        if (computeTestMethods().size() == 0) {
            list.add(new Exception("No runnable methods"));
        }
    }

    public void validateNoNonStaticInnerClass(List<Throwable> list) {
        if (getTestClass().isANonStaticInnerClass()) {
            list.add(new Exception("The inner class " + getTestClass().getName() + " is not static."));
        }
    }

    public void validateOnlyOneConstructor(List<Throwable> list) {
        if (hasOneConstructor()) {
            return;
        }
        list.add(new Exception("Test class should have exactly one public constructor"));
    }

    public void validateTestMethods(List<Throwable> list) {
        validatePublicVoidNoArgMethods(Test.class, false, list);
    }

    public void validateZeroArgConstructor(List<Throwable> list) {
        if (getTestClass().isANonStaticInnerClass() || !hasOneConstructor() || getTestClass().getOnlyConstructor().getParameterTypes().length == 0) {
            return;
        }
        list.add(new Exception("Test class should have exactly one public zero-argument constructor"));
    }

    public Statement withAfters(FrameworkMethod frameworkMethod, Object obj, Statement statement) {
        List<FrameworkMethod> annotatedMethods = getTestClass().getAnnotatedMethods(After.class);
        return annotatedMethods.isEmpty() ? statement : new RunAfters(statement, annotatedMethods, obj);
    }

    public Statement withBefores(FrameworkMethod frameworkMethod, Object obj, Statement statement) {
        List<FrameworkMethod> annotatedMethods = getTestClass().getAnnotatedMethods(Before.class);
        return annotatedMethods.isEmpty() ? statement : new RunBefores(statement, annotatedMethods, obj);
    }

    @Deprecated
    public Statement withPotentialTimeout(FrameworkMethod frameworkMethod, Object obj, Statement statement) {
        long timeout = getTimeout((Test) frameworkMethod.getAnnotation(Test.class));
        return timeout <= 0 ? statement : FailOnTimeout.builder().withTimeout(timeout, TimeUnit.MILLISECONDS).build(statement);
    }
}
