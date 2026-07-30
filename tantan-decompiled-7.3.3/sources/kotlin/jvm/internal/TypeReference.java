package kotlin.jvm.internal;

import com.clevertap.android.sdk.Constants;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.TypeReference;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.nbr;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin
@Metadata(m88120d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 52\u00020\u0001:\u00015B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB'\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u0015*\u00020\u0005H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(R \u0010\t\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b.\u0010*\u001a\u0004\b-\u0010\u0014R\u0014\u0010\r\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u001c\u00104\u001a\u00020\u0015*\u0006\u0012\u0002\b\u0003018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00066"}, m88121d2 = {"Lkotlin/jvm/internal/TypeReference;", "Lkotlin/reflect/KType;", "Lkotlin/reflect/KClassifier;", "classifier", "", "Lkotlin/reflect/KTypeProjection;", "arguments", "platformTypeUpperBound", "", "flags", "<init>", "(Lkotlin/reflect/KClassifier;Ljava/util/List;Lkotlin/reflect/KType;I)V", "", "isMarkedNullable", "(Lkotlin/reflect/KClassifier;Ljava/util/List;Z)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "convertPrimitiveToWrapper", "g", "(Z)Ljava/lang/String;", "e", "(Lkotlin/reflect/KTypeProjection;)Ljava/lang/String;", "a", "Lkotlin/reflect/KClassifier;", RXScreenCaptureService.KEY_INDEX, "()Lkotlin/reflect/KClassifier;", "b", "Ljava/util/List;", "j", "()Ljava/util/List;", "c", "Lkotlin/reflect/KType;", "getPlatformTypeUpperBound$kotlin_stdlib", "()Lkotlin/reflect/KType;", "getPlatformTypeUpperBound$kotlin_stdlib$annotations", "()V", Constants.INAPP_DATA_TAG, "I", "getFlags$kotlin_stdlib", "getFlags$kotlin_stdlib$annotations", "k", "()Z", "Ljava/lang/Class;", "h", "(Ljava/lang/Class;)Ljava/lang/String;", "arrayClassName", "Companion", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class TypeReference implements KType {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final KClassifier classifier;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<KTypeProjection> arguments;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final KType platformTypeUpperBound;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int flags;

    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f64203a;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f64203a = iArr;
        }
    }

    @SinceKotlin
    public TypeReference(@NotNull KClassifier kClassifier, @NotNull List<KTypeProjection> list, @Nullable KType kType, int i) {
        kClassifier.getClass();
        list.getClass();
        this.classifier = kClassifier;
        this.arguments = list;
        this.platformTypeUpperBound = kType;
        this.flags = i;
    }

    /* JADX INFO: renamed from: d */
    public static CharSequence m88445d(TypeReference typeReference, KTypeProjection kTypeProjection) {
        kTypeProjection.getClass();
        return typeReference.m88446e(kTypeProjection);
    }

    /* JADX INFO: renamed from: e */
    public final String m88446e(KTypeProjection kTypeProjection) {
        String strValueOf;
        if (kTypeProjection.m88503d() == null) {
            return "*";
        }
        KType kTypeM88502c = kTypeProjection.m88502c();
        TypeReference typeReference = kTypeM88502c instanceof TypeReference ? (TypeReference) kTypeM88502c : null;
        if (typeReference == null || (strValueOf = typeReference.m88447g(true)) == null) {
            strValueOf = String.valueOf(kTypeProjection.m88502c());
        }
        int i = WhenMappings.f64203a[kTypeProjection.m88503d().ordinal()];
        if (i == 1) {
            return strValueOf;
        }
        if (i == 2) {
            return "in ".concat(strValueOf);
        }
        if (i == 3) {
            return "out ".concat(strValueOf);
        }
        nbr.m162172a();
        return null;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof TypeReference)) {
            return false;
        }
        TypeReference typeReference = (TypeReference) other;
        return Intrinsics.m88377d(getClassifier(), typeReference.getClassifier()) && Intrinsics.m88377d(mo88450j(), typeReference.mo88450j()) && Intrinsics.m88377d(this.platformTypeUpperBound, typeReference.platformTypeUpperBound) && this.flags == typeReference.flags;
    }

    /* JADX INFO: renamed from: g */
    public final String m88447g(boolean convertPrimitiveToWrapper) {
        String name;
        KClassifier classifier = getClassifier();
        KClass kClass = classifier instanceof KClass ? (KClass) classifier : null;
        Class<?> clsM88341b = kClass != null ? JvmClassMappingKt.m88341b(kClass) : null;
        if (clsM88341b == null) {
            name = getClassifier().toString();
        } else if ((this.flags & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (clsM88341b.isArray()) {
            name = m88448h(clsM88341b);
        } else if (convertPrimitiveToWrapper && clsM88341b.isPrimitive()) {
            KClassifier classifier2 = getClassifier();
            classifier2.getClass();
            name = JvmClassMappingKt.m88342c((KClass) classifier2).getName();
        } else {
            name = clsM88341b.getName();
        }
        String str = name + (mo88450j().isEmpty() ? "" : CollectionsKt.joinToString$default(mo88450j(), ", ", "<", ">", 0, null, new Function1() { // from class: l.unj0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TypeReference.m88445d(this.f179736a, (KTypeProjection) obj);
            }
        }, 24, null)) + (mo88451k() ? "?" : "");
        KType kType = this.platformTypeUpperBound;
        if (kType instanceof TypeReference) {
            String strM88447g = ((TypeReference) kType).m88447g(true);
            if (!Intrinsics.m88377d(strM88447g, str)) {
                if (Intrinsics.m88377d(strM88447g, str.concat("?"))) {
                    return str.concat("!");
                }
                return "(" + str + ".." + strM88447g + ')';
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: h */
    public final String m88448h(Class<?> cls) {
        if (Intrinsics.m88377d(cls, boolean[].class)) {
            return "kotlin.BooleanArray";
        }
        if (Intrinsics.m88377d(cls, char[].class)) {
            return "kotlin.CharArray";
        }
        if (Intrinsics.m88377d(cls, byte[].class)) {
            return "kotlin.ByteArray";
        }
        if (Intrinsics.m88377d(cls, short[].class)) {
            return "kotlin.ShortArray";
        }
        if (Intrinsics.m88377d(cls, int[].class)) {
            return "kotlin.IntArray";
        }
        if (Intrinsics.m88377d(cls, float[].class)) {
            return "kotlin.FloatArray";
        }
        if (Intrinsics.m88377d(cls, long[].class)) {
            return "kotlin.LongArray";
        }
        return Intrinsics.m88377d(cls, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
    }

    public int hashCode() {
        return (((getClassifier().hashCode() * 31) + mo88450j().hashCode()) * 31) + Integer.hashCode(this.flags);
    }

    @Override // kotlin.reflect.KType
    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public KClassifier getClassifier() {
        return this.classifier;
    }

    @Override // kotlin.reflect.KType
    @NotNull
    /* JADX INFO: renamed from: j */
    public List<KTypeProjection> mo88450j() {
        return this.arguments;
    }

    @Override // kotlin.reflect.KType
    /* JADX INFO: renamed from: k */
    public boolean mo88451k() {
        return (this.flags & 1) != 0;
    }

    @NotNull
    public String toString() {
        return m88447g(false) + " (Kotlin reflection is not available)";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TypeReference(@NotNull KClassifier kClassifier, @NotNull List<KTypeProjection> list, boolean z) {
        this(kClassifier, list, null, z ? 1 : 0);
        kClassifier.getClass();
        list.getClass();
    }
}
