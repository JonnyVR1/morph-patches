package com.p000p1.mobile.putong.account.p002ui.camera.view;

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
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import l.bt0;
import l.j760;
import l.xdl0;
import p006l.C0933ki;
import p006l.C1012mi;
import p006l.C1347uj;
import p006l.qib0;
import p006l.v2c0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AccountCameraMaskItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f749a;

    /* JADX INFO: renamed from: b */
    public AccountRedDotView f750b;

    /* JADX INFO: renamed from: c */
    public View f751c;

    /* JADX INFO: renamed from: d */
    public ImageView f752d;

    public AccountCameraMaskItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m828b(View view) {
        C1012mi.m19262a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m829c(C0933ki c0933ki, CameraSticker cameraSticker, int i, View view) {
        c0933ki.f15830c.call(new j760(cameraSticker, Integer.valueOf(i)));
        this.f750b.m1018k();
    }

    /* JADX INFO: renamed from: d */
    public boolean m830d(final CameraSticker cameraSticker, final C0933ki c0933ki, HashMap<String, Animator> map, final int i, CameraSticker cameraSticker2) {
        boolean z = false;
        if (cameraSticker == null) {
            return false;
        }
        if (NullChecker.a(cameraSticker2) && TextUtils.equals(cameraSticker.f333id, cameraSticker2.f333id) && TextUtils.equals(cameraSticker.cId, cameraSticker2.cId)) {
            this.f751c.setVisibility(0);
            z = true;
        } else {
            this.f751c.setVisibility(8);
        }
        xdl0.M(this.f750b, C1347uj.m25232c().m25239h(cameraSticker, C1347uj.m25232c().m25236e()));
        qib0.f19782G.m12744L0(this.f749a, cameraSticker.icon);
        m831e(cameraSticker, map, i);
        setOnClickListener(new View.OnClickListener() { // from class: l.li
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16420a.m829c(c0933ki, cameraSticker, i, view);
            }
        });
        return z;
    }

    /* JADX INFO: renamed from: e */
    public final void m831e(CameraSticker cameraSticker, HashMap<String, Animator> map, int i) {
        this.f752d.setRotation(0.0f);
        if ((!cameraSticker.hasModelFile && cameraSticker.state == 1) || cameraSticker.state == 4) {
            bt0.e(this.f752d);
        }
        if (cameraSticker.hasModelFile || cameraSticker.state != 1) {
            int i2 = cameraSticker.state;
            if (i2 == 2) {
                this.f752d.setImageResource(v2c0.f23992R);
                Animator animatorP = bt0.p(this.f752d, "rotation", 0L, 800L, new LinearInterpolator(), new float[]{0.0f, 360.0f});
                if (NullChecker.a(map.get(cameraSticker.f333id))) {
                    map.get(cameraSticker.f333id).cancel();
                }
                map.put(cameraSticker.f333id, animatorP);
                ((ObjectAnimator) animatorP).setRepeatCount(-1);
                bt0.b(this.f752d, animatorP);
                this.f752d.setVisibility(0);
            } else {
                ImageView imageView = this.f752d;
                if (i2 == 4) {
                    imageView.setImageResource(v2c0.f23995S);
                    this.f752d.setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                }
            }
        } else {
            this.f752d.setImageResource(v2c0.f23998T);
            this.f752d.setVisibility(0);
        }
        if (cameraSticker.state != 2) {
            Animator animator = map.get(cameraSticker.f333id);
            if (NullChecker.a(animator)) {
                animator.cancel();
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m828b(this);
    }

    public AccountCameraMaskItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AccountCameraMaskItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
