package org.junit.validator;

import java.util.concurrent.ConcurrentHashMap;
import p153l.vtq0;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class AnnotationValidatorFactory {
    private static final ConcurrentHashMap<ValidateWith, AnnotationValidator> VALIDATORS_FOR_ANNOTATION_TYPES = new ConcurrentHashMap<>();

    public AnnotationValidator createAnnotationValidator(ValidateWith validateWith) {
        ConcurrentHashMap<ValidateWith, AnnotationValidator> concurrentHashMap = VALIDATORS_FOR_ANNOTATION_TYPES;
        AnnotationValidator annotationValidator = concurrentHashMap.get(validateWith);
        if (annotationValidator != null) {
            return annotationValidator;
        }
        Class<? extends AnnotationValidator> clsValue = validateWith.value();
        if (clsValue == null) {
            wg3.m206174a("Can't create validator, value is null in annotation ".concat(validateWith.getClass().getName()));
            return null;
        }
        try {
            concurrentHashMap.putIfAbsent(validateWith, clsValue.newInstance());
            return concurrentHashMap.get(validateWith);
        } catch (Exception e) {
            vtq0.m202761a("Exception received when creating AnnotationValidator class ".concat(clsValue.getName()), e);
            return null;
        }
    }
}
