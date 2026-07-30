package p149l;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PrivacyMembershipSetting;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.settings.filter.newui.HiddenNearByView;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.Settings;
import com.tantanapp.common.utils.NullChecker;
import p147v.VLinear;
import p147v.VListCell;
import p147v.VSwitchButton;

/* JADX INFO: loaded from: classes9.dex */
public class y640 implements s7m<u640> {

    /* JADX INFO: renamed from: a */
    public HiddenNearByView f196509a;

    /* JADX INFO: renamed from: b */
    public VListCell f196510b;

    /* JADX INFO: renamed from: c */
    public VListCell f196511c;

    /* JADX INFO: renamed from: d */
    public VListCell f196512d;

    /* JADX INFO: renamed from: e */
    public VListCell f196513e;

    /* JADX INFO: renamed from: f */
    public VListCell f196514f;

    /* JADX INFO: renamed from: g */
    public VLinear f196515g;

    /* JADX INFO: renamed from: h */
    public Act f196516h;

    /* JADX INFO: renamed from: i */
    public View f196517i;

    /* JADX INFO: renamed from: j */
    public u640 f196518j;

    /* JADX INFO: renamed from: k */
    public String f196519k = "";

    /* JADX INFO: renamed from: l */
    public PurchaseType f196520l;

    /* JADX INFO: renamed from: m */
    public Settings f196521m;

    /* JADX INFO: renamed from: l.y640$a */
    public class ViewOnClickListenerC21313a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f196522a;

