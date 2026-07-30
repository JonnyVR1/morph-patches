package p153l;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.internal.ads.zzth;
import com.immomo.momomediaext.sei.BaseSei;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes6.dex */
public final class hwy0 {

    /* JADX INFO: renamed from: a */
    public final String f111951a;

    /* JADX INFO: renamed from: b */
    public final String f111952b;

    /* JADX INFO: renamed from: c */
    public final String f111953c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final MediaCodecInfo.CodecCapabilities f111954d;

    /* JADX INFO: renamed from: e */
    public final boolean f111955e;

    /* JADX INFO: renamed from: f */
    public final boolean f111956f;

    /* JADX INFO: renamed from: g */
    public final boolean f111957g;

    /* JADX INFO: renamed from: h */
    public final boolean f111958h;

    @VisibleForTesting
    public hwy0(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.f111951a = str;
        this.f111952b = str2;
        this.f111953c = str3;
        this.f111954d = codecCapabilities;
        this.f111957g = z;
        this.f111955e = z4;
        this.f111956f = z6;
        this.f111958h = a8t0.m96496h(str2);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003b  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX INFO: renamed from: c */
    public static hwy0 m137543c(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        boolean z7;
        boolean z8;
        if (codecCapabilities != null) {
            int i = mpw0.f137957a;
            if (codecCapabilities.isFeatureSupported("adaptive-playback")) {
                if (mpw0.f137957a <= 22) {
                    String str4 = mpw0.f137960d;
                    if (("ODROID-XU3".equals(str4) || "Nexus 10".equals(str4)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                        z6 = false;
                    }
                }
                z6 = true;
            } else {
                z6 = false;
            }
        } else {
            z6 = false;
        }
        if (codecCapabilities != null) {
            int i2 = mpw0.f137957a;
            if (codecCapabilities.isFeatureSupported("tunneled-playback")) {
                z7 = true;
            } else {
                z7 = false;
            }
        } else {
            z7 = false;
        }
        if (z5) {
            z8 = true;
        } else {
            if (codecCapabilities != null) {
                int i3 = mpw0.f137957a;
                if (codecCapabilities.isFeatureSupported("secure-playback")) {
                    z8 = true;
                }
            }
            z8 = false;
        }
        return new hwy0(str, str2, str3, codecCapabilities, z, z2, z3, z6, z7, z8);
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: i */
    public static Point m137544i(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i3 = mpw0.f137957a;
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: k */
    public static boolean m137545k(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point pointM137544i = m137544i(videoCapabilities, i, i2);
        int i3 = pointM137544i.x;
        int i4 = pointM137544i.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    @Nullable
    @RequiresApi(21)
    /* JADX INFO: renamed from: a */
    public final Point m137546a(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f111954d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return m137544i(videoCapabilities, i, i2);
    }

    /* JADX INFO: renamed from: b */
    public final zwx0 m137547b(sqr0 sqr0Var, sqr0 sqr0Var2) {
        sqr0 sqr0Var3;
        sqr0 sqr0Var4;
        int i = true != mpw0.m159408f(sqr0Var.f170251l, sqr0Var2.f170251l) ? 8 : 0;
        if (this.f111958h) {
            if (sqr0Var.f170259t != sqr0Var2.f170259t) {
                i |= 1024;
            }
            if (!this.f111955e && (sqr0Var.f170256q != sqr0Var2.f170256q || sqr0Var.f170257r != sqr0Var2.f170257r)) {
                i |= 512;
            }
            if (!mpw0.m159408f(sqr0Var.f170263x, sqr0Var2.f170263x)) {
                i |= 2048;
            }
            String str = this.f111951a;
            if (mpw0.f137960d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !sqr0Var.m187561d(sqr0Var2)) {
                i |= 2;
            }
            if (i == 0) {
                return new zwx0(this.f111951a, sqr0Var, sqr0Var2, true != sqr0Var.m187561d(sqr0Var2) ? 2 : 3, 0);
            }
            sqr0Var3 = sqr0Var;
            sqr0Var4 = sqr0Var2;
        } else {
            sqr0Var3 = sqr0Var;
            sqr0Var4 = sqr0Var2;
            if (sqr0Var3.f170264y != sqr0Var4.f170264y) {
                i |= 4096;
            }
            if (sqr0Var3.f170265z != sqr0Var4.f170265z) {
                i |= 8192;
            }
            if (sqr0Var3.f170233A != sqr0Var4.f170233A) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.f111952b)) {
                Pair pairM169759a = oxy0.m169759a(sqr0Var3);
                Pair pairM169759a2 = oxy0.m169759a(sqr0Var4);
                if (pairM169759a != null && pairM169759a2 != null) {
                    int iIntValue = ((Integer) pairM169759a.first).intValue();
                    int iIntValue2 = ((Integer) pairM169759a2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new zwx0(this.f111951a, sqr0Var3, sqr0Var4, 3, 0);
                    }
                }
            }
            if (!sqr0Var3.m187561d(sqr0Var4)) {
                i |= 32;
            }
            if ("audio/opus".equals(this.f111952b)) {
                i |= 2;
            }
            if (i == 0) {
                return new zwx0(this.f111951a, sqr0Var3, sqr0Var4, 1, 0);
            }
        }
        return new zwx0(this.f111951a, sqr0Var3, sqr0Var4, 0, i);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m137548d(sqr0 sqr0Var) {
        return m137555m(sqr0Var) && m137554l(sqr0Var, false);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m137549e(sqr0 sqr0Var) throws zzth {
        int i;
        int i2;
        if (!m137555m(sqr0Var) || !m137554l(sqr0Var, true)) {
            return false;
        }
        if (this.f111958h) {
            int i3 = sqr0Var.f170256q;
            if (i3 <= 0 || (i2 = sqr0Var.f170257r) <= 0) {
                return true;
            }
            int i4 = mpw0.f137957a;
            return m137551g(i3, i2, sqr0Var.f170258s);
        }
        int i5 = mpw0.f137957a;
        int i6 = sqr0Var.f170265z;
        if (i6 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f111954d;
            if (codecCapabilities == null) {
                m137553j("sampleRate.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                m137553j("sampleRate.aCaps");
                return false;
            }
            if (!audioCapabilities.isSampleRateSupported(i6)) {
                m137553j("sampleRate.support, " + i6);
                return false;
            }
        }
        int i7 = sqr0Var.f170264y;
        if (i7 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.f111954d;
            if (codecCapabilities2 == null) {
                m137553j("channelCount.caps");
            } else {
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    m137553j("channelCount.aCaps");
                } else {
                    String str = this.f111951a;
                    String str2 = this.f111952b;
                    int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                    if (maxInputChannelCount <= 1 && ((mpw0.f137957a < 26 || maxInputChannelCount <= 0) && !DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG.equals(str2) && !DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_3GP.equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                        if ("audio/ac3".equals(str2)) {
                            i = 6;
                        } else {
                            i = "audio/eac3".equals(str2) ? 16 : 30;
                        }
                        y4w0.m214278f("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i + Constants.AES_SUFFIX);
                        maxInputChannelCount = i;
                    }
                    if (maxInputChannelCount < i7) {
                        m137553j("channelCount.support, " + i7);
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m137550f(sqr0 sqr0Var) {
        if (this.f111958h) {
            return this.f111955e;
        }
        Pair pairM169759a = oxy0.m169759a(sqr0Var);
        return pairM169759a != null && ((Integer) pairM169759a.first).intValue() == 42;
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: g */
    public final boolean m137551g(int i, int i2, double d) {
        int i3;
        int i4;
        double d2;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f111954d;
        if (codecCapabilities == null) {
            m137553j("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m137553j("sizeAndRate.vCaps");
            return false;
        }
        if (mpw0.f137957a >= 29) {
            i3 = i;
            i4 = i2;
            d2 = d;
            int iM127927a = fwy0.m127927a(videoCapabilities, this.f111952b, i3, i4, d2);
            if (iM127927a != 2) {
                if (iM127927a == 1) {
                    m137553j("sizeAndRate.cover, " + i3 + BaseSei.f14624X + i4 + "@" + d2);
                    return false;
                }
            }
            return true;
        }
        i3 = i;
        i4 = i2;
        d2 = d;
        if (!m137545k(videoCapabilities, i3, i4, d2)) {
            if (i3 >= i4 || (("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.f111951a) && "mcv5a".equals(mpw0.f137958b)) || !m137545k(videoCapabilities, i4, i3, d2))) {
                m137553j("sizeAndRate.support, " + i3 + BaseSei.f14624X + i4 + "@" + d2);
                return false;
            }
            y4w0.m214274b("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i3 + BaseSei.f14624X + i4 + "@" + d2) + "] [" + this.f111951a + ", " + this.f111952b + "] [" + mpw0.f137961e + Constants.AES_SUFFIX);
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final MediaCodecInfo.CodecProfileLevel[] m137552h() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f111954d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    /* JADX INFO: renamed from: j */
    public final void m137553j(String str) {
        y4w0.m214274b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f111951a + ", " + this.f111952b + "] [" + mpw0.f137961e + Constants.AES_SUFFIX);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0079  */
    /* JADX WARN: Code duplicated, block: B:33:0x007f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0082  */
    /* JADX WARN: Code duplicated, block: B:36:0x0087  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:39:0x008f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0092  */
    /* JADX WARN: Code duplicated, block: B:42:0x0097  */
    /* JADX WARN: Code duplicated, block: B:43:0x009a  */
    /* JADX WARN: Code duplicated, block: B:45:0x009f  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:51:0x00af  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d9  */
    /* JADX INFO: renamed from: l */
    public final boolean m137554l(sqr0 sqr0Var, boolean z) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrM137552h;
        int i;
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        int iIntValue;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair pairM169759a = oxy0.m169759a(sqr0Var);
        if (pairM169759a != null) {
            int iIntValue2 = ((Integer) pairM169759a.first).intValue();
            int iIntValue3 = ((Integer) pairM169759a.second).intValue();
            int i2 = 8;
            if ("video/dolby-vision".equals(sqr0Var.f170251l)) {
                if (YtVideoEncoder.MIME_TYPE.equals(this.f111952b)) {
                    iIntValue2 = 8;
                } else if ("video/hevc".equals(this.f111952b)) {
                    iIntValue2 = 2;
                }
                iIntValue3 = 0;
            }
            if (this.f111958h) {
                codecProfileLevelArrM137552h = m137552h();
                if (mpw0.f137957a <= 23 && "video/x-vnd.on2.vp9".equals(this.f111952b) && codecProfileLevelArrM137552h.length == 0) {
                    codecCapabilities = this.f111954d;
                    if (codecCapabilities != null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                        iIntValue = 0;
                    } else {
                        iIntValue = ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
                    }
                    if (iIntValue >= 180000000) {
                        i2 = 1024;
                    } else if (iIntValue >= 120000000) {
                        i2 = 512;
                    } else if (iIntValue >= 60000000) {
                        i2 = 256;
                    } else if (iIntValue >= 30000000) {
                        i2 = 128;
                    } else if (iIntValue >= 18000000) {
                        i2 = 64;
                    } else if (iIntValue >= 12000000) {
                        i2 = 32;
                    } else if (iIntValue >= 7200000) {
                        i2 = 16;
                    } else if (iIntValue < 3600000) {
                        if (iIntValue >= 1800000) {
                            i2 = 4;
                        } else if (iIntValue >= 800000) {
                            i2 = 2;
                        } else {
                            i2 = 1;
                        }
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.profile = 1;
                    codecProfileLevel.level = i2;
                    codecProfileLevelArrM137552h = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArrM137552h) {
                    if (codecProfileLevel2.profile != iIntValue2 && (codecProfileLevel2.level >= iIntValue3 || !z)) {
                        if ("video/hevc".equals(this.f111952b) && iIntValue2 == 2) {
                            String str = mpw0.f137958b;
                            if ("sailfish".equals(str) || "marlin".equals(str)) {
                            }
                        }
                    }
                }
                m137553j("codec.profileLevel, " + sqr0Var.f170248i + ", " + this.f111953c);
                return false;
            }
            if (iIntValue2 == 42) {
                iIntValue2 = 42;
                codecProfileLevelArrM137552h = m137552h();
                if (mpw0.f137957a <= 23) {
                    codecCapabilities = this.f111954d;
                    if (codecCapabilities != null) {
                        iIntValue = 0;
                    } else {
                        iIntValue = 0;
                    }
                    if (iIntValue >= 180000000) {
                        i2 = 1024;
                    } else if (iIntValue >= 120000000) {
                        i2 = 512;
                    } else if (iIntValue >= 60000000) {
                        i2 = 256;
                    } else if (iIntValue >= 30000000) {
                        i2 = 128;
                    } else if (iIntValue >= 18000000) {
                        i2 = 64;
                    } else if (iIntValue >= 12000000) {
                        i2 = 32;
                    } else if (iIntValue >= 7200000) {
                        i2 = 16;
                    } else if (iIntValue < 3600000) {
                        if (iIntValue >= 1800000) {
                            i2 = 4;
                        } else if (iIntValue >= 800000) {
                            i2 = 2;
                        } else {
                            i2 = 1;
                        }
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel3 = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel3.profile = 1;
                    codecProfileLevel3.level = i2;
                    codecProfileLevelArrM137552h = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel3};
                }
                while (i < r5) {
                    if (codecProfileLevel2.profile != iIntValue2) {
                    }
                }
                m137553j("codec.profileLevel, " + sqr0Var.f170248i + ", " + this.f111953c);
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m137555m(sqr0 sqr0Var) {
        return this.f111952b.equals(sqr0Var.f170251l) || this.f111952b.equals(oxy0.m169761c(sqr0Var));
    }

    public final String toString() {
        return this.f111951a;
    }
}
