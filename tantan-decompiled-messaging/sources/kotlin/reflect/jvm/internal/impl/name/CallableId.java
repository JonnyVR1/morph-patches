package kotlin.reflect.jvm.internal.impl.name;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class CallableId {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Name f65462f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final FqName f65463g;

    /* JADX INFO: renamed from: a */
    @NotNull
    public final FqName f65464a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final FqName f65465b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Name f65466c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final ClassId f65467d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final FqName f65468e;

    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Name name = SpecialNames.f65498m;
        f65462f = name;
        f65463g = FqName.Companion.m91055a(name);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallableId(@NotNull FqName fqName, @NotNull Name name) {
        this(fqName, null, name, null, null);
        fqName.getClass();
        name.getClass();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallableId)) {
            return false;
        }
        CallableId callableId = (CallableId) obj;
        return Intrinsics.m87488d(this.f65464a, callableId.f65464a) && Intrinsics.m87488d(this.f65465b, callableId.f65465b) && Intrinsics.m87488d(this.f65466c, callableId.f65466c);
    }

    public int hashCode() {
        int iHashCode = (527 + this.f65464a.hashCode()) * 31;
        FqName fqName = this.f65465b;
        return ((iHashCode + (fqName != null ? fqName.hashCode() : 0)) * 31) + this.f65466c.hashCode();
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C15386d.m93478E(this.f65464a.m91046a(), '.', '/', false, 4, null));
        sb.append("/");
        FqName fqName = this.f65465b;
        if (fqName != null) {
            sb.append(fqName);
            sb.append(".");
        }
        sb.append(this.f65466c);
        return sb.toString();
    }

    public CallableId(FqName fqName, FqName fqName2, Name name, ClassId classId, FqName fqName3) {
        this.f65464a = fqName;
        this.f65465b = fqName2;
        this.f65466c = name;
        this.f65467d = classId;
        this.f65468e = fqName3;
    }
}
