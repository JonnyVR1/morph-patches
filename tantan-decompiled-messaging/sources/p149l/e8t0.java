package p149l;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzfwz;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public final class e8t0 extends o7t0 implements vjx0 {

    /* JADX INFO: renamed from: d */
    public String f89865d;

    /* JADX INFO: renamed from: e */
    public final u5t0 f89866e;

    /* JADX INFO: renamed from: f */
    public boolean f89867f;

    /* JADX INFO: renamed from: g */
    public final d8t0 f89868g;

    /* JADX INFO: renamed from: h */
    public final z6t0 f89869h;

    /* JADX INFO: renamed from: i */
    public ByteBuffer f89870i;

    /* JADX INFO: renamed from: j */
    public boolean f89871j;

    /* JADX INFO: renamed from: k */
    public final Object f89872k;

    /* JADX INFO: renamed from: l */
    public final String f89873l;

    /* JADX INFO: renamed from: m */
    public final int f89874m;

    /* JADX INFO: renamed from: n */
    public boolean f89875n;

    public e8t0(v5t0 v5t0Var, u5t0 u5t0Var) {
        super(v5t0Var);
        this.f89866e = u5t0Var;
        this.f89868g = new d8t0();
        this.f89869h = new z6t0();
        this.f89872k = new Object();
        this.f89873l = (String) zzfwz.zzd(v5t0Var != null ? v5t0Var.zzr() : null).zzb("");
        this.f89874m = v5t0Var != null ? v5t0Var.zzf() : 0;
    }

    /* JADX INFO: renamed from: A */
    public static final String m115284A(String str) {
        return "cache:".concat(String.valueOf(i2t0.m134085g(str)));
    }

    /* JADX INFO: renamed from: b */
    private final void m115285b() {
        int iM110392a = (int) this.f89868g.m110392a();
        int iM217420a = (int) this.f89869h.m217420a(this.f89870i);
        int iPosition = this.f89870i.position();
        int iRound = Math.round(iM217420a * (iPosition / iM110392a));
        int iM153149O = m5t0.m153149O();
        int iM153150Q = m5t0.m153150Q();
        String str = this.f89865d;
        m163066o(str, m115284A(str), iPosition, iM110392a, iRound, iM217420a, iRound > 0, iM153149O, iM153150Q);
    }

    @Override // p149l.o7t0
    /* JADX INFO: renamed from: g */
    public final void mo105821g() {
        this.f89867f = true;
    }

    @Override // p149l.vjx0
    /* JADX INFO: renamed from: i */
    public final void mo115286i(z4x0 z4x0Var, uax0 uax0Var, boolean z) {
        if (z4x0Var instanceof qhx0) {
            this.f89868g.m110393b((qhx0) z4x0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:? -> B:23:0x00cf). Please report as a decompilation issue!!! */
    @Override // p149l.o7t0
    /* JADX INFO: renamed from: u */
    public final boolean mo105822u(String str) throws Throwable {
        String str2;
        this.f89865d = str;
        String str3 = "error";
        String strM115284A = m115284A(str);
        int i = 0;
        try {
            tdx0 tdx0Var = new tdx0();
            tdx0Var.m188468e(this.f142542b);
            tdx0Var.m188465b(this.f89866e.f174760d);
            tdx0Var.m188466c(this.f89866e.f174762f);
            tdx0Var.m188464a(true);
            tdx0Var.m188467d(this);
            z4x0 z4x0VarZza = tdx0Var.zza();
            if (this.f89866e.f174766j) {
                z4x0VarZza = new x6t0(this.f142541a, z4x0VarZza, this.f89873l, this.f89874m, null, null);
            }
            z4x0VarZza.mo12728e(new uax0(Uri.parse(str)));
            v5t0 v5t0Var = (v5t0) this.f142543c.get();
            if (v5t0Var != null) {
                v5t0Var.mo13687g(strM115284A, this);
            }
            Clock clockM199064b = vny0.m199064b();
            long jCurrentTimeMillis = clockM199064b.currentTimeMillis();
            long jLongValue = ((Long) d1s0.m109677c().m144697a(m7s0.f132462y)).longValue();
            long jLongValue2 = ((Long) d1s0.m109677c().m144697a(m7s0.f132450x)).longValue();
            this.f89870i = ByteBuffer.allocate(this.f89866e.f174759c);
            int i2 = 8192;
            byte[] bArr = new byte[8192];
            long j = jCurrentTimeMillis;
            while (true) {
                int iMo12727a = z4x0VarZza.mo12727a(bArr, i, Math.min(this.f89870i.remaining(), i2));
                if (iMo12727a == -1) {
                    this.f89875n = true;
                    m163065m(str, strM115284A, (int) this.f89869h.m217420a(this.f89870i));
                    break;
                }
                synchronized (this.f89872k) {
                    try {
                        if (!this.f89867f) {
                            try {
                                this.f89870i.put(bArr, 0, iMo12727a);
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                        try {
                            if (this.f89870i.remaining() <= 0) {
                                m115285b();
                                break;
                            }
                            str2 = this.f89867f;
                            try {
                                if (str2 != 0) {
                                    throw new IOException("Precache abort at " + this.f89870i.limit() + " bytes");
                                }
                                long jCurrentTimeMillis2 = clockM199064b.currentTimeMillis();
                                if (jCurrentTimeMillis2 - j >= jLongValue) {
                                    m115285b();
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
                                x2t0.m206869g("Failed to preload url " + str + " Exception: " + str4);
                                m163063h(str, strM115284A, str2, str4);
                                return false;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str2 = str3;
                            String str5 = e.getClass().getCanonicalName() + ":" + e.getMessage();
                            x2t0.m206869g("Failed to preload url " + str + " Exception: " + str5);
                            m163063h(str, strM115284A, str2, str5);
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
    public final String m115290x() {
        return this.f89865d;
    }

    /* JADX INFO: renamed from: y */
    public final ByteBuffer m115291y() {
        synchronized (this.f89872k) {
            try {
                ByteBuffer byteBuffer = this.f89870i;
                if (byteBuffer != null && !this.f89871j) {
                    byteBuffer.flip();
                    this.f89871j = true;
                }
                this.f89867f = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f89870i;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m115292z() {
        return this.f89875n;
    }

    @Override // p149l.vjx0
    /* JADX INFO: renamed from: k */
    public final void mo115287k(z4x0 z4x0Var, uax0 uax0Var, boolean z) {
    }

    @Override // p149l.vjx0
    /* JADX INFO: renamed from: l */
    public final void mo115288l(z4x0 z4x0Var, uax0 uax0Var, boolean z) {
    }

    @Override // p149l.vjx0
    /* JADX INFO: renamed from: n */
    public final void mo115289n(z4x0 z4x0Var, uax0 uax0Var, boolean z, int i) {
    }
}
