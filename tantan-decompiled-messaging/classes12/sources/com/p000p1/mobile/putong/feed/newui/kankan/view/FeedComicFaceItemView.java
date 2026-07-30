package com.p000p1.mobile.putong.feed.newui.kankan.view;

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
import com.p000p1.mobile.putong.feed.data.CameraSticker;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import l.bt0;
import l.qib0;
import p007l.f3c0;
import p007l.sug;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedComicFaceItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f1659a;

    /* JADX INFO: renamed from: b */
    public ImageView f1660b;

    /* JADX INFO: renamed from: c */
    public View f1661c;

    /* JADX INFO: renamed from: d */
    public View f1662d;

    public FeedComicFaceItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m3100b(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public View m3099a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return sug.m14319b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public final void m3100b(Context context, @Nullable AttributeSet attributeSet) {
        addView(m3099a(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: c */
    public boolean m3101c(CameraSticker cameraSticker, HashMap<String, Animator> map, int i, CameraSticker cameraSticker2) {
        boolean z = false;
        if (cameraSticker == null) {
            return false;
        }
        if (NullChecker.a(cameraSticker2) && TextUtils.equals(cameraSticker.f680id, cameraSticker2.f680id) && TextUtils.equals(cameraSticker.cId, cameraSticker2.cId)) {
            z = true;
        }
        qib0.G.L0(this.f1659a, cameraSticker.icon);
        m3102d(cameraSticker, map, i);
        return z;
    }

    /* JADX INFO: renamed from: d */
    public final void m3102d(CameraSticker cameraSticker, HashMap<String, Animator> map, int i) {
        ImageView imageView = this.f1660b;
        if (i == 0) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setRotation(0.0f);
        if ((!cameraSticker.hasModelFile && cameraSticker.state == 1) || cameraSticker.state == 4) {
            bt0.e(this.f1660b);
        }
        if (cameraSticker.hasModelFile || cameraSticker.state != 1) {
            int i2 = cameraSticker.state;
            if (i2 == 2) {
                this.f1660b.setImageResource(f3c0.f7779d);
                Animator animatorP = bt0.p(this.f1660b, "rotation", 0L, 800L, new LinearInterpolator(), new float[]{0.0f, 360.0f});
                if (NullChecker.a(map.get(cameraSticker.f680id))) {
                    map.get(cameraSticker.f680id).cancel();
                }
                map.put(cameraSticker.f680id, animatorP);
                ((ObjectAnimator) animatorP).setRepeatCount(-1);
                bt0.b(this.f1660b, animatorP);
                this.f1660b.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1660b;
                if (i2 == 4) {
                    imageView2.setImageResource(f3c0.f7787e);
                    this.f1660b.setVisibility(0);
                } else {
                    imageView2.setVisibility(8);
                }
            }
        } else {
            this.f1660b.setImageResource(f3c0.f7795f);
            this.f1660b.setVisibility(0);
        }
        if (cameraSticker.state != 2) {
            Animator animator = map.get(cameraSticker.f680id);
            if (NullChecker.a(animator)) {
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
