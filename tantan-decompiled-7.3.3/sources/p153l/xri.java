package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.tencent.ugc.TXRecordCommon;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class xri {

    /* JADX INFO: renamed from: a */
    public final int f195912a;

    /* JADX INFO: renamed from: b */
    public final int f195913b;

    /* JADX INFO: renamed from: c */
    public final int f195914c;

    /* JADX INFO: renamed from: d */
    public final int f195915d;

    /* JADX INFO: renamed from: e */
    public final int f195916e;

    /* JADX INFO: renamed from: f */
    public final int f195917f;

    /* JADX INFO: renamed from: g */
    public final int f195918g;

    /* JADX INFO: renamed from: h */
    public final int f195919h;

    /* JADX INFO: renamed from: i */
    public final int f195920i;

    /* JADX INFO: renamed from: j */
    public final long f195921j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public final C21431a f195922k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public final Metadata f195923l;

    /* JADX INFO: renamed from: l.xri$a */
    public static class C21431a {

        /* JADX INFO: renamed from: a */
        public final long[] f195924a;

        /* JADX INFO: renamed from: b */
        public final long[] f195925b;

        public C21431a(long[] jArr, long[] jArr2) {
            this.f195924a = jArr;
            this.f195925b = jArr2;
        }
    }

    public xri(byte[] bArr, int i) {
        hg60 hg60Var = new hg60(bArr);
        hg60Var.m134913p(i * 8);
        this.f195912a = hg60Var.m134905h(16);
        this.f195913b = hg60Var.m134905h(16);
        this.f195914c = hg60Var.m134905h(24);
        this.f195915d = hg60Var.m134905h(24);
        int iM134905h = hg60Var.m134905h(20);
        this.f195916e = iM134905h;
        this.f195917f = m212828j(iM134905h);
        this.f195918g = hg60Var.m134905h(3) + 1;
        int iM134905h2 = hg60Var.m134905h(5) + 1;
        this.f195919h = iM134905h2;
        this.f195920i = m212827e(iM134905h2);
        this.f195921j = hg60Var.m134907j(36);
        this.f195922k = null;
        this.f195923l = null;
    }

    /* JADX INFO: renamed from: e */
    public static int m212827e(int i) {
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
    public static int m212828j(int i) {
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
    public xri m212829a(List<PictureFrame> list) {
        return new xri(this.f195912a, this.f195913b, this.f195914c, this.f195915d, this.f195916e, this.f195918g, this.f195919h, this.f195921j, this.f195922k, m212835h(new Metadata(list)));
    }

    /* JADX INFO: renamed from: b */
    public xri m212830b(@Nullable C21431a c21431a) {
        return new xri(this.f195912a, this.f195913b, this.f195914c, this.f195915d, this.f195916e, this.f195918g, this.f195919h, this.f195921j, c21431a, this.f195923l);
    }

    /* JADX INFO: renamed from: c */
    public xri m212831c(List<String> list) {
        return new xri(this.f195912a, this.f195913b, this.f195914c, this.f195915d, this.f195916e, this.f195918g, this.f195919h, this.f195921j, this.f195922k, m212835h(cnp0.m111524c(list)));
    }

    /* JADX INFO: renamed from: d */
    public long m212832d() {
        long j;
        long j2;
        int i = this.f195915d;
        if (i > 0) {
            j = (((long) i) + ((long) this.f195914c)) / 2;
            j2 = 1;
        } else {
            int i2 = this.f195912a;
            j = ((((i2 != this.f195913b || i2 <= 0) ? 4096L : i2) * ((long) this.f195918g)) * ((long) this.f195919h)) / 8;
            j2 = 64;
        }
        return j + j2;
    }

    /* JADX INFO: renamed from: f */
    public long m212833f() {
        long j = this.f195921j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.f195916e);
    }

    /* JADX INFO: renamed from: g */
    public C1894k m212834g(byte[] bArr, @Nullable Metadata metadata) {
        bArr[4] = -128;
        int i = this.f195915d;
        if (i <= 0) {
            i = -1;
        }
        return new C1894k.b().m10400g0("audio/flac").m10392Y(i).m10377J(this.f195918g).m10401h0(this.f195916e).m10389V(Collections.singletonList(bArr)).m10393Z(m212835h(metadata)).m10374G();
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public Metadata m212835h(@Nullable Metadata metadata) {
        Metadata metadata2 = this.f195923l;
        return metadata2 == null ? metadata : metadata2.m10584b(metadata);
    }

    /* JADX INFO: renamed from: i */
    public long m212836i(long j) {
        return bmk0.m105164r((j * ((long) this.f195916e)) / 1000000, 0L, this.f195921j - 1);
    }

    public xri(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, @Nullable C21431a c21431a, @Nullable Metadata metadata) {
        this.f195912a = i;
        this.f195913b = i2;
        this.f195914c = i3;
        this.f195915d = i4;
        this.f195916e = i5;
        this.f195917f = m212828j(i5);
        this.f195918g = i6;
        this.f195919h = i7;
        this.f195920i = m212827e(i7);
        this.f195921j = j;
        this.f195922k = c21431a;
        this.f195923l = metadata;
    }
}
