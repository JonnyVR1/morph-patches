package com.hihonor.push.sdk;

import com.hihonor.push.framework.aidl.IMessageEntity;
import com.hihonor.push.framework.aidl.entity.RequestHeader;
import com.hihonor.push.sdk.common.data.ApiException;

/* JADX INFO: renamed from: com.hihonor.push.sdk.f1 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC3492f1<TResult> {

    /* JADX INFO: renamed from: a */
    public C3510n0<TResult> f11867a;

    /* JADX INFO: renamed from: b */
    public final String f11868b;

    /* JADX INFO: renamed from: c */
    public final IMessageEntity f11869c;

    /* JADX INFO: renamed from: d */
    public final C3527w f11870d;

    /* JADX INFO: renamed from: e */
    public RequestHeader f11871e;

    public AbstractC3492f1(String str, IMessageEntity iMessageEntity) {
        this.f11868b = str;
        this.f11869c = iMessageEntity;
        this.f11870d = C3527w.m17529a(str);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo17505a(ApiException apiException, Object obj);

    /* JADX INFO: renamed from: b */
    public final void m17514b(ApiException apiException, Object obj) {
        if (this.f11867a != null) {
            mo17505a(apiException, obj);
        }
    }
}
