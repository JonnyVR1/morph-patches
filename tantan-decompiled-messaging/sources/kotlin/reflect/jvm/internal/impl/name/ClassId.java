package kotlin.reflect.jvm.internal.impl.name;

import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15386d;
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
    public final FqName f65469a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final FqName f65470b;

    /* JADX INFO: renamed from: c */
    public final boolean f65471c;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ ClassId m91043b(Companion companion, String str, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.m91044a(str, z);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        /* JADX INFO: renamed from: a */
        public final ClassId m91044a(@NotNull String str, boolean z) {
            String strM93478E;
            String strM93479F;
            str.getClass();
            int iB0 = StringsKt.m93435b0(str, '`', 0, false, 6, null);
            if (iB0 == -1) {
                iB0 = str.length();
            }
            int iJ0 = StringsKt.m93443j0(str, "/", iB0, false, 4, null);
            if (iJ0 == -1) {
                strM93479F = C15386d.m93479F(str, "`", "", false, 4, null);
                strM93478E = "";
            } else {
                strM93478E = C15386d.m93478E(str.substring(0, iJ0), '/', '.', false, 4, null);
                strM93479F = C15386d.m93479F(str.substring(iJ0 + 1), "`", "", false, 4, null);
            }
            return new ClassId(new FqName(strM93478E), new FqName(strM93479F), z);
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: c */
        public final ClassId m91045c(@NotNull FqName fqName) {
            fqName.getClass();
            return new ClassId(fqName.m91049d(), fqName.m91051f());
        }

        private Companion() {
        }
    }

    public ClassId(@NotNull FqName fqName, @NotNull FqName fqName2, boolean z) {
        fqName.getClass();
        fqName2.getClass();
        this.f65469a = fqName;
        this.f65470b = fqName2;
        this.f65471c = z;
        fqName2.m91048c();
    }

    /* JADX INFO: renamed from: c */
    public static final String m91032c(FqName fqName) {
        String strM91046a = fqName.m91046a();
        if (!StringsKt.m93410O(strM91046a, '/', false, 2, null)) {
            return strM91046a;
        }
        return "`" + strM91046a + '`';
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: k */
    public static final ClassId m91033k(@NotNull FqName fqName) {
        return Companion.m91045c(fqName);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final FqName m91034a() {
        if (this.f65469a.m91048c()) {
            return this.f65470b;
        }
        return new FqName(this.f65469a.m91046a() + '.' + this.f65470b.m91046a());
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m91035b() {
        if (this.f65469a.m91048c()) {
            return m91032c(this.f65470b);
        }
        return C15386d.m93478E(this.f65469a.m91046a(), '.', '/', false, 4, null) + "/" + m91032c(this.f65470b);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final ClassId m91036d(@NotNull Name name) {
        name.getClass();
        return new ClassId(this.f65469a, this.f65470b.m91047b(name), this.f65471c);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final ClassId m91037e() {
        FqName fqNameM91049d = this.f65470b.m91049d();
        if (fqNameM91049d.m91048c()) {
            return null;
        }
        return new ClassId(this.f65469a, fqNameM91049d, this.f65471c);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassId)) {
            return false;
        }
        ClassId classId = (ClassId) obj;
        return Intrinsics.m87488d(this.f65469a, classId.f65469a) && Intrinsics.m87488d(this.f65470b, classId.f65470b) && this.f65471c == classId.f65471c;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final FqName m91038f() {
        return this.f65469a;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final FqName m91039g() {
        return this.f65470b;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final Name m91040h() {
        return this.f65470b.m91051f();
    }

    public int hashCode() {
        return (((this.f65469a.hashCode() * 31) + this.f65470b.hashCode()) * 31) + Boolean.hashCode(this.f65471c);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m91041i() {
        return this.f65471c;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m91042j() {
        return !this.f65470b.m91049d().m91048c();
    }

    @NotNull
    public String toString() {
        if (!this.f65469a.m91048c()) {
            return m91035b();
        }
        return "/" + m91035b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClassId(@NotNull FqName fqName, @NotNull Name name) {
        this(fqName, FqName.Companion.m91055a(name), false);
        fqName.getClass();
        name.getClass();
    }
}
