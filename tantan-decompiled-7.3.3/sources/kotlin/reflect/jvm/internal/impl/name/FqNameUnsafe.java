package kotlin.reflect.jvm.internal.impl.name;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class FqNameUnsafe {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Name f66149e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Pattern f66150f;

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f66151a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public transient FqName f66152b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public transient FqNameUnsafe f66153c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public transient Name f66154d;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final FqNameUnsafe m91960a(@NotNull Name name) {
            name.getClass();
            String strM91973b = name.m91973b();
            strM91973b.getClass();
            return new FqNameUnsafe(strM91973b, FqName.f66146c.m91945i(), name, null);
        }

        private Companion() {
        }
    }

    static {
        Name nameM91972n = Name.m91972n("<root>");
        nameM91972n.getClass();
        f66149e = nameM91972n;
        Pattern patternCompile = Pattern.compile("\\.");
        patternCompile.getClass();
        f66150f = patternCompile;
    }

    public FqNameUnsafe(@NotNull String str, @NotNull FqName fqName) {
        str.getClass();
        fqName.getClass();
        this.f66151a = str;
        this.f66152b = fqName;
    }

    /* JADX INFO: renamed from: i */
    public static final List<Name> m91947i(FqNameUnsafe fqNameUnsafe) {
        if (fqNameUnsafe.m91952e()) {
            return new ArrayList();
        }
        List<Name> listM91947i = m91947i(fqNameUnsafe.m91954g());
        listM91947i.add(fqNameUnsafe.m91956j());
        return listM91947i;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m91948a() {
        return this.f66151a;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final FqNameUnsafe m91949b(@NotNull Name name) {
        String strM91973b;
        name.getClass();
        if (m91952e()) {
            strM91973b = name.m91973b();
        } else {
            strM91973b = this.f66151a + '.' + name.m91973b();
        }
        strM91973b.getClass();
        return new FqNameUnsafe(strM91973b, this, name);
    }

    /* JADX INFO: renamed from: c */
    public final void m91950c() {
        int iM91951d = m91951d(this.f66151a);
        String str = this.f66151a;
        if (iM91951d >= 0) {
            this.f66154d = Name.m91969h(str.substring(iM91951d + 1));
            this.f66153c = new FqNameUnsafe(this.f66151a.substring(0, iM91951d));
        } else {
            this.f66154d = Name.m91969h(str);
            this.f66153c = FqName.f66146c.m91945i();
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m91951d(String str) {
        int length = str.length() - 1;
        boolean z = false;
        while (length >= 0) {
            char cCharAt = str.charAt(length);
            if (cCharAt == '.' && !z) {
                return length;
            }
            if (cCharAt == '`') {
                z = !z;
            } else if (cCharAt == '\\') {
                length--;
            }
            length--;
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m91952e() {
        return this.f66151a.length() == 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FqNameUnsafe) && Intrinsics.m88377d(this.f66151a, ((FqNameUnsafe) obj).f66151a);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m91953f() {
        return this.f66152b != null || StringsKt.m94326b0(m91948a(), '<', 0, false, 6, null) < 0;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final FqNameUnsafe m91954g() {
        FqNameUnsafe fqNameUnsafe = this.f66153c;
        if (fqNameUnsafe != null) {
            return fqNameUnsafe;
        }
        if (m91952e()) {
            wtq0.m207906a("root");
            return null;
        }
        m91950c();
        FqNameUnsafe fqNameUnsafe2 = this.f66153c;
        fqNameUnsafe2.getClass();
        return fqNameUnsafe2;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final List<Name> m91955h() {
        return m91947i(this);
    }

    public int hashCode() {
        return this.f66151a.hashCode();
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final Name m91956j() {
        Name name = this.f66154d;
        if (name != null) {
            return name;
        }
        if (m91952e()) {
            wtq0.m207906a("root");
            return null;
        }
        m91950c();
        Name name2 = this.f66154d;
        name2.getClass();
        return name2;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final Name m91957k() {
        return m91952e() ? f66149e : m91956j();
    }

    /* JADX INFO: renamed from: l */
    public final boolean m91958l(@NotNull Name name) {
        name.getClass();
        if (m91952e()) {
            return false;
        }
        int iB0 = StringsKt.m94326b0(this.f66151a, '.', 0, false, 6, null);
        if (iB0 == -1) {
            iB0 = this.f66151a.length();
        }
        int i = iB0;
        String strM91973b = name.m91973b();
        strM91973b.getClass();
        return i == strM91973b.length() && C15493d.m94365A(this.f66151a, 0, strM91973b, 0, i, false, 16, null);
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final FqName m91959m() {
        FqName fqName = this.f66152b;
        if (fqName != null) {
            return fqName;
        }
        FqName fqName2 = new FqName(this);
        this.f66152b = fqName2;
        return fqName2;
    }

    @NotNull
    public String toString() {
        if (!m91952e()) {
            return this.f66151a;
        }
        String strM91973b = f66149e.m91973b();
        strM91973b.getClass();
        return strM91973b;
    }

    public /* synthetic */ FqNameUnsafe(String str, FqNameUnsafe fqNameUnsafe, Name name, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, fqNameUnsafe, name);
    }

    public FqNameUnsafe(@NotNull String str) {
        str.getClass();
        this.f66151a = str;
    }

    public FqNameUnsafe(String str, FqNameUnsafe fqNameUnsafe, Name name) {
        this.f66151a = str;
        this.f66153c = fqNameUnsafe;
        this.f66154d = name;
    }
}
