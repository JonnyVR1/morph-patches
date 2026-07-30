package com.p000p1.mobile.putong.live.livingroom.common.bottom;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.view.BottomViewGroup;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import l.hxs;
import l.t100;
import l.xdl0;
import p002l.vb3;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class BottomItemView extends LinearLayout implements RedDot {

    /* JADX INFO: renamed from: a */
    public BottomViewGroup f4524a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f4525b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f4526c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f4527d;

    /* JADX INFO: renamed from: e */
    public View f4528e;

    /* JADX INFO: renamed from: f */
    public View f4529f;

    /* JADX INFO: renamed from: g */
    public View f4530g;

    /* JADX INFO: renamed from: h */
    public TextView f4531h;

    /* JADX INFO: renamed from: i */
    public VText f4532i;

    /* JADX INFO: renamed from: j */
    public int f4533j;

    /* JADX INFO: renamed from: k */
    public ObjectAnimator f4534k;

    public BottomItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    private void m5612b(boolean z, boolean z2) {
        ObjectAnimator objectAnimator = this.f4534k;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (!z2) {
            View view = this.f4529f;
            if (z) {
                view.setTranslationX(t100.d(5.0f));
                return;
            } else {
                view.setTranslationX(0.0f);
                return;
            }
        }
        View view2 = this.f4529f;
        Property property = LinearLayout.TRANSLATION_X;
        if (z) {
            this.f4534k = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, 0.0f, t100.d(5.0f));
        } else {
            this.f4534k = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, t100.d(5.0f), 0.0f);
        }
        this.f4534k.start();
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: O */
    public void mo5613O(boolean z) {
        AnimEffectPlayer animEffectPlayer = this.f4525b;
        if (z) {
            animEffectPlayer.j("https://auto.tancdn.com/v1/raw/8e6f62a4-a452-403f-bc8b-c331b4bafc6411.pdf", -1);
        } else {
            animEffectPlayer.n();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5614a(View view) {
        vb3.m23811a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m5615c(boolean z, boolean z2) {
        this.f4528e.setSelected(z);
        this.f4529f.setSelected(z);
        m5612b(z, z2);
    }

    /* JADX INFO: renamed from: d */
    public void m5616d(int i) {
        if (i <= 0 || xdl0.O0(this.f4530g)) {
            xdl0.M(this.f4531h, false);
        } else {
            xdl0.M(this.f4531h, true);
            this.f4531h.setText(i > 99 ? "99+" : String.valueOf(i));
        }
        this.f4533j = i;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: g0 */
    public void mo5611g0(boolean z) {
        xdl0.M(this.f4530g, z);
        TextView textView = this.f4531h;
        if (z) {
            xdl0.M(textView, false);
        } else {
            xdl0.M(textView, this.f4533j > 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4525b.n();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5614a(this);
        this.f4524a.f4778a = 0.84615386f;
    }

    public void setImageRes(@DrawableRes int i) {
        this.f4526c.setImageResource(i);
    }

    public void setImageUrl(String str) {
        hxs.s("context_livingAct", this.f4526c, str);
    }

    public void setText(CharSequence charSequence) {
        this.f4532i.setText(charSequence);
    }

    public BottomItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BottomItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
