package com.p051p1.mobile.putong.core.p058ui.vip.likers;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.Region;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Work;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import p137rx.subjects.C22508b;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear_FillerMeasure;
import p151v.VText;
import p153l.bnl0;
import p153l.gbc0;
import p153l.h9n;
import p153l.q8g0;
import p153l.qa00;
import p153l.qcj;
import p153l.r8g0;
import p153l.uqb0;
import p153l.uxj0;
import p153l.vkr;
import p153l.x20;

/* JADX INFO: loaded from: classes12.dex */
public class LikersItemView extends FrameLayout {

    /* JADX INFO: renamed from: y */
    public static C22508b<uxj0> f38140y = C22508b.m222767b();

    /* JADX INFO: renamed from: a */
    public VDraweeView f38141a;

    /* JADX INFO: renamed from: b */
    public VImage f38142b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f38143c;

    /* JADX INFO: renamed from: d */
    public VImage f38144d;

    /* JADX INFO: renamed from: e */
    public VImage f38145e;

    /* JADX INFO: renamed from: f */
    public VImage f38146f;

    /* JADX INFO: renamed from: g */
    public VImage f38147g;

    /* JADX INFO: renamed from: h */
    public VImage f38148h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f38149i;

    /* JADX INFO: renamed from: j */
    public VText f38150j;

    /* JADX INFO: renamed from: k */
    public VText f38151k;

    /* JADX INFO: renamed from: l */
    public ImageView f38152l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f38153m;

    /* JADX INFO: renamed from: n */
    public FrameLayout f38154n;

    /* JADX INFO: renamed from: o */
    public VText f38155o;

    /* JADX INFO: renamed from: p */
    public VLinear_FillerMeasure f38156p;

    /* JADX INFO: renamed from: q */
    public VText f38157q;

    /* JADX INFO: renamed from: r */
    public VText f38158r;

    /* JADX INFO: renamed from: s */
    public ImageView f38159s;

    /* JADX INFO: renamed from: t */
    public VLinear_FillerMeasure f38160t;

    /* JADX INFO: renamed from: u */
    public VText f38161u;

    /* JADX INFO: renamed from: v */
    public VText f38162v;

    /* JADX INFO: renamed from: w */
    public User f38163w;

    /* JADX INFO: renamed from: x */
    public boolean f38164x;

    public enum LikersItemStyle {
        defaultStyle,
        newStyle1
    }

