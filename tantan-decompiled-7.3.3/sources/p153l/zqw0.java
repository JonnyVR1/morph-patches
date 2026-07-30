package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class zqw0 {

    /* JADX INFO: renamed from: A */
    @Nullable
    public Long f205671A;

    /* JADX INFO: renamed from: B */
    @Nullable
    public Long f205672B;

    /* JADX INFO: renamed from: C */
    public long f205673C;

    /* JADX INFO: renamed from: D */
    @Nullable
    public String f205674D;

    /* JADX INFO: renamed from: E */
    public int f205675E;

    /* JADX INFO: renamed from: F */
    public int f205676F;

    /* JADX INFO: renamed from: G */
    public long f205677G;

    /* JADX INFO: renamed from: H */
    public String f205678H;

    /* JADX INFO: renamed from: I */
    @Nullable
    public byte[] f205679I;

    /* JADX INFO: renamed from: J */
    public long f205680J;

    /* JADX INFO: renamed from: K */
    public long f205681K;

    /* JADX INFO: renamed from: L */
    public long f205682L;

    /* JADX INFO: renamed from: M */
    public long f205683M;

    /* JADX INFO: renamed from: N */
    public long f205684N;

    /* JADX INFO: renamed from: O */
    public long f205685O;

    /* JADX INFO: renamed from: P */
    @Nullable
    public String f205686P;

    /* JADX INFO: renamed from: Q */
    public boolean f205687Q;

    /* JADX INFO: renamed from: R */
    public long f205688R;

    /* JADX INFO: renamed from: S */
    public long f205689S;

    /* JADX INFO: renamed from: a */
    public final atx0 f205690a;

    /* JADX INFO: renamed from: b */
    public final String f205691b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public String f205692c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public String f205693d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public String f205694e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public String f205695f;

    /* JADX INFO: renamed from: g */
    public long f205696g;

    /* JADX INFO: renamed from: h */
    public long f205697h;

    /* JADX INFO: renamed from: i */
    public long f205698i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public String f205699j;

    /* JADX INFO: renamed from: k */
    public long f205700k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public String f205701l;

    /* JADX INFO: renamed from: m */
    public long f205702m;

    /* JADX INFO: renamed from: n */
    public long f205703n;

    /* JADX INFO: renamed from: o */
    public boolean f205704o;

    /* JADX INFO: renamed from: p */
    public boolean f205705p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public String f205706q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public Boolean f205707r;

    /* JADX INFO: renamed from: s */
    public long f205708s;

    /* JADX INFO: renamed from: t */
    @Nullable
    public List<String> f205709t;

    /* JADX INFO: renamed from: u */
    @Nullable
    public String f205710u;

    /* JADX INFO: renamed from: v */
    public boolean f205711v;

    /* JADX INFO: renamed from: w */
    public long f205712w;

    /* JADX INFO: renamed from: x */
    public long f205713x;

    /* JADX INFO: renamed from: y */
    public int f205714y;

    /* JADX INFO: renamed from: z */
    public boolean f205715z;

    @WorkerThread
    public zqw0(atx0 atx0Var, String str) {
        Preconditions.checkNotNull(atx0Var);
        Preconditions.checkNotEmpty(str);
        this.f205690a = atx0Var;
        this.f205691b = str;
        atx0Var.zzl().mo15146h();
    }

    @WorkerThread
    /* JADX INFO: renamed from: A */
    public final boolean m221060A() {
        this.f205690a.zzl().mo15146h();
        return this.f205704o;
    }

    @WorkerThread
    /* JADX INFO: renamed from: A0 */
    public final void m221061A0(long j) {
        Preconditions.checkArgument(j >= 0);
        this.f205690a.zzl().mo15146h();
        this.f205687Q |= this.f205696g != j;
        this.f205696g = j;
    }

    @WorkerThread
    /* JADX INFO: renamed from: B */
    public final boolean m221062B() {
        this.f205690a.zzl().mo15146h();
        return this.f205687Q;
    }

    @WorkerThread
    /* JADX INFO: renamed from: B0 */
    public final long m221063B0() {
        this.f205690a.zzl().mo15146h();
        return this.f205677G;
    }

    @WorkerThread
    /* JADX INFO: renamed from: C */
    public final boolean m221064C() {
        this.f205690a.zzl().mo15146h();
        return this.f205711v;
    }

    @WorkerThread
    /* JADX INFO: renamed from: C0 */
    public final void m221065C0(long j) {
        this.f205690a.zzl().mo15146h();
        this.f205687Q |= this.f205697h != j;
        this.f205697h = j;
    }

    @WorkerThread
    /* JADX INFO: renamed from: D */
    public final boolean m221066D() {
        this.f205690a.zzl().mo15146h();
        return this.f205715z;
    }

    @WorkerThread
    /* JADX INFO: renamed from: D0 */
    public final long m221067D0() {
        this.f205690a.zzl().mo15146h();
        return this.f205698i;
    }

    @Nullable
    @WorkerThread
    /* JADX INFO: renamed from: E */
    public final byte[] m221068E() {
        this.f205690a.zzl().mo15146h();
        return this.f205679I;
    }

    @WorkerThread
    /* JADX INFO: renamed from: E0 */
    public final void m221069E0(long j) {
        this.f205690a.zzl().mo15146h();
        this.f205687Q |= this.f205713x != j;
        this.f205713x = j;
    }

    @WorkerThread
    /* JADX INFO: renamed from: F */
    public final int m221070F() {
        this.f205690a.zzl().mo15146h();
        return this.f205676F;
    }

    @WorkerThread
    /* JADX INFO: renamed from: F0 */
    public final long m221071F0() {
        this.f205690a.zzl().mo15146h();
        return this.f205696g;
    }

    @WorkerThread
    /* JADX INFO: renamed from: G */
    public final void m221072G(int i) {
        this.f205690a.zzl().mo15146h();
        this.f205687Q |= this.f205676F != i;
        this.f205676F = i;
    }

    @WorkerThread
    /* JADX INFO: renamed from: G0 */
    public final void m221073G0(long j) {
        this.f205690a.zzl().mo15146h();
        this.f205687Q |= this.f205712w != j;
        this.f205712w = j;
    }

    @WorkerThread
    /* JADX INFO: renamed from: H */
    public final void m221074H(long j) {
        this.f205690a.zzl().mo15146h();
        this.f205687Q |= this.f205700k != j;
        this.f205700k = j;
    }

    @WorkerThread
    /* JADX INFO: renamed from: H0 */
    public final long m221075H0() {
        this.f205690a.zzl().mo15146h();
        return this.f205697h;
    }

    @WorkerThread
    /* JADX INFO: renamed from: I */
    public final void m221076I(@Nullable Long l2) {
        this.f205690a.zzl().mo15146h();
        this.f205687Q |= !Objects.equals(this.f205672B, l2);
        this.f205672B = l2;
    }

    @WorkerThread
    /* JADX INFO: renamed from: I0 */
    public final long m221077I0() {
        this.f205690a.zzl().mo15146h();
        return this.f205713x;
    }

    @WorkerThread
    /* JADX INFO: renamed from: J */
    public final void m221078J(@Nullable String str) {
        this.f205690a.zzl().mo15146h();
        this.f205687Q |= !Objects.equals(this.f205692c, str);
        this.f205692c = str;
    }

    @WorkerThread
    /* JADX INFO: renamed from: J0 */
    public final long m221079J0() {
        this.f205690a.zzl().mo15146h();
        return this.f205712w;
    }

    @WorkerThread
    /* JADX INFO: renamed from: K */
    public final void m221080K(boolean z) {
        this.f205690a.zzl().mo15146h();
        this.f205687Q |= this.f205704o != z;
        this.f205704o = z;
    }

    @Nullable
    @WorkerThread
    /* JADX INFO: renamed from: K0 */
    public final Boolean m221081K0() {
        this.f205690a.zzl().mo15146h();
        return this.f205707r;
    }

    @WorkerThread
    /* JADX INFO: renamed from: L */
    public final int m221082L() {
        this.f205690a.zzl().mo15146h();
        return this.f205675E;
    }

    @Nullable
    @WorkerThread
    /* JADX INFO: renamed from: L0 */
    public final Long m221083L0() {
        this.f205690a.zzl().mo15146h();
        return this.f205671A;
    }

    @WorkerThread
    /* JADX INFO: renamed from: M */
    public final void m221084M(int i) {
        this.f205690a.zzl().mo15146h();
        this.f205687Q |= this.f205675E != i;
        this.f205675E = i;
    }

    @Nullable
    @WorkerThread
    /* JADX INFO: renamed from: M0 */
    public final Long m221085M0() {
        this.f205690a.zzl().mo15146h();
        return this.f205672B;
    }

    @WorkerThread
    /* JADX INFO: renamed from: N */
    public final void m221086N(long j) {
        this.f205690a.zzl().mo15146h();
        this.f205687Q |= this.f205673C != j;
        this.f205673C = j;
    }

    @WorkerThread
    /* JADX INFO: renamed from: O */
    public final void m221087O(@Nullable String str) {
        this.f205690a.zzl().mo15146h();
        this.f205687Q |= !Objects.equals(this.f205701l, str);
        this.f205701l = str;
    }

    @WorkerThread
    /* JADX INFO: renamed from: P */
    public final void m221088P(boolean z) {
        this.f205690a.zzl().mo15146h();
        this.f205687Q |= this.f205711v != z;
        this.f205711v = z;
    }

    @WorkerThread
    /* JADX INFO: renamed from: Q */
    public final long m221089Q() {
        this.f205690a.zzl().mo15146h();
        return 0L;
    }

    @WorkerThread
    /* JADX INFO: renamed from: R */
    public final void m221090R(long j) {
        this.f205690a.zzl().mo15146h();
        this.f205687Q |= this.f205688R != j;
        this.f205688R = j;
    }

    @WorkerThread
    /* JADX INFO: renamed from: S */
    public final void m221091S(@Nullable String str) {
        this.f205690a.zzl().mo15146h();
        this.f205687Q |= !Objects.equals(this.f205699j, str);
        this.f205699j = str;
    }

    @WorkerThread
    /* JADX INFO: renamed from: T */
    public final void m221092T(boolean z) {
        this.f205690a.zzl().mo15146h();
        this.f205687Q |= this.f205715z != z;
        this.f205715z = z;
    }

    @WorkerThread
    /* JADX INFO: renamed from: U */
    public final long m221093U() {
        this.f205690a.zzl().mo15146h();
        return this.f205700k;
    }

    @WorkerThread
    /* JADX INFO: renamed from: V */
    public final void m221094V(long j) {
        this.f205690a.zzl().mo15146h();
        this.f205687Q |= this.f205683M != j;
        this.f205683M = j;
    }

    @WorkerThread
    /* JADX INFO: renamed from: W */
    public final void m221095W(@Nullable String str) {
        this.f205690a.zzl().mo15146h();
        this.f205687Q |= !Objects.equals(this.f205695f, str);
        this.f205695f = str;
    }

    @WorkerThread
    /* JADX INFO: renamed from: X */
    public final long m221096X() {
        this.f205690a.zzl().mo15146h();
        return this.f205673C;
    }

    @WorkerThread
    /* JADX INFO: renamed from: Y */
    public final void m221097Y(long j) {
        this.f205690a.zzl().mo15146h();
        this.f205687Q |= this.f205684N != j;
        this.f205684N = j;
    }

    @WorkerThread
    /* JADX INFO: renamed from: Z */
    public final void m221098Z(@Nullable String str) {
        this.f205690a.zzl().mo15146h();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f205687Q |= !Objects.equals(this.f205693d, str);
        this.f205693d = str;
    }

    @WorkerThread
    /* JADX INFO: renamed from: a */
    public final int m221099a() {
        this.f205690a.zzl().mo15146h();
        return this.f205714y;
    }

    @WorkerThread
    /* JADX INFO: renamed from: a0 */
    public final long m221100a0() {
        this.f205690a.zzl().mo15146h();
        return this.f205688R;
    }

    @WorkerThread
    /* JADX INFO: renamed from: b */
    public final void m221101b(int i) {
        this.f205690a.zzl().mo15146h();
        this.f205687Q |= this.f205714y != i;
        this.f205714y = i;
    }

    @WorkerThread
    /* JADX INFO: renamed from: b0 */
    public final void m221102b0(long j) {
        this.f205690a.zzl().mo15146h();
        this.f205687Q |= this.f205682L != j;
        this.f205682L = j;
    }

    @WorkerThread
    /* JADX INFO: renamed from: c */
    public final void m221103c(long j) {
        this.f205690a.zzl().mo15146h();
        long j2 = this.f205696g + j;
        if (j2 > 2147483647L) {
            this.f205690a.zzj().m114563F().m153301b("Bundle index overflow. appId", d6x0.m114551p(this.f205691b));
            j2 = j - 1;
        }
        long j3 = this.f205677G + 1;
        if (j3 > 2147483647L) {
            this.f205690a.zzj().m114563F().m153301b("Delivery index overflow. appId", d6x0.m114551p(this.f205691b));
            j3 = 0;
        }
        this.f205687Q = true;
        this.f205696g = j2;
        this.f205677G = j3;
    }

    @WorkerThread
    /* JADX INFO: renamed from: c0 */
    public final void m221104c0(@Nullable String str) {
        this.f205690a.zzl().mo15146h();
        this.f205687Q |= !Objects.equals(this.f205686P, str);
        this.f205686P = str;
    }

    @WorkerThread
    /* JADX INFO: renamed from: d */
    public final void m221105d(@Nullable Boolean bool) {
        this.f205690a.zzl().mo15146h();
        this.f205687Q |= !Objects.equals(this.f205707r, bool);
        this.f205707r = bool;
    }

    @WorkerThread
    /* JADX INFO: renamed from: d0 */
    public final long m221106d0() {
        this.f205690a.zzl().mo15146h();
        return this.f205683M;
    }

    @WorkerThread
    /* JADX INFO: renamed from: e */
    public final void m221107e(@Nullable Long l2) {
        this.f205690a.zzl().mo15146h();
        this.f205687Q |= !Objects.equals(this.f205671A, l2);
        this.f205671A = l2;
    }

    @WorkerThread
    /* JADX INFO: renamed from: e0 */
    public final void m221108e0(long j) {
        this.f205690a.zzl().mo15146h();
        this.f205687Q |= this.f205681K != j;
        this.f205681K = j;
    }

    @WorkerThread
    /* JADX INFO: renamed from: f */
    public final void m221109f(@Nullable String str) {
        this.f205690a.zzl().mo15146h();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f205687Q |= !Objects.equals(this.f205706q, str);
        this.f205706q = str;
    }

    @WorkerThread
    /* JADX INFO: renamed from: f0 */
    public final void m221110f0(@Nullable String str) {
        this.f205690a.zzl().mo15146h();
        this.f205687Q |= !Objects.equals(this.f205694e, str);
        this.f205694e = str;
    }

    @WorkerThread
    /* JADX INFO: renamed from: g */
    public final void m221111g(@Nullable List<String> list) {
        this.f205690a.zzl().mo15146h();
        if (Objects.equals(this.f205709t, list)) {
            return;
        }
        this.f205687Q = true;
        this.f205709t = list != null ? new ArrayList(list) : null;
    }

    @WorkerThread
    /* JADX INFO: renamed from: g0 */
    public final long m221112g0() {
        this.f205690a.zzl().mo15146h();
        return this.f205684N;
    }

    @WorkerThread
    /* JADX INFO: renamed from: h */
    public final void m221113h(boolean z) {
        this.f205690a.zzl().mo15146h();
        this.f205687Q |= this.f205705p != z;
        this.f205705p = z;
    }

    @WorkerThread
    /* JADX INFO: renamed from: h0 */
    public final void m221114h0(long j) {
        this.f205690a.zzl().mo15146h();
        this.f205687Q |= this.f205685O != j;
        this.f205685O = j;
    }

    @WorkerThread
    /* JADX INFO: renamed from: i */
    public final void m221115i(@Nullable byte[] bArr) {
        this.f205690a.zzl().mo15146h();
        this.f205687Q |= this.f205679I != bArr;
        this.f205679I = bArr;
    }

    @WorkerThread
    /* JADX INFO: renamed from: i0 */
    public final void m221116i0(String str) {
        this.f205690a.zzl().mo15146h();
        this.f205687Q |= this.f205678H != str;
        this.f205678H = str;
    }

    @Nullable
    @WorkerThread
    /* JADX INFO: renamed from: j */
    public final String m221117j() {
        this.f205690a.zzl().mo15146h();
        return this.f205706q;
    }

    @WorkerThread
    /* JADX INFO: renamed from: j0 */
    public final long m221118j0() {
        this.f205690a.zzl().mo15146h();
        return this.f205682L;
    }

    @Nullable
    @WorkerThread
    /* JADX INFO: renamed from: k */
    public final String m221119k() {
        this.f205690a.zzl().mo15146h();
        String str = this.f205686P;
        m221104c0(null);
        return str;
    }

    @WorkerThread
    /* JADX INFO: renamed from: k0 */
    public final void m221120k0(long j) {
        this.f205690a.zzl().mo15146h();
        this.f205687Q |= this.f205680J != j;
        this.f205680J = j;
    }

    @WorkerThread
    /* JADX INFO: renamed from: l */
    public final String m221121l() {
        this.f205690a.zzl().mo15146h();
        return this.f205691b;
    }

    @WorkerThread
    /* JADX INFO: renamed from: l0 */
    public final void m221122l0(@Nullable String str) {
        this.f205690a.zzl().mo15146h();
        this.f205687Q |= !Objects.equals(this.f205710u, str);
        this.f205710u = str;
    }

    @Nullable
    @WorkerThread
    /* JADX INFO: renamed from: m */
    public final String m221123m() {
        this.f205690a.zzl().mo15146h();
        return this.f205692c;
    }

    @WorkerThread
    /* JADX INFO: renamed from: m0 */
    public final long m221124m0() {
        this.f205690a.zzl().mo15146h();
        return this.f205681K;
    }

    @Nullable
    @WorkerThread
    /* JADX INFO: renamed from: n */
    public final String m221125n() {
        this.f205690a.zzl().mo15146h();
        return this.f205701l;
    }

    @WorkerThread
    /* JADX INFO: renamed from: n0 */
    public final void m221126n0(long j) {
        this.f205690a.zzl().mo15146h();
        this.f205687Q |= this.f205703n != j;
        this.f205703n = j;
    }

    @Nullable
    @WorkerThread
    /* JADX INFO: renamed from: o */
    public final String m221127o() {
        this.f205690a.zzl().mo15146h();
        return this.f205699j;
    }

    @WorkerThread
    /* JADX INFO: renamed from: o0 */
    public final void m221128o0(@Nullable String str) {
        this.f205690a.zzl().mo15146h();
        this.f205687Q |= this.f205674D != str;
        this.f205674D = str;
    }

    @Nullable
    @WorkerThread
    /* JADX INFO: renamed from: p */
    public final String m221129p() {
        this.f205690a.zzl().mo15146h();
        return this.f205695f;
    }

    @WorkerThread
    /* JADX INFO: renamed from: p0 */
    public final long m221130p0() {
        this.f205690a.zzl().mo15146h();
        return this.f205685O;
    }

    @Nullable
    @WorkerThread
    /* JADX INFO: renamed from: q */
    public final String m221131q() {
        this.f205690a.zzl().mo15146h();
        return this.f205693d;
    }

    @WorkerThread
    /* JADX INFO: renamed from: q0 */
    public final void m221132q0(long j) {
        this.f205690a.zzl().mo15146h();
        this.f205687Q |= this.f205708s != j;
        this.f205708s = j;
    }

    @Nullable
    @WorkerThread
    /* JADX INFO: renamed from: r */
    public final String m221133r() {
        this.f205690a.zzl().mo15146h();
        return this.f205686P;
    }

    @WorkerThread
    /* JADX INFO: renamed from: r0 */
    public final long m221134r0() {
        this.f205690a.zzl().mo15146h();
        return this.f205680J;
    }

    @Nullable
    @WorkerThread
    /* JADX INFO: renamed from: s */
    public final String m221135s() {
        this.f205690a.zzl().mo15146h();
        return this.f205694e;
    }

    @WorkerThread
    /* JADX INFO: renamed from: s0 */
    public final void m221136s0(long j) {
        this.f205690a.zzl().mo15146h();
        this.f205687Q |= this.f205689S != j;
        this.f205689S = j;
    }

    @WorkerThread
    /* JADX INFO: renamed from: t */
    public final String m221137t() {
        this.f205690a.zzl().mo15146h();
        return this.f205678H;
    }

    @WorkerThread
    /* JADX INFO: renamed from: t0 */
    public final long m221138t0() {
        this.f205690a.zzl().mo15146h();
        return this.f205703n;
    }

    @Nullable
    @WorkerThread
    /* JADX INFO: renamed from: u */
    public final String m221139u() {
        this.f205690a.zzl().mo15146h();
        return this.f205710u;
    }

    @WorkerThread
    /* JADX INFO: renamed from: u0 */
    public final void m221140u0(long j) {
        this.f205690a.zzl().mo15146h();
        this.f205687Q |= this.f205702m != j;
        this.f205702m = j;
    }

    @Nullable
    @WorkerThread
    /* JADX INFO: renamed from: v */
    public final String m221141v() {
        this.f205690a.zzl().mo15146h();
        return this.f205674D;
    }

    @WorkerThread
    /* JADX INFO: renamed from: v0 */
    public final long m221142v0() {
        this.f205690a.zzl().mo15146h();
        return this.f205708s;
    }

    @Nullable
    @WorkerThread
    /* JADX INFO: renamed from: w */
    public final List<String> m221143w() {
        this.f205690a.zzl().mo15146h();
        return this.f205709t;
    }

    @WorkerThread
    /* JADX INFO: renamed from: w0 */
    public final void m221144w0(long j) {
        this.f205690a.zzl().mo15146h();
        this.f205687Q |= this.f205677G != j;
        this.f205677G = j;
    }

    @WorkerThread
    /* JADX INFO: renamed from: x */
    public final void m221145x() {
        this.f205690a.zzl().mo15146h();
        this.f205687Q = false;
    }

    @WorkerThread
    /* JADX INFO: renamed from: x0 */
    public final long m221146x0() {
        this.f205690a.zzl().mo15146h();
        return this.f205689S;
    }

    @WorkerThread
    /* JADX INFO: renamed from: y */
    public final void m221147y() {
        this.f205690a.zzl().mo15146h();
        long j = this.f205696g + 1;
        if (j > 2147483647L) {
            this.f205690a.zzj().m114563F().m153301b("Bundle index overflow. appId", d6x0.m114551p(this.f205691b));
            j = 0;
        }
        this.f205687Q = true;
        this.f205696g = j;
    }

    @WorkerThread
    /* JADX INFO: renamed from: y0 */
    public final void m221148y0(long j) {
        this.f205690a.zzl().mo15146h();
        this.f205687Q |= this.f205698i != j;
        this.f205698i = j;
    }

    @WorkerThread
    /* JADX INFO: renamed from: z */
    public final boolean m221149z() {
        this.f205690a.zzl().mo15146h();
        return this.f205705p;
    }

    @WorkerThread
    /* JADX INFO: renamed from: z0 */
    public final long m221150z0() {
        this.f205690a.zzl().mo15146h();
        return this.f205702m;
    }
}
