package org.junit.validator;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.junit.runners.model.Annotatable;
import org.junit.runners.model.FrameworkField;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.TestClass;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class AnnotationsValidator implements TestClassValidator {
    private static final List<AnnotatableValidator<?>> VALIDATORS;

    public static abstract class AnnotatableValidator<T extends Annotatable> {
        private static final AnnotationValidatorFactory ANNOTATION_VALIDATOR_FACTORY = new AnnotationValidatorFactory();

        private AnnotatableValidator() {
        }

        private List<Exception> validateAnnotatable(T t) {
            ArrayList arrayList = new ArrayList();
            for (Annotation annotation : t.getAnnotations()) {
                ValidateWith validateWith = (ValidateWith) annotation.annotationType().getAnnotation(ValidateWith.class);
                if (validateWith != null) {
                    arrayList.addAll(validateAnnotatable(ANNOTATION_VALIDATOR_FACTORY.createAnnotationValidator(validateWith), t));
                }
            }
            return arrayList;
        }

        public abstract Iterable<T> getAnnotatablesForTestClass(TestClass testClass);

        public abstract List<Exception> validateAnnotatable(AnnotationValidator annotationValidator, T t);

        public List<Exception> validateTestClass(TestClass testClass) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = getAnnotatablesForTestClass(testClass).iterator();
            while (it.hasNext()) {
                arrayList.addAll(validateAnnotatable(it.next()));
            }
            return arrayList;
        }
    }

    static {
        VALIDATORS = Arrays.asList(new ClassValidator(), new MethodValidator(), new FieldValidator());
    }

    @Override // org.junit.validator.TestClassValidator
    public List<Exception> validateTestClass(TestClass testClass) {
        ArrayList arrayList = new ArrayList();
        Iterator<AnnotatableValidator<?>> it = VALIDATORS.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().validateTestClass(testClass));
        }
        return arrayList;
    }

    public static class ClassValidator extends AnnotatableValidator<TestClass> {
        private ClassValidator() {
            super();
        }

        @Override // org.junit.validator.AnnotationsValidator.AnnotatableValidator
        public Iterable<TestClass> getAnnotatablesForTestClass(TestClass testClass) {
            return Collections.singletonList(testClass);
        }

        @Override // org.junit.validator.AnnotationsValidator.AnnotatableValidator
        public List<Exception> validateAnnotatable(AnnotationValidator annotationValidator, TestClass testClass) {
            return annotationValidator.validateAnnotatedClass(testClass);
        }
    }

    public static class FieldValidator extends AnnotatableValidator<FrameworkField> {
        private FieldValidator() {
            super();
        }

        @Override // org.junit.validator.AnnotationsValidator.AnnotatableValidator
        public Iterable<FrameworkField> getAnnotatablesForTestClass(TestClass testClass) {
            return testClass.getAnnotatedFields();
        }

        @Override // org.junit.validator.AnnotationsValidator.AnnotatableValidator
        public List<Exception> validateAnnotatable(AnnotationValidator annotationValidator, FrameworkField frameworkField) {
            return annotationValidator.validateAnnotatedField(frameworkField);
        }
    }

    public static class MethodValidator extends AnnotatableValidator<FrameworkMethod> {
        private MethodValidator() {
            super();
        }

        @Override // org.junit.validator.AnnotationsValidator.AnnotatableValidator
        public Iterable<FrameworkMethod> getAnnotatablesForTestClass(TestClass testClass) {
            return testClass.getAnnotatedMethods();
        }

        @Override // org.junit.validator.AnnotationsValidator.AnnotatableValidator
        public List<Exception> validateAnnotatable(AnnotationValidator annotationValidator, FrameworkMethod frameworkMethod) {
            return annotationValidator.validateAnnotatedMethod(frameworkMethod);
        }
    }
}
