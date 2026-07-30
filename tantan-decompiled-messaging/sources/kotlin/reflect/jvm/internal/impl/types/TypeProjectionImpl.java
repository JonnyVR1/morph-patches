package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class TypeProjectionImpl extends TypeProjectionBase {

    /* JADX INFO: renamed from: a */
    public final Variance f66279a;

    /* JADX INFO: renamed from: b */
    public final KotlinType f66280b;

    public TypeProjectionImpl(@NotNull Variance variance, @NotNull KotlinType kotlinType) {
        if (variance == null) {
            m92756d(0);
        }
        if (kotlinType == null) {
            m92756d(1);
        }
        this.f66279a = variance;
        this.f66280b = kotlinType;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m92756d(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 4 || i == 5) ? 2 : 3];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i == 3) {
            objArr[2] = "replaceType";
        } else if (i != 4 && i != 5) {
            if (i != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    @NotNull
    /* JADX INFO: renamed from: a */
    public TypeProjection mo92665a(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        if (kotlinTypeRefiner == null) {
            m92756d(6);
        }
        return new TypeProjectionImpl(this.f66279a, kotlinTypeRefiner.mo92559a(this.f66280b));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    /* JADX INFO: renamed from: b */
    public boolean mo92666b() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    @NotNull
    /* JADX INFO: renamed from: c */
    public Variance mo92667c() {
        Variance variance = this.f66279a;
        if (variance == null) {
            m92756d(4);
        }
        return variance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeProjection
    @NotNull
    public KotlinType getType() {
        KotlinType kotlinType = this.f66280b;
        if (kotlinType == null) {
            m92756d(5);
        }
        return kotlinType;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TypeProjectionImpl(@NotNull KotlinType kotlinType) {
        this(Variance.INVARIANT, kotlinType);
        if (kotlinType == null) {
            m92756d(2);
        }
    }
}
