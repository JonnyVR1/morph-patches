package org.aspectj.runtime.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import org.aspectj.lang.reflect.InitializerSignature;

/* JADX INFO: loaded from: classes2.dex */
class InitializerSignatureImpl extends CodeSignatureImpl implements InitializerSignature {
    private Constructor constructor;

    /* JADX WARN: Illegal instructions before constructor call */
    public InitializerSignatureImpl(int i, Class cls) {
        String str = Modifier.isStatic(i) ? "<clinit>" : "<init>";
        Class[] clsArr = SignatureImpl.EMPTY_CLASS_ARRAY;
        super(i, str, cls, clsArr, SignatureImpl.EMPTY_STRING_ARRAY, clsArr);
    }

    @Override // org.aspectj.runtime.reflect.SignatureImpl
    public String createToString(StringMaker stringMaker) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(stringMaker.makeModifiersString(getModifiers()));
        stringBuffer.append(stringMaker.makePrimaryTypeName(getDeclaringType(), getDeclaringTypeName()));
        stringBuffer.append(".");
        stringBuffer.append(getName());
        return stringBuffer.toString();
    }

    @Override // org.aspectj.lang.reflect.InitializerSignature
    public Constructor getInitializer() {
        if (this.constructor == null) {
            try {
                this.constructor = getDeclaringType().getDeclaredConstructor(getParameterTypes());
            } catch (Exception unused) {
            }
        }
        return this.constructor;
    }

    @Override // org.aspectj.runtime.reflect.SignatureImpl, org.aspectj.lang.Signature
    public String getName() {
        return Modifier.isStatic(getModifiers()) ? "<clinit>" : "<init>";
    }

    public InitializerSignatureImpl(String str) {
        super(str);
    }
}
