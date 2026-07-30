package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class ipx {

    /* JADX INFO: renamed from: a */
    public final Object f114355a;

    /* JADX INFO: renamed from: b */
    public final int f114356b;

    /* JADX INFO: renamed from: c */
    public final int f114357c;

    /* JADX INFO: renamed from: d */
    public final long f114358d;

    /* JADX INFO: renamed from: e */
    public final int f114359e;

    public ipx(ipx ipxVar) {
        this.f114355a = ipxVar.f114355a;
        this.f114356b = ipxVar.f114356b;
        this.f114357c = ipxVar.f114357c;
        this.f114358d = ipxVar.f114358d;
        this.f114359e = ipxVar.f114359e;
    }

    /* JADX INFO: renamed from: a */
    public ipx m137606a(Object obj) {
        return this.f114355a.equals(obj) ? this : new ipx(obj, this.f114356b, this.f114357c, this.f114358d, this.f114359e);
    }

    /* JADX INFO: renamed from: b */
    public boolean m137607b() {
        return this.f114356b != -1;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ipx)) {
            return false;
        }
        ipx ipxVar = (ipx) obj;
        return this.f114355a.equals(ipxVar.f114355a) && this.f114356b == ipxVar.f114356b && this.f114357c == ipxVar.f114357c && this.f114358d == ipxVar.f114358d && this.f114359e == ipxVar.f114359e;
    }

    public int hashCode() {
        return ((((((((527 + this.f114355a.hashCode()) * 31) + this.f114356b) * 31) + this.f114357c) * 31) + ((int) this.f114358d)) * 31) + this.f114359e;
    }

    public ipx(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public ipx(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public ipx(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    public ipx(Object obj) {
        this(obj, -1L);
    }

    public ipx(Object obj, int i, int i2, long j, int i3) {
        this.f114355a = obj;
        this.f114356b = i;
        this.f114357c = i2;
        this.f114358d = j;
        this.f114359e = i3;
    }
}
