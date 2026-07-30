package org.junit.runners;

import com.clevertap.android.sdk.Constants;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.junit.runner.Runner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.TestClass;
import org.junit.runners.parameterized.BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runners.parameterized.ParametersRunnerFactory;
import org.junit.runners.parameterized.TestWithParameters;

/* JADX INFO: loaded from: classes3.dex */
public class Parameterized extends Suite {
    private static final ParametersRunnerFactory DEFAULT_FACTORY = new BlockJUnit4ClassRunnerWithParametersFactory();
    private static final List<Runner> NO_RUNNERS = Collections.EMPTY_LIST;
    private final List<Runner> runners;

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Parameter {
        int value() default 0;
    }

    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Parameters {
        String name() default "{index}";
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface UseParametersRunnerFactory {
        Class<? extends ParametersRunnerFactory> value() default BlockJUnit4ClassRunnerWithParametersFactory.class;
    }

    public Parameterized(Class<?> cls) throws Throwable {
        super(cls, NO_RUNNERS);
        this.runners = Collections.unmodifiableList(createRunnersForParameters(allParameters(), ((Parameters) getParametersMethod().getAnnotation(Parameters.class)).name(), getParametersRunnerFactory(cls)));
    }

    private Iterable<Object> allParameters() throws Exception {
        Object objInvokeExplosively = getParametersMethod().invokeExplosively(null, new Object[0]);
        if (objInvokeExplosively instanceof Iterable) {
            return (Iterable) objInvokeExplosively;
        }
        if (objInvokeExplosively instanceof Object[]) {
            return Arrays.asList((Object[]) objInvokeExplosively);
        }
        throw parametersMethodReturnedWrongType();
    }

    private List<Runner> createRunnersForParameters(Iterable<Object> iterable, String str, ParametersRunnerFactory parametersRunnerFactory) throws Exception {
        try {
            List<TestWithParameters> listCreateTestsForParameters = createTestsForParameters(iterable, str);
            ArrayList arrayList = new ArrayList();
            Iterator<TestWithParameters> it = listCreateTestsForParameters.iterator();
            while (it.hasNext()) {
                arrayList.add(parametersRunnerFactory.createRunnerForTestWithParameters(it.next()));
            }
            return arrayList;
        } catch (ClassCastException unused) {
            throw parametersMethodReturnedWrongType();
        }
    }

    private TestWithParameters createTestWithNotNormalizedParameters(String str, int i, Object obj) {
        return createTestWithParameters(getTestClass(), str, i, obj instanceof Object[] ? (Object[]) obj : new Object[]{obj});
    }

    private static TestWithParameters createTestWithParameters(TestClass testClass, String str, int i, Object[] objArr) {
        return new TestWithParameters("[" + MessageFormat.format(str.replaceAll("\\{index\\}", Integer.toString(i)), objArr) + Constants.AES_SUFFIX, testClass, Arrays.asList(objArr));
    }

    private List<TestWithParameters> createTestsForParameters(Iterable<Object> iterable, String str) throws Exception {
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            arrayList.add(createTestWithNotNormalizedParameters(str, i, it.next()));
            i++;
        }
        return arrayList;
    }

    private FrameworkMethod getParametersMethod() throws Exception {
        for (FrameworkMethod frameworkMethod : getTestClass().getAnnotatedMethods(Parameters.class)) {
            if (frameworkMethod.isStatic() && frameworkMethod.isPublic()) {
                return frameworkMethod;
            }
        }
        throw new Exception("No public static parameters method on class " + getTestClass().getName());
    }

    private ParametersRunnerFactory getParametersRunnerFactory(Class<?> cls) throws IllegalAccessException, InstantiationException {
        UseParametersRunnerFactory useParametersRunnerFactory = (UseParametersRunnerFactory) cls.getAnnotation(UseParametersRunnerFactory.class);
        return useParametersRunnerFactory == null ? DEFAULT_FACTORY : useParametersRunnerFactory.value().newInstance();
    }

    private Exception parametersMethodReturnedWrongType() throws Exception {
        return new Exception(MessageFormat.format("{0}.{1}() must return an Iterable of arrays.", getTestClass().getName(), getParametersMethod().getName()));
    }

    @Override // org.junit.runners.Suite, org.junit.runners.ParentRunner
    public List<Runner> getChildren() {
        return this.runners;
    }
}
