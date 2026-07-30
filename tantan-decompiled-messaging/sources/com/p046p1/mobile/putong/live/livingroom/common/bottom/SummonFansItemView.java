package com.p046p1.mobile.putong.live.livingroom.common.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.view.BottomViewGroup;
import p147v.VDraweeView;
import p147v.VText;
import p149l.hvg0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class SummonFansItemView extends LinearLayout implements RedDot {

    /* JADX INFO: renamed from: a */
    public BottomViewGroup f48542a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f48543b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f48544c;

    /* JADX INFO: renamed from: d */
    public View f48545d;

    /* JADX INFO: renamed from: e */
    public TextView f48546e;

    /* JADX INFO: renamed from: f */
    public VText f48547f;

    /* JADX INFO: renamed from: g */
    public TextView f48548g;

    /* JADX INFO: renamed from: h */
    public int f48549h;

    public SummonFansItemView(Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: O */
    public void mo72140O(boolean z) {
        AnimEffectPlayer animEffectPlayer = this.f48543b;
        if (z) {
            animEffectPlayer.m68500j("live_bottom_dialog_btn_show_strong.svga", -1);
        } else {
            animEffectPlayer.m68504n();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m72194a(View view) {
        hvg0.m133167a(this, view);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: g0 */
    public void mo72138g0(boolean z) {
        xdl0.m208344M(this.f48545d, z);
        TextView textView = this.f48546e;
        if (z) {
            xdl0.m208344M(textView, false);
        } else {
            xdl0.m208344M(textView, this.f48549h > 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f48543b.m68504n();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72194a(this);
        this.f48542a.f48736a = 0.84615386f;
    }

    public SummonFansItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SummonFansItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
