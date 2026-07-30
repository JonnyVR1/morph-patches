package org.junit.validator;

import java.util.concurrent.ConcurrentHashMap;
import p149l.ig3;
import p149l.pkq0;

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
            ig3.m135964a("Can't create validator, value is null in annotation ".concat(validateWith.getClass().getName()));
            return null;
        }
        try {
            concurrentHashMap.putIfAbsent(validateWith, clsValue.newInstance());
            return concurrentHashMap.get(validateWith);
        } catch (Exception e) {
            pkq0.m170054a("Exception received when creating AnnotationValidator class ".concat(clsValue.getName()), e);
            return null;
        }
    }
}
