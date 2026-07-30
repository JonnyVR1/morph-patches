package com.p000p1.mobile.putong.live.livingroom.common.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.view.BottomViewGroup;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import l.xdl0;
import p002l.hvg0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class SummonFansItemView extends LinearLayout implements RedDot {

    /* JADX INFO: renamed from: a */
    public BottomViewGroup f4584a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f4585b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f4586c;

    /* JADX INFO: renamed from: d */
    public View f4587d;

    /* JADX INFO: renamed from: e */
    public TextView f4588e;

    /* JADX INFO: renamed from: f */
    public VText f4589f;

    /* JADX INFO: renamed from: g */
    public TextView f4590g;

    /* JADX INFO: renamed from: h */
    public int f4591h;

    public SummonFansItemView(Context context) {
        super(context);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: O */
    public void mo5613O(boolean z) {
        AnimEffectPlayer animEffectPlayer = this.f4585b;
        if (z) {
            animEffectPlayer.j("live_bottom_dialog_btn_show_strong.svga", -1);
        } else {
            animEffectPlayer.n();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5667a(View view) {
        hvg0.m14835a(this, view);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: g0 */
    public void mo5611g0(boolean z) {
        xdl0.M(this.f4587d, z);
        TextView textView = this.f4588e;
        if (z) {
            xdl0.M(textView, false);
        } else {
            xdl0.M(textView, this.f4591h > 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4585b.n();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5667a(this);
        this.f4584a.f4778a = 0.84615386f;
    }

    public SummonFansItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SummonFansItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
