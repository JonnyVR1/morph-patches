package com.google.android.exoplayer2.mediacodec;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.cosmos.photon.push.thirdparty.ThirdPushManager;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.mediacodec.C1908d;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.common.collect.ImmutableList;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.eclipse.jetty.http.HttpTokens;
import p153l.bmk0;
import p153l.df5;
import p153l.i11;
import p153l.kb00;
import p153l.kyv;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"InlinedApi"})
@Deprecated
public final class MediaCodecUtil {

    /* JADX INFO: renamed from: a */
    public static final Pattern f7911a = Pattern.compile("^\\D?(\\d+)$");

    /* JADX INFO: renamed from: b */
    @GuardedBy("MediaCodecUtil.class")
    public static final HashMap<C1900b, List<C1908d>> f7912b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public static int f7913c = -1;

    public static class DecoderQueryException extends Exception {
        private DecoderQueryException(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$b */
    public static final class C1900b {

        /* JADX INFO: renamed from: a */
        public final String f7914a;

        /* JADX INFO: renamed from: b */
        public final boolean f7915b;

        /* JADX INFO: renamed from: c */
        public final boolean f7916c;

        public C1900b(String str, boolean z, boolean z2) {
            this.f7914a = str;
            this.f7915b = z;
            this.f7916c = z2;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == C1900b.class) {
                C1900b c1900b = (C1900b) obj;
                if (TextUtils.equals(this.f7914a, c1900b.f7914a) && this.f7915b == c1900b.f7915b && this.f7916c == c1900b.f7916c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((this.f7914a.hashCode() + 31) * 31) + (this.f7915b ? 1231 : 1237)) * 31) + (this.f7916c ? 1231 : 1237);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$c */
    public interface InterfaceC1901c {
        /* JADX INFO: renamed from: a */
        boolean mo10519a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* JADX INFO: renamed from: b */
        MediaCodecInfo mo10520b(int i);

        /* JADX INFO: renamed from: c */
        boolean mo10521c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* JADX INFO: renamed from: d */
        int mo10522d();

        /* JADX INFO: renamed from: e */
        boolean mo10523e();
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$d */
    public static final class C1902d implements InterfaceC1901c {
        public C1902d() {
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.InterfaceC1901c
        /* JADX INFO: renamed from: a */
        public boolean mo10519a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.InterfaceC1901c
        /* JADX INFO: renamed from: b */
        public MediaCodecInfo mo10520b(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.InterfaceC1901c
        /* JADX INFO: renamed from: c */
        public boolean mo10521c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && YtVideoEncoder.MIME_TYPE.equals(str2);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.InterfaceC1901c
        /* JADX INFO: renamed from: d */
        public int mo10522d() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.InterfaceC1901c
        /* JADX INFO: renamed from: e */
        public boolean mo10523e() {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$e */
    @RequiresApi(21)
    public static final class C1903e implements InterfaceC1901c {

        /* JADX INFO: renamed from: a */
        public final int f7917a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public MediaCodecInfo[] f7918b;

        public C1903e(boolean z, boolean z2) {
            this.f7917a = (z || z2) ? 1 : 0;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.InterfaceC1901c
        /* JADX INFO: renamed from: a */
        public boolean mo10519a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.InterfaceC1901c
        /* JADX INFO: renamed from: b */
        public MediaCodecInfo mo10520b(int i) {
            m10524f();
            return this.f7918b[i];
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.InterfaceC1901c
        /* JADX INFO: renamed from: c */
        public boolean mo10521c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.InterfaceC1901c
        /* JADX INFO: renamed from: d */
        public int mo10522d() {
            m10524f();
            return this.f7918b.length;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.InterfaceC1901c
        /* JADX INFO: renamed from: e */
        public boolean mo10523e() {
            return true;
        }

        @EnsuresNonNull({"mediaCodecInfos"})
        /* JADX INFO: renamed from: f */
        public final void m10524f() {
            if (this.f7918b == null) {
                this.f7918b = new MediaCodecList(this.f7917a).getCodecInfos();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$f */
    public interface InterfaceC1904f<T> {
        /* JADX INFO: renamed from: a */
        int mo10525a(T t);
    }

    @Nullable
    /* JADX INFO: renamed from: A */
    public static Pair<Integer, Integer> m10477A(String str, String[] strArr) {
        if (strArr.length < 3) {
            kyv.m152151i("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
        try {
            int i = Integer.parseInt(strArr[1]);
            int i2 = Integer.parseInt(strArr[2]);
            int iM10492P = m10492P(i);
            if (iM10492P == -1) {
                kyv.m152151i("MediaCodecUtil", "Unknown VP9 profile: " + i);
                return null;
            }
            int iM10491O = m10491O(i2);
            if (iM10491O != -1) {
                return new Pair<>(Integer.valueOf(iM10492P), Integer.valueOf(iM10491O));
            }
            kyv.m152151i("MediaCodecUtil", "Unknown VP9 level: " + i2);
            return null;
        } catch (NumberFormatException unused) {
            kyv.m152151i("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    /* JADX INFO: renamed from: B */
    public static Integer m10478B(@Nullable String str) {
        if (str == null) {
            return null;
        }
        byte b = -1;
        switch (str.hashCode()) {
            case 70821:
                if (str.equals("H30")) {
                    b = 0;
                }
                break;
            case 70914:
                if (str.equals("H60")) {
                    b = 1;
                }
                break;
            case 70917:
                if (str.equals("H63")) {
                    b = 2;
                }
                break;
            case 71007:
                if (str.equals("H90")) {
                    b = 3;
                }
                break;
            case 71010:
                if (str.equals("H93")) {
                    b = 4;
                }
                break;
            case 74665:
                if (str.equals("L30")) {
                    b = 5;
                }
                break;
            case 74758:
                if (str.equals("L60")) {
                    b = 6;
                }
                break;
            case 74761:
                if (str.equals("L63")) {
                    b = 7;
                }
                break;
            case 74851:
                if (str.equals("L90")) {
                    b = 8;
                }
                break;
            case 74854:
                if (str.equals("L93")) {
                    b = 9;
                }
                break;
            case 2193639:
                if (str.equals("H120")) {
                    b = 10;
                }
                break;
            case 2193642:
                if (str.equals("H123")) {
                    b = 11;
                }
                break;
            case 2193732:
                if (str.equals("H150")) {
                    b = 12;
                }
                break;
            case 2193735:
                if (str.equals("H153")) {
                    b = HttpTokens.CARRIAGE_RETURN;
                }
                break;
            case 2193738:
                if (str.equals("H156")) {
                    b = 14;
                }
                break;
            case 2193825:
                if (str.equals("H180")) {
                    b = 15;
                }
                break;
            case 2193828:
                if (str.equals("H183")) {
                    b = 16;
                }
                break;
            case 2193831:
                if (str.equals("H186")) {
                    b = 17;
                }
                break;
            case 2312803:
                if (str.equals("L120")) {
                    b = 18;
                }
                break;
            case 2312806:
                if (str.equals("L123")) {
                    b = 19;
                }
                break;
            case 2312896:
                if (str.equals("L150")) {
                    b = 20;
                }
                break;
            case 2312899:
                if (str.equals("L153")) {
                    b = 21;
                }
                break;
            case 2312902:
                if (str.equals("L156")) {
                    b = 22;
                }
                break;
            case 2312989:
                if (str.equals("L180")) {
                    b = 23;
                }
                break;
            case 2312992:
                if (str.equals("L183")) {
                    b = 24;
                }
                break;
            case 2312995:
                if (str.equals("L186")) {
                    b = 25;
                }
                break;
        }
        switch (b) {
            case 0:
                return 2;
            case 1:
                return 8;
            case 2:
                return 32;
            case 3:
                return 128;
            case 4:
                return 512;
            case 5:
                return 1;
            case 6:
                return 4;
            case 7:
                return 16;
            case 8:
                return 64;
            case 9:
                return 256;
            case 10:
                return 2048;
            case 11:
                return 8192;
            case 12:
                return 32768;
            case 13:
                return 131072;
            case 14:
                return 524288;
            case 15:
                return 2097152;
            case 16:
                return 8388608;
            case 17:
                return 33554432;
            case 18:
                return 1024;
            case 19:
                return 4096;
            case 20:
                return 16384;
            case 21:
                return 65536;
            case 22:
                return 262144;
            case 23:
                return 1048576;
            case 24:
                return 4194304;
            case 25:
                return 16777216;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: C */
    public static boolean m10479C(MediaCodecInfo mediaCodecInfo) {
        return bmk0.f77313a >= 29 && m10480D(mediaCodecInfo);
    }

    @RequiresApi(29)
    /* JADX INFO: renamed from: D */
    public static boolean m10480D(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    /* JADX INFO: renamed from: E */
    public static boolean m10481E(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = bmk0.f77313a;
        if (i < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = bmk0.f77314b;
            if ("a70".equals(str3) || (ThirdPushManager.VENDOR_TYPE_XIAOMI.equals(bmk0.f77315c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = bmk0.f77314b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = bmk0.f77314b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(bmk0.f77315c))) {
            String str6 = bmk0.f77314b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(bmk0.f77315c)) {
            String str7 = bmk0.f77314b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i <= 19 && bmk0.f77314b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (i <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    /* JADX INFO: renamed from: F */
    public static boolean m10482F(MediaCodecInfo mediaCodecInfo, String str) {
        return bmk0.f77313a >= 29 ? m10483G(mediaCodecInfo) : !m10484H(mediaCodecInfo, str);
    }

    @RequiresApi(29)
    /* JADX INFO: renamed from: G */
    public static boolean m10483G(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    /* JADX INFO: renamed from: H */
    public static boolean m10484H(MediaCodecInfo mediaCodecInfo, String str) {
        if (bmk0.f77313a >= 29) {
            return m10485I(mediaCodecInfo);
        }
        if (kb00.m149014o(str)) {
            return true;
        }
        String strM138051e = i11.m138051e(mediaCodecInfo.getName());
        if (strM138051e.startsWith("arc.")) {
            return false;
        }
        return strM138051e.startsWith("omx.google.") || strM138051e.startsWith("omx.ffmpeg.") || (strM138051e.startsWith("omx.sec.") && strM138051e.contains(".sw.")) || strM138051e.equals("omx.qcom.video.decoder.hevcswvdec") || strM138051e.startsWith("c2.android.") || strM138051e.startsWith("c2.google.") || !(strM138051e.startsWith("omx.") || strM138051e.startsWith("c2."));
    }

    @RequiresApi(29)
    /* JADX INFO: renamed from: I */
    public static boolean m10485I(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    /* JADX INFO: renamed from: J */
    public static boolean m10486J(MediaCodecInfo mediaCodecInfo) {
        if (bmk0.f77313a >= 29) {
            return m10487K(mediaCodecInfo);
        }
        String strM138051e = i11.m138051e(mediaCodecInfo.getName());
        return (strM138051e.startsWith("omx.google.") || strM138051e.startsWith("c2.android.") || strM138051e.startsWith("c2.google.")) ? false : true;
    }

    @RequiresApi(29)
    /* JADX INFO: renamed from: K */
    public static boolean m10487K(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    /* JADX INFO: renamed from: L */
    public static int m10488L() throws DecoderQueryException {
        if (f7913c == -1) {
            int iMax = 0;
            C1908d c1908dM10511s = m10511s(YtVideoEncoder.MIME_TYPE, false, false);
            if (c1908dM10511s != null) {
                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrM10567h = c1908dM10511s.m10567h();
                int length = codecProfileLevelArrM10567h.length;
                int iMax2 = 0;
                while (iMax < length) {
                    iMax2 = Math.max(m10500h(codecProfileLevelArrM10567h[iMax].level), iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, bmk0.f77313a >= 21 ? 345600 : 172800);
            }
            f7913c = iMax;
        }
        return f7913c;
    }

    /* JADX INFO: renamed from: M */
    public static int m10489M(int i) {
        int i2 = 17;
        if (i != 17) {
            i2 = 20;
            if (i != 20) {
                i2 = 23;
                if (i != 23) {
                    i2 = 29;
                    if (i != 29) {
                        i2 = 39;
                        if (i != 39) {
                            i2 = 42;
                            if (i != 42) {
                                switch (i) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: N */
    public static <T> void m10490N(List<T> list, final InterfaceC1904f<T> interfaceC1904f) {
        Collections.sort(list, new Comparator() { // from class: l.urx
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return MediaCodecUtil.m10493a(interfaceC1904f, obj, obj2);
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public static int m10491O(int i) {
        if (i == 10) {
            return 1;
        }
        if (i == 11) {
            return 2;
        }
        if (i == 20) {
            return 4;
        }
        if (i == 21) {
            return 8;
        }
        if (i == 30) {
            return 16;
        }
        if (i == 31) {
            return 32;
        }
        if (i == 40) {
            return 64;
        }
        if (i == 41) {
            return 128;
        }
        if (i == 50) {
            return 256;
        }
        if (i == 51) {
            return 512;
        }
        switch (i) {
            case 60:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: P */
    public static int m10492P(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? -1 : 8;
        }
        return 4;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m10493a(InterfaceC1904f interfaceC1904f, Object obj, Object obj2) {
        return interfaceC1904f.mo10525a(obj2) - interfaceC1904f.mo10525a(obj);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m10494b(C1908d c1908d) {
        String str = c1908d.f7936a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (bmk0.f77313a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m10495c(C1908d c1908d) {
        return c1908d.f7936a.startsWith("OMX.google") ? 1 : 0;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m10496d(C1894k c1894k, C1908d c1908d) {
        return c1908d.m10571n(c1894k) ? 1 : 0;
    }

    /* JADX INFO: renamed from: e */
    public static void m10497e(String str, List<C1908d> list) {
        if ("audio/raw".equals(str)) {
            if (bmk0.f77313a < 26 && bmk0.f77314b.equals("R9") && list.size() == 1 && list.get(0).f7936a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(C1908d.m10552F("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            m10490N(list, new InterfaceC1904f() { // from class: l.rrx
                @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.InterfaceC1904f
                /* JADX INFO: renamed from: a */
                public final int mo10525a(Object obj) {
                    return MediaCodecUtil.m10494b((C1908d) obj);
                }
            });
        }
        int i = bmk0.f77313a;
        if (i < 21 && list.size() > 1) {
            String str2 = list.get(0).f7936a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                m10490N(list, new InterfaceC1904f() { // from class: l.srx
                    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.InterfaceC1904f
                    /* JADX INFO: renamed from: a */
                    public final int mo10525a(Object obj) {
                        return MediaCodecUtil.m10495c((C1908d) obj);
                    }
                });
            }
        }
        if (i >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(list.get(0).f7936a)) {
            return;
        }
        list.add(list.remove(0));
    }

    /* JADX INFO: renamed from: f */
    public static int m10498f(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return 1048576;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m10499g(int i) {
        switch (i) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m10500h(int i) {
        if (i == 1 || i == 2) {
            return 25344;
        }
        switch (i) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            case 131072:
            case 262144:
            case 524288:
                return 35651584;
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: i */
    public static int m10501i(int i) {
        if (i == 66) {
            return 1;
        }
        if (i == 77) {
            return 2;
        }
        if (i == 88) {
            return 4;
        }
        if (i == 100) {
            return 8;
        }
        if (i == 110) {
            return 16;
        }
        if (i != 122) {
            return i != 244 ? -1 : 64;
        }
        return 32;
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public static Integer m10502j(@Nullable String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "01":
                return 1;
            case "02":
                return 2;
            case "03":
                return 4;
            case "04":
                return 8;
            case "05":
                return 16;
            case "06":
                return 32;
            case "07":
                return 64;
            case "08":
                return 128;
            case "09":
                return 256;
            case "10":
                return 512;
            case "11":
                return 1024;
            case "12":
                return 2048;
            case "13":
                return 4096;
            default:
                return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public static Integer m10503k(@Nullable String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "00":
                return 1;
            case "01":
                return 2;
            case "02":
                return 4;
            case "03":
                return 8;
            case "04":
                return 16;
            case "05":
                return 32;
            case "06":
                return 64;
            case "07":
                return 128;
            case "08":
                return 256;
            case "09":
                return 512;
            default:
                return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public static Pair<Integer, Integer> m10504l(String str, String[] strArr) {
        int iM10489M;
        if (strArr.length != 3) {
            kyv.m152151i("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(kb00.m149007h(Integer.parseInt(strArr[1], 16))) && (iM10489M = m10489M(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair<>(Integer.valueOf(iM10489M), 0);
            }
        } catch (NumberFormatException unused) {
            kyv.m152151i("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public static String m10505m(C1894k c1894k) {
        Pair<Integer, Integer> pairM10510r;
        if ("audio/eac3-joc".equals(c1894k.f7785l)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(c1894k.f7785l) || (pairM10510r = m10510r(c1894k)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairM10510r.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return YtVideoEncoder.MIME_TYPE;
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static List<C1908d> m10506n(InterfaceC1909e interfaceC1909e, C1894k c1894k, boolean z, boolean z2) throws DecoderQueryException {
        String strM10505m = m10505m(c1894k);
        return strM10505m == null ? ImmutableList.m15739of() : interfaceC1909e.mo10580a(strM10505m, z, z2);
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public static Pair<Integer, Integer> m10507o(String str, String[] strArr, @Nullable df5 df5Var) {
        int i;
        if (strArr.length < 4) {
            kyv.m152151i("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
        int i2 = 1;
        try {
            int i3 = Integer.parseInt(strArr[1]);
            int i4 = Integer.parseInt(strArr[2].substring(0, 2));
            int i5 = Integer.parseInt(strArr[3]);
            if (i3 != 0) {
                kyv.m152151i("MediaCodecUtil", "Unknown AV1 profile: " + i3);
                return null;
            }
            if (i5 != 8 && i5 != 10) {
                kyv.m152151i("MediaCodecUtil", "Unknown AV1 bit depth: " + i5);
                return null;
            }
            if (i5 != 8) {
                i2 = (df5Var == null || !(df5Var.f88126d != null || (i = df5Var.f88125c) == 7 || i == 6)) ? 2 : 4096;
            }
            int iM10498f = m10498f(i4);
            if (iM10498f != -1) {
                return new Pair<>(Integer.valueOf(i2), Integer.valueOf(iM10498f));
            }
            kyv.m152151i("MediaCodecUtil", "Unknown AV1 level: " + i4);
            return null;
        } catch (NumberFormatException unused) {
            kyv.m152151i("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public static Pair<Integer, Integer> m10508p(String str, String[] strArr) {
        int i;
        int i2;
        if (strArr.length < 2) {
            kyv.m152151i("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i2 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i = Integer.parseInt(strArr[1].substring(4), 16);
            } else {
                if (strArr.length < 3) {
                    kyv.m152151i("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                    return null;
                }
                int i3 = Integer.parseInt(strArr[1]);
                i = Integer.parseInt(strArr[2]);
                i2 = i3;
            }
            int iM10501i = m10501i(i2);
            if (iM10501i == -1) {
                kyv.m152151i("MediaCodecUtil", "Unknown AVC profile: " + i2);
                return null;
            }
            int iM10499g = m10499g(i);
            if (iM10499g != -1) {
                return new Pair<>(Integer.valueOf(iM10501i), Integer.valueOf(iM10499g));
            }
            kyv.m152151i("MediaCodecUtil", "Unknown AVC level: " + i);
            return null;
        } catch (NumberFormatException unused) {
            kyv.m152151i("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public static String m10509q(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public static Pair<Integer, Integer> m10510r(C1894k c1894k) {
        String str = c1894k.f7782i;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        if ("video/dolby-vision".equals(c1894k.f7785l)) {
            return m10517y(c1894k.f7782i, strArrSplit);
        }
        byte b = 0;
        String str2 = strArrSplit[0];
        str2.getClass();
        switch (str2.hashCode()) {
            case 3004662:
                if (!str2.equals("av01")) {
                    b = -1;
                }
                break;
            case 3006243:
                b = !str2.equals(VisualSampleEntry.TYPE3) ? (byte) -1 : (byte) 1;
                break;
            case 3006244:
                b = !str2.equals("avc2") ? (byte) -1 : (byte) 2;
                break;
            case 3199032:
                b = !str2.equals(VisualSampleEntry.TYPE7) ? (byte) -1 : (byte) 3;
                break;
            case 3214780:
                b = !str2.equals(VisualSampleEntry.TYPE6) ? (byte) -1 : (byte) 4;
                break;
            case 3356560:
                b = !str2.equals(AudioSampleEntry.TYPE3) ? (byte) -1 : (byte) 5;
                break;
            case 3624515:
                b = !str2.equals("vp09") ? (byte) -1 : (byte) 6;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return m10507o(c1894k.f7782i, strArrSplit, c1894k.f7797x);
            case 1:
            case 2:
                return m10508p(c1894k.f7782i, strArrSplit);
            case 3:
            case 4:
                return m10518z(c1894k.f7782i, strArrSplit, c1894k.f7797x);
            case 5:
                return m10504l(c1894k.f7782i, strArrSplit);
            case 6:
                return m10477A(c1894k.f7782i, strArrSplit);
            default:
                return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public static C1908d m10511s(String str, boolean z, boolean z2) throws DecoderQueryException {
        List<C1908d> listM10512t = m10512t(str, z, z2);
        if (listM10512t.isEmpty()) {
            return null;
        }
        return listM10512t.get(0);
    }

    /* JADX INFO: renamed from: t */
    public static synchronized List<C1908d> m10512t(String str, boolean z, boolean z2) throws DecoderQueryException {
        try {
            C1900b c1900b = new C1900b(str, z, z2);
            HashMap<C1900b, List<C1908d>> map = f7912b;
            List<C1908d> list = map.get(c1900b);
            if (list != null) {
                return list;
            }
            int i = bmk0.f77313a;
            ArrayList<C1908d> arrayListM10513u = m10513u(c1900b, i >= 21 ? new C1903e(z, z2) : new C1902d());
            if (z && arrayListM10513u.isEmpty() && 21 <= i && i <= 23) {
                arrayListM10513u = m10513u(c1900b, new C1902d());
                if (!arrayListM10513u.isEmpty()) {
                    kyv.m152151i("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + arrayListM10513u.get(0).f7936a);
                }
            }
            m10497e(str, arrayListM10513u);
            ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) arrayListM10513u);
            map.put(c1900b, immutableListCopyOf);
            return immutableListCopyOf;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x008b A[PHI: r16
      0x008b: PHI (r16v9 boolean) = (r16v5 boolean), (r16v11 boolean) binds: [B:41:0x009b, B:33:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x00fa A[Catch: Exception -> 0x0144, TRY_ENTER, TryCatch #4 {Exception -> 0x0144, blocks: (B:3:0x0008, B:5:0x001b, B:68:0x0119, B:8:0x002b, B:11:0x0036, B:62:0x00f2, B:65:0x00fa, B:67:0x0100, B:69:0x0121, B:70:0x0142), top: B:83:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0121 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX INFO: renamed from: u */
    public static ArrayList<C1908d> m10513u(C1900b c1900b, InterfaceC1901c interfaceC1901c) throws DecoderQueryException {
        int i;
        boolean z;
        boolean z2;
        C1900b c1900b2 = c1900b;
        try {
            ArrayList<C1908d> arrayList = new ArrayList<>();
            String str = c1900b2.f7914a;
            int iMo10522d = interfaceC1901c.mo10522d();
            boolean zMo10523e = interfaceC1901c.mo10523e();
            int i2 = 0;
            while (i2 < iMo10522d) {
                MediaCodecInfo mediaCodecInfoMo10520b = interfaceC1901c.mo10520b(i2);
                if (m10479C(mediaCodecInfoMo10520b)) {
                    z = zMo10523e;
                    i = i2;
                } else {
                    String name = mediaCodecInfoMo10520b.getName();
                    if (m10481E(mediaCodecInfoMo10520b, name, zMo10523e, str)) {
                        int i3 = i2;
                        String strM10509q = m10509q(mediaCodecInfoMo10520b, name, str);
                        if (strM10509q == null) {
                            z = zMo10523e;
                            i = i3;
                        } else {
                            boolean z3 = zMo10523e;
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoMo10520b.getCapabilitiesForType(strM10509q);
                                boolean zMo10521c = interfaceC1901c.mo10521c("tunneled-playback", strM10509q, capabilitiesForType);
                                boolean zMo10519a = interfaceC1901c.mo10519a("tunneled-playback", strM10509q, capabilitiesForType);
                                boolean z4 = c1900b2.f7916c;
                                if ((z4 || !zMo10519a) && (!z4 || zMo10521c)) {
                                    boolean zMo10521c2 = interfaceC1901c.mo10521c("secure-playback", strM10509q, capabilitiesForType);
                                    boolean zMo10519a2 = interfaceC1901c.mo10519a("secure-playback", strM10509q, capabilitiesForType);
                                    boolean z5 = c1900b2.f7915b;
                                    if ((z5 || !zMo10519a2) && (!z5 || zMo10521c2)) {
                                        try {
                                            boolean zM10482F = m10482F(mediaCodecInfoMo10520b, str);
                                            try {
                                                boolean zM10484H = m10484H(mediaCodecInfoMo10520b, str);
                                                boolean zM10486J = m10486J(mediaCodecInfoMo10520b);
                                                if (z3) {
                                                    z2 = zM10486J;
                                                    if (c1900b2.f7915b == zMo10521c2) {
                                                        z = z3;
                                                        boolean z6 = z2;
                                                        i = i3;
                                                        try {
                                                            arrayList.add(C1908d.m10552F(name, str, strM10509q, capabilitiesForType, zM10482F, zM10484H, z6, false, false));
                                                        } catch (Exception e) {
                                                            e = e;
                                                            if (bmk0.f77313a <= 23) {
                                                            }
                                                            kyv.m152145c("MediaCodecUtil", "Failed to query codec " + r6 + " (" + strM10509q + ")");
                                                            throw e;
                                                        }
                                                    }
                                                } else {
                                                    z2 = zM10486J;
                                                }
                                                if (!z3) {
                                                    try {
                                                        if (!c1900b2.f7915b) {
                                                            z = z3;
                                                            boolean z7 = z2;
                                                            i = i3;
                                                            arrayList.add(C1908d.m10552F(name, str, strM10509q, capabilitiesForType, zM10482F, zM10484H, z7, false, false));
                                                        }
                                                    } catch (Exception e2) {
                                                        e = e2;
                                                        i = i3;
                                                        z = z3;
                                                        if (bmk0.f77313a <= 23 || arrayList.isEmpty()) {
                                                            kyv.m152145c("MediaCodecUtil", "Failed to query codec " + r6 + " (" + strM10509q + ")");
                                                            throw e;
                                                        }
                                                        kyv.m152145c("MediaCodecUtil", "Skipping codec " + name + " (failed to query capabilities)");
                                                        i2 = i + 1;
                                                        c1900b2 = c1900b;
                                                        zMo10523e = z;
                                                    }
                                                }
                                                z = z3;
                                                boolean z8 = z2;
                                                i = i3;
                                                if (!z && zMo10521c2) {
                                                    try {
                                                        arrayList.add(C1908d.m10552F(name + ".secure", str, strM10509q, capabilitiesForType, zM10482F, zM10484H, z8, false, true));
                                                        break;
                                                    } catch (Exception e3) {
                                                        e = e3;
                                                        if (bmk0.f77313a <= 23) {
                                                        }
                                                        kyv.m152145c("MediaCodecUtil", "Failed to query codec " + r6 + " (" + strM10509q + ")");
                                                        throw e;
                                                    }
                                                }
                                            } catch (Exception e4) {
                                                e = e4;
                                                i = i3;
                                                z = z3;
                                            }
                                        } catch (Exception e5) {
                                            e = e5;
                                            z = z3;
                                            i = i3;
                                        }
                                    } else {
                                        i = i3;
                                        z = z3;
                                    }
                                } else {
                                    i = i3;
                                    z = z3;
                                }
                            } catch (Exception e6) {
                                e = e6;
                                i = i3;
                                z = z3;
                            }
                        }
                    } else {
                        z = zMo10523e;
                        i = i2;
                    }
                }
                i2 = i + 1;
                c1900b2 = c1900b;
                zMo10523e = z;
            }
            return arrayList;
        } catch (Exception e7) {
            throw new DecoderQueryException(e7);
        }
    }

    @RequiresNonNull({"#2.sampleMimeType"})
    /* JADX INFO: renamed from: v */
    public static List<C1908d> m10514v(InterfaceC1909e interfaceC1909e, C1894k c1894k, boolean z, boolean z2) throws DecoderQueryException {
        List<C1908d> listMo10580a = interfaceC1909e.mo10580a(c1894k.f7785l, z, z2);
        return ImmutableList.builder().m15754k(listMo10580a).m15754k(m10506n(interfaceC1909e, c1894k, z, z2)).m15756m();
    }

    @CheckResult
    /* JADX INFO: renamed from: w */
    public static List<C1908d> m10515w(List<C1908d> list, final C1894k c1894k) {
        ArrayList arrayList = new ArrayList(list);
        m10490N(arrayList, new InterfaceC1904f() { // from class: l.trx
            @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.InterfaceC1904f
            /* JADX INFO: renamed from: a */
            public final int mo10525a(Object obj) {
                return MediaCodecUtil.m10496d(c1894k, (C1908d) obj);
            }
        });
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: x */
    public static C1908d m10516x() throws DecoderQueryException {
        return m10511s("audio/raw", false, false);
    }

    @Nullable
    /* JADX INFO: renamed from: y */
    public static Pair<Integer, Integer> m10517y(String str, String[] strArr) {
        if (strArr.length < 3) {
            kyv.m152151i("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        Matcher matcher = f7911a.matcher(strArr[1]);
        if (!matcher.matches()) {
            kyv.m152151i("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        Integer numM10503k = m10503k(strGroup);
        if (numM10503k == null) {
            kyv.m152151i("MediaCodecUtil", "Unknown Dolby Vision profile string: " + strGroup);
            return null;
        }
        String str2 = strArr[2];
        Integer numM10502j = m10502j(str2);
        if (numM10502j != null) {
            return new Pair<>(numM10503k, numM10502j);
        }
        kyv.m152151i("MediaCodecUtil", "Unknown Dolby Vision level string: " + str2);
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: z */
    public static Pair<Integer, Integer> m10518z(String str, String[] strArr, @Nullable df5 df5Var) {
        if (strArr.length < 4) {
            kyv.m152151i("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        int i = 1;
        Matcher matcher = f7911a.matcher(strArr[1]);
        if (!matcher.matches()) {
            kyv.m152151i("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        if (!"1".equals(strGroup)) {
            if (!"2".equals(strGroup)) {
                kyv.m152151i("MediaCodecUtil", "Unknown HEVC profile string: " + strGroup);
                return null;
            }
            i = (df5Var == null || df5Var.f88125c != 6) ? 2 : 4096;
        }
        String str2 = strArr[3];
        Integer numM10478B = m10478B(str2);
        if (numM10478B != null) {
            return new Pair<>(Integer.valueOf(i), numM10478B);
        }
        kyv.m152151i("MediaCodecUtil", "Unknown HEVC level string: " + str2);
        return null;
    }
}
