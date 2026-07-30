package p153l;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p051p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.sunshine.engine.particle.SceneView;
import com.tantanapp.common.utils.NullChecker;
import java.util.Objects;
import p151v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes11.dex */
public class tgo {

    /* JADX INFO: renamed from: a */
    public final pio f174106a;

    /* JADX INFO: renamed from: b */
    public final Act f174107b;

    /* JADX INFO: renamed from: c */
    public final BoostViewContainer f174108c;

    /* JADX INFO: renamed from: d */
    public final BoostViewContainer f174109d;

    /* JADX INFO: renamed from: e */
    public final VText_NoTopPadding f174110e;

    /* JADX INFO: renamed from: f */
    public final FrameLayout f174111f;

    /* JADX INFO: renamed from: g */
    public final SceneView f174112g;

    /* JADX INFO: renamed from: h */
    public final ViewGroup f174113h;

    /* JADX INFO: renamed from: i */
    public final ViewGroup f174114i;

    /* JADX INFO: renamed from: j */
    public final View f174115j;

    /* JADX INFO: renamed from: k */
    public Runnable f174116k;

    public tgo(pio pioVar, Act act, BoostViewContainer boostViewContainer, BoostViewContainer boostViewContainer2, VText_NoTopPadding vText_NoTopPadding, FrameLayout frameLayout, SceneView sceneView, ViewGroup viewGroup, ViewGroup viewGroup2, View view) {
        this.f174106a = pioVar;
        this.f174107b = act;
        this.f174108c = boostViewContainer;
        this.f174109d = boostViewContainer2;
        this.f174110e = vText_NoTopPadding;
        this.f174111f = frameLayout;
        this.f174112g = sceneView;
        this.f174113h = viewGroup;
        this.f174114i = viewGroup2;
        this.f174115j = view;
    }

    /* JADX INFO: renamed from: f */
    public final View m191049f(View view, Drawable drawable, CharSequence charSequence, int i, int i2, int i3, boolean z) {
        C4499d.m21895l().m21899k("boost_see_page_guide");
        if (this.f174110e.getVisibility() == 0) {
            this.f174110e.setVisibility(8);
        }
        m191060q();
        VText_NoTopPadding vText_NoTopPaddingM191052i = m191052i(drawable, charSequence, i, i2, z);
        this.f174113h.addView(vText_NoTopPaddingM191052i, new FrameLayout.LayoutParams(-2, -2));
        m191059p(view, vText_NoTopPaddingM191052i);
        if (i3 != -1) {
            m191061r(vText_NoTopPaddingM191052i, i3);
        }
        return vText_NoTopPaddingM191052i;
    }

