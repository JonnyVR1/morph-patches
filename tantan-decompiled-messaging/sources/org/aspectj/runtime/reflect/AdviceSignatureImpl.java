package org.aspectj.runtime.reflect;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.data.OMSSwipeMoment;
import java.lang.reflect.Method;
import java.util.StringTokenizer;
import org.aspectj.lang.reflect.AdviceSignature;

/* JADX INFO: loaded from: classes2.dex */
class AdviceSignatureImpl extends CodeSignatureImpl implements AdviceSignature {
    private Method adviceMethod;
    Class returnType;

    public AdviceSignatureImpl(int i, String str, Class cls, Class[] clsArr, String[] strArr, Class[] clsArr2, Class cls2) {
        super(i, str, cls, clsArr, strArr, clsArr2);
        this.adviceMethod = null;
        this.returnType = cls2;
    }

    private String toAdviceName(String str) {
        if (str.indexOf(36) != -1) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, "$");
            while (stringTokenizer.hasMoreTokens()) {
                String strNextToken = stringTokenizer.nextToken();
                if (strNextToken.startsWith(OMSSwipeMoment.before) || strNextToken.startsWith(OMSSwipeMoment.after) || strNextToken.startsWith("around")) {
                    return strNextToken;
                }
            }
        }
        return str;
    }

    @Override // org.aspectj.runtime.reflect.SignatureImpl
    public String createToString(StringMaker stringMaker) {
        StringBuffer stringBuffer = new StringBuffer();
        if (stringMaker.includeArgs) {
            stringBuffer.append(stringMaker.makeTypeName(getReturnType()));
        }
        if (stringMaker.includeArgs) {
            stringBuffer.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        }
        stringBuffer.append(stringMaker.makePrimaryTypeName(getDeclaringType(), getDeclaringTypeName()));
        stringBuffer.append(".");
        stringBuffer.append(toAdviceName(getName()));
        stringMaker.addSignature(stringBuffer, getParameterTypes());
        stringMaker.addThrows(stringBuffer, getExceptionTypes());
        return stringBuffer.toString();
    }

    @Override // org.aspectj.lang.reflect.AdviceSignature
    public Method getAdvice() {
        if (this.adviceMethod == null) {
            try {
                this.adviceMethod = getDeclaringType().getDeclaredMethod(getName(), getParameterTypes());
            } catch (Exception unused) {
            }
        }
        return this.adviceMethod;
    }

    @Override // org.aspectj.lang.reflect.AdviceSignature
    public Class getReturnType() {
        if (this.returnType == null) {
            this.returnType = extractType(6);
        }
        return this.returnType;
    }

    public AdviceSignatureImpl(String str) {
        super(str);
        this.adviceMethod = null;
    }
}
