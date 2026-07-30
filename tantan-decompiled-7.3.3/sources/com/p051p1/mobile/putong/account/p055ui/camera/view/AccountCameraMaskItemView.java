package com.p051p1.mobile.putong.account.p055ui.camera.view;

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
import com.p051p1.mobile.putong.account.data.CameraSticker;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p151v.VDraweeView;
import p153l.C16977fi;
import p153l.C17464hi;
import p153l.C19376pj;
import p153l.bbc0;
import p153l.bnl0;
import p153l.gt0;
import p153l.pf60;
import p153l.uqb0;

/* JADX INFO: loaded from: classes9.dex */
public class AccountCameraMaskItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f17479a;

    /* JADX INFO: renamed from: b */
    public AccountRedDotView f17480b;

    /* JADX INFO: renamed from: c */
    public View f17481c;

    /* JADX INFO: renamed from: d */
    public ImageView f17482d;

    public AccountCameraMaskItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m29921b(View view) {
        C17464hi.m135082a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m29922c(C16977fi c16977fi, CameraSticker cameraSticker, int i, View view) {
        c16977fi.f99134c.call(new pf60<>(cameraSticker, Integer.valueOf(i)));
        this.f17480b.m30111k();
    }

    /* JADX INFO: renamed from: d */
    public boolean m29923d(final CameraSticker cameraSticker, final C16977fi c16977fi, HashMap<String, Animator> map, final int i, CameraSticker cameraSticker2) {
        boolean z = false;
        if (cameraSticker == null) {
            return false;
        }
        if (NullChecker.m82486a(cameraSticker2) && TextUtils.equals(cameraSticker.f17063id, cameraSticker2.f17063id) && TextUtils.equals(cameraSticker.cId, cameraSticker2.cId)) {
            this.f17481c.setVisibility(0);
            z = true;
        } else {
            this.f17481c.setVisibility(8);
        }
        bnl0.m105524M(this.f17480b, C19376pj.m172465c().m172472h(cameraSticker, C19376pj.m172465c().m172469e()));
        uqb0.f180374G.m127115L0(this.f17479a, cameraSticker.icon);
        m29924e(cameraSticker, map, i);
        setOnClickListener(new View.OnClickListener() { // from class: l.gi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104180a.m29922c(c16977fi, cameraSticker, i, view);
            }
        });
        return z;
    }

    /* JADX INFO: renamed from: e */
    public final void m29924e(CameraSticker cameraSticker, HashMap<String, Animator> map, int i) {
        this.f17482d.setRotation(0.0f);
        if ((!cameraSticker.hasModelFile && cameraSticker.state == 1) || cameraSticker.state == 4) {
            gt0.m132159e(this.f17482d);
        }
        if (cameraSticker.hasModelFile || cameraSticker.state != 1) {
            int i2 = cameraSticker.state;
            if (i2 == 2) {
                this.f17482d.setImageResource(bbc0.f75834R);
                Animator animatorM132170p = gt0.m132170p(this.f17482d, BLiveGiftItem.TYPE_ROTATION, 0L, 800L, new LinearInterpolator(), 0.0f, 360.0f);
                if (NullChecker.m82486a(map.get(cameraSticker.f17063id))) {
                    map.get(cameraSticker.f17063id).cancel();
                }
                map.put(cameraSticker.f17063id, animatorM132170p);
                ((ObjectAnimator) animatorM132170p).setRepeatCount(-1);
                gt0.m132156b(this.f17482d, animatorM132170p);
                this.f17482d.setVisibility(0);
            } else {
                ImageView imageView = this.f17482d;
                if (i2 == 4) {
                    imageView.setImageResource(bbc0.f75837S);
                    this.f17482d.setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                }
            }
        } else {
            this.f17482d.setImageResource(bbc0.f75840T);
            this.f17482d.setVisibility(0);
        }
        if (cameraSticker.state != 2) {
            Animator animator = map.get(cameraSticker.f17063id);
            if (NullChecker.m82486a(animator)) {
                animator.cancel();
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m29921b(this);
    }

    public AccountCameraMaskItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AccountCameraMaskItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
