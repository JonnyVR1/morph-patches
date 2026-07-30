package com.p051p1.mobile.putong.feed.newui.kankan.view;

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
import com.p051p1.mobile.putong.feed.data.CameraSticker;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p151v.VDraweeView;
import p153l.gt0;
import p153l.hwg;
import p153l.lbc0;
import p153l.uqb0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedComicFaceItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f41046a;

    /* JADX INFO: renamed from: b */
    public ImageView f41047b;

    /* JADX INFO: renamed from: c */
    public View f41048c;

    /* JADX INFO: renamed from: d */
    public View f41049d;

    public FeedComicFaceItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m63301b(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public View m63300a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hwg.m137474b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public final void m63301b(Context context, @Nullable AttributeSet attributeSet) {
        addView(m63300a(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: c */
    public boolean m63302c(CameraSticker cameraSticker, HashMap<String, Animator> map, int i, CameraSticker cameraSticker2) {
        boolean z = false;
        if (cameraSticker == null) {
            return false;
        }
        if (NullChecker.m82486a(cameraSticker2) && TextUtils.equals(cameraSticker.f40067id, cameraSticker2.f40067id) && TextUtils.equals(cameraSticker.cId, cameraSticker2.cId)) {
            z = true;
        }
        uqb0.f180374G.m127115L0(this.f41046a, cameraSticker.icon);
        m63303d(cameraSticker, map, i);
        return z;
    }

    /* JADX INFO: renamed from: d */
    public final void m63303d(CameraSticker cameraSticker, HashMap<String, Animator> map, int i) {
        ImageView imageView = this.f41047b;
        if (i == 0) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setRotation(0.0f);
        if ((!cameraSticker.hasModelFile && cameraSticker.state == 1) || cameraSticker.state == 4) {
            gt0.m132159e(this.f41047b);
        }
        if (cameraSticker.hasModelFile || cameraSticker.state != 1) {
            int i2 = cameraSticker.state;
            if (i2 == 2) {
                this.f41047b.setImageResource(lbc0.f131014d);
                Animator animatorM132170p = gt0.m132170p(this.f41047b, BLiveGiftItem.TYPE_ROTATION, 0L, 800L, new LinearInterpolator(), 0.0f, 360.0f);
                if (NullChecker.m82486a(map.get(cameraSticker.f40067id))) {
                    map.get(cameraSticker.f40067id).cancel();
                }
                map.put(cameraSticker.f40067id, animatorM132170p);
                ((ObjectAnimator) animatorM132170p).setRepeatCount(-1);
                gt0.m132156b(this.f41047b, animatorM132170p);
                this.f41047b.setVisibility(0);
            } else {
                ImageView imageView2 = this.f41047b;
                if (i2 == 4) {
                    imageView2.setImageResource(lbc0.f131022e);
                    this.f41047b.setVisibility(0);
                } else {
                    imageView2.setVisibility(8);
                }
            }
        } else {
            this.f41047b.setImageResource(lbc0.f131030f);
            this.f41047b.setVisibility(0);
        }
        if (cameraSticker.state != 2) {
            Animator animator = map.get(cameraSticker.f40067id);
            if (NullChecker.m82486a(animator)) {
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
