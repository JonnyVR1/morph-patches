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
public class BinderC3656h0 extends IPushCallback.Stub {

    /* JADX INFO: renamed from: a */
    public final Object f12620a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC3659i0 f12621b;

    public BinderC3656h0(Object obj, InterfaceC3659i0 interfaceC3659i0) {
        this.f12620a = obj;
        this.f12621b = interfaceC3659i0;
    }

    @Override // com.hihonor.push.framework.aidl.IPushCallback
    public void onResult(DataBuffer dataBuffer) {
        Bundle header = dataBuffer.getHeader();
        Bundle body = dataBuffer.getBody();
        ResponseHeader responseHeader = new ResponseHeader();
        MessageCodec.parseMessageEntity(header, responseHeader);
        Object obj = this.f12620a;
        if (obj instanceof IMessageEntity) {
            MessageCodec.parseMessageEntity(body, (IMessageEntity) obj);
        }
        InterfaceC3659i0 interfaceC3659i0 = this.f12621b;
        ApiException apiException = new ApiException(responseHeader.getStatusCode(), responseHeader.getStatusMessage());
        Object obj2 = this.f12620a;
        C3692z.b bVar = (C3692z.b) interfaceC3659i0;
        bVar.getClass();
        C3692z c3692z = C3692z.f12689c;
        AbstractC3651f1<?> abstractC3651f1 = bVar.f12698a;
        c3692z.getClass();
        Handler handler = c3692z.f12690a;
        handler.sendMessage(handler.obtainMessage(2, abstractC3651f1));
        bVar.f12698a.m18591b(apiException, obj2);
    }
}
