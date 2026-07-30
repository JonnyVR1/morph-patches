package com.p000p1.mobile.putong.core.p001ui.likedusers;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.data.RelationshipStatus;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.newui.camera.widget.MakeUpMenuView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.LikedUser;
import com.p1.mobile.putong.core.member.R;
import com.tantanapp.common.utils.NullChecker;
import l.b3c0;
import l.e30;
import l.eqh0;
import l.ffr;
import l.mqi0;
import l.qib0;
import l.sb90;
import l.t100;
import l.xdl0;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class LikedUserItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f82a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f83b;

    /* JADX INFO: renamed from: c */
    public VText f84c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f85d;

    /* JADX INFO: renamed from: e */
    public VText f86e;

    /* JADX INFO: renamed from: f */
    public View f87f;

    /* JADX INFO: renamed from: g */
    public VText f88g;

    /* JADX INFO: renamed from: h */
    public VImage f89h;

    /* JADX INFO: renamed from: i */
    public VImage f90i;

    /* JADX INFO: renamed from: j */
    public VText f91j;

    /* JADX INFO: renamed from: k */
    public VText f92k;

    /* JADX INFO: renamed from: l */
    public VText f93l;

    /* JADX INFO: renamed from: m */
    public VText f94m;

    /* JADX INFO: renamed from: n */
    public View f95n;

    /* JADX INFO: renamed from: o */
    public LikedUser f96o;

    public LikedUserItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public static String m469e(int i) {
        if (i <= 100 || i < 1000) {
            return "1km";
        }
        if (i >= 100000) {
            return "99+km";
        }
        return (i / MakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO) + "km";
    }

    /* JADX INFO: renamed from: c */
    public final void m470c(View view) {
        ffr.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public Act m471d() {
        return xdl0.D(getContext());
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m472f(e30 e30Var, LikedUser likedUser, View view) {
        if (m471d().lifecycle_() == c.i && NullChecker.a(e30Var)) {
            e30Var.call(likedUser);
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m473g(e30 e30Var, LikedUser likedUser, View view) {
        if (m471d().lifecycle_() != c.i) {
            return;
        }
        e30Var.call(Boolean.valueOf(TEnum.equals(likedUser.status, RelationshipStatus.superliked)));
    }

    /* JADX INFO: renamed from: h */
    public void m474h(final LikedUser likedUser, User user, boolean z, final e30<LikedUser> e30Var, final e30<Boolean> e30Var2) {
        this.f96o = likedUser;
        xdl0.L(this, new View.OnClickListener() { // from class: l.dfr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6920a.m472f(e30Var, likedUser, view);
            }
        });
        xdl0.L(this.f89h, new View.OnClickListener() { // from class: l.efr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7345a.m473g(e30Var2, likedUser, view);
            }
        });
        if (sb90.c(user)) {
            qib0.G.O(this.f82a, user.m1042fp().profileMiddle().formatted(), 3, 100);
        } else {
            qib0.G.N0(this.f82a, user.m1042fp().profileMiddle().formatted(), false);
        }
        xdl0.M(this.f95n, z);
        xdl0.M(this.f90i, false);
        ConstraintLayout constraintLayout = this.f83b;
        if (z) {
            xdl0.M(constraintLayout, false);
            xdl0.M(this.f92k, false);
            xdl0.M(this.f94m, false);
            xdl0.M(this.f91j, false);
            return;
        }
        xdl0.M(constraintLayout, true);
        xdl0.M(this.f94m, true);
        this.f94m.setText(TEnum.equals(likedUser.otherStatus, RelationshipStatus.disliked) ? R.string.y : R.string.z);
        this.f86e.setText(String.valueOf(user.age));
        xdl0.M(this.f87f, true);
        xdl0.M(this.f88g, true);
        this.f88g.setText(m469e(user.location.distance));
        boolean zEquals = TEnum.equals(likedUser.status, RelationshipStatus.superliked);
        VText vText = this.f94m;
        if (zEquals) {
            xdl0.M(vText, true);
            xdl0.M(this.f92k, true);
            if (!CoreModule.P().a().sf() || CoreModule.P().a().Hl(likedUser.relationshipExt.sendSuperLikedNum) <= 1) {
                this.f92k.setText(CoreModule.b.getString(R.string.A));
                this.f92k.setTypeface(eqh0.c(2), 1);
            } else {
                this.f92k.setTypeface(eqh0.c(2), 1);
                this.f92k.setText(String.format("超级喜欢x%s", likedUser.relationshipExt.sendSuperLikedNum));
            }
            xdl0.M0(this.f84c, false);
            xdl0.M(this.f89h, !CoreModule.N().mo1193Co());
            xdl0.M(this.f93l, false);
            this.f89h.setImageResource(b3c0.r0);
        } else {
            xdl0.M(vText, true);
            xdl0.M(this.f93l, false);
            xdl0.M(this.f89h, true);
            if (user.isHideActiveFromSVip() || mqi0.o() - Math.round(user.location.updatedTime) > 180000) {
                xdl0.M0(this.f84c, false);
            } else {
                xdl0.M0(this.f84c, true);
            }
            xdl0.M(this.f92k, false);
            this.f89h.setImageResource(b3c0.s0);
        }
        this.f83b.setBackground(getResources().getDrawable(b3c0.q0));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m470c(this);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f83b.getLayoutParams();
        int iY0 = (int) (((double) ((xdl0.y0() / 2) - t100.j)) * 1.33d * 0.3799999952316284d);
        if (layoutParams.height != iY0) {
            layoutParams.height = iY0;
            this.f83b.setLayoutParams(layoutParams);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (((double) View.MeasureSpec.getSize(i)) * 1.33d), View.MeasureSpec.getMode(i2)));
    }

    public LikedUserItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LikedUserItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
