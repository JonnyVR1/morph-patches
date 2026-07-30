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
import p149l.fkm0;
import p149l.hxs;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceBottomCallButton extends FrameLayout implements RedDot {

    /* JADX INFO: renamed from: a */
    public VDraweeView f52908a;

    /* JADX INFO: renamed from: b */
    public View f52909b;

    /* JADX INFO: renamed from: c */
    public TextView f52910c;

    /* JADX INFO: renamed from: d */
    public int f52911d;

    public VoiceBottomCallButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m77767a(View view) {
        fkm0.m121875a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m77768b(int i) {
        if (i <= 0 || xdl0.m208349O0(this.f52909b)) {
            xdl0.m208344M(this.f52910c, false);
        } else {
            xdl0.m208344M(this.f52910c, true);
            this.f52910c.setText(i > 99 ? "99+" : String.valueOf(i));
        }
        this.f52911d = i;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: g0 */
    public void mo72138g0(boolean z) {
        xdl0.m208344M(this.f52909b, z);
        TextView textView = this.f52910c;
        if (z) {
            xdl0.m208344M(textView, false);
        } else {
            xdl0.m208344M(textView, this.f52911d > 0);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77767a(this);
    }

    public void setIcon(String str) {
        hxs.m133407t("context_livingAct", this.f52908a, str, t100.f167273v);
    }

    public VoiceBottomCallButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public VoiceBottomCallButton(@NonNull Context context) {
        super(context);
    }

    public void setIcon(int i) {
        this.f52908a.setImageResource(i);
    }
}
