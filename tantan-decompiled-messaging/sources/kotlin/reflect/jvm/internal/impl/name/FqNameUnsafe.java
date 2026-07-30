package kotlin.reflect.jvm.internal.impl.name;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15386d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.qkq0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class FqNameUnsafe {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Name f65475e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Pattern f65476f;

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f65477a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public transient FqName f65478b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public transient FqNameUnsafe f65479c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public transient Name f65480d;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final FqNameUnsafe m91069a(@NotNull Name name) {
            name.getClass();
            String strM91082b = name.m91082b();
            strM91082b.getClass();
            return new FqNameUnsafe(strM91082b, FqName.f65472c.m91054i(), name, null);
        }

        private Companion() {
        }
    }

    static {
        Name nameM91081n = Name.m91081n("<root>");
        nameM91081n.getClass();
        f65475e = nameM91081n;
        Pattern patternCompile = Pattern.compile("\\.");
        patternCompile.getClass();
        f65476f = patternCompile;
    }

    public FqNameUnsafe(@NotNull String str, @NotNull FqName fqName) {
        str.getClass();
        fqName.getClass();
        this.f65477a = str;
        this.f65478b = fqName;
    }

    /* JADX INFO: renamed from: i */
    public static final List<Name> m91056i(FqNameUnsafe fqNameUnsafe) {
        if (fqNameUnsafe.m91061e()) {
            return new ArrayList();
        }
        List<Name> listM91056i = m91056i(fqNameUnsafe.m91063g());
        listM91056i.add(fqNameUnsafe.m91065j());
        return listM91056i;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m91057a() {
        return this.f65477a;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final FqNameUnsafe m91058b(@NotNull Name name) {
        String strM91082b;
        name.getClass();
        if (m91061e()) {
            strM91082b = name.m91082b();
        } else {
            strM91082b = this.f65477a + '.' + name.m91082b();
        }
        strM91082b.getClass();
        return new FqNameUnsafe(strM91082b, this, name);
    }

    /* JADX INFO: renamed from: c */
    public final void m91059c() {
        int iM91060d = m91060d(this.f65477a);
        String str = this.f65477a;
        if (iM91060d >= 0) {
            this.f65480d = Name.m91078h(str.substring(iM91060d + 1));
            this.f65479c = new FqNameUnsafe(this.f65477a.substring(0, iM91060d));
        } else {
            this.f65480d = Name.m91078h(str);
            this.f65479c = FqName.f65472c.m91054i();
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m91060d(String str) {
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
    public final boolean m91061e() {
        return this.f65477a.length() == 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FqNameUnsafe) && Intrinsics.m87488d(this.f65477a, ((FqNameUnsafe) obj).f65477a);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m91062f() {
        return this.f65478b != null || StringsKt.m93435b0(m91057a(), '<', 0, false, 6, null) < 0;
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final FqNameUnsafe m91063g() {
        FqNameUnsafe fqNameUnsafe = this.f65479c;
        if (fqNameUnsafe != null) {
            return fqNameUnsafe;
        }
        if (m91061e()) {
            qkq0.m175383a("root");
            return null;
        }
        m91059c();
        FqNameUnsafe fqNameUnsafe2 = this.f65479c;
        fqNameUnsafe2.getClass();
        return fqNameUnsafe2;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final List<Name> m91064h() {
        return m91056i(this);
    }

    public int hashCode() {
        return this.f65477a.hashCode();
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final Name m91065j() {
        Name name = this.f65480d;
        if (name != null) {
            return name;
        }
        if (m91061e()) {
            qkq0.m175383a("root");
            return null;
        }
        m91059c();
        Name name2 = this.f65480d;
        name2.getClass();
        return name2;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final Name m91066k() {
        return m91061e() ? f65475e : m91065j();
    }

    /* JADX INFO: renamed from: l */
    public final boolean m91067l(@NotNull Name name) {
        name.getClass();
        if (m91061e()) {
            return false;
        }
        int iB0 = StringsKt.m93435b0(this.f65477a, '.', 0, false, 6, null);
        if (iB0 == -1) {
            iB0 = this.f65477a.length();
        }
        int i = iB0;
        String strM91082b = name.m91082b();
        strM91082b.getClass();
        return i == strM91082b.length() && C15386d.m93474A(this.f65477a, 0, strM91082b, 0, i, false, 16, null);
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final FqName m91068m() {
        FqName fqName = this.f65478b;
        if (fqName != null) {
            return fqName;
        }
        FqName fqName2 = new FqName(this);
        this.f65478b = fqName2;
        return fqName2;
    }

    @NotNull
    public String toString() {
        if (!m91061e()) {
            return this.f65477a;
        }
        String strM91082b = f65475e.m91082b();
        strM91082b.getClass();
        return strM91082b;
    }

    public /* synthetic */ FqNameUnsafe(String str, FqNameUnsafe fqNameUnsafe, Name name, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, fqNameUnsafe, name);
    }

    public FqNameUnsafe(@NotNull String str) {
        str.getClass();
        this.f65477a = str;
    }

    public FqNameUnsafe(String str, FqNameUnsafe fqNameUnsafe, Name name) {
        this.f65477a = str;
        this.f65479c = fqNameUnsafe;
        this.f65480d = name;
    }
}
