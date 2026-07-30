package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.PlaybackException;
import com.google.common.primitives.Ints;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.arch.card.cardmodel.videoFeed.LiveVideoFeedSmallStyleCardView;
import com.tencent.ugc.TXRecordCommon;
import java.math.RoundingMode;
import p153l.bmk0;
import p153l.fig0;
import p153l.nym;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.g */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class C1847g implements DefaultAudioSink.InterfaceC1833e {

    /* JADX INFO: renamed from: b */
    public final int f7248b;

    /* JADX INFO: renamed from: c */
    public final int f7249c;

    /* JADX INFO: renamed from: d */
    public final int f7250d;

    /* JADX INFO: renamed from: e */
    public final int f7251e;

    /* JADX INFO: renamed from: f */
    public final int f7252f;

    /* JADX INFO: renamed from: g */
    public final int f7253g;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.g$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f7254a = 250000;

        /* JADX INFO: renamed from: b */
        public int f7255b = 750000;

        /* JADX INFO: renamed from: c */
        public int f7256c = 4;

        /* JADX INFO: renamed from: d */
        public int f7257d = 250000;

        /* JADX INFO: renamed from: e */
        public int f7258e = 50000000;

        /* JADX INFO: renamed from: f */
        public int f7259f = 2;

        /* JADX INFO: renamed from: g */
        public C1847g m9676g() {
            return new C1847g(this);
        }
    }

    public C1847g(a aVar) {
        this.f7248b = aVar.f7254a;
        this.f7249c = aVar.f7255b;
        this.f7250d = aVar.f7256c;
        this.f7251e = aVar.f7257d;
        this.f7252f = aVar.f7258e;
        this.f7253g = aVar.f7259f;
    }

    /* JADX INFO: renamed from: b */
    public static int m9664b(int i, int i2, int i3) {
        return Ints.m16514d(((((long) i) * ((long) i2)) * ((long) i3)) / 1000000);
    }

    /* JADX INFO: renamed from: d */
    public static int m9665d(int i) {
        switch (i) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return TantanException.Client.AccountService.GENERAL_BAD_REQUEST;
            case 10:
                return LiveVideoFeedSmallStyleCardView.DISTANCE_DIFFERENT_CITY;
            case 11:
                return 16000;
            case 12:
                return PlaybackException.ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED;
            case 13:
            case 19:
            default:
                fig0.m125680a();
                return 0;
            case 14:
                return 3062500;
            case 15:
                return TXRecordCommon.AUDIO_SAMPLERATE_8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
            case 20:
                return 63750;
        }
    }

    @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.InterfaceC1833e
    /* JADX INFO: renamed from: a */
    public int mo9548a(int i, int i2, int i3, int i4, int i5, int i6, double d) {
        return (((Math.max(i, (int) (((double) m9666c(i, i2, i3, i4, i5, i6)) * d)) + i4) - 1) / i4) * i4;
    }

    /* JADX INFO: renamed from: c */
    public int m9666c(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i3 == 0) {
            return m9669g(i, i5, i4);
        }
        if (i3 == 1) {
            return m9667e(i2);
        }
        if (i3 == 2) {
            return m9668f(i2, i6);
        }
        fig0.m125680a();
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public int m9667e(int i) {
        return Ints.m16514d((((long) this.f7252f) * ((long) m9665d(i))) / 1000000);
    }

    /* JADX INFO: renamed from: f */
    public int m9668f(int i, int i2) {
        int i3 = this.f7251e;
        if (i == 5) {
            i3 *= this.f7253g;
        }
        return Ints.m16514d((((long) i3) * ((long) (i2 != -1 ? nym.m165342c(i2, 8, RoundingMode.CEILING) : m9665d(i)))) / 1000000);
    }

    /* JADX INFO: renamed from: g */
    public int m9669g(int i, int i2, int i3) {
        return bmk0.m105162q(i * this.f7250d, m9664b(this.f7248b, i2, i3), m9664b(this.f7249c, i2, i3));
    }
}
