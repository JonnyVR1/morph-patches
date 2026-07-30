package p153l;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.common.collect.ImmutableList;
import com.google.firebase.FirebaseError;
import com.tencent.ugc.TXRecordCommon;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import io.requery.android.database.sqlite.SQLiteDatabase;
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
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class rhx implements zrf {

    /* JADX INFO: renamed from: c0 */
    public static final esf f163209c0 = new esf() { // from class: l.qhx
        @Override // p153l.esf
        /* JADX INFO: renamed from: b */
        public final zrf[] mo96504b() {
            return rhx.m181521c();
        }
    };

    /* JADX INFO: renamed from: d0 */
    public static final byte[] f163210d0 = {49, 10, 48, 48, HttpTokens.COLON, 48, 48, HttpTokens.COLON, 48, 48, 44, 48, 48, 48, HttpTokens.SPACE, 45, 45, 62, HttpTokens.SPACE, 48, 48, HttpTokens.COLON, 48, 48, HttpTokens.COLON, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: e0 */
    public static final byte[] f163211e0 = bmk0.m105165r0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* JADX INFO: renamed from: f0 */
    public static final byte[] f163212f0 = {68, 105, 97, 108, 111, 103, 117, 101, HttpTokens.COLON, HttpTokens.SPACE, 48, HttpTokens.COLON, 48, 48, HttpTokens.COLON, 48, 48, HttpTokens.COLON, 48, 48, 44, 48, HttpTokens.COLON, 48, 48, HttpTokens.COLON, 48, 48, HttpTokens.COLON, 48, 48, 44};

    /* JADX INFO: renamed from: g0 */
    public static final byte[] f163213g0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, HttpTokens.COLON, 48, 48, HttpTokens.COLON, 48, 48, 46, 48, 48, 48, HttpTokens.SPACE, 45, 45, 62, HttpTokens.SPACE, 48, 48, HttpTokens.COLON, 48, 48, HttpTokens.COLON, 48, 48, 46, 48, 48, 48, 10};

    /* JADX INFO: renamed from: h0 */
    public static final UUID f163214h0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* JADX INFO: renamed from: i0 */
    public static final Map<String, Integer> f163215i0;

    /* JADX INFO: renamed from: A */
    public long f163216A;

    /* JADX INFO: renamed from: B */
    public long f163217B;

    /* JADX INFO: renamed from: C */
    @Nullable
    public h1w f163218C;

    /* JADX INFO: renamed from: D */
    @Nullable
    public h1w f163219D;

    /* JADX INFO: renamed from: E */
    public boolean f163220E;

    /* JADX INFO: renamed from: F */
    public boolean f163221F;

    /* JADX INFO: renamed from: G */
    public int f163222G;

    /* JADX INFO: renamed from: H */
    public long f163223H;

    /* JADX INFO: renamed from: I */
    public long f163224I;

    /* JADX INFO: renamed from: J */
    public int f163225J;

    /* JADX INFO: renamed from: K */
    public int f163226K;

    /* JADX INFO: renamed from: L */
    public int[] f163227L;

    /* JADX INFO: renamed from: M */
    public int f163228M;

    /* JADX INFO: renamed from: N */
    public int f163229N;

    /* JADX INFO: renamed from: O */
    public int f163230O;

    /* JADX INFO: renamed from: P */
    public int f163231P;

    /* JADX INFO: renamed from: Q */
    public boolean f163232Q;

    /* JADX INFO: renamed from: R */
    public long f163233R;

    /* JADX INFO: renamed from: S */
    public int f163234S;

    /* JADX INFO: renamed from: T */
    public int f163235T;

    /* JADX INFO: renamed from: U */
    public int f163236U;

    /* JADX INFO: renamed from: V */
    public boolean f163237V;

    /* JADX INFO: renamed from: W */
    public boolean f163238W;

    /* JADX INFO: renamed from: X */
    public boolean f163239X;

    /* JADX INFO: renamed from: Y */
    public int f163240Y;

    /* JADX INFO: renamed from: Z */
    public byte f163241Z;

    /* JADX INFO: renamed from: a */
    public final lke f163242a;

    /* JADX INFO: renamed from: a0 */
    public boolean f163243a0;

    /* JADX INFO: renamed from: b */
    public final p1l0 f163244b;

    /* JADX INFO: renamed from: b0 */
    public bsf f163245b0;

    /* JADX INFO: renamed from: c */
    public final SparseArray<C19851c> f163246c;

    /* JADX INFO: renamed from: d */
    public final boolean f163247d;

    /* JADX INFO: renamed from: e */
    public final ig60 f163248e;

    /* JADX INFO: renamed from: f */
    public final ig60 f163249f;

    /* JADX INFO: renamed from: g */
    public final ig60 f163250g;

    /* JADX INFO: renamed from: h */
    public final ig60 f163251h;

    /* JADX INFO: renamed from: i */
    public final ig60 f163252i;

    /* JADX INFO: renamed from: j */
    public final ig60 f163253j;

    /* JADX INFO: renamed from: k */
    public final ig60 f163254k;

    /* JADX INFO: renamed from: l */
    public final ig60 f163255l;

    /* JADX INFO: renamed from: m */
    public final ig60 f163256m;

    /* JADX INFO: renamed from: n */
    public final ig60 f163257n;

    /* JADX INFO: renamed from: o */
    public ByteBuffer f163258o;

    /* JADX INFO: renamed from: p */
    public long f163259p;

    /* JADX INFO: renamed from: q */
    public long f163260q;

    /* JADX INFO: renamed from: r */
    public long f163261r;

    /* JADX INFO: renamed from: s */
    public long f163262s;

    /* JADX INFO: renamed from: t */
    public long f163263t;

    /* JADX INFO: renamed from: u */
    @Nullable
    public C19851c f163264u;

    /* JADX INFO: renamed from: v */
    public boolean f163265v;

    /* JADX INFO: renamed from: w */
    public int f163266w;

    /* JADX INFO: renamed from: x */
    public long f163267x;

    /* JADX INFO: renamed from: y */
    public boolean f163268y;

    /* JADX INFO: renamed from: z */
    public long f163269z;

    /* JADX INFO: renamed from: l.rhx$b */
    public final class C19850b implements kke {
        public C19850b() {
        }

        @Override // p153l.kke
        /* JADX INFO: renamed from: a */
        public void mo150089a(int i) throws ParserException {
            rhx.this.m181544o(i);
        }

        @Override // p153l.kke
        /* JADX INFO: renamed from: b */
        public void mo150090b(int i, double d) throws ParserException {
            rhx.this.m181546r(i, d);
        }

        @Override // p153l.kke
        /* JADX INFO: renamed from: c */
        public void mo150091c(int i, long j) throws ParserException {
            rhx.this.m181551x(i, j);
        }

        @Override // p153l.kke
        /* JADX INFO: renamed from: d */
        public void mo150092d(int i, String str) throws ParserException {
            rhx.this.m181534G(i, str);
        }

        @Override // p153l.kke
        /* JADX INFO: renamed from: e */
        public void mo150093e(int i, long j, long j2) throws ParserException {
            rhx.this.m181533F(i, j, j2);
        }

        @Override // p153l.kke
        /* JADX INFO: renamed from: f */
        public int mo150094f(int i) {
            return rhx.this.m181548u(i);
        }

        @Override // p153l.kke
        /* JADX INFO: renamed from: g */
        public boolean mo150095g(int i) {
            return rhx.this.m181552z(i);
        }

        @Override // p153l.kke
        /* JADX INFO: renamed from: h */
        public void mo150096h(int i, int i2, asf asfVar) throws IOException {
            rhx.this.m181541l(i, i2, asfVar);
        }
    }

    /* JADX INFO: renamed from: l.rhx$c */
    public static final class C19851c {

        /* JADX INFO: renamed from: N */
        public byte[] f163284N;

        /* JADX INFO: renamed from: T */
        public ckj0 f163290T;

        /* JADX INFO: renamed from: U */
        public boolean f163291U;

        /* JADX INFO: renamed from: X */
        public qfj0 f163294X;

        /* JADX INFO: renamed from: Y */
        public int f163295Y;

        /* JADX INFO: renamed from: a */
        public String f163296a;

        /* JADX INFO: renamed from: b */
        public String f163297b;

        /* JADX INFO: renamed from: c */
        public int f163298c;

        /* JADX INFO: renamed from: d */
        public int f163299d;

        /* JADX INFO: renamed from: e */
        public int f163300e;

        /* JADX INFO: renamed from: f */
        public int f163301f;

        /* JADX INFO: renamed from: g */
        public int f163302g;

        /* JADX INFO: renamed from: h */
        public boolean f163303h;

        /* JADX INFO: renamed from: i */
        public byte[] f163304i;

        /* JADX INFO: renamed from: j */
        public qfj0.C19562a f163305j;

        /* JADX INFO: renamed from: k */
        public byte[] f163306k;

        /* JADX INFO: renamed from: l */
        public DrmInitData f163307l;

        /* JADX INFO: renamed from: m */
        public int f163308m = -1;

        /* JADX INFO: renamed from: n */
        public int f163309n = -1;

        /* JADX INFO: renamed from: o */
        public int f163310o = -1;

        /* JADX INFO: renamed from: p */
        public int f163311p = -1;

        /* JADX INFO: renamed from: q */
        public int f163312q = 0;

        /* JADX INFO: renamed from: r */
        public int f163313r = -1;

        /* JADX INFO: renamed from: s */
        public float f163314s = 0.0f;

        /* JADX INFO: renamed from: t */
        public float f163315t = 0.0f;

        /* JADX INFO: renamed from: u */
        public float f163316u = 0.0f;

        /* JADX INFO: renamed from: v */
        public byte[] f163317v = null;

        /* JADX INFO: renamed from: w */
        public int f163318w = -1;

        /* JADX INFO: renamed from: x */
        public boolean f163319x = false;

        /* JADX INFO: renamed from: y */
        public int f163320y = -1;

        /* JADX INFO: renamed from: z */
        public int f163321z = -1;

        /* JADX INFO: renamed from: A */
        public int f163271A = -1;

        /* JADX INFO: renamed from: B */
        public int f163272B = 1000;

        /* JADX INFO: renamed from: C */
        public int f163273C = 200;

        /* JADX INFO: renamed from: D */
        public float f163274D = -1.0f;

        /* JADX INFO: renamed from: E */
        public float f163275E = -1.0f;

        /* JADX INFO: renamed from: F */
        public float f163276F = -1.0f;

        /* JADX INFO: renamed from: G */
        public float f163277G = -1.0f;

        /* JADX INFO: renamed from: H */
        public float f163278H = -1.0f;

        /* JADX INFO: renamed from: I */
        public float f163279I = -1.0f;

        /* JADX INFO: renamed from: J */
        public float f163280J = -1.0f;

        /* JADX INFO: renamed from: K */
        public float f163281K = -1.0f;

        /* JADX INFO: renamed from: L */
        public float f163282L = -1.0f;

        /* JADX INFO: renamed from: M */
        public float f163283M = -1.0f;

        /* JADX INFO: renamed from: O */
        public int f163285O = 1;

        /* JADX INFO: renamed from: P */
        public int f163286P = -1;

        /* JADX INFO: renamed from: Q */
        public int f163287Q = TXRecordCommon.AUDIO_SAMPLERATE_8000;

        /* JADX INFO: renamed from: R */
        public long f163288R = 0;

        /* JADX INFO: renamed from: S */
        public long f163289S = 0;

        /* JADX INFO: renamed from: V */
        public boolean f163292V = true;

        /* JADX INFO: renamed from: W */
        public String f163293W = "eng";

        /* JADX INFO: renamed from: k */
        public static Pair<String, List<byte[]>> m181558k(ig60 ig60Var) throws ParserException {
            try {
                ig60Var.m139809V(16);
                long jM139834x = ig60Var.m139834x();
                if (jM139834x == 1482049860) {
                    return new Pair<>(DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_DIVX, null);
                }
                if (jM139834x == 859189832) {
                    return new Pair<>(DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_3GP, null);
                }
                if (jM139834x != 826496599) {
                    kyv.m152151i("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair<>("video/x-unknown", null);
                }
                byte[] bArrM139815e = ig60Var.m139815e();
                for (int iM139816f = ig60Var.m139816f() + 20; iM139816f < bArrM139815e.length - 4; iM139816f++) {
                    if (bArrM139815e[iM139816f] == 0 && bArrM139815e[iM139816f + 1] == 0 && bArrM139815e[iM139816f + 2] == 1 && bArrM139815e[iM139816f + 3] == 15) {
                        return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrM139815e, iM139816f, bArrM139815e.length)));
                    }
                }
                throw ParserException.createForMalformedContainer("Failed to find FourCC VC1 initialization data", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing FourCC private data", null);
            }
        }

        /* JADX INFO: renamed from: l */
        public static boolean m181559l(ig60 ig60Var) throws ParserException {
            try {
                int iM139836z = ig60Var.m139836z();
                if (iM139836z == 1) {
                    return true;
                }
                if (iM139836z == 65534) {
                    ig60Var.m139808U(24);
                    if (ig60Var.m139788A() == rhx.f163214h0.getMostSignificantBits() && ig60Var.m139788A() == rhx.f163214h0.getLeastSignificantBits()) {
                        return true;
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing MS/ACM codec private", null);
            }
        }

        /* JADX INFO: renamed from: m */
        public static List<byte[]> m181560m(byte[] bArr) throws ParserException {
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
        public final void m181561f() {
            w11.m204369e(this.f163294X);
        }

        @EnsuresNonNull({"codecPrivate"})
        /* JADX INFO: renamed from: g */
        public final byte[] m181562g(String str) throws ParserException {
            byte[] bArr = this.f163306k;
            if (bArr != null) {
                return bArr;
            }
            throw ParserException.createForMalformedContainer("Missing CodecPrivate for codec " + str, null);
        }

        @Nullable
        /* JADX INFO: renamed from: h */
        public final byte[] m181563h() {
            if (this.f163274D == -1.0f || this.f163275E == -1.0f || this.f163276F == -1.0f || this.f163277G == -1.0f || this.f163278H == -1.0f || this.f163279I == -1.0f || this.f163280J == -1.0f || this.f163281K == -1.0f || this.f163282L == -1.0f || this.f163283M == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.putShort((short) ((this.f163274D * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f163275E * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f163276F * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f163277G * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f163278H * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f163279I * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f163280J * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f163281K * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) (this.f163282L + 0.5f));
            byteBufferOrder.putShort((short) (this.f163283M + 0.5f));
            byteBufferOrder.putShort((short) this.f163272B);
            byteBufferOrder.putShort((short) this.f163273C);
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
        public void m181564i(bsf bsfVar, int i) throws ParserException {
            byte b;
            List<byte[]> listSingletonList;
            String str;
            int i2;
            List<byte[]> list;
            String str2;
            String str3;
            int i3;
            C1894k.b bVar;
            int i4;
            int iIntValue;
            int i5;
            float f;
            int i6;
            int i7;
            int i8;
            c7e c7eVarM108303a;
            String str4 = this.f163297b;
            str4.getClass();
            int iM105133f0 = 4;
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
                    byte[] bArr = this.f163306k;
                    listSingletonList = bArr == null ? null : Collections.singletonList(bArr);
                    str5 = "video/mp4v-es";
                    str = null;
                    i2 = -1;
                    iM105133f0 = -1;
                    if (this.f163284N != null && (c7eVarM108303a = c7e.m108303a(new ig60(this.f163284N))) != null) {
                        str = c7eVarM108303a.f80108c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z = this.f163292V;
                    if (this.f163291U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i9 = i3 | (z ? 1 : 0);
                    bVar = new C1894k.b();
                    if (!kb00.m149014o(str3)) {
                        bVar.m10377J(this.f163285O).m10401h0(this.f163287Q).m10394a0(iM105133f0);
                        i4 = 1;
                    } else if (kb00.m149018s(str3)) {
                        if (this.f163312q == 0) {
                            i7 = this.f163310o;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.f163308m;
                            }
                            this.f163310o = i7;
                            i8 = this.f163311p;
                            if (i8 == -1) {
                                i8 = this.f163309n;
                            }
                            this.f163311p = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.f163310o;
                        if (i5 != iIntValue || (i6 = this.f163311p) == iIntValue) {
                            f = -1.0f;
                        } else {
                            f = (this.f163309n * i5) / (this.f163308m * i6);
                        }
                        df5 df5Var = this.f163319x ? new df5(this.f163320y, this.f163271A, this.f163321z, m181563h()) : null;
                        if (this.f163296a != null && rhx.f163215i0.containsKey(this.f163296a)) {
                            iIntValue = ((Integer) rhx.f163215i0.get(this.f163296a)).intValue();
                        }
                        if (this.f163313r == 0 && Float.compare(this.f163314s, 0.0f) == 0 && Float.compare(this.f163315t, 0.0f) == 0) {
                            if (Float.compare(this.f163316u, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f163315t, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f163315t, -180.0f) != 0 || Float.compare(this.f163315t, 180.0f) == 0) {
                                iIntValue = 180;
                            } else if (Float.compare(this.f163315t, -90.0f) == 0) {
                                iIntValue = 270;
                            }
                        }
                        bVar.m10407n0(this.f163308m).m10386S(this.f163309n).m10396c0(f).m10399f0(iIntValue).m10397d0(this.f163317v).m10403j0(this.f163318w).m10379L(df5Var);
                        i4 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3) && !"text/x-ssa".equals(str3) && !"text/vtt".equals(str3) && !"application/vobsub".equals(str3) && !"application/pgs".equals(str3) && !"application/dvbsubs".equals(str3)) {
                            throw ParserException.createForMalformedContainer("Unexpected MIME type.", null);
                        }
                        i4 = 3;
                    }
                    if (this.f163296a != null && !rhx.f163215i0.containsKey(this.f163296a)) {
                        bVar.m10390W(this.f163296a);
                    }
                    C1894k c1894kM10374G = bVar.m10387T(i).m10400g0(str3).m10392Y(i2).m10391X(this.f163293W).m10402i0(i9).m10389V(listSingletonList).m10378K(str).m10382O(this.f163307l).m10374G();
                    qfj0 qfj0VarMo11416b = bsfVar.mo11416b(this.f163298c, i4);
                    this.f163294X = qfj0VarMo11416b;
                    qfj0VarMo11416b.mo11164b(c1894kM10374G);
                    return;
                case 2:
                    if (m181559l(new ig60(m181562g(this.f163297b)))) {
                        iM105133f0 = bmk0.m105133f0(this.f163286P);
                        if (iM105133f0 != 0) {
                            listSingletonList = null;
                            str = null;
                            i2 = -1;
                            if (this.f163284N != null) {
                                str = c7eVarM108303a.f80108c;
                                str5 = "video/dolby-vision";
                            }
                            str3 = str5;
                            boolean z2 = this.f163292V;
                            if (this.f163291U) {
                                i3 = 2;
                            } else {
                                i3 = 0;
                            }
                            int i10 = i3 | (z2 ? 1 : 0);
                            bVar = new C1894k.b();
                            if (!kb00.m149014o(str3)) {
                                if (kb00.m149018s(str3)) {
                                    if (this.f163312q == 0) {
                                        i7 = this.f163310o;
                                        iIntValue = -1;
                                        if (i7 == -1) {
                                            i7 = this.f163308m;
                                        }
                                        this.f163310o = i7;
                                        i8 = this.f163311p;
                                        if (i8 == -1) {
                                            i8 = this.f163309n;
                                        }
                                        this.f163311p = i8;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    i5 = this.f163310o;
                                    if (i5 != iIntValue) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (this.f163319x) {
                                    }
                                    if (this.f163296a != null) {
                                        iIntValue = ((Integer) rhx.f163215i0.get(this.f163296a)).intValue();
                                    }
                                    if (this.f163313r == 0) {
                                        if (Float.compare(this.f163316u, 0.0f) == 0) {
                                            iIntValue = 0;
                                        } else if (Float.compare(this.f163315t, 90.0f) == 0) {
                                            iIntValue = 90;
                                        } else if (Float.compare(this.f163315t, -180.0f) != 0) {
                                            iIntValue = 180;
                                        } else {
                                            iIntValue = 180;
                                        }
                                    }
                                    bVar.m10407n0(this.f163308m).m10386S(this.f163309n).m10396c0(f).m10399f0(iIntValue).m10397d0(this.f163317v).m10403j0(this.f163318w).m10379L(df5Var);
                                    i4 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str3)) {
                                    }
                                    i4 = 3;
                                }
                                break;
                            } else {
                                bVar.m10377J(this.f163285O).m10401h0(this.f163287Q).m10394a0(iM105133f0);
                                i4 = 1;
                            }
                            if (this.f163296a != null) {
                                bVar.m10390W(this.f163296a);
                            }
                            C1894k c1894kM10374G2 = bVar.m10387T(i).m10400g0(str3).m10392Y(i2).m10391X(this.f163293W).m10402i0(i10).m10389V(listSingletonList).m10378K(str).m10382O(this.f163307l).m10374G();
                            qfj0 qfj0VarMo11416b2 = bsfVar.mo11416b(this.f163298c, i4);
                            this.f163294X = qfj0VarMo11416b2;
                            qfj0VarMo11416b2.mo11164b(c1894kM10374G2);
                            return;
                        }
                        kyv.m152151i("MatroskaExtractor", "Unsupported PCM bit depth: " + this.f163286P + ". Setting mimeType to audio/x-unknown");
                    } else {
                        kyv.m152151i("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                    }
                    listSingletonList = null;
                    str = null;
                    str5 = "audio/x-unknown";
                    i2 = -1;
                    iM105133f0 = -1;
                    if (this.f163284N != null) {
                        str = c7eVarM108303a.f80108c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z3 = this.f163292V;
                    if (this.f163291U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i11 = i3 | (z3 ? 1 : 0);
                    bVar = new C1894k.b();
                    if (!kb00.m149014o(str3)) {
                        if (kb00.m149018s(str3)) {
                            if (this.f163312q == 0) {
                                i7 = this.f163310o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f163308m;
                                }
                                this.f163310o = i7;
                                i8 = this.f163311p;
                                if (i8 == -1) {
                                    i8 = this.f163309n;
                                }
                                this.f163311p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f163310o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f163319x) {
                            }
                            if (this.f163296a != null) {
                                iIntValue = ((Integer) rhx.f163215i0.get(this.f163296a)).intValue();
                            }
                            if (this.f163313r == 0) {
                                if (Float.compare(this.f163316u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f163315t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f163315t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10407n0(this.f163308m).m10386S(this.f163309n).m10396c0(f).m10399f0(iIntValue).m10397d0(this.f163317v).m10403j0(this.f163318w).m10379L(df5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10377J(this.f163285O).m10401h0(this.f163287Q).m10394a0(iM105133f0);
                        i4 = 1;
                    }
                    if (this.f163296a != null) {
                        bVar.m10390W(this.f163296a);
                    }
                    C1894k c1894kM10374G3 = bVar.m10387T(i).m10400g0(str3).m10392Y(i2).m10391X(this.f163293W).m10402i0(i11).m10389V(listSingletonList).m10378K(str).m10382O(this.f163307l).m10374G();
                    qfj0 qfj0VarMo11416b3 = bsfVar.mo11416b(this.f163298c, i4);
                    this.f163294X = qfj0VarMo11416b3;
                    qfj0VarMo11416b3.mo11164b(c1894kM10374G3);
                    return;
                case 3:
                    this.f163290T = new ckj0();
                    str5 = "audio/true-hd";
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    iM105133f0 = -1;
                    if (this.f163284N != null) {
                        str = c7eVarM108303a.f80108c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z4 = this.f163292V;
                    if (this.f163291U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i12 = i3 | (z4 ? 1 : 0);
                    bVar = new C1894k.b();
                    if (!kb00.m149014o(str3)) {
                        if (kb00.m149018s(str3)) {
                            if (this.f163312q == 0) {
                                i7 = this.f163310o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f163308m;
                                }
                                this.f163310o = i7;
                                i8 = this.f163311p;
                                if (i8 == -1) {
                                    i8 = this.f163309n;
                                }
                                this.f163311p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f163310o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f163319x) {
                            }
                            if (this.f163296a != null) {
                                iIntValue = ((Integer) rhx.f163215i0.get(this.f163296a)).intValue();
                            }
                            if (this.f163313r == 0) {
                                if (Float.compare(this.f163316u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f163315t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f163315t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10407n0(this.f163308m).m10386S(this.f163309n).m10396c0(f).m10399f0(iIntValue).m10397d0(this.f163317v).m10403j0(this.f163318w).m10379L(df5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10377J(this.f163285O).m10401h0(this.f163287Q).m10394a0(iM105133f0);
                        i4 = 1;
                    }
                    if (this.f163296a != null) {
                        bVar.m10390W(this.f163296a);
                    }
                    C1894k c1894kM10374G4 = bVar.m10387T(i).m10400g0(str3).m10392Y(i2).m10391X(this.f163293W).m10402i0(i12).m10389V(listSingletonList).m10378K(str).m10382O(this.f163307l).m10374G();
                    qfj0 qfj0VarMo11416b4 = bsfVar.mo11416b(this.f163298c, i4);
                    this.f163294X = qfj0VarMo11416b4;
                    qfj0VarMo11416b4.mo11164b(c1894kM10374G4);
                    return;
                case 4:
                    listSingletonList = m181560m(m181562g(this.f163297b));
                    str5 = "audio/vorbis";
                    i2 = 8192;
                    str = null;
                    iM105133f0 = -1;
                    if (this.f163284N != null) {
                        str = c7eVarM108303a.f80108c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z5 = this.f163292V;
                    if (this.f163291U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i13 = i3 | (z5 ? 1 : 0);
                    bVar = new C1894k.b();
                    if (!kb00.m149014o(str3)) {
                        if (kb00.m149018s(str3)) {
                            if (this.f163312q == 0) {
                                i7 = this.f163310o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f163308m;
                                }
                                this.f163310o = i7;
                                i8 = this.f163311p;
                                if (i8 == -1) {
                                    i8 = this.f163309n;
                                }
                                this.f163311p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f163310o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f163319x) {
                            }
                            if (this.f163296a != null) {
                                iIntValue = ((Integer) rhx.f163215i0.get(this.f163296a)).intValue();
                            }
                            if (this.f163313r == 0) {
                                if (Float.compare(this.f163316u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f163315t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f163315t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10407n0(this.f163308m).m10386S(this.f163309n).m10396c0(f).m10399f0(iIntValue).m10397d0(this.f163317v).m10403j0(this.f163318w).m10379L(df5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10377J(this.f163285O).m10401h0(this.f163287Q).m10394a0(iM105133f0);
                        i4 = 1;
                    }
                    if (this.f163296a != null) {
                        bVar.m10390W(this.f163296a);
                    }
                    C1894k c1894kM10374G5 = bVar.m10387T(i).m10400g0(str3).m10392Y(i2).m10391X(this.f163293W).m10402i0(i13).m10389V(listSingletonList).m10378K(str).m10382O(this.f163307l).m10374G();
                    qfj0 qfj0VarMo11416b5 = bsfVar.mo11416b(this.f163298c, i4);
                    this.f163294X = qfj0VarMo11416b5;
                    qfj0VarMo11416b5.mo11164b(c1894kM10374G5);
                    return;
                case 5:
                    str5 = "audio/mpeg-L2";
                    listSingletonList = null;
                    str = null;
                    i2 = 4096;
                    iM105133f0 = -1;
                    if (this.f163284N != null) {
                        str = c7eVarM108303a.f80108c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z6 = this.f163292V;
                    if (this.f163291U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i14 = i3 | (z6 ? 1 : 0);
                    bVar = new C1894k.b();
                    if (!kb00.m149014o(str3)) {
                        if (kb00.m149018s(str3)) {
                            if (this.f163312q == 0) {
                                i7 = this.f163310o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f163308m;
                                }
                                this.f163310o = i7;
                                i8 = this.f163311p;
                                if (i8 == -1) {
                                    i8 = this.f163309n;
                                }
                                this.f163311p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f163310o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f163319x) {
                            }
                            if (this.f163296a != null) {
                                iIntValue = ((Integer) rhx.f163215i0.get(this.f163296a)).intValue();
                            }
                            if (this.f163313r == 0) {
                                if (Float.compare(this.f163316u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f163315t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f163315t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10407n0(this.f163308m).m10386S(this.f163309n).m10396c0(f).m10399f0(iIntValue).m10397d0(this.f163317v).m10403j0(this.f163318w).m10379L(df5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10377J(this.f163285O).m10401h0(this.f163287Q).m10394a0(iM105133f0);
                        i4 = 1;
                    }
                    if (this.f163296a != null) {
                        bVar.m10390W(this.f163296a);
                    }
                    C1894k c1894kM10374G6 = bVar.m10387T(i).m10400g0(str3).m10392Y(i2).m10391X(this.f163293W).m10402i0(i14).m10389V(listSingletonList).m10378K(str).m10382O(this.f163307l).m10374G();
                    qfj0 qfj0VarMo11416b6 = bsfVar.mo11416b(this.f163298c, i4);
                    this.f163294X = qfj0VarMo11416b6;
                    qfj0VarMo11416b6.mo11164b(c1894kM10374G6);
                    return;
                case 6:
                    str5 = DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG;
                    listSingletonList = null;
                    str = null;
                    i2 = 4096;
                    iM105133f0 = -1;
                    if (this.f163284N != null) {
                        str = c7eVarM108303a.f80108c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z7 = this.f163292V;
                    if (this.f163291U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i15 = i3 | (z7 ? 1 : 0);
                    bVar = new C1894k.b();
                    if (!kb00.m149014o(str3)) {
                        if (kb00.m149018s(str3)) {
                            if (this.f163312q == 0) {
                                i7 = this.f163310o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f163308m;
                                }
                                this.f163310o = i7;
                                i8 = this.f163311p;
                                if (i8 == -1) {
                                    i8 = this.f163309n;
                                }
                                this.f163311p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f163310o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f163319x) {
                            }
                            if (this.f163296a != null) {
                                iIntValue = ((Integer) rhx.f163215i0.get(this.f163296a)).intValue();
                            }
                            if (this.f163313r == 0) {
                                if (Float.compare(this.f163316u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f163315t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f163315t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10407n0(this.f163308m).m10386S(this.f163309n).m10396c0(f).m10399f0(iIntValue).m10397d0(this.f163317v).m10403j0(this.f163318w).m10379L(df5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10377J(this.f163285O).m10401h0(this.f163287Q).m10394a0(iM105133f0);
                        i4 = 1;
                    }
                    if (this.f163296a != null) {
                        bVar.m10390W(this.f163296a);
                    }
                    C1894k c1894kM10374G7 = bVar.m10387T(i).m10400g0(str3).m10392Y(i2).m10391X(this.f163293W).m10402i0(i15).m10389V(listSingletonList).m10378K(str).m10382O(this.f163307l).m10374G();
                    qfj0 qfj0VarMo11416b7 = bsfVar.mo11416b(this.f163298c, i4);
                    this.f163294X = qfj0VarMo11416b7;
                    qfj0VarMo11416b7.mo11164b(c1894kM10374G7);
                    return;
                case 7:
                    Pair<String, List<byte[]>> pairM181558k = m181558k(new ig60(m181562g(this.f163297b)));
                    str5 = (String) pairM181558k.first;
                    listSingletonList = (List) pairM181558k.second;
                    str = null;
                    i2 = -1;
                    iM105133f0 = -1;
                    if (this.f163284N != null) {
                        str = c7eVarM108303a.f80108c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z8 = this.f163292V;
                    if (this.f163291U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i16 = i3 | (z8 ? 1 : 0);
                    bVar = new C1894k.b();
                    if (!kb00.m149014o(str3)) {
                        if (kb00.m149018s(str3)) {
                            if (this.f163312q == 0) {
                                i7 = this.f163310o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f163308m;
                                }
                                this.f163310o = i7;
                                i8 = this.f163311p;
                                if (i8 == -1) {
                                    i8 = this.f163309n;
                                }
                                this.f163311p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f163310o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f163319x) {
                            }
                            if (this.f163296a != null) {
                                iIntValue = ((Integer) rhx.f163215i0.get(this.f163296a)).intValue();
                            }
                            if (this.f163313r == 0) {
                                if (Float.compare(this.f163316u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f163315t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f163315t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10407n0(this.f163308m).m10386S(this.f163309n).m10396c0(f).m10399f0(iIntValue).m10397d0(this.f163317v).m10403j0(this.f163318w).m10379L(df5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10377J(this.f163285O).m10401h0(this.f163287Q).m10394a0(iM105133f0);
                        i4 = 1;
                    }
                    if (this.f163296a != null) {
                        bVar.m10390W(this.f163296a);
                    }
                    C1894k c1894kM10374G8 = bVar.m10387T(i).m10400g0(str3).m10392Y(i2).m10391X(this.f163293W).m10402i0(i16).m10389V(listSingletonList).m10378K(str).m10382O(this.f163307l).m10374G();
                    qfj0 qfj0VarMo11416b8 = bsfVar.mo11416b(this.f163298c, i4);
                    this.f163294X = qfj0VarMo11416b8;
                    qfj0VarMo11416b8.mo11164b(c1894kM10374G8);
                    return;
                case 8:
                    byte[] bArr2 = new byte[4];
                    System.arraycopy(m181562g(this.f163297b), 0, bArr2, 0, 4);
                    listSingletonList = ImmutableList.m15740of(bArr2);
                    str = null;
                    str5 = "application/dvbsubs";
                    i2 = -1;
                    iM105133f0 = -1;
                    if (this.f163284N != null) {
                        str = c7eVarM108303a.f80108c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z9 = this.f163292V;
                    if (this.f163291U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i17 = i3 | (z9 ? 1 : 0);
                    bVar = new C1894k.b();
                    if (!kb00.m149014o(str3)) {
                        if (kb00.m149018s(str3)) {
                            if (this.f163312q == 0) {
                                i7 = this.f163310o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f163308m;
                                }
                                this.f163310o = i7;
                                i8 = this.f163311p;
                                if (i8 == -1) {
                                    i8 = this.f163309n;
                                }
                                this.f163311p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f163310o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f163319x) {
                            }
                            if (this.f163296a != null) {
                                iIntValue = ((Integer) rhx.f163215i0.get(this.f163296a)).intValue();
                            }
                            if (this.f163313r == 0) {
                                if (Float.compare(this.f163316u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f163315t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f163315t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10407n0(this.f163308m).m10386S(this.f163309n).m10396c0(f).m10399f0(iIntValue).m10397d0(this.f163317v).m10403j0(this.f163318w).m10379L(df5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10377J(this.f163285O).m10401h0(this.f163287Q).m10394a0(iM105133f0);
                        i4 = 1;
                    }
                    if (this.f163296a != null) {
                        bVar.m10390W(this.f163296a);
                    }
                    C1894k c1894kM10374G9 = bVar.m10387T(i).m10400g0(str3).m10392Y(i2).m10391X(this.f163293W).m10402i0(i17).m10389V(listSingletonList).m10378K(str).m10382O(this.f163307l).m10374G();
                    qfj0 qfj0VarMo11416b9 = bsfVar.mo11416b(this.f163298c, i4);
                    this.f163294X = qfj0VarMo11416b9;
                    qfj0VarMo11416b9.mo11164b(c1894kM10374G9);
                    return;
                case 10:
                    pp1 pp1VarM173175b = pp1.m173175b(new ig60(m181562g(this.f163297b)));
                    list = pp1VarM173175b.f153469a;
                    this.f163295Y = pp1VarM173175b.f153470b;
                    str2 = pp1VarM173175b.f153477i;
                    str5 = YtVideoEncoder.MIME_TYPE;
                    List<byte[]> list2 = list;
                    str = str2;
                    listSingletonList = list2;
                    i2 = -1;
                    iM105133f0 = -1;
                    if (this.f163284N != null) {
                        str = c7eVarM108303a.f80108c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z10 = this.f163292V;
                    if (this.f163291U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i18 = i3 | (z10 ? 1 : 0);
                    bVar = new C1894k.b();
                    if (!kb00.m149014o(str3)) {
                        if (kb00.m149018s(str3)) {
                            if (this.f163312q == 0) {
                                i7 = this.f163310o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f163308m;
                                }
                                this.f163310o = i7;
                                i8 = this.f163311p;
                                if (i8 == -1) {
                                    i8 = this.f163309n;
                                }
                                this.f163311p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f163310o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f163319x) {
                            }
                            if (this.f163296a != null) {
                                iIntValue = ((Integer) rhx.f163215i0.get(this.f163296a)).intValue();
                            }
                            if (this.f163313r == 0) {
                                if (Float.compare(this.f163316u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f163315t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f163315t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10407n0(this.f163308m).m10386S(this.f163309n).m10396c0(f).m10399f0(iIntValue).m10397d0(this.f163317v).m10403j0(this.f163318w).m10379L(df5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10377J(this.f163285O).m10401h0(this.f163287Q).m10394a0(iM105133f0);
                        i4 = 1;
                    }
                    if (this.f163296a != null) {
                        bVar.m10390W(this.f163296a);
                    }
                    C1894k c1894kM10374G10 = bVar.m10387T(i).m10400g0(str3).m10392Y(i2).m10391X(this.f163293W).m10402i0(i18).m10389V(listSingletonList).m10378K(str).m10382O(this.f163307l).m10374G();
                    qfj0 qfj0VarMo11416b10 = bsfVar.mo11416b(this.f163298c, i4);
                    this.f163294X = qfj0VarMo11416b10;
                    qfj0VarMo11416b10.mo11164b(c1894kM10374G10);
                    return;
                case 11:
                    listSingletonList = ImmutableList.m15740of(m181562g(this.f163297b));
                    str = null;
                    str5 = "application/vobsub";
                    i2 = -1;
                    iM105133f0 = -1;
                    if (this.f163284N != null) {
                        str = c7eVarM108303a.f80108c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z11 = this.f163292V;
                    if (this.f163291U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i19 = i3 | (z11 ? 1 : 0);
                    bVar = new C1894k.b();
                    if (!kb00.m149014o(str3)) {
                        if (kb00.m149018s(str3)) {
                            if (this.f163312q == 0) {
                                i7 = this.f163310o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f163308m;
                                }
                                this.f163310o = i7;
                                i8 = this.f163311p;
                                if (i8 == -1) {
                                    i8 = this.f163309n;
                                }
                                this.f163311p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f163310o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f163319x) {
                            }
                            if (this.f163296a != null) {
                                iIntValue = ((Integer) rhx.f163215i0.get(this.f163296a)).intValue();
                            }
                            if (this.f163313r == 0) {
                                if (Float.compare(this.f163316u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f163315t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f163315t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10407n0(this.f163308m).m10386S(this.f163309n).m10396c0(f).m10399f0(iIntValue).m10397d0(this.f163317v).m10403j0(this.f163318w).m10379L(df5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10377J(this.f163285O).m10401h0(this.f163287Q).m10394a0(iM105133f0);
                        i4 = 1;
                    }
                    if (this.f163296a != null) {
                        bVar.m10390W(this.f163296a);
                    }
                    C1894k c1894kM10374G11 = bVar.m10387T(i).m10400g0(str3).m10392Y(i2).m10391X(this.f163293W).m10402i0(i19).m10389V(listSingletonList).m10378K(str).m10382O(this.f163307l).m10374G();
                    qfj0 qfj0VarMo11416b11 = bsfVar.mo11416b(this.f163298c, i4);
                    this.f163294X = qfj0VarMo11416b11;
                    qfj0VarMo11416b11.mo11164b(c1894kM10374G11);
                    return;
                case 12:
                    str5 = "audio/vnd.dts.hd";
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    iM105133f0 = -1;
                    if (this.f163284N != null) {
                        str = c7eVarM108303a.f80108c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z12 = this.f163292V;
                    if (this.f163291U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i110 = i3 | (z12 ? 1 : 0);
                    bVar = new C1894k.b();
                    if (!kb00.m149014o(str3)) {
                        if (kb00.m149018s(str3)) {
                            if (this.f163312q == 0) {
                                i7 = this.f163310o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f163308m;
                                }
                                this.f163310o = i7;
                                i8 = this.f163311p;
                                if (i8 == -1) {
                                    i8 = this.f163309n;
                                }
                                this.f163311p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f163310o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f163319x) {
                            }
                            if (this.f163296a != null) {
                                iIntValue = ((Integer) rhx.f163215i0.get(this.f163296a)).intValue();
                            }
                            if (this.f163313r == 0) {
                                if (Float.compare(this.f163316u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f163315t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f163315t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10407n0(this.f163308m).m10386S(this.f163309n).m10396c0(f).m10399f0(iIntValue).m10397d0(this.f163317v).m10403j0(this.f163318w).m10379L(df5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10377J(this.f163285O).m10401h0(this.f163287Q).m10394a0(iM105133f0);
                        i4 = 1;
                    }
                    if (this.f163296a != null) {
                        bVar.m10390W(this.f163296a);
                    }
                    C1894k c1894kM10374G12 = bVar.m10387T(i).m10400g0(str3).m10392Y(i2).m10391X(this.f163293W).m10402i0(i110).m10389V(listSingletonList).m10378K(str).m10382O(this.f163307l).m10374G();
                    qfj0 qfj0VarMo11416b12 = bsfVar.mo11416b(this.f163298c, i4);
                    this.f163294X = qfj0VarMo11416b12;
                    qfj0VarMo11416b12.mo11164b(c1894kM10374G12);
                    return;
                case 13:
                    listSingletonList = Collections.singletonList(m181562g(this.f163297b));
                    C21738z1.b bVarM218271f = C21738z1.m218271f(this.f163306k);
                    this.f163287Q = bVarM218271f.f202473a;
                    this.f163285O = bVarM218271f.f202474b;
                    str = bVarM218271f.f202475c;
                    str5 = "audio/mp4a-latm";
                    i2 = -1;
                    iM105133f0 = -1;
                    if (this.f163284N != null) {
                        str = c7eVarM108303a.f80108c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z13 = this.f163292V;
                    if (this.f163291U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i111 = i3 | (z13 ? 1 : 0);
                    bVar = new C1894k.b();
                    if (!kb00.m149014o(str3)) {
                        if (kb00.m149018s(str3)) {
                            if (this.f163312q == 0) {
                                i7 = this.f163310o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f163308m;
                                }
                                this.f163310o = i7;
                                i8 = this.f163311p;
                                if (i8 == -1) {
                                    i8 = this.f163309n;
                                }
                                this.f163311p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f163310o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f163319x) {
                            }
                            if (this.f163296a != null) {
                                iIntValue = ((Integer) rhx.f163215i0.get(this.f163296a)).intValue();
                            }
                            if (this.f163313r == 0) {
                                if (Float.compare(this.f163316u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f163315t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f163315t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10407n0(this.f163308m).m10386S(this.f163309n).m10396c0(f).m10399f0(iIntValue).m10397d0(this.f163317v).m10403j0(this.f163318w).m10379L(df5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10377J(this.f163285O).m10401h0(this.f163287Q).m10394a0(iM105133f0);
                        i4 = 1;
                    }
                    if (this.f163296a != null) {
                        bVar.m10390W(this.f163296a);
                    }
                    C1894k c1894kM10374G13 = bVar.m10387T(i).m10400g0(str3).m10392Y(i2).m10391X(this.f163293W).m10402i0(i111).m10389V(listSingletonList).m10378K(str).m10382O(this.f163307l).m10374G();
                    qfj0 qfj0VarMo11416b13 = bsfVar.mo11416b(this.f163298c, i4);
                    this.f163294X = qfj0VarMo11416b13;
                    qfj0VarMo11416b13.mo11164b(c1894kM10374G13);
                    return;
                case 14:
                    str5 = "audio/ac3";
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    iM105133f0 = -1;
                    if (this.f163284N != null) {
                        str = c7eVarM108303a.f80108c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z14 = this.f163292V;
                    if (this.f163291U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i112 = i3 | (z14 ? 1 : 0);
                    bVar = new C1894k.b();
                    if (!kb00.m149014o(str3)) {
                        if (kb00.m149018s(str3)) {
                            if (this.f163312q == 0) {
                                i7 = this.f163310o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f163308m;
                                }
                                this.f163310o = i7;
                                i8 = this.f163311p;
                                if (i8 == -1) {
                                    i8 = this.f163309n;
                                }
                                this.f163311p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f163310o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f163319x) {
                            }
                            if (this.f163296a != null) {
                                iIntValue = ((Integer) rhx.f163215i0.get(this.f163296a)).intValue();
                            }
                            if (this.f163313r == 0) {
                                if (Float.compare(this.f163316u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f163315t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f163315t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10407n0(this.f163308m).m10386S(this.f163309n).m10396c0(f).m10399f0(iIntValue).m10397d0(this.f163317v).m10403j0(this.f163318w).m10379L(df5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10377J(this.f163285O).m10401h0(this.f163287Q).m10394a0(iM105133f0);
                        i4 = 1;
                    }
                    if (this.f163296a != null) {
                        bVar.m10390W(this.f163296a);
                    }
                    C1894k c1894kM10374G14 = bVar.m10387T(i).m10400g0(str3).m10392Y(i2).m10391X(this.f163293W).m10402i0(i112).m10389V(listSingletonList).m10378K(str).m10382O(this.f163307l).m10374G();
                    qfj0 qfj0VarMo11416b14 = bsfVar.mo11416b(this.f163298c, i4);
                    this.f163294X = qfj0VarMo11416b14;
                    qfj0VarMo11416b14.mo11164b(c1894kM10374G14);
                    return;
                case 15:
                case 21:
                    str5 = "audio/vnd.dts";
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    iM105133f0 = -1;
                    if (this.f163284N != null) {
                        str = c7eVarM108303a.f80108c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z15 = this.f163292V;
                    if (this.f163291U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i113 = i3 | (z15 ? 1 : 0);
                    bVar = new C1894k.b();
                    if (!kb00.m149014o(str3)) {
                        if (kb00.m149018s(str3)) {
                            if (this.f163312q == 0) {
                                i7 = this.f163310o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f163308m;
                                }
                                this.f163310o = i7;
                                i8 = this.f163311p;
                                if (i8 == -1) {
                                    i8 = this.f163309n;
                                }
                                this.f163311p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f163310o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f163319x) {
                            }
                            if (this.f163296a != null) {
                                iIntValue = ((Integer) rhx.f163215i0.get(this.f163296a)).intValue();
                            }
                            if (this.f163313r == 0) {
                                if (Float.compare(this.f163316u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f163315t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f163315t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10407n0(this.f163308m).m10386S(this.f163309n).m10396c0(f).m10399f0(iIntValue).m10397d0(this.f163317v).m10403j0(this.f163318w).m10379L(df5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10377J(this.f163285O).m10401h0(this.f163287Q).m10394a0(iM105133f0);
                        i4 = 1;
                    }
                    if (this.f163296a != null) {
                        bVar.m10390W(this.f163296a);
                    }
                    C1894k c1894kM10374G15 = bVar.m10387T(i).m10400g0(str3).m10392Y(i2).m10391X(this.f163293W).m10402i0(i113).m10389V(listSingletonList).m10378K(str).m10382O(this.f163307l).m10374G();
                    qfj0 qfj0VarMo11416b15 = bsfVar.mo11416b(this.f163298c, i4);
                    this.f163294X = qfj0VarMo11416b15;
                    qfj0VarMo11416b15.mo11164b(c1894kM10374G15);
                    return;
                case 16:
                    str5 = "video/av01";
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    iM105133f0 = -1;
                    if (this.f163284N != null) {
                        str = c7eVarM108303a.f80108c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z16 = this.f163292V;
                    if (this.f163291U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i114 = i3 | (z16 ? 1 : 0);
                    bVar = new C1894k.b();
                    if (!kb00.m149014o(str3)) {
                        if (kb00.m149018s(str3)) {
                            if (this.f163312q == 0) {
                                i7 = this.f163310o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f163308m;
                                }
                                this.f163310o = i7;
                                i8 = this.f163311p;
                                if (i8 == -1) {
                                    i8 = this.f163309n;
                                }
                                this.f163311p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f163310o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f163319x) {
                            }
                            if (this.f163296a != null) {
                                iIntValue = ((Integer) rhx.f163215i0.get(this.f163296a)).intValue();
                            }
                            if (this.f163313r == 0) {
                                if (Float.compare(this.f163316u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f163315t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f163315t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10407n0(this.f163308m).m10386S(this.f163309n).m10396c0(f).m10399f0(iIntValue).m10397d0(this.f163317v).m10403j0(this.f163318w).m10379L(df5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10377J(this.f163285O).m10401h0(this.f163287Q).m10394a0(iM105133f0);
                        i4 = 1;
                    }
                    if (this.f163296a != null) {
                        bVar.m10390W(this.f163296a);
                    }
                    C1894k c1894kM10374G16 = bVar.m10387T(i).m10400g0(str3).m10392Y(i2).m10391X(this.f163293W).m10402i0(i114).m10389V(listSingletonList).m10378K(str).m10382O(this.f163307l).m10374G();
                    qfj0 qfj0VarMo11416b16 = bsfVar.mo11416b(this.f163298c, i4);
                    this.f163294X = qfj0VarMo11416b16;
                    qfj0VarMo11416b16.mo11164b(c1894kM10374G16);
                    return;
                case 17:
                    str5 = "video/x-vnd.on2.vp8";
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    iM105133f0 = -1;
                    if (this.f163284N != null) {
                        str = c7eVarM108303a.f80108c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z17 = this.f163292V;
                    if (this.f163291U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i115 = i3 | (z17 ? 1 : 0);
                    bVar = new C1894k.b();
                    if (!kb00.m149014o(str3)) {
                        if (kb00.m149018s(str3)) {
                            if (this.f163312q == 0) {
                                i7 = this.f163310o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f163308m;
                                }
                                this.f163310o = i7;
                                i8 = this.f163311p;
                                if (i8 == -1) {
                                    i8 = this.f163309n;
                                }
                                this.f163311p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f163310o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f163319x) {
                            }
                            if (this.f163296a != null) {
                                iIntValue = ((Integer) rhx.f163215i0.get(this.f163296a)).intValue();
                            }
                            if (this.f163313r == 0) {
                                if (Float.compare(this.f163316u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f163315t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f163315t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10407n0(this.f163308m).m10386S(this.f163309n).m10396c0(f).m10399f0(iIntValue).m10397d0(this.f163317v).m10403j0(this.f163318w).m10379L(df5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10377J(this.f163285O).m10401h0(this.f163287Q).m10394a0(iM105133f0);
                        i4 = 1;
                    }
                    if (this.f163296a != null) {
                        bVar.m10390W(this.f163296a);
                    }
                    C1894k c1894kM10374G17 = bVar.m10387T(i).m10400g0(str3).m10392Y(i2).m10391X(this.f163293W).m10402i0(i115).m10389V(listSingletonList).m10378K(str).m10382O(this.f163307l).m10374G();
                    qfj0 qfj0VarMo11416b17 = bsfVar.mo11416b(this.f163298c, i4);
                    this.f163294X = qfj0VarMo11416b17;
                    qfj0VarMo11416b17.mo11164b(c1894kM10374G17);
                    return;
                case 18:
                    str5 = "video/x-vnd.on2.vp9";
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    iM105133f0 = -1;
                    if (this.f163284N != null) {
                        str = c7eVarM108303a.f80108c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z18 = this.f163292V;
                    if (this.f163291U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i116 = i3 | (z18 ? 1 : 0);
                    bVar = new C1894k.b();
                    if (!kb00.m149014o(str3)) {
                        if (kb00.m149018s(str3)) {
                            if (this.f163312q == 0) {
                                i7 = this.f163310o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f163308m;
                                }
                                this.f163310o = i7;
                                i8 = this.f163311p;
                                if (i8 == -1) {
                                    i8 = this.f163309n;
                                }
                                this.f163311p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f163310o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f163319x) {
                            }
                            if (this.f163296a != null) {
                                iIntValue = ((Integer) rhx.f163215i0.get(this.f163296a)).intValue();
                            }
                            if (this.f163313r == 0) {
                                if (Float.compare(this.f163316u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f163315t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f163315t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10407n0(this.f163308m).m10386S(this.f163309n).m10396c0(f).m10399f0(iIntValue).m10397d0(this.f163317v).m10403j0(this.f163318w).m10379L(df5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10377J(this.f163285O).m10401h0(this.f163287Q).m10394a0(iM105133f0);
                        i4 = 1;
                    }
                    if (this.f163296a != null) {
                        bVar.m10390W(this.f163296a);
                    }
                    C1894k c1894kM10374G18 = bVar.m10387T(i).m10400g0(str3).m10392Y(i2).m10391X(this.f163293W).m10402i0(i116).m10389V(listSingletonList).m10378K(str).m10382O(this.f163307l).m10374G();
                    qfj0 qfj0VarMo11416b18 = bsfVar.mo11416b(this.f163298c, i4);
                    this.f163294X = qfj0VarMo11416b18;
                    qfj0VarMo11416b18.mo11164b(c1894kM10374G18);
                    return;
                case 19:
                    listSingletonList = null;
                    str = null;
                    str5 = "application/pgs";
                    i2 = -1;
                    iM105133f0 = -1;
                    if (this.f163284N != null) {
                        str = c7eVarM108303a.f80108c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z19 = this.f163292V;
                    if (this.f163291U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i117 = i3 | (z19 ? 1 : 0);
                    bVar = new C1894k.b();
                    if (!kb00.m149014o(str3)) {
                        if (kb00.m149018s(str3)) {
                            if (this.f163312q == 0) {
                                i7 = this.f163310o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f163308m;
                                }
                                this.f163310o = i7;
                                i8 = this.f163311p;
                                if (i8 == -1) {
                                    i8 = this.f163309n;
                                }
                                this.f163311p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f163310o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f163319x) {
                            }
                            if (this.f163296a != null) {
                                iIntValue = ((Integer) rhx.f163215i0.get(this.f163296a)).intValue();
                            }
                            if (this.f163313r == 0) {
                                if (Float.compare(this.f163316u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f163315t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f163315t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10407n0(this.f163308m).m10386S(this.f163309n).m10396c0(f).m10399f0(iIntValue).m10397d0(this.f163317v).m10403j0(this.f163318w).m10379L(df5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10377J(this.f163285O).m10401h0(this.f163287Q).m10394a0(iM105133f0);
                        i4 = 1;
                    }
                    if (this.f163296a != null) {
                        bVar.m10390W(this.f163296a);
                    }
                    C1894k c1894kM10374G19 = bVar.m10387T(i).m10400g0(str3).m10392Y(i2).m10391X(this.f163293W).m10402i0(i117).m10389V(listSingletonList).m10378K(str).m10382O(this.f163307l).m10374G();
                    qfj0 qfj0VarMo11416b19 = bsfVar.mo11416b(this.f163298c, i4);
                    this.f163294X = qfj0VarMo11416b19;
                    qfj0VarMo11416b19.mo11164b(c1894kM10374G19);
                    return;
                case 20:
                    str5 = "video/x-unknown";
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    iM105133f0 = -1;
                    if (this.f163284N != null) {
                        str = c7eVarM108303a.f80108c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z110 = this.f163292V;
                    if (this.f163291U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i118 = i3 | (z110 ? 1 : 0);
                    bVar = new C1894k.b();
                    if (!kb00.m149014o(str3)) {
                        if (kb00.m149018s(str3)) {
                            if (this.f163312q == 0) {
                                i7 = this.f163310o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f163308m;
                                }
                                this.f163310o = i7;
                                i8 = this.f163311p;
                                if (i8 == -1) {
                                    i8 = this.f163309n;
                                }
                                this.f163311p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f163310o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f163319x) {
                            }
                            if (this.f163296a != null) {
                                iIntValue = ((Integer) rhx.f163215i0.get(this.f163296a)).intValue();
                            }
                            if (this.f163313r == 0) {
                                if (Float.compare(this.f163316u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f163315t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f163315t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10407n0(this.f163308m).m10386S(this.f163309n).m10396c0(f).m10399f0(iIntValue).m10397d0(this.f163317v).m10403j0(this.f163318w).m10379L(df5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10377J(this.f163285O).m10401h0(this.f163287Q).m10394a0(iM105133f0);
                        i4 = 1;
                    }
                    if (this.f163296a != null) {
                        bVar.m10390W(this.f163296a);
                    }
                    C1894k c1894kM10374G110 = bVar.m10387T(i).m10400g0(str3).m10392Y(i2).m10391X(this.f163293W).m10402i0(i118).m10389V(listSingletonList).m10378K(str).m10382O(this.f163307l).m10374G();
                    qfj0 qfj0VarMo11416b110 = bsfVar.mo11416b(this.f163298c, i4);
                    this.f163294X = qfj0VarMo11416b110;
                    qfj0VarMo11416b110.mo11164b(c1894kM10374G110);
                    return;
                case 22:
                    if (this.f163286P != 32) {
                        kyv.m152151i("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + this.f163286P + ". Setting mimeType to audio/x-unknown");
                        listSingletonList = null;
                        str = null;
                        str5 = "audio/x-unknown";
                        i2 = -1;
                        iM105133f0 = -1;
                        if (this.f163284N != null) {
                            str = c7eVarM108303a.f80108c;
                            str5 = "video/dolby-vision";
                        }
                        str3 = str5;
                        boolean z111 = this.f163292V;
                        if (this.f163291U) {
                            i3 = 2;
                        } else {
                            i3 = 0;
                        }
                        int i119 = i3 | (z111 ? 1 : 0);
                        bVar = new C1894k.b();
                        if (!kb00.m149014o(str3)) {
                            if (kb00.m149018s(str3)) {
                                if (this.f163312q == 0) {
                                    i7 = this.f163310o;
                                    iIntValue = -1;
                                    if (i7 == -1) {
                                        i7 = this.f163308m;
                                    }
                                    this.f163310o = i7;
                                    i8 = this.f163311p;
                                    if (i8 == -1) {
                                        i8 = this.f163309n;
                                    }
                                    this.f163311p = i8;
                                } else {
                                    iIntValue = -1;
                                }
                                i5 = this.f163310o;
                                if (i5 != iIntValue) {
                                    f = -1.0f;
                                } else {
                                    f = -1.0f;
                                }
                                if (this.f163319x) {
                                }
                                if (this.f163296a != null) {
                                    iIntValue = ((Integer) rhx.f163215i0.get(this.f163296a)).intValue();
                                }
                                if (this.f163313r == 0) {
                                    if (Float.compare(this.f163316u, 0.0f) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(this.f163315t, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(this.f163315t, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                bVar.m10407n0(this.f163308m).m10386S(this.f163309n).m10396c0(f).m10399f0(iIntValue).m10397d0(this.f163317v).m10403j0(this.f163318w).m10379L(df5Var);
                                i4 = 2;
                            } else {
                                if ("application/x-subrip".equals(str3)) {
                                }
                                i4 = 3;
                            }
                            break;
                        } else {
                            bVar.m10377J(this.f163285O).m10401h0(this.f163287Q).m10394a0(iM105133f0);
                            i4 = 1;
                        }
                        if (this.f163296a != null) {
                            bVar.m10390W(this.f163296a);
                        }
                        C1894k c1894kM10374G111 = bVar.m10387T(i).m10400g0(str3).m10392Y(i2).m10391X(this.f163293W).m10402i0(i119).m10389V(listSingletonList).m10378K(str).m10382O(this.f163307l).m10374G();
                        qfj0 qfj0VarMo11416b111 = bsfVar.mo11416b(this.f163298c, i4);
                        this.f163294X = qfj0VarMo11416b111;
                        qfj0VarMo11416b111.mo11164b(c1894kM10374G111);
                        return;
                    }
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    if (this.f163284N != null) {
                        str = c7eVarM108303a.f80108c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z112 = this.f163292V;
                    if (this.f163291U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i1110 = i3 | (z112 ? 1 : 0);
                    bVar = new C1894k.b();
                    if (!kb00.m149014o(str3)) {
                        if (kb00.m149018s(str3)) {
                            if (this.f163312q == 0) {
                                i7 = this.f163310o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f163308m;
                                }
                                this.f163310o = i7;
                                i8 = this.f163311p;
                                if (i8 == -1) {
                                    i8 = this.f163309n;
                                }
                                this.f163311p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f163310o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f163319x) {
                            }
                            if (this.f163296a != null) {
                                iIntValue = ((Integer) rhx.f163215i0.get(this.f163296a)).intValue();
                            }
                            if (this.f163313r == 0) {
                                if (Float.compare(this.f163316u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f163315t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f163315t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10407n0(this.f163308m).m10386S(this.f163309n).m10396c0(f).m10399f0(iIntValue).m10397d0(this.f163317v).m10403j0(this.f163318w).m10379L(df5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10377J(this.f163285O).m10401h0(this.f163287Q).m10394a0(iM105133f0);
                        i4 = 1;
                    }
                    if (this.f163296a != null) {
                        bVar.m10390W(this.f163296a);
                    }
                    C1894k c1894kM10374G112 = bVar.m10387T(i).m10400g0(str3).m10392Y(i2).m10391X(this.f163293W).m10402i0(i1110).m10389V(listSingletonList).m10378K(str).m10382O(this.f163307l).m10374G();
                    qfj0 qfj0VarMo11416b112 = bsfVar.mo11416b(this.f163298c, i4);
                    this.f163294X = qfj0VarMo11416b112;
                    qfj0VarMo11416b112.mo11164b(c1894kM10374G112);
                    return;
                case 23:
                    int i20 = this.f163286P;
                    if (i20 == 8) {
                        iM105133f0 = 3;
                    } else {
                        if (i20 != 16) {
                            kyv.m152151i("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + this.f163286P + ". Setting mimeType to audio/x-unknown");
                            listSingletonList = null;
                            str = null;
                            str5 = "audio/x-unknown";
                            i2 = -1;
                            iM105133f0 = -1;
                            if (this.f163284N != null) {
                                str = c7eVarM108303a.f80108c;
                                str5 = "video/dolby-vision";
                            }
                            str3 = str5;
                            boolean z113 = this.f163292V;
                            if (this.f163291U) {
                                i3 = 2;
                            } else {
                                i3 = 0;
                            }
                            int i1111 = i3 | (z113 ? 1 : 0);
                            bVar = new C1894k.b();
                            if (!kb00.m149014o(str3)) {
                                if (kb00.m149018s(str3)) {
                                    if (this.f163312q == 0) {
                                        i7 = this.f163310o;
                                        iIntValue = -1;
                                        if (i7 == -1) {
                                            i7 = this.f163308m;
                                        }
                                        this.f163310o = i7;
                                        i8 = this.f163311p;
                                        if (i8 == -1) {
                                            i8 = this.f163309n;
                                        }
                                        this.f163311p = i8;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    i5 = this.f163310o;
                                    if (i5 != iIntValue) {
                                        f = -1.0f;
                                    } else {
                                        f = -1.0f;
                                    }
                                    if (this.f163319x) {
                                    }
                                    if (this.f163296a != null) {
                                        iIntValue = ((Integer) rhx.f163215i0.get(this.f163296a)).intValue();
                                    }
                                    if (this.f163313r == 0) {
                                        if (Float.compare(this.f163316u, 0.0f) == 0) {
                                            iIntValue = 0;
                                        } else if (Float.compare(this.f163315t, 90.0f) == 0) {
                                            iIntValue = 90;
                                        } else if (Float.compare(this.f163315t, -180.0f) != 0) {
                                            iIntValue = 180;
                                        } else {
                                            iIntValue = 180;
                                        }
                                    }
                                    bVar.m10407n0(this.f163308m).m10386S(this.f163309n).m10396c0(f).m10399f0(iIntValue).m10397d0(this.f163317v).m10403j0(this.f163318w).m10379L(df5Var);
                                    i4 = 2;
                                } else {
                                    if ("application/x-subrip".equals(str3)) {
                                    }
                                    i4 = 3;
                                }
                                break;
                            } else {
                                bVar.m10377J(this.f163285O).m10401h0(this.f163287Q).m10394a0(iM105133f0);
                                i4 = 1;
                            }
                            if (this.f163296a != null) {
                                bVar.m10390W(this.f163296a);
                            }
                            C1894k c1894kM10374G113 = bVar.m10387T(i).m10400g0(str3).m10392Y(i2).m10391X(this.f163293W).m10402i0(i1111).m10389V(listSingletonList).m10378K(str).m10382O(this.f163307l).m10374G();
                            qfj0 qfj0VarMo11416b113 = bsfVar.mo11416b(this.f163298c, i4);
                            this.f163294X = qfj0VarMo11416b113;
                            qfj0VarMo11416b113.mo11164b(c1894kM10374G113);
                            return;
                        }
                        iM105133f0 = SQLiteDatabase.CREATE_IF_NECESSARY;
                    }
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    if (this.f163284N != null) {
                        str = c7eVarM108303a.f80108c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z114 = this.f163292V;
                    if (this.f163291U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i1112 = i3 | (z114 ? 1 : 0);
                    bVar = new C1894k.b();
                    if (!kb00.m149014o(str3)) {
                        if (kb00.m149018s(str3)) {
                            if (this.f163312q == 0) {
                                i7 = this.f163310o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f163308m;
                                }
                                this.f163310o = i7;
                                i8 = this.f163311p;
                                if (i8 == -1) {
                                    i8 = this.f163309n;
                                }
                                this.f163311p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f163310o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f163319x) {
                            }
                            if (this.f163296a != null) {
                                iIntValue = ((Integer) rhx.f163215i0.get(this.f163296a)).intValue();
                            }
                            if (this.f163313r == 0) {
                                if (Float.compare(this.f163316u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f163315t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f163315t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10407n0(this.f163308m).m10386S(this.f163309n).m10396c0(f).m10399f0(iIntValue).m10397d0(this.f163317v).m10403j0(this.f163318w).m10379L(df5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10377J(this.f163285O).m10401h0(this.f163287Q).m10394a0(iM105133f0);
                        i4 = 1;
                    }
                    if (this.f163296a != null) {
                        bVar.m10390W(this.f163296a);
                    }
                    C1894k c1894kM10374G114 = bVar.m10387T(i).m10400g0(str3).m10392Y(i2).m10391X(this.f163293W).m10402i0(i1112).m10389V(listSingletonList).m10378K(str).m10382O(this.f163307l).m10374G();
                    qfj0 qfj0VarMo11416b114 = bsfVar.mo11416b(this.f163298c, i4);
                    this.f163294X = qfj0VarMo11416b114;
                    qfj0VarMo11416b114.mo11164b(c1894kM10374G114);
                    return;
                case 24:
                    iM105133f0 = bmk0.m105133f0(this.f163286P);
                    if (iM105133f0 == 0) {
                        kyv.m152151i("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + this.f163286P + ". Setting mimeType to audio/x-unknown");
                        listSingletonList = null;
                        str = null;
                        str5 = "audio/x-unknown";
                        i2 = -1;
                        iM105133f0 = -1;
                        if (this.f163284N != null) {
                            str = c7eVarM108303a.f80108c;
                            str5 = "video/dolby-vision";
                        }
                        str3 = str5;
                        boolean z115 = this.f163292V;
                        if (this.f163291U) {
                            i3 = 2;
                        } else {
                            i3 = 0;
                        }
                        int i1113 = i3 | (z115 ? 1 : 0);
                        bVar = new C1894k.b();
                        if (!kb00.m149014o(str3)) {
                            if (kb00.m149018s(str3)) {
                                if (this.f163312q == 0) {
                                    i7 = this.f163310o;
                                    iIntValue = -1;
                                    if (i7 == -1) {
                                        i7 = this.f163308m;
                                    }
                                    this.f163310o = i7;
                                    i8 = this.f163311p;
                                    if (i8 == -1) {
                                        i8 = this.f163309n;
                                    }
                                    this.f163311p = i8;
                                } else {
                                    iIntValue = -1;
                                }
                                i5 = this.f163310o;
                                if (i5 != iIntValue) {
                                    f = -1.0f;
                                } else {
                                    f = -1.0f;
                                }
                                if (this.f163319x) {
                                }
                                if (this.f163296a != null) {
                                    iIntValue = ((Integer) rhx.f163215i0.get(this.f163296a)).intValue();
                                }
                                if (this.f163313r == 0) {
                                    if (Float.compare(this.f163316u, 0.0f) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(this.f163315t, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(this.f163315t, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                bVar.m10407n0(this.f163308m).m10386S(this.f163309n).m10396c0(f).m10399f0(iIntValue).m10397d0(this.f163317v).m10403j0(this.f163318w).m10379L(df5Var);
                                i4 = 2;
                            } else {
                                if ("application/x-subrip".equals(str3)) {
                                }
                                i4 = 3;
                            }
                            break;
                        } else {
                            bVar.m10377J(this.f163285O).m10401h0(this.f163287Q).m10394a0(iM105133f0);
                            i4 = 1;
                        }
                        if (this.f163296a != null) {
                            bVar.m10390W(this.f163296a);
                        }
                        C1894k c1894kM10374G115 = bVar.m10387T(i).m10400g0(str3).m10392Y(i2).m10391X(this.f163293W).m10402i0(i1113).m10389V(listSingletonList).m10378K(str).m10382O(this.f163307l).m10374G();
                        qfj0 qfj0VarMo11416b115 = bsfVar.mo11416b(this.f163298c, i4);
                        this.f163294X = qfj0VarMo11416b115;
                        qfj0VarMo11416b115.mo11164b(c1894kM10374G115);
                        return;
                    }
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    if (this.f163284N != null) {
                        str = c7eVarM108303a.f80108c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z116 = this.f163292V;
                    if (this.f163291U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i1114 = i3 | (z116 ? 1 : 0);
                    bVar = new C1894k.b();
                    if (!kb00.m149014o(str3)) {
                        if (kb00.m149018s(str3)) {
                            if (this.f163312q == 0) {
                                i7 = this.f163310o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f163308m;
                                }
                                this.f163310o = i7;
                                i8 = this.f163311p;
                                if (i8 == -1) {
                                    i8 = this.f163309n;
                                }
                                this.f163311p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f163310o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f163319x) {
                            }
                            if (this.f163296a != null) {
                                iIntValue = ((Integer) rhx.f163215i0.get(this.f163296a)).intValue();
                            }
                            if (this.f163313r == 0) {
                                if (Float.compare(this.f163316u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f163315t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f163315t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10407n0(this.f163308m).m10386S(this.f163309n).m10396c0(f).m10399f0(iIntValue).m10397d0(this.f163317v).m10403j0(this.f163318w).m10379L(df5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10377J(this.f163285O).m10401h0(this.f163287Q).m10394a0(iM105133f0);
                        i4 = 1;
                    }
                    if (this.f163296a != null) {
                        bVar.m10390W(this.f163296a);
                    }
                    C1894k c1894kM10374G116 = bVar.m10387T(i).m10400g0(str3).m10392Y(i2).m10391X(this.f163293W).m10402i0(i1114).m10389V(listSingletonList).m10378K(str).m10382O(this.f163307l).m10374G();
                    qfj0 qfj0VarMo11416b116 = bsfVar.mo11416b(this.f163298c, i4);
                    this.f163294X = qfj0VarMo11416b116;
                    qfj0VarMo11416b116.mo11164b(c1894kM10374G116);
                    return;
                case 25:
                    listSingletonList = ImmutableList.m15741of(rhx.f163211e0, m181562g(this.f163297b));
                    str = null;
                    str5 = "text/x-ssa";
                    i2 = -1;
                    iM105133f0 = -1;
                    if (this.f163284N != null) {
                        str = c7eVarM108303a.f80108c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z117 = this.f163292V;
                    if (this.f163291U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i1115 = i3 | (z117 ? 1 : 0);
                    bVar = new C1894k.b();
                    if (!kb00.m149014o(str3)) {
                        if (kb00.m149018s(str3)) {
                            if (this.f163312q == 0) {
                                i7 = this.f163310o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f163308m;
                                }
                                this.f163310o = i7;
                                i8 = this.f163311p;
                                if (i8 == -1) {
                                    i8 = this.f163309n;
                                }
                                this.f163311p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f163310o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f163319x) {
                            }
                            if (this.f163296a != null) {
                                iIntValue = ((Integer) rhx.f163215i0.get(this.f163296a)).intValue();
                            }
                            if (this.f163313r == 0) {
                                if (Float.compare(this.f163316u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f163315t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f163315t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10407n0(this.f163308m).m10386S(this.f163309n).m10396c0(f).m10399f0(iIntValue).m10397d0(this.f163317v).m10403j0(this.f163318w).m10379L(df5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10377J(this.f163285O).m10401h0(this.f163287Q).m10394a0(iM105133f0);
                        i4 = 1;
                    }
                    if (this.f163296a != null) {
                        bVar.m10390W(this.f163296a);
                    }
                    C1894k c1894kM10374G117 = bVar.m10387T(i).m10400g0(str3).m10392Y(i2).m10391X(this.f163293W).m10402i0(i1115).m10389V(listSingletonList).m10378K(str).m10382O(this.f163307l).m10374G();
                    qfj0 qfj0VarMo11416b117 = bsfVar.mo11416b(this.f163298c, i4);
                    this.f163294X = qfj0VarMo11416b117;
                    qfj0VarMo11416b117.mo11164b(c1894kM10374G117);
                    return;
                case 26:
                    e2l e2lVarM119112a = e2l.m119112a(new ig60(m181562g(this.f163297b)));
                    list = e2lVarM119112a.f91788a;
                    this.f163295Y = e2lVarM119112a.f91789b;
                    str2 = e2lVarM119112a.f91796i;
                    str5 = "video/hevc";
                    List<byte[]> list3 = list;
                    str = str2;
                    listSingletonList = list3;
                    i2 = -1;
                    iM105133f0 = -1;
                    if (this.f163284N != null) {
                        str = c7eVarM108303a.f80108c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z118 = this.f163292V;
                    if (this.f163291U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i1116 = i3 | (z118 ? 1 : 0);
                    bVar = new C1894k.b();
                    if (!kb00.m149014o(str3)) {
                        if (kb00.m149018s(str3)) {
                            if (this.f163312q == 0) {
                                i7 = this.f163310o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f163308m;
                                }
                                this.f163310o = i7;
                                i8 = this.f163311p;
                                if (i8 == -1) {
                                    i8 = this.f163309n;
                                }
                                this.f163311p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f163310o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f163319x) {
                            }
                            if (this.f163296a != null) {
                                iIntValue = ((Integer) rhx.f163215i0.get(this.f163296a)).intValue();
                            }
                            if (this.f163313r == 0) {
                                if (Float.compare(this.f163316u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f163315t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f163315t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10407n0(this.f163308m).m10386S(this.f163309n).m10396c0(f).m10399f0(iIntValue).m10397d0(this.f163317v).m10403j0(this.f163318w).m10379L(df5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10377J(this.f163285O).m10401h0(this.f163287Q).m10394a0(iM105133f0);
                        i4 = 1;
                    }
                    if (this.f163296a != null) {
                        bVar.m10390W(this.f163296a);
                    }
                    C1894k c1894kM10374G118 = bVar.m10387T(i).m10400g0(str3).m10392Y(i2).m10391X(this.f163293W).m10402i0(i1116).m10389V(listSingletonList).m10378K(str).m10382O(this.f163307l).m10374G();
                    qfj0 qfj0VarMo11416b118 = bsfVar.mo11416b(this.f163298c, i4);
                    this.f163294X = qfj0VarMo11416b118;
                    qfj0VarMo11416b118.mo11164b(c1894kM10374G118);
                    return;
                case 27:
                    str5 = "text/vtt";
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    iM105133f0 = -1;
                    if (this.f163284N != null) {
                        str = c7eVarM108303a.f80108c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z119 = this.f163292V;
                    if (this.f163291U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i1117 = i3 | (z119 ? 1 : 0);
                    bVar = new C1894k.b();
                    if (!kb00.m149014o(str3)) {
                        if (kb00.m149018s(str3)) {
                            if (this.f163312q == 0) {
                                i7 = this.f163310o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f163308m;
                                }
                                this.f163310o = i7;
                                i8 = this.f163311p;
                                if (i8 == -1) {
                                    i8 = this.f163309n;
                                }
                                this.f163311p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f163310o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f163319x) {
                            }
                            if (this.f163296a != null) {
                                iIntValue = ((Integer) rhx.f163215i0.get(this.f163296a)).intValue();
                            }
                            if (this.f163313r == 0) {
                                if (Float.compare(this.f163316u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f163315t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f163315t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10407n0(this.f163308m).m10386S(this.f163309n).m10396c0(f).m10399f0(iIntValue).m10397d0(this.f163317v).m10403j0(this.f163318w).m10379L(df5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10377J(this.f163285O).m10401h0(this.f163287Q).m10394a0(iM105133f0);
                        i4 = 1;
                    }
                    if (this.f163296a != null) {
                        bVar.m10390W(this.f163296a);
                    }
                    C1894k c1894kM10374G119 = bVar.m10387T(i).m10400g0(str3).m10392Y(i2).m10391X(this.f163293W).m10402i0(i1117).m10389V(listSingletonList).m10378K(str).m10382O(this.f163307l).m10374G();
                    qfj0 qfj0VarMo11416b119 = bsfVar.mo11416b(this.f163298c, i4);
                    this.f163294X = qfj0VarMo11416b119;
                    qfj0VarMo11416b119.mo11164b(c1894kM10374G119);
                    return;
                case 28:
                    str5 = "application/x-subrip";
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    iM105133f0 = -1;
                    if (this.f163284N != null) {
                        str = c7eVarM108303a.f80108c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z1110 = this.f163292V;
                    if (this.f163291U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i1118 = i3 | (z1110 ? 1 : 0);
                    bVar = new C1894k.b();
                    if (!kb00.m149014o(str3)) {
                        if (kb00.m149018s(str3)) {
                            if (this.f163312q == 0) {
                                i7 = this.f163310o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f163308m;
                                }
                                this.f163310o = i7;
                                i8 = this.f163311p;
                                if (i8 == -1) {
                                    i8 = this.f163309n;
                                }
                                this.f163311p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f163310o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f163319x) {
                            }
                            if (this.f163296a != null) {
                                iIntValue = ((Integer) rhx.f163215i0.get(this.f163296a)).intValue();
                            }
                            if (this.f163313r == 0) {
                                if (Float.compare(this.f163316u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f163315t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f163315t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10407n0(this.f163308m).m10386S(this.f163309n).m10396c0(f).m10399f0(iIntValue).m10397d0(this.f163317v).m10403j0(this.f163318w).m10379L(df5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10377J(this.f163285O).m10401h0(this.f163287Q).m10394a0(iM105133f0);
                        i4 = 1;
                    }
                    if (this.f163296a != null) {
                        bVar.m10390W(this.f163296a);
                    }
                    C1894k c1894kM10374G1110 = bVar.m10387T(i).m10400g0(str3).m10392Y(i2).m10391X(this.f163293W).m10402i0(i1118).m10389V(listSingletonList).m10378K(str).m10382O(this.f163307l).m10374G();
                    qfj0 qfj0VarMo11416b1110 = bsfVar.mo11416b(this.f163298c, i4);
                    this.f163294X = qfj0VarMo11416b1110;
                    qfj0VarMo11416b1110.mo11164b(c1894kM10374G1110);
                    return;
                case 29:
                    str5 = "video/mpeg2";
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    iM105133f0 = -1;
                    if (this.f163284N != null) {
                        str = c7eVarM108303a.f80108c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z1111 = this.f163292V;
                    if (this.f163291U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i1119 = i3 | (z1111 ? 1 : 0);
                    bVar = new C1894k.b();
                    if (!kb00.m149014o(str3)) {
                        if (kb00.m149018s(str3)) {
                            if (this.f163312q == 0) {
                                i7 = this.f163310o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f163308m;
                                }
                                this.f163310o = i7;
                                i8 = this.f163311p;
                                if (i8 == -1) {
                                    i8 = this.f163309n;
                                }
                                this.f163311p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f163310o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f163319x) {
                            }
                            if (this.f163296a != null) {
                                iIntValue = ((Integer) rhx.f163215i0.get(this.f163296a)).intValue();
                            }
                            if (this.f163313r == 0) {
                                if (Float.compare(this.f163316u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f163315t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f163315t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10407n0(this.f163308m).m10386S(this.f163309n).m10396c0(f).m10399f0(iIntValue).m10397d0(this.f163317v).m10403j0(this.f163318w).m10379L(df5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10377J(this.f163285O).m10401h0(this.f163287Q).m10394a0(iM105133f0);
                        i4 = 1;
                    }
                    if (this.f163296a != null) {
                        bVar.m10390W(this.f163296a);
                    }
                    C1894k c1894kM10374G1111 = bVar.m10387T(i).m10400g0(str3).m10392Y(i2).m10391X(this.f163293W).m10402i0(i1119).m10389V(listSingletonList).m10378K(str).m10382O(this.f163307l).m10374G();
                    qfj0 qfj0VarMo11416b1111 = bsfVar.mo11416b(this.f163298c, i4);
                    this.f163294X = qfj0VarMo11416b1111;
                    qfj0VarMo11416b1111.mo11164b(c1894kM10374G1111);
                    return;
                case 30:
                    str5 = "audio/eac3";
                    listSingletonList = null;
                    str = null;
                    i2 = -1;
                    iM105133f0 = -1;
                    if (this.f163284N != null) {
                        str = c7eVarM108303a.f80108c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z1112 = this.f163292V;
                    if (this.f163291U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i11110 = i3 | (z1112 ? 1 : 0);
                    bVar = new C1894k.b();
                    if (!kb00.m149014o(str3)) {
                        if (kb00.m149018s(str3)) {
                            if (this.f163312q == 0) {
                                i7 = this.f163310o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f163308m;
                                }
                                this.f163310o = i7;
                                i8 = this.f163311p;
                                if (i8 == -1) {
                                    i8 = this.f163309n;
                                }
                                this.f163311p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f163310o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f163319x) {
                            }
                            if (this.f163296a != null) {
                                iIntValue = ((Integer) rhx.f163215i0.get(this.f163296a)).intValue();
                            }
                            if (this.f163313r == 0) {
                                if (Float.compare(this.f163316u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f163315t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f163315t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10407n0(this.f163308m).m10386S(this.f163309n).m10396c0(f).m10399f0(iIntValue).m10397d0(this.f163317v).m10403j0(this.f163318w).m10379L(df5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10377J(this.f163285O).m10401h0(this.f163287Q).m10394a0(iM105133f0);
                        i4 = 1;
                    }
                    if (this.f163296a != null) {
                        bVar.m10390W(this.f163296a);
                    }
                    C1894k c1894kM10374G1112 = bVar.m10387T(i).m10400g0(str3).m10392Y(i2).m10391X(this.f163293W).m10402i0(i11110).m10389V(listSingletonList).m10378K(str).m10382O(this.f163307l).m10374G();
                    qfj0 qfj0VarMo11416b1112 = bsfVar.mo11416b(this.f163298c, i4);
                    this.f163294X = qfj0VarMo11416b1112;
                    qfj0VarMo11416b1112.mo11164b(c1894kM10374G1112);
                    return;
                case 31:
                    listSingletonList = Collections.singletonList(m181562g(this.f163297b));
                    str5 = "audio/flac";
                    str = null;
                    i2 = -1;
                    iM105133f0 = -1;
                    if (this.f163284N != null) {
                        str = c7eVarM108303a.f80108c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z1113 = this.f163292V;
                    if (this.f163291U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i11111 = i3 | (z1113 ? 1 : 0);
                    bVar = new C1894k.b();
                    if (!kb00.m149014o(str3)) {
                        if (kb00.m149018s(str3)) {
                            if (this.f163312q == 0) {
                                i7 = this.f163310o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f163308m;
                                }
                                this.f163310o = i7;
                                i8 = this.f163311p;
                                if (i8 == -1) {
                                    i8 = this.f163309n;
                                }
                                this.f163311p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f163310o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f163319x) {
                            }
                            if (this.f163296a != null) {
                                iIntValue = ((Integer) rhx.f163215i0.get(this.f163296a)).intValue();
                            }
                            if (this.f163313r == 0) {
                                if (Float.compare(this.f163316u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f163315t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f163315t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10407n0(this.f163308m).m10386S(this.f163309n).m10396c0(f).m10399f0(iIntValue).m10397d0(this.f163317v).m10403j0(this.f163318w).m10379L(df5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10377J(this.f163285O).m10401h0(this.f163287Q).m10394a0(iM105133f0);
                        i4 = 1;
                    }
                    if (this.f163296a != null) {
                        bVar.m10390W(this.f163296a);
                    }
                    C1894k c1894kM10374G1113 = bVar.m10387T(i).m10400g0(str3).m10392Y(i2).m10391X(this.f163293W).m10402i0(i11111).m10389V(listSingletonList).m10378K(str).m10382O(this.f163307l).m10374G();
                    qfj0 qfj0VarMo11416b1113 = bsfVar.mo11416b(this.f163298c, i4);
                    this.f163294X = qfj0VarMo11416b1113;
                    qfj0VarMo11416b1113.mo11164b(c1894kM10374G1113);
                    return;
                case 32:
                    listSingletonList = new ArrayList<>(3);
                    listSingletonList.add(m181562g(this.f163297b));
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    listSingletonList.add(byteBufferAllocate.order(byteOrder).putLong(this.f163288R).array());
                    listSingletonList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.f163289S).array());
                    str5 = "audio/opus";
                    i2 = 5760;
                    str = null;
                    iM105133f0 = -1;
                    if (this.f163284N != null) {
                        str = c7eVarM108303a.f80108c;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z1114 = this.f163292V;
                    if (this.f163291U) {
                        i3 = 2;
                    } else {
                        i3 = 0;
                    }
                    int i11112 = i3 | (z1114 ? 1 : 0);
                    bVar = new C1894k.b();
                    if (!kb00.m149014o(str3)) {
                        if (kb00.m149018s(str3)) {
                            if (this.f163312q == 0) {
                                i7 = this.f163310o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.f163308m;
                                }
                                this.f163310o = i7;
                                i8 = this.f163311p;
                                if (i8 == -1) {
                                    i8 = this.f163309n;
                                }
                                this.f163311p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.f163310o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.f163319x) {
                            }
                            if (this.f163296a != null) {
                                iIntValue = ((Integer) rhx.f163215i0.get(this.f163296a)).intValue();
                            }
                            if (this.f163313r == 0) {
                                if (Float.compare(this.f163316u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f163315t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f163315t, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.m10407n0(this.f163308m).m10386S(this.f163309n).m10396c0(f).m10399f0(iIntValue).m10397d0(this.f163317v).m10403j0(this.f163318w).m10379L(df5Var);
                            i4 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        bVar.m10377J(this.f163285O).m10401h0(this.f163287Q).m10394a0(iM105133f0);
                        i4 = 1;
                    }
                    if (this.f163296a != null) {
                        bVar.m10390W(this.f163296a);
                    }
                    C1894k c1894kM10374G1114 = bVar.m10387T(i).m10400g0(str3).m10392Y(i2).m10391X(this.f163293W).m10402i0(i11112).m10389V(listSingletonList).m10378K(str).m10382O(this.f163307l).m10374G();
                    qfj0 qfj0VarMo11416b1114 = bsfVar.mo11416b(this.f163298c, i4);
                    this.f163294X = qfj0VarMo11416b1114;
                    qfj0VarMo11416b1114.mo11164b(c1894kM10374G1114);
                    return;
                default:
                    throw ParserException.createForMalformedContainer("Unrecognized codec identifier.", null);
            }
        }

        @RequiresNonNull({"output"})
        /* JADX INFO: renamed from: j */
        public void m181565j() {
            ckj0 ckj0Var = this.f163290T;
            if (ckj0Var != null) {
                ckj0Var.m110341a(this.f163294X, this.f163305j);
            }
        }

        /* JADX INFO: renamed from: n */
        public void m181566n() {
            ckj0 ckj0Var = this.f163290T;
            if (ckj0Var != null) {
                ckj0Var.m110342b();
            }
        }

        /* JADX INFO: renamed from: o */
        public final boolean m181567o(boolean z) {
            if ("A_OPUS".equals(this.f163297b)) {
                return z;
            }
            return this.f163301f > 0;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        f163215i0 = Collections.unmodifiableMap(map);
    }

    public rhx(lke lkeVar, int i) {
        this.f163260q = -1L;
        this.f163261r = -9223372036854775807L;
        this.f163262s = -9223372036854775807L;
        this.f163263t = -9223372036854775807L;
        this.f163269z = -1L;
        this.f163216A = -1L;
        this.f163217B = -9223372036854775807L;
        this.f163242a = lkeVar;
        lkeVar.mo146437b(new C19850b());
        this.f163247d = (i & 1) == 0;
        this.f163244b = new p1l0();
        this.f163246c = new SparseArray<>();
        this.f163250g = new ig60(4);
        this.f163251h = new ig60(ByteBuffer.allocate(4).putInt(-1).array());
        this.f163252i = new ig60(4);
        this.f163248e = new ig60(jb20.f119084a);
        this.f163249f = new ig60(4);
        this.f163253j = new ig60();
        this.f163254k = new ig60();
        this.f163255l = new ig60(8);
        this.f163256m = new ig60();
        this.f163257n = new ig60();
        this.f163227L = new int[1];
    }

    /* JADX INFO: renamed from: E */
    public static void m181520E(String str, long j, byte[] bArr) {
        byte[] bArrM181527s;
        int i;
        str.getClass();
        switch (str) {
            case "S_TEXT/ASS":
                bArrM181527s = m181527s(j, "%01d:%02d:%02d:%02d", 10000L);
                i = 21;
                break;
            case "S_TEXT/WEBVTT":
                bArrM181527s = m181527s(j, "%02d:%02d:%02d.%03d", 1000L);
                i = 25;
                break;
            case "S_TEXT/UTF8":
                bArrM181527s = m181527s(j, "%02d:%02d:%02d,%03d", 1000L);
                i = 19;
                break;
            default:
                fig0.m125680a();
                return;
        }
        System.arraycopy(bArrM181527s, 0, bArr, i, bArrM181527s.length);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ zrf[] m181521c() {
        return new zrf[]{new rhx()};
    }

    @EnsuresNonNull({"extractorOutput"})
    /* JADX INFO: renamed from: k */
    private void m181525k() {
        w11.m204373i(this.f163245b0);
    }

    /* JADX INFO: renamed from: p */
    public static int[] m181526p(@Nullable int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        return iArr.length >= i ? iArr : new int[Math.max(iArr.length * 2, i)];
    }

    /* JADX INFO: renamed from: s */
    public static byte[] m181527s(long j, String str, long j2) {
        w11.m204365a(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) i) * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) i2) * 60000000);
        int i3 = (int) (j4 / 1000000);
        return bmk0.m105165r0(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2))));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: y */
    public static boolean m181528y(String str) {
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
    public final boolean m181529A(ll80 ll80Var, long j) {
        if (this.f163268y) {
            this.f163216A = j;
            ll80Var.f132534a = this.f163269z;
            this.f163268y = false;
            return true;
        }
        if (this.f163265v) {
            long j2 = this.f163216A;
            if (j2 != -1) {
                ll80Var.f132534a = j2;
                this.f163216A = -1L;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: B */
    public final void m181530B(asf asfVar, int i) throws IOException {
        if (this.f163250g.m139817g() >= i) {
            return;
        }
        if (this.f163250g.m139812b() < i) {
            ig60 ig60Var = this.f163250g;
            ig60Var.m139813c(Math.max(ig60Var.m139812b() * 2, i));
        }
        asfVar.readFully(this.f163250g.m139815e(), this.f163250g.m139817g(), i - this.f163250g.m139817g());
        this.f163250g.m139807T(i);
    }

    /* JADX INFO: renamed from: C */
    public final void m181531C() {
        this.f163234S = 0;
        this.f163235T = 0;
        this.f163236U = 0;
        this.f163237V = false;
        this.f163238W = false;
        this.f163239X = false;
        this.f163240Y = 0;
        this.f163241Z = (byte) 0;
        this.f163243a0 = false;
        this.f163253j.m139804Q(0);
    }

    /* JADX INFO: renamed from: D */
    public final long m181532D(long j) throws ParserException {
        long j2 = this.f163261r;
        if (j2 != -9223372036854775807L) {
            return bmk0.m105110W0(j, j2, 1000L);
        }
        throw ParserException.createForMalformedContainer("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @CallSuper
    /* JADX INFO: renamed from: F */
    public void m181533F(int i, long j, long j2) throws ParserException {
        m181525k();
        if (i == 160) {
            this.f163232Q = false;
            this.f163233R = 0L;
            return;
        }
        if (i == 174) {
            this.f163264u = new C19851c();
            return;
        }
        if (i == 187) {
            this.f163220E = false;
            return;
        }
        if (i == 19899) {
            this.f163266w = -1;
            this.f163267x = -1L;
            return;
        }
        if (i == 20533) {
            m181547t(i).f163303h = true;
            return;
        }
        if (i == 21968) {
            m181547t(i).f163319x = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.f163260q;
            if (j3 != -1 && j3 != j) {
                throw ParserException.createForMalformedContainer("Multiple Segment elements not supported", null);
            }
            this.f163260q = j;
            this.f163259p = j2;
            return;
        }
        if (i == 475249515) {
            this.f163218C = new h1w();
            this.f163219D = new h1w();
        } else if (i == 524531317 && !this.f163265v) {
            if (this.f163247d && this.f163269z != -1) {
                this.f163268y = true;
            } else {
                this.f163245b0.mo11424k(new mke0.C18641b(this.f163263t));
                this.f163265v = true;
            }
        }
    }

    @CallSuper
    /* JADX INFO: renamed from: G */
    public void m181534G(int i, String str) throws ParserException {
        if (i == 134) {
            m181547t(i).f163297b = str;
            return;
        }
        if (i != 17026) {
            if (i == 21358) {
                m181547t(i).f163296a = str;
                return;
            } else {
                if (i != 2274716) {
                    return;
                }
                m181547t(i).f163293W = str;
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
    public final int m181535H(asf asfVar, C19851c c19851c, int i, boolean z) throws IOException {
        int i2;
        if ("S_TEXT/UTF8".equals(c19851c.f163297b)) {
            m181536I(asfVar, f163210d0, i);
            return m181545q();
        }
        if ("S_TEXT/ASS".equals(c19851c.f163297b)) {
            m181536I(asfVar, f163212f0, i);
            return m181545q();
        }
        if ("S_TEXT/WEBVTT".equals(c19851c.f163297b)) {
            m181536I(asfVar, f163213g0, i);
            return m181545q();
        }
        qfj0 qfj0Var = c19851c.f163294X;
        if (!this.f163237V) {
            if (c19851c.f163303h) {
                this.f163230O &= -1073741825;
                if (!this.f163238W) {
                    asfVar.readFully(this.f163250g.m139815e(), 0, 1);
                    this.f163234S++;
                    if ((this.f163250g.m139815e()[0] & 128) == 128) {
                        throw ParserException.createForMalformedContainer("Extension bit is set in signal byte", null);
                    }
                    this.f163241Z = this.f163250g.m139815e()[0];
                    this.f163238W = true;
                }
                byte b = this.f163241Z;
                if ((b & 1) == 1) {
                    boolean z2 = (b & 2) == 2;
                    this.f163230O |= 1073741824;
                    if (!this.f163243a0) {
                        asfVar.readFully(this.f163255l.m139815e(), 0, 8);
                        this.f163234S += 8;
                        this.f163243a0 = true;
                        this.f163250g.m139815e()[0] = (byte) ((z2 ? 128 : 0) | 8);
                        this.f163250g.m139808U(0);
                        qfj0Var.mo11166f(this.f163250g, 1, 1);
                        this.f163235T++;
                        this.f163255l.m139808U(0);
                        qfj0Var.mo11166f(this.f163255l, 8, 1);
                        this.f163235T += 8;
                    }
                    if (z2) {
                        if (!this.f163239X) {
                            asfVar.readFully(this.f163250g.m139815e(), 0, 1);
                            this.f163234S++;
                            this.f163250g.m139808U(0);
                            this.f163240Y = this.f163250g.m139795H();
                            this.f163239X = true;
                        }
                        int i3 = this.f163240Y * 4;
                        this.f163250g.m139804Q(i3);
                        asfVar.readFully(this.f163250g.m139815e(), 0, i3);
                        this.f163234S += i3;
                        short s = (short) ((this.f163240Y / 2) + 1);
                        int i4 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.f163258o;
                        if (byteBuffer == null || byteBuffer.capacity() < i4) {
                            this.f163258o = ByteBuffer.allocate(i4);
                        }
                        this.f163258o.position(0);
                        this.f163258o.putShort(s);
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            i2 = this.f163240Y;
                            if (i5 >= i2) {
                                break;
                            }
                            int iM139799L = this.f163250g.m139799L();
                            int i7 = i5 % 2;
                            ByteBuffer byteBuffer2 = this.f163258o;
                            if (i7 == 0) {
                                byteBuffer2.putShort((short) (iM139799L - i6));
                            } else {
                                byteBuffer2.putInt(iM139799L - i6);
                            }
                            i5++;
                            i6 = iM139799L;
                        }
                        int i8 = (i - this.f163234S) - i6;
                        int i9 = i2 % 2;
                        ByteBuffer byteBuffer3 = this.f163258o;
                        if (i9 == 1) {
                            byteBuffer3.putInt(i8);
                        } else {
                            byteBuffer3.putShort((short) i8);
                            this.f163258o.putInt(0);
                        }
                        this.f163256m.m139806S(this.f163258o.array(), i4);
                        qfj0Var.mo11166f(this.f163256m, i4, 1);
                        this.f163235T += i4;
                    }
                }
            } else {
                byte[] bArr = c19851c.f163304i;
                if (bArr != null) {
                    this.f163253j.m139806S(bArr, bArr.length);
                }
            }
            if (c19851c.m181567o(z)) {
                this.f163230O |= SQLiteDatabase.CREATE_IF_NECESSARY;
                this.f163257n.m139804Q(0);
                int iM139817g = (this.f163253j.m139817g() + i) - this.f163234S;
                this.f163250g.m139804Q(4);
                this.f163250g.m139815e()[0] = (byte) ((iM139817g >> 24) & 255);
                this.f163250g.m139815e()[1] = (byte) ((iM139817g >> 16) & 255);
                this.f163250g.m139815e()[2] = (byte) ((iM139817g >> 8) & 255);
                this.f163250g.m139815e()[3] = (byte) (iM139817g & 255);
                qfj0Var.mo11166f(this.f163250g, 4, 2);
                this.f163235T += 4;
            }
            this.f163237V = true;
        }
        int iM139817g2 = i + this.f163253j.m139817g();
        if (!"V_MPEG4/ISO/AVC".equals(c19851c.f163297b) && !"V_MPEGH/ISO/HEVC".equals(c19851c.f163297b)) {
            if (c19851c.f163290T != null) {
                w11.m204371g(this.f163253j.m139817g() == 0);
                c19851c.f163290T.m110344d(asfVar);
            }
            while (true) {
                int i10 = this.f163234S;
                if (i10 >= iM139817g2) {
                    break;
                }
                int iM181537J = m181537J(asfVar, qfj0Var, iM139817g2 - i10);
                this.f163234S += iM181537J;
                this.f163235T += iM181537J;
            }
        } else {
            byte[] bArrM139815e = this.f163249f.m139815e();
            bArrM139815e[0] = 0;
            bArrM139815e[1] = 0;
            bArrM139815e[2] = 0;
            int i11 = c19851c.f163295Y;
            int i12 = 4 - i11;
            while (this.f163234S < iM139817g2) {
                int i13 = this.f163236U;
                if (i13 == 0) {
                    m181538K(asfVar, bArrM139815e, i12, i11);
                    this.f163234S += i11;
                    this.f163249f.m139808U(0);
                    this.f163236U = this.f163249f.m139799L();
                    this.f163248e.m139808U(0);
                    qfj0Var.m176370d(this.f163248e, 4);
                    this.f163235T += 4;
                } else {
                    int iM181537J2 = m181537J(asfVar, qfj0Var, i13);
                    this.f163234S += iM181537J2;
                    this.f163235T += iM181537J2;
                    this.f163236U -= iM181537J2;
                }
            }
        }
        if ("A_VORBIS".equals(c19851c.f163297b)) {
            this.f163251h.m139808U(0);
            qfj0Var.m176370d(this.f163251h, 4);
            this.f163235T += 4;
        }
        return m181545q();
    }

    /* JADX INFO: renamed from: I */
    public final void m181536I(asf asfVar, byte[] bArr, int i) throws IOException {
        int length = bArr.length + i;
        int iM139812b = this.f163254k.m139812b();
        ig60 ig60Var = this.f163254k;
        if (iM139812b < length) {
            ig60Var.m139805R(Arrays.copyOf(bArr, length + i));
        } else {
            System.arraycopy(bArr, 0, ig60Var.m139815e(), 0, bArr.length);
        }
        asfVar.readFully(this.f163254k.m139815e(), bArr.length, i);
        this.f163254k.m139808U(0);
        this.f163254k.m139807T(length);
    }

    /* JADX INFO: renamed from: J */
    public final int m181537J(asf asfVar, qfj0 qfj0Var, int i) throws IOException {
        int iM139811a = this.f163253j.m139811a();
        if (iM139811a <= 0) {
            return qfj0Var.m176371e(asfVar, i, false);
        }
        int iMin = Math.min(i, iM139811a);
        qfj0Var.m176370d(this.f163253j, iMin);
        return iMin;
    }

    /* JADX INFO: renamed from: K */
    public final void m181538K(asf asfVar, byte[] bArr, int i, int i2) throws IOException {
        int iMin = Math.min(i2, this.f163253j.m139811a());
        asfVar.readFully(bArr, i + iMin, i2 - iMin);
        if (iMin > 0) {
            this.f163253j.m139822l(bArr, i, iMin);
        }
    }

    @Override // p153l.zrf
    @CallSuper
    /* JADX INFO: renamed from: a */
    public void mo11029a(long j, long j2) {
        this.f163217B = -9223372036854775807L;
        this.f163222G = 0;
        this.f163242a.reset();
        this.f163244b.m170216e();
        m181531C();
        for (int i = 0; i < this.f163246c.size(); i++) {
            this.f163246c.valueAt(i).m181566n();
        }
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: b */
    public final void mo11030b(bsf bsfVar) {
        this.f163245b0 = bsfVar;
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: f */
    public final boolean mo11031f(asf asfVar) throws IOException {
        return new xsf0().m212977b(asfVar);
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: h */
    public final int mo11032h(asf asfVar, ll80 ll80Var) throws IOException {
        this.f163221F = false;
        boolean zMo146436a = true;
        while (zMo146436a && !this.f163221F) {
            zMo146436a = this.f163242a.mo146436a(asfVar);
            if (zMo146436a && m181529A(ll80Var, asfVar.getPosition())) {
                return 1;
            }
        }
        if (zMo146436a) {
            return 0;
        }
        for (int i = 0; i < this.f163246c.size(); i++) {
            C19851c c19851cValueAt = this.f163246c.valueAt(i);
            c19851cValueAt.m181561f();
            c19851cValueAt.m181565j();
        }
        return -1;
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    /* JADX INFO: renamed from: i */
    public final void m181539i(int i) throws ParserException {
        if (this.f163218C == null || this.f163219D == null) {
            throw ParserException.createForMalformedContainer("Element " + i + " must be in a Cues", null);
        }
    }

    @EnsuresNonNull({"currentTrack"})
    /* JADX INFO: renamed from: j */
    public final void m181540j(int i) throws ParserException {
        if (this.f163264u != null) {
            return;
        }
        throw ParserException.createForMalformedContainer("Element " + i + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x028c  */
    /* JADX WARN: Multi-variable type inference failed */
    @CallSuper
    /* JADX INFO: renamed from: l */
    public void m181541l(int i, int i2, asf asfVar) throws IOException {
        int i3;
        int i4;
        int i5;
        long j;
        int i6;
        int[] iArr;
        int i7;
        int i8;
        int i9;
        asf asfVar2 = asfVar;
        int i10 = 0;
        int i11 = 1;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (this.f163222G != 2) {
                    return;
                }
                m181550w(this.f163246c.get(this.f163228M), this.f163231P, asfVar2, i2);
                return;
            }
            if (i == 16877) {
                m181549v(m181547t(i), asfVar2, i2);
                return;
            }
            if (i == 16981) {
                m181540j(i);
                byte[] bArr = new byte[i2];
                this.f163264u.f163304i = bArr;
                asfVar2.readFully(bArr, 0, i2);
                return;
            }
            if (i == 18402) {
                byte[] bArr2 = new byte[i2];
                asfVar2.readFully(bArr2, 0, i2);
                m181547t(i).f163305j = new qfj0.C19562a(1, bArr2, 0, 0);
                return;
            }
            if (i == 21419) {
                Arrays.fill(this.f163252i.m139815e(), (byte) 0);
                asfVar2.readFully(this.f163252i.m139815e(), 4 - i2, i2);
                this.f163252i.m139808U(0);
                this.f163266w = (int) this.f163252i.m139797J();
                return;
            }
            if (i == 25506) {
                m181540j(i);
                byte[] bArr3 = new byte[i2];
                this.f163264u.f163306k = bArr3;
                asfVar2.readFully(bArr3, 0, i2);
                return;
            }
            if (i != 30322) {
                throw ParserException.createForMalformedContainer("Unexpected id: " + i, null);
            }
            m181540j(i);
            byte[] bArr4 = new byte[i2];
            this.f163264u.f163317v = bArr4;
            asfVar2.readFully(bArr4, 0, i2);
            return;
        }
        int i12 = 8;
        if (this.f163222G == 0) {
            this.f163228M = (int) this.f163244b.m170215d(asfVar2, false, true, 8);
            this.f163229N = this.f163244b.m170214b();
            this.f163224I = -9223372036854775807L;
            this.f163222G = 1;
            this.f163250g.m139804Q(0);
        }
        C19851c c19851c = this.f163246c.get(this.f163228M);
        if (c19851c == null) {
            asfVar2.mo99905o(i2 - this.f163229N);
            this.f163222G = 0;
            return;
        }
        c19851c.m181561f();
        if (this.f163222G == 1) {
            m181530B(asfVar2, 3);
            int i13 = (this.f163250g.m139815e()[2] & 6) >> 1;
            if (i13 == 0) {
                this.f163226K = 1;
                int[] iArrM181526p = m181526p(this.f163227L, 1);
                this.f163227L = iArrM181526p;
                iArrM181526p[0] = (i2 - this.f163229N) - 3;
            } else {
                m181530B(asfVar2, 4);
                int i14 = (this.f163250g.m139815e()[3] & 255) + 1;
                this.f163226K = i14;
                int[] iArrM181526p2 = m181526p(this.f163227L, i14);
                this.f163227L = iArrM181526p2;
                if (i13 == 2) {
                    int i15 = (i2 - this.f163229N) - 4;
                    int i16 = this.f163226K;
                    Arrays.fill(iArrM181526p2, 0, i16, i15 / i16);
                } else if (i13 == 1) {
                    int i17 = 0;
                    int i18 = 0;
                    int i19 = 4;
                    while (true) {
                        i6 = this.f163226K;
                        int i20 = i6 - 1;
                        i3 = i11;
                        iArr = this.f163227L;
                        if (i17 >= i20) {
                            break;
                        }
                        iArr[i17] = 0;
                        while (true) {
                            i7 = i19 + 1;
                            m181530B(asfVar2, i7);
                            int i21 = this.f163250g.m139815e()[i19] & 255;
                            int[] iArr2 = this.f163227L;
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
                    iArr[i6 - 1] = ((i2 - this.f163229N) - i19) - i18;
                } else {
                    i3 = 1;
                    if (i13 != 3) {
                        throw ParserException.createForMalformedContainer("Unexpected lacing value: " + i13, null);
                    }
                    int i22 = 0;
                    int i23 = 0;
                    int i24 = 4;
                    while (true) {
                        int i25 = this.f163226K;
                        int i26 = i25 - 1;
                        i10 = i10;
                        int[] iArr3 = this.f163227L;
                        if (i22 >= i26) {
                            iArr3[i25 - 1] = ((i2 - this.f163229N) - i24) - i23;
                            break;
                        }
                        iArr3[i22] = i10;
                        int i27 = i24 + 1;
                        m181530B(asfVar2, i27);
                        if (this.f163250g.m139815e()[i24] == 0) {
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
                            if ((this.f163250g.m139815e()[i24] & i29) != 0) {
                                i27 += i28;
                                m181530B(asfVar2, i27);
                                int i30 = i24 + 1;
                                j = this.f163250g.m139815e()[i24] & 255 & (~i29);
                                for (int i31 = i30; i31 < i27; i31++) {
                                    j = (j << i5) | ((long) (this.f163250g.m139815e()[i31] & 255));
                                }
                                if (i22 <= 0) {
                                    break;
                                }
                                j -= (1 << ((i28 * 7) + 6)) - 1;
                                break;
                            }
                            i28++;
                            asfVar2 = asfVar;
                            i12 = i5;
                        }
                        if (j < -2147483648L || j > 2147483647L) {
                            throw ParserException.createForMalformedContainer("EBML lacing sample size out of range.", null);
                        }
                        int i32 = (int) j;
                        int[] iArr4 = this.f163227L;
                        if (i22 != 0) {
                            i32 += iArr4[i22 - 1];
                        }
                        iArr4[i22] = i32;
                        i23 += i32;
                        i22++;
                        asfVar2 = asfVar;
                        i24 = i27;
                        i10 = i10;
                        i12 = i5;
                    }
                }
                this.f163223H = this.f163217B + m181532D((this.f163250g.m139815e()[i10] << 8) | (this.f163250g.m139815e()[i3] & 255));
                if (c19851c.f163299d != 2 || (i == 163 && (this.f163250g.m139815e()[2] & 128) == 128)) {
                    i9 = i3;
                } else {
                    i9 = i10;
                }
                this.f163230O = i9;
                this.f163222G = 2;
                this.f163225J = i10;
                i4 = 163;
            }
            i3 = 1;
            this.f163223H = this.f163217B + m181532D((this.f163250g.m139815e()[i10] << 8) | (this.f163250g.m139815e()[i3] & 255));
            if (c19851c.f163299d != 2) {
                i9 = i3;
            } else {
                i9 = i3;
            }
            this.f163230O = i9;
            this.f163222G = 2;
            this.f163225J = i10;
            i4 = 163;
        } else {
            i3 = 1;
            i4 = 163;
        }
        if (i == i4) {
            while (true) {
                int i33 = this.f163225J;
                if (i33 >= this.f163226K) {
                    this.f163222G = 0;
                    return;
                }
                int iM181535H = m181535H(asfVar, c19851c, this.f163227L[i33], false);
                C19851c c19851c2 = c19851c;
                m181543n(c19851c2, this.f163223H + ((long) ((this.f163225J * c19851c.f163300e) / 1000)), this.f163230O, iM181535H, 0);
                this.f163225J++;
                c19851c = c19851c2;
            }
        } else {
            while (true) {
                int i34 = this.f163225J;
                if (i34 >= this.f163226K) {
                    return;
                }
                int[] iArr5 = this.f163227L;
                boolean z = i3;
                iArr5[i34] = m181535H(asfVar, c19851c, iArr5[i34], z);
                this.f163225J += z ? 1 : 0;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final mke0 m181542m(@Nullable h1w h1wVar, @Nullable h1w h1wVar2) {
        int i;
        if (this.f163260q == -1 || this.f163263t == -9223372036854775807L || h1wVar == null || h1wVar.m133355c() == 0 || h1wVar2 == null || h1wVar2.m133355c() != h1wVar.m133355c()) {
            return new mke0.C18641b(this.f163263t);
        }
        int iM133355c = h1wVar.m133355c();
        int[] iArrCopyOf = new int[iM133355c];
        long[] jArrCopyOf = new long[iM133355c];
        long[] jArrCopyOf2 = new long[iM133355c];
        long[] jArrCopyOf3 = new long[iM133355c];
        int i2 = 0;
        for (int i3 = 0; i3 < iM133355c; i3++) {
            jArrCopyOf3[i3] = h1wVar.m133354b(i3);
            jArrCopyOf[i3] = this.f163260q + h1wVar2.m133354b(i3);
        }
        while (true) {
            i = iM133355c - 1;
            if (i2 >= i) {
                break;
            }
            int i4 = i2 + 1;
            iArrCopyOf[i2] = (int) (jArrCopyOf[i4] - jArrCopyOf[i2]);
            jArrCopyOf2[i2] = jArrCopyOf3[i4] - jArrCopyOf3[i2];
            i2 = i4;
        }
        iArrCopyOf[i] = (int) ((this.f163260q + this.f163259p) - jArrCopyOf[i]);
        long j = this.f163263t - jArrCopyOf3[i];
        jArrCopyOf2[i] = j;
        if (j <= 0) {
            kyv.m152151i("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j);
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i);
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i);
            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i);
            jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i);
        }
        return new r45(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
    }

    @RequiresNonNull({"#1.output"})
    /* JADX INFO: renamed from: n */
    public final void m181543n(C19851c c19851c, long j, int i, int i2, int i3) {
        int iM139817g;
        ckj0 ckj0Var = c19851c.f163290T;
        if (ckj0Var != null) {
            ckj0Var.m110343c(c19851c.f163294X, j, i, i2, i3, c19851c.f163305j);
        } else {
            if ("S_TEXT/UTF8".equals(c19851c.f163297b) || "S_TEXT/ASS".equals(c19851c.f163297b) || "S_TEXT/WEBVTT".equals(c19851c.f163297b)) {
                if (this.f163226K > 1) {
                    kyv.m152151i("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.f163224I;
                    if (j2 == -9223372036854775807L) {
                        kyv.m152151i("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        m181520E(c19851c.f163297b, j2, this.f163254k.m139815e());
                        for (int iM139816f = this.f163254k.m139816f(); iM139816f < this.f163254k.m139817g(); iM139816f++) {
                            if (this.f163254k.m139815e()[iM139816f] == 0) {
                                this.f163254k.m139807T(iM139816f);
                                break;
                            }
                        }
                        qfj0 qfj0Var = c19851c.f163294X;
                        ig60 ig60Var = this.f163254k;
                        qfj0Var.m176370d(ig60Var, ig60Var.m139817g());
                        iM139817g = i2 + this.f163254k.m139817g();
                    }
                }
                iM139817g = i2;
            } else {
                iM139817g = i2;
            }
            if ((i & SQLiteDatabase.CREATE_IF_NECESSARY) != 0) {
                int i4 = this.f163226K;
                ig60 ig60Var2 = this.f163257n;
                if (i4 > 1) {
                    ig60Var2.m139804Q(0);
                } else {
                    int iM139817g2 = ig60Var2.m139817g();
                    c19851c.f163294X.mo11166f(this.f163257n, iM139817g2, 2);
                    iM139817g += iM139817g2;
                }
            }
            c19851c.f163294X.mo11163a(j, i, iM139817g, i3, c19851c.f163305j);
        }
        this.f163221F = true;
    }

    @CallSuper
    /* JADX INFO: renamed from: o */
    public void m181544o(int i) throws ParserException {
        m181525k();
        if (i == 160) {
            if (this.f163222G != 2) {
                return;
            }
            C19851c c19851c = this.f163246c.get(this.f163228M);
            c19851c.m181561f();
            if (this.f163233R > 0 && "A_OPUS".equals(c19851c.f163297b)) {
                this.f163257n.m139805R(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f163233R).array());
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.f163226K; i3++) {
                i2 += this.f163227L[i3];
            }
            int i4 = 0;
            while (i4 < this.f163226K) {
                long j = this.f163223H + ((long) ((c19851c.f163300e * i4) / 1000));
                int i5 = this.f163230O;
                if (i4 == 0 && !this.f163232Q) {
                    i5 |= 1;
                }
                int i6 = this.f163227L[i4];
                int i7 = i2 - i6;
                m181543n(c19851c, j, i5, i6, i7);
                i4++;
                i2 = i7;
            }
            this.f163222G = 0;
            return;
        }
        if (i == 174) {
            C19851c c19851c2 = (C19851c) w11.m204373i(this.f163264u);
            String str = c19851c2.f163297b;
            if (str == null) {
                throw ParserException.createForMalformedContainer("CodecId is missing in TrackEntry element", null);
            }
            if (m181528y(str)) {
                c19851c2.m181564i(this.f163245b0, c19851c2.f163298c);
                this.f163246c.put(c19851c2.f163298c, c19851c2);
            }
            this.f163264u = null;
            return;
        }
        if (i == 19899) {
            int i8 = this.f163266w;
            if (i8 != -1) {
                long j2 = this.f163267x;
                if (j2 != -1) {
                    if (i8 == 475249515) {
                        this.f163269z = j2;
                        return;
                    }
                    return;
                }
            }
            throw ParserException.createForMalformedContainer("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i == 25152) {
            m181540j(i);
            C19851c c19851c3 = this.f163264u;
            if (c19851c3.f163303h) {
                if (c19851c3.f163305j == null) {
                    throw ParserException.createForMalformedContainer("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                c19851c3.f163307l = new DrmInitData(new DrmInitData.SchemeData(zr3.f205729a, "video/webm", this.f163264u.f163305j.f157306b));
                return;
            }
            return;
        }
        if (i == 28032) {
            m181540j(i);
            C19851c c19851c4 = this.f163264u;
            if (c19851c4.f163303h && c19851c4.f163304i != null) {
                throw ParserException.createForMalformedContainer("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i == 357149030) {
            if (this.f163261r == -9223372036854775807L) {
                this.f163261r = 1000000L;
            }
            long j3 = this.f163262s;
            if (j3 != -9223372036854775807L) {
                this.f163263t = m181532D(j3);
                return;
            }
            return;
        }
        if (i == 374648427) {
            if (this.f163246c.size() == 0) {
                throw ParserException.createForMalformedContainer("No valid tracks were found", null);
            }
            this.f163245b0.mo11425l();
        } else {
            if (i != 475249515) {
                return;
            }
            if (!this.f163265v) {
                this.f163245b0.mo11424k(m181542m(this.f163218C, this.f163219D));
                this.f163265v = true;
            }
            this.f163218C = null;
            this.f163219D = null;
        }
    }

    /* JADX INFO: renamed from: q */
    public final int m181545q() {
        int i = this.f163235T;
        m181531C();
        return i;
    }

    @CallSuper
    /* JADX INFO: renamed from: r */
    public void m181546r(int i, double d) throws ParserException {
        if (i == 181) {
            m181547t(i).f163287Q = (int) d;
            return;
        }
        if (i == 17545) {
            this.f163262s = (long) d;
            return;
        }
        switch (i) {
            case 21969:
                m181547t(i).f163274D = (float) d;
                break;
            case 21970:
                m181547t(i).f163275E = (float) d;
                break;
            case 21971:
                m181547t(i).f163276F = (float) d;
                break;
            case 21972:
                m181547t(i).f163277G = (float) d;
                break;
            case 21973:
                m181547t(i).f163278H = (float) d;
                break;
            case 21974:
                m181547t(i).f163279I = (float) d;
                break;
            case 21975:
                m181547t(i).f163280J = (float) d;
                break;
            case 21976:
                m181547t(i).f163281K = (float) d;
                break;
            case 21977:
                m181547t(i).f163282L = (float) d;
                break;
            case 21978:
                m181547t(i).f163283M = (float) d;
                break;
            default:
                switch (i) {
                    case 30323:
                        m181547t(i).f163314s = (float) d;
                        break;
                    case 30324:
                        m181547t(i).f163315t = (float) d;
                        break;
                    case 30325:
                        m181547t(i).f163316u = (float) d;
                        break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: t */
    public C19851c m181547t(int i) throws ParserException {
        m181540j(i);
        return this.f163264u;
    }

    @CallSuper
    /* JADX INFO: renamed from: u */
    public int m181548u(int i) {
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
    public void m181549v(C19851c c19851c, asf asfVar, int i) throws IOException {
        if (c19851c.f163302g != 1685485123 && c19851c.f163302g != 1685480259) {
            asfVar.mo99905o(i);
            return;
        }
        byte[] bArr = new byte[i];
        c19851c.f163284N = bArr;
        asfVar.readFully(bArr, 0, i);
    }

    /* JADX INFO: renamed from: w */
    public void m181550w(C19851c c19851c, int i, asf asfVar, int i2) throws IOException {
        if (i != 4 || !"V_VP9".equals(c19851c.f163297b)) {
            asfVar.mo99905o(i2);
        } else {
            this.f163257n.m139804Q(i2);
            asfVar.readFully(this.f163257n.m139815e(), 0, i2);
        }
    }

    @CallSuper
    /* JADX INFO: renamed from: x */
    public void m181551x(int i, long j) throws ParserException {
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
                m181547t(i).f163299d = (int) j;
                return;
            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA /* 136 */:
                m181547t(i).f163292V = j == 1;
                return;
            case CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA /* 155 */:
                this.f163224I = m181532D(j);
                return;
            case 159:
                m181547t(i).f163285O = (int) j;
                return;
            case 176:
                m181547t(i).f163308m = (int) j;
                return;
            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384 /* 179 */:
                m181539i(i);
                this.f163218C.m133353a(m181532D(j));
                return;
            case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 186 */:
                m181547t(i).f163309n = (int) j;
                return;
            case 215:
                m181547t(i).f163298c = (int) j;
                return;
            case 231:
                this.f163217B = m181532D(j);
                return;
            case 238:
                this.f163231P = (int) j;
                return;
            case 241:
                if (this.f163220E) {
                    return;
                }
                m181539i(i);
                this.f163219D.m133353a(j);
                this.f163220E = true;
                return;
            case 251:
                this.f163232Q = true;
                return;
            case 16871:
                m181547t(i).f163302g = (int) j;
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
                this.f163267x = j + this.f163260q;
                return;
            case 21432:
                int i2 = (int) j;
                m181540j(i);
                if (i2 == 0) {
                    this.f163264u.f163318w = 0;
                    return;
                }
                if (i2 == 1) {
                    this.f163264u.f163318w = 2;
                    return;
                } else if (i2 == 3) {
                    this.f163264u.f163318w = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    this.f163264u.f163318w = 3;
                    return;
                }
            case 21680:
                m181547t(i).f163310o = (int) j;
                return;
            case 21682:
                m181547t(i).f163312q = (int) j;
                return;
            case 21690:
                m181547t(i).f163311p = (int) j;
                return;
            case 21930:
                m181547t(i).f163291U = j == 1;
                return;
            case 21998:
                m181547t(i).f163301f = (int) j;
                return;
            case 22186:
                m181547t(i).f163288R = j;
                return;
            case 22203:
                m181547t(i).f163289S = j;
                return;
            case 25188:
                m181547t(i).f163286P = (int) j;
                return;
            case 30114:
                this.f163233R = j;
                return;
            case 30321:
                m181540j(i);
                int i3 = (int) j;
                if (i3 == 0) {
                    this.f163264u.f163313r = 0;
                    return;
                }
                if (i3 == 1) {
                    this.f163264u.f163313r = 1;
                    return;
                } else if (i3 == 2) {
                    this.f163264u.f163313r = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.f163264u.f163313r = 3;
                    return;
                }
            case 2352003:
                m181547t(i).f163300e = (int) j;
                return;
            case 2807729:
                this.f163261r = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        m181540j(i);
                        int i4 = (int) j;
                        if (i4 == 1) {
                            this.f163264u.f163271A = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            this.f163264u.f163271A = 1;
                            return;
                        }
                    case 21946:
                        m181540j(i);
                        int iM115497i = df5.m115497i((int) j);
                        if (iM115497i != -1) {
                            this.f163264u.f163321z = iM115497i;
                            return;
                        }
                        return;
                    case 21947:
                        m181540j(i);
                        this.f163264u.f163319x = true;
                        int iM115496h = df5.m115496h((int) j);
                        if (iM115496h != -1) {
                            this.f163264u.f163320y = iM115496h;
                            return;
                        }
                        return;
                    case 21948:
                        m181547t(i).f163272B = (int) j;
                        return;
                    case 21949:
                        m181547t(i).f163273C = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    @CallSuper
    /* JADX INFO: renamed from: z */
    public boolean m181552z(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    @Override // p153l.zrf
    public final void release() {
    }

    public rhx(int i) {
        this(new jod(), i);
    }

    public rhx() {
        this(0);
    }
}
