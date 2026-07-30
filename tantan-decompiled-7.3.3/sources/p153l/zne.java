package p153l;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.view.ProfileIntegrityOptView;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class zne extends xne {

    /* JADX INFO: renamed from: S */
    public s3m f205192S;

    /* JADX INFO: renamed from: T */
    public roe f205193T;

    public zne(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public /* synthetic */ void m220594T0() {
        sfj0.m185596c("e_edit_profile_my_info", "p_edit_profile_view", sfj0.C20032a.m185615h("edit_profile_my_info_name", "self_introduction"));
        LoopFragmentFactory.m52658S(mo53983O().m189086i2(), mo53983O().mo52249J1(), LoopInputType.SIGNATURE);
    }

    @Override // p153l.dy90
    /* JADX INFO: renamed from: f0 */
    public void mo118658f0(int i) {
        super.mo118658f0(i);
        VText vTextMo132601L = this.f205192S.mo132601L();
        if (vTextMo132601L != null) {
            vTextMo132601L.setText(R$string.f19252fl);
        }
    }

    @Override // p153l.dy90
    /* JADX INFO: renamed from: g0 */
    public void mo118659g0(int i) {
        this.f91174C.setHint(i);
        VText vTextMo132600K = this.f205192S.mo132600K();
        if (vTextMo132600K != null) {
            if (i == R$string.f19467ml) {
                vTextMo132600K.setText(R$string.f19436ll);
            } else if (i == R$string.f19344il) {
                vTextMo132600K.setText(R$string.f19314hl);
            } else if (i == R$string.f19498nl) {
                vTextMo132600K.setText(R$string.f19529ol);
            }
        }
    }

    @Override // p153l.dy90
    /* JADX INFO: renamed from: h0 */
    public void mo118660h0(int i) {
        super.mo118660h0(i);
        VText vTextMo132621c0 = this.f205192S.mo132621c0();
        if (vTextMo132621c0 != null) {
            vTextMo132621c0.setText(R$string.f19622rl);
        }
    }

    @Override // p153l.xne, p153l.dy90, p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        this.f205192S.mo132622d().setTypeface(Typeface.DEFAULT_BOLD);
        m121845Q(this.f205192S.mo132636o(), 0);
        m121843N(this.f205192S.mo132636o(), new x20() { // from class: l.yne
            @Override // p153l.x20
            public final void call() {
                this.f200821a.m220594T0();
            }
        }, true);
        this.f205192S.mo132626f().setText(CoreModule.f18263b.getString(R$string.f19405kl));
        bnl0.m105524M(this.f205192S.mo132633l(), false);
        if (NullChecker.m82486a(this.f205193T)) {
            this.f205193T.mo53911j(view);
        }
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: k */
    public boolean mo53568k() {
        return false;
    }

    @Override // p153l.xne, p153l.dy90, p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        if (mo53983O().mo52302m0()) {
            return mo53983O().mo52236D2() || mo53983O().mo52265S();
        }
        return false;
    }

    @Override // p153l.dy90, p153l.on2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        View viewM198405f0;
        if (gra.m131596L3()) {
            gwa0 gwa0Var = new gwa0();
            this.f205192S = gwa0Var;
            viewM198405f0 = gwa0Var.m132627f0(mo53983O().mo146493H2(), viewGroup);
        } else {
            uxa0 uxa0Var = new uxa0();
            this.f205192S = uxa0Var;
            viewM198405f0 = uxa0Var.m198405f0(mo53983O().mo146493H2(), viewGroup);
        }
        this.f91191v = this.f205192S.mo132622d();
        this.f91194y = this.f205192S.mo132643v();
        this.f91195z = this.f205192S.mo132641t();
        this.f91172A = this.f205192S.mo132591B();
        this.f91173B = this.f205192S.mo132646y();
        this.f91174C = this.f205192S.mo132595F();
        this.f91175D = this.f205192S.mo132632k();
        this.f91178G = this.f205192S.mo132630i();
        this.f91180I = this.f205192S.mo132617a0();
        this.f91182K = this.f205192S.mo132631j();
        this.f91190u = this.f205192S.mo132592C();
        this.f91181J = this.f205192S.mo132623d0();
        this.f91179H = this.f205192S.mo132624e();
        this.f91183L = this.f205192S.mo132639r();
        this.f91184M = this.f205192S.mo132590A();
        this.f91185N = this.f205192S.mo132614Y();
        this.f91186O = this.f205192S.mo132609T();
        this.f91187P = this.f205192S.mo132611V();
        this.f91188Q = this.f205192S.mo132605P();
        m121834E(this.f91194y, this.f205192S.mo132593D());
        m121834E(this.f91195z, this.f205192S.mo132608S());
        m121834E(this.f91172A, this.f205192S.mo132612W());
        m121834E(this.f91173B, this.f205192S.mo132625e0());
        m121834E(this.f91174C, this.f205192S.mo132606Q());
        m121834E(this.f91175D, this.f205192S.mo132599J());
        m121834E(this.f91178G, this.f205192S.mo132645x());
        m121834E(this.f91180I, this.f205192S.mo132640s());
        m121834E(this.f91182K, this.f205192S.mo132613X());
        m121834E(this.f91181J, this.f205192S.mo132610U());
        m121834E(this.f91179H, this.f205192S.mo132647z());
        m121834E(this.f91183L, this.f205192S.mo132639r());
        m121834E(this.f91184M, this.f205192S.mo132618b());
        m121834E(this.f91185N, this.f205192S.mo132615Z());
        m121834E(this.f91186O, this.f205192S.mo132619b0());
        m121834E(this.f91187P, this.f205192S.mo132629h());
        m121834E(this.f91188Q, this.f205192S.mo132633l());
        m121833D(this.f91194y, this.f205192S.mo132593D());
        m121833D(this.f91195z, this.f205192S.mo132608S());
        m121833D(this.f91172A, this.f205192S.mo132612W());
        m121833D(this.f91173B, this.f205192S.mo132625e0());
        m121833D(this.f91174C, this.f205192S.mo132606Q());
        m121833D(this.f91175D, this.f205192S.mo132599J());
        m121833D(this.f91178G, this.f205192S.mo132645x());
        m121833D(this.f91180I, this.f205192S.mo132640s());
        m121833D(this.f91182K, this.f205192S.mo132613X());
        m121833D(this.f91181J, this.f205192S.mo132610U());
        m121833D(this.f91179H, this.f205192S.mo132647z());
        m121833D(this.f91184M, this.f205192S.mo132618b());
        m121833D(this.f91185N, this.f205192S.mo132615Z());
        m121833D(this.f91186O, this.f205192S.mo132619b0());
        m121833D(this.f91187P, this.f205192S.mo132629h());
        m121833D(this.f91188Q, this.f205192S.mo132633l());
        m121833D(this.f205192S.mo132607R(), this.f205192S.mo132636o());
        if (gra.m131596L3()) {
            roe roeVar = new roe(m168325w(), m168321p());
            this.f205193T = roeVar;
            this.f205192S.mo132598I().addView(roeVar.mo53913s(this.f205192S.mo132598I()));
        }
        return viewM198405f0;
    }

    @Override // p153l.xne, p153l.dy90, p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        int i;
        super.mo53914t();
        this.f205192S.mo132607R().setText(mo53983O().m189086i2().description);
        Drawable drawable = mo53983O().act().getResources().getDrawable(dbc0.f87422sm);
        Drawable drawable2 = mo53983O().act().getResources().getDrawable(dbc0.f87488um);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), drawable2.getMinimumHeight());
        qza0.m178766b(this.f91194y, drawable, drawable2);
        qza0.m178766b(this.f91195z, drawable, drawable2);
        qza0.m178766b(this.f91172A, drawable, drawable2);
        qza0.m178766b(this.f91173B, drawable, drawable2);
        qza0.m178766b(this.f91174C, drawable, drawable2);
        qza0.m178766b(this.f91175D, drawable, drawable2);
        qza0.m178766b(this.f91178G, drawable, drawable2);
        qza0.m178766b(this.f91180I, drawable, drawable2);
        qza0.m178766b(this.f91182K, drawable, drawable2);
        qza0.m178766b(this.f205192S.mo132607R(), drawable, drawable2);
        qza0.m178766b(this.f91181J, drawable, drawable2);
        qza0.m178766b(this.f91179H, drawable, drawable2);
        qza0.m178766b(this.f91184M, drawable, drawable2);
        qza0.m178766b(this.f91185N, drawable, drawable2);
        qza0.m178766b(this.f91186O, drawable, drawable2);
        qza0.m178766b(this.f91187P, drawable, drawable2);
        qza0.m178766b(this.f91188Q, drawable, drawable2);
        VText vTextMo132597H = this.f205192S.mo132597H();
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vTextMo132597H.setTypeface(typeface);
        this.f205192S.mo132642u().setTypeface(typeface);
        this.f205192S.mo132621c0().setTypeface(typeface);
        this.f205192S.mo132626f().setTypeface(typeface);
        this.f205192S.mo132600K().setTypeface(typeface);
        this.f205192S.mo132601L().setTypeface(typeface);
        this.f205192S.mo132602M().setTypeface(typeface);
        this.f205192S.mo132637p().setTypeface(typeface);
        this.f205192S.mo132594E().setTypeface(typeface);
        this.f205192S.mo132634m().setTypeface(typeface);
        this.f205192S.mo132635n().setTypeface(typeface);
        this.f205192S.mo132638q().setTypeface(typeface);
        this.f205192S.mo132604O().setTypeface(typeface);
        this.f205192S.mo132596G().setTypeface(typeface);
        this.f205192S.mo132628g().setTypeface(typeface);
        this.f205192S.mo132644w().setTypeface(typeface);
        this.f205192S.mo132603N().setTypeface(typeface);
        this.f205192S.mo132643v().setTypeface(typeface);
        this.f205192S.mo132641t().setTypeface(typeface);
        this.f205192S.mo132630i().setTypeface(typeface);
        this.f205192S.mo132646y().setTypeface(typeface);
        this.f205192S.mo132595F().setTypeface(typeface);
        this.f205192S.mo132632k().setTypeface(typeface);
        this.f205192S.mo132591B().setTypeface(typeface);
        this.f205192S.mo132617a0().setTypeface(typeface);
        this.f205192S.mo132631j().setTypeface(typeface);
        this.f205192S.mo132607R().setTypeface(typeface);
        this.f205192S.mo132623d0().setTypeface(typeface);
        this.f205192S.mo132624e().setTypeface(typeface);
        this.f205192S.mo132590A().setTypeface(typeface);
        this.f205192S.mo132614Y().setTypeface(typeface);
        this.f205192S.mo132609T().setTypeface(typeface);
        this.f205192S.mo132611V().setTypeface(typeface);
        this.f205192S.mo132605P().setTypeface(typeface);
        if (NullChecker.m82486a(this.f205193T)) {
            this.f205193T.mo53914t();
        }
        User userM189086i2 = mo53983O().m189086i2();
        ProfileIntegrityOptView profileIntegrityOptViewMo132616a = this.f205192S.mo132616a();
        if (profileIntegrityOptViewMo132616a != null) {
            if (!gra.m131596L3() || (i = xra.m212800s().weight.information) <= 0) {
                bnl0.m105524M(profileIntegrityOptViewMo132616a, false);
            } else {
                profileIntegrityOptViewMo132616a.m54066P((int) aw90.m100562F().m100603M(userM189086i2, i), i, "完善我的信息");
                bnl0.m105524M(profileIntegrityOptViewMo132616a, true);
            }
        }
        ProfileIntegrityOptView profileIntegrityOptViewMo132620c = this.f205192S.mo132620c();
        if (profileIntegrityOptViewMo132620c != null) {
            if (!gra.m131596L3()) {
                bnl0.m105524M(profileIntegrityOptViewMo132620c, false);
                return;
            }
            int i2 = xra.m212800s().weight.myAssets;
            if (i2 <= 0) {
                bnl0.m105524M(profileIntegrityOptViewMo132620c, false);
            } else {
                profileIntegrityOptViewMo132620c.m54066P((int) aw90.m100562F().m100601K(userM189086i2, i2), i2, "完善我的资产");
                bnl0.m105524M(profileIntegrityOptViewMo132620c, true);
            }
        }
    }

    @Override // p153l.xne
    /* JADX INFO: renamed from: z0 */
    public void mo212181z0() {
    }
}
