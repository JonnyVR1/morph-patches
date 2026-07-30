package com.p046p1.mobile.putong.core.p053ui.main;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import p149l.t100;
import p149l.u4c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class DailyPaperGestureView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f30335a;

    /* JADX INFO: renamed from: b */
    public ObjectAnimator f30336b;

    /* JADX INFO: renamed from: c */
    public final int f30337c;

    /* JADX INFO: renamed from: d */
    public final int f30338d;

    /* JADX INFO: renamed from: e */
    public final int f30339e;

    /* JADX INFO: renamed from: f */
    public final int f30340f;

    public DailyPaperGestureView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30337c = t100.m186890d(15.0f);
        this.f30338d = t100.m186890d(67.0f);
        this.f30339e = t100.m186890d(48.0f);
        this.f30340f = 1000;
    }

    /* JADX INFO: renamed from: a */
    public final void m47332a() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f30335a, "translationX", 0.0f, ((xdl0.m208412y0() - (this.f30337c * 2)) - (this.f30338d * 2)) - this.f30339e);
        this.f30336b = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(1000L);
        this.f30336b.setRepeatCount(-1);
        this.f30336b.setRepeatMode(1);
        this.f30336b.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (NullChecker.m81303a(this.f30336b)) {
            this.f30336b.cancel();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f30335a = (ImageView) findViewById(u4c0.f173891K4);
        m47332a();
    }
}
