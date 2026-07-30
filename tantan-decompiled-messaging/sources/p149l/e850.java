package p149l;

import com.google.android.exoplayer2.ParserException;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class e850 {

    /* JADX INFO: renamed from: a */
    public int f89794a;

    /* JADX INFO: renamed from: b */
    public int f89795b;

    /* JADX INFO: renamed from: c */
    public long f89796c;

    /* JADX INFO: renamed from: d */
    public long f89797d;

    /* JADX INFO: renamed from: e */
    public long f89798e;

    /* JADX INFO: renamed from: f */
    public long f89799f;

    /* JADX INFO: renamed from: g */
    public int f89800g;

    /* JADX INFO: renamed from: h */
    public int f89801h;

    /* JADX INFO: renamed from: i */
    public int f89802i;

    /* JADX INFO: renamed from: j */
    public final int[] f89803j = new int[255];

    /* JADX INFO: renamed from: k */
    public final d860 f89804k = new d860(255);

    /* JADX INFO: renamed from: a */
    public boolean m115239a(tqf tqfVar, boolean z) throws IOException {
        m115240b();
        this.f89804k.m110288Q(27);
        if (!vqf.m199483b(tqfVar, this.f89804k.m110299e(), 0, 27, z) || this.f89804k.m110281J() != 1332176723) {
            return false;
        }
        int iM110279H = this.f89804k.m110279H();
        this.f89794a = iM110279H;
        if (iM110279H != 0) {
            if (z) {
                return false;
            }
            throw ParserException.createForUnsupportedContainerFeature("unsupported bit stream revision");
        }
        this.f89795b = this.f89804k.m110279H();
        this.f89796c = this.f89804k.m110316v();
        this.f89797d = this.f89804k.m110318x();
        this.f89798e = this.f89804k.m110318x();
        this.f89799f = this.f89804k.m110318x();
        int iM110279H2 = this.f89804k.m110279H();
        this.f89800g = iM110279H2;
        this.f89801h = iM110279H2 + 27;
        this.f89804k.m110288Q(iM110279H2);
        if (!vqf.m199483b(tqfVar, this.f89804k.m110299e(), 0, this.f89800g, z)) {
            return false;
        }
        for (int i = 0; i < this.f89800g; i++) {
            this.f89803j[i] = this.f89804k.m110279H();
            this.f89802i += this.f89803j[i];
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m115240b() {
        this.f89794a = 0;
        this.f89795b = 0;
        this.f89796c = 0L;
        this.f89797d = 0L;
        this.f89798e = 0L;
        this.f89799f = 0L;
        this.f89800g = 0;
        this.f89801h = 0;
        this.f89802i = 0;
    }

    /* JADX INFO: renamed from: c */
    public boolean m115241c(tqf tqfVar) throws IOException {
        return m115242d(tqfVar, -1L);
    }

    /* JADX INFO: renamed from: d */
    public boolean m115242d(tqf tqfVar, long j) throws IOException {
        p11.m167007a(tqfVar.getPosition() == tqfVar.mo150659k());
        this.f89804k.m110288Q(4);
        while (true) {
            if ((j != -1 && tqfVar.getPosition() + 4 >= j) || !vqf.m199483b(tqfVar, this.f89804k.m110299e(), 0, 4, true)) {
                break;
            }
            this.f89804k.m110292U(0);
            if (this.f89804k.m110281J() == 1332176723) {
                tqfVar.mo150657h();
                return true;
            }
            tqfVar.mo150661o(1);
        }
        do {
            if (j != -1 && tqfVar.getPosition() >= j) {
                break;
            }
        } while (tqfVar.skip(1) != -1);
        return false;
    }
}
