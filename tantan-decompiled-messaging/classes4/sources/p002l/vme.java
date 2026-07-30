package p002l;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.lqa;
import l.mcr;
import l.o6j0;
import l.upa;
import l.wn90;
import l.x2c0;
import l.xdl0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class vme extends tme {

    /* JADX INFO: renamed from: S */
    public z0m f21222S;

    /* JADX INFO: renamed from: T */
    public nne f21223T;

    public vme(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public /* synthetic */ void m24066T0() {
        o6j0.c("e_edit_profile_my_info", "p_edit_profile_view", new o6j0.a[]{o6j0.a.h("edit_profile_my_info_name", "self_introduction")});
        LoopFragmentFactory.m1957S(mo3351O().m9268i2(), mo3351O().mo1514J1(), LoopInputType.SIGNATURE);
    }

    @Override // p002l.zp90
    /* JADX INFO: renamed from: f0 */
    public void mo10543f0(int i) {
        super.mo10543f0(i);
        VText vTextMo11152L = this.f21222S.mo11152L();
        if (vTextMo11152L != null) {
            vTextMo11152L.setText(R.string.Jk);
        }
    }

    @Override // p002l.zp90
    /* JADX INFO: renamed from: g0 */
    public void mo10544g0(int i) {
        this.f23539C.setHint(i);
        VText vTextMo11151K = this.f21222S.mo11151K();
        if (vTextMo11151K != null) {
            if (i == R.string.Qk) {
                vTextMo11151K.setText(R.string.Pk);
            } else if (i == R.string.Mk) {
                vTextMo11151K.setText(R.string.Lk);
            } else if (i == R.string.Rk) {
                vTextMo11151K.setText(R.string.Sk);
            }
        }
    }

    @Override // p002l.zp90
    /* JADX INFO: renamed from: h0 */
    public void mo10545h0(int i) {
        super.mo10545h0(i);
        VText vTextMo11172c0 = this.f21222S.mo11172c0();
        if (vTextMo11172c0 != null) {
            vTextMo11172c0.setText(R.string.Vk);
        }
    }

    @Override // p002l.tme, p002l.zp90, p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        this.f21222S.mo11173d().setTypeface(Typeface.DEFAULT_BOLD);
        m9651Q(this.f21222S.mo11187o(), 0);
        m9649N(this.f21222S.mo11187o(), new d30() { // from class: l.ume
            public final void call() {
                this.f20719a.m24066T0();
            }
        }, true);
        this.f21222S.mo11177f().setText(CoreModule.b.getString(R.string.Ok));
        xdl0.M(this.f21222S.mo11184l(), false);
        if (NullChecker.a(this.f21223T)) {
            this.f21223T.mo3279j(view);
        }
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: k */
    public boolean mo2919k() {
        return false;
    }

    @Override // p002l.tme, p002l.zp90, p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        if (mo3351O().mo1570m0()) {
            return mo3351O().mo1501D2() || mo3351O().mo1530S();
        }
        return false;
    }

    @Override // p002l.zp90, p002l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        View viewM21493f0;
        if (upa.L3()) {
            coa0 coa0Var = new coa0();
            this.f21222S = coa0Var;
            viewM21493f0 = coa0Var.m11178f0(mo3351O().mo9267H2(), viewGroup);
        } else {
            qpa0 qpa0Var = new qpa0();
            this.f21222S = qpa0Var;
            viewM21493f0 = qpa0Var.m21493f0(mo3351O().mo9267H2(), viewGroup);
        }
        this.f23556v = this.f21222S.mo11173d();
        this.f23559y = this.f21222S.mo11194v();
        this.f23560z = this.f21222S.mo11192t();
        this.f23537A = this.f21222S.mo11142B();
        this.f23538B = this.f21222S.mo11197y();
        this.f23539C = this.f21222S.mo11146F();
        this.f23540D = this.f21222S.mo11183k();
        this.f23543G = this.f21222S.mo11181i();
        this.f23545I = this.f21222S.mo11168a0();
        this.f23547K = this.f21222S.mo11182j();
        this.f23555u = this.f21222S.mo11143C();
        this.f23546J = this.f21222S.mo11174d0();
        this.f23544H = this.f21222S.mo11175e();
        this.f23548L = this.f21222S.mo11190r();
        this.f23549M = this.f21222S.mo11141A();
        this.f23550N = this.f21222S.mo11165Y();
        this.f23551O = this.f21222S.mo11160T();
        this.f23552P = this.f21222S.mo11162V();
        this.f23553Q = this.f21222S.mo11156P();
        m9640E(this.f23559y, this.f21222S.mo11144D());
        m9640E(this.f23560z, this.f21222S.mo11159S());
        m9640E(this.f23537A, this.f21222S.mo11163W());
        m9640E(this.f23538B, this.f21222S.mo11176e0());
        m9640E(this.f23539C, this.f21222S.mo11157Q());
        m9640E(this.f23540D, this.f21222S.mo11150J());
        m9640E(this.f23543G, this.f21222S.mo11196x());
        m9640E(this.f23545I, this.f21222S.mo11191s());
        m9640E(this.f23547K, this.f21222S.mo11164X());
        m9640E(this.f23546J, this.f21222S.mo11161U());
        m9640E(this.f23544H, this.f21222S.mo11198z());
        m9640E(this.f23548L, this.f21222S.mo11190r());
        m9640E(this.f23549M, this.f21222S.mo11169b());
        m9640E(this.f23550N, this.f21222S.mo11166Z());
        m9640E(this.f23551O, this.f21222S.mo11170b0());
        m9640E(this.f23552P, this.f21222S.mo11180h());
        m9640E(this.f23553Q, this.f21222S.mo11184l());
        m9639D(this.f23559y, this.f21222S.mo11144D());
        m9639D(this.f23560z, this.f21222S.mo11159S());
        m9639D(this.f23537A, this.f21222S.mo11163W());
        m9639D(this.f23538B, this.f21222S.mo11176e0());
        m9639D(this.f23539C, this.f21222S.mo11157Q());
        m9639D(this.f23540D, this.f21222S.mo11150J());
        m9639D(this.f23543G, this.f21222S.mo11196x());
        m9639D(this.f23545I, this.f21222S.mo11191s());
        m9639D(this.f23547K, this.f21222S.mo11164X());
        m9639D(this.f23546J, this.f21222S.mo11161U());
        m9639D(this.f23544H, this.f21222S.mo11198z());
        m9639D(this.f23549M, this.f21222S.mo11169b());
        m9639D(this.f23550N, this.f21222S.mo11166Z());
        m9639D(this.f23551O, this.f21222S.mo11170b0());
        m9639D(this.f23552P, this.f21222S.mo11180h());
        m9639D(this.f23553Q, this.f21222S.mo11184l());
        m9639D(this.f21222S.mo11158R(), this.f21222S.mo11187o());
        if (upa.L3()) {
            nne nneVar = new nne(m14465w(), m14461p());
            this.f21223T = nneVar;
            this.f21222S.mo11149I().addView(nneVar.mo3281s(this.f21222S.mo11149I()));
        }
        return viewM21493f0;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [android.view.View, com.p1.mobile.putong.core.ui.profile.profilelist.view.ProfileIntegrityOptView] */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.view.View, com.p1.mobile.putong.core.ui.profile.profilelist.view.ProfileIntegrityOptView] */
    @Override // p002l.tme, p002l.zp90, p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        int i;
        super.mo3282t();
        this.f21222S.mo11158R().setText(mo3351O().m9268i2().description);
        Drawable drawable = mo3351O().act().getResources().getDrawable(x2c0.El);
        Drawable drawable2 = mo3351O().act().getResources().getDrawable(x2c0.Gl);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), drawable2.getMinimumHeight());
        mra0.m18143b(this.f23559y, drawable, drawable2);
        mra0.m18143b(this.f23560z, drawable, drawable2);
        mra0.m18143b(this.f23537A, drawable, drawable2);
        mra0.m18143b(this.f23538B, drawable, drawable2);
        mra0.m18143b(this.f23539C, drawable, drawable2);
        mra0.m18143b(this.f23540D, drawable, drawable2);
        mra0.m18143b(this.f23543G, drawable, drawable2);
        mra0.m18143b(this.f23545I, drawable, drawable2);
        mra0.m18143b(this.f23547K, drawable, drawable2);
        mra0.m18143b(this.f21222S.mo11158R(), drawable, drawable2);
        mra0.m18143b(this.f23546J, drawable, drawable2);
        mra0.m18143b(this.f23544H, drawable, drawable2);
        mra0.m18143b(this.f23549M, drawable, drawable2);
        mra0.m18143b(this.f23550N, drawable, drawable2);
        mra0.m18143b(this.f23551O, drawable, drawable2);
        mra0.m18143b(this.f23552P, drawable, drawable2);
        mra0.m18143b(this.f23553Q, drawable, drawable2);
        VText vTextMo11148H = this.f21222S.mo11148H();
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vTextMo11148H.setTypeface(typeface);
        this.f21222S.mo11193u().setTypeface(typeface);
        this.f21222S.mo11172c0().setTypeface(typeface);
        this.f21222S.mo11177f().setTypeface(typeface);
        this.f21222S.mo11151K().setTypeface(typeface);
        this.f21222S.mo11152L().setTypeface(typeface);
        this.f21222S.mo11153M().setTypeface(typeface);
        this.f21222S.mo11188p().setTypeface(typeface);
        this.f21222S.mo11145E().setTypeface(typeface);
        this.f21222S.mo11185m().setTypeface(typeface);
        this.f21222S.mo11186n().setTypeface(typeface);
        this.f21222S.mo11189q().setTypeface(typeface);
        this.f21222S.mo11155O().setTypeface(typeface);
        this.f21222S.mo11147G().setTypeface(typeface);
        this.f21222S.mo11179g().setTypeface(typeface);
        this.f21222S.mo11195w().setTypeface(typeface);
        this.f21222S.mo11154N().setTypeface(typeface);
        this.f21222S.mo11194v().setTypeface(typeface);
        this.f21222S.mo11192t().setTypeface(typeface);
        this.f21222S.mo11181i().setTypeface(typeface);
        this.f21222S.mo11197y().setTypeface(typeface);
        this.f21222S.mo11146F().setTypeface(typeface);
        this.f21222S.mo11183k().setTypeface(typeface);
        this.f21222S.mo11142B().setTypeface(typeface);
        this.f21222S.mo11168a0().setTypeface(typeface);
        this.f21222S.mo11182j().setTypeface(typeface);
        this.f21222S.mo11158R().setTypeface(typeface);
        this.f21222S.mo11174d0().setTypeface(typeface);
        this.f21222S.mo11175e().setTypeface(typeface);
        this.f21222S.mo11141A().setTypeface(typeface);
        this.f21222S.mo11165Y().setTypeface(typeface);
        this.f21222S.mo11160T().setTypeface(typeface);
        this.f21222S.mo11162V().setTypeface(typeface);
        this.f21222S.mo11156P().setTypeface(typeface);
        if (NullChecker.a(this.f21223T)) {
            this.f21223T.mo3282t();
        }
        User userM9268i2 = mo3351O().m9268i2();
        ?? Mo11167a = this.f21222S.mo11167a();
        if (Mo11167a != 0) {
            if (!upa.L3() || (i = lqa.s().weight.information) <= 0) {
                xdl0.M((View) Mo11167a, false);
            } else {
                Mo11167a.m3436P((int) wn90.F().M(userM9268i2, i), i, "完善我的信息");
                xdl0.M((View) Mo11167a, true);
            }
        }
        ?? Mo11171c = this.f21222S.mo11171c();
        if (Mo11171c != 0) {
            if (!upa.L3()) {
                xdl0.M((View) Mo11171c, false);
                return;
            }
            int i2 = lqa.s().weight.myAssets;
            if (i2 <= 0) {
                xdl0.M((View) Mo11171c, false);
            } else {
                Mo11171c.m3436P((int) wn90.F().K(userM9268i2, i2), i2, "完善我的资产");
                xdl0.M((View) Mo11171c, true);
            }
        }
    }

    @Override // p002l.tme
    /* JADX INFO: renamed from: z0 */
    public void mo23052z0() {
    }
}
