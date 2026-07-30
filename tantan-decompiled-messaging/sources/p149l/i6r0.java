package p149l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzby;
import com.tencent.ugc.TXRecordCommon;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class i6r0 {

    /* JADX INFO: renamed from: a */
    public final int f111759a;

    /* JADX INFO: renamed from: b */
    public final int f111760b;

    /* JADX INFO: renamed from: c */
    public final int f111761c;

    /* JADX INFO: renamed from: d */
    public final int f111762d;

    /* JADX INFO: renamed from: e */
    public final int f111763e;

    /* JADX INFO: renamed from: f */
    public final int f111764f;

    /* JADX INFO: renamed from: g */
    public final int f111765g;

    /* JADX INFO: renamed from: h */
    public final int f111766h;

    /* JADX INFO: renamed from: i */
    public final int f111767i;

    /* JADX INFO: renamed from: j */
    public final long f111768j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public final h6r0 f111769k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public final zzby f111770l;

    public i6r0(byte[] bArr, int i) {
        x5w0 x5w0Var = new x5w0(bArr, bArr.length);
        x5w0Var.m207157k(i * 8);
        this.f111759a = x5w0Var.m207150d(16);
        this.f111760b = x5w0Var.m207150d(16);
        this.f111761c = x5w0Var.m207150d(24);
        this.f111762d = x5w0Var.m207150d(24);
        int iM207150d = x5w0Var.m207150d(20);
        this.f111763e = iM207150d;
        this.f111764f = m134635i(iM207150d);
        this.f111765g = x5w0Var.m207150d(3) + 1;
        int iM207150d2 = x5w0Var.m207150d(5) + 1;
        this.f111766h = iM207150d2;
        this.f111767i = m134634h(iM207150d2);
        int iM207150d3 = x5w0Var.m207150d(4);
        int iM207150d4 = x5w0Var.m207150d(32);
        int i2 = ggw0.f102568a;
        this.f111768j = ((((long) iM207150d3) & 4294967295L) << 32) | (((long) iM207150d4) & 4294967295L);
        this.f111769k = null;
        this.f111770l = null;
    }

    /* JADX INFO: renamed from: h */
    public static int m134634h(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    /* JADX INFO: renamed from: i */
    public static int m134635i(int i) {
        switch (i) {
            case TXRecordCommon.AUDIO_SAMPLERATE_8000 /* 8000 */:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: a */
    public final long m134636a() {
        long j = this.f111768j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.f111763e);
    }

    /* JADX INFO: renamed from: b */
    public final long m134637b(long j) {
        return Math.max(0L, Math.min((j * ((long) this.f111763e)) / 1000000, this.f111768j - 1));
    }

    /* JADX INFO: renamed from: c */
    public final mhr0 m134638c(byte[] bArr, @Nullable zzby zzbyVar) {
        bArr[4] = -128;
        zzby zzbyVarM134639d = m134639d(zzbyVar);
        ter0 ter0Var = new ter0();
        ter0Var.m188618w("audio/flac");
        int i = this.f111762d;
        if (i <= 0) {
            i = -1;
        }
        ter0Var.m188610o(i);
        ter0Var.m188605k0(this.f111765g);
        ter0Var.m188619x(this.f111763e);
        ter0Var.m188612q(ggw0.m126084z(this.f111766h));
        ter0Var.m188606l(Collections.singletonList(bArr));
        ter0Var.m188611p(zzbyVarM134639d);
        return ter0Var.m188591D();
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final zzby m134639d(@Nullable zzby zzbyVar) {
        zzby zzbyVar2 = this.f111770l;
        return zzbyVar2 == null ? zzbyVar : zzbyVar2.m13554d(zzbyVar);
    }

    /* JADX INFO: renamed from: e */
    public final i6r0 m134640e(List list) {
        return new i6r0(this.f111759a, this.f111760b, this.f111761c, this.f111762d, this.f111763e, this.f111765g, this.f111766h, this.f111768j, this.f111769k, m134639d(new zzby(list)));
    }

    /* JADX INFO: renamed from: f */
    public final i6r0 m134641f(@Nullable h6r0 h6r0Var) {
        return new i6r0(this.f111759a, this.f111760b, this.f111761c, this.f111762d, this.f111763e, this.f111765g, this.f111766h, this.f111768j, h6r0Var, this.f111770l);
    }

    /* JADX INFO: renamed from: g */
    public final i6r0 m134642g(List list) {
        return new i6r0(this.f111759a, this.f111760b, this.f111761c, this.f111762d, this.f111763e, this.f111765g, this.f111766h, this.f111768j, this.f111769k, m134639d(s7r0.m182515b(list)));
    }

    public i6r0(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, @Nullable h6r0 h6r0Var, @Nullable zzby zzbyVar) {
        this.f111759a = i;
        this.f111760b = i2;
        this.f111761c = i3;
        this.f111762d = i4;
        this.f111763e = i5;
        this.f111764f = m134635i(i5);
        this.f111765g = i6;
        this.f111766h = i7;
        this.f111767i = m134634h(i7);
        this.f111768j = j;
        this.f111769k = h6r0Var;
        this.f111770l = zzbyVar;
    }
}
