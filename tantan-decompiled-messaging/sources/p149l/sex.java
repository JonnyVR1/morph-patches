package p149l;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.common.collect.ImmutableList;
import com.google.firebase.FirebaseError;
import com.tencent.ugc.TXRecordCommon;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.eclipse.jetty.http.HttpTokens;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class sex implements sqf {

    /* JADX INFO: renamed from: c0 */
    public static final xqf f164071c0 = new xqf() { // from class: l.rex
        @Override // p149l.xqf
        /* JADX INFO: renamed from: b */
        public final sqf[] mo95334b() {
            return sex.m183727c();
        }
    };

    /* JADX INFO: renamed from: d0 */
    public static final byte[] f164072d0 = {49, 10, 48, 48, HttpTokens.COLON, 48, 48, HttpTokens.COLON, 48, 48, 44, 48, 48, 48, HttpTokens.SPACE, 45, 45, 62, HttpTokens.SPACE, 48, 48, HttpTokens.COLON, 48, 48, HttpTokens.COLON, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: e0 */
    public static final byte[] f164073e0 = vck0.m197887r0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* JADX INFO: renamed from: f0 */
    public static final byte[] f164074f0 = {68, 105, 97, 108, 111, 103, 117, 101, HttpTokens.COLON, HttpTokens.SPACE, 48, HttpTokens.COLON, 48, 48, HttpTokens.COLON, 48, 48, HttpTokens.COLON, 48, 48, 44, 48, HttpTokens.COLON, 48, 48, HttpTokens.COLON, 48, 48, HttpTokens.COLON, 48, 48, 44};

    /* JADX INFO: renamed from: g0 */
    public static final byte[] f164075g0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, HttpTokens.COLON, 48, 48, HttpTokens.COLON, 48, 48, 46, 48, 48, 48, HttpTokens.SPACE, 45, 45, 62, HttpTokens.SPACE, 48, 48, HttpTokens.COLON, 48, 48, HttpTokens.COLON, 48, 48, 46, 48, 48, 48, 10};

    /* JADX INFO: renamed from: h0 */
    public static final UUID f164076h0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* JADX INFO: renamed from: i0 */
    public static final Map<String, Integer> f164077i0;

    /* JADX INFO: renamed from: A */
    public long f164078A;

    /* JADX INFO: renamed from: B */
    public long f164079B;

    /* JADX INFO: renamed from: C */
    @Nullable
    public jzv f164080C;

    /* JADX INFO: renamed from: D */
    @Nullable
    public jzv f164081D;

    /* JADX INFO: renamed from: E */
    public boolean f164082E;

    /* JADX INFO: renamed from: F */
    public boolean f164083F;

    /* JADX INFO: renamed from: G */
    public int f164084G;

    /* JADX INFO: renamed from: H */
    public long f164085H;

    /* JADX INFO: renamed from: I */
    public long f164086I;

    /* JADX INFO: renamed from: J */
    public int f164087J;

    /* JADX INFO: renamed from: K */
    public int f164088K;

    /* JADX INFO: renamed from: L */
    public int[] f164089L;

    /* JADX INFO: renamed from: M */
    public int f164090M;

    /* JADX INFO: renamed from: N */
    public int f164091N;

    /* JADX INFO: renamed from: O */
    public int f164092O;

    /* JADX INFO: renamed from: P */
    public int f164093P;

    /* JADX INFO: renamed from: Q */
    public boolean f164094Q;

    /* JADX INFO: renamed from: R */
    public long f164095R;

    /* JADX INFO: renamed from: S */
    public int f164096S;

    /* JADX INFO: renamed from: T */
    public int f164097T;

    /* JADX INFO: renamed from: U */
    public int f164098U;

    /* JADX INFO: renamed from: V */
    public boolean f164099V;

    /* JADX INFO: renamed from: W */
    public boolean f164100W;

    /* JADX INFO: renamed from: X */
    public boolean f164101X;

    /* JADX INFO: renamed from: Y */
    public int f164102Y;

    /* JADX INFO: renamed from: Z */
    public byte f164103Z;

    /* JADX INFO: renamed from: a */
    public final hje f164104a;

    /* JADX INFO: renamed from: a0 */
    public boolean f164105a0;

    /* JADX INFO: renamed from: b */
    public final jsk0 f164106b;

    /* JADX INFO: renamed from: b0 */
    public uqf f164107b0;

    /* JADX INFO: renamed from: c */
    public final SparseArray<C19927c> f164108c;

    /* JADX INFO: renamed from: d */
    public final boolean f164109d;

    /* JADX INFO: renamed from: e */
    public final d860 f164110e;

    /* JADX INFO: renamed from: f */
    public final d860 f164111f;

    /* JADX INFO: renamed from: g */
    public final d860 f164112g;

    /* JADX INFO: renamed from: h */
    public final d860 f164113h;

    /* JADX INFO: renamed from: i */
    public final d860 f164114i;

    /* JADX INFO: renamed from: j */
    public final d860 f164115j;

    /* JADX INFO: renamed from: k */
    public final d860 f164116k;

    /* JADX INFO: renamed from: l */
    public final d860 f164117l;

    /* JADX INFO: renamed from: m */
    public final d860 f164118m;

    /* JADX INFO: renamed from: n */
    public final d860 f164119n;

    /* JADX INFO: renamed from: o */
    public ByteBuffer f164120o;

    /* JADX INFO: renamed from: p */
    public long f164121p;

    /* JADX INFO: renamed from: q */
    public long f164122q;

    /* JADX INFO: renamed from: r */
    public long f164123r;

    /* JADX INFO: renamed from: s */
    public long f164124s;

    /* JADX INFO: renamed from: t */
    public long f164125t;

    /* JADX INFO: renamed from: u */
    @Nullable
    public C19927c f164126u;

    /* JADX INFO: renamed from: v */
    public boolean f164127v;

    /* JADX INFO: renamed from: w */
    public int f164128w;

    /* JADX INFO: renamed from: x */
    public long f164129x;

    /* JADX INFO: renamed from: y */
    public boolean f164130y;

    /* JADX INFO: renamed from: z */
    public long f164131z;

    /* JADX INFO: renamed from: l.sex$b */
    public final class C19926b implements gje {
        public C19926b() {
        }

        @Override // p149l.gje
        /* JADX INFO: renamed from: a */
        public void mo126469a(int i) throws ParserException {
            sex.this.m183750o(i);
        }

        @Override // p149l.gje
        /* JADX INFO: renamed from: b */
        public void mo126470b(int i, double d) throws ParserException {
            sex.this.m183752r(i, d);
        }

        @Override // p149l.gje
        /* JADX INFO: renamed from: c */
        public void mo126471c(int i, long j) throws ParserException {
            sex.this.m183757x(i, j);
        }

        @Override // p149l.gje
        /* JADX INFO: renamed from: d */
        public void mo126472d(int i, String str) throws ParserException {
            sex.this.m183740G(i, str);
        }

        @Override // p149l.gje
        /* JADX INFO: renamed from: e */
        public void mo126473e(int i, long j, long j2) throws ParserException {
            sex.this.m183739F(i, j, j2);
        }

        @Override // p149l.gje
        /* JADX INFO: renamed from: f */
        public int mo126474f(int i) {
            return sex.this.m183754u(i);
        }

        @Override // p149l.gje
        /* JADX INFO: renamed from: g */
        public boolean mo126475g(int i) {
            return sex.this.m183758z(i);
        }

        @Override // p149l.gje
        /* JADX INFO: renamed from: h */
        public void mo126476h(int i, int i2, tqf tqfVar) throws IOException {
            sex.this.m183747l(i, i2, tqfVar);
        }
    }

    /* JADX INFO: renamed from: l.sex$c */
    public static final class C19927c {

        /* JADX INFO: renamed from: N */
        public byte[] f164146N;

        /* JADX INFO: renamed from: T */
        public yaj0 f164152T;

        /* JADX INFO: renamed from: U */
        public boolean f164153U;

        /* JADX INFO: renamed from: X */
        public m6j0 f164156X;

        /* JADX INFO: renamed from: Y */
        public int f164157Y;

        /* JADX INFO: renamed from: a */
        public String f164158a;

        /* JADX INFO: renamed from: b */
        public String f164159b;

        /* JADX INFO: renamed from: c */
        public int f164160c;

        /* JADX INFO: renamed from: d */
        public int f164161d;

        /* JADX INFO: renamed from: e */
        public int f164162e;

        /* JADX INFO: renamed from: f */
        public int f164163f;

        /* JADX INFO: renamed from: g */
        public int f164164g;

        /* JADX INFO: renamed from: h */
        public boolean f164165h;

        /* JADX INFO: renamed from: i */
        public byte[] f164166i;

        /* JADX INFO: renamed from: j */
        public m6j0.C18401a f164167j;

        /* JADX INFO: renamed from: k */
        public byte[] f164168k;

        /* JADX INFO: renamed from: l */
        public DrmInitData f164169l;

        /* JADX INFO: renamed from: m */
        public int f164170m = -1;

        /* JADX INFO: renamed from: n */
        public int f164171n = -1;

        /* JADX INFO: renamed from: o */
        public int f164172o = -1;

        /* JADX INFO: renamed from: p */
        public int f164173p = -1;

        /* JADX INFO: renamed from: q */
        public int f164174q = 0;

        /* JADX INFO: renamed from: r */
        public int f164175r = -1;

        /* JADX INFO: renamed from: s */
        public float f164176s = 0.0f;

        /* JADX INFO: renamed from: t */
        public float f164177t = 0.0f;

        /* JADX INFO: renamed from: u */
        public float f164178u = 0.0f;

        /* JADX INFO: renamed from: v */
        public byte[] f164179v = null;

        /* JADX INFO: renamed from: w */
        public int f164180w = -1;

        /* JADX INFO: renamed from: x */
        public boolean f164181x = false;

        /* JADX INFO: renamed from: y */
        public int f164182y = -1;

        /* JADX INFO: renamed from: z */
        public int f164183z = -1;

        /* JADX INFO: renamed from: A */
        public int f164133A = -1;

        /* JADX INFO: renamed from: B */
        public int f164134B = 1000;

        /* JADX INFO: renamed from: C */
        public int f164135C = 200;

        /* JADX INFO: renamed from: D */
        public float f164136D = -1.0f;

        /* JADX INFO: renamed from: E */
        public float f164137E = -1.0f;

        /* JADX INFO: renamed from: F */
        public float f164138F = -1.0f;

        /* JADX INFO: renamed from: G */
        public float f164139G = -1.0f;

        /* JADX INFO: renamed from: H */
        public float f164140H = -1.0f;

        /* JADX INFO: renamed from: I */
        public float f164141I = -1.0f;

        /* JADX INFO: renamed from: J */
        public float f164142J = -1.0f;

        /* JADX INFO: renamed from: K */
        public float f164143K = -1.0f;

        /* JADX INFO: renamed from: L */
        public float f164144L = -1.0f;

        /* JADX INFO: renamed from: M */
        public float f164145M = -1.0f;

        /* JADX INFO: renamed from: O */
        public int f164147O = 1;

        /* JADX INFO: renamed from: P */
        public int f164148P = -1;

        /* JADX INFO: renamed from: Q */
        public int f164149Q = TXRecordCommon.AUDIO_SAMPLERATE_8000;

        /* JADX INFO: renamed from: R */
        public long f164150R = 0;

        /* JADX INFO: renamed from: S */
        public long f164151S = 0;

        /* JADX INFO: renamed from: V */
        public boolean f164154V = true;

        /* JADX INFO: renamed from: W */
        public String f164155W = "eng";

        /* JADX INFO: renamed from: k */
        public static Pair<String, List<byte[]>> m183764k(d860 d860Var) throws ParserException {
            try {
                d860Var.m110293V(16);
                long jM110318x = d860Var.m110318x();
                if (jM110318x == 1482049860) {
                    return new Pair<>(DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_DIVX, null);
                }
                if (jM110318x == 859189832) {
                    return new Pair<>(DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_3GP, null);
                }
                if (jM110318x != 826496599) {
                    jwv.m143689i("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair<>("video/x-unknown", null);
                }
                byte[] bArrM110299e = d860Var.m110299e();
                for (int iM110300f = d860Var.m110300f() + 20; iM110300f < bArrM110299e.length - 4; iM110300f++) {
                    if (bArrM110299e[iM110300f] == 0 && bArrM110299e[iM110300f + 1] == 0 && bArrM110299e[iM110300f + 2] == 1 && bArrM110299e[iM110300f + 3] == 15) {
                        return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrM110299e, iM110300f, bArrM110299e.length)));
                    }
                }
                throw ParserException.createForMalformedContainer("Failed to find FourCC VC1 initialization data", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing FourCC private data", null);
            }
        }

        /* JADX INFO: renamed from: l */
        public static boolean m183765l(d860 d860Var) throws ParserException {
            try {
                int iM110320z = d860Var.m110320z();
                if (iM110320z == 1) {
                    return true;
                }
                if (iM110320z == 65534) {
                    d860Var.m110292U(24);
                    if (d860Var.m110272A() == sex.f164076h0.getMostSignificantBits() && d860Var.m110272A() == sex.f164076h0.getLeastSignificantBits()) {
                        return true;
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing MS/ACM codec private", null);
            }
        }

        /* JADX INFO: renamed from: m */
        public static List<byte[]> m183766m(byte[] bArr) throws ParserException {
            int i;
            int i2;
            try {
                if (bArr[0] != 2) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                int i3 = 0;
                int i4 = 1;
                while (true) {
                    i = bArr[i4];
                    if ((i & 255) != 255) {
                        break;
                    }
                    i3 += 255;
                    i4++;
                }
                int i5 = i4 + 1;
                int i6 = i3 + (i & 255);
                int i7 = 0;
                while (true) {
                    i2 = bArr[i5];
                    if ((i2 & 255) != 255) {
                        break;
                    }
                    i7 += 255;
                    i5++;
                }
                int i8 = i5 + 1;
                int i9 = i7 + (i2 & 255);
                if (bArr[i8] != 1) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i6];
                System.arraycopy(bArr, i8, bArr2, 0, i6);
                int i10 = i8 + i6;
                if (bArr[i10] != 3) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                int i11 = i10 + i9;
                if (bArr[i11] != 5) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i11];
                System.arraycopy(bArr, i11, bArr3, 0, bArr.length - i11);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
            }
        }

        @EnsuresNonNull({"output"})
        /* JADX INFO: renamed from: f */
        public final void m183767f() {
            p11.m167011e(this.f164156X);
        }

        @EnsuresNonNull({"codecPrivate"})
        /* JADX INFO: renamed from: g */
        public final byte[] m183768g(String str) throws ParserException {
            byte[] bArr = this.f164168k;
            if (bArr != null) {
                return bArr;
            }
            throw ParserException.createForMalformedContainer("Missing CodecPrivate for codec " + str, null);
        }

        @Nullable
        /* JADX INFO: renamed from: h */
        public final byte[] m183769h() {
            if (this.f164136D == -1.0f || this.f164137E == -1.0f || this.f164138F == -1.0f || this.f164139G == -1.0f || this.f164140H == -1.0f || this.f164141I == -1.0f || this.f164142J == -1.0f || this.f164143K == -1.0f || this.f164144L == -1.0f || this.f164145M == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.putShort((short) ((this.f164136D * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f164137E * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f164138F * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f164139G * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f164140H * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f164141I * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f164142J * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f164143K * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) (this.f164144L + 0.5f));
            byteBufferOrder.putShort((short) (this.f164145M + 0.5f));
            byteBufferOrder.putShort((short) this.f164134B);
            byteBufferOrder.putShort((short) this.f164135C);
            return bArr;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:204:0x03fc  */
        /* JADX WARN: Code duplicated, block: B:209:0x0415  */
        /* JADX WARN: Code duplicated, block: B:210:0x0417  */
        /* JADX WARN: Code duplicated, block: B:213:0x0424  */
        /* JADX WARN: Code duplicated, block: B:214:0x0436  */
        /* JADX WARN: Code duplicated, block: B:216:0x043c  */
        /* JADX WARN: Code duplicated, block: B:218:0x0440  */
        /* JADX WARN: Code duplicated, block: B:220:0x0445  */
        /* JADX WARN: Code duplicated, block: B:223:0x044d  */
        /* JADX WARN: Code duplicated, block: B:225:0x0452  */
        /* JADX WARN: Code duplicated, block: B:228:0x0457  */
        /* JADX WARN: Code duplicated, block: B:231:0x0465  */
        /* JADX WARN: Code duplicated, block: B:234:0x046b  */
        /* JADX WARN: Code duplicated, block: B:237:0x047e  */
        /* JADX WARN: Code duplicated, block: B:242:0x049e  */
        /* JADX WARN: Code duplicated, block: B:248:0x04b7  */
        /* JADX WARN: Code duplicated, block: B:249:0x04b9  */
        /* JADX WARN: Code duplicated, block: B:251:0x04c3  */
        /* JADX WARN: Code duplicated, block: B:252:0x04c6  */
        /* JADX WARN: Code duplicated, block: B:254:0x04d0  */
        /* JADX WARN: Code duplicated, block: B:260:0x04e8  */
        /* JADX WARN: Code duplicated, block: B:262:0x050f  */
        /* JADX WARN: Code duplicated, block: B:264:0x0515  */
        /* JADX WARN: Code duplicated, block: B:280:0x0540  */
        /* JADX WARN: Code duplicated, block: B:4:0x0016  */
        @EnsuresNonNull({"this.output"})
        @RequiresNonNull({"codecId"})
        /* JADX INFO: renamed from: i */
        public void m183770i(uqf uqfVar, int i) throws ParserException {
            byte b;
            List<byte[]> listSingletonList;
            String str;
            int i2;
            List<byte[]> list;
            String str2;
            String str3;
            int i3;
            C1871k.b bVar;
            int i4;
            int iIntValue;
            int i5;
            float f;
            int i6;
            int i7;
            int i8;
            o5e o5eVarM162779a;
            String str4 = this.f164159b;
            str4.getClass();
            int iM197855f0 = 4;
            switch (str4) {
                case "V_MPEG4/ISO/AP":
                    b = 0;
                    break;
                case "V_MPEG4/ISO/SP":
                    b = 1;
                    break;
                case "A_MS/ACM":
                    b = 2;
                    break;
                case "A_TRUEHD":
                    b = 3;
                    break;
                case "A_VORBIS":
                    b = 4;
                    break;
                case "A_MPEG/L2":
                    b = 5;
                    break;
                case "A_MPEG/L3":
                    b = 6;
                    break;
                case "V_MS/VFW/FOURCC":
                    b = 7;
                    break;
                case "S_DVBSUB":
                    b = 8;
                    break;
                case "V_MPEG4/ISO/ASP":
                    b = 9;
                    break;
                case "V_MPEG4/ISO/AVC":
                    b = 10;
                    break;
                case "S_VOBSUB":
                    b = 11;
                    break;
                case "A_DTS/LOSSLESS":
                    b = 12;
                    break;
                case "A_AAC":
                    b = HttpTokens.CARRIAGE_RETURN;
                    break;
                case "A_AC3":
                    b = 14;
                    break;
                case "A_DTS":
                    b = 15;
                    break;
                case "V_AV1":
                    b = 16;
                    break;
                case "V_VP8":
                    b = 17;
                    break;
                case "V_VP9":
                    b = 18;
                    break;
                case "S_HDMV/PGS":
                    b = 19;
                    break;
                case "V_THEORA":
                    b = 20;
                    break;
                case "A_DTS/EXPRESS":
                    b = 21;
                    break;
                case "A_PCM/FLOAT/IEEE":
                    b = 22;
                    break;
                case "A_PCM/INT/BIG":
                    b = 23;
                    break;
                case "A_PCM/INT/LIT":
                    b = 24;
                    break;
                case "S_TEXT/ASS":
                    b = 25;
                    break;
                case "V_MPEGH/ISO/HEVC":
                    b = 26;
                    break;
                case "S_TEXT/WEBVTT":
                    b = 27;
                    break;
                case "S_TEXT/UTF8":
                    b = 28;
                    break;
                case "V_MPEG2":
                    b = 29;
                    break;
                case "A_EAC3":
                    b = 30;
                    break;
                case "A_FLAC":
                    b = 31;
                    break;
                case "A_OPUS":
                    b = 32;
                    break;
                default:
                    b = -1;
                    break;
            }
            String str5 = "audio/raw";
            switch (b) {
                case 0:
                case 1:
                case 9:
                    byte[] bArr = this.f164168k;
                    listSingletonList = bArr == null ? null : Collections.singletonList(bArr);
                    str5 = "video/mp4v-es";
                    str = null;
                    i2 = -1;
                    iM197855f0 = -1;
                    if (this.f164146N != null && (o5eVarM162779a = o5e.m162779a(new d860(this.f164146N))) != null) {
                        str = o5eVarM162779a.f141893c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z = this.f164154V;
                    if (this.f164153U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i9 = i3 | (z ? 1 : 0);
                    bVar = new C1871k.b();
                    if (!n200.m157533o(str3)) {
                        bVar.m10323J(this.f164147O).m10347h0(this.f164149Q).m10340a0(iM197855f0);
                        i4 = 1;
                    } else if (n200.m157537s(str3)) {
                        if (this.f164174q == 0) {
                            i7 = this.f164172o;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.f164170m;
                            }
                            this.f164172o = i7;
                            i8 = this.f164173p;
                            if (i8 == -1) {
                                i8 = this.f164171n;
                            }
                            this.f164173p = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.f164172o;
                        if (i5 != iIntValue || (i6 = this.f164173p) == iIntValue) {
                            f = -1.0f;
                        } else {
                            f = (this.f164171n * i5) / (this.f164170m * i6);
                        }
                        de5 de5Var = this.f164181x ? new de5(this.f164182y, this.f164133A, this.f164183z, m183769h()) : null;
                        if (this.f164158a != null && sex.f164077i0.containsKey(this.f164158a)) {
                            iIntValue = ((Integer) sex.f164077i0.get(this.f164158a)).intValue();
                        }
                        if (this.f164175r == 0 && Float.compare(this.f164176s, 0.0f) == 0 && Float.compare(this.f164177t, 0.0f) == 0) {
                            if (Float.compare(this.f164178u, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f164177t, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f164177t, -180.0f) != 0 || Float.compare(this.f164177t, 180.0f) == 0) {
                                iIntValue = 180;
                            } else if (Float.compare(this.f164177t, -90.0f) == 0) {
                                iIntValue = 270;
                            }
                        }
                        bVar.m10353n0(this.f164170m).m10332S(this.f164171n).m10342c0(f).m10345f0(iIntValue).m10343d0(this.f164179v).m10349j0(this.f164180w).m10325L(de5Var);
                        i4 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3) && !"text/x-ssa".equals(str3) && !"text/vtt".equals(str3) && !"application/vobsub".equals(str3) && !"application/pgs".equals(str3) && !"application/dvbsubs".equals(str3)) {
                            throw ParserException.createForMalformedContainer("Unexpected MIME type.", null);
                        }
                        i4 = 3;
                    }
                    if (this.f164158a != null && !sex.f164077i0.containsKey(this.f164158a)) {
                        bVar.m10336W(this.f164158a);
                    }
                    C1871k c1871kM10320G = bVar.m10333T(i).m10346g0(str3).m10338Y(i2).m10337X(this.f164155W).m10348i0(i9).m10335V(listSingletonList).m10324K(str).m10328O(this.f164169l).m10320G();
                    m6j0 m6j0VarMo11362b = uqfVar.mo11362b(this.f164160c, i4);
                    this.f164156X = m6j0VarMo11362b;
                    m6j0VarMo11362b.mo11110b(c1871kM10320G);
                    return;
                case 2:
                    if (m183765l(new d860(m183768g(this.f164159b)))) {
                        iM197855f0 = vck0.m197855f0(this.f164148P);
                        if (iM197855f0 != 0) {
                            listSingletonList = null;
                            str = null;
                            i2 = -1;
                            if (this.f164146N != null) {
                                str = o5eVarM162779a.f141893c;
                                str5 = "video/dolby-vision";
                            }
                            str3 = str5;
                            boolean z2 = this.f164154V;
                            if (this.f164153U) {
                                i3 = 2;
                            } else {
                                i3 = 0;
                            }
                            int i10 = i3 | (z2 ? 1 : 0);
                            bVar = new C1871k.b();
                            if (!n200.m157533o(str3)) {
                                if (n200.m157537s(str3)) {
                                    if (this.f164174q == 0) {
                                        i7 = this.f164172o;
                                        iIntValue = -1;
                                        if (i7 == -1) {
                                            i7 = this.f164170m;
                                        }
                                        this.f164172o = i7;
                                        i8 = this.f164173p;
                                        if (i8 == -1) {
                                            i8 = this.f164171n;
                                        }
                                        this.f164173p = i8;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    i5 = this.f164172o;
                                    if (i5 != iIntValue) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (this.f164181x) {
                                    }
                                    if (this.f164158a != null) {
                                        iIntValue = ((Integer) sex.f164077i0.get(this.f164158a)).intValue();
                                    }
                                    if (this.f164175r == 0) {
                                        if (Float.compare(this.f164178u, 0.0f) == 0) {
                                            iIntValue = 0;
                                        } else if (Float.compare(this.f164177t, 90.0f) == 0) {
                                            iIntValue = 90;
                                        } else if (Float.compare(this.f164177t, -180.0f) != 0) {
                                            iIntValue = 180;
                                        } else {
                                            iIntValue = 180;
                                        }
                                    }
                                    bVar.m10353n0(this.f164170m).m10332S(this.f164171n).m10342c0(f).m10345f0(iIntValue).m10343d0(this.f164179v).m10349j0(this.f164180w).m10325L(de5Var);
                                    i4 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str3)) {
                                    }
                                    i4 = 3;
                                }
                                break;
                            } else {
                                bVar.m10323J(this.f164147O).m10347h0(this.f164149Q).m10340a0(iM197855f0);
                                i4 = 1;
                            }
                            if (this.f164158a != null) {
                                bVar.m10336W(this.f164158a);
                            }
                            C1871k c1871kM10320G2 = bVar.m10333T(i).m10346g0(str3).m10338Y(i2).m10337X(this.f164155W).m10348i0(i10).m10335V(listSingletonList).m10324K(str).m10328O(this.f164169l).m10320G();
                            m6j0 m6j0VarMo11362b2 = uqfVar.mo11362b(this.f164160c, i4);
                            this.f164156X = m6j0VarMo11362b2;
                            m6j0VarMo11362b2.mo11110b(c1871kM10320G2);
                            return;
                        }
                        jwv.m143689i("MatroskaExtractor", "Unsupported PCM bit depth: " + this.f164148P + ". Setting mimeType to audio/x-unknown");
                    } else {
                        jwv.m143689i("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                    }
                    listSingletonList = null;
                    str = null;
                    str5 = "audio/x-unknown";
                    i2 = -1;
                    iM197855f0 = -1;
                    if (this.f164146N != null) {
                        str = o5eVarM162779a.f141893c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z3 = this.f164154V;
                    if (this.f164153U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i11 = i3 | (z3 ? 1 : 0);
                    bVar = new C1871k.b();
                    if (!n200.m157533o(str3)) {
                        if (n200.m157537s(str3)) {
                            if (this.f164174q == 0) {
                                i7 = this.f164172o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f164170m;
                                }
                                this.f164172o = i7;
                                i8 = this.f164173p;
                                if (i8 == -1) {
                                    i8 = this.f164171n;
                                }
                                this.f164173p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f164172o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f164181x) {
                            }
                            if (this.f164158a != null) {
                                iIntValue = ((Integer) sex.f164077i0.get(this.f164158a)).intValue();
                            }
                            if (this.f164175r == 0) {
                                if (Float.compare(this.f164178u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f164177t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f164177t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10353n0(this.f164170m).m10332S(this.f164171n).m10342c0(f).m10345f0(iIntValue).m10343d0(this.f164179v).m10349j0(this.f164180w).m10325L(de5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10323J(this.f164147O).m10347h0(this.f164149Q).m10340a0(iM197855f0);
                        i4 = 1;
                    }
                    if (this.f164158a != null) {
                        bVar.m10336W(this.f164158a);
                    }
                    C1871k c1871kM10320G3 = bVar.m10333T(i).m10346g0(str3).m10338Y(i2).m10337X(this.f164155W).m10348i0(i11).m10335V(listSingletonList).m10324K(str).m10328O(this.f164169l).m10320G();
                    m6j0 m6j0VarMo11362b3 = uqfVar.mo11362b(this.f164160c, i4);
                    this.f164156X = m6j0VarMo11362b3;
                    m6j0VarMo11362b3.mo11110b(c1871kM10320G3);
                    return;
                case 3:
                    this.f164152T = new yaj0();
                    str5 = "audio/true-hd";
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    iM197855f0 = -1;
                    if (this.f164146N != null) {
                        str = o5eVarM162779a.f141893c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z4 = this.f164154V;
                    if (this.f164153U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i12 = i3 | (z4 ? 1 : 0);
                    bVar = new C1871k.b();
                    if (!n200.m157533o(str3)) {
                        if (n200.m157537s(str3)) {
                            if (this.f164174q == 0) {
                                i7 = this.f164172o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f164170m;
                                }
                                this.f164172o = i7;
                                i8 = this.f164173p;
                                if (i8 == -1) {
                                    i8 = this.f164171n;
                                }
                                this.f164173p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f164172o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f164181x) {
                            }
                            if (this.f164158a != null) {
                                iIntValue = ((Integer) sex.f164077i0.get(this.f164158a)).intValue();
                            }
                            if (this.f164175r == 0) {
                                if (Float.compare(this.f164178u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f164177t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f164177t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10353n0(this.f164170m).m10332S(this.f164171n).m10342c0(f).m10345f0(iIntValue).m10343d0(this.f164179v).m10349j0(this.f164180w).m10325L(de5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10323J(this.f164147O).m10347h0(this.f164149Q).m10340a0(iM197855f0);
                        i4 = 1;
                    }
                    if (this.f164158a != null) {
                        bVar.m10336W(this.f164158a);
                    }
                    C1871k c1871kM10320G4 = bVar.m10333T(i).m10346g0(str3).m10338Y(i2).m10337X(this.f164155W).m10348i0(i12).m10335V(listSingletonList).m10324K(str).m10328O(this.f164169l).m10320G();
                    m6j0 m6j0VarMo11362b4 = uqfVar.mo11362b(this.f164160c, i4);
                    this.f164156X = m6j0VarMo11362b4;
                    m6j0VarMo11362b4.mo11110b(c1871kM10320G4);
                    return;
                case 4:
                    listSingletonList = m183766m(m183768g(this.f164159b));
                    str5 = "audio/vorbis";
                    i2 = 8192;
                    str = null;
                    iM197855f0 = -1;
                    if (this.f164146N != null) {
                        str = o5eVarM162779a.f141893c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z5 = this.f164154V;
                    if (this.f164153U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i13 = i3 | (z5 ? 1 : 0);
                    bVar = new C1871k.b();
                    if (!n200.m157533o(str3)) {
                        if (n200.m157537s(str3)) {
                            if (this.f164174q == 0) {
                                i7 = this.f164172o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f164170m;
                                }
                                this.f164172o = i7;
                                i8 = this.f164173p;
                                if (i8 == -1) {
                                    i8 = this.f164171n;
                                }
                                this.f164173p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f164172o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f164181x) {
                            }
                            if (this.f164158a != null) {
                                iIntValue = ((Integer) sex.f164077i0.get(this.f164158a)).intValue();
                            }
                            if (this.f164175r == 0) {
                                if (Float.compare(this.f164178u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f164177t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f164177t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10353n0(this.f164170m).m10332S(this.f164171n).m10342c0(f).m10345f0(iIntValue).m10343d0(this.f164179v).m10349j0(this.f164180w).m10325L(de5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10323J(this.f164147O).m10347h0(this.f164149Q).m10340a0(iM197855f0);
                        i4 = 1;
                    }
                    if (this.f164158a != null) {
                        bVar.m10336W(this.f164158a);
                    }
                    C1871k c1871kM10320G5 = bVar.m10333T(i).m10346g0(str3).m10338Y(i2).m10337X(this.f164155W).m10348i0(i13).m10335V(listSingletonList).m10324K(str).m10328O(this.f164169l).m10320G();
                    m6j0 m6j0VarMo11362b5 = uqfVar.mo11362b(this.f164160c, i4);
                    this.f164156X = m6j0VarMo11362b5;
                    m6j0VarMo11362b5.mo11110b(c1871kM10320G5);
                    return;
                case 5:
                    str5 = "audio/mpeg-L2";
                    listSingletonList = null;
                    str = null;
                    i2 = 4096;
                    iM197855f0 = -1;
                    if (this.f164146N != null) {
                        str = o5eVarM162779a.f141893c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z6 = this.f164154V;
                    if (this.f164153U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i14 = i3 | (z6 ? 1 : 0);
                    bVar = new C1871k.b();
                    if (!n200.m157533o(str3)) {
                        if (n200.m157537s(str3)) {
                            if (this.f164174q == 0) {
                                i7 = this.f164172o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f164170m;
                                }
                                this.f164172o = i7;
                                i8 = this.f164173p;
                                if (i8 == -1) {
                                    i8 = this.f164171n;
                                }
                                this.f164173p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f164172o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f164181x) {
                            }
                            if (this.f164158a != null) {
                                iIntValue = ((Integer) sex.f164077i0.get(this.f164158a)).intValue();
                            }
                            if (this.f164175r == 0) {
                                if (Float.compare(this.f164178u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f164177t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f164177t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10353n0(this.f164170m).m10332S(this.f164171n).m10342c0(f).m10345f0(iIntValue).m10343d0(this.f164179v).m10349j0(this.f164180w).m10325L(de5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10323J(this.f164147O).m10347h0(this.f164149Q).m10340a0(iM197855f0);
                        i4 = 1;
                    }
                    if (this.f164158a != null) {
                        bVar.m10336W(this.f164158a);
                    }
                    C1871k c1871kM10320G6 = bVar.m10333T(i).m10346g0(str3).m10338Y(i2).m10337X(this.f164155W).m10348i0(i14).m10335V(listSingletonList).m10324K(str).m10328O(this.f164169l).m10320G();
                    m6j0 m6j0VarMo11362b6 = uqfVar.mo11362b(this.f164160c, i4);
                    this.f164156X = m6j0VarMo11362b6;
                    m6j0VarMo11362b6.mo11110b(c1871kM10320G6);
                    return;
                case 6:
                    str5 = DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG;
                    listSingletonList = null;
                    str = null;
                    i2 = 4096;
                    iM197855f0 = -1;
                    if (this.f164146N != null) {
                        str = o5eVarM162779a.f141893c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z7 = this.f164154V;
                    if (this.f164153U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i15 = i3 | (z7 ? 1 : 0);
                    bVar = new C1871k.b();
                    if (!n200.m157533o(str3)) {
                        if (n200.m157537s(str3)) {
                            if (this.f164174q == 0) {
                                i7 = this.f164172o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f164170m;
                                }
                                this.f164172o = i7;
                                i8 = this.f164173p;
                                if (i8 == -1) {
                                    i8 = this.f164171n;
                                }
                                this.f164173p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f164172o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f164181x) {
                            }
                            if (this.f164158a != null) {
                                iIntValue = ((Integer) sex.f164077i0.get(this.f164158a)).intValue();
                            }
                            if (this.f164175r == 0) {
                                if (Float.compare(this.f164178u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f164177t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f164177t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10353n0(this.f164170m).m10332S(this.f164171n).m10342c0(f).m10345f0(iIntValue).m10343d0(this.f164179v).m10349j0(this.f164180w).m10325L(de5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10323J(this.f164147O).m10347h0(this.f164149Q).m10340a0(iM197855f0);
                        i4 = 1;
                    }
                    if (this.f164158a != null) {
                        bVar.m10336W(this.f164158a);
                    }
                    C1871k c1871kM10320G7 = bVar.m10333T(i).m10346g0(str3).m10338Y(i2).m10337X(this.f164155W).m10348i0(i15).m10335V(listSingletonList).m10324K(str).m10328O(this.f164169l).m10320G();
                    m6j0 m6j0VarMo11362b7 = uqfVar.mo11362b(this.f164160c, i4);
                    this.f164156X = m6j0VarMo11362b7;
                    m6j0VarMo11362b7.mo11110b(c1871kM10320G7);
                    return;
                case 7:
                    Pair<String, List<byte[]>> pairM183764k = m183764k(new d860(m183768g(this.f164159b)));
                    str5 = (String) pairM183764k.first;
                    listSingletonList = (List) pairM183764k.second;
                    str = null;
                    i2 = -1;
                    iM197855f0 = -1;
                    if (this.f164146N != null) {
                        str = o5eVarM162779a.f141893c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z8 = this.f164154V;
                    if (this.f164153U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i16 = i3 | (z8 ? 1 : 0);
                    bVar = new C1871k.b();
                    if (!n200.m157533o(str3)) {
                        if (n200.m157537s(str3)) {
                            if (this.f164174q == 0) {
                                i7 = this.f164172o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f164170m;
                                }
                                this.f164172o = i7;
                                i8 = this.f164173p;
                                if (i8 == -1) {
                                    i8 = this.f164171n;
                                }
                                this.f164173p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f164172o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f164181x) {
                            }
                            if (this.f164158a != null) {
                                iIntValue = ((Integer) sex.f164077i0.get(this.f164158a)).intValue();
                            }
                            if (this.f164175r == 0) {
                                if (Float.compare(this.f164178u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f164177t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f164177t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10353n0(this.f164170m).m10332S(this.f164171n).m10342c0(f).m10345f0(iIntValue).m10343d0(this.f164179v).m10349j0(this.f164180w).m10325L(de5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10323J(this.f164147O).m10347h0(this.f164149Q).m10340a0(iM197855f0);
                        i4 = 1;
                    }
                    if (this.f164158a != null) {
                        bVar.m10336W(this.f164158a);
                    }
                    C1871k c1871kM10320G8 = bVar.m10333T(i).m10346g0(str3).m10338Y(i2).m10337X(this.f164155W).m10348i0(i16).m10335V(listSingletonList).m10324K(str).m10328O(this.f164169l).m10320G();
                    m6j0 m6j0VarMo11362b8 = uqfVar.mo11362b(this.f164160c, i4);
                    this.f164156X = m6j0VarMo11362b8;
                    m6j0VarMo11362b8.mo11110b(c1871kM10320G8);
                    return;
                case 8:
                    byte[] bArr2 = new byte[4];
                    System.arraycopy(m183768g(this.f164159b), 0, bArr2, 0, 4);
                    listSingletonList = ImmutableList.m15686of(bArr2);
                    str = null;
                    str5 = "application/dvbsubs";
                    i2 = -1;
                    iM197855f0 = -1;
                    if (this.f164146N != null) {
                        str = o5eVarM162779a.f141893c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z9 = this.f164154V;
                    if (this.f164153U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i17 = i3 | (z9 ? 1 : 0);
                    bVar = new C1871k.b();
                    if (!n200.m157533o(str3)) {
                        if (n200.m157537s(str3)) {
                            if (this.f164174q == 0) {
                                i7 = this.f164172o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f164170m;
                                }
                                this.f164172o = i7;
                                i8 = this.f164173p;
                                if (i8 == -1) {
                                    i8 = this.f164171n;
                                }
                                this.f164173p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f164172o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f164181x) {
                            }
                            if (this.f164158a != null) {
                                iIntValue = ((Integer) sex.f164077i0.get(this.f164158a)).intValue();
                            }
                            if (this.f164175r == 0) {
                                if (Float.compare(this.f164178u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f164177t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f164177t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10353n0(this.f164170m).m10332S(this.f164171n).m10342c0(f).m10345f0(iIntValue).m10343d0(this.f164179v).m10349j0(this.f164180w).m10325L(de5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10323J(this.f164147O).m10347h0(this.f164149Q).m10340a0(iM197855f0);
                        i4 = 1;
                    }
                    if (this.f164158a != null) {
                        bVar.m10336W(this.f164158a);
                    }
                    C1871k c1871kM10320G9 = bVar.m10333T(i).m10346g0(str3).m10338Y(i2).m10337X(this.f164155W).m10348i0(i17).m10335V(listSingletonList).m10324K(str).m10328O(this.f164169l).m10320G();
                    m6j0 m6j0VarMo11362b9 = uqfVar.mo11362b(this.f164160c, i4);
                    this.f164156X = m6j0VarMo11362b9;
                    m6j0VarMo11362b9.mo11110b(c1871kM10320G9);
                    return;
                case 10:
                    ip1 ip1VarM137437b = ip1.m137437b(new d860(m183768g(this.f164159b)));
                    list = ip1VarM137437b.f114242a;
                    this.f164157Y = ip1VarM137437b.f114243b;
                    str2 = ip1VarM137437b.f114250i;
                    str5 = YtVideoEncoder.MIME_TYPE;
                    List<byte[]> list2 = list;
                    str = str2;
                    listSingletonList = list2;
                    i2 = -1;
                    iM197855f0 = -1;
                    if (this.f164146N != null) {
                        str = o5eVarM162779a.f141893c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z10 = this.f164154V;
                    if (this.f164153U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i18 = i3 | (z10 ? 1 : 0);
                    bVar = new C1871k.b();
                    if (!n200.m157533o(str3)) {
                        if (n200.m157537s(str3)) {
                            if (this.f164174q == 0) {
                                i7 = this.f164172o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f164170m;
                                }
                                this.f164172o = i7;
                                i8 = this.f164173p;
                                if (i8 == -1) {
                                    i8 = this.f164171n;
                                }
                                this.f164173p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f164172o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f164181x) {
                            }
                            if (this.f164158a != null) {
                                iIntValue = ((Integer) sex.f164077i0.get(this.f164158a)).intValue();
                            }
                            if (this.f164175r == 0) {
                                if (Float.compare(this.f164178u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f164177t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f164177t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10353n0(this.f164170m).m10332S(this.f164171n).m10342c0(f).m10345f0(iIntValue).m10343d0(this.f164179v).m10349j0(this.f164180w).m10325L(de5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10323J(this.f164147O).m10347h0(this.f164149Q).m10340a0(iM197855f0);
                        i4 = 1;
                    }
                    if (this.f164158a != null) {
                        bVar.m10336W(this.f164158a);
                    }
                    C1871k c1871kM10320G10 = bVar.m10333T(i).m10346g0(str3).m10338Y(i2).m10337X(this.f164155W).m10348i0(i18).m10335V(listSingletonList).m10324K(str).m10328O(this.f164169l).m10320G();
                    m6j0 m6j0VarMo11362b10 = uqfVar.mo11362b(this.f164160c, i4);
                    this.f164156X = m6j0VarMo11362b10;
                    m6j0VarMo11362b10.mo11110b(c1871kM10320G10);
                    return;
                case 11:
                    listSingletonList = ImmutableList.m15686of(m183768g(this.f164159b));
                    str = null;
                    str5 = "application/vobsub";
                    i2 = -1;
                    iM197855f0 = -1;
                    if (this.f164146N != null) {
                        str = o5eVarM162779a.f141893c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z11 = this.f164154V;
                    if (this.f164153U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i19 = i3 | (z11 ? 1 : 0);
                    bVar = new C1871k.b();
                    if (!n200.m157533o(str3)) {
                        if (n200.m157537s(str3)) {
                            if (this.f164174q == 0) {
                                i7 = this.f164172o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f164170m;
                                }
                                this.f164172o = i7;
                                i8 = this.f164173p;
                                if (i8 == -1) {
                                    i8 = this.f164171n;
                                }
                                this.f164173p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f164172o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f164181x) {
                            }
                            if (this.f164158a != null) {
                                iIntValue = ((Integer) sex.f164077i0.get(this.f164158a)).intValue();
                            }
                            if (this.f164175r == 0) {
                                if (Float.compare(this.f164178u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f164177t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f164177t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10353n0(this.f164170m).m10332S(this.f164171n).m10342c0(f).m10345f0(iIntValue).m10343d0(this.f164179v).m10349j0(this.f164180w).m10325L(de5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10323J(this.f164147O).m10347h0(this.f164149Q).m10340a0(iM197855f0);
                        i4 = 1;
                    }
                    if (this.f164158a != null) {
                        bVar.m10336W(this.f164158a);
                    }
                    C1871k c1871kM10320G11 = bVar.m10333T(i).m10346g0(str3).m10338Y(i2).m10337X(this.f164155W).m10348i0(i19).m10335V(listSingletonList).m10324K(str).m10328O(this.f164169l).m10320G();
                    m6j0 m6j0VarMo11362b11 = uqfVar.mo11362b(this.f164160c, i4);
                    this.f164156X = m6j0VarMo11362b11;
                    m6j0VarMo11362b11.mo11110b(c1871kM10320G11);
                    return;
                case 12:
                    str5 = "audio/vnd.dts.hd";
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    iM197855f0 = -1;
                    if (this.f164146N != null) {
                        str = o5eVarM162779a.f141893c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z12 = this.f164154V;
                    if (this.f164153U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i110 = i3 | (z12 ? 1 : 0);
                    bVar = new C1871k.b();
                    if (!n200.m157533o(str3)) {
                        if (n200.m157537s(str3)) {
                            if (this.f164174q == 0) {
                                i7 = this.f164172o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f164170m;
                                }
                                this.f164172o = i7;
                                i8 = this.f164173p;
                                if (i8 == -1) {
                                    i8 = this.f164171n;
                                }
                                this.f164173p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f164172o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f164181x) {
                            }
                            if (this.f164158a != null) {
                                iIntValue = ((Integer) sex.f164077i0.get(this.f164158a)).intValue();
                            }
                            if (this.f164175r == 0) {
                                if (Float.compare(this.f164178u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f164177t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f164177t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10353n0(this.f164170m).m10332S(this.f164171n).m10342c0(f).m10345f0(iIntValue).m10343d0(this.f164179v).m10349j0(this.f164180w).m10325L(de5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10323J(this.f164147O).m10347h0(this.f164149Q).m10340a0(iM197855f0);
                        i4 = 1;
                    }
                    if (this.f164158a != null) {
                        bVar.m10336W(this.f164158a);
                    }
                    C1871k c1871kM10320G12 = bVar.m10333T(i).m10346g0(str3).m10338Y(i2).m10337X(this.f164155W).m10348i0(i110).m10335V(listSingletonList).m10324K(str).m10328O(this.f164169l).m10320G();
                    m6j0 m6j0VarMo11362b12 = uqfVar.mo11362b(this.f164160c, i4);
                    this.f164156X = m6j0VarMo11362b12;
                    m6j0VarMo11362b12.mo11110b(c1871kM10320G12);
                    return;
                case 13:
                    listSingletonList = Collections.singletonList(m183768g(this.f164159b));
                    C21594z1.b bVarM216778f = C21594z1.m216778f(this.f164168k);
                    this.f164149Q = bVarM216778f.f201034a;
                    this.f164147O = bVarM216778f.f201035b;
                    str = bVarM216778f.f201036c;
                    str5 = "audio/mp4a-latm";
                    i2 = -1;
                    iM197855f0 = -1;
                    if (this.f164146N != null) {
                        str = o5eVarM162779a.f141893c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z13 = this.f164154V;
                    if (this.f164153U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i111 = i3 | (z13 ? 1 : 0);
                    bVar = new C1871k.b();
                    if (!n200.m157533o(str3)) {
                        if (n200.m157537s(str3)) {
                            if (this.f164174q == 0) {
                                i7 = this.f164172o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f164170m;
                                }
                                this.f164172o = i7;
                                i8 = this.f164173p;
                                if (i8 == -1) {
                                    i8 = this.f164171n;
                                }
                                this.f164173p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f164172o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f164181x) {
                            }
                            if (this.f164158a != null) {
                                iIntValue = ((Integer) sex.f164077i0.get(this.f164158a)).intValue();
                            }
                            if (this.f164175r == 0) {
                                if (Float.compare(this.f164178u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f164177t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f164177t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10353n0(this.f164170m).m10332S(this.f164171n).m10342c0(f).m10345f0(iIntValue).m10343d0(this.f164179v).m10349j0(this.f164180w).m10325L(de5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10323J(this.f164147O).m10347h0(this.f164149Q).m10340a0(iM197855f0);
                        i4 = 1;
                    }
                    if (this.f164158a != null) {
                        bVar.m10336W(this.f164158a);
                    }
                    C1871k c1871kM10320G13 = bVar.m10333T(i).m10346g0(str3).m10338Y(i2).m10337X(this.f164155W).m10348i0(i111).m10335V(listSingletonList).m10324K(str).m10328O(this.f164169l).m10320G();
                    m6j0 m6j0VarMo11362b13 = uqfVar.mo11362b(this.f164160c, i4);
                    this.f164156X = m6j0VarMo11362b13;
                    m6j0VarMo11362b13.mo11110b(c1871kM10320G13);
                    return;
                case 14:
                    str5 = "audio/ac3";
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    iM197855f0 = -1;
                    if (this.f164146N != null) {
                        str = o5eVarM162779a.f141893c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z14 = this.f164154V;
                    if (this.f164153U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i112 = i3 | (z14 ? 1 : 0);
                    bVar = new C1871k.b();
                    if (!n200.m157533o(str3)) {
                        if (n200.m157537s(str3)) {
                            if (this.f164174q == 0) {
                                i7 = this.f164172o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f164170m;
                                }
                                this.f164172o = i7;
                                i8 = this.f164173p;
                                if (i8 == -1) {
                                    i8 = this.f164171n;
                                }
                                this.f164173p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f164172o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f164181x) {
                            }
                            if (this.f164158a != null) {
                                iIntValue = ((Integer) sex.f164077i0.get(this.f164158a)).intValue();
                            }
                            if (this.f164175r == 0) {
                                if (Float.compare(this.f164178u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f164177t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f164177t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10353n0(this.f164170m).m10332S(this.f164171n).m10342c0(f).m10345f0(iIntValue).m10343d0(this.f164179v).m10349j0(this.f164180w).m10325L(de5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10323J(this.f164147O).m10347h0(this.f164149Q).m10340a0(iM197855f0);
                        i4 = 1;
                    }
                    if (this.f164158a != null) {
                        bVar.m10336W(this.f164158a);
                    }
                    C1871k c1871kM10320G14 = bVar.m10333T(i).m10346g0(str3).m10338Y(i2).m10337X(this.f164155W).m10348i0(i112).m10335V(listSingletonList).m10324K(str).m10328O(this.f164169l).m10320G();
                    m6j0 m6j0VarMo11362b14 = uqfVar.mo11362b(this.f164160c, i4);
                    this.f164156X = m6j0VarMo11362b14;
                    m6j0VarMo11362b14.mo11110b(c1871kM10320G14);
                    return;
                case 15:
                case 21:
                    str5 = "audio/vnd.dts";
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    iM197855f0 = -1;
                    if (this.f164146N != null) {
                        str = o5eVarM162779a.f141893c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z15 = this.f164154V;
                    if (this.f164153U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i113 = i3 | (z15 ? 1 : 0);
                    bVar = new C1871k.b();
                    if (!n200.m157533o(str3)) {
                        if (n200.m157537s(str3)) {
                            if (this.f164174q == 0) {
                                i7 = this.f164172o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f164170m;
                                }
                                this.f164172o = i7;
                                i8 = this.f164173p;
                                if (i8 == -1) {
                                    i8 = this.f164171n;
                                }
                                this.f164173p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f164172o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f164181x) {
                            }
                            if (this.f164158a != null) {
                                iIntValue = ((Integer) sex.f164077i0.get(this.f164158a)).intValue();
                            }
                            if (this.f164175r == 0) {
                                if (Float.compare(this.f164178u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f164177t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f164177t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10353n0(this.f164170m).m10332S(this.f164171n).m10342c0(f).m10345f0(iIntValue).m10343d0(this.f164179v).m10349j0(this.f164180w).m10325L(de5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10323J(this.f164147O).m10347h0(this.f164149Q).m10340a0(iM197855f0);
                        i4 = 1;
                    }
                    if (this.f164158a != null) {
                        bVar.m10336W(this.f164158a);
                    }
                    C1871k c1871kM10320G15 = bVar.m10333T(i).m10346g0(str3).m10338Y(i2).m10337X(this.f164155W).m10348i0(i113).m10335V(listSingletonList).m10324K(str).m10328O(this.f164169l).m10320G();
                    m6j0 m6j0VarMo11362b15 = uqfVar.mo11362b(this.f164160c, i4);
                    this.f164156X = m6j0VarMo11362b15;
                    m6j0VarMo11362b15.mo11110b(c1871kM10320G15);
                    return;
                case 16:
                    str5 = "video/av01";
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    iM197855f0 = -1;
                    if (this.f164146N != null) {
                        str = o5eVarM162779a.f141893c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z16 = this.f164154V;
                    if (this.f164153U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i114 = i3 | (z16 ? 1 : 0);
                    bVar = new C1871k.b();
                    if (!n200.m157533o(str3)) {
                        if (n200.m157537s(str3)) {
                            if (this.f164174q == 0) {
                                i7 = this.f164172o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f164170m;
                                }
                                this.f164172o = i7;
                                i8 = this.f164173p;
                                if (i8 == -1) {
                                    i8 = this.f164171n;
                                }
                                this.f164173p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f164172o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f164181x) {
                            }
                            if (this.f164158a != null) {
                                iIntValue = ((Integer) sex.f164077i0.get(this.f164158a)).intValue();
                            }
                            if (this.f164175r == 0) {
                                if (Float.compare(this.f164178u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f164177t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f164177t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10353n0(this.f164170m).m10332S(this.f164171n).m10342c0(f).m10345f0(iIntValue).m10343d0(this.f164179v).m10349j0(this.f164180w).m10325L(de5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10323J(this.f164147O).m10347h0(this.f164149Q).m10340a0(iM197855f0);
                        i4 = 1;
                    }
                    if (this.f164158a != null) {
                        bVar.m10336W(this.f164158a);
                    }
                    C1871k c1871kM10320G16 = bVar.m10333T(i).m10346g0(str3).m10338Y(i2).m10337X(this.f164155W).m10348i0(i114).m10335V(listSingletonList).m10324K(str).m10328O(this.f164169l).m10320G();
                    m6j0 m6j0VarMo11362b16 = uqfVar.mo11362b(this.f164160c, i4);
                    this.f164156X = m6j0VarMo11362b16;
                    m6j0VarMo11362b16.mo11110b(c1871kM10320G16);
                    return;
                case 17:
                    str5 = "video/x-vnd.on2.vp8";
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    iM197855f0 = -1;
                    if (this.f164146N != null) {
                        str = o5eVarM162779a.f141893c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z17 = this.f164154V;
                    if (this.f164153U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i115 = i3 | (z17 ? 1 : 0);
                    bVar = new C1871k.b();
                    if (!n200.m157533o(str3)) {
                        if (n200.m157537s(str3)) {
                            if (this.f164174q == 0) {
                                i7 = this.f164172o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f164170m;
                                }
                                this.f164172o = i7;
                                i8 = this.f164173p;
                                if (i8 == -1) {
                                    i8 = this.f164171n;
                                }
                                this.f164173p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f164172o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f164181x) {
                            }
                            if (this.f164158a != null) {
                                iIntValue = ((Integer) sex.f164077i0.get(this.f164158a)).intValue();
                            }
                            if (this.f164175r == 0) {
                                if (Float.compare(this.f164178u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f164177t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f164177t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10353n0(this.f164170m).m10332S(this.f164171n).m10342c0(f).m10345f0(iIntValue).m10343d0(this.f164179v).m10349j0(this.f164180w).m10325L(de5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10323J(this.f164147O).m10347h0(this.f164149Q).m10340a0(iM197855f0);
                        i4 = 1;
                    }
                    if (this.f164158a != null) {
                        bVar.m10336W(this.f164158a);
                    }
                    C1871k c1871kM10320G17 = bVar.m10333T(i).m10346g0(str3).m10338Y(i2).m10337X(this.f164155W).m10348i0(i115).m10335V(listSingletonList).m10324K(str).m10328O(this.f164169l).m10320G();
                    m6j0 m6j0VarMo11362b17 = uqfVar.mo11362b(this.f164160c, i4);
                    this.f164156X = m6j0VarMo11362b17;
                    m6j0VarMo11362b17.mo11110b(c1871kM10320G17);
                    return;
                case 18:
                    str5 = "video/x-vnd.on2.vp9";
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    iM197855f0 = -1;
                    if (this.f164146N != null) {
                        str = o5eVarM162779a.f141893c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z18 = this.f164154V;
                    if (this.f164153U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i116 = i3 | (z18 ? 1 : 0);
                    bVar = new C1871k.b();
                    if (!n200.m157533o(str3)) {
                        if (n200.m157537s(str3)) {
                            if (this.f164174q == 0) {
                                i7 = this.f164172o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f164170m;
                                }
                                this.f164172o = i7;
                                i8 = this.f164173p;
                                if (i8 == -1) {
                                    i8 = this.f164171n;
                                }
                                this.f164173p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f164172o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f164181x) {
                            }
                            if (this.f164158a != null) {
                                iIntValue = ((Integer) sex.f164077i0.get(this.f164158a)).intValue();
                            }
                            if (this.f164175r == 0) {
                                if (Float.compare(this.f164178u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f164177t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f164177t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10353n0(this.f164170m).m10332S(this.f164171n).m10342c0(f).m10345f0(iIntValue).m10343d0(this.f164179v).m10349j0(this.f164180w).m10325L(de5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10323J(this.f164147O).m10347h0(this.f164149Q).m10340a0(iM197855f0);
                        i4 = 1;
                    }
                    if (this.f164158a != null) {
                        bVar.m10336W(this.f164158a);
                    }
                    C1871k c1871kM10320G18 = bVar.m10333T(i).m10346g0(str3).m10338Y(i2).m10337X(this.f164155W).m10348i0(i116).m10335V(listSingletonList).m10324K(str).m10328O(this.f164169l).m10320G();
                    m6j0 m6j0VarMo11362b18 = uqfVar.mo11362b(this.f164160c, i4);
                    this.f164156X = m6j0VarMo11362b18;
                    m6j0VarMo11362b18.mo11110b(c1871kM10320G18);
                    return;
                case 19:
                    listSingletonList = null;
                    str = null;
                    str5 = "application/pgs";
                    i2 = -1;
                    iM197855f0 = -1;
                    if (this.f164146N != null) {
                        str = o5eVarM162779a.f141893c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z19 = this.f164154V;
                    if (this.f164153U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i117 = i3 | (z19 ? 1 : 0);
                    bVar = new C1871k.b();
                    if (!n200.m157533o(str3)) {
                        if (n200.m157537s(str3)) {
                            if (this.f164174q == 0) {
                                i7 = this.f164172o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f164170m;
                                }
                                this.f164172o = i7;
                                i8 = this.f164173p;
                                if (i8 == -1) {
                                    i8 = this.f164171n;
                                }
                                this.f164173p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f164172o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f164181x) {
                            }
                            if (this.f164158a != null) {
                                iIntValue = ((Integer) sex.f164077i0.get(this.f164158a)).intValue();
                            }
                            if (this.f164175r == 0) {
                                if (Float.compare(this.f164178u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f164177t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f164177t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10353n0(this.f164170m).m10332S(this.f164171n).m10342c0(f).m10345f0(iIntValue).m10343d0(this.f164179v).m10349j0(this.f164180w).m10325L(de5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10323J(this.f164147O).m10347h0(this.f164149Q).m10340a0(iM197855f0);
                        i4 = 1;
                    }
                    if (this.f164158a != null) {
                        bVar.m10336W(this.f164158a);
                    }
                    C1871k c1871kM10320G19 = bVar.m10333T(i).m10346g0(str3).m10338Y(i2).m10337X(this.f164155W).m10348i0(i117).m10335V(listSingletonList).m10324K(str).m10328O(this.f164169l).m10320G();
                    m6j0 m6j0VarMo11362b19 = uqfVar.mo11362b(this.f164160c, i4);
                    this.f164156X = m6j0VarMo11362b19;
                    m6j0VarMo11362b19.mo11110b(c1871kM10320G19);
                    return;
                case 20:
                    str5 = "video/x-unknown";
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    iM197855f0 = -1;
                    if (this.f164146N != null) {
                        str = o5eVarM162779a.f141893c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z110 = this.f164154V;
                    if (this.f164153U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i118 = i3 | (z110 ? 1 : 0);
                    bVar = new C1871k.b();
                    if (!n200.m157533o(str3)) {
                        if (n200.m157537s(str3)) {
                            if (this.f164174q == 0) {
                                i7 = this.f164172o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f164170m;
                                }
                                this.f164172o = i7;
                                i8 = this.f164173p;
                                if (i8 == -1) {
                                    i8 = this.f164171n;
                                }
                                this.f164173p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f164172o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f164181x) {
                            }
                            if (this.f164158a != null) {
                                iIntValue = ((Integer) sex.f164077i0.get(this.f164158a)).intValue();
                            }
                            if (this.f164175r == 0) {
                                if (Float.compare(this.f164178u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f164177t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f164177t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10353n0(this.f164170m).m10332S(this.f164171n).m10342c0(f).m10345f0(iIntValue).m10343d0(this.f164179v).m10349j0(this.f164180w).m10325L(de5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10323J(this.f164147O).m10347h0(this.f164149Q).m10340a0(iM197855f0);
                        i4 = 1;
                    }
                    if (this.f164158a != null) {
                        bVar.m10336W(this.f164158a);
                    }
                    C1871k c1871kM10320G110 = bVar.m10333T(i).m10346g0(str3).m10338Y(i2).m10337X(this.f164155W).m10348i0(i118).m10335V(listSingletonList).m10324K(str).m10328O(this.f164169l).m10320G();
                    m6j0 m6j0VarMo11362b110 = uqfVar.mo11362b(this.f164160c, i4);
                    this.f164156X = m6j0VarMo11362b110;
                    m6j0VarMo11362b110.mo11110b(c1871kM10320G110);
                    return;
                case 22:
                    if (this.f164148P != 32) {
                        jwv.m143689i("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + this.f164148P + ". Setting mimeType to audio/x-unknown");
                        listSingletonList = null;
                        str = null;
                        str5 = "audio/x-unknown";
                        i2 = -1;
                        iM197855f0 = -1;
                        if (this.f164146N != null) {
                            str = o5eVarM162779a.f141893c;
                            str5 = "video/dolby-vision";
                        }
                        str3 = str5;
                        boolean z111 = this.f164154V;
                        if (this.f164153U) {
                            i3 = 2;
                        } else {
                            i3 = 0;
                        }
                        int i119 = i3 | (z111 ? 1 : 0);
                        bVar = new C1871k.b();
                        if (!n200.m157533o(str3)) {
                            if (n200.m157537s(str3)) {
                                if (this.f164174q == 0) {
                                    i7 = this.f164172o;
                                    iIntValue = -1;
                                    if (i7 == -1) {
                                        i7 = this.f164170m;
                                    }
                                    this.f164172o = i7;
                                    i8 = this.f164173p;
                                    if (i8 == -1) {
                                        i8 = this.f164171n;
                                    }
                                    this.f164173p = i8;
                                } else {
                                    iIntValue = -1;
                                }
                                i5 = this.f164172o;
                                if (i5 != iIntValue) {
                                    f = -1.0f;
                                } else {
                                    f = -1.0f;
                                }
                                if (this.f164181x) {
                                }
                                if (this.f164158a != null) {
                                    iIntValue = ((Integer) sex.f164077i0.get(this.f164158a)).intValue();
                                }
                                if (this.f164175r == 0) {
                                    if (Float.compare(this.f164178u, 0.0f) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(this.f164177t, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(this.f164177t, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                bVar.m10353n0(this.f164170m).m10332S(this.f164171n).m10342c0(f).m10345f0(iIntValue).m10343d0(this.f164179v).m10349j0(this.f164180w).m10325L(de5Var);
                                i4 = 2;
                            } else {
                                if ("application/x-subrip".equals(str3)) {
                                }
                                i4 = 3;
                            }
                            break;
                        } else {
                            bVar.m10323J(this.f164147O).m10347h0(this.f164149Q).m10340a0(iM197855f0);
                            i4 = 1;
                        }
                        if (this.f164158a != null) {
                            bVar.m10336W(this.f164158a);
                        }
                        C1871k c1871kM10320G111 = bVar.m10333T(i).m10346g0(str3).m10338Y(i2).m10337X(this.f164155W).m10348i0(i119).m10335V(listSingletonList).m10324K(str).m10328O(this.f164169l).m10320G();
                        m6j0 m6j0VarMo11362b111 = uqfVar.mo11362b(this.f164160c, i4);
                        this.f164156X = m6j0VarMo11362b111;
                        m6j0VarMo11362b111.mo11110b(c1871kM10320G111);
                        return;
                    }
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    if (this.f164146N != null) {
                        str = o5eVarM162779a.f141893c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z112 = this.f164154V;
                    if (this.f164153U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i1110 = i3 | (z112 ? 1 : 0);
                    bVar = new C1871k.b();
                    if (!n200.m157533o(str3)) {
                        if (n200.m157537s(str3)) {
                            if (this.f164174q == 0) {
                                i7 = this.f164172o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f164170m;
                                }
                                this.f164172o = i7;
                                i8 = this.f164173p;
                                if (i8 == -1) {
                                    i8 = this.f164171n;
                                }
                                this.f164173p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f164172o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f164181x) {
                            }
                            if (this.f164158a != null) {
                                iIntValue = ((Integer) sex.f164077i0.get(this.f164158a)).intValue();
                            }
                            if (this.f164175r == 0) {
                                if (Float.compare(this.f164178u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f164177t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f164177t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10353n0(this.f164170m).m10332S(this.f164171n).m10342c0(f).m10345f0(iIntValue).m10343d0(this.f164179v).m10349j0(this.f164180w).m10325L(de5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10323J(this.f164147O).m10347h0(this.f164149Q).m10340a0(iM197855f0);
                        i4 = 1;
                    }
                    if (this.f164158a != null) {
                        bVar.m10336W(this.f164158a);
                    }
                    C1871k c1871kM10320G112 = bVar.m10333T(i).m10346g0(str3).m10338Y(i2).m10337X(this.f164155W).m10348i0(i1110).m10335V(listSingletonList).m10324K(str).m10328O(this.f164169l).m10320G();
                    m6j0 m6j0VarMo11362b112 = uqfVar.mo11362b(this.f164160c, i4);
                    this.f164156X = m6j0VarMo11362b112;
                    m6j0VarMo11362b112.mo11110b(c1871kM10320G112);
                    return;
                case 23:
                    int i20 = this.f164148P;
                    if (i20 == 8) {
                        iM197855f0 = 3;
                    } else {
                        if (i20 != 16) {
                            jwv.m143689i("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + this.f164148P + ". Setting mimeType to audio/x-unknown");
                            listSingletonList = null;
                            str = null;
                            str5 = "audio/x-unknown";
                            i2 = -1;
                            iM197855f0 = -1;
                            if (this.f164146N != null) {
                                str = o5eVarM162779a.f141893c;
                                str5 = "video/dolby-vision";
                            }
                            str3 = str5;
                            boolean z113 = this.f164154V;
                            if (this.f164153U) {
                                i3 = 2;
                            } else {
                                i3 = 0;
                            }
                            int i1111 = i3 | (z113 ? 1 : 0);
                            bVar = new C1871k.b();
                            if (!n200.m157533o(str3)) {
                                if (n200.m157537s(str3)) {
                                    if (this.f164174q == 0) {
                                        i7 = this.f164172o;
                                        iIntValue = -1;
                                        if (i7 == -1) {
                                            i7 = this.f164170m;
                                        }
                                        this.f164172o = i7;
                                        i8 = this.f164173p;
                                        if (i8 == -1) {
                                            i8 = this.f164171n;
                                        }
                                        this.f164173p = i8;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    i5 = this.f164172o;
                                    if (i5 != iIntValue) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (this.f164181x) {
                                    }
                                    if (this.f164158a != null) {
                                        iIntValue = ((Integer) sex.f164077i0.get(this.f164158a)).intValue();
                                    }
                                    if (this.f164175r == 0) {
                                        if (Float.compare(this.f164178u, 0.0f) == 0) {
                                            iIntValue = 0;
                                        } else if (Float.compare(this.f164177t, 90.0f) == 0) {
                                            iIntValue = 90;
                                        } else if (Float.compare(this.f164177t, -180.0f) != 0) {
                                            iIntValue = 180;
                                        } else {
                                            iIntValue = 180;
                                        }
                                    }
                                    bVar.m10353n0(this.f164170m).m10332S(this.f164171n).m10342c0(f).m10345f0(iIntValue).m10343d0(this.f164179v).m10349j0(this.f164180w).m10325L(de5Var);
                                    i4 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str3)) {
                                    }
                                    i4 = 3;
                                }
                                break;
                            } else {
                                bVar.m10323J(this.f164147O).m10347h0(this.f164149Q).m10340a0(iM197855f0);
                                i4 = 1;
                            }
                            if (this.f164158a != null) {
                                bVar.m10336W(this.f164158a);
                            }
                            C1871k c1871kM10320G113 = bVar.m10333T(i).m10346g0(str3).m10338Y(i2).m10337X(this.f164155W).m10348i0(i1111).m10335V(listSingletonList).m10324K(str).m10328O(this.f164169l).m10320G();
                            m6j0 m6j0VarMo11362b113 = uqfVar.mo11362b(this.f164160c, i4);
                            this.f164156X = m6j0VarMo11362b113;
                            m6j0VarMo11362b113.mo11110b(c1871kM10320G113);
                            return;
                        }
                        iM197855f0 = 268435456;
                    }
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    if (this.f164146N != null) {
                        str = o5eVarM162779a.f141893c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z114 = this.f164154V;
                    if (this.f164153U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i1112 = i3 | (z114 ? 1 : 0);
                    bVar = new C1871k.b();
                    if (!n200.m157533o(str3)) {
                        if (n200.m157537s(str3)) {
                            if (this.f164174q == 0) {
                                i7 = this.f164172o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f164170m;
                                }
                                this.f164172o = i7;
                                i8 = this.f164173p;
                                if (i8 == -1) {
                                    i8 = this.f164171n;
                                }
                                this.f164173p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f164172o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f164181x) {
                            }
                            if (this.f164158a != null) {
                                iIntValue = ((Integer) sex.f164077i0.get(this.f164158a)).intValue();
                            }
                            if (this.f164175r == 0) {
                                if (Float.compare(this.f164178u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f164177t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f164177t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10353n0(this.f164170m).m10332S(this.f164171n).m10342c0(f).m10345f0(iIntValue).m10343d0(this.f164179v).m10349j0(this.f164180w).m10325L(de5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10323J(this.f164147O).m10347h0(this.f164149Q).m10340a0(iM197855f0);
                        i4 = 1;
                    }
                    if (this.f164158a != null) {
                        bVar.m10336W(this.f164158a);
                    }
                    C1871k c1871kM10320G114 = bVar.m10333T(i).m10346g0(str3).m10338Y(i2).m10337X(this.f164155W).m10348i0(i1112).m10335V(listSingletonList).m10324K(str).m10328O(this.f164169l).m10320G();
                    m6j0 m6j0VarMo11362b114 = uqfVar.mo11362b(this.f164160c, i4);
                    this.f164156X = m6j0VarMo11362b114;
                    m6j0VarMo11362b114.mo11110b(c1871kM10320G114);
                    return;
                case 24:
                    iM197855f0 = vck0.m197855f0(this.f164148P);
                    if (iM197855f0 == 0) {
                        jwv.m143689i("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + this.f164148P + ". Setting mimeType to audio/x-unknown");
                        listSingletonList = null;
                        str = null;
                        str5 = "audio/x-unknown";
                        i2 = -1;
                        iM197855f0 = -1;
                        if (this.f164146N != null) {
                            str = o5eVarM162779a.f141893c;
                            str5 = "video/dolby-vision";
                        }
                        str3 = str5;
                        boolean z115 = this.f164154V;
                        if (this.f164153U) {
                            i3 = 2;
                        } else {
                            i3 = 0;
                        }
                        int i1113 = i3 | (z115 ? 1 : 0);
                        bVar = new C1871k.b();
                        if (!n200.m157533o(str3)) {
                            if (n200.m157537s(str3)) {
                                if (this.f164174q == 0) {
                                    i7 = this.f164172o;
                                    iIntValue = -1;
                                    if (i7 == -1) {
                                        i7 = this.f164170m;
                                    }
                                    this.f164172o = i7;
                                    i8 = this.f164173p;
                                    if (i8 == -1) {
                                        i8 = this.f164171n;
                                    }
                                    this.f164173p = i8;
                                } else {
                                    iIntValue = -1;
                                }
                                i5 = this.f164172o;
                                if (i5 != iIntValue) {
                                    f = -1.0f;
                                } else {
                                    f = -1.0f;
                                }
                                if (this.f164181x) {
                                }
                                if (this.f164158a != null) {
                                    iIntValue = ((Integer) sex.f164077i0.get(this.f164158a)).intValue();
                                }
                                if (this.f164175r == 0) {
                                    if (Float.compare(this.f164178u, 0.0f) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(this.f164177t, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(this.f164177t, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                bVar.m10353n0(this.f164170m).m10332S(this.f164171n).m10342c0(f).m10345f0(iIntValue).m10343d0(this.f164179v).m10349j0(this.f164180w).m10325L(de5Var);
                                i4 = 2;
                            } else {
                                if ("application/x-subrip".equals(str3)) {
                                }
                                i4 = 3;
                            }
                            break;
                        } else {
                            bVar.m10323J(this.f164147O).m10347h0(this.f164149Q).m10340a0(iM197855f0);
                            i4 = 1;
                        }
                        if (this.f164158a != null) {
                            bVar.m10336W(this.f164158a);
                        }
                        C1871k c1871kM10320G115 = bVar.m10333T(i).m10346g0(str3).m10338Y(i2).m10337X(this.f164155W).m10348i0(i1113).m10335V(listSingletonList).m10324K(str).m10328O(this.f164169l).m10320G();
                        m6j0 m6j0VarMo11362b115 = uqfVar.mo11362b(this.f164160c, i4);
                        this.f164156X = m6j0VarMo11362b115;
                        m6j0VarMo11362b115.mo11110b(c1871kM10320G115);
                        return;
                    }
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    if (this.f164146N != null) {
                        str = o5eVarM162779a.f141893c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z116 = this.f164154V;
                    if (this.f164153U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i1114 = i3 | (z116 ? 1 : 0);
                    bVar = new C1871k.b();
                    if (!n200.m157533o(str3)) {
                        if (n200.m157537s(str3)) {
                            if (this.f164174q == 0) {
                                i7 = this.f164172o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f164170m;
                                }
                                this.f164172o = i7;
                                i8 = this.f164173p;
                                if (i8 == -1) {
                                    i8 = this.f164171n;
                                }
                                this.f164173p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f164172o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f164181x) {
                            }
                            if (this.f164158a != null) {
                                iIntValue = ((Integer) sex.f164077i0.get(this.f164158a)).intValue();
                            }
                            if (this.f164175r == 0) {
                                if (Float.compare(this.f164178u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f164177t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f164177t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10353n0(this.f164170m).m10332S(this.f164171n).m10342c0(f).m10345f0(iIntValue).m10343d0(this.f164179v).m10349j0(this.f164180w).m10325L(de5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10323J(this.f164147O).m10347h0(this.f164149Q).m10340a0(iM197855f0);
                        i4 = 1;
                    }
                    if (this.f164158a != null) {
                        bVar.m10336W(this.f164158a);
                    }
                    C1871k c1871kM10320G116 = bVar.m10333T(i).m10346g0(str3).m10338Y(i2).m10337X(this.f164155W).m10348i0(i1114).m10335V(listSingletonList).m10324K(str).m10328O(this.f164169l).m10320G();
                    m6j0 m6j0VarMo11362b116 = uqfVar.mo11362b(this.f164160c, i4);
                    this.f164156X = m6j0VarMo11362b116;
                    m6j0VarMo11362b116.mo11110b(c1871kM10320G116);
                    return;
                case 25:
                    listSingletonList = ImmutableList.m15687of(sex.f164073e0, m183768g(this.f164159b));
                    str = null;
                    str5 = "text/x-ssa";
                    i2 = -1;
                    iM197855f0 = -1;
                    if (this.f164146N != null) {
                        str = o5eVarM162779a.f141893c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z117 = this.f164154V;
                    if (this.f164153U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i1115 = i3 | (z117 ? 1 : 0);
                    bVar = new C1871k.b();
                    if (!n200.m157533o(str3)) {
                        if (n200.m157537s(str3)) {
                            if (this.f164174q == 0) {
                                i7 = this.f164172o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f164170m;
                                }
                                this.f164172o = i7;
                                i8 = this.f164173p;
                                if (i8 == -1) {
                                    i8 = this.f164171n;
                                }
                                this.f164173p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f164172o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f164181x) {
                            }
                            if (this.f164158a != null) {
                                iIntValue = ((Integer) sex.f164077i0.get(this.f164158a)).intValue();
                            }
                            if (this.f164175r == 0) {
                                if (Float.compare(this.f164178u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f164177t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f164177t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10353n0(this.f164170m).m10332S(this.f164171n).m10342c0(f).m10345f0(iIntValue).m10343d0(this.f164179v).m10349j0(this.f164180w).m10325L(de5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10323J(this.f164147O).m10347h0(this.f164149Q).m10340a0(iM197855f0);
                        i4 = 1;
                    }
                    if (this.f164158a != null) {
                        bVar.m10336W(this.f164158a);
                    }
                    C1871k c1871kM10320G117 = bVar.m10333T(i).m10346g0(str3).m10338Y(i2).m10337X(this.f164155W).m10348i0(i1115).m10335V(listSingletonList).m10324K(str).m10328O(this.f164169l).m10320G();
                    m6j0 m6j0VarMo11362b117 = uqfVar.mo11362b(this.f164160c, i4);
                    this.f164156X = m6j0VarMo11362b117;
                    m6j0VarMo11362b117.mo11110b(c1871kM10320G117);
                    return;
                case 26:
                    ozk ozkVarM166888a = ozk.m166888a(new d860(m183768g(this.f164159b)));
                    list = ozkVarM166888a.f146474a;
                    this.f164157Y = ozkVarM166888a.f146475b;
                    str2 = ozkVarM166888a.f146482i;
                    str5 = "video/hevc";
                    List<byte[]> list3 = list;
                    str = str2;
                    listSingletonList = list3;
                    i2 = -1;
                    iM197855f0 = -1;
                    if (this.f164146N != null) {
                        str = o5eVarM162779a.f141893c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z118 = this.f164154V;
                    if (this.f164153U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i1116 = i3 | (z118 ? 1 : 0);
                    bVar = new C1871k.b();
                    if (!n200.m157533o(str3)) {
                        if (n200.m157537s(str3)) {
                            if (this.f164174q == 0) {
                                i7 = this.f164172o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f164170m;
                                }
                                this.f164172o = i7;
                                i8 = this.f164173p;
                                if (i8 == -1) {
                                    i8 = this.f164171n;
                                }
                                this.f164173p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f164172o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f164181x) {
                            }
                            if (this.f164158a != null) {
                                iIntValue = ((Integer) sex.f164077i0.get(this.f164158a)).intValue();
                            }
                            if (this.f164175r == 0) {
                                if (Float.compare(this.f164178u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f164177t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f164177t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10353n0(this.f164170m).m10332S(this.f164171n).m10342c0(f).m10345f0(iIntValue).m10343d0(this.f164179v).m10349j0(this.f164180w).m10325L(de5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10323J(this.f164147O).m10347h0(this.f164149Q).m10340a0(iM197855f0);
                        i4 = 1;
                    }
                    if (this.f164158a != null) {
                        bVar.m10336W(this.f164158a);
                    }
                    C1871k c1871kM10320G118 = bVar.m10333T(i).m10346g0(str3).m10338Y(i2).m10337X(this.f164155W).m10348i0(i1116).m10335V(listSingletonList).m10324K(str).m10328O(this.f164169l).m10320G();
                    m6j0 m6j0VarMo11362b118 = uqfVar.mo11362b(this.f164160c, i4);
                    this.f164156X = m6j0VarMo11362b118;
                    m6j0VarMo11362b118.mo11110b(c1871kM10320G118);
                    return;
                case 27:
                    str5 = "text/vtt";
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    iM197855f0 = -1;
                    if (this.f164146N != null) {
                        str = o5eVarM162779a.f141893c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z119 = this.f164154V;
                    if (this.f164153U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i1117 = i3 | (z119 ? 1 : 0);
                    bVar = new C1871k.b();
                    if (!n200.m157533o(str3)) {
                        if (n200.m157537s(str3)) {
                            if (this.f164174q == 0) {
                                i7 = this.f164172o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f164170m;
                                }
                                this.f164172o = i7;
                                i8 = this.f164173p;
                                if (i8 == -1) {
                                    i8 = this.f164171n;
                                }
                                this.f164173p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f164172o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f164181x) {
                            }
                            if (this.f164158a != null) {
                                iIntValue = ((Integer) sex.f164077i0.get(this.f164158a)).intValue();
                            }
                            if (this.f164175r == 0) {
                                if (Float.compare(this.f164178u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f164177t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f164177t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10353n0(this.f164170m).m10332S(this.f164171n).m10342c0(f).m10345f0(iIntValue).m10343d0(this.f164179v).m10349j0(this.f164180w).m10325L(de5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10323J(this.f164147O).m10347h0(this.f164149Q).m10340a0(iM197855f0);
                        i4 = 1;
                    }
                    if (this.f164158a != null) {
                        bVar.m10336W(this.f164158a);
                    }
                    C1871k c1871kM10320G119 = bVar.m10333T(i).m10346g0(str3).m10338Y(i2).m10337X(this.f164155W).m10348i0(i1117).m10335V(listSingletonList).m10324K(str).m10328O(this.f164169l).m10320G();
                    m6j0 m6j0VarMo11362b119 = uqfVar.mo11362b(this.f164160c, i4);
                    this.f164156X = m6j0VarMo11362b119;
                    m6j0VarMo11362b119.mo11110b(c1871kM10320G119);
                    return;
                case 28:
                    str5 = "application/x-subrip";
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    iM197855f0 = -1;
                    if (this.f164146N != null) {
                        str = o5eVarM162779a.f141893c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z1110 = this.f164154V;
                    if (this.f164153U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i1118 = i3 | (z1110 ? 1 : 0);
                    bVar = new C1871k.b();
                    if (!n200.m157533o(str3)) {
                        if (n200.m157537s(str3)) {
                            if (this.f164174q == 0) {
                                i7 = this.f164172o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f164170m;
                                }
                                this.f164172o = i7;
                                i8 = this.f164173p;
                                if (i8 == -1) {
                                    i8 = this.f164171n;
                                }
                                this.f164173p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f164172o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f164181x) {
                            }
                            if (this.f164158a != null) {
                                iIntValue = ((Integer) sex.f164077i0.get(this.f164158a)).intValue();
                            }
                            if (this.f164175r == 0) {
                                if (Float.compare(this.f164178u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f164177t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f164177t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10353n0(this.f164170m).m10332S(this.f164171n).m10342c0(f).m10345f0(iIntValue).m10343d0(this.f164179v).m10349j0(this.f164180w).m10325L(de5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10323J(this.f164147O).m10347h0(this.f164149Q).m10340a0(iM197855f0);
                        i4 = 1;
                    }
                    if (this.f164158a != null) {
                        bVar.m10336W(this.f164158a);
                    }
                    C1871k c1871kM10320G1110 = bVar.m10333T(i).m10346g0(str3).m10338Y(i2).m10337X(this.f164155W).m10348i0(i1118).m10335V(listSingletonList).m10324K(str).m10328O(this.f164169l).m10320G();
                    m6j0 m6j0VarMo11362b1110 = uqfVar.mo11362b(this.f164160c, i4);
                    this.f164156X = m6j0VarMo11362b1110;
                    m6j0VarMo11362b1110.mo11110b(c1871kM10320G1110);
                    return;
                case 29:
                    str5 = "video/mpeg2";
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    iM197855f0 = -1;
                    if (this.f164146N != null) {
                        str = o5eVarM162779a.f141893c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z1111 = this.f164154V;
                    if (this.f164153U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i1119 = i3 | (z1111 ? 1 : 0);
                    bVar = new C1871k.b();
                    if (!n200.m157533o(str3)) {
                        if (n200.m157537s(str3)) {
                            if (this.f164174q == 0) {
                                i7 = this.f164172o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f164170m;
                                }
                                this.f164172o = i7;
                                i8 = this.f164173p;
                                if (i8 == -1) {
                                    i8 = this.f164171n;
                                }
                                this.f164173p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f164172o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f164181x) {
                            }
                            if (this.f164158a != null) {
                                iIntValue = ((Integer) sex.f164077i0.get(this.f164158a)).intValue();
                            }
                            if (this.f164175r == 0) {
                                if (Float.compare(this.f164178u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f164177t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f164177t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10353n0(this.f164170m).m10332S(this.f164171n).m10342c0(f).m10345f0(iIntValue).m10343d0(this.f164179v).m10349j0(this.f164180w).m10325L(de5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10323J(this.f164147O).m10347h0(this.f164149Q).m10340a0(iM197855f0);
                        i4 = 1;
                    }
                    if (this.f164158a != null) {
                        bVar.m10336W(this.f164158a);
                    }
                    C1871k c1871kM10320G1111 = bVar.m10333T(i).m10346g0(str3).m10338Y(i2).m10337X(this.f164155W).m10348i0(i1119).m10335V(listSingletonList).m10324K(str).m10328O(this.f164169l).m10320G();
                    m6j0 m6j0VarMo11362b1111 = uqfVar.mo11362b(this.f164160c, i4);
                    this.f164156X = m6j0VarMo11362b1111;
                    m6j0VarMo11362b1111.mo11110b(c1871kM10320G1111);
                    return;
                case 30:
                    str5 = "audio/eac3";
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    iM197855f0 = -1;
                    if (this.f164146N != null) {
                        str = o5eVarM162779a.f141893c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z1112 = this.f164154V;
                    if (this.f164153U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i11110 = i3 | (z1112 ? 1 : 0);
                    bVar = new C1871k.b();
                    if (!n200.m157533o(str3)) {
                        if (n200.m157537s(str3)) {
                            if (this.f164174q == 0) {
                                i7 = this.f164172o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f164170m;
                                }
                                this.f164172o = i7;
                                i8 = this.f164173p;
                                if (i8 == -1) {
                                    i8 = this.f164171n;
                                }
                                this.f164173p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f164172o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f164181x) {
                            }
                            if (this.f164158a != null) {
                                iIntValue = ((Integer) sex.f164077i0.get(this.f164158a)).intValue();
                            }
                            if (this.f164175r == 0) {
                                if (Float.compare(this.f164178u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f164177t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f164177t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10353n0(this.f164170m).m10332S(this.f164171n).m10342c0(f).m10345f0(iIntValue).m10343d0(this.f164179v).m10349j0(this.f164180w).m10325L(de5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10323J(this.f164147O).m10347h0(this.f164149Q).m10340a0(iM197855f0);
                        i4 = 1;
                    }
                    if (this.f164158a != null) {
                        bVar.m10336W(this.f164158a);
                    }
                    C1871k c1871kM10320G1112 = bVar.m10333T(i).m10346g0(str3).m10338Y(i2).m10337X(this.f164155W).m10348i0(i11110).m10335V(listSingletonList).m10324K(str).m10328O(this.f164169l).m10320G();
                    m6j0 m6j0VarMo11362b1112 = uqfVar.mo11362b(this.f164160c, i4);
                    this.f164156X = m6j0VarMo11362b1112;
                    m6j0VarMo11362b1112.mo11110b(c1871kM10320G1112);
                    return;
                case 31:
                    listSingletonList = Collections.singletonList(m183768g(this.f164159b));
                    str5 = "audio/flac";
                    str = null;
                    i2 = -1;
                    iM197855f0 = -1;
                    if (this.f164146N != null) {
                        str = o5eVarM162779a.f141893c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z1113 = this.f164154V;
                    if (this.f164153U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i11111 = i3 | (z1113 ? 1 : 0);
                    bVar = new C1871k.b();
                    if (!n200.m157533o(str3)) {
                        if (n200.m157537s(str3)) {
                            if (this.f164174q == 0) {
                                i7 = this.f164172o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f164170m;
                                }
                                this.f164172o = i7;
                                i8 = this.f164173p;
                                if (i8 == -1) {
                                    i8 = this.f164171n;
                                }
                                this.f164173p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f164172o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f164181x) {
                            }
                            if (this.f164158a != null) {
                                iIntValue = ((Integer) sex.f164077i0.get(this.f164158a)).intValue();
                            }
                            if (this.f164175r == 0) {
                                if (Float.compare(this.f164178u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f164177t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f164177t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10353n0(this.f164170m).m10332S(this.f164171n).m10342c0(f).m10345f0(iIntValue).m10343d0(this.f164179v).m10349j0(this.f164180w).m10325L(de5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10323J(this.f164147O).m10347h0(this.f164149Q).m10340a0(iM197855f0);
                        i4 = 1;
                    }
                    if (this.f164158a != null) {
                        bVar.m10336W(this.f164158a);
                    }
                    C1871k c1871kM10320G1113 = bVar.m10333T(i).m10346g0(str3).m10338Y(i2).m10337X(this.f164155W).m10348i0(i11111).m10335V(listSingletonList).m10324K(str).m10328O(this.f164169l).m10320G();
                    m6j0 m6j0VarMo11362b1113 = uqfVar.mo11362b(this.f164160c, i4);
                    this.f164156X = m6j0VarMo11362b1113;
                    m6j0VarMo11362b1113.mo11110b(c1871kM10320G1113);
                    return;
                case 32:
                    listSingletonList = new ArrayList<>(3);
                    listSingletonList.add(m183768g(this.f164159b));
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    listSingletonList.add(byteBufferAllocate.order(byteOrder).putLong(this.f164150R).array());
                    listSingletonList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.f164151S).array());
                    str5 = "audio/opus";
                    i2 = 5760;
                    str = null;
                    iM197855f0 = -1;
                    if (this.f164146N != null) {
                        str = o5eVarM162779a.f141893c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z1114 = this.f164154V;
                    if (this.f164153U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i11112 = i3 | (z1114 ? 1 : 0);
                    bVar = new C1871k.b();
                    if (!n200.m157533o(str3)) {
                        if (n200.m157537s(str3)) {
                            if (this.f164174q == 0) {
                                i7 = this.f164172o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f164170m;
                                }
                                this.f164172o = i7;
                                i8 = this.f164173p;
                                if (i8 == -1) {
                                    i8 = this.f164171n;
                                }
                                this.f164173p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f164172o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f164181x) {
                            }
                            if (this.f164158a != null) {
                                iIntValue = ((Integer) sex.f164077i0.get(this.f164158a)).intValue();
                            }
                            if (this.f164175r == 0) {
                                if (Float.compare(this.f164178u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f164177t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f164177t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10353n0(this.f164170m).m10332S(this.f164171n).m10342c0(f).m10345f0(iIntValue).m10343d0(this.f164179v).m10349j0(this.f164180w).m10325L(de5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10323J(this.f164147O).m10347h0(this.f164149Q).m10340a0(iM197855f0);
                        i4 = 1;
                    }
                    if (this.f164158a != null) {
                        bVar.m10336W(this.f164158a);
                    }
                    C1871k c1871kM10320G1114 = bVar.m10333T(i).m10346g0(str3).m10338Y(i2).m10337X(this.f164155W).m10348i0(i11112).m10335V(listSingletonList).m10324K(str).m10328O(this.f164169l).m10320G();
                    m6j0 m6j0VarMo11362b1114 = uqfVar.mo11362b(this.f164160c, i4);
                    this.f164156X = m6j0VarMo11362b1114;
                    m6j0VarMo11362b1114.mo11110b(c1871kM10320G1114);
                    return;
                default:
                    throw ParserException.createForMalformedContainer("Unrecognized codec identifier.", null);
            }
        }

        @RequiresNonNull({"output"})
        /* JADX INFO: renamed from: j */
        public void m183771j() {
            yaj0 yaj0Var = this.f164152T;
            if (yaj0Var != null) {
                yaj0Var.m213852a(this.f164156X, this.f164167j);
            }
        }

        /* JADX INFO: renamed from: n */
        public void m183772n() {
            yaj0 yaj0Var = this.f164152T;
            if (yaj0Var != null) {
                yaj0Var.m213853b();
            }
        }

        /* JADX INFO: renamed from: o */
        public final boolean m183773o(boolean z) {
            if ("A_OPUS".equals(this.f164159b)) {
                return z;
            }
            return this.f164163f > 0;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        f164077i0 = Collections.unmodifiableMap(map);
    }

    public sex(hje hjeVar, int i) {
        this.f164122q = -1L;
        this.f164123r = -9223372036854775807L;
        this.f164124s = -9223372036854775807L;
        this.f164125t = -9223372036854775807L;
        this.f164131z = -1L;
        this.f164078A = -1L;
        this.f164079B = -9223372036854775807L;
        this.f164104a = hjeVar;
        hjeVar.mo117260b(new C19926b());
        this.f164109d = (i & 1) == 0;
        this.f164106b = new jsk0();
        this.f164108c = new SparseArray<>();
        this.f164112g = new d860(4);
        this.f164113h = new d860(ByteBuffer.allocate(4).putInt(-1).array());
        this.f164114i = new d860(4);
        this.f164110e = new d860(b320.f72762a);
        this.f164111f = new d860(4);
        this.f164115j = new d860();
        this.f164116k = new d860();
        this.f164117l = new d860(8);
        this.f164118m = new d860();
        this.f164119n = new d860();
        this.f164089L = new int[1];
    }

    /* JADX INFO: renamed from: E */
    public static void m183726E(String str, long j, byte[] bArr) {
        byte[] bArrM183733s;
        int i;
        str.getClass();
        switch (str) {
            case "S_TEXT/ASS":
                bArrM183733s = m183733s(j, "%01d:%02d:%02d:%02d", 10000L);
                i = 21;
                break;
            case "S_TEXT/WEBVTT":
                bArrM183733s = m183733s(j, "%02d:%02d:%02d.%03d", 1000L);
                i = 25;
                break;
            case "S_TEXT/UTF8":
                bArrM183733s = m183733s(j, "%02d:%02d:%02d,%03d", 1000L);
                i = 19;
                break;
            default:
                x9g0.m207497a();
                return;
        }
        System.arraycopy(bArrM183733s, 0, bArr, i, bArrM183733s.length);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ sqf[] m183727c() {
        return new sqf[]{new sex()};
    }

    @EnsuresNonNull({"extractorOutput"})
    /* JADX INFO: renamed from: k */
    private void m183731k() {
        p11.m167015i(this.f164107b0);
    }

    /* JADX INFO: renamed from: p */
    public static int[] m183732p(@Nullable int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        return iArr.length >= i ? iArr : new int[Math.max(iArr.length * 2, i)];
    }

    /* JADX INFO: renamed from: s */
    public static byte[] m183733s(long j, String str, long j2) {
        p11.m167007a(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) i) * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) i2) * 60000000);
        int i3 = (int) (j4 / 1000000);
        return vck0.m197887r0(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2))));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: y */
    public static boolean m183734y(String str) {
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    b = 0;
                }
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    b = 1;
                }
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    b = 2;
                }
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    b = 3;
                }
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    b = 4;
                }
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    b = 5;
                }
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    b = 6;
                }
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    b = 7;
                }
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    b = 8;
                }
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    b = 9;
                }
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    b = 10;
                }
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    b = 11;
                }
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    b = 12;
                }
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    b = HttpTokens.CARRIAGE_RETURN;
                }
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    b = 14;
                }
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    b = 15;
                }
                break;
            case 82318131:
                if (str.equals("V_AV1")) {
                    b = Tnaf.POW_2_WIDTH;
                }
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    b = 17;
                }
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    b = 18;
                }
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    b = 19;
                }
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    b = 20;
                }
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    b = 21;
                }
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    b = 22;
                }
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    b = 23;
                }
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    b = 24;
                }
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    b = 25;
                }
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    b = 26;
                }
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    b = 27;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    b = 28;
                }
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    b = 29;
                }
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    b = 30;
                }
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    b = 31;
                }
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    b = HttpTokens.SPACE;
                }
                break;
        }
        switch (b) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: A */
    public final boolean m183735A(fd80 fd80Var, long j) {
        if (this.f164130y) {
            this.f164078A = j;
            fd80Var.f97018a = this.f164131z;
            this.f164130y = false;
            return true;
        }
        if (this.f164127v) {
            long j2 = this.f164078A;
            if (j2 != -1) {
                fd80Var.f97018a = j2;
                this.f164078A = -1L;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: B */
    public final void m183736B(tqf tqfVar, int i) throws IOException {
        if (this.f164112g.m110301g() >= i) {
            return;
        }
        if (this.f164112g.m110296b() < i) {
            d860 d860Var = this.f164112g;
            d860Var.m110297c(Math.max(d860Var.m110296b() * 2, i));
        }
        tqfVar.readFully(this.f164112g.m110299e(), this.f164112g.m110301g(), i - this.f164112g.m110301g());
        this.f164112g.m110291T(i);
    }

    /* JADX INFO: renamed from: C */
    public final void m183737C() {
        this.f164096S = 0;
        this.f164097T = 0;
        this.f164098U = 0;
        this.f164099V = false;
        this.f164100W = false;
        this.f164101X = false;
        this.f164102Y = 0;
        this.f164103Z = (byte) 0;
        this.f164105a0 = false;
        this.f164115j.m110288Q(0);
    }

    /* JADX INFO: renamed from: D */
    public final long m183738D(long j) throws ParserException {
        long j2 = this.f164123r;
        if (j2 != -9223372036854775807L) {
            return vck0.m197832W0(j, j2, 1000L);
        }
        throw ParserException.createForMalformedContainer("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @CallSuper
    /* JADX INFO: renamed from: F */
    public void m183739F(int i, long j, long j2) throws ParserException {
        m183731k();
        if (i == 160) {
            this.f164094Q = false;
            this.f164095R = 0L;
            return;
        }
        if (i == 174) {
            this.f164126u = new C19927c();
            return;
        }
        if (i == 187) {
            this.f164082E = false;
            return;
        }
        if (i == 19899) {
            this.f164128w = -1;
            this.f164129x = -1L;
            return;
        }
        if (i == 20533) {
            m183753t(i).f164165h = true;
            return;
        }
        if (i == 21968) {
            m183753t(i).f164181x = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.f164122q;
            if (j3 != -1 && j3 != j) {
                throw ParserException.createForMalformedContainer("Multiple Segment elements not supported", null);
            }
            this.f164122q = j;
            this.f164121p = j2;
            return;
        }
        if (i == 475249515) {
            this.f164080C = new jzv();
            this.f164081D = new jzv();
        } else if (i == 524531317 && !this.f164127v) {
            if (this.f164109d && this.f164131z != -1) {
                this.f164130y = true;
            } else {
                this.f164107b0.mo11370k(new hce0.C17275b(this.f164125t));
                this.f164127v = true;
            }
        }
    }

    @CallSuper
    /* JADX INFO: renamed from: G */
    public void m183740G(int i, String str) throws ParserException {
        if (i == 134) {
            m183753t(i).f164159b = str;
            return;
        }
        if (i != 17026) {
            if (i == 21358) {
                m183753t(i).f164158a = str;
                return;
            } else {
                if (i != 2274716) {
                    return;
                }
                m183753t(i).f164155W = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            return;
        }
        throw ParserException.createForMalformedContainer("DocType " + str + " not supported", null);
    }

    @RequiresNonNull({"#2.output"})
    /* JADX INFO: renamed from: H */
    public final int m183741H(tqf tqfVar, C19927c c19927c, int i, boolean z) throws IOException {
        int i2;
        if ("S_TEXT/UTF8".equals(c19927c.f164159b)) {
            m183742I(tqfVar, f164072d0, i);
            return m183751q();
        }
        if ("S_TEXT/ASS".equals(c19927c.f164159b)) {
            m183742I(tqfVar, f164074f0, i);
            return m183751q();
        }
        if ("S_TEXT/WEBVTT".equals(c19927c.f164159b)) {
            m183742I(tqfVar, f164075g0, i);
            return m183751q();
        }
        m6j0 m6j0Var = c19927c.f164156X;
        if (!this.f164099V) {
            if (c19927c.f164165h) {
                this.f164092O &= -1073741825;
                if (!this.f164100W) {
                    tqfVar.readFully(this.f164112g.m110299e(), 0, 1);
                    this.f164096S++;
                    if ((this.f164112g.m110299e()[0] & 128) == 128) {
                        throw ParserException.createForMalformedContainer("Extension bit is set in signal byte", null);
                    }
                    this.f164103Z = this.f164112g.m110299e()[0];
                    this.f164100W = true;
                }
                byte b = this.f164103Z;
                if ((b & 1) == 1) {
                    boolean z2 = (b & 2) == 2;
                    this.f164092O |= 1073741824;
                    if (!this.f164105a0) {
                        tqfVar.readFully(this.f164117l.m110299e(), 0, 8);
                        this.f164096S += 8;
                        this.f164105a0 = true;
                        this.f164112g.m110299e()[0] = (byte) ((z2 ? 128 : 0) | 8);
                        this.f164112g.m110292U(0);
                        m6j0Var.mo11112f(this.f164112g, 1, 1);
                        this.f164097T++;
                        this.f164117l.m110292U(0);
                        m6j0Var.mo11112f(this.f164117l, 8, 1);
                        this.f164097T += 8;
                    }
                    if (z2) {
                        if (!this.f164101X) {
                            tqfVar.readFully(this.f164112g.m110299e(), 0, 1);
                            this.f164096S++;
                            this.f164112g.m110292U(0);
                            this.f164102Y = this.f164112g.m110279H();
                            this.f164101X = true;
                        }
                        int i3 = this.f164102Y * 4;
                        this.f164112g.m110288Q(i3);
                        tqfVar.readFully(this.f164112g.m110299e(), 0, i3);
                        this.f164096S += i3;
                        short s = (short) ((this.f164102Y / 2) + 1);
                        int i4 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.f164120o;
                        if (byteBuffer == null || byteBuffer.capacity() < i4) {
                            this.f164120o = ByteBuffer.allocate(i4);
                        }
                        this.f164120o.position(0);
                        this.f164120o.putShort(s);
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            i2 = this.f164102Y;
                            if (i5 >= i2) {
                                break;
                            }
                            int iM110283L = this.f164112g.m110283L();
                            int i7 = i5 % 2;
                            ByteBuffer byteBuffer2 = this.f164120o;
                            if (i7 == 0) {
                                byteBuffer2.putShort((short) (iM110283L - i6));
                            } else {
                                byteBuffer2.putInt(iM110283L - i6);
                            }
                            i5++;
                            i6 = iM110283L;
                        }
                        int i8 = (i - this.f164096S) - i6;
                        int i9 = i2 % 2;
                        ByteBuffer byteBuffer3 = this.f164120o;
                        if (i9 == 1) {
                            byteBuffer3.putInt(i8);
                        } else {
                            byteBuffer3.putShort((short) i8);
                            this.f164120o.putInt(0);
                        }
                        this.f164118m.m110290S(this.f164120o.array(), i4);
                        m6j0Var.mo11112f(this.f164118m, i4, 1);
                        this.f164097T += i4;
                    }
                }
            } else {
                byte[] bArr = c19927c.f164166i;
                if (bArr != null) {
                    this.f164115j.m110290S(bArr, bArr.length);
                }
            }
            if (c19927c.m183773o(z)) {
                this.f164092O |= 268435456;
                this.f164119n.m110288Q(0);
                int iM110301g = (this.f164115j.m110301g() + i) - this.f164096S;
                this.f164112g.m110288Q(4);
                this.f164112g.m110299e()[0] = (byte) ((iM110301g >> 24) & 255);
                this.f164112g.m110299e()[1] = (byte) ((iM110301g >> 16) & 255);
                this.f164112g.m110299e()[2] = (byte) ((iM110301g >> 8) & 255);
                this.f164112g.m110299e()[3] = (byte) (iM110301g & 255);
                m6j0Var.mo11112f(this.f164112g, 4, 2);
                this.f164097T += 4;
            }
            this.f164099V = true;
        }
        int iM110301g2 = i + this.f164115j.m110301g();
        if (!"V_MPEG4/ISO/AVC".equals(c19927c.f164159b) && !"V_MPEGH/ISO/HEVC".equals(c19927c.f164159b)) {
            if (c19927c.f164152T != null) {
                p11.m167013g(this.f164115j.m110301g() == 0);
                c19927c.f164152T.m213855d(tqfVar);
            }
            while (true) {
                int i10 = this.f164096S;
                if (i10 >= iM110301g2) {
                    break;
                }
                int iM183743J = m183743J(tqfVar, m6j0Var, iM110301g2 - i10);
                this.f164096S += iM183743J;
                this.f164097T += iM183743J;
            }
        } else {
            byte[] bArrM110299e = this.f164111f.m110299e();
            bArrM110299e[0] = 0;
            bArrM110299e[1] = 0;
            bArrM110299e[2] = 0;
            int i11 = c19927c.f164157Y;
            int i12 = 4 - i11;
            while (this.f164096S < iM110301g2) {
                int i13 = this.f164098U;
                if (i13 == 0) {
                    m183744K(tqfVar, bArrM110299e, i12, i11);
                    this.f164096S += i11;
                    this.f164111f.m110292U(0);
                    this.f164098U = this.f164111f.m110283L();
                    this.f164110e.m110292U(0);
                    m6j0Var.m153238d(this.f164110e, 4);
                    this.f164097T += 4;
                } else {
                    int iM183743J2 = m183743J(tqfVar, m6j0Var, i13);
                    this.f164096S += iM183743J2;
                    this.f164097T += iM183743J2;
                    this.f164098U -= iM183743J2;
                }
            }
        }
        if ("A_VORBIS".equals(c19927c.f164159b)) {
            this.f164113h.m110292U(0);
            m6j0Var.m153238d(this.f164113h, 4);
            this.f164097T += 4;
        }
        return m183751q();
    }

    /* JADX INFO: renamed from: I */
    public final void m183742I(tqf tqfVar, byte[] bArr, int i) throws IOException {
        int length = bArr.length + i;
        int iM110296b = this.f164116k.m110296b();
        d860 d860Var = this.f164116k;
        if (iM110296b < length) {
            d860Var.m110289R(Arrays.copyOf(bArr, length + i));
        } else {
            System.arraycopy(bArr, 0, d860Var.m110299e(), 0, bArr.length);
        }
        tqfVar.readFully(this.f164116k.m110299e(), bArr.length, i);
        this.f164116k.m110292U(0);
        this.f164116k.m110291T(length);
    }

    /* JADX INFO: renamed from: J */
    public final int m183743J(tqf tqfVar, m6j0 m6j0Var, int i) throws IOException {
        int iM110295a = this.f164115j.m110295a();
        if (iM110295a <= 0) {
            return m6j0Var.m153239e(tqfVar, i, false);
        }
        int iMin = Math.min(i, iM110295a);
        m6j0Var.m153238d(this.f164115j, iMin);
        return iMin;
    }

    /* JADX INFO: renamed from: K */
    public final void m183744K(tqf tqfVar, byte[] bArr, int i, int i2) throws IOException {
        int iMin = Math.min(i2, this.f164115j.m110295a());
        tqfVar.readFully(bArr, i + iMin, i2 - iMin);
        if (iMin > 0) {
            this.f164115j.m110306l(bArr, i, iMin);
        }
    }

    @Override // p149l.sqf
    @CallSuper
    /* JADX INFO: renamed from: a */
    public void mo10975a(long j, long j2) {
        this.f164079B = -9223372036854775807L;
        this.f164084G = 0;
        this.f164104a.reset();
        this.f164106b.m143051e();
        m183737C();
        for (int i = 0; i < this.f164108c.size(); i++) {
            this.f164108c.valueAt(i).m183772n();
        }
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: b */
    public final void mo10976b(uqf uqfVar) {
        this.f164107b0 = uqfVar;
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: f */
    public final boolean mo10977f(tqf tqfVar) throws IOException {
        return new okf0().m164859b(tqfVar);
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: h */
    public final int mo10978h(tqf tqfVar, fd80 fd80Var) throws IOException {
        this.f164083F = false;
        boolean zMo117259a = true;
        while (zMo117259a && !this.f164083F) {
            zMo117259a = this.f164104a.mo117259a(tqfVar);
            if (zMo117259a && m183735A(fd80Var, tqfVar.getPosition())) {
                return 1;
            }
        }
        if (zMo117259a) {
            return 0;
        }
        for (int i = 0; i < this.f164108c.size(); i++) {
            C19927c c19927cValueAt = this.f164108c.valueAt(i);
            c19927cValueAt.m183767f();
            c19927cValueAt.m183771j();
        }
        return -1;
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    /* JADX INFO: renamed from: i */
    public final void m183745i(int i) throws ParserException {
        if (this.f164080C == null || this.f164081D == null) {
            throw ParserException.createForMalformedContainer("Element " + i + " must be in a Cues", null);
        }
    }

    @EnsuresNonNull({"currentTrack"})
    /* JADX INFO: renamed from: j */
    public final void m183746j(int i) throws ParserException {
        if (this.f164126u != null) {
            return;
        }
        throw ParserException.createForMalformedContainer("Element " + i + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x028c  */
    /* JADX WARN: Multi-variable type inference failed */
    @CallSuper
    /* JADX INFO: renamed from: l */
    public void m183747l(int i, int i2, tqf tqfVar) throws IOException {
        int i3;
        int i4;
        int i5;
        long j;
        int i6;
        int[] iArr;
        int i7;
        int i8;
        int i9;
        tqf tqfVar2 = tqfVar;
        int i10 = 0;
        int i11 = 1;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (this.f164084G != 2) {
                    return;
                }
                m183756w(this.f164108c.get(this.f164090M), this.f164093P, tqfVar2, i2);
                return;
            }
            if (i == 16877) {
                m183755v(m183753t(i), tqfVar2, i2);
                return;
            }
            if (i == 16981) {
                m183746j(i);
                byte[] bArr = new byte[i2];
                this.f164126u.f164166i = bArr;
                tqfVar2.readFully(bArr, 0, i2);
                return;
            }
            if (i == 18402) {
                byte[] bArr2 = new byte[i2];
                tqfVar2.readFully(bArr2, 0, i2);
                m183753t(i).f164167j = new m6j0.C18401a(1, bArr2, 0, 0);
                return;
            }
            if (i == 21419) {
                Arrays.fill(this.f164114i.m110299e(), (byte) 0);
                tqfVar2.readFully(this.f164114i.m110299e(), 4 - i2, i2);
                this.f164114i.m110292U(0);
                this.f164128w = (int) this.f164114i.m110281J();
                return;
            }
            if (i == 25506) {
                m183746j(i);
                byte[] bArr3 = new byte[i2];
                this.f164126u.f164168k = bArr3;
                tqfVar2.readFully(bArr3, 0, i2);
                return;
            }
            if (i != 30322) {
                throw ParserException.createForMalformedContainer("Unexpected id: " + i, null);
            }
            m183746j(i);
            byte[] bArr4 = new byte[i2];
            this.f164126u.f164179v = bArr4;
            tqfVar2.readFully(bArr4, 0, i2);
            return;
        }
        int i12 = 8;
        if (this.f164084G == 0) {
            this.f164090M = (int) this.f164106b.m143050d(tqfVar2, false, true, 8);
            this.f164091N = this.f164106b.m143049b();
            this.f164086I = -9223372036854775807L;
            this.f164084G = 1;
            this.f164112g.m110288Q(0);
        }
        C19927c c19927c = this.f164108c.get(this.f164090M);
        if (c19927c == null) {
            tqfVar2.mo150661o(i2 - this.f164091N);
            this.f164084G = 0;
            return;
        }
        c19927c.m183767f();
        if (this.f164084G == 1) {
            m183736B(tqfVar2, 3);
            int i13 = (this.f164112g.m110299e()[2] & 6) >> 1;
            if (i13 == 0) {
                this.f164088K = 1;
                int[] iArrM183732p = m183732p(this.f164089L, 1);
                this.f164089L = iArrM183732p;
                iArrM183732p[0] = (i2 - this.f164091N) - 3;
            } else {
                m183736B(tqfVar2, 4);
                int i14 = (this.f164112g.m110299e()[3] & 255) + 1;
                this.f164088K = i14;
                int[] iArrM183732p2 = m183732p(this.f164089L, i14);
                this.f164089L = iArrM183732p2;
                if (i13 == 2) {
                    int i15 = (i2 - this.f164091N) - 4;
                    int i16 = this.f164088K;
                    Arrays.fill(iArrM183732p2, 0, i16, i15 / i16);
                } else if (i13 == 1) {
                    int i17 = 0;
                    int i18 = 0;
                    int i19 = 4;
                    while (true) {
                        i6 = this.f164088K;
                        int i20 = i6 - 1;
                        i3 = i11;
                        iArr = this.f164089L;
                        if (i17 >= i20) {
                            break;
                        }
                        iArr[i17] = 0;
                        while (true) {
                            i7 = i19 + 1;
                            m183736B(tqfVar2, i7);
                            int i21 = this.f164112g.m110299e()[i19] & 255;
                            int[] iArr2 = this.f164089L;
                            i8 = iArr2[i17] + i21;
                            iArr2[i17] = i8;
                            if (i21 != 255) {
                                break;
                            } else {
                                i19 = i7;
                            }
                        }
                        i18 += i8;
                        i17++;
                        i19 = i7;
                        i11 = i3;
                    }
                    iArr[i6 - 1] = ((i2 - this.f164091N) - i19) - i18;
                } else {
                    i3 = 1;
                    if (i13 != 3) {
                        throw ParserException.createForMalformedContainer("Unexpected lacing value: " + i13, null);
                    }
                    int i22 = 0;
                    int i23 = 0;
                    int i24 = 4;
                    while (true) {
                        int i25 = this.f164088K;
                        int i26 = i25 - 1;
                        i10 = i10;
                        int[] iArr3 = this.f164089L;
                        if (i22 >= i26) {
                            iArr3[i25 - 1] = ((i2 - this.f164091N) - i24) - i23;
                            break;
                        }
                        iArr3[i22] = i10;
                        int i27 = i24 + 1;
                        m183736B(tqfVar2, i27);
                        if (this.f164112g.m110299e()[i24] == 0) {
                            throw ParserException.createForMalformedContainer("No valid varint length mask found", null);
                        }
                        int i28 = i10;
                        while (true) {
                            if (i28 >= i12) {
                                i5 = i12;
                                j = 0;
                                break;
                            }
                            int i29 = 1 << (7 - i28);
                            i5 = i12;
                            if ((this.f164112g.m110299e()[i24] & i29) != 0) {
                                i27 += i28;
                                m183736B(tqfVar2, i27);
                                int i30 = i24 + 1;
                                j = this.f164112g.m110299e()[i24] & 255 & (~i29);
                                for (int i31 = i30; i31 < i27; i31++) {
                                    j = (j << i5) | ((long) (this.f164112g.m110299e()[i31] & 255));
                                }
                                if (i22 <= 0) {
                                    break;
                                }
                                j -= (1 << ((i28 * 7) + 6)) - 1;
                                break;
                            }
                            i28++;
                            tqfVar2 = tqfVar;
                            i12 = i5;
                        }
                        if (j < -2147483648L || j > 2147483647L) {
                            throw ParserException.createForMalformedContainer("EBML lacing sample size out of range.", null);
                        }
                        int i32 = (int) j;
                        int[] iArr4 = this.f164089L;
                        if (i22 != 0) {
                            i32 += iArr4[i22 - 1];
                        }
                        iArr4[i22] = i32;
                        i23 += i32;
                        i22++;
                        tqfVar2 = tqfVar;
                        i24 = i27;
                        i10 = i10;
                        i12 = i5;
                    }
                }
                this.f164085H = this.f164079B + m183738D((this.f164112g.m110299e()[i10] << 8) | (this.f164112g.m110299e()[i3] & 255));
                if (c19927c.f164161d != 2 || (i == 163 && (this.f164112g.m110299e()[2] & 128) == 128)) {
                    i9 = i3;
                } else {
                    i9 = i10;
                }
                this.f164092O = i9;
                this.f164084G = 2;
                this.f164087J = i10;
                i4 = 163;
            }
            i3 = 1;
            this.f164085H = this.f164079B + m183738D((this.f164112g.m110299e()[i10] << 8) | (this.f164112g.m110299e()[i3] & 255));
            if (c19927c.f164161d != 2) {
                i9 = i3;
            } else {
                i9 = i3;
            }
            this.f164092O = i9;
            this.f164084G = 2;
            this.f164087J = i10;
            i4 = 163;
        } else {
            i3 = 1;
            i4 = 163;
        }
        if (i == i4) {
            while (true) {
                int i33 = this.f164087J;
                if (i33 >= this.f164088K) {
                    this.f164084G = 0;
                    return;
                }
                int iM183741H = m183741H(tqfVar, c19927c, this.f164089L[i33], false);
                C19927c c19927c2 = c19927c;
                m183749n(c19927c2, this.f164085H + ((long) ((this.f164087J * c19927c.f164162e) / 1000)), this.f164092O, iM183741H, 0);
                this.f164087J++;
                c19927c = c19927c2;
            }
        } else {
            while (true) {
                int i34 = this.f164087J;
                if (i34 >= this.f164088K) {
                    return;
                }
                int[] iArr5 = this.f164089L;
                boolean z = i3;
                iArr5[i34] = m183741H(tqfVar, c19927c, iArr5[i34], z);
                this.f164087J += z ? 1 : 0;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final hce0 m183748m(@Nullable jzv jzvVar, @Nullable jzv jzvVar2) {
        int i;
        if (this.f164122q == -1 || this.f164125t == -9223372036854775807L || jzvVar == null || jzvVar.m143950c() == 0 || jzvVar2 == null || jzvVar2.m143950c() != jzvVar.m143950c()) {
            return new hce0.C17275b(this.f164125t);
        }
        int iM143950c = jzvVar.m143950c();
        int[] iArrCopyOf = new int[iM143950c];
        long[] jArrCopyOf = new long[iM143950c];
        long[] jArrCopyOf2 = new long[iM143950c];
        long[] jArrCopyOf3 = new long[iM143950c];
        int i2 = 0;
        for (int i3 = 0; i3 < iM143950c; i3++) {
            jArrCopyOf3[i3] = jzvVar.m143949b(i3);
            jArrCopyOf[i3] = this.f164122q + jzvVar2.m143949b(i3);
        }
        while (true) {
            i = iM143950c - 1;
            if (i2 >= i) {
                break;
            }
            int i4 = i2 + 1;
            iArrCopyOf[i2] = (int) (jArrCopyOf[i4] - jArrCopyOf[i2]);
            jArrCopyOf2[i2] = jArrCopyOf3[i4] - jArrCopyOf3[i2];
            i2 = i4;
        }
        iArrCopyOf[i] = (int) ((this.f164122q + this.f164121p) - jArrCopyOf[i]);
        long j = this.f164125t - jArrCopyOf3[i];
        jArrCopyOf2[i] = j;
        if (j <= 0) {
            jwv.m143689i("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j);
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i);
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i);
            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i);
            jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i);
        }
        return new q35(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
    }

    @RequiresNonNull({"#1.output"})
    /* JADX INFO: renamed from: n */
    public final void m183749n(C19927c c19927c, long j, int i, int i2, int i3) {
        int iM110301g;
        yaj0 yaj0Var = c19927c.f164152T;
        if (yaj0Var != null) {
            yaj0Var.m213854c(c19927c.f164156X, j, i, i2, i3, c19927c.f164167j);
        } else {
            if ("S_TEXT/UTF8".equals(c19927c.f164159b) || "S_TEXT/ASS".equals(c19927c.f164159b) || "S_TEXT/WEBVTT".equals(c19927c.f164159b)) {
                if (this.f164088K > 1) {
                    jwv.m143689i("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.f164086I;
                    if (j2 == -9223372036854775807L) {
                        jwv.m143689i("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        m183726E(c19927c.f164159b, j2, this.f164116k.m110299e());
                        for (int iM110300f = this.f164116k.m110300f(); iM110300f < this.f164116k.m110301g(); iM110300f++) {
                            if (this.f164116k.m110299e()[iM110300f] == 0) {
                                this.f164116k.m110291T(iM110300f);
                                break;
                            }
                        }
                        m6j0 m6j0Var = c19927c.f164156X;
                        d860 d860Var = this.f164116k;
                        m6j0Var.m153238d(d860Var, d860Var.m110301g());
                        iM110301g = i2 + this.f164116k.m110301g();
                    }
                }
                iM110301g = i2;
            } else {
                iM110301g = i2;
            }
            if ((i & 268435456) != 0) {
                int i4 = this.f164088K;
                d860 d860Var2 = this.f164119n;
                if (i4 > 1) {
                    d860Var2.m110288Q(0);
                } else {
                    int iM110301g2 = d860Var2.m110301g();
                    c19927c.f164156X.mo11112f(this.f164119n, iM110301g2, 2);
                    iM110301g += iM110301g2;
                }
            }
            c19927c.f164156X.mo11109a(j, i, iM110301g, i3, c19927c.f164167j);
        }
        this.f164083F = true;
    }

    @CallSuper
    /* JADX INFO: renamed from: o */
    public void m183750o(int i) throws ParserException {
        m183731k();
        if (i == 160) {
            if (this.f164084G != 2) {
                return;
            }
            C19927c c19927c = this.f164108c.get(this.f164090M);
            c19927c.m183767f();
            if (this.f164095R > 0 && "A_OPUS".equals(c19927c.f164159b)) {
                this.f164119n.m110289R(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f164095R).array());
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.f164088K; i3++) {
                i2 += this.f164089L[i3];
            }
            int i4 = 0;
            while (i4 < this.f164088K) {
                long j = this.f164085H + ((long) ((c19927c.f164162e * i4) / 1000));
                int i5 = this.f164092O;
                if (i4 == 0 && !this.f164094Q) {
                    i5 |= 1;
                }
                int i6 = this.f164089L[i4];
                int i7 = i2 - i6;
                m183749n(c19927c, j, i5, i6, i7);
                i4++;
                i2 = i7;
            }
            this.f164084G = 0;
            return;
        }
        if (i == 174) {
            C19927c c19927c2 = (C19927c) p11.m167015i(this.f164126u);
            String str = c19927c2.f164159b;
            if (str == null) {
                throw ParserException.createForMalformedContainer("CodecId is missing in TrackEntry element", null);
            }
            if (m183734y(str)) {
                c19927c2.m183770i(this.f164107b0, c19927c2.f164160c);
                this.f164108c.put(c19927c2.f164160c, c19927c2);
            }
            this.f164126u = null;
            return;
        }
        if (i == 19899) {
            int i8 = this.f164128w;
            if (i8 != -1) {
                long j2 = this.f164129x;
                if (j2 != -1) {
                    if (i8 == 475249515) {
                        this.f164131z = j2;
                        return;
                    }
                    return;
                }
            }
            throw ParserException.createForMalformedContainer("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i == 25152) {
            m183746j(i);
            C19927c c19927c3 = this.f164126u;
            if (c19927c3.f164165h) {
                if (c19927c3.f164167j == null) {
                    throw ParserException.createForMalformedContainer("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                c19927c3.f164169l = new DrmInitData(new DrmInitData.SchemeData(ar3.f71228a, "video/webm", this.f164126u.f164167j.f131701b));
                return;
            }
            return;
        }
        if (i == 28032) {
            m183746j(i);
            C19927c c19927c4 = this.f164126u;
            if (c19927c4.f164165h && c19927c4.f164166i != null) {
                throw ParserException.createForMalformedContainer("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i == 357149030) {
            if (this.f164123r == -9223372036854775807L) {
                this.f164123r = 1000000L;
            }
            long j3 = this.f164124s;
            if (j3 != -9223372036854775807L) {
                this.f164125t = m183738D(j3);
                return;
            }
            return;
        }
        if (i == 374648427) {
            if (this.f164108c.size() == 0) {
                throw ParserException.createForMalformedContainer("No valid tracks were found", null);
            }
            this.f164107b0.mo11371l();
        } else {
            if (i != 475249515) {
                return;
            }
            if (!this.f164127v) {
                this.f164107b0.mo11370k(m183748m(this.f164080C, this.f164081D));
                this.f164127v = true;
            }
            this.f164080C = null;
            this.f164081D = null;
        }
    }

    /* JADX INFO: renamed from: q */
    public final int m183751q() {
        int i = this.f164097T;
        m183737C();
        return i;
    }

    @CallSuper
    /* JADX INFO: renamed from: r */
    public void m183752r(int i, double d) throws ParserException {
        if (i == 181) {
            m183753t(i).f164149Q = (int) d;
            return;
        }
        if (i == 17545) {
            this.f164124s = (long) d;
            return;
        }
        switch (i) {
            case 21969:
                m183753t(i).f164136D = (float) d;
                break;
            case 21970:
                m183753t(i).f164137E = (float) d;
                break;
            case 21971:
                m183753t(i).f164138F = (float) d;
                break;
            case 21972:
                m183753t(i).f164139G = (float) d;
                break;
            case 21973:
                m183753t(i).f164140H = (float) d;
                break;
            case 21974:
                m183753t(i).f164141I = (float) d;
                break;
            case 21975:
                m183753t(i).f164142J = (float) d;
                break;
            case 21976:
                m183753t(i).f164143K = (float) d;
                break;
            case 21977:
                m183753t(i).f164144L = (float) d;
                break;
            case 21978:
                m183753t(i).f164145M = (float) d;
                break;
            default:
                switch (i) {
                    case 30323:
                        m183753t(i).f164176s = (float) d;
                        break;
                    case 30324:
                        m183753t(i).f164177t = (float) d;
                        break;
                    case 30325:
                        m183753t(i).f164178u = (float) d;
                        break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: t */
    public C19927c m183753t(int i) throws ParserException {
        m183746j(i);
        return this.f164126u;
    }

    @CallSuper
    /* JADX INFO: renamed from: u */
    public int m183754u(int i) {
        switch (i) {
            case 131:
            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA /* 136 */:
            case CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA /* 155 */:
            case 159:
            case 176:
            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384 /* 179 */:
            case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 186 */:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256 /* 174 */:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: v */
    public void m183755v(C19927c c19927c, tqf tqfVar, int i) throws IOException {
        if (c19927c.f164164g != 1685485123 && c19927c.f164164g != 1685480259) {
            tqfVar.mo150661o(i);
            return;
        }
        byte[] bArr = new byte[i];
        c19927c.f164146N = bArr;
        tqfVar.readFully(bArr, 0, i);
    }

    /* JADX INFO: renamed from: w */
    public void m183756w(C19927c c19927c, int i, tqf tqfVar, int i2) throws IOException {
        if (i != 4 || !"V_VP9".equals(c19927c.f164159b)) {
            tqfVar.mo150661o(i2);
        } else {
            this.f164119n.m110288Q(i2);
            tqfVar.readFully(this.f164119n.m110299e(), 0, i2);
        }
    }

    @CallSuper
    /* JADX INFO: renamed from: x */
    public void m183757x(int i, long j) throws ParserException {
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw ParserException.createForMalformedContainer("ContentEncodingOrder " + j + " not supported", null);
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw ParserException.createForMalformedContainer("ContentEncodingScope " + j + " not supported", null);
        }
        switch (i) {
            case 131:
                m183753t(i).f164161d = (int) j;
                return;
            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA /* 136 */:
                m183753t(i).f164154V = j == 1;
                return;
            case CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA /* 155 */:
                this.f164086I = m183738D(j);
                return;
            case 159:
                m183753t(i).f164147O = (int) j;
                return;
            case 176:
                m183753t(i).f164170m = (int) j;
                return;
            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384 /* 179 */:
                m183745i(i);
                this.f164080C.m143948a(m183738D(j));
                return;
            case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 186 */:
                m183753t(i).f164171n = (int) j;
                return;
            case 215:
                m183753t(i).f164160c = (int) j;
                return;
            case 231:
                this.f164079B = m183738D(j);
                return;
            case 238:
                this.f164093P = (int) j;
                return;
            case 241:
                if (this.f164082E) {
                    return;
                }
                m183745i(i);
                this.f164081D.m143948a(j);
                this.f164082E = true;
                return;
            case 251:
                this.f164094Q = true;
                return;
            case 16871:
                m183753t(i).f164164g = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw ParserException.createForMalformedContainer("ContentCompAlgo " + j + " not supported", null);
            case 17029:
                if (j < 1 || j > 2) {
                    throw ParserException.createForMalformedContainer("DocTypeReadVersion " + j + " not supported", null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw ParserException.createForMalformedContainer("EBMLReadVersion " + j + " not supported", null);
            case 18401:
                if (j == 5) {
                    return;
                }
                throw ParserException.createForMalformedContainer("ContentEncAlgo " + j + " not supported", null);
            case 18408:
                if (j == 1) {
                    return;
                }
                throw ParserException.createForMalformedContainer("AESSettingsCipherMode " + j + " not supported", null);
            case 21420:
                this.f164129x = j + this.f164122q;
                return;
            case 21432:
                int i2 = (int) j;
                m183746j(i);
                if (i2 == 0) {
                    this.f164126u.f164180w = 0;
                    return;
                }
                if (i2 == 1) {
                    this.f164126u.f164180w = 2;
                    return;
                } else if (i2 == 3) {
                    this.f164126u.f164180w = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    this.f164126u.f164180w = 3;
                    return;
                }
            case 21680:
                m183753t(i).f164172o = (int) j;
                return;
            case 21682:
                m183753t(i).f164174q = (int) j;
                return;
            case 21690:
                m183753t(i).f164173p = (int) j;
                return;
            case 21930:
                m183753t(i).f164153U = j == 1;
                return;
            case 21998:
                m183753t(i).f164163f = (int) j;
                return;
            case 22186:
                m183753t(i).f164150R = j;
                return;
            case 22203:
                m183753t(i).f164151S = j;
                return;
            case 25188:
                m183753t(i).f164148P = (int) j;
                return;
            case 30114:
                this.f164095R = j;
                return;
            case 30321:
                m183746j(i);
                int i3 = (int) j;
                if (i3 == 0) {
                    this.f164126u.f164175r = 0;
                    return;
                }
                if (i3 == 1) {
                    this.f164126u.f164175r = 1;
                    return;
                } else if (i3 == 2) {
                    this.f164126u.f164175r = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.f164126u.f164175r = 3;
                    return;
                }
            case 2352003:
                m183753t(i).f164162e = (int) j;
                return;
            case 2807729:
                this.f164123r = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        m183746j(i);
                        int i4 = (int) j;
                        if (i4 == 1) {
                            this.f164126u.f164133A = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            this.f164126u.f164133A = 1;
                            return;
                        }
                    case 21946:
                        m183746j(i);
                        int iM111100i = de5.m111100i((int) j);
                        if (iM111100i != -1) {
                            this.f164126u.f164183z = iM111100i;
                            return;
                        }
                        return;
                    case 21947:
                        m183746j(i);
                        this.f164126u.f164181x = true;
                        int iM111099h = de5.m111099h((int) j);
                        if (iM111099h != -1) {
                            this.f164126u.f164182y = iM111099h;
                            return;
                        }
                        return;
                    case 21948:
                        m183753t(i).f164134B = (int) j;
                        return;
                    case 21949:
                        m183753t(i).f164135C = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    @CallSuper
    /* JADX INFO: renamed from: z */
    public boolean m183758z(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    @Override // p149l.sqf
    public final void release() {
    }

    public sex(int i) {
        this(new end(), i);
    }

    public sex() {
        this(0);
    }
}
