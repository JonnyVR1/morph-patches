package com.p046p1.mobile.putong.live.livingroom.common.fansclub.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveFanBaseGift;
import com.p046p1.mobile.putong.live.base.data.BLiveFanBaseRedPacketInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubRedPacketView;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22393b;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.bt0;
import p149l.e30;
import p149l.ffw;
import p149l.i3c0;
import p149l.jbu;
import p149l.roj0;
import p149l.t6c0;
import p149l.vwb;
import p149l.w9j;
import p149l.xbs;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveFansClubRedPacketView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VImage f49145d;

    /* JADX INFO: renamed from: e */
    public VText f49146e;

    /* JADX INFO: renamed from: f */
    public VText f49147f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f49148g;

    /* JADX INFO: renamed from: h */
    public VImage f49149h;

    /* JADX INFO: renamed from: i */
    public VImage f49150i;

    /* JADX INFO: renamed from: j */
    public VImage f49151j;

    /* JADX INFO: renamed from: k */
    public VText f49152k;

    /* JADX INFO: renamed from: l */
    public VText f49153l;

    /* JADX INFO: renamed from: m */
    public VText f49154m;

    /* JADX INFO: renamed from: n */
    public VText f49155n;

    /* JADX INFO: renamed from: o */
    public VText f49156o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f49157p;

    /* JADX INFO: renamed from: q */
    public VText f49158q;

    /* JADX INFO: renamed from: r */
    public C22393b<roj0> f49159r;

    /* JADX INFO: renamed from: s */
    public ObjectAnimator f49160s;

    public LiveFansClubRedPacketView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49159r = C22393b.m221521b();
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m72988h0(View.OnClickListener onClickListener, View view) {
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m72992l0(View view) {
        xbs.m207733a(this, view);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m72993m0() {
        ObjectAnimator objectAnimator = this.f49160s;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f49160s = null;
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m72994n0() {
        this.f49148g.removeAllViews();
        xdl0.m208344M(this.f49148g, false);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Boolean m72995o0(Long l2) {
        return Boolean.valueOf(!xdl0.m208349O0(this.f49153l));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f49159r.onNext(roj0.f160388a);
        m72993m0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72992l0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m72996p0(double d, BLiveFanBaseRedPacketInfo bLiveFanBaseRedPacketInfo, Long l2) {
        String strM140808P = jbu.m140808P(Double.valueOf(d).longValue(), true);
        if (TextUtils.isEmpty(strM140808P)) {
            m73001u0(bLiveFanBaseRedPacketInfo);
        } else {
            this.f49153l.setText(getResources().getString(R$string.f47272h4, strM140808P));
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m72997q0() {
        xdl0.m208344M(this.f49151j, false);
    }

    /* JADX INFO: renamed from: r0 */
    public void m72998r0(BLiveFanBaseRedPacketInfo bLiveFanBaseRedPacketInfo) {
        m72993m0();
        m72994n0();
        this.f49145d.setImageResource(i3c0.f110873U1);
        xdl0.m208344M(this.f49146e, false);
        xdl0.m208344M(this.f49156o, false);
        xdl0.m208344M(this.f49157p, false);
        xdl0.m208344M(this.f49158q, false);
        xdl0.m208344M(this.f49152k, false);
        xdl0.m208344M(this.f49154m, false);
        xdl0.m208344M(this.f49155n, true);
        xdl0.m208344M(this.f49153l, false);
        xdl0.m208344M(this.f49147f, !vwb.m200296J(bLiveFanBaseRedPacketInfo.histories));
        xdl0.m208344M(this.f49149h, false);
        xdl0.m208344M(this.f49150i, false);
        xdl0.m208344M(this.f49151j, false);
    }

    /* JADX INFO: renamed from: s0 */
    public void m72999s0(final BLiveFanBaseRedPacketInfo bLiveFanBaseRedPacketInfo, C22306c<Long> c22306c, final View.OnClickListener onClickListener) {
        m72993m0();
        m73000t0(bLiveFanBaseRedPacketInfo.giftContent);
        xdl0.m208344M(this.f49156o, false);
        xdl0.m208344M(this.f49158q, false);
        xdl0.m208344M(this.f49157p, false);
        xdl0.m208344M(this.f49155n, false);
        xdl0.m208344M(this.f49146e, true);
        xdl0.m208344M(this.f49149h, true);
        this.f49149h.setImageResource(i3c0.f110840R1);
        xdl0.m208329E0(this.f49149h, new View.OnClickListener() { // from class: l.tbs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LiveFansClubRedPacketView.m72988h0(onClickListener, view);
            }
        });
        xdl0.m208344M(this.f49150i, true);
        this.f49150i.setImageResource(i3c0.f110884V1);
        xdl0.m208344M(this.f49151j, false);
        xdl0.m208344M(this.f49152k, false);
        xdl0.m208344M(this.f49153l, true);
        final double d = bLiveFanBaseRedPacketInfo.endTime;
        c22306c.takeUntil(new w9j() { // from class: l.ubs
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f175750a.m72995o0((Long) obj);
            }
        }).takeUntil(this.f49159r).subscribe(ffw.m121193d(new e30() { // from class: l.vbs
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f180872a.m72996p0(d, bLiveFanBaseRedPacketInfo, (Long) obj);
            }
        }));
        xdl0.m208344M(this.f49154m, true);
        this.f49154m.setText(getResources().getString(R$string.f47315j4, bLiveFanBaseRedPacketInfo.senderName));
        this.f49145d.setImageResource(i3c0.f110829Q1);
        xdl0.m208344M(this.f49147f, !vwb.m200296J(bLiveFanBaseRedPacketInfo.histories));
    }

    /* JADX INFO: renamed from: t0 */
    public final void m73000t0(List<BLiveFanBaseGift> list) {
        this.f49148g.removeAllViews();
        xdl0.m208344M(this.f49148g, true);
        if (list == null) {
            return;
        }
        for (int i = 0; i < Math.min(list.size(), 3); i++) {
            BLiveFanBaseGift bLiveFanBaseGift = list.get(i);
            RedPacketGiftView redPacketGiftView = (RedPacketGiftView) View.inflate(getContext(), t6c0.f168164R0, null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
            layoutParams.weight = 1.0f;
            this.f49148g.addView(redPacketGiftView, layoutParams);
            redPacketGiftView.m73011i0(bLiveFanBaseGift);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m73001u0(BLiveFanBaseRedPacketInfo bLiveFanBaseRedPacketInfo) {
        m72993m0();
        xdl0.m208344M(this.f49153l, false);
        xdl0.m208344M(this.f49156o, false);
        xdl0.m208344M(this.f49158q, false);
        xdl0.m208344M(this.f49157p, false);
        xdl0.m208344M(this.f49155n, false);
        m73000t0(bLiveFanBaseRedPacketInfo.giftContent);
        xdl0.m208344M(this.f49146e, true);
        xdl0.m208344M(this.f49149h, true);
        xdl0.m208329E0(this.f49149h, null);
        this.f49149h.setImageResource(i3c0.f110851S1);
        xdl0.m208344M(this.f49150i, true);
        this.f49150i.setImageResource(i3c0.f110895W1);
        xdl0.m208344M(this.f49151j, false);
        xdl0.m208344M(this.f49152k, true);
        this.f49152k.setText(getResources().getString(R$string.f47228f4));
        xdl0.m208344M(this.f49154m, true);
        this.f49154m.setText(getResources().getString(R$string.f47315j4, bLiveFanBaseRedPacketInfo.senderName));
        this.f49145d.setImageResource(i3c0.f110829Q1);
        xdl0.m208344M(this.f49147f, !vwb.m200296J(bLiveFanBaseRedPacketInfo.histories));
    }

    /* JADX INFO: renamed from: v0 */
    public void m73002v0(BLiveFanBaseRedPacketInfo bLiveFanBaseRedPacketInfo) {
        m72993m0();
        m72994n0();
        this.f49145d.setImageResource(i3c0.f110862T1);
        xdl0.m208344M(this.f49149h, false);
        xdl0.m208344M(this.f49150i, false);
        xdl0.m208344M(this.f49151j, false);
        xdl0.m208344M(this.f49146e, false);
        xdl0.m208344M(this.f49153l, false);
        xdl0.m208344M(this.f49156o, true);
        BLiveFanBaseGift bLiveFanBaseGift = bLiveFanBaseRedPacketInfo.grabbedGiftContent;
        if (bLiveFanBaseGift != null) {
            xdl0.m208344M(this.f49157p, true);
            this.f49157p.setImageURI(bLiveFanBaseGift.giftUrl);
            xdl0.m208344M(this.f49158q, true);
            this.f49158q.setText(bLiveFanBaseGift.giftName + " X" + bLiveFanBaseGift.num);
            xdl0.m208344M(this.f49152k, true);
            this.f49152k.setText(getResources().getString(R$string.f47250g4, bLiveFanBaseGift.expireDay));
            xdl0.m208344M(this.f49154m, true);
            this.f49154m.setText(getResources().getString(R$string.f47315j4, bLiveFanBaseRedPacketInfo.senderName));
        }
        xdl0.m208344M(this.f49147f, !vwb.m200296J(bLiveFanBaseRedPacketInfo.histories));
    }

    /* JADX INFO: renamed from: w0 */
    public void m73003w0(BLiveFanBaseRedPacketInfo bLiveFanBaseRedPacketInfo, C22306c<Long> c22306c) {
        m72999s0(bLiveFanBaseRedPacketInfo, c22306c, null);
        xdl0.m208344M(this.f49150i, false);
        xdl0.m208344M(this.f49151j, true);
        float rotation = this.f49151j.getRotation();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f49151j, BLiveGiftItem.TYPE_ROTATION, rotation, 360.0f + rotation);
        this.f49160s = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(2000L);
        this.f49160s.setInterpolator(new LinearInterpolator());
        this.f49160s.setRepeatCount(-1);
        bt0.m103733f(this.f49160s, new Runnable() { // from class: l.wbs
            @Override // java.lang.Runnable
            public final void run() {
                this.f185615a.m72997q0();
            }
        });
        this.f49160s.start();
    }

    /* JADX INFO: renamed from: y0 */
    public void m73004y0(BLiveFanBaseRedPacketInfo bLiveFanBaseRedPacketInfo) {
        m72993m0();
        xdl0.m208344M(this.f49153l, false);
        xdl0.m208344M(this.f49156o, false);
        xdl0.m208344M(this.f49158q, false);
        xdl0.m208344M(this.f49157p, false);
        xdl0.m208344M(this.f49155n, false);
        m73000t0(bLiveFanBaseRedPacketInfo.giftContent);
        xdl0.m208344M(this.f49146e, true);
        xdl0.m208344M(this.f49149h, true);
        xdl0.m208329E0(this.f49149h, null);
        this.f49149h.setImageResource(i3c0.f110851S1);
        xdl0.m208344M(this.f49150i, true);
        this.f49150i.setImageResource(i3c0.f110895W1);
        xdl0.m208344M(this.f49152k, true);
        this.f49152k.setText(getResources().getString(R$string.f47294i4));
        xdl0.m208344M(this.f49154m, true);
        this.f49154m.setText(getResources().getString(R$string.f47315j4, bLiveFanBaseRedPacketInfo.senderName));
        this.f49145d.setImageResource(i3c0.f110829Q1);
        xdl0.m208344M(this.f49147f, !vwb.m200296J(bLiveFanBaseRedPacketInfo.histories));
    }
}
