package com.p046p1.mobile.putong.account.p050ui.camera.view;

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
import com.p046p1.mobile.putong.account.data.CameraSticker;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p147v.VDraweeView;
import p149l.C18021ki;
import p149l.C18459mi;
import p149l.C20443uj;
import p149l.bt0;
import p149l.j760;
import p149l.qib0;
import p149l.v2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class AccountCameraMaskItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f16760a;

    /* JADX INFO: renamed from: b */
    public AccountRedDotView f16761b;

    /* JADX INFO: renamed from: c */
    public View f16762c;

    /* JADX INFO: renamed from: d */
    public ImageView f16763d;

    public AccountCameraMaskItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m28922b(View view) {
        C18459mi.m154657a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m28923c(C18021ki c18021ki, CameraSticker cameraSticker, int i, View view) {
        c18021ki.f123244c.call(new j760<>(cameraSticker, Integer.valueOf(i)));
        this.f16761b.m29112k();
    }

    /* JADX INFO: renamed from: d */
    public boolean m28924d(final CameraSticker cameraSticker, final C18021ki c18021ki, HashMap<String, Animator> map, final int i, CameraSticker cameraSticker2) {
        boolean z = false;
        if (cameraSticker == null) {
            return false;
        }
        if (NullChecker.m81303a(cameraSticker2) && TextUtils.equals(cameraSticker.f16344id, cameraSticker2.f16344id) && TextUtils.equals(cameraSticker.cId, cameraSticker2.cId)) {
            this.f16762c.setVisibility(0);
            z = true;
        } else {
            this.f16762c.setVisibility(8);
        }
        xdl0.m208344M(this.f16761b, C20443uj.m193970c().m193977h(cameraSticker, C20443uj.m193970c().m193974e()));
        qib0.f154691G.m102331L0(this.f16760a, cameraSticker.icon);
        m28925e(cameraSticker, map, i);
        setOnClickListener(new View.OnClickListener() { // from class: l.li
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f128149a.m28923c(c18021ki, cameraSticker, i, view);
            }
        });
        return z;
    }

    /* JADX INFO: renamed from: e */
    public final void m28925e(CameraSticker cameraSticker, HashMap<String, Animator> map, int i) {
        this.f16763d.setRotation(0.0f);
        if ((!cameraSticker.hasModelFile && cameraSticker.state == 1) || cameraSticker.state == 4) {
            bt0.m103732e(this.f16763d);
        }
        if (cameraSticker.hasModelFile || cameraSticker.state != 1) {
            int i2 = cameraSticker.state;
            if (i2 == 2) {
                this.f16763d.setImageResource(v2c0.f179428R);
                Animator animatorM103743p = bt0.m103743p(this.f16763d, BLiveGiftItem.TYPE_ROTATION, 0L, 800L, new LinearInterpolator(), 0.0f, 360.0f);
                if (NullChecker.m81303a(map.get(cameraSticker.f16344id))) {
                    map.get(cameraSticker.f16344id).cancel();
                }
                map.put(cameraSticker.f16344id, animatorM103743p);
                ((ObjectAnimator) animatorM103743p).setRepeatCount(-1);
                bt0.m103729b(this.f16763d, animatorM103743p);
                this.f16763d.setVisibility(0);
            } else {
                ImageView imageView = this.f16763d;
                if (i2 == 4) {
                    imageView.setImageResource(v2c0.f179431S);
                    this.f16763d.setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                }
            }
        } else {
            this.f16763d.setImageResource(v2c0.f179434T);
            this.f16763d.setVisibility(0);
        }
        if (cameraSticker.state != 2) {
            Animator animator = map.get(cameraSticker.f16344id);
            if (NullChecker.m81303a(animator)) {
                animator.cancel();
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m28922b(this);
    }

    public AccountCameraMaskItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AccountCameraMaskItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
