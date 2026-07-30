package com.p000p1.mobile.putong.live.livingroom.increment.gift.tray;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.live.base.data.BLiveEffect;
import com.p1.mobile.putong.live.base.data.BLiveEnterRoom;
import com.p1.mobile.putong.live.livingroom.view.AdmissionMessageView;
import l.d30;
import l.e30;
import l.uep0;
import l.xdl0;
import p002l.AbstractC0781q4;
import p002l.ho2;
import p002l.k8s;
import p002l.spe;
import p002l.t6c0;
import p002l.wrj;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.tray.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class C0422b extends AbstractC0781q4 {

    /* JADX INFO: renamed from: d */
    public AdmissionMessageView f6207d;

    public <V extends ho2> C0422b(k8s k8sVar, LiveEnterRoomView liveEnterRoomView) {
        super(k8sVar, liveEnterRoomView);
    }

    @Override // p002l.AbstractC0781q4
    /* JADX INFO: renamed from: a */
    public boolean mo7854a() {
        AdmissionMessageView admissionMessageView = this.f6207d;
        return admissionMessageView != null && admissionMessageView.j();
    }

    @Override // p002l.AbstractC0781q4
    /* JADX INFO: renamed from: b */
    public void mo7855b(BLiveEnterRoom bLiveEnterRoom) {
        super.mo7855b(bLiveEnterRoom);
        m7857g();
        xdl0.E0(this.f6207d, new View.OnClickListener() { // from class: l.l8s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14737a.m7858h(view);
            }
        });
        m7861k(bLiveEnterRoom);
    }

    @Override // p002l.AbstractC0781q4
    /* JADX INFO: renamed from: c */
    public void mo7856c() {
        super.mo7856c();
        AdmissionMessageView admissionMessageView = this.f6207d;
        if (admissionMessageView != null) {
            admissionMessageView.f();
        }
        uep0.E(this.f6207d, (View.OnClickListener) null);
        uep0.v(this.f6207d, false);
    }

    /* JADX INFO: renamed from: g */
    public final void m7857g() {
        if (this.f6207d == null) {
            this.f6207d = LayoutInflater.from(this.f17799c.getContext()).inflate(t6c0.f19767a, (ViewGroup) this.f17799c, false);
        }
        if (this.f6207d.getParent() == null) {
            this.f17799c.addView((View) this.f6207d, xdl0.f, xdl0.e);
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m7858h(View view) {
        this.f17797a.m16566Y3(this.f6207d.getUid());
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m7859i() {
        this.f6207d.o();
        this.f17797a.m16561R3();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: j */
    public final void m7860j(BLiveEffect bLiveEffect) {
        this.f17797a.m25548F2().GiftTraysEvent.addGiftTrayDataToList().j(new C0421a.a(1500).m7850f(GiftTrayData.m7712g(this.f17798b, this.f17797a.m25547E2().mo14489A0())).m7849e());
    }

    /* JADX INFO: renamed from: k */
    public final void m7861k(BLiveEnterRoom bLiveEnterRoom) {
        long j;
        this.f17797a.m16567Z3(this.f6207d);
        boolean z = bLiveEnterRoom.isWealthHierarchy;
        AdmissionMessageView admissionMessageView = this.f6207d;
        boolean z2 = false;
        if (z) {
            admissionMessageView.v(bLiveEnterRoom);
            if (bLiveEnterRoom.userGrade < 20) {
                j = 2500;
            } else {
                z2 = true;
                j = 3000;
            }
        } else {
            admissionMessageView.t(bLiveEnterRoom);
            if (bLiveEnterRoom.showDuration < 900) {
                bLiveEnterRoom.showDuration = 1000L;
            }
            j = bLiveEnterRoom.showDuration - 900;
        }
        this.f6207d.setAnim(LiveEnterRoomView.m7741f(this.f6207d, z2, j, new d30() { // from class: l.m8s
            public final void call() {
                this.f15286a.m7859i();
            }
        }));
        wrj.m25418n(bLiveEnterRoom);
        BLiveEffect bLiveEffectM22602b = spe.m22602b(bLiveEnterRoom.getMixResId(), new e30() { // from class: l.n8s
            public final void call(Object obj) {
                this.f15864a.m7860j((BLiveEffect) obj);
            }
        });
        if (bLiveEffectM22602b == null) {
            return;
        }
        m7860j(bLiveEffectM22602b);
    }
}
