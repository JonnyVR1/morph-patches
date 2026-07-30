package com.p000p1.mobile.putong.core.p004ui.vip.likers;

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
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.seepage.likers.FakeLikersItem;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.member.R;
import com.p1.mobile.putong.data.Location;
import com.p1.mobile.putong.data.Profile;
import com.p1.mobile.putong.data.Region;
import com.p1.mobile.putong.data.Tag;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.b3c0;
import l.d30;
import l.dir;
import l.eqh0;
import l.i0g0;
import l.mqi0;
import l.sb90;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import p006l.qib0;
import p006l.xma;
import v.VDraweeView;
import v.VImage;
import v.VLinear_FillerMeasure;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class LikersBigCardItemView extends CardView {

    /* JADX INFO: renamed from: a */
    public VDraweeView f7036a;

    /* JADX INFO: renamed from: b */
    public VText f7037b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f7038c;

    /* JADX INFO: renamed from: d */
    public VImage f7039d;

    /* JADX INFO: renamed from: e */
    public VImage f7040e;

    /* JADX INFO: renamed from: f */
    public VImage f7041f;

    /* JADX INFO: renamed from: g */
    public ConstraintLayout f7042g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f7043h;

    /* JADX INFO: renamed from: i */
    public ImageView f7044i;

    /* JADX INFO: renamed from: j */
    public ImageView f7045j;

    /* JADX INFO: renamed from: k */
    public VText f7046k;

    /* JADX INFO: renamed from: l */
    public VLinear_FillerMeasure f7047l;

    /* JADX INFO: renamed from: m */
    public VText f7048m;

    /* JADX INFO: renamed from: n */
    public VText f7049n;

    /* JADX INFO: renamed from: o */
    public VText f7050o;

    /* JADX INFO: renamed from: p */
    public VText f7051p;

    /* JADX INFO: renamed from: q */
    public User f7052q;

    /* JADX INFO: renamed from: r */
    public FakeLikersItem.LikeLabelType f7053r;

    public LikersBigCardItemView(@NonNull Context context) {
        super(context);
        this.f7053r = FakeLikersItem.LikeLabelType.HIDE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    private Act m10000m() {
        return getContext();
    }

    /* JADX INFO: renamed from: n */
    public static String m10001n(User user, User user2) {
        if (vwb.J(user2.profile.tags) || vwb.J(user.profile.tags)) {
            return null;
        }
        for (Tag tag : m10002o(user.profile)) {
            for (Tag tag2 : m10002o(user2.profile)) {
                if (tag2.value.equals(tag.value)) {
                    return tag2.value;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static ArrayList<Tag> m10002o(Profile profile) {
        return vwb.n(profile.tags, new w9j() { // from class: l.zhr
            public final Object call(Object obj) {
                return Boolean.valueOf(!"personality".equals(((Tag) obj).category));
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public static boolean m10003s(User user, User user2) {
        boolean zIsFemale = user.isFemale();
        Integer num = user.age;
        if (zIsFemale) {
            if (num.intValue() - 3 > user2.age.intValue() || user2.age.intValue() > user.age.intValue() + 7) {
                return false;
            }
        } else if (num.intValue() - 7 > user2.age.intValue() || user2.age.intValue() > user.age.intValue() + 3) {
            return false;
        }
        return !CoreModule.f1534c.f3550E0.m26495z3(user2);
    }

    /* JADX INFO: renamed from: u */
    private void m10004u(User user, User user2) {
        boolean z = ((double) mqi0.o()) - user2.location.updatedTime > 1800000.0d;
        if (CoreModule.f1534c.f3550E0.m26464B3(user2) || (user2.location.distance > 5000 && !z)) {
            xdl0.M(this.f7051p, false);
            return;
        }
        xdl0.M(this.f7051p, true);
        Location location = user2.location;
        Region region = location.region;
        if (location.distance >= 10000 && TextUtils.equals(region.city, user.location.region.city) && !TextUtils.isEmpty(region.district)) {
            this.f7051p.setText(region.district);
            return;
        }
        if (user2.location.distance >= 10000 && !TextUtils.isEmpty(region.city)) {
            this.f7051p.setText(region.city);
            return;
        }
        Location location2 = user2.location;
        if (location2.distance >= 10000) {
            this.f7051p.setText("10km+");
        } else {
            this.f7051p.setText(i0g0.q(location2, true));
        }
    }

    /* JADX INFO: renamed from: x */
    private void m10005x(User user) {
        double dO = mqi0.o();
        Location location = user.location;
        boolean z = dO - location.updatedTime <= 1800000.0d;
        boolean z2 = location.distance > 5000;
        if (CoreModule.f1534c.f3550E0.m26492w3(user) || !z2 || !z) {
            this.f7050o.setVisibility(8);
            return;
        }
        this.f7050o.setVisibility(0);
        String string = m10000m().getString(R.string.q1);
        String strG = mqi0.G(user.location.updatedTime);
        boolean zEquals = TextUtils.equals(string, strG);
        VText vText = this.f7050o;
        if (zEquals) {
            vText.setText("在线");
        } else {
            vText.setText(String.format("%s活跃", strG));
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m10006l(View view) {
        dir.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m10006l(this);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (((double) View.MeasureSpec.getSize(i)) * 1.33d), View.MeasureSpec.getMode(i2)));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f7042g.getLayoutParams();
        int iY0 = (int) (((double) ((xdl0.y0() / 2) - t100.j)) * 1.33d * 0.3799999952316284d);
        if (layoutParams.height != iY0) {
            layoutParams.height = iY0;
            this.f7042g.setLayoutParams(layoutParams);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public void m10007p(final User user, @NotNull final d30 d30Var, @NotNull final d30 d30Var2, @NotNull final d30 d30Var3) {
        xdl0.E0(this.f7044i, new View.OnClickListener() { // from class: l.whr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var2.call();
            }
        });
        xdl0.E0(this.f7045j, new View.OnClickListener() { // from class: l.xhr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var3.call();
            }
        });
        xdl0.E0(this, new View.OnClickListener() { // from class: l.yhr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f28213a.m10009r(d30Var, user, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public void m10008q(@NotNull final d30 d30Var, @NotNull final d30 d30Var2, @NotNull final d30 d30Var3) {
        xdl0.E0(this.f7044i, new View.OnClickListener() { // from class: l.air
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var2.call();
            }
        });
        xdl0.E0(this.f7045j, new View.OnClickListener() { // from class: l.bir
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var3.call();
            }
        });
        xdl0.E0(this, new View.OnClickListener() { // from class: l.cir
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m10009r(d30 d30Var, User user, View view) {
        d30Var.call();
        CoreModule.f1543l.m11706a().m5529ss(user, this.f7036a, this.f7038c, m10000m());
    }

    public void setNewLikesBadgesText(String str) {
        if (this.f7053r == FakeLikersItem.LikeLabelType.NEW_LIKE) {
            this.f7037b.setText(str);
        }
    }

    /* JADX INFO: renamed from: t */
    public void m10010t(User user, long j) {
        this.f7052q = user;
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        xdl0.M(this.f7041f, false);
        xdl0.M(this.f7040e, false);
        xdl0.M(this.f7045j, false);
        xdl0.M(this.f7044i, true);
        this.f7048m.setText(user.name);
        boolean zM10003s = m10003s(userM21490p9, user);
        VText vText = this.f7049n;
        if (zM10003s) {
            vText.setText(String.valueOf(user.age));
        } else {
            vText.setText("");
        }
        String strK0 = i0g0.k0(user.profile.zodiac, false);
        if (TextUtils.isEmpty(strK0)) {
            this.f7046k.setText("");
        } else {
            String strM10001n = m10001n(userM21490p9, user);
            if (!TextUtils.isEmpty(strM10001n)) {
                strK0 = strK0 + String.format(" · 喜欢%s", strM10001n);
            }
            this.f7046k.setText(strK0);
        }
        m10004u(userM21490p9, user);
        m10005x(user);
        if (sb90.c(user)) {
            qib0.f19782G.m12749O(this.f7036a, user.fp().profileBig().formatted(), 3, 100);
        } else {
            qib0.f19782G.m12748N0(this.f7036a, user.fp().profileMiddle().formatted(), false);
        }
        m10011v(user, j);
        m10012w(user);
        if (!CoreModule.m1854P().m11713i().m5225B7() || CoreModule.f1534c.f3676u0.m2420y5(user)) {
            return;
        }
        if (!xma.m27379e4() || xma.m27351F3()) {
            xdl0.M(this.f7045j, true);
            xdl0.M(this.f7044i, false);
            zvf0.x("e_see_card_greet", "p_see_who_likes_me_view");
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m10011v(User user, long j) {
        xdl0.M0(this.f7037b, false);
        this.f7037b.setTypeface(eqh0.c(3), 0);
        this.f7037b.setCompoundDrawablePadding(0);
        this.f7053r = FakeLikersItem.LikeLabelType.HIDE;
        if (NullChecker.a(user.localRelationship) && NullChecker.a(user.localRelationship.cardInfo) && !vwb.J(user.localRelationship.cardInfo.cardTypes) && user.localRelationship.cardInfo.cardTypes.contains("newLikeAfterVerification")) {
            this.f7053r = FakeLikersItem.LikeLabelType.VERIFY;
            this.f7037b.setText("来自邀请认证");
            this.f7037b.setTypeface(Typeface.DEFAULT_BOLD);
            this.f7037b.setBackgroundResource(qib0.f19804b0.f17707b.I4() ? b3c0.l2 : b3c0.k2);
            this.f7037b.setCompoundDrawablesWithIntrinsicBounds(qib0.f19804b0.f17707b.I4() ? b3c0.h2 : b3c0.g2, 0, 0, 0);
            xdl0.M0(this.f7037b, true);
            return;
        }
        if (!user.superLikedMe()) {
            if (j <= 0 || !NullChecker.a(user.localRelationship) || j >= user.localRelationship.updateTime) {
                return;
            }
            this.f7053r = FakeLikersItem.LikeLabelType.NEW_LIKE;
            xdl0.M0(this.f7037b, true);
            this.f7037b.setText("新喜欢");
            this.f7037b.setBackgroundResource(b3c0.k2);
            this.f7037b.setCompoundDrawablesWithIntrinsicBounds(b3c0.d2, 0, 0, 0);
            return;
        }
        if (CoreModule.m1854P().m11706a().m5524sf() && NullChecker.a(user.localRelationship) && NullChecker.a(user.localRelationship.relationshipExtensions) && CoreModule.m1854P().m11706a().m5272Hl(user.localRelationship.relationshipExtensions.recvSuperLikedNum) > 1) {
            this.f7037b.setTypeface(eqh0.c(2), 1);
            this.f7037b.setText(String.format("超级喜欢x%s", user.localRelationship.relationshipExtensions.recvSuperLikedNum));
            this.f7037b.setCompoundDrawablePadding(-t100.a);
        } else {
            this.f7037b.setTypeface(eqh0.c(3), 0);
            this.f7037b.setText(String.format("%s超级喜欢你", user.isFemale() ? "她" : "他"));
            this.f7037b.setCompoundDrawablePadding(0);
        }
        this.f7053r = FakeLikersItem.LikeLabelType.SUPER_LIKE;
        xdl0.M0(this.f7037b, true);
        this.f7037b.setBackgroundResource(b3c0.m2);
        this.f7037b.setCompoundDrawablesWithIntrinsicBounds(b3c0.e2, 0, 0, 0);
    }

    /* JADX INFO: renamed from: w */
    public final void m10012w(User user) {
        boolean zIsIdAndPicBothVerified = user.isIdAndPicBothVerified();
        VImage vImage = this.f7039d;
        if (zIsIdAndPicBothVerified) {
            vImage.setImageResource(b3c0.w5);
        } else {
            vImage.setImageResource(b3c0.I1);
        }
        user.showPicVerificationIcon(this.f7038c, this.f7039d);
    }

    public LikersBigCardItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7053r = FakeLikersItem.LikeLabelType.HIDE;
    }

    public LikersBigCardItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7053r = FakeLikersItem.LikeLabelType.HIDE;
    }
}
