package com.p051p1.mobile.putong.live.livingroom.common.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import p151v.VDraweeView;
import p151v.VFrame;
import p153l.bnl0;
import p153l.izs;
import p153l.xe3;

/* JADX INFO: loaded from: classes4.dex */
public class BottomVoicePlayItemView extends LinearLayout implements RedDot {

    /* JADX INFO: renamed from: a */
    public VFrame f49348a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f49349b;

    /* JADX INFO: renamed from: c */
    public View f49350c;

    /* JADX INFO: renamed from: d */
    public TextView f49351d;

    /* JADX INFO: renamed from: e */
    public TextView f49352e;

    /* JADX INFO: renamed from: f */
    public int f49353f;

    public BottomVoicePlayItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m73329a(View view) {
        xe3.m210556a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m73330b(int i) {
        TextView textView = this.f49351d;
        if (i > 0) {
            bnl0.m105524M(textView, true);
            this.f49351d.setText(i > 99 ? "99+" : String.valueOf(i));
            bnl0.m105524M(this.f49350c, false);
        } else {
            bnl0.m105524M(textView, false);
        }
        bnl0.m105524M(this.f49350c, false);
        this.f49353f = i;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: g0 */
    public void mo73321g0(boolean z) {
        bnl0.m105524M(this.f49350c, z);
        TextView textView = this.f49351d;
        if (z) {
            bnl0.m105524M(textView, false);
        } else {
            bnl0.m105524M(textView, this.f49353f > 0);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73329a(this);
    }

    public void setImageRes(@DrawableRes int i) {
        this.f49349b.setImageResource(i);
    }

    public void setImageUrl(String str) {
        izs.m142871v("context_livingAct", this.f49349b, str, 0, 0, false, true, false, null);
    }

    public void setText(CharSequence charSequence) {
        this.f49352e.setText(charSequence);
    }

    public BottomVoicePlayItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BottomVoicePlayItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
