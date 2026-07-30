package com.p046p1.mobile.putong.live.livingroom.common.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import p147v.VDraweeView;
import p147v.VFrame;
import p149l.hxs;
import p149l.ie3;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class BottomVoicePlayItemView extends LinearLayout implements RedDot {

    /* JADX INFO: renamed from: a */
    public VFrame f48500a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f48501b;

    /* JADX INFO: renamed from: c */
    public View f48502c;

    /* JADX INFO: renamed from: d */
    public TextView f48503d;

    /* JADX INFO: renamed from: e */
    public TextView f48504e;

    /* JADX INFO: renamed from: f */
    public int f48505f;

    public BottomVoicePlayItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m72146a(View view) {
        ie3.m135656a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m72147b(int i) {
        TextView textView = this.f48503d;
        if (i > 0) {
            xdl0.m208344M(textView, true);
            this.f48503d.setText(i > 99 ? "99+" : String.valueOf(i));
            xdl0.m208344M(this.f48502c, false);
        } else {
            xdl0.m208344M(textView, false);
        }
        xdl0.m208344M(this.f48502c, false);
        this.f48505f = i;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: g0 */
    public void mo72138g0(boolean z) {
        xdl0.m208344M(this.f48502c, z);
        TextView textView = this.f48503d;
        if (z) {
            xdl0.m208344M(textView, false);
        } else {
            xdl0.m208344M(textView, this.f48505f > 0);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72146a(this);
    }

    public void setImageRes(@DrawableRes int i) {
        this.f48501b.setImageResource(i);
    }

    public void setImageUrl(String str) {
        hxs.m133409v("context_livingAct", this.f48501b, str, 0, 0, false, true, false, null);
    }

    public void setText(CharSequence charSequence) {
        this.f48504e.setText(charSequence);
    }

    public BottomVoicePlayItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BottomVoicePlayItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
