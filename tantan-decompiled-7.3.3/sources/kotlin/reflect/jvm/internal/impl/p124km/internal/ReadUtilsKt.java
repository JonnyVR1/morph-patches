package kotlin.reflect.jvm.internal.impl.p124km.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.p124km.KmAnnotation;
import kotlin.reflect.jvm.internal.impl.p124km.KmAnnotationArgument;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.emc0;
import p153l.nbr;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class ReadUtilsKt {

    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f65270a;

        static {
            int[] iArr = new int[ProtoBuf.Annotation.Argument.Value.Type.values().length];
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.BYTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.LONG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.CHAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.DOUBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.CLASS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.ENUM.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.ANNOTATION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.ARRAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f65270a = iArr;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m90122a(@NotNull NameResolver nameResolver, int i) {
        nameResolver.getClass();
        String strMo91783a = nameResolver.mo91783a(i);
        if (!nameResolver.mo91784b(i)) {
            return strMo91783a;
        }
        return "." + strMo91783a;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final KmAnnotation m90123b(@NotNull ProtoBuf.Annotation annotation, @NotNull NameResolver nameResolver) {
        annotation.getClass();
        nameResolver.getClass();
        String strM90122a = m90122a(nameResolver, annotation.getId());
        List<ProtoBuf.Annotation.Argument> argumentList = annotation.getArgumentList();
        argumentList.getClass();
        ArrayList arrayList = new ArrayList();
        for (ProtoBuf.Annotation.Argument argument : argumentList) {
            ProtoBuf.Annotation.Argument.Value value = argument.getValue();
            value.getClass();
            KmAnnotationArgument kmAnnotationArgumentM90124c = m90124c(value, nameResolver);
            Pair pairM88129a = kmAnnotationArgumentM90124c != null ? TuplesKt.m88129a(nameResolver.getString(argument.getNameId()), kmAnnotationArgumentM90124c) : null;
            if (pairM88129a != null) {
                arrayList.add(pairM88129a);
            }
        }
        return new KmAnnotation(strM90122a, MapsKt.toMap(arrayList));
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final KmAnnotationArgument m90124c(@NotNull ProtoBuf.Annotation.Argument.Value value, @NotNull NameResolver nameResolver) {
        value.getClass();
        nameResolver.getClass();
        if (Flags.f66032S.mo91766d(value.getFlags()).booleanValue()) {
            ProtoBuf.Annotation.Argument.Value.Type type = value.getType();
            int i = type != null ? WhenMappings.f65270a[type.ordinal()] : -1;
            if (i == 1) {
                return new KmAnnotationArgument.UByteValue(UByte.m88131b((byte) value.getIntValue()), null);
            }
            if (i == 2) {
                return new KmAnnotationArgument.UShortValue(UShort.m88200b((short) value.getIntValue()), null);
            }
            if (i == 3) {
                return new KmAnnotationArgument.UIntValue(UInt.m88154b((int) value.getIntValue()), null);
            }
            if (i == 4) {
                return new KmAnnotationArgument.ULongValue(ULong.m88177b(value.getIntValue()), null);
            }
            emc0.m121356a("Cannot read value of unsigned type: ", value.getType());
            return null;
        }
        ProtoBuf.Annotation.Argument.Value.Type type2 = value.getType();
        switch (type2 != null ? WhenMappings.f65270a[type2.ordinal()] : -1) {
            case -1:
                return null;
            case 0:
            default:
                nbr.m162172a();
                return null;
            case 1:
                return new KmAnnotationArgument.ByteValue((byte) value.getIntValue());
            case 2:
                return new KmAnnotationArgument.ShortValue((short) value.getIntValue());
            case 3:
                return new KmAnnotationArgument.IntValue((int) value.getIntValue());
            case 4:
                return new KmAnnotationArgument.LongValue(value.getIntValue());
            case 5:
                return new KmAnnotationArgument.CharValue((char) value.getIntValue());
            case 6:
                return new KmAnnotationArgument.FloatValue(value.getFloatValue());
            case 7:
                return new KmAnnotationArgument.DoubleValue(value.getDoubleValue());
            case 8:
                return new KmAnnotationArgument.BooleanValue(value.getIntValue() != 0);
            case 9:
                return new KmAnnotationArgument.StringValue(nameResolver.getString(value.getStringValue()));
            case 10:
                String strM90122a = m90122a(nameResolver, value.getClassId());
                return value.getArrayDimensionCount() == 0 ? new KmAnnotationArgument.KClassValue(strM90122a) : new KmAnnotationArgument.ArrayKClassValue(strM90122a, value.getArrayDimensionCount());
            case 11:
                return new KmAnnotationArgument.EnumValue(m90122a(nameResolver, value.getClassId()), nameResolver.getString(value.getEnumValueId()));
            case 12:
                ProtoBuf.Annotation annotation = value.getAnnotation();
                annotation.getClass();
                return new KmAnnotationArgument.AnnotationValue(m90123b(annotation, nameResolver));
            case 13:
                List<ProtoBuf.Annotation.Argument.Value> arrayElementList = value.getArrayElementList();
                arrayElementList.getClass();
                ArrayList arrayList = new ArrayList();
                for (ProtoBuf.Annotation.Argument.Value value2 : arrayElementList) {
                    value2.getClass();
                    KmAnnotationArgument kmAnnotationArgumentM90124c = m90124c(value2, nameResolver);
                    if (kmAnnotationArgumentM90124c != null) {
                        arrayList.add(kmAnnotationArgumentM90124c);
                    }
                }
                return new KmAnnotationArgument.ArrayValue(arrayList);
        }
    }
}
