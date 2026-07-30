package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.newui.main.view.LinearLayoutFixedLayout;
import com.p000p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.p000p1.mobile.putong.newui.view.VIPShimmerTag;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.ui.vip.privilegeNewUi.VipNewUtils;
import com.p1.mobile.putong.core.view.diamond.BlackDiamondTagView;
import com.p1.mobile.putong.data.BloodType;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.Studies;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserWealthGradeConfig;
import com.p1.mobile.putong.data.Work;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.b43;
import l.hm4;
import l.jjb0;
import l.ngm;
import l.qib0;
import l.qp8;
import l.rza;
import l.t100;
import l.tm90;
import l.u59;
import l.upa;
import l.vwb;
import l.x2c0;
import l.xdl0;
import l.ym2;
import p009l.i0g0;
import p009l.mqi0;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CardUserContentView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f2555c;

    /* JADX INFO: renamed from: d */
    public LinearLayoutFixedLayout f2556d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f2557e;

    /* JADX INFO: renamed from: f */
    public VText f2558f;

    /* JADX INFO: renamed from: g */
    public VText f2559g;

    /* JADX INFO: renamed from: h */
    public ODiamondTagLabel f2560h;

    /* JADX INFO: renamed from: i */
    public VIPShimmerTag f2561i;

    /* JADX INFO: renamed from: j */
    public VImage f2562j;

    /* JADX INFO: renamed from: k */
    public BlackDiamondTagView f2563k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f2564l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f2565m;

    /* JADX INFO: renamed from: n */
    public VText f2566n;

    /* JADX INFO: renamed from: o */
    public VText f2567o;

    /* JADX INFO: renamed from: p */
    public VText f2568p;

    /* JADX INFO: renamed from: q */
    public VText f2569q;

    /* JADX INFO: renamed from: r */
    public VLinear f2570r;

    /* JADX INFO: renamed from: s */
    public VDraweeView f2571s;

    /* JADX INFO: renamed from: t */
    public VText f2572t;

    /* JADX INFO: renamed from: u */
    public VText f2573u;

    /* JADX INFO: renamed from: v */
    public VText f2574v;

    /* JADX INFO: renamed from: w */
    public boolean f2575w;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardUserContentView$a */
    public class C0222a extends ym2 {
        public C0222a() {
        }

        /* JADX INFO: renamed from: h */
        public void m3149h(String str, ngm ngmVar, Animatable animatable) {
            super.h(str, ngmVar, animatable);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) CardUserContentView.this.f2565m.getLayoutParams();
            int i = t100.q;
            layoutParams.height = i;
            layoutParams.width = (int) ((ngmVar.getWidth() / ngmVar.getHeight()) * i);
            int width = ngmVar.getWidth();
            int height = ngmVar.getHeight();
            CardUserContentView cardUserContentView = CardUserContentView.this;
            if (width == height) {
                cardUserContentView.f2565m.setBackgroundResource(x2c0.R2);
            } else {
                cardUserContentView.f2565m.setBackground(null);
            }
            CardUserContentView.this.f2565m.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardUserContentView$b */
    public static class C0223b {

        /* JADX INFO: renamed from: k */
        public static final Object f2577k = new Object();

        /* JADX INFO: renamed from: l */
        public static int f2578l;

        /* JADX INFO: renamed from: m */
        public static C0223b f2579m;

        /* JADX INFO: renamed from: a */
        public boolean f2580a;

        /* JADX INFO: renamed from: b */
        public boolean f2581b;

        /* JADX INFO: renamed from: c */
        public boolean f2582c;

        /* JADX INFO: renamed from: d */
        public boolean f2583d;

        /* JADX INFO: renamed from: e */
        public boolean f2584e;

        /* JADX INFO: renamed from: f */
        public boolean f2585f;

        /* JADX INFO: renamed from: g */
        public User f2586g;

        /* JADX INFO: renamed from: h */
        public CoreSuggested.UserInfo f2587h;

        /* JADX INFO: renamed from: i */
        public boolean f2588i;

        /* JADX INFO: renamed from: j */
        public C0223b f2589j;

        /* JADX INFO: renamed from: b */
        public static C0223b m3151b() {
            synchronized (f2577k) {
                try {
                    if (!NullChecker.a(f2579m)) {
                        return new C0223b();
                    }
                    C0223b c0223b = f2579m;
                    f2579m = c0223b.f2589j;
                    f2578l--;
                    c0223b.f2589j = null;
                    return c0223b;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m3152c() {
            synchronized (f2577k) {
                try {
                    int i = f2578l;
                    if (i < 10) {
                        this.f2589j = f2579m;
                        f2579m = this;
                        f2578l = i + 1;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public CardUserContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2575w = false;
    }

    /* JADX INFO: renamed from: f0 */
    private void m3131f0(User user) {
        Settings settings;
        List list;
        xdl0.M(this.f2565m, false);
        if (!qp8.b() || (settings = user.settings) == null || (list = settings.settingGroups) == null || list.isEmpty() || settings.settingGroups.get(0) == null || ((SettingGroups) settings.settingGroups.get(0)).live == null || ((SettingGroups) settings.settingGroups.get(0)).live.hideSwipeWealthTag.booleanValue()) {
            return;
        }
        UserWealthGradeConfig userWealthGradeConfigM9009Gj = CoreModule.Q().m9009Gj(((SettingGroups) settings.settingGroups.get(0)).live.wealthGrade, true);
        if (TextUtils.isEmpty(userWealthGradeConfigM9009Gj.wealthIconUrl)) {
            return;
        }
        xdl0.M(this.f2565m, true);
        qib0.G.M0(this.f2565m, userWealthGradeConfigM9009Gj.wealthIconUrl, new C0222a());
    }

    private void setUsTagBg(View... viewArr) {
        for (View view : viewArr) {
            if (view != null) {
                view.setBackgroundResource(x2c0.T2);
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m3132P(View view) {
        hm4.a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public final String m3133Q(User user) {
        return (user == null || !TextUtils.isEmpty("") || CoreModule.c.E0.B3(user) || user.isMe()) ? "" : i0g0.m16126Y(user.location).toString();
    }

    /* JADX INFO: renamed from: R */
    public final String m3134R(User user) {
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
        return (!TextUtils.isEmpty(str) || CoreModule.c.E0.B3(user) || user.isMe()) ? str : i0g0.m16122U(user.location, false, null, false, true).toString();
    }

    /* JADX INFO: renamed from: S */
    public final String m3135S(User user) {
        if (user == null) {
            return "";
        }
        String strM3133Q = m3133Q(user);
        String strM18540I = mqi0.m18540I(user.location.updatedTime, true);
        if (TextUtils.isEmpty(strM3133Q)) {
            return strM18540I;
        }
        return strM3133Q + " · " + strM18540I;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T */
    public final boolean m3136T() {
        View[] viewArr = {this.f2560h, this.f2562j, this.f2561i, this.f2565m, this.f2563k, this.f2566n, this.f2567o, this.f2568p, this.f2569q, this.f2573u, this.f2574v};
        boolean zO0 = false;
        for (int i = 0; i < 11; i++) {
            zO0 |= xdl0.O0(viewArr[i]);
        }
        return zO0;
    }

    /* JADX INFO: renamed from: V */
    public boolean m3137V() {
        return this.f2575w;
    }

    /* JADX INFO: renamed from: W */
    public void m3138W(User user, int i, boolean z) {
        m3141Z(user, i, z, C0223b.m3151b());
    }

    /* JADX INFO: renamed from: X */
    public void m3139X(User user, int i, boolean z, C0223b c0223b) {
        m3141Z(user, i, z, c0223b);
        if (NullChecker.a(c0223b)) {
            c0223b.m3152c();
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m3140Y(User user) {
        if (!user.isBlackDiamondVIP() || user.hideBlackDiamondTag()) {
            xdl0.M(this.f2563k, false);
        } else {
            xdl0.M(this.f2563k, true);
            this.f2563k.k0();
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m3141Z(User user, int i, boolean z, C0223b c0223b) {
        boolean z2 = false;
        if (c0223b.f2588i) {
            xdl0.M(this.f2564l, false);
        } else {
            xdl0.M(this.f2557e, false);
        }
        String strM3135S = c0223b.f2581b ? m3135S(user) : m3134R(user);
        this.f2555c.setText(strM3135S);
        xdl0.M(this.f2555c, !TextUtils.isEmpty(strM3135S));
        m3140Y(user);
        m3146e0(user, c0223b);
        m3131f0(user);
        m3144c0(user);
        xdl0.M(this.f2568p, false);
        xdl0.M(this.f2566n, false);
        this.f2575w = xdl0.O0(this.f2566n) || xdl0.O0(this.f2568p);
        this.f2573u.setText(m3148h0(user));
        m3145d0(user);
        VText vText = this.f2573u;
        if (!TextUtils.isEmpty(vText.getText()) && !b43.b()) {
            z2 = true;
        }
        xdl0.M(vText, z2);
        if (upa.N3()) {
            this.f2573u.setBackgroundResource(x2c0.S2);
            xdl0.X(this.f2556d, t100.d);
        }
        m3143b0(user, CoreModule.c.e0.na());
        xdl0.M(this.f2556d, m3136T());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a0 */
    public void m3142a0(Act act, User user) {
        xdl0.M(this.f2559g, true);
        Drawable drawable = getResources().getDrawable(x2c0.z2);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        this.f2559g.setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        xdl0.M(this.f2556d, true);
        boolean zIsNonBinary = user.isNonBinary();
        VText vText = this.f2559g;
        if (zIsNonBinary) {
            vText.setText(act.getString(R.string.zf));
        } else {
            vText.setText(user.isFemale() ? act.getString(R.string.Tc) : act.getString(R.string.Sc));
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m3143b0(User user, User user2) {
        boolean z = (user2 == null || !(TEnum.equals(user2.source, "facebook") || user2.settings.hideMutualContacts().booleanValue())) && !user.profile.contactLookups.lookups.isEmpty();
        if (z) {
            VText vText = this.f2574v;
            vText.setText(vText.getResources().getString(R.string.Y0, rza.K0(user.profile.contactLookups)));
        }
        xdl0.M(this.f2574v, z);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m3144c0(User user) {
        boolean zB = jjb0.b();
        VText vText = this.f2567o;
        if (zB) {
            xdl0.M(vText, false);
        } else {
            xdl0.M(vText, false);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m3145d0(User user) {
        xdl0.M(this.f2558f, false);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m3146e0(User user, C0223b c0223b) {
        xdl0.M(this.f2562j, false);
        xdl0.M(this.f2561i, false);
        xdl0.M(this.f2560h, false);
        boolean z = c0223b.f2583d;
        if (user.isMe() && z && user.isHideIconFromSVipWithMe()) {
            xdl0.M(this.f2562j, false);
        } else {
            xdl0.M(this.f2562j, true);
            CoreModule.P().e().ro(user, this.f2562j);
        }
        if (c0223b.f2585f && tm90.d().g(user) && !xdl0.O0(this.f2562j)) {
            xdl0.M(this.f2562j, true);
            if (CoreModule.o.d().ve(user)) {
                VImage vImage = this.f2562j;
                vImage.setImageDrawable(vImage.getContext().getDrawable(x2c0.Rc));
            } else if (u59.S() && user.isSVIP()) {
                VImage vImage2 = this.f2562j;
                vImage2.setImageDrawable(vImage2.getContext().getDrawable(x2c0.Qc));
            } else {
                VImage vImage3 = this.f2562j;
                vImage3.setImageDrawable(vImage3.getContext().getDrawable(VipNewUtils.g()));
            }
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m3147g0() {
        setUsTagBg(this.f2573u, this.f2565m, this.f2566n, this.f2567o, this.f2568p, this.f2569q, this.f2574v);
    }

    /* JADX INFO: renamed from: h0 */
    public final String m3148h0(User user) {
        return (!b43.b() || vwb.J(user.profile.extensions.physical.bloodType) || TEnum.equals((BloodType) user.profile.extensions.physical.bloodType.get(0), "UNKNOWN")) ? i0g0.m16137j0(user.profile.zodiac) : b43.a((BloodType) user.profile.extensions.physical.bloodType.get(0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m3132P(this);
    }

    public CardUserContentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardUserContentView(Context context) {
        this(context, null);
    }
}