        public ViewOnClickListenerC21313a(Runnable runnable) {
            this.f196522a = runnable;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (NullChecker.m81303a(this.f196522a)) {
                this.f196522a.run();
            }
        }
    }

    public y640(Act act) {
        this.f196516h = act;
    }

    /* JADX INFO: renamed from: H */
    public static void m213068H(Act act, Runnable runnable) {
        xh0.C21150a c21150a = new xh0.C21150a(act);
        c21150a.m208731j(CoreModule.m29935P().m94651a().mo33293Bn() - qib0.f154693H.guessedCurrentServerTime() >= 0 ? act.string(R$string.f27908p2) : "开启此功能会导致“查看谁喜欢我“列表内不会再有新的喜欢你的用户，如果后续再购买“查看谁喜欢我“将默认重新关闭").m208740s(act.string(R$string.f27914q2)).m208726e(R$string.f27822b0).m208738q(R$string.f27857h).m208736o(new ViewOnClickListenerC21313a(runnable));
        c21150a.m208722a().m208721g();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m213070b(int i, VListCell vListCell) {
        VSwitchButton vSwitchButton = (VSwitchButton) vListCell.findViewById(a5c0.f67665S);
        if (NullChecker.m81303a(vSwitchButton)) {
            vSwitchButton.setActiveSliderColor(i);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m213071c(int i, int i2, VListCell vListCell) {
        VSwitchButton vSwitchButton = (VSwitchButton) vListCell.findViewById(a5c0.f67665S);
        if (NullChecker.m81303a(vSwitchButton)) {
            vSwitchButton.setThumbActiveColor(i);
            vSwitchButton.setThumbInActiveColor(i2);
        }
    }

    /* JADX INFO: renamed from: A */
    public void m213072A(@ColorInt int i, VListCell... vListCellArr) {
        for (VListCell vListCell : vListCellArr) {
            vListCell.setTitleColor(i);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m213073B(Typeface typeface) {
        m213074C(typeface, this.f196510b, this.f196511c, this.f196512d, this.f196513e, this.f196514f);
    }

    /* JADX INFO: renamed from: C */
    public void m213074C(Typeface typeface, VListCell... vListCellArr) {
        for (VListCell vListCell : vListCellArr) {
            vListCell.setTitleTypeface(typeface);
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f196516h;
    }

    /* JADX INFO: renamed from: E */
    public void m213075E(String str) {
        this.f196519k = str;
    }

    /* JADX INFO: renamed from: F */
    public void m213076F(PurchaseType purchaseType) {
        this.f196520l = purchaseType;
    }

    /* JADX INFO: renamed from: G */
    public void m213077G(@ColorInt int i) {
        m213072A(i, this.f196510b, this.f196511c, this.f196512d, this.f196513e, this.f196514f);
    }

    /* JADX INFO: renamed from: d */
    public final void m213078d(View view) {
        z640.m217388a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public void mo55557e(View view) {
        this.f196517i = view;
        m213078d(view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(u640 u640Var) {
        this.f196518j = u640Var;
    }

    /* JADX INFO: renamed from: i */
    public void m213080i(final int i) {
        vwb.m200354z(vwb.m200324f0(this.f196510b, this.f196511c, this.f196512d, this.f196513e, this.f196514f), new e30() { // from class: l.x640
            @Override // p149l.e30
            public final void call(Object obj) {
                y640.m213070b(i, (VListCell) obj);
            }
        });
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f196517i;
    }

    /* JADX INFO: renamed from: j */
    public void m213081j(final int i, final int i2) {
        vwb.m200354z(vwb.m200324f0(this.f196510b, this.f196511c, this.f196512d, this.f196513e, this.f196514f), new e30() { // from class: l.w640
            @Override // p149l.e30
            public final void call(Object obj) {
                y640.m213071c(i, i2, (VListCell) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m213082k() {
        yij0.m214942T(this.f196514f);
        this.f196518j.m191951x0(yij0.m214965u(this.f196514f));
        this.f196518j.m191944W0();
    }

    /* JADX INFO: renamed from: l */
    public void m213083l() {
        yij0.m214942T(this.f196510b);
        this.f196518j.m191948s0(yij0.m214965u(this.f196510b));
        this.f196518j.m191944W0();
    }

    /* JADX INFO: renamed from: m */
    public void m213084m() {
        yij0.m214942T(this.f196513e);
        this.f196518j.m191949t0(yij0.m214965u(this.f196513e));
        this.f196518j.m191944W0();
    }

    /* JADX INFO: renamed from: n */
    public void m213085n() {
        yij0.m214942T(this.f196511c);
        this.f196518j.m191950u0(yij0.m214965u(this.f196511c));
        this.f196518j.m191944W0();
    }

    /* JADX INFO: renamed from: p */
    public void m213086p() {
        if (!yij0.m214965u(this.f196512d)) {
            m213068H(act(), new Runnable() { // from class: l.v640
                @Override // java.lang.Runnable
                public final void run() {
                    this.f180154a.m213090w();
                }
            });
            return;
        }
        yij0.m214942T(this.f196512d);
        this.f196518j.m191947b1(false);
        this.f196518j.m191944W0();
        zvf0.m220400v("e_privacy", this.f196519k, vwb.m200311Y("privacy_type", "show_to_mylikes_only"));
    }

    /* JADX INFO: renamed from: q */
    public String m213087q() {
        return this.f196519k;
    }

    /* JADX INFO: renamed from: r */
    public void mo137126r() {
        if (CoreModule.m29935P().m94651a().mo33406Sk()) {
            this.f196512d.setTitle("仅限心动对象可见");
            this.f196512d.setSubTitle("开启后，只有你右滑过的人才能滑到你");
        }
        xdl0.m208329E0(this.f196512d, this.f196518j.m191942S0());
        xdl0.m208329E0(this.f196511c, this.f196518j.m191941R0());
        xdl0.m208329E0(this.f196513e, this.f196518j.m191940Q0());
        xdl0.m208329E0(this.f196510b, this.f196518j.m191939P0());
        xdl0.m208329E0(this.f196514f, this.f196518j.m191938O0());
        if (NullChecker.m81303a(this.f196515g)) {
            xdl0.m208344M(this.f196515g, true);
            if (sab0.m182891i(this.f196520l)) {
                xdl0.m208344M(this.f196515g, false);
                return;
            }
            return;
        }
        xdl0.m208344M(this.f196514f, true);
        if (sab0.m182891i(this.f196520l)) {
            xdl0.m208344M(this.f196514f, false);
        }
        if (CoreModule.m29935P().m94656g().mo35084xj()) {
            xdl0.m208344M(this.f196509a, true);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m213088s(PrivacyMembershipSetting privacyMembershipSetting) {
        yij0.m214964t(this.f196512d, privacyMembershipSetting.showMeToMyLike.booleanValue());
        yij0.m214964t(this.f196511c, privacyMembershipSetting.hideLocation.booleanValue());
        yij0.m214964t(this.f196513e, privacyMembershipSetting.hideAge.booleanValue());
        yij0.m214964t(this.f196510b, privacyMembershipSetting.frozenActivity.booleanValue());
        yij0.m214964t(this.f196514f, privacyMembershipSetting.hideIcon.booleanValue());
    }

    /* JADX INFO: renamed from: u */
    public void m213089u(Settings settings) {
        this.f196521m = settings;
        this.f196509a.m55386p(this.f196516h, settings);
    }

    /* JADX INFO: renamed from: v */
    public void mo137127v(View view) {
        mo55557e(view);
        mo137126r();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m213090w() {
        yij0.m214942T(this.f196512d);
        this.f196518j.m191947b1(yij0.m214965u(this.f196512d));
        this.f196518j.m191944W0();
        zvf0.m220400v("e_privacy", this.f196519k, vwb.m200311Y("privacy_type", "show_to_mylikes_only"));
    }

    /* JADX INFO: renamed from: x */
    public String m213091x() {
        return TextUtils.isEmpty(this.f196519k) ? "p_advanced_filter_page" : this.f196519k;
    }

    /* JADX INFO: renamed from: y */
    public void m213092y(Drawable drawable) {
        m213093z(drawable, this.f196510b, this.f196511c, this.f196512d, this.f196513e, this.f196514f);
    }

    /* JADX INFO: renamed from: z */
    public void m213093z(Drawable drawable, VListCell... vListCellArr) {
        for (VListCell vListCell : vListCellArr) {
            vListCell.setBackground(drawable);
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
