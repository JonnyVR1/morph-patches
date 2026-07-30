package org.junit.runners.parameterized;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.Parameterized;
import org.junit.runners.model.FrameworkField;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class BlockJUnit4ClassRunnerWithParameters extends BlockJUnit4ClassRunner {
    private final String name;
    private final Object[] parameters;

    public BlockJUnit4ClassRunnerWithParameters(TestWithParameters testWithParameters) throws InitializationError {
        super(testWithParameters.getTestClass().getJavaClass());
        this.parameters = testWithParameters.getParameters().toArray(new Object[testWithParameters.getParameters().size()]);
        this.name = testWithParameters.getName();
    }

    private Object createTestUsingConstructorInjection() throws Exception {
        return getTestClass().getOnlyConstructor().newInstance(this.parameters);
    }

    private Object createTestUsingFieldInjection() throws Exception {
        List<FrameworkField> annotatedFieldsByParameter = getAnnotatedFieldsByParameter();
        if (annotatedFieldsByParameter.size() != this.parameters.length) {
            throw new Exception("Wrong number of parameters and @Parameter fields. @Parameter fields counted: " + annotatedFieldsByParameter.size() + ", available parameters: " + this.parameters.length + ".");
        }
        Object objNewInstance = getTestClass().getJavaClass().newInstance();
        Iterator<FrameworkField> it = annotatedFieldsByParameter.iterator();
        while (it.hasNext()) {
            Field field = it.next().getField();
            int iValue = ((Parameterized.Parameter) field.getAnnotation(Parameterized.Parameter.class)).value();
            try {
                field.set(objNewInstance, this.parameters[iValue]);
            } catch (IllegalArgumentException e) {
                StringBuilder sb = new StringBuilder();
                sb.append(getTestClass().getName());
                sb.append(": Trying to set ");
                sb.append(field.getName());
                sb.append(" with the value ");
                sb.append(this.parameters[iValue]);
                String simpleName = this.parameters[iValue].getClass().getSimpleName();
                String simpleName2 = field.getType().getSimpleName();
                sb.append(" that is not the right type (");
                sb.append(simpleName);
                sb.append(" instead of ");
                sb.append(simpleName2);
                sb.append(").");
                throw new Exception(sb.toString(), e);
            }
        }
        return objNewInstance;
    }

    private boolean fieldsAreAnnotated() {
        return !getAnnotatedFieldsByParameter().isEmpty();
    }

    private List<FrameworkField> getAnnotatedFieldsByParameter() {
        return getTestClass().getAnnotatedFields(Parameterized.Parameter.class);
    }

    @Override // org.junit.runners.ParentRunner
    public Statement classBlock(RunNotifier runNotifier) {
        return childrenInvoker(runNotifier);
    }

    @Override // org.junit.runners.BlockJUnit4ClassRunner
    public Object createTest() throws Exception {
        return fieldsAreAnnotated() ? createTestUsingFieldInjection() : createTestUsingConstructorInjection();
    }

    @Override // org.junit.runners.ParentRunner
    public String getName() {
        return this.name;
    }

    @Override // org.junit.runners.ParentRunner
    public Annotation[] getRunnerAnnotations() {
        return new Annotation[0];
    }

    @Override // org.junit.runners.BlockJUnit4ClassRunner
    public String testName(FrameworkMethod frameworkMethod) {
        return frameworkMethod.getName() + getName();
    }

    @Override // org.junit.runners.BlockJUnit4ClassRunner
    public void validateConstructor(List<Throwable> list) {
        validateOnlyOneConstructor(list);
        if (fieldsAreAnnotated()) {
            validateZeroArgConstructor(list);
        }
    }

    @Override // org.junit.runners.BlockJUnit4ClassRunner
    public void validateFields(List<Throwable> list) {
        super.validateFields(list);
        if (fieldsAreAnnotated()) {
            List<FrameworkField> annotatedFieldsByParameter = getAnnotatedFieldsByParameter();
            int size = annotatedFieldsByParameter.size();
            int[] iArr = new int[size];
            Iterator<FrameworkField> it = annotatedFieldsByParameter.iterator();
            while (it.hasNext()) {
                int iValue = ((Parameterized.Parameter) it.next().getField().getAnnotation(Parameterized.Parameter.class)).value();
                if (iValue < 0 || iValue > annotatedFieldsByParameter.size() - 1) {
                    list.add(new Exception("Invalid @Parameter value: " + iValue + ". @Parameter fields counted: " + annotatedFieldsByParameter.size() + ". Please use an index between 0 and " + (annotatedFieldsByParameter.size() - 1) + "."));
                } else {
                    iArr[iValue] = iArr[iValue] + 1;
                }
            }
            for (int i = 0; i < size; i++) {
                int i2 = iArr[i];
                if (i2 == 0) {
                    list.add(new Exception("@Parameter(" + i + ") is never used."));
                } else if (i2 > 1) {
                    list.add(new Exception("@Parameter(" + i + ") is used more than once (" + i2 + ")."));
                }
            }
        }
    }
}
