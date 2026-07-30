package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.tencent.ugc.TXRecordCommon;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class bpi {

    /* JADX INFO: renamed from: a */
    public final int f76628a;

    /* JADX INFO: renamed from: b */
    public final int f76629b;

    /* JADX INFO: renamed from: c */
    public final int f76630c;

    /* JADX INFO: renamed from: d */
    public final int f76631d;

    /* JADX INFO: renamed from: e */
    public final int f76632e;

    /* JADX INFO: renamed from: f */
    public final int f76633f;

    /* JADX INFO: renamed from: g */
    public final int f76634g;

    /* JADX INFO: renamed from: h */
    public final int f76635h;

    /* JADX INFO: renamed from: i */
    public final int f76636i;

    /* JADX INFO: renamed from: j */
    public final long f76637j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public final C15925a f76638k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public final Metadata f76639l;

    /* JADX INFO: renamed from: l.bpi$a */
    public static class C15925a {

        /* JADX INFO: renamed from: a */
        public final long[] f76640a;

        /* JADX INFO: renamed from: b */
        public final long[] f76641b;

        public C15925a(long[] jArr, long[] jArr2) {
            this.f76640a = jArr;
            this.f76641b = jArr2;
        }
    }

    public bpi(byte[] bArr, int i) {
        c860 c860Var = new c860(bArr);
        c860Var.m105672p(i * 8);
        this.f76628a = c860Var.m105664h(16);
        this.f76629b = c860Var.m105664h(16);
        this.f76630c = c860Var.m105664h(24);
        this.f76631d = c860Var.m105664h(24);
        int iM105664h = c860Var.m105664h(20);
        this.f76632e = iM105664h;
        this.f76633f = m103058j(iM105664h);
        this.f76634g = c860Var.m105664h(3) + 1;
        int iM105664h2 = c860Var.m105664h(5) + 1;
        this.f76635h = iM105664h2;
        this.f76636i = m103057e(iM105664h2);
        this.f76637j = c860Var.m105666j(36);
        this.f76638k = null;
        this.f76639l = null;
    }

    /* JADX INFO: renamed from: e */
    public static int m103057e(int i) {
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

    /* JADX INFO: renamed from: j */
    public static int m103058j(int i) {
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
    public bpi m103059a(List<PictureFrame> list) {
        return new bpi(this.f76628a, this.f76629b, this.f76630c, this.f76631d, this.f76632e, this.f76634g, this.f76635h, this.f76637j, this.f76638k, m103065h(new Metadata(list)));
    }

    /* JADX INFO: renamed from: b */
    public bpi m103060b(@Nullable C15925a c15925a) {
        return new bpi(this.f76628a, this.f76629b, this.f76630c, this.f76631d, this.f76632e, this.f76634g, this.f76635h, this.f76637j, c15925a, this.f76639l);
    }

    /* JADX INFO: renamed from: c */
    public bpi m103061c(List<String> list) {
        return new bpi(this.f76628a, this.f76629b, this.f76630c, this.f76631d, this.f76632e, this.f76634g, this.f76635h, this.f76637j, this.f76638k, m103065h(ydp0.m214313c(list)));
    }

    /* JADX INFO: renamed from: d */
    public long m103062d() {
        long j;
        long j2;
        int i = this.f76631d;
        if (i > 0) {
            j = (((long) i) + ((long) this.f76630c)) / 2;
            j2 = 1;
        } else {
            int i2 = this.f76628a;
            j = ((((i2 != this.f76629b || i2 <= 0) ? 4096L : i2) * ((long) this.f76634g)) * ((long) this.f76635h)) / 8;
            j2 = 64;
        }
        return j + j2;
    }

    /* JADX INFO: renamed from: f */
    public long m103063f() {
        long j = this.f76637j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.f76632e);
    }

    /* JADX INFO: renamed from: g */
    public C1871k m103064g(byte[] bArr, @Nullable Metadata metadata) {
        bArr[4] = -128;
        int i = this.f76631d;
        if (i <= 0) {
            i = -1;
        }
        return new C1871k.b().m10346g0("audio/flac").m10338Y(i).m10323J(this.f76634g).m10347h0(this.f76632e).m10335V(Collections.singletonList(bArr)).m10339Z(m103065h(metadata)).m10320G();
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public Metadata m103065h(@Nullable Metadata metadata) {
        Metadata metadata2 = this.f76639l;
        return metadata2 == null ? metadata : metadata2.m10530b(metadata);
    }

    /* JADX INFO: renamed from: i */
    public long m103066i(long j) {
        return vck0.m197886r((j * ((long) this.f76632e)) / 1000000, 0L, this.f76637j - 1);
    }

    public bpi(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, @Nullable C15925a c15925a, @Nullable Metadata metadata) {
        this.f76628a = i;
        this.f76629b = i2;
        this.f76630c = i3;
        this.f76631d = i4;
        this.f76632e = i5;
        this.f76633f = m103058j(i5);
        this.f76634g = i6;
        this.f76635h = i7;
        this.f76636i = m103057e(i7);
        this.f76637j = j;
        this.f76638k = c15925a;
        this.f76639l = metadata;
    }
}