    /* JADX INFO: renamed from: g */
    public void m191050g(boolean z) {
        VText_NoTopPadding vText_NoTopPadding = this.f174110e;
        if (vText_NoTopPadding != null) {
            bnl0.m105524M(vText_NoTopPadding, z);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m191051h() {
        CoreMemberModule.m37004F().m187693b().mo36980Qe(this.f174107b, this.f174108c);
    }

    /* JADX INFO: renamed from: i */
    public final VText_NoTopPadding m191052i(Drawable drawable, CharSequence charSequence, int i, int i2, boolean z) {
        VText_NoTopPadding vText_NoTopPadding = new VText_NoTopPadding(this.f174107b);
        vText_NoTopPadding.setTag("likeBoostBubble");
        vText_NoTopPadding.setTextColor(i);
        vText_NoTopPadding.setTextSize(i2);
        vText_NoTopPadding.setGravity(17);
        vText_NoTopPadding.setText(charSequence);
        vText_NoTopPadding.setBackground(drawable);
        if (!z) {
            vText_NoTopPadding.setPadding(qa00.m175859d(18.0f), qa00.m175859d(17.0f), qa00.m175859d(18.0f), qa00.m175859d(21.0f));
        }
        return vText_NoTopPadding;
    }

    /* JADX INFO: renamed from: j */
    public void m191053j() {
        SceneView sceneView = this.f174112g;
        if (sceneView != null) {
            bnl0.m105524M(sceneView, false);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m191054k() {
        BoostViewContainer boostViewContainer = this.f174108c;
        final ViewGroup viewGroup = this.f174113h;
        Objects.requireNonNull(viewGroup);
        boostViewContainer.m44877b(new y20() { // from class: l.pgo
            @Override // p153l.y20
            public final void call(Object obj) {
                viewGroup.removeView((View) obj);
            }
        }, new vcj() { // from class: l.qgo
            @Override // p153l.vcj
            /* JADX INFO: renamed from: a */
            public final Object mo103927a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                return this.f157445a.m191055l((Drawable) obj, (CharSequence) obj2, (Integer) obj3, (Integer) obj4, (Integer) obj5, (Boolean) obj6);
            }
        });
        this.f174108c.setSceneView(this.f174112g);
        bnl0.m105525M0(this.f174108c, true);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ View m191055l(Drawable drawable, CharSequence charSequence, Integer num, Integer num2, Integer num3, Boolean bool) {
        return m191049f(this.f174108c, drawable, charSequence, num.intValue(), num2.intValue(), num3.intValue(), bool.booleanValue());
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m191056m(View view, VText_NoTopPadding vText_NoTopPadding, int[] iArr) {
        bnl0.C16067g c16067gM105562j0 = bnl0.m105562j0(view, this.f174114i);
        bnl0.C16067g c16067gM105562j1 = bnl0.m105562j0(vText_NoTopPadding, this.f174114i);
        float f = (c16067gM105562j0.f77559a - c16067gM105562j1.f77559a) + ((c16067gM105562j0.f77561c - c16067gM105562j1.f77561c) / 2.0f);
        float f2 = (c16067gM105562j0.f77560b - c16067gM105562j1.f77560b) - c16067gM105562j1.f77562d;
        vText_NoTopPadding.setTranslationX(f);
        vText_NoTopPadding.setTranslationY(f2);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m191057n(VText_NoTopPadding vText_NoTopPadding) {
        ViewGroup viewGroup;
        if (!NullChecker.m82486a(this.f174114i) || (viewGroup = (ViewGroup) vText_NoTopPadding.getParent()) == null) {
            return;
        }
        viewGroup.removeView(vText_NoTopPadding);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m191058o() {
        this.f174110e.setVisibility(8);
    }

    /* JADX INFO: renamed from: p */
    public final void m191059p(final View view, final VText_NoTopPadding vText_NoTopPadding) {
        bnl0.m105533Q0(vText_NoTopPadding, new y20() { // from class: l.sgo
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f167906a.m191056m(view, vText_NoTopPadding, (int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final void m191060q() {
        ViewGroup viewGroup;
        View viewFindViewWithTag = this.f174114i.findViewWithTag("likeBoostBubble");
        if (viewFindViewWithTag == null || (viewGroup = (ViewGroup) viewFindViewWithTag.getParent()) == null) {
            return;
        }
        viewGroup.removeView(viewFindViewWithTag);
    }

    /* JADX INFO: renamed from: r */
    public final void m191061r(final VText_NoTopPadding vText_NoTopPadding, int i) {
        l51.m152888H(this.f174107b, new Runnable() { // from class: l.rgo
            @Override // java.lang.Runnable
            public final void run() {
                this.f163027a.m191057n(vText_NoTopPadding);
            }
        }, i);
    }

    /* JADX INFO: renamed from: s */
    public void m191062s(int i) {
        if (CoreModule.f18264c.f20381e0.m116600p9().isBanned()) {
            return;
        }
        yho.m215981h();
        Runnable runnable = this.f174116k;
        if (runnable != null) {
            l51.m152890J(runnable);
        }
        this.f174110e.setVisibility(0);
        this.f174110e.setOnClickListener(new View.OnClickListener() { // from class: l.ngo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yho.m215981h();
            }
        });
        Runnable runnable2 = new Runnable() { // from class: l.ogo
            @Override // java.lang.Runnable
            public final void run() {
                this.f147296a.m191058o();
            }
        };
        this.f174116k = runnable2;
        l51.m152888H(this.f174107b, runnable2, i);
        CoreMemberModule.m37004F().m187693b().mo36977O6();
    }

    /* JADX INFO: renamed from: t */
    public void m191063t(boolean z, String str) {
        View view = this.f174115j;
        if (view == null || this.f174109d == null) {
            return;
        }
        if (z && !bnl0.m105529O0(view)) {
            yho.m215983j(str);
        }
        bnl0.m105591y(this.f174109d, z);
        bnl0.m105524M(this.f174115j, z);
    }

    /* JADX INFO: renamed from: u */
    public void m191064u(boolean z) {
        BoostViewContainer boostViewContainer = this.f174108c;
        if (boostViewContainer != null) {
            bnl0.m105525M0(boostViewContainer, z);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m191065v(boolean z) {
        if (this.f174109d != null) {
            vnb.m201946M(this.f174115j, !z);
        }
    }
}
