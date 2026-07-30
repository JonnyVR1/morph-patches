package com.p046p1.mobile.putong.live.livingroom.common.bottom;

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
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.view.BottomViewGroup;
import p147v.VDraweeView;
import p147v.VText;
import p149l.hxs;
import p149l.t100;
import p149l.vb3;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class BottomItemView extends LinearLayout implements RedDot {

    /* JADX INFO: renamed from: a */
    public BottomViewGroup f48482a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f48483b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f48484c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f48485d;

    /* JADX INFO: renamed from: e */
    public View f48486e;

    /* JADX INFO: renamed from: f */
    public View f48487f;

    /* JADX INFO: renamed from: g */
    public View f48488g;

    /* JADX INFO: renamed from: h */
    public TextView f48489h;

    /* JADX INFO: renamed from: i */
    public VText f48490i;

    /* JADX INFO: renamed from: j */
    public int f48491j;

    /* JADX INFO: renamed from: k */
    public ObjectAnimator f48492k;

    public BottomItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    private void m72139b(boolean z, boolean z2) {
        ObjectAnimator objectAnimator = this.f48492k;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (!z2) {
            View view = this.f48487f;
            if (z) {
                view.setTranslationX(t100.m186890d(5.0f));
                return;
            } else {
                view.setTranslationX(0.0f);
                return;
            }
        }
        View view2 = this.f48487f;
        Property property = LinearLayout.TRANSLATION_X;
        if (z) {
            this.f48492k = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, 0.0f, t100.m186890d(5.0f));
        } else {
            this.f48492k = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, t100.m186890d(5.0f), 0.0f);
        }
        this.f48492k.start();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: O */
    public void mo72140O(boolean z) {
        AnimEffectPlayer animEffectPlayer = this.f48483b;
        if (z) {
            animEffectPlayer.m68500j("https://auto.tancdn.com/v1/raw/8e6f62a4-a452-403f-bc8b-c331b4bafc6411.pdf", -1);
        } else {
            animEffectPlayer.m68504n();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m72141a(View view) {
        vb3.m197666a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m72142c(boolean z, boolean z2) {
        this.f48486e.setSelected(z);
        this.f48487f.setSelected(z);
        m72139b(z, z2);
    }

    /* JADX INFO: renamed from: d */
    public void m72143d(int i) {
        if (i <= 0 || xdl0.m208349O0(this.f48488g)) {
            xdl0.m208344M(this.f48489h, false);
        } else {
            xdl0.m208344M(this.f48489h, true);
            this.f48489h.setText(i > 99 ? "99+" : String.valueOf(i));
        }
        this.f48491j = i;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: g0 */
    public void mo72138g0(boolean z) {
        xdl0.m208344M(this.f48488g, z);
        TextView textView = this.f48489h;
        if (z) {
            xdl0.m208344M(textView, false);
        } else {
            xdl0.m208344M(textView, this.f48491j > 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f48483b.m68504n();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72141a(this);
        this.f48482a.f48736a = 0.84615386f;
    }

    public void setImageRes(@DrawableRes int i) {
        this.f48484c.setImageResource(i);
    }

    public void setImageUrl(String str) {
        hxs.m133406s("context_livingAct", this.f48484c, str);
    }

    public void setText(CharSequence charSequence) {
        this.f48490i.setText(charSequence);
    }

    public BottomItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BottomItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
