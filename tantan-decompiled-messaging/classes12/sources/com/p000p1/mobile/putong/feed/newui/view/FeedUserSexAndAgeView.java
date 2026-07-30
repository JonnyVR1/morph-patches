package com.p000p1.mobile.putong.feed.newui.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p1.mobile.android.ui.label.CommonLabelView;
import com.p1.mobile.android.ui.label.LabelModule;
import com.p1.mobile.android.ui.label.LabelStyle;
import com.p1.mobile.putong.newui.label.CommonLabelTag;
import com.tantanapp.common.utils.NullChecker;
import l.q6r;
import l.s6r;
import l.t100;
import l.xdl0;
import p007l.a8i;
import p007l.b8i;
import p007l.c8i;
import p007l.d8i;
import p007l.e8i;
import p007l.f3c0;
import p007l.f8i;
import p007l.g8i;
import p007l.ijb0;
import p007l.k8i;
import p007l.l8i;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedUserSexAndAgeView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VLinear f4890a;

    /* JADX INFO: renamed from: b */
    public VImage f4891b;

    /* JADX INFO: renamed from: c */
    public VText f4892c;

    /* JADX INFO: renamed from: d */
    public CommonLabelView f4893d;

    /* JADX INFO: renamed from: e */
    public int f4894e;

    public FeedUserSexAndAgeView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m7537a(View view) {
        l8i.m11601a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m7538b(int i, User user) {
        k8i d8iVar;
        TextPaint paint = this.f4892c.getPaint();
        if (NullChecker.a(paint)) {
            paint.setFakeBoldText(true);
        }
        if (i == 0) {
            this.f4894e = (NullChecker.a(user) && user.isFemale()) ? f3c0.f7953y5 : f3c0.f7577B5;
            d8iVar = new g8i();
        } else if (i == 5) {
            this.f4894e = (NullChecker.a(user) && user.isFemale()) ? f3c0.f7953y5 : f3c0.f7577B5;
            d8iVar = new b8i();
        } else if (i == 1) {
            this.f4894e = (NullChecker.a(user) && user.isFemale()) ? f3c0.f7961z5 : f3c0.f7585C5;
            d8iVar = new a8i();
        } else if (i == 2) {
            this.f4894e = (NullChecker.a(user) && user.isFemale()) ? f3c0.f7953y5 : f3c0.f7577B5;
            d8iVar = new f8i();
        } else if (i == 3) {
            this.f4894e = (NullChecker.a(user) && user.isFemale()) ? f3c0.f7945x5 : f3c0.f7569A5;
            d8iVar = new c8i();
        } else if (i == 6) {
            this.f4894e = (NullChecker.a(user) && user.isFemale()) ? f3c0.f7945x5 : f3c0.f7569A5;
            d8iVar = new e8i();
        } else {
            this.f4894e = (NullChecker.a(user) && user.isFemale()) ? f3c0.f7945x5 : f3c0.f7569A5;
            d8iVar = new d8i();
        }
        d8iVar.mo8460a(this, user);
    }

    /* JADX INFO: renamed from: c */
    public final void m7539c(User user, int i) {
        LabelStyle labelStyle;
        LabelStyle labelStyle2 = LabelStyle.SMALL;
        if (i == 0 || i == 5) {
            labelStyle = LabelStyle.MIDDLE;
        } else if (i == 1) {
            labelStyle = LabelStyle.MAX;
        } else if (i == 2) {
            labelStyle = LabelStyle.MIDDLE;
        } else {
            labelStyle = (i != 3 && i == 6) ? LabelStyle.SMALL : LabelStyle.SMALL;
        }
        this.f4893d.setSizeStyle(labelStyle);
        q6r q6rVarC = s6r.a().c(LabelModule.COMMON, user.isFemale() ? CommonLabelTag.SEX_AGE_FEMALE : CommonLabelTag.SEX_AGE_MALE);
        q6rVarC.g(ijb0.m10935v(user) ? "" : String.valueOf(user.age));
        this.f4893d.g(q6rVarC);
    }

    /* JADX INFO: renamed from: d */
    public void m7540d(User user, int i, int i2) {
        if (FeedModule.m1140H().I4()) {
            m7539c(user, i2);
            return;
        }
        m7538b(i2, user);
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (FeedModule.m1140H().Ic() && (i2 == 5 || i2 == 1)) {
            gradientDrawable.setColor(Color.parseColor("#33FFFFFF"));
        } else {
            gradientDrawable.setColor(Color.parseColor((NullChecker.a(user) && user.isFemale()) ? "#FF89E5" : "#FF2BCCFF"));
        }
        gradientDrawable.setCornerRadius(t100.d(i));
        this.f4890a.setBackground(gradientDrawable);
        this.f4891b.setImageResource(this.f4894e);
        boolean zM10935v = ijb0.m10935v(user);
        VText vText = this.f4892c;
        if (zM10935v) {
            xdl0.M(vText, false);
        } else {
            xdl0.M(vText, true);
            this.f4892c.setText(String.valueOf(user.age));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7537a(this);
        if (FeedModule.m1140H().I4()) {
            xdl0.M(this.f4890a, false);
            xdl0.M(this.f4893d, true);
        }
    }

    public FeedUserSexAndAgeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedUserSexAndAgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
