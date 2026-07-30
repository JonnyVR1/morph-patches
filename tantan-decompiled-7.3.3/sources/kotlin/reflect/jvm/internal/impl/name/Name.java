package kotlin.reflect.jvm.internal.impl.name;

import com.facebook.AuthenticationTokenClaims;
import org.jetbrains.annotations.NotNull;
import p153l.wg3;
import p153l.xtq0;

/* JADX INFO: loaded from: classes2.dex */
public final class Name implements Comparable<Name> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f66156a;

    /* JADX INFO: renamed from: b */
    public final boolean f66157b;

    public Name(@NotNull String str, boolean z) {
        if (str == null) {
            m91968a(0);
        }
        this.f66156a = str;
        this.f66157b = z;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m91968a(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4) ? 2 : 3];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = AuthenticationTokenClaims.JSON_KEY_NAME;
        }
        if (i == 1) {
            objArr[1] = "asString";
        } else if (i == 2) {
            objArr[1] = "getIdentifier";
        } else if (i == 3 || i == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "identifierIfValid";
                break;
            case 8:
                objArr[2] = "special";
                break;
            case 9:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static Name m91969h(@NotNull String str) {
        if (str == null) {
            m91968a(9);
        }
        return str.startsWith("<") ? m91972n(str) : m91970i(str);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static Name m91970i(@NotNull String str) {
        if (str == null) {
            m91968a(5);
        }
        return new Name(str, false);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m91971m(@NotNull String str) {
        if (str == null) {
            m91968a(6);
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '.' || cCharAt == '/' || cCharAt == '\\') {
                return false;
            }
        }
        return true;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public static Name m91972n(@NotNull String str) {
        if (str == null) {
            m91968a(8);
        }
        if (str.startsWith("<")) {
            return new Name(str, true);
        }
        wg3.m206174a("special name must start with '<': ".concat(str));
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public String m91973b() {
        String str = this.f66156a;
        if (str == null) {
            m91968a(1);
        }
        return str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Name)) {
            return false;
        }
        Name name = (Name) obj;
        return this.f66157b == name.f66157b && this.f66156a.equals(name.f66156a);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(Name name) {
        return this.f66156a.compareTo(name.f66156a);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public String m91975g() {
        if (this.f66157b) {
            xtq0.m213103a("not identifier: ", this);
            return null;
        }
        String strM91973b = m91973b();
        if (strM91973b == null) {
            m91968a(2);
        }
        return strM91973b;
    }

    public int hashCode() {
        return (this.f66156a.hashCode() * 31) + (this.f66157b ? 1 : 0);
    }

    /* JADX INFO: renamed from: j */
    public boolean m91976j() {
        return this.f66157b;
    }

    public String toString() {
        return this.f66156a;
    }
}
