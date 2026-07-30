package com.p051p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.newui.main.view.LinearLayoutFixedLayout;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.VipNewUtils;
import com.p051p1.mobile.putong.core.view.diamond.BlackDiamondTagView;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.Studies;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserWealthGradeConfig;
import com.p051p1.mobile.putong.data.Work;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.p051p1.mobile.putong.newui.view.VIPShimmerTag;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.d79;
import p153l.dbc0;
import p153l.e1b;
import p153l.fn2;
import p153l.gn4;
import p153l.gra;
import p153l.jyb;
import p153l.nrb0;
import p153l.pzi0;
import p153l.q8g0;
import p153l.qa00;
import p153l.qim;
import p153l.r43;
import p153l.uqb0;
import p153l.vq8;
import p153l.xu90;

/* JADX INFO: loaded from: classes11.dex */
public class CardUserContentView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f24519c;

    /* JADX INFO: renamed from: d */
    public LinearLayoutFixedLayout f24520d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f24521e;

    /* JADX INFO: renamed from: f */
    public VText f24522f;

    /* JADX INFO: renamed from: g */
    public VText f24523g;

    /* JADX INFO: renamed from: h */
    public ODiamondTagLabel f24524h;

    /* JADX INFO: renamed from: i */
    public VIPShimmerTag f24525i;

    /* JADX INFO: renamed from: j */
    public VImage f24526j;

    /* JADX INFO: renamed from: k */
    public BlackDiamondTagView f24527k;

    /* JADX INFO: renamed from: l */
    public LinearLayout f24528l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f24529m;

    /* JADX INFO: renamed from: n */
    public VText f24530n;

    /* JADX INFO: renamed from: o */
    public VText f24531o;

    /* JADX INFO: renamed from: p */
    public VText f24532p;

    /* JADX INFO: renamed from: q */
    public VText f24533q;

    /* JADX INFO: renamed from: r */
    public VLinear f24534r;

    /* JADX INFO: renamed from: s */
    public VDraweeView f24535s;

    /* JADX INFO: renamed from: t */
    public VText f24536t;

    /* JADX INFO: renamed from: u */
    public VText f24537u;

    /* JADX INFO: renamed from: v */
    public VText f24538v;

    /* JADX INFO: renamed from: w */
    public boolean f24539w;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardUserContentView$a */
    public class C8209a extends fn2 {
        public C8209a() {
        }

        @Override // p153l.fn2
        /* JADX INFO: renamed from: h */
        public void mo40111h(String str, qim qimVar, Animatable animatable) {
            super.mo40111h(str, qimVar, animatable);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) CardUserContentView.this.f24529m.getLayoutParams();
            int i = qa00.f156330q;
            layoutParams.height = i;
            layoutParams.width = (int) ((qimVar.getWidth() / qimVar.getHeight()) * i);
            int width = qimVar.getWidth();
            int height = qimVar.getHeight();
            CardUserContentView cardUserContentView = CardUserContentView.this;
            if (width == height) {
                cardUserContentView.f24529m.setBackgroundResource(dbc0.f86555S2);
            } else {
                cardUserContentView.f24529m.setBackground(null);
            }
            CardUserContentView.this.f24529m.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardUserContentView$b */
    public static class C8210b {

        /* JADX INFO: renamed from: k */
        public static final Object f24541k = new Object();

        /* JADX INFO: renamed from: l */
        public static int f24542l;

        /* JADX INFO: renamed from: m */
        public static C8210b f24543m;

        /* JADX INFO: renamed from: a */
        public boolean f24544a;

        /* JADX INFO: renamed from: b */
        public boolean f24545b;

        /* JADX INFO: renamed from: c */
        public boolean f24546c;

        /* JADX INFO: renamed from: d */
        public boolean f24547d;

        /* JADX INFO: renamed from: e */
        public boolean f24548e;

        /* JADX INFO: renamed from: f */
        public boolean f24549f;

        /* JADX INFO: renamed from: g */
        public User f24550g;

        /* JADX INFO: renamed from: h */
        public CoreSuggested.UserInfo f24551h;

        /* JADX INFO: renamed from: i */
        public boolean f24552i;

        /* JADX INFO: renamed from: j */
        public C8210b f24553j;

        /* JADX INFO: renamed from: b */
        public static C8210b m40138b() {
            synchronized (f24541k) {
                try {
                    if (!NullChecker.m82486a(f24543m)) {
                        return new C8210b();
                    }
                    C8210b c8210b = f24543m;
                    f24543m = c8210b.f24553j;
                    f24542l--;
                    c8210b.f24553j = null;
                    return c8210b;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m40139c() {
            synchronized (f24541k) {
                try {
                    int i = f24542l;
                    if (i < 10) {
                        this.f24553j = f24543m;
                        f24543m = this;
                        f24542l = i + 1;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public CardUserContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24539w = false;
    }

    /* JADX INFO: renamed from: f0 */
    private void m40119f0(User user) {
        Settings settings;
        List<SettingGroups> list;
        bnl0.m105524M(this.f24529m, false);
        if (!vq8.m202358b() || (settings = user.settings) == null || (list = settings.settingGroups) == null || list.isEmpty() || settings.settingGroups.get(0) == null || settings.settingGroups.get(0).live == null || settings.settingGroups.get(0).live.hideSwipeWealthTag.booleanValue()) {
            return;
        }
        UserWealthGradeConfig userWealthGradeConfigMo68402Gj = CoreModule.m30934Q().mo68402Gj(settings.settingGroups.get(0).live.wealthGrade, true);
        if (TextUtils.isEmpty(userWealthGradeConfigMo68402Gj.wealthIconUrl)) {
            return;
        }
        bnl0.m105524M(this.f24529m, true);
        uqb0.f180374G.m127117M0(this.f24529m, userWealthGradeConfigMo68402Gj.wealthIconUrl, new C8209a());
    }

    private void setUsTagBg(View... viewArr) {
        for (View view : viewArr) {
            if (view != null) {
                view.setBackgroundResource(dbc0.f86619U2);
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m40120P(View view) {
        gn4.m130846a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public final String m40121Q(User user) {
        return (user == null || !TextUtils.isEmpty("") || CoreModule.f18264c.f20303E0.m141060B3(user) || user.isMe()) ? "" : q8g0.m175793Y(user.location).toString();
    }

    /* JADX INFO: renamed from: R */
    public final String m40122R(User user) {
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
        return (!TextUtils.isEmpty(str) || CoreModule.f18264c.f20303E0.m141060B3(user) || user.isMe()) ? str : q8g0.m175789U(user.location, false, null, false, true).toString();
    }

    /* JADX INFO: renamed from: S */
    public final String m40123S(User user) {
        if (user == null) {
            return "";
        }
        String strM40121Q = m40121Q(user);
        String strM174444I = pzi0.m174444I(user.location.updatedTime, true);
        if (TextUtils.isEmpty(strM40121Q)) {
            return strM174444I;
        }
        return strM40121Q + " · " + strM174444I;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m40124T() {
        View[] viewArr = {this.f24524h, this.f24526j, this.f24525i, this.f24529m, this.f24527k, this.f24530n, this.f24531o, this.f24532p, this.f24533q, this.f24537u, this.f24538v};
        boolean zM105529O0 = false;
        for (int i = 0; i < 11; i++) {
            zM105529O0 |= bnl0.m105529O0(viewArr[i]);
        }
        return zM105529O0;
    }

    /* JADX INFO: renamed from: V */
    public boolean m40125V() {
        return this.f24539w;
    }

    /* JADX INFO: renamed from: W */
    public void m40126W(User user, int i, boolean z) {
        m40129Z(user, i, z, C8210b.m40138b());
    }

    /* JADX INFO: renamed from: X */
    public void m40127X(User user, int i, boolean z, C8210b c8210b) {
        m40129Z(user, i, z, c8210b);
        if (NullChecker.m82486a(c8210b)) {
            c8210b.m40139c();
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m40128Y(User user) {
        if (!user.isBlackDiamondVIP() || user.hideBlackDiamondTag()) {
            bnl0.m105524M(this.f24527k, false);
        } else {
            bnl0.m105524M(this.f24527k, true);
            this.f24527k.m60824k0();
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m40129Z(User user, int i, boolean z, C8210b c8210b) {
        boolean z2 = false;
        if (c8210b.f24552i) {
            bnl0.m105524M(this.f24528l, false);
        } else {
            bnl0.m105524M(this.f24521e, false);
        }
        String strM40123S = c8210b.f24545b ? m40123S(user) : m40122R(user);
        this.f24519c.setText(strM40123S);
        bnl0.m105524M(this.f24519c, !TextUtils.isEmpty(strM40123S));
        m40128Y(user);
        m40134e0(user, c8210b);
        m40119f0(user);
        m40132c0(user);
        bnl0.m105524M(this.f24532p, false);
        bnl0.m105524M(this.f24530n, false);
        this.f24539w = bnl0.m105529O0(this.f24530n) || bnl0.m105529O0(this.f24532p);
        this.f24537u.setText(m40136h0(user));
        m40133d0(user);
        VText vText = this.f24537u;
        if (!TextUtils.isEmpty(vText.getText()) && !r43.m179739b()) {
            z2 = true;
        }
        bnl0.m105524M(vText, z2);
        if (gra.m131606N3()) {
            this.f24537u.setBackgroundResource(dbc0.f86587T2);
            bnl0.m105540X(this.f24520d, qa00.f156317d);
        }
        m40131b0(user, CoreModule.f18264c.f20381e0.m116593na());
        bnl0.m105524M(this.f24520d, m40124T());
    }

    /* JADX INFO: renamed from: a0 */
    public void m40130a0(Act act, User user) {
        bnl0.m105524M(this.f24523g, true);
        Drawable drawable = getResources().getDrawable(dbc0.f85979A2);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        this.f24523g.setCompoundDrawables(drawable, null, null, null);
        bnl0.m105524M(this.f24520d, true);
        boolean zIsNonBinary = user.isNonBinary();
        VText vText = this.f24523g;
        if (zIsNonBinary) {
            vText.setText(act.getString(R$string.f18822Rf));
        } else {
            vText.setText(user.isFemale() ? act.getString(R$string.f19428ld) : act.getString(R$string.f19397kd));
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m40131b0(User user, User user2) {
        boolean z = (user2 == null || !(TEnum.equals(user2.source, "facebook") || user2.settings.hideMutualContacts().booleanValue())) && !user.profile.contactLookups.lookups.isEmpty();
        if (z) {
            VText vText = this.f24538v;
            vText.setText(vText.getResources().getString(R$string.f19017Y0, e1b.m118953K0(user.profile.contactLookups)));
        }
        bnl0.m105524M(this.f24538v, z);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m40132c0(User user) {
        boolean zM164466b = nrb0.m164466b();
        VText vText = this.f24531o;
        if (zM164466b) {
            bnl0.m105524M(vText, false);
        } else {
            bnl0.m105524M(vText, false);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m40133d0(User user) {
        bnl0.m105524M(this.f24522f, false);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m40134e0(User user, C8210b c8210b) {
        bnl0.m105524M(this.f24526j, false);
        bnl0.m105524M(this.f24525i, false);
        bnl0.m105524M(this.f24524h, false);
        boolean z = c8210b.f24547d;
        if (user.isMe() && z && user.isHideIconFromSVipWithMe()) {
            bnl0.m105524M(this.f24526j, false);
        } else {
            bnl0.m105524M(this.f24526j, true);
            CoreModule.m30933P().m143408e().mo35990ro(user, this.f24526j);
        }
        if (c8210b.f24549f && xu90.m213122d().m213128g(user) && !bnl0.m105529O0(this.f24526j)) {
            bnl0.m105524M(this.f24526j, true);
            if (CoreModule.f18276o.m132214d().mo34940ve(user)) {
                VImage vImage = this.f24526j;
                vImage.setImageDrawable(vImage.getContext().getDrawable(dbc0.f86565Sc));
            } else if (d79.m114661T() && user.isSVIP()) {
                VImage vImage2 = this.f24526j;
                vImage2.setImageDrawable(vImage2.getContext().getDrawable(dbc0.f86533Rc));
            } else {
                VImage vImage3 = this.f24526j;
                vImage3.setImageDrawable(vImage3.getContext().getDrawable(VipNewUtils.m58693g()));
            }
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m40135g0() {
        setUsTagBg(this.f24537u, this.f24529m, this.f24530n, this.f24531o, this.f24532p, this.f24533q, this.f24538v);
    }

    /* JADX INFO: renamed from: h0 */
    public final String m40136h0(User user) {
        return (!r43.m179739b() || jyb.m147479J(user.profile.extensions.physical.bloodType) || TEnum.equals(user.profile.extensions.physical.bloodType.get(0), "UNKNOWN")) ? q8g0.m175804j0(user.profile.zodiac) : r43.m179738a(user.profile.extensions.physical.bloodType.get(0));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40120P(this);
    }

    public CardUserContentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardUserContentView(Context context) {
        this(context, null);
    }
}
