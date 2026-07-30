package com.p046p1.mobile.putong.live.livingroom.voice.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.RedDot;
import p147v.VDraweeView;
import p149l.g5c0;
import p149l.hxs;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceRedDotButton extends FrameLayout implements RedDot {

    /* JADX INFO: renamed from: a */
    public VDraweeView f52930a;

    /* JADX INFO: renamed from: b */
    public View f52931b;

    /* JADX INFO: renamed from: c */
    public TextView f52932c;

    /* JADX INFO: renamed from: d */
    public int f52933d;

    public VoiceRedDotButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public void m77785a(String str, int i, int i2) {
        hxs.m133408u("context_single_room", this.f52930a, str, i, i2);
    }

    /* JADX INFO: renamed from: b */
    public void m77786b(int i) {
        TextView textView = this.f52932c;
        if (i > 0) {
            xdl0.m208344M(textView, true);
            this.f52932c.setText(i > 99 ? "99+" : String.valueOf(i));
            xdl0.m208344M(this.f52931b, false);
        } else {
            xdl0.m208344M(textView, false);
        }
        this.f52933d = i;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: g0 */
    public void mo72138g0(boolean z) {
        xdl0.m208344M(this.f52931b, z);
        TextView textView = this.f52932c;
        if (z) {
            xdl0.m208344M(textView, false);
        } else {
            xdl0.m208344M(textView, this.f52933d > 0);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f52930a = (VDraweeView) findViewById(g5c0.f100641A2);
        this.f52931b = findViewById(g5c0.f100868Z4);
        this.f52932c = (TextView) findViewById(g5c0.f101035q7);
    }

    public void setLocalIcon(int i) {
        this.f52930a.setImageResource(i);
    }

    public void setRedDotCount(int i) {
        this.f52933d = i;
    }
}
