package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p149l.j6f;
import p149l.l9r;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class JvmTypeFactoryImpl implements JvmTypeFactory<JvmType> {

    @NotNull
    public static final JvmTypeFactoryImpl INSTANCE = new JvmTypeFactoryImpl();

    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f65067a;

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
            f65067a = iArr;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    @NotNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public JvmType mo90353c(@NotNull JvmType jvmType) {
        jvmType.getClass();
        if (jvmType instanceof JvmType.Primitive) {
            JvmType.Primitive primitive = (JvmType.Primitive) jvmType;
            if (primitive.m90350i() != null) {
                String strM92020f = JvmClassName.m92016c(primitive.m90350i().getWrapperFqName()).m92020f();
                strM92020f.getClass();
                return mo90356f(strM92020f);
            }
        }
        return jvmType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    @NotNull
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public JvmType mo90351a(@NotNull String str) {
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
            return new JvmType.Array(mo90351a(str.substring(1)));
        }
        if (cCharAt == 'L') {
            StringsKt.m93418S(str, ';', false, 2, null);
        }
        return new JvmType.Object(str.substring(1, str.length() - 1));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public JvmType.Object mo90356f(@NotNull String str) {
        str.getClass();
        return new JvmType.Object(str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    @NotNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public JvmType mo90354d(@NotNull PrimitiveType primitiveType) {
        primitiveType.getClass();
        switch (WhenMappings.f65067a[primitiveType.ordinal()]) {
            case 1:
                return JvmType.Companion.m90341a();
            case 2:
                return JvmType.Companion.m90343c();
            case 3:
                return JvmType.Companion.m90342b();
            case 4:
                return JvmType.Companion.m90348h();
            case 5:
                return JvmType.Companion.m90346f();
            case 6:
                return JvmType.Companion.m90345e();
            case 7:
                return JvmType.Companion.m90347g();
            case 8:
                return JvmType.Companion.m90344d();
            default:
                l9r.m149037a();
                return null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    @NotNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public JvmType mo90352b() {
        return mo90356f("java/lang/Class");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory
    @NotNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public String mo90355e(@NotNull JvmType jvmType) {
        String desc;
        jvmType.getClass();
        if (jvmType instanceof JvmType.Array) {
            return "[" + mo90355e(((JvmType.Array) jvmType).m90340i());
        }
        if (jvmType instanceof JvmType.Primitive) {
            JvmPrimitiveType jvmPrimitiveTypeM90350i = ((JvmType.Primitive) jvmType).m90350i();
            return (jvmPrimitiveTypeM90350i == null || (desc = jvmPrimitiveTypeM90350i.getDesc()) == null) ? j6f.GPS_MEASUREMENT_INTERRUPTED : desc;
        }
        if (!(jvmType instanceof JvmType.Object)) {
            l9r.m149037a();
            return null;
        }
        return "L" + ((JvmType.Object) jvmType).m90349i() + ';';
    }
}
