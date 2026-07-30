package p153l;

import androidx.annotation.NonNull;
import com.immomo.mediacore.audio.audio_Indicator;
import com.immomo.mediacore.coninf.MRtcAudioHandler;
import com.momo.pipline.MomoInterface.MomoCodec;

/* JADX INFO: loaded from: classes8.dex */
public class e410 extends g410 implements c410 {

    /* JADX INFO: renamed from: B */
    private audio_Indicator f92025B;

    /* JADX INFO: renamed from: C */
    dpl.InterfaceC16599a f92026C;

    /* JADX INFO: renamed from: D */
    private dpl.InterfaceC16599a f92027D;

    /* JADX INFO: renamed from: l.e410$a */
    public class C16699a implements dpl.InterfaceC16599a {
        public C16699a() {
        }

        @Override // p153l.dpl.InterfaceC16599a
        /* JADX INFO: renamed from: C */
        public oxd0 mo109339C(oxd0 oxd0Var) {
            if (e410.this.f92025B != null) {
                e410.this.f92025B.putAudioData(oxd0Var.m169687c());
            }
            if (e410.this.f92027D != null) {
                e410.this.f92027D.mo109339C(oxd0Var);
            }
            dpl.InterfaceC16599a interfaceC16599a = e410.this.f92026C;
            if (interfaceC16599a != null) {
                interfaceC16599a.mo109339C(oxd0Var);
            }
            return e410.this.f102056b.mo109339C(oxd0Var);
        }
    }

    /* JADX INFO: renamed from: l.e410$b */
    public class RunnableC16700b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ uow f92029a;

