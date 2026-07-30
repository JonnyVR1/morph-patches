package com.p051p1.mobile.putong.core.p058ui.vip.likers;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.core.p058ui.seepage.likers.FakeLikersItem;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.data.Profile;
import com.p051p1.mobile.putong.data.Region;
import com.p051p1.mobile.putong.data.Tag;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear_FillerMeasure;
import p151v.VText;
import p153l.bnl0;
import p153l.ekr;
import p153l.gbc0;
import p153l.i4g0;
import p153l.joa;
import p153l.jyb;
import p153l.lyh0;
import p153l.pzi0;
import p153l.q8g0;
import p153l.qa00;
import p153l.qcj;
import p153l.uqb0;
import p153l.wj90;
import p153l.x20;

/* JADX INFO: loaded from: classes12.dex */
public class LikersBigCardItemView extends CardView {

    /* JADX INFO: renamed from: a */
    public VDraweeView f38103a;

    /* JADX INFO: renamed from: b */
    public VText f38104b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f38105c;

    /* JADX INFO: renamed from: d */
    public VImage f38106d;

    /* JADX INFO: renamed from: e */
    public VImage f38107e;

    /* JADX INFO: renamed from: f */
    public VImage f38108f;

    /* JADX INFO: renamed from: g */
    public ConstraintLayout f38109g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f38110h;

    /* JADX INFO: renamed from: i */
    public ImageView f38111i;

    /* JADX INFO: renamed from: j */
    public ImageView f38112j;

    /* JADX INFO: renamed from: k */
    public VText f38113k;

    /* JADX INFO: renamed from: l */
    public VLinear_FillerMeasure f38114l;

    /* JADX INFO: renamed from: m */
    public VText f38115m;

    /* JADX INFO: renamed from: n */
    public VText f38116n;

    /* JADX INFO: renamed from: o */
    public VText f38117o;

    /* JADX INFO: renamed from: p */
    public VText f38118p;

    /* JADX INFO: renamed from: q */
    public User f38119q;

    /* JADX INFO: renamed from: r */
    public FakeLikersItem.LikeLabelType f38120r;

    public LikersBigCardItemView(@NonNull Context context) {
        super(context);
        this.f38120r = FakeLikersItem.LikeLabelType.HIDE;
    }

