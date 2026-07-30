package com.p000p1.mobile.putong.live.livingroom.common.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import l.hxs;
import l.xdl0;
import l.ym2;
import p002l.he3;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class BottomVoiceItemView extends LinearLayout implements RedDot {

    /* JADX INFO: renamed from: a */
    public FrameLayout f4536a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f4537b;

    /* JADX INFO: renamed from: c */
    public View f4538c;

    /* JADX INFO: renamed from: d */
    public TextView f4539d;

    /* JADX INFO: renamed from: e */
    public TextView f4540e;

    /* JADX INFO: renamed from: f */
    public int f4541f;

    public BottomVoiceItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m5617a(View view) {
        he3.m14344a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m5618b(int i) {
        TextView textView = this.f4539d;
        if (i > 0) {
            xdl0.M(textView, true);
            this.f4539d.setText(i > 99 ? "99+" : String.valueOf(i));
        } else {
            xdl0.M(textView, false);
        }
        xdl0.M(this.f4538c, false);
        this.f4541f = i;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: g0 */
    public void mo5611g0(boolean z) {
        xdl0.M(this.f4538c, z);
        TextView textView = this.f4539d;
        if (z) {
            xdl0.M(textView, false);
        } else {
            xdl0.M(textView, this.f4541f > 0);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5617a(this);
    }

    public void setImageRes(@DrawableRes int i) {
        this.f4537b.setImageResource(i);
    }

    public void setImageUrl(String str) {
        hxs.v("context_livingAct", this.f4537b, str, 0, 0, false, true, false, (ym2) null);
    }

    public void setText(CharSequence charSequence) {
        this.f4540e.setText(charSequence);
    }

    public BottomVoiceItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BottomVoiceItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
