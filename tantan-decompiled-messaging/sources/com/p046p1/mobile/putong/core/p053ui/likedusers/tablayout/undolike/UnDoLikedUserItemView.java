package com.p046p1.mobile.putong.core.p053ui.likedusers.tablayout.undolike;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.data.DislikedUsers;
import com.p046p1.mobile.putong.data.User;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.b3c0;
import p149l.bne0;
import p149l.d30;
import p149l.eqh0;
import p149l.mjj0;
import p149l.mqi0;
import p149l.qib0;
import p149l.qqi0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class UnDoLikedUserItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f30019a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f30020b;

    /* JADX INFO: renamed from: c */
    public VText f30021c;

    /* JADX INFO: renamed from: d */
    public VText f30022d;

    /* JADX INFO: renamed from: e */
    public VImage f30023e;

    /* JADX INFO: renamed from: f */
    public VText f30024f;

    /* JADX INFO: renamed from: g */
    public View f30025g;

    /* JADX INFO: renamed from: h */
    public DislikedUsers f30026h;

    public UnDoLikedUserItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public static String m46834e(int i) {
        if (i <= 100 || i < 1000) {
            return "1km";
        }
        if (i >= 100000) {
            return "99+km";
        }
        return (i / 1000) + "km";
    }

    /* JADX INFO: renamed from: c */
    public final void m46835c(View view) {
        mjj0.m154845a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public Act m46836d() {
        return (Act) xdl0.m208326D(getContext());
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m46837f(d30 d30Var, View view) {
        if (m46836d().lifecycle_() != C4319c.f15548i) {
            return;
        }
        d30Var.call();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m46838g(d30 d30Var, View view) {
        if (m46836d().lifecycle_() != C4319c.f15548i) {
            return;
        }
        d30Var.call();
    }

    /* JADX INFO: renamed from: h */
    public void m46839h(DislikedUsers dislikedUsers, boolean z, final d30 d30Var, final d30 d30Var2) {
        this.f30026h = dislikedUsers;
        User user = dislikedUsers.userInfo;
        setVisibility(0);
        xdl0.m208344M(this.f30025g, z);
        xdl0.m208342L(this.f30019a, new View.OnClickListener() { // from class: l.kjj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f123455a.m46837f(d30Var2, view);
            }
        });
        xdl0.m208342L(this.f30023e, new View.OnClickListener() { // from class: l.ljj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f128333a.m46838g(d30Var, view);
            }
        });
        qib0.f154691G.m102335N0(this.f30019a, user.m60124fp().profileMiddle().formatted(), false);
        StringBuilder sb = new StringBuilder(String.valueOf(user.age));
        if (bne0.m102776e()) {
            sb.append("岁");
        }
        if (!user.isHideLocationFromSVip() && user.location.distance < 10000) {
            sb.append(", ");
            sb.append(m46834e(user.location.distance));
        }
        if (user.isHideActiveFromSVip() || mqi0.m155944o() - Math.round(user.location.updatedTime) > 180000) {
            xdl0.m208345M0(this.f30021c, false);
        } else {
            xdl0.m208345M0(this.f30021c, true);
        }
        this.f30022d.setText(sb);
        this.f30023e.setImageResource(b3c0.f73123p0);
        this.f30020b.setBackground(getResources().getDrawable(b3c0.f73131q0));
        m46840i(user);
    }

    /* JADX INFO: renamed from: i */
    public final void m46840i(User user) {
        this.f30024f.setTypeface(eqh0.m117752c(2), 1);
        boolean zM175940h = qqi0.m175940h(mqi0.m155944o(), Math.round(user.createdTime), 7);
        VText vText = this.f30024f;
        if (zM175940h) {
            xdl0.m208344M(vText, false);
        } else {
            xdl0.m208344M(vText, true);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46835c(this);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f30020b.getLayoutParams();
        int iM208412y0 = (int) (((double) ((xdl0.m208412y0() / 2) - t100.f167261j)) * 1.33d * 0.3799999952316284d);
        if (layoutParams.height != iM208412y0) {
            layoutParams.height = iM208412y0;
            this.f30020b.setLayoutParams(layoutParams);
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
