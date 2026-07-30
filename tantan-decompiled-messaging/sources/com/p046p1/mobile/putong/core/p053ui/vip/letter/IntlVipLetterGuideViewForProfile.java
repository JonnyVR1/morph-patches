package com.p046p1.mobile.putong.core.p053ui.vip.letter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.p053ui.GradientBgButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p149l.pkp;

/* JADX INFO: loaded from: classes9.dex */
public class IntlVipLetterGuideViewForProfile extends VLinear {

    /* JADX INFO: renamed from: c */
    public Space f37226c;

    /* JADX INFO: renamed from: d */
    public VLinear f37227d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f37228e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f37229f;

    /* JADX INFO: renamed from: g */
    public TextView f37230g;

    /* JADX INFO: renamed from: h */
    public TextView f37231h;

    /* JADX INFO: renamed from: i */
    public TextView f37232i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f37233j;

    /* JADX INFO: renamed from: k */
    public GradientBgButton f37234k;

    /* JADX INFO: renamed from: l */
    public TextView f37235l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f37236m;

    /* JADX INFO: renamed from: n */
    public TextView f37237n;

    /* JADX INFO: renamed from: o */
    public TextView f37238o;

    /* JADX INFO: renamed from: p */
    public VImage f37239p;

    public IntlVipLetterGuideViewForProfile(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m56541P(View view) {
        pkp.m170053a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56541P(this);
    }

    public IntlVipLetterGuideViewForProfile(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlVipLetterGuideViewForProfile(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
