package com.p000p1.mobile.putong.core.p004ui.vip.likers;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import com.p000p1.mobile.putong.common.R$string;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.member.R;
import com.p1.mobile.putong.data.Location;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.Region;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Work;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import l.b3c0;
import l.d30;
import l.i0g0;
import l.k0g0;
import l.roj0;
import l.t100;
import l.uir;
import l.w9j;
import l.xdl0;
import p006l.h7n;
import p006l.qib0;
import rx.subjects.b;
import v.VDraweeView;
import v.VImage;
import v.VLinear_FillerMeasure;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class LikersItemView extends FrameLayout {

    /* JADX INFO: renamed from: y */
    public static b<roj0> f7073y = b.b();

    /* JADX INFO: renamed from: a */
    public VDraweeView f7074a;

    /* JADX INFO: renamed from: b */
    public VImage f7075b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f7076c;

    /* JADX INFO: renamed from: d */
    public VImage f7077d;

    /* JADX INFO: renamed from: e */
    public VImage f7078e;

    /* JADX INFO: renamed from: f */
    public VImage f7079f;

    /* JADX INFO: renamed from: g */
    public VImage f7080g;

    /* JADX INFO: renamed from: h */
    public VImage f7081h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f7082i;

    /* JADX INFO: renamed from: j */
    public VText f7083j;

    /* JADX INFO: renamed from: k */
    public VText f7084k;

    /* JADX INFO: renamed from: l */
    public ImageView f7085l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f7086m;

    /* JADX INFO: renamed from: n */
    public FrameLayout f7087n;

    /* JADX INFO: renamed from: o */
    public VText f7088o;

    /* JADX INFO: renamed from: p */
    public VLinear_FillerMeasure f7089p;

    /* JADX INFO: renamed from: q */
    public VText f7090q;

    /* JADX INFO: renamed from: r */
    public VText f7091r;

    /* JADX INFO: renamed from: s */
    public ImageView f7092s;

    /* JADX INFO: renamed from: t */
    public VLinear_FillerMeasure f7093t;

    /* JADX INFO: renamed from: u */
    public VText f7094u;

    /* JADX INFO: renamed from: v */
    public VText f7095v;

    /* JADX INFO: renamed from: w */
    public User f7096w;

    /* JADX INFO: renamed from: x */
    public boolean f7097x;

    public enum LikersItemStyle {
        defaultStyle,
        newStyle1
    }

    public LikersItemView(Context context) {
        super(context);
        m10043g().duringCreated(f7073y).map(new w9j() { // from class: l.pir
            public final Object call(Object obj) {
                return this.f19151a.m10044h((roj0) obj);
            }
        }).delay(1500L, TimeUnit.MILLISECONDS).map(new w9j() { // from class: l.qir
            public final Object call(Object obj) {
                return this.f19844a.m10045i((Boolean) obj);
            }
        }).subscribe();
        this.f7097x = true;
    }

    /* JADX INFO: renamed from: k */
    public static CharSequence m10039k(Location location) {
        String str;
        Location locationClone = location.clone();
        if (location.isHideInfo()) {
            if (location.isHideRegionCity()) {
                locationClone.region.city = null;
            } else if (location.isHideRegionDistrict()) {
                locationClone.region.district = null;
            }
        }
        Region region = locationClone.region;
        User userMe_ = qib0.f19804b0.f17707b.me_();
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
    public static String m10040l(Context context, User user) {
        String str;
        if (user.profile.studies.active || (IntlCountryCodeController.m11l() && CoreModule.f1543l.m11706a().m5243Dn(user.profile.studies.qualification) && !k0g0.b(user.profile.studies.school))) {
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
        return profile.studies.active ? CoreModule.f1533b.getString(R.string.S0) : profile.work.industry;
    }

    /* JADX INFO: renamed from: n */
    public static CharSequence m10041n(Location location) {
        String strR = i0g0.r(location.clone(), true, true);
        CharSequence charSequenceM10039k = m10039k(location);
        return !TextUtils.isEmpty(charSequenceM10039k) ? charSequenceM10039k : String.format(CoreModule.f1533b.getString(R$string.f1332K1), strR);
    }

    /* JADX INFO: renamed from: f */
    public final void m10042f(View view) {
        uir.a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public Act m10043g() {
        return getContext();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Boolean m10044h(roj0 roj0Var) {
        this.f7097x = false;
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Boolean m10045i(Boolean bool) {
        this.f7097x = true;
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m10046j(d30 d30Var, boolean z, User user, LikersFrag likersFrag, View view) {
        if (m10043g().lifecycle_() == c.i && this.f7097x) {
            d30Var.call();
            if (z) {
                likersFrag.m10028W4("seepagePhotoClick");
            } else {
                CoreModule.m1854P().m11706a().m5389Yj(m10043g(), user, this.f7074a, this.f7076c);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0146  */
    /* JADX INFO: renamed from: m */
    public void m10047m(final LikersFrag likersFrag, final User user, long j, final d30 d30Var, final boolean z, LikersItemStyle likersItemStyle, final d30 d30Var2, final d30 d30Var3) {
        this.f7096w = user;
        setOnClickListener(new View.OnClickListener() { // from class: l.rir
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20567a.m10046j(d30Var, z, user, likersFrag, view);
            }
        });
        if (likersItemStyle == LikersItemStyle.newStyle1) {
            RoundingParams roundingParams = new RoundingParams();
            roundingParams.s(t100.e);
            this.f7074a.getHierarchy().H(roundingParams);
            this.f7074a.getLayoutParams().height = t100.d(216.0f);
            qib0.f19782G.m12749O(this.f7074a, user.fp().profileMiddle().formatted(), 2, 30);
            this.f7086m.setVisibility(0);
            this.f7082i.setVisibility(8);
        } else {
            if (h7n.m16063c()) {
                m10048o(user);
            } else {
                RoundingParams roundingParams2 = new RoundingParams();
                int i = t100.e;
                roundingParams2.r(i, i, 0.0f, 0.0f);
                this.f7074a.getHierarchy().H(roundingParams2);
                this.f7074a.getLayoutParams().height = t100.d(182.0f);
                this.f7082i.setVisibility(0);
                this.f7086m.setVisibility(8);
                this.f7087n.setVisibility(8);
                this.f7083j.setText(m10043g().getString(R.string.a1, user.name));
                boolean zM26495z3 = CoreModule.f1534c.f3550E0.m26495z3(user);
                VText vText = this.f7084k;
                if (zM26495z3) {
                    vText.setText("");
                } else {
                    vText.setText(m10043g().getString(R.string.Z0, String.valueOf(user.age)));
                }
                if (user.superLikedMe()) {
                    this.f7085l.setVisibility(0);
                    this.f7085l.setImageResource(b3c0.n2);
                } else {
                    boolean zBoosted = user.boosted();
                    ImageView imageView = this.f7085l;
                    if (zBoosted) {
                        imageView.setVisibility(0);
                        this.f7085l.setImageResource(b3c0.d6);
                    } else {
                        imageView.setVisibility(8);
                    }
                }
            }
            user.showPicVerificationIcon(this.f7076c, this.f7077d);
            if (z) {
                qib0.f19782G.m12749O(this.f7074a, user.fp().profileMiddle().formatted(), 2, 20);
                if (xdl0.O0(this.f7076c)) {
                    this.f7077d.setVisibility(4);
                }
            } else {
                qib0.f19782G.m12748N0(this.f7074a, user.fp().profileMiddle().formatted(), false);
                if (j == 0 || !NullChecker.a(user.localRelationship)) {
                    xdl0.M0(this.f7075b, false);
                } else {
                    double d = user.localRelationship.updateTime;
                    if (d != 0.0d) {
                        xdl0.M0(this.f7075b, j < ((long) d));
                    } else {
                        xdl0.M0(this.f7075b, false);
                    }
                }
            }
        }
        this.f7079f.setVisibility(4);
        this.f7078e.setVisibility(4);
        if (IntlCountryCodeController.m21v() && NullChecker.a(d30Var2) && NullChecker.a(d30Var3)) {
            this.f7080g.setVisibility(0);
            this.f7081h.setVisibility(0);
            this.f7080g.setOnClickListener(new View.OnClickListener() { // from class: l.sir
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d30Var2.call();
                }
            });
            this.f7081h.setOnClickListener(new View.OnClickListener() { // from class: l.tir
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d30Var3.call();
                }
            });
        }
        if (CoreModule.m1854P().m11706a().m5317O()) {
            boolean zIsIdAndPicBothVerified = user.isIdAndPicBothVerified();
            VImage vImage = this.f7077d;
            if (!zIsIdAndPicBothVerified) {
                vImage.setBackgroundResource(b3c0.k6);
            } else {
                vImage.setBackgroundResource(b3c0.v5);
                this.f7077d.setImageResource(0);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m10048o(User user) {
        String string;
        m10049p(b3c0.i6);
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.s(t100.h);
        this.f7074a.getHierarchy().H(roundingParams);
        this.f7074a.getLayoutParams().height = -1;
        xdl0.U(this.f7074a, t100.d(0.0f));
        this.f7082i.setVisibility(8);
        this.f7087n.setVisibility(0);
        boolean zM26464B3 = CoreModule.f1534c.f3550E0.m26464B3(user);
        boolean zIsEmpty = TextUtils.isEmpty(m10040l(m10043g(), user));
        if (zM26464B3 && zIsEmpty) {
            xdl0.M0(this.f7093t, false);
            xdl0.X(this.f7088o, t100.d(32.0f));
            xdl0.X(this.f7089p, t100.d(56.0f));
        } else {
            xdl0.X(this.f7088o, t100.d(8.0f));
            xdl0.X(this.f7089p, t100.d(32.0f));
            xdl0.M0(this.f7093t, true);
            VText vText = this.f7094u;
            if (zM26464B3) {
                xdl0.M(vText, false);
            } else {
                xdl0.M(vText, true);
                this.f7094u.setText(m10041n(user.location));
            }
            VText vText2 = this.f7095v;
            if (TextUtils.isEmpty(m10040l(m10043g(), user))) {
                string = "";
            } else {
                string = xdl0.O0(this.f7094u) ? m10043g().getString(R.string.Z0, m10040l(m10043g(), user)) : m10040l(m10043g(), user);
            }
            vText2.setText(string);
        }
        this.f7090q.setText(m10043g().getString(R.string.a1, user.name));
        boolean zM26495z3 = CoreModule.f1534c.f3550E0.m26495z3(user);
        VText vText3 = this.f7091r;
        if (zM26495z3) {
            xdl0.M(vText3, false);
        } else {
            xdl0.M(vText3, true);
            this.f7091r.setText(m10043g().getString(R.string.Z0, String.valueOf(user.age)));
        }
        this.f7088o.setVisibility(8);
        int i = b3c0.n2;
        int i2 = b3c0.d6;
        if (user.superLikedMe()) {
            xdl0.M0(this.f7092s, true);
            this.f7092s.setImageResource(i);
            return;
        }
        boolean zBoosted = user.boosted();
        ImageView imageView = this.f7092s;
        if (!zBoosted) {
            xdl0.M0(imageView, false);
        } else {
            xdl0.M0(imageView, true);
            this.f7092s.setImageResource(i2);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m10042f(this);
        m10049p(b3c0.j6);
    }

    /* JADX INFO: renamed from: p */
    public final void m10049p(int i) {
        Object tag = getTag();
        if (!NullChecker.a(tag)) {
            setTag(Integer.valueOf(i));
            setBackgroundDrawable(m10043g().drawable(i));
        } else if (((Integer) tag).intValue() != i) {
            setTag(Integer.valueOf(i));
            setBackgroundDrawable(m10043g().drawable(i));
        }
    }

    public LikersItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m10043g().duringCreated(f7073y).map(new w9j() { // from class: l.pir
            public final Object call(Object obj) {
                return this.f19151a.m10044h((roj0) obj);
            }
        }).delay(1500L, TimeUnit.MILLISECONDS).map(new w9j() { // from class: l.qir
            public final Object call(Object obj) {
                return this.f19844a.m10045i((Boolean) obj);
            }
        }).subscribe();
        this.f7097x = true;
    }

    public LikersItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m10043g().duringCreated(f7073y).map(new w9j() { // from class: l.pir
            public final Object call(Object obj) {
                return this.f19151a.m10044h((roj0) obj);
            }
        }).delay(1500L, TimeUnit.MILLISECONDS).map(new w9j() { // from class: l.qir
            public final Object call(Object obj) {
                return this.f19844a.m10045i((Boolean) obj);
            }
        }).subscribe();
        this.f7097x = true;
    }
}
