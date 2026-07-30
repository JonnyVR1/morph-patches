package kotlin.jvm.internal;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import java.util.List;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVariance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.nbr;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin
@Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010#\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8VX\u0096\u0004¢\u0006\f\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 ¨\u0006%"}, m88121d2 = {"Lkotlin/jvm/internal/TypeParameterReference;", "Lkotlin/reflect/KTypeParameter;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/Object;", "container", "b", "Ljava/lang/String;", "getName", AuthenticationTokenClaims.JSON_KEY_NAME, "Lkotlin/reflect/KVariance;", "c", "Lkotlin/reflect/KVariance;", "h", "()Lkotlin/reflect/KVariance;", "variance", "", "Lkotlin/reflect/KType;", Constants.INAPP_DATA_TAG, "Ljava/util/List;", "bounds", "getUpperBounds", "()Ljava/util/List;", "getUpperBounds$annotations", "()V", "upperBounds", "Companion", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class TypeParameterReference implements KTypeParameter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final Object container;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final KVariance variance;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public volatile List<? extends KType> bounds;

    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Lkotlin/jvm/internal/TypeParameterReference$Companion;", "", "<init>", "()V", "Lkotlin/reflect/KTypeParameter;", "typeParameter", "", "a", "(Lkotlin/reflect/KTypeParameter;)Ljava/lang/String;", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {

        @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
        public static final /* synthetic */ class WhenMappings {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f64198a;

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
                f64198a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final String m88444a(@NotNull KTypeParameter typeParameter) {
            typeParameter.getClass();
            StringBuilder sb = new StringBuilder();
            int i = WhenMappings.f64198a[typeParameter.getVariance().ordinal()];
            if (i == 1) {
                Unit unit = Unit.INSTANCE;
            } else if (i == 2) {
                sb.append("in ");
            } else {
                if (i != 3) {
                    nbr.m162172a();
                    return null;
                }
                sb.append("out ");
            }
            sb.append(typeParameter.getName());
            return sb.toString();
        }

        private Companion() {
        }
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof TypeParameterReference)) {
            return false;
        }
        TypeParameterReference typeParameterReference = (TypeParameterReference) other;
        return Intrinsics.m88377d(this.container, typeParameterReference.container) && Intrinsics.m88377d(getName(), typeParameterReference.getName());
    }

    @Override // kotlin.reflect.KTypeParameter
    @NotNull
    public String getName() {
        return this.name;
    }

    @Override // kotlin.reflect.KTypeParameter
    @NotNull
    public List<KType> getUpperBounds() {
        List list = this.bounds;
        if (list != null) {
            return list;
        }
        List<KType> listListOf = CollectionsKt.listOf(Reflection.m88401g(Object.class));
        this.bounds = listListOf;
        return listListOf;
    }

    @Override // kotlin.reflect.KTypeParameter
    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public KVariance getVariance() {
        return this.variance;
    }

    public int hashCode() {
        Object obj = this.container;
        return ((obj != null ? obj.hashCode() : 0) * 31) + getName().hashCode();
    }

    @NotNull
    public String toString() {
        return INSTANCE.m88444a(this);
    }
}
