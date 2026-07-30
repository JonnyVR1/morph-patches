package p153l;

import com.google.android.exoplayer2.PlaybackException;
import com.p051p1.mobile.putong.live.livingroom.view.RightSideViewGroup;
import p151v.VFrame;
import p151v.VRelative;

/* JADX INFO: loaded from: classes4.dex */
public class hfd0 extends qct<oo2> {

    /* JADX INFO: renamed from: i */
    public final VFrame f109277i;

    /* JADX INFO: renamed from: j */
    public final VRelative f109278j;

    /* JADX INFO: renamed from: k */
    public boolean f109279k;

    /* JADX INFO: renamed from: l */
    public RightSideViewGroup.InterfaceC13102c f109280l;

    public hfd0(dum<? extends oo2> dumVar, VFrame vFrame, VRelative vRelative) {
        super(dumVar);
        this.f109279k = false;
        this.f109280l = new C17446a();
        this.f109277i = vFrame;
        this.f109278j = vRelative;
    }

    /* JADX INFO: renamed from: O3 */
    public final void m134789O3(fyb fybVar) {
        if (fybVar == null) {
            return;
        }
        if (fybVar.f101357a != 3) {
            this.f109279k = true;
            return;
        }
        this.f109279k = false;
        this.f109277i.setTranslationX(0.0f);
        this.f109278j.setVisibility(4);
        m134792S3(true);
    }

    /* JADX INFO: renamed from: P3 */
    public final void m134790P3(Float f) {
        if (this.f109279k) {
            if ((this.f109277i.getTranslationX() > bnl0.m105592y0() / 2.0f && f.floatValue() >= 0.0f) || f.floatValue() > 200.0f) {
                this.f109277i.setTranslationX(bnl0.m105592y0());
                this.f109278j.setVisibility(0);
                m134792S3(false);
            } else if (this.f109277i.getTranslationX() < bnl0.m105592y0() / 2.0f || f.floatValue() < -200.0f) {
                this.f109277i.setTranslationX(0.0f);
                this.f109278j.setVisibility(4);
                m134792S3(true);
            }
        }
    }

    /* JADX INFO: renamed from: R3 */
    public final void m134791R3(Integer num) {
        if (this.f109279k) {
            float translationX = this.f109277i.getTranslationX() + num.intValue();
            if (translationX < 0.0f) {
                return;
            }
            this.f109277i.setAlpha(1.0f);
            this.f109277i.setTranslationX(translationX);
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final void m134792S3(boolean z) {
        if (this.f109277i.getAlpha() == 1.0f && z) {
            return;
        }
        VFrame vFrame = this.f109277i;
        if (z) {
            gt0.m132157c(vFrame, 300L, null);
        } else {
            gt0.m132158d(vFrame, 300L, null);
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().PlayerEvent.ctypChanged().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.gfd0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f103895a.m134789O3((fyb) obj);
            }
        }));
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        m213811F2().ClearScreenEvent.removeClearScreenCallBack().mo199273j(this.f109280l);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m213811F2().ClearScreenEvent.addClearScreenCallBack().mo199273j(this.f109280l);
        this.f109277i.setTranslationX(0.0f);
        this.f109277i.setAlpha(1.0f);
        this.f109277i.setVisibility(0);
        m134789O3((fyb) m138856F3(new gyb(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED)));
    }

    /* JADX INFO: renamed from: l.hfd0$a */
    public class C17446a implements RightSideViewGroup.InterfaceC13102c {
        public C17446a() {
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.view.RightSideViewGroup.InterfaceC13102c
        /* JADX INFO: renamed from: a */
        public Boolean mo77809a() {
            if (hfd0.this.f109277i != null) {
                return Boolean.valueOf(hfd0.this.f109277i.getAlpha() != 1.0f);
            }
            return Boolean.FALSE;
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.view.RightSideViewGroup.InterfaceC13102c
        /* JADX INFO: renamed from: b */
        public Boolean mo77810b() {
            return Boolean.valueOf(hfd0.this.f109279k);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.view.RightSideViewGroup.InterfaceC13102c
        /* JADX INFO: renamed from: c */
        public void mo77811c(float f) {
            hfd0.this.m134790P3(Float.valueOf(f));
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.view.RightSideViewGroup.InterfaceC13102c
        /* JADX INFO: renamed from: e */
        public void mo77813e(int i) {
            hfd0.this.m134791R3(Integer.valueOf(i));
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.view.RightSideViewGroup.InterfaceC13102c
        /* JADX INFO: renamed from: d */
        public void mo77812d(boolean z) {
        }
    }
}
