package com.p051p1.mobile.putong.live.livingroom.common.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.izs;
import p153l.we3;

/* JADX INFO: loaded from: classes4.dex */
public class BottomVoiceItemView extends LinearLayout implements RedDot {

    /* JADX INFO: renamed from: a */
    public FrameLayout f49342a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f49343b;

    /* JADX INFO: renamed from: c */
    public View f49344c;

    /* JADX INFO: renamed from: d */
    public TextView f49345d;

    /* JADX INFO: renamed from: e */
    public TextView f49346e;

    /* JADX INFO: renamed from: f */
    public int f49347f;

    public BottomVoiceItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m73327a(View view) {
        we3.m205990a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m73328b(int i) {
        TextView textView = this.f49345d;
        if (i > 0) {
            bnl0.m105524M(textView, true);
            this.f49345d.setText(i > 99 ? "99+" : String.valueOf(i));
        } else {
            bnl0.m105524M(textView, false);
        }
        bnl0.m105524M(this.f49344c, false);
        this.f49347f = i;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: g0 */
    public void mo73321g0(boolean z) {
        bnl0.m105524M(this.f49344c, z);
        TextView textView = this.f49345d;
        if (z) {
            bnl0.m105524M(textView, false);
        } else {
            bnl0.m105524M(textView, this.f49347f > 0);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73327a(this);
    }

    public void setImageRes(@DrawableRes int i) {
        this.f49343b.setImageResource(i);
    }

    public void setImageUrl(String str) {
        izs.m142871v("context_livingAct", this.f49343b, str, 0, 0, false, true, false, null);
    }

    public void setText(CharSequence charSequence) {
        this.f49346e.setText(charSequence);
    }

    public BottomVoiceItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BottomVoiceItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
