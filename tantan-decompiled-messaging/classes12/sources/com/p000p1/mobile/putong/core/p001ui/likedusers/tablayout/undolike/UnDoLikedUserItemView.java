package com.p000p1.mobile.putong.core.p001ui.likedusers.tablayout.undolike;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.newui.camera.widget.MakeUpMenuView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.data.DislikedUsers;
import l.b3c0;
import l.bne0;
import l.d30;
import l.eqh0;
import l.mjj0;
import l.mqi0;
import l.qib0;
import l.qqi0;
import l.t100;
import l.xdl0;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class UnDoLikedUserItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f128a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f129b;

    /* JADX INFO: renamed from: c */
    public VText f130c;

    /* JADX INFO: renamed from: d */
    public VText f131d;

    /* JADX INFO: renamed from: e */
    public VImage f132e;

    /* JADX INFO: renamed from: f */
    public VText f133f;

    /* JADX INFO: renamed from: g */
    public View f134g;

    /* JADX INFO: renamed from: h */
    public DislikedUsers f135h;

    public UnDoLikedUserItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public static String m517e(int i) {
        if (i <= 100 || i < 1000) {
            return "1km";
        }
        if (i >= 100000) {
            return "99+km";
        }
        return (i / MakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO) + "km";
    }

    /* JADX INFO: renamed from: c */
    public final void m518c(View view) {
        mjj0.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public Act m519d() {
        return xdl0.D(getContext());
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m520f(d30 d30Var, View view) {
        if (m519d().lifecycle_() != c.i) {
            return;
        }
        d30Var.call();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m521g(d30 d30Var, View view) {
        if (m519d().lifecycle_() != c.i) {
            return;
        }
        d30Var.call();
    }

    /* JADX INFO: renamed from: h */
    public void m522h(DislikedUsers dislikedUsers, boolean z, final d30 d30Var, final d30 d30Var2) {
        this.f135h = dislikedUsers;
        User user = dislikedUsers.userInfo;
        setVisibility(0);
        xdl0.M(this.f134g, z);
        xdl0.L(this.f128a, new View.OnClickListener() { // from class: l.kjj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9730a.m520f(d30Var2, view);
            }
        });
        xdl0.L(this.f132e, new View.OnClickListener() { // from class: l.ljj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10055a.m521g(d30Var, view);
            }
        });
        qib0.G.N0(this.f128a, user.m1042fp().profileMiddle().formatted(), false);
        StringBuilder sb = new StringBuilder(String.valueOf(user.age));
        if (bne0.e()) {
            sb.append("岁");
        }
        if (!user.isHideLocationFromSVip() && user.location.distance < 10000) {
            sb.append(", ");
            sb.append(m517e(user.location.distance));
        }
        if (user.isHideActiveFromSVip() || mqi0.o() - Math.round(user.location.updatedTime) > 180000) {
            xdl0.M0(this.f130c, false);
        } else {
            xdl0.M0(this.f130c, true);
        }
        this.f131d.setText(sb);
        this.f132e.setImageResource(b3c0.p0);
        this.f129b.setBackground(getResources().getDrawable(b3c0.q0));
        m523i(user);
    }

    /* JADX INFO: renamed from: i */
    public final void m523i(User user) {
        this.f133f.setTypeface(eqh0.c(2), 1);
        boolean zH = qqi0.h(mqi0.o(), Math.round(user.createdTime), 7);
        VText vText = this.f133f;
        if (zH) {
            xdl0.M(vText, false);
        } else {
            xdl0.M(vText, true);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m518c(this);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f129b.getLayoutParams();
        int iY0 = (int) (((double) ((xdl0.y0() / 2) - t100.j)) * 1.33d * 0.3799999952316284d);
        if (layoutParams.height != iY0) {
            layoutParams.height = iY0;
            this.f129b.setLayoutParams(layoutParams);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (((double) View.MeasureSpec.getSize(i)) * 1.33d), View.MeasureSpec.getMode(i2)));
    }

    public UnDoLikedUserItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public UnDoLikedUserItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
