package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.poi.FeedPoiTraceFrag;
import com.p051p1.mobile.putong.core.newui.poi.bifrost.PoiTraceCardStack;
import com.p051p1.mobile.putong.core.newui.poi.view.FeedPoiCardBottomHintView;
import com.p051p1.mobile.putong.core.newui.poi.view.FeedPoiCardItemView;
import java.util.List;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes11.dex */
public class fsh implements iam<dsh> {

    /* JADX INFO: renamed from: a */
    public View f100620a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f100621b;

    /* JADX INFO: renamed from: c */
    public VNavigationBar f100622c;

    /* JADX INFO: renamed from: d */
    public FeedPoiCardBottomHintView f100623d;

    /* JADX INFO: renamed from: e */
    public FeedPoiCardBottomHintView f100624e;

    /* JADX INFO: renamed from: f */
    public PoiTraceCardStack f100625f;

    /* JADX INFO: renamed from: g */
    public hi80 f100626g;

    /* JADX INFO: renamed from: h */
    public Act f100627h;

    /* JADX INFO: renamed from: i */
    public FeedPoiTraceFrag f100628i;

    /* JADX INFO: renamed from: j */
    public dsh f100629j;

    /* JADX INFO: renamed from: k */
    public g6m<frh.C17047a, VSwipeStack.OnCardSwipeResult> f100630k;

    public fsh(FeedPoiTraceFrag feedPoiTraceFrag) {
        this.f100628i = feedPoiTraceFrag;
        this.f100627h = feedPoiTraceFrag.act();
    }

    /* JADX INFO: renamed from: j */
    private void m127179j() {
        this.f100622c.setLeftIconOnClick(new View.OnClickListener() { // from class: l.esh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f95612a.m127180l(view);
            }
        });
        this.f100622c.setLeftIconResource(dbc0.f86456P);
        this.f100622c.setTitle("附近的人");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m127180l(View view) {
        m127183d();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f100627h;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f100627h;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(dsh dshVar) {
        this.f100629j = dshVar;
    }

    /* JADX INFO: renamed from: c */
    public void m127182c() {
        hi80 hi80Var;
        if (!this.f100629j.m117754s0() || (hi80Var = this.f100626g) == null || this.f100625f == null || hi80Var.mo105831f() == 0) {
            return;
        }
        View viewM44148d = this.f100625f.m44148d();
        ji80 ji80Var = viewM44148d instanceof FeedPoiCardItemView ? ((FeedPoiCardItemView) viewM44148d).f27152B : null;
        if (ji80Var != null && this.f100629j.m117755x0(ji80Var.f121050b.f56859id)) {
            this.f100625f.m44147A(SwipeDirection.RIGHT);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m127183d() {
        this.f100627h.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: e */
    public void m127184e() {
        this.f100627h.setResult(-1);
        this.f100627h.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: f */
    public hi80 m127185f() {
        return this.f100626g;
    }

    /* JADX INFO: renamed from: i */
    public PoiTraceCardStack m127186i() {
        return this.f100625f;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125553O8, viewGroup, false);
        this.f100620a = viewInflate;
        this.f100621b = (FrameLayout) viewInflate.findViewById(adc0.f70111S0);
        this.f100622c = (VNavigationBar) this.f100620a.findViewById(adc0.f70034N8);
        this.f100623d = (FeedPoiCardBottomHintView) this.f100620a.findViewById(adc0.f70049O6);
        this.f100624e = (FeedPoiCardBottomHintView) this.f100620a.findViewById(adc0.f69850Cb);
        this.f100623d.m44153d(1);
        this.f100624e.m44153d(2);
        bnl0.m105524M(this.f100623d, false);
        bnl0.m105524M(this.f100624e, false);
        return this.f100620a;
    }

    /* JADX INFO: renamed from: k */
    public final void m127187k() {
        PoiTraceCardStack poiTraceCardStack = new PoiTraceCardStack(getAct(), this);
        this.f100625f = poiTraceCardStack;
        poiTraceCardStack.setClipChildren(false);
        this.f100625f.setClipToPadding(false);
        this.f100621b.addView(this.f100625f, 0, new FrameLayout.LayoutParams(-1, -1));
        hi80 hi80Var = new hi80(this.f100628i, this.f100625f);
        this.f100626g = hi80Var;
        this.f100625f.setAdapter(hi80Var);
    }

    /* JADX INFO: renamed from: m */
    public VSwipeStack.OnCardSwipeResult m127188m(View view, SwipeDirection swipeDirection, boolean z) {
        ji80 ji80Var = view instanceof FeedPoiCardItemView ? ((FeedPoiCardItemView) view).f27152B : null;
        if (ji80Var == null) {
            return VSwipeStack.OnCardSwipeResult.back;
        }
        if (this.f100629j.m117755x0(ji80Var.f121050b.f56859id)) {
            return VSwipeStack.OnCardSwipeResult.pass;
        }
        if (this.f100630k == null) {
            this.f100630k = new frh();
        }
        return this.f100630k.mo38500a(new frh.C17047a(getAct(), ji80Var.f121050b, view, swipeDirection, z, this.f100628i));
    }

    /* JADX INFO: renamed from: n */
    public void m127189n(float f, float f2, float f3) {
        FeedPoiCardBottomHintView feedPoiCardBottomHintView = this.f100623d;
        if (f2 > 0.0f) {
            if (!bnl0.m105529O0(feedPoiCardBottomHintView)) {
                bnl0.m105524M(this.f100623d, true);
            }
            FeedPoiCardBottomHintView feedPoiCardBottomHintView2 = this.f100623d;
            if (f2 >= 0.3f) {
                feedPoiCardBottomHintView2.setTranslationX(feedPoiCardBottomHintView2.m44151b(1.0f));
            } else {
                feedPoiCardBottomHintView2.setTranslationX(feedPoiCardBottomHintView2.m44151b((float) (((double) f2) / 0.3d)));
            }
        } else {
            bnl0.m105524M(feedPoiCardBottomHintView, false);
        }
        FeedPoiCardBottomHintView feedPoiCardBottomHintView3 = this.f100624e;
        if (f <= 0.0f) {
            bnl0.m105524M(feedPoiCardBottomHintView3, false);
            return;
        }
        if (!bnl0.m105529O0(feedPoiCardBottomHintView3)) {
            bnl0.m105524M(this.f100624e, true);
        }
        FeedPoiCardBottomHintView feedPoiCardBottomHintView4 = this.f100624e;
        if (f >= 0.3f) {
            feedPoiCardBottomHintView4.setTranslationX(feedPoiCardBottomHintView4.m44152c(1.0f));
        } else {
            feedPoiCardBottomHintView4.setTranslationX(feedPoiCardBottomHintView4.m44152c((float) (((double) f) / 0.3d)));
        }
    }

    /* JADX INFO: renamed from: p */
    public void m127190p(View view, SwipeDirection swipeDirection) {
        ji80 ji80Var = view instanceof FeedPoiCardItemView ? ((FeedPoiCardItemView) view).f27152B : null;
        if (ji80Var == null) {
            return;
        }
        this.f100629j.f90479a = new gsh(ji80Var, swipeDirection);
    }

    /* JADX INFO: renamed from: q */
    public void m127191q(List<ji80> list) {
        hi80 hi80Var = this.f100626g;
        if (hi80Var == null) {
            return;
        }
        hi80Var.m135111o(list);
    }

    /* JADX INFO: renamed from: r */
    public void m127192r() {
        m127179j();
        m127187k();
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
