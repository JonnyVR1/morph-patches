package p153l;

import com.google.android.exoplayer2.PlaybackException;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.arch.card.cardmodel.videoFeed.LiveVideoFeedSmallStyleCardView;
import com.tencent.ugc.TXRecordCommon;

/* JADX INFO: loaded from: classes6.dex */
public final class lty0 implements esy0 {
    public lty0(kty0 kty0Var) {
    }

    /* JADX INFO: renamed from: a */
    public static int m155826a(int i, int i2, int i3) {
        return utw0.m198111a(((((long) i) * ((long) i2)) * ((long) i3)) / 1000000);
    }

    /* JADX INFO: renamed from: b */
    public static int m155827b(int i) {
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
}
