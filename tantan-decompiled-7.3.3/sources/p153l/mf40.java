package p153l;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PrivacyMembershipSetting;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.settings.filter.newui.HiddenNearByView;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.Settings;
import com.tantanapp.common.utils.NullChecker;
import p151v.VLinear;
import p151v.VListCell;
import p151v.VSwitchButton;

/* JADX INFO: loaded from: classes12.dex */
public class mf40 implements iam<if40> {

    /* JADX INFO: renamed from: a */
    public HiddenNearByView f136592a;

    /* JADX INFO: renamed from: b */
    public VListCell f136593b;

    /* JADX INFO: renamed from: c */
    public VListCell f136594c;

    /* JADX INFO: renamed from: d */
    public VListCell f136595d;

    /* JADX INFO: renamed from: e */
    public VListCell f136596e;

    /* JADX INFO: renamed from: f */
    public VListCell f136597f;

    /* JADX INFO: renamed from: g */
    public VLinear f136598g;

    /* JADX INFO: renamed from: h */
    public Act f136599h;

    /* JADX INFO: renamed from: i */
    public View f136600i;

    /* JADX INFO: renamed from: j */
    public if40 f136601j;

    /* JADX INFO: renamed from: k */
    public String f136602k = "";

    /* JADX INFO: renamed from: l */
    public PurchaseType f136603l;

    /* JADX INFO: renamed from: m */
    public Settings f136604m;

    /* JADX INFO: renamed from: l.mf40$a */
    public class ViewOnClickListenerC18604a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f136605a;

