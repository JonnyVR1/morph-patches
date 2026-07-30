package org.aspectj.runtime.reflect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.LockSignature;

/* JADX INFO: loaded from: classes2.dex */
class LockSignatureImpl extends SignatureImpl implements LockSignature {
    private Class parameterType;

    public LockSignatureImpl(Class cls) {
        super(8, JoinPoint.SYNCHRONIZATION_LOCK, cls);
        this.parameterType = cls;
    }

    @Override // org.aspectj.runtime.reflect.SignatureImpl
    public String createToString(StringMaker stringMaker) {
        if (this.parameterType == null) {
            this.parameterType = extractType(3);
        }
        StringBuffer stringBuffer = new StringBuffer("lock(");
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

    public LockSignatureImpl(String str) {
        super(str);
    }
}
