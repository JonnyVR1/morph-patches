package com.p046p1.mobile.putong.core.newui.intlmeet.likers.items;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.SuperlikeByCount;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.data.Location;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.Region;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VLinear_FillerMeasure;
import p147v.VText;
import p147v.VText_NoTopPadding;
import p149l.b3c0;
import p149l.cgo;
import p149l.d30;
import p149l.i0g0;
import p149l.k0g0;
import p149l.qib0;
import p149l.t100;
import p149l.ura;
import p149l.vwb;
import p149l.xdl0;
import p149l.yeo;
import p149l.ygo;

/* JADX INFO: loaded from: classes11.dex */
public class IntlMeetLikersItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f24234a;

    /* JADX INFO: renamed from: b */
    public VLinear f24235b;

    /* JADX INFO: renamed from: c */
    public VText f24236c;

    /* JADX INFO: renamed from: d */
    public VImage f24237d;

    /* JADX INFO: renamed from: e */
    public VImage f24238e;

    /* JADX INFO: renamed from: f */
    public VImage f24239f;

    /* JADX INFO: renamed from: g */
    public VImage f24240g;

    /* JADX INFO: renamed from: h */
    public VImage f24241h;

    /* JADX INFO: renamed from: i */
    public ConstraintLayout f24242i;

    /* JADX INFO: renamed from: j */
    public VLinear_FillerMeasure f24243j;

    /* JADX INFO: renamed from: k */
    public VText_NoTopPadding f24244k;

    /* JADX INFO: renamed from: l */
    public VText_NoTopPadding f24245l;

    /* JADX INFO: renamed from: m */
    public VImage f24246m;

    /* JADX INFO: renamed from: n */
    public VLinear_FillerMeasure f24247n;

    /* JADX INFO: renamed from: o */
    public VText_NoTopPadding f24248o;

    /* JADX INFO: renamed from: p */
    public VText_NoTopPadding f24249p;

    /* JADX INFO: renamed from: q */
    public User f24250q;

    public IntlMeetLikersItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: f */
    public static Location m39407f(Location location) {
        Location locationMo223809clone = location.mo223809clone();
        if (location.isHideInfo()) {
            if (location.isHideRegionCity()) {
                locationMo223809clone.region.city = null;
                return locationMo223809clone;
            }
            if (location.isHideRegionDistrict()) {
                locationMo223809clone.region.district = null;
            }
        }
        return locationMo223809clone;
    }

    /* JADX INFO: renamed from: g */
    public static CharSequence m39408g(Region region, Region region2) {
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
    public static String m39409h(User user) {
        boolean zIsEmpty = TextUtils.isEmpty(user.profile.work.department);
        Profile profile = user.profile;
        return !zIsEmpty ? profile.work.department : profile.studies.school;
    }

    /* JADX INFO: renamed from: j */
    public static CharSequence m39410j(Location location) {
        Region region = m39407f(location).region;
        User userMe_ = qib0.f154713b0.f139231b.me_();
        if (userMe_ == null) {
            return null;
        }
        return m39408g(region, userMe_.location.region);
    }

    /* JADX INFO: renamed from: k */
    public static String m39411k(Context context, User user) {
        if (m39413q(user)) {
            return user.profile.studies.school;
        }
        if (user.profile.work.active) {
            String strM39409h = m39409h(user);
            if (!TextUtils.isEmpty(strM39409h)) {
                return strM39409h;
            }
        }
        Profile profile = user.profile;
        return profile.studies.active ? CoreModule.f17544b.getString(R$string.f20612S0) : profile.work.industry;
    }

    /* JADX INFO: renamed from: m */
    public static CharSequence m39412m(Location location) {
        CharSequence charSequenceM39410j = m39410j(location);
        if (!TextUtils.isEmpty(charSequenceM39410j)) {
            return charSequenceM39410j;
        }
        return String.format(CoreModule.f17544b.getString(com.p046p1.mobile.putong.common.R$string.f17343K1), i0g0.m133878r(location.mo223809clone(), true, true));
    }

    /* JADX INFO: renamed from: q */
    public static boolean m39413q(User user) {
        if (user.profile.studies.active) {
            return true;
        }
        return IntlCountryCodeController.m28116l() && CoreModule.f17554l.m94651a().mo33306Dn(user.profile.studies.qualification) && !k0g0.m144048b(user.profile.studies.school);
    }

    /* JADX INFO: renamed from: d */
    public final void m39414d(View view) {
        yeo.m214353a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public Act m39415e() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m39416i(d30 d30Var, View view) {
        if (m39415e().lifecycle_() == C4319c.f15548i) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m39417l(cgo cgoVar, final d30 d30Var, final d30 d30Var2, final d30 d30Var3) {
        this.f24250q = cgoVar.getUser();
        setOnClickListener(new View.OnClickListener() { // from class: l.veo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181213a.m39416i(d30Var, view);
            }
        });
        m39418n(this.f24250q);
        this.f24239f.setVisibility(4);
        this.f24238e.setVisibility(4);
        m39420p(this.f24250q);
        if (IntlCountryCodeController.m28126v() && NullChecker.m81303a(d30Var2) && NullChecker.m81303a(d30Var3)) {
            this.f24240g.setVisibility(0);
            this.f24241h.setVisibility(0);
            this.f24240g.setOnClickListener(new View.OnClickListener() { // from class: l.weo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d30Var2.call();
                }
            });
            this.f24241h.setOnClickListener(new View.OnClickListener() { // from class: l.xeo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d30Var3.call();
                }
            });
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m39418n(User user) {
        String string;
        qib0.f154691G.m102335N0(this.f24234a, this.f24250q.m60124fp().profileMiddle().formatted(), false);
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.m8265s(t100.f167259h);
        this.f24234a.getHierarchy().m112053H(roundingParams);
        this.f24234a.getLayoutParams().height = -1;
        xdl0.m208357U(this.f24234a, 0);
        this.f24244k.setText(user.name);
        this.f24245l.setText(user.age.toString());
        xdl0.m208344M(this.f24245l, !CoreModule.f17545c.f19561E0.m203803z3(user));
        qib0.f154713b0.f139231b.showUserVerificationLogo(m39415e(), this.f24250q, this.f24246m);
        if (ura.m195053e().m195057d().mo33735Oq()) {
            m39419o(user);
            return;
        }
        boolean zM203772B3 = CoreModule.f17545c.f19561E0.m203772B3(user);
        String strM39411k = m39411k(m39415e(), user);
        xdl0.m208344M(this.f24247n, true);
        this.f24248o.setText(m39412m(user.location));
        VText_NoTopPadding vText_NoTopPadding = this.f24249p;
        if (TextUtils.isEmpty(strM39411k)) {
            string = "";
        } else {
            string = xdl0.m208349O0(this.f24248o) ? m39415e().getString(R$string.f20626Z0, strM39411k) : strM39411k;
        }
        vText_NoTopPadding.setText(string);
        xdl0.m208344M(this.f24248o, !zM203772B3);
        xdl0.m208344M(this.f24247n, (zM203772B3 && TextUtils.isEmpty(strM39411k)) ? false : true);
    }

    /* JADX INFO: renamed from: o */
    public final void m39419o(User user) {
        ygo.C21397a c21397aM214739b = ygo.m214739b(user);
        int i = c21397aM214739b.f198214b;
        VText_NoTopPadding vText_NoTopPadding = this.f24248o;
        if (i != 0) {
            vText_NoTopPadding.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
            this.f24248o.setCompoundDrawablePadding(t100.f167256e);
        } else {
            vText_NoTopPadding.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        this.f24248o.setText(c21397aM214739b.f198213a);
        xdl0.m208344M(this.f24248o, true);
        xdl0.m208344M(this.f24249p, false);
        xdl0.m208344M(this.f24247n, true);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39414d(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m39420p(User user) {
        xdl0.m208344M(this.f24235b, false);
        if (!ura.m195053e().m195057d().mo33849ic() || vwb.m200296J(CoreModule.f17545c.f19690v0.f79723W)) {
            return;
        }
        for (SuperlikeByCount superlikeByCount : CoreModule.f17545c.f19690v0.f79723W) {
            if (TextUtils.equals(superlikeByCount.f20510id, user.f56011id)) {
                xdl0.m208344M(this.f24235b, true);
                this.f24236c.setTypeface(Typeface.defaultFromStyle(1));
                this.f24236c.setText(String.format(App.f15369e.getString(R$string.f20646g0), Integer.valueOf(superlikeByCount.count)));
                this.f24237d.setImageResource(IntlCountryCodeController.m28126v() ? b3c0.f72960U : b3c0.f72953T);
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
