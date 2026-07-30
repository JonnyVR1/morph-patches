package p149l;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class bkr0 implements j5r0 {

    /* JADX INFO: renamed from: l */
    public static final c6r0 f76125l = new c6r0() { // from class: l.zjr0
        @Override // p149l.c6r0
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ j5r0[] mo95449a(Uri uri, Map map) {
            int i = b6r0.f73876a;
            return new j5r0[]{new bkr0()};
        }
    };

    /* JADX INFO: renamed from: e */
    public boolean f76130e;

    /* JADX INFO: renamed from: f */
    public boolean f76131f;

    /* JADX INFO: renamed from: g */
    public boolean f76132g;

    /* JADX INFO: renamed from: h */
    public long f76133h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public xjr0 f76134i;

    /* JADX INFO: renamed from: j */
    public m5r0 f76135j;

    /* JADX INFO: renamed from: k */
    public boolean f76136k;

    /* JADX INFO: renamed from: a */
    public final hew0 f76126a = new hew0(0);

    /* JADX INFO: renamed from: c */
    public final v6w0 f76128c = new v6w0(4096);

    /* JADX INFO: renamed from: b */
    public final SparseArray f76127b = new SparseArray();

    /* JADX INFO: renamed from: d */
    public final yjr0 f76129d = new yjr0();

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    @Override // p149l.j5r0
    /* JADX INFO: renamed from: c */
    public final void mo100820c(long j, long j2) {
        hew0 hew0Var = this.f76126a;
        if (hew0Var.m130708f() != -9223372036854775807L) {
            long jM130706d = hew0Var.m130706d();
            if (jM130706d != -9223372036854775807L && jM130706d != 0 && jM130706d != j2) {
                hew0Var.m130709i(j2);
            }
        } else {
            hew0Var.m130709i(j2);
        }
        xjr0 xjr0Var = this.f76134i;
        if (xjr0Var != null) {
            xjr0Var.m197059d(j2);
        }
        for (int i = 0; i < this.f76127b.size(); i++) {
            ((akr0) this.f76127b.valueAt(i)).m97177b();
        }
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: d */
    public final boolean mo100821d(k5r0 k5r0Var) throws IOException {
        byte[] bArr = new byte[14];
        z4r0 z4r0Var = (z4r0) k5r0Var;
        z4r0Var.mo140051c(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        z4r0Var.m217118j(bArr[13] & 7, false);
        z4r0Var.mo140051c(bArr, 0, 3, false);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }

    @Override // p149l.j5r0
    /* JADX INFO: renamed from: e */
    public final void mo100822e(m5r0 m5r0Var) {
        this.f76135j = m5r0Var;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0146  */
    @Override // p149l.j5r0
    /* JADX INFO: renamed from: f */
    public final int mo100823f(k5r0 k5r0Var, s6r0 s6r0Var) throws IOException {
        sir0 fjr0Var;
        f5v0.m119531b(this.f76135j);
        long jZzd = k5r0Var.zzd();
        if (jZzd != -1) {
            yjr0 yjr0Var = this.f76129d;
            if (!yjr0Var.m215095e()) {
                return yjr0Var.m215092a(k5r0Var, s6r0Var);
            }
        }
        if (!this.f76136k) {
            this.f76136k = true;
            yjr0 yjr0Var2 = this.f76129d;
            if (yjr0Var2.m215093b() != -9223372036854775807L) {
                xjr0 xjr0Var = new xjr0(yjr0Var2.m215094d(), yjr0Var2.m215093b(), jZzd);
                this.f76134i = xjr0Var;
                this.f76135j.mo129455j(xjr0Var.m197057b());
            } else {
                this.f76135j.mo129455j(new u6r0(yjr0Var2.m215093b(), 0L));
            }
        }
        xjr0 xjr0Var2 = this.f76134i;
        if (xjr0Var2 != null && xjr0Var2.m197060e()) {
            return xjr0Var2.m197056a(k5r0Var, s6r0Var);
        }
        k5r0Var.zzj();
        long jZze = jZzd != -1 ? jZzd - k5r0Var.zze() : -1L;
        if ((jZze != -1 && jZze < 4) || !k5r0Var.mo140051c(this.f76128c.m197264m(), 0, 4, true)) {
            return -1;
        }
        this.f76128c.m197262k(0);
        int iM197273v = this.f76128c.m197273v();
        if (iM197273v == 441) {
            return -1;
        }
        if (iM197273v == 442) {
            z4r0 z4r0Var = (z4r0) k5r0Var;
            z4r0Var.mo140051c(this.f76128c.m197264m(), 0, 10, false);
            this.f76128c.m197262k(9);
            z4r0Var.m217119k((this.f76128c.m197238B() & 7) + 14, false);
            return 0;
        }
        if (iM197273v == 443) {
            z4r0 z4r0Var2 = (z4r0) k5r0Var;
            z4r0Var2.mo140051c(this.f76128c.m197264m(), 0, 2, false);
            this.f76128c.m197262k(0);
            z4r0Var2.m217119k(this.f76128c.m197242F() + 6, false);
            return 0;
        }
        if ((iM197273v >> 8) != 1) {
            ((z4r0) k5r0Var).m217119k(1, false);
            return 0;
        }
        int i = iM197273v & 255;
        akr0 akr0Var = (akr0) this.f76127b.get(i);
        if (!this.f76130e) {
            if (akr0Var == null) {
                sir0 sir0Var = null;
                if (i == 189) {
                    fjr0Var = new iir0(null);
                    this.f76131f = true;
                    this.f76133h = k5r0Var.zzf();
                } else if ((iM197273v & 224) == 192) {
                    fjr0Var = new rjr0(null);
                    this.f76131f = true;
                    this.f76133h = k5r0Var.zzf();
                } else if ((iM197273v & 240) == 224) {
                    fjr0Var = new fjr0(null);
                    this.f76132g = true;
                    this.f76133h = k5r0Var.zzf();
                } else if (sir0Var != null) {
                    sir0Var.mo121628d(this.f76135j, new alr0(Integer.MIN_VALUE, i, 256));
                    akr0Var = new akr0(sir0Var, this.f76126a);
                    this.f76127b.put(i, akr0Var);
                }
                sir0Var = fjr0Var;
                if (sir0Var != null) {
                    sir0Var.mo121628d(this.f76135j, new alr0(Integer.MIN_VALUE, i, 256));
                    akr0Var = new akr0(sir0Var, this.f76126a);
                    this.f76127b.put(i, akr0Var);
                }
            }
            boolean z = this.f76131f;
            long j = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            if (z && this.f76132g) {
                j = this.f76133h + 8192;
            }
            if (k5r0Var.zzf() > j) {
                this.f76130e = true;
                this.f76135j.mo129453c();
            }
        }
        z4r0 z4r0Var3 = (z4r0) k5r0Var;
        z4r0Var3.mo140051c(this.f76128c.m197264m(), 0, 2, false);
        this.f76128c.m197262k(0);
        int iM197242F = this.f76128c.m197242F() + 6;
        if (akr0Var == null) {
            z4r0Var3.m217119k(iM197242F, false);
        } else {
            this.f76128c.m197259h(iM197242F);
            z4r0Var3.mo140050b(this.f76128c.m197264m(), 0, iM197242F, false);
            this.f76128c.m197262k(6);
            akr0Var.m97176a(this.f76128c);
            v6w0 v6w0Var = this.f76128c;
            v6w0Var.m197261j(v6w0Var.m197269r());
        }
        return 0;
    }
}
