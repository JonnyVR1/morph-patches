package p153l;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzae;
import com.google.android.gms.internal.ads.zzcc;
import com.google.android.gms.internal.ads.zzgaa;
import com.tencent.ugc.TXRecordCommon;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.eclipse.jetty.http.HttpTokens;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes6.dex */
public final class ykr0 {

    /* JADX INFO: renamed from: O */
    public byte[] f200453O;

    /* JADX INFO: renamed from: U */
    public tgr0 f200459U;

    /* JADX INFO: renamed from: V */
    public boolean f200460V;

    /* JADX INFO: renamed from: Y */
    public sgr0 f200463Y;

    /* JADX INFO: renamed from: Z */
    public int f200464Z;

    /* JADX INFO: renamed from: a */
    public String f200465a;

    /* JADX INFO: renamed from: b */
    public String f200466b;

    /* JADX INFO: renamed from: c */
    public int f200467c;

    /* JADX INFO: renamed from: d */
    public int f200468d;

    /* JADX INFO: renamed from: e */
    public int f200469e;

    /* JADX INFO: renamed from: f */
    public int f200470f;

    /* JADX INFO: renamed from: g */
    public int f200471g;

    /* JADX INFO: renamed from: h */
    public boolean f200472h;

    /* JADX INFO: renamed from: i */
    public byte[] f200473i;

    /* JADX INFO: renamed from: j */
    public ggr0 f200474j;

    /* JADX INFO: renamed from: k */
    public byte[] f200475k;

    /* JADX INFO: renamed from: l */
    public zzae f200476l;

    /* JADX INFO: renamed from: m */
    public int f200477m = -1;

    /* JADX INFO: renamed from: n */
    public int f200478n = -1;

    /* JADX INFO: renamed from: o */
    public int f200479o = -1;

    /* JADX INFO: renamed from: p */
    public int f200480p = -1;

    /* JADX INFO: renamed from: q */
    public int f200481q = -1;

    /* JADX INFO: renamed from: r */
    public int f200482r = 0;

    /* JADX INFO: renamed from: s */
    public int f200483s = -1;

    /* JADX INFO: renamed from: t */
    public float f200484t = 0.0f;

    /* JADX INFO: renamed from: u */
    public float f200485u = 0.0f;

    /* JADX INFO: renamed from: v */
    public float f200486v = 0.0f;

    /* JADX INFO: renamed from: w */
    public byte[] f200487w = null;

    /* JADX INFO: renamed from: x */
    public int f200488x = -1;

    /* JADX INFO: renamed from: y */
    public boolean f200489y = false;

    /* JADX INFO: renamed from: z */
    public int f200490z = -1;

    /* JADX INFO: renamed from: A */
    public int f200439A = -1;

    /* JADX INFO: renamed from: B */
    public int f200440B = -1;

    /* JADX INFO: renamed from: C */
    public int f200441C = 1000;

    /* JADX INFO: renamed from: D */
    public int f200442D = 200;

    /* JADX INFO: renamed from: E */
    public float f200443E = -1.0f;

    /* JADX INFO: renamed from: F */
    public float f200444F = -1.0f;

    /* JADX INFO: renamed from: G */
    public float f200445G = -1.0f;

    /* JADX INFO: renamed from: H */
    public float f200446H = -1.0f;

    /* JADX INFO: renamed from: I */
    public float f200447I = -1.0f;

    /* JADX INFO: renamed from: J */
    public float f200448J = -1.0f;

    /* JADX INFO: renamed from: K */
    public float f200449K = -1.0f;

    /* JADX INFO: renamed from: L */
    public float f200450L = -1.0f;

    /* JADX INFO: renamed from: M */
    public float f200451M = -1.0f;

    /* JADX INFO: renamed from: N */
    public float f200452N = -1.0f;

    /* JADX INFO: renamed from: P */
    public int f200454P = 1;

    /* JADX INFO: renamed from: Q */
    public int f200455Q = -1;

    /* JADX INFO: renamed from: R */
    public int f200456R = TXRecordCommon.AUDIO_SAMPLERATE_8000;

    /* JADX INFO: renamed from: S */
    public long f200457S = 0;

    /* JADX INFO: renamed from: T */
    public long f200458T = 0;

    /* JADX INFO: renamed from: W */
    public boolean f200461W = true;

    /* JADX INFO: renamed from: X */
    public String f200462X = "eng";

    /* JADX INFO: renamed from: f */
    public static Pair m216533f(bgw0 bgw0Var) throws zzcc {
        try {
            bgw0Var.m104270l(16);
            long jM104251H = bgw0Var.m104251H();
            if (jM104251H == 1482049860) {
                return new Pair(DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_DIVX, null);
            }
            if (jM104251H == 859189832) {
                return new Pair(DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_3GP, null);
            }
            if (jM104251H != 826496599) {
                y4w0.m214278f("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
            int iM104277s = bgw0Var.m104277s() + 20;
            byte[] bArrM104271m = bgw0Var.m104271m();
            while (true) {
                int length = bArrM104271m.length;
                if (iM104277s >= length - 4) {
                    throw zzcc.zza("Failed to find FourCC VC1 initialization data", null);
                }
                int i = iM104277s + 1;
                if (bArrM104271m[iM104277s] == 0 && bArrM104271m[i] == 0 && bArrM104271m[iM104277s + 2] == 1 && bArrM104271m[iM104277s + 3] == 15) {
                    return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrM104271m, iM104277s, length)));
                }
                iM104277s = i;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzcc.zza("Error parsing FourCC private data", null);
        }
    }

