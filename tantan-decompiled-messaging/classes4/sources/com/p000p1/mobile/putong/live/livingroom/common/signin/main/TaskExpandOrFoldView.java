package com.p000p1.mobile.putong.live.livingroom.common.signin.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import l.xdl0;
import p002l.cfi0;
import p002l.i3c0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class TaskExpandOrFoldView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f5361a;

    /* JADX INFO: renamed from: b */
    public VText f5362b;

    /* JADX INFO: renamed from: c */
    public VImage f5363c;

    public TaskExpandOrFoldView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m6755a(View view) {
        cfi0.m10989a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m6756b(boolean z, boolean z2, boolean z3) {
        int i;
        if (z3) {
            xdl0.M0(this, false);
            this.f5362b.setText(R$string.f2766Hd);
            return;
        }
        xdl0.M(this, true);
        VText vText = this.f5362b;
        if (z) {
            vText.setText(R$string.f2766Hd);
            i = i3c0.f12911p8;
        } else {
            vText.setText(z2 ? R$string.f2788Id : R$string.f2896Nd);
            i = i3c0.f12887n8;
        }
        this.f5363c.setImageResource(i);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6755a(this);
    }
}
