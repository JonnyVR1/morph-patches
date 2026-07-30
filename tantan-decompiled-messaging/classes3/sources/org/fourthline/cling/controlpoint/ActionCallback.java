package org.fourthline.cling.controlpoint;

import l.qkq0;
import org.fourthline.cling.model.action.ActionException;
import org.fourthline.cling.model.action.ActionInvocation;
import org.fourthline.cling.model.message.UpnpResponse;
import org.fourthline.cling.model.message.control.IncomingActionResponseMessage;
import org.fourthline.cling.model.meta.LocalService;
import org.fourthline.cling.model.meta.RemoteService;
import org.fourthline.cling.model.meta.Service;
import org.fourthline.cling.protocol.sync.SendingAction;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class ActionCallback implements Runnable {
    protected final ActionInvocation actionInvocation;
    protected ControlPoint controlPoint;

    public static final class Default extends ActionCallback {
        public Default(ActionInvocation actionInvocation, ControlPoint controlPoint) {
            super(actionInvocation, controlPoint);
        }

        @Override // org.fourthline.cling.controlpoint.ActionCallback
        public void failure(ActionInvocation actionInvocation, UpnpResponse upnpResponse, String str) {
        }

        @Override // org.fourthline.cling.controlpoint.ActionCallback
        public void success(ActionInvocation actionInvocation) {
        }
    }

    public ActionCallback(ActionInvocation actionInvocation, ControlPoint controlPoint) {
        this.actionInvocation = actionInvocation;
        this.controlPoint = controlPoint;
    }

    public String createDefaultFailureMessage(ActionInvocation actionInvocation, UpnpResponse upnpResponse) {
        ActionException failure = actionInvocation.getFailure();
        String str = "Error: ";
        if (failure != null) {
            str = "Error: " + failure.getMessage();
        }
        if (upnpResponse == null) {
            return str;
        }
        return str + " (HTTP response was: " + upnpResponse.getResponseDetails() + ")";
    }

    public void failure(ActionInvocation actionInvocation, UpnpResponse upnpResponse) {
        failure(actionInvocation, upnpResponse, createDefaultFailureMessage(actionInvocation, upnpResponse));
    }

    public abstract void failure(ActionInvocation actionInvocation, UpnpResponse upnpResponse, String str);

    public ActionInvocation getActionInvocation() {
        return this.actionInvocation;
    }

    public synchronized ControlPoint getControlPoint() {
        return this.controlPoint;
    }

    @Override // java.lang.Runnable
    public void run() {
        Service service = this.actionInvocation.getAction().getService();
        if (service instanceof LocalService) {
            ((LocalService) service).getExecutor(this.actionInvocation.getAction()).execute(this.actionInvocation);
            ActionException failure = this.actionInvocation.getFailure();
            ActionInvocation actionInvocation = this.actionInvocation;
            if (failure != null) {
                failure(actionInvocation, null);
                return;
            } else {
                success(actionInvocation);
                return;
            }
        }
        if (service instanceof RemoteService) {
            if (getControlPoint() == null) {
                qkq0.a("Callback must be executed through ControlPoint");
                return;
            }
            RemoteService remoteService = (RemoteService) service;
            try {
                SendingAction sendingActionCreateSendingAction = getControlPoint().getProtocolFactory().createSendingAction(this.actionInvocation, remoteService.getDevice().normalizeURI(remoteService.getControlURI()));
                sendingActionCreateSendingAction.run();
                IncomingActionResponseMessage outputMessage = sendingActionCreateSendingAction.getOutputMessage();
                if (outputMessage == null) {
                    failure(this.actionInvocation, null);
                    return;
                }
                boolean zIsFailed = outputMessage.getOperation().isFailed();
                ActionInvocation actionInvocation2 = this.actionInvocation;
                if (zIsFailed) {
                    failure(actionInvocation2, outputMessage.getOperation());
                } else {
                    success(actionInvocation2);
                }
            } catch (IllegalArgumentException unused) {
                failure(this.actionInvocation, null, "bad control URL: " + remoteService.getControlURI());
            }
        }
    }

    public synchronized ActionCallback setControlPoint(ControlPoint controlPoint) {
        this.controlPoint = controlPoint;
        return this;
    }

    public abstract void success(ActionInvocation actionInvocation);

    public String toString() {
        return "(ActionCallback) " + this.actionInvocation;
    }

    public ActionCallback(ActionInvocation actionInvocation) {
        this.actionInvocation = actionInvocation;
    }
}
