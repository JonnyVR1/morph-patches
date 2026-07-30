package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p153l.nbr;
import p153l.p7f;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class JvmTypeFactoryImpl implements JvmTypeFactory<JvmType> {

    @NotNull
    public static final JvmTypeFactoryImpl INSTANCE = new JvmTypeFactoryImpl();

    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f65741a;

        static {
            int[] iArr = new int[PrimitiveType.values().length];
            try {
                iArr[PrimitiveType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrimitiveType.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PrimitiveType.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PrimitiveType.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PrimitiveType.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PrimitiveType.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PrimitiveType.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PrimitiveType.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f65741a = iArr;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public JvmType mo91244c(@NotNull JvmType jvmType) {
        jvmType.getClass();
        if (jvmType instanceof JvmType.Primitive) {
            JvmType.Primitive primitive = (JvmType.Primitive) jvmType;
            if (primitive.m91241i() != null) {
                String strM92911f = JvmClassName.m92907c(primitive.m91241i().getWrapperFqName()).m92911f();
                strM92911f.getClass();
                return mo91247f(strM92911f);
            }
        }
        return jvmType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    @NotNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public JvmType mo91242a(@NotNull String str) {
        JvmPrimitiveType jvmPrimitiveType;
        str.getClass();
        str.length();
        char cCharAt = str.charAt(0);
        JvmPrimitiveType[] jvmPrimitiveTypeArrValues = JvmPrimitiveType.values();
        int length = jvmPrimitiveTypeArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                jvmPrimitiveType = null;
                break;
            }
            jvmPrimitiveType = jvmPrimitiveTypeArrValues[i];
            if (jvmPrimitiveType.getDesc().charAt(0) == cCharAt) {
                break;
            }
            i++;
        }
        if (jvmPrimitiveType != null) {
            return new JvmType.Primitive(jvmPrimitiveType);
        }
        if (cCharAt == 'V') {
            return new JvmType.Primitive(null);
        }
        if (cCharAt == '[') {
            return new JvmType.Array(mo91242a(str.substring(1)));
        }
        if (cCharAt == 'L') {
            StringsKt.m94309S(str, ';', false, 2, null);
        }
        return new JvmType.Object(str.substring(1, str.length() - 1));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public JvmType.Object mo91247f(@NotNull String str) {
        str.getClass();
        return new JvmType.Object(str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    @NotNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public JvmType mo91245d(@NotNull PrimitiveType primitiveType) {
        primitiveType.getClass();
        switch (WhenMappings.f65741a[primitiveType.ordinal()]) {
            case 1:
                return JvmType.Companion.m91232a();
            case 2:
                return JvmType.Companion.m91234c();
            case 3:
                return JvmType.Companion.m91233b();
            case 4:
                return JvmType.Companion.m91239h();
            case 5:
                return JvmType.Companion.m91237f();
            case 6:
                return JvmType.Companion.m91236e();
            case 7:
                return JvmType.Companion.m91238g();
            case 8:
                return JvmType.Companion.m91235d();
            default:
                nbr.m162172a();
                return null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    @NotNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public JvmType mo91243b() {
        return mo91247f("java/lang/Class");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public String mo91246e(@NotNull JvmType jvmType) {
        String desc;
        jvmType.getClass();
        if (jvmType instanceof JvmType.Array) {
            return "[" + mo91246e(((JvmType.Array) jvmType).m91231i());
        }
        if (jvmType instanceof JvmType.Primitive) {
            JvmPrimitiveType jvmPrimitiveTypeM91241i = ((JvmType.Primitive) jvmType).m91241i();
            return (jvmPrimitiveTypeM91241i == null || (desc = jvmPrimitiveTypeM91241i.getDesc()) == null) ? p7f.GPS_MEASUREMENT_INTERRUPTED : desc;
        }
        if (!(jvmType instanceof JvmType.Object)) {
            nbr.m162172a();
            return null;
        }
        return "L" + ((JvmType.Object) jvmType).m91240i() + ';';
    }
}
