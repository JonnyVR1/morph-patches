package p153l;

import android.net.Uri;
import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzad;
import com.google.android.gms.internal.ads.zzae;
import com.google.android.gms.internal.ads.zzcc;
import io.requery.android.database.sqlite.SQLiteDatabase;
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
public final class zkr0 implements per0 {

    /* JADX INFO: renamed from: c0 */
    public static final ifr0 f204795c0 = new ifr0() { // from class: l.vkr0
        @Override // p153l.ifr0
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ per0[] mo99028a(Uri uri, Map map) {
            int i = hfr0.f109341a;
            return new per0[]{new zkr0(0)};
        }
    };

    /* JADX INFO: renamed from: d0 */
    public static final byte[] f204796d0 = {49, 10, 48, 48, HttpTokens.COLON, 48, 48, HttpTokens.COLON, 48, 48, 44, 48, 48, 48, HttpTokens.SPACE, 45, 45, 62, HttpTokens.SPACE, 48, 48, HttpTokens.COLON, 48, 48, HttpTokens.COLON, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: e0 */
    public static final byte[] f204797e0;

    /* JADX INFO: renamed from: f0 */
    public static final byte[] f204798f0;

    /* JADX INFO: renamed from: g0 */
    public static final byte[] f204799g0;

    /* JADX INFO: renamed from: h0 */
    public static final UUID f204800h0;

    /* JADX INFO: renamed from: i0 */
    public static final Map f204801i0;

    /* JADX INFO: renamed from: A */
    public long f204802A;

    /* JADX INFO: renamed from: B */
    public long f204803B;

    /* JADX INFO: renamed from: C */
    @Nullable
    public z5w0 f204804C;

    /* JADX INFO: renamed from: D */
    @Nullable
    public z5w0 f204805D;

    /* JADX INFO: renamed from: E */
    public boolean f204806E;

    /* JADX INFO: renamed from: F */
    public boolean f204807F;

    /* JADX INFO: renamed from: G */
    public int f204808G;

    /* JADX INFO: renamed from: H */
    public long f204809H;

    /* JADX INFO: renamed from: I */
    public long f204810I;

    /* JADX INFO: renamed from: J */
    public int f204811J;

    /* JADX INFO: renamed from: K */
    public int f204812K;

    /* JADX INFO: renamed from: L */
    public int[] f204813L;

    /* JADX INFO: renamed from: M */
    public int f204814M;

    /* JADX INFO: renamed from: N */
    public int f204815N;

    /* JADX INFO: renamed from: O */
    public int f204816O;

    /* JADX INFO: renamed from: P */
    public int f204817P;

    /* JADX INFO: renamed from: Q */
    public boolean f204818Q;

    /* JADX INFO: renamed from: R */
    public long f204819R;

    /* JADX INFO: renamed from: S */
    public int f204820S;

    /* JADX INFO: renamed from: T */
    public int f204821T;

    /* JADX INFO: renamed from: U */
    public int f204822U;

    /* JADX INFO: renamed from: V */
    public boolean f204823V;

    /* JADX INFO: renamed from: W */
    public boolean f204824W;

    /* JADX INFO: renamed from: X */
    public boolean f204825X;

    /* JADX INFO: renamed from: Y */
    public int f204826Y;

    /* JADX INFO: renamed from: Z */
    public byte f204827Z;

    /* JADX INFO: renamed from: a */
    public final ukr0 f204828a;

    /* JADX INFO: renamed from: a0 */
    public boolean f204829a0;

    /* JADX INFO: renamed from: b */
    public final llr0 f204830b;

    /* JADX INFO: renamed from: b0 */
    public ser0 f204831b0;

    /* JADX INFO: renamed from: c */
    public final SparseArray f204832c;

    /* JADX INFO: renamed from: d */
    public final boolean f204833d;

    /* JADX INFO: renamed from: e */
    public final bgw0 f204834e;

    /* JADX INFO: renamed from: f */
    public final bgw0 f204835f;

    /* JADX INFO: renamed from: g */
    public final bgw0 f204836g;

    /* JADX INFO: renamed from: h */
    public final bgw0 f204837h;

    /* JADX INFO: renamed from: i */
    public final bgw0 f204838i;

    /* JADX INFO: renamed from: j */
    public final bgw0 f204839j;

    /* JADX INFO: renamed from: k */
    public final bgw0 f204840k;

    /* JADX INFO: renamed from: l */
    public final bgw0 f204841l;

    /* JADX INFO: renamed from: m */
    public final bgw0 f204842m;

    /* JADX INFO: renamed from: n */
    public final bgw0 f204843n;

    /* JADX INFO: renamed from: o */
    public ByteBuffer f204844o;

    /* JADX INFO: renamed from: p */
    public long f204845p;

    /* JADX INFO: renamed from: q */
    public long f204846q;

    /* JADX INFO: renamed from: r */
    public long f204847r;

    /* JADX INFO: renamed from: s */
    public long f204848s;

    /* JADX INFO: renamed from: t */
    public long f204849t;

    /* JADX INFO: renamed from: u */
    @Nullable
    public ykr0 f204850u;

    /* JADX INFO: renamed from: v */
    public boolean f204851v;

    /* JADX INFO: renamed from: w */
    public int f204852w;

    /* JADX INFO: renamed from: x */
    public long f204853x;

    /* JADX INFO: renamed from: y */
    public boolean f204854y;

    /* JADX INFO: renamed from: z */
    public long f204855z;

    static {
        int i = mpw0.f137957a;
        f204797e0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(cow0.f82931c);
        f204798f0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, HttpTokens.COLON, HttpTokens.SPACE, 48, HttpTokens.COLON, 48, 48, HttpTokens.COLON, 48, 48, HttpTokens.COLON, 48, 48, 44, 48, HttpTokens.COLON, 48, 48, HttpTokens.COLON, 48, 48, HttpTokens.COLON, 48, 48, 44};
        f204799g0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, HttpTokens.COLON, 48, 48, HttpTokens.COLON, 48, 48, 46, 48, 48, 48, HttpTokens.SPACE, 45, 45, 62, HttpTokens.SPACE, 48, 48, HttpTokens.COLON, 48, 48, HttpTokens.COLON, 48, 48, 46, 48, 48, 48, 10};
        f204800h0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        f204801i0 = Collections.unmodifiableMap(map);
    }

    public zkr0(int i) {
        skr0 skr0Var = new skr0();
        this.f204846q = -1L;
        this.f204847r = -9223372036854775807L;
        this.f204848s = -9223372036854775807L;
        this.f204849t = -9223372036854775807L;
        this.f204855z = -1L;
        this.f204802A = -1L;
        this.f204803B = -9223372036854775807L;
        this.f204828a = skr0Var;
        skr0Var.mo186539b(new xkr0(this, null));
        this.f204833d = true;
        this.f204830b = new llr0();
        this.f204832c = new SparseArray();
        this.f204836g = new bgw0(4);
        this.f204837h = new bgw0(ByteBuffer.allocate(4).putInt(-1).array());
        this.f204838i = new bgw0(4);
        this.f204834e = new bgw0(w3x0.f187180a);
        this.f204835f = new bgw0(4);
        this.f204839j = new bgw0();
        this.f204840k = new bgw0();
        this.f204841l = new bgw0(8);
        this.f204842m = new bgw0();
        this.f204843n = new bgw0();
        this.f204813L = new int[1];
    }

    /* JADX INFO: renamed from: w */
    public static byte[] m220144w(long j, String str, long j2) {
        lev0.m153956d(j != -9223372036854775807L);
        Locale locale = Locale.US;
        int i = (int) (j / 3600000000L);
        Integer numValueOf = Integer.valueOf(i);
        long j3 = j - (((long) i) * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        Integer numValueOf2 = Integer.valueOf(i2);
        long j4 = j3 - (((long) i2) * 60000000);
        int i3 = (int) (j4 / 1000000);
        String str2 = String.format(locale, str, numValueOf, numValueOf2, Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2)));
        int i4 = mpw0.f137957a;
        return str2.getBytes(cow0.f82931c);
    }

    /* JADX INFO: renamed from: x */
    public static int[] m220145x(@Nullable int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        int length = iArr.length;
        return length >= i ? iArr : new int[Math.max(length + length, i)];
    }

    @Override // p153l.per0
    @CallSuper
    /* JADX INFO: renamed from: c */
    public final void mo97906c(long j, long j2) {
        this.f204803B = -9223372036854775807L;
        this.f204808G = 0;
        this.f204828a.zzb();
        this.f204830b.m154789e();
        m220159u();
        for (int i = 0; i < this.f204832c.size(); i++) {
            tgr0 tgr0Var = ((ykr0) this.f204832c.valueAt(i)).f200459U;
            if (tgr0Var != null) {
                tgr0Var.m191068b();
            }
        }
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: d */
    public final boolean mo97907d(qer0 qer0Var) throws IOException {
        return new alr0().m98720a(qer0Var);
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: e */
    public final void mo97908e(ser0 ser0Var) {
        this.f204831b0 = ser0Var;
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: f */
    public final int mo97909f(qer0 qer0Var, yfr0 yfr0Var) throws IOException {
        this.f204807F = false;
        while (!this.f204807F) {
            if (!this.f204828a.mo186538a(qer0Var)) {
                for (int i = 0; i < this.f204832c.size(); i++) {
                    ykr0 ykr0Var = (ykr0) this.f204832c.valueAt(i);
                    ykr0Var.f200463Y.getClass();
                    tgr0 tgr0Var = ykr0Var.f200459U;
                    if (tgr0Var != null) {
                        tgr0Var.m191067a(ykr0Var.f200463Y, ykr0Var.f200474j);
                    }
                }
                return -1;
            }
            long jZzf = qer0Var.zzf();
            if (this.f204854y) {
                this.f204802A = jZzf;
                yfr0Var.f199649a = this.f204855z;
                this.f204854y = false;
                return 1;
            }
            if (this.f204851v) {
                long j = this.f204802A;
                if (j != -1) {
                    yfr0Var.f199649a = j;
                    this.f204802A = -1L;
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
    public final void m220146g(int i, int i2, qer0 qer0Var) throws IOException {
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
                if (this.f204808G != 2) {
                    return;
                }
                ykr0 ykr0Var = (ykr0) this.f204832c.get(this.f204814M);
                if (this.f204817P != 4 || !"V_VP9".equals(ykr0Var.f200466b)) {
                    ((fer0) qer0Var).m125319k(i2, false);
                    return;
                }
                this.f204843n.m104266h(i2);
                ((fer0) qer0Var).mo125312b(this.f204843n.m104271m(), 0, i2, false);
                return;
            }
            if (i12 == 16877) {
                m220156r(i);
                ykr0 ykr0Var2 = this.f204850u;
                if (ykr0Var2.f200471g != 1685485123 && ykr0Var2.f200471g != 1685480259) {
                    ((fer0) qer0Var).m125319k(i2, false);
                    return;
                }
                byte[] bArr = new byte[i2];
                ykr0Var2.f200453O = bArr;
                ((fer0) qer0Var).mo125312b(bArr, 0, i2, false);
                return;
            }
            if (i12 == 16981) {
                m220156r(i);
                byte[] bArr2 = new byte[i2];
                this.f204850u.f200473i = bArr2;
                ((fer0) qer0Var).mo125312b(bArr2, 0, i2, false);
                return;
            }
            if (i12 == 18402) {
                byte[] bArr3 = new byte[i2];
                ((fer0) qer0Var).mo125312b(bArr3, 0, i2, false);
                m220156r(i);
                this.f204850u.f200474j = new ggr0(1, bArr3, 0, 0);
                return;
            }
            if (i12 == 21419) {
                Arrays.fill(this.f204838i.m104271m(), (byte) 0);
                ((fer0) qer0Var).mo125312b(this.f204838i.m104271m(), 4 - i2, i2, false);
                this.f204838i.m104269k(0);
                this.f204852w = (int) this.f204838i.m104253J();
                return;
            }
            if (i12 == 25506) {
                m220156r(i);
                byte[] bArr4 = new byte[i2];
                this.f204850u.f200475k = bArr4;
                ((fer0) qer0Var).mo125312b(bArr4, 0, i2, false);
                return;
            }
            if (i12 != 30322) {
                throw zzcc.zza("Unexpected id: " + i12, null);
            }
            m220156r(i);
            byte[] bArr5 = new byte[i2];
            this.f204850u.f200487w = bArr5;
            ((fer0) qer0Var).mo125312b(bArr5, 0, i2, false);
            return;
        }
        int i15 = 8;
        if (this.f204808G == 0) {
            this.f204814M = (int) this.f204830b.m154788d(qer0Var, false, true, 8);
            this.f204815N = this.f204830b.m154787a();
            this.f204810I = -9223372036854775807L;
            this.f204808G = 1;
            this.f204836g.m104266h(0);
        }
        ykr0 ykr0Var3 = (ykr0) this.f204832c.get(this.f204814M);
        if (ykr0Var3 == null) {
            ((fer0) qer0Var).m125319k(i2 - this.f204815N, false);
            this.f204808G = 0;
            return;
        }
        ykr0Var3.f200463Y.getClass();
        if (this.f204808G == 1) {
            m220158t(qer0Var, 3);
            int i16 = (this.f204836g.m104271m()[2] & 6) >> 1;
            if (i16 == 0) {
                this.f204812K = 1;
                int[] iArrM220145x = m220145x(this.f204813L, 1);
                this.f204813L = iArrM220145x;
                iArrM220145x[0] = (i2 - this.f204815N) - 3;
            } else {
                m220158t(qer0Var, 4);
                int i17 = (this.f204836g.m104271m()[3] & 255) + 1;
                this.f204812K = i17;
                int[] iArrM220145x2 = m220145x(this.f204813L, i17);
                this.f204813L = iArrM220145x2;
                if (i16 == 2) {
                    int i18 = (i2 - this.f204815N) - 4;
                    int i19 = this.f204812K;
                    Arrays.fill(iArrM220145x2, 0, i19, i18 / i19);
                } else {
                    if (i16 == 1) {
                        int i20 = 0;
                        int i21 = 0;
                        int i22 = 4;
                        while (true) {
                            i8 = this.f204812K - 1;
                            iArr = this.f204813L;
                            if (i20 >= i8) {
                                break;
                            }
                            iArr[i20] = 0;
                            while (true) {
                                i9 = i22 + 1;
                                m220158t(qer0Var, i9);
                                int i23 = this.f204836g.m104271m()[i22] & 255;
                                int[] iArr2 = this.f204813L;
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
                        iArr[i8] = ((i2 - this.f204815N) - i22) - i21;
                    } else {
                        if (i16 != 3) {
                            throw zzcc.zza("Unexpected lacing value: 2", null);
                        }
                        int i24 = 0;
                        int i25 = 0;
                        int i26 = 4;
                        while (true) {
                            int i27 = this.f204812K - 1;
                            i3 = i13;
                            int[] iArr3 = this.f204813L;
                            if (i24 >= i27) {
                                i5 = i14;
                                iArr3[i27] = ((i2 - this.f204815N) - i26) - i25;
                                break;
                            }
                            iArr3[i24] = i14;
                            int i28 = i26 + 1;
                            m220158t(qer0Var, i28);
                            if (this.f204836g.m104271m()[i26] == 0) {
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
                                if ((this.f204836g.m104271m()[i26] & i30) != 0) {
                                    i28 += i29;
                                    m220158t(qer0Var, i28);
                                    j = this.f204836g.m104271m()[i26] & 255 & (~i30);
                                    for (int i31 = i26 + 1; i31 < i28; i31++) {
                                        j = (j << i7) | ((long) (this.f204836g.m104271m()[i31] & 255));
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
                            int[] iArr4 = this.f204813L;
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
                    this.f204809H = this.f204803B + m220154p((this.f204836g.m104271m()[i5] << 8) | (this.f204836g.m104271m()[i3] & 255));
                    if (ykr0Var3.f200468d != 2) {
                        i11 = i3;
                    } else if (i12 == 163) {
                        if ((this.f204836g.m104271m()[2] & 128) == 128) {
                            i11 = i3;
                        } else {
                            i11 = i5;
                        }
                        i12 = 163;
                    } else {
                        i11 = i5;
                    }
                    this.f204816O = i11;
                    this.f204808G = 2;
                    this.f204811J = i5;
                    i4 = 163;
                }
            }
            i3 = 1;
            i5 = 0;
            this.f204809H = this.f204803B + m220154p((this.f204836g.m104271m()[i5] << 8) | (this.f204836g.m104271m()[i3] & 255));
            if (ykr0Var3.f200468d != 2) {
                i11 = i3;
            } else if (i12 == 163) {
                if ((this.f204836g.m104271m()[2] & 128) == 128) {
                    i11 = i3;
                } else {
                    i11 = i5;
                }
                i12 = 163;
            } else {
                i11 = i5;
            }
            this.f204816O = i11;
            this.f204808G = 2;
            this.f204811J = i5;
            i4 = 163;
        } else {
            i3 = 1;
            i4 = 163;
        }
        if (i12 == i4) {
            while (true) {
                int i33 = this.f204811J;
                if (i33 >= this.f204812K) {
                    this.f204808G = 0;
                    return;
                }
                int iM220152n = m220152n(qer0Var, ykr0Var3, this.f204813L[i33], false);
                ykr0 ykr0Var4 = ykr0Var3;
                m220157s(ykr0Var4, this.f204809H + ((long) ((this.f204811J * ykr0Var3.f200469e) / 1000)), this.f204816O, iM220152n, 0);
                this.f204811J++;
                ykr0Var3 = ykr0Var4;
            }
        } else {
            while (true) {
                int i34 = this.f204811J;
                if (i34 >= this.f204812K) {
                    return;
                }
                int[] iArr5 = this.f204813L;
                boolean z = i3;
                iArr5[i34] = m220152n(qer0Var, ykr0Var3, iArr5[i34], z);
                this.f204811J += z ? 1 : 0;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:186:0x02d4  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @CallSuper
    /* JADX INFO: renamed from: h */
    public final void m220147h(int i) throws zzcc {
        int i2;
        bgr0 agr0Var;
        int i3;
        lev0.m153954b(this.f204831b0);
        if (i == 160) {
            if (this.f204808G == 2) {
                ykr0 ykr0Var = (ykr0) this.f204832c.get(this.f204814M);
                ykr0Var.f200463Y.getClass();
                if (this.f204819R > 0 && "A_OPUS".equals(ykr0Var.f200466b)) {
                    bgw0 bgw0Var = this.f204843n;
                    byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f204819R).array();
                    bgw0Var.m104267i(bArrArray, bArrArray.length);
                }
                int i4 = 0;
                for (int i5 = 0; i5 < this.f204812K; i5++) {
                    i4 += this.f204813L[i5];
                }
                int i6 = 0;
                while (i6 < this.f204812K) {
                    long j = this.f204809H + ((long) ((ykr0Var.f200469e * i6) / 1000));
                    int i7 = this.f204816O;
                    if (i6 == 0) {
                        if (!this.f204818Q) {
                            i7 |= 1;
                        }
                        i2 = 0;
                    } else {
                        i2 = i6;
                    }
                    int i8 = this.f204813L[i2];
                    int i9 = i4 - i8;
                    m220157s(ykr0Var, j, i7, i8, i9);
                    i6 = i2 + 1;
                    i4 = i9;
                }
                this.f204808G = 0;
                return;
            }
            return;
        }
        if (i != 174) {
            if (i == 19899) {
                int i10 = this.f204852w;
                if (i10 != -1) {
                    long j2 = this.f204853x;
                    if (j2 != -1) {
                        if (i10 == 475249515) {
                            this.f204855z = j2;
                            return;
                        }
                        return;
                    }
                }
                throw zzcc.zza("Mandatory element SeekID or SeekPosition not found", null);
            }
            if (i == 25152) {
                m220156r(i);
                ykr0 ykr0Var2 = this.f204850u;
                if (ykr0Var2.f200472h) {
                    if (ykr0Var2.f200474j == null) {
                        throw zzcc.zza("Encrypted Track found but ContentEncKeyID was not found", null);
                    }
                    ykr0Var2.f200476l = new zzae(null, new zzad(cly0.f82438a, null, "video/webm", this.f204850u.f200474j.f104043b));
                    return;
                }
                return;
            }
            if (i == 28032) {
                m220156r(i);
                ykr0 ykr0Var3 = this.f204850u;
                if (ykr0Var3.f200472h && ykr0Var3.f200473i != null) {
                    throw zzcc.zza("Combining encryption and compression is not supported", null);
                }
                return;
            }
            if (i == 357149030) {
                if (this.f204847r == -9223372036854775807L) {
                    this.f204847r = 1000000L;
                }
                long j3 = this.f204848s;
                if (j3 != -9223372036854775807L) {
                    this.f204849t = m220154p(j3);
                    return;
                }
                return;
            }
            if (i == 374648427) {
                if (this.f204832c.size() == 0) {
                    throw zzcc.zza("No valid tracks were found", null);
                }
                this.f204831b0.mo101544c();
                return;
            }
            if (i != 475249515) {
                return;
            }
            if (!this.f204851v) {
                ser0 ser0Var = this.f204831b0;
                z5w0 z5w0Var = this.f204804C;
                z5w0 z5w0Var2 = this.f204805D;
                if (this.f204846q == -1 || this.f204849t == -9223372036854775807L || z5w0Var == null || z5w0Var.m218743a() == 0 || z5w0Var2 == null || z5w0Var2.m218743a() != z5w0Var.m218743a()) {
                    agr0Var = new agr0(this.f204849t, 0L);
                } else {
                    int iM218743a = z5w0Var.m218743a();
                    int[] iArrCopyOf = new int[iM218743a];
                    long[] jArrCopyOf = new long[iM218743a];
                    long[] jArrCopyOf2 = new long[iM218743a];
                    long[] jArrCopyOf3 = new long[iM218743a];
                    int i11 = 0;
                    while (i11 < iM218743a) {
                        jArrCopyOf3[i11] = z5w0Var.m218744b(i11);
                        jArrCopyOf[i11] = this.f204846q + z5w0Var2.m218744b(i11);
                        i11++;
                        iM218743a = iM218743a;
                    }
                    int i12 = iM218743a;
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
                    iArrCopyOf[i3] = (int) ((this.f204846q + this.f204845p) - jArrCopyOf[i3]);
                    long j4 = this.f204849t - jArrCopyOf3[i3];
                    jArrCopyOf2[i3] = j4;
                    if (j4 <= 0) {
                        y4w0.m214278f("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j4);
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i3);
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i3);
                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i3);
                        jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i3);
                    }
                    agr0Var = new der0(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
                }
                ser0Var.mo101551j(agr0Var);
                this.f204851v = true;
            }
            this.f204804C = null;
            this.f204805D = null;
            return;
        }
        ykr0 ykr0Var4 = this.f204850u;
        lev0.m153954b(ykr0Var4);
        String str = ykr0Var4.f200466b;
        if (str == null) {
            throw zzcc.zza("CodecId is missing in TrackEntry element", null);
        }
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    ykr0Var4.m216536e(this.f204831b0, ykr0Var4.f200467c);
                    this.f204832c.put(ykr0Var4.f200467c, ykr0Var4);
                }
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    ykr0Var4.m216536e(this.f204831b0, ykr0Var4.f200467c);
                    this.f204832c.put(ykr0Var4.f200467c, ykr0Var4);
                }
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    ykr0Var4.m216536e(this.f204831b0, ykr0Var4.f200467c);
                    this.f204832c.put(ykr0Var4.f200467c, ykr0Var4);
                }
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    ykr0Var4.m216536e(this.f204831b0, ykr0Var4.f200467c);
                    this.f204832c.put(ykr0Var4.f200467c, ykr0Var4);
                }
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    ykr0Var4.m216536e(this.f204831b0, ykr0Var4.f200467c);
                    this.f204832c.put(ykr0Var4.f200467c, ykr0Var4);
                }
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    ykr0Var4.m216536e(this.f204831b0, ykr0Var4.f200467c);
                    this.f204832c.put(ykr0Var4.f200467c, ykr0Var4);
                }
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    ykr0Var4.m216536e(this.f204831b0, ykr0Var4.f200467c);
                    this.f204832c.put(ykr0Var4.f200467c, ykr0Var4);
                }
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    ykr0Var4.m216536e(this.f204831b0, ykr0Var4.f200467c);
                    this.f204832c.put(ykr0Var4.f200467c, ykr0Var4);
                }
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    ykr0Var4.m216536e(this.f204831b0, ykr0Var4.f200467c);
                    this.f204832c.put(ykr0Var4.f200467c, ykr0Var4);
                }
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    ykr0Var4.m216536e(this.f204831b0, ykr0Var4.f200467c);
                    this.f204832c.put(ykr0Var4.f200467c, ykr0Var4);
                }
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    ykr0Var4.m216536e(this.f204831b0, ykr0Var4.f200467c);
                    this.f204832c.put(ykr0Var4.f200467c, ykr0Var4);
                }
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    ykr0Var4.m216536e(this.f204831b0, ykr0Var4.f200467c);
                    this.f204832c.put(ykr0Var4.f200467c, ykr0Var4);
                }
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    ykr0Var4.m216536e(this.f204831b0, ykr0Var4.f200467c);
                    this.f204832c.put(ykr0Var4.f200467c, ykr0Var4);
                }
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    ykr0Var4.m216536e(this.f204831b0, ykr0Var4.f200467c);
                    this.f204832c.put(ykr0Var4.f200467c, ykr0Var4);
                }
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    ykr0Var4.m216536e(this.f204831b0, ykr0Var4.f200467c);
                    this.f204832c.put(ykr0Var4.f200467c, ykr0Var4);
                }
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    ykr0Var4.m216536e(this.f204831b0, ykr0Var4.f200467c);
                    this.f204832c.put(ykr0Var4.f200467c, ykr0Var4);
                }
                break;
            case 82318131:
                if (str.equals("V_AV1")) {
                    ykr0Var4.m216536e(this.f204831b0, ykr0Var4.f200467c);
                    this.f204832c.put(ykr0Var4.f200467c, ykr0Var4);
                }
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    ykr0Var4.m216536e(this.f204831b0, ykr0Var4.f200467c);
                    this.f204832c.put(ykr0Var4.f200467c, ykr0Var4);
                }
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    ykr0Var4.m216536e(this.f204831b0, ykr0Var4.f200467c);
                    this.f204832c.put(ykr0Var4.f200467c, ykr0Var4);
                }
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    ykr0Var4.m216536e(this.f204831b0, ykr0Var4.f200467c);
                    this.f204832c.put(ykr0Var4.f200467c, ykr0Var4);
                }
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    ykr0Var4.m216536e(this.f204831b0, ykr0Var4.f200467c);
                    this.f204832c.put(ykr0Var4.f200467c, ykr0Var4);
                }
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    ykr0Var4.m216536e(this.f204831b0, ykr0Var4.f200467c);
                    this.f204832c.put(ykr0Var4.f200467c, ykr0Var4);
                }
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    ykr0Var4.m216536e(this.f204831b0, ykr0Var4.f200467c);
                    this.f204832c.put(ykr0Var4.f200467c, ykr0Var4);
                }
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    ykr0Var4.m216536e(this.f204831b0, ykr0Var4.f200467c);
                    this.f204832c.put(ykr0Var4.f200467c, ykr0Var4);
                }
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    ykr0Var4.m216536e(this.f204831b0, ykr0Var4.f200467c);
                    this.f204832c.put(ykr0Var4.f200467c, ykr0Var4);
                }
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    ykr0Var4.m216536e(this.f204831b0, ykr0Var4.f200467c);
                    this.f204832c.put(ykr0Var4.f200467c, ykr0Var4);
                }
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    ykr0Var4.m216536e(this.f204831b0, ykr0Var4.f200467c);
                    this.f204832c.put(ykr0Var4.f200467c, ykr0Var4);
                }
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    ykr0Var4.m216536e(this.f204831b0, ykr0Var4.f200467c);
                    this.f204832c.put(ykr0Var4.f200467c, ykr0Var4);
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    ykr0Var4.m216536e(this.f204831b0, ykr0Var4.f200467c);
                    this.f204832c.put(ykr0Var4.f200467c, ykr0Var4);
                }
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    ykr0Var4.m216536e(this.f204831b0, ykr0Var4.f200467c);
                    this.f204832c.put(ykr0Var4.f200467c, ykr0Var4);
                }
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    ykr0Var4.m216536e(this.f204831b0, ykr0Var4.f200467c);
                    this.f204832c.put(ykr0Var4.f200467c, ykr0Var4);
                }
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    ykr0Var4.m216536e(this.f204831b0, ykr0Var4.f200467c);
                    this.f204832c.put(ykr0Var4.f200467c, ykr0Var4);
                }
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    ykr0Var4.m216536e(this.f204831b0, ykr0Var4.f200467c);
                    this.f204832c.put(ykr0Var4.f200467c, ykr0Var4);
                }
                break;
        }
        this.f204850u = null;
    }

    @CallSuper
    /* JADX INFO: renamed from: i */
    public final void m220148i(int i, double d) throws zzcc {
        if (i == 181) {
            m220156r(i);
            this.f204850u.f200456R = (int) d;
            return;
        }
        if (i == 17545) {
            this.f204848s = (long) d;
            return;
        }
        switch (i) {
            case 21969:
                m220156r(i);
                this.f204850u.f200443E = (float) d;
                break;
            case 21970:
                m220156r(i);
                this.f204850u.f200444F = (float) d;
                break;
            case 21971:
                m220156r(i);
                this.f204850u.f200445G = (float) d;
                break;
            case 21972:
                m220156r(i);
                this.f204850u.f200446H = (float) d;
                break;
            case 21973:
                m220156r(i);
                this.f204850u.f200447I = (float) d;
                break;
            case 21974:
                m220156r(i);
                this.f204850u.f200448J = (float) d;
                break;
            case 21975:
                m220156r(i);
                this.f204850u.f200449K = (float) d;
                break;
            case 21976:
                m220156r(i);
                this.f204850u.f200450L = (float) d;
                break;
            case 21977:
                m220156r(i);
                this.f204850u.f200451M = (float) d;
                break;
            case 21978:
                m220156r(i);
                this.f204850u.f200452N = (float) d;
                break;
            default:
                switch (i) {
                    case 30323:
                        m220156r(i);
                        this.f204850u.f200484t = (float) d;
                        break;
                    case 30324:
                        m220156r(i);
                        this.f204850u.f200485u = (float) d;
                        break;
                    case 30325:
                        m220156r(i);
                        this.f204850u.f200486v = (float) d;
                        break;
                }
                break;
        }
    }

    @CallSuper
    /* JADX INFO: renamed from: j */
    public final void m220149j(int i, long j) throws zzcc {
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
                m220156r(i);
                this.f204850u.f200468d = (int) j;
                return;
            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA /* 136 */:
                z = j == 1;
                m220156r(i);
                this.f204850u.f200461W = z;
                return;
            case CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA /* 155 */:
                this.f204810I = m220154p(j);
                return;
            case 159:
                m220156r(i);
                this.f204850u.f200454P = (int) j;
                return;
            case 176:
                m220156r(i);
                this.f204850u.f200477m = (int) j;
                return;
            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384 /* 179 */:
                m220155q(i);
                this.f204804C.m218745c(m220154p(j));
                return;
            case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 186 */:
                m220156r(i);
                this.f204850u.f200478n = (int) j;
                return;
            case 215:
                m220156r(i);
                this.f204850u.f200467c = (int) j;
                return;
            case 231:
                this.f204803B = m220154p(j);
                return;
            case 238:
                this.f204817P = (int) j;
                return;
            case 241:
                if (this.f204806E) {
                    return;
                }
                m220155q(i);
                this.f204805D.m218745c(j);
                this.f204806E = true;
                return;
            case 251:
                this.f204818Q = true;
                return;
            case 16871:
                m220156r(i);
                this.f204850u.f200471g = (int) j;
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
                this.f204853x = j + this.f204846q;
                return;
            case 21432:
                int i2 = (int) j;
                m220156r(i);
                if (i2 == 0) {
                    this.f204850u.f200488x = 0;
                    return;
                }
                if (i2 == 1) {
                    this.f204850u.f200488x = 2;
                    return;
                } else if (i2 == 3) {
                    this.f204850u.f200488x = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    this.f204850u.f200488x = 3;
                    return;
                }
            case 21680:
                m220156r(i);
                this.f204850u.f200480p = (int) j;
                return;
            case 21682:
                m220156r(i);
                this.f204850u.f200482r = (int) j;
                return;
            case 21690:
                m220156r(i);
                this.f204850u.f200481q = (int) j;
                return;
            case 21930:
                z = j == 1;
                m220156r(i);
                this.f204850u.f200460V = z;
                return;
            case 21938:
                m220156r(i);
                ykr0 ykr0Var = this.f204850u;
                ykr0Var.f200489y = true;
                ykr0Var.f200479o = (int) j;
                return;
            case 21998:
                m220156r(i);
                this.f204850u.f200470f = (int) j;
                return;
            case 22186:
                m220156r(i);
                this.f204850u.f200457S = j;
                return;
            case 22203:
                m220156r(i);
                this.f204850u.f200458T = j;
                return;
            case 25188:
                m220156r(i);
                this.f204850u.f200455Q = (int) j;
                return;
            case 30114:
                this.f204819R = j;
                return;
            case 30321:
                int i3 = (int) j;
                m220156r(i);
                if (i3 == 0) {
                    this.f204850u.f200483s = 0;
                    return;
                }
                if (i3 == 1) {
                    this.f204850u.f200483s = 1;
                    return;
                } else if (i3 == 2) {
                    this.f204850u.f200483s = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.f204850u.f200483s = 3;
                    return;
                }
            case 2352003:
                m220156r(i);
                this.f204850u.f200469e = (int) j;
                return;
            case 2807729:
                this.f204847r = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        int i4 = (int) j;
                        m220156r(i);
                        if (i4 == 1) {
                            this.f204850u.f200440B = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            this.f204850u.f200440B = 1;
                            return;
                        }
                    case 21946:
                        m220156r(i);
                        int iM208353b = wwy0.m208353b((int) j);
                        if (iM208353b != -1) {
                            this.f204850u.f200439A = iM208353b;
                            return;
                        }
                        return;
                    case 21947:
                        m220156r(i);
                        this.f204850u.f200489y = true;
                        int iM208352a = wwy0.m208352a((int) j);
                        if (iM208352a != -1) {
                            this.f204850u.f200490z = iM208352a;
                            return;
                        }
                        return;
                    case 21948:
                        m220156r(i);
                        this.f204850u.f200441C = (int) j;
                        return;
                    case 21949:
                        m220156r(i);
                        this.f204850u.f200442D = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    @CallSuper
    /* JADX INFO: renamed from: k */
    public final void m220150k(int i, long j, long j2) throws zzcc {
        lev0.m153954b(this.f204831b0);
        if (i == 160) {
            this.f204818Q = false;
            this.f204819R = 0L;
            return;
        }
        if (i == 174) {
            this.f204850u = new ykr0();
            return;
        }
        if (i == 187) {
            this.f204806E = false;
            return;
        }
        if (i == 19899) {
            this.f204852w = -1;
            this.f204853x = -1L;
            return;
        }
        if (i == 20533) {
            m220156r(i);
            this.f204850u.f200472h = true;
            return;
        }
        if (i == 21968) {
            m220156r(i);
            this.f204850u.f200489y = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.f204846q;
            if (j3 != -1 && j3 != j) {
                throw zzcc.zza("Multiple Segment elements not supported", null);
            }
            this.f204846q = j;
            this.f204845p = j2;
            return;
        }
        if (i == 475249515) {
            this.f204804C = new z5w0(32);
            this.f204805D = new z5w0(32);
        } else if (i == 524531317 && !this.f204851v) {
            if (this.f204833d && this.f204855z != -1) {
                this.f204854y = true;
            } else {
                this.f204831b0.mo101551j(new agr0(this.f204849t, 0L));
                this.f204851v = true;
            }
        }
    }

    @CallSuper
    /* JADX INFO: renamed from: l */
    public final void m220151l(int i, String str) throws zzcc {
        if (i == 134) {
            m220156r(i);
            this.f204850u.f200466b = str;
            return;
        }
        if (i == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                return;
            }
            throw zzcc.zza("DocType " + str + " not supported", null);
        }
        if (i == 21358) {
            m220156r(i);
            this.f204850u.f200465a = str;
        } else {
            if (i != 2274716) {
                return;
            }
            m220156r(i);
            this.f204850u.f200462X = str;
        }
    }

    @RequiresNonNull({"#2.output"})
    /* JADX INFO: renamed from: n */
    public final int m220152n(qer0 qer0Var, ykr0 ykr0Var, int i, boolean z) throws IOException {
        int i2;
        if ("S_TEXT/UTF8".equals(ykr0Var.f200466b)) {
            m220160v(qer0Var, f204796d0, i);
            int i3 = this.f204821T;
            m220159u();
            return i3;
        }
        if ("S_TEXT/ASS".equals(ykr0Var.f200466b)) {
            m220160v(qer0Var, f204798f0, i);
            int i4 = this.f204821T;
            m220159u();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(ykr0Var.f200466b)) {
            m220160v(qer0Var, f204799g0, i);
            int i5 = this.f204821T;
            m220159u();
            return i5;
        }
        sgr0 sgr0Var = ykr0Var.f200463Y;
        if (!this.f204823V) {
            if (ykr0Var.f200472h) {
                this.f204816O &= -1073741825;
                if (!this.f204824W) {
                    ((fer0) qer0Var).mo125312b(this.f204836g.m104271m(), 0, 1, false);
                    this.f204820S++;
                    if ((this.f204836g.m104271m()[0] & 128) == 128) {
                        throw zzcc.zza("Extension bit is set in signal byte", null);
                    }
                    this.f204827Z = this.f204836g.m104271m()[0];
                    this.f204824W = true;
                }
                byte b = this.f204827Z;
                if ((b & 1) == 1) {
                    int i6 = b & 2;
                    this.f204816O |= 1073741824;
                    if (!this.f204829a0) {
                        ((fer0) qer0Var).mo125312b(this.f204841l.m104271m(), 0, 8, false);
                        this.f204820S += 8;
                        this.f204829a0 = true;
                        this.f204836g.m104271m()[0] = (byte) ((i6 != 2 ? 0 : 128) | 8);
                        this.f204836g.m104269k(0);
                        sgr0Var.mo99370a(this.f204836g, 1, 1);
                        this.f204821T++;
                        this.f204841l.m104269k(0);
                        sgr0Var.mo99370a(this.f204841l, 8, 1);
                        this.f204821T += 8;
                    }
                    if (i6 == 2) {
                        if (!this.f204825X) {
                            ((fer0) qer0Var).mo125312b(this.f204836g.m104271m(), 0, 1, false);
                            this.f204820S++;
                            this.f204836g.m104269k(0);
                            this.f204826Y = this.f204836g.m104245B();
                            this.f204825X = true;
                        }
                        int i7 = this.f204826Y * 4;
                        this.f204836g.m104266h(i7);
                        ((fer0) qer0Var).mo125312b(this.f204836g.m104271m(), 0, i7, false);
                        this.f204820S += i7;
                        int i8 = (this.f204826Y >> 1) + 1;
                        int i9 = (i8 * 6) + 2;
                        ByteBuffer byteBuffer = this.f204844o;
                        if (byteBuffer == null || byteBuffer.capacity() < i9) {
                            this.f204844o = ByteBuffer.allocate(i9);
                        }
                        this.f204844o.position(0);
                        this.f204844o.putShort((short) i8);
                        int i10 = 0;
                        int i11 = 0;
                        while (true) {
                            i2 = this.f204826Y;
                            if (i10 >= i2) {
                                break;
                            }
                            int iM104248E = this.f204836g.m104248E();
                            int i12 = iM104248E - i11;
                            int i13 = i10 % 2;
                            ByteBuffer byteBuffer2 = this.f204844o;
                            if (i13 == 0) {
                                byteBuffer2.putShort((short) i12);
                            } else {
                                byteBuffer2.putInt(i12);
                            }
                            i10++;
                            i11 = iM104248E;
                        }
                        int i14 = (i - this.f204820S) - i11;
                        int i15 = i2 & 1;
                        ByteBuffer byteBuffer3 = this.f204844o;
                        if (i15 == 1) {
                            byteBuffer3.putInt(i14);
                        } else {
                            byteBuffer3.putShort((short) i14);
                            this.f204844o.putInt(0);
                        }
                        this.f204842m.m104267i(this.f204844o.array(), i9);
                        sgr0Var.mo99370a(this.f204842m, i9, 1);
                        this.f204821T += i9;
                    }
                }
            } else {
                byte[] bArr = ykr0Var.f200473i;
                if (bArr != null) {
                    this.f204839j.m104267i(bArr, bArr.length);
                }
            }
            if (!"A_OPUS".equals(ykr0Var.f200466b) ? ykr0Var.f200470f > 0 : z) {
                this.f204816O |= SQLiteDatabase.CREATE_IF_NECESSARY;
                this.f204843n.m104266h(0);
                int iM104278t = (this.f204839j.m104278t() + i) - this.f204820S;
                this.f204836g.m104266h(4);
                this.f204836g.m104271m()[0] = (byte) ((iM104278t >> 24) & 255);
                this.f204836g.m104271m()[1] = (byte) ((iM104278t >> 16) & 255);
                this.f204836g.m104271m()[2] = (byte) ((iM104278t >> 8) & 255);
                this.f204836g.m104271m()[3] = (byte) (iM104278t & 255);
                sgr0Var.mo99370a(this.f204836g, 4, 2);
                this.f204821T += 4;
            }
            this.f204823V = true;
        }
        int iM104278t2 = i + this.f204839j.m104278t();
        if (!"V_MPEG4/ISO/AVC".equals(ykr0Var.f200466b) && !"V_MPEGH/ISO/HEVC".equals(ykr0Var.f200466b)) {
            if (ykr0Var.f200459U != null) {
                lev0.m153958f(this.f204839j.m104278t() == 0);
                ykr0Var.f200459U.m191070d(qer0Var);
            }
            while (true) {
                int i16 = this.f204820S;
                if (i16 >= iM104278t2) {
                    break;
                }
                int iM220153o = m220153o(qer0Var, sgr0Var, iM104278t2 - i16);
                this.f204820S += iM220153o;
                this.f204821T += iM220153o;
            }
        } else {
            byte[] bArrM104271m = this.f204835f.m104271m();
            bArrM104271m[0] = 0;
            bArrM104271m[1] = 0;
            bArrM104271m[2] = 0;
            int i17 = ykr0Var.f200464Z;
            int i18 = 4 - i17;
            while (this.f204820S < iM104278t2) {
                int i19 = this.f204822U;
                if (i19 == 0) {
                    int iMin = Math.min(i17, this.f204839j.m104275q());
                    ((fer0) qer0Var).mo125312b(bArrM104271m, i18 + iMin, i17 - iMin, false);
                    if (iMin > 0) {
                        this.f204839j.m104265g(bArrM104271m, i18, iMin);
                    }
                    this.f204820S += i17;
                    this.f204835f.m104269k(0);
                    this.f204822U = this.f204835f.m104248E();
                    this.f204834e.m104269k(0);
                    fgr0.m125515b(sgr0Var, this.f204834e, 4);
                    this.f204821T += 4;
                } else {
                    int iM220153o2 = m220153o(qer0Var, sgr0Var, i19);
                    this.f204820S += iM220153o2;
                    this.f204821T += iM220153o2;
                    this.f204822U -= iM220153o2;
                }
            }
        }
        if ("A_VORBIS".equals(ykr0Var.f200466b)) {
            this.f204837h.m104269k(0);
            fgr0.m125515b(sgr0Var, this.f204837h, 4);
            this.f204821T += 4;
        }
        int i20 = this.f204821T;
        m220159u();
        return i20;
    }

    /* JADX INFO: renamed from: o */
    public final int m220153o(qer0 qer0Var, sgr0 sgr0Var, int i) throws IOException {
        int iM104275q = this.f204839j.m104275q();
        if (iM104275q <= 0) {
            return fgr0.m125514a(sgr0Var, qer0Var, i, false);
        }
        int iMin = Math.min(i, iM104275q);
        fgr0.m125515b(sgr0Var, this.f204839j, iMin);
        return iMin;
    }

    /* JADX INFO: renamed from: p */
    public final long m220154p(long j) throws zzcc {
        long j2 = this.f204847r;
        if (j2 != -9223372036854775807L) {
            return mpw0.m159395H(j, j2, 1000L, RoundingMode.FLOOR);
        }
        throw zzcc.zza("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    /* JADX INFO: renamed from: q */
    public final void m220155q(int i) throws zzcc {
        if (this.f204804C == null || this.f204805D == null) {
            throw zzcc.zza("Element " + i + " must be in a Cues", null);
        }
    }

    @EnsuresNonNull({"currentTrack"})
    /* JADX INFO: renamed from: r */
    public final void m220156r(int i) throws zzcc {
        if (this.f204850u != null) {
            return;
        }
        throw zzcc.zza("Element " + i + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c8 A[LOOP:0: B:34:0x00b0->B:39:0x00c8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x00c2 A[SYNTHETIC] */
    @RequiresNonNull({"#1.output"})
    /* JADX INFO: renamed from: s */
    public final void m220157s(ykr0 ykr0Var, long j, int i, int i2, int i3) {
        byte[] bArrM220144w;
        int i4;
        int iM104277s;
        int iM104278t;
        tgr0 tgr0Var = ykr0Var.f200459U;
        if (tgr0Var != null) {
            tgr0Var.m191069c(ykr0Var.f200463Y, j, i, i2, i3, ykr0Var.f200474j);
        } else {
            if ("S_TEXT/UTF8".equals(ykr0Var.f200466b) || "S_TEXT/ASS".equals(ykr0Var.f200466b) || "S_TEXT/WEBVTT".equals(ykr0Var.f200466b)) {
                if (this.f204812K > 1) {
                    y4w0.m214278f("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.f204810I;
                    if (j2 != -9223372036854775807L) {
                        String str = ykr0Var.f200466b;
                        byte[] bArrM104271m = this.f204840k.m104271m();
                        int iHashCode = str.hashCode();
                        if (iHashCode == 738597099) {
                            if (str.equals("S_TEXT/ASS")) {
                                bArrM220144w = m220144w(j2, "%01d:%02d:%02d:%02d", 10000L);
                                i4 = 21;
                                System.arraycopy(bArrM220144w, 0, bArrM104271m, i4, bArrM220144w.length);
                                for (iM104277s = this.f204840k.m104277s(); iM104277s < this.f204840k.m104278t(); iM104277s++) {
                                    if (this.f204840k.m104271m()[iM104277s] == 0) {
                                        this.f204840k.m104268j(iM104277s);
                                        break;
                                    }
                                }
                                sgr0 sgr0Var = ykr0Var.f200463Y;
                                bgw0 bgw0Var = this.f204840k;
                                fgr0.m125515b(sgr0Var, bgw0Var, bgw0Var.m104278t());
                                iM104278t = i2 + this.f204840k.m104278t();
                            }
                            fig0.m125680a();
                            return;
                        }
                        if (iHashCode == 1045209816) {
                            if (str.equals("S_TEXT/WEBVTT")) {
                                bArrM220144w = m220144w(j2, "%02d:%02d:%02d.%03d", 1000L);
                                i4 = 25;
                                System.arraycopy(bArrM220144w, 0, bArrM104271m, i4, bArrM220144w.length);
                                while (iM104277s < this.f204840k.m104278t()) {
                                    if (this.f204840k.m104271m()[iM104277s] == 0) {
                                        this.f204840k.m104268j(iM104277s);
                                        break;
                                    }
                                }
                                sgr0 sgr0Var2 = ykr0Var.f200463Y;
                                bgw0 bgw0Var2 = this.f204840k;
                                fgr0.m125515b(sgr0Var2, bgw0Var2, bgw0Var2.m104278t());
                                iM104278t = i2 + this.f204840k.m104278t();
                            }
                            fig0.m125680a();
                            return;
                        }
                        if (iHashCode == 1422270023 && str.equals("S_TEXT/UTF8")) {
                            bArrM220144w = m220144w(j2, "%02d:%02d:%02d,%03d", 1000L);
                            i4 = 19;
                            System.arraycopy(bArrM220144w, 0, bArrM104271m, i4, bArrM220144w.length);
                            while (iM104277s < this.f204840k.m104278t()) {
                                if (this.f204840k.m104271m()[iM104277s] == 0) {
                                    this.f204840k.m104268j(iM104277s);
                                    break;
                                }
                            }
                            sgr0 sgr0Var3 = ykr0Var.f200463Y;
                            bgw0 bgw0Var3 = this.f204840k;
                            fgr0.m125515b(sgr0Var3, bgw0Var3, bgw0Var3.m104278t());
                            iM104278t = i2 + this.f204840k.m104278t();
                        }
                        fig0.m125680a();
                        return;
                    }
                    y4w0.m214278f("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                }
                iM104278t = i2;
            } else {
                iM104278t = i2;
            }
            if ((i & SQLiteDatabase.CREATE_IF_NECESSARY) != 0) {
                int i5 = this.f204812K;
                bgw0 bgw0Var4 = this.f204843n;
                if (i5 > 1) {
                    bgw0Var4.m104266h(0);
                } else {
                    int iM104278t2 = bgw0Var4.m104278t();
                    ykr0Var.f200463Y.mo99370a(this.f204843n, iM104278t2, 2);
                    iM104278t += iM104278t2;
                }
            }
            ykr0Var.f200463Y.mo99372c(j, i, iM104278t, i3, ykr0Var.f200474j);
        }
        this.f204807F = true;
    }

    /* JADX INFO: renamed from: t */
    public final void m220158t(qer0 qer0Var, int i) throws IOException {
        if (this.f204836g.m104278t() >= i) {
            return;
        }
        if (this.f204836g.m104276r() < i) {
            bgw0 bgw0Var = this.f204836g;
            int iM104276r = bgw0Var.m104276r();
            bgw0Var.m104263e(Math.max(iM104276r + iM104276r, i));
        }
        bgw0 bgw0Var2 = this.f204836g;
        ((fer0) qer0Var).mo125312b(bgw0Var2.m104271m(), bgw0Var2.m104278t(), i - bgw0Var2.m104278t(), false);
        this.f204836g.m104268j(i);
    }

    /* JADX INFO: renamed from: u */
    public final void m220159u() {
        this.f204820S = 0;
        this.f204821T = 0;
        this.f204822U = 0;
        this.f204823V = false;
        this.f204824W = false;
        this.f204825X = false;
        this.f204826Y = 0;
        this.f204827Z = (byte) 0;
        this.f204829a0 = false;
        this.f204839j.m104266h(0);
    }

    /* JADX INFO: renamed from: v */
    public final void m220160v(qer0 qer0Var, byte[] bArr, int i) throws IOException {
        int length = bArr.length;
        int i2 = length + i;
        int iM104276r = this.f204840k.m104276r();
        bgw0 bgw0Var = this.f204840k;
        if (iM104276r < i2) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i2 + i);
            bgw0Var.m104267i(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, bgw0Var.m104271m(), 0, length);
        }
        ((fer0) qer0Var).mo125312b(this.f204840k.m104271m(), length, i, false);
        this.f204840k.m104269k(0);
        this.f204840k.m104268j(i2);
    }

    public zkr0() {
        this(0);
    }
}