        public RunnableC16700b(uow uowVar) {
            this.f92029a = uowVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (MomoCodec momoCodec : e410.this.f102063i) {
                if ((momoCodec instanceof grx) && e410.this.mo20703j0() != null) {
                    uow uowVar = this.f92029a;
                    ((grx) momoCodec).setRenderSize(uowVar.f175494m, uowVar.f175496n);
                    momoCodec.mo20656Y(e410.this.mo20703j0(), this.f92029a);
                    e410.this.mo20703j0().m128975B(momoCodec);
                    e410.this.mo20703j0().m128981I(this.f92029a.f180160E0);
                }
            }
            sej.m185545d().m185550f(true);
        }
    }

    /* JADX INFO: renamed from: l.e410$c */
    public class RunnableC16701c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ uow f92031a;

        public RunnableC16701c(uow uowVar) {
            this.f92031a = uowVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e410.this.f102061g != null) {
                rsy rsyVar = e410.this.f102061g;
                uow uowVar = this.f92031a;
                rsyVar.setRenderSize(uowVar.f175510u, uowVar.f175511v);
            }
            for (MomoCodec momoCodec : e410.this.f102063i) {
                if ((momoCodec instanceof grx) && e410.this.mo20703j0() != null) {
                    uow uowVar2 = this.f92031a;
                    ((grx) momoCodec).setRenderSize(uowVar2.f175494m, uowVar2.f175496n);
                    momoCodec.mo20656Y(e410.this.mo20703j0(), this.f92031a);
                    e410.this.mo20703j0().m128975B(momoCodec);
                }
            }
            sej.m185545d().m185550f(true);
        }
    }

    /* JADX INFO: renamed from: l.e410$d */
    public class RunnableC16702d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f92033a;

        public RunnableC16702d(int i) {
            this.f92033a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (MomoCodec momoCodec : e410.this.f102063i) {
                if ((momoCodec instanceof s410) && e410.this.mo20703j0() != null) {
                    ((grx) momoCodec).mo131937P2(this.f92033a);
                }
            }
            sej.m185545d().m185550f(true);
        }
    }

    public e410(uow uowVar) {
        super(uowVar);
        audio_Indicator audio_indicator = new audio_Indicator();
        this.f92025B = audio_indicator;
        audio_indicator.setUserID(uowVar.f180157B0);
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: C0 */
    public synchronized void mo20676C0(dpl dplVar) {
        boolean zMo20924F;
        if (dplVar == null) {
            try {
                this.f102058d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        dpl dplVar2 = this.f102058d;
        if (dplVar != dplVar2) {
            if (dplVar2 != null) {
                zMo20924F = dplVar2.mo20924F();
                this.f102058d.mo20986X();
            } else {
                zMo20924F = false;
            }
            this.f102058d = dplVar;
            dplVar.mo20941L(new C16699a());
            if (zMo20924F) {
                this.f102058d.mo20934I1();
            }
        }
    }

    @Override // p153l.g410
    /* JADX INFO: renamed from: E */
    public wzl mo119337E(String str) {
        k410 k410Var = new k410(str);
        this.f102064j.size();
        mo20698g0(k410Var);
        mo20674B0(k410Var);
        mo20699h0(k410Var);
        return k410Var;
    }

    @Override // p153l.c410
    /* JADX INFO: renamed from: L */
    public synchronized void mo107817L(dpl.InterfaceC16599a interfaceC16599a) {
        this.f92027D = interfaceC16599a;
    }

    @Override // p153l.g410, com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: V */
    public void mo20686V(@NonNull z5m z5mVar) {
        this.f92025B.setUserID(this.f102062h.f180157B0);
        super.mo20686V(z5mVar);
    }

    @Override // p153l.c410
    /* JADX INFO: renamed from: a */
    public void mo107818a(boolean z) {
        audio_Indicator audio_indicator = this.f92025B;
        if (audio_indicator != null) {
            audio_indicator.muteAudio(z);
        }
    }

    @Override // p153l.c410
    /* JADX INFO: renamed from: b */
    public void mo107819b(uow uowVar) {
        if (this.f102056b == null || mo20703j0() == null) {
            return;
        }
        this.f102056b.m165941W(new RunnableC16701c(uowVar), mo20703j0().m128994m());
    }

    @Override // p153l.c410
    /* JADX INFO: renamed from: c */
    public void mo107820c(uow uowVar) {
        if (this.f102056b == null || mo20703j0() == null) {
            return;
        }
        this.f102056b.m165941W(new RunnableC16700b(uowVar), mo20703j0().m128994m());
    }

    @Override // p153l.c410
    /* JADX INFO: renamed from: d */
    public void mo107821d(MRtcAudioHandler mRtcAudioHandler) {
        audio_Indicator audio_indicator = this.f92025B;
        if (audio_indicator != null) {
            audio_indicator.addMRtcAudioHandler(mRtcAudioHandler);
        }
    }

    @Override // p153l.c410
    /* JADX INFO: renamed from: e */
    public void mo107822e(int i) {
        if (this.f102056b == null || mo20703j0() == null) {
            return;
        }
        this.f102056b.m165941W(new RunnableC16702d(i), mo20703j0().m128994m());
    }

    @Override // p153l.g410, com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: n0 */
    public void mo20708n0(z5m z5mVar) {
        this.f92025B.setUserID(this.f102062h.f180157B0);
        super.mo20708n0(z5mVar);
    }

    @Override // p153l.g410, com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: p */
    public void mo20711p(String str, int i) {
        super.mo20711p(str, i);
    }

    @Override // p153l.g410, com.momo.pipline.MomoInterface.MomoPipeline
    public void release() {
        super.release();
        audio_Indicator audio_indicator = this.f92025B;
        if (audio_indicator != null) {
            audio_indicator.release();
            this.f92025B = null;
        }
    }

    @Override // p153l.c410
    /* JADX INFO: renamed from: y */
    public void mo107823y(int i, int i2) {
        audio_Indicator audio_indicator = this.f92025B;
        if (audio_indicator != null) {
            audio_indicator.enableAudioVolumeIndication(i, i2);
        }
    }
}
