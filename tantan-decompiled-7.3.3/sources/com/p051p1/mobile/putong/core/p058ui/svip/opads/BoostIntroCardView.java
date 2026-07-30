package com.p051p1.mobile.putong.core.p058ui.svip.opads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p051p1.mobile.putong.core.CoreModule;
import java.util.Objects;
import p151v.VFrame;
import p151v.VFrame_FixRatio;
import p151v.VImage;
import p151v.VText;
import p153l.i93;
import p153l.qa00;
import p153l.ufy;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class BoostIntroCardView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VFrame_FixRatio f37357a;

    /* JADX INFO: renamed from: b */
    public VImage f37358b;

    /* JADX INFO: renamed from: c */
    public VText f37359c;

    /* JADX INFO: renamed from: d */
    public VText f37360d;

    /* JADX INFO: renamed from: e */
    public VText f37361e;

    /* JADX INFO: renamed from: f */
    public VText f37362f;

    /* JADX INFO: renamed from: g */
    public VText f37363g;

    public BoostIntroCardView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57031p(this);
        this.f37357a.f210016a = 1.38f;
    }

    /* JADX INFO: renamed from: p */
    public final void m57031p(View view) {
        i93.m139065a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m57032s(y20<View> y20Var, y20<View> y20Var2) {
        CoreModule.f18264c.f20381e0.m116600p9();
        VText vText = this.f37361e;
        Objects.requireNonNull(y20Var);
        vText.setOnClickListener(new ufy(y20Var));
        VText vText2 = this.f37362f;
        Objects.requireNonNull(y20Var2);
        vText2.setOnClickListener(new ufy(y20Var2));
        boolean zMo34618w6 = CoreModule.m30933P().m143405a().mo34618w6();
        VImage vImage = this.f37358b;
        if (!zMo34618w6) {
            vImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) vImage.getLayoutParams();
        layoutParams.height = qa00.m175859d(140.0f);
        this.f37358b.setLayoutParams(layoutParams);
        this.f37358b.setScaleType(ImageView.ScaleType.MATRIX);
    }

    public BoostIntroCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BoostIntroCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
