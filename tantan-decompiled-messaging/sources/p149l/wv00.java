package p149l;

import androidx.annotation.NonNull;
import com.immomo.mediacore.audio.audio_Indicator;
import com.immomo.mediacore.coninf.MRtcAudioHandler;
import com.momo.pipline.MomoInterface.MomoCodec;

/* JADX INFO: loaded from: classes7.dex */
public class wv00 extends yv00 implements uv00 {

    /* JADX INFO: renamed from: B */
    private audio_Indicator f188200B;

    /* JADX INFO: renamed from: C */
    sml.InterfaceC19992a f188201C;

    /* JADX INFO: renamed from: D */
    private sml.InterfaceC19992a f188202D;

    /* JADX INFO: renamed from: l.wv00$a */
    public class C20967a implements sml.InterfaceC19992a {
        public C20967a() {
        }

        @Override // p149l.sml.InterfaceC19992a
        /* JADX INFO: renamed from: C */
        public mpd0 mo128315C(mpd0 mpd0Var) {
            if (wv00.this.f188200B != null) {
                wv00.this.f188200B.putAudioData(mpd0Var.m155800c());
            }
            if (wv00.this.f188202D != null) {
                wv00.this.f188202D.mo128315C(mpd0Var);
            }
            sml.InterfaceC19992a interfaceC19992a = wv00.this.f188201C;
            if (interfaceC19992a != null) {
                interfaceC19992a.mo128315C(mpd0Var);
            }
            return wv00.this.f200152b.mo128315C(mpd0Var);
        }
    }

    /* JADX INFO: renamed from: l.wv00$b */
    public class RunnableC20968b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ vlw f188204a;

