package kotlin.reflect.jvm.internal.impl.name;

import java.util.List;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class FqName {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: c */
    @JvmField
    @NotNull
    public static final FqName f66146c = new FqName("");

    /* JADX INFO: renamed from: a */
    @NotNull
    public final FqNameUnsafe f66147a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public transient FqName f66148b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final FqName m91946a(@NotNull Name name) {
            name.getClass();
            return new FqName(FqNameUnsafe.Companion.m91960a(name));
        }

        private Companion() {
        }
    }

    public FqName(@NotNull String str) {
        str.getClass();
        this.f66147a = new FqNameUnsafe(str, this);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m91937a() {
        return this.f66147a.m91948a();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final FqName m91938b(@NotNull Name name) {
        name.getClass();
        return new FqName(this.f66147a.m91949b(name), this);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m91939c() {
        return this.f66147a.m91952e();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final FqName m91940d() {
        FqName fqName = this.f66148b;
        if (fqName != null) {
            return fqName;
        }
        if (m91939c()) {
            wtq0.m207906a("root");
            return null;
        }
        FqName fqName2 = new FqName(this.f66147a.m91954g());
        this.f66148b = fqName2;
        return fqName2;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final List<Name> m91941e() {
        return this.f66147a.m91955h();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FqName) && Intrinsics.m88377d(this.f66147a, ((FqName) obj).f66147a);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final Name m91942f() {
        return this.f66147a.m91956j();
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final Name m91943g() {
        return this.f66147a.m91957k();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m91944h(@NotNull Name name) {
        name.getClass();
        return this.f66147a.m91958l(name);
    }

    public int hashCode() {
        return this.f66147a.hashCode();
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final FqNameUnsafe m91945i() {
        return this.f66147a;
    }

    @NotNull
    public String toString() {
        return this.f66147a.toString();
    }

    public FqName(@NotNull FqNameUnsafe fqNameUnsafe) {
        fqNameUnsafe.getClass();
        this.f66147a = fqNameUnsafe;
    }

    public FqName(FqNameUnsafe fqNameUnsafe, FqName fqName) {
        this.f66147a = fqNameUnsafe;
        this.f66148b = fqName;
    }
}
