package com.p000p1.mobile.putong.live.livingroom.increment.gift.tray;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.live.base.data.BLiveEffect;
import com.p1.mobile.putong.live.base.data.BLiveEnterRoom;
import com.p1.mobile.putong.live.livingroom.view.AdmissionNewMessageView;
import java.util.Objects;
import l.e30;
import l.uep0;
import l.xdl0;
import p002l.AbstractC0781q4;
import p002l.ho2;
import p002l.k8s;
import p002l.p8s;
import p002l.spe;
import p002l.t6c0;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.tray.c */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class C0423c extends AbstractC0781q4 {

    /* JADX INFO: renamed from: d */
    public AdmissionNewMessageView f6208d;

    public <V extends ho2> C0423c(k8s k8sVar, LiveEnterRoomView liveEnterRoomView) {
        super(k8sVar, liveEnterRoomView);
    }

    /* JADX INFO: renamed from: f */
    private void m7864f() {
        if (this.f6208d == null) {
            this.f6208d = LayoutInflater.from(this.f17799c.getContext()).inflate(t6c0.f19780b, (ViewGroup) this.f17799c, false);
        }
        if (this.f6208d.getParent() == null) {
            this.f17799c.addView((View) this.f6208d, xdl0.f, xdl0.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ void m7865g(View view) {
        this.f17797a.m16566Y3(this.f6208d.getUid());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2] */
    /* JADX INFO: renamed from: h */
    public void m7866h(BLiveEffect bLiveEffect) {
        BLiveEnterRoom bLiveEnterRoom = this.f17798b;
        long j = bLiveEnterRoom.animationSizeType;
        if (j == 1) {
            this.f6208d.g(bLiveEnterRoom, bLiveEffect);
        } else {
            if (j != 2 || TextUtils.isEmpty(bLiveEnterRoom.getMixResId())) {
                return;
            }
            this.f17797a.m25548F2().GiftTraysEvent.addGiftTrayDataToList().j(new C0421a.a(1500).m7850f(GiftTrayData.m7712g(this.f17798b, this.f17797a.m25547E2().mo14489A0())).m7849e());
        }
    }

    @Override // p002l.AbstractC0781q4
    /* JADX INFO: renamed from: a */
    public boolean mo7854a() {
        AdmissionNewMessageView admissionNewMessageView = this.f6208d;
        return admissionNewMessageView != null && admissionNewMessageView.e();
    }

    @Override // p002l.AbstractC0781q4
    /* JADX INFO: renamed from: b */
    public void mo7855b(BLiveEnterRoom bLiveEnterRoom) {
        super.mo7855b(bLiveEnterRoom);
        m7864f();
        xdl0.E0(this.f6208d, new View.OnClickListener() { // from class: l.o8s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16439a.m7865g(view);
            }
        });
        m7867i(bLiveEnterRoom);
    }

    @Override // p002l.AbstractC0781q4
    /* JADX INFO: renamed from: c */
    public void mo7856c() {
        super.mo7856c();
        AdmissionNewMessageView admissionNewMessageView = this.f6208d;
        if (admissionNewMessageView != null) {
            admissionNewMessageView.d();
        }
        uep0.E(this.f6208d, (View.OnClickListener) null);
        uep0.v(this.f6208d, false);
    }

    /* JADX INFO: renamed from: i */
    public final void m7867i(BLiveEnterRoom bLiveEnterRoom) {
        this.f17797a.m16567Z3(this.f6208d);
        this.f6208d.l(bLiveEnterRoom);
        if (bLiveEnterRoom.showDuration < 900) {
            bLiveEnterRoom.showDuration = 1000L;
        }
        long j = bLiveEnterRoom.showDuration - 900;
        AdmissionNewMessageView admissionNewMessageView = this.f6208d;
        k8s<?> k8sVar = this.f17797a;
        Objects.requireNonNull(k8sVar);
        this.f6208d.setAnim(LiveEnterRoomView.m7741f(admissionNewMessageView, false, j, new p8s(k8sVar)));
        BLiveEffect bLiveEffectM22602b = spe.m22602b(bLiveEnterRoom.getMixResId(), new e30() { // from class: l.q8s
            public final void call(Object obj) {
                this.f17859a.m7866h((BLiveEffect) obj);
            }
        });
        if (bLiveEffectM22602b == null) {
            return;
        }
        m7866h(bLiveEffectM22602b);
    }
}