        public RunnableC20968b(vlw vlwVar) {
            this.f188204a = vlwVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (MomoCodec momoCodec : wv00.this.f200159i) {
                if ((momoCodec instanceof jix) && wv00.this.mo19704j0() != null) {
                    vlw vlwVar = this.f188204a;
                    ((jix) momoCodec).setRenderSize(vlwVar.f177152m, vlwVar.f177154n);
                    momoCodec.mo19657Y(wv00.this.mo19704j0(), this.f188204a);
                    wv00.this.mo19704j0().m216260B(momoCodec);
                    wv00.this.mo19704j0().m216266I(this.f188204a.f182016E0);
                }
            }
            ybj.m213953d().m213958f(true);
        }
    }

    /* JADX INFO: renamed from: l.wv00$c */
    public class RunnableC20969c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ vlw f188206a;

        public RunnableC20969c(vlw vlwVar) {
            this.f188206a = vlwVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (wv00.this.f200157g != null) {
                ujy ujyVar = wv00.this.f200157g;
                vlw vlwVar = this.f188206a;
                ujyVar.setRenderSize(vlwVar.f177168u, vlwVar.f177169v);
            }
            for (MomoCodec momoCodec : wv00.this.f200159i) {
                if ((momoCodec instanceof jix) && wv00.this.mo19704j0() != null) {
                    vlw vlwVar2 = this.f188206a;
                    ((jix) momoCodec).setRenderSize(vlwVar2.f177152m, vlwVar2.f177154n);
                    momoCodec.mo19657Y(wv00.this.mo19704j0(), this.f188206a);
                    wv00.this.mo19704j0().m216260B(momoCodec);
                }
            }
            ybj.m213953d().m213958f(true);
        }
    }

    /* JADX INFO: renamed from: l.wv00$d */
    public class RunnableC20970d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f188208a;

        public RunnableC20970d(int i) {
            this.f188208a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (MomoCodec momoCodec : wv00.this.f200159i) {
                if ((momoCodec instanceof kw00) && wv00.this.mo19704j0() != null) {
                    ((jix) momoCodec).mo141704P2(this.f188208a);
                }
            }
            ybj.m213953d().m213958f(true);
        }
    }

    public wv00(vlw vlwVar) {
        super(vlwVar);
        audio_Indicator audio_indicator = new audio_Indicator();
        this.f188200B = audio_indicator;
        audio_indicator.setUserID(vlwVar.f182013B0);
    }

    @Override // com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: C0 */
    public synchronized void mo19677C0(sml smlVar) {
        boolean zMo19925F;
        if (smlVar == null) {
            try {
                this.f200154d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        sml smlVar2 = this.f200154d;
        if (smlVar != smlVar2) {
            if (smlVar2 != null) {
                zMo19925F = smlVar2.mo19925F();
                this.f200154d.mo19987X();
            } else {
                zMo19925F = false;
            }
            this.f200154d = smlVar;
            smlVar.mo19942L(new C20967a());
            if (zMo19925F) {
                this.f200154d.mo19935I1();
            }
        }
    }

    @Override // p149l.yv00
    /* JADX INFO: renamed from: E */
    public dxl mo205713E(String str) {
        cw00 cw00Var = new cw00(str);
        this.f200160j.size();
        mo19699g0(cw00Var);
        mo19675B0(cw00Var);
        mo19700h0(cw00Var);
        return cw00Var;
    }

    @Override // p149l.uv00
    /* JADX INFO: renamed from: L */
    public synchronized void mo196047L(sml.InterfaceC19992a interfaceC19992a) {
        this.f188202D = interfaceC19992a;
    }

    @Override // p149l.yv00, com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: V */
    public void mo19687V(@NonNull i3m i3mVar) {
        this.f188200B.setUserID(this.f200158h.f182013B0);
        super.mo19687V(i3mVar);
    }

    @Override // p149l.uv00
    /* JADX INFO: renamed from: a */
    public void mo196048a(boolean z) {
        audio_Indicator audio_indicator = this.f188200B;
        if (audio_indicator != null) {
            audio_indicator.muteAudio(z);
        }
    }

    @Override // p149l.uv00
    /* JADX INFO: renamed from: b */
    public void mo196049b(vlw vlwVar) {
        if (this.f200152b == null || mo19704j0() == null) {
            return;
        }
        this.f200152b.m128334W(new RunnableC20969c(vlwVar), mo19704j0().m216279m());
    }

    @Override // p149l.uv00
    /* JADX INFO: renamed from: c */
    public void mo196050c(vlw vlwVar) {
        if (this.f200152b == null || mo19704j0() == null) {
            return;
        }
        this.f200152b.m128334W(new RunnableC20968b(vlwVar), mo19704j0().m216279m());
    }

    @Override // p149l.uv00
    /* JADX INFO: renamed from: d */
    public void mo196051d(MRtcAudioHandler mRtcAudioHandler) {
        audio_Indicator audio_indicator = this.f188200B;
        if (audio_indicator != null) {
            audio_indicator.addMRtcAudioHandler(mRtcAudioHandler);
        }
    }

    @Override // p149l.uv00
    /* JADX INFO: renamed from: e */
    public void mo196052e(int i) {
        if (this.f200152b == null || mo19704j0() == null) {
            return;
        }
        this.f200152b.m128334W(new RunnableC20970d(i), mo19704j0().m216279m());
    }

    @Override // p149l.yv00, com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: n0 */
    public void mo19709n0(i3m i3mVar) {
        this.f188200B.setUserID(this.f200158h.f182013B0);
        super.mo19709n0(i3mVar);
    }

    @Override // p149l.yv00, com.momo.pipline.MomoInterface.MomoPipeline
    /* JADX INFO: renamed from: p */
    public void mo19712p(String str, int i) {
        super.mo19712p(str, i);
    }

    @Override // p149l.yv00, com.momo.pipline.MomoInterface.MomoPipeline
    public void release() {
        super.release();
        audio_Indicator audio_indicator = this.f188200B;
        if (audio_indicator != null) {
            audio_indicator.release();
            this.f188200B = null;
        }
    }

    @Override // p149l.uv00
    /* JADX INFO: renamed from: y */
    public void mo196053y(int i, int i2) {
        audio_Indicator audio_indicator = this.f188200B;
        if (audio_indicator != null) {
            audio_indicator.enableAudioVolumeIndication(i, i2);
        }
    }
}
