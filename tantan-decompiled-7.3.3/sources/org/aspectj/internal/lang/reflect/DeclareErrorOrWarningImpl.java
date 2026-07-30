package org.aspectj.internal.lang.reflect;

import org.aspectj.lang.reflect.AjType;
import org.aspectj.lang.reflect.DeclareErrorOrWarning;
import org.aspectj.lang.reflect.PointcutExpression;

/* JADX INFO: loaded from: classes2.dex */
public class DeclareErrorOrWarningImpl implements DeclareErrorOrWarning {
    private AjType declaringType;
    private boolean isError;
    private String msg;

    /* JADX INFO: renamed from: pc */
    private PointcutExpression f206807pc;

    public DeclareErrorOrWarningImpl(String str, String str2, boolean z, AjType ajType) {
        this.f206807pc = new PointcutExpressionImpl(str);
        this.msg = str2;
        this.isError = z;
        this.declaringType = ajType;
    }

    @Override // org.aspectj.lang.reflect.DeclareErrorOrWarning
    public AjType getDeclaringType() {
        return this.declaringType;
    }

    @Override // org.aspectj.lang.reflect.DeclareErrorOrWarning
    public String getMessage() {
        return this.msg;
    }

    @Override // org.aspectj.lang.reflect.DeclareErrorOrWarning
    public PointcutExpression getPointcutExpression() {
        return this.f206807pc;
    }

    @Override // org.aspectj.lang.reflect.DeclareErrorOrWarning
    public boolean isError() {
        return this.isError;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("declare ");
        stringBuffer.append(isError() ? "error : " : "warning : ");
        stringBuffer.append(getPointcutExpression().asString());
        stringBuffer.append(" : \"");
        stringBuffer.append(getMessage());
        stringBuffer.append("\"");
        return stringBuffer.toString();
    }
}
