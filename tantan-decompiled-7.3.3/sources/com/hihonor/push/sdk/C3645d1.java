package com.hihonor.push.sdk;

import com.hihonor.push.framework.aidl.IMessageEntity;
import com.hihonor.push.sdk.common.data.ApiException;
import com.hihonor.push.sdk.internal.HonorPushErrorEnum;

/* JADX INFO: renamed from: com.hihonor.push.sdk.d1 */
/* JADX INFO: loaded from: classes7.dex */
public class C3645d1 extends AbstractC3651f1<Void> {
    public C3645d1(String str, IMessageEntity iMessageEntity) {
        super(str, iMessageEntity);
    }

    @Override // com.hihonor.push.sdk.AbstractC3651f1
    /* JADX INFO: renamed from: a */
    public void mo18582a(ApiException apiException, Object obj) {
        if (apiException == null) {
            apiException = HonorPushErrorEnum.ERROR_UNKNOWN.toApiException();
        }
        if (apiException.getErrorCode() == HonorPushErrorEnum.SUCCESS.getErrorCode()) {
            this.f12608a.m18601a((Object) null);
        } else {
            apiException.getErrorCode();
            this.f12608a.m18600a((Exception) apiException);
        }
    }
}
