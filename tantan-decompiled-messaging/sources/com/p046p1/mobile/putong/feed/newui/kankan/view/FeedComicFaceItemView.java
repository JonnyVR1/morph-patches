package com.p046p1.mobile.putong.feed.newui.kankan.view;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.feed.data.CameraSticker;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p147v.VDraweeView;
import p149l.bt0;
import p149l.f3c0;
import p149l.qib0;
import p149l.sug;

/* JADX INFO: loaded from: classes12.dex */
public class FeedComicFaceItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f40198a;

    /* JADX INFO: renamed from: b */
    public ImageView f40199b;

    /* JADX INFO: renamed from: c */
    public View f40200c;

    /* JADX INFO: renamed from: d */
    public View f40201d;

    public FeedComicFaceItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m62118b(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public View m62117a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return sug.m186013b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public final void m62118b(Context context, @Nullable AttributeSet attributeSet) {
        addView(m62117a(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: c */
    public boolean m62119c(CameraSticker cameraSticker, HashMap<String, Animator> map, int i, CameraSticker cameraSticker2) {
        boolean z = false;
        if (cameraSticker == null) {
            return false;
        }
        if (NullChecker.m81303a(cameraSticker2) && TextUtils.equals(cameraSticker.f39219id, cameraSticker2.f39219id) && TextUtils.equals(cameraSticker.cId, cameraSticker2.cId)) {
            z = true;
        }
        qib0.f154691G.m102331L0(this.f40198a, cameraSticker.icon);
        m62120d(cameraSticker, map, i);
        return z;
    }

    /* JADX INFO: renamed from: d */
    public final void m62120d(CameraSticker cameraSticker, HashMap<String, Animator> map, int i) {
        ImageView imageView = this.f40199b;
        if (i == 0) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setRotation(0.0f);
        if ((!cameraSticker.hasModelFile && cameraSticker.state == 1) || cameraSticker.state == 4) {
            bt0.m103732e(this.f40199b);
        }
        if (cameraSticker.hasModelFile || cameraSticker.state != 1) {
            int i2 = cameraSticker.state;
            if (i2 == 2) {
                this.f40199b.setImageResource(f3c0.f94496d);
                Animator animatorM103743p = bt0.m103743p(this.f40199b, BLiveGiftItem.TYPE_ROTATION, 0L, 800L, new LinearInterpolator(), 0.0f, 360.0f);
                if (NullChecker.m81303a(map.get(cameraSticker.f39219id))) {
                    map.get(cameraSticker.f39219id).cancel();
                }
                map.put(cameraSticker.f39219id, animatorM103743p);
                ((ObjectAnimator) animatorM103743p).setRepeatCount(-1);
                bt0.m103729b(this.f40199b, animatorM103743p);
                this.f40199b.setVisibility(0);
            } else {
                ImageView imageView2 = this.f40199b;
                if (i2 == 4) {
                    imageView2.setImageResource(f3c0.f94504e);
                    this.f40199b.setVisibility(0);
                } else {
                    imageView2.setVisibility(8);
                }
            }
        } else {
            this.f40199b.setImageResource(f3c0.f94512f);
            this.f40199b.setVisibility(0);
        }
        if (cameraSticker.state != 2) {
            Animator animator = map.get(cameraSticker.f39219id);
            if (NullChecker.m81303a(animator)) {
                animator.cancel();
            }
        }
    }

    public FeedComicFaceItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FeedComicFaceItemView(@NonNull Context context) {
        this(context, null);
    }
}
