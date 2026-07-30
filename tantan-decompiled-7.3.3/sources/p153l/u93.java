package p153l;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.p051p1.mobile.putong.core.newui.view.boost.view.BoostRemainingCountViewOpt;
import com.p051p1.mobile.putong.core.p058ui.C8438a;
import com.p051p1.mobile.putong.core.p058ui.home.BounceButton;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.LikersAct;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class u93 extends n63 {

    /* JADX INFO: renamed from: e */
    public kcg0 f178085e;

    /* JADX INFO: renamed from: f */
    public Runnable f178086f;

    /* JADX INFO: renamed from: g */
    public final x20 f178087g;

    /* JADX INFO: renamed from: h */
    public int f178088h;

    /* JADX INFO: renamed from: i */
    public pcj<String> f178089i;

    /* JADX INFO: renamed from: l.u93$a */
    public class C20526a implements C8438a.d {

        /* JADX INFO: renamed from: a */
        public View f178090a;

        public C20526a() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.C8438a.d
        /* JADX INFO: renamed from: a */
        public void mo38401a() {
            int iMo34378Nf = CoreModule.m30933P().m143405a().mo34378Nf();
            if (iMo34378Nf > 0) {
                release();
                this.f178090a = u93.this.f140424b.m185262j(iMo34378Nf);
            }
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.C8438a.d
        public void release() {
            u93.this.f140424b.m185257e(this.f178090a);
        }
    }

    public u93(@NonNull Act act, @NonNull final sa3 sa3Var) {
        super(act, sa3Var);
        this.f178088h = -1;
        final boolean z = act instanceof LikersAct;
        this.f178087g = new x20() { // from class: l.o93
            @Override // p153l.x20
            public final void call() {
                u93.m195079v(z, sa3Var);
            }
        };
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m195075r(View view, FrameLayout frameLayout, BoostRemainingCountViewOpt boostRemainingCountViewOpt, int[] iArr) {
        bnl0.C16067g c16067gM105562j0 = bnl0.m105562j0(view, frameLayout);
        bnl0.C16067g c16067gM105562j1 = bnl0.m105562j0(boostRemainingCountViewOpt, frameLayout);
        int i = c16067gM105562j0.f77559a + (c16067gM105562j0.f77561c / 2);
        int i2 = c16067gM105562j0.f77560b + (c16067gM105562j0.f77562d / 2);
        float paddingLeft = (i - frameLayout.getPaddingLeft()) - (c16067gM105562j1.f77561c / 2);
        float paddingTop = (i2 - frameLayout.getPaddingTop()) - (c16067gM105562j1.f77562d / 2);
        boostRemainingCountViewOpt.setTranslationX(paddingLeft);
        boostRemainingCountViewOpt.setTranslationY(paddingTop);
        boostRemainingCountViewOpt.m45008l(view, CoreModule.m30933P().m143405a().mo34378Nf());
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m195079v(final boolean z, sa3 sa3Var) {
        oa3.m166824f(z);
        View viewM185261i = sa3Var.m185261i();
        if (NullChecker.m82486a(viewM185261i)) {
            viewM185261i.setOnClickListener(new View.OnClickListener() { // from class: l.s93
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    oa3.m166823e(z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: w */
    private void m195080w() {
        this.f178085e = y63.m214366j().m214372p(psd0.m173596G(new y20() { // from class: l.t93
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f172605a.m195081x((Pair) obj);
            }
        }));
    }

    @Override // p153l.n63
    /* JADX INFO: renamed from: d */
    public void mo119977d() {
        l51.m152890J(this.f178086f);
        this.f178086f = null;
        psd0.m173633z(this.f178085e);
        this.f178085e = null;
    }

    @Override // p153l.n63
    /* JADX INFO: renamed from: e */
    public void mo119978e() {
        View viewM185254b = this.f140424b.m185254b();
        if (NullChecker.m82486a(viewM185254b)) {
            bnl0.m105509E0(viewM185254b, new View.OnClickListener() { // from class: l.p93
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f151088a.m195082y(view);
                }
            });
            if (viewM185254b instanceof BounceButton) {
                ((BounceButton) viewM185254b).setLongPressingListener(new C20526a());
            }
        }
    }

    @Override // p153l.n63
    /* JADX INFO: renamed from: f */
    public void mo119979f() {
        m195080w();
    }

    @Override // p153l.n63
    /* JADX INFO: renamed from: k */
    public void mo119980k(pcj<String> pcjVar) {
        this.f178089i = pcjVar;
    }

    @Override // p153l.n63
    /* JADX INFO: renamed from: m */
    public void mo119981m(final FrameLayout frameLayout, final View view) {
        final BoostRemainingCountViewOpt boostRemainingCountViewOpt = (BoostRemainingCountViewOpt) this.f140423a.inflater().inflate(pec0.f151981e, (ViewGroup) null);
        frameLayout.removeView(frameLayout.findViewWithTag("BoostRemainingOpt"));
        boostRemainingCountViewOpt.setTag("BoostRemainingOpt");
        frameLayout.addView(boostRemainingCountViewOpt, new FrameLayout.LayoutParams(-2, -2));
        bnl0.m105533Q0(boostRemainingCountViewOpt, new y20() { // from class: l.q93
            @Override // p153l.y20
            public final void call(Object obj) {
                u93.m195075r(view, frameLayout, boostRemainingCountViewOpt, (int[]) obj);
            }
        });
    }

    @Override // p153l.n63
    /* JADX INFO: renamed from: n */
    public void mo119982n(Act act, x20 x20Var, pcj<Boolean> pcjVar) {
        ma3.m157624g(act, x20Var, pcjVar);
    }

    @Override // p153l.n63
    /* JADX INFO: renamed from: o */
    public void mo119983o(BoostViewContainer boostViewContainer) {
        int iMo34378Nf = CoreModule.m30933P().m143405a().mo34378Nf();
        if (iMo34378Nf <= 0) {
            return;
        }
        final String strM21907t = C4499d.m21895l().m21907t(new C4496a(this.f140423a).m21846B(qa00.m175859d(2.0f)).m21848D(this.f140423a.getString(iMo34378Nf > 1 ? R$string.f21360V0 : R$string.f21358U0, String.valueOf(iMo34378Nf))).m21870l(qa00.m175859d(7.0f)).m21873p(75).m21854J(13.0f).m21874q(C4496a.f16399N), boostViewContainer);
        l51.m152888H(this.f140423a, new Runnable() { // from class: l.r93
            @Override // java.lang.Runnable
            public final void run() {
                C4499d.m21895l().m21899k(strM21907t);
            }
        }, 1000L);
    }

    @Override // p153l.n63
    /* JADX INFO: renamed from: p */
    public void mo119984p(boolean z) {
        pcj<String> pcjVar = this.f178089i;
        ma3.m157625h(this.f140423a, z, this.f178087g, false, pcjVar != null ? pcjVar.call() : "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m195081x(Pair pair) {
        if (((Integer) pair.first).intValue() == 1 && NullChecker.m82486a(pair.second)) {
            sa3 sa3Var = this.f140424b;
            Object obj = pair.second;
            sa3Var.m185264l((CharSequence) ((bkj0) obj).f77081a, ((Integer) ((bkj0) obj).f77082b).intValue());
        } else {
            this.f140424b.m185263k();
        }
        if (this.f178088h == ((Integer) pair.first).intValue() || !NullChecker.m82486a(this.f140426d)) {
            return;
        }
        this.f140426d.m162055b(this.f178088h);
        int iIntValue = ((Integer) pair.first).intValue();
        this.f178088h = iIntValue;
        this.f140426d.mo115522a(iIntValue);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m195082y(View view) {
        if (CoreModule.f18264c.f20318J0.m156766F3()) {
            b83.m102909k(this.f140423a);
            return;
        }
        if (t450.m189175j() || (CoreModule.f18276o.m132214d().mo34769Vd() && joa.m146354D3())) {
            CoreModule.f18264c.f20318J0.m156781V3();
            return;
        }
        if (CoreModule.m30933P().m143405a().mo34514he(this.f140423a) && CoreModule.m30933P().m143405a().mo34641zi(this.f140423a)) {
            CoreModule.m30933P().m143405a().mo34431Ue(this.f140423a, true);
            return;
        }
        oa3.m166821c(this.f140423a);
        if (m161756j()) {
            return;
        }
        mo119984p(false);
    }
}
