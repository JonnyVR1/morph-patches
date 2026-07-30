package p009l;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.p000p1.mobile.putong.core.newui.view.boost.view.BoostRemainingCountViewOpt;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.member.R;
import com.p1.mobile.putong.core.ui.a;
import com.p1.mobile.putong.core.ui.home.BounceButton;
import com.p1.mobile.putong.core.ui.vip.likers.LikersAct;
import com.tantanapp.common.utils.NullChecker;
import l.c4g0;
import l.d30;
import l.e30;
import l.e51;
import l.ew40;
import l.j63;
import l.k6c0;
import l.m73;
import l.mkd0;
import l.t100;
import l.v9j;
import l.x93;
import l.xaj0;
import l.xdl0;
import l.xma;
import l.z93;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class f93 extends x53 {

    /* JADX INFO: renamed from: e */
    public c4g0 f12869e;

    /* JADX INFO: renamed from: f */
    public Runnable f12870f;

    /* JADX INFO: renamed from: g */
    public final d30 f12871g;

    /* JADX INFO: renamed from: h */
    public int f12872h;

    /* JADX INFO: renamed from: i */
    public v9j<String> f12873i;

    /* JADX INFO: renamed from: l.f93$a */
    public class C0891a implements a.d {

        /* JADX INFO: renamed from: a */
        public View f12874a;

        public C0891a() {
        }

        /* JADX INFO: renamed from: a */
        public void m14332a() {
            int iNf = CoreModule.P().a().Nf();
            if (iNf > 0) {
                release();
                this.f12874a = f93.this.f22436b.m13031j(iNf);
            }
        }

        public void release() {
            f93.this.f22436b.m13026e(this.f12874a);
        }
    }

    public f93(@NonNull Act act, @NonNull final da3 da3Var) {
        super(act, da3Var);
        this.f12872h = -1;
        final boolean z = act instanceof LikersAct;
        this.f12871g = new d30() { // from class: l.z83
            public final void call() {
                f93.m14320v(z, da3Var);
            }
        };
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m14316r(View view, FrameLayout frameLayout, BoostRemainingCountViewOpt boostRemainingCountViewOpt, int[] iArr) {
        xdl0.g gVarJ0 = xdl0.j0(view, frameLayout);
        xdl0.g gVarJ1 = xdl0.j0(boostRemainingCountViewOpt, frameLayout);
        int i = gVarJ0.a + (gVarJ0.c / 2);
        int i2 = gVarJ0.b + (gVarJ0.d / 2);
        float paddingLeft = (i - frameLayout.getPaddingLeft()) - (gVarJ1.c / 2);
        float paddingTop = (i2 - frameLayout.getPaddingTop()) - (gVarJ1.d / 2);
        boostRemainingCountViewOpt.setTranslationX(paddingLeft);
        boostRemainingCountViewOpt.setTranslationY(paddingTop);
        boostRemainingCountViewOpt.m8086l(view, CoreModule.P().a().Nf());
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m14320v(final boolean z, da3 da3Var) {
        z93.f(z);
        View viewM13030i = da3Var.m13030i();
        if (NullChecker.a(viewM13030i)) {
            viewM13030i.setOnClickListener(new View.OnClickListener() { // from class: l.d93
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    z93.e(z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: w */
    private void m14321w() {
        this.f12869e = j63.j().o(mkd0.G(new e30() { // from class: l.e93
            public final void call(Object obj) {
                this.f12452a.m14330x((Pair) obj);
            }
        }));
    }

    @Override // p009l.x53
    /* JADX INFO: renamed from: d */
    public void mo14322d() {
        e51.J(this.f12870f);
        this.f12870f = null;
        mkd0.z(this.f12869e);
        this.f12869e = null;
    }

    @Override // p009l.x53
    /* JADX INFO: renamed from: e */
    public void mo14323e() {
        BounceButton bounceButtonM13023b = this.f22436b.m13023b();
        if (NullChecker.a(bounceButtonM13023b)) {
            xdl0.E0(bounceButtonM13023b, new View.OnClickListener() { // from class: l.a93
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9332a.m14331y(view);
                }
            });
            if (bounceButtonM13023b instanceof BounceButton) {
                bounceButtonM13023b.setLongPressingListener(new C0891a());
            }
        }
    }

    @Override // p009l.x53
    /* JADX INFO: renamed from: f */
    public void mo14324f() {
        m14321w();
    }

    @Override // p009l.x53
    /* JADX INFO: renamed from: k */
    public void mo14325k(v9j<String> v9jVar) {
        this.f12873i = v9jVar;
    }

    @Override // p009l.x53
    /* JADX INFO: renamed from: m */
    public void mo14326m(final FrameLayout frameLayout, final View view) {
        final BoostRemainingCountViewOpt boostRemainingCountViewOpt = (BoostRemainingCountViewOpt) this.f22435a.inflater().inflate(k6c0.e, (ViewGroup) null);
        frameLayout.removeView(frameLayout.findViewWithTag("BoostRemainingOpt"));
        boostRemainingCountViewOpt.setTag("BoostRemainingOpt");
        frameLayout.addView(boostRemainingCountViewOpt, new FrameLayout.LayoutParams(-2, -2));
        xdl0.Q0(boostRemainingCountViewOpt, new e30() { // from class: l.b93
            public final void call(Object obj) {
                f93.m14316r(view, frameLayout, boostRemainingCountViewOpt, (int[]) obj);
            }
        });
    }

    @Override // p009l.x53
    /* JADX INFO: renamed from: n */
    public void mo14327n(Act act, d30 d30Var, v9j<Boolean> v9jVar) {
        x93.g(act, d30Var, v9jVar);
    }

    @Override // p009l.x53
    /* JADX INFO: renamed from: o */
    public void mo14328o(BoostViewContainer boostViewContainer) {
        int iNf = CoreModule.P().a().Nf();
        if (iNf <= 0) {
            return;
        }
        final String strT = d.l().t(new com.p1.mobile.android.ui.bubble.a(this.f22435a).B(t100.d(2.0f)).D(this.f22435a.getString(iNf > 1 ? R.string.V0 : R.string.U0, String.valueOf(iNf))).l(t100.d(7.0f)).p(75).J(13.0f).q(com.p1.mobile.android.ui.bubble.a.N), boostViewContainer);
        e51.H(this.f22435a, new Runnable() { // from class: l.c93
            @Override // java.lang.Runnable
            public final void run() {
                d.l().k(strT);
            }
        }, 1000L);
    }

    @Override // p009l.x53
    /* JADX INFO: renamed from: p */
    public void mo14329p(boolean z) {
        v9j<String> v9jVar = this.f12873i;
        x93.h(this.f22435a, z, this.f12871g, false, v9jVar != null ? (String) v9jVar.call() : "");
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m14330x(Pair pair) {
        if (((Integer) pair.first).intValue() == 1 && NullChecker.a(pair.second)) {
            da3 da3Var = this.f22436b;
            Object obj = pair.second;
            da3Var.m13033l((CharSequence) ((xaj0) obj).a, ((Integer) ((xaj0) obj).b).intValue());
        } else {
            this.f22436b.m13032k();
        }
        if (this.f12872h == ((Integer) pair.first).intValue() || !NullChecker.a(this.f22438d)) {
            return;
        }
        this.f22438d.m25205b(this.f12872h);
        int iIntValue = ((Integer) pair.first).intValue();
        this.f12872h = iIntValue;
        this.f22438d.mo15344a(iIntValue);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m14331y(View view) {
        if (CoreModule.c.J0.F3()) {
            m73.k(this.f22435a);
            return;
        }
        if (ew40.j() || (CoreModule.o.d().Vd() && xma.C3())) {
            CoreModule.c.J0.V3();
            return;
        }
        if (CoreModule.P().a().he(this.f22435a) && CoreModule.P().a().zi(this.f22435a)) {
            CoreModule.P().a().Ue(this.f22435a, true);
            return;
        }
        z93.c(this.f22435a);
        if (m24726j()) {
            return;
        }
        mo14329p(false);
    }
}
