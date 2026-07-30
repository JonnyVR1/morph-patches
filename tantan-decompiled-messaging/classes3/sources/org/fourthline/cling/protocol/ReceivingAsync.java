package org.fourthline.cling.protocol;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.UpnpService;
import org.fourthline.cling.model.message.UpnpMessage;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.transport.RouterException;
import org.seamless.util.Exceptions;
import p003l.rhe0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class ReceivingAsync<M extends UpnpMessage> implements Runnable {
    private static final Logger log = Logger.getLogger(UpnpService.class.getName());
    private M inputMessage;
    private final UpnpService upnpService;

    public ReceivingAsync(UpnpService upnpService, M m) {
        this.upnpService = upnpService;
        this.inputMessage = m;
    }

    public abstract void execute() throws RouterException;

    public <H extends UpnpHeader> H getFirstHeader(UpnpHeader.Type type, Class<H> cls) {
        return (H) getInputMessage().getHeaders().getFirstHeader(type, cls);
    }

    public M getInputMessage() {
        return this.inputMessage;
    }

    public UpnpService getUpnpService() {
        return this.upnpService;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zWaitBeforeExecution;
        try {
            zWaitBeforeExecution = waitBeforeExecution();
        } catch (InterruptedException unused) {
            log.info("Protocol wait before execution interrupted (on shutdown?): ".concat(getClass().getSimpleName()));
            zWaitBeforeExecution = false;
        }
        if (zWaitBeforeExecution) {
            try {
                execute();
            } catch (Exception e) {
                Throwable thUnwrap = Exceptions.unwrap(e);
                if (!(thUnwrap instanceof InterruptedException)) {
                    rhe0.m7258a("Fatal error while executing protocol '", getClass().getSimpleName(), "': ", e);
                    return;
                }
                log.log(Level.INFO, "Interrupted protocol '" + getClass().getSimpleName() + "': " + e, thUnwrap);
            }
        }
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ")";
    }

    public boolean waitBeforeExecution() throws InterruptedException {
        return true;
    }
}
