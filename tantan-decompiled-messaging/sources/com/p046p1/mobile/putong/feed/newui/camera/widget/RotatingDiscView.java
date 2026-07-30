package com.p046p1.mobile.putong.feed.newui.camera.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.sunshine.engine.particle.SceneView;
import p147v.VDraweeView;
import p147v.VHollowCircleDraweeView;
import p149l.d30;
import p149l.med0;
import p149l.vqg;

/* JADX INFO: loaded from: classes12.dex */
public class RotatingDiscView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public SceneView f39812a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f39813b;

    /* JADX INFO: renamed from: c */
    public ImageView f39814c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f39815d;

    /* JADX INFO: renamed from: e */
    public VHollowCircleDraweeView f39816e;

    /* JADX INFO: renamed from: f */
    public ObjectAnimator f39817f;

    public RotatingDiscView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m61701b(View view) {
        med0.m154180a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m61702c() {
        float rotation = this.f39813b.getRotation();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f39813b, BLiveGiftItem.TYPE_ROTATION, rotation, 360.0f + rotation);
        this.f39817f = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(3000L);
        this.f39817f.setInterpolator(new LinearInterpolator());
        this.f39817f.setRepeatCount(-1);
    }

    /* JADX INFO: renamed from: d */
    public void m61703d(final d30 d30Var) {
        this.f39813b.setOnClickListener(new View.OnClickListener() { // from class: l.led0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public void m61704e(String str) {
        vqg.m199506F0(this.f39815d, str);
    }

    /* JADX INFO: renamed from: f */
    public void m61705f() {
        m61702c();
        this.f39817f.start();
        this.f39812a.m80918d("animations/disc/config.xml", "animations/disc/pic");
    }

    /* JADX INFO: renamed from: g */
    public void m61706g() {
        ObjectAnimator objectAnimator = this.f39817f;
        if (objectAnimator == null) {
            return;
        }
        objectAnimator.cancel();
        this.f39812a.m80919e();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m61701b(this);
    }

    public RotatingDiscView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RotatingDiscView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
