package p006l;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.settings.filter.newui.HiddenNearByView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.PrivacyMembershipSetting;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.data.Settings;
import com.tantanapp.common.utils.NullChecker;
import l.a5c0;
import l.e30;
import l.j760;
import l.s7m;
import l.sab0;
import l.vwb;
import l.xdl0;
import l.xh0;
import l.yij0;
import l.z640;
import l.zvf0;
import v.VLinear;
import v.VListCell;
import v.VSwitchButton;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class y640 implements s7m<u640> {

    /* JADX INFO: renamed from: a */
    public HiddenNearByView f28043a;

    /* JADX INFO: renamed from: b */
    public VListCell f28044b;

    /* JADX INFO: renamed from: c */
    public VListCell f28045c;

    /* JADX INFO: renamed from: d */
    public VListCell f28046d;

    /* JADX INFO: renamed from: e */
    public VListCell f28047e;

    /* JADX INFO: renamed from: f */
    public VListCell f28048f;

    /* JADX INFO: renamed from: g */
    public VLinear f28049g;

    /* JADX INFO: renamed from: h */
    public Act f28050h;

    /* JADX INFO: renamed from: i */
    public View f28051i;

    /* JADX INFO: renamed from: j */
    public u640 f28052j;

    /* JADX INFO: renamed from: k */
    public String f28053k = "";

    /* JADX INFO: renamed from: l */
    public PurchaseType f28054l;

    /* JADX INFO: renamed from: m */
    public Settings f28055m;

    /* JADX INFO: renamed from: l.y640$a */
    public class ViewOnClickListenerC1466a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f28056a;

        public ViewOnClickListenerC1466a(Runnable runnable) {
            this.f28056a = runnable;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (NullChecker.a(this.f28056a)) {
                this.f28056a.run();
            }
        }
    }

    public y640(Act act) {
        this.f28050h = act;
    }

    /* JADX INFO: renamed from: H */
    public static void m28089H(Act act, Runnable runnable) {
        xh0.a aVar = new xh0.a(act);
        aVar.j(CoreModule.m1854P().m11706a().m5230Bn() - qib0.f19784H.guessedCurrentServerTime() >= 0 ? act.string(R.string.p2) : "开启此功能会导致“查看谁喜欢我“列表内不会再有新的喜欢你的用户，如果后续再购买“查看谁喜欢我“将默认重新关闭").s(act.string(R.string.q2)).e(R.string.b0).q(R.string.h).o(new ViewOnClickListenerC1466a(runnable));
        aVar.a().g();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m28091b(int i, VListCell vListCell) {
        VSwitchButton vSwitchButtonFindViewById = vListCell.findViewById(a5c0.S);
        if (NullChecker.a(vSwitchButtonFindViewById)) {
            vSwitchButtonFindViewById.setActiveSliderColor(i);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m28092c(int i, int i2, VListCell vListCell) {
        VSwitchButton vSwitchButtonFindViewById = vListCell.findViewById(a5c0.S);
        if (NullChecker.a(vSwitchButtonFindViewById)) {
            vSwitchButtonFindViewById.setThumbActiveColor(i);
            vSwitchButtonFindViewById.setThumbInActiveColor(i2);
        }
    }

    /* JADX INFO: renamed from: A */
    public void m28093A(@ColorInt int i, VListCell... vListCellArr) {
        for (VListCell vListCell : vListCellArr) {
            vListCell.setTitleColor(i);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m28094B(Typeface typeface) {
        m28095C(typeface, this.f28044b, this.f28045c, this.f28046d, this.f28047e, this.f28048f);
    }

    /* JADX INFO: renamed from: C */
    public void m28095C(Typeface typeface, VListCell... vListCellArr) {
        for (VListCell vListCell : vListCellArr) {
            vListCell.setTitleTypeface(typeface);
        }
    }

    /* JADX INFO: renamed from: C0 */
    public Context m28096C0() {
        return this.f28050h;
    }

    /* JADX INFO: renamed from: E */
    public void m28097E(String str) {
        this.f28053k = str;
    }

    /* JADX INFO: renamed from: F */
    public void m28098F(PurchaseType purchaseType) {
        this.f28054l = purchaseType;
    }

    /* JADX INFO: renamed from: G */
    public void m28099G(@ColorInt int i) {
        m28093A(i, this.f28044b, this.f28045c, this.f28046d, this.f28047e, this.f28048f);
    }

    /* JADX INFO: renamed from: d */
    public final void m28100d(View view) {
        z640.a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public void mo8950e(View view) {
        this.f28051i = view;
        m28100d(view);
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void m28103i1(u640 u640Var) {
        this.f28052j = u640Var;
    }

    /* JADX INFO: renamed from: i */
    public void m28102i(final int i) {
        vwb.z(vwb.f0(new VListCell[]{this.f28044b, this.f28045c, this.f28046d, this.f28047e, this.f28048f}), new e30() { // from class: l.x640
            public final void call(Object obj) {
                y640.m28091b(i, (VListCell) obj);
            }
        });
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f28051i;
    }

    /* JADX INFO: renamed from: j */
    public void m28104j(final int i, final int i2) {
        vwb.z(vwb.f0(new VListCell[]{this.f28044b, this.f28045c, this.f28046d, this.f28047e, this.f28048f}), new e30() { // from class: l.w640
            public final void call(Object obj) {
                y640.m28092c(i, i2, (VListCell) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m28105k() {
        yij0.T(this.f28048f);
        this.f28052j.m25067x0(yij0.u(this.f28048f));
        this.f28052j.m25060W0();
    }

    /* JADX INFO: renamed from: l */
    public void m28106l() {
        yij0.T(this.f28044b);
        this.f28052j.m25064s0(yij0.u(this.f28044b));
        this.f28052j.m25060W0();
    }

    /* JADX INFO: renamed from: m */
    public void m28107m() {
        yij0.T(this.f28047e);
        this.f28052j.m25065t0(yij0.u(this.f28047e));
        this.f28052j.m25060W0();
    }

    /* JADX INFO: renamed from: n */
    public void m28108n() {
        yij0.T(this.f28045c);
        this.f28052j.m25066u0(yij0.u(this.f28045c));
        this.f28052j.m25060W0();
    }

    /* JADX INFO: renamed from: p */
    public void m28109p() {
        if (!yij0.u(this.f28046d)) {
            m28089H(act(), new Runnable() { // from class: l.v640
                @Override // java.lang.Runnable
                public final void run() {
                    this.f24162a.m28113w();
                }
            });
            return;
        }
        yij0.T(this.f28046d);
        this.f28052j.m25063b1(false);
        this.f28052j.m25060W0();
        zvf0.v("e_privacy", this.f28053k, new j760[]{vwb.Y("privacy_type", "show_to_mylikes_only")});
    }

    /* JADX INFO: renamed from: q */
    public String m28110q() {
        return this.f28053k;
    }

    /* JADX INFO: renamed from: r */
    public void mo16746r() {
        if (CoreModule.m1854P().m11706a().m5343Sk()) {
            this.f28046d.setTitle("仅限心动对象可见");
            this.f28046d.setSubTitle("开启后，只有你右滑过的人才能滑到你");
        }
        xdl0.E0(this.f28046d, this.f28052j.m25058S0());
        xdl0.E0(this.f28045c, this.f28052j.m25057R0());
        xdl0.E0(this.f28047e, this.f28052j.m25056Q0());
        xdl0.E0(this.f28044b, this.f28052j.m25055P0());
        xdl0.E0(this.f28048f, this.f28052j.m25054O0());
        if (NullChecker.a(this.f28049g)) {
            xdl0.M(this.f28049g, true);
            if (sab0.i(this.f28054l)) {
                xdl0.M(this.f28049g, false);
                return;
            }
            return;
        }
        xdl0.M(this.f28048f, true);
        if (sab0.i(this.f28054l)) {
            xdl0.M(this.f28048f, false);
        }
        if (CoreModule.m1854P().m11711g().m7021xj()) {
            xdl0.M(this.f28043a, true);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m28111s(PrivacyMembershipSetting privacyMembershipSetting) {
        yij0.t(this.f28046d, privacyMembershipSetting.showMeToMyLike.booleanValue());
        yij0.t(this.f28045c, privacyMembershipSetting.hideLocation.booleanValue());
        yij0.t(this.f28047e, privacyMembershipSetting.hideAge.booleanValue());
        yij0.t(this.f28044b, privacyMembershipSetting.frozenActivity.booleanValue());
        yij0.t(this.f28048f, privacyMembershipSetting.hideIcon.booleanValue());
    }

    /* JADX INFO: renamed from: u */
    public void m28112u(Settings settings) {
        this.f28055m = settings;
        this.f28043a.m8759p(this.f28050h, settings);
    }

    /* JADX INFO: renamed from: v */
    public void mo16747v(View view) {
        mo8950e(view);
        mo16746r();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m28113w() {
        yij0.T(this.f28046d);
        this.f28052j.m25063b1(yij0.u(this.f28046d));
        this.f28052j.m25060W0();
        zvf0.v("e_privacy", this.f28053k, new j760[]{vwb.Y("privacy_type", "show_to_mylikes_only")});
    }

    /* JADX INFO: renamed from: x */
    public String m28114x() {
        return TextUtils.isEmpty(this.f28053k) ? "p_advanced_filter_page" : this.f28053k;
    }

    /* JADX INFO: renamed from: y */
    public void m28115y(Drawable drawable) {
        m28116z(drawable, this.f28044b, this.f28045c, this.f28046d, this.f28047e, this.f28048f);
    }

    /* JADX INFO: renamed from: z */
    public void m28116z(Drawable drawable, VListCell... vListCellArr) {
        for (VListCell vListCell : vListCellArr) {
            vListCell.setBackground(drawable);
        }
    }

    public void destroy() {
    }
}
