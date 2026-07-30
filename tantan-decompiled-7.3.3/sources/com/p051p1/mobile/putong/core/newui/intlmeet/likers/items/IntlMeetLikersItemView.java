package com.p051p1.mobile.putong.core.newui.intlmeet.likers.items;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.SuperlikeByCount;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.Region;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VLinear_FillerMeasure;
import p151v.VText;
import p151v.VText_NoTopPadding;
import p153l.bnl0;
import p153l.cio;
import p153l.gbc0;
import p153l.gta;
import p153l.jyb;
import p153l.q8g0;
import p153l.qa00;
import p153l.r8g0;
import p153l.uqb0;
import p153l.x20;
import p153l.ygo;
import p153l.yio;

/* JADX INFO: loaded from: classes11.dex */
public class IntlMeetLikersItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f24976a;

    /* JADX INFO: renamed from: b */
    public VLinear f24977b;

    /* JADX INFO: renamed from: c */
    public VText f24978c;

    /* JADX INFO: renamed from: d */
    public VImage f24979d;

    /* JADX INFO: renamed from: e */
    public VImage f24980e;

    /* JADX INFO: renamed from: f */
    public VImage f24981f;

    /* JADX INFO: renamed from: g */
    public VImage f24982g;

    /* JADX INFO: renamed from: h */
    public VImage f24983h;

    /* JADX INFO: renamed from: i */
    public ConstraintLayout f24984i;

    /* JADX INFO: renamed from: j */
    public VLinear_FillerMeasure f24985j;

    /* JADX INFO: renamed from: k */
    public VText_NoTopPadding f24986k;

    /* JADX INFO: renamed from: l */
    public VText_NoTopPadding f24987l;

    /* JADX INFO: renamed from: m */
    public VImage f24988m;

    /* JADX INFO: renamed from: n */
    public VLinear_FillerMeasure f24989n;

    /* JADX INFO: renamed from: o */
    public VText_NoTopPadding f24990o;

    /* JADX INFO: renamed from: p */
    public VText_NoTopPadding f24991p;

    /* JADX INFO: renamed from: q */
    public User f24992q;

    public IntlMeetLikersItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: f */
    public static Location m40410f(Location location) {
        Location locationMo225055clone = location.mo225055clone();
        if (location.isHideInfo()) {
            if (location.isHideRegionCity()) {
                locationMo225055clone.region.city = null;
                return locationMo225055clone;
            }
            if (location.isHideRegionDistrict()) {
                locationMo225055clone.region.district = null;
            }
        }
        return locationMo225055clone;
    }

    /* JADX INFO: renamed from: g */
    public static CharSequence m40411g(Region region, Region region2) {
        String str;
        boolean z = false;
        boolean z2 = !TextUtils.isEmpty(region.city) && region.city.equals(region2.city);
        boolean z3 = !TextUtils.isEmpty(region.country) && region.country.equals(region2.country);
        if (!TextUtils.isEmpty(region.country) && !region.country.equals(region2.country)) {
            z = true;
        }
        if (!TextUtils.isEmpty(region.district) && region.equals(region2)) {
            return null;
        }
        if (z2 && z3) {
            return "";
        }
        if ((z3 || z) && (str = region.city) != null) {
            return str;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static String m40412h(User user) {
        boolean zIsEmpty = TextUtils.isEmpty(user.profile.work.department);
        Profile profile = user.profile;
        return !zIsEmpty ? profile.work.department : profile.studies.school;
    }

    /* JADX INFO: renamed from: j */
    public static CharSequence m40413j(Location location) {
        Region region = m40410f(location).region;
        User userMe_ = uqb0.f180396b0.f170325b.me_();
        if (userMe_ == null) {
            return null;
        }
        return m40411g(region, userMe_.location.region);
    }

    /* JADX INFO: renamed from: k */
    public static String m40414k(Context context, User user) {
        if (m40416q(user)) {
            return user.profile.studies.school;
        }
        if (user.profile.work.active) {
            String strM40412h = m40412h(user);
            if (!TextUtils.isEmpty(strM40412h)) {
                return strM40412h;
            }
        }
        Profile profile = user.profile;
        return profile.studies.active ? CoreModule.f18263b.getString(R$string.f21354S0) : profile.work.industry;
    }

    /* JADX INFO: renamed from: m */
    public static CharSequence m40415m(Location location) {
        CharSequence charSequenceM40413j = m40413j(location);
        if (!TextUtils.isEmpty(charSequenceM40413j)) {
            return charSequenceM40413j;
        }
        return String.format(CoreModule.f18263b.getString(com.p051p1.mobile.putong.common.R$string.f18062K1), q8g0.m175813r(location.mo225055clone(), true, true));
    }

    /* JADX INFO: renamed from: q */
    public static boolean m40416q(User user) {
        if (user.profile.studies.active) {
            return true;
        }
        return IntlCountryCodeController.m29115l() && CoreModule.f18273l.m143405a().mo34309Dn(user.profile.studies.qualification) && !r8g0.m180203b(user.profile.studies.school);
    }

    /* JADX INFO: renamed from: d */
    public final void m40417d(View view) {
        ygo.m215850a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public Act m40418e() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m40419i(x20 x20Var, View view) {
        if (m40418e().lifecycle_() == C4470c.f16267i) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m40420l(cio cioVar, final x20 x20Var, final x20 x20Var2, final x20 x20Var3) {
        this.f24992q = cioVar.getUser();
        setOnClickListener(new View.OnClickListener() { // from class: l.vgo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f184050a.m40419i(x20Var, view);
            }
        });
        m40421n(this.f24992q);
        this.f24981f.setVisibility(4);
        this.f24980e.setVisibility(4);
        m40423p(this.f24992q);
        if (IntlCountryCodeController.m29125v() && NullChecker.m82486a(x20Var2) && NullChecker.m82486a(x20Var3)) {
            this.f24982g.setVisibility(0);
            this.f24983h.setVisibility(0);
            this.f24982g.setOnClickListener(new View.OnClickListener() { // from class: l.wgo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    x20Var2.call();
                }
            });
            this.f24983h.setOnClickListener(new View.OnClickListener() { // from class: l.xgo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    x20Var3.call();
                }
            });
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m40421n(User user) {
        String string;
        uqb0.f180374G.m127119N0(this.f24976a, this.f24992q.m61308fp().profileMiddle().formatted(), false);
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.m8319s(qa00.f156321h);
        this.f24976a.getHierarchy().m207045H(roundingParams);
        this.f24976a.getLayoutParams().height = -1;
        bnl0.m105537U(this.f24976a, 0);
        this.f24986k.setText(user.name);
        this.f24987l.setText(user.age.toString());
        bnl0.m105524M(this.f24987l, !CoreModule.f18264c.f20303E0.m141091z3(user));
        uqb0.f180396b0.f170325b.showUserVerificationLogo(m40418e(), this.f24992q, this.f24988m);
        if (gta.m132210e().m132214d().mo34738Oq()) {
            m40422o(user);
            return;
        }
        boolean zM141060B3 = CoreModule.f18264c.f20303E0.m141060B3(user);
        String strM40414k = m40414k(m40418e(), user);
        bnl0.m105524M(this.f24989n, true);
        this.f24990o.setText(m40415m(user.location));
        VText_NoTopPadding vText_NoTopPadding = this.f24991p;
        if (TextUtils.isEmpty(strM40414k)) {
            string = "";
        } else {
            string = bnl0.m105529O0(this.f24990o) ? m40418e().getString(R$string.f21368Z0, strM40414k) : strM40414k;
        }
        vText_NoTopPadding.setText(string);
        bnl0.m105524M(this.f24990o, !zM141060B3);
        bnl0.m105524M(this.f24989n, (zM141060B3 && TextUtils.isEmpty(strM40414k)) ? false : true);
    }

    /* JADX INFO: renamed from: o */
    public final void m40422o(User user) {
        yio.C21610a c21610aM216342b = yio.m216342b(user);
        int i = c21610aM216342b.f200228b;
        VText_NoTopPadding vText_NoTopPadding = this.f24990o;
        if (i != 0) {
            vText_NoTopPadding.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
            this.f24990o.setCompoundDrawablePadding(qa00.f156318e);
        } else {
            vText_NoTopPadding.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        this.f24990o.setText(c21610aM216342b.f200227a);
        bnl0.m105524M(this.f24990o, true);
        bnl0.m105524M(this.f24991p, false);
        bnl0.m105524M(this.f24989n, true);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40417d(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m40423p(User user) {
        bnl0.m105524M(this.f24977b, false);
        if (!gta.m132210e().m132214d().mo34852ic() || jyb.m147479J(CoreModule.f18264c.f20432v0.f130575X)) {
            return;
        }
        for (SuperlikeByCount superlikeByCount : CoreModule.f18264c.f20432v0.f130575X) {
            if (TextUtils.equals(superlikeByCount.f21252id, user.f56859id)) {
                bnl0.m105524M(this.f24977b, true);
                this.f24978c.setTypeface(Typeface.defaultFromStyle(1));
                this.f24978c.setText(String.format(App.f16088e.getString(R$string.f21388g0), Integer.valueOf(superlikeByCount.count)));
                this.f24979d.setImageResource(IntlCountryCodeController.m29125v() ? gbc0.f103211U : gbc0.f103204T);
                return;
            }
        }
    }

    public IntlMeetLikersItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlMeetLikersItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
