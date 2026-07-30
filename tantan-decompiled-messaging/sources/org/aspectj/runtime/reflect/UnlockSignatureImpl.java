package org.aspectj.runtime.reflect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.UnlockSignature;

/* JADX INFO: loaded from: classes2.dex */
class UnlockSignatureImpl extends SignatureImpl implements UnlockSignature {
    private Class parameterType;

    public UnlockSignatureImpl(Class cls) {
        super(8, JoinPoint.SYNCHRONIZATION_UNLOCK, cls);
        this.parameterType = cls;
    }

    @Override // org.aspectj.runtime.reflect.SignatureImpl
    public String createToString(StringMaker stringMaker) {
        if (this.parameterType == null) {
            this.parameterType = extractType(3);
        }
        StringBuffer stringBuffer = new StringBuffer("unlock(");
        stringBuffer.append(stringMaker.makeTypeName(this.parameterType));
        stringBuffer.append(")");
        return stringBuffer.toString();
    }

    public Class getParameterType() {
        if (this.parameterType == null) {
            this.parameterType = extractType(3);
        }
        return this.parameterType;
    }

    public UnlockSignatureImpl(String str) {
        super(str);
    }
}
