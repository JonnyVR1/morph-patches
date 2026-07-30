package com.p046p1.mobile.putong.core.p053ui.svip.opads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p046p1.mobile.putong.core.CoreModule;
import java.util.Objects;
import p147v.VFrame;
import p147v.VFrame_FixRatio;
import p147v.VImage;
import p147v.VText;
import p149l.e30;
import p149l.t100;
import p149l.t83;
import p149l.x6y;

/* JADX INFO: loaded from: classes9.dex */
public class BoostIntroCardView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VFrame_FixRatio f36509a;

    /* JADX INFO: renamed from: b */
    public VImage f36510b;

    /* JADX INFO: renamed from: c */
    public VText f36511c;

    /* JADX INFO: renamed from: d */
    public VText f36512d;

    /* JADX INFO: renamed from: e */
    public VText f36513e;

    /* JADX INFO: renamed from: f */
    public VText f36514f;

    /* JADX INFO: renamed from: g */
    public VText f36515g;

    public BoostIntroCardView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55848p(this);
        this.f36509a.f209094a = 1.38f;
    }

    /* JADX INFO: renamed from: p */
    public final void m55848p(View view) {
        t83.m187518a(this, view);
    }

    /* JADX INFO: renamed from: s */
    public void m55849s(e30<View> e30Var, e30<View> e30Var2) {
        CoreModule.f17545c.f19639e0.m169527p9();
        VText vText = this.f36513e;
        Objects.requireNonNull(e30Var);
        vText.setOnClickListener(new x6y(e30Var));
        VText vText2 = this.f36514f;
        Objects.requireNonNull(e30Var2);
        vText2.setOnClickListener(new x6y(e30Var2));
        boolean zMo33615w6 = CoreModule.m29935P().m94651a().mo33615w6();
        VImage vImage = this.f36510b;
        if (!zMo33615w6) {
            vImage.setScaleType(ImageView.ScaleType.CENTER_CROP);
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) vImage.getLayoutParams();
        layoutParams.height = t100.m186890d(140.0f);
        this.f36510b.setLayoutParams(layoutParams);
        this.f36510b.setScaleType(ImageView.ScaleType.MATRIX);
    }

    public BoostIntroCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BoostIntroCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
