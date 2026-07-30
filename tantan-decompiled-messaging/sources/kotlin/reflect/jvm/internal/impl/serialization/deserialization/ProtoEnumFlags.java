package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.l9r;
import p149l.qhg0;

/* JADX INFO: loaded from: classes2.dex */
public final class ProtoEnumFlags {

    @NotNull
    public static final ProtoEnumFlags INSTANCE = new ProtoEnumFlags();

    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f66038a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f66039b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f66040c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ int[] f66041d;

        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ int[] f66042e;

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ int[] f66043f;

        /* JADX INFO: renamed from: g */
        public static final /* synthetic */ int[] f66044g;

        /* JADX INFO: renamed from: h */
        public static final /* synthetic */ int[] f66045h;

        static {
            int[] iArr = new int[ProtoBuf.Modality.values().length];
            try {
                iArr[ProtoBuf.Modality.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProtoBuf.Modality.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProtoBuf.Modality.ABSTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProtoBuf.Modality.SEALED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f66038a = iArr;
            int[] iArr2 = new int[Modality.values().length];
            try {
                iArr2[Modality.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Modality.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Modality.ABSTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Modality.SEALED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f66039b = iArr2;
            int[] iArr3 = new int[ProtoBuf.Visibility.values().length];
            try {
                iArr3[ProtoBuf.Visibility.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[ProtoBuf.Visibility.PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[ProtoBuf.Visibility.PRIVATE_TO_THIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[ProtoBuf.Visibility.PROTECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[ProtoBuf.Visibility.PUBLIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[ProtoBuf.Visibility.LOCAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            f66040c = iArr3;
            int[] iArr4 = new int[ProtoBuf.Class.Kind.values().length];
            try {
                iArr4[ProtoBuf.Class.Kind.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[ProtoBuf.Class.Kind.INTERFACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[ProtoBuf.Class.Kind.ENUM_CLASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[ProtoBuf.Class.Kind.ENUM_ENTRY.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[ProtoBuf.Class.Kind.ANNOTATION_CLASS.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[ProtoBuf.Class.Kind.OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[ProtoBuf.Class.Kind.COMPANION_OBJECT.ordinal()] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            f66041d = iArr4;
            int[] iArr5 = new int[ClassKind.values().length];
            try {
                iArr5[ClassKind.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr5[ClassKind.INTERFACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr5[ClassKind.ENUM_CLASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr5[ClassKind.ENUM_ENTRY.ordinal()] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr5[ClassKind.ANNOTATION_CLASS.ordinal()] = 5;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr5[ClassKind.OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused27) {
            }
            f66042e = iArr5;
            int[] iArr6 = new int[ProtoBuf.TypeParameter.Variance.values().length];
            try {
                iArr6[ProtoBuf.TypeParameter.Variance.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr6[ProtoBuf.TypeParameter.Variance.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr6[ProtoBuf.TypeParameter.Variance.INV.ordinal()] = 3;
            } catch (NoSuchFieldError unused30) {
            }
            f66043f = iArr6;
            int[] iArr7 = new int[ProtoBuf.Type.Argument.Projection.values().length];
            try {
                iArr7[ProtoBuf.Type.Argument.Projection.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr7[ProtoBuf.Type.Argument.Projection.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr7[ProtoBuf.Type.Argument.Projection.INV.ordinal()] = 3;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr7[ProtoBuf.Type.Argument.Projection.STAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused34) {
            }
            f66044g = iArr7;
            int[] iArr8 = new int[Variance.values().length];
            try {
                iArr8[Variance.IN_VARIANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr8[Variance.OUT_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr8[Variance.INVARIANT.ordinal()] = 3;
            } catch (NoSuchFieldError unused37) {
            }
            f66045h = iArr8;
        }
    }

    private ProtoEnumFlags() {
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final ClassKind m92244a(@Nullable ProtoBuf.Class.Kind kind) {
        switch (kind == null ? -1 : WhenMappings.f66041d[kind.ordinal()]) {
            case 1:
                return ClassKind.CLASS;
            case 2:
                return ClassKind.INTERFACE;
            case 3:
                return ClassKind.ENUM_CLASS;
            case 4:
                return ClassKind.ENUM_ENTRY;
            case 5:
                return ClassKind.ANNOTATION_CLASS;
            case 6:
            case 7:
                return ClassKind.OBJECT;
            default:
                return ClassKind.CLASS;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final Modality m92245b(@Nullable ProtoBuf.Modality modality) {
        int i = modality == null ? -1 : WhenMappings.f66038a[modality.ordinal()];
        if (i == 1) {
            return Modality.FINAL;
        }
        if (i == 2) {
            return Modality.OPEN;
        }
        if (i != 3) {
            return i != 4 ? Modality.FINAL : Modality.SEALED;
        }
        return Modality.ABSTRACT;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Variance m92246c(@NotNull ProtoBuf.Type.Argument.Projection projection) {
        projection.getClass();
        int i = WhenMappings.f66044g[projection.ordinal()];
        if (i == 1) {
            return Variance.IN_VARIANCE;
        }
        if (i == 2) {
            return Variance.OUT_VARIANCE;
        }
        if (i == 3) {
            return Variance.INVARIANT;
        }
        if (i != 4) {
            l9r.m149037a();
            return null;
        }
        qhg0.m174539a("Only IN, OUT and INV are supported. Actual argument: ", projection);
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Variance m92247d(@NotNull ProtoBuf.TypeParameter.Variance variance) {
        variance.getClass();
        int i = WhenMappings.f66043f[variance.ordinal()];
        if (i == 1) {
            return Variance.IN_VARIANCE;
        }
        if (i == 2) {
            return Variance.OUT_VARIANCE;
        }
        if (i == 3) {
            return Variance.INVARIANT;
        }
        l9r.m149037a();
        return null;
    }
}
