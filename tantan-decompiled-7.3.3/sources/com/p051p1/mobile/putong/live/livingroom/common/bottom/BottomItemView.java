package com.p051p1.mobile.putong.live.livingroom.common.bottom;

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
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.view.BottomViewGroup;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.izs;
import p153l.kc3;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class BottomItemView extends LinearLayout implements RedDot {

    /* JADX INFO: renamed from: a */
    public BottomViewGroup f49330a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f49331b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f49332c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f49333d;

    /* JADX INFO: renamed from: e */
    public View f49334e;

    /* JADX INFO: renamed from: f */
    public View f49335f;

    /* JADX INFO: renamed from: g */
    public View f49336g;

    /* JADX INFO: renamed from: h */
    public TextView f49337h;

    /* JADX INFO: renamed from: i */
    public VText f49338i;

    /* JADX INFO: renamed from: j */
    public int f49339j;

    /* JADX INFO: renamed from: k */
    public ObjectAnimator f49340k;

    public BottomItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    private void m73322b(boolean z, boolean z2) {
        ObjectAnimator objectAnimator = this.f49340k;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (!z2) {
            View view = this.f49335f;
            if (z) {
                view.setTranslationX(qa00.m175859d(5.0f));
                return;
            } else {
                view.setTranslationX(0.0f);
                return;
            }
        }
        View view2 = this.f49335f;
        Property property = LinearLayout.TRANSLATION_X;
        if (z) {
            this.f49340k = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, 0.0f, qa00.m175859d(5.0f));
        } else {
            this.f49340k = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, qa00.m175859d(5.0f), 0.0f);
        }
        this.f49340k.start();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: O */
    public void mo73323O(boolean z) {
        AnimEffectPlayer animEffectPlayer = this.f49331b;
        if (z) {
            animEffectPlayer.m69683j("https://auto.tancdn.com/v1/raw/8e6f62a4-a452-403f-bc8b-c331b4bafc6411.pdf", -1);
        } else {
            animEffectPlayer.m69687n();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m73324a(View view) {
        kc3.m149095a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m73325c(boolean z, boolean z2) {
        this.f49334e.setSelected(z);
        this.f49335f.setSelected(z);
        m73322b(z, z2);
    }

    /* JADX INFO: renamed from: d */
    public void m73326d(int i) {
        if (i <= 0 || bnl0.m105529O0(this.f49336g)) {
            bnl0.m105524M(this.f49337h, false);
        } else {
            bnl0.m105524M(this.f49337h, true);
            this.f49337h.setText(i > 99 ? "99+" : String.valueOf(i));
        }
        this.f49339j = i;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: g0 */
    public void mo73321g0(boolean z) {
        bnl0.m105524M(this.f49336g, z);
        TextView textView = this.f49337h;
        if (z) {
            bnl0.m105524M(textView, false);
        } else {
            bnl0.m105524M(textView, this.f49339j > 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f49331b.m69687n();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73324a(this);
        this.f49330a.f49584a = 0.84615386f;
    }

    public void setImageRes(@DrawableRes int i) {
        this.f49332c.setImageResource(i);
    }

    public void setImageUrl(String str) {
        izs.m142868s("context_livingAct", this.f49332c, str);
    }

    public void setText(CharSequence charSequence) {
        this.f49338i.setText(charSequence);
    }

    public BottomItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BottomItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
