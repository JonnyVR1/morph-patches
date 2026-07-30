package com.p051p1.mobile.putong.live.livingroom.common.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.view.BottomViewGroup;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.p3h0;

/* JADX INFO: loaded from: classes4.dex */
public class SummonFansItemView extends LinearLayout implements RedDot {

    /* JADX INFO: renamed from: a */
    public BottomViewGroup f49390a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f49391b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f49392c;

    /* JADX INFO: renamed from: d */
    public View f49393d;

    /* JADX INFO: renamed from: e */
    public TextView f49394e;

    /* JADX INFO: renamed from: f */
    public VText f49395f;

    /* JADX INFO: renamed from: g */
    public TextView f49396g;

    /* JADX INFO: renamed from: h */
    public int f49397h;

    public SummonFansItemView(Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: O */
    public void mo73323O(boolean z) {
        AnimEffectPlayer animEffectPlayer = this.f49391b;
        if (z) {
            animEffectPlayer.m69683j("live_bottom_dialog_btn_show_strong.svga", -1);
        } else {
            animEffectPlayer.m69687n();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m73377a(View view) {
        p3h0.m170492a(this, view);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: g0 */
    public void mo73321g0(boolean z) {
        bnl0.m105524M(this.f49393d, z);
        TextView textView = this.f49394e;
        if (z) {
            bnl0.m105524M(textView, false);
        } else {
            bnl0.m105524M(textView, this.f49397h > 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f49391b.m69687n();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73377a(this);
        this.f49390a.f49584a = 0.84615386f;
    }

    public SummonFansItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SummonFansItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
