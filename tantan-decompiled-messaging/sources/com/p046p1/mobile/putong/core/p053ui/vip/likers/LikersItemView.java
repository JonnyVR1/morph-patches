package com.p046p1.mobile.putong.core.p053ui.vip.likers;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.data.Location;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.Region;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Work;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import p133rx.subjects.C22393b;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear_FillerMeasure;
import p147v.VText;
import p149l.b3c0;
import p149l.d30;
import p149l.h7n;
import p149l.i0g0;
import p149l.k0g0;
import p149l.qib0;
import p149l.roj0;
import p149l.t100;
import p149l.uir;
import p149l.w9j;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class LikersItemView extends FrameLayout {

    /* JADX INFO: renamed from: y */
    public static C22393b<roj0> f37292y = C22393b.m221521b();

    /* JADX INFO: renamed from: a */
    public VDraweeView f37293a;

    /* JADX INFO: renamed from: b */
    public VImage f37294b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f37295c;

    /* JADX INFO: renamed from: d */
    public VImage f37296d;

    /* JADX INFO: renamed from: e */
    public VImage f37297e;

    /* JADX INFO: renamed from: f */
    public VImage f37298f;

    /* JADX INFO: renamed from: g */
    public VImage f37299g;

    /* JADX INFO: renamed from: h */
    public VImage f37300h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f37301i;

    /* JADX INFO: renamed from: j */
    public VText f37302j;

    /* JADX INFO: renamed from: k */
    public VText f37303k;

    /* JADX INFO: renamed from: l */
    public ImageView f37304l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f37305m;

    /* JADX INFO: renamed from: n */
    public FrameLayout f37306n;

    /* JADX INFO: renamed from: o */
    public VText f37307o;

    /* JADX INFO: renamed from: p */
    public VLinear_FillerMeasure f37308p;

    /* JADX INFO: renamed from: q */
    public VText f37309q;

    /* JADX INFO: renamed from: r */
    public VText f37310r;

    /* JADX INFO: renamed from: s */
    public ImageView f37311s;

    /* JADX INFO: renamed from: t */
    public VLinear_FillerMeasure f37312t;

    /* JADX INFO: renamed from: u */
    public VText f37313u;

    /* JADX INFO: renamed from: v */
    public VText f37314v;

    /* JADX INFO: renamed from: w */
    public User f37315w;

    /* JADX INFO: renamed from: x */
    public boolean f37316x;

    public enum LikersItemStyle {
        defaultStyle,
        newStyle1
    }

    public LikersItemView(Context context) {
        super(context);
        m56600g().duringCreated(f37292y).map(new w9j() { // from class: l.pir
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f149678a.m56601h((roj0) obj);
            }
        }).delay(1500L, TimeUnit.MILLISECONDS).map(new w9j() { // from class: l.qir
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f154797a.m56602i((Boolean) obj);
            }
        }).subscribe();
        this.f37316x = true;
    }

    /* JADX INFO: renamed from: k */
    public static CharSequence m56596k(Location location) {
        String str;
        Location locationMo223809clone = location.mo223809clone();
        if (location.isHideInfo()) {
            if (location.isHideRegionCity()) {
                locationMo223809clone.region.city = null;
            } else if (location.isHideRegionDistrict()) {
                locationMo223809clone.region.district = null;
            }
        }
        Region region = locationMo223809clone.region;
        User userMe_ = qib0.f154713b0.f139231b.me_();
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
    public static String m56597l(Context context, User user) {
        String str;
        if (user.profile.studies.active || (IntlCountryCodeController.m28116l() && CoreModule.f17554l.m94651a().mo33306Dn(user.profile.studies.qualification) && !k0g0.m144048b(user.profile.studies.school))) {
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
        return profile.studies.active ? CoreModule.f17544b.getString(R$string.f20612S0) : profile.work.industry;
    }

    /* JADX INFO: renamed from: n */
    public static CharSequence m56598n(Location location) {
        String strM133878r = i0g0.m133878r(location.mo223809clone(), true, true);
        CharSequence charSequenceM56596k = m56596k(location);
        return !TextUtils.isEmpty(charSequenceM56596k) ? charSequenceM56596k : String.format(CoreModule.f17544b.getString(com.p046p1.mobile.putong.common.R$string.f17343K1), strM133878r);
    }

    /* JADX INFO: renamed from: f */
    public final void m56599f(View view) {
        uir.m193959a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public Act m56600g() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Boolean m56601h(roj0 roj0Var) {
        this.f37316x = false;
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Boolean m56602i(Boolean bool) {
        this.f37316x = true;
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m56603j(d30 d30Var, boolean z, User user, LikersFrag likersFrag, View view) {
        if (m56600g().lifecycle_() == C4319c.f15548i && this.f37316x) {
            d30Var.call();
            if (z) {
                likersFrag.m56586W4("seepagePhotoClick");
            } else {
                CoreModule.m29935P().m94651a().mo33452Yj(m56600g(), user, this.f37293a, this.f37295c);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0146  */
    /* JADX INFO: renamed from: m */
    public void m56604m(final LikersFrag likersFrag, final User user, long j, final d30 d30Var, final boolean z, LikersItemStyle likersItemStyle, final d30 d30Var2, final d30 d30Var3) {
        this.f37315w = user;
        setOnClickListener(new View.OnClickListener() { // from class: l.rir
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f159578a.m56603j(d30Var, z, user, likersFrag, view);
            }
        });
        if (likersItemStyle == LikersItemStyle.newStyle1) {
            RoundingParams roundingParams = new RoundingParams();
            roundingParams.m8265s(t100.f167256e);
            this.f37293a.getHierarchy().m112053H(roundingParams);
            this.f37293a.getLayoutParams().height = t100.m186890d(216.0f);
            qib0.f154691G.m102336O(this.f37293a, user.m60124fp().profileMiddle().formatted(), 2, 30);
            this.f37305m.setVisibility(0);
            this.f37301i.setVisibility(8);
        } else {
            if (h7n.m129754c()) {
                m56605o(user);
            } else {
                RoundingParams roundingParams2 = new RoundingParams();
                int i = t100.f167256e;
                roundingParams2.m8264r(i, i, 0.0f, 0.0f);
                this.f37293a.getHierarchy().m112053H(roundingParams2);
                this.f37293a.getLayoutParams().height = t100.m186890d(182.0f);
                this.f37301i.setVisibility(0);
                this.f37305m.setVisibility(8);
                this.f37306n.setVisibility(8);
                this.f37302j.setText(m56600g().getString(R$string.f20629a1, user.name));
                boolean zM203803z3 = CoreModule.f17545c.f19561E0.m203803z3(user);
                VText vText = this.f37303k;
                if (zM203803z3) {
                    vText.setText("");
                } else {
                    vText.setText(m56600g().getString(R$string.f20626Z0, String.valueOf(user.age)));
                }
                if (user.superLikedMe()) {
                    this.f37304l.setVisibility(0);
                    this.f37304l.setImageResource(b3c0.f73109n2);
                } else {
                    boolean zBoosted = user.boosted();
                    ImageView imageView = this.f37304l;
                    if (zBoosted) {
                        imageView.setVisibility(0);
                        this.f37304l.setImageResource(b3c0.f73033d6);
                    } else {
                        imageView.setVisibility(8);
                    }
                }
            }
            user.showPicVerificationIcon(this.f37295c, this.f37296d);
            if (z) {
                qib0.f154691G.m102336O(this.f37293a, user.m60124fp().profileMiddle().formatted(), 2, 20);
                if (xdl0.m208349O0(this.f37295c)) {
                    this.f37296d.setVisibility(4);
                }
            } else {
                qib0.f154691G.m102335N0(this.f37293a, user.m60124fp().profileMiddle().formatted(), false);
                if (j == 0 || !NullChecker.m81303a(user.localRelationship)) {
                    xdl0.m208345M0(this.f37294b, false);
                } else {
                    double d = user.localRelationship.updateTime;
                    if (d != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        xdl0.m208345M0(this.f37294b, j < ((long) d));
                    } else {
                        xdl0.m208345M0(this.f37294b, false);
                    }
                }
            }
        }
        this.f37298f.setVisibility(4);
        this.f37297e.setVisibility(4);
        if (IntlCountryCodeController.m28126v() && NullChecker.m81303a(d30Var2) && NullChecker.m81303a(d30Var3)) {
            this.f37299g.setVisibility(0);
            this.f37300h.setVisibility(0);
            this.f37299g.setOnClickListener(new View.OnClickListener() { // from class: l.sir
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d30Var2.call();
                }
            });
            this.f37300h.setOnClickListener(new View.OnClickListener() { // from class: l.tir
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d30Var3.call();
                }
            });
        }
        if (CoreModule.m29935P().m94651a().mo33380O()) {
            boolean zIsIdAndPicBothVerified = user.isIdAndPicBothVerified();
            VImage vImage = this.f37296d;
            if (!zIsIdAndPicBothVerified) {
                vImage.setBackgroundResource(b3c0.f73089k6);
            } else {
                vImage.setBackgroundResource(b3c0.f73174v5);
                this.f37296d.setImageResource(0);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m56605o(User user) {
        String string;
        m56606p(b3c0.f73073i6);
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.m8265s(t100.f167259h);
        this.f37293a.getHierarchy().m112053H(roundingParams);
        this.f37293a.getLayoutParams().height = -1;
        xdl0.m208357U(this.f37293a, t100.m186890d(0.0f));
        this.f37301i.setVisibility(8);
        this.f37306n.setVisibility(0);
        boolean zM203772B3 = CoreModule.f17545c.f19561E0.m203772B3(user);
        boolean zIsEmpty = TextUtils.isEmpty(m56597l(m56600g(), user));
        if (zM203772B3 && zIsEmpty) {
            xdl0.m208345M0(this.f37312t, false);
            xdl0.m208360X(this.f37307o, t100.m186890d(32.0f));
            xdl0.m208360X(this.f37308p, t100.m186890d(56.0f));
        } else {
            xdl0.m208360X(this.f37307o, t100.m186890d(8.0f));
            xdl0.m208360X(this.f37308p, t100.m186890d(32.0f));
            xdl0.m208345M0(this.f37312t, true);
            VText vText = this.f37313u;
            if (zM203772B3) {
                xdl0.m208344M(vText, false);
            } else {
                xdl0.m208344M(vText, true);
                this.f37313u.setText(m56598n(user.location));
            }
            VText vText2 = this.f37314v;
            if (TextUtils.isEmpty(m56597l(m56600g(), user))) {
                string = "";
            } else {
                string = xdl0.m208349O0(this.f37313u) ? m56600g().getString(R$string.f20626Z0, m56597l(m56600g(), user)) : m56597l(m56600g(), user);
            }
            vText2.setText(string);
        }
        this.f37309q.setText(m56600g().getString(R$string.f20629a1, user.name));
        boolean zM203803z3 = CoreModule.f17545c.f19561E0.m203803z3(user);
        VText vText3 = this.f37310r;
        if (zM203803z3) {
            xdl0.m208344M(vText3, false);
        } else {
            xdl0.m208344M(vText3, true);
            this.f37310r.setText(m56600g().getString(R$string.f20626Z0, String.valueOf(user.age)));
        }
        this.f37307o.setVisibility(8);
        int i = b3c0.f73109n2;
        int i2 = b3c0.f73033d6;
        if (user.superLikedMe()) {
            xdl0.m208345M0(this.f37311s, true);
            this.f37311s.setImageResource(i);
            return;
        }
        boolean zBoosted = user.boosted();
        ImageView imageView = this.f37311s;
        if (!zBoosted) {
            xdl0.m208345M0(imageView, false);
        } else {
            xdl0.m208345M0(imageView, true);
            this.f37311s.setImageResource(i2);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56599f(this);
        m56606p(b3c0.f73081j6);
    }

    /* JADX INFO: renamed from: p */
    public final void m56606p(int i) {
        Object tag = getTag();
        if (!NullChecker.m81303a(tag)) {
            setTag(Integer.valueOf(i));
            setBackgroundDrawable(m56600g().drawable(i));
        } else if (((Integer) tag).intValue() != i) {
            setTag(Integer.valueOf(i));
            setBackgroundDrawable(m56600g().drawable(i));
        }
    }

    public LikersItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m56600g().duringCreated(f37292y).map(new w9j() { // from class: l.pir
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f149678a.m56601h((roj0) obj);
            }
        }).delay(1500L, TimeUnit.MILLISECONDS).map(new w9j() { // from class: l.qir
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f154797a.m56602i((Boolean) obj);
            }
        }).subscribe();
        this.f37316x = true;
    }

    public LikersItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m56600g().duringCreated(f37292y).map(new w9j() { // from class: l.pir
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f149678a.m56601h((roj0) obj);
            }
        }).delay(1500L, TimeUnit.MILLISECONDS).map(new w9j() { // from class: l.qir
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f154797a.m56602i((Boolean) obj);
            }
        }).subscribe();
        this.f37316x = true;
    }
}
