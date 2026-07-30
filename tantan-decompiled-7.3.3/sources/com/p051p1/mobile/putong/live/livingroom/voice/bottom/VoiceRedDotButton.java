package com.p051p1.mobile.putong.live.livingroom.voice.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.RedDot;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.izs;
import p153l.mdc0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceRedDotButton extends FrameLayout implements RedDot {

    /* JADX INFO: renamed from: a */
    public VDraweeView f53778a;

    /* JADX INFO: renamed from: b */
    public View f53779b;

    /* JADX INFO: renamed from: c */
    public TextView f53780c;

    /* JADX INFO: renamed from: d */
    public int f53781d;

    public VoiceRedDotButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public void m78968a(String str, int i, int i2) {
        izs.m142870u("context_single_room", this.f53778a, str, i, i2);
    }

    /* JADX INFO: renamed from: b */
    public void m78969b(int i) {
        TextView textView = this.f53780c;
        if (i > 0) {
            bnl0.m105524M(textView, true);
            this.f53780c.setText(i > 99 ? "99+" : String.valueOf(i));
            bnl0.m105524M(this.f53779b, false);
        } else {
            bnl0.m105524M(textView, false);
        }
        this.f53781d = i;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: g0 */
    public void mo73321g0(boolean z) {
        bnl0.m105524M(this.f53779b, z);
        TextView textView = this.f53780c;
        if (z) {
            bnl0.m105524M(textView, false);
        } else {
            bnl0.m105524M(textView, this.f53781d > 0);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f53778a = (VDraweeView) findViewById(mdc0.f135886A2);
        this.f53779b = findViewById(mdc0.f136113Z4);
        this.f53780c = (TextView) findViewById(mdc0.f136280q7);
    }

    public void setLocalIcon(int i) {
        this.f53778a.setImageResource(i);
    }

    public void setRedDotCount(int i) {
        this.f53781d = i;
    }
}
