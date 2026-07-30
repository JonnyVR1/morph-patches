package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.fragment.app.AbstractC0428k;
import androidx.fragment.app.FragmentManager;
import com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailFrag;

/* JADX INFO: loaded from: classes13.dex */
public class in00 implements iam<ym00> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f115850a;

    /* JADX INFO: renamed from: b */
    public String f115851b = "MomentDetailAct";

    /* JADX INFO: renamed from: c */
    public MomentDetailAct f115852c;

    /* JADX INFO: renamed from: d */
    public MomentDetailFrag f115853d;

    /* JADX INFO: renamed from: e */
    public ym00 f115854e;

    public in00(MomentDetailAct momentDetailAct) {
        this.f115852c = momentDetailAct;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f115852c;
    }

    /* JADX INFO: renamed from: a */
    public View m140999a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ln00.m154943b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ym00 ym00Var) {
        this.f115854e = ym00Var;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m140999a(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m141001r() {
        this.f115852c.addSwipeBackListener(new C17746a());
        FragmentManager supportFragmentManager = this.f115852c.getSupportFragmentManager();
        MomentDetailFrag momentDetailFrag = (MomentDetailFrag) supportFragmentManager.m2558i0(this.f115851b);
        this.f115853d = momentDetailFrag;
        if (momentDetailFrag == null) {
            ym00 ym00Var = this.f115854e;
            this.f115853d = MomentDetailFrag.m66039N4(ym00Var.f200608b, ym00Var.f200609c, ym00Var.f200610d, true, ym00Var.f200612f, ym00Var.f200611e, ym00Var.f200613g, ym00Var.f200614h, ym00Var.f200619m, ym00Var.f200615i, ym00Var.f200616j, ym00Var.f200617k, ym00Var.f200618l, ym00Var.f200620n);
            AbstractC0428k abstractC0428kM2568m = supportFragmentManager.m2568m();
            abstractC0428kM2568m.m2813t(hdc0.f108864Q, this.f115853d, this.f115851b);
            abstractC0428kM2568m.mo2709j();
            supportFragmentManager.m2546e0();
        }
        this.f115853d.m66044R4();
    }

    /* JADX INFO: renamed from: l.in00$a */
    public class C17746a implements ujh0 {
        public C17746a() {
        }

        @Override // p153l.ujh0
        /* JADX INFO: renamed from: P */
        public void mo44722P() {
            in00.this.f115852c.hideInput();
        }

        @Override // p153l.ujh0
        /* JADX INFO: renamed from: G0 */
        public void mo44721G0() {
        }

        @Override // p153l.ujh0
        /* JADX INFO: renamed from: a0 */
        public void mo44724a0() {
        }

        @Override // p153l.ujh0
        /* JADX INFO: renamed from: E0 */
        public void mo44720E0(boolean z, float f, int i) {
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
