package com.hihonor.push.sdk;

import com.hihonor.push.framework.aidl.IMessageEntity;
import com.hihonor.push.framework.aidl.entity.BooleanResult;
import com.hihonor.push.sdk.common.data.ApiException;
import com.hihonor.push.sdk.internal.HonorPushErrorEnum;

/* JADX INFO: renamed from: com.hihonor.push.sdk.c1 */
/* JADX INFO: loaded from: classes7.dex */
public class C3641c1 extends AbstractC3651f1<BooleanResult> {
    public C3641c1(String str, IMessageEntity iMessageEntity) {
        super(str, iMessageEntity);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.hihonor.push.sdk.AbstractC3651f1
    /* JADX INFO: renamed from: a */
    public void mo18582a(ApiException apiException, Object obj) {
        if (apiException == null) {
            apiException = HonorPushErrorEnum.ERROR_UNKNOWN.toApiException();
        }
        if (apiException.getErrorCode() == HonorPushErrorEnum.SUCCESS.getErrorCode()) {
            if (obj instanceof BooleanResult) {
                this.f12608a.m18601a((TResult) ((BooleanResult) obj));
                return;
            }
            apiException = HonorPushErrorEnum.ERROR_INTERNAL_ERROR.toApiException();
        }
        apiException.getErrorCode();
        this.f12608a.m18600a((Exception) apiException);
    }
}
