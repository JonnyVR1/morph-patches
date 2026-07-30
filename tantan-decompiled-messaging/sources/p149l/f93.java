package p149l;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.p046p1.mobile.putong.core.newui.view.boost.view.BoostRemainingCountViewOpt;
import com.p046p1.mobile.putong.core.p053ui.C8275a;
import com.p046p1.mobile.putong.core.p053ui.home.BounceButton;
import com.p046p1.mobile.putong.core.p053ui.vip.likers.LikersAct;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class f93 extends x53 {

    /* JADX INFO: renamed from: e */
    public c4g0 f96443e;

    /* JADX INFO: renamed from: f */
    public Runnable f96444f;

    /* JADX INFO: renamed from: g */
    public final d30 f96445g;

    /* JADX INFO: renamed from: h */
    public int f96446h;

    /* JADX INFO: renamed from: i */
    public v9j<String> f96447i;

    /* JADX INFO: renamed from: l.f93$a */
    public class C16777a implements C8275a.d {

        /* JADX INFO: renamed from: a */
        public View f96448a;

        public C16777a() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.C8275a.d
        /* JADX INFO: renamed from: a */
        public void mo37398a() {
            int iMo33375Nf = CoreModule.m29935P().m94651a().mo33375Nf();
            if (iMo33375Nf > 0) {
                release();
                this.f96448a = f93.this.f191083b.m110555j(iMo33375Nf);
            }
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.C8275a.d
        public void release() {
            f93.this.f191083b.m110550e(this.f96448a);
        }
    }

    public f93(@NonNull Act act, @NonNull final da3 da3Var) {
        super(act, da3Var);
        this.f96446h = -1;
        final boolean z = act instanceof LikersAct;
        this.f96445g = new d30() { // from class: l.z83
            @Override // p149l.d30
            public final void call() {
                f93.m120062v(z, da3Var);
            }
        };
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m120058r(View view, FrameLayout frameLayout, BoostRemainingCountViewOpt boostRemainingCountViewOpt, int[] iArr) {
        xdl0.C21104g c21104gM208382j0 = xdl0.m208382j0(view, frameLayout);
        xdl0.C21104g c21104gM208382j1 = xdl0.m208382j0(boostRemainingCountViewOpt, frameLayout);
        int i = c21104gM208382j0.f192418a + (c21104gM208382j0.f192420c / 2);
        int i2 = c21104gM208382j0.f192419b + (c21104gM208382j0.f192421d / 2);
        float paddingLeft = (i - frameLayout.getPaddingLeft()) - (c21104gM208382j1.f192420c / 2);
        float paddingTop = (i2 - frameLayout.getPaddingTop()) - (c21104gM208382j1.f192421d / 2);
        boostRemainingCountViewOpt.setTranslationX(paddingLeft);
        boostRemainingCountViewOpt.setTranslationY(paddingTop);
        boostRemainingCountViewOpt.m43822l(view, CoreModule.m29935P().m94651a().mo33375Nf());
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m120062v(final boolean z, da3 da3Var) {
        z93.m217663f(z);
        View viewM110554i = da3Var.m110554i();
        if (NullChecker.m81303a(viewM110554i)) {
            viewM110554i.setOnClickListener(new View.OnClickListener() { // from class: l.d93
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    z93.m217662e(z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: w */
    private void m120063w() {
        this.f96443e = j63.m139890j().m139895o(mkd0.m154955G(new e30() { // from class: l.e93
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f89918a.m120072x((Pair) obj);
            }
        }));
    }

    @Override // p149l.x53
    /* JADX INFO: renamed from: d */
    public void mo120064d() {
        e51.m114745J(this.f96444f);
        this.f96444f = null;
        mkd0.m154992z(this.f96443e);
        this.f96443e = null;
    }

    @Override // p149l.x53
    /* JADX INFO: renamed from: e */
    public void mo120065e() {
        View viewM110547b = this.f191083b.m110547b();
        if (NullChecker.m81303a(viewM110547b)) {
            xdl0.m208329E0(viewM110547b, new View.OnClickListener() { // from class: l.a93
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f68107a.m120073y(view);
                }
            });
            if (viewM110547b instanceof BounceButton) {
                ((BounceButton) viewM110547b).setLongPressingListener(new C16777a());
            }
        }
    }

    @Override // p149l.x53
    /* JADX INFO: renamed from: f */
    public void mo120066f() {
        m120063w();
    }

    @Override // p149l.x53
    /* JADX INFO: renamed from: k */
    public void mo120067k(v9j<String> v9jVar) {
        this.f96447i = v9jVar;
    }

    @Override // p149l.x53
    /* JADX INFO: renamed from: m */
    public void mo120068m(final FrameLayout frameLayout, final View view) {
        final BoostRemainingCountViewOpt boostRemainingCountViewOpt = (BoostRemainingCountViewOpt) this.f191082a.inflater().inflate(k6c0.f121373e, (ViewGroup) null);
        frameLayout.removeView(frameLayout.findViewWithTag("BoostRemainingOpt"));
        boostRemainingCountViewOpt.setTag("BoostRemainingOpt");
        frameLayout.addView(boostRemainingCountViewOpt, new FrameLayout.LayoutParams(-2, -2));
        xdl0.m208353Q0(boostRemainingCountViewOpt, new e30() { // from class: l.b93
            @Override // p149l.e30
            public final void call(Object obj) {
                f93.m120058r(view, frameLayout, boostRemainingCountViewOpt, (int[]) obj);
            }
        });
    }

    @Override // p149l.x53
    /* JADX INFO: renamed from: n */
    public void mo120069n(Act act, d30 d30Var, v9j<Boolean> v9jVar) {
        x93.m207471g(act, d30Var, v9jVar);
    }

    @Override // p149l.x53
    /* JADX INFO: renamed from: o */
    public void mo120070o(BoostViewContainer boostViewContainer) {
        int iMo33375Nf = CoreModule.m29935P().m94651a().mo33375Nf();
        if (iMo33375Nf <= 0) {
            return;
        }
        final String strM20908t = C4348d.m20896l().m20908t(new C4345a(this.f191082a).m20847B(t100.m186890d(2.0f)).m20849D(this.f191082a.getString(iMo33375Nf > 1 ? R$string.f20618V0 : R$string.f20616U0, String.valueOf(iMo33375Nf))).m20871l(t100.m186890d(7.0f)).m20874p(75).m20855J(13.0f).m20875q(C4345a.f15680N), boostViewContainer);
        e51.m114743H(this.f191082a, new Runnable() { // from class: l.c93
            @Override // java.lang.Runnable
            public final void run() {
                C4348d.m20896l().m20900k(strM20908t);
            }
        }, 1000L);
    }

    @Override // p149l.x53
    /* JADX INFO: renamed from: p */
    public void mo120071p(boolean z) {
        v9j<String> v9jVar = this.f96447i;
        x93.m207472h(this.f191082a, z, this.f96445g, false, v9jVar != null ? v9jVar.call() : "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m120072x(Pair pair) {
        if (((Integer) pair.first).intValue() == 1 && NullChecker.m81303a(pair.second)) {
            da3 da3Var = this.f191083b;
            Object obj = pair.second;
            da3Var.m110557l((CharSequence) ((xaj0) obj).f191751a, ((Integer) ((xaj0) obj).f191752b).intValue());
        } else {
            this.f191083b.m110556k();
        }
        if (this.f96446h == ((Integer) pair.first).intValue() || !NullChecker.m81303a(this.f191085d)) {
            return;
        }
        this.f191085d.m213529b(this.f96446h);
        int iIntValue = ((Integer) pair.first).intValue();
        this.f96446h = iIntValue;
        this.f191085d.mo123970a(iIntValue);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m120073y(View view) {
        if (CoreModule.f17545c.f19576J0.m139254F3()) {
            m73.m153331k(this.f191082a);
            return;
        }
        if (ew40.m118398j() || (CoreModule.f17557o.m195057d().mo33766Vd() && xma.m210040C3())) {
            CoreModule.f17545c.f19576J0.m139269V3();
            return;
        }
        if (CoreModule.m29935P().m94651a().mo33511he(this.f191082a) && CoreModule.m29935P().m94651a().mo33638zi(this.f191082a)) {
            CoreModule.m29935P().m94651a().mo33428Ue(this.f191082a, true);
            return;
        }
        z93.m217660c(this.f191082a);
        if (m207075j()) {
            return;
        }
        mo120071p(false);
    }
}
