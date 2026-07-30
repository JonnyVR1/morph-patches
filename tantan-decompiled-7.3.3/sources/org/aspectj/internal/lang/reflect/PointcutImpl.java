package org.aspectj.internal.lang.reflect;

import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.lang.reflect.Method;
import java.util.StringTokenizer;
import org.aspectj.lang.reflect.AjType;
import org.aspectj.lang.reflect.AjTypeSystem;
import org.aspectj.lang.reflect.Pointcut;
import org.aspectj.lang.reflect.PointcutExpression;

/* JADX INFO: loaded from: classes2.dex */
public class PointcutImpl implements Pointcut {
    private final Method baseMethod;
    private final AjType declaringType;
    private final String name;
    private String[] parameterNames;

    /* JADX INFO: renamed from: pc */
    private final PointcutExpression f206808pc;

    public PointcutImpl(String str, String str2, Method method, AjType ajType, String str3) {
        this.parameterNames = new String[0];
        this.name = str;
        this.f206808pc = new PointcutExpressionImpl(str2);
        this.baseMethod = method;
        this.declaringType = ajType;
        this.parameterNames = splitOnComma(str3);
    }

    private String[] splitOnComma(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, Constants.SEPARATOR_COMMA);
        int iCountTokens = stringTokenizer.countTokens();
        String[] strArr = new String[iCountTokens];
        for (int i = 0; i < iCountTokens; i++) {
            strArr[i] = stringTokenizer.nextToken().trim();
        }
        return strArr;
    }

    @Override // org.aspectj.lang.reflect.Pointcut
    public AjType getDeclaringType() {
        return this.declaringType;
    }

    @Override // org.aspectj.lang.reflect.Pointcut
    public int getModifiers() {
        return this.baseMethod.getModifiers();
    }

    @Override // org.aspectj.lang.reflect.Pointcut
    public String getName() {
        return this.name;
    }

    @Override // org.aspectj.lang.reflect.Pointcut
    public String[] getParameterNames() {
        return this.parameterNames;
    }

    @Override // org.aspectj.lang.reflect.Pointcut
    public AjType<?>[] getParameterTypes() {
        Class<?>[] parameterTypes = this.baseMethod.getParameterTypes();
        int length = parameterTypes.length;
        AjType<?>[] ajTypeArr = new AjType[length];
        for (int i = 0; i < length; i++) {
            ajTypeArr[i] = AjTypeSystem.getAjType(parameterTypes[i]);
        }
        return ajTypeArr;
    }

    @Override // org.aspectj.lang.reflect.Pointcut
    public PointcutExpression getPointcutExpression() {
        return this.f206808pc;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getName());
        stringBuffer.append("(");
        AjType<?>[] parameterTypes = getParameterTypes();
        int i = 0;
        while (i < parameterTypes.length) {
            stringBuffer.append(parameterTypes[i].getName());
            String[] strArr = this.parameterNames;
            if (strArr != null && strArr[i] != null) {
                stringBuffer.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                stringBuffer.append(this.parameterNames[i]);
            }
            i++;
            if (i < parameterTypes.length) {
                stringBuffer.append(Constants.SEPARATOR_COMMA);
            }
        }
        stringBuffer.append(") : ");
        stringBuffer.append(getPointcutExpression().asString());
        return stringBuffer.toString();
    }
}
