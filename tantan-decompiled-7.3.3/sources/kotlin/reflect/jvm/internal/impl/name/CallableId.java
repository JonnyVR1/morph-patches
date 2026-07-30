package kotlin.reflect.jvm.internal.impl.name;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class CallableId {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Name f66136f;

    /* JADX INFO: renamed from: g */
    @NotNull
    public static final FqName f66137g;

    /* JADX INFO: renamed from: a */
    @NotNull
    public final FqName f66138a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final FqName f66139b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Name f66140c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final ClassId f66141d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final FqName f66142e;

    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Name name = SpecialNames.f66172m;
        f66136f = name;
        f66137g = FqName.Companion.m91946a(name);
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
        return Intrinsics.m88377d(this.f66138a, callableId.f66138a) && Intrinsics.m88377d(this.f66139b, callableId.f66139b) && Intrinsics.m88377d(this.f66140c, callableId.f66140c);
    }

    public int hashCode() {
        int iHashCode = (527 + this.f66138a.hashCode()) * 31;
        FqName fqName = this.f66139b;
        return ((iHashCode + (fqName != null ? fqName.hashCode() : 0)) * 31) + this.f66140c.hashCode();
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C15493d.m94369E(this.f66138a.m91937a(), '.', '/', false, 4, null));
        sb.append("/");
        FqName fqName = this.f66139b;
        if (fqName != null) {
            sb.append(fqName);
            sb.append(".");
        }
        sb.append(this.f66140c);
        return sb.toString();
    }

    public CallableId(FqName fqName, FqName fqName2, Name name, ClassId classId, FqName fqName3) {
        this.f66138a = fqName;
        this.f66139b = fqName2;
        this.f66140c = name;
        this.f66141d = classId;
        this.f66142e = fqName3;
    }
}
