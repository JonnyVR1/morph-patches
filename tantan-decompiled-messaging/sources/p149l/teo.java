package p149l;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p046p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.sunshine.engine.particle.SceneView;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import p147v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes11.dex */
public class teo {

    /* JADX INFO: renamed from: a */
    public final pgo f169861a;

    /* JADX INFO: renamed from: b */
    public final Act f169862b;

    /* JADX INFO: renamed from: c */
    public final BoostViewContainer f169863c;

    /* JADX INFO: renamed from: d */
    public final BoostViewContainer f169864d;

    /* JADX INFO: renamed from: e */
    public final VText_NoTopPadding f169865e;

    /* JADX INFO: renamed from: f */
    public final FrameLayout f169866f;

    /* JADX INFO: renamed from: g */
    public final SceneView f169867g;

    /* JADX INFO: renamed from: h */
    public final ViewGroup f169868h;

    /* JADX INFO: renamed from: i */
    public final ViewGroup f169869i;

    /* JADX INFO: renamed from: j */
    public final View f169870j;

    /* JADX INFO: renamed from: k */
    public Runnable f169871k;

    public teo(pgo pgoVar, Act act, BoostViewContainer boostViewContainer, BoostViewContainer boostViewContainer2, VText_NoTopPadding vText_NoTopPadding, FrameLayout frameLayout, SceneView sceneView, ViewGroup viewGroup, ViewGroup viewGroup2, View view) {
        this.f169861a = pgoVar;
        this.f169862b = act;
        this.f169863c = boostViewContainer;
        this.f169864d = boostViewContainer2;
        this.f169865e = vText_NoTopPadding;
        this.f169866f = frameLayout;
        this.f169867g = sceneView;
        this.f169868h = viewGroup;
        this.f169869i = viewGroup2;
        this.f169870j = view;
    }

    /* JADX INFO: renamed from: f */
    public final View m188540f(View view, Drawable drawable, CharSequence charSequence, int i, int i2, int i3, boolean z) {
        C4348d.m20896l().m20900k("boost_see_page_guide");
        if (this.f169865e.getVisibility() == 0) {
            this.f169865e.setVisibility(8);
        }
        m188551q();
        VText_NoTopPadding vText_NoTopPaddingM188543i = m188543i(drawable, charSequence, i, i2, z);
        this.f169868h.addView(vText_NoTopPaddingM188543i, new FrameLayout.LayoutParams(-2, -2));
        m188550p(view, vText_NoTopPaddingM188543i);
        if (i3 != -1) {
            m188552r(vText_NoTopPaddingM188543i, i3);
        }
        return vText_NoTopPaddingM188543i;
    }

