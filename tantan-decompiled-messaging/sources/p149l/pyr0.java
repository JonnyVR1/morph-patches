package p149l;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class pyr0 {

    /* JADX INFO: renamed from: a */
    public final int f151874a;

    /* JADX INFO: renamed from: b */
    public final int f151875b;

    /* JADX INFO: renamed from: c */
    public final int f151876c;

    /* JADX INFO: renamed from: d */
    public final boolean f151877d;

    /* JADX INFO: renamed from: e */
    public final ezr0 f151878e;

    /* JADX INFO: renamed from: f */
    public final g1s0 f151879f;

    /* JADX INFO: renamed from: n */
    public int f151887n;

    /* JADX INFO: renamed from: g */
    public final Object f151880g = new Object();

    /* JADX INFO: renamed from: h */
    public final ArrayList f151881h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public final ArrayList f151882i = new ArrayList();

    /* JADX INFO: renamed from: j */
    public final ArrayList f151883j = new ArrayList();

    /* JADX INFO: renamed from: k */
    public int f151884k = 0;

    /* JADX INFO: renamed from: l */
    public int f151885l = 0;

    /* JADX INFO: renamed from: m */
    public int f151886m = 0;

    /* JADX INFO: renamed from: o */
    public String f151888o = "";

    /* JADX INFO: renamed from: p */
    public String f151889p = "";

    /* JADX INFO: renamed from: q */
    public String f151890q = "";

    public pyr0(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.f151874a = i;
        this.f151875b = i2;
        this.f151876c = i3;
        this.f151877d = z;
        this.f151878e = new ezr0(i4);
        this.f151879f = new g1s0(i5, i6, i7);
    }

    /* JADX INFO: renamed from: q */
    public static final String m172148q(ArrayList arrayList, int i) {
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
    public final int m172149a(int i, int i2) {
        return this.f151877d ? this.f151875b : (i * this.f151874a) + (i2 * this.f151875b);
    }

    /* JADX INFO: renamed from: b */
    public final int m172150b() {
        return this.f151887n;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: c */
    public final int m172151c() {
        return this.f151884k;
    }

    /* JADX INFO: renamed from: d */
    public final String m172152d() {
        return this.f151888o;
    }

    /* JADX INFO: renamed from: e */
    public final String m172153e() {
        return this.f151889p;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pyr0)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((pyr0) obj).f151888o;
        return str != null && str.equals(this.f151888o);
    }

    /* JADX INFO: renamed from: f */
    public final String m172154f() {
        return this.f151890q;
    }

    /* JADX INFO: renamed from: g */
    public final void m172155g() {
        synchronized (this.f151880g) {
            this.f151886m--;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m172156h() {
        synchronized (this.f151880g) {
            this.f151886m++;
        }
    }

    public final int hashCode() {
        return this.f151888o.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final void m172157i() {
        synchronized (this.f151880g) {
            this.f151887n -= 100;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m172158j(int i) {
        this.f151885l = i;
    }

    /* JADX INFO: renamed from: k */
    public final void m172159k(String str, boolean z, float f, float f2, float f3, float f4) {
        m172164p(str, z, f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: l */
    public final void m172160l(String str, boolean z, float f, float f2, float f3, float f4) {
        m172164p(str, z, f, f2, f3, f4);
        synchronized (this.f151880g) {
            try {
                if (this.f151886m < 0) {
                    x2t0.m206864b("ActivityContent: negative number of WebViews.");
                }
                m172161m();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m172161m() {
        synchronized (this.f151880g) {
            try {
                int iM172149a = m172149a(this.f151884k, this.f151885l);
                if (iM172149a > this.f151887n) {
                    this.f151887n = iM172149a;
                    if (!vny0.m199079q().m212279i().zzN()) {
                        this.f151888o = this.f151878e.m119010a(this.f151881h);
                        this.f151889p = this.f151878e.m119010a(this.f151882i);
                    }
                    if (!vny0.m199079q().m212279i().zzO()) {
                        this.f151890q = this.f151879f.m124087a(this.f151882i, this.f151883j);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m172162n() {
        synchronized (this.f151880g) {
            try {
                int iM172149a = m172149a(this.f151884k, this.f151885l);
                if (iM172149a > this.f151887n) {
                    this.f151887n = iM172149a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m172163o() {
        boolean z;
        synchronized (this.f151880g) {
            z = this.f151886m == 0;
        }
        return z;
    }

    /* JADX INFO: renamed from: p */
    public final void m172164p(@Nullable String str, boolean z, float f, float f2, float f3, float f4) {
        if (str != null) {
            if (str.length() < this.f151876c) {
                return;
            }
            synchronized (this.f151880g) {
                try {
                    this.f151881h.add(str);
                    this.f151884k += str.length();
                    if (z) {
                        this.f151882i.add(str);
                        this.f151883j.add(new azr0(f, f2, f3, f4, this.f151882i.size() - 1));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = this.f151881h;
        return "ActivityContent fetchId: " + this.f151885l + " score:" + this.f151887n + " total_length:" + this.f151884k + "\n text: " + m172148q(arrayList, 100) + "\n viewableText" + m172148q(this.f151882i, 100) + "\n signture: " + this.f151888o + "\n viewableSignture: " + this.f151889p + "\n viewableSignatureForVertical: " + this.f151890q;
    }
}
