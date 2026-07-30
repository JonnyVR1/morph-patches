package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.poi.FeedPoiTraceFrag;
import com.p046p1.mobile.putong.core.newui.poi.bifrost.PoiTraceCardStack;
import com.p046p1.mobile.putong.core.newui.poi.view.FeedPoiCardBottomHintView;
import com.p046p1.mobile.putong.core.newui.poi.view.FeedPoiCardItemView;
import java.util.List;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes11.dex */
public class qqh implements s7m<oqh> {

    /* JADX INFO: renamed from: a */
    public View f155889a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f155890b;

    /* JADX INFO: renamed from: c */
    public VNavigationBar f155891c;

    /* JADX INFO: renamed from: d */
    public FeedPoiCardBottomHintView f155892d;

    /* JADX INFO: renamed from: e */
    public FeedPoiCardBottomHintView f155893e;

    /* JADX INFO: renamed from: f */
    public PoiTraceCardStack f155894f;

    /* JADX INFO: renamed from: g */
    public ba80 f155895g;

    /* JADX INFO: renamed from: h */
    public Act f155896h;

    /* JADX INFO: renamed from: i */
    public FeedPoiTraceFrag f155897i;

    /* JADX INFO: renamed from: j */
    public oqh f155898j;

    /* JADX INFO: renamed from: k */
    public p3m<qph.C19553a, VSwipeStack.OnCardSwipeResult> f155899k;

    public qqh(FeedPoiTraceFrag feedPoiTraceFrag) {
        this.f155897i = feedPoiTraceFrag;
        this.f155896h = feedPoiTraceFrag.act();
    }

    /* JADX INFO: renamed from: j */
    private void m175908j() {
        this.f155891c.setLeftIconOnClick(new View.OnClickListener() { // from class: l.pqh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f150787a.m175909l(view);
            }
        });
        this.f155891c.setLeftIconResource(x2c0.f189593O);
        this.f155891c.setTitle("附近的人");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m175909l(View view) {
        m175912d();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f155896h;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f155896h;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(oqh oqhVar) {
        this.f155898j = oqhVar;
    }

    /* JADX INFO: renamed from: c */
    public void m175911c() {
        ba80 ba80Var;
        if (!this.f155898j.m165454s0() || (ba80Var = this.f155895g) == null || this.f155894f == null || ba80Var.mo100899f() == 0) {
            return;
        }
        View viewM43137d = this.f155894f.m43137d();
        da80 da80Var = viewM43137d instanceof FeedPoiCardItemView ? ((FeedPoiCardItemView) viewM43137d).f26410B : null;
        if (da80Var != null && this.f155898j.m165455x0(da80Var.f85198b.f56011id)) {
            this.f155894f.m43136A(SwipeDirection.RIGHT);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m175912d() {
        this.f155896h.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: e */
    public void m175913e() {
        this.f155896h.setResult(-1);
        this.f155896h.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: f */
    public ba80 m175914f() {
        return this.f155895g;
    }

    /* JADX INFO: renamed from: i */
    public PoiTraceCardStack m175915i() {
        return this.f155894f;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95387H8, viewGroup, false);
        this.f155889a = viewInflate;
        this.f155890b = (FrameLayout) viewInflate.findViewById(u4c0.f174023S0);
        this.f155891c = (VNavigationBar) this.f155889a.findViewById(u4c0.f173912L8);
        this.f155892d = (FeedPoiCardBottomHintView) this.f155889a.findViewById(u4c0.f173927M6);
        this.f155893e = (FeedPoiCardBottomHintView) this.f155889a.findViewById(u4c0.f173728Ab);
        this.f155892d.m43142d(1);
        this.f155893e.m43142d(2);
        xdl0.m208344M(this.f155892d, false);
        xdl0.m208344M(this.f155893e, false);
        return this.f155889a;
    }

    /* JADX INFO: renamed from: k */
    public final void m175916k() {
        PoiTraceCardStack poiTraceCardStack = new PoiTraceCardStack(getAct(), this);
        this.f155894f = poiTraceCardStack;
        poiTraceCardStack.setClipChildren(false);
        this.f155894f.setClipToPadding(false);
        this.f155890b.addView(this.f155894f, 0, new FrameLayout.LayoutParams(-1, -1));
        ba80 ba80Var = new ba80(this.f155897i, this.f155894f);
        this.f155895g = ba80Var;
        this.f155894f.setAdapter(ba80Var);
    }

    /* JADX INFO: renamed from: m */
    public VSwipeStack.OnCardSwipeResult m175917m(View view, SwipeDirection swipeDirection, boolean z) {
        da80 da80Var = view instanceof FeedPoiCardItemView ? ((FeedPoiCardItemView) view).f26410B : null;
        if (da80Var == null) {
            return VSwipeStack.OnCardSwipeResult.back;
        }
        if (this.f155898j.m165455x0(da80Var.f85198b.f56011id)) {
            return VSwipeStack.OnCardSwipeResult.pass;
        }
        if (this.f155899k == null) {
            this.f155899k = new qph();
        }
        return this.f155899k.mo37497a(new qph.C19553a(getAct(), da80Var.f85198b, view, swipeDirection, z, this.f155897i));
    }

    /* JADX INFO: renamed from: n */
    public void m175918n(float f, float f2, float f3) {
        FeedPoiCardBottomHintView feedPoiCardBottomHintView = this.f155892d;
        if (f2 > 0.0f) {
            if (!xdl0.m208349O0(feedPoiCardBottomHintView)) {
                xdl0.m208344M(this.f155892d, true);
            }
            FeedPoiCardBottomHintView feedPoiCardBottomHintView2 = this.f155892d;
            if (f2 >= 0.3f) {
                feedPoiCardBottomHintView2.setTranslationX(feedPoiCardBottomHintView2.m43140b(1.0f));
            } else {
                feedPoiCardBottomHintView2.setTranslationX(feedPoiCardBottomHintView2.m43140b((float) (((double) f2) / 0.3d)));
            }
        } else {
            xdl0.m208344M(feedPoiCardBottomHintView, false);
        }
        FeedPoiCardBottomHintView feedPoiCardBottomHintView3 = this.f155893e;
        if (f <= 0.0f) {
            xdl0.m208344M(feedPoiCardBottomHintView3, false);
            return;
        }
        if (!xdl0.m208349O0(feedPoiCardBottomHintView3)) {
            xdl0.m208344M(this.f155893e, true);
        }
        FeedPoiCardBottomHintView feedPoiCardBottomHintView4 = this.f155893e;
        if (f >= 0.3f) {
            feedPoiCardBottomHintView4.setTranslationX(feedPoiCardBottomHintView4.m43141c(1.0f));
        } else {
            feedPoiCardBottomHintView4.setTranslationX(feedPoiCardBottomHintView4.m43141c((float) (((double) f) / 0.3d)));
        }
    }

    /* JADX INFO: renamed from: p */
    public void m175919p(View view, SwipeDirection swipeDirection) {
        da80 da80Var = view instanceof FeedPoiCardItemView ? ((FeedPoiCardItemView) view).f26410B : null;
        if (da80Var == null) {
            return;
        }
        this.f155898j.f145151a = new rqh(da80Var, swipeDirection);
    }

    /* JADX INFO: renamed from: q */
    public void m175920q(List<da80> list) {
        ba80 ba80Var = this.f155895g;
        if (ba80Var == null) {
            return;
        }
        ba80Var.m100906o(list);
    }

    /* JADX INFO: renamed from: r */
    public void m175921r() {
        m175908j();
        m175916k();
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
