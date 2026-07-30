package org.junit.validator;

import java.util.Collections;
import java.util.List;
import org.junit.runners.model.FrameworkField;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.TestClass;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AnnotationValidator {
    private static final List<Exception> NO_VALIDATION_ERRORS = Collections.EMPTY_LIST;

    public List<Exception> validateAnnotatedClass(TestClass testClass) {
        return NO_VALIDATION_ERRORS;
    }

    public List<Exception> validateAnnotatedField(FrameworkField frameworkField) {
        return NO_VALIDATION_ERRORS;
    }

    public List<Exception> validateAnnotatedMethod(FrameworkMethod frameworkMethod) {
        return NO_VALIDATION_ERRORS;
    }
}