    /* JADX INFO: renamed from: g */
    public void m188541g(boolean z) {
        VText_NoTopPadding vText_NoTopPadding = this.f169865e;
        if (vText_NoTopPadding != null) {
            xdl0.m208344M(vText_NoTopPadding, z);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m188542h() {
        CoreMemberModule.m36001F().m132651b().mo35977Qe(this.f169862b, this.f169863c);
    }

    /* JADX INFO: renamed from: i */
    public final VText_NoTopPadding m188543i(Drawable drawable, CharSequence charSequence, int i, int i2, boolean z) {
        VText_NoTopPadding vText_NoTopPadding = new VText_NoTopPadding(this.f169862b);
        vText_NoTopPadding.setTag("likeBoostBubble");
        vText_NoTopPadding.setTextColor(i);
        vText_NoTopPadding.setTextSize(i2);
        vText_NoTopPadding.setGravity(17);
        vText_NoTopPadding.setText(charSequence);
        vText_NoTopPadding.setBackground(drawable);
        if (!z) {
            vText_NoTopPadding.setPadding(t100.m186890d(18.0f), t100.m186890d(17.0f), t100.m186890d(18.0f), t100.m186890d(21.0f));
        }
        return vText_NoTopPadding;
    }

    /* JADX INFO: renamed from: j */
    public void m188544j() {
        SceneView sceneView = this.f169867g;
        if (sceneView != null) {
            xdl0.m208344M(sceneView, false);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m188545k() {
        BoostViewContainer boostViewContainer = this.f169863c;
        final ViewGroup viewGroup = this.f169868h;
        Objects.requireNonNull(viewGroup);
        boostViewContainer.m43691b(new e30() { // from class: l.peo
            @Override // p149l.e30
            public final void call(Object obj) {
                viewGroup.removeView((View) obj);
            }
        }, new baj() { // from class: l.qeo
            @Override // p149l.baj
            /* JADX INFO: renamed from: a */
            public final Object mo100908a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                return this.f154046a.m188546l((Drawable) obj, (CharSequence) obj2, (Integer) obj3, (Integer) obj4, (Integer) obj5, (Boolean) obj6);
            }
        });
        this.f169863c.setSceneView(this.f169867g);
        xdl0.m208345M0(this.f169863c, true);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ View m188546l(Drawable drawable, CharSequence charSequence, Integer num, Integer num2, Integer num3, Boolean bool) {
        return m188540f(this.f169863c, drawable, charSequence, num.intValue(), num2.intValue(), num3.intValue(), bool.booleanValue());
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m188547m(View view, VText_NoTopPadding vText_NoTopPadding, int[] iArr) {
        xdl0.C21104g c21104gM208382j0 = xdl0.m208382j0(view, this.f169869i);
        xdl0.C21104g c21104gM208382j1 = xdl0.m208382j0(vText_NoTopPadding, this.f169869i);
        float f = (c21104gM208382j0.f192418a - c21104gM208382j1.f192418a) + ((c21104gM208382j0.f192420c - c21104gM208382j1.f192420c) / 2.0f);
        float f2 = (c21104gM208382j0.f192419b - c21104gM208382j1.f192419b) - c21104gM208382j1.f192421d;
        vText_NoTopPadding.setTranslationX(f);
        vText_NoTopPadding.setTranslationY(f2);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m188548n(VText_NoTopPadding vText_NoTopPadding) {
        ViewGroup viewGroup;
        if (!NullChecker.m81303a(this.f169869i) || (viewGroup = (ViewGroup) vText_NoTopPadding.getParent()) == null) {
            return;
        }
        viewGroup.removeView(vText_NoTopPadding);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m188549o() {
        this.f169865e.setVisibility(8);
    }

    /* JADX INFO: renamed from: p */
    public final void m188550p(final View view, final VText_NoTopPadding vText_NoTopPadding) {
        xdl0.m208353Q0(vText_NoTopPadding, new e30() { // from class: l.seo
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f164024a.m188547m(view, vText_NoTopPadding, (int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final void m188551q() {
        ViewGroup viewGroup;
        View viewFindViewWithTag = this.f169869i.findViewWithTag("likeBoostBubble");
        if (viewFindViewWithTag == null || (viewGroup = (ViewGroup) viewFindViewWithTag.getParent()) == null) {
            return;
        }
        viewGroup.removeView(viewFindViewWithTag);
    }

    /* JADX INFO: renamed from: r */
    public final void m188552r(final VText_NoTopPadding vText_NoTopPadding, int i) {
        e51.m114743H(this.f169862b, new Runnable() { // from class: l.reo
            @Override // java.lang.Runnable
            public final void run() {
                this.f159073a.m188548n(vText_NoTopPadding);
            }
        }, i);
    }

    /* JADX INFO: renamed from: s */
    public void m188553s(int i) {
        if (CoreModule.f17545c.f19639e0.m169527p9().isBanned()) {
            return;
        }
        yfo.m214569h();
        Runnable runnable = this.f169871k;
        if (runnable != null) {
            e51.m114745J(runnable);
        }
        this.f169865e.setVisibility(0);
        this.f169865e.setOnClickListener(new View.OnClickListener() { // from class: l.neo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yfo.m214569h();
            }
        });
        Runnable runnable2 = new Runnable() { // from class: l.oeo
            @Override // java.lang.Runnable
            public final void run() {
                this.f143353a.m188549o();
            }
        };
        this.f169871k = runnable2;
        e51.m114743H(this.f169862b, runnable2, i);
        CoreMemberModule.m36001F().m132651b().mo35974O6();
    }

    /* JADX INFO: renamed from: t */
    public void m188554t(boolean z, String str) {
        View view = this.f169870j;
        if (view == null || this.f169864d == null) {
            return;
        }
        if (z && !xdl0.m208349O0(view)) {
            yfo.m214571j(str);
        }
        xdl0.m208411y(this.f169864d, z);
        xdl0.m208344M(this.f169870j, z);
    }

    /* JADX INFO: renamed from: u */
    public void m188555u(boolean z) {
        BoostViewContainer boostViewContainer = this.f169863c;
        if (boostViewContainer != null) {
            xdl0.m208345M0(boostViewContainer, z);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m188556v(boolean z) {
        if (this.f169864d != null) {
            hmb.m131701M(this.f169870j, !z);
        }
    }
}
