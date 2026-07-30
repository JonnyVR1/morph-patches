package com.p000p1.mobile.putong.core.p004ui.vip.letter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.core.ui.GradientBgButton;
import l.pkp;
import v.VDraweeView;
import v.VImage;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class IntlVipLetterGuideViewForProfile extends VLinear {

    /* JADX INFO: renamed from: c */
    public Space f7007c;

    /* JADX INFO: renamed from: d */
    public VLinear f7008d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f7009e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f7010f;

    /* JADX INFO: renamed from: g */
    public TextView f7011g;

    /* JADX INFO: renamed from: h */
    public TextView f7012h;

    /* JADX INFO: renamed from: i */
    public TextView f7013i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f7014j;

    /* JADX INFO: renamed from: k */
    public GradientBgButton f7015k;

    /* JADX INFO: renamed from: l */
    public TextView f7016l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f7017m;

    /* JADX INFO: renamed from: n */
    public TextView f7018n;

    /* JADX INFO: renamed from: o */
    public TextView f7019o;

    /* JADX INFO: renamed from: p */
    public VImage f7020p;

    public IntlVipLetterGuideViewForProfile(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m9983P(View view) {
        pkp.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m9983P(this);
    }

    public IntlVipLetterGuideViewForProfile(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlVipLetterGuideViewForProfile(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
