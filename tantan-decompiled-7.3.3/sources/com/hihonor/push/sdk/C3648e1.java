package com.hihonor.push.sdk;

import com.hihonor.push.framework.aidl.IMessageEntity;
import com.hihonor.push.framework.aidl.entity.PushTokenResult;
import com.hihonor.push.sdk.common.data.ApiException;
import com.hihonor.push.sdk.internal.HonorPushErrorEnum;

/* JADX INFO: renamed from: com.hihonor.push.sdk.e1 */
/* JADX INFO: loaded from: classes7.dex */
public class C3648e1 extends AbstractC3651f1<PushTokenResult> {
    public C3648e1(String str, IMessageEntity iMessageEntity) {
        super(str, iMessageEntity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.hihonor.push.sdk.AbstractC3651f1
    /* JADX INFO: renamed from: a */
    public void mo18582a(ApiException apiException, Object obj) {
        if (apiException == null) {
            apiException = HonorPushErrorEnum.ERROR_UNKNOWN.toApiException();
        }
        if (apiException.getErrorCode() == HonorPushErrorEnum.SUCCESS.getErrorCode()) {
            if (obj instanceof PushTokenResult) {
                PushTokenResult pushTokenResult = (PushTokenResult) obj;
                String pushToken = pushTokenResult.getPushToken();
                try {
                    C3643d.f12592b.m18584a(C3664l.f12631e.m18597a(), pushToken);
                } catch (Exception unused) {
                }
                this.f12608a.m18601a((TResult) pushTokenResult);
                return;
            }
            apiException = HonorPushErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
        }
        apiException.getErrorCode();
        this.f12608a.m18600a((Exception) apiException);
    }
}
