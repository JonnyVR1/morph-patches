package com.p000p1.mobile.putong.live.livingroom.increment.gift.tray;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.LiveEnterRoomView;
import com.p1.mobile.putong.live.base.data.BLiveEnterRoom;
import java.util.ArrayList;
import l.bt0;
import l.d30;
import l.e30;
import l.s7m;
import l.t100;
import l.uvr;
import l.vwb;
import l.w9j;
import l.xdl0;
import p002l.AbstractC0781q4;
import p002l.a9s;
import p002l.k8s;
import p002l.v8s;
import p002l.y8s;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveEnterRoomView extends FrameLayout implements s7m<k8s> {

    /* JADX INFO: renamed from: a */
    public ArrayList<AbstractC0781q4> f6163a;

    /* JADX INFO: renamed from: b */
    public C0422b f6164b;

    /* JADX INFO: renamed from: c */
    public C0423c f6165c;

    /* JADX INFO: renamed from: d */
    public v8s f6166d;

    /* JADX INFO: renamed from: e */
    public y8s f6167e;

    /* JADX INFO: renamed from: f */
    public a9s f6168f;

    /* JADX INFO: renamed from: g */
    public k8s<?> f6169g;

    public LiveEnterRoomView(Context context) {
        super(context);
        this.f6163a = vwb.f0(new AbstractC0781q4[0]);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m7740b(View view, d30 d30Var) {
        xdl0.M(view, false);
        view.setTranslationY(0.0f);
        d30Var.call();
    }

    /* JADX INFO: renamed from: f */
    public static AnimatorSet m7741f(final View view, boolean z, long j, final d30 d30Var) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        View.MeasureSpec.makeMeasureSpec(0, 0);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, (-view.getMeasuredWidth()) / 2.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(400L);
        if (z) {
            objectAnimatorOfFloat.setInterpolator(new OvershootInterpolator());
        } else {
            objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        }
        Property property = View.ALPHA;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(300L);
        objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f, t100.d(4.0f));
        objectAnimatorOfFloat3.setDuration(500L);
        objectAnimatorOfFloat3.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, 1.0f, 0.0f);
        objectAnimatorOfFloat4.setDuration(500L);
        objectAnimatorOfFloat4.setInterpolator(new LinearInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
        animatorSet.play(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4);
        objectAnimatorOfFloat3.setStartDelay(j);
        objectAnimatorOfFloat4.setStartDelay(j);
        animatorSet.play(objectAnimatorOfFloat3).after(objectAnimatorOfFloat);
        bt0.w(animatorSet, new Runnable() { // from class: l.d9s
            @Override // java.lang.Runnable
            public final void run() {
                xdl0.M(view, true);
            }
        }, new Runnable() { // from class: l.e9s
            @Override // java.lang.Runnable
            public final void run() {
                LiveEnterRoomView.m7740b(view, d30Var);
            }
        });
        animatorSet.start();
        return animatorSet;
    }

    /* JADX INFO: renamed from: C0 */
    public Context m7742C0() {
        return getContext();
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m7747i1(k8s k8sVar) {
        this.f6169g = k8sVar;
        this.f6164b = new C0422b(k8sVar, this);
        this.f6165c = new C0423c(k8sVar, this);
        this.f6166d = new v8s(k8sVar, this);
        this.f6167e = new y8s(k8sVar, this);
        a9s a9sVar = new a9s(k8sVar, this);
        this.f6168f = a9sVar;
        this.f6163a = vwb.f0(new AbstractC0781q4[]{this.f6164b, this.f6165c, this.f6166d, this.f6167e, a9sVar});
    }

    /* JADX INFO: renamed from: d */
    public boolean m7744d() {
        return vwb.m(this.f6163a, new w9j() { // from class: l.c9s
            public final Object call(Object obj) {
                return Boolean.valueOf(((AbstractC0781q4) obj).mo7854a());
            }
        });
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public void m7745e(long j, BLiveEnterRoom bLiveEnterRoom) {
        if (this.f6169g == null) {
            return;
        }
        if (j == BLiveEnterRoom.ENTER_EFFECT_V0) {
            this.f6164b.mo7855b(bLiveEnterRoom);
            return;
        }
        if (j == BLiveEnterRoom.ENTER_EFFECT_V1) {
            this.f6165c.mo7855b(bLiveEnterRoom);
            return;
        }
        if (j == BLiveEnterRoom.ENTER_EFFECT_V2) {
            this.f6166d.mo7855b(bLiveEnterRoom);
            return;
        }
        if (j == BLiveEnterRoom.ENTER_EFFECT_V3) {
            if (uvr.d().E1()) {
                this.f6168f.mo7855b(bLiveEnterRoom);
                return;
            } else {
                this.f6167e.mo7855b(bLiveEnterRoom);
                return;
            }
        }
        if (j == BLiveEnterRoom.ENTER_EFFECT_V4) {
            this.f6168f.mo7855b(bLiveEnterRoom);
        } else {
            this.f6164b.mo7855b(bLiveEnterRoom);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m7746i() {
        vwb.z(this.f6163a, new e30() { // from class: l.b9s
            public final void call(Object obj) {
                ((AbstractC0781q4) obj).mo7856c();
            }
        });
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public LiveEnterRoomView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6163a = vwb.f0(new AbstractC0781q4[0]);
    }

    public LiveEnterRoomView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6163a = vwb.f0(new AbstractC0781q4[0]);
    }
}
