package org.aspectj.internal.lang.reflect;

import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import org.aspectj.lang.annotation.AdviceName;
import org.aspectj.lang.reflect.Advice;
import org.aspectj.lang.reflect.AdviceKind;
import org.aspectj.lang.reflect.AjType;
import org.aspectj.lang.reflect.AjTypeSystem;
import org.aspectj.lang.reflect.PointcutExpression;

/* JADX INFO: loaded from: classes2.dex */
public class AdviceImpl implements Advice {
    private static final String AJC_INTERNAL = "org.aspectj.runtime.internal";
    private final Method adviceMethod;
    private AjType[] exceptionTypes;
    private Type[] genericParameterTypes;
    private boolean hasExtraParam;
    private final AdviceKind kind;
    private AjType[] parameterTypes;
    private PointcutExpression pointcutExpression;

    /* JADX INFO: renamed from: org.aspectj.internal.lang.reflect.AdviceImpl$1 */
    public static /* synthetic */ class C219921 {
        static final /* synthetic */ int[] $SwitchMap$org$aspectj$lang$reflect$AdviceKind;

        static {
            int[] iArr = new int[AdviceKind.values().length];
            $SwitchMap$org$aspectj$lang$reflect$AdviceKind = iArr;
            try {
                iArr[AdviceKind.AFTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$aspectj$lang$reflect$AdviceKind[AdviceKind.AFTER_RETURNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$aspectj$lang$reflect$AdviceKind[AdviceKind.AFTER_THROWING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$aspectj$lang$reflect$AdviceKind[AdviceKind.AROUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$aspectj$lang$reflect$AdviceKind[AdviceKind.BEFORE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public AdviceImpl(Method method, String str, AdviceKind adviceKind) {
        this.hasExtraParam = false;
        this.kind = adviceKind;
        this.adviceMethod = method;
        this.pointcutExpression = new PointcutExpressionImpl(str);
    }

    @Override // org.aspectj.lang.reflect.Advice
    public AjType getDeclaringType() {
        return AjTypeSystem.getAjType(this.adviceMethod.getDeclaringClass());
    }

    @Override // org.aspectj.lang.reflect.Advice
    public AjType<?>[] getExceptionTypes() {
        if (this.exceptionTypes == null) {
            Class<?>[] exceptionTypes = this.adviceMethod.getExceptionTypes();
            this.exceptionTypes = new AjType[exceptionTypes.length];
            for (int i = 0; i < exceptionTypes.length; i++) {
                this.exceptionTypes[i] = AjTypeSystem.getAjType(exceptionTypes[i]);
            }
        }
        return this.exceptionTypes;
    }

    @Override // org.aspectj.lang.reflect.Advice
    public Type[] getGenericParameterTypes() {
        if (this.genericParameterTypes == null) {
            Type[] genericParameterTypes = this.adviceMethod.getGenericParameterTypes();
            int i = 0;
            int i2 = 0;
            for (Type type : genericParameterTypes) {
                if ((type instanceof Class) && ((Class) type).getPackage().getName().equals(AJC_INTERNAL)) {
                    i2++;
                }
            }
            this.genericParameterTypes = new Type[genericParameterTypes.length - i2];
            while (true) {
                Type[] typeArr = this.genericParameterTypes;
                if (i >= typeArr.length) {
                    break;
                }
                Type type2 = genericParameterTypes[i];
                if (type2 instanceof Class) {
                    typeArr[i] = AjTypeSystem.getAjType((Class) type2);
                } else {
                    typeArr[i] = type2;
                }
                i++;
            }
        }
        return this.genericParameterTypes;
    }

    @Override // org.aspectj.lang.reflect.Advice
    public AdviceKind getKind() {
        return this.kind;
    }

    @Override // org.aspectj.lang.reflect.Advice
    public String getName() {
        String name = this.adviceMethod.getName();
        if (!name.startsWith("ajc$")) {
            return name;
        }
        AdviceName adviceName = (AdviceName) this.adviceMethod.getAnnotation(AdviceName.class);
        return adviceName != null ? adviceName.value() : "";
    }

    @Override // org.aspectj.lang.reflect.Advice
    public AjType<?>[] getParameterTypes() {
        if (this.parameterTypes == null) {
            Class<?>[] parameterTypes = this.adviceMethod.getParameterTypes();
            int i = 0;
            int i2 = 0;
            for (Class<?> cls : parameterTypes) {
                if (cls.getPackage().getName().equals(AJC_INTERNAL)) {
                    i2++;
                }
            }
            this.parameterTypes = new AjType[parameterTypes.length - i2];
            while (true) {
                AjType[] ajTypeArr = this.parameterTypes;
                if (i >= ajTypeArr.length) {
                    break;
                }
                ajTypeArr[i] = AjTypeSystem.getAjType(parameterTypes[i]);
                i++;
            }
        }
        return this.parameterTypes;
    }

    @Override // org.aspectj.lang.reflect.Advice
    public PointcutExpression getPointcutExpression() {
        return this.pointcutExpression;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00e8 A[SYNTHETIC] */
    public String toString() {
        AjType<?>[] exceptionTypes;
        StringBuffer stringBuffer = new StringBuffer();
        if (getName().length() > 0) {
            stringBuffer.append("@AdviceName(\"");
            stringBuffer.append(getName());
            stringBuffer.append("\") ");
        }
        if (getKind() == AdviceKind.AROUND) {
            stringBuffer.append(this.adviceMethod.getGenericReturnType().toString());
            stringBuffer.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        }
        int i = C219921.$SwitchMap$org$aspectj$lang$reflect$AdviceKind[getKind().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            stringBuffer.append("after(");
        } else if (i == 4) {
            stringBuffer.append("around(");
        } else if (i == 5) {
            stringBuffer.append("before(");
        }
        AjType<?>[] parameterTypes = getParameterTypes();
        int length = parameterTypes.length;
        if (this.hasExtraParam) {
            length--;
        }
        int i2 = 0;
        int i3 = 0;
        while (i3 < length) {
            stringBuffer.append(parameterTypes[i3].getName());
            i3++;
            if (i3 < length) {
                stringBuffer.append(Constants.SEPARATOR_COMMA);
            }
        }
        stringBuffer.append(") ");
        int i4 = C219921.$SwitchMap$org$aspectj$lang$reflect$AdviceKind[getKind().ordinal()];
        if (i4 != 2) {
            if (i4 == 3) {
            }
            exceptionTypes = getExceptionTypes();
            if (exceptionTypes.length > 0) {
                stringBuffer.append("throws ");
                while (i2 < exceptionTypes.length) {
                    stringBuffer.append(exceptionTypes[i2].getName());
                    i2++;
                    if (i2 < exceptionTypes.length) {
                        stringBuffer.append(Constants.SEPARATOR_COMMA);
                    }
                }
                stringBuffer.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            }
            stringBuffer.append(": ");
            stringBuffer.append(getPointcutExpression().asString());
            return stringBuffer.toString();
        }
        stringBuffer.append("returning");
        if (this.hasExtraParam) {
            stringBuffer.append("(");
            stringBuffer.append(parameterTypes[length - 1].getName());
            stringBuffer.append(") ");
        }
        stringBuffer.append("throwing");
        if (this.hasExtraParam) {
            stringBuffer.append("(");
            stringBuffer.append(parameterTypes[length - 1].getName());
            stringBuffer.append(") ");
        }
        exceptionTypes = getExceptionTypes();
        if (exceptionTypes.length > 0) {
            stringBuffer.append("throws ");
            while (i2 < exceptionTypes.length) {
                stringBuffer.append(exceptionTypes[i2].getName());
                i2++;
                if (i2 < exceptionTypes.length) {
                    stringBuffer.append(Constants.SEPARATOR_COMMA);
                }
            }
            stringBuffer.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        }
        stringBuffer.append(": ");
        stringBuffer.append(getPointcutExpression().asString());
        return stringBuffer.toString();
    }

    public AdviceImpl(Method method, String str, AdviceKind adviceKind, String str2) {
        this(method, str, adviceKind);
        this.hasExtraParam = true;
    }
}
