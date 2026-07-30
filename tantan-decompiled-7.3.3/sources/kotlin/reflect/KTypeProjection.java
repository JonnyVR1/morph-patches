package kotlin.reflect;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.nbr;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u000e¨\u0006\u001b"}, m88121d2 = {"Lkotlin/reflect/KTypeProjection;", "", "Lkotlin/reflect/KVariance;", "variance", "Lkotlin/reflect/KType;", "type", "<init>", "(Lkotlin/reflect/KVariance;Lkotlin/reflect/KType;)V", "", "toString", "()Ljava/lang/String;", "a", "()Lkotlin/reflect/KVariance;", "b", "()Lkotlin/reflect/KType;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlin/reflect/KVariance;", Constants.INAPP_DATA_TAG, "Lkotlin/reflect/KType;", "c", "Companion", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final /* data */ class KTypeProjection {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c */
    @JvmField
    @NotNull
    public static final KTypeProjection f64245c = new KTypeProjection(null, null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final KVariance variance;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final KType type;

    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bR\u0011\u0010\r\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m88121d2 = {"Lkotlin/reflect/KTypeProjection$Companion;", "", "<init>", "()V", "Lkotlin/reflect/KType;", "type", "Lkotlin/reflect/KTypeProjection;", Constants.INAPP_DATA_TAG, "(Lkotlin/reflect/KType;)Lkotlin/reflect/KTypeProjection;", "a", "b", "c", "()Lkotlin/reflect/KTypeProjection;", "STAR", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final KTypeProjection m88504a(@NotNull KType type) {
            type.getClass();
            return new KTypeProjection(KVariance.IN, type);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: b */
        public final KTypeProjection m88505b(@NotNull KType type) {
            type.getClass();
            return new KTypeProjection(KVariance.OUT, type);
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final KTypeProjection m88506c() {
            return KTypeProjection.f64245c;
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: d */
        public final KTypeProjection m88507d(@NotNull KType type) {
            type.getClass();
            return new KTypeProjection(KVariance.INVARIANT, type);
        }

        private Companion() {
        }
    }

    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f64248a;

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
            f64248a = iArr;
        }
    }

    public KTypeProjection(@Nullable KVariance kVariance, @Nullable KType kType) {
        String str;
        this.variance = kVariance;
        this.type = kType;
        if ((kVariance == null) == (kType == null)) {
            return;
        }
        if (kVariance == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + kVariance + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final KVariance getVariance() {
        return this.variance;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final KType getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final KType m88502c() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final KVariance m88503d() {
        return this.variance;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KTypeProjection)) {
            return false;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) other;
        return this.variance == kTypeProjection.variance && Intrinsics.m88377d(this.type, kTypeProjection.type);
    }

    public int hashCode() {
        KVariance kVariance = this.variance;
        int iHashCode = (kVariance == null ? 0 : kVariance.hashCode()) * 31;
        KType kType = this.type;
        return iHashCode + (kType != null ? kType.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        KVariance kVariance = this.variance;
        int i = kVariance == null ? -1 : WhenMappings.f64248a[kVariance.ordinal()];
        if (i == -1) {
            return "*";
        }
        if (i == 1) {
            return String.valueOf(this.type);
        }
        if (i == 2) {
            return "in " + this.type;
        }
        if (i != 3) {
            nbr.m162172a();
            return null;
        }
        return "out " + this.type;
    }
}