    /* JADX INFO: renamed from: m */
    private Act m57741m() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: n */
    public static String m57742n(User user, User user2) {
        if (jyb.m147479J(user2.profile.tags) || jyb.m147479J(user.profile.tags)) {
            return null;
        }
        for (Tag tag : m57743o(user.profile)) {
            for (Tag tag2 : m57743o(user2.profile)) {
                if (tag2.value.equals(tag.value)) {
                    return tag2.value;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static ArrayList<Tag> m57743o(Profile profile) {
        return jyb.m147522n(profile.tags, new qcj() { // from class: l.akr
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!"personality".equals(((Tag) obj).category));
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public static boolean m57744s(User user, User user2) {
        boolean zIsFemale = user.isFemale();
        Integer num = user.age;
        if (zIsFemale) {
            if (num.intValue() - 3 > user2.age.intValue() || user2.age.intValue() > user.age.intValue() + 7) {
                return false;
            }
        } else if (num.intValue() - 7 > user2.age.intValue() || user2.age.intValue() > user.age.intValue() + 3) {
            return false;
        }
        return !CoreModule.f18264c.f20303E0.m141091z3(user2);
    }

    /* JADX INFO: renamed from: u */
    private void m57745u(User user, User user2) {
        boolean z = ((double) pzi0.m174454o()) - user2.location.updatedTime > 1800000.0d;
        if (CoreModule.f18264c.f20303E0.m141060B3(user2) || (user2.location.distance > 5000 && !z)) {
            bnl0.m105524M(this.f38118p, false);
            return;
        }
        bnl0.m105524M(this.f38118p, true);
        Location location = user2.location;
        Region region = location.region;
        if (location.distance >= 10000 && TextUtils.equals(region.city, user.location.region.city) && !TextUtils.isEmpty(region.district)) {
            this.f38118p.setText(region.district);
            return;
        }
        if (user2.location.distance >= 10000 && !TextUtils.isEmpty(region.city)) {
            this.f38118p.setText(region.city);
            return;
        }
        Location location2 = user2.location;
        if (location2.distance >= 10000) {
            this.f38118p.setText("10km+");
        } else {
            this.f38118p.setText(q8g0.m175812q(location2, true));
        }
    }

    /* JADX INFO: renamed from: x */
    private void m57746x(User user) {
        double dM174454o = pzi0.m174454o();
        Location location = user.location;
        boolean z = dM174454o - location.updatedTime <= 1800000.0d;
        boolean z2 = location.distance > 5000;
        if (CoreModule.f18264c.f20303E0.m141088w3(user) || !z2 || !z) {
            this.f38117o.setVisibility(8);
            return;
        }
        this.f38117o.setVisibility(0);
        String string = m57741m().getString(R$string.f21419q1);
        String strM174442G = pzi0.m174442G(user.location.updatedTime);
        boolean zEquals = TextUtils.equals(string, strM174442G);
        VText vText = this.f38117o;
        if (zEquals) {
            vText.setText("在线");
        } else {
            vText.setText(String.format("%s活跃", strM174442G));
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m57747l(View view) {
        ekr.m121067a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57747l(this);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (((double) View.MeasureSpec.getSize(i)) * 1.33d), View.MeasureSpec.getMode(i2)));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f38109g.getLayoutParams();
        int iM105592y0 = (int) (((double) ((bnl0.m105592y0() / 2) - qa00.f156323j)) * 1.33d * 0.3799999952316284d);
        if (layoutParams.height != iM105592y0) {
            layoutParams.height = iM105592y0;
            this.f38109g.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m57748p(final User user, @NotNull final x20 x20Var, @NotNull final x20 x20Var2, @NotNull final x20 x20Var3) {
        bnl0.m105509E0(this.f38111i, new View.OnClickListener() { // from class: l.xjr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var2.call();
            }
        });
        bnl0.m105509E0(this.f38112j, new View.OnClickListener() { // from class: l.yjr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var3.call();
            }
        });
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.zjr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f204698a.m57750r(x20Var, user, view);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public void m57749q(@NotNull final x20 x20Var, @NotNull final x20 x20Var2, @NotNull final x20 x20Var3) {
        bnl0.m105509E0(this.f38111i, new View.OnClickListener() { // from class: l.bkr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var2.call();
            }
        });
        bnl0.m105509E0(this.f38112j, new View.OnClickListener() { // from class: l.ckr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var3.call();
            }
        });
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.dkr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var.call();
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m57750r(x20 x20Var, User user, View view) {
        x20Var.call();
        CoreModule.f18273l.m143405a().mo34595ss(user, this.f38103a, this.f38105c, m57741m());
    }

    public void setNewLikesBadgesText(String str) {
        if (this.f38120r == FakeLikersItem.LikeLabelType.NEW_LIKE) {
            this.f38104b.setText(str);
        }
    }

    /* JADX INFO: renamed from: t */
    public void m57751t(User user, long j) {
        this.f38119q = user;
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        bnl0.m105524M(this.f38108f, false);
        bnl0.m105524M(this.f38107e, false);
        bnl0.m105524M(this.f38112j, false);
        bnl0.m105524M(this.f38111i, true);
        this.f38115m.setText(user.name);
        boolean zM57744s = m57744s(userM116600p9, user);
        VText vText = this.f38116n;
        if (zM57744s) {
            vText.setText(String.valueOf(user.age));
        } else {
            vText.setText("");
        }
        String strM175805k0 = q8g0.m175805k0(user.profile.zodiac, false);
        if (TextUtils.isEmpty(strM175805k0)) {
            this.f38113k.setText("");
        } else {
            String strM57742n = m57742n(userM116600p9, user);
            if (!TextUtils.isEmpty(strM57742n)) {
                strM175805k0 = strM175805k0 + String.format(" · 喜欢%s", strM57742n);
            }
            this.f38113k.setText(strM175805k0);
        }
        m57745u(userM116600p9, user);
        m57746x(user);
        if (wj90.m206620c(user)) {
            uqb0.f180374G.m127120O(this.f38103a, user.m61308fp().profileBig().formatted(), 3, 100);
        } else {
            uqb0.f180374G.m127119N0(this.f38103a, user.m61308fp().profileMiddle().formatted(), false);
        }
        m57752v(user, j);
        m57753w(user);
        if (!CoreModule.m30933P().m143412i().mo34291B7() || CoreModule.f18264c.f20429u0.m31381C5(user)) {
            return;
        }
        if (!joa.m146386f4() || joa.m146357G3()) {
            bnl0.m105524M(this.f38112j, true);
            bnl0.m105524M(this.f38111i, false);
            i4g0.m138526x("e_see_card_greet", "p_see_who_likes_me_view");
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m57752v(User user, long j) {
        bnl0.m105525M0(this.f38104b, false);
        this.f38104b.setTypeface(lyh0.m156283c(3), 0);
        this.f38104b.setCompoundDrawablePadding(0);
        this.f38120r = FakeLikersItem.LikeLabelType.HIDE;
        if (NullChecker.m82486a(user.localRelationship) && NullChecker.m82486a(user.localRelationship.cardInfo) && !jyb.m147479J(user.localRelationship.cardInfo.cardTypes) && user.localRelationship.cardInfo.cardTypes.contains("newLikeAfterVerification")) {
            this.f38120r = FakeLikersItem.LikeLabelType.VERIFY;
            this.f38104b.setText("来自邀请认证");
            this.f38104b.setTypeface(Typeface.DEFAULT_BOLD);
            this.f38104b.setBackgroundResource(uqb0.f180396b0.f170325b.mo31695I4() ? gbc0.f103344l2 : gbc0.f103336k2);
            this.f38104b.setCompoundDrawablesWithIntrinsicBounds(uqb0.f180396b0.f170325b.mo31695I4() ? gbc0.f103312h2 : gbc0.f103304g2, 0, 0, 0);
            bnl0.m105525M0(this.f38104b, true);
            return;
        }
        if (!user.superLikedMe()) {
            if (j <= 0 || !NullChecker.m82486a(user.localRelationship) || j >= user.localRelationship.updateTime) {
                return;
            }
            this.f38120r = FakeLikersItem.LikeLabelType.NEW_LIKE;
            bnl0.m105525M0(this.f38104b, true);
            this.f38104b.setText("新喜欢");
            this.f38104b.setBackgroundResource(gbc0.f103336k2);
            this.f38104b.setCompoundDrawablesWithIntrinsicBounds(gbc0.f103280d2, 0, 0, 0);
            return;
        }
        if (CoreModule.m30933P().m143405a().mo34590sf() && NullChecker.m82486a(user.localRelationship) && NullChecker.m82486a(user.localRelationship.relationshipExtensions) && CoreModule.m30933P().m143405a().mo34338Hl(user.localRelationship.relationshipExtensions.recvSuperLikedNum) > 1) {
            this.f38104b.setTypeface(lyh0.m156283c(2), 1);
            this.f38104b.setText(String.format("超级喜欢x%s", user.localRelationship.relationshipExtensions.recvSuperLikedNum));
            this.f38104b.setCompoundDrawablePadding(-qa00.f156314a);
        } else {
            this.f38104b.setTypeface(lyh0.m156283c(3), 0);
            this.f38104b.setText(String.format("%s超级喜欢你", user.isFemale() ? "她" : "他"));
            this.f38104b.setCompoundDrawablePadding(0);
        }
        this.f38120r = FakeLikersItem.LikeLabelType.SUPER_LIKE;
        bnl0.m105525M0(this.f38104b, true);
        this.f38104b.setBackgroundResource(gbc0.f103352m2);
        this.f38104b.setCompoundDrawablesWithIntrinsicBounds(gbc0.f103288e2, 0, 0, 0);
    }

    /* JADX INFO: renamed from: w */
    public final void m57753w(User user) {
        boolean zIsIdAndPicBothVerified = user.isIdAndPicBothVerified();
        VImage vImage = this.f38106d;
        if (zIsIdAndPicBothVerified) {
            vImage.setImageResource(gbc0.f103432w5);
        } else {
            vImage.setImageResource(gbc0.f103129I1);
        }
        user.showPicVerificationIcon(this.f38105c, this.f38106d);
    }

    public LikersBigCardItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38120r = FakeLikersItem.LikeLabelType.HIDE;
    }

    public LikersBigCardItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38120r = FakeLikersItem.LikeLabelType.HIDE;
    }
}
