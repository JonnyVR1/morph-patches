package p149l;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.view.ProfileIntegrityOptView;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class vme extends tme {

    /* JADX INFO: renamed from: S */
    public z0m f182100S;

    /* JADX INFO: renamed from: T */
    public nne f182101T;

    public vme(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public /* synthetic */ void m198937T0() {
        o6j0.m162859c("e_edit_profile_my_info", "p_edit_profile_view", o6j0.C18854a.m162878h("edit_profile_my_info_name", "self_introduction"));
        LoopFragmentFactory.m51475S(mo52800O().m94569i2(), mo52800O().mo51066J1(), LoopInputType.SIGNATURE);
    }

    @Override // p149l.zp90
    /* JADX INFO: renamed from: f0 */
    public void mo103360f0(int i) {
        super.mo103360f0(i);
        VText vTextMo107960L = this.f182100S.mo107960L();
        if (vTextMo107960L != null) {
            vTextMo107960L.setText(R$string.f17857Jk);
        }
    }

    @Override // p149l.zp90
    /* JADX INFO: renamed from: g0 */
    public void mo103361g0(int i) {
        this.f204218C.setHint(i);
        VText vTextMo107959K = this.f182100S.mo107959K();
        if (vTextMo107959K != null) {
            if (i == R$string.f18067Qk) {
                vTextMo107959K.setText(R$string.f18037Pk);
            } else if (i == R$string.f17947Mk) {
                vTextMo107959K.setText(R$string.f17917Lk);
            } else if (i == R$string.f18097Rk) {
                vTextMo107959K.setText(R$string.f18127Sk);
            }
        }
    }

    @Override // p149l.zp90
    /* JADX INFO: renamed from: h0 */
    public void mo103362h0(int i) {
        super.mo103362h0(i);
        VText vTextMo107980c0 = this.f182100S.mo107980c0();
        if (vTextMo107980c0 != null) {
            vTextMo107980c0.setText(R$string.f18217Vk);
        }
    }

    @Override // p149l.tme, p149l.zp90, p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        this.f182100S.mo107981d().setTypeface(Typeface.DEFAULT_BOLD);
        m96420Q(this.f182100S.mo107995o(), 0);
        m96418N(this.f182100S.mo107995o(), new d30() { // from class: l.ume
            @Override // p149l.d30
            public final void call() {
                this.f177223a.m198937T0();
            }
        }, true);
        this.f182100S.mo107985f().setText(CoreModule.f17544b.getString(R$string.f18007Ok));
        xdl0.m208344M(this.f182100S.mo107992l(), false);
        if (NullChecker.m81303a(this.f182101T)) {
            this.f182101T.mo52728j(view);
        }
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: k */
    public boolean mo52385k() {
        return false;
    }

    @Override // p149l.tme, p149l.zp90, p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        if (mo52800O().mo51119m0()) {
            return mo52800O().mo51053D2() || mo52800O().mo51082S();
        }
        return false;
    }

    @Override // p149l.zp90, p149l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        View viewM175819f0;
        if (upa.m194665L3()) {
            coa0 coa0Var = new coa0();
            this.f182100S = coa0Var;
            viewM175819f0 = coa0Var.m107986f0(mo52800O().mo94568H2(), viewGroup);
        } else {
            qpa0 qpa0Var = new qpa0();
            this.f182100S = qpa0Var;
            viewM175819f0 = qpa0Var.m175819f0(mo52800O().mo94568H2(), viewGroup);
        }
        this.f204235v = this.f182100S.mo107981d();
        this.f204238y = this.f182100S.mo108002v();
        this.f204239z = this.f182100S.mo108000t();
        this.f204216A = this.f182100S.mo107950B();
        this.f204217B = this.f182100S.mo108005y();
        this.f204218C = this.f182100S.mo107954F();
        this.f204219D = this.f182100S.mo107991k();
        this.f204222G = this.f182100S.mo107989i();
        this.f204224I = this.f182100S.mo107976a0();
        this.f204226K = this.f182100S.mo107990j();
        this.f204234u = this.f182100S.mo107951C();
        this.f204225J = this.f182100S.mo107982d0();
        this.f204223H = this.f182100S.mo107983e();
        this.f204227L = this.f182100S.mo107998r();
        this.f204228M = this.f182100S.mo107949A();
        this.f204229N = this.f182100S.mo107973Y();
        this.f204230O = this.f182100S.mo107968T();
        this.f204231P = this.f182100S.mo107970V();
        this.f204232Q = this.f182100S.mo107964P();
        m96409E(this.f204238y, this.f182100S.mo107952D());
        m96409E(this.f204239z, this.f182100S.mo107967S());
        m96409E(this.f204216A, this.f182100S.mo107971W());
        m96409E(this.f204217B, this.f182100S.mo107984e0());
        m96409E(this.f204218C, this.f182100S.mo107965Q());
        m96409E(this.f204219D, this.f182100S.mo107958J());
        m96409E(this.f204222G, this.f182100S.mo108004x());
        m96409E(this.f204224I, this.f182100S.mo107999s());
        m96409E(this.f204226K, this.f182100S.mo107972X());
        m96409E(this.f204225J, this.f182100S.mo107969U());
        m96409E(this.f204223H, this.f182100S.mo108006z());
        m96409E(this.f204227L, this.f182100S.mo107998r());
        m96409E(this.f204228M, this.f182100S.mo107977b());
        m96409E(this.f204229N, this.f182100S.mo107974Z());
        m96409E(this.f204230O, this.f182100S.mo107978b0());
        m96409E(this.f204231P, this.f182100S.mo107988h());
        m96409E(this.f204232Q, this.f182100S.mo107992l());
        m96408D(this.f204238y, this.f182100S.mo107952D());
        m96408D(this.f204239z, this.f182100S.mo107967S());
        m96408D(this.f204216A, this.f182100S.mo107971W());
        m96408D(this.f204217B, this.f182100S.mo107984e0());
        m96408D(this.f204218C, this.f182100S.mo107965Q());
        m96408D(this.f204219D, this.f182100S.mo107958J());
        m96408D(this.f204222G, this.f182100S.mo108004x());
        m96408D(this.f204224I, this.f182100S.mo107999s());
        m96408D(this.f204226K, this.f182100S.mo107972X());
        m96408D(this.f204225J, this.f182100S.mo107969U());
        m96408D(this.f204223H, this.f182100S.mo108006z());
        m96408D(this.f204228M, this.f182100S.mo107977b());
        m96408D(this.f204229N, this.f182100S.mo107974Z());
        m96408D(this.f204230O, this.f182100S.mo107978b0());
        m96408D(this.f204231P, this.f182100S.mo107988h());
        m96408D(this.f204232Q, this.f182100S.mo107992l());
        m96408D(this.f182100S.mo107966R(), this.f182100S.mo107995o());
        if (upa.m194665L3()) {
            nne nneVar = new nne(m131825w(), m131821p());
            this.f182101T = nneVar;
            this.f182100S.mo107957I().addView(nneVar.mo52730s(this.f182100S.mo107957I()));
        }
        return viewM175819f0;
    }

    @Override // p149l.tme, p149l.zp90, p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        int i;
        super.mo52731t();
        this.f182100S.mo107966R().setText(mo52800O().m94569i2().description);
        Drawable drawable = mo52800O().act().getResources().getDrawable(x2c0.f189303El);
        Drawable drawable2 = mo52800O().act().getResources().getDrawable(x2c0.f189367Gl);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), drawable2.getMinimumHeight());
        mra0.m156023b(this.f204238y, drawable, drawable2);
        mra0.m156023b(this.f204239z, drawable, drawable2);
        mra0.m156023b(this.f204216A, drawable, drawable2);
        mra0.m156023b(this.f204217B, drawable, drawable2);
        mra0.m156023b(this.f204218C, drawable, drawable2);
        mra0.m156023b(this.f204219D, drawable, drawable2);
        mra0.m156023b(this.f204222G, drawable, drawable2);
        mra0.m156023b(this.f204224I, drawable, drawable2);
        mra0.m156023b(this.f204226K, drawable, drawable2);
        mra0.m156023b(this.f182100S.mo107966R(), drawable, drawable2);
        mra0.m156023b(this.f204225J, drawable, drawable2);
        mra0.m156023b(this.f204223H, drawable, drawable2);
        mra0.m156023b(this.f204228M, drawable, drawable2);
        mra0.m156023b(this.f204229N, drawable, drawable2);
        mra0.m156023b(this.f204230O, drawable, drawable2);
        mra0.m156023b(this.f204231P, drawable, drawable2);
        mra0.m156023b(this.f204232Q, drawable, drawable2);
        VText vTextMo107956H = this.f182100S.mo107956H();
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vTextMo107956H.setTypeface(typeface);
        this.f182100S.mo108001u().setTypeface(typeface);
        this.f182100S.mo107980c0().setTypeface(typeface);
        this.f182100S.mo107985f().setTypeface(typeface);
        this.f182100S.mo107959K().setTypeface(typeface);
        this.f182100S.mo107960L().setTypeface(typeface);
        this.f182100S.mo107961M().setTypeface(typeface);
        this.f182100S.mo107996p().setTypeface(typeface);
        this.f182100S.mo107953E().setTypeface(typeface);
        this.f182100S.mo107993m().setTypeface(typeface);
        this.f182100S.mo107994n().setTypeface(typeface);
        this.f182100S.mo107997q().setTypeface(typeface);
        this.f182100S.mo107963O().setTypeface(typeface);
        this.f182100S.mo107955G().setTypeface(typeface);
        this.f182100S.mo107987g().setTypeface(typeface);
        this.f182100S.mo108003w().setTypeface(typeface);
        this.f182100S.mo107962N().setTypeface(typeface);
        this.f182100S.mo108002v().setTypeface(typeface);
        this.f182100S.mo108000t().setTypeface(typeface);
        this.f182100S.mo107989i().setTypeface(typeface);
        this.f182100S.mo108005y().setTypeface(typeface);
        this.f182100S.mo107954F().setTypeface(typeface);
        this.f182100S.mo107991k().setTypeface(typeface);
        this.f182100S.mo107950B().setTypeface(typeface);
        this.f182100S.mo107976a0().setTypeface(typeface);
        this.f182100S.mo107990j().setTypeface(typeface);
        this.f182100S.mo107966R().setTypeface(typeface);
        this.f182100S.mo107982d0().setTypeface(typeface);
        this.f182100S.mo107983e().setTypeface(typeface);
        this.f182100S.mo107949A().setTypeface(typeface);
        this.f182100S.mo107973Y().setTypeface(typeface);
        this.f182100S.mo107968T().setTypeface(typeface);
        this.f182100S.mo107970V().setTypeface(typeface);
        this.f182100S.mo107964P().setTypeface(typeface);
        if (NullChecker.m81303a(this.f182101T)) {
            this.f182101T.mo52731t();
        }
        User userM94569i2 = mo52800O().m94569i2();
        ProfileIntegrityOptView profileIntegrityOptViewMo107975a = this.f182100S.mo107975a();
        if (profileIntegrityOptViewMo107975a != null) {
            if (!upa.m194665L3() || (i = lqa.m150981s().weight.information) <= 0) {
                xdl0.m208344M(profileIntegrityOptViewMo107975a, false);
            } else {
                profileIntegrityOptViewMo107975a.m52883P((int) wn90.m204602F().m204643M(userM94569i2, i), i, "完善我的信息");
                xdl0.m208344M(profileIntegrityOptViewMo107975a, true);
            }
        }
        ProfileIntegrityOptView profileIntegrityOptViewMo107979c = this.f182100S.mo107979c();
        if (profileIntegrityOptViewMo107979c != null) {
            if (!upa.m194665L3()) {
                xdl0.m208344M(profileIntegrityOptViewMo107979c, false);
                return;
            }
            int i2 = lqa.m150981s().weight.myAssets;
            if (i2 <= 0) {
                xdl0.m208344M(profileIntegrityOptViewMo107979c, false);
            } else {
                profileIntegrityOptViewMo107979c.m52883P((int) wn90.m204602F().m204641K(userM94569i2, i2), i2, "完善我的资产");
                xdl0.m208344M(profileIntegrityOptViewMo107979c, true);
            }
        }
    }

    @Override // p149l.tme
    /* JADX INFO: renamed from: z0 */
    public void mo189687z0() {
    }
}
