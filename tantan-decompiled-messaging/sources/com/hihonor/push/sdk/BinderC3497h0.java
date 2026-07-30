package com.hihonor.push.sdk;

import android.os.Bundle;
import android.os.Handler;
import com.hihonor.push.framework.aidl.DataBuffer;
import com.hihonor.push.framework.aidl.IMessageEntity;
import com.hihonor.push.framework.aidl.IPushCallback;
import com.hihonor.push.framework.aidl.MessageCodec;
import com.hihonor.push.framework.aidl.entity.ResponseHeader;
import com.hihonor.push.sdk.common.data.ApiException;

/* JADX INFO: renamed from: com.hihonor.push.sdk.h0 */
/* JADX INFO: loaded from: classes7.dex */
public class BinderC3497h0 extends IPushCallback.Stub {

    /* JADX INFO: renamed from: a */
    public final Object f11879a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC3500i0 f11880b;

    public BinderC3497h0(Object obj, InterfaceC3500i0 interfaceC3500i0) {
        this.f11879a = obj;
        this.f11880b = interfaceC3500i0;
    }

    @Override // com.hihonor.push.framework.aidl.IPushCallback
    public void onResult(DataBuffer dataBuffer) {
        Bundle header = dataBuffer.getHeader();
        Bundle body = dataBuffer.getBody();
        ResponseHeader responseHeader = new ResponseHeader();
        MessageCodec.parseMessageEntity(header, responseHeader);
        Object obj = this.f11879a;
        if (obj instanceof IMessageEntity) {
            MessageCodec.parseMessageEntity(body, (IMessageEntity) obj);
        }
        InterfaceC3500i0 interfaceC3500i0 = this.f11880b;
        ApiException apiException = new ApiException(responseHeader.getStatusCode(), responseHeader.getStatusMessage());
        Object obj2 = this.f11879a;
        C3533z.b bVar = (C3533z.b) interfaceC3500i0;
        bVar.getClass();
        C3533z c3533z = C3533z.f11948c;
        AbstractC3492f1<?> abstractC3492f1 = bVar.f11957a;
        c3533z.getClass();
        Handler handler = c3533z.f11949a;
        handler.sendMessage(handler.obtainMessage(2, abstractC3492f1));
        bVar.f11957a.m17514b(apiException, obj2);
    }
}
