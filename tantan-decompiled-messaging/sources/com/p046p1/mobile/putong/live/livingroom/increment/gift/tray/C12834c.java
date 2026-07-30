package com.p046p1.mobile.putong.live.livingroom.increment.gift.tray;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.ConnectionResult;
import com.p046p1.mobile.putong.live.base.data.BLiveEffect;
import com.p046p1.mobile.putong.live.base.data.BLiveEnterRoom;
import com.p046p1.mobile.putong.live.livingroom.view.AdmissionNewMessageView;
import java.util.Objects;
import p149l.AbstractC19426q4;
import p149l.e30;
import p149l.ho2;
import p149l.k8s;
import p149l.p8s;
import p149l.spe;
import p149l.t6c0;
import p149l.uep0;
import p149l.xdl0;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.tray.c */
/* JADX INFO: loaded from: classes4.dex */
public class C12834c extends AbstractC19426q4 {

    /* JADX INFO: renamed from: d */
    public AdmissionNewMessageView f50166d;

    public <V extends ho2> C12834c(k8s k8sVar, LiveEnterRoomView liveEnterRoomView) {
        super(k8sVar, liveEnterRoomView);
    }

    /* JADX INFO: renamed from: f */
    private void m74283f() {
        if (this.f50166d == null) {
            this.f50166d = (AdmissionNewMessageView) LayoutInflater.from(this.f152530c.getContext()).inflate(t6c0.f168284b, (ViewGroup) this.f152530c, false);
        }
        if (this.f50166d.getParent() == null) {
            this.f152530c.addView(this.f50166d, xdl0.f192404f, xdl0.f192403e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ void m74284g(View view) {
        this.f152528a.m144967Y3(this.f50166d.getUid());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2] */
    /* JADX INFO: renamed from: h */
    public void m74285h(BLiveEffect bLiveEffect) {
        BLiveEnterRoom bLiveEnterRoom = this.f152529b;
        long j = bLiveEnterRoom.animationSizeType;
        if (j == 1) {
            this.f50166d.m76379g(bLiveEnterRoom, bLiveEffect);
        } else {
            if (j != 2 || TextUtils.isEmpty(bLiveEnterRoom.getMixResId())) {
                return;
            }
            this.f152528a.m206028F2().GiftTraysEvent.addGiftTrayDataToList().mo172463j(new C12832a.a(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED).m74269f(GiftTrayData.m74147g(this.f152529b, this.f152528a.m206027E2().mo132054A0())).m74268e());
        }
    }

    @Override // p149l.AbstractC19426q4
    /* JADX INFO: renamed from: a */
    public boolean mo74273a() {
        AdmissionNewMessageView admissionNewMessageView = this.f50166d;
        return admissionNewMessageView != null && admissionNewMessageView.m76377e();
    }

    @Override // p149l.AbstractC19426q4
    /* JADX INFO: renamed from: b */
    public void mo74274b(BLiveEnterRoom bLiveEnterRoom) {
        super.mo74274b(bLiveEnterRoom);
        m74283f();
        xdl0.m208329E0(this.f50166d, new View.OnClickListener() { // from class: l.o8s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f142669a.m74284g(view);
            }
        });
        m74286i(bLiveEnterRoom);
    }

    @Override // p149l.AbstractC19426q4
    /* JADX INFO: renamed from: c */
    public void mo74275c() {
        super.mo74275c();
        AdmissionNewMessageView admissionNewMessageView = this.f50166d;
        if (admissionNewMessageView != null) {
            admissionNewMessageView.m76376d();
        }
        uep0.m193310E(this.f50166d, null);
        uep0.m193335v(this.f50166d, false);
    }

    /* JADX INFO: renamed from: i */
    public final void m74286i(BLiveEnterRoom bLiveEnterRoom) {
        this.f152528a.m144968Z3(this.f50166d);
        this.f50166d.m76384l(bLiveEnterRoom);
        if (bLiveEnterRoom.showDuration < 900) {
            bLiveEnterRoom.showDuration = 1000L;
        }
        long j = bLiveEnterRoom.showDuration - 900;
        AdmissionNewMessageView admissionNewMessageView = this.f50166d;
        k8s<?> k8sVar = this.f152528a;
        Objects.requireNonNull(k8sVar);
        this.f50166d.setAnim(LiveEnterRoomView.m74176f(admissionNewMessageView, false, j, new p8s(k8sVar)));
        BLiveEffect bLiveEffectM185363b = spe.m185363b(bLiveEnterRoom.getMixResId(), new e30() { // from class: l.q8s
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153215a.m74285h((BLiveEffect) obj);
            }
        });
        if (bLiveEffectM185363b == null) {
            return;
        }
        m74285h(bLiveEffectM185363b);
    }
}
