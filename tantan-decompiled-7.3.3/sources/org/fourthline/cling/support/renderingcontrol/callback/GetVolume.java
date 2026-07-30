package org.fourthline.cling.support.renderingcontrol.callback;

import java.util.logging.Logger;
import org.fourthline.cling.controlpoint.ActionCallback;
import org.fourthline.cling.model.action.ActionException;
import org.fourthline.cling.model.action.ActionInvocation;
import org.fourthline.cling.model.meta.Service;
import org.fourthline.cling.model.types.ErrorCode;
import org.fourthline.cling.model.types.UnsignedIntegerFourBytes;
import org.fourthline.cling.support.model.Channel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class GetVolume extends ActionCallback {
    private static Logger log = Logger.getLogger(GetVolume.class.getName());

    public GetVolume(UnsignedIntegerFourBytes unsignedIntegerFourBytes, Service service) {
        super(new ActionInvocation(service.getAction("GetVolume")));
        getActionInvocation().setInput("InstanceID", unsignedIntegerFourBytes);
        getActionInvocation().setInput("Channel", Channel.Master.toString());
    }

    public abstract void received(ActionInvocation actionInvocation, int i);

    @Override // org.fourthline.cling.controlpoint.ActionCallback
    public void success(ActionInvocation actionInvocation) {
        int iIntValue;
        boolean z;
        try {
            iIntValue = Integer.valueOf(actionInvocation.getOutput("CurrentVolume").getValue().toString()).intValue();
            z = true;
        } catch (Exception e) {
            actionInvocation.setFailure(new ActionException(ErrorCode.ACTION_FAILED, "Can't parse ProtocolInfo response: " + e, e));
            failure(actionInvocation, null);
            iIntValue = 0;
            z = false;
        }
        if (z) {
            received(actionInvocation, iIntValue);
        }
    }

    public GetVolume(Service service) {
        this(new UnsignedIntegerFourBytes(0L), service);
    }
}
