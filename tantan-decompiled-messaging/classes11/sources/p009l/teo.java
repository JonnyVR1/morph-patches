package p009l;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.member.module.CoreMemberModule;
import com.sunshine.engine.particle.SceneView;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import l.baj;
import l.e30;
import l.e51;
import l.hmb;
import l.t100;
import l.xdl0;
import v.VText_NoTopPadding;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class teo {

    /* JADX INFO: renamed from: a */
    public final pgo f20639a;

    /* JADX INFO: renamed from: b */
    public final Act f20640b;

    /* JADX INFO: renamed from: c */
    public final BoostViewContainer f20641c;

    /* JADX INFO: renamed from: d */
    public final BoostViewContainer f20642d;

    /* JADX INFO: renamed from: e */
    public final VText_NoTopPadding f20643e;

    /* JADX INFO: renamed from: f */
    public final FrameLayout f20644f;

    /* JADX INFO: renamed from: g */
    public final SceneView f20645g;

    /* JADX INFO: renamed from: h */
    public final ViewGroup f20646h;

    /* JADX INFO: renamed from: i */
    public final ViewGroup f20647i;

    /* JADX INFO: renamed from: j */
    public final View f20648j;

    /* JADX INFO: renamed from: k */
    public Runnable f20649k;

    public teo(pgo pgoVar, Act act, BoostViewContainer boostViewContainer, BoostViewContainer boostViewContainer2, VText_NoTopPadding vText_NoTopPadding, FrameLayout frameLayout, SceneView sceneView, ViewGroup viewGroup, ViewGroup viewGroup2, View view) {
        this.f20639a = pgoVar;
        this.f20640b = act;
        this.f20641c = boostViewContainer;
        this.f20642d = boostViewContainer2;
        this.f20643e = vText_NoTopPadding;
        this.f20644f = frameLayout;
        this.f20645g = sceneView;
        this.f20646h = viewGroup;
        this.f20647i = viewGroup2;
        this.f20648j = view;
    }

    /* JADX INFO: renamed from: f */
    public final View m22493f(View view, Drawable drawable, CharSequence charSequence, int i, int i2, int i3, boolean z) {
        d.l().k("boost_see_page_guide");
        if (this.f20643e.getVisibility() == 0) {
            this.f20643e.setVisibility(8);
        }
        m22504q();
        View viewM22496i = m22496i(drawable, charSequence, i, i2, z);
        this.f20646h.addView(viewM22496i, new FrameLayout.LayoutParams(-2, -2));
        m22503p(view, viewM22496i);
        if (i3 != -1) {
            m22505r(viewM22496i, i3);
        }
        return viewM22496i;
    }

    /* JADX INFO: renamed from: g */
    public void m22494g(boolean z) {
        VText_NoTopPadding vText_NoTopPadding = this.f20643e;
        if (vText_NoTopPadding != null) {
            xdl0.M(vText_NoTopPadding, z);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m22495h() {
        CoreMemberModule.F().b().Qe(this.f20640b, this.f20641c);
    }

    /* JADX INFO: renamed from: i */
    public final VText_NoTopPadding m22496i(Drawable drawable, CharSequence charSequence, int i, int i2, boolean z) {
        VText_NoTopPadding vText_NoTopPadding = new VText_NoTopPadding(this.f20640b);
        vText_NoTopPadding.setTag("likeBoostBubble");
        vText_NoTopPadding.setTextColor(i);
        vText_NoTopPadding.setTextSize(i2);
        vText_NoTopPadding.setGravity(17);
        vText_NoTopPadding.setText(charSequence);
        vText_NoTopPadding.setBackground(drawable);
        if (!z) {
            vText_NoTopPadding.setPadding(t100.d(18.0f), t100.d(17.0f), t100.d(18.0f), t100.d(21.0f));
        }
        return vText_NoTopPadding;
    }

    /* JADX INFO: renamed from: j */
    public void m22497j() {
        SceneView sceneView = this.f20645g;
        if (sceneView != null) {
            xdl0.M(sceneView, false);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m22498k() {
        BoostViewContainer boostViewContainer = this.f20641c;
        final ViewGroup viewGroup = this.f20646h;
        Objects.requireNonNull(viewGroup);
        boostViewContainer.m7955b(new e30() { // from class: l.peo
            public final void call(Object obj) {
                viewGroup.removeView((View) obj);
            }
        }, new baj() { // from class: l.qeo
            /* JADX INFO: renamed from: a */
            public final Object m20908a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                return this.f19195a.m22499l((Drawable) obj, (CharSequence) obj2, (Integer) obj3, (Integer) obj4, (Integer) obj5, (Boolean) obj6);
            }
        });
        this.f20641c.setSceneView(this.f20645g);
        xdl0.M0(this.f20641c, true);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ View m22499l(Drawable drawable, CharSequence charSequence, Integer num, Integer num2, Integer num3, Boolean bool) {
        return m22493f(this.f20641c, drawable, charSequence, num.intValue(), num2.intValue(), num3.intValue(), bool.booleanValue());
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m22500m(View view, VText_NoTopPadding vText_NoTopPadding, int[] iArr) {
        xdl0.g gVarJ0 = xdl0.j0(view, this.f20647i);
        xdl0.g gVarJ1 = xdl0.j0(vText_NoTopPadding, this.f20647i);
        float f = (gVarJ0.a - gVarJ1.a) + ((gVarJ0.c - gVarJ1.c) / 2.0f);
        float f2 = (gVarJ0.b - gVarJ1.b) - gVarJ1.d;
        vText_NoTopPadding.setTranslationX(f);
        vText_NoTopPadding.setTranslationY(f2);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m22501n(VText_NoTopPadding vText_NoTopPadding) {
        ViewGroup viewGroup;
        if (!NullChecker.a(this.f20647i) || (viewGroup = (ViewGroup) vText_NoTopPadding.getParent()) == null) {
            return;
        }
        viewGroup.removeView(vText_NoTopPadding);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m22502o() {
        this.f20643e.setVisibility(8);
    }

    /* JADX INFO: renamed from: p */
    public final void m22503p(final View view, final VText_NoTopPadding vText_NoTopPadding) {
        xdl0.Q0(vText_NoTopPadding, new e30() { // from class: l.seo
            public final void call(Object obj) {
                this.f20213a.m22500m(view, vText_NoTopPadding, (int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final void m22504q() {
        ViewGroup viewGroup;
        View viewFindViewWithTag = this.f20647i.findViewWithTag("likeBoostBubble");
        if (viewFindViewWithTag == null || (viewGroup = (ViewGroup) viewFindViewWithTag.getParent()) == null) {
            return;
        }
        viewGroup.removeView(viewFindViewWithTag);
    }

    /* JADX INFO: renamed from: r */
    public final void m22505r(final VText_NoTopPadding vText_NoTopPadding, int i) {
        e51.H(this.f20640b, new Runnable() { // from class: l.reo
            @Override // java.lang.Runnable
            public final void run() {
                this.f19788a.m22501n(vText_NoTopPadding);
            }
        }, i);
    }

    /* JADX INFO: renamed from: s */
    public void m22506s(int i) {
        if (CoreModule.c.e0.p9().isBanned()) {
            return;
        }
        yfo.m25356h();
        Runnable runnable = this.f20649k;
        if (runnable != null) {
            e51.J(runnable);
        }
        this.f20643e.setVisibility(0);
        this.f20643e.setOnClickListener(new View.OnClickListener() { // from class: l.neo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yfo.m25356h();
            }
        });
        Runnable runnable2 = new Runnable() { // from class: l.oeo
            @Override // java.lang.Runnable
            public final void run() {
                this.f17940a.m22502o();
            }
        };
        this.f20649k = runnable2;
        e51.H(this.f20640b, runnable2, i);
        CoreMemberModule.F().b().O6();
    }

    /* JADX INFO: renamed from: t */
    public void m22507t(boolean z, String str) {
        View view = this.f20648j;
        if (view == null || this.f20642d == null) {
            return;
        }
        if (z && !xdl0.O0(view)) {
            yfo.m25358j(str);
        }
        xdl0.y(this.f20642d, z);
        xdl0.M(this.f20648j, z);
    }

    /* JADX INFO: renamed from: u */
    public void m22508u(boolean z) {
        BoostViewContainer boostViewContainer = this.f20641c;
        if (boostViewContainer != null) {
            xdl0.M0(boostViewContainer, z);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m22509v(boolean z) {
        if (this.f20642d != null) {
            hmb.M(this.f20648j, !z);
        }
    }
}
