package com.p000p1.mobile.putong.feed.newui.camera.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.sunshine.engine.particle.SceneView;
import l.d30;
import p007l.med0;
import p007l.vqg;
import v.VDraweeView;
import v.VHollowCircleDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class RotatingDiscView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public SceneView f1273a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f1274b;

    /* JADX INFO: renamed from: c */
    public ImageView f1275c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f1276d;

    /* JADX INFO: renamed from: e */
    public VHollowCircleDraweeView f1277e;

    /* JADX INFO: renamed from: f */
    public ObjectAnimator f1278f;

    public RotatingDiscView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m2653b(View view) {
        med0.m11929a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m2654c() {
        float rotation = this.f1274b.getRotation();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f1274b, "rotation", rotation, 360.0f + rotation);
        this.f1278f = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(3000L);
        this.f1278f.setInterpolator(new LinearInterpolator());
        this.f1278f.setRepeatCount(-1);
    }

    /* JADX INFO: renamed from: d */
    public void m2655d(final d30 d30Var) {
        this.f1274b.setOnClickListener(new View.OnClickListener() { // from class: l.led0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public void m2656e(String str) {
        vqg.m15476F0(this.f1276d, str);
    }

    /* JADX INFO: renamed from: f */
    public void m2657f() {
        m2654c();
        this.f1278f.start();
        this.f1273a.d(new String[]{"animations/disc/config.xml", "animations/disc/pic"});
    }

    /* JADX INFO: renamed from: g */
    public void m2658g() {
        ObjectAnimator objectAnimator = this.f1278f;
        if (objectAnimator == null) {
            return;
        }
        objectAnimator.cancel();
        this.f1273a.e();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2653b(this);
    }

    public RotatingDiscView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RotatingDiscView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
