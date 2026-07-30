package p149l;

import com.google.android.exoplayer2.PlaybackException;
import com.p046p1.mobile.putong.live.livingroom.view.RightSideViewGroup;
import p147v.VFrame;
import p147v.VRelative;

/* JADX INFO: loaded from: classes4.dex */
public class e7d0 extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public final VFrame f89696i;

    /* JADX INFO: renamed from: j */
    public final VRelative f89697j;

    /* JADX INFO: renamed from: k */
    public boolean f89698k;

    /* JADX INFO: renamed from: l */
    public RightSideViewGroup.InterfaceC12939c f89699l;

    public e7d0(bsm<? extends ho2> bsmVar, VFrame vFrame, VRelative vRelative) {
        super(bsmVar);
        this.f89698k = false;
        this.f89699l = new C16556a();
        this.f89696i = vFrame;
        this.f89697j = vRelative;
    }

    /* JADX INFO: renamed from: O3 */
    public final void m115196O3(rwb rwbVar) {
        if (rwbVar == null) {
            return;
        }
        if (rwbVar.f161324a != 3) {
            this.f89698k = true;
            return;
        }
        this.f89698k = false;
        this.f89696i.setTranslationX(0.0f);
        this.f89697j.setVisibility(4);
        m115199S3(true);
    }

    /* JADX INFO: renamed from: P3 */
    public final void m115197P3(Float f) {
        if (this.f89698k) {
            if ((this.f89696i.getTranslationX() > xdl0.m208412y0() / 2.0f && f.floatValue() >= 0.0f) || f.floatValue() > 200.0f) {
                this.f89696i.setTranslationX(xdl0.m208412y0());
                this.f89697j.setVisibility(0);
                m115199S3(false);
            } else if (this.f89696i.getTranslationX() < xdl0.m208412y0() / 2.0f || f.floatValue() < -200.0f) {
                this.f89696i.setTranslationX(0.0f);
                this.f89697j.setVisibility(4);
                m115199S3(true);
            }
        }
    }

    /* JADX INFO: renamed from: R3 */
    public final void m115198R3(Integer num) {
        if (this.f89698k) {
            float translationX = this.f89696i.getTranslationX() + num.intValue();
            if (translationX < 0.0f) {
                return;
            }
            this.f89696i.setAlpha(1.0f);
            this.f89696i.setTranslationX(translationX);
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final void m115199S3(boolean z) {
        if (this.f89696i.getAlpha() == 1.0f && z) {
            return;
        }
        VFrame vFrame = this.f89696i;
        if (z) {
            bt0.m103730c(vFrame, 300L, null);
        } else {
            bt0.m103731d(vFrame, 300L, null);
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().PlayerEvent.ctypChanged().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.d7d0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84735a.m115196O3((rwb) obj);
            }
        }));
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        m206028F2().ClearScreenEvent.removeClearScreenCallBack().mo172463j(this.f89699l);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m206028F2().ClearScreenEvent.addClearScreenCallBack().mo172463j(this.f89699l);
        this.f89696i.setTranslationX(0.0f);
        this.f89696i.setAlpha(1.0f);
        this.f89696i.setVisibility(0);
        m115196O3((rwb) m129297F3(new swb(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED)));
    }

    /* JADX INFO: renamed from: l.e7d0$a */
    public class C16556a implements RightSideViewGroup.InterfaceC12939c {
        public C16556a() {
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.view.RightSideViewGroup.InterfaceC12939c
        /* JADX INFO: renamed from: a */
        public Boolean mo76626a() {
            if (e7d0.this.f89696i != null) {
                return Boolean.valueOf(e7d0.this.f89696i.getAlpha() != 1.0f);
            }
            return Boolean.FALSE;
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.view.RightSideViewGroup.InterfaceC12939c
        /* JADX INFO: renamed from: b */
        public Boolean mo76627b() {
            return Boolean.valueOf(e7d0.this.f89698k);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.view.RightSideViewGroup.InterfaceC12939c
        /* JADX INFO: renamed from: c */
        public void mo76628c(float f) {
            e7d0.this.m115197P3(Float.valueOf(f));
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.view.RightSideViewGroup.InterfaceC12939c
        /* JADX INFO: renamed from: e */
        public void mo76630e(int i) {
            e7d0.this.m115198R3(Integer.valueOf(i));
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.view.RightSideViewGroup.InterfaceC12939c
        /* JADX INFO: renamed from: d */
        public void mo76629d(boolean z) {
        }
    }
}
