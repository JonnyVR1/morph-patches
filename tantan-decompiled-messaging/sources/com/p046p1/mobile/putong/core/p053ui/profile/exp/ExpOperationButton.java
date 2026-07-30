package com.p046p1.mobile.putong.core.p053ui.profile.exp;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.p053ui.vip.widget.LetterRemainingSwitcherView;
import p147v.VImage;
import p147v.VText;
import p149l.eqh0;
import p149l.t100;
import p149l.x2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class ExpOperationButton extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VImage f33158a;

    /* JADX INFO: renamed from: b */
    public VText f33159b;

    /* JADX INFO: renamed from: c */
    public VImage f33160c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f33161d;

    /* JADX INFO: renamed from: e */
    public LetterRemainingSwitcherView f33162e;

    public ExpOperationButton(@NonNull Context context) {
        super(context);
        m50954a();
    }

    /* JADX INFO: renamed from: a */
    public final void m50954a() {
        VImage vImage = new VImage(getContext());
        this.f33160c = vImage;
        int i = xdl0.f192403e;
        addView(vImage, i, i);
        this.f33160c.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f33160c.setImageDrawable(getResources().getDrawable(x2c0.f189281E));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f33161d = linearLayout;
        linearLayout.setOrientation(0);
        this.f33158a = new VImage(getContext());
        int i2 = t100.f167270s;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        layoutParams.rightMargin = t100.f167256e;
        layoutParams.gravity = 16;
        this.f33161d.addView(this.f33158a, layoutParams);
        VText vText = new VText(getContext());
        this.f33159b = vText;
        vText.setTypeface(eqh0.m117752c(3), 1);
        this.f33159b.setGravity(17);
        this.f33159b.setTextSize(1, 14.0f);
        this.f33161d.addView(this.f33159b, xdl0.f192404f, xdl0.f192403e);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(xdl0.f192404f, xdl0.f192403e);
        layoutParams2.gravity = 17;
        addView(this.f33161d, layoutParams2);
    }

    public void setGray(boolean z) {
        this.f33158a.setAlpha(z ? 0.3f : 1.0f);
        this.f33159b.setAlpha(z ? 0.3f : 1.0f);
        LetterRemainingSwitcherView letterRemainingSwitcherView = this.f33162e;
        if (letterRemainingSwitcherView != null) {
            letterRemainingSwitcherView.setAlpha(z ? 0.3f : 1.0f);
        }
    }

    public void setTextSwitchMode(boolean z) {
        if (z) {
            if (this.f33162e != null) {
                return;
            }
            this.f33162e = new LetterRemainingSwitcherView(getContext());
            xdl0.m208344M(this.f33159b, false);
            this.f33161d.addView(this.f33162e, xdl0.f192404f, xdl0.f192403e);
            return;
        }
        xdl0.m208344M(this.f33159b, true);
        LetterRemainingSwitcherView letterRemainingSwitcherView = this.f33162e;
        if (letterRemainingSwitcherView != null) {
            xdl0.m208344M(letterRemainingSwitcherView, false);
        }
    }

    public void setTextureImageVisible(boolean z) {
        xdl0.m208344M(this.f33160c, z);
    }

    public ExpOperationButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m50954a();
    }

    public ExpOperationButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m50954a();
    }
}
