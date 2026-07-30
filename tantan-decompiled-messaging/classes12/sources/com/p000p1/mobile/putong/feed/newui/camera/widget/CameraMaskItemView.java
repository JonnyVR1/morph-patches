package com.p000p1.mobile.putong.feed.newui.camera.widget;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.feed.data.CameraSticker;
import com.p000p1.mobile.putong.feed.newui.photoalbum.redpointview.FeedRedDotView;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import l.bt0;
import l.j760;
import l.qib0;
import l.xdl0;
import p007l.d94;
import p007l.f3c0;
import p007l.yb4;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class CameraMaskItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f1011a;

    /* JADX INFO: renamed from: b */
    public FeedRedDotView f1012b;

    /* JADX INFO: renamed from: c */
    public View f1013c;

    /* JADX INFO: renamed from: d */
    public ImageView f1014d;

    public CameraMaskItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m2373b(View view) {
        d94.m9355a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m2374c(C2030c c2030c, CameraSticker cameraSticker, int i, View view) {
        c2030c.f1317c.call(new j760(cameraSticker, Integer.valueOf(i)));
        this.f1012b.m6157k();
    }

    /* JADX INFO: renamed from: d */
    public boolean m2375d(final CameraSticker cameraSticker, final C2030c c2030c, HashMap<String, Animator> map, final int i, CameraSticker cameraSticker2) {
        boolean z = false;
        if (cameraSticker == null) {
            return false;
        }
        if (NullChecker.a(cameraSticker2) && TextUtils.equals(cameraSticker.f680id, cameraSticker2.f680id) && TextUtils.equals(cameraSticker.cId, cameraSticker2.cId)) {
            this.f1013c.setVisibility(0);
            z = true;
        } else {
            this.f1013c.setVisibility(8);
        }
        xdl0.M(this.f1012b, yb4.m17102c().m17109h(cameraSticker, yb4.m17102c().m17106e()));
        qib0.G.L0(this.f1011a, cameraSticker.icon);
        m2376e(cameraSticker, map, i);
        setOnClickListener(new View.OnClickListener() { // from class: l.c94
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6568a.m2374c(c2030c, cameraSticker, i, view);
            }
        });
        return z;
    }

    /* JADX INFO: renamed from: e */
    public final void m2376e(CameraSticker cameraSticker, HashMap<String, Animator> map, int i) {
        this.f1014d.setRotation(0.0f);
        if ((!cameraSticker.hasModelFile && cameraSticker.state == 1) || cameraSticker.state == 4) {
            bt0.e(this.f1014d);
        }
        if (cameraSticker.hasModelFile || cameraSticker.state != 1) {
            int i2 = cameraSticker.state;
            if (i2 == 2) {
                this.f1014d.setImageResource(f3c0.f7779d);
                Animator animatorP = bt0.p(this.f1014d, "rotation", 0L, 800L, new LinearInterpolator(), new float[]{0.0f, 360.0f});
                if (NullChecker.a(map.get(cameraSticker.f680id))) {
                    map.get(cameraSticker.f680id).cancel();
                }
                map.put(cameraSticker.f680id, animatorP);
                ((ObjectAnimator) animatorP).setRepeatCount(-1);
                bt0.b(this.f1014d, animatorP);
                this.f1014d.setVisibility(0);
            } else {
                ImageView imageView = this.f1014d;
                if (i2 == 4) {
                    imageView.setImageResource(f3c0.f7787e);
                    this.f1014d.setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                }
            }
        } else {
            this.f1014d.setImageResource(f3c0.f7795f);
            this.f1014d.setVisibility(0);
        }
        if (cameraSticker.state != 2) {
            Animator animator = map.get(cameraSticker.f680id);
            if (NullChecker.a(animator)) {
                animator.cancel();
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2373b(this);
    }

    public CameraMaskItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CameraMaskItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
