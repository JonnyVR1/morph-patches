package p007l;

import l.eyx;
import l.hu00;
import l.ii70;
import l.mpd0;
import l.sml;
import l.ulw;
import l.vlw;
import l.ya1;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class xn0 implements sml {

    /* JADX INFO: renamed from: a */
    sml.a f5350a;

    /* JADX INFO: renamed from: c */
    private vlw f5352c;

    /* JADX INFO: renamed from: e */
    private hu00.a f5354e;

    /* JADX INFO: renamed from: b */
    private jc1 f5351b = null;

    /* JADX INFO: renamed from: d */
    private boolean f5353d = false;

    /* JADX INFO: renamed from: l.xn0$b */
    public class C0780b implements ya1 {
        private C0780b() {
        }

        /* JADX INFO: renamed from: C */
        public mpd0 m11844C(mpd0 mpd0Var) {
            sml.a aVar = xn0.this.f5350a;
            return aVar != null ? aVar.C(mpd0Var) : mpd0Var;
        }
    }

    public xn0(vlw vlwVar, hu00.a aVar) {
        this.f5352c = vlwVar;
        this.f5354e = aVar;
    }

    /* JADX INFO: renamed from: F */
    public boolean m11839F() {
        return this.f5351b != null;
    }

    /* JADX INFO: renamed from: I1 */
    public synchronized void m11840I1() {
        try {
            if (this.f5351b == null) {
                ii70.d().a("Pipeline_Normal_pip->PIPLINE", " startAudioRecord");
                vlw vlwVar = this.f5352c;
                int i = ((ulw) vlwVar).P;
                int i2 = ((ulw) vlwVar).R;
                int i3 = ((ulw) vlwVar).S;
                jc1 jc1Var = new jc1(i, i2, 2048);
                this.f5351b = jc1Var;
                jc1Var.m9513z2(i);
                this.f5351b.m9509A2(this.f5354e);
                boolean zM9512y2 = this.f5351b.m9512y2("", i, 16, i2, 2048);
                hu00.a aVar = this.f5354e;
                if (aVar != null && !zM9512y2) {
                    aVar.g(37120, 0, 0, (Object) null);
                }
                this.f5351b.m9859R(new C0780b());
                this.f5351b.m9510B2();
                eyx.c().g(new Object[]{"startAudioRecord"});
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: L */
    public void m11841L(sml.a aVar) {
        this.f5350a = aVar;
    }

    /* JADX INFO: renamed from: X */
    public synchronized void m11842X() {
        if (this.f5351b != null) {
            ii70.d().a("Pipeline_Normal_pip->PIPLINE", " stopAudioRecord");
            this.f5351b.m9511C2();
            this.f5351b.mo390p2();
            this.f5351b = null;
            this.f5350a = null;
            eyx.c().g(new Object[]{"stopAudioRecord"});
        }
    }

    /* JADX INFO: renamed from: a */
    public void m11843a(vlw vlwVar) {
        this.f5352c = vlwVar;
    }
}
