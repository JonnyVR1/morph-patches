package com.p051p1.mobile.putong.live.livingroom.increment.gift.tray;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.ConnectionResult;
import com.p051p1.mobile.putong.live.base.data.BLiveEffect;
import com.p051p1.mobile.putong.live.base.data.BLiveEnterRoom;
import com.p051p1.mobile.putong.live.livingroom.view.AdmissionMessageView;
import p153l.AbstractC19290p4;
import p153l.bnl0;
import p153l.las;
import p153l.muj;
import p153l.oo2;
import p153l.wqe;
import p153l.x20;
import p153l.y20;
import p153l.yec0;
import p153l.ynp0;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.tray.b */
/* JADX INFO: loaded from: classes4.dex */
public class C12996b extends AbstractC19290p4 {

    /* JADX INFO: renamed from: d */
    public AdmissionMessageView f51013d;

    public <V extends oo2> C12996b(las lasVar, LiveEnterRoomView liveEnterRoomView) {
        super(lasVar, liveEnterRoomView);
    }

    @Override // p153l.AbstractC19290p4
    /* JADX INFO: renamed from: a */
    public boolean mo75456a() {
        AdmissionMessageView admissionMessageView = this.f51013d;
        return admissionMessageView != null && admissionMessageView.m77542j();
    }

    @Override // p153l.AbstractC19290p4
    /* JADX INFO: renamed from: b */
    public void mo75457b(BLiveEnterRoom bLiveEnterRoom) {
        super.mo75457b(bLiveEnterRoom);
        m75459g();
        bnl0.m105509E0(this.f51013d, new View.OnClickListener() { // from class: l.mas
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135591a.m75460h(view);
            }
        });
        m75463k(bLiveEnterRoom);
    }

    @Override // p153l.AbstractC19290p4
    /* JADX INFO: renamed from: c */
    public void mo75458c() {
        super.mo75458c();
        AdmissionMessageView admissionMessageView = this.f51013d;
        if (admissionMessageView != null) {
            admissionMessageView.m77540f();
        }
        ynp0.m216920E(this.f51013d, null);
        ynp0.m216945v(this.f51013d, false);
    }

    /* JADX INFO: renamed from: g */
    public final void m75459g() {
        if (this.f51013d == null) {
            this.f51013d = (AdmissionMessageView) LayoutInflater.from(this.f150482c.getContext()).inflate(yec0.f199003a, (ViewGroup) this.f150482c, false);
        }
        if (this.f51013d.getParent() == null) {
            this.f150482c.addView(this.f51013d, bnl0.f77545f, bnl0.f77544e);
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m75460h(View view) {
        this.f150480a.m153537Y3(this.f51013d.getUid());
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m75461i() {
        this.f51013d.m77547o();
        this.f150480a.m153533R3();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    /* JADX INFO: renamed from: j */
    public final void m75462j(BLiveEffect bLiveEffect) {
        this.f150480a.m213811F2().GiftTraysEvent.addGiftTrayDataToList().mo199273j(new C12995a.a(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED).m75452f(GiftTrayData.m75330g(this.f150481b, this.f150480a.m213810E2().mo118362A0())).m75451e());
    }

    /* JADX INFO: renamed from: k */
    public final void m75463k(BLiveEnterRoom bLiveEnterRoom) {
        long j;
        this.f150480a.m153538Z3(this.f51013d);
        boolean z = bLiveEnterRoom.isWealthHierarchy;
        AdmissionMessageView admissionMessageView = this.f51013d;
        boolean z2 = false;
        if (z) {
            admissionMessageView.m77554v(bLiveEnterRoom);
            if (bLiveEnterRoom.userGrade < 20) {
                j = 2500;
            } else {
                z2 = true;
                j = 3000;
            }
        } else {
            admissionMessageView.m77552t(bLiveEnterRoom);
            if (bLiveEnterRoom.showDuration < 900) {
                bLiveEnterRoom.showDuration = 1000L;
            }
            j = bLiveEnterRoom.showDuration - 900;
        }
        this.f51013d.setAnim(LiveEnterRoomView.m75359f(this.f51013d, z2, j, new x20() { // from class: l.nas
            @Override // p153l.x20
            public final void call() {
                this.f141041a.m75461i();
            }
        }));
        muj.m160210n(bLiveEnterRoom);
        BLiveEffect bLiveEffectM207507b = wqe.m207507b(bLiveEnterRoom.getMixResId(), new y20() { // from class: l.oas
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f145752a.m75462j((BLiveEffect) obj);
            }
        });
        if (bLiveEffectM207507b == null) {
            return;
        }
        m75462j(bLiveEffectM207507b);
    }
}
