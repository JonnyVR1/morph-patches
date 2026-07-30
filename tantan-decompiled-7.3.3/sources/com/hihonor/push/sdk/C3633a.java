package com.hihonor.push.sdk;

/* JADX INFO: renamed from: com.hihonor.push.sdk.a */
/* JADX INFO: loaded from: classes7.dex */
public class C3633a implements InterfaceC3663k0<HonorPushDataMsg> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ HonorMessageService f12580a;

    public C3633a(HonorMessageService honorMessageService) {
        this.f12580a = honorMessageService;
    }

    @Override // com.hihonor.push.sdk.InterfaceC3663k0
    /* JADX INFO: renamed from: a */
    public void mo18555a(C3635a1 c3635a1) {
        if (!c3635a1.m18562e()) {
            c3635a1.m18559b();
            return;
        }
        HonorPushDataMsg honorPushDataMsg = (HonorPushDataMsg) c3635a1.m18560c();
        if (honorPushDataMsg != null) {
            honorPushDataMsg.getMsgId();
            this.f12580a.onMessageReceived(honorPushDataMsg);
        }
    }
}
