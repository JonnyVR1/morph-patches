package kotlin.reflect.jvm.internal.impl.name;

import java.util.List;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.qkq0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class FqName {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: c */
    @JvmField
    @NotNull
    public static final FqName f65472c = new FqName("");

    /* JADX INFO: renamed from: a */
    @NotNull
    public final FqNameUnsafe f65473a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public transient FqName f65474b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final FqName m91055a(@NotNull Name name) {
            name.getClass();
            return new FqName(FqNameUnsafe.Companion.m91069a(name));
        }

        private Companion() {
        }
    }

    public FqName(@NotNull String str) {
        str.getClass();
        this.f65473a = new FqNameUnsafe(str, this);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m91046a() {
        return this.f65473a.m91057a();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final FqName m91047b(@NotNull Name name) {
        name.getClass();
        return new FqName(this.f65473a.m91058b(name), this);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m91048c() {
        return this.f65473a.m91061e();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final FqName m91049d() {
        FqName fqName = this.f65474b;
        if (fqName != null) {
            return fqName;
        }
        if (m91048c()) {
            qkq0.m175383a("root");
            return null;
        }
        FqName fqName2 = new FqName(this.f65473a.m91063g());
        this.f65474b = fqName2;
        return fqName2;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final List<Name> m91050e() {
        return this.f65473a.m91064h();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FqName) && Intrinsics.m87488d(this.f65473a, ((FqName) obj).f65473a);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final Name m91051f() {
        return this.f65473a.m91065j();
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final Name m91052g() {
        return this.f65473a.m91066k();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m91053h(@NotNull Name name) {
        name.getClass();
        return this.f65473a.m91067l(name);
    }

    public int hashCode() {
        return this.f65473a.hashCode();
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final FqNameUnsafe m91054i() {
        return this.f65473a;
    }

    @NotNull
    public String toString() {
        return this.f65473a.toString();
    }

    public FqName(@NotNull FqNameUnsafe fqNameUnsafe) {
        fqNameUnsafe.getClass();
        this.f65473a = fqNameUnsafe;
    }

    public FqName(FqNameUnsafe fqNameUnsafe, FqName fqName) {
        this.f65473a = fqNameUnsafe;
        this.f65474b = fqName;
    }
}
