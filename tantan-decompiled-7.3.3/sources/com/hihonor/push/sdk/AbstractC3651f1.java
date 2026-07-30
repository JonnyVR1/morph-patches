package com.hihonor.push.sdk;

import com.hihonor.push.framework.aidl.IMessageEntity;
import com.hihonor.push.framework.aidl.entity.RequestHeader;
import com.hihonor.push.sdk.common.data.ApiException;

/* JADX INFO: renamed from: com.hihonor.push.sdk.f1 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC3651f1<TResult> {

    /* JADX INFO: renamed from: a */
    public C3669n0<TResult> f12608a;

    /* JADX INFO: renamed from: b */
    public final String f12609b;

    /* JADX INFO: renamed from: c */
    public final IMessageEntity f12610c;

    /* JADX INFO: renamed from: d */
    public final C3686w f12611d;

    /* JADX INFO: renamed from: e */
    public RequestHeader f12612e;

    public AbstractC3651f1(String str, IMessageEntity iMessageEntity) {
        this.f12609b = str;
        this.f12610c = iMessageEntity;
        this.f12611d = C3686w.m18606a(str);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo18582a(ApiException apiException, Object obj);

    /* JADX INFO: renamed from: b */
    public final void m18591b(ApiException apiException, Object obj) {
        if (this.f12608a != null) {
            mo18582a(apiException, obj);
        }
    }
}
