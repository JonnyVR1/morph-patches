package p149l;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzae;
import com.google.android.gms.internal.ads.zzcc;
import com.google.android.gms.internal.ads.zzgaa;
import com.tencent.ugc.TXRecordCommon;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
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
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes6.dex */
public final class sbr0 {

    /* JADX INFO: renamed from: O */
    public byte[] f163593O;

    /* JADX INFO: renamed from: U */
    public n7r0 f163599U;

    /* JADX INFO: renamed from: V */
    public boolean f163600V;

    /* JADX INFO: renamed from: Y */
    public m7r0 f163603Y;

    /* JADX INFO: renamed from: Z */
    public int f163604Z;

    /* JADX INFO: renamed from: a */
    public String f163605a;

    /* JADX INFO: renamed from: b */
    public String f163606b;

    /* JADX INFO: renamed from: c */
    public int f163607c;

    /* JADX INFO: renamed from: d */
    public int f163608d;

    /* JADX INFO: renamed from: e */
    public int f163609e;

    /* JADX INFO: renamed from: f */
    public int f163610f;

    /* JADX INFO: renamed from: g */
    public int f163611g;

    /* JADX INFO: renamed from: h */
    public boolean f163612h;

    /* JADX INFO: renamed from: i */
    public byte[] f163613i;

    /* JADX INFO: renamed from: j */
    public a7r0 f163614j;

    /* JADX INFO: renamed from: k */
    public byte[] f163615k;

    /* JADX INFO: renamed from: l */
    public zzae f163616l;

    /* JADX INFO: renamed from: m */
    public int f163617m = -1;

    /* JADX INFO: renamed from: n */
    public int f163618n = -1;

    /* JADX INFO: renamed from: o */
    public int f163619o = -1;

    /* JADX INFO: renamed from: p */
    public int f163620p = -1;

    /* JADX INFO: renamed from: q */
    public int f163621q = -1;

    /* JADX INFO: renamed from: r */
    public int f163622r = 0;

    /* JADX INFO: renamed from: s */
    public int f163623s = -1;

    /* JADX INFO: renamed from: t */
    public float f163624t = 0.0f;

    /* JADX INFO: renamed from: u */
    public float f163625u = 0.0f;

    /* JADX INFO: renamed from: v */
    public float f163626v = 0.0f;

    /* JADX INFO: renamed from: w */
    public byte[] f163627w = null;

    /* JADX INFO: renamed from: x */
    public int f163628x = -1;

    /* JADX INFO: renamed from: y */
    public boolean f163629y = false;

    /* JADX INFO: renamed from: z */
    public int f163630z = -1;

    /* JADX INFO: renamed from: A */
    public int f163579A = -1;

    /* JADX INFO: renamed from: B */
    public int f163580B = -1;

    /* JADX INFO: renamed from: C */
    public int f163581C = 1000;

    /* JADX INFO: renamed from: D */
    public int f163582D = 200;

    /* JADX INFO: renamed from: E */
    public float f163583E = -1.0f;

    /* JADX INFO: renamed from: F */
    public float f163584F = -1.0f;

    /* JADX INFO: renamed from: G */
    public float f163585G = -1.0f;

    /* JADX INFO: renamed from: H */
    public float f163586H = -1.0f;

    /* JADX INFO: renamed from: I */
    public float f163587I = -1.0f;

    /* JADX INFO: renamed from: J */
    public float f163588J = -1.0f;

    /* JADX INFO: renamed from: K */
    public float f163589K = -1.0f;

    /* JADX INFO: renamed from: L */
    public float f163590L = -1.0f;

    /* JADX INFO: renamed from: M */
    public float f163591M = -1.0f;

    /* JADX INFO: renamed from: N */
    public float f163592N = -1.0f;

    /* JADX INFO: renamed from: P */
    public int f163594P = 1;

    /* JADX INFO: renamed from: Q */
    public int f163595Q = -1;

    /* JADX INFO: renamed from: R */
    public int f163596R = TXRecordCommon.AUDIO_SAMPLERATE_8000;

    /* JADX INFO: renamed from: S */
    public long f163597S = 0;

    /* JADX INFO: renamed from: T */
    public long f163598T = 0;

    /* JADX INFO: renamed from: W */
    public boolean f163601W = true;

    /* JADX INFO: renamed from: X */
    public String f163602X = "eng";

    /* JADX INFO: renamed from: f */
    public static Pair m183259f(v6w0 v6w0Var) throws zzcc {
        try {
            v6w0Var.m197263l(16);
            long jM197244H = v6w0Var.m197244H();
            if (jM197244H == 1482049860) {
                return new Pair(DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_DIVX, null);
            }
            if (jM197244H == 859189832) {
                return new Pair(DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_3GP, null);
            }
            if (jM197244H != 826496599) {
                svv0.m186111f("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
            int iM197270s = v6w0Var.m197270s() + 20;
            byte[] bArrM197264m = v6w0Var.m197264m();
            while (true) {
                int length = bArrM197264m.length;
                if (iM197270s >= length - 4) {
                    throw zzcc.zza("Failed to find FourCC VC1 initialization data", null);
                }
                int i = iM197270s + 1;
                if (bArrM197264m[iM197270s] == 0 && bArrM197264m[i] == 0 && bArrM197264m[iM197270s + 2] == 1 && bArrM197264m[iM197270s + 3] == 15) {
                    return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrM197264m, iM197270s, length)));
                }
                iM197270s = i;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzcc.zza("Error parsing FourCC private data", null);
        }
    }

