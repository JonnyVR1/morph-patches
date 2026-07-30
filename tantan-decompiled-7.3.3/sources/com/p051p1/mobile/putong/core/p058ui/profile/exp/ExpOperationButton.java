package com.p051p1.mobile.putong.core.p058ui.profile.exp;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.p058ui.vip.widget.LetterRemainingSwitcherView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.dbc0;
import p153l.lyh0;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class ExpOperationButton extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VImage f34006a;

    /* JADX INFO: renamed from: b */
    public VText f34007b;

    /* JADX INFO: renamed from: c */
    public VImage f34008c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f34009d;

    /* JADX INFO: renamed from: e */
    public LetterRemainingSwitcherView f34010e;

    public ExpOperationButton(@NonNull Context context) {
        super(context);
        m52137a();
    }

    /* JADX INFO: renamed from: a */
    public final void m52137a() {
        VImage vImage = new VImage(getContext());
        this.f34008c = vImage;
        int i = bnl0.f77544e;
        addView(vImage, i, i);
        this.f34008c.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.f34008c.setImageDrawable(getResources().getDrawable(dbc0.f86136F));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f34009d = linearLayout;
        linearLayout.setOrientation(0);
        this.f34006a = new VImage(getContext());
        int i2 = qa00.f156332s;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        layoutParams.rightMargin = qa00.f156318e;
        layoutParams.gravity = 16;
        this.f34009d.addView(this.f34006a, layoutParams);
        VText vText = new VText(getContext());
        this.f34007b = vText;
        vText.setTypeface(lyh0.m156283c(3), 1);
        this.f34007b.setGravity(17);
        this.f34007b.setTextSize(1, 14.0f);
        this.f34009d.addView(this.f34007b, bnl0.f77545f, bnl0.f77544e);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(bnl0.f77545f, bnl0.f77544e);
        layoutParams2.gravity = 17;
        addView(this.f34009d, layoutParams2);
    }

    public void setGray(boolean z) {
        this.f34006a.setAlpha(z ? 0.3f : 1.0f);
        this.f34007b.setAlpha(z ? 0.3f : 1.0f);
        LetterRemainingSwitcherView letterRemainingSwitcherView = this.f34010e;
        if (letterRemainingSwitcherView != null) {
            letterRemainingSwitcherView.setAlpha(z ? 0.3f : 1.0f);
        }
    }

    public void setTextSwitchMode(boolean z) {
        if (z) {
            if (this.f34010e != null) {
                return;
            }
            this.f34010e = new LetterRemainingSwitcherView(getContext());
            bnl0.m105524M(this.f34007b, false);
            this.f34009d.addView(this.f34010e, bnl0.f77545f, bnl0.f77544e);
            return;
        }
        bnl0.m105524M(this.f34007b, true);
        LetterRemainingSwitcherView letterRemainingSwitcherView = this.f34010e;
        if (letterRemainingSwitcherView != null) {
            bnl0.m105524M(letterRemainingSwitcherView, false);
        }
    }

    public void setTextureImageVisible(boolean z) {
        bnl0.m105524M(this.f34008c, z);
    }

    public ExpOperationButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m52137a();
    }

    public ExpOperationButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m52137a();
    }
}
