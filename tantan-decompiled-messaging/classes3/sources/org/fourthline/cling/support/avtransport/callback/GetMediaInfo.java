package org.fourthline.cling.support.avtransport.callback;

import java.util.logging.Logger;
import org.fourthline.cling.controlpoint.ActionCallback;
import org.fourthline.cling.model.action.ActionInvocation;
import org.fourthline.cling.model.meta.Service;
import org.fourthline.cling.model.types.UnsignedIntegerFourBytes;
import org.fourthline.cling.support.model.MediaInfo;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class GetMediaInfo extends ActionCallback {
    private static Logger log = Logger.getLogger(GetMediaInfo.class.getName());

    public GetMediaInfo(UnsignedIntegerFourBytes unsignedIntegerFourBytes, Service service) {
        super(new ActionInvocation(service.getAction("GetMediaInfo")));
        getActionInvocation().setInput("InstanceID", unsignedIntegerFourBytes);
    }

    public abstract void received(ActionInvocation actionInvocation, MediaInfo mediaInfo);

    @Override // org.fourthline.cling.controlpoint.ActionCallback
    public void success(ActionInvocation actionInvocation) {
        received(actionInvocation, new MediaInfo(actionInvocation.getOutputMap()));
    }

    public GetMediaInfo(Service service) {
        this(new UnsignedIntegerFourBytes(0L), service);
    }
}