        public ViewOnClickListenerC18604a(Runnable runnable) {
            this.f136605a = runnable;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (NullChecker.m82486a(this.f136605a)) {
                this.f136605a.run();
            }
        }
    }

    public mf40(Act act) {
        this.f136599h = act;
    }

    /* JADX INFO: renamed from: H */
    public static void m158106H(Act act, Runnable runnable) {
        th0.C20312a c20312a = new th0.C20312a(act);
        c20312a.m191151j(CoreModule.m30933P().m143405a().mo34296Bn() - uqb0.f180376H.guessedCurrentServerTime() >= 0 ? act.string(R$string.f28756p2) : "开启此功能会导致“查看谁喜欢我“列表内不会再有新的喜欢你的用户，如果后续再购买“查看谁喜欢我“将默认重新关闭").m191160s(act.string(R$string.f28762q2)).m191146e(R$string.f28670b0).m191158q(R$string.f28705h).m191156o(new ViewOnClickListenerC18604a(runnable));
        c20312a.m191142a().m191141g();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m158108b(int i, VListCell vListCell) {
        VSwitchButton vSwitchButton = (VSwitchButton) vListCell.findViewById(gdc0.f103660S);
        if (NullChecker.m82486a(vSwitchButton)) {
            vSwitchButton.setActiveSliderColor(i);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m158109c(int i, int i2, VListCell vListCell) {
        VSwitchButton vSwitchButton = (VSwitchButton) vListCell.findViewById(gdc0.f103660S);
        if (NullChecker.m82486a(vSwitchButton)) {
            vSwitchButton.setThumbActiveColor(i);
            vSwitchButton.setThumbInActiveColor(i2);
        }
    }

    /* JADX INFO: renamed from: A */
    public void m158110A(@ColorInt int i, VListCell... vListCellArr) {
        for (VListCell vListCell : vListCellArr) {
            vListCell.setTitleColor(i);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m158111B(Typeface typeface) {
        m158112C(typeface, this.f136593b, this.f136594c, this.f136595d, this.f136596e, this.f136597f);
    }

    /* JADX INFO: renamed from: C */
    public void m158112C(Typeface typeface, VListCell... vListCellArr) {
        for (VListCell vListCell : vListCellArr) {
            vListCell.setTitleTypeface(typeface);
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f136599h;
    }

    /* JADX INFO: renamed from: E */
    public void m158113E(String str) {
        this.f136602k = str;
    }

    /* JADX INFO: renamed from: F */
    public void m158114F(PurchaseType purchaseType) {
        this.f136603l = purchaseType;
    }

    /* JADX INFO: renamed from: G */
    public void m158115G(@ColorInt int i) {
        m158110A(i, this.f136593b, this.f136594c, this.f136595d, this.f136596e, this.f136597f);
    }

    /* JADX INFO: renamed from: d */
    public final void m158116d(View view) {
        nf40.m162918a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public void mo56740e(View view) {
        this.f136600i = view;
        m158116d(view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(if40 if40Var) {
        this.f136601j = if40Var;
    }

    /* JADX INFO: renamed from: i */
    public void m158118i(final int i) {
        jyb.m147537z(jyb.m147507f0(this.f136593b, this.f136594c, this.f136595d, this.f136596e, this.f136597f), new y20() { // from class: l.lf40
            @Override // p153l.y20
            public final void call(Object obj) {
                mf40.m158108b(i, (VListCell) obj);
            }
        });
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f136600i;
    }

    /* JADX INFO: renamed from: j */
    public void m158119j(final int i, final int i2) {
        jyb.m147537z(jyb.m147507f0(this.f136593b, this.f136594c, this.f136595d, this.f136596e, this.f136597f), new y20() { // from class: l.kf40
            @Override // p153l.y20
            public final void call(Object obj) {
                mf40.m158109c(i, i2, (VListCell) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m158120k() {
        bsj0.m106262T(this.f136597f);
        this.f136601j.m139719x0(bsj0.m106285u(this.f136597f));
        this.f136601j.m139712W0();
    }

    /* JADX INFO: renamed from: l */
    public void m158121l() {
        bsj0.m106262T(this.f136593b);
        this.f136601j.m139716s0(bsj0.m106285u(this.f136593b));
        this.f136601j.m139712W0();
    }

    /* JADX INFO: renamed from: m */
    public void m158122m() {
        bsj0.m106262T(this.f136596e);
        this.f136601j.m139717t0(bsj0.m106285u(this.f136596e));
        this.f136601j.m139712W0();
    }

    /* JADX INFO: renamed from: n */
    public void m158123n() {
        bsj0.m106262T(this.f136594c);
        this.f136601j.m139718u0(bsj0.m106285u(this.f136594c));
        this.f136601j.m139712W0();
    }

    /* JADX INFO: renamed from: p */
    public void m158124p() {
        if (!bsj0.m106285u(this.f136595d)) {
            m158106H(act(), new Runnable() { // from class: l.jf40
                @Override // java.lang.Runnable
                public final void run() {
                    this.f120561a.m158130w();
                }
            });
            return;
        }
        bsj0.m106262T(this.f136595d);
        this.f136601j.m139715b1(false);
        this.f136601j.m139712W0();
        i4g0.m138524v("e_privacy", this.f136602k, jyb.m147494Y("privacy_type", "show_to_mylikes_only"));
    }

    /* JADX INFO: renamed from: q */
    public String m158125q() {
        return this.f136602k;
    }

    /* JADX INFO: renamed from: r */
    public void mo158126r() {
        if (CoreModule.m30933P().m143405a().mo34409Sk()) {
            this.f136595d.setTitle("仅限心动对象可见");
            this.f136595d.setSubTitle("开启后，只有你右滑过的人才能滑到你");
        }
        bnl0.m105509E0(this.f136595d, this.f136601j.m139710S0());
        bnl0.m105509E0(this.f136594c, this.f136601j.m139709R0());
        bnl0.m105509E0(this.f136596e, this.f136601j.m139708Q0());
        bnl0.m105509E0(this.f136593b, this.f136601j.m139707P0());
        bnl0.m105509E0(this.f136597f, this.f136601j.m139706O0());
        if (NullChecker.m82486a(this.f136598g)) {
            bnl0.m105524M(this.f136598g, true);
            if (wib0.m206565i(this.f136603l)) {
                bnl0.m105524M(this.f136598g, false);
                return;
            }
            return;
        }
        bnl0.m105524M(this.f136597f, true);
        if (wib0.m206565i(this.f136603l)) {
            bnl0.m105524M(this.f136597f, false);
        }
        if (CoreModule.m30933P().m143410g().mo36087xj()) {
            bnl0.m105524M(this.f136592a, true);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m158127s(PrivacyMembershipSetting privacyMembershipSetting) {
        bsj0.m106284t(this.f136595d, privacyMembershipSetting.showMeToMyLike.booleanValue());
        bsj0.m106284t(this.f136594c, privacyMembershipSetting.hideLocation.booleanValue());
        bsj0.m106284t(this.f136596e, privacyMembershipSetting.hideAge.booleanValue());
        bsj0.m106284t(this.f136593b, privacyMembershipSetting.frozenActivity.booleanValue());
        bsj0.m106284t(this.f136597f, privacyMembershipSetting.hideIcon.booleanValue());
    }

    /* JADX INFO: renamed from: u */
    public void m158128u(Settings settings) {
        this.f136604m = settings;
        this.f136592a.m56569p(this.f136599h, settings);
    }

    /* JADX INFO: renamed from: v */
    public void mo158129v(View view) {
        mo56740e(view);
        mo158126r();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m158130w() {
        bsj0.m106262T(this.f136595d);
        this.f136601j.m139715b1(bsj0.m106285u(this.f136595d));
        this.f136601j.m139712W0();
        i4g0.m138524v("e_privacy", this.f136602k, jyb.m147494Y("privacy_type", "show_to_mylikes_only"));
    }

    /* JADX INFO: renamed from: x */
    public String m158131x() {
        return TextUtils.isEmpty(this.f136602k) ? "p_advanced_filter_page" : this.f136602k;
    }

    /* JADX INFO: renamed from: y */
    public void m158132y(Drawable drawable) {
        m158133z(drawable, this.f136593b, this.f136594c, this.f136595d, this.f136596e, this.f136597f);
    }

    /* JADX INFO: renamed from: z */
    public void m158133z(Drawable drawable, VListCell... vListCellArr) {
        for (VListCell vListCell : vListCellArr) {
            vListCell.setBackground(drawable);
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
