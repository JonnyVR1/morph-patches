package p149l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.AbstractC0427k;
import androidx.fragment.app.FragmentManager;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ProfileEditInfo;
import com.p046p1.mobile.putong.core.p053ui.ProfileEditInfoException;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.loop.bean.MarrySeriesType;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public class zyw extends jq2<czw> {

    /* JADX INFO: renamed from: a */
    public ArrayList<MarrySeriesType> f205745a;

    /* JADX INFO: renamed from: b */
    public User f205746b;

    /* JADX INFO: renamed from: c */
    public boolean f205747c;

    /* JADX INFO: renamed from: d */
    public boolean f205748d;

    /* JADX INFO: renamed from: e */
    public MarrySeriesType f205749e;

    /* JADX INFO: renamed from: f */
    public String f205750f;

    /* JADX INFO: renamed from: g */
    public MarryEditProfileBaseMvpFrag f205751g;

    public zyw(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ ProfileEditInfo m220952f0(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: o0 */
    private void m220959o0() {
        Intent intent = new Intent();
        intent.putExtra("loop_edit_user", this.f205746b);
        act().hideInput();
        act().setResult(-1, intent);
        act().m66873d2();
    }

    /* JADX INFO: renamed from: u0 */
    private void m220960u0() {
        Bundle extras = act().getIntent().getExtras();
        if (extras == null) {
            act().m66873d2();
            return;
        }
        this.f205750f = extras.getString("from");
        this.f205746b = (User) extras.getSerializable("args_edit_user");
        this.f205747c = extras.getBoolean("args_patch_user_at_once");
        this.f205748d = extras.getBoolean("args_secondary_page");
        this.f205745a = (ArrayList) extras.getSerializable("args_type_list");
        if (extras.getBoolean("args_loop")) {
            this.f205745a = m2x.m152739u(vwb.m200296J(this.f205745a) ? null : this.f205745a.get(0), this.f205746b);
        }
        if (vwb.m200296J(this.f205745a)) {
            act().m66873d2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public /* synthetic */ void m220961z0(Bundle bundle) {
        ((czw) this.viewModel).m109440f();
        m220972N0(true);
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m220962A0(View view) {
        m220971L0();
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m220963C0(View view) {
        m220971L0();
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m220964D0(View view) {
        m220959o0();
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ C22306c m220965E0(User user, ProfileEditInfo profileEditInfo) {
        if (profileEditInfo == null || !profileEditInfo.isHit) {
            return CoreModule.f17545c.f19639e0.m169547u9(user);
        }
        User user2 = this.f205746b;
        User user3 = profileEditInfo.user;
        user2.description = user3.description;
        user2.profile = user3.profile;
        user2.name = user3.name;
        cww.m109076i(profileEditInfo, user2);
        throw new ProfileEditInfoException(profileEditInfo);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m220966F0(roj0 roj0Var) {
        act().progressDismiss();
        m220959o0();
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m220967G0(Throwable th) {
        act().progressDismiss();
        if (!(th instanceof ProfileEditInfoException)) {
            osi0.m165778b("上传失败");
        } else if (tw6.m190849d(((ProfileEditInfoException) th).getEditInfo(), act().pageId())) {
            lsi0.m151593w(R$string.f27923s);
        } else {
            osi0.m165782f(R$string.f27806Y0);
        }
        if (((czw) this.viewModel).act().m47456c2()) {
            m220959o0();
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final void m220968H0() {
        if (this.f205745a.indexOf(this.f205749e) + 1 > this.f205745a.size() - 1) {
            m220971L0();
        } else {
            m220972N0(false);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public void m220969I0() {
        if (this.f205745a.size() == 1) {
            m220959o0();
            return;
        }
        if (((czw) this.viewModel).act().m47456c2()) {
            new xh0.C21150a(act()).m208740s("还差一点就完成啦").m208728g(true).m208723b(true).m208731j("完善资料展示真实、生动的你，即可解锁精选，认识更多优质朋友。").m208739r("继续填写").m208727f("确认退出").m208724c(new View.OnClickListener() { // from class: l.syw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f166999a.m220962A0(view);
                }
            }).m208722a().m208721g();
        } else if (m220980x0()) {
            new xh0.C21150a(act()).m208740s("确认退出").m208728g(true).m208723b(true).m208731j(act().getString(R$string.f27846f0)).m208739r("继续填写").m208727f("确认退出").m208724c(new View.OnClickListener() { // from class: l.tyw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f172667a.m220963C0(view);
                }
            }).m208722a().m208721g();
        } else {
            new xh0.C21150a(act()).m208740s("还差一点就完成啦！").m208728g(true).m208723b(true).m208731j("希望每个加入的人资料真实、态度真诚，认真完善资料，迈出寻找理想伴侣的第一步～").m208739r("继续填写").m208727f("确认退出").m208724c(new View.OnClickListener() { // from class: l.uyw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f178923a.m220964D0(view);
                }
            }).m208722a().m208721g();
        }
    }

    /* JADX INFO: renamed from: J0 */
    public void m220970J0() {
        if (m220974n0()) {
            this.f205751g.f30419A.mo104517e(this.f205749e, this.f205746b);
            m220968H0();
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final void m220971L0() {
        if (!this.f205747c) {
            m220959o0();
            return;
        }
        if (this.f205749e == MarrySeriesType.PROLOGUE && this.f205745a.size() == 1 && this.f205746b.subtract(CoreModule.f17545c.f19639e0.m169527p9()) == null) {
            m220959o0();
            return;
        }
        User userMo223809clone = this.f205746b.mo223809clone();
        final User userSubtract = userMo223809clone.subtract(CoreModule.f17545c.f19639e0.m169527p9());
        if (!NullChecker.m81303a(userSubtract)) {
            m220959o0();
            return;
        }
        act().progress(R$string.f27771R0);
        ProfileEditInfo profileEditInfoNew_ = ProfileEditInfo.new_();
        profileEditInfoNew_.user = userMo223809clone;
        duringCreated((C22306c) CoreModule.f17545c.f19552B0.m31621t4(profileEditInfoNew_).onErrorReturn(new w9j() { // from class: l.vyw
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return zyw.m220952f0((Throwable) obj);
            }
        }).flatMap(new w9j() { // from class: l.wyw
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f188682a.m220965E0(userSubtract, (ProfileEditInfo) obj);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.xyw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f195141a.m220966F0((roj0) obj);
            }
        }, new e30() { // from class: l.yyw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200831a.m220967G0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N0 */
    public final void m220972N0(boolean z) {
        if (vwb.m200296J(this.f205745a)) {
            return;
        }
        if (m220977r0() + 1 >= this.f205745a.size()) {
            return;
        }
        this.f205749e = this.f205745a.get(m220977r0() + 1);
        FragmentManager supportFragmentManager = act().getSupportFragmentManager();
        AbstractC0427k abstractC0427kM2567m = supportFragmentManager.m2567m();
        Class<?> fragClass = this.f205749e.getFragClass();
        if (fragClass == null) {
            return;
        }
        MarryEditProfileBaseMvpFrag marryEditProfileBaseMvpFrag = (MarryEditProfileBaseMvpFrag) supportFragmentManager.m2583r0().instantiate(fragClass.getClassLoader(), fragClass.getName());
        this.f205751g = marryEditProfileBaseMvpFrag;
        if (z) {
            marryEditProfileBaseMvpFrag.m47500R4();
        }
        if (m220977r0() > 0) {
            abstractC0427kM2567m.m2813u(tzb0.f172718e, tzb0.f172719f);
            abstractC0427kM2567m.m2811s(a5c0.f67695r, this.f205751g);
        } else {
            abstractC0427kM2567m.m2803b(a5c0.f67695r, this.f205751g);
        }
        abstractC0427kM2567m.mo2708j();
        ((czw) this.viewModel).m109442l(m220977r0(), this.f205745a.size() - 1);
        ((czw) this.viewModel).m109441k(m220977r0() == this.f205745a.size() - 1);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: Z */
    public void mo39469Z() {
        super.mo39469Z();
        m220960u0();
        creates(new e30() { // from class: l.ryw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161591a.m220961z0((Bundle) obj);
            }
        });
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
    }

    @Override // p149l.jq2, p149l.q0m
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public void mo51532C(czw czwVar) {
        super.mo51532C(czwVar);
    }

    /* JADX INFO: renamed from: n0 */
    public final boolean m220974n0() {
        if (!this.f205751g.f30419A.mo104515b(this.f205749e, this.f205746b)) {
            return false;
        }
        j760<Boolean, String> j760VarMo138776d = this.f205751g.f30419A.mo138776d(this.f205749e);
        if (!this.f205749e.isRequired() || j760VarMo138776d.f116564a.booleanValue()) {
            return true;
        }
        osi0.m165783g(TextUtils.isEmpty(j760VarMo138776d.f116565b) ? "请填写内容/选择选项，完善资料可以为你推荐更合适的人" : j760VarMo138776d.f116565b);
        return false;
    }

    /* JADX INFO: renamed from: p0 */
    public MarryEditProfileBaseMvpFrag m220975p0() {
        return this.f205751g;
    }

    /* JADX INFO: renamed from: q0 */
    public MarrySeriesType m220976q0() {
        return this.f205749e;
    }

    /* JADX INFO: renamed from: r0 */
    public int m220977r0() {
        MarrySeriesType marrySeriesType;
        if (vwb.m200296J(this.f205745a) || (marrySeriesType = this.f205749e) == null) {
            return -1;
        }
        return this.f205745a.indexOf(marrySeriesType);
    }

    /* JADX INFO: renamed from: s0 */
    public ArrayList<MarrySeriesType> m220978s0() {
        return this.f205745a;
    }

    /* JADX INFO: renamed from: t0 */
    public User m220979t0() {
        return this.f205746b;
    }

    /* JADX INFO: renamed from: x0 */
    public boolean m220980x0() {
        return TextUtils.equals(this.f205750f, "from_ideal_type_swipe_guide");
    }

    /* JADX INFO: renamed from: y0 */
    public boolean m220981y0() {
        return this.f205748d;
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