    /* JADX INFO: renamed from: g */
    public static List m183260g(byte[] bArr) throws zzcc {
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
    public static boolean m183261h(v6w0 v6w0Var) throws zzcc {
        try {
            int iM197277z = v6w0Var.m197277z();
            if (iM197277z == 1) {
                return true;
            }
            if (iM197277z == 65534) {
                v6w0Var.m197262k(24);
                if (v6w0Var.m197245I() == tbr0.f169297h0.getMostSignificantBits() && v6w0Var.m197245I() == tbr0.f169297h0.getLeastSignificantBits()) {
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
    public final void m183262e(m5r0 m5r0Var, int i) throws zzcc {
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
        ter0 ter0Var;
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
        f5r0 f5r0VarM119516a;
        String str4 = this.f163606b;
        int iM126084z = 4;
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
        qny0 qny0VarM209761g = null;
        byte[] bArr = null;
        switch (b) {
            case 0:
                str5 = "video/x-vnd.on2.vp8";
                listSingletonList = null;
                str2 = null;
                i4 = -1;
                i3 = -1;
                if (this.f163593O != null && (f5r0VarM119516a = f5r0.m119516a(new v6w0(this.f163593O))) != null) {
                    str2 = f5r0VarM119516a.f95199a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z = this.f163601W;
                if (true != this.f163600V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i14 = i5 | (z ? 1 : 0);
                ter0Var = new ter0();
                if (uys0.m196370g(str3)) {
                    ter0Var.m188605k0(this.f163594P);
                    ter0Var.m188619x(this.f163596R);
                    ter0Var.m188612q(i4);
                    i6 = 1;
                } else if (uys0.m196371h(str3)) {
                    if (this.f163622r == 0) {
                        i12 = this.f163620p;
                        i7 = -1;
                        if (i12 == -1) {
                            i12 = this.f163617m;
                        }
                        this.f163620p = i12;
                        i13 = this.f163621q;
                        if (i13 == -1) {
                            i13 = this.f163618n;
                        }
                        this.f163621q = i13;
                    } else {
                        i7 = -1;
                    }
                    i8 = this.f163620p;
                    if (i8 != i7 || (i11 = this.f163621q) == i7) {
                        f = -1.0f;
                    } else {
                        f = (this.f163618n * i8) / (this.f163617m * i11);
                    }
                    if (this.f163629y) {
                        if (this.f163583E != -1.0f || this.f163584F == -1.0f || this.f163585G == -1.0f || this.f163586H == -1.0f || this.f163587I == -1.0f || this.f163588J == -1.0f || this.f163589K == -1.0f || this.f163590L == -1.0f || this.f163591M == -1.0f || this.f163592N == -1.0f) {
                            i9 = 0;
                        } else {
                            bArr = new byte[25];
                            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            i9 = 0;
                            byteBufferOrder.put((byte) 0);
                            byteBufferOrder.putShort((short) ((this.f163583E * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f163584F * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f163585G * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f163586H * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f163587I * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f163588J * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f163589K * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.f163590L * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) (this.f163591M + 0.5f));
                            byteBufferOrder.putShort((short) (this.f163592N + 0.5f));
                            byteBufferOrder.putShort((short) this.f163581C);
                            byteBufferOrder.putShort((short) this.f163582D);
                        }
                        xjy0 xjy0Var = new xjy0();
                        xjy0Var.m209757c(this.f163630z);
                        xjy0Var.m209756b(this.f163580B);
                        xjy0Var.m209758d(this.f163579A);
                        xjy0Var.m209759e(bArr);
                        xjy0Var.m209760f(this.f163619o);
                        xjy0Var.m209755a(this.f163619o);
                        qny0VarM209761g = xjy0Var.m209761g();
                    } else {
                        i9 = 0;
                    }
                    if (this.f163605a == null && tbr0.f169298i0.containsKey(this.f163605a)) {
                        iIntValue = ((Integer) tbr0.f169298i0.get(this.f163605a)).intValue();
                    } else {
                        iIntValue = i7;
                    }
                    if (this.f163623s == 0 || Float.compare(this.f163624t, 0.0f) != 0 || Float.compare(this.f163625u, 0.0f) != 0) {
                        i10 = iIntValue;
                    } else if (Float.compare(this.f163626v, 0.0f) == 0) {
                        i10 = i9;
                    } else if (Float.compare(this.f163626v, 90.0f) == 0) {
                        i10 = 90;
                    } else if (Float.compare(this.f163626v, -180.0f) == 0 || Float.compare(this.f163626v, 180.0f) == 0) {
                        i10 = 180;
                    } else if (Float.compare(this.f163626v, -90.0f) == 0) {
                        i10 = 270;
                    } else {
                        i10 = iIntValue;
                    }
                    ter0Var.m188590C(this.f163617m);
                    ter0Var.m188600i(this.f163618n);
                    ter0Var.m188614s(f);
                    ter0Var.m188617v(i10);
                    ter0Var.m188615t(this.f163627w);
                    ter0Var.m188621z(this.f163628x);
                    ter0Var.m188592a(qny0VarM209761g);
                    i6 = 2;
                } else {
                    if ("application/x-subrip".equals(str3) && !"text/x-ssa".equals(str3) && !"text/vtt".equals(str3) && !"application/vobsub".equals(str3) && !"application/pgs".equals(str3) && !"application/dvbsubs".equals(str3)) {
                        throw zzcc.zza("Unexpected MIME type.", null);
                    }
                    i6 = 3;
                }
                if (this.f163605a != null && !tbr0.f169298i0.containsKey(this.f163605a)) {
                    ter0Var.m188608m(this.f163605a);
                }
                ter0Var.m188602j(i);
                ter0Var.m188618w(str3);
                ter0Var.m188610o(i3);
                ter0Var.m188609n(this.f163602X);
                ter0Var.m188620y(i14 == true ? 1 : 0);
                ter0Var.m188606l(listSingletonList);
                ter0Var.m188607l0(str2);
                ter0Var.m188596e(this.f163616l);
                mhr0 mhr0VarM188591D = ter0Var.m188591D();
                m7r0 m7r0VarMo129454i = m5r0Var.mo129454i(this.f163607c, i6);
                this.f163603Y = m7r0VarMo129454i;
                m7r0VarMo129454i.mo134531d(mhr0VarM188591D);
                return;
            case 1:
                str5 = "video/x-vnd.on2.vp9";
                listSingletonList = null;
                str2 = null;
                i4 = -1;
                i3 = -1;
                if (this.f163593O != null) {
                    str2 = f5r0VarM119516a.f95199a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z2 = this.f163601W;
                if (true != this.f163600V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i15 = i5 | (z2 ? 1 : 0);
                ter0Var = new ter0();
                if (uys0.m196370g(str3)) {
                    if (uys0.m196371h(str3)) {
                        if (this.f163622r == 0) {
                            i12 = this.f163620p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f163617m;
                            }
                            this.f163620p = i12;
                            i13 = this.f163621q;
                            if (i13 == -1) {
                                i13 = this.f163618n;
                            }
                            this.f163621q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f163620p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f163629y) {
                            if (this.f163583E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            xjy0 xjy0Var2 = new xjy0();
                            xjy0Var2.m209757c(this.f163630z);
                            xjy0Var2.m209756b(this.f163580B);
                            xjy0Var2.m209758d(this.f163579A);
                            xjy0Var2.m209759e(bArr);
                            xjy0Var2.m209760f(this.f163619o);
                            xjy0Var2.m209755a(this.f163619o);
                            qny0VarM209761g = xjy0Var2.m209761g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f163605a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f163623s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        ter0Var.m188590C(this.f163617m);
                        ter0Var.m188600i(this.f163618n);
                        ter0Var.m188614s(f);
                        ter0Var.m188617v(i10);
                        ter0Var.m188615t(this.f163627w);
                        ter0Var.m188621z(this.f163628x);
                        ter0Var.m188592a(qny0VarM209761g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    ter0Var.m188605k0(this.f163594P);
                    ter0Var.m188619x(this.f163596R);
                    ter0Var.m188612q(i4);
                    i6 = 1;
                }
                if (this.f163605a != null) {
                    ter0Var.m188608m(this.f163605a);
                }
                ter0Var.m188602j(i);
                ter0Var.m188618w(str3);
                ter0Var.m188610o(i3);
                ter0Var.m188609n(this.f163602X);
                ter0Var.m188620y(i15 == true ? 1 : 0);
                ter0Var.m188606l(listSingletonList);
                ter0Var.m188607l0(str2);
                ter0Var.m188596e(this.f163616l);
                mhr0 mhr0VarM188591D2 = ter0Var.m188591D();
                m7r0 m7r0VarMo129454i2 = m5r0Var.mo129454i(this.f163607c, i6);
                this.f163603Y = m7r0VarMo129454i2;
                m7r0VarMo129454i2.mo134531d(mhr0VarM188591D2);
                return;
            case 2:
                str5 = "video/av01";
                listSingletonList = null;
                str2 = null;
                i4 = -1;
                i3 = -1;
                if (this.f163593O != null) {
                    str2 = f5r0VarM119516a.f95199a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z3 = this.f163601W;
                if (true != this.f163600V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i16 = i5 | (z3 ? 1 : 0);
                ter0Var = new ter0();
                if (uys0.m196370g(str3)) {
                    if (uys0.m196371h(str3)) {
                        if (this.f163622r == 0) {
                            i12 = this.f163620p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f163617m;
                            }
                            this.f163620p = i12;
                            i13 = this.f163621q;
                            if (i13 == -1) {
                                i13 = this.f163618n;
                            }
                            this.f163621q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f163620p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f163629y) {
                            if (this.f163583E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            xjy0 xjy0Var3 = new xjy0();
                            xjy0Var3.m209757c(this.f163630z);
                            xjy0Var3.m209756b(this.f163580B);
                            xjy0Var3.m209758d(this.f163579A);
                            xjy0Var3.m209759e(bArr);
                            xjy0Var3.m209760f(this.f163619o);
                            xjy0Var3.m209755a(this.f163619o);
                            qny0VarM209761g = xjy0Var3.m209761g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f163605a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f163623s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        ter0Var.m188590C(this.f163617m);
                        ter0Var.m188600i(this.f163618n);
                        ter0Var.m188614s(f);
                        ter0Var.m188617v(i10);
                        ter0Var.m188615t(this.f163627w);
                        ter0Var.m188621z(this.f163628x);
                        ter0Var.m188592a(qny0VarM209761g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    ter0Var.m188605k0(this.f163594P);
                    ter0Var.m188619x(this.f163596R);
                    ter0Var.m188612q(i4);
                    i6 = 1;
                }
                if (this.f163605a != null) {
                    ter0Var.m188608m(this.f163605a);
                }
                ter0Var.m188602j(i);
                ter0Var.m188618w(str3);
                ter0Var.m188610o(i3);
                ter0Var.m188609n(this.f163602X);
                ter0Var.m188620y(i16 == true ? 1 : 0);
                ter0Var.m188606l(listSingletonList);
                ter0Var.m188607l0(str2);
                ter0Var.m188596e(this.f163616l);
                mhr0 mhr0VarM188591D3 = ter0Var.m188591D();
                m7r0 m7r0VarMo129454i3 = m5r0Var.mo129454i(this.f163607c, i6);
                this.f163603Y = m7r0VarMo129454i3;
                m7r0VarMo129454i3.mo134531d(mhr0VarM188591D3);
                return;
            case 3:
                str5 = "video/mpeg2";
                listSingletonList = null;
                str2 = null;
                i4 = -1;
                i3 = -1;
                if (this.f163593O != null) {
                    str2 = f5r0VarM119516a.f95199a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z4 = this.f163601W;
                if (true != this.f163600V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i17 = i5 | (z4 ? 1 : 0);
                ter0Var = new ter0();
                if (uys0.m196370g(str3)) {
                    if (uys0.m196371h(str3)) {
                        if (this.f163622r == 0) {
                            i12 = this.f163620p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f163617m;
                            }
                            this.f163620p = i12;
                            i13 = this.f163621q;
                            if (i13 == -1) {
                                i13 = this.f163618n;
                            }
                            this.f163621q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f163620p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f163629y) {
                            if (this.f163583E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            xjy0 xjy0Var4 = new xjy0();
                            xjy0Var4.m209757c(this.f163630z);
                            xjy0Var4.m209756b(this.f163580B);
                            xjy0Var4.m209758d(this.f163579A);
                            xjy0Var4.m209759e(bArr);
                            xjy0Var4.m209760f(this.f163619o);
                            xjy0Var4.m209755a(this.f163619o);
                            qny0VarM209761g = xjy0Var4.m209761g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f163605a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f163623s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        ter0Var.m188590C(this.f163617m);
                        ter0Var.m188600i(this.f163618n);
                        ter0Var.m188614s(f);
                        ter0Var.m188617v(i10);
                        ter0Var.m188615t(this.f163627w);
                        ter0Var.m188621z(this.f163628x);
                        ter0Var.m188592a(qny0VarM209761g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    ter0Var.m188605k0(this.f163594P);
                    ter0Var.m188619x(this.f163596R);
                    ter0Var.m188612q(i4);
                    i6 = 1;
                }
                if (this.f163605a != null) {
                    ter0Var.m188608m(this.f163605a);
                }
                ter0Var.m188602j(i);
                ter0Var.m188618w(str3);
                ter0Var.m188610o(i3);
                ter0Var.m188609n(this.f163602X);
                ter0Var.m188620y(i17 == true ? 1 : 0);
                ter0Var.m188606l(listSingletonList);
                ter0Var.m188607l0(str2);
                ter0Var.m188596e(this.f163616l);
                mhr0 mhr0VarM188591D4 = ter0Var.m188591D();
                m7r0 m7r0VarMo129454i4 = m5r0Var.mo129454i(this.f163607c, i6);
                this.f163603Y = m7r0VarMo129454i4;
                m7r0VarMo129454i4.mo134531d(mhr0VarM188591D4);
                return;
            case 4:
            case 5:
            case 6:
                byte[] bArr2 = this.f163615k;
                listSingletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                str5 = "video/mp4v-es";
                str2 = null;
                i4 = -1;
                i3 = -1;
                if (this.f163593O != null) {
                    str2 = f5r0VarM119516a.f95199a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z5 = this.f163601W;
                if (true != this.f163600V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i18 = i5 | (z5 ? 1 : 0);
                ter0Var = new ter0();
                if (uys0.m196370g(str3)) {
                    if (uys0.m196371h(str3)) {
                        if (this.f163622r == 0) {
                            i12 = this.f163620p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f163617m;
                            }
                            this.f163620p = i12;
                            i13 = this.f163621q;
                            if (i13 == -1) {
                                i13 = this.f163618n;
                            }
                            this.f163621q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f163620p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f163629y) {
                            if (this.f163583E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            xjy0 xjy0Var5 = new xjy0();
                            xjy0Var5.m209757c(this.f163630z);
                            xjy0Var5.m209756b(this.f163580B);
                            xjy0Var5.m209758d(this.f163579A);
                            xjy0Var5.m209759e(bArr);
                            xjy0Var5.m209760f(this.f163619o);
                            xjy0Var5.m209755a(this.f163619o);
                            qny0VarM209761g = xjy0Var5.m209761g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f163605a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f163623s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        ter0Var.m188590C(this.f163617m);
                        ter0Var.m188600i(this.f163618n);
                        ter0Var.m188614s(f);
                        ter0Var.m188617v(i10);
                        ter0Var.m188615t(this.f163627w);
                        ter0Var.m188621z(this.f163628x);
                        ter0Var.m188592a(qny0VarM209761g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    ter0Var.m188605k0(this.f163594P);
                    ter0Var.m188619x(this.f163596R);
                    ter0Var.m188612q(i4);
                    i6 = 1;
                }
                if (this.f163605a != null) {
                    ter0Var.m188608m(this.f163605a);
                }
                ter0Var.m188602j(i);
                ter0Var.m188618w(str3);
                ter0Var.m188610o(i3);
                ter0Var.m188609n(this.f163602X);
                ter0Var.m188620y(i18 == true ? 1 : 0);
                ter0Var.m188606l(listSingletonList);
                ter0Var.m188607l0(str2);
                ter0Var.m188596e(this.f163616l);
                mhr0 mhr0VarM188591D5 = ter0Var.m188591D();
                m7r0 m7r0VarMo129454i5 = m5r0Var.mo129454i(this.f163607c, i6);
                this.f163603Y = m7r0VarMo129454i5;
                m7r0VarMo129454i5.mo134531d(mhr0VarM188591D5);
                return;
            case 7:
                d4r0 d4r0VarM109996a = d4r0.m109996a(new v6w0(m183263i(this.f163606b)));
                list = d4r0VarM109996a.f84337a;
                this.f163604Z = d4r0VarM109996a.f84338b;
                str = d4r0VarM109996a.f84347k;
                str5 = YtVideoEncoder.MIME_TYPE;
                List list2 = list;
                str2 = str;
                listSingletonList = list2;
                i4 = -1;
                i3 = -1;
                if (this.f163593O != null) {
                    str2 = f5r0VarM119516a.f95199a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z6 = this.f163601W;
                if (true != this.f163600V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i19 = i5 | (z6 ? 1 : 0);
                ter0Var = new ter0();
                if (uys0.m196370g(str3)) {
                    if (uys0.m196371h(str3)) {
                        if (this.f163622r == 0) {
                            i12 = this.f163620p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f163617m;
                            }
                            this.f163620p = i12;
                            i13 = this.f163621q;
                            if (i13 == -1) {
                                i13 = this.f163618n;
                            }
                            this.f163621q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f163620p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f163629y) {
                            if (this.f163583E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            xjy0 xjy0Var6 = new xjy0();
                            xjy0Var6.m209757c(this.f163630z);
                            xjy0Var6.m209756b(this.f163580B);
                            xjy0Var6.m209758d(this.f163579A);
                            xjy0Var6.m209759e(bArr);
                            xjy0Var6.m209760f(this.f163619o);
                            xjy0Var6.m209755a(this.f163619o);
                            qny0VarM209761g = xjy0Var6.m209761g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f163605a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f163623s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        ter0Var.m188590C(this.f163617m);
                        ter0Var.m188600i(this.f163618n);
                        ter0Var.m188614s(f);
                        ter0Var.m188617v(i10);
                        ter0Var.m188615t(this.f163627w);
                        ter0Var.m188621z(this.f163628x);
                        ter0Var.m188592a(qny0VarM209761g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    ter0Var.m188605k0(this.f163594P);
                    ter0Var.m188619x(this.f163596R);
                    ter0Var.m188612q(i4);
                    i6 = 1;
                }
                if (this.f163605a != null) {
                    ter0Var.m188608m(this.f163605a);
                }
                ter0Var.m188602j(i);
                ter0Var.m188618w(str3);
                ter0Var.m188610o(i3);
                ter0Var.m188609n(this.f163602X);
                ter0Var.m188620y(i19 == true ? 1 : 0);
                ter0Var.m188606l(listSingletonList);
                ter0Var.m188607l0(str2);
                ter0Var.m188596e(this.f163616l);
                mhr0 mhr0VarM188591D6 = ter0Var.m188591D();
                m7r0 m7r0VarMo129454i6 = m5r0Var.mo129454i(this.f163607c, i6);
                this.f163603Y = m7r0VarMo129454i6;
                m7r0VarMo129454i6.mo134531d(mhr0VarM188591D6);
                return;
            case 8:
                m6r0 m6r0VarM153294a = m6r0.m153294a(new v6w0(m183263i(this.f163606b)));
                list = m6r0VarM153294a.f131752a;
                this.f163604Z = m6r0VarM153294a.f131753b;
                str = m6r0VarM153294a.f131760i;
                str5 = "video/hevc";
                List list3 = list;
                str2 = str;
                listSingletonList = list3;
                i4 = -1;
                i3 = -1;
                if (this.f163593O != null) {
                    str2 = f5r0VarM119516a.f95199a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z7 = this.f163601W;
                if (true != this.f163600V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i110 = i5 | (z7 ? 1 : 0);
                ter0Var = new ter0();
                if (uys0.m196370g(str3)) {
                    if (uys0.m196371h(str3)) {
                        if (this.f163622r == 0) {
                            i12 = this.f163620p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f163617m;
                            }
                            this.f163620p = i12;
                            i13 = this.f163621q;
                            if (i13 == -1) {
                                i13 = this.f163618n;
                            }
                            this.f163621q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f163620p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f163629y) {
                            if (this.f163583E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            xjy0 xjy0Var7 = new xjy0();
                            xjy0Var7.m209757c(this.f163630z);
                            xjy0Var7.m209756b(this.f163580B);
                            xjy0Var7.m209758d(this.f163579A);
                            xjy0Var7.m209759e(bArr);
                            xjy0Var7.m209760f(this.f163619o);
                            xjy0Var7.m209755a(this.f163619o);
                            qny0VarM209761g = xjy0Var7.m209761g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f163605a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f163623s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        ter0Var.m188590C(this.f163617m);
                        ter0Var.m188600i(this.f163618n);
                        ter0Var.m188614s(f);
                        ter0Var.m188617v(i10);
                        ter0Var.m188615t(this.f163627w);
                        ter0Var.m188621z(this.f163628x);
                        ter0Var.m188592a(qny0VarM209761g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    ter0Var.m188605k0(this.f163594P);
                    ter0Var.m188619x(this.f163596R);
                    ter0Var.m188612q(i4);
                    i6 = 1;
                }
                if (this.f163605a != null) {
                    ter0Var.m188608m(this.f163605a);
                }
                ter0Var.m188602j(i);
                ter0Var.m188618w(str3);
                ter0Var.m188610o(i3);
                ter0Var.m188609n(this.f163602X);
                ter0Var.m188620y(i110 == true ? 1 : 0);
                ter0Var.m188606l(listSingletonList);
                ter0Var.m188607l0(str2);
                ter0Var.m188596e(this.f163616l);
                mhr0 mhr0VarM188591D7 = ter0Var.m188591D();
                m7r0 m7r0VarMo129454i7 = m5r0Var.mo129454i(this.f163607c, i6);
                this.f163603Y = m7r0VarMo129454i7;
                m7r0VarMo129454i7.mo134531d(mhr0VarM188591D7);
                return;
            case 9:
                Pair pairM183259f = m183259f(new v6w0(m183263i(this.f163606b)));
                str5 = (String) pairM183259f.first;
                listSingletonList = (List) pairM183259f.second;
                str2 = null;
                i4 = -1;
                i3 = -1;
                if (this.f163593O != null) {
                    str2 = f5r0VarM119516a.f95199a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z8 = this.f163601W;
                if (true != this.f163600V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i111 = i5 | (z8 ? 1 : 0);
                ter0Var = new ter0();
                if (uys0.m196370g(str3)) {
                    if (uys0.m196371h(str3)) {
                        if (this.f163622r == 0) {
                            i12 = this.f163620p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f163617m;
                            }
                            this.f163620p = i12;
                            i13 = this.f163621q;
                            if (i13 == -1) {
                                i13 = this.f163618n;
                            }
                            this.f163621q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f163620p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f163629y) {
                            if (this.f163583E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            xjy0 xjy0Var8 = new xjy0();
                            xjy0Var8.m209757c(this.f163630z);
                            xjy0Var8.m209756b(this.f163580B);
                            xjy0Var8.m209758d(this.f163579A);
                            xjy0Var8.m209759e(bArr);
                            xjy0Var8.m209760f(this.f163619o);
                            xjy0Var8.m209755a(this.f163619o);
                            qny0VarM209761g = xjy0Var8.m209761g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f163605a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f163623s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        ter0Var.m188590C(this.f163617m);
                        ter0Var.m188600i(this.f163618n);
                        ter0Var.m188614s(f);
                        ter0Var.m188617v(i10);
                        ter0Var.m188615t(this.f163627w);
                        ter0Var.m188621z(this.f163628x);
                        ter0Var.m188592a(qny0VarM209761g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    ter0Var.m188605k0(this.f163594P);
                    ter0Var.m188619x(this.f163596R);
                    ter0Var.m188612q(i4);
                    i6 = 1;
                }
                if (this.f163605a != null) {
                    ter0Var.m188608m(this.f163605a);
                }
                ter0Var.m188602j(i);
                ter0Var.m188618w(str3);
                ter0Var.m188610o(i3);
                ter0Var.m188609n(this.f163602X);
                ter0Var.m188620y(i111 == true ? 1 : 0);
                ter0Var.m188606l(listSingletonList);
                ter0Var.m188607l0(str2);
                ter0Var.m188596e(this.f163616l);
                mhr0 mhr0VarM188591D8 = ter0Var.m188591D();
                m7r0 m7r0VarMo129454i8 = m5r0Var.mo129454i(this.f163607c, i6);
                this.f163603Y = m7r0VarMo129454i8;
                m7r0VarMo129454i8.mo134531d(mhr0VarM188591D8);
                return;
            case 10:
                str5 = "video/x-unknown";
                listSingletonList = null;
                str2 = null;
                i4 = -1;
                i3 = -1;
                if (this.f163593O != null) {
                    str2 = f5r0VarM119516a.f95199a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z9 = this.f163601W;
                if (true != this.f163600V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i112 = i5 | (z9 ? 1 : 0);
                ter0Var = new ter0();
                if (uys0.m196370g(str3)) {
                    if (uys0.m196371h(str3)) {
                        if (this.f163622r == 0) {
                            i12 = this.f163620p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f163617m;
                            }
                            this.f163620p = i12;
                            i13 = this.f163621q;
                            if (i13 == -1) {
                                i13 = this.f163618n;
                            }
                            this.f163621q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f163620p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f163629y) {
                            if (this.f163583E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            xjy0 xjy0Var9 = new xjy0();
                            xjy0Var9.m209757c(this.f163630z);
                            xjy0Var9.m209756b(this.f163580B);
                            xjy0Var9.m209758d(this.f163579A);
                            xjy0Var9.m209759e(bArr);
                            xjy0Var9.m209760f(this.f163619o);
                            xjy0Var9.m209755a(this.f163619o);
                            qny0VarM209761g = xjy0Var9.m209761g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f163605a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f163623s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        ter0Var.m188590C(this.f163617m);
                        ter0Var.m188600i(this.f163618n);
                        ter0Var.m188614s(f);
                        ter0Var.m188617v(i10);
                        ter0Var.m188615t(this.f163627w);
                        ter0Var.m188621z(this.f163628x);
                        ter0Var.m188592a(qny0VarM209761g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    ter0Var.m188605k0(this.f163594P);
                    ter0Var.m188619x(this.f163596R);
                    ter0Var.m188612q(i4);
                    i6 = 1;
                }
                if (this.f163605a != null) {
                    ter0Var.m188608m(this.f163605a);
                }
                ter0Var.m188602j(i);
                ter0Var.m188618w(str3);
                ter0Var.m188610o(i3);
                ter0Var.m188609n(this.f163602X);
                ter0Var.m188620y(i112 == true ? 1 : 0);
                ter0Var.m188606l(listSingletonList);
                ter0Var.m188607l0(str2);
                ter0Var.m188596e(this.f163616l);
                mhr0 mhr0VarM188591D9 = ter0Var.m188591D();
                m7r0 m7r0VarMo129454i9 = m5r0Var.mo129454i(this.f163607c, i6);
                this.f163603Y = m7r0VarMo129454i9;
                m7r0VarMo129454i9.mo134531d(mhr0VarM188591D9);
                return;
            case 11:
                listSingletonList = m183260g(m183263i(str4));
                i2 = 8192;
                str5 = "audio/vorbis";
                i3 = i2;
                str2 = null;
                i4 = -1;
                if (this.f163593O != null) {
                    str2 = f5r0VarM119516a.f95199a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z10 = this.f163601W;
                if (true != this.f163600V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i113 = i5 | (z10 ? 1 : 0);
                ter0Var = new ter0();
                if (uys0.m196370g(str3)) {
                    if (uys0.m196371h(str3)) {
                        if (this.f163622r == 0) {
                            i12 = this.f163620p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f163617m;
                            }
                            this.f163620p = i12;
                            i13 = this.f163621q;
                            if (i13 == -1) {
                                i13 = this.f163618n;
                            }
                            this.f163621q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f163620p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f163629y) {
                            if (this.f163583E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            xjy0 xjy0Var10 = new xjy0();
                            xjy0Var10.m209757c(this.f163630z);
                            xjy0Var10.m209756b(this.f163580B);
                            xjy0Var10.m209758d(this.f163579A);
                            xjy0Var10.m209759e(bArr);
                            xjy0Var10.m209760f(this.f163619o);
                            xjy0Var10.m209755a(this.f163619o);
                            qny0VarM209761g = xjy0Var10.m209761g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f163605a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f163623s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        ter0Var.m188590C(this.f163617m);
                        ter0Var.m188600i(this.f163618n);
                        ter0Var.m188614s(f);
                        ter0Var.m188617v(i10);
                        ter0Var.m188615t(this.f163627w);
                        ter0Var.m188621z(this.f163628x);
                        ter0Var.m188592a(qny0VarM209761g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    ter0Var.m188605k0(this.f163594P);
                    ter0Var.m188619x(this.f163596R);
                    ter0Var.m188612q(i4);
                    i6 = 1;
                }
                if (this.f163605a != null) {
                    ter0Var.m188608m(this.f163605a);
                }
                ter0Var.m188602j(i);
                ter0Var.m188618w(str3);
                ter0Var.m188610o(i3);
                ter0Var.m188609n(this.f163602X);
                ter0Var.m188620y(i113 == true ? 1 : 0);
                ter0Var.m188606l(listSingletonList);
                ter0Var.m188607l0(str2);
                ter0Var.m188596e(this.f163616l);
                mhr0 mhr0VarM188591D10 = ter0Var.m188591D();
                m7r0 m7r0VarMo129454i10 = m5r0Var.mo129454i(this.f163607c, i6);
                this.f163603Y = m7r0VarMo129454i10;
                m7r0VarMo129454i10.mo134531d(mhr0VarM188591D10);
                return;
            case 12:
                listSingletonList = new ArrayList(3);
                listSingletonList.add(m183263i(this.f163606b));
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                listSingletonList.add(byteBufferAllocate.order(byteOrder).putLong(this.f163597S).array());
                listSingletonList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.f163598T).array());
                i2 = 5760;
                str5 = "audio/opus";
                i3 = i2;
                str2 = null;
                i4 = -1;
                if (this.f163593O != null) {
                    str2 = f5r0VarM119516a.f95199a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z11 = this.f163601W;
                if (true != this.f163600V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i114 = i5 | (z11 ? 1 : 0);
                ter0Var = new ter0();
                if (uys0.m196370g(str3)) {
                    if (uys0.m196371h(str3)) {
                        if (this.f163622r == 0) {
                            i12 = this.f163620p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f163617m;
                            }
                            this.f163620p = i12;
                            i13 = this.f163621q;
                            if (i13 == -1) {
                                i13 = this.f163618n;
                            }
                            this.f163621q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f163620p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f163629y) {
                            if (this.f163583E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            xjy0 xjy0Var11 = new xjy0();
                            xjy0Var11.m209757c(this.f163630z);
                            xjy0Var11.m209756b(this.f163580B);
                            xjy0Var11.m209758d(this.f163579A);
                            xjy0Var11.m209759e(bArr);
                            xjy0Var11.m209760f(this.f163619o);
                            xjy0Var11.m209755a(this.f163619o);
                            qny0VarM209761g = xjy0Var11.m209761g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f163605a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f163623s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        ter0Var.m188590C(this.f163617m);
                        ter0Var.m188600i(this.f163618n);
                        ter0Var.m188614s(f);
                        ter0Var.m188617v(i10);
                        ter0Var.m188615t(this.f163627w);
                        ter0Var.m188621z(this.f163628x);
                        ter0Var.m188592a(qny0VarM209761g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    ter0Var.m188605k0(this.f163594P);
                    ter0Var.m188619x(this.f163596R);
                    ter0Var.m188612q(i4);
                    i6 = 1;
                }
                if (this.f163605a != null) {
                    ter0Var.m188608m(this.f163605a);
                }
                ter0Var.m188602j(i);
                ter0Var.m188618w(str3);
                ter0Var.m188610o(i3);
                ter0Var.m188609n(this.f163602X);
                ter0Var.m188620y(i114 == true ? 1 : 0);
                ter0Var.m188606l(listSingletonList);
                ter0Var.m188607l0(str2);
                ter0Var.m188596e(this.f163616l);
                mhr0 mhr0VarM188591D11 = ter0Var.m188591D();
                m7r0 m7r0VarMo129454i11 = m5r0Var.mo129454i(this.f163607c, i6);
                this.f163603Y = m7r0VarMo129454i11;
                m7r0VarMo129454i11.mo134531d(mhr0VarM188591D11);
                return;
            case 13:
                listSingletonList = Collections.singletonList(m183263i(str4));
                v3r0 v3r0VarM201388a = w3r0.m201388a(this.f163615k);
                this.f163596R = v3r0VarM201388a.f179840a;
                this.f163594P = v3r0VarM201388a.f179841b;
                str5 = "audio/mp4a-latm";
                str2 = v3r0VarM201388a.f179842c;
                i4 = -1;
                i3 = -1;
                if (this.f163593O != null) {
                    str2 = f5r0VarM119516a.f95199a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z12 = this.f163601W;
                if (true != this.f163600V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i115 = i5 | (z12 ? 1 : 0);
                ter0Var = new ter0();
                if (uys0.m196370g(str3)) {
                    if (uys0.m196371h(str3)) {
                        if (this.f163622r == 0) {
                            i12 = this.f163620p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f163617m;
                            }
                            this.f163620p = i12;
                            i13 = this.f163621q;
                            if (i13 == -1) {
                                i13 = this.f163618n;
                            }
                            this.f163621q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f163620p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f163629y) {
                            if (this.f163583E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            xjy0 xjy0Var12 = new xjy0();
                            xjy0Var12.m209757c(this.f163630z);
                            xjy0Var12.m209756b(this.f163580B);
                            xjy0Var12.m209758d(this.f163579A);
                            xjy0Var12.m209759e(bArr);
                            xjy0Var12.m209760f(this.f163619o);
                            xjy0Var12.m209755a(this.f163619o);
                            qny0VarM209761g = xjy0Var12.m209761g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f163605a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f163623s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        ter0Var.m188590C(this.f163617m);
                        ter0Var.m188600i(this.f163618n);
                        ter0Var.m188614s(f);
                        ter0Var.m188617v(i10);
                        ter0Var.m188615t(this.f163627w);
                        ter0Var.m188621z(this.f163628x);
                        ter0Var.m188592a(qny0VarM209761g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    ter0Var.m188605k0(this.f163594P);
                    ter0Var.m188619x(this.f163596R);
                    ter0Var.m188612q(i4);
                    i6 = 1;
                }
                if (this.f163605a != null) {
                    ter0Var.m188608m(this.f163605a);
                }
                ter0Var.m188602j(i);
                ter0Var.m188618w(str3);
                ter0Var.m188610o(i3);
                ter0Var.m188609n(this.f163602X);
                ter0Var.m188620y(i115 == true ? 1 : 0);
                ter0Var.m188606l(listSingletonList);
                ter0Var.m188607l0(str2);
                ter0Var.m188596e(this.f163616l);
                mhr0 mhr0VarM188591D12 = ter0Var.m188591D();
                m7r0 m7r0VarMo129454i12 = m5r0Var.mo129454i(this.f163607c, i6);
                this.f163603Y = m7r0VarMo129454i12;
                m7r0VarMo129454i12.mo134531d(mhr0VarM188591D12);
                return;
            case 14:
                str5 = "audio/mpeg-L2";
                listSingletonList = null;
                str2 = null;
                i4 = -1;
                i3 = 4096;
                if (this.f163593O != null) {
                    str2 = f5r0VarM119516a.f95199a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z13 = this.f163601W;
                if (true != this.f163600V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i116 = i5 | (z13 ? 1 : 0);
                ter0Var = new ter0();
                if (uys0.m196370g(str3)) {
                    if (uys0.m196371h(str3)) {
                        if (this.f163622r == 0) {
                            i12 = this.f163620p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f163617m;
                            }
                            this.f163620p = i12;
                            i13 = this.f163621q;
                            if (i13 == -1) {
                                i13 = this.f163618n;
                            }
                            this.f163621q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f163620p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f163629y) {
                            if (this.f163583E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            xjy0 xjy0Var13 = new xjy0();
                            xjy0Var13.m209757c(this.f163630z);
                            xjy0Var13.m209756b(this.f163580B);
                            xjy0Var13.m209758d(this.f163579A);
                            xjy0Var13.m209759e(bArr);
                            xjy0Var13.m209760f(this.f163619o);
                            xjy0Var13.m209755a(this.f163619o);
                            qny0VarM209761g = xjy0Var13.m209761g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f163605a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f163623s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        ter0Var.m188590C(this.f163617m);
                        ter0Var.m188600i(this.f163618n);
                        ter0Var.m188614s(f);
                        ter0Var.m188617v(i10);
                        ter0Var.m188615t(this.f163627w);
                        ter0Var.m188621z(this.f163628x);
                        ter0Var.m188592a(qny0VarM209761g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    ter0Var.m188605k0(this.f163594P);
                    ter0Var.m188619x(this.f163596R);
                    ter0Var.m188612q(i4);
                    i6 = 1;
                }
                if (this.f163605a != null) {
                    ter0Var.m188608m(this.f163605a);
                }
                ter0Var.m188602j(i);
                ter0Var.m188618w(str3);
                ter0Var.m188610o(i3);
                ter0Var.m188609n(this.f163602X);
                ter0Var.m188620y(i116 == true ? 1 : 0);
                ter0Var.m188606l(listSingletonList);
                ter0Var.m188607l0(str2);
                ter0Var.m188596e(this.f163616l);
                mhr0 mhr0VarM188591D13 = ter0Var.m188591D();
                m7r0 m7r0VarMo129454i13 = m5r0Var.mo129454i(this.f163607c, i6);
                this.f163603Y = m7r0VarMo129454i13;
                m7r0VarMo129454i13.mo134531d(mhr0VarM188591D13);
                return;
            case 15:
                str5 = DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG;
                listSingletonList = null;
                str2 = null;
                i4 = -1;
                i3 = 4096;
                if (this.f163593O != null) {
                    str2 = f5r0VarM119516a.f95199a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z14 = this.f163601W;
                if (true != this.f163600V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i117 = i5 | (z14 ? 1 : 0);
                ter0Var = new ter0();
                if (uys0.m196370g(str3)) {
                    if (uys0.m196371h(str3)) {
                        if (this.f163622r == 0) {
                            i12 = this.f163620p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f163617m;
                            }
                            this.f163620p = i12;
                            i13 = this.f163621q;
                            if (i13 == -1) {
                                i13 = this.f163618n;
                            }
                            this.f163621q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f163620p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f163629y) {
                            if (this.f163583E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            xjy0 xjy0Var14 = new xjy0();
                            xjy0Var14.m209757c(this.f163630z);
                            xjy0Var14.m209756b(this.f163580B);
                            xjy0Var14.m209758d(this.f163579A);
                            xjy0Var14.m209759e(bArr);
                            xjy0Var14.m209760f(this.f163619o);
                            xjy0Var14.m209755a(this.f163619o);
                            qny0VarM209761g = xjy0Var14.m209761g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f163605a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f163623s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        ter0Var.m188590C(this.f163617m);
                        ter0Var.m188600i(this.f163618n);
                        ter0Var.m188614s(f);
                        ter0Var.m188617v(i10);
                        ter0Var.m188615t(this.f163627w);
                        ter0Var.m188621z(this.f163628x);
                        ter0Var.m188592a(qny0VarM209761g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    ter0Var.m188605k0(this.f163594P);
                    ter0Var.m188619x(this.f163596R);
                    ter0Var.m188612q(i4);
                    i6 = 1;
                }
                if (this.f163605a != null) {
                    ter0Var.m188608m(this.f163605a);
                }
                ter0Var.m188602j(i);
                ter0Var.m188618w(str3);
                ter0Var.m188610o(i3);
                ter0Var.m188609n(this.f163602X);
                ter0Var.m188620y(i117 == true ? 1 : 0);
                ter0Var.m188606l(listSingletonList);
                ter0Var.m188607l0(str2);
                ter0Var.m188596e(this.f163616l);
                mhr0 mhr0VarM188591D14 = ter0Var.m188591D();
                m7r0 m7r0VarMo129454i14 = m5r0Var.mo129454i(this.f163607c, i6);
                this.f163603Y = m7r0VarMo129454i14;
                m7r0VarMo129454i14.mo134531d(mhr0VarM188591D14);
                return;
            case 16:
                str5 = "audio/ac3";
                listSingletonList = null;
                str2 = null;
                i4 = -1;
                i3 = -1;
                if (this.f163593O != null) {
                    str2 = f5r0VarM119516a.f95199a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z15 = this.f163601W;
                if (true != this.f163600V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i118 = i5 | (z15 ? 1 : 0);
                ter0Var = new ter0();
                if (uys0.m196370g(str3)) {
                    if (uys0.m196371h(str3)) {
                        if (this.f163622r == 0) {
                            i12 = this.f163620p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f163617m;
                            }
                            this.f163620p = i12;
                            i13 = this.f163621q;
                            if (i13 == -1) {
                                i13 = this.f163618n;
                            }
                            this.f163621q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f163620p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f163629y) {
                            if (this.f163583E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            xjy0 xjy0Var15 = new xjy0();
                            xjy0Var15.m209757c(this.f163630z);
                            xjy0Var15.m209756b(this.f163580B);
                            xjy0Var15.m209758d(this.f163579A);
                            xjy0Var15.m209759e(bArr);
                            xjy0Var15.m209760f(this.f163619o);
                            xjy0Var15.m209755a(this.f163619o);
                            qny0VarM209761g = xjy0Var15.m209761g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f163605a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f163623s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        ter0Var.m188590C(this.f163617m);
                        ter0Var.m188600i(this.f163618n);
                        ter0Var.m188614s(f);
                        ter0Var.m188617v(i10);
                        ter0Var.m188615t(this.f163627w);
                        ter0Var.m188621z(this.f163628x);
                        ter0Var.m188592a(qny0VarM209761g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    ter0Var.m188605k0(this.f163594P);
                    ter0Var.m188619x(this.f163596R);
                    ter0Var.m188612q(i4);
                    i6 = 1;
                }
                if (this.f163605a != null) {
                    ter0Var.m188608m(this.f163605a);
                }
                ter0Var.m188602j(i);
                ter0Var.m188618w(str3);
                ter0Var.m188610o(i3);
                ter0Var.m188609n(this.f163602X);
                ter0Var.m188620y(i118 == true ? 1 : 0);
                ter0Var.m188606l(listSingletonList);
                ter0Var.m188607l0(str2);
                ter0Var.m188596e(this.f163616l);
                mhr0 mhr0VarM188591D15 = ter0Var.m188591D();
                m7r0 m7r0VarMo129454i15 = m5r0Var.mo129454i(this.f163607c, i6);
                this.f163603Y = m7r0VarMo129454i15;
                m7r0VarMo129454i15.mo134531d(mhr0VarM188591D15);
                return;
            case 17:
                str5 = "audio/eac3";
                listSingletonList = null;
                str2 = null;
                i4 = -1;
                i3 = -1;
                if (this.f163593O != null) {
                    str2 = f5r0VarM119516a.f95199a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z16 = this.f163601W;
                if (true != this.f163600V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i119 = i5 | (z16 ? 1 : 0);
                ter0Var = new ter0();
                if (uys0.m196370g(str3)) {
                    if (uys0.m196371h(str3)) {
                        if (this.f163622r == 0) {
                            i12 = this.f163620p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f163617m;
                            }
                            this.f163620p = i12;
                            i13 = this.f163621q;
                            if (i13 == -1) {
                                i13 = this.f163618n;
                            }
                            this.f163621q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f163620p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f163629y) {
                            if (this.f163583E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            xjy0 xjy0Var16 = new xjy0();
                            xjy0Var16.m209757c(this.f163630z);
                            xjy0Var16.m209756b(this.f163580B);
                            xjy0Var16.m209758d(this.f163579A);
                            xjy0Var16.m209759e(bArr);
                            xjy0Var16.m209760f(this.f163619o);
                            xjy0Var16.m209755a(this.f163619o);
                            qny0VarM209761g = xjy0Var16.m209761g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f163605a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f163623s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        ter0Var.m188590C(this.f163617m);
                        ter0Var.m188600i(this.f163618n);
                        ter0Var.m188614s(f);
                        ter0Var.m188617v(i10);
                        ter0Var.m188615t(this.f163627w);
                        ter0Var.m188621z(this.f163628x);
                        ter0Var.m188592a(qny0VarM209761g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    ter0Var.m188605k0(this.f163594P);
                    ter0Var.m188619x(this.f163596R);
                    ter0Var.m188612q(i4);
                    i6 = 1;
                }
                if (this.f163605a != null) {
                    ter0Var.m188608m(this.f163605a);
                }
                ter0Var.m188602j(i);
                ter0Var.m188618w(str3);
                ter0Var.m188610o(i3);
                ter0Var.m188609n(this.f163602X);
                ter0Var.m188620y(i119 == true ? 1 : 0);
                ter0Var.m188606l(listSingletonList);
                ter0Var.m188607l0(str2);
                ter0Var.m188596e(this.f163616l);
                mhr0 mhr0VarM188591D16 = ter0Var.m188591D();
                m7r0 m7r0VarMo129454i16 = m5r0Var.mo129454i(this.f163607c, i6);
                this.f163603Y = m7r0VarMo129454i16;
                m7r0VarMo129454i16.mo134531d(mhr0VarM188591D16);
                return;
            case 18:
                this.f163599U = new n7r0();
                str5 = "audio/true-hd";
                listSingletonList = null;
                str2 = null;
                i4 = -1;
                i3 = -1;
                if (this.f163593O != null) {
                    str2 = f5r0VarM119516a.f95199a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z17 = this.f163601W;
                if (true != this.f163600V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i1110 = i5 | (z17 ? 1 : 0);
                ter0Var = new ter0();
                if (uys0.m196370g(str3)) {
                    if (uys0.m196371h(str3)) {
                        if (this.f163622r == 0) {
                            i12 = this.f163620p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f163617m;
                            }
                            this.f163620p = i12;
                            i13 = this.f163621q;
                            if (i13 == -1) {
                                i13 = this.f163618n;
                            }
                            this.f163621q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f163620p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f163629y) {
                            if (this.f163583E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            xjy0 xjy0Var17 = new xjy0();
                            xjy0Var17.m209757c(this.f163630z);
                            xjy0Var17.m209756b(this.f163580B);
                            xjy0Var17.m209758d(this.f163579A);
                            xjy0Var17.m209759e(bArr);
                            xjy0Var17.m209760f(this.f163619o);
                            xjy0Var17.m209755a(this.f163619o);
                            qny0VarM209761g = xjy0Var17.m209761g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f163605a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f163623s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        ter0Var.m188590C(this.f163617m);
                        ter0Var.m188600i(this.f163618n);
                        ter0Var.m188614s(f);
                        ter0Var.m188617v(i10);
                        ter0Var.m188615t(this.f163627w);
                        ter0Var.m188621z(this.f163628x);
                        ter0Var.m188592a(qny0VarM209761g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    ter0Var.m188605k0(this.f163594P);
                    ter0Var.m188619x(this.f163596R);
                    ter0Var.m188612q(i4);
                    i6 = 1;
                }
                if (this.f163605a != null) {
                    ter0Var.m188608m(this.f163605a);
                }
                ter0Var.m188602j(i);
                ter0Var.m188618w(str3);
                ter0Var.m188610o(i3);
                ter0Var.m188609n(this.f163602X);
                ter0Var.m188620y(i1110 == true ? 1 : 0);
                ter0Var.m188606l(listSingletonList);
                ter0Var.m188607l0(str2);
                ter0Var.m188596e(this.f163616l);
                mhr0 mhr0VarM188591D17 = ter0Var.m188591D();
                m7r0 m7r0VarMo129454i17 = m5r0Var.mo129454i(this.f163607c, i6);
                this.f163603Y = m7r0VarMo129454i17;
                m7r0VarMo129454i17.mo134531d(mhr0VarM188591D17);
                return;
            case 19:
            case 20:
                str5 = "audio/vnd.dts";
                listSingletonList = null;
                str2 = null;
                i4 = -1;
                i3 = -1;
                if (this.f163593O != null) {
                    str2 = f5r0VarM119516a.f95199a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z18 = this.f163601W;
                if (true != this.f163600V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i1111 = i5 | (z18 ? 1 : 0);
                ter0Var = new ter0();
                if (uys0.m196370g(str3)) {
                    if (uys0.m196371h(str3)) {
                        if (this.f163622r == 0) {
                            i12 = this.f163620p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f163617m;
                            }
                            this.f163620p = i12;
                            i13 = this.f163621q;
                            if (i13 == -1) {
                                i13 = this.f163618n;
                            }
                            this.f163621q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f163620p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f163629y) {
                            if (this.f163583E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            xjy0 xjy0Var18 = new xjy0();
                            xjy0Var18.m209757c(this.f163630z);
                            xjy0Var18.m209756b(this.f163580B);
                            xjy0Var18.m209758d(this.f163579A);
                            xjy0Var18.m209759e(bArr);
                            xjy0Var18.m209760f(this.f163619o);
                            xjy0Var18.m209755a(this.f163619o);
                            qny0VarM209761g = xjy0Var18.m209761g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f163605a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f163623s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        ter0Var.m188590C(this.f163617m);
                        ter0Var.m188600i(this.f163618n);
                        ter0Var.m188614s(f);
                        ter0Var.m188617v(i10);
                        ter0Var.m188615t(this.f163627w);
                        ter0Var.m188621z(this.f163628x);
                        ter0Var.m188592a(qny0VarM209761g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    ter0Var.m188605k0(this.f163594P);
                    ter0Var.m188619x(this.f163596R);
                    ter0Var.m188612q(i4);
                    i6 = 1;
                }
                if (this.f163605a != null) {
                    ter0Var.m188608m(this.f163605a);
                }
                ter0Var.m188602j(i);
                ter0Var.m188618w(str3);
                ter0Var.m188610o(i3);
                ter0Var.m188609n(this.f163602X);
                ter0Var.m188620y(i1111 == true ? 1 : 0);
                ter0Var.m188606l(listSingletonList);
                ter0Var.m188607l0(str2);
                ter0Var.m188596e(this.f163616l);
                mhr0 mhr0VarM188591D18 = ter0Var.m188591D();
                m7r0 m7r0VarMo129454i18 = m5r0Var.mo129454i(this.f163607c, i6);
                this.f163603Y = m7r0VarMo129454i18;
                m7r0VarMo129454i18.mo134531d(mhr0VarM188591D18);
                return;
            case 21:
                str5 = "audio/vnd.dts.hd";
                listSingletonList = null;
                str2 = null;
                i4 = -1;
                i3 = -1;
                if (this.f163593O != null) {
                    str2 = f5r0VarM119516a.f95199a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z19 = this.f163601W;
                if (true != this.f163600V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i1112 = i5 | (z19 ? 1 : 0);
                ter0Var = new ter0();
                if (uys0.m196370g(str3)) {
                    if (uys0.m196371h(str3)) {
                        if (this.f163622r == 0) {
                            i12 = this.f163620p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f163617m;
                            }
                            this.f163620p = i12;
                            i13 = this.f163621q;
                            if (i13 == -1) {
                                i13 = this.f163618n;
                            }
                            this.f163621q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f163620p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f163629y) {
                            if (this.f163583E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            xjy0 xjy0Var19 = new xjy0();
                            xjy0Var19.m209757c(this.f163630z);
                            xjy0Var19.m209756b(this.f163580B);
                            xjy0Var19.m209758d(this.f163579A);
                            xjy0Var19.m209759e(bArr);
                            xjy0Var19.m209760f(this.f163619o);
                            xjy0Var19.m209755a(this.f163619o);
                            qny0VarM209761g = xjy0Var19.m209761g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f163605a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f163623s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        ter0Var.m188590C(this.f163617m);
                        ter0Var.m188600i(this.f163618n);
                        ter0Var.m188614s(f);
                        ter0Var.m188617v(i10);
                        ter0Var.m188615t(this.f163627w);
                        ter0Var.m188621z(this.f163628x);
                        ter0Var.m188592a(qny0VarM209761g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    ter0Var.m188605k0(this.f163594P);
                    ter0Var.m188619x(this.f163596R);
                    ter0Var.m188612q(i4);
                    i6 = 1;
                }
                if (this.f163605a != null) {
                    ter0Var.m188608m(this.f163605a);
                }
                ter0Var.m188602j(i);
                ter0Var.m188618w(str3);
                ter0Var.m188610o(i3);
                ter0Var.m188609n(this.f163602X);
                ter0Var.m188620y(i1112 == true ? 1 : 0);
                ter0Var.m188606l(listSingletonList);
                ter0Var.m188607l0(str2);
                ter0Var.m188596e(this.f163616l);
                mhr0 mhr0VarM188591D19 = ter0Var.m188591D();
                m7r0 m7r0VarMo129454i19 = m5r0Var.mo129454i(this.f163607c, i6);
                this.f163603Y = m7r0VarMo129454i19;
                m7r0VarMo129454i19.mo134531d(mhr0VarM188591D19);
                return;
            case 22:
                listSingletonList = Collections.singletonList(m183263i(str4));
                str5 = "audio/flac";
                str2 = null;
                i4 = -1;
                i3 = -1;
                if (this.f163593O != null) {
                    str2 = f5r0VarM119516a.f95199a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z110 = this.f163601W;
                if (true != this.f163600V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i1113 = i5 | (z110 ? 1 : 0);
                ter0Var = new ter0();
                if (uys0.m196370g(str3)) {
                    if (uys0.m196371h(str3)) {
                        if (this.f163622r == 0) {
                            i12 = this.f163620p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f163617m;
                            }
                            this.f163620p = i12;
                            i13 = this.f163621q;
                            if (i13 == -1) {
                                i13 = this.f163618n;
                            }
                            this.f163621q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f163620p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f163629y) {
                            if (this.f163583E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            xjy0 xjy0Var110 = new xjy0();
                            xjy0Var110.m209757c(this.f163630z);
                            xjy0Var110.m209756b(this.f163580B);
                            xjy0Var110.m209758d(this.f163579A);
                            xjy0Var110.m209759e(bArr);
                            xjy0Var110.m209760f(this.f163619o);
                            xjy0Var110.m209755a(this.f163619o);
                            qny0VarM209761g = xjy0Var110.m209761g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f163605a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f163623s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        ter0Var.m188590C(this.f163617m);
                        ter0Var.m188600i(this.f163618n);
                        ter0Var.m188614s(f);
                        ter0Var.m188617v(i10);
                        ter0Var.m188615t(this.f163627w);
                        ter0Var.m188621z(this.f163628x);
                        ter0Var.m188592a(qny0VarM209761g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    ter0Var.m188605k0(this.f163594P);
                    ter0Var.m188619x(this.f163596R);
                    ter0Var.m188612q(i4);
                    i6 = 1;
                }
                if (this.f163605a != null) {
                    ter0Var.m188608m(this.f163605a);
                }
                ter0Var.m188602j(i);
                ter0Var.m188618w(str3);
                ter0Var.m188610o(i3);
                ter0Var.m188609n(this.f163602X);
                ter0Var.m188620y(i1113 == true ? 1 : 0);
                ter0Var.m188606l(listSingletonList);
                ter0Var.m188607l0(str2);
                ter0Var.m188596e(this.f163616l);
                mhr0 mhr0VarM188591D110 = ter0Var.m188591D();
                m7r0 m7r0VarMo129454i110 = m5r0Var.mo129454i(this.f163607c, i6);
                this.f163603Y = m7r0VarMo129454i110;
                m7r0VarMo129454i110.mo134531d(mhr0VarM188591D110);
                return;
            case 23:
                if (m183261h(new v6w0(m183263i(this.f163606b)))) {
                    iM126084z = ggw0.m126084z(this.f163595Q);
                    if (iM126084z == 0) {
                        svv0.m186111f("MatroskaExtractor", "Unsupported PCM bit depth: " + this.f163595Q + ". Setting mimeType to audio/x-unknown");
                    } else {
                        listSingletonList = null;
                        str2 = null;
                        i4 = iM126084z;
                    }
                    i3 = -1;
                    if (this.f163593O != null) {
                        str2 = f5r0VarM119516a.f95199a;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z111 = this.f163601W;
                    if (true != this.f163600V) {
                        i5 = 0;
                    } else {
                        i5 = 2;
                    }
                    int i1114 = i5 | (z111 ? 1 : 0);
                    ter0Var = new ter0();
                    if (uys0.m196370g(str3)) {
                        if (uys0.m196371h(str3)) {
                            if (this.f163622r == 0) {
                                i12 = this.f163620p;
                                i7 = -1;
                                if (i12 == -1) {
                                    i12 = this.f163617m;
                                }
                                this.f163620p = i12;
                                i13 = this.f163621q;
                                if (i13 == -1) {
                                    i13 = this.f163618n;
                                }
                                this.f163621q = i13;
                            } else {
                                i7 = -1;
                            }
                            i8 = this.f163620p;
                            if (i8 != i7) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f163629y) {
                                if (this.f163583E != -1.0f) {
                                    i9 = 0;
                                } else {
                                    i9 = 0;
                                }
                                xjy0 xjy0Var111 = new xjy0();
                                xjy0Var111.m209757c(this.f163630z);
                                xjy0Var111.m209756b(this.f163580B);
                                xjy0Var111.m209758d(this.f163579A);
                                xjy0Var111.m209759e(bArr);
                                xjy0Var111.m209760f(this.f163619o);
                                xjy0Var111.m209755a(this.f163619o);
                                qny0VarM209761g = xjy0Var111.m209761g();
                            } else {
                                i9 = 0;
                            }
                            if (this.f163605a == null) {
                                iIntValue = i7;
                            } else {
                                iIntValue = i7;
                            }
                            if (this.f163623s == 0) {
                                i10 = iIntValue;
                            } else {
                                i10 = iIntValue;
                            }
                            ter0Var.m188590C(this.f163617m);
                            ter0Var.m188600i(this.f163618n);
                            ter0Var.m188614s(f);
                            ter0Var.m188617v(i10);
                            ter0Var.m188615t(this.f163627w);
                            ter0Var.m188621z(this.f163628x);
                            ter0Var.m188592a(qny0VarM209761g);
                            i6 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i6 = 3;
                        }
                        break;
                    } else {
                        ter0Var.m188605k0(this.f163594P);
                        ter0Var.m188619x(this.f163596R);
                        ter0Var.m188612q(i4);
                        i6 = 1;
                    }
                    if (this.f163605a != null) {
                        ter0Var.m188608m(this.f163605a);
                    }
                    ter0Var.m188602j(i);
                    ter0Var.m188618w(str3);
                    ter0Var.m188610o(i3);
                    ter0Var.m188609n(this.f163602X);
                    ter0Var.m188620y(i1114 == true ? 1 : 0);
                    ter0Var.m188606l(listSingletonList);
                    ter0Var.m188607l0(str2);
                    ter0Var.m188596e(this.f163616l);
                    mhr0 mhr0VarM188591D111 = ter0Var.m188591D();
                    m7r0 m7r0VarMo129454i111 = m5r0Var.mo129454i(this.f163607c, i6);
                    this.f163603Y = m7r0VarMo129454i111;
                    m7r0VarMo129454i111.mo134531d(mhr0VarM188591D111);
                    return;
                }
                svv0.m186111f("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                listSingletonList = null;
                str2 = null;
                str5 = "audio/x-unknown";
                i4 = -1;
                i3 = -1;
                if (this.f163593O != null) {
                    str2 = f5r0VarM119516a.f95199a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z112 = this.f163601W;
                if (true != this.f163600V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i1115 = i5 | (z112 ? 1 : 0);
                ter0Var = new ter0();
                if (uys0.m196370g(str3)) {
                    if (uys0.m196371h(str3)) {
                        if (this.f163622r == 0) {
                            i12 = this.f163620p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f163617m;
                            }
                            this.f163620p = i12;
                            i13 = this.f163621q;
                            if (i13 == -1) {
                                i13 = this.f163618n;
                            }
                            this.f163621q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f163620p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f163629y) {
                            if (this.f163583E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            xjy0 xjy0Var112 = new xjy0();
                            xjy0Var112.m209757c(this.f163630z);
                            xjy0Var112.m209756b(this.f163580B);
                            xjy0Var112.m209758d(this.f163579A);
                            xjy0Var112.m209759e(bArr);
                            xjy0Var112.m209760f(this.f163619o);
                            xjy0Var112.m209755a(this.f163619o);
                            qny0VarM209761g = xjy0Var112.m209761g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f163605a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f163623s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        ter0Var.m188590C(this.f163617m);
                        ter0Var.m188600i(this.f163618n);
                        ter0Var.m188614s(f);
                        ter0Var.m188617v(i10);
                        ter0Var.m188615t(this.f163627w);
                        ter0Var.m188621z(this.f163628x);
                        ter0Var.m188592a(qny0VarM209761g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    ter0Var.m188605k0(this.f163594P);
                    ter0Var.m188619x(this.f163596R);
                    ter0Var.m188612q(i4);
                    i6 = 1;
                }
                if (this.f163605a != null) {
                    ter0Var.m188608m(this.f163605a);
                }
                ter0Var.m188602j(i);
                ter0Var.m188618w(str3);
                ter0Var.m188610o(i3);
                ter0Var.m188609n(this.f163602X);
                ter0Var.m188620y(i1115 == true ? 1 : 0);
                ter0Var.m188606l(listSingletonList);
                ter0Var.m188607l0(str2);
                ter0Var.m188596e(this.f163616l);
                mhr0 mhr0VarM188591D112 = ter0Var.m188591D();
                m7r0 m7r0VarMo129454i112 = m5r0Var.mo129454i(this.f163607c, i6);
                this.f163603Y = m7r0VarMo129454i112;
                m7r0VarMo129454i112.mo134531d(mhr0VarM188591D112);
                return;
            case 24:
                iM126084z = ggw0.m126084z(this.f163595Q);
                if (iM126084z == 0) {
                    svv0.m186111f("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + this.f163595Q + ". Setting mimeType to audio/x-unknown");
                    listSingletonList = null;
                    str2 = null;
                    str5 = "audio/x-unknown";
                    i4 = -1;
                } else {
                    listSingletonList = null;
                    str2 = null;
                    i4 = iM126084z;
                }
                i3 = -1;
                if (this.f163593O != null) {
                    str2 = f5r0VarM119516a.f95199a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z113 = this.f163601W;
                if (true != this.f163600V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i1116 = i5 | (z113 ? 1 : 0);
                ter0Var = new ter0();
                if (uys0.m196370g(str3)) {
                    if (uys0.m196371h(str3)) {
                        if (this.f163622r == 0) {
                            i12 = this.f163620p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f163617m;
                            }
                            this.f163620p = i12;
                            i13 = this.f163621q;
                            if (i13 == -1) {
                                i13 = this.f163618n;
                            }
                            this.f163621q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f163620p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f163629y) {
                            if (this.f163583E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            xjy0 xjy0Var113 = new xjy0();
                            xjy0Var113.m209757c(this.f163630z);
                            xjy0Var113.m209756b(this.f163580B);
                            xjy0Var113.m209758d(this.f163579A);
                            xjy0Var113.m209759e(bArr);
                            xjy0Var113.m209760f(this.f163619o);
                            xjy0Var113.m209755a(this.f163619o);
                            qny0VarM209761g = xjy0Var113.m209761g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f163605a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f163623s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        ter0Var.m188590C(this.f163617m);
                        ter0Var.m188600i(this.f163618n);
                        ter0Var.m188614s(f);
                        ter0Var.m188617v(i10);
                        ter0Var.m188615t(this.f163627w);
                        ter0Var.m188621z(this.f163628x);
                        ter0Var.m188592a(qny0VarM209761g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    ter0Var.m188605k0(this.f163594P);
                    ter0Var.m188619x(this.f163596R);
                    ter0Var.m188612q(i4);
                    i6 = 1;
                }
                if (this.f163605a != null) {
                    ter0Var.m188608m(this.f163605a);
                }
                ter0Var.m188602j(i);
                ter0Var.m188618w(str3);
                ter0Var.m188610o(i3);
                ter0Var.m188609n(this.f163602X);
                ter0Var.m188620y(i1116 == true ? 1 : 0);
                ter0Var.m188606l(listSingletonList);
                ter0Var.m188607l0(str2);
                ter0Var.m188596e(this.f163616l);
                mhr0 mhr0VarM188591D113 = ter0Var.m188591D();
                m7r0 m7r0VarMo129454i113 = m5r0Var.mo129454i(this.f163607c, i6);
                this.f163603Y = m7r0VarMo129454i113;
                m7r0VarMo129454i113.mo134531d(mhr0VarM188591D113);
                return;
            case 25:
                int i20 = this.f163595Q;
                if (i20 == 8) {
                    listSingletonList = null;
                    str2 = null;
                    i4 = 3;
                } else {
                    if (i20 == 16) {
                        iM126084z = 268435456;
                    } else if (i20 == 24) {
                        iM126084z = 1342177280;
                    } else if (i20 == 32) {
                        iM126084z = 1610612736;
                    } else {
                        svv0.m186111f("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + i20 + ". Setting mimeType to audio/x-unknown");
                        listSingletonList = null;
                        str2 = null;
                        str5 = "audio/x-unknown";
                        i4 = -1;
                    }
                    listSingletonList = null;
                    str2 = null;
                    i4 = iM126084z;
                }
                i3 = -1;
                if (this.f163593O != null) {
                    str2 = f5r0VarM119516a.f95199a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z114 = this.f163601W;
                if (true != this.f163600V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i1117 = i5 | (z114 ? 1 : 0);
                ter0Var = new ter0();
                if (uys0.m196370g(str3)) {
                    if (uys0.m196371h(str3)) {
                        if (this.f163622r == 0) {
                            i12 = this.f163620p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f163617m;
                            }
                            this.f163620p = i12;
                            i13 = this.f163621q;
                            if (i13 == -1) {
                                i13 = this.f163618n;
                            }
                            this.f163621q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f163620p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f163629y) {
                            if (this.f163583E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            xjy0 xjy0Var114 = new xjy0();
                            xjy0Var114.m209757c(this.f163630z);
                            xjy0Var114.m209756b(this.f163580B);
                            xjy0Var114.m209758d(this.f163579A);
                            xjy0Var114.m209759e(bArr);
                            xjy0Var114.m209760f(this.f163619o);
                            xjy0Var114.m209755a(this.f163619o);
                            qny0VarM209761g = xjy0Var114.m209761g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f163605a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f163623s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        ter0Var.m188590C(this.f163617m);
                        ter0Var.m188600i(this.f163618n);
                        ter0Var.m188614s(f);
                        ter0Var.m188617v(i10);
                        ter0Var.m188615t(this.f163627w);
                        ter0Var.m188621z(this.f163628x);
                        ter0Var.m188592a(qny0VarM209761g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    ter0Var.m188605k0(this.f163594P);
                    ter0Var.m188619x(this.f163596R);
                    ter0Var.m188612q(i4);
                    i6 = 1;
                }
                if (this.f163605a != null) {
                    ter0Var.m188608m(this.f163605a);
                }
                ter0Var.m188602j(i);
                ter0Var.m188618w(str3);
                ter0Var.m188610o(i3);
                ter0Var.m188609n(this.f163602X);
                ter0Var.m188620y(i1117 == true ? 1 : 0);
                ter0Var.m188606l(listSingletonList);
                ter0Var.m188607l0(str2);
                ter0Var.m188596e(this.f163616l);
                mhr0 mhr0VarM188591D114 = ter0Var.m188591D();
                m7r0 m7r0VarMo129454i114 = m5r0Var.mo129454i(this.f163607c, i6);
                this.f163603Y = m7r0VarMo129454i114;
                m7r0VarMo129454i114.mo134531d(mhr0VarM188591D114);
                return;
            case 26:
                int i21 = this.f163595Q;
                if (i21 == 32) {
                    listSingletonList = null;
                    str2 = null;
                    i4 = iM126084z;
                } else {
                    svv0.m186111f("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + i21 + ". Setting mimeType to audio/x-unknown");
                    listSingletonList = null;
                    str2 = null;
                    str5 = "audio/x-unknown";
                    i4 = -1;
                }
                i3 = -1;
                if (this.f163593O != null) {
                    str2 = f5r0VarM119516a.f95199a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z115 = this.f163601W;
                if (true != this.f163600V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i1118 = i5 | (z115 ? 1 : 0);
                ter0Var = new ter0();
                if (uys0.m196370g(str3)) {
                    if (uys0.m196371h(str3)) {
                        if (this.f163622r == 0) {
                            i12 = this.f163620p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f163617m;
                            }
                            this.f163620p = i12;
                            i13 = this.f163621q;
                            if (i13 == -1) {
                                i13 = this.f163618n;
                            }
                            this.f163621q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f163620p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f163629y) {
                            if (this.f163583E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            xjy0 xjy0Var115 = new xjy0();
                            xjy0Var115.m209757c(this.f163630z);
                            xjy0Var115.m209756b(this.f163580B);
                            xjy0Var115.m209758d(this.f163579A);
                            xjy0Var115.m209759e(bArr);
                            xjy0Var115.m209760f(this.f163619o);
                            xjy0Var115.m209755a(this.f163619o);
                            qny0VarM209761g = xjy0Var115.m209761g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f163605a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f163623s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        ter0Var.m188590C(this.f163617m);
                        ter0Var.m188600i(this.f163618n);
                        ter0Var.m188614s(f);
                        ter0Var.m188617v(i10);
                        ter0Var.m188615t(this.f163627w);
                        ter0Var.m188621z(this.f163628x);
                        ter0Var.m188592a(qny0VarM209761g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    ter0Var.m188605k0(this.f163594P);
                    ter0Var.m188619x(this.f163596R);
                    ter0Var.m188612q(i4);
                    i6 = 1;
                }
                if (this.f163605a != null) {
                    ter0Var.m188608m(this.f163605a);
                }
                ter0Var.m188602j(i);
                ter0Var.m188618w(str3);
                ter0Var.m188610o(i3);
                ter0Var.m188609n(this.f163602X);
                ter0Var.m188620y(i1118 == true ? 1 : 0);
                ter0Var.m188606l(listSingletonList);
                ter0Var.m188607l0(str2);
                ter0Var.m188596e(this.f163616l);
                mhr0 mhr0VarM188591D115 = ter0Var.m188591D();
                m7r0 m7r0VarMo129454i115 = m5r0Var.mo129454i(this.f163607c, i6);
                this.f163603Y = m7r0VarMo129454i115;
                m7r0VarMo129454i115.mo134531d(mhr0VarM188591D115);
                return;
            case 27:
                listSingletonList = null;
                str2 = null;
                str5 = "application/x-subrip";
                i4 = -1;
                i3 = -1;
                if (this.f163593O != null) {
                    str2 = f5r0VarM119516a.f95199a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z116 = this.f163601W;
                if (true != this.f163600V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i1119 = i5 | (z116 ? 1 : 0);
                ter0Var = new ter0();
                if (uys0.m196370g(str3)) {
                    if (uys0.m196371h(str3)) {
                        if (this.f163622r == 0) {
                            i12 = this.f163620p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f163617m;
                            }
                            this.f163620p = i12;
                            i13 = this.f163621q;
                            if (i13 == -1) {
                                i13 = this.f163618n;
                            }
                            this.f163621q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f163620p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f163629y) {
                            if (this.f163583E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            xjy0 xjy0Var116 = new xjy0();
                            xjy0Var116.m209757c(this.f163630z);
                            xjy0Var116.m209756b(this.f163580B);
                            xjy0Var116.m209758d(this.f163579A);
                            xjy0Var116.m209759e(bArr);
                            xjy0Var116.m209760f(this.f163619o);
                            xjy0Var116.m209755a(this.f163619o);
                            qny0VarM209761g = xjy0Var116.m209761g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f163605a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f163623s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        ter0Var.m188590C(this.f163617m);
                        ter0Var.m188600i(this.f163618n);
                        ter0Var.m188614s(f);
                        ter0Var.m188617v(i10);
                        ter0Var.m188615t(this.f163627w);
                        ter0Var.m188621z(this.f163628x);
                        ter0Var.m188592a(qny0VarM209761g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    ter0Var.m188605k0(this.f163594P);
                    ter0Var.m188619x(this.f163596R);
                    ter0Var.m188612q(i4);
                    i6 = 1;
                }
                if (this.f163605a != null) {
                    ter0Var.m188608m(this.f163605a);
                }
                ter0Var.m188602j(i);
                ter0Var.m188618w(str3);
                ter0Var.m188610o(i3);
                ter0Var.m188609n(this.f163602X);
                ter0Var.m188620y(i1119 == true ? 1 : 0);
                ter0Var.m188606l(listSingletonList);
                ter0Var.m188607l0(str2);
                ter0Var.m188596e(this.f163616l);
                mhr0 mhr0VarM188591D116 = ter0Var.m188591D();
                m7r0 m7r0VarMo129454i116 = m5r0Var.mo129454i(this.f163607c, i6);
                this.f163603Y = m7r0VarMo129454i116;
                m7r0VarMo129454i116.mo134531d(mhr0VarM188591D116);
                return;
            case 28:
                listSingletonList = zzgaa.zzn(tbr0.f169294e0, m183263i(this.f163606b));
                str2 = null;
                str5 = "text/x-ssa";
                i4 = -1;
                i3 = -1;
                if (this.f163593O != null) {
                    str2 = f5r0VarM119516a.f95199a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z117 = this.f163601W;
                if (true != this.f163600V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i11110 = i5 | (z117 ? 1 : 0);
                ter0Var = new ter0();
                if (uys0.m196370g(str3)) {
                    if (uys0.m196371h(str3)) {
                        if (this.f163622r == 0) {
                            i12 = this.f163620p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f163617m;
                            }
                            this.f163620p = i12;
                            i13 = this.f163621q;
                            if (i13 == -1) {
                                i13 = this.f163618n;
                            }
                            this.f163621q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f163620p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f163629y) {
                            if (this.f163583E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            xjy0 xjy0Var117 = new xjy0();
                            xjy0Var117.m209757c(this.f163630z);
                            xjy0Var117.m209756b(this.f163580B);
                            xjy0Var117.m209758d(this.f163579A);
                            xjy0Var117.m209759e(bArr);
                            xjy0Var117.m209760f(this.f163619o);
                            xjy0Var117.m209755a(this.f163619o);
                            qny0VarM209761g = xjy0Var117.m209761g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f163605a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f163623s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        ter0Var.m188590C(this.f163617m);
                        ter0Var.m188600i(this.f163618n);
                        ter0Var.m188614s(f);
                        ter0Var.m188617v(i10);
                        ter0Var.m188615t(this.f163627w);
                        ter0Var.m188621z(this.f163628x);
                        ter0Var.m188592a(qny0VarM209761g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    ter0Var.m188605k0(this.f163594P);
                    ter0Var.m188619x(this.f163596R);
                    ter0Var.m188612q(i4);
                    i6 = 1;
                }
                if (this.f163605a != null) {
                    ter0Var.m188608m(this.f163605a);
                }
                ter0Var.m188602j(i);
                ter0Var.m188618w(str3);
                ter0Var.m188610o(i3);
                ter0Var.m188609n(this.f163602X);
                ter0Var.m188620y(i11110 == true ? 1 : 0);
                ter0Var.m188606l(listSingletonList);
                ter0Var.m188607l0(str2);
                ter0Var.m188596e(this.f163616l);
                mhr0 mhr0VarM188591D117 = ter0Var.m188591D();
                m7r0 m7r0VarMo129454i117 = m5r0Var.mo129454i(this.f163607c, i6);
                this.f163603Y = m7r0VarMo129454i117;
                m7r0VarMo129454i117.mo134531d(mhr0VarM188591D117);
                return;
            case 29:
                listSingletonList = null;
                str2 = null;
                str5 = "text/vtt";
                i4 = -1;
                i3 = -1;
                if (this.f163593O != null) {
                    str2 = f5r0VarM119516a.f95199a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z118 = this.f163601W;
                if (true != this.f163600V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i11111 = i5 | (z118 ? 1 : 0);
                ter0Var = new ter0();
                if (uys0.m196370g(str3)) {
                    if (uys0.m196371h(str3)) {
                        if (this.f163622r == 0) {
                            i12 = this.f163620p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f163617m;
                            }
                            this.f163620p = i12;
                            i13 = this.f163621q;
                            if (i13 == -1) {
                                i13 = this.f163618n;
                            }
                            this.f163621q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f163620p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f163629y) {
                            if (this.f163583E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            xjy0 xjy0Var118 = new xjy0();
                            xjy0Var118.m209757c(this.f163630z);
                            xjy0Var118.m209756b(this.f163580B);
                            xjy0Var118.m209758d(this.f163579A);
                            xjy0Var118.m209759e(bArr);
                            xjy0Var118.m209760f(this.f163619o);
                            xjy0Var118.m209755a(this.f163619o);
                            qny0VarM209761g = xjy0Var118.m209761g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f163605a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f163623s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        ter0Var.m188590C(this.f163617m);
                        ter0Var.m188600i(this.f163618n);
                        ter0Var.m188614s(f);
                        ter0Var.m188617v(i10);
                        ter0Var.m188615t(this.f163627w);
                        ter0Var.m188621z(this.f163628x);
                        ter0Var.m188592a(qny0VarM209761g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    ter0Var.m188605k0(this.f163594P);
                    ter0Var.m188619x(this.f163596R);
                    ter0Var.m188612q(i4);
                    i6 = 1;
                }
                if (this.f163605a != null) {
                    ter0Var.m188608m(this.f163605a);
                }
                ter0Var.m188602j(i);
                ter0Var.m188618w(str3);
                ter0Var.m188610o(i3);
                ter0Var.m188609n(this.f163602X);
                ter0Var.m188620y(i11111 == true ? 1 : 0);
                ter0Var.m188606l(listSingletonList);
                ter0Var.m188607l0(str2);
                ter0Var.m188596e(this.f163616l);
                mhr0 mhr0VarM188591D118 = ter0Var.m188591D();
                m7r0 m7r0VarMo129454i118 = m5r0Var.mo129454i(this.f163607c, i6);
                this.f163603Y = m7r0VarMo129454i118;
                m7r0VarMo129454i118.mo134531d(mhr0VarM188591D118);
                return;
            case 30:
                listSingletonList = zzgaa.zzm(m183263i(str4));
                str5 = "application/vobsub";
                str2 = null;
                i4 = -1;
                i3 = -1;
                if (this.f163593O != null) {
                    str2 = f5r0VarM119516a.f95199a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z119 = this.f163601W;
                if (true != this.f163600V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i11112 = i5 | (z119 ? 1 : 0);
                ter0Var = new ter0();
                if (uys0.m196370g(str3)) {
                    if (uys0.m196371h(str3)) {
                        if (this.f163622r == 0) {
                            i12 = this.f163620p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f163617m;
                            }
                            this.f163620p = i12;
                            i13 = this.f163621q;
                            if (i13 == -1) {
                                i13 = this.f163618n;
                            }
                            this.f163621q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f163620p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f163629y) {
                            if (this.f163583E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            xjy0 xjy0Var119 = new xjy0();
                            xjy0Var119.m209757c(this.f163630z);
                            xjy0Var119.m209756b(this.f163580B);
                            xjy0Var119.m209758d(this.f163579A);
                            xjy0Var119.m209759e(bArr);
                            xjy0Var119.m209760f(this.f163619o);
                            xjy0Var119.m209755a(this.f163619o);
                            qny0VarM209761g = xjy0Var119.m209761g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f163605a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f163623s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        ter0Var.m188590C(this.f163617m);
                        ter0Var.m188600i(this.f163618n);
                        ter0Var.m188614s(f);
                        ter0Var.m188617v(i10);
                        ter0Var.m188615t(this.f163627w);
                        ter0Var.m188621z(this.f163628x);
                        ter0Var.m188592a(qny0VarM209761g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    ter0Var.m188605k0(this.f163594P);
                    ter0Var.m188619x(this.f163596R);
                    ter0Var.m188612q(i4);
                    i6 = 1;
                }
                if (this.f163605a != null) {
                    ter0Var.m188608m(this.f163605a);
                }
                ter0Var.m188602j(i);
                ter0Var.m188618w(str3);
                ter0Var.m188610o(i3);
                ter0Var.m188609n(this.f163602X);
                ter0Var.m188620y(i11112 == true ? 1 : 0);
                ter0Var.m188606l(listSingletonList);
                ter0Var.m188607l0(str2);
                ter0Var.m188596e(this.f163616l);
                mhr0 mhr0VarM188591D119 = ter0Var.m188591D();
                m7r0 m7r0VarMo129454i119 = m5r0Var.mo129454i(this.f163607c, i6);
                this.f163603Y = m7r0VarMo129454i119;
                m7r0VarMo129454i119.mo134531d(mhr0VarM188591D119);
                return;
            case 31:
                listSingletonList = null;
                str2 = null;
                str5 = "application/pgs";
                i4 = -1;
                i3 = -1;
                if (this.f163593O != null) {
                    str2 = f5r0VarM119516a.f95199a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z1110 = this.f163601W;
                if (true != this.f163600V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i11113 = i5 | (z1110 ? 1 : 0);
                ter0Var = new ter0();
                if (uys0.m196370g(str3)) {
                    if (uys0.m196371h(str3)) {
                        if (this.f163622r == 0) {
                            i12 = this.f163620p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f163617m;
                            }
                            this.f163620p = i12;
                            i13 = this.f163621q;
                            if (i13 == -1) {
                                i13 = this.f163618n;
                            }
                            this.f163621q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f163620p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f163629y) {
                            if (this.f163583E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            xjy0 xjy0Var1110 = new xjy0();
                            xjy0Var1110.m209757c(this.f163630z);
                            xjy0Var1110.m209756b(this.f163580B);
                            xjy0Var1110.m209758d(this.f163579A);
                            xjy0Var1110.m209759e(bArr);
                            xjy0Var1110.m209760f(this.f163619o);
                            xjy0Var1110.m209755a(this.f163619o);
                            qny0VarM209761g = xjy0Var1110.m209761g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f163605a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f163623s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        ter0Var.m188590C(this.f163617m);
                        ter0Var.m188600i(this.f163618n);
                        ter0Var.m188614s(f);
                        ter0Var.m188617v(i10);
                        ter0Var.m188615t(this.f163627w);
                        ter0Var.m188621z(this.f163628x);
                        ter0Var.m188592a(qny0VarM209761g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    ter0Var.m188605k0(this.f163594P);
                    ter0Var.m188619x(this.f163596R);
                    ter0Var.m188612q(i4);
                    i6 = 1;
                }
                if (this.f163605a != null) {
                    ter0Var.m188608m(this.f163605a);
                }
                ter0Var.m188602j(i);
                ter0Var.m188618w(str3);
                ter0Var.m188610o(i3);
                ter0Var.m188609n(this.f163602X);
                ter0Var.m188620y(i11113 == true ? 1 : 0);
                ter0Var.m188606l(listSingletonList);
                ter0Var.m188607l0(str2);
                ter0Var.m188596e(this.f163616l);
                mhr0 mhr0VarM188591D1110 = ter0Var.m188591D();
                m7r0 m7r0VarMo129454i1110 = m5r0Var.mo129454i(this.f163607c, i6);
                this.f163603Y = m7r0VarMo129454i1110;
                m7r0VarMo129454i1110.mo134531d(mhr0VarM188591D1110);
                return;
            case 32:
                byte[] bArr3 = new byte[4];
                System.arraycopy(m183263i(str4), 0, bArr3, 0, 4);
                listSingletonList = zzgaa.zzm(bArr3);
                str2 = null;
                str5 = "application/dvbsubs";
                i4 = -1;
                i3 = -1;
                if (this.f163593O != null) {
                    str2 = f5r0VarM119516a.f95199a;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z1111 = this.f163601W;
                if (true != this.f163600V) {
                    i5 = 0;
                } else {
                    i5 = 2;
                }
                int i11114 = i5 | (z1111 ? 1 : 0);
                ter0Var = new ter0();
                if (uys0.m196370g(str3)) {
                    if (uys0.m196371h(str3)) {
                        if (this.f163622r == 0) {
                            i12 = this.f163620p;
                            i7 = -1;
                            if (i12 == -1) {
                                i12 = this.f163617m;
                            }
                            this.f163620p = i12;
                            i13 = this.f163621q;
                            if (i13 == -1) {
                                i13 = this.f163618n;
                            }
                            this.f163621q = i13;
                        } else {
                            i7 = -1;
                        }
                        i8 = this.f163620p;
                        if (i8 != i7) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.f163629y) {
                            if (this.f163583E != -1.0f) {
                                i9 = 0;
                            } else {
                                i9 = 0;
                            }
                            xjy0 xjy0Var1111 = new xjy0();
                            xjy0Var1111.m209757c(this.f163630z);
                            xjy0Var1111.m209756b(this.f163580B);
                            xjy0Var1111.m209758d(this.f163579A);
                            xjy0Var1111.m209759e(bArr);
                            xjy0Var1111.m209760f(this.f163619o);
                            xjy0Var1111.m209755a(this.f163619o);
                            qny0VarM209761g = xjy0Var1111.m209761g();
                        } else {
                            i9 = 0;
                        }
                        if (this.f163605a == null) {
                            iIntValue = i7;
                        } else {
                            iIntValue = i7;
                        }
                        if (this.f163623s == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        ter0Var.m188590C(this.f163617m);
                        ter0Var.m188600i(this.f163618n);
                        ter0Var.m188614s(f);
                        ter0Var.m188617v(i10);
                        ter0Var.m188615t(this.f163627w);
                        ter0Var.m188621z(this.f163628x);
                        ter0Var.m188592a(qny0VarM209761g);
                        i6 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3)) {
                        }
                        i6 = 3;
                    }
                    break;
                } else {
                    ter0Var.m188605k0(this.f163594P);
                    ter0Var.m188619x(this.f163596R);
                    ter0Var.m188612q(i4);
                    i6 = 1;
                }
                if (this.f163605a != null) {
                    ter0Var.m188608m(this.f163605a);
                }
                ter0Var.m188602j(i);
                ter0Var.m188618w(str3);
                ter0Var.m188610o(i3);
                ter0Var.m188609n(this.f163602X);
                ter0Var.m188620y(i11114 == true ? 1 : 0);
                ter0Var.m188606l(listSingletonList);
                ter0Var.m188607l0(str2);
                ter0Var.m188596e(this.f163616l);
                mhr0 mhr0VarM188591D1111 = ter0Var.m188591D();
                m7r0 m7r0VarMo129454i1111 = m5r0Var.mo129454i(this.f163607c, i6);
                this.f163603Y = m7r0VarMo129454i1111;
                m7r0VarMo129454i1111.mo134531d(mhr0VarM188591D1111);
                return;
            default:
                throw zzcc.zza("Unrecognized codec identifier.", null);
        }
    }

    @EnsuresNonNull({"codecPrivate"})
    /* JADX INFO: renamed from: i */
    public final byte[] m183263i(String str) throws zzcc {
        byte[] bArr = this.f163615k;
        if (bArr != null) {
            return bArr;
        }
        throw zzcc.zza("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }
}
