package p149l;

import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class v4f implements vod0 {

    /* JADX INFO: renamed from: a */
    public final C1871k f179911a;

    /* JADX INFO: renamed from: c */
    public long[] f179913c;

    /* JADX INFO: renamed from: d */
    public boolean f179914d;

    /* JADX INFO: renamed from: e */
    public w4f f179915e;

    /* JADX INFO: renamed from: f */
    public boolean f179916f;

    /* JADX INFO: renamed from: g */
    public int f179917g;

    /* JADX INFO: renamed from: b */
    public final z3f f179912b = new z3f();

    /* JADX INFO: renamed from: h */
    public long f179918h = -9223372036854775807L;

    public v4f(w4f w4fVar, C1871k c1871k, boolean z) {
        this.f179911a = c1871k;
        this.f179915e = w4fVar;
        this.f179913c = w4fVar.f184554b;
        m196964e(w4fVar, z);
    }

    @Override // p149l.vod0
    /* JADX INFO: renamed from: b */
    public boolean mo10940b() {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public String m196962c() {
        return this.f179915e.m201480a();
    }

    /* JADX INFO: renamed from: d */
    public void m196963d(long j) {
        int iM197851e = vck0.m197851e(this.f179913c, j, true, false);
        this.f179917g = iM197851e;
        if (!this.f179914d || iM197851e != this.f179913c.length) {
            j = -9223372036854775807L;
        }
        this.f179918h = j;
    }

    /* JADX INFO: renamed from: e */
    public void m196964e(w4f w4fVar, boolean z) {
        int i = this.f179917g;
        long j = i == 0 ? -9223372036854775807L : this.f179913c[i - 1];
        this.f179914d = z;
        this.f179915e = w4fVar;
        long[] jArr = w4fVar.f184554b;
        this.f179913c = jArr;
        long j2 = this.f179918h;
        if (j2 != -9223372036854775807L) {
            m196963d(j2);
        } else if (j != -9223372036854775807L) {
            this.f179917g = vck0.m197851e(jArr, j, false, false);
        }
    }

    @Override // p149l.vod0
    /* JADX INFO: renamed from: k */
    public int mo10942k(long j) {
        int iMax = Math.max(this.f179917g, vck0.m197851e(this.f179913c, j, true, false));
        int i = iMax - this.f179917g;
        this.f179917g = iMax;
        return i;
    }

    @Override // p149l.vod0
    /* JADX INFO: renamed from: l */
    public int mo10943l(uyi uyiVar, DecoderInputBuffer decoderInputBuffer, int i) {
        int i2 = this.f179917g;
        boolean z = i2 == this.f179913c.length;
        if (z && !this.f179914d) {
            decoderInputBuffer.m154499t(4);
            return -4;
        }
        if ((i & 2) != 0 || !this.f179916f) {
            uyiVar.f178866b = this.f179911a;
            this.f179916f = true;
            return -5;
        }
        if (z) {
            return -3;
        }
        if ((i & 1) == 0) {
            this.f179917g = i2 + 1;
        }
        if ((i & 4) == 0) {
            byte[] bArrM217031a = this.f179912b.m217031a(this.f179915e.f184553a[i2]);
            decoderInputBuffer.m9805v(bArrM217031a.length);
            decoderInputBuffer.f7375c.put(bArrM217031a);
        }
        decoderInputBuffer.f7377e = this.f179913c[i2];
        decoderInputBuffer.m154499t(1);
        return -4;
    }

    @Override // p149l.vod0
    /* JADX INFO: renamed from: a */
    public void mo10939a() throws IOException {
    }
}
