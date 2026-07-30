package p149l;

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
public final class bny0 {

    /* JADX INFO: renamed from: a */
    public final String f76460a;

    /* JADX INFO: renamed from: b */
    public final String f76461b;

    /* JADX INFO: renamed from: c */
    public final String f76462c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final MediaCodecInfo.CodecCapabilities f76463d;

    /* JADX INFO: renamed from: e */
    public final boolean f76464e;

    /* JADX INFO: renamed from: f */
    public final boolean f76465f;

    /* JADX INFO: renamed from: g */
    public final boolean f76466g;

    /* JADX INFO: renamed from: h */
    public final boolean f76467h;

    @VisibleForTesting
    public bny0(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.f76460a = str;
        this.f76461b = str2;
        this.f76462c = str3;
        this.f76463d = codecCapabilities;
        this.f76466g = z;
        this.f76464e = z4;
        this.f76465f = z6;
        this.f76467h = uys0.m196371h(str2);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003b  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX INFO: renamed from: c */
    public static bny0 m102875c(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        boolean z7;
        boolean z8;
        if (codecCapabilities != null) {
            int i = ggw0.f102568a;
            if (codecCapabilities.isFeatureSupported("adaptive-playback")) {
                if (ggw0.f102568a <= 22) {
                    String str4 = ggw0.f102571d;
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
            int i2 = ggw0.f102568a;
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
                int i3 = ggw0.f102568a;
                if (codecCapabilities.isFeatureSupported("secure-playback")) {
                    z8 = true;
                }
            }
            z8 = false;
        }
        return new bny0(str, str2, str3, codecCapabilities, z, z2, z3, z6, z7, z8);
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: i */
    public static Point m102876i(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i3 = ggw0.f102568a;
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: k */
    public static boolean m102877k(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point pointM102876i = m102876i(videoCapabilities, i, i2);
        int i3 = pointM102876i.x;
        int i4 = pointM102876i.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    @Nullable
    @RequiresApi(21)
    /* JADX INFO: renamed from: a */
    public final Point m102878a(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f76463d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return m102876i(videoCapabilities, i, i2);
    }

    /* JADX INFO: renamed from: b */
    public final tnx0 m102879b(mhr0 mhr0Var, mhr0 mhr0Var2) {
        mhr0 mhr0Var3;
        mhr0 mhr0Var4;
        int i = true != ggw0.m126064f(mhr0Var.f133892l, mhr0Var2.f133892l) ? 8 : 0;
        if (this.f76467h) {
            if (mhr0Var.f133900t != mhr0Var2.f133900t) {
                i |= 1024;
            }
            if (!this.f76464e && (mhr0Var.f133897q != mhr0Var2.f133897q || mhr0Var.f133898r != mhr0Var2.f133898r)) {
                i |= 512;
            }
            if (!ggw0.m126064f(mhr0Var.f133904x, mhr0Var2.f133904x)) {
                i |= 2048;
            }
            String str = this.f76460a;
            if (ggw0.f102571d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !mhr0Var.m154636d(mhr0Var2)) {
                i |= 2;
            }
            if (i == 0) {
                return new tnx0(this.f76460a, mhr0Var, mhr0Var2, true != mhr0Var.m154636d(mhr0Var2) ? 2 : 3, 0);
            }
            mhr0Var3 = mhr0Var;
            mhr0Var4 = mhr0Var2;
        } else {
            mhr0Var3 = mhr0Var;
            mhr0Var4 = mhr0Var2;
            if (mhr0Var3.f133905y != mhr0Var4.f133905y) {
                i |= 4096;
            }
            if (mhr0Var3.f133906z != mhr0Var4.f133906z) {
                i |= 8192;
            }
            if (mhr0Var3.f133874A != mhr0Var4.f133874A) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.f76461b)) {
                Pair pairM137400a = ioy0.m137400a(mhr0Var3);
                Pair pairM137400a2 = ioy0.m137400a(mhr0Var4);
                if (pairM137400a != null && pairM137400a2 != null) {
                    int iIntValue = ((Integer) pairM137400a.first).intValue();
                    int iIntValue2 = ((Integer) pairM137400a2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new tnx0(this.f76460a, mhr0Var3, mhr0Var4, 3, 0);
                    }
                }
            }
            if (!mhr0Var3.m154636d(mhr0Var4)) {
                i |= 32;
            }
            if ("audio/opus".equals(this.f76461b)) {
                i |= 2;
            }
            if (i == 0) {
                return new tnx0(this.f76460a, mhr0Var3, mhr0Var4, 1, 0);
            }
        }
        return new tnx0(this.f76460a, mhr0Var3, mhr0Var4, 0, i);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m102880d(mhr0 mhr0Var) {
        return m102887m(mhr0Var) && m102886l(mhr0Var, false);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m102881e(mhr0 mhr0Var) throws zzth {
        int i;
        int i2;
        if (!m102887m(mhr0Var) || !m102886l(mhr0Var, true)) {
            return false;
        }
        if (this.f76467h) {
            int i3 = mhr0Var.f133897q;
            if (i3 <= 0 || (i2 = mhr0Var.f133898r) <= 0) {
                return true;
            }
            int i4 = ggw0.f102568a;
            return m102883g(i3, i2, mhr0Var.f133899s);
        }
        int i5 = ggw0.f102568a;
        int i6 = mhr0Var.f133906z;
        if (i6 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f76463d;
            if (codecCapabilities == null) {
                m102885j("sampleRate.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                m102885j("sampleRate.aCaps");
                return false;
            }
            if (!audioCapabilities.isSampleRateSupported(i6)) {
                m102885j("sampleRate.support, " + i6);
                return false;
            }
        }
        int i7 = mhr0Var.f133905y;
        if (i7 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.f76463d;
            if (codecCapabilities2 == null) {
                m102885j("channelCount.caps");
            } else {
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    m102885j("channelCount.aCaps");
                } else {
                    String str = this.f76460a;
                    String str2 = this.f76461b;
                    int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                    if (maxInputChannelCount <= 1 && ((ggw0.f102568a < 26 || maxInputChannelCount <= 0) && !DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG.equals(str2) && !DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_3GP.equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                        if ("audio/ac3".equals(str2)) {
                            i = 6;
                        } else {
                            i = "audio/eac3".equals(str2) ? 16 : 30;
                        }
                        svv0.m186111f("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i + Constants.AES_SUFFIX);
                        maxInputChannelCount = i;
                    }
                    if (maxInputChannelCount < i7) {
                        m102885j("channelCount.support, " + i7);
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m102882f(mhr0 mhr0Var) {
        if (this.f76467h) {
            return this.f76464e;
        }
        Pair pairM137400a = ioy0.m137400a(mhr0Var);
        return pairM137400a != null && ((Integer) pairM137400a.first).intValue() == 42;
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: g */
    public final boolean m102883g(int i, int i2, double d) {
        int i3;
        int i4;
        double d2;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f76463d;
        if (codecCapabilities == null) {
            m102885j("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m102885j("sizeAndRate.vCaps");
            return false;
        }
        if (ggw0.f102568a >= 29) {
            i3 = i;
            i4 = i2;
            d2 = d;
            int iM219387a = zmy0.m219387a(videoCapabilities, this.f76461b, i3, i4, d2);
            if (iM219387a != 2) {
                if (iM219387a == 1) {
                    m102885j("sizeAndRate.cover, " + i3 + BaseSei.f13930X + i4 + "@" + d2);
                    return false;
                }
            }
            return true;
        }
        i3 = i;
        i4 = i2;
        d2 = d;
        if (!m102877k(videoCapabilities, i3, i4, d2)) {
            if (i3 >= i4 || (("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.f76460a) && "mcv5a".equals(ggw0.f102569b)) || !m102877k(videoCapabilities, i4, i3, d2))) {
                m102885j("sizeAndRate.support, " + i3 + BaseSei.f13930X + i4 + "@" + d2);
                return false;
            }
            svv0.m186107b("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i3 + BaseSei.f13930X + i4 + "@" + d2) + "] [" + this.f76460a + ", " + this.f76461b + "] [" + ggw0.f102572e + Constants.AES_SUFFIX);
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final MediaCodecInfo.CodecProfileLevel[] m102884h() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f76463d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    /* JADX INFO: renamed from: j */
    public final void m102885j(String str) {
        svv0.m186107b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f76460a + ", " + this.f76461b + "] [" + ggw0.f102572e + Constants.AES_SUFFIX);
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
    public final boolean m102886l(mhr0 mhr0Var, boolean z) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrM102884h;
        int i;
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        int iIntValue;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair pairM137400a = ioy0.m137400a(mhr0Var);
        if (pairM137400a != null) {
            int iIntValue2 = ((Integer) pairM137400a.first).intValue();
            int iIntValue3 = ((Integer) pairM137400a.second).intValue();
            int i2 = 8;
            if ("video/dolby-vision".equals(mhr0Var.f133892l)) {
                if (YtVideoEncoder.MIME_TYPE.equals(this.f76461b)) {
                    iIntValue2 = 8;
                } else if ("video/hevc".equals(this.f76461b)) {
                    iIntValue2 = 2;
                }
                iIntValue3 = 0;
            }
            if (this.f76467h) {
                codecProfileLevelArrM102884h = m102884h();
                if (ggw0.f102568a <= 23 && "video/x-vnd.on2.vp9".equals(this.f76461b) && codecProfileLevelArrM102884h.length == 0) {
                    codecCapabilities = this.f76463d;
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
                    codecProfileLevelArrM102884h = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArrM102884h) {
                    if (codecProfileLevel2.profile != iIntValue2 && (codecProfileLevel2.level >= iIntValue3 || !z)) {
                        if ("video/hevc".equals(this.f76461b) && iIntValue2 == 2) {
                            String str = ggw0.f102569b;
                            if ("sailfish".equals(str) || "marlin".equals(str)) {
                            }
                        }
                    }
                }
                m102885j("codec.profileLevel, " + mhr0Var.f133889i + ", " + this.f76462c);
                return false;
            }
            if (iIntValue2 == 42) {
                iIntValue2 = 42;
                codecProfileLevelArrM102884h = m102884h();
                if (ggw0.f102568a <= 23) {
                    codecCapabilities = this.f76463d;
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
                    codecProfileLevelArrM102884h = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel3};
                }
                while (i < r5) {
                    if (codecProfileLevel2.profile != iIntValue2) {
                    }
                }
                m102885j("codec.profileLevel, " + mhr0Var.f133889i + ", " + this.f76462c);
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m102887m(mhr0 mhr0Var) {
        return this.f76461b.equals(mhr0Var.f133892l) || this.f76461b.equals(ioy0.m137402c(mhr0Var));
    }

    public final String toString() {
        return this.f76460a;
    }
}
