package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.PlaybackException;
import com.google.common.primitives.Ints;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.arch.card.cardmodel.videoFeed.LiveVideoFeedSmallStyleCardView;
import com.tencent.ugc.TXRecordCommon;
import java.math.RoundingMode;
import p149l.mwm;
import p149l.vck0;
import p149l.x9g0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.g */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class C1824g implements DefaultAudioSink.InterfaceC1810e {

    /* JADX INFO: renamed from: b */
    public final int f7211b;

    /* JADX INFO: renamed from: c */
    public final int f7212c;

    /* JADX INFO: renamed from: d */
    public final int f7213d;

    /* JADX INFO: renamed from: e */
    public final int f7214e;

    /* JADX INFO: renamed from: f */
    public final int f7215f;

    /* JADX INFO: renamed from: g */
    public final int f7216g;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.g$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f7217a = 250000;

        /* JADX INFO: renamed from: b */
        public int f7218b = 750000;

        /* JADX INFO: renamed from: c */
        public int f7219c = 4;

        /* JADX INFO: renamed from: d */
        public int f7220d = 250000;

        /* JADX INFO: renamed from: e */
        public int f7221e = 50000000;

        /* JADX INFO: renamed from: f */
        public int f7222f = 2;

        /* JADX INFO: renamed from: g */
        public C1824g m9622g() {
            return new C1824g(this);
        }
    }

    public C1824g(a aVar) {
        this.f7211b = aVar.f7217a;
        this.f7212c = aVar.f7218b;
        this.f7213d = aVar.f7219c;
        this.f7214e = aVar.f7220d;
        this.f7215f = aVar.f7221e;
        this.f7216g = aVar.f7222f;
    }

    /* JADX INFO: renamed from: b */
    public static int m9610b(int i, int i2, int i3) {
        return Ints.m16459d(((((long) i) * ((long) i2)) * ((long) i3)) / 1000000);
    }

    /* JADX INFO: renamed from: d */
    public static int m9611d(int i) {
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
                x9g0.m207497a();
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

    @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.InterfaceC1810e
    /* JADX INFO: renamed from: a */
    public int mo9494a(int i, int i2, int i3, int i4, int i5, int i6, double d) {
        return (((Math.max(i, (int) (((double) m9612c(i, i2, i3, i4, i5, i6)) * d)) + i4) - 1) / i4) * i4;
    }

    /* JADX INFO: renamed from: c */
    public int m9612c(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i3 == 0) {
            return m9615g(i, i5, i4);
        }
        if (i3 == 1) {
            return m9613e(i2);
        }
        if (i3 == 2) {
            return m9614f(i2, i6);
        }
        x9g0.m207497a();
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public int m9613e(int i) {
        return Ints.m16459d((((long) this.f7215f) * ((long) m9611d(i))) / 1000000);
    }

    /* JADX INFO: renamed from: f */
    public int m9614f(int i, int i2) {
        int i3 = this.f7214e;
        if (i == 5) {
            i3 *= this.f7216g;
        }
        return Ints.m16459d((((long) i3) * ((long) (i2 != -1 ? mwm.m156752c(i2, 8, RoundingMode.CEILING) : m9611d(i)))) / 1000000);
    }

    /* JADX INFO: renamed from: g */
    public int m9615g(int i, int i2, int i3) {
        return vck0.m197884q(i * this.f7213d, m9610b(this.f7211b, i2, i3), m9610b(this.f7212c, i2, i3));
    }
}
