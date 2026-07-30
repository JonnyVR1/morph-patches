package com.p051p1.mobile.putong.feed.newui.camera.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.sunshine.engine.particle.SceneView;
import p151v.VDraweeView;
import p151v.VHollowCircleDraweeView;
import p153l.ksg;
import p153l.omd0;
import p153l.x20;

/* JADX INFO: loaded from: classes13.dex */
public class RotatingDiscView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public SceneView f40660a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f40661b;

    /* JADX INFO: renamed from: c */
    public ImageView f40662c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f40663d;

    /* JADX INFO: renamed from: e */
    public VHollowCircleDraweeView f40664e;

    /* JADX INFO: renamed from: f */
    public ObjectAnimator f40665f;

    public RotatingDiscView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m62885b(View view) {
        omd0.m168209a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m62886c() {
        float rotation = this.f40661b.getRotation();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f40661b, BLiveGiftItem.TYPE_ROTATION, rotation, 360.0f + rotation);
        this.f40665f = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(3000L);
        this.f40665f.setInterpolator(new LinearInterpolator());
        this.f40665f.setRepeatCount(-1);
    }

    /* JADX INFO: renamed from: d */
    public void m62887d(final x20 x20Var) {
        this.f40661b.setOnClickListener(new View.OnClickListener() { // from class: l.nmd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var.call();
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public void m62888e(String str) {
        ksg.m151165F0(this.f40663d, str);
    }

    /* JADX INFO: renamed from: f */
    public void m62889f() {
        m62886c();
        this.f40665f.start();
        this.f40660a.m82101d("animations/disc/config.xml", "animations/disc/pic");
    }

    /* JADX INFO: renamed from: g */
    public void m62890g() {
        ObjectAnimator objectAnimator = this.f40665f;
        if (objectAnimator == null) {
            return;
        }
        objectAnimator.cancel();
        this.f40660a.m82102e();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m62885b(this);
    }

    public RotatingDiscView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RotatingDiscView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
