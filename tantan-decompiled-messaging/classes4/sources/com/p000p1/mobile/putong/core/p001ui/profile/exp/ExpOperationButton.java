package com.p000p1.mobile.putong.core.p001ui.profile.exp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.ui.vip.widget.LetterRemainingSwitcherView;
import l.eqh0;
import l.t100;
import l.x2c0;
import l.xdl0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpOperationButton extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VImage f980a;

    /* JADX INFO: renamed from: b */
    public VText f981b;

    /* JADX INFO: renamed from: c */
    public VImage f982c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f983d;

    /* JADX INFO: renamed from: e */
    public LetterRemainingSwitcherView f984e;

    public ExpOperationButton(@NonNull Context context) {
        super(context);
        m1402a();
    }

    /* JADX INFO: renamed from: a */
    public final void m1402a() {
        View vImage = new VImage(getContext());
        this.f982c = vImage;
        int i = xdl0.e;
        addView(vImage, i, i);
        this.f982c.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f982c.setImageDrawable(getResources().getDrawable(x2c0.E));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f983d = linearLayout;
        linearLayout.setOrientation(0);
        this.f980a = new VImage(getContext());
        int i2 = t100.s;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        layoutParams.rightMargin = t100.e;
        layoutParams.gravity = 16;
        this.f983d.addView((View) this.f980a, (ViewGroup.LayoutParams) layoutParams);
        VText vText = new VText(getContext());
        this.f981b = vText;
        vText.setTypeface(eqh0.c(3), 1);
        this.f981b.setGravity(17);
        this.f981b.setTextSize(1, 14.0f);
        this.f983d.addView((View) this.f981b, xdl0.f, xdl0.e);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(xdl0.f, xdl0.e);
        layoutParams2.gravity = 17;
        addView(this.f983d, layoutParams2);
    }

    public void setGray(boolean z) {
        this.f980a.setAlpha(z ? 0.3f : 1.0f);
        this.f981b.setAlpha(z ? 0.3f : 1.0f);
        LetterRemainingSwitcherView letterRemainingSwitcherView = this.f984e;
        if (letterRemainingSwitcherView != null) {
            letterRemainingSwitcherView.setAlpha(z ? 0.3f : 1.0f);
        }
    }

    public void setTextSwitchMode(boolean z) {
        if (z) {
            if (this.f984e != null) {
                return;
            }
            this.f984e = new LetterRemainingSwitcherView(getContext());
            xdl0.M(this.f981b, false);
            this.f983d.addView((View) this.f984e, xdl0.f, xdl0.e);
            return;
        }
        xdl0.M(this.f981b, true);
        LetterRemainingSwitcherView letterRemainingSwitcherView = this.f984e;
        if (letterRemainingSwitcherView != null) {
            xdl0.M(letterRemainingSwitcherView, false);
        }
    }

    public void setTextureImageVisible(boolean z) {
        xdl0.M(this.f982c, z);
    }

    public ExpOperationButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m1402a();
    }

    public ExpOperationButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1402a();
    }
}
