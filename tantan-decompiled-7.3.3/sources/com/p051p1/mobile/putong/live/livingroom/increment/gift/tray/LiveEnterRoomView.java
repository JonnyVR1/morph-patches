package com.p051p1.mobile.putong.live.livingroom.increment.gift.tray;

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
import com.p051p1.mobile.putong.live.base.data.BLiveEnterRoom;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.LiveEnterRoomView;
import java.util.ArrayList;
import p153l.AbstractC19290p4;
import p153l.bbs;
import p153l.bnl0;
import p153l.gt0;
import p153l.iam;
import p153l.jyb;
import p153l.las;
import p153l.qa00;
import p153l.qcj;
import p153l.vxr;
import p153l.was;
import p153l.x20;
import p153l.y20;
import p153l.zas;

/* JADX INFO: loaded from: classes4.dex */
public class LiveEnterRoomView extends FrameLayout implements iam<las> {

    /* JADX INFO: renamed from: a */
    public ArrayList<AbstractC19290p4> f50969a;

    /* JADX INFO: renamed from: b */
    public C12996b f50970b;

    /* JADX INFO: renamed from: c */
    public C12997c f50971c;

    /* JADX INFO: renamed from: d */
    public was f50972d;

    /* JADX INFO: renamed from: e */
    public zas f50973e;

    /* JADX INFO: renamed from: f */
    public bbs f50974f;

    /* JADX INFO: renamed from: g */
    public las<?> f50975g;

    public LiveEnterRoomView(Context context) {
        super(context);
        this.f50969a = jyb.m147507f0(new AbstractC19290p4[0]);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m75358b(View view, x20 x20Var) {
        bnl0.m105524M(view, false);
        view.setTranslationY(0.0f);
        x20Var.call();
    }

    /* JADX INFO: renamed from: f */
    public static AnimatorSet m75359f(final View view, boolean z, long j, final x20 x20Var) {
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
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f, qa00.m175859d(4.0f));
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
        gt0.m132177w(animatorSet, new Runnable() { // from class: l.ebs
            @Override // java.lang.Runnable
            public final void run() {
                bnl0.m105524M(view, true);
            }
        }, new Runnable() { // from class: l.fbs
            @Override // java.lang.Runnable
            public final void run() {
                LiveEnterRoomView.m75358b(view, x20Var);
            }
        });
        animatorSet.start();
        return animatorSet;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(las lasVar) {
        this.f50975g = lasVar;
        this.f50970b = new C12996b(lasVar, this);
        this.f50971c = new C12997c(lasVar, this);
        this.f50972d = new was(lasVar, this);
        this.f50973e = new zas(lasVar, this);
        bbs bbsVar = new bbs(lasVar, this);
        this.f50974f = bbsVar;
        this.f50969a = jyb.m147507f0(this.f50970b, this.f50971c, this.f50972d, this.f50973e, bbsVar);
    }

    /* JADX INFO: renamed from: d */
    public boolean m75361d() {
        return jyb.m147520m(this.f50969a, new qcj() { // from class: l.dbs
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((AbstractC19290p4) obj).mo75456a());
            }
        });
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public void m75362e(long j, BLiveEnterRoom bLiveEnterRoom) {
        if (this.f50975g == null) {
            return;
        }
        if (j == BLiveEnterRoom.ENTER_EFFECT_V0) {
            this.f50970b.mo75457b(bLiveEnterRoom);
            return;
        }
        if (j == BLiveEnterRoom.ENTER_EFFECT_V1) {
            this.f50971c.mo75457b(bLiveEnterRoom);
            return;
        }
        if (j == BLiveEnterRoom.ENTER_EFFECT_V2) {
            this.f50972d.mo75457b(bLiveEnterRoom);
            return;
        }
        if (j == BLiveEnterRoom.ENTER_EFFECT_V3) {
            if (vxr.m203876d().m170973E1()) {
                this.f50974f.mo75457b(bLiveEnterRoom);
                return;
            } else {
                this.f50973e.mo75457b(bLiveEnterRoom);
                return;
            }
        }
        if (j == BLiveEnterRoom.ENTER_EFFECT_V4) {
            this.f50974f.mo75457b(bLiveEnterRoom);
        } else {
            this.f50970b.mo75457b(bLiveEnterRoom);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m75363i() {
        jyb.m147537z(this.f50969a, new y20() { // from class: l.cbs
            @Override // p153l.y20
            public final void call(Object obj) {
                ((AbstractC19290p4) obj).mo75458c();
            }
        });
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public LiveEnterRoomView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50969a = jyb.m147507f0(new AbstractC19290p4[0]);
    }

    public LiveEnterRoomView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50969a = jyb.m147507f0(new AbstractC19290p4[0]);
    }
}
