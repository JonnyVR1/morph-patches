package com.p046p1.mobile.putong.feed.newui.camera.widget;

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
import com.p046p1.mobile.putong.feed.data.CameraSticker;
import com.p046p1.mobile.putong.feed.newui.photoalbum.redpointview.FeedRedDotView;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p147v.VDraweeView;
import p149l.bt0;
import p149l.d94;
import p149l.f3c0;
import p149l.j760;
import p149l.qib0;
import p149l.xdl0;
import p149l.yb4;

/* JADX INFO: loaded from: classes12.dex */
public class CameraMaskItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f39550a;

    /* JADX INFO: renamed from: b */
    public FeedRedDotView f39551b;

    /* JADX INFO: renamed from: c */
    public View f39552c;

    /* JADX INFO: renamed from: d */
    public ImageView f39553d;

    public CameraMaskItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m61423b(View view) {
        d94.m110411a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m61424c(C11186c c11186c, CameraSticker cameraSticker, int i, View view) {
        c11186c.f39856c.call(new j760<>(cameraSticker, Integer.valueOf(i)));
        this.f39551b.m65056k();
    }

    /* JADX INFO: renamed from: d */
    public boolean m61425d(final CameraSticker cameraSticker, final C11186c c11186c, HashMap<String, Animator> map, final int i, CameraSticker cameraSticker2) {
        boolean z = false;
        if (cameraSticker == null) {
            return false;
        }
        if (NullChecker.m81303a(cameraSticker2) && TextUtils.equals(cameraSticker.f39219id, cameraSticker2.f39219id) && TextUtils.equals(cameraSticker.cId, cameraSticker2.cId)) {
            this.f39552c.setVisibility(0);
            z = true;
        } else {
            this.f39552c.setVisibility(8);
        }
        xdl0.m208344M(this.f39551b, yb4.m213936c().m213943h(cameraSticker, yb4.m213936c().m213940e()));
        qib0.f154691G.m102331L0(this.f39550a, cameraSticker.icon);
        m61426e(cameraSticker, map, i);
        setOnClickListener(new View.OnClickListener() { // from class: l.c94
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79854a.m61424c(c11186c, cameraSticker, i, view);
            }
        });
        return z;
    }

    /* JADX INFO: renamed from: e */
    public final void m61426e(CameraSticker cameraSticker, HashMap<String, Animator> map, int i) {
        this.f39553d.setRotation(0.0f);
        if ((!cameraSticker.hasModelFile && cameraSticker.state == 1) || cameraSticker.state == 4) {
            bt0.m103732e(this.f39553d);
        }
        if (cameraSticker.hasModelFile || cameraSticker.state != 1) {
            int i2 = cameraSticker.state;
            if (i2 == 2) {
                this.f39553d.setImageResource(f3c0.f94496d);
                Animator animatorM103743p = bt0.m103743p(this.f39553d, BLiveGiftItem.TYPE_ROTATION, 0L, 800L, new LinearInterpolator(), 0.0f, 360.0f);
                if (NullChecker.m81303a(map.get(cameraSticker.f39219id))) {
                    map.get(cameraSticker.f39219id).cancel();
                }
                map.put(cameraSticker.f39219id, animatorM103743p);
                ((ObjectAnimator) animatorM103743p).setRepeatCount(-1);
                bt0.m103729b(this.f39553d, animatorM103743p);
                this.f39553d.setVisibility(0);
            } else {
                ImageView imageView = this.f39553d;
                if (i2 == 4) {
                    imageView.setImageResource(f3c0.f94504e);
                    this.f39553d.setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                }
            }
        } else {
            this.f39553d.setImageResource(f3c0.f94512f);
            this.f39553d.setVisibility(0);
        }
        if (cameraSticker.state != 2) {
            Animator animator = map.get(cameraSticker.f39219id);
            if (NullChecker.m81303a(animator)) {
                animator.cancel();
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m61423b(this);
    }

    public CameraMaskItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CameraMaskItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
