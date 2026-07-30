package com.p046p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.newui.main.view.LinearLayoutFixedLayout;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.VipNewUtils;
import com.p046p1.mobile.putong.core.view.diamond.BlackDiamondTagView;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.Studies;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserWealthGradeConfig;
import com.p046p1.mobile.putong.data.Work;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.p046p1.mobile.putong.newui.view.VIPShimmerTag;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.b43;
import p149l.hm4;
import p149l.i0g0;
import p149l.jjb0;
import p149l.mqi0;
import p149l.ngm;
import p149l.qib0;
import p149l.qp8;
import p149l.rza;
import p149l.t100;
import p149l.tm90;
import p149l.u59;
import p149l.upa;
import p149l.vwb;
import p149l.x2c0;
import p149l.xdl0;
import p149l.ym2;

/* JADX INFO: loaded from: classes11.dex */
public class CardUserContentView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f23777c;

    /* JADX INFO: renamed from: d */
    public LinearLayoutFixedLayout f23778d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f23779e;

    /* JADX INFO: renamed from: f */
    public VText f23780f;

    /* JADX INFO: renamed from: g */
    public VText f23781g;

    /* JADX INFO: renamed from: h */
    public ODiamondTagLabel f23782h;

    /* JADX INFO: renamed from: i */
    public VIPShimmerTag f23783i;

    /* JADX INFO: renamed from: j */
    public VImage f23784j;

    /* JADX INFO: renamed from: k */
    public BlackDiamondTagView f23785k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f23786l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f23787m;

    /* JADX INFO: renamed from: n */
    public VText f23788n;

    /* JADX INFO: renamed from: o */
    public VText f23789o;

    /* JADX INFO: renamed from: p */
    public VText f23790p;

    /* JADX INFO: renamed from: q */
    public VText f23791q;

    /* JADX INFO: renamed from: r */
    public VLinear f23792r;

    /* JADX INFO: renamed from: s */
    public VDraweeView f23793s;

    /* JADX INFO: renamed from: t */
    public VText f23794t;

    /* JADX INFO: renamed from: u */
    public VText f23795u;

    /* JADX INFO: renamed from: v */
    public VText f23796v;

    /* JADX INFO: renamed from: w */
    public boolean f23797w;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardUserContentView$a */
    public class C8058a extends ym2 {
        public C8058a() {
        }

        @Override // p149l.ym2
        /* JADX INFO: renamed from: h */
        public void mo39108h(String str, ngm ngmVar, Animatable animatable) {
            super.mo39108h(str, ngmVar, animatable);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) CardUserContentView.this.f23787m.getLayoutParams();
            int i = t100.f167268q;
            layoutParams.height = i;
            layoutParams.width = (int) ((ngmVar.getWidth() / ngmVar.getHeight()) * i);
            int width = ngmVar.getWidth();
            int height = ngmVar.getHeight();
            CardUserContentView cardUserContentView = CardUserContentView.this;
            if (width == height) {
                cardUserContentView.f23787m.setBackgroundResource(x2c0.f189689R2);
            } else {
                cardUserContentView.f23787m.setBackground(null);
            }
            CardUserContentView.this.f23787m.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardUserContentView$b */
    public static class C8059b {

        /* JADX INFO: renamed from: k */
        public static final Object f23799k = new Object();

        /* JADX INFO: renamed from: l */
        public static int f23800l;

        /* JADX INFO: renamed from: m */
        public static C8059b f23801m;

        /* JADX INFO: renamed from: a */
        public boolean f23802a;

        /* JADX INFO: renamed from: b */
        public boolean f23803b;

        /* JADX INFO: renamed from: c */
        public boolean f23804c;

        /* JADX INFO: renamed from: d */
        public boolean f23805d;

        /* JADX INFO: renamed from: e */
        public boolean f23806e;

        /* JADX INFO: renamed from: f */
        public boolean f23807f;

        /* JADX INFO: renamed from: g */
        public User f23808g;

        /* JADX INFO: renamed from: h */
        public CoreSuggested.UserInfo f23809h;

        /* JADX INFO: renamed from: i */
        public boolean f23810i;

        /* JADX INFO: renamed from: j */
        public C8059b f23811j;

        /* JADX INFO: renamed from: b */
        public static C8059b m39135b() {
            synchronized (f23799k) {
                try {
                    if (!NullChecker.m81303a(f23801m)) {
                        return new C8059b();
                    }
                    C8059b c8059b = f23801m;
                    f23801m = c8059b.f23811j;
                    f23800l--;
                    c8059b.f23811j = null;
                    return c8059b;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m39136c() {
            synchronized (f23799k) {
                try {
                    int i = f23800l;
                    if (i < 10) {
                        this.f23811j = f23801m;
                        f23801m = this;
                        f23800l = i + 1;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public CardUserContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23797w = false;
    }

    /* JADX INFO: renamed from: f0 */
    private void m39116f0(User user) {
        Settings settings;
        List<SettingGroups> list;
        xdl0.m208344M(this.f23787m, false);
        if (!qp8.m175817b() || (settings = user.settings) == null || (list = settings.settingGroups) == null || list.isEmpty() || settings.settingGroups.get(0) == null || settings.settingGroups.get(0).live == null || settings.settingGroups.get(0).live.hideSwipeWealthTag.booleanValue()) {
            return;
        }
        UserWealthGradeConfig userWealthGradeConfigMo67219Gj = CoreModule.m29936Q().mo67219Gj(settings.settingGroups.get(0).live.wealthGrade, true);
        if (TextUtils.isEmpty(userWealthGradeConfigMo67219Gj.wealthIconUrl)) {
            return;
        }
        xdl0.m208344M(this.f23787m, true);
        qib0.f154691G.m102333M0(this.f23787m, userWealthGradeConfigMo67219Gj.wealthIconUrl, new C8058a());
    }

    private void setUsTagBg(View... viewArr) {
        for (View view : viewArr) {
            if (view != null) {
                view.setBackgroundResource(x2c0.f189751T2);
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m39117P(View view) {
        hm4.m131695a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public final String m39118Q(User user) {
        return (user == null || !TextUtils.isEmpty("") || CoreModule.f17545c.f19561E0.m203772B3(user) || user.isMe()) ? "" : i0g0.m133858Y(user.location).toString();
    }

    /* JADX INFO: renamed from: R */
    public final String m39119R(User user) {
        String str;
        Studies studies = user.profile.studies;
        String str2 = "";
        if (studies.active) {
            str = studies.school;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        } else {
            str = "";
        }
        Work work = user.profile.work;
        if (work.active) {
            str = work.company;
            if (TextUtils.isEmpty(str)) {
                Work work2 = user.profile.work;
                String str3 = work2.department;
                String str4 = work2.industry;
                if (TextUtils.equals(str3, "其他") || TextUtils.equals(str3, "其它")) {
                    str3 = "";
                }
                if (!TextUtils.equals(str4, "其他") && !TextUtils.equals(str4, "其它")) {
                    str2 = str4;
                }
                if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str2)) {
                    str = str3 + str2;
                } else {
                    str = str3 + " · " + str2;
                }
            }
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return (!TextUtils.isEmpty(str) || CoreModule.f17545c.f19561E0.m203772B3(user) || user.isMe()) ? str : i0g0.m133854U(user.location, false, null, false, true).toString();
    }

    /* JADX INFO: renamed from: S */
    public final String m39120S(User user) {
        if (user == null) {
            return "";
        }
        String strM39118Q = m39118Q(user);
        String strM155934I = mqi0.m155934I(user.location.updatedTime, true);
        if (TextUtils.isEmpty(strM39118Q)) {
            return strM155934I;
        }
        return strM39118Q + " · " + strM155934I;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m39121T() {
        View[] viewArr = {this.f23782h, this.f23784j, this.f23783i, this.f23787m, this.f23785k, this.f23788n, this.f23789o, this.f23790p, this.f23791q, this.f23795u, this.f23796v};
        boolean zM208349O0 = false;
        for (int i = 0; i < 11; i++) {
            zM208349O0 |= xdl0.m208349O0(viewArr[i]);
        }
        return zM208349O0;
    }

    /* JADX INFO: renamed from: V */
    public boolean m39122V() {
        return this.f23797w;
    }

    /* JADX INFO: renamed from: W */
    public void m39123W(User user, int i, boolean z) {
        m39126Z(user, i, z, C8059b.m39135b());
    }

    /* JADX INFO: renamed from: X */
    public void m39124X(User user, int i, boolean z, C8059b c8059b) {
        m39126Z(user, i, z, c8059b);
        if (NullChecker.m81303a(c8059b)) {
            c8059b.m39136c();
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m39125Y(User user) {
        if (!user.isBlackDiamondVIP() || user.hideBlackDiamondTag()) {
            xdl0.m208344M(this.f23785k, false);
        } else {
            xdl0.m208344M(this.f23785k, true);
            this.f23785k.m59640k0();
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m39126Z(User user, int i, boolean z, C8059b c8059b) {
        boolean z2 = false;
        if (c8059b.f23810i) {
            xdl0.m208344M(this.f23786l, false);
        } else {
            xdl0.m208344M(this.f23779e, false);
        }
        String strM39120S = c8059b.f23803b ? m39120S(user) : m39119R(user);
        this.f23777c.setText(strM39120S);
        xdl0.m208344M(this.f23777c, !TextUtils.isEmpty(strM39120S));
        m39125Y(user);
        m39131e0(user, c8059b);
        m39116f0(user);
        m39129c0(user);
        xdl0.m208344M(this.f23790p, false);
        xdl0.m208344M(this.f23788n, false);
        this.f23797w = xdl0.m208349O0(this.f23788n) || xdl0.m208349O0(this.f23790p);
        this.f23795u.setText(m39133h0(user));
        m39130d0(user);
        VText vText = this.f23795u;
        if (!TextUtils.isEmpty(vText.getText()) && !b43.m100168b()) {
            z2 = true;
        }
        xdl0.m208344M(vText, z2);
        if (upa.m194675N3()) {
            this.f23795u.setBackgroundResource(x2c0.f189720S2);
            xdl0.m208360X(this.f23778d, t100.f167255d);
        }
        m39128b0(user, CoreModule.f17545c.f19639e0.m169520na());
        xdl0.m208344M(this.f23778d, m39121T());
    }

    /* JADX INFO: renamed from: a0 */
    public void m39127a0(Act act, User user) {
        xdl0.m208344M(this.f23781g, true);
        Drawable drawable = getResources().getDrawable(x2c0.f190765z2);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        this.f23781g.setCompoundDrawables(drawable, null, null, null);
        xdl0.m208344M(this.f23778d, true);
        boolean zIsNonBinary = user.isNonBinary();
        VText vText = this.f23781g;
        if (zIsNonBinary) {
            vText.setText(act.getString(R$string.f19124zf));
        } else {
            vText.setText(user.isFemale() ? act.getString(R$string.f18149Tc) : act.getString(R$string.f18119Sc));
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m39128b0(User user, User user2) {
        boolean z = (user2 == null || !(TEnum.equals(user2.source, "facebook") || user2.settings.hideMutualContacts().booleanValue())) && !user.profile.contactLookups.lookups.isEmpty();
        if (z) {
            VText vText = this.f23796v;
            vText.setText(vText.getResources().getString(R$string.f18287Y0, rza.m181731K0(user.profile.contactLookups)));
        }
        xdl0.m208344M(this.f23796v, z);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m39129c0(User user) {
        boolean zM141784b = jjb0.m141784b();
        VText vText = this.f23789o;
        if (zM141784b) {
            xdl0.m208344M(vText, false);
        } else {
            xdl0.m208344M(vText, false);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m39130d0(User user) {
        xdl0.m208344M(this.f23780f, false);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m39131e0(User user, C8059b c8059b) {
        xdl0.m208344M(this.f23784j, false);
        xdl0.m208344M(this.f23783i, false);
        xdl0.m208344M(this.f23782h, false);
        boolean z = c8059b.f23805d;
        if (user.isMe() && z && user.isHideIconFromSVipWithMe()) {
            xdl0.m208344M(this.f23784j, false);
        } else {
            xdl0.m208344M(this.f23784j, true);
            CoreModule.m29935P().m94654e().mo34987ro(user, this.f23784j);
        }
        if (c8059b.f23807f && tm90.m189643d().m189649g(user) && !xdl0.m208349O0(this.f23784j)) {
            xdl0.m208344M(this.f23784j, true);
            if (CoreModule.f17557o.m195057d().mo33937ve(user)) {
                VImage vImage = this.f23784j;
                vImage.setImageDrawable(vImage.getContext().getDrawable(x2c0.f189699Rc));
            } else if (u59.m191810S() && user.isSVIP()) {
                VImage vImage2 = this.f23784j;
                vImage2.setImageDrawable(vImage2.getContext().getDrawable(x2c0.f189668Qc));
            } else {
                VImage vImage3 = this.f23784j;
                vImage3.setImageDrawable(vImage3.getContext().getDrawable(VipNewUtils.m57510g()));
            }
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m39132g0() {
        setUsTagBg(this.f23795u, this.f23787m, this.f23788n, this.f23789o, this.f23790p, this.f23791q, this.f23796v);
    }

    /* JADX INFO: renamed from: h0 */
    public final String m39133h0(User user) {
        return (!b43.m100168b() || vwb.m200296J(user.profile.extensions.physical.bloodType) || TEnum.equals(user.profile.extensions.physical.bloodType.get(0), "UNKNOWN")) ? i0g0.m133869j0(user.profile.zodiac) : b43.m100167a(user.profile.extensions.physical.bloodType.get(0));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39117P(this);
    }

    public CardUserContentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardUserContentView(Context context) {
        this(context, null);
    }
}
