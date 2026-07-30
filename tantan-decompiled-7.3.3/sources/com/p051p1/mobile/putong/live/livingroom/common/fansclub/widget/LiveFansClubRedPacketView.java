package com.p051p1.mobile.putong.live.livingroom.common.fansclub.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveFanBaseGift;
import com.p051p1.mobile.putong.live.base.data.BLiveFanBaseRedPacketInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubRedPacketView;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22508b;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.dhw;
import p153l.gt0;
import p153l.jyb;
import p153l.kdu;
import p153l.obc0;
import p153l.qcj;
import p153l.uxj0;
import p153l.y20;
import p153l.yds;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveFansClubRedPacketView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VImage f49993d;

    /* JADX INFO: renamed from: e */
    public VText f49994e;

    /* JADX INFO: renamed from: f */
    public VText f49995f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f49996g;

    /* JADX INFO: renamed from: h */
    public VImage f49997h;

    /* JADX INFO: renamed from: i */
    public VImage f49998i;

    /* JADX INFO: renamed from: j */
    public VImage f49999j;

    /* JADX INFO: renamed from: k */
    public VText f50000k;

    /* JADX INFO: renamed from: l */
    public VText f50001l;

    /* JADX INFO: renamed from: m */
    public VText f50002m;

    /* JADX INFO: renamed from: n */
    public VText f50003n;

    /* JADX INFO: renamed from: o */
    public VText f50004o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f50005p;

    /* JADX INFO: renamed from: q */
    public VText f50006q;

    /* JADX INFO: renamed from: r */
    public C22508b<uxj0> f50007r;

    /* JADX INFO: renamed from: s */
    public ObjectAnimator f50008s;

    public LiveFansClubRedPacketView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50007r = C22508b.m222767b();
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m74171h0(View.OnClickListener onClickListener, View view) {
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m74175l0(View view) {
        yds.m215278a(this, view);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m74176m0() {
        ObjectAnimator objectAnimator = this.f50008s;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f50008s = null;
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m74177n0() {
        this.f49996g.removeAllViews();
        bnl0.m105524M(this.f49996g, false);
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Boolean m74178o0(Long l2) {
        return Boolean.valueOf(!bnl0.m105529O0(this.f50001l));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f50007r.onNext(uxj0.f181467a);
        m74176m0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74175l0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m74179p0(double d, BLiveFanBaseRedPacketInfo bLiveFanBaseRedPacketInfo, Long l2) {
        String strM149271P = kdu.m149271P(Double.valueOf(d).longValue(), true);
        if (TextUtils.isEmpty(strM149271P)) {
            m74184u0(bLiveFanBaseRedPacketInfo);
        } else {
            this.f50001l.setText(getResources().getString(R$string.f48120h4, strM149271P));
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m74180q0() {
        bnl0.m105524M(this.f49999j, false);
    }

    /* JADX INFO: renamed from: r0 */
    public void m74181r0(BLiveFanBaseRedPacketInfo bLiveFanBaseRedPacketInfo) {
        m74176m0();
        m74177n0();
        this.f49993d.setImageResource(obc0.f146201U1);
        bnl0.m105524M(this.f49994e, false);
        bnl0.m105524M(this.f50004o, false);
        bnl0.m105524M(this.f50005p, false);
        bnl0.m105524M(this.f50006q, false);
        bnl0.m105524M(this.f50000k, false);
        bnl0.m105524M(this.f50002m, false);
        bnl0.m105524M(this.f50003n, true);
        bnl0.m105524M(this.f50001l, false);
        bnl0.m105524M(this.f49995f, !jyb.m147479J(bLiveFanBaseRedPacketInfo.histories));
        bnl0.m105524M(this.f49997h, false);
        bnl0.m105524M(this.f49998i, false);
        bnl0.m105524M(this.f49999j, false);
    }

    /* JADX INFO: renamed from: s0 */
    public void m74182s0(final BLiveFanBaseRedPacketInfo bLiveFanBaseRedPacketInfo, C22421c<Long> c22421c, final View.OnClickListener onClickListener) {
        m74176m0();
        m74183t0(bLiveFanBaseRedPacketInfo.giftContent);
        bnl0.m105524M(this.f50004o, false);
        bnl0.m105524M(this.f50006q, false);
        bnl0.m105524M(this.f50005p, false);
        bnl0.m105524M(this.f50003n, false);
        bnl0.m105524M(this.f49994e, true);
        bnl0.m105524M(this.f49997h, true);
        this.f49997h.setImageResource(obc0.f146168R1);
        bnl0.m105509E0(this.f49997h, new View.OnClickListener() { // from class: l.uds
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LiveFansClubRedPacketView.m74171h0(onClickListener, view);
            }
        });
        bnl0.m105524M(this.f49998i, true);
        this.f49998i.setImageResource(obc0.f146212V1);
        bnl0.m105524M(this.f49999j, false);
        bnl0.m105524M(this.f50000k, false);
        bnl0.m105524M(this.f50001l, true);
        final double d = bLiveFanBaseRedPacketInfo.endTime;
        c22421c.takeUntil(new qcj() { // from class: l.vds
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f183655a.m74178o0((Long) obj);
            }
        }).takeUntil(this.f50007r).subscribe(dhw.m115825d(new y20() { // from class: l.wds
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188630a.m74179p0(d, bLiveFanBaseRedPacketInfo, (Long) obj);
            }
        }));
        bnl0.m105524M(this.f50002m, true);
        this.f50002m.setText(getResources().getString(R$string.f48163j4, bLiveFanBaseRedPacketInfo.senderName));
        this.f49993d.setImageResource(obc0.f146157Q1);
        bnl0.m105524M(this.f49995f, !jyb.m147479J(bLiveFanBaseRedPacketInfo.histories));
    }

    /* JADX INFO: renamed from: t0 */
    public final void m74183t0(List<BLiveFanBaseGift> list) {
        this.f49996g.removeAllViews();
        bnl0.m105524M(this.f49996g, true);
        if (list == null) {
            return;
        }
        for (int i = 0; i < Math.min(list.size(), 3); i++) {
            BLiveFanBaseGift bLiveFanBaseGift = list.get(i);
            RedPacketGiftView redPacketGiftView = (RedPacketGiftView) View.inflate(getContext(), yec0.f198896R0, null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
            layoutParams.weight = 1.0f;
            this.f49996g.addView(redPacketGiftView, layoutParams);
            redPacketGiftView.m74194i0(bLiveFanBaseGift);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m74184u0(BLiveFanBaseRedPacketInfo bLiveFanBaseRedPacketInfo) {
        m74176m0();
        bnl0.m105524M(this.f50001l, false);
        bnl0.m105524M(this.f50004o, false);
        bnl0.m105524M(this.f50006q, false);
        bnl0.m105524M(this.f50005p, false);
        bnl0.m105524M(this.f50003n, false);
        m74183t0(bLiveFanBaseRedPacketInfo.giftContent);
        bnl0.m105524M(this.f49994e, true);
        bnl0.m105524M(this.f49997h, true);
        bnl0.m105509E0(this.f49997h, null);
        this.f49997h.setImageResource(obc0.f146179S1);
        bnl0.m105524M(this.f49998i, true);
        this.f49998i.setImageResource(obc0.f146223W1);
        bnl0.m105524M(this.f49999j, false);
        bnl0.m105524M(this.f50000k, true);
        this.f50000k.setText(getResources().getString(R$string.f48076f4));
        bnl0.m105524M(this.f50002m, true);
        this.f50002m.setText(getResources().getString(R$string.f48163j4, bLiveFanBaseRedPacketInfo.senderName));
        this.f49993d.setImageResource(obc0.f146157Q1);
        bnl0.m105524M(this.f49995f, !jyb.m147479J(bLiveFanBaseRedPacketInfo.histories));
    }

    /* JADX INFO: renamed from: v0 */
    public void m74185v0(BLiveFanBaseRedPacketInfo bLiveFanBaseRedPacketInfo) {
        m74176m0();
        m74177n0();
        this.f49993d.setImageResource(obc0.f146190T1);
        bnl0.m105524M(this.f49997h, false);
        bnl0.m105524M(this.f49998i, false);
        bnl0.m105524M(this.f49999j, false);
        bnl0.m105524M(this.f49994e, false);
        bnl0.m105524M(this.f50001l, false);
        bnl0.m105524M(this.f50004o, true);
        BLiveFanBaseGift bLiveFanBaseGift = bLiveFanBaseRedPacketInfo.grabbedGiftContent;
        if (bLiveFanBaseGift != null) {
            bnl0.m105524M(this.f50005p, true);
            this.f50005p.setImageURI(bLiveFanBaseGift.giftUrl);
            bnl0.m105524M(this.f50006q, true);
            this.f50006q.setText(bLiveFanBaseGift.giftName + " X" + bLiveFanBaseGift.num);
            bnl0.m105524M(this.f50000k, true);
            this.f50000k.setText(getResources().getString(R$string.f48098g4, bLiveFanBaseGift.expireDay));
            bnl0.m105524M(this.f50002m, true);
            this.f50002m.setText(getResources().getString(R$string.f48163j4, bLiveFanBaseRedPacketInfo.senderName));
        }
        bnl0.m105524M(this.f49995f, !jyb.m147479J(bLiveFanBaseRedPacketInfo.histories));
    }

    /* JADX INFO: renamed from: w0 */
    public void m74186w0(BLiveFanBaseRedPacketInfo bLiveFanBaseRedPacketInfo, C22421c<Long> c22421c) {
        m74182s0(bLiveFanBaseRedPacketInfo, c22421c, null);
        bnl0.m105524M(this.f49998i, false);
        bnl0.m105524M(this.f49999j, true);
        float rotation = this.f49999j.getRotation();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f49999j, BLiveGiftItem.TYPE_ROTATION, rotation, 360.0f + rotation);
        this.f50008s = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(2000L);
        this.f50008s.setInterpolator(new LinearInterpolator());
        this.f50008s.setRepeatCount(-1);
        gt0.m132160f(this.f50008s, new Runnable() { // from class: l.xds
            @Override // java.lang.Runnable
            public final void run() {
                this.f193635a.m74180q0();
            }
        });
        this.f50008s.start();
    }

    /* JADX INFO: renamed from: y0 */
    public void m74187y0(BLiveFanBaseRedPacketInfo bLiveFanBaseRedPacketInfo) {
        m74176m0();
        bnl0.m105524M(this.f50001l, false);
        bnl0.m105524M(this.f50004o, false);
        bnl0.m105524M(this.f50006q, false);
        bnl0.m105524M(this.f50005p, false);
        bnl0.m105524M(this.f50003n, false);
        m74183t0(bLiveFanBaseRedPacketInfo.giftContent);
        bnl0.m105524M(this.f49994e, true);
        bnl0.m105524M(this.f49997h, true);
        bnl0.m105509E0(this.f49997h, null);
        this.f49997h.setImageResource(obc0.f146179S1);
        bnl0.m105524M(this.f49998i, true);
        this.f49998i.setImageResource(obc0.f146223W1);
        bnl0.m105524M(this.f50000k, true);
        this.f50000k.setText(getResources().getString(R$string.f48142i4));
        bnl0.m105524M(this.f50002m, true);
        this.f50002m.setText(getResources().getString(R$string.f48163j4, bLiveFanBaseRedPacketInfo.senderName));
        this.f49993d.setImageResource(obc0.f146157Q1);
        bnl0.m105524M(this.f49995f, !jyb.m147479J(bLiveFanBaseRedPacketInfo.histories));
    }
}