    /* JADX INFO: renamed from: g */
    public static List m216534g(byte[] bArr) throws zzcc {
        int i;
        int i2;
        try {
            if (bArr[0] != 2) {
                throw zzcc.zza("Error parsing vorbis codec private", null);
            }
            int i3 = 0;
            int i4 = 1;
            while (true) {
                int i5 = bArr[i4];
                i4++;
                i = i5 & 255;
                if (i != 255) {
                    break;
                }
                i3 += 255;
            }
            int i6 = i3 + i;
            int i7 = 0;
            while (true) {
                int i8 = bArr[i4];
                i4++;
                i2 = i8 & 255;
                if (i2 != 255) {
                    break;
                }
                i7 += 255;
            }
            int i9 = i7 + i2;
            if (bArr[i4] != 1) {
                throw zzcc.zza("Error parsing vorbis codec private", null);
            }
            byte[] bArr2 = new byte[i6];
            System.arraycopy(bArr, i4, bArr2, 0, i6);
            int i10 = i4 + i6;
            if (bArr[i10] != 3) {
                throw zzcc.zza("Error parsing vorbis codec private", null);
            }
            int i11 = i10 + i9;
            if (bArr[i11] != 5) {
                throw zzcc.zza("Error parsing vorbis codec private", null);
            }
            int length = bArr.length - i11;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i11, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzcc.zza("Error parsing vorbis codec private", null);
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m216535h(bgw0 bgw0Var) throws zzcc {
        try {
            int iM104284z = bgw0Var.m104284z();
            if (iM104284z == 1) {
                return true;
            }
            if (iM104284z == 65534) {
                bgw0Var.m104269k(24);
                if (bgw0Var.m104252I() == zkr0.f204800h0.getMostSignificantBits() && bgw0Var.m104252I() == zkr0.f204800h0.getLeastSignificantBits()) {
                    return true;
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzcc.zza("Error parsing MS/ACM codec private", null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x018c  */
    /* JADX WARN: Code duplicated, block: B:121:0x01f2 A[PHI: r9
      0x01f2: PHI (r9v6 int) = (r9v1 int), (r9v2 int), (r9v3 int), (r9v4 int), (r9v5 int), (r9v0 int) binds: [B:142:0x0277, B:137:0x0247, B:134:0x0229, B:132:0x0224, B:129:0x021d, B:120:0x01f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:177:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:182:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:183:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:186:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:187:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:189:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:191:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:193:0x0402  */
    /* JADX WARN: Code duplicated, block: B:196:0x040a  */
    /* JADX WARN: Code duplicated, block: B:198:0x040f  */
    /* JADX WARN: Code duplicated, block: B:201:0x0416  */
    /* JADX WARN: Code duplicated, block: B:204:0x0424  */
    /* JADX WARN: Code duplicated, block: B:207:0x0429  */
    /* JADX WARN: Code duplicated, block: B:209:0x042f  */
    /* JADX WARN: Code duplicated, block: B:227:0x0465  */
    /* JADX WARN: Code duplicated, block: B:230:0x0508  */
    /* JADX WARN: Code duplicated, block: B:233:0x050d  */
    /* JADX WARN: Code duplicated, block: B:236:0x052a  */
    /* JADX WARN: Code duplicated, block: B:239:0x052f  */
    /* JADX WARN: Code duplicated, block: B:257:0x057c  */
    /* JADX WARN: Code duplicated, block: B:259:0x059c  */
    /* JADX WARN: Code duplicated, block: B:261:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:276:0x05cd  */
    @EnsuresNonNull({"this.output"})
    @RequiresNonNull({"codecId"})
    /* JADX INFO: renamed from: e */
    public final void m216536e(ser0 ser0Var, int i) throws zzcc {
        byte b;
        List listSingletonList;
        List list;
        String str;
        String str2;
        int i2;
        int i3;
        int i4;
        String str3;
        int i5;
        znr0 znr0Var;
        int i6;
        int i7;
        int i8;
        float f;
        int i9;
        int iIntValue;
        int i10;
        int i11;
        int i12;
        int i13;
        ler0 ler0VarM153936a;
        String str4 = this.f200466b;
        int iM159428z = 4;
        switch (str4) {
            case "V_MPEG4/ISO/AP":
                b = 6;
                break;
            case "V_MPEG4/ISO/SP":
                b = 4;
                break;
            case "A_MS/ACM":
                b = 23;
                break;
            case "A_TRUEHD":
                b = 18;
                break;
            case "A_VORBIS":
                b = 11;
                break;
            case "A_MPEG/L2":
                b = 14;
                break;
            case "A_MPEG/L3":
                b = 15;
                break;
            case "V_MS/VFW/FOURCC":
                b = 9;
                break;
            case "S_DVBSUB":
                b = 32;
                break;
            case "V_MPEG4/ISO/ASP":
                b = 5;
                break;
            case "V_MPEG4/ISO/AVC":
                b = 7;
                break;
            case "S_VOBSUB":
                b = 30;
                break;
            case "A_DTS/LOSSLESS":
                b = 21;
                break;
            case "A_AAC":
                b = HttpTokens.CARRIAGE_RETURN;
                break;
            case "A_AC3":
                b = Tnaf.POW_2_WIDTH;
                break;
            case "A_DTS":
                b = 19;
                break;
            case "V_AV1":
                b = 2;
                break;
            case "V_VP8":
                b = 0;
                break;
            case "V_VP9":
                b = 1;
                break;
            case "S_HDMV/PGS":
                b = 31;
                break;
            case "V_THEORA":
                b = 10;
                break;
            case "A_DTS/EXPRESS":
                b = 20;
                break;
            case "A_PCM/FLOAT/IEEE":
                b = 26;
                break;
            case "A_PCM/INT/BIG":
                b = 25;
                break;
            case "A_PCM/INT/LIT":
                b = 24;
                break;
            case "S_TEXT/ASS":
                b = 28;
                break;
            case "V_MPEGH/ISO/HEVC":
                b = 8;
                break;
            case "S_TEXT/WEBVTT":
                b = 29;
                break;
            case "S_TEXT/UTF8":
                b = 27;
                break;
            case "V_MPEG2":
                b = 3;
                break;
            case "A_EAC3":
                b = 17;
                break;
            case "A_FLAC":
                b = 22;
                break;
            case "A_OPUS":
                b = 12;
                break;
            default:
                b = -1;
                break;
        }
        String str5 = "audio/raw";
        wwy0 wwy0VarM117907g = null;
        byte[] bArr = null;
        switch (b) {
            case 0:
                str5 = "video/x-vnd.on2.vp8";
                listSingletonList = null;
                str2 = null;
                i4 = -1;
                i3 = -1;
                if (this.f200453O != null && (ler0VarM153936a = ler0.m153936a(new bgw0(this.f200453O))) != null) {
                    str2 = ler0VarM153936a.f131786a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z = this.f200461W;
                if (true != this.f200460V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i14 = i5 | (z ? 1 : 0);
                znr0Var = new znr0();
                if (a8t0.m96495g(str3)) {
                    znr0Var.m220659k0(this.f200454P);
                    znr0Var.m220673x(this.f200456R);
                    znr0Var.m220666q(i4);
                    i6 = 1;
                } else if (a8t0.m96496h(str3)) {
                    if (this.f200482r == 0) {
                        i12 = this.f200480p;
                        i7 = -1;
                        if (i12 == -1) {
                            i12 = this.f200477m;
                        }
                        this.f200480p = i12;
                        i13 = this.f200481q;
                        if (i13 == -1) {
                            i13 = this.f200478n;
                        }
                        this.f200481q = i13;
                    } else {
                        i7 = -1;
                    }
                    i8 = this.f200480p;
                    if (i8 != i7 || (i11 = this.f200481q) == i7) {
                        f = -1.0f;
                    } else {
                        f = (this.f200478n * i8) / (this.f200477m * i11);
                    }
                    if (this.f200489y) {
                        if (this.f200443E != -1.0f || this.f200444F == -1.0f || this.f200445G == -1.0f || this.f200446H == -1.0f || this.f200447I == -1.0f || this.f200448J == -1.0f || this.f200449K == -1.0f || this.f200450L == -1.0f || this.f200451M == -1.0f || this.f200452N == -1.0f) {
                            i9 = 0;
                        } else {
                            bArr = new byte[25];
                            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            i9 = 0;
                            byteBufferOrder.put((byte) 0);
                            byteBufferOrder.putShort((short) ((this.f200443E * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f200444F * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f200445G * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f200446H * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f200447I * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f200448J * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f200449K * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f200450L * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) (this.f200451M + 0.5f));
                            byteBufferOrder.putShort((short) (this.f200452N + 0.5f));
                            byteBufferOrder.putShort((short) this.f200441C);
                            byteBufferOrder.putShort((short) this.f200442D);
                        }
                        dty0 dty0Var = new dty0();
                        dty0Var.m117903c(this.f200490z);
                        dty0Var.m117902b(this.f200440B);
                        dty0Var.m117904d(this.f200439A);
                        dty0Var.m117905e(bArr);
                        dty0Var.m117906f(this.f200479o);
                        dty0Var.m117901a(this.f200479o);
                        wwy0VarM117907g = dty0Var.m117907g();
                    } else {
                        i9 = 0;
                    }
                    if (this.f200465a == null && zkr0.f204801i0.containsKey(this.f200465a)) {
                        iIntValue = ((Integer) zkr0.f204801i0.get(this.f200465a)).intValue();
                    } else {
                        iIntValue = i7;
                    }
                    if (this.f200483s == 0 || Float.compare(this.f200484t, 0.0f) != 0 || Float.compare(this.f200485u, 0.0f) != 0) {
                        i10 = iIntValue;
                    } else if (Float.compare(this.f200486v, 0.0f) == 0) {
                        i10 = i9;
                    } else if (Float.compare(this.f200486v, 90.0f) == 0) {
                        i10 = 90;
                    } else if (Float.compare(this.f200486v, -180.0f) == 0 || Float.compare(this.f200486v, 180.0f) == 0) {
                        i10 = 180;
                    } else if (Float.compare(this.f200486v, -90.0f) == 0) {
                        i10 = 270;
                    } else {
                        i10 = iIntValue;
                    }
                    znr0Var.m220644C(this.f200477m);
                    znr0Var.m220654i(this.f200478n);
                    znr0Var.m220668s(f);
                    znr0Var.m220671v(i10);
                    znr0Var.m220669t(this.f200487w);
                    znr0Var.m220675z(this.f200488x);
                    znr0Var.m220646a(wwy0VarM117907g);
                    i6 = 2;
                } else {
                    if ("application/x-subrip".equals(str3) && !"text/x-ssa".equals(str3) && !"text/vtt".equals(str3) && !"application/vobsub".equals(str3) && !"application/pgs".equals(str3) && !"application/dvbsubs".equals(str3)) {
                        throw zzcc.zza("Unexpected MIME type.", null);
                    }
                    i6 = 3;
                }
                if (this.f200465a != null && !zkr0.f204801i0.containsKey(this.f200465a)) {
                    znr0Var.m220662m(this.f200465a);
                }
                znr0Var.m220656j(i);
                znr0Var.m220672w(str3);
                znr0Var.m220664o(i3);
                znr0Var.m220663n(this.f200462X);
                znr0Var.m220674y(i14 == true ? 1 : 0);
                znr0Var.m220660l(listSingletonList);
                znr0Var.m220661l0(str2);
                znr0Var.m220650e(this.f200476l);
                sqr0 sqr0VarM220645D = znr0Var.m220645D();
                sgr0 sgr0VarMo101550i = ser0Var.mo101550i(this.f200467c, i6);
                this.f200463Y = sgr0VarMo101550i;
                sgr0VarMo101550i.mo99373d(sqr0VarM220645D);
                return;
            case 1:
                str5 = "video/x-vnd.on2.vp9";
                listSingletonList = null;
                str2 = null;
                i4 = -1;
                i3 = -1;
                if (this.f200453O != null) {
                    str2 = ler0VarM153936a.f131786a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z2 = this.f200461W;
                if (true != this.f200460V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i15 = i5 | (z2 ? 1 : 0);
                znr0Var = new znr0();
                if (a8t0.m96495g(str3)) {
                    if (a8t0.m96496h(str3)) {
                        if (this.f200482r == 0) {
                            i12 = this.f200480p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f200477m;
                            }
                            this.f200480p = i12;
                            i13 = this.f200481q;
                            if (i13 == -1) {
                                i13 = this.f200478n;
                            }
                            this.f200481q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f200480p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f200489y) {
                            if (this.f200443E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            dty0 dty0Var2 = new dty0();
                            dty0Var2.m117903c(this.f200490z);
                            dty0Var2.m117902b(this.f200440B);
                            dty0Var2.m117904d(this.f200439A);
                            dty0Var2.m117905e(bArr);
                            dty0Var2.m117906f(this.f200479o);
                            dty0Var2.m117901a(this.f200479o);
                            wwy0VarM117907g = dty0Var2.m117907g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f200465a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f200483s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        znr0Var.m220644C(this.f200477m);
                        znr0Var.m220654i(this.f200478n);
                        znr0Var.m220668s(f);
                        znr0Var.m220671v(i10);
                        znr0Var.m220669t(this.f200487w);
                        znr0Var.m220675z(this.f200488x);
                        znr0Var.m220646a(wwy0VarM117907g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    znr0Var.m220659k0(this.f200454P);
                    znr0Var.m220673x(this.f200456R);
                    znr0Var.m220666q(i4);
                    i6 = 1;
                }
                if (this.f200465a != null) {
                    znr0Var.m220662m(this.f200465a);
                }
                znr0Var.m220656j(i);
                znr0Var.m220672w(str3);
                znr0Var.m220664o(i3);
                znr0Var.m220663n(this.f200462X);
                znr0Var.m220674y(i15 == true ? 1 : 0);
                znr0Var.m220660l(listSingletonList);
                znr0Var.m220661l0(str2);
                znr0Var.m220650e(this.f200476l);
                sqr0 sqr0VarM220645D2 = znr0Var.m220645D();
                sgr0 sgr0VarMo101550i2 = ser0Var.mo101550i(this.f200467c, i6);
                this.f200463Y = sgr0VarMo101550i2;
                sgr0VarMo101550i2.mo99373d(sqr0VarM220645D2);
                return;
            case 2:
                str5 = "video/av01";
                listSingletonList = null;
                str2 = null;
                i4 = -1;
                i3 = -1;
                if (this.f200453O != null) {
                    str2 = ler0VarM153936a.f131786a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z3 = this.f200461W;
                if (true != this.f200460V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i16 = i5 | (z3 ? 1 : 0);
                znr0Var = new znr0();
                if (a8t0.m96495g(str3)) {
                    if (a8t0.m96496h(str3)) {
                        if (this.f200482r == 0) {
                            i12 = this.f200480p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f200477m;
                            }
                            this.f200480p = i12;
                            i13 = this.f200481q;
                            if (i13 == -1) {
                                i13 = this.f200478n;
                            }
                            this.f200481q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f200480p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f200489y) {
                            if (this.f200443E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            dty0 dty0Var3 = new dty0();
                            dty0Var3.m117903c(this.f200490z);
                            dty0Var3.m117902b(this.f200440B);
                            dty0Var3.m117904d(this.f200439A);
                            dty0Var3.m117905e(bArr);
                            dty0Var3.m117906f(this.f200479o);
                            dty0Var3.m117901a(this.f200479o);
                            wwy0VarM117907g = dty0Var3.m117907g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f200465a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f200483s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        znr0Var.m220644C(this.f200477m);
                        znr0Var.m220654i(this.f200478n);
                        znr0Var.m220668s(f);
                        znr0Var.m220671v(i10);
                        znr0Var.m220669t(this.f200487w);
                        znr0Var.m220675z(this.f200488x);
                        znr0Var.m220646a(wwy0VarM117907g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    znr0Var.m220659k0(this.f200454P);
                    znr0Var.m220673x(this.f200456R);
                    znr0Var.m220666q(i4);
                    i6 = 1;
                }
                if (this.f200465a != null) {
                    znr0Var.m220662m(this.f200465a);
                }
                znr0Var.m220656j(i);
                znr0Var.m220672w(str3);
                znr0Var.m220664o(i3);
                znr0Var.m220663n(this.f200462X);
                znr0Var.m220674y(i16 == true ? 1 : 0);
                znr0Var.m220660l(listSingletonList);
                znr0Var.m220661l0(str2);
                znr0Var.m220650e(this.f200476l);
                sqr0 sqr0VarM220645D3 = znr0Var.m220645D();
                sgr0 sgr0VarMo101550i3 = ser0Var.mo101550i(this.f200467c, i6);
                this.f200463Y = sgr0VarMo101550i3;
                sgr0VarMo101550i3.mo99373d(sqr0VarM220645D3);
                return;
            case 3:
                str5 = "video/mpeg2";
                listSingletonList = null;
                str2 = null;
                i4 = -1;
                i3 = -1;
                if (this.f200453O != null) {
                    str2 = ler0VarM153936a.f131786a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z4 = this.f200461W;
                if (true != this.f200460V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i17 = i5 | (z4 ? 1 : 0);
                znr0Var = new znr0();
                if (a8t0.m96495g(str3)) {
                    if (a8t0.m96496h(str3)) {
                        if (this.f200482r == 0) {
                            i12 = this.f200480p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f200477m;
                            }
                            this.f200480p = i12;
                            i13 = this.f200481q;
                            if (i13 == -1) {
                                i13 = this.f200478n;
                            }
                            this.f200481q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f200480p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f200489y) {
                            if (this.f200443E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            dty0 dty0Var4 = new dty0();
                            dty0Var4.m117903c(this.f200490z);
                            dty0Var4.m117902b(this.f200440B);
                            dty0Var4.m117904d(this.f200439A);
                            dty0Var4.m117905e(bArr);
                            dty0Var4.m117906f(this.f200479o);
                            dty0Var4.m117901a(this.f200479o);
                            wwy0VarM117907g = dty0Var4.m117907g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f200465a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f200483s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        znr0Var.m220644C(this.f200477m);
                        znr0Var.m220654i(this.f200478n);
                        znr0Var.m220668s(f);
                        znr0Var.m220671v(i10);
                        znr0Var.m220669t(this.f200487w);
                        znr0Var.m220675z(this.f200488x);
                        znr0Var.m220646a(wwy0VarM117907g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    znr0Var.m220659k0(this.f200454P);
                    znr0Var.m220673x(this.f200456R);
                    znr0Var.m220666q(i4);
                    i6 = 1;
                }
                if (this.f200465a != null) {
                    znr0Var.m220662m(this.f200465a);
                }
                znr0Var.m220656j(i);
                znr0Var.m220672w(str3);
                znr0Var.m220664o(i3);
                znr0Var.m220663n(this.f200462X);
                znr0Var.m220674y(i17 == true ? 1 : 0);
                znr0Var.m220660l(listSingletonList);
                znr0Var.m220661l0(str2);
                znr0Var.m220650e(this.f200476l);
                sqr0 sqr0VarM220645D4 = znr0Var.m220645D();
                sgr0 sgr0VarMo101550i4 = ser0Var.mo101550i(this.f200467c, i6);
                this.f200463Y = sgr0VarMo101550i4;
                sgr0VarMo101550i4.mo99373d(sqr0VarM220645D4);
                return;
            case 4:
            case 5:
            case 6:
                byte[] bArr2 = this.f200475k;
                listSingletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                str5 = "video/mp4v-es";
                str2 = null;
                i4 = -1;
                i3 = -1;
                if (this.f200453O != null) {
                    str2 = ler0VarM153936a.f131786a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z5 = this.f200461W;
                if (true != this.f200460V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i18 = i5 | (z5 ? 1 : 0);
                znr0Var = new znr0();
                if (a8t0.m96495g(str3)) {
                    if (a8t0.m96496h(str3)) {
                        if (this.f200482r == 0) {
                            i12 = this.f200480p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f200477m;
                            }
                            this.f200480p = i12;
                            i13 = this.f200481q;
                            if (i13 == -1) {
                                i13 = this.f200478n;
                            }
                            this.f200481q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f200480p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f200489y) {
                            if (this.f200443E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            dty0 dty0Var5 = new dty0();
                            dty0Var5.m117903c(this.f200490z);
                            dty0Var5.m117902b(this.f200440B);
                            dty0Var5.m117904d(this.f200439A);
                            dty0Var5.m117905e(bArr);
                            dty0Var5.m117906f(this.f200479o);
                            dty0Var5.m117901a(this.f200479o);
                            wwy0VarM117907g = dty0Var5.m117907g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f200465a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f200483s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        znr0Var.m220644C(this.f200477m);
                        znr0Var.m220654i(this.f200478n);
                        znr0Var.m220668s(f);
                        znr0Var.m220671v(i10);
                        znr0Var.m220669t(this.f200487w);
                        znr0Var.m220675z(this.f200488x);
                        znr0Var.m220646a(wwy0VarM117907g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    znr0Var.m220659k0(this.f200454P);
                    znr0Var.m220673x(this.f200456R);
                    znr0Var.m220666q(i4);
                    i6 = 1;
                }
                if (this.f200465a != null) {
                    znr0Var.m220662m(this.f200465a);
                }
                znr0Var.m220656j(i);
                znr0Var.m220672w(str3);
                znr0Var.m220664o(i3);
                znr0Var.m220663n(this.f200462X);
                znr0Var.m220674y(i18 == true ? 1 : 0);
                znr0Var.m220660l(listSingletonList);
                znr0Var.m220661l0(str2);
                znr0Var.m220650e(this.f200476l);
                sqr0 sqr0VarM220645D5 = znr0Var.m220645D();
                sgr0 sgr0VarMo101550i5 = ser0Var.mo101550i(this.f200467c, i6);
                this.f200463Y = sgr0VarMo101550i5;
                sgr0VarMo101550i5.mo99373d(sqr0VarM220645D5);
                return;
            case 7:
                jdr0 jdr0VarM144500a = jdr0.m144500a(new bgw0(m216537i(this.f200466b)));
                list = jdr0VarM144500a.f120349a;
                this.f200464Z = jdr0VarM144500a.f120350b;
                str = jdr0VarM144500a.f120359k;
                str5 = YtVideoEncoder.MIME_TYPE;
                List list2 = list;
                str2 = str;
                listSingletonList = list2;
                i4 = -1;
                i3 = -1;
                if (this.f200453O != null) {
                    str2 = ler0VarM153936a.f131786a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z6 = this.f200461W;
                if (true != this.f200460V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i19 = i5 | (z6 ? 1 : 0);
                znr0Var = new znr0();
                if (a8t0.m96495g(str3)) {
                    if (a8t0.m96496h(str3)) {
                        if (this.f200482r == 0) {
                            i12 = this.f200480p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f200477m;
                            }
                            this.f200480p = i12;
                            i13 = this.f200481q;
                            if (i13 == -1) {
                                i13 = this.f200478n;
                            }
                            this.f200481q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f200480p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f200489y) {
                            if (this.f200443E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            dty0 dty0Var6 = new dty0();
                            dty0Var6.m117903c(this.f200490z);
                            dty0Var6.m117902b(this.f200440B);
                            dty0Var6.m117904d(this.f200439A);
                            dty0Var6.m117905e(bArr);
                            dty0Var6.m117906f(this.f200479o);
                            dty0Var6.m117901a(this.f200479o);
                            wwy0VarM117907g = dty0Var6.m117907g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f200465a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f200483s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        znr0Var.m220644C(this.f200477m);
                        znr0Var.m220654i(this.f200478n);
                        znr0Var.m220668s(f);
                        znr0Var.m220671v(i10);
                        znr0Var.m220669t(this.f200487w);
                        znr0Var.m220675z(this.f200488x);
                        znr0Var.m220646a(wwy0VarM117907g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    znr0Var.m220659k0(this.f200454P);
                    znr0Var.m220673x(this.f200456R);
                    znr0Var.m220666q(i4);
                    i6 = 1;
                }
                if (this.f200465a != null) {
                    znr0Var.m220662m(this.f200465a);
                }
                znr0Var.m220656j(i);
                znr0Var.m220672w(str3);
                znr0Var.m220664o(i3);
                znr0Var.m220663n(this.f200462X);
                znr0Var.m220674y(i19 == true ? 1 : 0);
                znr0Var.m220660l(listSingletonList);
                znr0Var.m220661l0(str2);
                znr0Var.m220650e(this.f200476l);
                sqr0 sqr0VarM220645D6 = znr0Var.m220645D();
                sgr0 sgr0VarMo101550i6 = ser0Var.mo101550i(this.f200467c, i6);
                this.f200463Y = sgr0VarMo101550i6;
                sgr0VarMo101550i6.mo99373d(sqr0VarM220645D6);
                return;
            case 8:
                sfr0 sfr0VarM185662a = sfr0.m185662a(new bgw0(m216537i(this.f200466b)));
                list = sfr0VarM185662a.f167758a;
                this.f200464Z = sfr0VarM185662a.f167759b;
                str = sfr0VarM185662a.f167766i;
                str5 = "video/hevc";
                List list3 = list;
                str2 = str;
                listSingletonList = list3;
                i4 = -1;
                i3 = -1;
                if (this.f200453O != null) {
                    str2 = ler0VarM153936a.f131786a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z7 = this.f200461W;
                if (true != this.f200460V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i110 = i5 | (z7 ? 1 : 0);
                znr0Var = new znr0();
                if (a8t0.m96495g(str3)) {
                    if (a8t0.m96496h(str3)) {
                        if (this.f200482r == 0) {
                            i12 = this.f200480p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f200477m;
                            }
                            this.f200480p = i12;
                            i13 = this.f200481q;
                            if (i13 == -1) {
                                i13 = this.f200478n;
                            }
                            this.f200481q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f200480p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f200489y) {
                            if (this.f200443E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            dty0 dty0Var7 = new dty0();
                            dty0Var7.m117903c(this.f200490z);
                            dty0Var7.m117902b(this.f200440B);
                            dty0Var7.m117904d(this.f200439A);
                            dty0Var7.m117905e(bArr);
                            dty0Var7.m117906f(this.f200479o);
                            dty0Var7.m117901a(this.f200479o);
                            wwy0VarM117907g = dty0Var7.m117907g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f200465a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f200483s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        znr0Var.m220644C(this.f200477m);
                        znr0Var.m220654i(this.f200478n);
                        znr0Var.m220668s(f);
                        znr0Var.m220671v(i10);
                        znr0Var.m220669t(this.f200487w);
                        znr0Var.m220675z(this.f200488x);
                        znr0Var.m220646a(wwy0VarM117907g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    znr0Var.m220659k0(this.f200454P);
                    znr0Var.m220673x(this.f200456R);
                    znr0Var.m220666q(i4);
                    i6 = 1;
                }
                if (this.f200465a != null) {
                    znr0Var.m220662m(this.f200465a);
                }
                znr0Var.m220656j(i);
                znr0Var.m220672w(str3);
                znr0Var.m220664o(i3);
                znr0Var.m220663n(this.f200462X);
                znr0Var.m220674y(i110 == true ? 1 : 0);
                znr0Var.m220660l(listSingletonList);
                znr0Var.m220661l0(str2);
                znr0Var.m220650e(this.f200476l);
                sqr0 sqr0VarM220645D7 = znr0Var.m220645D();
                sgr0 sgr0VarMo101550i7 = ser0Var.mo101550i(this.f200467c, i6);
                this.f200463Y = sgr0VarMo101550i7;
                sgr0VarMo101550i7.mo99373d(sqr0VarM220645D7);
                return;
            case 9:
                Pair pairM216533f = m216533f(new bgw0(m216537i(this.f200466b)));
                str5 = (String) pairM216533f.first;
                listSingletonList = (List) pairM216533f.second;
                str2 = null;
                i4 = -1;
                i3 = -1;
                if (this.f200453O != null) {
                    str2 = ler0VarM153936a.f131786a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z8 = this.f200461W;
                if (true != this.f200460V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i111 = i5 | (z8 ? 1 : 0);
                znr0Var = new znr0();
                if (a8t0.m96495g(str3)) {
                    if (a8t0.m96496h(str3)) {
                        if (this.f200482r == 0) {
                            i12 = this.f200480p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f200477m;
                            }
                            this.f200480p = i12;
                            i13 = this.f200481q;
                            if (i13 == -1) {
                                i13 = this.f200478n;
                            }
                            this.f200481q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f200480p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f200489y) {
                            if (this.f200443E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            dty0 dty0Var8 = new dty0();
                            dty0Var8.m117903c(this.f200490z);
                            dty0Var8.m117902b(this.f200440B);
                            dty0Var8.m117904d(this.f200439A);
                            dty0Var8.m117905e(bArr);
                            dty0Var8.m117906f(this.f200479o);
                            dty0Var8.m117901a(this.f200479o);
                            wwy0VarM117907g = dty0Var8.m117907g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f200465a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f200483s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        znr0Var.m220644C(this.f200477m);
                        znr0Var.m220654i(this.f200478n);
                        znr0Var.m220668s(f);
                        znr0Var.m220671v(i10);
                        znr0Var.m220669t(this.f200487w);
                        znr0Var.m220675z(this.f200488x);
                        znr0Var.m220646a(wwy0VarM117907g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    znr0Var.m220659k0(this.f200454P);
                    znr0Var.m220673x(this.f200456R);
                    znr0Var.m220666q(i4);
                    i6 = 1;
                }
                if (this.f200465a != null) {
                    znr0Var.m220662m(this.f200465a);
                }
                znr0Var.m220656j(i);
                znr0Var.m220672w(str3);
                znr0Var.m220664o(i3);
                znr0Var.m220663n(this.f200462X);
                znr0Var.m220674y(i111 == true ? 1 : 0);
                znr0Var.m220660l(listSingletonList);
                znr0Var.m220661l0(str2);
                znr0Var.m220650e(this.f200476l);
                sqr0 sqr0VarM220645D8 = znr0Var.m220645D();
                sgr0 sgr0VarMo101550i8 = ser0Var.mo101550i(this.f200467c, i6);
                this.f200463Y = sgr0VarMo101550i8;
                sgr0VarMo101550i8.mo99373d(sqr0VarM220645D8);
                return;
            case 10:
                str5 = "video/x-unknown";
                listSingletonList = null;
                str2 = null;
                i4 = -1;
                i3 = -1;
                if (this.f200453O != null) {
                    str2 = ler0VarM153936a.f131786a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z9 = this.f200461W;
                if (true != this.f200460V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i112 = i5 | (z9 ? 1 : 0);
                znr0Var = new znr0();
                if (a8t0.m96495g(str3)) {
                    if (a8t0.m96496h(str3)) {
                        if (this.f200482r == 0) {
                            i12 = this.f200480p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f200477m;
                            }
                            this.f200480p = i12;
                            i13 = this.f200481q;
                            if (i13 == -1) {
                                i13 = this.f200478n;
                            }
                            this.f200481q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f200480p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f200489y) {
                            if (this.f200443E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            dty0 dty0Var9 = new dty0();
                            dty0Var9.m117903c(this.f200490z);
                            dty0Var9.m117902b(this.f200440B);
                            dty0Var9.m117904d(this.f200439A);
                            dty0Var9.m117905e(bArr);
                            dty0Var9.m117906f(this.f200479o);
                            dty0Var9.m117901a(this.f200479o);
                            wwy0VarM117907g = dty0Var9.m117907g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f200465a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f200483s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        znr0Var.m220644C(this.f200477m);
                        znr0Var.m220654i(this.f200478n);
                        znr0Var.m220668s(f);
                        znr0Var.m220671v(i10);
                        znr0Var.m220669t(this.f200487w);
                        znr0Var.m220675z(this.f200488x);
                        znr0Var.m220646a(wwy0VarM117907g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    znr0Var.m220659k0(this.f200454P);
                    znr0Var.m220673x(this.f200456R);
                    znr0Var.m220666q(i4);
                    i6 = 1;
                }
                if (this.f200465a != null) {
                    znr0Var.m220662m(this.f200465a);
                }
                znr0Var.m220656j(i);
                znr0Var.m220672w(str3);
                znr0Var.m220664o(i3);
                znr0Var.m220663n(this.f200462X);
                znr0Var.m220674y(i112 == true ? 1 : 0);
                znr0Var.m220660l(listSingletonList);
                znr0Var.m220661l0(str2);
                znr0Var.m220650e(this.f200476l);
                sqr0 sqr0VarM220645D9 = znr0Var.m220645D();
                sgr0 sgr0VarMo101550i9 = ser0Var.mo101550i(this.f200467c, i6);
                this.f200463Y = sgr0VarMo101550i9;
                sgr0VarMo101550i9.mo99373d(sqr0VarM220645D9);
                return;
            case 11:
                listSingletonList = m216534g(m216537i(str4));
                i2 = 8192;
                str5 = "audio/vorbis";
                i3 = i2;
                str2 = null;
                i4 = -1;
                if (this.f200453O != null) {
                    str2 = ler0VarM153936a.f131786a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z10 = this.f200461W;
                if (true != this.f200460V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i113 = i5 | (z10 ? 1 : 0);
                znr0Var = new znr0();
                if (a8t0.m96495g(str3)) {
                    if (a8t0.m96496h(str3)) {
                        if (this.f200482r == 0) {
                            i12 = this.f200480p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f200477m;
                            }
                            this.f200480p = i12;
                            i13 = this.f200481q;
                            if (i13 == -1) {
                                i13 = this.f200478n;
                            }
                            this.f200481q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f200480p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f200489y) {
                            if (this.f200443E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            dty0 dty0Var10 = new dty0();
                            dty0Var10.m117903c(this.f200490z);
                            dty0Var10.m117902b(this.f200440B);
                            dty0Var10.m117904d(this.f200439A);
                            dty0Var10.m117905e(bArr);
                            dty0Var10.m117906f(this.f200479o);
                            dty0Var10.m117901a(this.f200479o);
                            wwy0VarM117907g = dty0Var10.m117907g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f200465a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f200483s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        znr0Var.m220644C(this.f200477m);
                        znr0Var.m220654i(this.f200478n);
                        znr0Var.m220668s(f);
                        znr0Var.m220671v(i10);
                        znr0Var.m220669t(this.f200487w);
                        znr0Var.m220675z(this.f200488x);
                        znr0Var.m220646a(wwy0VarM117907g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    znr0Var.m220659k0(this.f200454P);
                    znr0Var.m220673x(this.f200456R);
                    znr0Var.m220666q(i4);
                    i6 = 1;
                }
                if (this.f200465a != null) {
                    znr0Var.m220662m(this.f200465a);
                }
                znr0Var.m220656j(i);
                znr0Var.m220672w(str3);
                znr0Var.m220664o(i3);
                znr0Var.m220663n(this.f200462X);
                znr0Var.m220674y(i113 == true ? 1 : 0);
                znr0Var.m220660l(listSingletonList);
                znr0Var.m220661l0(str2);
                znr0Var.m220650e(this.f200476l);
                sqr0 sqr0VarM220645D10 = znr0Var.m220645D();
                sgr0 sgr0VarMo101550i10 = ser0Var.mo101550i(this.f200467c, i6);
                this.f200463Y = sgr0VarMo101550i10;
                sgr0VarMo101550i10.mo99373d(sqr0VarM220645D10);
                return;
            case 12:
                listSingletonList = new ArrayList(3);
                listSingletonList.add(m216537i(this.f200466b));
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                listSingletonList.add(byteBufferAllocate.order(byteOrder).putLong(this.f200457S).array());
                listSingletonList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.f200458T).array());
                i2 = 5760;
                str5 = "audio/opus";
                i3 = i2;
                str2 = null;
                i4 = -1;
                if (this.f200453O != null) {
                    str2 = ler0VarM153936a.f131786a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z11 = this.f200461W;
                if (true != this.f200460V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i114 = i5 | (z11 ? 1 : 0);
                znr0Var = new znr0();
                if (a8t0.m96495g(str3)) {
                    if (a8t0.m96496h(str3)) {
                        if (this.f200482r == 0) {
                            i12 = this.f200480p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f200477m;
                            }
                            this.f200480p = i12;
                            i13 = this.f200481q;
                            if (i13 == -1) {
                                i13 = this.f200478n;
                            }
                            this.f200481q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f200480p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f200489y) {
                            if (this.f200443E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            dty0 dty0Var11 = new dty0();
                            dty0Var11.m117903c(this.f200490z);
                            dty0Var11.m117902b(this.f200440B);
                            dty0Var11.m117904d(this.f200439A);
                            dty0Var11.m117905e(bArr);
                            dty0Var11.m117906f(this.f200479o);
                            dty0Var11.m117901a(this.f200479o);
                            wwy0VarM117907g = dty0Var11.m117907g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f200465a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f200483s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        znr0Var.m220644C(this.f200477m);
                        znr0Var.m220654i(this.f200478n);
                        znr0Var.m220668s(f);
                        znr0Var.m220671v(i10);
                        znr0Var.m220669t(this.f200487w);
                        znr0Var.m220675z(this.f200488x);
                        znr0Var.m220646a(wwy0VarM117907g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    znr0Var.m220659k0(this.f200454P);
                    znr0Var.m220673x(this.f200456R);
                    znr0Var.m220666q(i4);
                    i6 = 1;
                }
                if (this.f200465a != null) {
                    znr0Var.m220662m(this.f200465a);
                }
                znr0Var.m220656j(i);
                znr0Var.m220672w(str3);
                znr0Var.m220664o(i3);
                znr0Var.m220663n(this.f200462X);
                znr0Var.m220674y(i114 == true ? 1 : 0);
                znr0Var.m220660l(listSingletonList);
                znr0Var.m220661l0(str2);
                znr0Var.m220650e(this.f200476l);
                sqr0 sqr0VarM220645D11 = znr0Var.m220645D();
                sgr0 sgr0VarMo101550i11 = ser0Var.mo101550i(this.f200467c, i6);
                this.f200463Y = sgr0VarMo101550i11;
                sgr0VarMo101550i11.mo99373d(sqr0VarM220645D11);
                return;
            case 13:
                listSingletonList = Collections.singletonList(m216537i(str4));
                bdr0 bdr0VarM109234a = cdr0.m109234a(this.f200475k);
                this.f200456R = bdr0VarM109234a.f76291a;
                this.f200454P = bdr0VarM109234a.f76292b;
                str5 = "audio/mp4a-latm";
                str2 = bdr0VarM109234a.f76293c;
                i4 = -1;
                i3 = -1;
                if (this.f200453O != null) {
                    str2 = ler0VarM153936a.f131786a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z12 = this.f200461W;
                if (true != this.f200460V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i115 = i5 | (z12 ? 1 : 0);
                znr0Var = new znr0();
                if (a8t0.m96495g(str3)) {
                    if (a8t0.m96496h(str3)) {
                        if (this.f200482r == 0) {
                            i12 = this.f200480p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f200477m;
                            }
                            this.f200480p = i12;
                            i13 = this.f200481q;
                            if (i13 == -1) {
                                i13 = this.f200478n;
                            }
                            this.f200481q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f200480p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f200489y) {
                            if (this.f200443E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            dty0 dty0Var12 = new dty0();
                            dty0Var12.m117903c(this.f200490z);
                            dty0Var12.m117902b(this.f200440B);
                            dty0Var12.m117904d(this.f200439A);
                            dty0Var12.m117905e(bArr);
                            dty0Var12.m117906f(this.f200479o);
                            dty0Var12.m117901a(this.f200479o);
                            wwy0VarM117907g = dty0Var12.m117907g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f200465a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f200483s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        znr0Var.m220644C(this.f200477m);
                        znr0Var.m220654i(this.f200478n);
                        znr0Var.m220668s(f);
                        znr0Var.m220671v(i10);
                        znr0Var.m220669t(this.f200487w);
                        znr0Var.m220675z(this.f200488x);
                        znr0Var.m220646a(wwy0VarM117907g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    znr0Var.m220659k0(this.f200454P);
                    znr0Var.m220673x(this.f200456R);
                    znr0Var.m220666q(i4);
                    i6 = 1;
                }
                if (this.f200465a != null) {
                    znr0Var.m220662m(this.f200465a);
                }
                znr0Var.m220656j(i);
                znr0Var.m220672w(str3);
                znr0Var.m220664o(i3);
                znr0Var.m220663n(this.f200462X);
                znr0Var.m220674y(i115 == true ? 1 : 0);
                znr0Var.m220660l(listSingletonList);
                znr0Var.m220661l0(str2);
                znr0Var.m220650e(this.f200476l);
                sqr0 sqr0VarM220645D12 = znr0Var.m220645D();
                sgr0 sgr0VarMo101550i12 = ser0Var.mo101550i(this.f200467c, i6);
                this.f200463Y = sgr0VarMo101550i12;
                sgr0VarMo101550i12.mo99373d(sqr0VarM220645D12);
                return;
            case 14:
                str5 = "audio/mpeg-L2";
                listSingletonList = null;
                str2 = null;
                i4 = -1;
                i3 = 4096;
                if (this.f200453O != null) {
                    str2 = ler0VarM153936a.f131786a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z13 = this.f200461W;
                if (true != this.f200460V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i116 = i5 | (z13 ? 1 : 0);
                znr0Var = new znr0();
                if (a8t0.m96495g(str3)) {
                    if (a8t0.m96496h(str3)) {
                        if (this.f200482r == 0) {
                            i12 = this.f200480p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f200477m;
                            }
                            this.f200480p = i12;
                            i13 = this.f200481q;
                            if (i13 == -1) {
                                i13 = this.f200478n;
                            }
                            this.f200481q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f200480p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f200489y) {
                            if (this.f200443E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            dty0 dty0Var13 = new dty0();
                            dty0Var13.m117903c(this.f200490z);
                            dty0Var13.m117902b(this.f200440B);
                            dty0Var13.m117904d(this.f200439A);
                            dty0Var13.m117905e(bArr);
                            dty0Var13.m117906f(this.f200479o);
                            dty0Var13.m117901a(this.f200479o);
                            wwy0VarM117907g = dty0Var13.m117907g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f200465a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f200483s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        znr0Var.m220644C(this.f200477m);
                        znr0Var.m220654i(this.f200478n);
                        znr0Var.m220668s(f);
                        znr0Var.m220671v(i10);
                        znr0Var.m220669t(this.f200487w);
                        znr0Var.m220675z(this.f200488x);
                        znr0Var.m220646a(wwy0VarM117907g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    znr0Var.m220659k0(this.f200454P);
                    znr0Var.m220673x(this.f200456R);
                    znr0Var.m220666q(i4);
                    i6 = 1;
                }
                if (this.f200465a != null) {
                    znr0Var.m220662m(this.f200465a);
                }
                znr0Var.m220656j(i);
                znr0Var.m220672w(str3);
                znr0Var.m220664o(i3);
                znr0Var.m220663n(this.f200462X);
                znr0Var.m220674y(i116 == true ? 1 : 0);
                znr0Var.m220660l(listSingletonList);
                znr0Var.m220661l0(str2);
                znr0Var.m220650e(this.f200476l);
                sqr0 sqr0VarM220645D13 = znr0Var.m220645D();
                sgr0 sgr0VarMo101550i13 = ser0Var.mo101550i(this.f200467c, i6);
                this.f200463Y = sgr0VarMo101550i13;
                sgr0VarMo101550i13.mo99373d(sqr0VarM220645D13);
                return;
            case 15:
                str5 = DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG;
                listSingletonList = null;
                str2 = null;
                i4 = -1;
                i3 = 4096;
                if (this.f200453O != null) {
                    str2 = ler0VarM153936a.f131786a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z14 = this.f200461W;
                if (true != this.f200460V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i117 = i5 | (z14 ? 1 : 0);
                znr0Var = new znr0();
                if (a8t0.m96495g(str3)) {
                    if (a8t0.m96496h(str3)) {
                        if (this.f200482r == 0) {
                            i12 = this.f200480p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f200477m;
                            }
                            this.f200480p = i12;
                            i13 = this.f200481q;
                            if (i13 == -1) {
                                i13 = this.f200478n;
                            }
                            this.f200481q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f200480p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f200489y) {
                            if (this.f200443E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            dty0 dty0Var14 = new dty0();
                            dty0Var14.m117903c(this.f200490z);
                            dty0Var14.m117902b(this.f200440B);
                            dty0Var14.m117904d(this.f200439A);
                            dty0Var14.m117905e(bArr);
                            dty0Var14.m117906f(this.f200479o);
                            dty0Var14.m117901a(this.f200479o);
                            wwy0VarM117907g = dty0Var14.m117907g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f200465a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f200483s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        znr0Var.m220644C(this.f200477m);
                        znr0Var.m220654i(this.f200478n);
                        znr0Var.m220668s(f);
                        znr0Var.m220671v(i10);
                        znr0Var.m220669t(this.f200487w);
                        znr0Var.m220675z(this.f200488x);
                        znr0Var.m220646a(wwy0VarM117907g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    znr0Var.m220659k0(this.f200454P);
                    znr0Var.m220673x(this.f200456R);
                    znr0Var.m220666q(i4);
                    i6 = 1;
                }
                if (this.f200465a != null) {
                    znr0Var.m220662m(this.f200465a);
                }
                znr0Var.m220656j(i);
                znr0Var.m220672w(str3);
                znr0Var.m220664o(i3);
                znr0Var.m220663n(this.f200462X);
                znr0Var.m220674y(i117 == true ? 1 : 0);
                znr0Var.m220660l(listSingletonList);
                znr0Var.m220661l0(str2);
                znr0Var.m220650e(this.f200476l);
                sqr0 sqr0VarM220645D14 = znr0Var.m220645D();
                sgr0 sgr0VarMo101550i14 = ser0Var.mo101550i(this.f200467c, i6);
                this.f200463Y = sgr0VarMo101550i14;
                sgr0VarMo101550i14.mo99373d(sqr0VarM220645D14);
                return;
            case 16:
                str5 = "audio/ac3";
                listSingletonList = null;
                str2 = null;
                i4 = -1;
                i3 = -1;
                if (this.f200453O != null) {
                    str2 = ler0VarM153936a.f131786a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z15 = this.f200461W;
                if (true != this.f200460V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i118 = i5 | (z15 ? 1 : 0);
                znr0Var = new znr0();
                if (a8t0.m96495g(str3)) {
                    if (a8t0.m96496h(str3)) {
                        if (this.f200482r == 0) {
                            i12 = this.f200480p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f200477m;
                            }
                            this.f200480p = i12;
                            i13 = this.f200481q;
                            if (i13 == -1) {
                                i13 = this.f200478n;
                            }
                            this.f200481q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f200480p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f200489y) {
                            if (this.f200443E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            dty0 dty0Var15 = new dty0();
                            dty0Var15.m117903c(this.f200490z);
                            dty0Var15.m117902b(this.f200440B);
                            dty0Var15.m117904d(this.f200439A);
                            dty0Var15.m117905e(bArr);
                            dty0Var15.m117906f(this.f200479o);
                            dty0Var15.m117901a(this.f200479o);
                            wwy0VarM117907g = dty0Var15.m117907g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f200465a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f200483s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        znr0Var.m220644C(this.f200477m);
                        znr0Var.m220654i(this.f200478n);
                        znr0Var.m220668s(f);
                        znr0Var.m220671v(i10);
                        znr0Var.m220669t(this.f200487w);
                        znr0Var.m220675z(this.f200488x);
                        znr0Var.m220646a(wwy0VarM117907g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    znr0Var.m220659k0(this.f200454P);
                    znr0Var.m220673x(this.f200456R);
                    znr0Var.m220666q(i4);
                    i6 = 1;
                }
                if (this.f200465a != null) {
                    znr0Var.m220662m(this.f200465a);
                }
                znr0Var.m220656j(i);
                znr0Var.m220672w(str3);
                znr0Var.m220664o(i3);
                znr0Var.m220663n(this.f200462X);
                znr0Var.m220674y(i118 == true ? 1 : 0);
                znr0Var.m220660l(listSingletonList);
                znr0Var.m220661l0(str2);
                znr0Var.m220650e(this.f200476l);
                sqr0 sqr0VarM220645D15 = znr0Var.m220645D();
                sgr0 sgr0VarMo101550i15 = ser0Var.mo101550i(this.f200467c, i6);
                this.f200463Y = sgr0VarMo101550i15;
                sgr0VarMo101550i15.mo99373d(sqr0VarM220645D15);
                return;
            case 17:
                str5 = "audio/eac3";
                listSingletonList = null;
                str2 = null;
                i4 = -1;
                i3 = -1;
                if (this.f200453O != null) {
                    str2 = ler0VarM153936a.f131786a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z16 = this.f200461W;
                if (true != this.f200460V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i119 = i5 | (z16 ? 1 : 0);
                znr0Var = new znr0();
                if (a8t0.m96495g(str3)) {
                    if (a8t0.m96496h(str3)) {
                        if (this.f200482r == 0) {
                            i12 = this.f200480p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f200477m;
                            }
                            this.f200480p = i12;
                            i13 = this.f200481q;
                            if (i13 == -1) {
                                i13 = this.f200478n;
                            }
                            this.f200481q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f200480p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f200489y) {
                            if (this.f200443E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            dty0 dty0Var16 = new dty0();
                            dty0Var16.m117903c(this.f200490z);
                            dty0Var16.m117902b(this.f200440B);
                            dty0Var16.m117904d(this.f200439A);
                            dty0Var16.m117905e(bArr);
                            dty0Var16.m117906f(this.f200479o);
                            dty0Var16.m117901a(this.f200479o);
                            wwy0VarM117907g = dty0Var16.m117907g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f200465a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f200483s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        znr0Var.m220644C(this.f200477m);
                        znr0Var.m220654i(this.f200478n);
                        znr0Var.m220668s(f);
                        znr0Var.m220671v(i10);
                        znr0Var.m220669t(this.f200487w);
                        znr0Var.m220675z(this.f200488x);
                        znr0Var.m220646a(wwy0VarM117907g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    znr0Var.m220659k0(this.f200454P);
                    znr0Var.m220673x(this.f200456R);
                    znr0Var.m220666q(i4);
                    i6 = 1;
                }
                if (this.f200465a != null) {
                    znr0Var.m220662m(this.f200465a);
                }
                znr0Var.m220656j(i);
                znr0Var.m220672w(str3);
                znr0Var.m220664o(i3);
                znr0Var.m220663n(this.f200462X);
                znr0Var.m220674y(i119 == true ? 1 : 0);
                znr0Var.m220660l(listSingletonList);
                znr0Var.m220661l0(str2);
                znr0Var.m220650e(this.f200476l);
                sqr0 sqr0VarM220645D16 = znr0Var.m220645D();
                sgr0 sgr0VarMo101550i16 = ser0Var.mo101550i(this.f200467c, i6);
                this.f200463Y = sgr0VarMo101550i16;
                sgr0VarMo101550i16.mo99373d(sqr0VarM220645D16);
                return;
            case 18:
                this.f200459U = new tgr0();
                str5 = "audio/true-hd";
                listSingletonList = null;
                str2 = null;
                i4 = -1;
                i3 = -1;
                if (this.f200453O != null) {
                    str2 = ler0VarM153936a.f131786a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z17 = this.f200461W;
                if (true != this.f200460V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i1110 = i5 | (z17 ? 1 : 0);
                znr0Var = new znr0();
                if (a8t0.m96495g(str3)) {
                    if (a8t0.m96496h(str3)) {
                        if (this.f200482r == 0) {
                            i12 = this.f200480p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f200477m;
                            }
                            this.f200480p = i12;
                            i13 = this.f200481q;
                            if (i13 == -1) {
                                i13 = this.f200478n;
                            }
                            this.f200481q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f200480p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f200489y) {
                            if (this.f200443E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            dty0 dty0Var17 = new dty0();
                            dty0Var17.m117903c(this.f200490z);
                            dty0Var17.m117902b(this.f200440B);
                            dty0Var17.m117904d(this.f200439A);
                            dty0Var17.m117905e(bArr);
                            dty0Var17.m117906f(this.f200479o);
                            dty0Var17.m117901a(this.f200479o);
                            wwy0VarM117907g = dty0Var17.m117907g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f200465a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f200483s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        znr0Var.m220644C(this.f200477m);
                        znr0Var.m220654i(this.f200478n);
                        znr0Var.m220668s(f);
                        znr0Var.m220671v(i10);
                        znr0Var.m220669t(this.f200487w);
                        znr0Var.m220675z(this.f200488x);
                        znr0Var.m220646a(wwy0VarM117907g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    znr0Var.m220659k0(this.f200454P);
                    znr0Var.m220673x(this.f200456R);
                    znr0Var.m220666q(i4);
                    i6 = 1;
                }
                if (this.f200465a != null) {
                    znr0Var.m220662m(this.f200465a);
                }
                znr0Var.m220656j(i);
                znr0Var.m220672w(str3);
                znr0Var.m220664o(i3);
                znr0Var.m220663n(this.f200462X);
                znr0Var.m220674y(i1110 == true ? 1 : 0);
                znr0Var.m220660l(listSingletonList);
                znr0Var.m220661l0(str2);
                znr0Var.m220650e(this.f200476l);
                sqr0 sqr0VarM220645D17 = znr0Var.m220645D();
                sgr0 sgr0VarMo101550i17 = ser0Var.mo101550i(this.f200467c, i6);
                this.f200463Y = sgr0VarMo101550i17;
                sgr0VarMo101550i17.mo99373d(sqr0VarM220645D17);
                return;
            case 19:
            case 20:
                str5 = "audio/vnd.dts";
                listSingletonList = null;
                str2 = null;
                i4 = -1;
                i3 = -1;
                if (this.f200453O != null) {
                    str2 = ler0VarM153936a.f131786a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z18 = this.f200461W;
                if (true != this.f200460V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i1111 = i5 | (z18 ? 1 : 0);
                znr0Var = new znr0();
                if (a8t0.m96495g(str3)) {
                    if (a8t0.m96496h(str3)) {
                        if (this.f200482r == 0) {
                            i12 = this.f200480p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f200477m;
                            }
                            this.f200480p = i12;
                            i13 = this.f200481q;
                            if (i13 == -1) {
                                i13 = this.f200478n;
                            }
                            this.f200481q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f200480p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f200489y) {
                            if (this.f200443E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            dty0 dty0Var18 = new dty0();
                            dty0Var18.m117903c(this.f200490z);
                            dty0Var18.m117902b(this.f200440B);
                            dty0Var18.m117904d(this.f200439A);
                            dty0Var18.m117905e(bArr);
                            dty0Var18.m117906f(this.f200479o);
                            dty0Var18.m117901a(this.f200479o);
                            wwy0VarM117907g = dty0Var18.m117907g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f200465a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f200483s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        znr0Var.m220644C(this.f200477m);
                        znr0Var.m220654i(this.f200478n);
                        znr0Var.m220668s(f);
                        znr0Var.m220671v(i10);
                        znr0Var.m220669t(this.f200487w);
                        znr0Var.m220675z(this.f200488x);
                        znr0Var.m220646a(wwy0VarM117907g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    znr0Var.m220659k0(this.f200454P);
                    znr0Var.m220673x(this.f200456R);
                    znr0Var.m220666q(i4);
                    i6 = 1;
                }
                if (this.f200465a != null) {
                    znr0Var.m220662m(this.f200465a);
                }
                znr0Var.m220656j(i);
                znr0Var.m220672w(str3);
                znr0Var.m220664o(i3);
                znr0Var.m220663n(this.f200462X);
                znr0Var.m220674y(i1111 == true ? 1 : 0);
                znr0Var.m220660l(listSingletonList);
                znr0Var.m220661l0(str2);
                znr0Var.m220650e(this.f200476l);
                sqr0 sqr0VarM220645D18 = znr0Var.m220645D();
                sgr0 sgr0VarMo101550i18 = ser0Var.mo101550i(this.f200467c, i6);
                this.f200463Y = sgr0VarMo101550i18;
                sgr0VarMo101550i18.mo99373d(sqr0VarM220645D18);
                return;
            case 21:
                str5 = "audio/vnd.dts.hd";
                listSingletonList = null;
                str2 = null;
                i4 = -1;
                i3 = -1;
                if (this.f200453O != null) {
                    str2 = ler0VarM153936a.f131786a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z19 = this.f200461W;
                if (true != this.f200460V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i1112 = i5 | (z19 ? 1 : 0);
                znr0Var = new znr0();
                if (a8t0.m96495g(str3)) {
                    if (a8t0.m96496h(str3)) {
                        if (this.f200482r == 0) {
                            i12 = this.f200480p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f200477m;
                            }
                            this.f200480p = i12;
                            i13 = this.f200481q;
                            if (i13 == -1) {
                                i13 = this.f200478n;
                            }
                            this.f200481q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f200480p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f200489y) {
                            if (this.f200443E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            dty0 dty0Var19 = new dty0();
                            dty0Var19.m117903c(this.f200490z);
                            dty0Var19.m117902b(this.f200440B);
                            dty0Var19.m117904d(this.f200439A);
                            dty0Var19.m117905e(bArr);
                            dty0Var19.m117906f(this.f200479o);
                            dty0Var19.m117901a(this.f200479o);
                            wwy0VarM117907g = dty0Var19.m117907g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f200465a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f200483s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        znr0Var.m220644C(this.f200477m);
                        znr0Var.m220654i(this.f200478n);
                        znr0Var.m220668s(f);
                        znr0Var.m220671v(i10);
                        znr0Var.m220669t(this.f200487w);
                        znr0Var.m220675z(this.f200488x);
                        znr0Var.m220646a(wwy0VarM117907g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    znr0Var.m220659k0(this.f200454P);
                    znr0Var.m220673x(this.f200456R);
                    znr0Var.m220666q(i4);
                    i6 = 1;
                }
                if (this.f200465a != null) {
                    znr0Var.m220662m(this.f200465a);
                }
                znr0Var.m220656j(i);
                znr0Var.m220672w(str3);
                znr0Var.m220664o(i3);
                znr0Var.m220663n(this.f200462X);
                znr0Var.m220674y(i1112 == true ? 1 : 0);
                znr0Var.m220660l(listSingletonList);
                znr0Var.m220661l0(str2);
                znr0Var.m220650e(this.f200476l);
                sqr0 sqr0VarM220645D19 = znr0Var.m220645D();
                sgr0 sgr0VarMo101550i19 = ser0Var.mo101550i(this.f200467c, i6);
                this.f200463Y = sgr0VarMo101550i19;
                sgr0VarMo101550i19.mo99373d(sqr0VarM220645D19);
                return;
            case 22:
                listSingletonList = Collections.singletonList(m216537i(str4));
                str5 = "audio/flac";
                str2 = null;
                i4 = -1;
                i3 = -1;
                if (this.f200453O != null) {
                    str2 = ler0VarM153936a.f131786a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z110 = this.f200461W;
                if (true != this.f200460V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i1113 = i5 | (z110 ? 1 : 0);
                znr0Var = new znr0();
                if (a8t0.m96495g(str3)) {
                    if (a8t0.m96496h(str3)) {
                        if (this.f200482r == 0) {
                            i12 = this.f200480p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f200477m;
                            }
                            this.f200480p = i12;
                            i13 = this.f200481q;
                            if (i13 == -1) {
                                i13 = this.f200478n;
                            }
                            this.f200481q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f200480p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f200489y) {
                            if (this.f200443E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            dty0 dty0Var110 = new dty0();
                            dty0Var110.m117903c(this.f200490z);
                            dty0Var110.m117902b(this.f200440B);
                            dty0Var110.m117904d(this.f200439A);
                            dty0Var110.m117905e(bArr);
                            dty0Var110.m117906f(this.f200479o);
                            dty0Var110.m117901a(this.f200479o);
                            wwy0VarM117907g = dty0Var110.m117907g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f200465a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f200483s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        znr0Var.m220644C(this.f200477m);
                        znr0Var.m220654i(this.f200478n);
                        znr0Var.m220668s(f);
                        znr0Var.m220671v(i10);
                        znr0Var.m220669t(this.f200487w);
                        znr0Var.m220675z(this.f200488x);
                        znr0Var.m220646a(wwy0VarM117907g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    znr0Var.m220659k0(this.f200454P);
                    znr0Var.m220673x(this.f200456R);
                    znr0Var.m220666q(i4);
                    i6 = 1;
                }
                if (this.f200465a != null) {
                    znr0Var.m220662m(this.f200465a);
                }
                znr0Var.m220656j(i);
                znr0Var.m220672w(str3);
                znr0Var.m220664o(i3);
                znr0Var.m220663n(this.f200462X);
                znr0Var.m220674y(i1113 == true ? 1 : 0);
                znr0Var.m220660l(listSingletonList);
                znr0Var.m220661l0(str2);
                znr0Var.m220650e(this.f200476l);
                sqr0 sqr0VarM220645D110 = znr0Var.m220645D();
                sgr0 sgr0VarMo101550i110 = ser0Var.mo101550i(this.f200467c, i6);
                this.f200463Y = sgr0VarMo101550i110;
                sgr0VarMo101550i110.mo99373d(sqr0VarM220645D110);
                return;
            case 23:
                if (m216535h(new bgw0(m216537i(this.f200466b)))) {
                    iM159428z = mpw0.m159428z(this.f200455Q);
                    if (iM159428z == 0) {
                        y4w0.m214278f("MatroskaExtractor", "Unsupported PCM bit depth: " + this.f200455Q + ". Setting mimeType to audio/x-unknown");
                    } else {
                        listSingletonList = null;
                        str2 = null;
                        i4 = iM159428z;
                    }
                    i3 = -1;
                    if (this.f200453O != null) {
                        str2 = ler0VarM153936a.f131786a;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z111 = this.f200461W;
                    if (true != this.f200460V) {
                        i5 = 0;
                    } else {
                        i5 = 2;
                    }
                    int i1114 = i5 | (z111 ? 1 : 0);
                    znr0Var = new znr0();
                    if (a8t0.m96495g(str3)) {
                        if (a8t0.m96496h(str3)) {
                            if (this.f200482r == 0) {
                                i12 = this.f200480p;
                                i7 = -1;
                                if (i12 == -1) {
                                    i12 = this.f200477m;
                                }
                                this.f200480p = i12;
                                i13 = this.f200481q;
                                if (i13 == -1) {
                                    i13 = this.f200478n;
                                }
                                this.f200481q = i13;
                            } else {
                                i7 = -1;
                            }
                            i8 = this.f200480p;
                            if (i8 != i7) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f200489y) {
                                if (this.f200443E != -1.0f) {
                                    i9 = 0;
                                } else {
                                    i9 = 0;
                                }
                                dty0 dty0Var111 = new dty0();
                                dty0Var111.m117903c(this.f200490z);
                                dty0Var111.m117902b(this.f200440B);
                                dty0Var111.m117904d(this.f200439A);
                                dty0Var111.m117905e(bArr);
                                dty0Var111.m117906f(this.f200479o);
                                dty0Var111.m117901a(this.f200479o);
                                wwy0VarM117907g = dty0Var111.m117907g();
                            } else {
                                i9 = 0;
                            }
                            if (this.f200465a == null) {
                                iIntValue = i7;
                            } else {
                                iIntValue = i7;
                            }
                            if (this.f200483s == 0) {
                                i10 = iIntValue;
                            } else {
                                i10 = iIntValue;
                            }
                            znr0Var.m220644C(this.f200477m);
                            znr0Var.m220654i(this.f200478n);
                            znr0Var.m220668s(f);
                            znr0Var.m220671v(i10);
                            znr0Var.m220669t(this.f200487w);
                            znr0Var.m220675z(this.f200488x);
                            znr0Var.m220646a(wwy0VarM117907g);
                            i6 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i6 = 3;
                        }
                        break;
                    } else {
                        znr0Var.m220659k0(this.f200454P);
                        znr0Var.m220673x(this.f200456R);
                        znr0Var.m220666q(i4);
                        i6 = 1;
                    }
                    if (this.f200465a != null) {
                        znr0Var.m220662m(this.f200465a);
                    }
                    znr0Var.m220656j(i);
                    znr0Var.m220672w(str3);
                    znr0Var.m220664o(i3);
                    znr0Var.m220663n(this.f200462X);
                    znr0Var.m220674y(i1114 == true ? 1 : 0);
                    znr0Var.m220660l(listSingletonList);
                    znr0Var.m220661l0(str2);
                    znr0Var.m220650e(this.f200476l);
                    sqr0 sqr0VarM220645D111 = znr0Var.m220645D();
                    sgr0 sgr0VarMo101550i111 = ser0Var.mo101550i(this.f200467c, i6);
                    this.f200463Y = sgr0VarMo101550i111;
                    sgr0VarMo101550i111.mo99373d(sqr0VarM220645D111);
                    return;
                }
                y4w0.m214278f("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                listSingletonList = null;
                str2 = null;
                str5 = "audio/x-unknown";
                i4 = -1;
                i3 = -1;
                if (this.f200453O != null) {
                    str2 = ler0VarM153936a.f131786a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z112 = this.f200461W;
                if (true != this.f200460V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i1115 = i5 | (z112 ? 1 : 0);
                znr0Var = new znr0();
                if (a8t0.m96495g(str3)) {
                    if (a8t0.m96496h(str3)) {
                        if (this.f200482r == 0) {
                            i12 = this.f200480p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f200477m;
                            }
                            this.f200480p = i12;
                            i13 = this.f200481q;
                            if (i13 == -1) {
                                i13 = this.f200478n;
                            }
                            this.f200481q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f200480p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f200489y) {
                            if (this.f200443E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            dty0 dty0Var112 = new dty0();
                            dty0Var112.m117903c(this.f200490z);
                            dty0Var112.m117902b(this.f200440B);
                            dty0Var112.m117904d(this.f200439A);
                            dty0Var112.m117905e(bArr);
                            dty0Var112.m117906f(this.f200479o);
                            dty0Var112.m117901a(this.f200479o);
                            wwy0VarM117907g = dty0Var112.m117907g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f200465a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f200483s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        znr0Var.m220644C(this.f200477m);
                        znr0Var.m220654i(this.f200478n);
                        znr0Var.m220668s(f);
                        znr0Var.m220671v(i10);
                        znr0Var.m220669t(this.f200487w);
                        znr0Var.m220675z(this.f200488x);
                        znr0Var.m220646a(wwy0VarM117907g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    znr0Var.m220659k0(this.f200454P);
                    znr0Var.m220673x(this.f200456R);
                    znr0Var.m220666q(i4);
                    i6 = 1;
                }
                if (this.f200465a != null) {
                    znr0Var.m220662m(this.f200465a);
                }
                znr0Var.m220656j(i);
                znr0Var.m220672w(str3);
                znr0Var.m220664o(i3);
                znr0Var.m220663n(this.f200462X);
                znr0Var.m220674y(i1115 == true ? 1 : 0);
                znr0Var.m220660l(listSingletonList);
                znr0Var.m220661l0(str2);
                znr0Var.m220650e(this.f200476l);
                sqr0 sqr0VarM220645D112 = znr0Var.m220645D();
                sgr0 sgr0VarMo101550i112 = ser0Var.mo101550i(this.f200467c, i6);
                this.f200463Y = sgr0VarMo101550i112;
                sgr0VarMo101550i112.mo99373d(sqr0VarM220645D112);
                return;
            case 24:
                iM159428z = mpw0.m159428z(this.f200455Q);
                if (iM159428z == 0) {
                    y4w0.m214278f("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + this.f200455Q + ". Setting mimeType to audio/x-unknown");
                    listSingletonList = null;
                    str2 = null;
                    str5 = "audio/x-unknown";
                    i4 = -1;
                } else {
                    listSingletonList = null;
                    str2 = null;
                    i4 = iM159428z;
                }
                i3 = -1;
                if (this.f200453O != null) {
                    str2 = ler0VarM153936a.f131786a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z113 = this.f200461W;
                if (true != this.f200460V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i1116 = i5 | (z113 ? 1 : 0);
                znr0Var = new znr0();
                if (a8t0.m96495g(str3)) {
                    if (a8t0.m96496h(str3)) {
                        if (this.f200482r == 0) {
                            i12 = this.f200480p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f200477m;
                            }
                            this.f200480p = i12;
                            i13 = this.f200481q;
                            if (i13 == -1) {
                                i13 = this.f200478n;
                            }
                            this.f200481q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f200480p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f200489y) {
                            if (this.f200443E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            dty0 dty0Var113 = new dty0();
                            dty0Var113.m117903c(this.f200490z);
                            dty0Var113.m117902b(this.f200440B);
                            dty0Var113.m117904d(this.f200439A);
                            dty0Var113.m117905e(bArr);
                            dty0Var113.m117906f(this.f200479o);
                            dty0Var113.m117901a(this.f200479o);
                            wwy0VarM117907g = dty0Var113.m117907g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f200465a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f200483s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        znr0Var.m220644C(this.f200477m);
                        znr0Var.m220654i(this.f200478n);
                        znr0Var.m220668s(f);
                        znr0Var.m220671v(i10);
                        znr0Var.m220669t(this.f200487w);
                        znr0Var.m220675z(this.f200488x);
                        znr0Var.m220646a(wwy0VarM117907g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    znr0Var.m220659k0(this.f200454P);
                    znr0Var.m220673x(this.f200456R);
                    znr0Var.m220666q(i4);
                    i6 = 1;
                }
                if (this.f200465a != null) {
                    znr0Var.m220662m(this.f200465a);
                }
                znr0Var.m220656j(i);
                znr0Var.m220672w(str3);
                znr0Var.m220664o(i3);
                znr0Var.m220663n(this.f200462X);
                znr0Var.m220674y(i1116 == true ? 1 : 0);
                znr0Var.m220660l(listSingletonList);
                znr0Var.m220661l0(str2);
                znr0Var.m220650e(this.f200476l);
                sqr0 sqr0VarM220645D113 = znr0Var.m220645D();
                sgr0 sgr0VarMo101550i113 = ser0Var.mo101550i(this.f200467c, i6);
                this.f200463Y = sgr0VarMo101550i113;
                sgr0VarMo101550i113.mo99373d(sqr0VarM220645D113);
                return;
            case 25:
                int i20 = this.f200455Q;
                if (i20 == 8) {
                    listSingletonList = null;
                    str2 = null;
                    i4 = 3;
                } else {
                    if (i20 == 16) {
                        iM159428z = SQLiteDatabase.CREATE_IF_NECESSARY;
                    } else if (i20 == 24) {
                        iM159428z = 1342177280;
                    } else if (i20 == 32) {
                        iM159428z = 1610612736;
                    } else {
                        y4w0.m214278f("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + i20 + ". Setting mimeType to audio/x-unknown");
                        listSingletonList = null;
                        str2 = null;
                        str5 = "audio/x-unknown";
                        i4 = -1;
                    }
                    listSingletonList = null;
                    str2 = null;
                    i4 = iM159428z;
                }
                i3 = -1;
                if (this.f200453O != null) {
                    str2 = ler0VarM153936a.f131786a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z114 = this.f200461W;
                if (true != this.f200460V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i1117 = i5 | (z114 ? 1 : 0);
                znr0Var = new znr0();
                if (a8t0.m96495g(str3)) {
                    if (a8t0.m96496h(str3)) {
                        if (this.f200482r == 0) {
                            i12 = this.f200480p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f200477m;
                            }
                            this.f200480p = i12;
                            i13 = this.f200481q;
                            if (i13 == -1) {
                                i13 = this.f200478n;
                            }
                            this.f200481q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f200480p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f200489y) {
                            if (this.f200443E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            dty0 dty0Var114 = new dty0();
                            dty0Var114.m117903c(this.f200490z);
                            dty0Var114.m117902b(this.f200440B);
                            dty0Var114.m117904d(this.f200439A);
                            dty0Var114.m117905e(bArr);
                            dty0Var114.m117906f(this.f200479o);
                            dty0Var114.m117901a(this.f200479o);
                            wwy0VarM117907g = dty0Var114.m117907g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f200465a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f200483s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        znr0Var.m220644C(this.f200477m);
                        znr0Var.m220654i(this.f200478n);
                        znr0Var.m220668s(f);
                        znr0Var.m220671v(i10);
                        znr0Var.m220669t(this.f200487w);
                        znr0Var.m220675z(this.f200488x);
                        znr0Var.m220646a(wwy0VarM117907g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    znr0Var.m220659k0(this.f200454P);
                    znr0Var.m220673x(this.f200456R);
                    znr0Var.m220666q(i4);
                    i6 = 1;
                }
                if (this.f200465a != null) {
                    znr0Var.m220662m(this.f200465a);
                }
                znr0Var.m220656j(i);
                znr0Var.m220672w(str3);
                znr0Var.m220664o(i3);
                znr0Var.m220663n(this.f200462X);
                znr0Var.m220674y(i1117 == true ? 1 : 0);
                znr0Var.m220660l(listSingletonList);
                znr0Var.m220661l0(str2);
                znr0Var.m220650e(this.f200476l);
                sqr0 sqr0VarM220645D114 = znr0Var.m220645D();
                sgr0 sgr0VarMo101550i114 = ser0Var.mo101550i(this.f200467c, i6);
                this.f200463Y = sgr0VarMo101550i114;
                sgr0VarMo101550i114.mo99373d(sqr0VarM220645D114);
                return;
            case 26:
                int i21 = this.f200455Q;
                if (i21 == 32) {
                    listSingletonList = null;
                    str2 = null;
                    i4 = iM159428z;
                } else {
                    y4w0.m214278f("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + i21 + ". Setting mimeType to audio/x-unknown");
                    listSingletonList = null;
                    str2 = null;
                    str5 = "audio/x-unknown";
                    i4 = -1;
                }
                i3 = -1;
                if (this.f200453O != null) {
                    str2 = ler0VarM153936a.f131786a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z115 = this.f200461W;
                if (true != this.f200460V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i1118 = i5 | (z115 ? 1 : 0);
                znr0Var = new znr0();
                if (a8t0.m96495g(str3)) {
                    if (a8t0.m96496h(str3)) {
                        if (this.f200482r == 0) {
                            i12 = this.f200480p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f200477m;
                            }
                            this.f200480p = i12;
                            i13 = this.f200481q;
                            if (i13 == -1) {
                                i13 = this.f200478n;
                            }
                            this.f200481q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f200480p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f200489y) {
                            if (this.f200443E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            dty0 dty0Var115 = new dty0();
                            dty0Var115.m117903c(this.f200490z);
                            dty0Var115.m117902b(this.f200440B);
                            dty0Var115.m117904d(this.f200439A);
                            dty0Var115.m117905e(bArr);
                            dty0Var115.m117906f(this.f200479o);
                            dty0Var115.m117901a(this.f200479o);
                            wwy0VarM117907g = dty0Var115.m117907g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f200465a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f200483s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        znr0Var.m220644C(this.f200477m);
                        znr0Var.m220654i(this.f200478n);
                        znr0Var.m220668s(f);
                        znr0Var.m220671v(i10);
                        znr0Var.m220669t(this.f200487w);
                        znr0Var.m220675z(this.f200488x);
                        znr0Var.m220646a(wwy0VarM117907g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    znr0Var.m220659k0(this.f200454P);
                    znr0Var.m220673x(this.f200456R);
                    znr0Var.m220666q(i4);
                    i6 = 1;
                }
                if (this.f200465a != null) {
                    znr0Var.m220662m(this.f200465a);
                }
                znr0Var.m220656j(i);
                znr0Var.m220672w(str3);
                znr0Var.m220664o(i3);
                znr0Var.m220663n(this.f200462X);
                znr0Var.m220674y(i1118 == true ? 1 : 0);
                znr0Var.m220660l(listSingletonList);
                znr0Var.m220661l0(str2);
                znr0Var.m220650e(this.f200476l);
                sqr0 sqr0VarM220645D115 = znr0Var.m220645D();
                sgr0 sgr0VarMo101550i115 = ser0Var.mo101550i(this.f200467c, i6);
                this.f200463Y = sgr0VarMo101550i115;
                sgr0VarMo101550i115.mo99373d(sqr0VarM220645D115);
                return;
            case 27:
                listSingletonList = null;
                str2 = null;
                str5 = "application/x-subrip";
                i4 = -1;
                i3 = -1;
                if (this.f200453O != null) {
                    str2 = ler0VarM153936a.f131786a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z116 = this.f200461W;
                if (true != this.f200460V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i1119 = i5 | (z116 ? 1 : 0);
                znr0Var = new znr0();
                if (a8t0.m96495g(str3)) {
                    if (a8t0.m96496h(str3)) {
                        if (this.f200482r == 0) {
                            i12 = this.f200480p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f200477m;
                            }
                            this.f200480p = i12;
                            i13 = this.f200481q;
                            if (i13 == -1) {
                                i13 = this.f200478n;
                            }
                            this.f200481q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f200480p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f200489y) {
                            if (this.f200443E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            dty0 dty0Var116 = new dty0();
                            dty0Var116.m117903c(this.f200490z);
                            dty0Var116.m117902b(this.f200440B);
                            dty0Var116.m117904d(this.f200439A);
                            dty0Var116.m117905e(bArr);
                            dty0Var116.m117906f(this.f200479o);
                            dty0Var116.m117901a(this.f200479o);
                            wwy0VarM117907g = dty0Var116.m117907g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f200465a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f200483s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        znr0Var.m220644C(this.f200477m);
                        znr0Var.m220654i(this.f200478n);
                        znr0Var.m220668s(f);
                        znr0Var.m220671v(i10);
                        znr0Var.m220669t(this.f200487w);
                        znr0Var.m220675z(this.f200488x);
                        znr0Var.m220646a(wwy0VarM117907g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    znr0Var.m220659k0(this.f200454P);
                    znr0Var.m220673x(this.f200456R);
                    znr0Var.m220666q(i4);
                    i6 = 1;
                }
                if (this.f200465a != null) {
                    znr0Var.m220662m(this.f200465a);
                }
                znr0Var.m220656j(i);
                znr0Var.m220672w(str3);
                znr0Var.m220664o(i3);
                znr0Var.m220663n(this.f200462X);
                znr0Var.m220674y(i1119 == true ? 1 : 0);
                znr0Var.m220660l(listSingletonList);
                znr0Var.m220661l0(str2);
                znr0Var.m220650e(this.f200476l);
                sqr0 sqr0VarM220645D116 = znr0Var.m220645D();
                sgr0 sgr0VarMo101550i116 = ser0Var.mo101550i(this.f200467c, i6);
                this.f200463Y = sgr0VarMo101550i116;
                sgr0VarMo101550i116.mo99373d(sqr0VarM220645D116);
                return;
            case 28:
                listSingletonList = zzgaa.zzn(zkr0.f204797e0, m216537i(this.f200466b));
                str2 = null;
                str5 = "text/x-ssa";
                i4 = -1;
                i3 = -1;
                if (this.f200453O != null) {
                    str2 = ler0VarM153936a.f131786a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z117 = this.f200461W;
                if (true != this.f200460V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i11110 = i5 | (z117 ? 1 : 0);
                znr0Var = new znr0();
                if (a8t0.m96495g(str3)) {
                    if (a8t0.m96496h(str3)) {
                        if (this.f200482r == 0) {
                            i12 = this.f200480p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f200477m;
                            }
                            this.f200480p = i12;
                            i13 = this.f200481q;
                            if (i13 == -1) {
                                i13 = this.f200478n;
                            }
                            this.f200481q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f200480p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f200489y) {
                            if (this.f200443E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            dty0 dty0Var117 = new dty0();
                            dty0Var117.m117903c(this.f200490z);
                            dty0Var117.m117902b(this.f200440B);
                            dty0Var117.m117904d(this.f200439A);
                            dty0Var117.m117905e(bArr);
                            dty0Var117.m117906f(this.f200479o);
                            dty0Var117.m117901a(this.f200479o);
                            wwy0VarM117907g = dty0Var117.m117907g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f200465a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f200483s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        znr0Var.m220644C(this.f200477m);
                        znr0Var.m220654i(this.f200478n);
                        znr0Var.m220668s(f);
                        znr0Var.m220671v(i10);
                        znr0Var.m220669t(this.f200487w);
                        znr0Var.m220675z(this.f200488x);
                        znr0Var.m220646a(wwy0VarM117907g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    znr0Var.m220659k0(this.f200454P);
                    znr0Var.m220673x(this.f200456R);
                    znr0Var.m220666q(i4);
                    i6 = 1;
                }
                if (this.f200465a != null) {
                    znr0Var.m220662m(this.f200465a);
                }
                znr0Var.m220656j(i);
                znr0Var.m220672w(str3);
                znr0Var.m220664o(i3);
                znr0Var.m220663n(this.f200462X);
                znr0Var.m220674y(i11110 == true ? 1 : 0);
                znr0Var.m220660l(listSingletonList);
                znr0Var.m220661l0(str2);
                znr0Var.m220650e(this.f200476l);
                sqr0 sqr0VarM220645D117 = znr0Var.m220645D();
                sgr0 sgr0VarMo101550i117 = ser0Var.mo101550i(this.f200467c, i6);
                this.f200463Y = sgr0VarMo101550i117;
                sgr0VarMo101550i117.mo99373d(sqr0VarM220645D117);
                return;
            case 29:
                listSingletonList = null;
                str2 = null;
                str5 = "text/vtt";
                i4 = -1;
                i3 = -1;
                if (this.f200453O != null) {
                    str2 = ler0VarM153936a.f131786a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z118 = this.f200461W;
                if (true != this.f200460V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i11111 = i5 | (z118 ? 1 : 0);
                znr0Var = new znr0();
                if (a8t0.m96495g(str3)) {
                    if (a8t0.m96496h(str3)) {
                        if (this.f200482r == 0) {
                            i12 = this.f200480p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f200477m;
                            }
                            this.f200480p = i12;
                            i13 = this.f200481q;
                            if (i13 == -1) {
                                i13 = this.f200478n;
                            }
                            this.f200481q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f200480p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f200489y) {
                            if (this.f200443E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            dty0 dty0Var118 = new dty0();
                            dty0Var118.m117903c(this.f200490z);
                            dty0Var118.m117902b(this.f200440B);
                            dty0Var118.m117904d(this.f200439A);
                            dty0Var118.m117905e(bArr);
                            dty0Var118.m117906f(this.f200479o);
                            dty0Var118.m117901a(this.f200479o);
                            wwy0VarM117907g = dty0Var118.m117907g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f200465a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f200483s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        znr0Var.m220644C(this.f200477m);
                        znr0Var.m220654i(this.f200478n);
                        znr0Var.m220668s(f);
                        znr0Var.m220671v(i10);
                        znr0Var.m220669t(this.f200487w);
                        znr0Var.m220675z(this.f200488x);
                        znr0Var.m220646a(wwy0VarM117907g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    znr0Var.m220659k0(this.f200454P);
                    znr0Var.m220673x(this.f200456R);
                    znr0Var.m220666q(i4);
                    i6 = 1;
                }
                if (this.f200465a != null) {
                    znr0Var.m220662m(this.f200465a);
                }
                znr0Var.m220656j(i);
                znr0Var.m220672w(str3);
                znr0Var.m220664o(i3);
                znr0Var.m220663n(this.f200462X);
                znr0Var.m220674y(i11111 == true ? 1 : 0);
                znr0Var.m220660l(listSingletonList);
                znr0Var.m220661l0(str2);
                znr0Var.m220650e(this.f200476l);
                sqr0 sqr0VarM220645D118 = znr0Var.m220645D();
                sgr0 sgr0VarMo101550i118 = ser0Var.mo101550i(this.f200467c, i6);
                this.f200463Y = sgr0VarMo101550i118;
                sgr0VarMo101550i118.mo99373d(sqr0VarM220645D118);
                return;
            case 30:
                listSingletonList = zzgaa.zzm(m216537i(str4));
                str5 = "application/vobsub";
                str2 = null;
                i4 = -1;
                i3 = -1;
                if (this.f200453O != null) {
                    str2 = ler0VarM153936a.f131786a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z119 = this.f200461W;
                if (true != this.f200460V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i11112 = i5 | (z119 ? 1 : 0);
                znr0Var = new znr0();
                if (a8t0.m96495g(str3)) {
                    if (a8t0.m96496h(str3)) {
                        if (this.f200482r == 0) {
                            i12 = this.f200480p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f200477m;
                            }
                            this.f200480p = i12;
                            i13 = this.f200481q;
                            if (i13 == -1) {
                                i13 = this.f200478n;
                            }
                            this.f200481q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f200480p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f200489y) {
                            if (this.f200443E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            dty0 dty0Var119 = new dty0();
                            dty0Var119.m117903c(this.f200490z);
                            dty0Var119.m117902b(this.f200440B);
                            dty0Var119.m117904d(this.f200439A);
                            dty0Var119.m117905e(bArr);
                            dty0Var119.m117906f(this.f200479o);
                            dty0Var119.m117901a(this.f200479o);
                            wwy0VarM117907g = dty0Var119.m117907g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f200465a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f200483s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        znr0Var.m220644C(this.f200477m);
                        znr0Var.m220654i(this.f200478n);
                        znr0Var.m220668s(f);
                        znr0Var.m220671v(i10);
                        znr0Var.m220669t(this.f200487w);
                        znr0Var.m220675z(this.f200488x);
                        znr0Var.m220646a(wwy0VarM117907g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    znr0Var.m220659k0(this.f200454P);
                    znr0Var.m220673x(this.f200456R);
                    znr0Var.m220666q(i4);
                    i6 = 1;
                }
                if (this.f200465a != null) {
                    znr0Var.m220662m(this.f200465a);
                }
                znr0Var.m220656j(i);
                znr0Var.m220672w(str3);
                znr0Var.m220664o(i3);
                znr0Var.m220663n(this.f200462X);
                znr0Var.m220674y(i11112 == true ? 1 : 0);
                znr0Var.m220660l(listSingletonList);
                znr0Var.m220661l0(str2);
                znr0Var.m220650e(this.f200476l);
                sqr0 sqr0VarM220645D119 = znr0Var.m220645D();
                sgr0 sgr0VarMo101550i119 = ser0Var.mo101550i(this.f200467c, i6);
                this.f200463Y = sgr0VarMo101550i119;
                sgr0VarMo101550i119.mo99373d(sqr0VarM220645D119);
                return;
            case 31:
                listSingletonList = null;
                str2 = null;
                str5 = "application/pgs";
                i4 = -1;
                i3 = -1;
                if (this.f200453O != null) {
                    str2 = ler0VarM153936a.f131786a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z1110 = this.f200461W;
                if (true != this.f200460V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i11113 = i5 | (z1110 ? 1 : 0);
                znr0Var = new znr0();
                if (a8t0.m96495g(str3)) {
                    if (a8t0.m96496h(str3)) {
                        if (this.f200482r == 0) {
                            i12 = this.f200480p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f200477m;
                            }
                            this.f200480p = i12;
                            i13 = this.f200481q;
                            if (i13 == -1) {
                                i13 = this.f200478n;
                            }
                            this.f200481q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f200480p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f200489y) {
                            if (this.f200443E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            dty0 dty0Var1110 = new dty0();
                            dty0Var1110.m117903c(this.f200490z);
                            dty0Var1110.m117902b(this.f200440B);
                            dty0Var1110.m117904d(this.f200439A);
                            dty0Var1110.m117905e(bArr);
                            dty0Var1110.m117906f(this.f200479o);
                            dty0Var1110.m117901a(this.f200479o);
                            wwy0VarM117907g = dty0Var1110.m117907g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f200465a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f200483s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        znr0Var.m220644C(this.f200477m);
                        znr0Var.m220654i(this.f200478n);
                        znr0Var.m220668s(f);
                        znr0Var.m220671v(i10);
                        znr0Var.m220669t(this.f200487w);
                        znr0Var.m220675z(this.f200488x);
                        znr0Var.m220646a(wwy0VarM117907g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    znr0Var.m220659k0(this.f200454P);
                    znr0Var.m220673x(this.f200456R);
                    znr0Var.m220666q(i4);
                    i6 = 1;
                }
                if (this.f200465a != null) {
                    znr0Var.m220662m(this.f200465a);
                }
                znr0Var.m220656j(i);
                znr0Var.m220672w(str3);
                znr0Var.m220664o(i3);
                znr0Var.m220663n(this.f200462X);
                znr0Var.m220674y(i11113 == true ? 1 : 0);
                znr0Var.m220660l(listSingletonList);
                znr0Var.m220661l0(str2);
                znr0Var.m220650e(this.f200476l);
                sqr0 sqr0VarM220645D1110 = znr0Var.m220645D();
                sgr0 sgr0VarMo101550i1110 = ser0Var.mo101550i(this.f200467c, i6);
                this.f200463Y = sgr0VarMo101550i1110;
                sgr0VarMo101550i1110.mo99373d(sqr0VarM220645D1110);
                return;
            case 32:
                byte[] bArr3 = new byte[4];
                System.arraycopy(m216537i(str4), 0, bArr3, 0, 4);
                listSingletonList = zzgaa.zzm(bArr3);
                str2 = null;
                str5 = "application/dvbsubs";
                i4 = -1;
                i3 = -1;
                if (this.f200453O != null) {
                    str2 = ler0VarM153936a.f131786a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z1111 = this.f200461W;
                if (true != this.f200460V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i11114 = i5 | (z1111 ? 1 : 0);
                znr0Var = new znr0();
                if (a8t0.m96495g(str3)) {
                    if (a8t0.m96496h(str3)) {
                        if (this.f200482r == 0) {
                            i12 = this.f200480p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f200477m;
                            }
                            this.f200480p = i12;
                            i13 = this.f200481q;
                            if (i13 == -1) {
                                i13 = this.f200478n;
                            }
                            this.f200481q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f200480p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f200489y) {
                            if (this.f200443E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            dty0 dty0Var1111 = new dty0();
                            dty0Var1111.m117903c(this.f200490z);
                            dty0Var1111.m117902b(this.f200440B);
                            dty0Var1111.m117904d(this.f200439A);
                            dty0Var1111.m117905e(bArr);
                            dty0Var1111.m117906f(this.f200479o);
                            dty0Var1111.m117901a(this.f200479o);
                            wwy0VarM117907g = dty0Var1111.m117907g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f200465a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f200483s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        znr0Var.m220644C(this.f200477m);
                        znr0Var.m220654i(this.f200478n);
                        znr0Var.m220668s(f);
                        znr0Var.m220671v(i10);
                        znr0Var.m220669t(this.f200487w);
                        znr0Var.m220675z(this.f200488x);
                        znr0Var.m220646a(wwy0VarM117907g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    znr0Var.m220659k0(this.f200454P);
                    znr0Var.m220673x(this.f200456R);
                    znr0Var.m220666q(i4);
                    i6 = 1;
                }
                if (this.f200465a != null) {
                    znr0Var.m220662m(this.f200465a);
                }
                znr0Var.m220656j(i);
                znr0Var.m220672w(str3);
                znr0Var.m220664o(i3);
                znr0Var.m220663n(this.f200462X);
                znr0Var.m220674y(i11114 == true ? 1 : 0);
                znr0Var.m220660l(listSingletonList);
                znr0Var.m220661l0(str2);
                znr0Var.m220650e(this.f200476l);
                sqr0 sqr0VarM220645D1111 = znr0Var.m220645D();
                sgr0 sgr0VarMo101550i1111 = ser0Var.mo101550i(this.f200467c, i6);
                this.f200463Y = sgr0VarMo101550i1111;
                sgr0VarMo101550i1111.mo99373d(sqr0VarM220645D1111);
                return;
            default:
                throw zzcc.zza("Unrecognized codec identifier.", null);
        }
    }

    @EnsuresNonNull({"codecPrivate"})
    /* JADX INFO: renamed from: i */
    public final byte[] m216537i(String str) throws zzcc {
        byte[] bArr = this.f200475k;
        if (bArr != null) {
            return bArr;
        }
        throw zzcc.zza("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }
}
