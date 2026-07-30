package org.fourthline.cling.support.igd.callback;

import org.fourthline.cling.controlpoint.ActionCallback;
import org.fourthline.cling.model.action.ActionInvocation;
import org.fourthline.cling.model.meta.Service;

/* JADX INFO: loaded from: classes3.dex */
public abstract class GetExternalIP extends ActionCallback {
    public GetExternalIP(Service service) {
        super(new ActionInvocation(service.getAction("GetExternalIPAddress")));
    }

    public abstract void success(String str);

    @Override // org.fourthline.cling.controlpoint.ActionCallback
    public void success(ActionInvocation actionInvocation) {
        success((String) actionInvocation.getOutput("NewExternalIPAddress").getValue());
    }
}
