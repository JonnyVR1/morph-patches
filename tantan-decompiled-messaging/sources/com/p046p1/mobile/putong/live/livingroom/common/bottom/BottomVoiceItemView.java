package com.p046p1.mobile.putong.live.livingroom.common.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import p147v.VDraweeView;
import p149l.he3;
import p149l.hxs;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class BottomVoiceItemView extends LinearLayout implements RedDot {

    /* JADX INFO: renamed from: a */
    public FrameLayout f48494a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f48495b;

    /* JADX INFO: renamed from: c */
    public View f48496c;

    /* JADX INFO: renamed from: d */
    public TextView f48497d;

    /* JADX INFO: renamed from: e */
    public TextView f48498e;

    /* JADX INFO: renamed from: f */
    public int f48499f;

    public BottomVoiceItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m72144a(View view) {
        he3.m130618a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m72145b(int i) {
        TextView textView = this.f48497d;
        if (i > 0) {
            xdl0.m208344M(textView, true);
            this.f48497d.setText(i > 99 ? "99+" : String.valueOf(i));
        } else {
            xdl0.m208344M(textView, false);
        }
        xdl0.m208344M(this.f48496c, false);
        this.f48499f = i;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: g0 */
    public void mo72138g0(boolean z) {
        xdl0.m208344M(this.f48496c, z);
        TextView textView = this.f48497d;
        if (z) {
            xdl0.m208344M(textView, false);
        } else {
            xdl0.m208344M(textView, this.f48499f > 0);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72144a(this);
    }

    public void setImageRes(@DrawableRes int i) {
        this.f48495b.setImageResource(i);
    }

    public void setImageUrl(String str) {
        hxs.m133409v("context_livingAct", this.f48495b, str, 0, 0, false, true, false, null);
    }

    public void setText(CharSequence charSequence) {
        this.f48498e.setText(charSequence);
    }

    public BottomVoiceItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BottomVoiceItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
