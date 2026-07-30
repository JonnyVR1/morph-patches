package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class nid {

    /* JADX INFO: renamed from: a */
    public final String f142112a;

    /* JADX INFO: renamed from: b */
    public final C1894k f142113b;

    /* JADX INFO: renamed from: c */
    public final C1894k f142114c;

    /* JADX INFO: renamed from: d */
    public final int f142115d;

    /* JADX INFO: renamed from: e */
    public final int f142116e;

    public nid(String str, C1894k c1894k, C1894k c1894k2, int i, int i2) {
        w11.m204365a(i == 0 || i2 == 0);
        this.f142112a = w11.m204368d(str);
        this.f142113b = (C1894k) w11.m204369e(c1894k);
        this.f142114c = (C1894k) w11.m204369e(c1894k2);
        this.f142115d = i;
        this.f142116e = i2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nid.class == obj.getClass()) {
            nid nidVar = (nid) obj;
            if (this.f142115d == nidVar.f142115d && this.f142116e == nidVar.f142116e && this.f142112a.equals(nidVar.f142112a) && this.f142113b.equals(nidVar.f142113b) && this.f142114c.equals(nidVar.f142114c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f142115d) * 31) + this.f142116e) * 31) + this.f142112a.hashCode()) * 31) + this.f142113b.hashCode()) * 31) + this.f142114c.hashCode();
    }
}
