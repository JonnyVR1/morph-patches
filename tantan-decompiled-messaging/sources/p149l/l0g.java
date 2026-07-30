package p149l;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.C0605k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p046p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.p046p1.mobile.putong.core.p053ui.seepage.likers.FakeLikersFrag;
import com.p046p1.mobile.putong.core.p053ui.seepage.likers.IntlFakeTurboItem;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.view.header.PicksHeaderView;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p133rx.C22306c;
import p147v.VButton_FakeShadow;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VProgressBar;
import p147v.VRecyclerView;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class l0g implements s7m<yzf> {

    /* JADX INFO: renamed from: a */
    public VFrame f125511a;

    /* JADX INFO: renamed from: b */
    public BoostViewContainer f125512b;

    /* JADX INFO: renamed from: c */
    public VLinear f125513c;

    /* JADX INFO: renamed from: d */
    public VNavigationBar f125514d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f125515e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f125516f;

    /* JADX INFO: renamed from: g */
    public VImage f125517g;

    /* JADX INFO: renamed from: h */
    public VText f125518h;

    /* JADX INFO: renamed from: i */
    public VProgressBar f125519i;

    /* JADX INFO: renamed from: j */
    public VRecyclerView f125520j;

    /* JADX INFO: renamed from: k */
    public VButton_FakeShadow f125521k;

    /* JADX INFO: renamed from: l */
    public VButton_FakeShadow f125522l;

    /* JADX INFO: renamed from: m */
    public ConstraintLayout f125523m;

    /* JADX INFO: renamed from: n */
    public Guideline f125524n;

    /* JADX INFO: renamed from: o */
    public Guideline f125525o;

    /* JADX INFO: renamed from: p */
    public Guideline f125526p;

    /* JADX INFO: renamed from: q */
    public ImageView f125527q;

    /* JADX INFO: renamed from: r */
    public ImageView f125528r;

    /* JADX INFO: renamed from: s */
    public yzf f125529s;

    /* JADX INFO: renamed from: t */
    public PutongAct f125530t;

    /* JADX INFO: renamed from: u */
    public FakeLikersFrag f125531u;

    /* JADX INFO: renamed from: y */
    public boolean f125535y;

    /* JADX INFO: renamed from: z */
    public C0605k f125536z;

    /* JADX INFO: renamed from: v */
    public boolean f125532v = false;

    /* JADX INFO: renamed from: w */
    public boolean f125533w = false;

    /* JADX INFO: renamed from: x */
    public int f125534x = 0;

    /* JADX INFO: renamed from: A */
    public boolean f125507A = false;

    /* JADX INFO: renamed from: B */
    public c4g0 f125508B = null;

    /* JADX INFO: renamed from: C */
    public boolean f125509C = false;

    /* JADX INFO: renamed from: D */
    public boolean f125510D = false;

    /* JADX INFO: renamed from: l.l0g$a */
    public class C18127a extends GridLayoutManager.AbstractC0553c {
        public C18127a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int i) {
            if (CoreModule.f17554l.m94651a().mo33529k() && i == 0) {
                return 2;
            }
            return (gr9.m127683h() && i == 1) ? 2 : 1;
        }
    }

    /* JADX INFO: renamed from: l.l0g$b */
    public class C18128b extends RecyclerView.AbstractC0582t {
        public C18128b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public /* synthetic */ void m148093f() {
            l0g.this.f125510D = false;
        }

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ void m148094i() {
            l0g.this.f125510D = false;
        }

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ void m148095j() {
            l0g.this.f125520j.stopScroll();
        }

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ void m148096k() {
            l0g.this.f125520j.smoothScrollToPosition(0);
            l0g.this.f125533w = false;
            l0g.this.f125534x = 0;
        }

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ void m148097l() {
            e51.m114741F(l0g.this.f125530t, new Runnable() { // from class: l.q0g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f152057a.m148096k();
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            l0g l0gVar = l0g.this;
            boolean z = true;
            if (i != 1 && i != 2) {
                z = false;
            }
            l0gVar.f125532v = z;
            if (!l0g.this.f125529s.m216670P0()) {
                l0g.this.f125533w = false;
            }
            l0g.this.f125534x = 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            boolean zM127683h = gr9.m127683h();
            l0g l0gVar = l0g.this;
            if (zM127683h) {
                if (!l0gVar.f125509C && recyclerView.computeVerticalScrollOffset() > t100.m186890d(600.0f)) {
                    l0g.this.f125509C = true;
                    l0g.this.f125510D = true;
                    l0g.this.f125529s.m216665I0(new d30() { // from class: l.m0g
                        @Override // p149l.d30
                        public final void call() {
                            this.f130734a.m148093f();
                        }
                    });
                    return;
                } else {
                    if (sjc0.m184481a(recyclerView) && sjc0.m184482b(recyclerView) && !l0g.this.f125510D) {
                        l0g.this.f125529s.m216665I0(new d30() { // from class: l.n0g
                            @Override // p149l.d30
                            public final void call() {
                                this.f136551a.m148094i();
                            }
                        });
                        return;
                    }
                    return;
                }
            }
            if (!l0gVar.f125532v || l0g.this.f125533w) {
                return;
            }
            l0g.this.f125534x += i2;
            if (!l0g.this.f125529s.m216670P0() || l0g.this.f125534x <= t100.m186890d(100.0f)) {
                return;
            }
            l0g.this.f125533w = true;
            e51.m114741F(l0g.this.f125530t, new Runnable() { // from class: l.o0g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f141335a.m148095j();
                }
            });
            l0g.this.f125529s.m216668N0("p_intl_plm,swipe", new d30() { // from class: l.p0g
                @Override // p149l.d30
                public final void call() {
                    this.f146598a.m148097l();
                }
            });
        }
    }

    public l0g(FakeLikersFrag fakeLikersFrag) {
        this.f125531u = fakeLikersFrag;
        this.f125530t = (PutongAct) fakeLikersFrag.act();
    }

    /* JADX INFO: renamed from: K */
    private void m148042K() {
        o6j0.m162864h("e_boost_button", this.f125530t.pageId(), o6j0.C18854a.m162879i("is_privileged", !CoreModule.m29935P().m94651a().mo33489e2()));
        View viewM148070G = m148070G(LayoutInflater.from(this.f125530t), this.f125514d.getRightIconContainer());
        m148068E(viewM148070G);
        this.f125514d.m223589z(viewM148070G);
        this.f125512b.m43690a(new y93() { // from class: l.g0g
            @Override // p149l.y93
            /* JADX INFO: renamed from: a */
            public final void mo123970a(int i) {
                this.f100041a.m148076N(i);
            }
        });
        this.f125512b.getBoostButton().setOnLongClickListener(new View.OnLongClickListener() { // from class: l.h0g
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f105216a.m148077O(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m148043S(View view) {
        this.f125529s.m216666J0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m148044T(View view) {
        this.f125529s.m216666J0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m148045U(View view) {
        if (!this.f125529s.m216670P0()) {
            this.f125529s.m216666J0();
        } else {
            zvf0.m220396r("e_intl_plm_button", "p_intl_plm");
            this.f125529s.m216667L0("p_intl_plm,e_intl_plm_button,click");
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m148057n(Throwable th) {
    }

    /* JADX INFO: renamed from: r */
    private void m148060r() {
        this.f125514d.setLeftIconAsBack(this.f125530t);
        this.f125514d.setLeftIconResource(b3c0.f73010b);
        if (CoreModule.f17545c.f19672p0.m173357e3()) {
            this.f125522l.setBackgroundResource(b3c0.f72932Q);
            this.f125522l.setTextColor(Color.parseColor(Constants.BLACK));
            xdl0.m208344M(this.f125522l, true);
            xdl0.m208329E0(this.f125522l, new View.OnClickListener() { // from class: l.zzf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f205798a.m148043S(view);
                }
            });
        } else if (this.f125529s.m216670P0()) {
            xdl0.m208344M(this.f125522l, true);
            if (this.f125529s.m216670P0()) {
                xdl0.m208335H0(this.f125522l, getAct().getResources().getString(R$string.f20593K));
            }
            xdl0.m208329E0(this.f125522l, new View.OnClickListener() { // from class: l.d0g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f83181a.m148045U(view);
                }
            });
        } else {
            xdl0.m208344M(this.f125521k, true);
            xdl0.m208329E0(this.f125521k, new View.OnClickListener() { // from class: l.c0g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f78144a.m148044T(view);
                }
            });
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f125530t, 2);
        gridLayoutManager.m3326v(new C18127a());
        this.f125520j.setLayoutManager(gridLayoutManager);
        this.f125520j.setAdapter(this.f125531u.m54960O4());
        this.f125520j.setOnScrollListener(new C18128b());
        this.f125531u.m54960O4().m191037U(new tyf.InterfaceC20312a() { // from class: l.e0g
            @Override // p149l.tyf.InterfaceC20312a
            /* JADX INFO: renamed from: a */
            public final void mo114179a(User user, int i) {
                this.f88570a.m148079Q(user, i);
            }
        });
        C0605k c0605k = new C0605k(new nyf(new nyf.InterfaceC18801a() { // from class: l.f0g
            @Override // p149l.nyf.InterfaceC18801a
            /* JADX INFO: renamed from: a */
            public final void mo119038a(View view, User user, int i, boolean z, int i2) {
                this.f93979a.m148080R(view, user, i, z, i2);
            }
        }));
        this.f125536z = c0605k;
        c0605k.m3750g(this.f125520j);
        if (gr9.m127683h()) {
            xdl0.m208360X(this.f125523m, t100.f167240O);
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f125530t;
    }

    /* JADX INFO: renamed from: E */
    public final void m148068E(View view) {
        s0g.m181860a(this, view);
    }

    /* JADX INFO: renamed from: F */
    public View m148069F(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return r0g.m177398b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: G */
    public View m148070G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return s0g.m181861b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(yzf yzfVar) {
        this.f125529s = yzfVar;
    }

    /* JADX INFO: renamed from: I */
    public void m148072I(boolean z) {
        if (z && !xdl0.m208349O0(this.f125512b)) {
            o6j0.m162864h("e_intl_plm_turbo_button", this.f125530t.pageId(), new o6j0.C18854a[0]);
        }
        xdl0.m208411y(this.f125512b, z);
        xdl0.m208344M(this.f125512b, z);
    }

    /* JADX INFO: renamed from: J */
    public PicksHeaderView m148073J() {
        return (PicksHeaderView) this.f125520j.findViewById(x4c0.f191015z);
    }

    /* JADX INFO: renamed from: L */
    public final void m148074L() {
        View viewM148070G = m148070G(LayoutInflater.from(this.f125530t), this.f125514d.getRightIconContainer());
        m148068E(viewM148070G);
        this.f125514d.m223589z(viewM148070G);
        xdl0.m208344M(this.f125512b, false);
        xdl0.m208329E0(this.f125512b.getBoostButton(), new View.OnClickListener() { // from class: l.i0g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f110324a.m148078P(view);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m148075M() {
        this.f125512b.m43696g(true);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m148076N(int i) {
        if (i == 2) {
            CoreModule.m29935P().m94651a().mo33331Hc(this.f125530t, new d30() { // from class: l.b0g
                @Override // p149l.d30
                public final void call() {
                    this.f72433a.m148075M();
                }
            }, null);
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ boolean m148077O(View view) {
        if (CoreModule.f17545c.f19576J0.m139254F3()) {
            return true;
        }
        C4348d.m20896l().m20900k("boost_see_page_guide");
        this.f125512b.m43695f();
        return true;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m148078P(View view) {
        o6j0.m162859c("e_intl_plm_turbo_button", this.f125530t.pageId(), new o6j0.C18854a[0]);
        ura.m195053e().m195057d().mo33695Hb(this.f125530t, false, "p_intl_plm,e_intl_plm_turbo_button,click", null);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m148079Q(User user, int i) {
        if (!this.f125529s.m216670P0()) {
            this.f125529s.m216664H0(user);
        } else {
            zvf0.m220396r("e_intl_plm_card", "p_intl_plm");
            this.f125529s.m216667L0("p_intl_plm,e_intl_plm_card,click");
        }
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m148080R(View view, User user, int i, boolean z, int i2) {
        this.f125531u.m54960O4().notifyDataSetChanged();
        if (this.f125529s.m216670P0()) {
            if (view instanceof IntlFakeTurboItem) {
                ((IntlFakeTurboItem) view).m54979n0(i2, this.f125530t);
                return;
            } else {
                zvf0.m220396r("e_intl_plm_card", "p_intl_plm");
                this.f125529s.m216667L0("p_intl_plm,e_intl_plm_card,swipe");
                return;
            }
        }
        if (i == 2 || i == 4 || !z) {
            return;
        }
        this.f125529s.m216664H0(user);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m148081V() {
        this.f125531u.m54960O4().m191029L(true);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m148082W(View view) {
        if (NullChecker.m81303a(this.f125531u) && NullChecker.m81303a(view)) {
            User userNew_ = User.new_();
            userNew_.name = "intlSeeListAd";
            userNew_.f56011id = "intlSeeListAd";
            this.f125531u.m54960O4().m191028K(userNew_, 3, view);
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m148083X(List<User> list) {
        if (NullChecker.m81303a(this.f125508B)) {
            if (NullChecker.m81303a(this.f125531u.m54960O4().f172595l)) {
                list.add(3, this.f125531u.m54960O4().f172595l);
            }
        } else {
            C22306c<View> c22306cMo33303Dc = CoreModule.f17554l.m94651a().mo33303Dc(this.f125530t, new d30() { // from class: l.j0g
                @Override // p149l.d30
                public final void call() {
                    this.f115674a.m148081V();
                }
            });
            if (NullChecker.m81303a(c22306cMo33303Dc)) {
                this.f125508B = c22306cMo33303Dc.subscribe(mkd0.m154956H(new e30() { // from class: l.k0g
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f120484a.m148082W((View) obj);
                    }
                }, new e30() { // from class: l.a0g
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        l0g.m148057n((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m148084Y(List<User> list) {
        if (!NullChecker.m81303a(list) || list.size() < 4) {
            m148072I(false);
        } else {
            m148072I(true);
            m148083X(list);
        }
        this.f125531u.m54960O4().m191038V(list);
        this.f125531u.m54960O4().notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: Z */
    public void m148085Z(int i) {
        this.f125514d.setTitle(i);
    }

    /* JADX INFO: renamed from: a0 */
    public void m148086a0(CharSequence charSequence) {
        this.f125514d.setTitle(charSequence);
    }

    /* JADX INFO: renamed from: b0 */
    public void m148087b0() {
        if (!this.f125535y && !this.f125507A) {
            this.f125535y = true;
            qae0.m173732d(getAct(), this.f125527q, this.f125528r, this.f125523m);
        }
        if (CoreModule.f17554l.m94651a().mo33440X6() || !NullChecker.m81303a(this.f125512b)) {
            return;
        }
        if (CoreModule.m29935P().m94651a().mo33586s8()) {
            CoreModule.f17554l.m94651a().mo33578ri();
        } else {
            this.f125512b.m43693d(this.f125511a);
        }
        CoreMemberModule.m36001F().m132651b().mo35977Qe(getAct(), this.f125512b);
    }

    @Override // p149l.s7m
    public void destroy() {
        if (NullChecker.m81303a(this.f125531u)) {
            this.f125531u.m54960O4().m191029L(false);
        }
        if (NullChecker.m81303a(this.f125508B)) {
            mkd0.m154992z(this.f125508B);
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM148069F = m148069F(layoutInflater, viewGroup);
        m148060r();
        if (!this.f125529s.m216670P0()) {
            m148042K();
            return viewM148069F;
        }
        m148074L();
        xdl0.m208368c0(this.f125520j, t100.m186890d(90.0f));
        return viewM148069F;
    }
}
