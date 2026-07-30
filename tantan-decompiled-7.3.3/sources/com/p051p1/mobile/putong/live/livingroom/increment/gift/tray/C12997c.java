package com.p051p1.mobile.putong.live.livingroom.increment.gift.tray;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.ConnectionResult;
import com.p051p1.mobile.putong.live.base.data.BLiveEffect;
import com.p051p1.mobile.putong.live.base.data.BLiveEnterRoom;
import com.p051p1.mobile.putong.live.livingroom.view.AdmissionNewMessageView;
import java.util.Objects;
import p153l.AbstractC19290p4;
import p153l.bnl0;
import p153l.las;
import p153l.oo2;
import p153l.qas;
import p153l.wqe;
import p153l.y20;
import p153l.yec0;
import p153l.ynp0;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.tray.c */
/* JADX INFO: loaded from: classes4.dex */
public class C12997c extends AbstractC19290p4 {

    /* JADX INFO: renamed from: d */
    public AdmissionNewMessageView f51014d;

    public <V extends oo2> C12997c(las lasVar, LiveEnterRoomView liveEnterRoomView) {
        super(lasVar, liveEnterRoomView);
    }

    /* JADX INFO: renamed from: f */
    private void m75466f() {
        if (this.f51014d == null) {
            this.f51014d = (AdmissionNewMessageView) LayoutInflater.from(this.f150482c.getContext()).inflate(yec0.f199016b, (ViewGroup) this.f150482c, false);
        }
        if (this.f51014d.getParent() == null) {
            this.f150482c.addView(this.f51014d, bnl0.f77545f, bnl0.f77544e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ void m75467g(View view) {
        this.f150480a.m153537Y3(this.f51014d.getUid());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.oo2] */
    /* JADX INFO: renamed from: h */
    public void m75468h(BLiveEffect bLiveEffect) {
        BLiveEnterRoom bLiveEnterRoom = this.f150481b;
        long j = bLiveEnterRoom.animationSizeType;
        if (j == 1) {
            this.f51014d.m77562g(bLiveEnterRoom, bLiveEffect);
        } else {
            if (j != 2 || TextUtils.isEmpty(bLiveEnterRoom.getMixResId())) {
                return;
            }
            this.f150480a.m213811F2().GiftTraysEvent.addGiftTrayDataToList().mo199273j(new C12995a.a(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED).m75452f(GiftTrayData.m75330g(this.f150481b, this.f150480a.m213810E2().mo118362A0())).m75451e());
        }
    }

    @Override // p153l.AbstractC19290p4
    /* JADX INFO: renamed from: a */
    public boolean mo75456a() {
        AdmissionNewMessageView admissionNewMessageView = this.f51014d;
        return admissionNewMessageView != null && admissionNewMessageView.m77560e();
    }

    @Override // p153l.AbstractC19290p4
    /* JADX INFO: renamed from: b */
    public void mo75457b(BLiveEnterRoom bLiveEnterRoom) {
        super.mo75457b(bLiveEnterRoom);
        m75466f();
        bnl0.m105509E0(this.f51014d, new View.OnClickListener() { // from class: l.pas
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f151323a.m75467g(view);
            }
        });
        m75469i(bLiveEnterRoom);
    }

    @Override // p153l.AbstractC19290p4
    /* JADX INFO: renamed from: c */
    public void mo75458c() {
        super.mo75458c();
        AdmissionNewMessageView admissionNewMessageView = this.f51014d;
        if (admissionNewMessageView != null) {
            admissionNewMessageView.m77559d();
        }
        ynp0.m216920E(this.f51014d, null);
        ynp0.m216945v(this.f51014d, false);
    }

    /* JADX INFO: renamed from: i */
    public final void m75469i(BLiveEnterRoom bLiveEnterRoom) {
        this.f150480a.m153538Z3(this.f51014d);
        this.f51014d.m77567l(bLiveEnterRoom);
        if (bLiveEnterRoom.showDuration < 900) {
            bLiveEnterRoom.showDuration = 1000L;
        }
        long j = bLiveEnterRoom.showDuration - 900;
        AdmissionNewMessageView admissionNewMessageView = this.f51014d;
        las<?> lasVar = this.f150480a;
        Objects.requireNonNull(lasVar);
        this.f51014d.setAnim(LiveEnterRoomView.m75359f(admissionNewMessageView, false, j, new qas(lasVar)));
        BLiveEffect bLiveEffectM207507b = wqe.m207507b(bLiveEnterRoom.getMixResId(), new y20() { // from class: l.ras
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161943a.m75468h((BLiveEffect) obj);
            }
        });
        if (bLiveEffectM207507b == null) {
            return;
        }
        m75468h(bLiveEffectM207507b);
    }
}
