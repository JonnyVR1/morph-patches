package org.aspectj.runtime.reflect;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.lang.reflect.Field;
import org.aspectj.lang.reflect.FieldSignature;

/* JADX INFO: loaded from: classes2.dex */
public class FieldSignatureImpl extends MemberSignatureImpl implements FieldSignature {
    private Field field;
    Class fieldType;

    public FieldSignatureImpl(int i, String str, Class cls, Class cls2) {
        super(i, str, cls);
        this.fieldType = cls2;
    }

    @Override // org.aspectj.runtime.reflect.SignatureImpl
    public String createToString(StringMaker stringMaker) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(stringMaker.makeModifiersString(getModifiers()));
        if (stringMaker.includeArgs) {
            stringBuffer.append(stringMaker.makeTypeName(getFieldType()));
        }
        if (stringMaker.includeArgs) {
            stringBuffer.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        }
        stringBuffer.append(stringMaker.makePrimaryTypeName(getDeclaringType(), getDeclaringTypeName()));
        stringBuffer.append(".");
        stringBuffer.append(getName());
        return stringBuffer.toString();
    }

    @Override // org.aspectj.lang.reflect.FieldSignature
    public Field getField() {
        if (this.field == null) {
            try {
                this.field = getDeclaringType().getDeclaredField(getName());
            } catch (Exception unused) {
            }
        }
        return this.field;
    }

    @Override // org.aspectj.lang.reflect.FieldSignature
    public Class getFieldType() {
        if (this.fieldType == null) {
            this.fieldType = extractType(3);
        }
        return this.fieldType;
    }

    public FieldSignatureImpl(String str) {
        super(str);
    }
}
