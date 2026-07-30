package kotlin.reflect.jvm.internal.impl.name;

import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class ClassId {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final FqName f66143a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final FqName f66144b;

    /* JADX INFO: renamed from: c */
    public final boolean f66145c;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ ClassId m91934b(Companion companion, String str, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.m91935a(str, z);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        /* JADX INFO: renamed from: a */
        public final ClassId m91935a(@NotNull String str, boolean z) {
            String strM94369E;
            String strM94370F;
            str.getClass();
            int iB0 = StringsKt.m94326b0(str, '`', 0, false, 6, null);
            if (iB0 == -1) {
                iB0 = str.length();
            }
            int iJ0 = StringsKt.m94334j0(str, "/", iB0, false, 4, null);
            if (iJ0 == -1) {
                strM94370F = C15493d.m94370F(str, "`", "", false, 4, null);
                strM94369E = "";
            } else {
                strM94369E = C15493d.m94369E(str.substring(0, iJ0), '/', '.', false, 4, null);
                strM94370F = C15493d.m94370F(str.substring(iJ0 + 1), "`", "", false, 4, null);
            }
            return new ClassId(new FqName(strM94369E), new FqName(strM94370F), z);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: c */
        public final ClassId m91936c(@NotNull FqName fqName) {
            fqName.getClass();
            return new ClassId(fqName.m91940d(), fqName.m91942f());
        }

        private Companion() {
        }
    }

    public ClassId(@NotNull FqName fqName, @NotNull FqName fqName2, boolean z) {
        fqName.getClass();
        fqName2.getClass();
        this.f66143a = fqName;
        this.f66144b = fqName2;
        this.f66145c = z;
        fqName2.m91939c();
    }

    /* JADX INFO: renamed from: c */
    public static final String m91923c(FqName fqName) {
        String strM91937a = fqName.m91937a();
        if (!StringsKt.m94301O(strM91937a, '/', false, 2, null)) {
            return strM91937a;
        }
        return "`" + strM91937a + '`';
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: k */
    public static final ClassId m91924k(@NotNull FqName fqName) {
        return Companion.m91936c(fqName);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final FqName m91925a() {
        if (this.f66143a.m91939c()) {
            return this.f66144b;
        }
        return new FqName(this.f66143a.m91937a() + '.' + this.f66144b.m91937a());
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m91926b() {
        if (this.f66143a.m91939c()) {
            return m91923c(this.f66144b);
        }
        return C15493d.m94369E(this.f66143a.m91937a(), '.', '/', false, 4, null) + "/" + m91923c(this.f66144b);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final ClassId m91927d(@NotNull Name name) {
        name.getClass();
        return new ClassId(this.f66143a, this.f66144b.m91938b(name), this.f66145c);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final ClassId m91928e() {
        FqName fqNameM91940d = this.f66144b.m91940d();
        if (fqNameM91940d.m91939c()) {
            return null;
        }
        return new ClassId(this.f66143a, fqNameM91940d, this.f66145c);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassId)) {
            return false;
        }
        ClassId classId = (ClassId) obj;
        return Intrinsics.m88377d(this.f66143a, classId.f66143a) && Intrinsics.m88377d(this.f66144b, classId.f66144b) && this.f66145c == classId.f66145c;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final FqName m91929f() {
        return this.f66143a;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final FqName m91930g() {
        return this.f66144b;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final Name m91931h() {
        return this.f66144b.m91942f();
    }

    public int hashCode() {
        return (((this.f66143a.hashCode() * 31) + this.f66144b.hashCode()) * 31) + Boolean.hashCode(this.f66145c);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m91932i() {
        return this.f66145c;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m91933j() {
        return !this.f66144b.m91940d().m91939c();
    }

    @NotNull
    public String toString() {
        if (!this.f66143a.m91939c()) {
            return m91926b();
        }
        return "/" + m91926b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClassId(@NotNull FqName fqName, @NotNull Name name) {
        this(fqName, FqName.Companion.m91946a(name), false);
        fqName.getClass();
        name.getClass();
    }
}
