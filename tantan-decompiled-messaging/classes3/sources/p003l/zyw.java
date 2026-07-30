package p003l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.base.MarryEditProfileBaseMvpFrag;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.loop.bean.MarrySeriesType;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ProfileEditInfo;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.core.ui.ProfileEditInfoException;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.io.Serializable;
import java.util.ArrayList;
import l.a5c0;
import l.j760;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.osi0;
import l.roj0;
import l.tw6;
import l.tzb0;
import l.vwb;
import l.xh0;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class zyw extends jq2<czw> {

    /* JADX INFO: renamed from: a */
    public ArrayList<MarrySeriesType> f9502a;

    /* JADX INFO: renamed from: b */
    public User f9503b;

    /* JADX INFO: renamed from: c */
    public boolean f9504c;

    /* JADX INFO: renamed from: d */
    public boolean f9505d;

    /* JADX INFO: renamed from: e */
    public MarrySeriesType f9506e;

    /* JADX INFO: renamed from: f */
    public String f9507f;

    /* JADX INFO: renamed from: g */
    public MarryEditProfileBaseMvpFrag f9508g;

    public zyw(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ ProfileEditInfo m9522f0(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: o0 */
    private void m9529o0() {
        Intent intent = new Intent();
        intent.putExtra("loop_edit_user", (Serializable) this.f9503b);
        act().hideInput();
        act().setResult(-1, intent);
        act().finish();
    }

    /* JADX INFO: renamed from: u0 */
    private void m9530u0() {
        Bundle extras = act().getIntent().getExtras();
        if (extras == null) {
            act().finish();
            return;
        }
        this.f9507f = extras.getString("from");
        this.f9503b = extras.getSerializable("args_edit_user");
        this.f9504c = extras.getBoolean("args_patch_user_at_once");
        this.f9505d = extras.getBoolean("args_secondary_page");
        this.f9502a = (ArrayList) extras.getSerializable("args_type_list");
        if (extras.getBoolean("args_loop")) {
            this.f9502a = m2x.m6214u(vwb.J(this.f9502a) ? null : this.f9502a.get(0), this.f9503b);
        }
        if (vwb.J(this.f9502a)) {
            act().finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public /* synthetic */ void m9531z0(Bundle bundle) {
        ((czw) ((jq2) this).viewModel).m3514f();
        m9543N0(true);
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m9532A0(View view) {
        m9542L0();
    }

    /* JADX INFO: renamed from: C0 */
    public final /* synthetic */ void m9534C0(View view) {
        m9542L0();
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m9535D0(View view) {
        m9529o0();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.p1.mobile.putong.core.ui.ProfileEditInfoException */
    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ C1099c m9536E0(User user, ProfileEditInfo profileEditInfo) throws ProfileEditInfoException {
        if (profileEditInfo == null || !profileEditInfo.isHit) {
            return CoreModule.c.e0.u9(user);
        }
        User user2 = this.f9503b;
        User user3 = profileEditInfo.user;
        user2.description = user3.description;
        user2.profile = user3.profile;
        user2.name = user3.name;
        cww.m3490i(profileEditInfo, user2);
        throw new ProfileEditInfoException(profileEditInfo);
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m9537F0(roj0 roj0Var) {
        act().progressDismiss();
        m9529o0();
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m9538G0(Throwable th) {
        act().progressDismiss();
        if (!(th instanceof ProfileEditInfoException)) {
            osi0.b("上传失败");
        } else if (tw6.d(((ProfileEditInfoException) th).getEditInfo(), act().pageId())) {
            lsi0.w(R.string.s);
        } else {
            osi0.f(R.string.Y0);
        }
        if (((czw) ((jq2) this).viewModel).act().m503c2()) {
            m9529o0();
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final void m9539H0() {
        if (this.f9502a.indexOf(this.f9506e) + 1 > this.f9502a.size() - 1) {
            m9542L0();
        } else {
            m9543N0(false);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public void m9540I0() {
        if (this.f9502a.size() == 1) {
            m9529o0();
            return;
        }
        if (((czw) ((jq2) this).viewModel).act().m503c2()) {
            new xh0.a(act()).s("还差一点就完成啦").g(true).b(true).j("完善资料展示真实、生动的你，即可解锁精选，认识更多优质朋友。").r("继续填写").f("确认退出").c(new View.OnClickListener() { // from class: l.syw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f7370a.m9532A0(view);
                }
            }).a().g();
        } else if (m9553x0()) {
            new xh0.a(act()).s("确认退出").g(true).b(true).j(act().getString(R.string.f0)).r("继续填写").f("确认退出").c(new View.OnClickListener() { // from class: l.tyw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f7824a.m9534C0(view);
                }
            }).a().g();
        } else {
            new xh0.a(act()).s("还差一点就完成啦！").g(true).b(true).j("希望每个加入的人资料真实、态度真诚，认真完善资料，迈出寻找理想伴侣的第一步～").r("继续填写").f("确认退出").c(new View.OnClickListener() { // from class: l.uyw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8139a.m9535D0(view);
                }
            }).a().g();
        }
    }

    /* JADX INFO: renamed from: J0 */
    public void m9541J0() {
        if (m9547n0()) {
            this.f9508g.f310A.mo3209e(this.f9506e, this.f9503b);
            m9539H0();
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final void m9542L0() {
        if (!this.f9504c) {
            m9529o0();
            return;
        }
        if (this.f9506e == MarrySeriesType.PROLOGUE && this.f9502a.size() == 1 && this.f9503b.subtract(CoreModule.c.e0.p9()) == null) {
            m9529o0();
            return;
        }
        User userClone = this.f9503b.clone();
        final User userSubtract = userClone.subtract(CoreModule.c.e0.p9());
        if (!NullChecker.a(userSubtract)) {
            m9529o0();
            return;
        }
        act().progress(R.string.R0);
        ProfileEditInfo profileEditInfoNew_ = ProfileEditInfo.new_();
        profileEditInfoNew_.user = userClone;
        duringCreated(CoreModule.c.B0.t4(profileEditInfoNew_).onErrorReturn(new w9j() { // from class: l.vyw
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return zyw.m9522f0((Throwable) obj);
            }
        }).flatMap(new w9j() { // from class: l.wyw
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f8722a.m9536E0(userSubtract, (ProfileEditInfo) obj);
            }
        })).subscribe((m250) mkd0.H(new e30() { // from class: l.xyw
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f8882a.m9537F0((roj0) obj);
            }
        }, new e30() { // from class: l.yyw
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f9181a.m9538G0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N0 */
    public final void m9543N0(boolean z) {
        if (vwb.J(this.f9502a)) {
            return;
        }
        if (m9550r0() + 1 >= this.f9502a.size()) {
            return;
        }
        this.f9506e = this.f9502a.get(m9550r0() + 1);
        FragmentManager supportFragmentManager = act().getSupportFragmentManager();
        k kVarM = supportFragmentManager.m();
        Class<?> fragClass = this.f9506e.getFragClass();
        if (fragClass == null) {
            return;
        }
        MarryEditProfileBaseMvpFrag marryEditProfileBaseMvpFragInstantiate = supportFragmentManager.r0().instantiate(fragClass.getClassLoader(), fragClass.getName());
        this.f9508g = marryEditProfileBaseMvpFragInstantiate;
        if (z) {
            marryEditProfileBaseMvpFragInstantiate.m548R4();
        }
        if (m9550r0() > 0) {
            kVarM.u(tzb0.e, tzb0.f);
            kVarM.s(a5c0.r, this.f9508g);
        } else {
            kVarM.b(a5c0.r, this.f9508g);
        }
        kVarM.j();
        ((czw) ((jq2) this).viewModel).m3517l(m9550r0(), this.f9502a.size() - 1);
        ((czw) ((jq2) this).viewModel).m3516k(m9550r0() == this.f9502a.size() - 1);
    }

    /* JADX INFO: renamed from: Z */
    public void m9544Z() {
        super.Z();
        m9530u0();
        creates(new e30() { // from class: l.ryw
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f7116a.m9531z0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a0 */
    public void m9545a0() {
        super.a0();
    }

    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public void m9533C(czw czwVar) {
        super.C(czwVar);
    }

    /* JADX INFO: renamed from: n0 */
    public final boolean m9547n0() {
        if (!this.f9508g.f310A.mo3207b(this.f9506e, this.f9503b)) {
            return false;
        }
        j760<Boolean, String> j760VarMo5255d = this.f9508g.f310A.mo5255d(this.f9506e);
        if (!this.f9506e.isRequired() || ((Boolean) j760VarMo5255d.a).booleanValue()) {
            return true;
        }
        osi0.g(TextUtils.isEmpty((CharSequence) j760VarMo5255d.b) ? "请填写内容/选择选项，完善资料可以为你推荐更合适的人" : (String) j760VarMo5255d.b);
        return false;
    }

    /* JADX INFO: renamed from: p0 */
    public MarryEditProfileBaseMvpFrag m9548p0() {
        return this.f9508g;
    }

    /* JADX INFO: renamed from: q0 */
    public MarrySeriesType m9549q0() {
        return this.f9506e;
    }

    /* JADX INFO: renamed from: r0 */
    public int m9550r0() {
        MarrySeriesType marrySeriesType;
        if (vwb.J(this.f9502a) || (marrySeriesType = this.f9506e) == null) {
            return -1;
        }
        return this.f9502a.indexOf(marrySeriesType);
    }

    /* JADX INFO: renamed from: s0 */
    public ArrayList<MarrySeriesType> m9551s0() {
        return this.f9502a;
    }

    /* JADX INFO: renamed from: t0 */
    public User m9552t0() {
        return this.f9503b;
    }

    /* JADX INFO: renamed from: x0 */
    public boolean m9553x0() {
        return TextUtils.equals(this.f9507f, "from_ideal_type_swipe_guide");
    }

    /* JADX INFO: renamed from: y0 */
    public boolean m9554y0() {
        return this.f9505d;
    }

    public void destroy() {
    }
}
