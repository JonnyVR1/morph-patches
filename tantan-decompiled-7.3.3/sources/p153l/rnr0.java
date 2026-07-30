package p153l;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzcc;
import java.io.IOException;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes6.dex */
public final class rnr0 implements per0 {

    /* JADX INFO: renamed from: d */
    public static final ifr0 f164097d = new ifr0() { // from class: l.qnr0
        @Override // p153l.ifr0
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ per0[] mo99028a(Uri uri, Map map) {
            int i = hfr0.f109341a;
            return new per0[]{new rnr0()};
        }
    };

    /* JADX INFO: renamed from: a */
    public ser0 f164098a;

    /* JADX INFO: renamed from: b */
    public lor0 f164099b;

    /* JADX INFO: renamed from: c */
    public boolean f164100c;

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    /* JADX INFO: renamed from: a */
    public final boolean m182321a(qer0 qer0Var) throws IOException {
        tnr0 tnr0Var = new tnr0();
        if (tnr0Var.m191962b(qer0Var, true) && (tnr0Var.f175309a & 2) == 2) {
            int iMin = Math.min(tnr0Var.f175313e, 8);
            bgw0 bgw0Var = new bgw0(iMin);
            ((fer0) qer0Var).mo125313c(bgw0Var.m104271m(), 0, iMin, false);
            bgw0Var.m104269k(0);
            if (bgw0Var.m104275q() >= 5 && bgw0Var.m104245B() == 127 && bgw0Var.m104253J() == 1179402563) {
                this.f164099b = new pnr0();
            } else {
                bgw0Var.m104269k(0);
                try {
                    if (ygr0.m215876d(1, bgw0Var, true)) {
                        this.f164099b = new nor0();
                    } else {
                        bgw0Var.m104269k(0);
                        if (hor0.m136455j(bgw0Var)) {
                            this.f164099b = new hor0();
                        }
                    }
                } catch (zzcc unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: c */
    public final void mo97906c(long j, long j2) {
        lor0 lor0Var = this.f164099b;
        if (lor0Var != null) {
            lor0Var.m155101i(j, j2);
        }
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: d */
    public final boolean mo97907d(qer0 qer0Var) throws IOException {
        try {
            return m182321a(qer0Var);
        } catch (zzcc unused) {
            return false;
        }
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: e */
    public final void mo97908e(ser0 ser0Var) {
        this.f164098a = ser0Var;
    }

    @Override // p153l.per0
    /* JADX INFO: renamed from: f */
    public final int mo97909f(qer0 qer0Var, yfr0 yfr0Var) throws IOException {
        lev0.m153954b(this.f164098a);
        if (this.f164099b == null) {
            if (!m182321a(qer0Var)) {
                throw zzcc.zza("Failed to determine bitstream type", null);
            }
            qer0Var.zzj();
        }
        if (!this.f164100c) {
            sgr0 sgr0VarMo101550i = this.f164098a.mo101550i(0, 1);
            this.f164098a.mo101544c();
            this.f164099b.m155099g(this.f164098a, sgr0VarMo101550i);
            this.f164100c = true;
        }
        return this.f164099b.m155096d(qer0Var, yfr0Var);
    }
}
