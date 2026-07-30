package com.cosmos.photon.baseim.p025im;

import android.text.TextUtils;
import androidx.annotation.CallSuper;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class SetHandler implements IMessageHandler {
    private Map<String, IMessageHandler> mMessageHandlers = new HashMap();

    @Override // com.cosmos.photon.baseim.p025im.IMessageHandler
    @CallSuper
    public boolean matchReceive(IMJPacket iMJPacket) throws Exception {
        IMessageHandler iMessageHandler;
        String nameSpace = iMJPacket.getNameSpace();
        return (TextUtils.isEmpty(nameSpace) || (iMessageHandler = this.mMessageHandlers.get(nameSpace)) == null || !iMessageHandler.matchReceive(iMJPacket)) ? false : true;
    }

    public void registerHandler(String str, IMessageHandler iMessageHandler) {
        this.mMessageHandlers.put(str, iMessageHandler);
    }
}
