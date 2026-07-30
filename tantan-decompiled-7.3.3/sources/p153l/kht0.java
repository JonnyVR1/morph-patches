package p153l;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzfwz;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class kht0 extends ugt0 implements btx0 {

    /* JADX INFO: renamed from: d */
    public String f126908d;

    /* JADX INFO: renamed from: e */
    public final aft0 f126909e;

    /* JADX INFO: renamed from: f */
    public boolean f126910f;

    /* JADX INFO: renamed from: g */
    public final jht0 f126911g;

    /* JADX INFO: renamed from: h */
    public final fgt0 f126912h;

    /* JADX INFO: renamed from: i */
    public ByteBuffer f126913i;

    /* JADX INFO: renamed from: j */
    public boolean f126914j;

    /* JADX INFO: renamed from: k */
    public final Object f126915k;

    /* JADX INFO: renamed from: l */
    public final String f126916l;

    /* JADX INFO: renamed from: m */
    public final int f126917m;

    /* JADX INFO: renamed from: n */
    public boolean f126918n;

    public kht0(bft0 bft0Var, aft0 aft0Var) {
        super(bft0Var);
        this.f126909e = aft0Var;
        this.f126911g = new jht0();
        this.f126912h = new fgt0();
        this.f126915k = new Object();
        this.f126916l = (String) zzfwz.zzd(bft0Var != null ? bft0Var.zzr() : null).zzb("");
        this.f126917m = bft0Var != null ? bft0Var.zzf() : 0;
    }

    /* JADX INFO: renamed from: A */
    public static final String m149823A(String str) {
        return "cache:".concat(String.valueOf(obt0.m167038g(str)));
    }

    /* JADX INFO: renamed from: b */
    private final void m149824b() {
        int iM144933a = (int) this.f126911g.m144933a();
        int iM125532a = (int) this.f126912h.m125532a(this.f126913i);
        int iPosition = this.f126913i.position();
        int iRound = Math.round(iM125532a * (iPosition / iM144933a));
        int iM185572O = set0.m185572O();
        int iM185573Q = set0.m185573Q();
        String str = this.f126908d;
        m195945o(str, m149823A(str), iPosition, iM144933a, iRound, iM125532a, iRound > 0, iM185572O, iM185573Q);
    }

    @Override // p153l.ugt0
    /* JADX INFO: renamed from: g */
    public final void mo140035g() {
        this.f126910f = true;
    }

    @Override // p153l.btx0
    /* JADX INFO: renamed from: i */
    public final void mo106410i(fex0 fex0Var, akx0 akx0Var, boolean z) {
        if (fex0Var instanceof wqx0) {
            this.f126911g.m144934b((wqx0) fex0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:? -> B:23:0x00cf). Please report as a decompilation issue!!! */
    @Override // p153l.ugt0
    /* JADX INFO: renamed from: u */
    public final boolean mo140036u(String str) throws Throwable {
        String str2;
        this.f126908d = str;
        String str3 = "error";
        String strM149823A = m149823A(str);
        int i = 0;
        try {
            zmx0 zmx0Var = new zmx0();
            zmx0Var.m220530e(this.f178932b);
            zmx0Var.m220527b(this.f126909e.f71055d);
            zmx0Var.m220528c(this.f126909e.f71057f);
            zmx0Var.m220526a(true);
            zmx0Var.m220529d(this);
            fex0 fex0VarZza = zmx0Var.zza();
            if (this.f126909e.f71061j) {
                fex0VarZza = new dgt0(this.f178931a, fex0VarZza, this.f126916l, this.f126917m, null, null);
            }
            fex0VarZza.mo12782e(new akx0(Uri.parse(str)));
            bft0 bft0Var = (bft0) this.f178933c.get();
            if (bft0Var != null) {
                bft0Var.mo13741g(strM149823A, this);
            }
            Clock clockM106918b = bxy0.m106918b();
            long jCurrentTimeMillis = clockM106918b.currentTimeMillis();
            long jLongValue = ((Long) jas0.m144075c().m176505a(sgs0.f168533y)).longValue();
            long jLongValue2 = ((Long) jas0.m144075c().m176505a(sgs0.f168521x)).longValue();
            this.f126913i = ByteBuffer.allocate(this.f126909e.f71054c);
            int i2 = 8192;
            byte[] bArr = new byte[8192];
            long j = jCurrentTimeMillis;
            while (true) {
                int iMo12781a = fex0VarZza.mo12781a(bArr, i, Math.min(this.f126913i.remaining(), i2));
                if (iMo12781a == -1) {
                    this.f126918n = true;
                    m195944m(str, strM149823A, (int) this.f126912h.m125532a(this.f126913i));
                    break;
                }
                synchronized (this.f126915k) {
                    try {
                        if (!this.f126910f) {
                            try {
                                this.f126913i.put(bArr, 0, iMo12781a);
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                        try {
                            if (this.f126913i.remaining() <= 0) {
                                m149824b();
                                break;
                            }
                            str2 = this.f126910f;
                            try {
                                if (str2 != 0) {
                                    throw new IOException("Precache abort at " + this.f126913i.limit() + " bytes");
                                }
                                long jCurrentTimeMillis2 = clockM106918b.currentTimeMillis();
                                if (jCurrentTimeMillis2 - j >= jLongValue) {
                                    m149824b();
                                    j = jCurrentTimeMillis2;
                                }
                                if (jCurrentTimeMillis2 - jCurrentTimeMillis > 1000 * jLongValue2) {
                                    throw new IOException("Timeout exceeded. Limit: " + jLongValue2 + " sec");
                                }
                                str3 = str3;
                                i = 0;
                                i2 = 8192;
                            } catch (Exception e) {
                                e = e;
                                String str4 = e.getClass().getCanonicalName() + ":" + e.getMessage();
                                dct0.m115298g("Failed to preload url " + str + " Exception: " + str4);
                                m195942h(str, strM149823A, str2, str4);
                                return false;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str2 = str3;
                            String str5 = e.getClass().getCanonicalName() + ":" + e.getMessage();
                            dct0.m115298g("Failed to preload url " + str + " Exception: " + str5);
                            m195942h(str, strM149823A, str2, str5);
                            return false;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            }
            return true;
        } catch (Exception e3) {
            e = e3;
            str3 = str3;
        }
    }

    /* JADX INFO: renamed from: x */
    public final String m149825x() {
        return this.f126908d;
    }

    /* JADX INFO: renamed from: y */
    public final ByteBuffer m149826y() {
        synchronized (this.f126915k) {
            try {
                ByteBuffer byteBuffer = this.f126913i;
                if (byteBuffer != null && !this.f126914j) {
                    byteBuffer.flip();
                    this.f126914j = true;
                }
                this.f126910f = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f126913i;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m149827z() {
        return this.f126918n;
    }

    @Override // p153l.btx0
    /* JADX INFO: renamed from: k */
    public final void mo106411k(fex0 fex0Var, akx0 akx0Var, boolean z) {
    }

    @Override // p153l.btx0
    /* JADX INFO: renamed from: l */
    public final void mo106412l(fex0 fex0Var, akx0 akx0Var, boolean z) {
    }

    @Override // p153l.btx0
    /* JADX INFO: renamed from: n */
    public final void mo106413n(fex0 fex0Var, akx0 akx0Var, boolean z, int i) {
    }
}
