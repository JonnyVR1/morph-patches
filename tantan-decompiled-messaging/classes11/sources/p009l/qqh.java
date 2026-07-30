package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.poi.FeedPoiTraceFrag;
import com.p000p1.mobile.putong.core.newui.poi.bifrost.PoiTraceCardStack;
import com.p000p1.mobile.putong.core.newui.poi.view.FeedPoiCardBottomHintView;
import com.p000p1.mobile.putong.core.newui.poi.view.FeedPoiCardItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.tantanapp.common.data.DbObject;
import java.util.List;
import l.f6c0;
import l.s7m;
import l.u4c0;
import l.x2c0;
import l.xdl0;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class qqh implements s7m<oqh> {

    /* JADX INFO: renamed from: a */
    public View f19448a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f19449b;

    /* JADX INFO: renamed from: c */
    public VNavigationBar f19450c;

    /* JADX INFO: renamed from: d */
    public FeedPoiCardBottomHintView f19451d;

    /* JADX INFO: renamed from: e */
    public FeedPoiCardBottomHintView f19452e;

    /* JADX INFO: renamed from: f */
    public PoiTraceCardStack f19453f;

    /* JADX INFO: renamed from: g */
    public ba80 f19454g;

    /* JADX INFO: renamed from: h */
    public Act f19455h;

    /* JADX INFO: renamed from: i */
    public FeedPoiTraceFrag f19456i;

    /* JADX INFO: renamed from: j */
    public oqh f19457j;

    /* JADX INFO: renamed from: k */
    public p3m<qph.C1150a, VSwipeStack.OnCardSwipeResult> f19458k;

    public qqh(FeedPoiTraceFrag feedPoiTraceFrag) {
        this.f19456i = feedPoiTraceFrag;
        this.f19455h = feedPoiTraceFrag.act();
    }

    /* JADX INFO: renamed from: j */
    private void m21158j() {
        this.f19450c.setLeftIconOnClick(new View.OnClickListener() { // from class: l.pqh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18841a.m21159l(view);
            }
        });
        this.f19450c.setLeftIconResource(x2c0.O);
        this.f19450c.setTitle("附近的人");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m21159l(View view) {
        m21163d();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m21160C0() {
        return this.f19455h;
    }

    @Nullable
    public Act act() {
        return this.f19455h;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m21167i1(oqh oqhVar) {
        this.f19457j = oqhVar;
    }

    /* JADX INFO: renamed from: c */
    public void m21162c() {
        ba80 ba80Var;
        if (!this.f19457j.m20005s0() || (ba80Var = this.f19454g) == null || this.f19453f == null || ba80Var.mo11924f() == 0) {
            return;
        }
        Object objM7352d = this.f19453f.m7352d();
        da80 da80Var = objM7352d instanceof FeedPoiCardItemView ? ((FeedPoiCardItemView) objM7352d).f5188B : null;
        if (da80Var != null && this.f19457j.m20006x0(((DbObject) da80Var.f11695b).id)) {
            this.f19453f.m7351A(SwipeDirection.RIGHT);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m21163d() {
        this.f19455h.finish();
    }

    /* JADX INFO: renamed from: e */
    public void m21164e() {
        this.f19455h.setResult(-1);
        this.f19455h.finish();
    }

    /* JADX INFO: renamed from: f */
    public ba80 m21165f() {
        return this.f19454g;
    }

    /* JADX INFO: renamed from: i */
    public PoiTraceCardStack m21166i() {
        return this.f19453f;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.H8, viewGroup, false);
        this.f19448a = viewInflate;
        this.f19449b = (FrameLayout) viewInflate.findViewById(u4c0.S0);
        this.f19450c = this.f19448a.findViewById(u4c0.L8);
        this.f19451d = (FeedPoiCardBottomHintView) this.f19448a.findViewById(u4c0.M6);
        this.f19452e = (FeedPoiCardBottomHintView) this.f19448a.findViewById(u4c0.Ab);
        this.f19451d.m7357d(1);
        this.f19452e.m7357d(2);
        xdl0.M(this.f19451d, false);
        xdl0.M(this.f19452e, false);
        return this.f19448a;
    }

    /* JADX INFO: renamed from: k */
    public final void m21168k() {
        PoiTraceCardStack poiTraceCardStack = new PoiTraceCardStack((Context) act(), this);
        this.f19453f = poiTraceCardStack;
        poiTraceCardStack.setClipChildren(false);
        this.f19453f.setClipToPadding(false);
        this.f19449b.addView(this.f19453f, 0, new FrameLayout.LayoutParams(-1, -1));
        ba80 ba80Var = new ba80(this.f19456i, this.f19453f);
        this.f19454g = ba80Var;
        this.f19453f.setAdapter(ba80Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public VSwipeStack.OnCardSwipeResult m21169m(View view, SwipeDirection swipeDirection, boolean z) {
        da80 da80Var = view instanceof FeedPoiCardItemView ? ((FeedPoiCardItemView) view).f5188B : null;
        if (da80Var == null) {
            return VSwipeStack.OnCardSwipeResult.back;
        }
        if (this.f19457j.m20006x0(((DbObject) da80Var.f11695b).id)) {
            return VSwipeStack.OnCardSwipeResult.pass;
        }
        if (this.f19458k == null) {
            this.f19458k = new qph();
        }
        return this.f19458k.mo1468a(new qph.C1150a(act(), da80Var.f11695b, view, swipeDirection, z, this.f19456i));
    }

    /* JADX INFO: renamed from: n */
    public void m21170n(float f, float f2, float f3) {
        FeedPoiCardBottomHintView feedPoiCardBottomHintView = this.f19451d;
        if (f2 > 0.0f) {
            if (!xdl0.O0(feedPoiCardBottomHintView)) {
                xdl0.M(this.f19451d, true);
            }
            FeedPoiCardBottomHintView feedPoiCardBottomHintView2 = this.f19451d;
            if (f2 >= 0.3f) {
                feedPoiCardBottomHintView2.setTranslationX(feedPoiCardBottomHintView2.m7355b(1.0f));
            } else {
                feedPoiCardBottomHintView2.setTranslationX(feedPoiCardBottomHintView2.m7355b((float) (((double) f2) / 0.3d)));
            }
        } else {
            xdl0.M(feedPoiCardBottomHintView, false);
        }
        FeedPoiCardBottomHintView feedPoiCardBottomHintView3 = this.f19452e;
        if (f <= 0.0f) {
            xdl0.M(feedPoiCardBottomHintView3, false);
            return;
        }
        if (!xdl0.O0(feedPoiCardBottomHintView3)) {
            xdl0.M(this.f19452e, true);
        }
        FeedPoiCardBottomHintView feedPoiCardBottomHintView4 = this.f19452e;
        if (f >= 0.3f) {
            feedPoiCardBottomHintView4.setTranslationX(feedPoiCardBottomHintView4.m7356c(1.0f));
        } else {
            feedPoiCardBottomHintView4.setTranslationX(feedPoiCardBottomHintView4.m7356c((float) (((double) f) / 0.3d)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public void m21171p(View view, SwipeDirection swipeDirection) {
        da80 da80Var = view instanceof FeedPoiCardItemView ? ((FeedPoiCardItemView) view).f5188B : null;
        if (da80Var == null) {
            return;
        }
        this.f19457j.f18207a = new rqh(da80Var, swipeDirection);
    }

    /* JADX INFO: renamed from: q */
    public void m21172q(List<da80> list) {
        ba80 ba80Var = this.f19454g;
        if (ba80Var == null) {
            return;
        }
        ba80Var.m11931o(list);
    }

    /* JADX INFO: renamed from: r */
    public void m21173r() {
        m21158j();
        m21168k();
    }

    public void destroy() {
    }
}
