package com.p051p1.mobile.putong.feed.newui.camera.widget;

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
import com.p051p1.mobile.putong.feed.data.CameraSticker;
import com.p051p1.mobile.putong.feed.newui.photoalbum.redpointview.FeedRedDotView;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.ca4;
import p153l.gt0;
import p153l.lbc0;
import p153l.pf60;
import p153l.uqb0;
import p153l.xc4;

/* JADX INFO: loaded from: classes13.dex */
public class CameraMaskItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f40398a;

    /* JADX INFO: renamed from: b */
    public FeedRedDotView f40399b;

    /* JADX INFO: renamed from: c */
    public View f40400c;

    /* JADX INFO: renamed from: d */
    public ImageView f40401d;

    public CameraMaskItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m62607b(View view) {
        ca4.m108472a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m62608c(C11349c c11349c, CameraSticker cameraSticker, int i, View view) {
        c11349c.f40704c.call(new pf60<>(cameraSticker, Integer.valueOf(i)));
        this.f40399b.m66239k();
    }

    /* JADX INFO: renamed from: d */
    public boolean m62609d(final CameraSticker cameraSticker, final C11349c c11349c, HashMap<String, Animator> map, final int i, CameraSticker cameraSticker2) {
        boolean z = false;
        if (cameraSticker == null) {
            return false;
        }
        if (NullChecker.m82486a(cameraSticker2) && TextUtils.equals(cameraSticker.f40067id, cameraSticker2.f40067id) && TextUtils.equals(cameraSticker.cId, cameraSticker2.cId)) {
            this.f40400c.setVisibility(0);
            z = true;
        } else {
            this.f40400c.setVisibility(8);
        }
        bnl0.m105524M(this.f40399b, xc4.m210114c().m210121h(cameraSticker, xc4.m210114c().m210118e()));
        uqb0.f180374G.m127115L0(this.f40398a, cameraSticker.icon);
        m62610e(cameraSticker, map, i);
        setOnClickListener(new View.OnClickListener() { // from class: l.ba4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f75637a.m62608c(c11349c, cameraSticker, i, view);
            }
        });
        return z;
    }

    /* JADX INFO: renamed from: e */
    public final void m62610e(CameraSticker cameraSticker, HashMap<String, Animator> map, int i) {
        this.f40401d.setRotation(0.0f);
        if ((!cameraSticker.hasModelFile && cameraSticker.state == 1) || cameraSticker.state == 4) {
            gt0.m132159e(this.f40401d);
        }
        if (cameraSticker.hasModelFile || cameraSticker.state != 1) {
            int i2 = cameraSticker.state;
            if (i2 == 2) {
                this.f40401d.setImageResource(lbc0.f131014d);
                Animator animatorM132170p = gt0.m132170p(this.f40401d, BLiveGiftItem.TYPE_ROTATION, 0L, 800L, new LinearInterpolator(), 0.0f, 360.0f);
                if (NullChecker.m82486a(map.get(cameraSticker.f40067id))) {
                    map.get(cameraSticker.f40067id).cancel();
                }
                map.put(cameraSticker.f40067id, animatorM132170p);
                ((ObjectAnimator) animatorM132170p).setRepeatCount(-1);
                gt0.m132156b(this.f40401d, animatorM132170p);
                this.f40401d.setVisibility(0);
            } else {
                ImageView imageView = this.f40401d;
                if (i2 == 4) {
                    imageView.setImageResource(lbc0.f131022e);
                    this.f40401d.setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                }
            }
        } else {
            this.f40401d.setImageResource(lbc0.f131030f);
            this.f40401d.setVisibility(0);
        }
        if (cameraSticker.state != 2) {
            Animator animator = map.get(cameraSticker.f40067id);
            if (NullChecker.m82486a(animator)) {
                animator.cancel();
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m62607b(this);
    }

    public CameraMaskItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CameraMaskItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
