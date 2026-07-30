package com.p046p1.mobile.putong.live.livingroom.increment.gift.tray;

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
import com.p046p1.mobile.putong.live.base.data.BLiveEnterRoom;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.LiveEnterRoomView;
import java.util.ArrayList;
import p149l.AbstractC19426q4;
import p149l.a9s;
import p149l.bt0;
import p149l.d30;
import p149l.e30;
import p149l.k8s;
import p149l.s7m;
import p149l.t100;
import p149l.uvr;
import p149l.v8s;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.y8s;

/* JADX INFO: loaded from: classes4.dex */
public class LiveEnterRoomView extends FrameLayout implements s7m<k8s> {

    /* JADX INFO: renamed from: a */
    public ArrayList<AbstractC19426q4> f50121a;

    /* JADX INFO: renamed from: b */
    public C12833b f50122b;

    /* JADX INFO: renamed from: c */
    public C12834c f50123c;

    /* JADX INFO: renamed from: d */
    public v8s f50124d;

    /* JADX INFO: renamed from: e */
    public y8s f50125e;

    /* JADX INFO: renamed from: f */
    public a9s f50126f;

    /* JADX INFO: renamed from: g */
    public k8s<?> f50127g;

    public LiveEnterRoomView(Context context) {
        super(context);
        this.f50121a = vwb.m200324f0(new AbstractC19426q4[0]);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m74175b(View view, d30 d30Var) {
        xdl0.m208344M(view, false);
        view.setTranslationY(0.0f);
        d30Var.call();
    }

    /* JADX INFO: renamed from: f */
    public static AnimatorSet m74176f(final View view, boolean z, long j, final d30 d30Var) {
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
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f, t100.m186890d(4.0f));
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
        bt0.m103750w(animatorSet, new Runnable() { // from class: l.d9s
            @Override // java.lang.Runnable
            public final void run() {
                xdl0.m208344M(view, true);
            }
        }, new Runnable() { // from class: l.e9s
            @Override // java.lang.Runnable
            public final void run() {
                LiveEnterRoomView.m74175b(view, d30Var);
            }
        });
        animatorSet.start();
        return animatorSet;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(k8s k8sVar) {
        this.f50127g = k8sVar;
        this.f50122b = new C12833b(k8sVar, this);
        this.f50123c = new C12834c(k8sVar, this);
        this.f50124d = new v8s(k8sVar, this);
        this.f50125e = new y8s(k8sVar, this);
        a9s a9sVar = new a9s(k8sVar, this);
        this.f50126f = a9sVar;
        this.f50121a = vwb.m200324f0(this.f50122b, this.f50123c, this.f50124d, this.f50125e, a9sVar);
    }

    /* JADX INFO: renamed from: d */
    public boolean m74178d() {
        return vwb.m200337m(this.f50121a, new w9j() { // from class: l.c9s
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((AbstractC19426q4) obj).mo74273a());
            }
        });
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public void m74179e(long j, BLiveEnterRoom bLiveEnterRoom) {
        if (this.f50127g == null) {
            return;
        }
        if (j == BLiveEnterRoom.ENTER_EFFECT_V0) {
            this.f50122b.mo74274b(bLiveEnterRoom);
            return;
        }
        if (j == BLiveEnterRoom.ENTER_EFFECT_V1) {
            this.f50123c.mo74274b(bLiveEnterRoom);
            return;
        }
        if (j == BLiveEnterRoom.ENTER_EFFECT_V2) {
            this.f50124d.mo74274b(bLiveEnterRoom);
            return;
        }
        if (j == BLiveEnterRoom.ENTER_EFFECT_V3) {
            if (uvr.m196087d().m162666E1()) {
                this.f50126f.mo74274b(bLiveEnterRoom);
                return;
            } else {
                this.f50125e.mo74274b(bLiveEnterRoom);
                return;
            }
        }
        if (j == BLiveEnterRoom.ENTER_EFFECT_V4) {
            this.f50126f.mo74274b(bLiveEnterRoom);
        } else {
            this.f50122b.mo74274b(bLiveEnterRoom);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m74180i() {
        vwb.m200354z(this.f50121a, new e30() { // from class: l.b9s
            @Override // p149l.e30
            public final void call(Object obj) {
                ((AbstractC19426q4) obj).mo74275c();
            }
        });
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public LiveEnterRoomView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50121a = vwb.m200324f0(new AbstractC19426q4[0]);
    }

    public LiveEnterRoomView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50121a = vwb.m200324f0(new AbstractC19426q4[0]);
    }
}
