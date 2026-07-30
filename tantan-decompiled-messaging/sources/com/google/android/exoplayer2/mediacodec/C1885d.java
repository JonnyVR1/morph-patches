package com.google.android.exoplayer2.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.C1871k;
import com.immomo.momomediaext.sei.BaseSei;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import java.util.List;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p149l.hhd;
import p149l.jwv;
import p149l.kix;
import p149l.lix;
import p149l.n200;
import p149l.nix;
import p149l.p11;
import p149l.vck0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.d */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1885d {

    /* JADX INFO: renamed from: a */
    public final String f7899a;

    /* JADX INFO: renamed from: b */
    public final String f7900b;

    /* JADX INFO: renamed from: c */
    public final String f7901c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final MediaCodecInfo.CodecCapabilities f7902d;

    /* JADX INFO: renamed from: e */
    public final boolean f7903e;

    /* JADX INFO: renamed from: f */
    public final boolean f7904f;

    /* JADX INFO: renamed from: g */
    public final boolean f7905g;

    /* JADX INFO: renamed from: h */
    public final boolean f7906h;

    /* JADX INFO: renamed from: i */
    public final boolean f7907i;

    /* JADX INFO: renamed from: j */
    public final boolean f7908j;

    /* JADX INFO: renamed from: k */
    public final boolean f7909k;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.d$a */
    @RequiresApi(29)
    public static final class a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static int m10525a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
            List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty() || C1885d.m10495C()) {
                return 0;
            }
            lix.m149951a();
            MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointM146164a = kix.m146164a(i, i2, (int) d);
            for (int i3 = 0; i3 < supportedPerformancePoints.size(); i3++) {
                if (nix.m159579a(supportedPerformancePoints.get(i3)).covers(performancePointM146164a)) {
                    return 2;
                }
            }
            return 1;
        }
    }

    @VisibleForTesting
    public C1885d(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f7899a = (String) p11.m167011e(str);
        this.f7900b = str2;
        this.f7901c = str3;
        this.f7902d = codecCapabilities;
        this.f7906h = z;
        this.f7907i = z2;
        this.f7908j = z3;
        this.f7903e = z4;
        this.f7904f = z5;
        this.f7905g = z6;
        this.f7909k = n200.m157537s(str2);
    }

    /* JADX INFO: renamed from: A */
    public static boolean m10493A(String str) {
        return vck0.f180951d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    /* JADX INFO: renamed from: B */
    public static boolean m10494B(String str) {
        if (vck0.f180948a > 22) {
            return false;
        }
        String str2 = vck0.f180951d;
        if ("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) {
            return "OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: C */
    public static boolean m10495C() {
        String str = vck0.f180949b;
        if (str.equals("sabrina") || str.equals("boreal")) {
            return true;
        }
        String str2 = vck0.f180951d;
        return str2.startsWith("Lenovo TB-X605") || str2.startsWith("Lenovo TB-X606") || str2.startsWith("Lenovo TB-X616");
    }

    /* JADX INFO: renamed from: D */
    public static boolean m10496D(String str, int i) {
        if (!"video/hevc".equals(str) || 2 != i) {
            return false;
        }
        String str2 = vck0.f180949b;
        return "sailfish".equals(str2) || "marlin".equals(str2);
    }

    /* JADX INFO: renamed from: E */
    public static boolean m10497E(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(vck0.f180949b)) ? false : true;
    }

    /* JADX INFO: renamed from: F */
    public static C1885d m10498F(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new C1885d(str, str2, str3, codecCapabilities, z, z2, z3, (z4 || codecCapabilities == null || !m10504i(codecCapabilities) || m10494B(str)) ? false : true, codecCapabilities != null && m10508u(codecCapabilities), z5 || (codecCapabilities != null && m10506s(codecCapabilities)));
    }

    /* JADX INFO: renamed from: b */
    public static int m10500b(String str, String str2, int i) {
        int i2;
        if (i > 1 || ((vck0.f180948a >= 26 && i > 0) || DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG.equals(str2) || DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_3GP.equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i;
        }
        if ("audio/ac3".equals(str2)) {
            i2 = 6;
        } else {
            i2 = "audio/eac3".equals(str2) ? 16 : 30;
        }
        jwv.m143689i("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i + " to " + i2 + Constants.AES_SUFFIX);
        return i2;
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: d */
    public static Point m10501d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(vck0.m197872l(i, widthAlignment) * widthAlignment, vck0.m197872l(i2, heightAlignment) * heightAlignment);
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: e */
    public static boolean m10502e(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point pointM10501d = m10501d(videoCapabilities, i, i2);
        int i3 = pointM10501d.x;
        int i4 = pointM10501d.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    /* JADX INFO: renamed from: g */
    public static MediaCodecInfo.CodecProfileLevel[] m10503g(@Nullable MediaCodecInfo.CodecCapabilities codecCapabilities) {
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
    public static boolean m10504i(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return vck0.f180948a >= 19 && m10505j(codecCapabilities);
    }

    @RequiresApi(19)
    /* JADX INFO: renamed from: j */
    public static boolean m10505j(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    /* JADX INFO: renamed from: s */
    public static boolean m10506s(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return vck0.f180948a >= 21 && m10507t(codecCapabilities);
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: t */
    public static boolean m10507t(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    /* JADX INFO: renamed from: u */
    public static boolean m10508u(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return vck0.f180948a >= 21 && m10509v(codecCapabilities);
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: v */
    public static boolean m10509v(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    /* JADX INFO: renamed from: z */
    public static boolean m10510z(String str) {
        return "audio/opus".equals(str);
    }

    @Nullable
    @RequiresApi(21)
    /* JADX INFO: renamed from: c */
    public Point m10511c(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7902d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return m10501d(videoCapabilities, i, i2);
    }

    /* JADX INFO: renamed from: f */
    public hhd m10512f(C1871k c1871k, C1871k c1871k2) {
        C1871k c1871k3;
        C1871k c1871k4;
        int i = !vck0.m197845c(c1871k.f7748l, c1871k2.f7748l) ? 8 : 0;
        if (this.f7909k) {
            if (c1871k.f7756t != c1871k2.f7756t) {
                i |= 1024;
            }
            if (!this.f7903e && (c1871k.f7753q != c1871k2.f7753q || c1871k.f7754r != c1871k2.f7754r)) {
                i |= 512;
            }
            if (!vck0.m197845c(c1871k.f7760x, c1871k2.f7760x)) {
                i |= 2048;
            }
            if (m10493A(this.f7899a) && !c1871k.m10285g(c1871k2)) {
                i |= 2;
            }
            if (i == 0) {
                return new hhd(this.f7899a, c1871k, c1871k2, c1871k.m10285g(c1871k2) ? 3 : 2, 0);
            }
            c1871k3 = c1871k;
            c1871k4 = c1871k2;
        } else {
            c1871k3 = c1871k;
            c1871k4 = c1871k2;
            if (c1871k3.f7761y != c1871k4.f7761y) {
                i |= 4096;
            }
            if (c1871k3.f7762z != c1871k4.f7762z) {
                i |= 8192;
            }
            if (c1871k3.f7729A != c1871k4.f7729A) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.f7900b)) {
                Pair<Integer, Integer> pairM10456r = MediaCodecUtil.m10456r(c1871k3);
                Pair<Integer, Integer> pairM10456r2 = MediaCodecUtil.m10456r(c1871k4);
                if (pairM10456r != null && pairM10456r2 != null) {
                    int iIntValue = ((Integer) pairM10456r.first).intValue();
                    int iIntValue2 = ((Integer) pairM10456r2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new hhd(this.f7899a, c1871k3, c1871k4, 3, 0);
                    }
                }
            }
            if (!c1871k3.m10285g(c1871k4)) {
                i |= 32;
            }
            if (m10510z(this.f7900b)) {
                i |= 2;
            }
            if (i == 0) {
                return new hhd(this.f7899a, c1871k3, c1871k4, 1, 0);
            }
        }
        return new hhd(this.f7899a, c1871k3, c1871k4, 0, i);
    }

    /* JADX INFO: renamed from: h */
    public MediaCodecInfo.CodecProfileLevel[] m10513h() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7902d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: k */
    public boolean m10514k(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7902d;
        if (codecCapabilities == null) {
            m10524y("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            m10524y("channelCount.aCaps");
            return false;
        }
        if (m10500b(this.f7899a, this.f7900b, audioCapabilities.getMaxInputChannelCount()) >= i) {
            return true;
        }
        m10524y("channelCount.support, " + i);
        return false;
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: l */
    public boolean m10515l(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7902d;
        if (codecCapabilities == null) {
            m10524y("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            m10524y("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        }
        m10524y("sampleRate.support, " + i);
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m10516m(C1871k c1871k, boolean z) {
        Pair<Integer, Integer> pairM10456r = MediaCodecUtil.m10456r(c1871k);
        if (pairM10456r == null) {
            return true;
        }
        int iIntValue = ((Integer) pairM10456r.first).intValue();
        int iIntValue2 = ((Integer) pairM10456r.second).intValue();
        if ("video/dolby-vision".equals(c1871k.f7748l)) {
            if (!YtVideoEncoder.MIME_TYPE.equals(this.f7900b)) {
                iIntValue = "video/hevc".equals(this.f7900b) ? 2 : 8;
            }
            iIntValue2 = 0;
        }
        if (!this.f7909k && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrM10513h = m10513h();
        if (vck0.f180948a <= 23 && "video/x-vnd.on2.vp9".equals(this.f7900b) && codecProfileLevelArrM10513h.length == 0) {
            codecProfileLevelArrM10513h = m10503g(this.f7902d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArrM10513h) {
            if (codecProfileLevel.profile == iIntValue && ((codecProfileLevel.level >= iIntValue2 || !z) && !m10496D(this.f7900b, iIntValue))) {
                return true;
            }
        }
        m10524y("codec.profileLevel, " + c1871k.f7745i + ", " + this.f7901c);
        return false;
    }

    /* JADX INFO: renamed from: n */
    public boolean m10517n(C1871k c1871k) {
        return m10520q(c1871k) && m10516m(c1871k, false);
    }

    /* JADX INFO: renamed from: o */
    public boolean m10518o(C1871k c1871k) throws MediaCodecUtil.DecoderQueryException {
        int i;
        int i2;
        int i3;
        if (!m10520q(c1871k) || !m10516m(c1871k, true)) {
            return false;
        }
        if (!this.f7909k) {
            return vck0.f180948a < 21 || (((i = c1871k.f7762z) == -1 || m10515l(i)) && ((i2 = c1871k.f7761y) == -1 || m10514k(i2)));
        }
        int i4 = c1871k.f7753q;
        if (i4 <= 0 || (i3 = c1871k.f7754r) <= 0) {
            return true;
        }
        if (vck0.f180948a >= 21) {
            return m10522w(i4, i3, c1871k.f7755s);
        }
        boolean z = i4 * i3 <= MediaCodecUtil.m10434L();
        if (!z) {
            m10524y("legacyFrameSize, " + c1871k.f7753q + BaseSei.f13930X + c1871k.f7754r);
        }
        return z;
    }

    /* JADX INFO: renamed from: p */
    public boolean m10519p() {
        if (vck0.f180948a >= 29 && "video/x-vnd.on2.vp9".equals(this.f7900b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : m10513h()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m10520q(C1871k c1871k) {
        return this.f7900b.equals(c1871k.f7748l) || this.f7900b.equals(MediaCodecUtil.m10451m(c1871k));
    }

    /* JADX INFO: renamed from: r */
    public boolean m10521r(C1871k c1871k) {
        if (this.f7909k) {
            return this.f7903e;
        }
        Pair<Integer, Integer> pairM10456r = MediaCodecUtil.m10456r(c1871k);
        return pairM10456r != null && ((Integer) pairM10456r.first).intValue() == 42;
    }

    public String toString() {
        return this.f7899a;
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: w */
    public boolean m10522w(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f7902d;
        if (codecCapabilities == null) {
            m10524y("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m10524y("sizeAndRate.vCaps");
            return false;
        }
        if (vck0.f180948a >= 29) {
            int iM10525a = a.m10525a(videoCapabilities, i, i2, d);
            if (iM10525a == 2) {
                return true;
            }
            if (iM10525a == 1) {
                m10524y("sizeAndRate.cover, " + i + BaseSei.f13930X + i2 + "@" + d);
                return false;
            }
        }
        if (!m10502e(videoCapabilities, i, i2, d)) {
            if (i >= i2 || !m10497E(this.f7899a) || !m10502e(videoCapabilities, i2, i, d)) {
                m10524y("sizeAndRate.support, " + i + BaseSei.f13930X + i2 + "@" + d);
                return false;
            }
            m10523x("sizeAndRate.rotated, " + i + BaseSei.f13930X + i2 + "@" + d);
        }
        return true;
    }

    /* JADX INFO: renamed from: x */
    public final void m10523x(String str) {
        jwv.m143682b("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f7899a + ", " + this.f7900b + "] [" + vck0.f180952e + Constants.AES_SUFFIX);
    }

    /* JADX INFO: renamed from: y */
    public final void m10524y(String str) {
        jwv.m143682b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f7899a + ", " + this.f7900b + "] [" + vck0.f180952e + Constants.AES_SUFFIX);
    }
}
