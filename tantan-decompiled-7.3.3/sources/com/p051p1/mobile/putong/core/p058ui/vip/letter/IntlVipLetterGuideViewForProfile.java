package com.p051p1.mobile.putong.core.p058ui.vip.letter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.p058ui.GradientBgButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p153l.pmp;

/* JADX INFO: loaded from: classes12.dex */
public class IntlVipLetterGuideViewForProfile extends VLinear {

    /* JADX INFO: renamed from: c */
    public Space f38074c;

    /* JADX INFO: renamed from: d */
    public VLinear f38075d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f38076e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f38077f;

    /* JADX INFO: renamed from: g */
    public TextView f38078g;

    /* JADX INFO: renamed from: h */
    public TextView f38079h;

    /* JADX INFO: renamed from: i */
    public TextView f38080i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f38081j;

    /* JADX INFO: renamed from: k */
    public GradientBgButton f38082k;

    /* JADX INFO: renamed from: l */
    public TextView f38083l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f38084m;

    /* JADX INFO: renamed from: n */
    public TextView f38085n;

    /* JADX INFO: renamed from: o */
    public TextView f38086o;

    /* JADX INFO: renamed from: p */
    public VImage f38087p;

    public IntlVipLetterGuideViewForProfile(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public final void m57724P(View view) {
        pmp.m172958a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57724P(this);
    }

    public IntlVipLetterGuideViewForProfile(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlVipLetterGuideViewForProfile(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
