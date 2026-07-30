package com.google.android.exoplayer2.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.C1894k;
import com.immomo.momomediaext.sei.BaseSei;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import java.util.List;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p153l.bmk0;
import p153l.hrx;
import p153l.irx;
import p153l.kb00;
import p153l.krx;
import p153l.kyv;
import p153l.nid;
import p153l.w11;

/* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.d */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1908d {

    /* JADX INFO: renamed from: a */
    public final String f7936a;

    /* JADX INFO: renamed from: b */
    public final String f7937b;

    /* JADX INFO: renamed from: c */
    public final String f7938c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final MediaCodecInfo.CodecCapabilities f7939d;

    /* JADX INFO: renamed from: e */
    public final boolean f7940e;

    /* JADX INFO: renamed from: f */
    public final boolean f7941f;

    /* JADX INFO: renamed from: g */
    public final boolean f7942g;

    /* JADX INFO: renamed from: h */
    public final boolean f7943h;

    /* JADX INFO: renamed from: i */
    public final boolean f7944i;

    /* JADX INFO: renamed from: j */
    public final boolean f7945j;

    /* JADX INFO: renamed from: k */
    public final boolean f7946k;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.d$a */
    @RequiresApi(29)
    public static final class a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static int m10579a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
            List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty() || C1908d.m10549C()) {
                return 0;
            }
            irx.m141851a();
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointM136934a = hrx.m136934a(i, i2, (int) d);
            for (int i3 = 0; i3 < supportedPerformancePoints.size(); i3++) {
                if (krx.m151127a(supportedPerformancePoints.get(i3)).covers(performancePointM136934a)) {
                    return 2;
                }
            }
            return 1;
        }
    }

    @VisibleForTesting
    public C1908d(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f7936a = (String) w11.m204369e(str);
        this.f7937b = str2;
        this.f7938c = str3;
        this.f7939d = codecCapabilities;
        this.f7943h = z;
        this.f7944i = z2;
        this.f7945j = z3;
        this.f7940e = z4;
        this.f7941f = z5;
        this.f7942g = z6;
        this.f7946k = kb00.m149018s(str2);
    }

    /* JADX INFO: renamed from: A */
    public static boolean m10547A(String str) {
        return bmk0.f77316d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    /* JADX INFO: renamed from: B */
    public static boolean m10548B(String str) {
        if (bmk0.f77313a > 22) {
            return false;
        }
        String str2 = bmk0.f77316d;
        if ("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) {
            return "OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: C */
    public static boolean m10549C() {
        String str = bmk0.f77314b;
        if (str.equals("sabrina") || str.equals("boreal")) {
            return true;
        }
        String str2 = bmk0.f77316d;
        return str2.startsWith("Lenovo TB-X605") || str2.startsWith("Lenovo TB-X606") || str2.startsWith("Lenovo TB-X616");
    }

    /* JADX INFO: renamed from: D */
    public static boolean m10550D(String str, int i) {
        if (!"video/hevc".equals(str) || 2 != i) {
            return false;
        }
        String str2 = bmk0.f77314b;
        return "sailfish".equals(str2) || "marlin".equals(str2);
    }

    /* JADX INFO: renamed from: E */
    public static boolean m10551E(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(bmk0.f77314b)) ? false : true;
    }

    /* JADX INFO: renamed from: F */
    public static C1908d m10552F(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new C1908d(str, str2, str3, codecCapabilities, z, z2, z3, (z4 || codecCapabilities == null || !m10558i(codecCapabilities) || m10548B(str)) ? false : true, codecCapabilities != null && m10562u(codecCapabilities), z5 || (codecCapabilities != null && m10560s(codecCapabilities)));
    }

    /* JADX INFO: renamed from: b */
    public static int m10554b(String str, String str2, int i) {
        int i2;
        if (i > 1 || ((bmk0.f77313a >= 26 && i > 0) || DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG.equals(str2) || DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_3GP.equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i;
        }
        if ("audio/ac3".equals(str2)) {
            i2 = 6;
        } else {
            i2 = "audio/eac3".equals(str2) ? 16 : 30;
        }
        kyv.m152151i("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i + " to " + i2 + Constants.AES_SUFFIX);
        return i2;
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: d */
    public static Point m10555d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(bmk0.m105150l(i, widthAlignment) * widthAlignment, bmk0.m105150l(i2, heightAlignment) * heightAlignment);
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: e */
    public static boolean m10556e(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point pointM10555d = m10555d(videoCapabilities, i, i2);
        int i3 = pointM10555d.x;
        int i4 = pointM10555d.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    /* JADX INFO: renamed from: g */
    public static MediaCodecInfo.CodecProfileLevel[] m10557g(@Nullable MediaCodecInfo.CodecCapabilities codecCapabilities) {
        int i;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int iIntValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
        if (iIntValue >= 180000000) {
            i = 1024;
        } else if (iIntValue >= 120000000) {
            i = 512;
        } else if (iIntValue >= 60000000) {
            i = 256;
        } else if (iIntValue >= 30000000) {
            i = 128;
        } else if (iIntValue >= 18000000) {
            i = 64;
        } else if (iIntValue >= 12000000) {
            i = 32;
        } else if (iIntValue >= 7200000) {
            i = 16;
        } else if (iIntValue >= 3600000) {
            i = 8;
        } else if (iIntValue >= 1800000) {
            i = 4;
        } else {
            i = iIntValue >= 800000 ? 2 : 1;
        }
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    /* JADX INFO: renamed from: i */
    public static boolean m10558i(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return bmk0.f77313a >= 19 && m10559j(codecCapabilities);
    }

    @RequiresApi(19)
    /* JADX INFO: renamed from: j */
    public static boolean m10559j(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    /* JADX INFO: renamed from: s */
    public static boolean m10560s(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return bmk0.f77313a >= 21 && m10561t(codecCapabilities);
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: t */
    public static boolean m10561t(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    /* JADX INFO: renamed from: u */
    public static boolean m10562u(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return bmk0.f77313a >= 21 && m10563v(codecCapabilities);
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: v */
    public static boolean m10563v(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    /* JADX INFO: renamed from: z */
    public static boolean m10564z(String str) {
        return "audio/opus".equals(str);
    }

    @Nullable
    @RequiresApi(21)
    /* JADX INFO: renamed from: c */
    public Point m10565c(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7939d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return m10555d(videoCapabilities, i, i2);
    }

    /* JADX INFO: renamed from: f */
    public nid m10566f(C1894k c1894k, C1894k c1894k2) {
        C1894k c1894k3;
        C1894k c1894k4;
        int i = !bmk0.m105123c(c1894k.f7785l, c1894k2.f7785l) ? 8 : 0;
        if (this.f7946k) {
            if (c1894k.f7793t != c1894k2.f7793t) {
                i |= 1024;
            }
            if (!this.f7940e && (c1894k.f7790q != c1894k2.f7790q || c1894k.f7791r != c1894k2.f7791r)) {
                i |= 512;
            }
            if (!bmk0.m105123c(c1894k.f7797x, c1894k2.f7797x)) {
                i |= 2048;
            }
            if (m10547A(this.f7936a) && !c1894k.m10339g(c1894k2)) {
                i |= 2;
            }
            if (i == 0) {
                return new nid(this.f7936a, c1894k, c1894k2, c1894k.m10339g(c1894k2) ? 3 : 2, 0);
            }
            c1894k3 = c1894k;
            c1894k4 = c1894k2;
        } else {
            c1894k3 = c1894k;
            c1894k4 = c1894k2;
            if (c1894k3.f7798y != c1894k4.f7798y) {
                i |= 4096;
            }
            if (c1894k3.f7799z != c1894k4.f7799z) {
                i |= 8192;
            }
            if (c1894k3.f7766A != c1894k4.f7766A) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.f7937b)) {
                Pair<Integer, Integer> pairM10510r = MediaCodecUtil.m10510r(c1894k3);
                Pair<Integer, Integer> pairM10510r2 = MediaCodecUtil.m10510r(c1894k4);
                if (pairM10510r != null && pairM10510r2 != null) {
                    int iIntValue = ((Integer) pairM10510r.first).intValue();
                    int iIntValue2 = ((Integer) pairM10510r2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new nid(this.f7936a, c1894k3, c1894k4, 3, 0);
                    }
                }
            }
            if (!c1894k3.m10339g(c1894k4)) {
                i |= 32;
            }
            if (m10564z(this.f7937b)) {
                i |= 2;
            }
            if (i == 0) {
                return new nid(this.f7936a, c1894k3, c1894k4, 1, 0);
            }
        }
        return new nid(this.f7936a, c1894k3, c1894k4, 0, i);
    }

    /* JADX INFO: renamed from: h */
    public MediaCodecInfo.CodecProfileLevel[] m10567h() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7939d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: k */
    public boolean m10568k(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7939d;
        if (codecCapabilities == null) {
            m10578y("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            m10578y("channelCount.aCaps");
            return false;
        }
        if (m10554b(this.f7936a, this.f7937b, audioCapabilities.getMaxInputChannelCount()) >= i) {
            return true;
        }
        m10578y("channelCount.support, " + i);
        return false;
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: l */
    public boolean m10569l(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7939d;
        if (codecCapabilities == null) {
            m10578y("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            m10578y("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        }
        m10578y("sampleRate.support, " + i);
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m10570m(C1894k c1894k, boolean z) {
        Pair<Integer, Integer> pairM10510r = MediaCodecUtil.m10510r(c1894k);
        if (pairM10510r == null) {
            return true;
        }
        int iIntValue = ((Integer) pairM10510r.first).intValue();
        int iIntValue2 = ((Integer) pairM10510r.second).intValue();
        if ("video/dolby-vision".equals(c1894k.f7785l)) {
            if (!YtVideoEncoder.MIME_TYPE.equals(this.f7937b)) {
                iIntValue = "video/hevc".equals(this.f7937b) ? 2 : 8;
            }
            iIntValue2 = 0;
        }
        if (!this.f7946k && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrM10567h = m10567h();
        if (bmk0.f77313a <= 23 && "video/x-vnd.on2.vp9".equals(this.f7937b) && codecProfileLevelArrM10567h.length == 0) {
            codecProfileLevelArrM10567h = m10557g(this.f7939d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArrM10567h) {
            if (codecProfileLevel.profile == iIntValue && ((codecProfileLevel.level >= iIntValue2 || !z) && !m10550D(this.f7937b, iIntValue))) {
                return true;
            }
        }
        m10578y("codec.profileLevel, " + c1894k.f7782i + ", " + this.f7938c);
        return false;
    }

    /* JADX INFO: renamed from: n */
    public boolean m10571n(C1894k c1894k) {
        return m10574q(c1894k) && m10570m(c1894k, false);
    }

    /* JADX INFO: renamed from: o */
    public boolean m10572o(C1894k c1894k) throws MediaCodecUtil.DecoderQueryException {
        int i;
        int i2;
        int i3;
        if (!m10574q(c1894k) || !m10570m(c1894k, true)) {
            return false;
        }
        if (!this.f7946k) {
            return bmk0.f77313a < 21 || (((i = c1894k.f7799z) == -1 || m10569l(i)) && ((i2 = c1894k.f7798y) == -1 || m10568k(i2)));
        }
        int i4 = c1894k.f7790q;
        if (i4 <= 0 || (i3 = c1894k.f7791r) <= 0) {
            return true;
        }
        if (bmk0.f77313a >= 21) {
            return m10576w(i4, i3, c1894k.f7792s);
        }
        boolean z = i4 * i3 <= MediaCodecUtil.m10488L();
        if (!z) {
            m10578y("legacyFrameSize, " + c1894k.f7790q + BaseSei.f14624X + c1894k.f7791r);
        }
        return z;
    }

    /* JADX INFO: renamed from: p */
    public boolean m10573p() {
        if (bmk0.f77313a >= 29 && "video/x-vnd.on2.vp9".equals(this.f7937b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : m10567h()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m10574q(C1894k c1894k) {
        return this.f7937b.equals(c1894k.f7785l) || this.f7937b.equals(MediaCodecUtil.m10505m(c1894k));
    }

    /* JADX INFO: renamed from: r */
    public boolean m10575r(C1894k c1894k) {
        if (this.f7946k) {
            return this.f7940e;
        }
        Pair<Integer, Integer> pairM10510r = MediaCodecUtil.m10510r(c1894k);
        return pairM10510r != null && ((Integer) pairM10510r.first).intValue() == 42;
    }

    public String toString() {
        return this.f7936a;
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: w */
    public boolean m10576w(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7939d;
        if (codecCapabilities == null) {
            m10578y("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m10578y("sizeAndRate.vCaps");
            return false;
        }
        if (bmk0.f77313a >= 29) {
            int iM10579a = a.m10579a(videoCapabilities, i, i2, d);
            if (iM10579a == 2) {
                return true;
            }
            if (iM10579a == 1) {
                m10578y("sizeAndRate.cover, " + i + BaseSei.f14624X + i2 + "@" + d);
                return false;
            }
        }
        if (!m10556e(videoCapabilities, i, i2, d)) {
            if (i >= i2 || !m10551E(this.f7936a) || !m10556e(videoCapabilities, i2, i, d)) {
                m10578y("sizeAndRate.support, " + i + BaseSei.f14624X + i2 + "@" + d);
                return false;
            }
            m10577x("sizeAndRate.rotated, " + i + BaseSei.f14624X + i2 + "@" + d);
        }
        return true;
    }

    /* JADX INFO: renamed from: x */
    public final void m10577x(String str) {
        kyv.m152144b("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f7936a + ", " + this.f7937b + "] [" + bmk0.f77317e + Constants.AES_SUFFIX);
    }

    /* JADX INFO: renamed from: y */
    public final void m10578y(String str) {
        kyv.m152144b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f7936a + ", " + this.f7937b + "] [" + bmk0.f77317e + Constants.AES_SUFFIX);
    }
}
