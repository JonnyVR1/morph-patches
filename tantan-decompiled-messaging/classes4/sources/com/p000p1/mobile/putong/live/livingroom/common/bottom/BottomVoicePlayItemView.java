package com.p000p1.mobile.putong.live.livingroom.common.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import l.hxs;
import l.xdl0;
import l.ym2;
import p002l.ie3;
import v.VDraweeView;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class BottomVoicePlayItemView extends LinearLayout implements RedDot {

    /* JADX INFO: renamed from: a */
    public VFrame f4542a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f4543b;

    /* JADX INFO: renamed from: c */
    public View f4544c;

    /* JADX INFO: renamed from: d */
    public TextView f4545d;

    /* JADX INFO: renamed from: e */
    public TextView f4546e;

    /* JADX INFO: renamed from: f */
    public int f4547f;

    public BottomVoicePlayItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m5619a(View view) {
        ie3.m15099a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m5620b(int i) {
        TextView textView = this.f4545d;
        if (i > 0) {
            xdl0.M(textView, true);
            this.f4545d.setText(i > 99 ? "99+" : String.valueOf(i));
            xdl0.M(this.f4544c, false);
        } else {
            xdl0.M(textView, false);
        }
        xdl0.M(this.f4544c, false);
        this.f4547f = i;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: g0 */
    public void mo5611g0(boolean z) {
        xdl0.M(this.f4544c, z);
        TextView textView = this.f4545d;
        if (z) {
            xdl0.M(textView, false);
        } else {
            xdl0.M(textView, this.f4547f > 0);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5619a(this);
    }

    public void setImageRes(@DrawableRes int i) {
        this.f4543b.setImageResource(i);
    }

    public void setImageUrl(String str) {
        hxs.v("context_livingAct", this.f4543b, str, 0, 0, false, true, false, (ym2) null);
    }

    public void setText(CharSequence charSequence) {
        this.f4546e.setText(charSequence);
    }

    public BottomVoicePlayItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BottomVoicePlayItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
