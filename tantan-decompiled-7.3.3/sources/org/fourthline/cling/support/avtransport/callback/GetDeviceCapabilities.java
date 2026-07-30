package org.fourthline.cling.support.avtransport.callback;

import java.util.Map;
import java.util.logging.Logger;
import org.fourthline.cling.controlpoint.ActionCallback;
import org.fourthline.cling.model.action.ActionArgumentValue;
import org.fourthline.cling.model.action.ActionInvocation;
import org.fourthline.cling.model.meta.Service;
import org.fourthline.cling.model.types.UnsignedIntegerFourBytes;
import org.fourthline.cling.support.model.DeviceCapabilities;

/* JADX INFO: loaded from: classes3.dex */
public abstract class GetDeviceCapabilities extends ActionCallback {
    private static Logger log = Logger.getLogger(GetDeviceCapabilities.class.getName());

    public GetDeviceCapabilities(UnsignedIntegerFourBytes unsignedIntegerFourBytes, Service service) {
        super(new ActionInvocation(service.getAction("GetDeviceCapabilities")));
        getActionInvocation().setInput("InstanceID", unsignedIntegerFourBytes);
    }

    public abstract void received(ActionInvocation actionInvocation, DeviceCapabilities deviceCapabilities);

    @Override // org.fourthline.cling.controlpoint.ActionCallback
    public void success(ActionInvocation actionInvocation) {
        received(actionInvocation, new DeviceCapabilities((Map<String, ActionArgumentValue>) actionInvocation.getOutputMap()));
    }

    public GetDeviceCapabilities(Service service) {
        this(new UnsignedIntegerFourBytes(0L), service);
    }
}
