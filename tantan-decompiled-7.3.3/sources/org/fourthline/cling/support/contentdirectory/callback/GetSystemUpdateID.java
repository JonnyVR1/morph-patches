package org.fourthline.cling.support.contentdirectory.callback;

import org.fourthline.cling.controlpoint.ActionCallback;
import org.fourthline.cling.model.action.ActionException;
import org.fourthline.cling.model.action.ActionInvocation;
import org.fourthline.cling.model.meta.Service;
import org.fourthline.cling.model.types.ErrorCode;

/* JADX INFO: loaded from: classes3.dex */
public abstract class GetSystemUpdateID extends ActionCallback {
    public GetSystemUpdateID(Service service) {
        super(new ActionInvocation(service.getAction("GetSystemUpdateID")));
    }

    public abstract void received(ActionInvocation actionInvocation, long j);

    @Override // org.fourthline.cling.controlpoint.ActionCallback
    public void success(ActionInvocation actionInvocation) {
        long jLongValue;
        boolean z;
        try {
            jLongValue = Long.valueOf(actionInvocation.getOutput("Id").getValue().toString()).longValue();
            z = true;
        } catch (Exception e) {
            actionInvocation.setFailure(new ActionException(ErrorCode.ACTION_FAILED, "Can't parse GetSystemUpdateID response: " + e, e));
            failure(actionInvocation, null);
            jLongValue = 0;
            z = false;
        }
        if (z) {
            received(actionInvocation, jLongValue);
        }
    }
}
