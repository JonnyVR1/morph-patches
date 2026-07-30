package com.hihonor.push.sdk;

import com.hihonor.push.framework.aidl.IMessageEntity;
import com.hihonor.push.sdk.common.data.ApiException;
import com.hihonor.push.sdk.internal.HonorPushErrorEnum;

/* JADX INFO: renamed from: com.hihonor.push.sdk.g1 */
/* JADX INFO: loaded from: classes7.dex */
public class C3495g1 extends AbstractC3492f1<Void> {
    public C3495g1(String str, IMessageEntity iMessageEntity) {
        super(str, iMessageEntity);
    }

    @Override // com.hihonor.push.sdk.AbstractC3492f1
    /* JADX INFO: renamed from: a */
    public void mo17505a(ApiException apiException, Object obj) {
        if (apiException == null) {
            apiException = HonorPushErrorEnum.ERROR_UNKNOWN.toApiException();
        }
        if (apiException.getErrorCode() == HonorPushErrorEnum.SUCCESS.getErrorCode()) {
            this.f11867a.m17524a((Object) null);
        } else {
            apiException.getErrorCode();
            this.f11867a.m17523a((Exception) apiException);
        }
    }
}
