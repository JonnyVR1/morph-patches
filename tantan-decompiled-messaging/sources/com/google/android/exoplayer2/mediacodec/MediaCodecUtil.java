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
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.mediacodec.C1885d;
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
import p149l.b11;
import p149l.de5;
import p149l.jwv;
import p149l.n200;
import p149l.vck0;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"InlinedApi"})
@Deprecated
public final class MediaCodecUtil {

    /* JADX INFO: renamed from: a */
    public static final Pattern f7874a = Pattern.compile("^\\D?(\\d+)$");

    /* JADX INFO: renamed from: b */
    @GuardedBy("MediaCodecUtil.class")
    public static final HashMap<C1877b, List<C1885d>> f7875b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public static int f7876c = -1;

    public static class DecoderQueryException extends Exception {
        private DecoderQueryException(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$b */
    public static final class C1877b {

        /* JADX INFO: renamed from: a */
        public final String f7877a;

        /* JADX INFO: renamed from: b */
        public final boolean f7878b;

        /* JADX INFO: renamed from: c */
        public final boolean f7879c;

        public C1877b(String str, boolean z, boolean z2) {
            this.f7877a = str;
            this.f7878b = z;
            this.f7879c = z2;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == C1877b.class) {
                C1877b c1877b = (C1877b) obj;
                if (TextUtils.equals(this.f7877a, c1877b.f7877a) && this.f7878b == c1877b.f7878b && this.f7879c == c1877b.f7879c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((this.f7877a.hashCode() + 31) * 31) + (this.f7878b ? 1231 : 1237)) * 31) + (this.f7879c ? 1231 : 1237);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$c */
    public interface InterfaceC1878c {
        /* JADX INFO: renamed from: a */
        boolean mo10465a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* JADX INFO: renamed from: b */
        MediaCodecInfo mo10466b(int i);

        /* JADX INFO: renamed from: c */
        boolean mo10467c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* JADX INFO: renamed from: d */
        int mo10468d();

        /* JADX INFO: renamed from: e */
        boolean mo10469e();
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$d */
    public static final class C1879d implements InterfaceC1878c {
        public C1879d() {
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.InterfaceC1878c
        /* JADX INFO: renamed from: a */
        public boolean mo10465a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.InterfaceC1878c
        /* JADX INFO: renamed from: b */
        public MediaCodecInfo mo10466b(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.InterfaceC1878c
        /* JADX INFO: renamed from: c */
        public boolean mo10467c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && YtVideoEncoder.MIME_TYPE.equals(str2);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.InterfaceC1878c
        /* JADX INFO: renamed from: d */
        public int mo10468d() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.InterfaceC1878c
        /* JADX INFO: renamed from: e */
        public boolean mo10469e() {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$e */
    @RequiresApi(21)
    public static final class C1880e implements InterfaceC1878c {

        /* JADX INFO: renamed from: a */
        public final int f7880a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public MediaCodecInfo[] f7881b;

        public C1880e(boolean z, boolean z2) {
            this.f7880a = (z || z2) ? 1 : 0;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.InterfaceC1878c
        /* JADX INFO: renamed from: a */
        public boolean mo10465a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.InterfaceC1878c
        /* JADX INFO: renamed from: b */
        public MediaCodecInfo mo10466b(int i) {
            m10470f();
            return this.f7881b[i];
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.InterfaceC1878c
        /* JADX INFO: renamed from: c */
        public boolean mo10467c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.InterfaceC1878c
        /* JADX INFO: renamed from: d */
        public int mo10468d() {
            m10470f();
            return this.f7881b.length;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.InterfaceC1878c
        /* JADX INFO: renamed from: e */
        public boolean mo10469e() {
            return true;
        }

        @EnsuresNonNull({"mediaCodecInfos"})
        /* JADX INFO: renamed from: f */
        public final void m10470f() {
            if (this.f7881b == null) {
                this.f7881b = new MediaCodecList(this.f7880a).getCodecInfos();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.MediaCodecUtil$f */
    public interface InterfaceC1881f<T> {
        /* JADX INFO: renamed from: a */
        int mo10471a(T t);
    }

    @Nullable
    /* JADX INFO: renamed from: A */
    public static Pair<Integer, Integer> m10423A(String str, String[] strArr) {
        if (strArr.length < 3) {
            jwv.m143689i("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
        try {
            int i = Integer.parseInt(strArr[1]);
            int i2 = Integer.parseInt(strArr[2]);
            int iM10438P = m10438P(i);
            if (iM10438P == -1) {
                jwv.m143689i("MediaCodecUtil", "Unknown VP9 profile: " + i);
                return null;
            }
            int iM10437O = m10437O(i2);
            if (iM10437O != -1) {
                return new Pair<>(Integer.valueOf(iM10438P), Integer.valueOf(iM10437O));
            }
            jwv.m143689i("MediaCodecUtil", "Unknown VP9 level: " + i2);
            return null;
        } catch (NumberFormatException unused) {
            jwv.m143689i("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    /* JADX INFO: renamed from: B */
    public static Integer m10424B(@Nullable String str) {
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
    public static boolean m10425C(MediaCodecInfo mediaCodecInfo) {
        return vck0.f180948a >= 29 && m10426D(mediaCodecInfo);
    }

    @RequiresApi(29)
    /* JADX INFO: renamed from: D */
    public static boolean m10426D(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    /* JADX INFO: renamed from: E */
    public static boolean m10427E(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = vck0.f180948a;
        if (i < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = vck0.f180949b;
            if ("a70".equals(str3) || (ThirdPushManager.VENDOR_TYPE_XIAOMI.equals(vck0.f180950c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = vck0.f180949b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = vck0.f180949b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(vck0.f180950c))) {
            String str6 = vck0.f180949b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(vck0.f180950c)) {
            String str7 = vck0.f180949b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i <= 19 && vck0.f180949b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (i <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    /* JADX INFO: renamed from: F */
    public static boolean m10428F(MediaCodecInfo mediaCodecInfo, String str) {
        return vck0.f180948a >= 29 ? m10429G(mediaCodecInfo) : !m10430H(mediaCodecInfo, str);
    }

    @RequiresApi(29)
    /* JADX INFO: renamed from: G */
    public static boolean m10429G(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    /* JADX INFO: renamed from: H */
    public static boolean m10430H(MediaCodecInfo mediaCodecInfo, String str) {
        if (vck0.f180948a >= 29) {
            return m10431I(mediaCodecInfo);
        }
        if (n200.m157533o(str)) {
            return true;
        }
        String strM99804e = b11.m99804e(mediaCodecInfo.getName());
        if (strM99804e.startsWith("arc.")) {
            return false;
        }
        return strM99804e.startsWith("omx.google.") || strM99804e.startsWith("omx.ffmpeg.") || (strM99804e.startsWith("omx.sec.") && strM99804e.contains(".sw.")) || strM99804e.equals("omx.qcom.video.decoder.hevcswvdec") || strM99804e.startsWith("c2.android.") || strM99804e.startsWith("c2.google.") || !(strM99804e.startsWith("omx.") || strM99804e.startsWith("c2."));
    }

    @RequiresApi(29)
    /* JADX INFO: renamed from: I */
    public static boolean m10431I(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    /* JADX INFO: renamed from: J */
    public static boolean m10432J(MediaCodecInfo mediaCodecInfo) {
        if (vck0.f180948a >= 29) {
            return m10433K(mediaCodecInfo);
        }
        String strM99804e = b11.m99804e(mediaCodecInfo.getName());
        return (strM99804e.startsWith("omx.google.") || strM99804e.startsWith("c2.android.") || strM99804e.startsWith("c2.google.")) ? false : true;
    }

    @RequiresApi(29)
    /* JADX INFO: renamed from: K */
    public static boolean m10433K(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    /* JADX INFO: renamed from: L */
    public static int m10434L() throws DecoderQueryException {
        if (f7876c == -1) {
            int iMax = 0;
            C1885d c1885dM10457s = m10457s(YtVideoEncoder.MIME_TYPE, false, false);
            if (c1885dM10457s != null) {
                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrM10513h = c1885dM10457s.m10513h();
                int length = codecProfileLevelArrM10513h.length;
                int iMax2 = 0;
                while (iMax < length) {
                    iMax2 = Math.max(m10446h(codecProfileLevelArrM10513h[iMax].level), iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, vck0.f180948a >= 21 ? 345600 : 172800);
            }
            f7876c = iMax;
        }
        return f7876c;
    }

    /* JADX INFO: renamed from: M */
    public static int m10435M(int i) {
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
    public static <T> void m10436N(List<T> list, final InterfaceC1881f<T> interfaceC1881f) {
        Collections.sort(list, new Comparator() { // from class: l.xix
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return MediaCodecUtil.m10439a(interfaceC1881f, obj, obj2);
            }
        });
    }

    /* JADX INFO: renamed from: O */
    public static int m10437O(int i) {
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
    public static int m10438P(int i) {
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
    public static /* synthetic */ int m10439a(InterfaceC1881f interfaceC1881f, Object obj, Object obj2) {
        return interfaceC1881f.mo10471a(obj2) - interfaceC1881f.mo10471a(obj);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m10440b(C1885d c1885d) {
        String str = c1885d.f7899a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (vck0.f180948a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m10441c(C1885d c1885d) {
        return c1885d.f7899a.startsWith("OMX.google") ? 1 : 0;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ int m10442d(C1871k c1871k, C1885d c1885d) {
        return c1885d.m10517n(c1871k) ? 1 : 0;
    }

    /* JADX INFO: renamed from: e */
    public static void m10443e(String str, List<C1885d> list) {
        if ("audio/raw".equals(str)) {
            if (vck0.f180948a < 26 && vck0.f180949b.equals("R9") && list.size() == 1 && list.get(0).f7899a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(C1885d.m10498F("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            m10436N(list, new InterfaceC1881f() { // from class: l.uix
                @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.InterfaceC1881f
                /* JADX INFO: renamed from: a */
                public final int mo10471a(Object obj) {
                    return MediaCodecUtil.m10440b((C1885d) obj);
                }
            });
        }
        int i = vck0.f180948a;
        if (i < 21 && list.size() > 1) {
            String str2 = list.get(0).f7899a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                m10436N(list, new InterfaceC1881f() { // from class: l.vix
                    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.InterfaceC1881f
                    /* JADX INFO: renamed from: a */
                    public final int mo10471a(Object obj) {
                        return MediaCodecUtil.m10441c((C1885d) obj);
                    }
                });
            }
        }
        if (i >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(list.get(0).f7899a)) {
            return;
        }
        list.add(list.remove(0));
    }

    /* JADX INFO: renamed from: f */
    public static int m10444f(int i) {
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
    public static int m10445g(int i) {
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
    public static int m10446h(int i) {
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
    public static int m10447i(int i) {
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
    public static Integer m10448j(@Nullable String str) {
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
    public static Integer m10449k(@Nullable String str) {
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
    public static Pair<Integer, Integer> m10450l(String str, String[] strArr) {
        int iM10435M;
        if (strArr.length != 3) {
            jwv.m143689i("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(n200.m157526h(Integer.parseInt(strArr[1], 16))) && (iM10435M = m10435M(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair<>(Integer.valueOf(iM10435M), 0);
            }
        } catch (NumberFormatException unused) {
            jwv.m143689i("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public static String m10451m(C1871k c1871k) {
        Pair<Integer, Integer> pairM10456r;
        if ("audio/eac3-joc".equals(c1871k.f7748l)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(c1871k.f7748l) || (pairM10456r = m10456r(c1871k)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairM10456r.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return YtVideoEncoder.MIME_TYPE;
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static List<C1885d> m10452n(InterfaceC1886e interfaceC1886e, C1871k c1871k, boolean z, boolean z2) throws DecoderQueryException {
        String strM10451m = m10451m(c1871k);
        return strM10451m == null ? ImmutableList.m15685of() : interfaceC1886e.mo10526a(strM10451m, z, z2);
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public static Pair<Integer, Integer> m10453o(String str, String[] strArr, @Nullable de5 de5Var) {
        int i;
        if (strArr.length < 4) {
            jwv.m143689i("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
        int i2 = 1;
        try {
            int i3 = Integer.parseInt(strArr[1]);
            int i4 = Integer.parseInt(strArr[2].substring(0, 2));
            int i5 = Integer.parseInt(strArr[3]);
            if (i3 != 0) {
                jwv.m143689i("MediaCodecUtil", "Unknown AV1 profile: " + i3);
                return null;
            }
            if (i5 != 8 && i5 != 10) {
                jwv.m143689i("MediaCodecUtil", "Unknown AV1 bit depth: " + i5);
                return null;
            }
            if (i5 != 8) {
                i2 = (de5Var == null || !(de5Var.f85711d != null || (i = de5Var.f85710c) == 7 || i == 6)) ? 2 : 4096;
            }
            int iM10444f = m10444f(i4);
            if (iM10444f != -1) {
                return new Pair<>(Integer.valueOf(i2), Integer.valueOf(iM10444f));
            }
            jwv.m143689i("MediaCodecUtil", "Unknown AV1 level: " + i4);
            return null;
        } catch (NumberFormatException unused) {
            jwv.m143689i("MediaCodecUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public static Pair<Integer, Integer> m10454p(String str, String[] strArr) {
        int i;
        int i2;
        if (strArr.length < 2) {
            jwv.m143689i("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i2 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i = Integer.parseInt(strArr[1].substring(4), 16);
            } else {
                if (strArr.length < 3) {
                    jwv.m143689i("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                    return null;
                }
                int i3 = Integer.parseInt(strArr[1]);
                i = Integer.parseInt(strArr[2]);
                i2 = i3;
            }
            int iM10447i = m10447i(i2);
            if (iM10447i == -1) {
                jwv.m143689i("MediaCodecUtil", "Unknown AVC profile: " + i2);
                return null;
            }
            int iM10445g = m10445g(i);
            if (iM10445g != -1) {
                return new Pair<>(Integer.valueOf(iM10447i), Integer.valueOf(iM10445g));
            }
            jwv.m143689i("MediaCodecUtil", "Unknown AVC level: " + i);
            return null;
        } catch (NumberFormatException unused) {
            jwv.m143689i("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public static String m10455q(MediaCodecInfo mediaCodecInfo, String str, String str2) {
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
    public static Pair<Integer, Integer> m10456r(C1871k c1871k) {
        String str = c1871k.f7745i;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        if ("video/dolby-vision".equals(c1871k.f7748l)) {
            return m10463y(c1871k.f7745i, strArrSplit);
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
                return m10453o(c1871k.f7745i, strArrSplit, c1871k.f7760x);
            case 1:
            case 2:
                return m10454p(c1871k.f7745i, strArrSplit);
            case 3:
            case 4:
                return m10464z(c1871k.f7745i, strArrSplit, c1871k.f7760x);
            case 5:
                return m10450l(c1871k.f7745i, strArrSplit);
            case 6:
                return m10423A(c1871k.f7745i, strArrSplit);
            default:
                return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public static C1885d m10457s(String str, boolean z, boolean z2) throws DecoderQueryException {
        List<C1885d> listM10458t = m10458t(str, z, z2);
        if (listM10458t.isEmpty()) {
            return null;
        }
        return listM10458t.get(0);
    }

    /* JADX INFO: renamed from: t */
    public static synchronized List<C1885d> m10458t(String str, boolean z, boolean z2) throws DecoderQueryException {
        try {
            C1877b c1877b = new C1877b(str, z, z2);
            HashMap<C1877b, List<C1885d>> map = f7875b;
            List<C1885d> list = map.get(c1877b);
            if (list != null) {
                return list;
            }
            int i = vck0.f180948a;
            ArrayList<C1885d> arrayListM10459u = m10459u(c1877b, i >= 21 ? new C1880e(z, z2) : new C1879d());
            if (z && arrayListM10459u.isEmpty() && 21 <= i && i <= 23) {
                arrayListM10459u = m10459u(c1877b, new C1879d());
                if (!arrayListM10459u.isEmpty()) {
                    jwv.m143689i("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + arrayListM10459u.get(0).f7899a);
                }
            }
            m10443e(str, arrayListM10459u);
            ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) arrayListM10459u);
            map.put(c1877b, immutableListCopyOf);
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
    public static ArrayList<C1885d> m10459u(C1877b c1877b, InterfaceC1878c interfaceC1878c) throws DecoderQueryException {
        int i;
        boolean z;
        boolean z2;
        C1877b c1877b2 = c1877b;
        try {
            ArrayList<C1885d> arrayList = new ArrayList<>();
            String str = c1877b2.f7877a;
            int iMo10468d = interfaceC1878c.mo10468d();
            boolean zMo10469e = interfaceC1878c.mo10469e();
            int i2 = 0;
            while (i2 < iMo10468d) {
                MediaCodecInfo mediaCodecInfoMo10466b = interfaceC1878c.mo10466b(i2);
                if (m10425C(mediaCodecInfoMo10466b)) {
                    z = zMo10469e;
                    i = i2;
                } else {
                    String name = mediaCodecInfoMo10466b.getName();
                    if (m10427E(mediaCodecInfoMo10466b, name, zMo10469e, str)) {
                        int i3 = i2;
                        String strM10455q = m10455q(mediaCodecInfoMo10466b, name, str);
                        if (strM10455q == null) {
                            z = zMo10469e;
                            i = i3;
                        } else {
                            boolean z3 = zMo10469e;
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoMo10466b.getCapabilitiesForType(strM10455q);
                                boolean zMo10467c = interfaceC1878c.mo10467c("tunneled-playback", strM10455q, capabilitiesForType);
                                boolean zMo10465a = interfaceC1878c.mo10465a("tunneled-playback", strM10455q, capabilitiesForType);
                                boolean z4 = c1877b2.f7879c;
                                if ((z4 || !zMo10465a) && (!z4 || zMo10467c)) {
                                    boolean zMo10467c2 = interfaceC1878c.mo10467c("secure-playback", strM10455q, capabilitiesForType);
                                    boolean zMo10465a2 = interfaceC1878c.mo10465a("secure-playback", strM10455q, capabilitiesForType);
                                    boolean z5 = c1877b2.f7878b;
                                    if ((z5 || !zMo10465a2) && (!z5 || zMo10467c2)) {
                                        try {
                                            boolean zM10428F = m10428F(mediaCodecInfoMo10466b, str);
                                            try {
                                                boolean zM10430H = m10430H(mediaCodecInfoMo10466b, str);
                                                boolean zM10432J = m10432J(mediaCodecInfoMo10466b);
                                                if (z3) {
                                                    z2 = zM10432J;
                                                    if (c1877b2.f7878b == zMo10467c2) {
                                                        z = z3;
                                                        boolean z6 = z2;
                                                        i = i3;
                                                        try {
                                                            arrayList.add(C1885d.m10498F(name, str, strM10455q, capabilitiesForType, zM10428F, zM10430H, z6, false, false));
                                                        } catch (Exception e) {
                                                            e = e;
                                                            if (vck0.f180948a <= 23) {
                                                            }
                                                            jwv.m143683c("MediaCodecUtil", "Failed to query codec " + r6 + " (" + strM10455q + ")");
                                                            throw e;
                                                        }
                                                    }
                                                } else {
                                                    z2 = zM10432J;
                                                }
                                                if (!z3) {
                                                    try {
                                                        if (!c1877b2.f7878b) {
                                                            z = z3;
                                                            boolean z7 = z2;
                                                            i = i3;
                                                            arrayList.add(C1885d.m10498F(name, str, strM10455q, capabilitiesForType, zM10428F, zM10430H, z7, false, false));
                                                        }
                                                    } catch (Exception e2) {
                                                        e = e2;
                                                        i = i3;
                                                        z = z3;
                                                        if (vck0.f180948a <= 23 || arrayList.isEmpty()) {
                                                            jwv.m143683c("MediaCodecUtil", "Failed to query codec " + r6 + " (" + strM10455q + ")");
                                                            throw e;
                                                        }
                                                        jwv.m143683c("MediaCodecUtil", "Skipping codec " + name + " (failed to query capabilities)");
                                                        i2 = i + 1;
                                                        c1877b2 = c1877b;
                                                        zMo10469e = z;
                                                    }
                                                }
                                                z = z3;
                                                boolean z8 = z2;
                                                i = i3;
                                                if (!z && zMo10467c2) {
                                                    try {
                                                        arrayList.add(C1885d.m10498F(name + ".secure", str, strM10455q, capabilitiesForType, zM10428F, zM10430H, z8, false, true));
                                                        break;
                                                    } catch (Exception e3) {
                                                        e = e3;
                                                        if (vck0.f180948a <= 23) {
                                                        }
                                                        jwv.m143683c("MediaCodecUtil", "Failed to query codec " + r6 + " (" + strM10455q + ")");
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
                        z = zMo10469e;
                        i = i2;
                    }
                }
                i2 = i + 1;
                c1877b2 = c1877b;
                zMo10469e = z;
            }
            return arrayList;
        } catch (Exception e7) {
            throw new DecoderQueryException(e7);
        }
    }

    @RequiresNonNull({"#2.sampleMimeType"})
    /* JADX INFO: renamed from: v */
    public static List<C1885d> m10460v(InterfaceC1886e interfaceC1886e, C1871k c1871k, boolean z, boolean z2) throws DecoderQueryException {
        List<C1885d> listMo10526a = interfaceC1886e.mo10526a(c1871k.f7748l, z, z2);
        return ImmutableList.builder().m15700k(listMo10526a).m15700k(m10452n(interfaceC1886e, c1871k, z, z2)).m15702m();
    }

    @CheckResult
    /* JADX INFO: renamed from: w */
    public static List<C1885d> m10461w(List<C1885d> list, final C1871k c1871k) {
        ArrayList arrayList = new ArrayList(list);
        m10436N(arrayList, new InterfaceC1881f() { // from class: l.wix
            @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.InterfaceC1881f
            /* JADX INFO: renamed from: a */
            public final int mo10471a(Object obj) {
                return MediaCodecUtil.m10442d(c1871k, (C1885d) obj);
            }
        });
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: x */
    public static C1885d m10462x() throws DecoderQueryException {
        return m10457s("audio/raw", false, false);
    }

    @Nullable
    /* JADX INFO: renamed from: y */
    public static Pair<Integer, Integer> m10463y(String str, String[] strArr) {
        if (strArr.length < 3) {
            jwv.m143689i("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        Matcher matcher = f7874a.matcher(strArr[1]);
        if (!matcher.matches()) {
            jwv.m143689i("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        Integer numM10449k = m10449k(strGroup);
        if (numM10449k == null) {
            jwv.m143689i("MediaCodecUtil", "Unknown Dolby Vision profile string: " + strGroup);
            return null;
        }
        String str2 = strArr[2];
        Integer numM10448j = m10448j(str2);
        if (numM10448j != null) {
            return new Pair<>(numM10449k, numM10448j);
        }
        jwv.m143689i("MediaCodecUtil", "Unknown Dolby Vision level string: " + str2);
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: z */
    public static Pair<Integer, Integer> m10464z(String str, String[] strArr, @Nullable de5 de5Var) {
        if (strArr.length < 4) {
            jwv.m143689i("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        int i = 1;
        Matcher matcher = f7874a.matcher(strArr[1]);
        if (!matcher.matches()) {
            jwv.m143689i("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        if (!"1".equals(strGroup)) {
            if (!"2".equals(strGroup)) {
                jwv.m143689i("MediaCodecUtil", "Unknown HEVC profile string: " + strGroup);
                return null;
            }
            i = (de5Var == null || de5Var.f85710c != 6) ? 2 : 4096;
        }
        String str2 = strArr[3];
        Integer numM10424B = m10424B(str2);
        if (numM10424B != null) {
            return new Pair<>(Integer.valueOf(i), numM10424B);
        }
        jwv.m143689i("MediaCodecUtil", "Unknown HEVC level string: " + str2);
        return null;
    }
}
