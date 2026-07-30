package com.p046p1.mobile.putong.live.livingroom.common.signin.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VImage;
import p147v.VText;
import p149l.cfi0;
import p149l.i3c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class TaskExpandOrFoldView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f49319a;

    /* JADX INFO: renamed from: b */
    public VText f49320b;

    /* JADX INFO: renamed from: c */
    public VImage f49321c;

    public TaskExpandOrFoldView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m73225a(View view) {
        cfi0.m106557a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m73226b(boolean z, boolean z2, boolean z3) {
        int i;
        if (z3) {
            xdl0.m208345M0(this, false);
            this.f49320b.setText(R$string.f46724Hd);
            return;
        }
        xdl0.m208344M(this, true);
        VText vText = this.f49320b;
        if (z) {
            vText.setText(R$string.f46724Hd);
            i = i3c0.f111126p8;
        } else {
            vText.setText(z2 ? R$string.f46746Id : R$string.f46854Nd);
            i = i3c0.f111102n8;
        }
        this.f49321c.setImageResource(i);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73225a(this);
    }
}
