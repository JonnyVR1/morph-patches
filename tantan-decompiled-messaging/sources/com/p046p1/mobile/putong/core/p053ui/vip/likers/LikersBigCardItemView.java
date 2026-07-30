package com.p046p1.mobile.putong.core.p053ui.vip.likers;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.core.p053ui.seepage.likers.FakeLikersItem;
import com.p046p1.mobile.putong.data.Location;
import com.p046p1.mobile.putong.data.Profile;
import com.p046p1.mobile.putong.data.Region;
import com.p046p1.mobile.putong.data.Tag;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear_FillerMeasure;
import p147v.VText;
import p149l.b3c0;
import p149l.d30;
import p149l.dir;
import p149l.eqh0;
import p149l.i0g0;
import p149l.mqi0;
import p149l.qib0;
import p149l.sb90;
import p149l.t100;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.xma;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class LikersBigCardItemView extends CardView {

    /* JADX INFO: renamed from: a */
    public VDraweeView f37255a;

    /* JADX INFO: renamed from: b */
    public VText f37256b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f37257c;

    /* JADX INFO: renamed from: d */
    public VImage f37258d;

    /* JADX INFO: renamed from: e */
    public VImage f37259e;

    /* JADX INFO: renamed from: f */
    public VImage f37260f;

    /* JADX INFO: renamed from: g */
    public ConstraintLayout f37261g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f37262h;

    /* JADX INFO: renamed from: i */
    public ImageView f37263i;

    /* JADX INFO: renamed from: j */
    public ImageView f37264j;

    /* JADX INFO: renamed from: k */
    public VText f37265k;

    /* JADX INFO: renamed from: l */
    public VLinear_FillerMeasure f37266l;

    /* JADX INFO: renamed from: m */
    public VText f37267m;

    /* JADX INFO: renamed from: n */
    public VText f37268n;

    /* JADX INFO: renamed from: o */
    public VText f37269o;

    /* JADX INFO: renamed from: p */
    public VText f37270p;

    /* JADX INFO: renamed from: q */
    public User f37271q;

    /* JADX INFO: renamed from: r */
    public FakeLikersItem.LikeLabelType f37272r;

    public LikersBigCardItemView(@NonNull Context context) {
        super(context);
        this.f37272r = FakeLikersItem.LikeLabelType.HIDE;
    }

    /* JADX INFO: renamed from: m */
    private Act m56558m() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: n */
    public static String m56559n(User user, User user2) {
        if (vwb.m200296J(user2.profile.tags) || vwb.m200296J(user.profile.tags)) {
            return null;
        }
        for (Tag tag : m56560o(user.profile)) {
            for (Tag tag2 : m56560o(user2.profile)) {
                if (tag2.value.equals(tag.value)) {
                    return tag2.value;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static ArrayList<Tag> m56560o(Profile profile) {
        return vwb.m200339n(profile.tags, new w9j() { // from class: l.zhr
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!"personality".equals(((Tag) obj).category));
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public static boolean m56561s(User user, User user2) {
        boolean zIsFemale = user.isFemale();
        Integer num = user.age;
        if (zIsFemale) {
            if (num.intValue() - 3 > user2.age.intValue() || user2.age.intValue() > user.age.intValue() + 7) {
                return false;
            }
        } else if (num.intValue() - 7 > user2.age.intValue() || user2.age.intValue() > user.age.intValue() + 3) {
            return false;
        }
        return !CoreModule.f17545c.f19561E0.m203803z3(user2);
    }

    /* JADX INFO: renamed from: u */
    private void m56562u(User user, User user2) {
        boolean z = ((double) mqi0.m155944o()) - user2.location.updatedTime > 1800000.0d;
        if (CoreModule.f17545c.f19561E0.m203772B3(user2) || (user2.location.distance > 5000 && !z)) {
            xdl0.m208344M(this.f37270p, false);
            return;
        }
        xdl0.m208344M(this.f37270p, true);
        Location location = user2.location;
        Region region = location.region;
        if (location.distance >= 10000 && TextUtils.equals(region.city, user.location.region.city) && !TextUtils.isEmpty(region.district)) {
            this.f37270p.setText(region.district);
            return;
        }
        if (user2.location.distance >= 10000 && !TextUtils.isEmpty(region.city)) {
            this.f37270p.setText(region.city);
            return;
        }
        Location location2 = user2.location;
        if (location2.distance >= 10000) {
            this.f37270p.setText("10km+");
        } else {
            this.f37270p.setText(i0g0.m133877q(location2, true));
        }
    }

    /* JADX INFO: renamed from: x */
    private void m56563x(User user) {
        double dM155944o = mqi0.m155944o();
        Location location = user.location;
        boolean z = dM155944o - location.updatedTime <= 1800000.0d;
        boolean z2 = location.distance > 5000;
        if (CoreModule.f17545c.f19561E0.m203800w3(user) || !z2 || !z) {
            this.f37269o.setVisibility(8);
            return;
        }
        this.f37269o.setVisibility(0);
        String string = m56558m().getString(R$string.f20677q1);
        String strM155932G = mqi0.m155932G(user.location.updatedTime);
        boolean zEquals = TextUtils.equals(string, strM155932G);
        VText vText = this.f37269o;
        if (zEquals) {
            vText.setText("在线");
        } else {
            vText.setText(String.format("%s活跃", strM155932G));
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m56564l(View view) {
        dir.m111908a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56564l(this);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (((double) View.MeasureSpec.getSize(i)) * 1.33d), View.MeasureSpec.getMode(i2)));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f37261g.getLayoutParams();
        int iM208412y0 = (int) (((double) ((xdl0.m208412y0() / 2) - t100.f167261j)) * 1.33d * 0.3799999952316284d);
        if (layoutParams.height != iM208412y0) {
            layoutParams.height = iM208412y0;
            this.f37261g.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m56565p(final User user, @NotNull final d30 d30Var, @NotNull final d30 d30Var2, @NotNull final d30 d30Var3) {
        xdl0.m208329E0(this.f37263i, new View.OnClickListener() { // from class: l.whr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var2.call();
            }
        });
        xdl0.m208329E0(this.f37264j, new View.OnClickListener() { // from class: l.xhr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var3.call();
            }
        });
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.yhr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f198386a.m56567r(d30Var, user, view);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public void m56566q(@NotNull final d30 d30Var, @NotNull final d30 d30Var2, @NotNull final d30 d30Var3) {
        xdl0.m208329E0(this.f37263i, new View.OnClickListener() { // from class: l.air
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var2.call();
            }
        });
        xdl0.m208329E0(this.f37264j, new View.OnClickListener() { // from class: l.bir
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var3.call();
            }
        });
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.cir
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m56567r(d30 d30Var, User user, View view) {
        d30Var.call();
        CoreModule.f17554l.m94651a().mo33592ss(user, this.f37255a, this.f37257c, m56558m());
    }

    public void setNewLikesBadgesText(String str) {
        if (this.f37272r == FakeLikersItem.LikeLabelType.NEW_LIKE) {
            this.f37256b.setText(str);
        }
    }

    /* JADX INFO: renamed from: t */
    public void m56568t(User user, long j) {
        this.f37271q = user;
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        xdl0.m208344M(this.f37260f, false);
        xdl0.m208344M(this.f37259e, false);
        xdl0.m208344M(this.f37264j, false);
        xdl0.m208344M(this.f37263i, true);
        this.f37267m.setText(user.name);
        boolean zM56561s = m56561s(userM169527p9, user);
        VText vText = this.f37268n;
        if (zM56561s) {
            vText.setText(String.valueOf(user.age));
        } else {
            vText.setText("");
        }
        String strM133870k0 = i0g0.m133870k0(user.profile.zodiac, false);
        if (TextUtils.isEmpty(strM133870k0)) {
            this.f37265k.setText("");
        } else {
            String strM56559n = m56559n(userM169527p9, user);
            if (!TextUtils.isEmpty(strM56559n)) {
                strM133870k0 = strM133870k0 + String.format(" · 喜欢%s", strM56559n);
            }
            this.f37265k.setText(strM133870k0);
        }
        m56562u(userM169527p9, user);
        m56563x(user);
        if (sb90.m183207c(user)) {
            qib0.f154691G.m102336O(this.f37255a, user.m60124fp().profileBig().formatted(), 3, 100);
        } else {
            qib0.f154691G.m102335N0(this.f37255a, user.m60124fp().profileMiddle().formatted(), false);
        }
        m56569v(user, j);
        m56570w(user);
        if (!CoreModule.m29935P().m94658i().mo33288B7() || CoreModule.f17545c.f19687u0.m30492y5(user)) {
            return;
        }
        if (!xma.m210071e4() || xma.m210043F3()) {
            xdl0.m208344M(this.f37264j, true);
            xdl0.m208344M(this.f37263i, false);
            zvf0.m220402x("e_see_card_greet", "p_see_who_likes_me_view");
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m56569v(User user, long j) {
        xdl0.m208345M0(this.f37256b, false);
        this.f37256b.setTypeface(eqh0.m117752c(3), 0);
        this.f37256b.setCompoundDrawablePadding(0);
        this.f37272r = FakeLikersItem.LikeLabelType.HIDE;
        if (NullChecker.m81303a(user.localRelationship) && NullChecker.m81303a(user.localRelationship.cardInfo) && !vwb.m200296J(user.localRelationship.cardInfo.cardTypes) && user.localRelationship.cardInfo.cardTypes.contains("newLikeAfterVerification")) {
            this.f37272r = FakeLikersItem.LikeLabelType.VERIFY;
            this.f37256b.setText("来自邀请认证");
            this.f37256b.setTypeface(Typeface.DEFAULT_BOLD);
            this.f37256b.setBackgroundResource(qib0.f154713b0.f139231b.mo30692I4() ? b3c0.f73093l2 : b3c0.f73085k2);
            this.f37256b.setCompoundDrawablesWithIntrinsicBounds(qib0.f154713b0.f139231b.mo30692I4() ? b3c0.f73061h2 : b3c0.f73053g2, 0, 0, 0);
            xdl0.m208345M0(this.f37256b, true);
            return;
        }
        if (!user.superLikedMe()) {
            if (j <= 0 || !NullChecker.m81303a(user.localRelationship) || j >= user.localRelationship.updateTime) {
                return;
            }
            this.f37272r = FakeLikersItem.LikeLabelType.NEW_LIKE;
            xdl0.m208345M0(this.f37256b, true);
            this.f37256b.setText("新喜欢");
            this.f37256b.setBackgroundResource(b3c0.f73085k2);
            this.f37256b.setCompoundDrawablesWithIntrinsicBounds(b3c0.f73029d2, 0, 0, 0);
            return;
        }
        if (CoreModule.m29935P().m94651a().mo33587sf() && NullChecker.m81303a(user.localRelationship) && NullChecker.m81303a(user.localRelationship.relationshipExtensions) && CoreModule.m29935P().m94651a().mo33335Hl(user.localRelationship.relationshipExtensions.recvSuperLikedNum) > 1) {
            this.f37256b.setTypeface(eqh0.m117752c(2), 1);
            this.f37256b.setText(String.format("超级喜欢x%s", user.localRelationship.relationshipExtensions.recvSuperLikedNum));
            this.f37256b.setCompoundDrawablePadding(-t100.f167252a);
        } else {
            this.f37256b.setTypeface(eqh0.m117752c(3), 0);
            this.f37256b.setText(String.format("%s超级喜欢你", user.isFemale() ? "她" : "他"));
            this.f37256b.setCompoundDrawablePadding(0);
        }
        this.f37272r = FakeLikersItem.LikeLabelType.SUPER_LIKE;
        xdl0.m208345M0(this.f37256b, true);
        this.f37256b.setBackgroundResource(b3c0.f73101m2);
        this.f37256b.setCompoundDrawablesWithIntrinsicBounds(b3c0.f73037e2, 0, 0, 0);
    }

    /* JADX INFO: renamed from: w */
    public final void m56570w(User user) {
        boolean zIsIdAndPicBothVerified = user.isIdAndPicBothVerified();
        VImage vImage = this.f37258d;
        if (zIsIdAndPicBothVerified) {
            vImage.setImageResource(b3c0.f73181w5);
        } else {
            vImage.setImageResource(b3c0.f72878I1);
        }
        user.showPicVerificationIcon(this.f37257c, this.f37258d);
    }

    public LikersBigCardItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37272r = FakeLikersItem.LikeLabelType.HIDE;
    }

    public LikersBigCardItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37272r = FakeLikersItem.LikeLabelType.HIDE;
    }
}
