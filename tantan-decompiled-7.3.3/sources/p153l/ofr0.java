package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzby;
import com.tencent.ugc.TXRecordCommon;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ofr0 {

    /* JADX INFO: renamed from: a */
    public final int f147146a;

    /* JADX INFO: renamed from: b */
    public final int f147147b;

    /* JADX INFO: renamed from: c */
    public final int f147148c;

    /* JADX INFO: renamed from: d */
    public final int f147149d;

    /* JADX INFO: renamed from: e */
    public final int f147150e;

    /* JADX INFO: renamed from: f */
    public final int f147151f;

    /* JADX INFO: renamed from: g */
    public final int f147152g;

    /* JADX INFO: renamed from: h */
    public final int f147153h;

    /* JADX INFO: renamed from: i */
    public final int f147154i;

    /* JADX INFO: renamed from: j */
    public final long f147155j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public final nfr0 f147156k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public final zzby f147157l;

    public ofr0(byte[] bArr, int i) {
        dfw0 dfw0Var = new dfw0(bArr, bArr.length);
        dfw0Var.m115559k(i * 8);
        this.f147146a = dfw0Var.m115552d(16);
        this.f147147b = dfw0Var.m115552d(16);
        this.f147148c = dfw0Var.m115552d(24);
        this.f147149d = dfw0Var.m115552d(24);
        int iM115552d = dfw0Var.m115552d(20);
        this.f147150e = iM115552d;
        this.f147151f = m167507i(iM115552d);
        this.f147152g = dfw0Var.m115552d(3) + 1;
        int iM115552d2 = dfw0Var.m115552d(5) + 1;
        this.f147153h = iM115552d2;
        this.f147154i = m167506h(iM115552d2);
        int iM115552d3 = dfw0Var.m115552d(4);
        int iM115552d4 = dfw0Var.m115552d(32);
        int i2 = mpw0.f137957a;
        this.f147155j = ((((long) iM115552d3) & 4294967295L) << 32) | (((long) iM115552d4) & 4294967295L);
        this.f147156k = null;
        this.f147157l = null;
    }

    /* JADX INFO: renamed from: h */
    public static int m167506h(int i) {
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
    public static int m167507i(int i) {
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
    public final long m167508a() {
        long j = this.f147155j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.f147150e);
    }

    /* JADX INFO: renamed from: b */
    public final long m167509b(long j) {
        return Math.max(0L, Math.min((j * ((long) this.f147150e)) / 1000000, this.f147155j - 1));
    }

    /* JADX INFO: renamed from: c */
    public final sqr0 m167510c(byte[] bArr, @Nullable zzby zzbyVar) {
        bArr[4] = -128;
        zzby zzbyVarM167511d = m167511d(zzbyVar);
        znr0 znr0Var = new znr0();
        znr0Var.m220672w("audio/flac");
        int i = this.f147149d;
        if (i <= 0) {
            i = -1;
        }
        znr0Var.m220664o(i);
        znr0Var.m220659k0(this.f147152g);
        znr0Var.m220673x(this.f147150e);
        znr0Var.m220666q(mpw0.m159428z(this.f147153h));
        znr0Var.m220660l(Collections.singletonList(bArr));
        znr0Var.m220665p(zzbyVarM167511d);
        return znr0Var.m220645D();
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final zzby m167511d(@Nullable zzby zzbyVar) {
        zzby zzbyVar2 = this.f147157l;
        return zzbyVar2 == null ? zzbyVar : zzbyVar2.m13608d(zzbyVar);
    }

    /* JADX INFO: renamed from: e */
    public final ofr0 m167512e(List list) {
        return new ofr0(this.f147146a, this.f147147b, this.f147148c, this.f147149d, this.f147150e, this.f147152g, this.f147153h, this.f147155j, this.f147156k, m167511d(new zzby(list)));
    }

    /* JADX INFO: renamed from: f */
    public final ofr0 m167513f(@Nullable nfr0 nfr0Var) {
        return new ofr0(this.f147146a, this.f147147b, this.f147148c, this.f147149d, this.f147150e, this.f147152g, this.f147153h, this.f147155j, nfr0Var, this.f147157l);
    }

    /* JADX INFO: renamed from: g */
    public final ofr0 m167514g(List list) {
        return new ofr0(this.f147146a, this.f147147b, this.f147148c, this.f147149d, this.f147150e, this.f147152g, this.f147153h, this.f147155j, this.f147156k, m167511d(ygr0.m215874b(list)));
    }

    public ofr0(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, @Nullable nfr0 nfr0Var, @Nullable zzby zzbyVar) {
        this.f147146a = i;
        this.f147147b = i2;
        this.f147148c = i3;
        this.f147149d = i4;
        this.f147150e = i5;
        this.f147151f = m167507i(i5);
        this.f147152g = i6;
        this.f147153h = i7;
        this.f147154i = m167506h(i7);
        this.f147155j = j;
        this.f147156k = nfr0Var;
        this.f147157l = zzbyVar;
    }
}
