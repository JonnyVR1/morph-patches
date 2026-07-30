package p149l;

import android.net.Uri;
import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzad;
import com.google.android.gms.internal.ads.zzae;
import com.google.android.gms.internal.ads.zzcc;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes6.dex */
public final class tbr0 implements j5r0 {

    /* JADX INFO: renamed from: c0 */
    public static final c6r0 f169292c0 = new c6r0() { // from class: l.pbr0
        @Override // p149l.c6r0
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ j5r0[] mo95449a(Uri uri, Map map) {
            int i = b6r0.f73876a;
            return new j5r0[]{new tbr0(0)};
        }
    };

    /* JADX INFO: renamed from: d0 */
    public static final byte[] f169293d0 = {49, 10, 48, 48, HttpTokens.COLON, 48, 48, HttpTokens.COLON, 48, 48, 44, 48, 48, 48, HttpTokens.SPACE, 45, 45, 62, HttpTokens.SPACE, 48, 48, HttpTokens.COLON, 48, 48, HttpTokens.COLON, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: e0 */
    public static final byte[] f169294e0;

    /* JADX INFO: renamed from: f0 */
    public static final byte[] f169295f0;

    /* JADX INFO: renamed from: g0 */
    public static final byte[] f169296g0;

    /* JADX INFO: renamed from: h0 */
    public static final UUID f169297h0;

    /* JADX INFO: renamed from: i0 */
    public static final Map f169298i0;

    /* JADX INFO: renamed from: A */
    public long f169299A;

    /* JADX INFO: renamed from: B */
    public long f169300B;

    /* JADX INFO: renamed from: C */
    @Nullable
    public twv0 f169301C;

    /* JADX INFO: renamed from: D */
    @Nullable
    public twv0 f169302D;

    /* JADX INFO: renamed from: E */
    public boolean f169303E;

    /* JADX INFO: renamed from: F */
    public boolean f169304F;

    /* JADX INFO: renamed from: G */
    public int f169305G;

    /* JADX INFO: renamed from: H */
    public long f169306H;

    /* JADX INFO: renamed from: I */
    public long f169307I;

    /* JADX INFO: renamed from: J */
    public int f169308J;

    /* JADX INFO: renamed from: K */
    public int f169309K;

    /* JADX INFO: renamed from: L */
    public int[] f169310L;

    /* JADX INFO: renamed from: M */
    public int f169311M;

    /* JADX INFO: renamed from: N */
    public int f169312N;

    /* JADX INFO: renamed from: O */
    public int f169313O;

    /* JADX INFO: renamed from: P */
    public int f169314P;

    /* JADX INFO: renamed from: Q */
    public boolean f169315Q;

    /* JADX INFO: renamed from: R */
    public long f169316R;

    /* JADX INFO: renamed from: S */
    public int f169317S;

    /* JADX INFO: renamed from: T */
    public int f169318T;

    /* JADX INFO: renamed from: U */
    public int f169319U;

    /* JADX INFO: renamed from: V */
    public boolean f169320V;

    /* JADX INFO: renamed from: W */
    public boolean f169321W;

    /* JADX INFO: renamed from: X */
    public boolean f169322X;

    /* JADX INFO: renamed from: Y */
    public int f169323Y;

    /* JADX INFO: renamed from: Z */
    public byte f169324Z;

    /* JADX INFO: renamed from: a */
    public final obr0 f169325a;

    /* JADX INFO: renamed from: a0 */
    public boolean f169326a0;

    /* JADX INFO: renamed from: b */
    public final fcr0 f169327b;

    /* JADX INFO: renamed from: b0 */
    public m5r0 f169328b0;

    /* JADX INFO: renamed from: c */
    public final SparseArray f169329c;

    /* JADX INFO: renamed from: d */
    public final boolean f169330d;

    /* JADX INFO: renamed from: e */
    public final v6w0 f169331e;

    /* JADX INFO: renamed from: f */
    public final v6w0 f169332f;

    /* JADX INFO: renamed from: g */
    public final v6w0 f169333g;

    /* JADX INFO: renamed from: h */
    public final v6w0 f169334h;

    /* JADX INFO: renamed from: i */
    public final v6w0 f169335i;

    /* JADX INFO: renamed from: j */
    public final v6w0 f169336j;

    /* JADX INFO: renamed from: k */
    public final v6w0 f169337k;

    /* JADX INFO: renamed from: l */
    public final v6w0 f169338l;

    /* JADX INFO: renamed from: m */
    public final v6w0 f169339m;

    /* JADX INFO: renamed from: n */
    public final v6w0 f169340n;

    /* JADX INFO: renamed from: o */
    public ByteBuffer f169341o;

    /* JADX INFO: renamed from: p */
    public long f169342p;

    /* JADX INFO: renamed from: q */
    public long f169343q;

    /* JADX INFO: renamed from: r */
    public long f169344r;

    /* JADX INFO: renamed from: s */
    public long f169345s;

    /* JADX INFO: renamed from: t */
    public long f169346t;

    /* JADX INFO: renamed from: u */
    @Nullable
    public sbr0 f169347u;

    /* JADX INFO: renamed from: v */
    public boolean f169348v;

    /* JADX INFO: renamed from: w */
    public int f169349w;

    /* JADX INFO: renamed from: x */
    public long f169350x;

    /* JADX INFO: renamed from: y */
    public boolean f169351y;

    /* JADX INFO: renamed from: z */
    public long f169352z;

    static {
        int i = ggw0.f102568a;
        f169294e0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(wew0.f185990c);
        f169295f0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, HttpTokens.COLON, HttpTokens.SPACE, 48, HttpTokens.COLON, 48, 48, HttpTokens.COLON, 48, 48, HttpTokens.COLON, 48, 48, 44, 48, HttpTokens.COLON, 48, 48, HttpTokens.COLON, 48, 48, HttpTokens.COLON, 48, 48, 44};
        f169296g0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, HttpTokens.COLON, 48, 48, HttpTokens.COLON, 48, 48, 46, 48, 48, 48, HttpTokens.SPACE, 45, 45, 62, HttpTokens.SPACE, 48, 48, HttpTokens.COLON, 48, 48, HttpTokens.COLON, 48, 48, 46, 48, 48, 48, 10};
        f169297h0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        f169298i0 = Collections.unmodifiableMap(map);
    }

    public tbr0(int i) {
        mbr0 mbr0Var = new mbr0();
        this.f169343q = -1L;
        this.f169344r = -9223372036854775807L;
        this.f169345s = -9223372036854775807L;
        this.f169346t = -9223372036854775807L;
        this.f169352z = -1L;
        this.f169299A = -1L;
        this.f169300B = -9223372036854775807L;
        this.f169325a = mbr0Var;
        mbr0Var.mo153974b(new rbr0(this, null));
        this.f169330d = true;
        this.f169327b = new fcr0();
        this.f169329c = new SparseArray();
        this.f169333g = new v6w0(4);
        this.f169334h = new v6w0(ByteBuffer.allocate(4).putInt(-1).array());
        this.f169335i = new v6w0(4);
        this.f169331e = new v6w0(quw0.f156548a);
        this.f169332f = new v6w0(4);
        this.f169336j = new v6w0();
        this.f169337k = new v6w0();
        this.f169338l = new v6w0(8);
        this.f169339m = new v6w0();
        this.f169340n = new v6w0();
        this.f169310L = new int[1];
    }

    /* JADX INFO: renamed from: w */
    public static byte[] m187886w(long j, String str, long j2) {
        f5v0.m119533d(j != -9223372036854775807L);
        Locale locale = Locale.US;
        int i = (int) (j / 3600000000L);
        Integer numValueOf = Integer.valueOf(i);
        long j3 = j - (((long) i) * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        Integer numValueOf2 = Integer.valueOf(i2);
        long j4 = j3 - (((long) i2) * 60000000);
        int i3 = (int) (j4 / 1000000);
        String str2 = String.format(locale, str, numValueOf, numValueOf2, Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2)));
        int i4 = ggw0.f102568a;
        return str2.getBytes(wew0.f185990c);
    }

    /* JADX INFO: renamed from: x */
    public static int[] m187887x(@Nullable int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    @Override // p149l.j5r0
    @CallSuper
    /* JADX INFO: renamed from: c */
    public final void mo100820c(long j, long j2) {
        this.f169300B = -9223372036854775807L;
        this.f169305G = 0;
        this.f169325a.zzb();
        this.f169327b.m120461e();
        m187901u();
        for (int i = 0; i < this.f169329c.size(); i++) {
            n7r0 n7r0Var = ((sbr0) this.f169329c.valueAt(i)).f163599U;
            if (n7r0Var != null) {
                n7r0Var.m158158b();
            }
        }
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: d */
    public final boolean mo100821d(k5r0 k5r0Var) throws IOException {
        return new ubr0().m192933a(k5r0Var);
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: e */
    public final void mo100822e(m5r0 m5r0Var) {
        this.f169328b0 = m5r0Var;
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: f */
    public final int mo100823f(k5r0 k5r0Var, s6r0 s6r0Var) throws IOException {
        this.f169304F = false;
        while (!this.f169304F) {
            if (!this.f169325a.mo153973a(k5r0Var)) {
                for (int i = 0; i < this.f169329c.size(); i++) {
                    sbr0 sbr0Var = (sbr0) this.f169329c.valueAt(i);
                    sbr0Var.f163603Y.getClass();
                    n7r0 n7r0Var = sbr0Var.f163599U;
                    if (n7r0Var != null) {
                        n7r0Var.m158157a(sbr0Var.f163603Y, sbr0Var.f163614j);
                    }
                }
                return -1;
            }
            long jZzf = k5r0Var.zzf();
            if (this.f169351y) {
                this.f169299A = jZzf;
                s6r0Var.f162847a = this.f169352z;
                this.f169351y = false;
                return 1;
            }
            if (this.f169348v) {
                long j = this.f169299A;
                if (j != -1) {
                    s6r0Var.f162847a = j;
                    this.f169299A = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:112:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:114:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:116:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:117:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:118:0x02db  */
    /* JADX WARN: Multi-variable type inference failed */
    @CallSuper
    /* JADX INFO: renamed from: g */
    public final void m187888g(int i, int i2, k5r0 k5r0Var) throws IOException {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j;
        int i8;
        int[] iArr;
        int i9;
        int i10;
        int i11;
        int i12 = i;
        int i13 = 1;
        int i14 = 0;
        if (i12 != 161 && i12 != 163) {
            if (i12 == 165) {
                if (this.f169305G != 2) {
                    return;
                }
                sbr0 sbr0Var = (sbr0) this.f169329c.get(this.f169311M);
                if (this.f169314P != 4 || !"V_VP9".equals(sbr0Var.f163606b)) {
                    ((z4r0) k5r0Var).m217119k(i2, false);
                    return;
                }
                this.f169340n.m197259h(i2);
                ((z4r0) k5r0Var).mo140050b(this.f169340n.m197264m(), 0, i2, false);
                return;
            }
            if (i12 == 16877) {
                m187898r(i);
                sbr0 sbr0Var2 = this.f169347u;
                if (sbr0Var2.f163611g != 1685485123 && sbr0Var2.f163611g != 1685480259) {
                    ((z4r0) k5r0Var).m217119k(i2, false);
                    return;
                }
                byte[] bArr = new byte[i2];
                sbr0Var2.f163593O = bArr;
                ((z4r0) k5r0Var).mo140050b(bArr, 0, i2, false);
                return;
            }
            if (i12 == 16981) {
                m187898r(i);
                byte[] bArr2 = new byte[i2];
                this.f169347u.f163613i = bArr2;
                ((z4r0) k5r0Var).mo140050b(bArr2, 0, i2, false);
                return;
            }
            if (i12 == 18402) {
                byte[] bArr3 = new byte[i2];
                ((z4r0) k5r0Var).mo140050b(bArr3, 0, i2, false);
                m187898r(i);
                this.f169347u.f163614j = new a7r0(1, bArr3, 0, 0);
                return;
            }
            if (i12 == 21419) {
                Arrays.fill(this.f169335i.m197264m(), (byte) 0);
                ((z4r0) k5r0Var).mo140050b(this.f169335i.m197264m(), 4 - i2, i2, false);
                this.f169335i.m197262k(0);
                this.f169349w = (int) this.f169335i.m197246J();
                return;
            }
            if (i12 == 25506) {
                m187898r(i);
                byte[] bArr4 = new byte[i2];
                this.f169347u.f163615k = bArr4;
                ((z4r0) k5r0Var).mo140050b(bArr4, 0, i2, false);
                return;
            }
            if (i12 != 30322) {
                throw zzcc.zza("Unexpected id: " + i12, null);
            }
            m187898r(i);
            byte[] bArr5 = new byte[i2];
            this.f169347u.f163627w = bArr5;
            ((z4r0) k5r0Var).mo140050b(bArr5, 0, i2, false);
            return;
        }
        int i15 = 8;
        if (this.f169305G == 0) {
            this.f169311M = (int) this.f169327b.m120460d(k5r0Var, false, true, 8);
            this.f169312N = this.f169327b.m120459a();
            this.f169307I = -9223372036854775807L;
            this.f169305G = 1;
            this.f169333g.m197259h(0);
        }
        sbr0 sbr0Var3 = (sbr0) this.f169329c.get(this.f169311M);
        if (sbr0Var3 == null) {
            ((z4r0) k5r0Var).m217119k(i2 - this.f169312N, false);
            this.f169305G = 0;
            return;
        }
        sbr0Var3.f163603Y.getClass();
        if (this.f169305G == 1) {
            m187900t(k5r0Var, 3);
            int i16 = (this.f169333g.m197264m()[2] & 6) >> 1;
            if (i16 == 0) {
                this.f169309K = 1;
                int[] iArrM187887x = m187887x(this.f169310L, 1);
                this.f169310L = iArrM187887x;
                iArrM187887x[0] = (i2 - this.f169312N) - 3;
            } else {
                m187900t(k5r0Var, 4);
                int i17 = (this.f169333g.m197264m()[3] & 255) + 1;
                this.f169309K = i17;
                int[] iArrM187887x2 = m187887x(this.f169310L, i17);
                this.f169310L = iArrM187887x2;
                if (i16 == 2) {
                    int i18 = (i2 - this.f169312N) - 4;
                    int i19 = this.f169309K;
                    Arrays.fill(iArrM187887x2, 0, i19, i18 / i19);
                } else {
                    if (i16 == 1) {
                        int i20 = 0;
                        int i21 = 0;
                        int i22 = 4;
                        while (true) {
                            i8 = this.f169309K - 1;
                            iArr = this.f169310L;
                            if (i20 >= i8) {
                                break;
                            }
                            iArr[i20] = 0;
                            while (true) {
                                i9 = i22 + 1;
                                m187900t(k5r0Var, i9);
                                int i23 = this.f169333g.m197264m()[i22] & 255;
                                int[] iArr2 = this.f169310L;
                                i10 = iArr2[i20] + i23;
                                iArr2[i20] = i10;
                                if (i23 != 255) {
                                    break;
                                } else {
                                    i22 = i9;
                                }
                            }
                            i21 += i10;
                            i20++;
                            i22 = i9;
                        }
                        iArr[i8] = ((i2 - this.f169312N) - i22) - i21;
                    } else {
                        if (i16 != 3) {
                            throw zzcc.zza("Unexpected lacing value: 2", null);
                        }
                        int i24 = 0;
                        int i25 = 0;
                        int i26 = 4;
                        while (true) {
                            int i27 = this.f169309K - 1;
                            i3 = i13;
                            int[] iArr3 = this.f169310L;
                            if (i24 >= i27) {
                                i5 = i14;
                                iArr3[i27] = ((i2 - this.f169312N) - i26) - i25;
                                break;
                            }
                            iArr3[i24] = i14;
                            int i28 = i26 + 1;
                            m187900t(k5r0Var, i28);
                            if (this.f169333g.m197264m()[i26] == 0) {
                                throw zzcc.zza("No valid varint length mask found", null);
                            }
                            int i29 = i14;
                            while (true) {
                                if (i29 >= i15) {
                                    i6 = i14;
                                    i7 = i15;
                                    j = 0;
                                    break;
                                }
                                i7 = i15;
                                int i30 = i3 << (7 - i29);
                                i6 = i14;
                                if ((this.f169333g.m197264m()[i26] & i30) != 0) {
                                    i28 += i29;
                                    m187900t(k5r0Var, i28);
                                    j = this.f169333g.m197264m()[i26] & 255 & (~i30);
                                    for (int i31 = i26 + 1; i31 < i28; i31++) {
                                        j = (j << i7) | ((long) (this.f169333g.m197264m()[i31] & 255));
                                    }
                                    if (i24 <= 0) {
                                        break;
                                    }
                                    j -= (1 << ((i29 * 7) + 6)) - 1;
                                    break;
                                }
                                i29++;
                                i14 = i6;
                                i15 = i7;
                            }
                            i26 = i28;
                            if (j < -2147483648L || j > 2147483647L) {
                                throw zzcc.zza("EBML lacing sample size out of range.", null);
                            }
                            int[] iArr4 = this.f169310L;
                            int i32 = (int) j;
                            if (i24 != 0) {
                                i32 += iArr4[i24 - 1];
                            }
                            iArr4[i24] = i32;
                            i25 += i32;
                            i24++;
                            i13 = i3;
                            i14 = i6;
                            i15 = i7;
                        }
                    }
                    this.f169306H = this.f169300B + m187896p((this.f169333g.m197264m()[i5] << 8) | (this.f169333g.m197264m()[i3] & 255));
                    if (sbr0Var3.f163608d != 2) {
                        i11 = i3;
                    } else if (i12 == 163) {
                        if ((this.f169333g.m197264m()[2] & 128) == 128) {
                            i11 = i3;
                        } else {
                            i11 = i5;
                        }
                        i12 = 163;
                    } else {
                        i11 = i5;
                    }
                    this.f169313O = i11;
                    this.f169305G = 2;
                    this.f169308J = i5;
                    i4 = 163;
                }
            }
            i3 = 1;
            i5 = 0;
            this.f169306H = this.f169300B + m187896p((this.f169333g.m197264m()[i5] << 8) | (this.f169333g.m197264m()[i3] & 255));
            if (sbr0Var3.f163608d != 2) {
                i11 = i3;
            } else if (i12 == 163) {
                if ((this.f169333g.m197264m()[2] & 128) == 128) {
                    i11 = i3;
                } else {
                    i11 = i5;
                }
                i12 = 163;
            } else {
                i11 = i5;
            }
            this.f169313O = i11;
            this.f169305G = 2;
            this.f169308J = i5;
            i4 = 163;
        } else {
            i3 = 1;
            i4 = 163;
        }
        if (i12 == i4) {
            while (true) {
                int i33 = this.f169308J;
                if (i33 >= this.f169309K) {
                    this.f169305G = 0;
                    return;
                }
                int iM187894n = m187894n(k5r0Var, sbr0Var3, this.f169310L[i33], false);
                sbr0 sbr0Var4 = sbr0Var3;
                m187899s(sbr0Var4, this.f169306H + ((long) ((this.f169308J * sbr0Var3.f163609e) / 1000)), this.f169313O, iM187894n, 0);
                this.f169308J++;
                sbr0Var3 = sbr0Var4;
            }
        } else {
            while (true) {
                int i34 = this.f169308J;
                if (i34 >= this.f169309K) {
                    return;
                }
                int[] iArr5 = this.f169310L;
                boolean z = i3;
                iArr5[i34] = m187894n(k5r0Var, sbr0Var3, iArr5[i34], z);
                this.f169308J += z ? 1 : 0;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:186:0x02d4  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @CallSuper
    /* JADX INFO: renamed from: h */
    public final void m187889h(int i) throws zzcc {
        int i2;
        v6r0 u6r0Var;
        int i3;
        f5v0.m119531b(this.f169328b0);
        if (i == 160) {
            if (this.f169305G == 2) {
                sbr0 sbr0Var = (sbr0) this.f169329c.get(this.f169311M);
                sbr0Var.f163603Y.getClass();
                if (this.f169316R > 0 && "A_OPUS".equals(sbr0Var.f163606b)) {
                    v6w0 v6w0Var = this.f169340n;
                    byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f169316R).array();
                    v6w0Var.m197260i(bArrArray, bArrArray.length);
                }
                int i4 = 0;
                for (int i5 = 0; i5 < this.f169309K; i5++) {
                    i4 += this.f169310L[i5];
                }
                int i6 = 0;
                while (i6 < this.f169309K) {
                    long j = this.f169306H + ((long) ((sbr0Var.f163609e * i6) / 1000));
                    int i7 = this.f169313O;
                    if (i6 == 0) {
                        if (!this.f169315Q) {
                            i7 |= 1;
                        }
                        i2 = 0;
                    } else {
                        i2 = i6;
                    }
                    int i8 = this.f169310L[i2];
                    int i9 = i4 - i8;
                    m187899s(sbr0Var, j, i7, i8, i9);
                    i6 = i2 + 1;
                    i4 = i9;
                }
                this.f169305G = 0;
                return;
            }
            return;
        }
        if (i != 174) {
            if (i == 19899) {
                int i10 = this.f169349w;
                if (i10 != -1) {
                    long j2 = this.f169350x;
                    if (j2 != -1) {
                        if (i10 == 475249515) {
                            this.f169352z = j2;
                            return;
                        }
                        return;
                    }
                }
                throw zzcc.zza("Mandatory element SeekID or SeekPosition not found", null);
            }
            if (i == 25152) {
                m187898r(i);
                sbr0 sbr0Var2 = this.f169347u;
                if (sbr0Var2.f163612h) {
                    if (sbr0Var2.f163614j == null) {
                        throw zzcc.zza("Encrypted Track found but ContentEncKeyID was not found", null);
                    }
                    sbr0Var2.f163616l = new zzae(null, new zzad(wby0.f185630a, null, "video/webm", this.f169347u.f163614j.f67947b));
                    return;
                }
                return;
            }
            if (i == 28032) {
                m187898r(i);
                sbr0 sbr0Var3 = this.f169347u;
                if (sbr0Var3.f163612h && sbr0Var3.f163613i != null) {
                    throw zzcc.zza("Combining encryption and compression is not supported", null);
                }
                return;
            }
            if (i == 357149030) {
                if (this.f169344r == -9223372036854775807L) {
                    this.f169344r = 1000000L;
                }
                long j3 = this.f169345s;
                if (j3 != -9223372036854775807L) {
                    this.f169346t = m187896p(j3);
                    return;
                }
                return;
            }
            if (i == 374648427) {
                if (this.f169329c.size() == 0) {
                    throw zzcc.zza("No valid tracks were found", null);
                }
                this.f169328b0.mo129453c();
                return;
            }
            if (i != 475249515) {
                return;
            }
            if (!this.f169348v) {
                m5r0 m5r0Var = this.f169328b0;
                twv0 twv0Var = this.f169301C;
                twv0 twv0Var2 = this.f169302D;
                if (this.f169343q == -1 || this.f169346t == -9223372036854775807L || twv0Var == null || twv0Var.m190909a() == 0 || twv0Var2 == null || twv0Var2.m190909a() != twv0Var.m190909a()) {
                    u6r0Var = new u6r0(this.f169346t, 0L);
                } else {
                    int iM190909a = twv0Var.m190909a();
                    int[] iArrCopyOf = new int[iM190909a];
                    long[] jArrCopyOf = new long[iM190909a];
                    long[] jArrCopyOf2 = new long[iM190909a];
                    long[] jArrCopyOf3 = new long[iM190909a];
                    int i11 = 0;
                    while (i11 < iM190909a) {
                        jArrCopyOf3[i11] = twv0Var.m190910b(i11);
                        jArrCopyOf[i11] = this.f169343q + twv0Var2.m190910b(i11);
                        i11++;
                        iM190909a = iM190909a;
                    }
                    int i12 = iM190909a;
                    int i13 = 0;
                    while (true) {
                        i3 = i12 - 1;
                        if (i13 >= i3) {
                            break;
                        }
                        int i14 = i13 + 1;
                        iArrCopyOf[i13] = (int) (jArrCopyOf[i14] - jArrCopyOf[i13]);
                        jArrCopyOf2[i13] = jArrCopyOf3[i14] - jArrCopyOf3[i13];
                        i13 = i14;
                    }
                    iArrCopyOf[i3] = (int) ((this.f169343q + this.f169342p) - jArrCopyOf[i3]);
                    long j4 = this.f169346t - jArrCopyOf3[i3];
                    jArrCopyOf2[i3] = j4;
                    if (j4 <= 0) {
                        svv0.m186111f("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j4);
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i3);
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i3);
                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i3);
                        jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i3);
                    }
                    u6r0Var = new x4r0(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
                }
                m5r0Var.mo129455j(u6r0Var);
                this.f169348v = true;
            }
            this.f169301C = null;
            this.f169302D = null;
            return;
        }
        sbr0 sbr0Var4 = this.f169347u;
        f5v0.m119531b(sbr0Var4);
        String str = sbr0Var4.f163606b;
        if (str == null) {
            throw zzcc.zza("CodecId is missing in TrackEntry element", null);
        }
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    sbr0Var4.m183262e(this.f169328b0, sbr0Var4.f163607c);
                    this.f169329c.put(sbr0Var4.f163607c, sbr0Var4);
                }
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    sbr0Var4.m183262e(this.f169328b0, sbr0Var4.f163607c);
                    this.f169329c.put(sbr0Var4.f163607c, sbr0Var4);
                }
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    sbr0Var4.m183262e(this.f169328b0, sbr0Var4.f163607c);
                    this.f169329c.put(sbr0Var4.f163607c, sbr0Var4);
                }
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    sbr0Var4.m183262e(this.f169328b0, sbr0Var4.f163607c);
                    this.f169329c.put(sbr0Var4.f163607c, sbr0Var4);
                }
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    sbr0Var4.m183262e(this.f169328b0, sbr0Var4.f163607c);
                    this.f169329c.put(sbr0Var4.f163607c, sbr0Var4);
                }
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    sbr0Var4.m183262e(this.f169328b0, sbr0Var4.f163607c);
                    this.f169329c.put(sbr0Var4.f163607c, sbr0Var4);
                }
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    sbr0Var4.m183262e(this.f169328b0, sbr0Var4.f163607c);
                    this.f169329c.put(sbr0Var4.f163607c, sbr0Var4);
                }
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    sbr0Var4.m183262e(this.f169328b0, sbr0Var4.f163607c);
                    this.f169329c.put(sbr0Var4.f163607c, sbr0Var4);
                }
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    sbr0Var4.m183262e(this.f169328b0, sbr0Var4.f163607c);
                    this.f169329c.put(sbr0Var4.f163607c, sbr0Var4);
                }
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    sbr0Var4.m183262e(this.f169328b0, sbr0Var4.f163607c);
                    this.f169329c.put(sbr0Var4.f163607c, sbr0Var4);
                }
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    sbr0Var4.m183262e(this.f169328b0, sbr0Var4.f163607c);
                    this.f169329c.put(sbr0Var4.f163607c, sbr0Var4);
                }
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    sbr0Var4.m183262e(this.f169328b0, sbr0Var4.f163607c);
                    this.f169329c.put(sbr0Var4.f163607c, sbr0Var4);
                }
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    sbr0Var4.m183262e(this.f169328b0, sbr0Var4.f163607c);
                    this.f169329c.put(sbr0Var4.f163607c, sbr0Var4);
                }
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    sbr0Var4.m183262e(this.f169328b0, sbr0Var4.f163607c);
                    this.f169329c.put(sbr0Var4.f163607c, sbr0Var4);
                }
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    sbr0Var4.m183262e(this.f169328b0, sbr0Var4.f163607c);
                    this.f169329c.put(sbr0Var4.f163607c, sbr0Var4);
                }
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    sbr0Var4.m183262e(this.f169328b0, sbr0Var4.f163607c);
                    this.f169329c.put(sbr0Var4.f163607c, sbr0Var4);
                }
                break;
            case 82318131:
                if (str.equals("V_AV1")) {
                    sbr0Var4.m183262e(this.f169328b0, sbr0Var4.f163607c);
                    this.f169329c.put(sbr0Var4.f163607c, sbr0Var4);
                }
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    sbr0Var4.m183262e(this.f169328b0, sbr0Var4.f163607c);
                    this.f169329c.put(sbr0Var4.f163607c, sbr0Var4);
                }
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    sbr0Var4.m183262e(this.f169328b0, sbr0Var4.f163607c);
                    this.f169329c.put(sbr0Var4.f163607c, sbr0Var4);
                }
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    sbr0Var4.m183262e(this.f169328b0, sbr0Var4.f163607c);
                    this.f169329c.put(sbr0Var4.f163607c, sbr0Var4);
                }
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    sbr0Var4.m183262e(this.f169328b0, sbr0Var4.f163607c);
                    this.f169329c.put(sbr0Var4.f163607c, sbr0Var4);
                }
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    sbr0Var4.m183262e(this.f169328b0, sbr0Var4.f163607c);
                    this.f169329c.put(sbr0Var4.f163607c, sbr0Var4);
                }
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    sbr0Var4.m183262e(this.f169328b0, sbr0Var4.f163607c);
                    this.f169329c.put(sbr0Var4.f163607c, sbr0Var4);
                }
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    sbr0Var4.m183262e(this.f169328b0, sbr0Var4.f163607c);
                    this.f169329c.put(sbr0Var4.f163607c, sbr0Var4);
                }
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    sbr0Var4.m183262e(this.f169328b0, sbr0Var4.f163607c);
                    this.f169329c.put(sbr0Var4.f163607c, sbr0Var4);
                }
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    sbr0Var4.m183262e(this.f169328b0, sbr0Var4.f163607c);
                    this.f169329c.put(sbr0Var4.f163607c, sbr0Var4);
                }
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    sbr0Var4.m183262e(this.f169328b0, sbr0Var4.f163607c);
                    this.f169329c.put(sbr0Var4.f163607c, sbr0Var4);
                }
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    sbr0Var4.m183262e(this.f169328b0, sbr0Var4.f163607c);
                    this.f169329c.put(sbr0Var4.f163607c, sbr0Var4);
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    sbr0Var4.m183262e(this.f169328b0, sbr0Var4.f163607c);
                    this.f169329c.put(sbr0Var4.f163607c, sbr0Var4);
                }
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    sbr0Var4.m183262e(this.f169328b0, sbr0Var4.f163607c);
                    this.f169329c.put(sbr0Var4.f163607c, sbr0Var4);
                }
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    sbr0Var4.m183262e(this.f169328b0, sbr0Var4.f163607c);
                    this.f169329c.put(sbr0Var4.f163607c, sbr0Var4);
                }
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    sbr0Var4.m183262e(this.f169328b0, sbr0Var4.f163607c);
                    this.f169329c.put(sbr0Var4.f163607c, sbr0Var4);
                }
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    sbr0Var4.m183262e(this.f169328b0, sbr0Var4.f163607c);
                    this.f169329c.put(sbr0Var4.f163607c, sbr0Var4);
                }
                break;
        }
        this.f169347u = null;
    }

    @CallSuper
    /* JADX INFO: renamed from: i */
    public final void m187890i(int i, double d) throws zzcc {
        if (i == 181) {
            m187898r(i);
            this.f169347u.f163596R = (int) d;
            return;
        }
        if (i == 17545) {
            this.f169345s = (long) d;
            return;
        }
        switch (i) {
            case 21969:
                m187898r(i);
                this.f169347u.f163583E = (float) d;
                break;
            case 21970:
                m187898r(i);
                this.f169347u.f163584F = (float) d;
                break;
            case 21971:
                m187898r(i);
                this.f169347u.f163585G = (float) d;
                break;
            case 21972:
                m187898r(i);
                this.f169347u.f163586H = (float) d;
                break;
            case 21973:
                m187898r(i);
                this.f169347u.f163587I = (float) d;
                break;
            case 21974:
                m187898r(i);
                this.f169347u.f163588J = (float) d;
                break;
            case 21975:
                m187898r(i);
                this.f169347u.f163589K = (float) d;
                break;
            case 21976:
                m187898r(i);
                this.f169347u.f163590L = (float) d;
                break;
            case 21977:
                m187898r(i);
                this.f169347u.f163591M = (float) d;
                break;
            case 21978:
                m187898r(i);
                this.f169347u.f163592N = (float) d;
                break;
            default:
                switch (i) {
                    case 30323:
                        m187898r(i);
                        this.f169347u.f163624t = (float) d;
                        break;
                    case 30324:
                        m187898r(i);
                        this.f169347u.f163625u = (float) d;
                        break;
                    case 30325:
                        m187898r(i);
                        this.f169347u.f163626v = (float) d;
                        break;
                }
                break;
        }
    }

    @CallSuper
    /* JADX INFO: renamed from: j */
    public final void m187891j(int i, long j) throws zzcc {
        boolean z;
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw zzcc.zza("ContentEncodingOrder " + j + " not supported", null);
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw zzcc.zza("ContentEncodingScope " + j + " not supported", null);
        }
        switch (i) {
            case 131:
                m187898r(i);
                this.f169347u.f163608d = (int) j;
                return;
            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA /* 136 */:
                z = j == 1;
                m187898r(i);
                this.f169347u.f163601W = z;
                return;
            case CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA /* 155 */:
                this.f169307I = m187896p(j);
                return;
            case 159:
                m187898r(i);
                this.f169347u.f163594P = (int) j;
                return;
            case 176:
                m187898r(i);
                this.f169347u.f163617m = (int) j;
                return;
            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384 /* 179 */:
                m187897q(i);
                this.f169301C.m190911c(m187896p(j));
                return;
            case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 186 */:
                m187898r(i);
                this.f169347u.f163618n = (int) j;
                return;
            case 215:
                m187898r(i);
                this.f169347u.f163607c = (int) j;
                return;
            case 231:
                this.f169300B = m187896p(j);
                return;
            case 238:
                this.f169314P = (int) j;
                return;
            case 241:
                if (this.f169303E) {
                    return;
                }
                m187897q(i);
                this.f169302D.m190911c(j);
                this.f169303E = true;
                return;
            case 251:
                this.f169315Q = true;
                return;
            case 16871:
                m187898r(i);
                this.f169347u.f163611g = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw zzcc.zza("ContentCompAlgo " + j + " not supported", null);
            case 17029:
                if (j < 1 || j > 2) {
                    throw zzcc.zza("DocTypeReadVersion " + j + " not supported", null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw zzcc.zza("EBMLReadVersion " + j + " not supported", null);
            case 18401:
                if (j == 5) {
                    return;
                }
                throw zzcc.zza("ContentEncAlgo " + j + " not supported", null);
            case 18408:
                if (j == 1) {
                    return;
                }
                throw zzcc.zza("AESSettingsCipherMode " + j + " not supported", null);
            case 21420:
                this.f169350x = j + this.f169343q;
                return;
            case 21432:
                int i2 = (int) j;
                m187898r(i);
                if (i2 == 0) {
                    this.f169347u.f163628x = 0;
                    return;
                }
                if (i2 == 1) {
                    this.f169347u.f163628x = 2;
                    return;
                } else if (i2 == 3) {
                    this.f169347u.f163628x = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    this.f169347u.f163628x = 3;
                    return;
                }
            case 21680:
                m187898r(i);
                this.f169347u.f163620p = (int) j;
                return;
            case 21682:
                m187898r(i);
                this.f169347u.f163622r = (int) j;
                return;
            case 21690:
                m187898r(i);
                this.f169347u.f163621q = (int) j;
                return;
            case 21930:
                z = j == 1;
                m187898r(i);
                this.f169347u.f163600V = z;
                return;
            case 21938:
                m187898r(i);
                sbr0 sbr0Var = this.f169347u;
                sbr0Var.f163629y = true;
                sbr0Var.f163619o = (int) j;
                return;
            case 21998:
                m187898r(i);
                this.f169347u.f163610f = (int) j;
                return;
            case 22186:
                m187898r(i);
                this.f169347u.f163597S = j;
                return;
            case 22203:
                m187898r(i);
                this.f169347u.f163598T = j;
                return;
            case 25188:
                m187898r(i);
                this.f169347u.f163595Q = (int) j;
                return;
            case 30114:
                this.f169316R = j;
                return;
            case 30321:
                int i3 = (int) j;
                m187898r(i);
                if (i3 == 0) {
                    this.f169347u.f163623s = 0;
                    return;
                }
                if (i3 == 1) {
                    this.f169347u.f163623s = 1;
                    return;
                } else if (i3 == 2) {
                    this.f169347u.f163623s = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.f169347u.f163623s = 3;
                    return;
                }
            case 2352003:
                m187898r(i);
                this.f169347u.f163609e = (int) j;
                return;
            case 2807729:
                this.f169344r = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        int i4 = (int) j;
                        m187898r(i);
                        if (i4 == 1) {
                            this.f169347u.f163580B = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            this.f169347u.f163580B = 1;
                            return;
                        }
                    case 21946:
                        m187898r(i);
                        int iM175708b = qny0.m175708b((int) j);
                        if (iM175708b != -1) {
                            this.f169347u.f163579A = iM175708b;
                            return;
                        }
                        return;
                    case 21947:
                        m187898r(i);
                        this.f169347u.f163629y = true;
                        int iM175707a = qny0.m175707a((int) j);
                        if (iM175707a != -1) {
                            this.f169347u.f163630z = iM175707a;
                            return;
                        }
                        return;
                    case 21948:
                        m187898r(i);
                        this.f169347u.f163581C = (int) j;
                        return;
                    case 21949:
                        m187898r(i);
                        this.f169347u.f163582D = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    @CallSuper
    /* JADX INFO: renamed from: k */
    public final void m187892k(int i, long j, long j2) throws zzcc {
        f5v0.m119531b(this.f169328b0);
        if (i == 160) {
            this.f169315Q = false;
            this.f169316R = 0L;
            return;
        }
        if (i == 174) {
            this.f169347u = new sbr0();
            return;
        }
        if (i == 187) {
            this.f169303E = false;
            return;
        }
        if (i == 19899) {
            this.f169349w = -1;
            this.f169350x = -1L;
            return;
        }
        if (i == 20533) {
            m187898r(i);
            this.f169347u.f163612h = true;
            return;
        }
        if (i == 21968) {
            m187898r(i);
            this.f169347u.f163629y = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.f169343q;
            if (j3 != -1 && j3 != j) {
                throw zzcc.zza("Multiple Segment elements not supported", null);
            }
            this.f169343q = j;
            this.f169342p = j2;
            return;
        }
        if (i == 475249515) {
            this.f169301C = new twv0(32);
            this.f169302D = new twv0(32);
        } else if (i == 524531317 && !this.f169348v) {
            if (this.f169330d && this.f169352z != -1) {
                this.f169351y = true;
            } else {
                this.f169328b0.mo129455j(new u6r0(this.f169346t, 0L));
                this.f169348v = true;
            }
        }
    }

    @CallSuper
    /* JADX INFO: renamed from: l */
    public final void m187893l(int i, String str) throws zzcc {
        if (i == 134) {
            m187898r(i);
            this.f169347u.f163606b = str;
            return;
        }
        if (i == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            throw zzcc.zza("DocType " + str + " not supported", null);
        }
        if (i == 21358) {
            m187898r(i);
            this.f169347u.f163605a = str;
        } else {
            if (i != 2274716) {
                return;
            }
            m187898r(i);
            this.f169347u.f163602X = str;
        }
    }

    @RequiresNonNull({"#2.output"})
    /* JADX INFO: renamed from: n */
    public final int m187894n(k5r0 k5r0Var, sbr0 sbr0Var, int i, boolean z) throws IOException {
        int i2;
        if ("S_TEXT/UTF8".equals(sbr0Var.f163606b)) {
            m187902v(k5r0Var, f169293d0, i);
            int i3 = this.f169318T;
            m187901u();
            return i3;
        }
        if ("S_TEXT/ASS".equals(sbr0Var.f163606b)) {
            m187902v(k5r0Var, f169295f0, i);
            int i4 = this.f169318T;
            m187901u();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(sbr0Var.f163606b)) {
            m187902v(k5r0Var, f169296g0, i);
            int i5 = this.f169318T;
            m187901u();
            return i5;
        }
        m7r0 m7r0Var = sbr0Var.f163603Y;
        if (!this.f169320V) {
            if (sbr0Var.f163612h) {
                this.f169313O &= -1073741825;
                if (!this.f169321W) {
                    ((z4r0) k5r0Var).mo140050b(this.f169333g.m197264m(), 0, 1, false);
                    this.f169317S++;
                    if ((this.f169333g.m197264m()[0] & 128) == 128) {
                        throw zzcc.zza("Extension bit is set in signal byte", null);
                    }
                    this.f169324Z = this.f169333g.m197264m()[0];
                    this.f169321W = true;
                }
                byte b = this.f169324Z;
                if ((b & 1) == 1) {
                    int i6 = b & 2;
                    this.f169313O |= 1073741824;
                    if (!this.f169326a0) {
                        ((z4r0) k5r0Var).mo140050b(this.f169338l.m197264m(), 0, 8, false);
                        this.f169317S += 8;
                        this.f169326a0 = true;
                        this.f169333g.m197264m()[0] = (byte) ((i6 != 2 ? 0 : 128) | 8);
                        this.f169333g.m197262k(0);
                        m7r0Var.mo134528a(this.f169333g, 1, 1);
                        this.f169318T++;
                        this.f169338l.m197262k(0);
                        m7r0Var.mo134528a(this.f169338l, 8, 1);
                        this.f169318T += 8;
                    }
                    if (i6 == 2) {
                        if (!this.f169322X) {
                            ((z4r0) k5r0Var).mo140050b(this.f169333g.m197264m(), 0, 1, false);
                            this.f169317S++;
                            this.f169333g.m197262k(0);
                            this.f169323Y = this.f169333g.m197238B();
                            this.f169322X = true;
                        }
                        int i7 = this.f169323Y * 4;
                        this.f169333g.m197259h(i7);
                        ((z4r0) k5r0Var).mo140050b(this.f169333g.m197264m(), 0, i7, false);
                        this.f169317S += i7;
                        int i8 = (this.f169323Y >> 1) + 1;
                        int i9 = (i8 * 6) + 2;
                        ByteBuffer byteBuffer = this.f169341o;
                        if (byteBuffer == null || byteBuffer.capacity() < i9) {
                            this.f169341o = ByteBuffer.allocate(i9);
                        }
                        this.f169341o.position(0);
                        this.f169341o.putShort((short) i8);
                        int i10 = 0;
                        int i11 = 0;
                        while (true) {
                            i2 = this.f169323Y;
                            if (i10 >= i2) {
                                break;
                            }
                            int iM197241E = this.f169333g.m197241E();
                            int i12 = iM197241E - i11;
                            int i13 = i10 % 2;
                            ByteBuffer byteBuffer2 = this.f169341o;
                            if (i13 == 0) {
                                byteBuffer2.putShort((short) i12);
                            } else {
                                byteBuffer2.putInt(i12);
                            }
                            i10++;
                            i11 = iM197241E;
                        }
                        int i14 = (i - this.f169317S) - i11;
                        int i15 = i2 & 1;
                        ByteBuffer byteBuffer3 = this.f169341o;
                        if (i15 == 1) {
                            byteBuffer3.putInt(i14);
                        } else {
                            byteBuffer3.putShort((short) i14);
                            this.f169341o.putInt(0);
                        }
                        this.f169339m.m197260i(this.f169341o.array(), i9);
                        m7r0Var.mo134528a(this.f169339m, i9, 1);
                        this.f169318T += i9;
                    }
                }
            } else {
                byte[] bArr = sbr0Var.f163613i;
                if (bArr != null) {
                    this.f169336j.m197260i(bArr, bArr.length);
                }
            }
            if (!"A_OPUS".equals(sbr0Var.f163606b) ? sbr0Var.f163610f > 0 : z) {
                this.f169313O |= 268435456;
                this.f169340n.m197259h(0);
                int iM197271t = (this.f169336j.m197271t() + i) - this.f169317S;
                this.f169333g.m197259h(4);
                this.f169333g.m197264m()[0] = (byte) ((iM197271t >> 24) & 255);
                this.f169333g.m197264m()[1] = (byte) ((iM197271t >> 16) & 255);
                this.f169333g.m197264m()[2] = (byte) ((iM197271t >> 8) & 255);
                this.f169333g.m197264m()[3] = (byte) (iM197271t & 255);
                m7r0Var.mo134528a(this.f169333g, 4, 2);
                this.f169318T += 4;
            }
            this.f169320V = true;
        }
        int iM197271t2 = i + this.f169336j.m197271t();
        if (!"V_MPEG4/ISO/AVC".equals(sbr0Var.f163606b) && !"V_MPEGH/ISO/HEVC".equals(sbr0Var.f163606b)) {
            if (sbr0Var.f163599U != null) {
                f5v0.m119535f(this.f169336j.m197271t() == 0);
                sbr0Var.f163599U.m158160d(k5r0Var);
            }
            while (true) {
                int i16 = this.f169317S;
                if (i16 >= iM197271t2) {
                    break;
                }
                int iM187895o = m187895o(k5r0Var, m7r0Var, iM197271t2 - i16);
                this.f169317S += iM187895o;
                this.f169318T += iM187895o;
            }
        } else {
            byte[] bArrM197264m = this.f169332f.m197264m();
            bArrM197264m[0] = 0;
            bArrM197264m[1] = 0;
            bArrM197264m[2] = 0;
            int i17 = sbr0Var.f163604Z;
            int i18 = 4 - i17;
            while (this.f169317S < iM197271t2) {
                int i19 = this.f169319U;
                if (i19 == 0) {
                    int iMin = Math.min(i17, this.f169336j.m197268q());
                    ((z4r0) k5r0Var).mo140050b(bArrM197264m, i18 + iMin, i17 - iMin, false);
                    if (iMin > 0) {
                        this.f169336j.m197258g(bArrM197264m, i18, iMin);
                    }
                    this.f169317S += i17;
                    this.f169332f.m197262k(0);
                    this.f169319U = this.f169332f.m197241E();
                    this.f169331e.m197262k(0);
                    z6r0.m217416b(m7r0Var, this.f169331e, 4);
                    this.f169318T += 4;
                } else {
                    int iM187895o2 = m187895o(k5r0Var, m7r0Var, i19);
                    this.f169317S += iM187895o2;
                    this.f169318T += iM187895o2;
                    this.f169319U -= iM187895o2;
                }
            }
        }
        if ("A_VORBIS".equals(sbr0Var.f163606b)) {
            this.f169334h.m197262k(0);
            z6r0.m217416b(m7r0Var, this.f169334h, 4);
            this.f169318T += 4;
        }
        int i20 = this.f169318T;
        m187901u();
        return i20;
    }

    /* JADX INFO: renamed from: o */
    public final int m187895o(k5r0 k5r0Var, m7r0 m7r0Var, int i) throws IOException {
        int iM197268q = this.f169336j.m197268q();
        if (iM197268q <= 0) {
            return z6r0.m217415a(m7r0Var, k5r0Var, i, false);
        }
        int iMin = Math.min(i, iM197268q);
        z6r0.m217416b(m7r0Var, this.f169336j, iMin);
        return iMin;
    }

    /* JADX INFO: renamed from: p */
    public final long m187896p(long j) throws zzcc {
        long j2 = this.f169344r;
        if (j2 != -9223372036854775807L) {
            return ggw0.m126051H(j, j2, 1000L, RoundingMode.FLOOR);
        }
        throw zzcc.zza("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    /* JADX INFO: renamed from: q */
    public final void m187897q(int i) throws zzcc {
        if (this.f169301C == null || this.f169302D == null) {
            throw zzcc.zza("Element " + i + " must be in a Cues", null);
        }
    }

    @EnsuresNonNull({"currentTrack"})
    /* JADX INFO: renamed from: r */
    public final void m187898r(int i) throws zzcc {
        if (this.f169347u != null) {
            return;
        }
        throw zzcc.zza("Element " + i + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c8 A[LOOP:0: B:34:0x00b0->B:39:0x00c8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x00c2 A[SYNTHETIC] */
    @RequiresNonNull({"#1.output"})
    /* JADX INFO: renamed from: s */
    public final void m187899s(sbr0 sbr0Var, long j, int i, int i2, int i3) {
        byte[] bArrM187886w;
        int i4;
        int iM197270s;
        int iM197271t;
        n7r0 n7r0Var = sbr0Var.f163599U;
        if (n7r0Var != null) {
            n7r0Var.m158159c(sbr0Var.f163603Y, j, i, i2, i3, sbr0Var.f163614j);
        } else {
            if ("S_TEXT/UTF8".equals(sbr0Var.f163606b) || "S_TEXT/ASS".equals(sbr0Var.f163606b) || "S_TEXT/WEBVTT".equals(sbr0Var.f163606b)) {
                if (this.f169309K > 1) {
                    svv0.m186111f("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.f169307I;
                    if (j2 != -9223372036854775807L) {
                        String str = sbr0Var.f163606b;
                        byte[] bArrM197264m = this.f169337k.m197264m();
                        int iHashCode = str.hashCode();
                        if (iHashCode == 738597099) {
                            if (str.equals("S_TEXT/ASS")) {
                                bArrM187886w = m187886w(j2, "%01d:%02d:%02d:%02d", 10000L);
                                i4 = 21;
                                System.arraycopy(bArrM187886w, 0, bArrM197264m, i4, bArrM187886w.length);
                                for (iM197270s = this.f169337k.m197270s(); iM197270s < this.f169337k.m197271t(); iM197270s++) {
                                    if (this.f169337k.m197264m()[iM197270s] == 0) {
                                        this.f169337k.m197261j(iM197270s);
                                        break;
                                    }
                                }
                                m7r0 m7r0Var = sbr0Var.f163603Y;
                                v6w0 v6w0Var = this.f169337k;
                                z6r0.m217416b(m7r0Var, v6w0Var, v6w0Var.m197271t());
                                iM197271t = i2 + this.f169337k.m197271t();
                            }
                            x9g0.m207497a();
                            return;
                        }
                        if (iHashCode == 1045209816) {
                            if (str.equals("S_TEXT/WEBVTT")) {
                                bArrM187886w = m187886w(j2, "%02d:%02d:%02d.%03d", 1000L);
                                i4 = 25;
                                System.arraycopy(bArrM187886w, 0, bArrM197264m, i4, bArrM187886w.length);
                                while (iM197270s < this.f169337k.m197271t()) {
                                    if (this.f169337k.m197264m()[iM197270s] == 0) {
                                        this.f169337k.m197261j(iM197270s);
                                        break;
                                    }
                                }
                                m7r0 m7r0Var2 = sbr0Var.f163603Y;
                                v6w0 v6w0Var2 = this.f169337k;
                                z6r0.m217416b(m7r0Var2, v6w0Var2, v6w0Var2.m197271t());
                                iM197271t = i2 + this.f169337k.m197271t();
                            }
                            x9g0.m207497a();
                            return;
                        }
                        if (iHashCode == 1422270023 && str.equals("S_TEXT/UTF8")) {
                            bArrM187886w = m187886w(j2, "%02d:%02d:%02d,%03d", 1000L);
                            i4 = 19;
                            System.arraycopy(bArrM187886w, 0, bArrM197264m, i4, bArrM187886w.length);
                            while (iM197270s < this.f169337k.m197271t()) {
                                if (this.f169337k.m197264m()[iM197270s] == 0) {
                                    this.f169337k.m197261j(iM197270s);
                                    break;
                                }
                            }
                            m7r0 m7r0Var3 = sbr0Var.f163603Y;
                            v6w0 v6w0Var3 = this.f169337k;
                            z6r0.m217416b(m7r0Var3, v6w0Var3, v6w0Var3.m197271t());
                            iM197271t = i2 + this.f169337k.m197271t();
                        }
                        x9g0.m207497a();
                        return;
                    }
                    svv0.m186111f("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                }
                iM197271t = i2;
            } else {
                iM197271t = i2;
            }
            if ((i & 268435456) != 0) {
                int i5 = this.f169309K;
                v6w0 v6w0Var4 = this.f169340n;
                if (i5 > 1) {
                    v6w0Var4.m197259h(0);
                } else {
                    int iM197271t2 = v6w0Var4.m197271t();
                    sbr0Var.f163603Y.mo134528a(this.f169340n, iM197271t2, 2);
                    iM197271t += iM197271t2;
                }
            }
            sbr0Var.f163603Y.mo134530c(j, i, iM197271t, i3, sbr0Var.f163614j);
        }
        this.f169304F = true;
    }

    /* JADX INFO: renamed from: t */
    public final void m187900t(k5r0 k5r0Var, int i) throws IOException {
        if (this.f169333g.m197271t() >= i) {
            return;
        }
        if (this.f169333g.m197269r() < i) {
            v6w0 v6w0Var = this.f169333g;
            int iM197269r = v6w0Var.m197269r();
            v6w0Var.m197256e(Math.max(iM197269r + iM197269r, i));
        }
        v6w0 v6w0Var2 = this.f169333g;
        ((z4r0) k5r0Var).mo140050b(v6w0Var2.m197264m(), v6w0Var2.m197271t(), i - v6w0Var2.m197271t(), false);
        this.f169333g.m197261j(i);
    }

    /* JADX INFO: renamed from: u */
    public final void m187901u() {
        this.f169317S = 0;
        this.f169318T = 0;
        this.f169319U = 0;
        this.f169320V = false;
        this.f169321W = false;
        this.f169322X = false;
        this.f169323Y = 0;
        this.f169324Z = (byte) 0;
        this.f169326a0 = false;
        this.f169336j.m197259h(0);
    }

    /* JADX INFO: renamed from: v */
    public final void m187902v(k5r0 k5r0Var, byte[] bArr, int i) throws IOException {
        int length = bArr.length;
        int i2 = length + i;
        int iM197269r = this.f169337k.m197269r();
        v6w0 v6w0Var = this.f169337k;
        if (iM197269r < i2) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i2 + i);
            v6w0Var.m197260i(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, v6w0Var.m197264m(), 0, length);
        }
        ((z4r0) k5r0Var).mo140050b(this.f169337k.m197264m(), length, i, false);
        this.f169337k.m197262k(0);
        this.f169337k.m197261j(i2);
    }

    public tbr0() {
        this(0);
    }
}
