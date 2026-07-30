package p153l;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class v7s0 {

    /* JADX INFO: renamed from: a */
    public final int f182800a;

    /* JADX INFO: renamed from: b */
    public final int f182801b;

    /* JADX INFO: renamed from: c */
    public final int f182802c;

    /* JADX INFO: renamed from: d */
    public final boolean f182803d;

    /* JADX INFO: renamed from: e */
    public final k8s0 f182804e;

    /* JADX INFO: renamed from: f */
    public final mas0 f182805f;

    /* JADX INFO: renamed from: n */
    public int f182813n;

    /* JADX INFO: renamed from: g */
    public final Object f182806g = new Object();

    /* JADX INFO: renamed from: h */
    public final ArrayList f182807h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public final ArrayList f182808i = new ArrayList();

    /* JADX INFO: renamed from: j */
    public final ArrayList f182809j = new ArrayList();

    /* JADX INFO: renamed from: k */
    public int f182810k = 0;

    /* JADX INFO: renamed from: l */
    public int f182811l = 0;

    /* JADX INFO: renamed from: m */
    public int f182812m = 0;

    /* JADX INFO: renamed from: o */
    public String f182814o = "";

    /* JADX INFO: renamed from: p */
    public String f182815p = "";

    /* JADX INFO: renamed from: q */
    public String f182816q = "";

    public v7s0(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.f182800a = i;
        this.f182801b = i2;
        this.f182802c = i3;
        this.f182803d = z;
        this.f182804e = new k8s0(i4);
        this.f182805f = new mas0(i5, i6, i7);
    }

    /* JADX INFO: renamed from: q */
    public static final String m200256q(ArrayList arrayList, int i) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            sb.append((String) arrayList.get(i2));
            sb.append(' ');
            i2++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String string = sb.toString();
        return string.length() < 100 ? string : string.substring(0, 100);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: a */
    public final int m200257a(int i, int i2) {
        return this.f182803d ? this.f182801b : (i * this.f182800a) + (i2 * this.f182801b);
    }

    /* JADX INFO: renamed from: b */
    public final int m200258b() {
        return this.f182813n;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: c */
    public final int m200259c() {
        return this.f182810k;
    }

    /* JADX INFO: renamed from: d */
    public final String m200260d() {
        return this.f182814o;
    }

    /* JADX INFO: renamed from: e */
    public final String m200261e() {
        return this.f182815p;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v7s0)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((v7s0) obj).f182814o;
        return str != null && str.equals(this.f182814o);
    }

    /* JADX INFO: renamed from: f */
    public final String m200262f() {
        return this.f182816q;
    }

    /* JADX INFO: renamed from: g */
    public final void m200263g() {
        synchronized (this.f182806g) {
            this.f182812m--;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m200264h() {
        synchronized (this.f182806g) {
            this.f182812m++;
        }
    }

    public final int hashCode() {
        return this.f182814o.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final void m200265i() {
        synchronized (this.f182806g) {
            this.f182813n -= 100;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m200266j(int i) {
        this.f182811l = i;
    }

    /* JADX INFO: renamed from: k */
    public final void m200267k(String str, boolean z, float f, float f2, float f3, float f4) {
        m200272p(str, z, f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: l */
    public final void m200268l(String str, boolean z, float f, float f2, float f3, float f4) {
        m200272p(str, z, f, f2, f3, f4);
        synchronized (this.f182806g) {
            try {
                if (this.f182812m < 0) {
                    dct0.m115293b("ActivityContent: negative number of WebViews.");
                }
                m200269m();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m200269m() {
        synchronized (this.f182806g) {
            try {
                int iM200257a = m200257a(this.f182810k, this.f182811l);
                if (iM200257a > this.f182813n) {
                    this.f182813n = iM200257a;
                    if (!bxy0.m106933q().m120264i().zzN()) {
                        this.f182814o = this.f182804e.m148747a(this.f182807h);
                        this.f182815p = this.f182804e.m148747a(this.f182808i);
                    }
                    if (!bxy0.m106933q().m120264i().zzO()) {
                        this.f182816q = this.f182805f.m157749a(this.f182808i, this.f182809j);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m200270n() {
        synchronized (this.f182806g) {
            try {
                int iM200257a = m200257a(this.f182810k, this.f182811l);
                if (iM200257a > this.f182813n) {
                    this.f182813n = iM200257a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m200271o() {
        boolean z;
        synchronized (this.f182806g) {
            z = this.f182812m == 0;
        }
        return z;
    }

    /* JADX INFO: renamed from: p */
    public final void m200272p(@Nullable String str, boolean z, float f, float f2, float f3, float f4) {
        if (str != null) {
            if (str.length() < this.f182802c) {
                return;
            }
            synchronized (this.f182806g) {
                try {
                    this.f182807h.add(str);
                    this.f182810k += str.length();
                    if (z) {
                        this.f182808i.add(str);
                        this.f182809j.add(new g8s0(f, f2, f3, f4, this.f182808i.size() - 1));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = this.f182807h;
        return "ActivityContent fetchId: " + this.f182811l + " score:" + this.f182813n + " total_length:" + this.f182810k + "\n text: " + m200256q(arrayList, 100) + "\n viewableText" + m200256q(this.f182808i, 100) + "\n signture: " + this.f182814o + "\n viewableSignture: " + this.f182815p + "\n viewableSignatureForVertical: " + this.f182816q;
    }
}
