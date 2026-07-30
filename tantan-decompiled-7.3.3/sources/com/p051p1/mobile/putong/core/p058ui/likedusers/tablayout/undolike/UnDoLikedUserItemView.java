package com.p051p1.mobile.putong.core.p058ui.likedusers.tablayout.undolike;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.data.DislikedUsers;
import com.p051p1.mobile.putong.data.User;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.gbc0;
import p153l.ive0;
import p153l.lyh0;
import p153l.psj0;
import p153l.pzi0;
import p153l.qa00;
import p153l.tzi0;
import p153l.uqb0;
import p153l.x20;

/* JADX INFO: loaded from: classes3.dex */
public class UnDoLikedUserItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f30867a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f30868b;

    /* JADX INFO: renamed from: c */
    public VText f30869c;

    /* JADX INFO: renamed from: d */
    public VText f30870d;

    /* JADX INFO: renamed from: e */
    public VImage f30871e;

    /* JADX INFO: renamed from: f */
    public VText f30872f;

    /* JADX INFO: renamed from: g */
    public View f30873g;

    /* JADX INFO: renamed from: h */
    public DislikedUsers f30874h;

    public UnDoLikedUserItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public static String m48017e(int i) {
        if (i <= 100 || i < 1000) {
            return "1km";
        }
        if (i >= 100000) {
            return "99+km";
        }
        return (i / 1000) + "km";
    }

    /* JADX INFO: renamed from: c */
    public final void m48018c(View view) {
        psj0.m173658a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public Act m48019d() {
        return (Act) bnl0.m105506D(getContext());
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m48020f(x20 x20Var, View view) {
        if (m48019d().lifecycle_() != C4470c.f16267i) {
            return;
        }
        x20Var.call();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m48021g(x20 x20Var, View view) {
        if (m48019d().lifecycle_() != C4470c.f16267i) {
            return;
        }
        x20Var.call();
    }

    /* JADX INFO: renamed from: h */
    public void m48022h(DislikedUsers dislikedUsers, boolean z, final x20 x20Var, final x20 x20Var2) {
        this.f30874h = dislikedUsers;
        User user = dislikedUsers.userInfo;
        setVisibility(0);
        bnl0.m105524M(this.f30873g, z);
        bnl0.m105522L(this.f30867a, new View.OnClickListener() { // from class: l.nsj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f143510a.m48020f(x20Var2, view);
            }
        });
        bnl0.m105522L(this.f30871e, new View.OnClickListener() { // from class: l.osj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f148880a.m48021g(x20Var, view);
            }
        });
        uqb0.f180374G.m127119N0(this.f30867a, user.m61308fp().profileMiddle().formatted(), false);
        StringBuilder sb = new StringBuilder(String.valueOf(user.age));
        if (ive0.m142291e()) {
            sb.append("岁");
        }
        if (!user.isHideLocationFromSVip() && user.location.distance < 10000) {
            sb.append(", ");
            sb.append(m48017e(user.location.distance));
        }
        if (user.isHideActiveFromSVip() || pzi0.m174454o() - Math.round(user.location.updatedTime) > 180000) {
            bnl0.m105525M0(this.f30869c, false);
        } else {
            bnl0.m105525M0(this.f30869c, true);
        }
        this.f30870d.setText(sb);
        this.f30871e.setImageResource(gbc0.f103374p0);
        this.f30868b.setBackground(getResources().getDrawable(gbc0.f103382q0));
        m48023i(user);
    }

    /* JADX INFO: renamed from: i */
    public final void m48023i(User user) {
        this.f30872f.setTypeface(lyh0.m156283c(2), 1);
        boolean zM193670h = tzi0.m193670h(pzi0.m174454o(), Math.round(user.createdTime), 7);
        VText vText = this.f30872f;
        if (zM193670h) {
            bnl0.m105524M(vText, false);
        } else {
            bnl0.m105524M(vText, true);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48018c(this);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f30868b.getLayoutParams();
        int iM105592y0 = (int) (((double) ((bnl0.m105592y0() / 2) - qa00.f156323j)) * 1.33d * 0.3799999952316284d);
        if (layoutParams.height != iM105592y0) {
            layoutParams.height = iM105592y0;
            this.f30868b.setLayoutParams(layoutParams);
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
