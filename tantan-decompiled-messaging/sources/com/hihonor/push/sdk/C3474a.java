package com.hihonor.push.sdk;

/* JADX INFO: renamed from: com.hihonor.push.sdk.a */
/* JADX INFO: loaded from: classes7.dex */
public class C3474a implements InterfaceC3504k0<HonorPushDataMsg> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ HonorMessageService f11839a;

    public C3474a(HonorMessageService honorMessageService) {
        this.f11839a = honorMessageService;
    }

    @Override // com.hihonor.push.sdk.InterfaceC3504k0
    /* JADX INFO: renamed from: a */
    public void mo17478a(C3476a1 c3476a1) {
        if (!c3476a1.m17485e()) {
            c3476a1.m17482b();
            return;
        }
        HonorPushDataMsg honorPushDataMsg = (HonorPushDataMsg) c3476a1.m17483c();
        if (honorPushDataMsg != null) {
            honorPushDataMsg.getMsgId();
            this.f11839a.onMessageReceived(honorPushDataMsg);
        }
    }
}
