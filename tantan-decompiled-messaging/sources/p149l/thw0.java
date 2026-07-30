package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class thw0 {

    /* JADX INFO: renamed from: A */
    @Nullable
    public Long f170290A;

    /* JADX INFO: renamed from: B */
    @Nullable
    public Long f170291B;

    /* JADX INFO: renamed from: C */
    public long f170292C;

    /* JADX INFO: renamed from: D */
    @Nullable
    public String f170293D;

    /* JADX INFO: renamed from: E */
    public int f170294E;

    /* JADX INFO: renamed from: F */
    public int f170295F;

    /* JADX INFO: renamed from: G */
    public long f170296G;

    /* JADX INFO: renamed from: H */
    public String f170297H;

    /* JADX INFO: renamed from: I */
    @Nullable
    public byte[] f170298I;

    /* JADX INFO: renamed from: J */
    public long f170299J;

    /* JADX INFO: renamed from: K */
    public long f170300K;

    /* JADX INFO: renamed from: L */
    public long f170301L;

    /* JADX INFO: renamed from: M */
    public long f170302M;

    /* JADX INFO: renamed from: N */
    public long f170303N;

    /* JADX INFO: renamed from: O */
    public long f170304O;

    /* JADX INFO: renamed from: P */
    @Nullable
    public String f170305P;

    /* JADX INFO: renamed from: Q */
    public boolean f170306Q;

    /* JADX INFO: renamed from: R */
    public long f170307R;

    /* JADX INFO: renamed from: S */
    public long f170308S;

    /* JADX INFO: renamed from: a */
    public final ujx0 f170309a;

    /* JADX INFO: renamed from: b */
    public final String f170310b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public String f170311c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public String f170312d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public String f170313e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public String f170314f;

    /* JADX INFO: renamed from: g */
    public long f170315g;

    /* JADX INFO: renamed from: h */
    public long f170316h;

    /* JADX INFO: renamed from: i */
    public long f170317i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public String f170318j;

    /* JADX INFO: renamed from: k */
    public long f170319k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public String f170320l;

    /* JADX INFO: renamed from: m */
    public long f170321m;

    /* JADX INFO: renamed from: n */
    public long f170322n;

    /* JADX INFO: renamed from: o */
    public boolean f170323o;

    /* JADX INFO: renamed from: p */
    public boolean f170324p;

    /* JADX INFO: renamed from: q */
    @Nullable
    public String f170325q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public Boolean f170326r;

    /* JADX INFO: renamed from: s */
    public long f170327s;

    /* JADX INFO: renamed from: t */
    @Nullable
    public List<String> f170328t;

    /* JADX INFO: renamed from: u */
    @Nullable
    public String f170329u;

    /* JADX INFO: renamed from: v */
    public boolean f170330v;

    /* JADX INFO: renamed from: w */
    public long f170331w;

    /* JADX INFO: renamed from: x */
    public long f170332x;

    /* JADX INFO: renamed from: y */
    public int f170333y;

    /* JADX INFO: renamed from: z */
    public boolean f170334z;

    @WorkerThread
    public thw0(ujx0 ujx0Var, String str) {
        Preconditions.checkNotNull(ujx0Var);
        Preconditions.checkNotEmpty(str);
        this.f170309a = ujx0Var;
        this.f170310b = str;
        ujx0Var.zzl().mo15092h();
    }

    @WorkerThread
    /* JADX INFO: renamed from: A */
    public final boolean m188932A() {
        this.f170309a.zzl().mo15092h();
        return this.f170323o;
    }

    @WorkerThread
    /* JADX INFO: renamed from: A0 */
    public final void m188933A0(long j) {
        Preconditions.checkArgument(j >= 0);
        this.f170309a.zzl().mo15092h();
        this.f170306Q |= this.f170315g != j;
        this.f170315g = j;
    }

    @WorkerThread
    /* JADX INFO: renamed from: B */
    public final boolean m188934B() {
        this.f170309a.zzl().mo15092h();
        return this.f170306Q;
    }

    @WorkerThread
    /* JADX INFO: renamed from: B0 */
    public final long m188935B0() {
        this.f170309a.zzl().mo15092h();
        return this.f170296G;
    }

    @WorkerThread
    /* JADX INFO: renamed from: C */
    public final boolean m188936C() {
        this.f170309a.zzl().mo15092h();
        return this.f170330v;
    }

    @WorkerThread
    /* JADX INFO: renamed from: C0 */
    public final void m188937C0(long j) {
        this.f170309a.zzl().mo15092h();
        this.f170306Q |= this.f170316h != j;
        this.f170316h = j;
    }

    @WorkerThread
    /* JADX INFO: renamed from: D */
    public final boolean m188938D() {
        this.f170309a.zzl().mo15092h();
        return this.f170334z;
    }

    @WorkerThread
    /* JADX INFO: renamed from: D0 */
    public final long m188939D0() {
        this.f170309a.zzl().mo15092h();
        return this.f170317i;
    }

    @Nullable
    @WorkerThread
    /* JADX INFO: renamed from: E */
    public final byte[] m188940E() {
        this.f170309a.zzl().mo15092h();
        return this.f170298I;
    }

    @WorkerThread
    /* JADX INFO: renamed from: E0 */
    public final void m188941E0(long j) {
        this.f170309a.zzl().mo15092h();
        this.f170306Q |= this.f170332x != j;
        this.f170332x = j;
    }

    @WorkerThread
    /* JADX INFO: renamed from: F */
    public final int m188942F() {
        this.f170309a.zzl().mo15092h();
        return this.f170295F;
    }

    @WorkerThread
    /* JADX INFO: renamed from: F0 */
    public final long m188943F0() {
        this.f170309a.zzl().mo15092h();
        return this.f170315g;
    }

    @WorkerThread
    /* JADX INFO: renamed from: G */
    public final void m188944G(int i) {
        this.f170309a.zzl().mo15092h();
        this.f170306Q |= this.f170295F != i;
        this.f170295F = i;
    }

    @WorkerThread
    /* JADX INFO: renamed from: G0 */
    public final void m188945G0(long j) {
        this.f170309a.zzl().mo15092h();
        this.f170306Q |= this.f170331w != j;
        this.f170331w = j;
    }

    @WorkerThread
    /* JADX INFO: renamed from: H */
    public final void m188946H(long j) {
        this.f170309a.zzl().mo15092h();
        this.f170306Q |= this.f170319k != j;
        this.f170319k = j;
    }

    @WorkerThread
    /* JADX INFO: renamed from: H0 */
    public final long m188947H0() {
        this.f170309a.zzl().mo15092h();
        return this.f170316h;
    }

    @WorkerThread
    /* JADX INFO: renamed from: I */
    public final void m188948I(@Nullable Long l2) {
        this.f170309a.zzl().mo15092h();
        this.f170306Q |= !Objects.equals(this.f170291B, l2);
        this.f170291B = l2;
    }

    @WorkerThread
    /* JADX INFO: renamed from: I0 */
    public final long m188949I0() {
        this.f170309a.zzl().mo15092h();
        return this.f170332x;
    }

    @WorkerThread
    /* JADX INFO: renamed from: J */
    public final void m188950J(@Nullable String str) {
        this.f170309a.zzl().mo15092h();
        this.f170306Q |= !Objects.equals(this.f170311c, str);
        this.f170311c = str;
    }

    @WorkerThread
    /* JADX INFO: renamed from: J0 */
    public final long m188951J0() {
        this.f170309a.zzl().mo15092h();
        return this.f170331w;
    }

    @WorkerThread
    /* JADX INFO: renamed from: K */
    public final void m188952K(boolean z) {
        this.f170309a.zzl().mo15092h();
        this.f170306Q |= this.f170323o != z;
        this.f170323o = z;
    }

    @Nullable
    @WorkerThread
    /* JADX INFO: renamed from: K0 */
    public final Boolean m188953K0() {
        this.f170309a.zzl().mo15092h();
        return this.f170326r;
    }

    @WorkerThread
    /* JADX INFO: renamed from: L */
    public final int m188954L() {
        this.f170309a.zzl().mo15092h();
        return this.f170294E;
    }

    @Nullable
    @WorkerThread
    /* JADX INFO: renamed from: L0 */
    public final Long m188955L0() {
        this.f170309a.zzl().mo15092h();
        return this.f170290A;
    }

    @WorkerThread
    /* JADX INFO: renamed from: M */
    public final void m188956M(int i) {
        this.f170309a.zzl().mo15092h();
        this.f170306Q |= this.f170294E != i;
        this.f170294E = i;
    }

    @Nullable
    @WorkerThread
    /* JADX INFO: renamed from: M0 */
    public final Long m188957M0() {
        this.f170309a.zzl().mo15092h();
        return this.f170291B;
    }

    @WorkerThread
    /* JADX INFO: renamed from: N */
    public final void m188958N(long j) {
        this.f170309a.zzl().mo15092h();
        this.f170306Q |= this.f170292C != j;
        this.f170292C = j;
    }

    @WorkerThread
    /* JADX INFO: renamed from: O */
    public final void m188959O(@Nullable String str) {
        this.f170309a.zzl().mo15092h();
        this.f170306Q |= !Objects.equals(this.f170320l, str);
        this.f170320l = str;
    }

    @WorkerThread
    /* JADX INFO: renamed from: P */
    public final void m188960P(boolean z) {
        this.f170309a.zzl().mo15092h();
        this.f170306Q |= this.f170330v != z;
        this.f170330v = z;
    }

    @WorkerThread
    /* JADX INFO: renamed from: Q */
    public final long m188961Q() {
        this.f170309a.zzl().mo15092h();
        return 0L;
    }

    @WorkerThread
    /* JADX INFO: renamed from: R */
    public final void m188962R(long j) {
        this.f170309a.zzl().mo15092h();
        this.f170306Q |= this.f170307R != j;
        this.f170307R = j;
    }

    @WorkerThread
    /* JADX INFO: renamed from: S */
    public final void m188963S(@Nullable String str) {
        this.f170309a.zzl().mo15092h();
        this.f170306Q |= !Objects.equals(this.f170318j, str);
        this.f170318j = str;
    }

    @WorkerThread
    /* JADX INFO: renamed from: T */
    public final void m188964T(boolean z) {
        this.f170309a.zzl().mo15092h();
        this.f170306Q |= this.f170334z != z;
        this.f170334z = z;
    }

    @WorkerThread
    /* JADX INFO: renamed from: U */
    public final long m188965U() {
        this.f170309a.zzl().mo15092h();
        return this.f170319k;
    }

    @WorkerThread
    /* JADX INFO: renamed from: V */
    public final void m188966V(long j) {
        this.f170309a.zzl().mo15092h();
        this.f170306Q |= this.f170302M != j;
        this.f170302M = j;
    }

    @WorkerThread
    /* JADX INFO: renamed from: W */
    public final void m188967W(@Nullable String str) {
        this.f170309a.zzl().mo15092h();
        this.f170306Q |= !Objects.equals(this.f170314f, str);
        this.f170314f = str;
    }

    @WorkerThread
    /* JADX INFO: renamed from: X */
    public final long m188968X() {
        this.f170309a.zzl().mo15092h();
        return this.f170292C;
    }

    @WorkerThread
    /* JADX INFO: renamed from: Y */
    public final void m188969Y(long j) {
        this.f170309a.zzl().mo15092h();
        this.f170306Q |= this.f170303N != j;
        this.f170303N = j;
    }

    @WorkerThread
    /* JADX INFO: renamed from: Z */
    public final void m188970Z(@Nullable String str) {
        this.f170309a.zzl().mo15092h();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f170306Q |= !Objects.equals(this.f170312d, str);
        this.f170312d = str;
    }

    @WorkerThread
    /* JADX INFO: renamed from: a */
    public final int m188971a() {
        this.f170309a.zzl().mo15092h();
        return this.f170333y;
    }

    @WorkerThread
    /* JADX INFO: renamed from: a0 */
    public final long m188972a0() {
        this.f170309a.zzl().mo15092h();
        return this.f170307R;
    }

    @WorkerThread
    /* JADX INFO: renamed from: b */
    public final void m188973b(int i) {
        this.f170309a.zzl().mo15092h();
        this.f170306Q |= this.f170333y != i;
        this.f170333y = i;
    }

    @WorkerThread
    /* JADX INFO: renamed from: b0 */
    public final void m188974b0(long j) {
        this.f170309a.zzl().mo15092h();
        this.f170306Q |= this.f170301L != j;
        this.f170301L = j;
    }

    @WorkerThread
    /* JADX INFO: renamed from: c */
    public final void m188975c(long j) {
        this.f170309a.zzl().mo15092h();
        long j2 = this.f170315g + j;
        if (j2 > 2147483647L) {
            this.f170309a.zzj().m211417F().m123937b("Bundle index overflow. appId", xww0.m211405p(this.f170310b));
            j2 = j - 1;
        }
        long j3 = this.f170296G + 1;
        if (j3 > 2147483647L) {
            this.f170309a.zzj().m211417F().m123937b("Delivery index overflow. appId", xww0.m211405p(this.f170310b));
            j3 = 0;
        }
        this.f170306Q = true;
        this.f170315g = j2;
        this.f170296G = j3;
    }

    @WorkerThread
    /* JADX INFO: renamed from: c0 */
    public final void m188976c0(@Nullable String str) {
        this.f170309a.zzl().mo15092h();
        this.f170306Q |= !Objects.equals(this.f170305P, str);
        this.f170305P = str;
    }

    @WorkerThread
    /* JADX INFO: renamed from: d */
    public final void m188977d(@Nullable Boolean bool) {
        this.f170309a.zzl().mo15092h();
        this.f170306Q |= !Objects.equals(this.f170326r, bool);
        this.f170326r = bool;
    }

    @WorkerThread
    /* JADX INFO: renamed from: d0 */
    public final long m188978d0() {
        this.f170309a.zzl().mo15092h();
        return this.f170302M;
    }

    @WorkerThread
    /* JADX INFO: renamed from: e */
    public final void m188979e(@Nullable Long l2) {
        this.f170309a.zzl().mo15092h();
        this.f170306Q |= !Objects.equals(this.f170290A, l2);
        this.f170290A = l2;
    }

    @WorkerThread
    /* JADX INFO: renamed from: e0 */
    public final void m188980e0(long j) {
        this.f170309a.zzl().mo15092h();
        this.f170306Q |= this.f170300K != j;
        this.f170300K = j;
    }

    @WorkerThread
    /* JADX INFO: renamed from: f */
    public final void m188981f(@Nullable String str) {
        this.f170309a.zzl().mo15092h();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f170306Q |= !Objects.equals(this.f170325q, str);
        this.f170325q = str;
    }

    @WorkerThread
    /* JADX INFO: renamed from: f0 */
    public final void m188982f0(@Nullable String str) {
        this.f170309a.zzl().mo15092h();
        this.f170306Q |= !Objects.equals(this.f170313e, str);
        this.f170313e = str;
    }

    @WorkerThread
    /* JADX INFO: renamed from: g */
    public final void m188983g(@Nullable List<String> list) {
        this.f170309a.zzl().mo15092h();
        if (Objects.equals(this.f170328t, list)) {
            return;
        }
        this.f170306Q = true;
        this.f170328t = list != null ? new ArrayList(list) : null;
    }

    @WorkerThread
    /* JADX INFO: renamed from: g0 */
    public final long m188984g0() {
        this.f170309a.zzl().mo15092h();
        return this.f170303N;
    }

    @WorkerThread
    /* JADX INFO: renamed from: h */
    public final void m188985h(boolean z) {
        this.f170309a.zzl().mo15092h();
        this.f170306Q |= this.f170324p != z;
        this.f170324p = z;
    }

    @WorkerThread
    /* JADX INFO: renamed from: h0 */
    public final void m188986h0(long j) {
        this.f170309a.zzl().mo15092h();
        this.f170306Q |= this.f170304O != j;
        this.f170304O = j;
    }

    @WorkerThread
    /* JADX INFO: renamed from: i */
    public final void m188987i(@Nullable byte[] bArr) {
        this.f170309a.zzl().mo15092h();
        this.f170306Q |= this.f170298I != bArr;
        this.f170298I = bArr;
    }

    @WorkerThread
    /* JADX INFO: renamed from: i0 */
    public final void m188988i0(String str) {
        this.f170309a.zzl().mo15092h();
        this.f170306Q |= this.f170297H != str;
        this.f170297H = str;
    }

    @Nullable
    @WorkerThread
    /* JADX INFO: renamed from: j */
    public final String m188989j() {
        this.f170309a.zzl().mo15092h();
        return this.f170325q;
    }

    @WorkerThread
    /* JADX INFO: renamed from: j0 */
    public final long m188990j0() {
        this.f170309a.zzl().mo15092h();
        return this.f170301L;
    }

    @Nullable
    @WorkerThread
    /* JADX INFO: renamed from: k */
    public final String m188991k() {
        this.f170309a.zzl().mo15092h();
        String str = this.f170305P;
        m188976c0(null);
        return str;
    }

    @WorkerThread
    /* JADX INFO: renamed from: k0 */
    public final void m188992k0(long j) {
        this.f170309a.zzl().mo15092h();
        this.f170306Q |= this.f170299J != j;
        this.f170299J = j;
    }

    @WorkerThread
    /* JADX INFO: renamed from: l */
    public final String m188993l() {
        this.f170309a.zzl().mo15092h();
        return this.f170310b;
    }

    @WorkerThread
    /* JADX INFO: renamed from: l0 */
    public final void m188994l0(@Nullable String str) {
        this.f170309a.zzl().mo15092h();
        this.f170306Q |= !Objects.equals(this.f170329u, str);
        this.f170329u = str;
    }

    @Nullable
    @WorkerThread
    /* JADX INFO: renamed from: m */
    public final String m188995m() {
        this.f170309a.zzl().mo15092h();
        return this.f170311c;
    }

    @WorkerThread
    /* JADX INFO: renamed from: m0 */
    public final long m188996m0() {
        this.f170309a.zzl().mo15092h();
        return this.f170300K;
    }

    @Nullable
    @WorkerThread
    /* JADX INFO: renamed from: n */
    public final String m188997n() {
        this.f170309a.zzl().mo15092h();
        return this.f170320l;
    }

    @WorkerThread
    /* JADX INFO: renamed from: n0 */
    public final void m188998n0(long j) {
        this.f170309a.zzl().mo15092h();
        this.f170306Q |= this.f170322n != j;
        this.f170322n = j;
    }

    @Nullable
    @WorkerThread
    /* JADX INFO: renamed from: o */
    public final String m188999o() {
        this.f170309a.zzl().mo15092h();
        return this.f170318j;
    }

    @WorkerThread
    /* JADX INFO: renamed from: o0 */
    public final void m189000o0(@Nullable String str) {
        this.f170309a.zzl().mo15092h();
        this.f170306Q |= this.f170293D != str;
        this.f170293D = str;
    }

    @Nullable
    @WorkerThread
    /* JADX INFO: renamed from: p */
    public final String m189001p() {
        this.f170309a.zzl().mo15092h();
        return this.f170314f;
    }

    @WorkerThread
    /* JADX INFO: renamed from: p0 */
    public final long m189002p0() {
        this.f170309a.zzl().mo15092h();
        return this.f170304O;
    }

    @Nullable
    @WorkerThread
    /* JADX INFO: renamed from: q */
    public final String m189003q() {
        this.f170309a.zzl().mo15092h();
        return this.f170312d;
    }

    @WorkerThread
    /* JADX INFO: renamed from: q0 */
    public final void m189004q0(long j) {
        this.f170309a.zzl().mo15092h();
        this.f170306Q |= this.f170327s != j;
        this.f170327s = j;
    }

    @Nullable
    @WorkerThread
    /* JADX INFO: renamed from: r */
    public final String m189005r() {
        this.f170309a.zzl().mo15092h();
        return this.f170305P;
    }

    @WorkerThread
    /* JADX INFO: renamed from: r0 */
    public final long m189006r0() {
        this.f170309a.zzl().mo15092h();
        return this.f170299J;
    }

    @Nullable
    @WorkerThread
    /* JADX INFO: renamed from: s */
    public final String m189007s() {
        this.f170309a.zzl().mo15092h();
        return this.f170313e;
    }

    @WorkerThread
    /* JADX INFO: renamed from: s0 */
    public final void m189008s0(long j) {
        this.f170309a.zzl().mo15092h();
        this.f170306Q |= this.f170308S != j;
        this.f170308S = j;
    }

    @WorkerThread
    /* JADX INFO: renamed from: t */
    public final String m189009t() {
        this.f170309a.zzl().mo15092h();
        return this.f170297H;
    }

    @WorkerThread
    /* JADX INFO: renamed from: t0 */
    public final long m189010t0() {
        this.f170309a.zzl().mo15092h();
        return this.f170322n;
    }

    @Nullable
    @WorkerThread
    /* JADX INFO: renamed from: u */
    public final String m189011u() {
        this.f170309a.zzl().mo15092h();
        return this.f170329u;
    }

    @WorkerThread
    /* JADX INFO: renamed from: u0 */
    public final void m189012u0(long j) {
        this.f170309a.zzl().mo15092h();
        this.f170306Q |= this.f170321m != j;
        this.f170321m = j;
    }

    @Nullable
    @WorkerThread
    /* JADX INFO: renamed from: v */
    public final String m189013v() {
        this.f170309a.zzl().mo15092h();
        return this.f170293D;
    }

    @WorkerThread
    /* JADX INFO: renamed from: v0 */
    public final long m189014v0() {
        this.f170309a.zzl().mo15092h();
        return this.f170327s;
    }

    @Nullable
    @WorkerThread
    /* JADX INFO: renamed from: w */
    public final List<String> m189015w() {
        this.f170309a.zzl().mo15092h();
        return this.f170328t;
    }

    @WorkerThread
    /* JADX INFO: renamed from: w0 */
    public final void m189016w0(long j) {
        this.f170309a.zzl().mo15092h();
        this.f170306Q |= this.f170296G != j;
        this.f170296G = j;
    }

    @WorkerThread
    /* JADX INFO: renamed from: x */
    public final void m189017x() {
        this.f170309a.zzl().mo15092h();
        this.f170306Q = false;
    }

    @WorkerThread
    /* JADX INFO: renamed from: x0 */
    public final long m189018x0() {
        this.f170309a.zzl().mo15092h();
        return this.f170308S;
    }

    @WorkerThread
    /* JADX INFO: renamed from: y */
    public final void m189019y() {
        this.f170309a.zzl().mo15092h();
        long j = this.f170315g + 1;
        if (j > 2147483647L) {
            this.f170309a.zzj().m211417F().m123937b("Bundle index overflow. appId", xww0.m211405p(this.f170310b));
            j = 0;
        }
        this.f170306Q = true;
        this.f170315g = j;
    }

    @WorkerThread
    /* JADX INFO: renamed from: y0 */
    public final void m189020y0(long j) {
        this.f170309a.zzl().mo15092h();
        this.f170306Q |= this.f170317i != j;
        this.f170317i = j;
    }

    @WorkerThread
    /* JADX INFO: renamed from: z */
    public final boolean m189021z() {
        this.f170309a.zzl().mo15092h();
        return this.f170324p;
    }

    @WorkerThread
    /* JADX INFO: renamed from: z0 */
    public final long m189022z0() {
        this.f170309a.zzl().mo15092h();
        return this.f170321m;
    }
}
