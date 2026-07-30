package com.hihonor.push.sdk;

import com.hihonor.push.framework.aidl.IMessageEntity;
import com.hihonor.push.framework.aidl.entity.PushTokenResult;
import com.hihonor.push.sdk.common.data.ApiException;
import com.hihonor.push.sdk.internal.HonorPushErrorEnum;

/* JADX INFO: renamed from: com.hihonor.push.sdk.e1 */
/* JADX INFO: loaded from: classes7.dex */
public class C3489e1 extends AbstractC3492f1<PushTokenResult> {
    public C3489e1(String str, IMessageEntity iMessageEntity) {
        super(str, iMessageEntity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.hihonor.push.sdk.AbstractC3492f1
    /* JADX INFO: renamed from: a */
    public void mo17505a(ApiException apiException, Object obj) {
        if (apiException == null) {
            apiException = HonorPushErrorEnum.ERROR_UNKNOWN.toApiException();
        }
        if (apiException.getErrorCode() == HonorPushErrorEnum.SUCCESS.getErrorCode()) {
            if (obj instanceof PushTokenResult) {
                PushTokenResult pushTokenResult = (PushTokenResult) obj;
                String pushToken = pushTokenResult.getPushToken();
                try {
                    C3484d.f11851b.m17507a(C3505l.f11890e.m17520a(), pushToken);
                } catch (Exception unused) {
                }
                this.f11867a.m17524a((TResult) pushTokenResult);
                return;
            }
            apiException = HonorPushErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
        }
        apiException.getErrorCode();
        this.f11867a.m17523a((Exception) apiException);
    }
}
