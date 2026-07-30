package com.p046p1.mobile.putong.live.livingroom.increment.gift.tray;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.ConnectionResult;
import com.p046p1.mobile.putong.live.base.data.BLiveEffect;
import com.p046p1.mobile.putong.live.base.data.BLiveEnterRoom;
import com.p046p1.mobile.putong.live.livingroom.view.AdmissionMessageView;
import p149l.AbstractC19426q4;
import p149l.d30;
import p149l.e30;
import p149l.ho2;
import p149l.k8s;
import p149l.spe;
import p149l.t6c0;
import p149l.uep0;
import p149l.wrj;
import p149l.xdl0;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.tray.b */
/* JADX INFO: loaded from: classes4.dex */
public class C12833b extends AbstractC19426q4 {

    /* JADX INFO: renamed from: d */
    public AdmissionMessageView f50165d;

    public <V extends ho2> C12833b(k8s k8sVar, LiveEnterRoomView liveEnterRoomView) {
        super(k8sVar, liveEnterRoomView);
    }

    @Override // p149l.AbstractC19426q4
    /* JADX INFO: renamed from: a */
    public boolean mo74273a() {
        AdmissionMessageView admissionMessageView = this.f50165d;
        return admissionMessageView != null && admissionMessageView.m76359j();
    }

    @Override // p149l.AbstractC19426q4
    /* JADX INFO: renamed from: b */
    public void mo74274b(BLiveEnterRoom bLiveEnterRoom) {
        super.mo74274b(bLiveEnterRoom);
        m74276g();
        xdl0.m208329E0(this.f50165d, new View.OnClickListener() { // from class: l.l8s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f126853a.m74277h(view);
            }
        });
        m74280k(bLiveEnterRoom);
    }

    @Override // p149l.AbstractC19426q4
    /* JADX INFO: renamed from: c */
    public void mo74275c() {
        super.mo74275c();
        AdmissionMessageView admissionMessageView = this.f50165d;
        if (admissionMessageView != null) {
            admissionMessageView.m76357f();
        }
        uep0.m193310E(this.f50165d, null);
        uep0.m193335v(this.f50165d, false);
    }

    /* JADX INFO: renamed from: g */
    public final void m74276g() {
        if (this.f50165d == null) {
            this.f50165d = (AdmissionMessageView) LayoutInflater.from(this.f152530c.getContext()).inflate(t6c0.f168271a, (ViewGroup) this.f152530c, false);
        }
        if (this.f50165d.getParent() == null) {
            this.f152530c.addView(this.f50165d, xdl0.f192404f, xdl0.f192403e);
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m74277h(View view) {
        this.f152528a.m144967Y3(this.f50165d.getUid());
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m74278i() {
        this.f50165d.m76364o();
        this.f152528a.m144963R3();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: j */
    public final void m74279j(BLiveEffect bLiveEffect) {
        this.f152528a.m206028F2().GiftTraysEvent.addGiftTrayDataToList().mo172463j(new C12832a.a(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED).m74269f(GiftTrayData.m74147g(this.f152529b, this.f152528a.m206027E2().mo132054A0())).m74268e());
    }

    /* JADX INFO: renamed from: k */
    public final void m74280k(BLiveEnterRoom bLiveEnterRoom) {
        long j;
        this.f152528a.m144968Z3(this.f50165d);
        boolean z = bLiveEnterRoom.isWealthHierarchy;
        AdmissionMessageView admissionMessageView = this.f50165d;
        boolean z2 = false;
        if (z) {
            admissionMessageView.m76371v(bLiveEnterRoom);
            if (bLiveEnterRoom.userGrade < 20) {
                j = 2500;
            } else {
                z2 = true;
                j = 3000;
            }
        } else {
            admissionMessageView.m76369t(bLiveEnterRoom);
            if (bLiveEnterRoom.showDuration < 900) {
                bLiveEnterRoom.showDuration = 1000L;
            }
            j = bLiveEnterRoom.showDuration - 900;
        }
        this.f50165d.setAnim(LiveEnterRoomView.m74176f(this.f50165d, z2, j, new d30() { // from class: l.m8s
            @Override // p149l.d30
            public final void call() {
                this.f132612a.m74278i();
            }
        }));
        wrj.m205246n(bLiveEnterRoom);
        BLiveEffect bLiveEffectM185363b = spe.m185363b(bLiveEnterRoom.getMixResId(), new e30() { // from class: l.n8s
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137682a.m74279j((BLiveEffect) obj);
            }
        });
        if (bLiveEffectM185363b == null) {
            return;
        }
        m74279j(bLiveEffectM185363b);
    }
}
