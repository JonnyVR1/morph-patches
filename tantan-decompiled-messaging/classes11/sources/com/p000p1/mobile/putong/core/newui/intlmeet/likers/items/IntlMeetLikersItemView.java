package com.p000p1.mobile.putong.core.newui.intlmeet.likers.items;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.SuperlikeByCount;
import com.p1.mobile.putong.core.member.R;
import com.p1.mobile.putong.data.Location;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.Region;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.b3c0;
import l.d30;
import l.k0g0;
import l.qib0;
import l.t100;
import l.ura;
import l.vwb;
import l.xdl0;
import l.yeo;
import p009l.cgo;
import p009l.i0g0;
import p009l.ygo;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VLinear_FillerMeasure;
import v.VText;
import v.VText_NoTopPadding;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class IntlMeetLikersItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f3012a;

    /* JADX INFO: renamed from: b */
    public VLinear f3013b;

    /* JADX INFO: renamed from: c */
    public VText f3014c;

    /* JADX INFO: renamed from: d */
    public VImage f3015d;

    /* JADX INFO: renamed from: e */
    public VImage f3016e;

    /* JADX INFO: renamed from: f */
    public VImage f3017f;

    /* JADX INFO: renamed from: g */
    public VImage f3018g;

    /* JADX INFO: renamed from: h */
    public VImage f3019h;

    /* JADX INFO: renamed from: i */
    public ConstraintLayout f3020i;

    /* JADX INFO: renamed from: j */
    public VLinear_FillerMeasure f3021j;

    /* JADX INFO: renamed from: k */
    public VText_NoTopPadding f3022k;

    /* JADX INFO: renamed from: l */
    public VText_NoTopPadding f3023l;

    /* JADX INFO: renamed from: m */
    public VImage f3024m;

    /* JADX INFO: renamed from: n */
    public VLinear_FillerMeasure f3025n;

    /* JADX INFO: renamed from: o */
    public VText_NoTopPadding f3026o;

    /* JADX INFO: renamed from: p */
    public VText_NoTopPadding f3027p;

    /* JADX INFO: renamed from: q */
    public User f3028q;

    public IntlMeetLikersItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: f */
    public static Location m3454f(Location location) {
        Location locationClone = location.clone();
        if (location.isHideInfo()) {
            if (location.isHideRegionCity()) {
                locationClone.region.city = null;
                return locationClone;
            }
            if (location.isHideRegionDistrict()) {
                locationClone.region.district = null;
            }
        }
        return locationClone;
    }

    /* JADX INFO: renamed from: g */
    public static CharSequence m3455g(Region region, Region region2) {
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
    public static String m3456h(User user) {
        boolean zIsEmpty = TextUtils.isEmpty(user.profile.work.department);
        Profile profile = user.profile;
        return !zIsEmpty ? profile.work.department : profile.studies.school;
    }

    /* JADX INFO: renamed from: j */
    public static CharSequence m3457j(Location location) {
        Region region = m3454f(location).region;
        User userMe_ = qib0.b0.b.me_();
        if (userMe_ == null) {
            return null;
        }
        return m3455g(region, userMe_.location.region);
    }

    /* JADX INFO: renamed from: k */
    public static String m3458k(Context context, User user) {
        if (m3460q(user)) {
            return user.profile.studies.school;
        }
        if (user.profile.work.active) {
            String strM3456h = m3456h(user);
            if (!TextUtils.isEmpty(strM3456h)) {
                return strM3456h;
            }
        }
        Profile profile = user.profile;
        return profile.studies.active ? CoreModule.b.getString(R.string.S0) : profile.work.industry;
    }

    /* JADX INFO: renamed from: m */
    public static CharSequence m3459m(Location location) {
        CharSequence charSequenceM3457j = m3457j(location);
        if (!TextUtils.isEmpty(charSequenceM3457j)) {
            return charSequenceM3457j;
        }
        return String.format(CoreModule.b.getString(com.p1.mobile.putong.common.R.string.K1), i0g0.m16146r(location.clone(), true, true));
    }

    /* JADX INFO: renamed from: q */
    public static boolean m3460q(User user) {
        if (user.profile.studies.active) {
            return true;
        }
        return IntlCountryCodeController.l() && CoreModule.l.a().Dn(user.profile.studies.qualification) && !k0g0.b(user.profile.studies.school);
    }

    /* JADX INFO: renamed from: d */
    public final void m3461d(View view) {
        yeo.a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public Act m3462e() {
        return getContext();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m3463i(d30 d30Var, View view) {
        if (m3462e().lifecycle_() == c.i) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m3464l(cgo cgoVar, final d30 d30Var, final d30 d30Var2, final d30 d30Var3) {
        this.f3028q = cgoVar.getUser();
        setOnClickListener(new View.OnClickListener() { // from class: l.veo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21555a.m3463i(d30Var, view);
            }
        });
        m3465n(this.f3028q);
        this.f3017f.setVisibility(4);
        this.f3016e.setVisibility(4);
        m3467p(this.f3028q);
        if (IntlCountryCodeController.v() && NullChecker.a(d30Var2) && NullChecker.a(d30Var3)) {
            this.f3018g.setVisibility(0);
            this.f3019h.setVisibility(0);
            this.f3018g.setOnClickListener(new View.OnClickListener() { // from class: l.weo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d30Var2.call();
                }
            });
            this.f3019h.setOnClickListener(new View.OnClickListener() { // from class: l.xeo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d30Var3.call();
                }
            });
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m3465n(User user) {
        String string;
        qib0.G.N0(this.f3012a, this.f3028q.fp().profileMiddle().formatted(), false);
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.s(t100.h);
        this.f3012a.getHierarchy().H(roundingParams);
        this.f3012a.getLayoutParams().height = -1;
        xdl0.U(this.f3012a, 0);
        this.f3022k.setText(user.name);
        this.f3023l.setText(user.age.toString());
        xdl0.M(this.f3023l, !CoreModule.c.E0.z3(user));
        qib0.b0.b.showUserVerificationLogo(m3462e(), this.f3028q, this.f3024m);
        if (ura.e().d().Oq()) {
            m3466o(user);
            return;
        }
        boolean zB3 = CoreModule.c.E0.B3(user);
        String strM3458k = m3458k(m3462e(), user);
        xdl0.M(this.f3025n, true);
        this.f3026o.setText(m3459m(user.location));
        VText_NoTopPadding vText_NoTopPadding = this.f3027p;
        if (TextUtils.isEmpty(strM3458k)) {
            string = "";
        } else {
            string = xdl0.O0(this.f3026o) ? m3462e().getString(R.string.Z0, strM3458k) : strM3458k;
        }
        vText_NoTopPadding.setText(string);
        xdl0.M(this.f3026o, !zB3);
        xdl0.M(this.f3025n, (zB3 && TextUtils.isEmpty(strM3458k)) ? false : true);
    }

    /* JADX INFO: renamed from: o */
    public final void m3466o(User user) {
        ygo.C1331a c1331aM25371b = ygo.m25371b(user);
        int i = c1331aM25371b.f23057b;
        VText_NoTopPadding vText_NoTopPadding = this.f3026o;
        if (i != 0) {
            vText_NoTopPadding.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
            this.f3026o.setCompoundDrawablePadding(t100.e);
        } else {
            vText_NoTopPadding.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        this.f3026o.setText(c1331aM25371b.f23056a);
        xdl0.M(this.f3026o, true);
        xdl0.M(this.f3027p, false);
        xdl0.M(this.f3025n, true);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m3461d(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m3467p(User user) {
        xdl0.M(this.f3013b, false);
        if (!ura.e().d().ic() || vwb.J(CoreModule.c.v0.W)) {
            return;
        }
        for (SuperlikeByCount superlikeByCount : CoreModule.c.v0.W) {
            if (TextUtils.equals(superlikeByCount.id, ((DbObject) user).id)) {
                xdl0.M(this.f3013b, true);
                this.f3014c.setTypeface(Typeface.defaultFromStyle(1));
                this.f3014c.setText(String.format(App.e.getString(R.string.g0), Integer.valueOf(superlikeByCount.count)));
                this.f3015d.setImageResource(IntlCountryCodeController.v() ? b3c0.U : b3c0.T);
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
