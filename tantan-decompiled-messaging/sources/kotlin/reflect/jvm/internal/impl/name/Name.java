package kotlin.reflect.jvm.internal.impl.name;

import com.facebook.AuthenticationTokenClaims;
import org.jetbrains.annotations.NotNull;
import p149l.ig3;
import p149l.rkq0;

/* JADX INFO: loaded from: classes2.dex */
public final class Name implements Comparable<Name> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final String f65482a;

    /* JADX INFO: renamed from: b */
    public final boolean f65483b;

    public Name(@NotNull String str, boolean z) {
        if (str == null) {
            m91077a(0);
        }
        this.f65482a = str;
        this.f65483b = z;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m91077a(int i) {
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
    public static Name m91078h(@NotNull String str) {
        if (str == null) {
            m91077a(9);
        }
        return str.startsWith("<") ? m91081n(str) : m91079i(str);
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static Name m91079i(@NotNull String str) {
        if (str == null) {
            m91077a(5);
        }
        return new Name(str, false);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m91080m(@NotNull String str) {
        if (str == null) {
            m91077a(6);
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
    public static Name m91081n(@NotNull String str) {
        if (str == null) {
            m91077a(8);
        }
        if (str.startsWith("<")) {
            return new Name(str, true);
        }
        ig3.m135964a("special name must start with '<': ".concat(str));
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public String m91082b() {
        String str = this.f65482a;
        if (str == null) {
            m91077a(1);
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
        return this.f65483b == name.f65483b && this.f65482a.equals(name.f65482a);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(Name name) {
        return this.f65482a.compareTo(name.f65482a);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public String m91084g() {
        if (this.f65483b) {
            rkq0.m179764a("not identifier: ", this);
            return null;
        }
        String strM91082b = m91082b();
        if (strM91082b == null) {
            m91077a(2);
        }
        return strM91082b;
    }

    public int hashCode() {
        return (this.f65482a.hashCode() * 31) + (this.f65483b ? 1 : 0);
    }

    /* JADX INFO: renamed from: j */
    public boolean m91085j() {
        return this.f65483b;
    }

    public String toString() {
        return this.f65482a;
    }
}