    public LikersItemView(Context context) {
        super(context);
        m57783g().duringCreated(f38140y).map(new qcj() { // from class: l.qkr
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f158165a.m57784h((uxj0) obj);
            }
        }).delay(1500L, TimeUnit.MILLISECONDS).map(new qcj() { // from class: l.rkr
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f163636a.m57785i((Boolean) obj);
            }
        }).subscribe();
        this.f38164x = true;
    }

    /* JADX INFO: renamed from: k */
    public static CharSequence m57779k(Location location) {
        String str;
        Location locationMo225055clone = location.mo225055clone();
        if (location.isHideInfo()) {
            if (location.isHideRegionCity()) {
                locationMo225055clone.region.city = null;
            } else if (location.isHideRegionDistrict()) {
                locationMo225055clone.region.district = null;
            }
        }
        Region region = locationMo225055clone.region;
        User userMe_ = uqb0.f180396b0.f170325b.me_();
        if (userMe_ != null) {
            Region region2 = userMe_.location.region;
            if (TextUtils.isEmpty(region.district) || !region.equals(region2)) {
                if (!TextUtils.isEmpty(region.city) && region.city.equals(region2.city) && !TextUtils.isEmpty(region.country) && region.country.equals(region2.country)) {
                    return "";
                }
                if (!TextUtils.isEmpty(region.city) && !TextUtils.isEmpty(region.country) && region.country.equals(region2.country)) {
                    return region.city;
                }
                if (!TextUtils.isEmpty(region.country) && !region.country.equals(region2.country) && (str = region.city) != null) {
                    return str;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static String m57780l(Context context, User user) {
        String str;
        if (user.profile.studies.active || (IntlCountryCodeController.m29115l() && CoreModule.f18273l.m143405a().mo34309Dn(user.profile.studies.qualification) && !r8g0.m180203b(user.profile.studies.school))) {
            str = user.profile.studies.school;
        } else {
            Work work = user.profile.work;
            if (work.active) {
                str = !TextUtils.isEmpty(work.department) ? user.profile.work.department : "";
                if (TextUtils.isEmpty(str)) {
                    str = user.profile.studies.school;
                }
            } else {
                str = null;
            }
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        Profile profile = user.profile;
        return profile.studies.active ? CoreModule.f18263b.getString(R$string.f21354S0) : profile.work.industry;
    }

    /* JADX INFO: renamed from: n */
    public static CharSequence m57781n(Location location) {
        String strM175813r = q8g0.m175813r(location.mo225055clone(), true, true);
        CharSequence charSequenceM57779k = m57779k(location);
        return !TextUtils.isEmpty(charSequenceM57779k) ? charSequenceM57779k : String.format(CoreModule.f18263b.getString(com.p051p1.mobile.putong.common.R$string.f18062K1), strM175813r);
    }

    /* JADX INFO: renamed from: f */
    public final void m57782f(View view) {
        vkr.m201580a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public Act m57783g() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Boolean m57784h(uxj0 uxj0Var) {
        this.f38164x = false;
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Boolean m57785i(Boolean bool) {
        this.f38164x = true;
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m57786j(x20 x20Var, boolean z, User user, LikersFrag likersFrag, View view) {
        if (m57783g().lifecycle_() == C4470c.f16267i && this.f38164x) {
            x20Var.call();
            if (z) {
                likersFrag.m57769W4("seepagePhotoClick");
            } else {
                CoreModule.m30933P().m143405a().mo34455Yj(m57783g(), user, this.f38141a, this.f38143c);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0146  */
    /* JADX INFO: renamed from: m */
    public void m57787m(final LikersFrag likersFrag, final User user, long j, final x20 x20Var, final boolean z, LikersItemStyle likersItemStyle, final x20 x20Var2, final x20 x20Var3) {
        this.f38163w = user;
        setOnClickListener(new View.OnClickListener() { // from class: l.skr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f169312a.m57786j(x20Var, z, user, likersFrag, view);
            }
        });
        if (likersItemStyle == LikersItemStyle.newStyle1) {
            RoundingParams roundingParams = new RoundingParams();
            roundingParams.m8319s(qa00.f156318e);
            this.f38141a.getHierarchy().m207045H(roundingParams);
            this.f38141a.getLayoutParams().height = qa00.m175859d(216.0f);
            uqb0.f180374G.m127120O(this.f38141a, user.m61308fp().profileMiddle().formatted(), 2, 30);
            this.f38153m.setVisibility(0);
            this.f38149i.setVisibility(8);
        } else {
            if (h9n.m134081c()) {
                m57788o(user);
            } else {
                RoundingParams roundingParams2 = new RoundingParams();
                int i = qa00.f156318e;
                roundingParams2.m8318r(i, i, 0.0f, 0.0f);
                this.f38141a.getHierarchy().m207045H(roundingParams2);
                this.f38141a.getLayoutParams().height = qa00.m175859d(182.0f);
                this.f38149i.setVisibility(0);
                this.f38153m.setVisibility(8);
                this.f38154n.setVisibility(8);
                this.f38150j.setText(m57783g().getString(R$string.f21371a1, user.name));
                boolean zM141091z3 = CoreModule.f18264c.f20303E0.m141091z3(user);
                VText vText = this.f38151k;
                if (zM141091z3) {
                    vText.setText("");
                } else {
                    vText.setText(m57783g().getString(R$string.f21368Z0, String.valueOf(user.age)));
                }
                if (user.superLikedMe()) {
                    this.f38152l.setVisibility(0);
                    this.f38152l.setImageResource(gbc0.f103360n2);
                } else {
                    boolean zBoosted = user.boosted();
                    ImageView imageView = this.f38152l;
                    if (zBoosted) {
                        imageView.setVisibility(0);
                        this.f38152l.setImageResource(gbc0.f103284d6);
                    } else {
                        imageView.setVisibility(8);
                    }
                }
            }
            user.showPicVerificationIcon(this.f38143c, this.f38144d);
            if (z) {
                uqb0.f180374G.m127120O(this.f38141a, user.m61308fp().profileMiddle().formatted(), 2, 20);
                if (bnl0.m105529O0(this.f38143c)) {
                    this.f38144d.setVisibility(4);
                }
            } else {
                uqb0.f180374G.m127119N0(this.f38141a, user.m61308fp().profileMiddle().formatted(), false);
                if (j == 0 || !NullChecker.m82486a(user.localRelationship)) {
                    bnl0.m105525M0(this.f38142b, false);
                } else {
                    double d = user.localRelationship.updateTime;
                    if (d != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        bnl0.m105525M0(this.f38142b, j < ((long) d));
                    } else {
                        bnl0.m105525M0(this.f38142b, false);
                    }
                }
            }
        }
        this.f38146f.setVisibility(4);
        this.f38145e.setVisibility(4);
        if (IntlCountryCodeController.m29125v() && NullChecker.m82486a(x20Var2) && NullChecker.m82486a(x20Var3)) {
            this.f38147g.setVisibility(0);
            this.f38148h.setVisibility(0);
            this.f38147g.setOnClickListener(new View.OnClickListener() { // from class: l.tkr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    x20Var2.call();
                }
            });
            this.f38148h.setOnClickListener(new View.OnClickListener() { // from class: l.ukr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    x20Var3.call();
                }
            });
        }
        if (CoreModule.m30933P().m143405a().mo34383O()) {
            boolean zIsIdAndPicBothVerified = user.isIdAndPicBothVerified();
            VImage vImage = this.f38144d;
            if (!zIsIdAndPicBothVerified) {
                vImage.setBackgroundResource(gbc0.f103340k6);
            } else {
                vImage.setBackgroundResource(gbc0.f103425v5);
                this.f38144d.setImageResource(0);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m57788o(User user) {
        String string;
        m57789p(gbc0.f103324i6);
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.m8319s(qa00.f156321h);
        this.f38141a.getHierarchy().m207045H(roundingParams);
        this.f38141a.getLayoutParams().height = -1;
        bnl0.m105537U(this.f38141a, qa00.m175859d(0.0f));
        this.f38149i.setVisibility(8);
        this.f38154n.setVisibility(0);
        boolean zM141060B3 = CoreModule.f18264c.f20303E0.m141060B3(user);
        boolean zIsEmpty = TextUtils.isEmpty(m57780l(m57783g(), user));
        if (zM141060B3 && zIsEmpty) {
            bnl0.m105525M0(this.f38160t, false);
            bnl0.m105540X(this.f38155o, qa00.m175859d(32.0f));
            bnl0.m105540X(this.f38156p, qa00.m175859d(56.0f));
        } else {
            bnl0.m105540X(this.f38155o, qa00.m175859d(8.0f));
            bnl0.m105540X(this.f38156p, qa00.m175859d(32.0f));
            bnl0.m105525M0(this.f38160t, true);
            VText vText = this.f38161u;
            if (zM141060B3) {
                bnl0.m105524M(vText, false);
            } else {
                bnl0.m105524M(vText, true);
                this.f38161u.setText(m57781n(user.location));
            }
            VText vText2 = this.f38162v;
            if (TextUtils.isEmpty(m57780l(m57783g(), user))) {
                string = "";
            } else {
                string = bnl0.m105529O0(this.f38161u) ? m57783g().getString(R$string.f21368Z0, m57780l(m57783g(), user)) : m57780l(m57783g(), user);
            }
            vText2.setText(string);
        }
        this.f38157q.setText(m57783g().getString(R$string.f21371a1, user.name));
        boolean zM141091z3 = CoreModule.f18264c.f20303E0.m141091z3(user);
        VText vText3 = this.f38158r;
        if (zM141091z3) {
            bnl0.m105524M(vText3, false);
        } else {
            bnl0.m105524M(vText3, true);
            this.f38158r.setText(m57783g().getString(R$string.f21368Z0, String.valueOf(user.age)));
        }
        this.f38155o.setVisibility(8);
        int i = gbc0.f103360n2;
        int i2 = gbc0.f103284d6;
        if (user.superLikedMe()) {
            bnl0.m105525M0(this.f38159s, true);
            this.f38159s.setImageResource(i);
            return;
        }
        boolean zBoosted = user.boosted();
        ImageView imageView = this.f38159s;
        if (!zBoosted) {
            bnl0.m105525M0(imageView, false);
        } else {
            bnl0.m105525M0(imageView, true);
            this.f38159s.setImageResource(i2);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57782f(this);
        m57789p(gbc0.f103332j6);
    }

    /* JADX INFO: renamed from: p */
    public final void m57789p(int i) {
        Object tag = getTag();
        if (!NullChecker.m82486a(tag)) {
            setTag(Integer.valueOf(i));
            setBackgroundDrawable(m57783g().drawable(i));
        } else if (((Integer) tag).intValue() != i) {
            setTag(Integer.valueOf(i));
            setBackgroundDrawable(m57783g().drawable(i));
        }
    }

    public LikersItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m57783g().duringCreated(f38140y).map(new qcj() { // from class: l.qkr
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f158165a.m57784h((uxj0) obj);
            }
        }).delay(1500L, TimeUnit.MILLISECONDS).map(new qcj() { // from class: l.rkr
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f163636a.m57785i((Boolean) obj);
            }
        }).subscribe();
        this.f38164x = true;
    }

    public LikersItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m57783g().duringCreated(f38140y).map(new qcj() { // from class: l.qkr
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f158165a.m57784h((uxj0) obj);
            }
        }).delay(1500L, TimeUnit.MILLISECONDS).map(new qcj() { // from class: l.rkr
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f163636a.m57785i((Boolean) obj);
            }
        }).subscribe();
        this.f38164x = true;
    }
}
