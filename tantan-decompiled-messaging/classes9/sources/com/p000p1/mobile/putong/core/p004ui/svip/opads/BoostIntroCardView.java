package com.p000p1.mobile.putong.core.p004ui.svip.opads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p000p1.mobile.putong.core.CoreModule;
import java.util.Objects;
import l.e30;
import l.t100;
import l.t83;
import l.x6y;
import v.VFrame;
import v.VFrame_FixRatio;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class BoostIntroCardView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VFrame_FixRatio f6290a;

    /* JADX INFO: renamed from: b */
    public VImage f6291b;

    /* JADX INFO: renamed from: c */
    public VText f6292c;

    /* JADX INFO: renamed from: d */
    public VText f6293d;

    /* JADX INFO: renamed from: e */
    public VText f6294e;

    /* JADX INFO: renamed from: f */
    public VText f6295f;

    /* JADX INFO: renamed from: g */
    public VText f6296g;

    public BoostIntroCardView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m9246p(this);
        this.f6290a.a = 1.38f;
    }

    /* JADX INFO: renamed from: p */
    public final void m9246p(View view) {
        t83.a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m9247s(e30<View> e30Var, e30<View> e30Var2) {
        CoreModule.f1534c.f3628e0.m21490p9();
        VText vText = this.f6294e;
        Objects.requireNonNull(e30Var);
        vText.setOnClickListener(new x6y(e30Var));
        VText vText2 = this.f6295f;
        Objects.requireNonNull(e30Var2);
        vText2.setOnClickListener(new x6y(e30Var2));
        boolean zM5552w6 = CoreModule.m1854P().m11706a().m5552w6();
        VImage vImage = this.f6291b;
        if (!zM5552w6) {
            vImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) vImage.getLayoutParams();
        layoutParams.height = t100.d(140.0f);
        this.f6291b.setLayoutParams(layoutParams);
        this.f6291b.setScaleType(ImageView.ScaleType.MATRIX);
    }

    public BoostIntroCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BoostIntroCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
