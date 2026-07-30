package com.p000p1.mobile.putong.live.livingroom.common.fansclub.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubRedPacketView;
import com.p1.mobile.putong.live.base.data.BLiveFanBaseGift;
import com.p1.mobile.putong.live.base.data.BLiveFanBaseRedPacketInfo;
import java.util.List;
import l.bt0;
import l.e30;
import l.ffw;
import l.jbu;
import l.roj0;
import l.vwb;
import l.w9j;
import l.xdl0;
import p002l.i3c0;
import p002l.t6c0;
import p002l.xbs;
import rx.c;
import rx.subjects.b;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveFansClubRedPacketView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VImage f5187d;

    /* JADX INFO: renamed from: e */
    public VText f5188e;

    /* JADX INFO: renamed from: f */
    public VText f5189f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f5190g;

    /* JADX INFO: renamed from: h */
    public VImage f5191h;

    /* JADX INFO: renamed from: i */
    public VImage f5192i;

    /* JADX INFO: renamed from: j */
    public VImage f5193j;

    /* JADX INFO: renamed from: k */
    public VText f5194k;

    /* JADX INFO: renamed from: l */
    public VText f5195l;

    /* JADX INFO: renamed from: m */
    public VText f5196m;

    /* JADX INFO: renamed from: n */
    public VText f5197n;

    /* JADX INFO: renamed from: o */
    public VText f5198o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f5199p;

    /* JADX INFO: renamed from: q */
    public VText f5200q;

    /* JADX INFO: renamed from: r */
    public b<roj0> f5201r;

    /* JADX INFO: renamed from: s */
    public ObjectAnimator f5202s;

    public LiveFansClubRedPacketView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5201r = b.b();
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m6511h0(View.OnClickListener onClickListener, View view) {
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m6515l0(View view) {
        xbs.m25825a(this, view);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m6516m0() {
        ObjectAnimator objectAnimator = this.f5202s;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f5202s = null;
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m6517n0() {
        this.f5190g.removeAllViews();
        xdl0.M(this.f5190g, false);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Boolean m6518o0(Long l2) {
        return Boolean.valueOf(!xdl0.O0(this.f5195l));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        this.f5201r.onNext(roj0.a);
        m6516m0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m6515l0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m6519p0(double d, BLiveFanBaseRedPacketInfo bLiveFanBaseRedPacketInfo, Long l2) {
        String strP = jbu.P(Double.valueOf(d).longValue(), true);
        if (TextUtils.isEmpty(strP)) {
            m6524u0(bLiveFanBaseRedPacketInfo);
        } else {
            this.f5195l.setText(getResources().getString(R$string.f3314h4, strP));
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m6520q0() {
        xdl0.M(this.f5193j, false);
    }

    /* JADX INFO: renamed from: r0 */
    public void m6521r0(BLiveFanBaseRedPacketInfo bLiveFanBaseRedPacketInfo) {
        m6516m0();
        m6517n0();
        this.f5187d.setImageResource(i3c0.f12658U1);
        xdl0.M(this.f5188e, false);
        xdl0.M(this.f5198o, false);
        xdl0.M(this.f5199p, false);
        xdl0.M(this.f5200q, false);
        xdl0.M(this.f5194k, false);
        xdl0.M(this.f5196m, false);
        xdl0.M(this.f5197n, true);
        xdl0.M(this.f5195l, false);
        xdl0.M(this.f5189f, !vwb.J(bLiveFanBaseRedPacketInfo.histories));
        xdl0.M(this.f5191h, false);
        xdl0.M(this.f5192i, false);
        xdl0.M(this.f5193j, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s0 */
    public void m6522s0(final BLiveFanBaseRedPacketInfo bLiveFanBaseRedPacketInfo, c<Long> cVar, final View.OnClickListener onClickListener) {
        m6516m0();
        m6523t0(bLiveFanBaseRedPacketInfo.giftContent);
        xdl0.M(this.f5198o, false);
        xdl0.M(this.f5200q, false);
        xdl0.M(this.f5199p, false);
        xdl0.M(this.f5197n, false);
        xdl0.M(this.f5188e, true);
        xdl0.M(this.f5191h, true);
        this.f5191h.setImageResource(i3c0.f12625R1);
        xdl0.E0(this.f5191h, new View.OnClickListener() { // from class: l.tbs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LiveFansClubRedPacketView.m6511h0(onClickListener, view);
            }
        });
        xdl0.M(this.f5192i, true);
        this.f5192i.setImageResource(i3c0.f12669V1);
        xdl0.M(this.f5193j, false);
        xdl0.M(this.f5194k, false);
        xdl0.M(this.f5195l, true);
        final double d = bLiveFanBaseRedPacketInfo.endTime;
        cVar.takeUntil(new w9j() { // from class: l.ubs
            public final Object call(Object obj) {
                return this.f20572a.m6518o0((Long) obj);
            }
        }).takeUntil(this.f5201r).subscribe(ffw.d(new e30() { // from class: l.vbs
            public final void call(Object obj) {
                this.f21061a.m6519p0(d, bLiveFanBaseRedPacketInfo, (Long) obj);
            }
        }));
        xdl0.M(this.f5196m, true);
        this.f5196m.setText(getResources().getString(R$string.f3357j4, bLiveFanBaseRedPacketInfo.senderName));
        this.f5187d.setImageResource(i3c0.f12614Q1);
        xdl0.M(this.f5189f, !vwb.J(bLiveFanBaseRedPacketInfo.histories));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.view.View, com.p1.mobile.putong.live.livingroom.common.fansclub.widget.RedPacketGiftView] */
    /* JADX INFO: renamed from: t0 */
    public final void m6523t0(List<BLiveFanBaseGift> list) {
        this.f5190g.removeAllViews();
        xdl0.M(this.f5190g, true);
        if (list == null) {
            return;
        }
        for (int i = 0; i < Math.min(list.size(), 3); i++) {
            BLiveFanBaseGift bLiveFanBaseGift = list.get(i);
            ?? r3 = (RedPacketGiftView) View.inflate(getContext(), t6c0.f19660R0, null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
            layoutParams.weight = 1.0f;
            this.f5190g.addView((View) r3, layoutParams);
            r3.m6534i0(bLiveFanBaseGift);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u0 */
    public void m6524u0(BLiveFanBaseRedPacketInfo bLiveFanBaseRedPacketInfo) {
        m6516m0();
        xdl0.M(this.f5195l, false);
        xdl0.M(this.f5198o, false);
        xdl0.M(this.f5200q, false);
        xdl0.M(this.f5199p, false);
        xdl0.M(this.f5197n, false);
        m6523t0(bLiveFanBaseRedPacketInfo.giftContent);
        xdl0.M(this.f5188e, true);
        xdl0.M(this.f5191h, true);
        xdl0.E0(this.f5191h, (View.OnClickListener) null);
        this.f5191h.setImageResource(i3c0.f12636S1);
        xdl0.M(this.f5192i, true);
        this.f5192i.setImageResource(i3c0.f12680W1);
        xdl0.M(this.f5193j, false);
        xdl0.M(this.f5194k, true);
        this.f5194k.setText(getResources().getString(R$string.f3270f4));
        xdl0.M(this.f5196m, true);
        this.f5196m.setText(getResources().getString(R$string.f3357j4, bLiveFanBaseRedPacketInfo.senderName));
        this.f5187d.setImageResource(i3c0.f12614Q1);
        xdl0.M(this.f5189f, !vwb.J(bLiveFanBaseRedPacketInfo.histories));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v0 */
    public void m6525v0(BLiveFanBaseRedPacketInfo bLiveFanBaseRedPacketInfo) {
        m6516m0();
        m6517n0();
        this.f5187d.setImageResource(i3c0.f12647T1);
        xdl0.M(this.f5191h, false);
        xdl0.M(this.f5192i, false);
        xdl0.M(this.f5193j, false);
        xdl0.M(this.f5188e, false);
        xdl0.M(this.f5195l, false);
        xdl0.M(this.f5198o, true);
        BLiveFanBaseGift bLiveFanBaseGift = bLiveFanBaseRedPacketInfo.grabbedGiftContent;
        if (bLiveFanBaseGift != null) {
            xdl0.M(this.f5199p, true);
            this.f5199p.setImageURI(bLiveFanBaseGift.giftUrl);
            xdl0.M(this.f5200q, true);
            this.f5200q.setText(bLiveFanBaseGift.giftName + " X" + bLiveFanBaseGift.num);
            xdl0.M(this.f5194k, true);
            this.f5194k.setText(getResources().getString(R$string.f3292g4, bLiveFanBaseGift.expireDay));
            xdl0.M(this.f5196m, true);
            this.f5196m.setText(getResources().getString(R$string.f3357j4, bLiveFanBaseRedPacketInfo.senderName));
        }
        xdl0.M(this.f5189f, !vwb.J(bLiveFanBaseRedPacketInfo.histories));
    }

    /* JADX INFO: renamed from: w0 */
    public void m6526w0(BLiveFanBaseRedPacketInfo bLiveFanBaseRedPacketInfo, c<Long> cVar) {
        m6522s0(bLiveFanBaseRedPacketInfo, cVar, null);
        xdl0.M(this.f5192i, false);
        xdl0.M(this.f5193j, true);
        float rotation = this.f5193j.getRotation();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f5193j, "rotation", rotation, 360.0f + rotation);
        this.f5202s = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(2000L);
        this.f5202s.setInterpolator(new LinearInterpolator());
        this.f5202s.setRepeatCount(-1);
        bt0.f(this.f5202s, new Runnable() { // from class: l.wbs
            @Override // java.lang.Runnable
            public final void run() {
                this.f21606a.m6520q0();
            }
        });
        this.f5202s.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y0 */
    public void m6527y0(BLiveFanBaseRedPacketInfo bLiveFanBaseRedPacketInfo) {
        m6516m0();
        xdl0.M(this.f5195l, false);
        xdl0.M(this.f5198o, false);
        xdl0.M(this.f5200q, false);
        xdl0.M(this.f5199p, false);
        xdl0.M(this.f5197n, false);
        m6523t0(bLiveFanBaseRedPacketInfo.giftContent);
        xdl0.M(this.f5188e, true);
        xdl0.M(this.f5191h, true);
        xdl0.E0(this.f5191h, (View.OnClickListener) null);
        this.f5191h.setImageResource(i3c0.f12636S1);
        xdl0.M(this.f5192i, true);
        this.f5192i.setImageResource(i3c0.f12680W1);
        xdl0.M(this.f5194k, true);
        this.f5194k.setText(getResources().getString(R$string.f3336i4));
        xdl0.M(this.f5196m, true);
        this.f5196m.setText(getResources().getString(R$string.f3357j4, bLiveFanBaseRedPacketInfo.senderName));
        this.f5187d.setImageResource(i3c0.f12614Q1);
        xdl0.M(this.f5189f, !vwb.J(bLiveFanBaseRedPacketInfo.histories));
    }
}
