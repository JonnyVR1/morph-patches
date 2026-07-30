package org.fourthline.cling.protocol;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.fourthline.cling.UpnpService;
import org.fourthline.cling.transport.RouterException;
import org.seamless.util.Exceptions;
import p153l.wpe0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SendingAsync implements Runnable {
    private static final Logger log = Logger.getLogger(UpnpService.class.getName());
    private final UpnpService upnpService;

    public SendingAsync(UpnpService upnpService) {
        this.upnpService = upnpService;
    }

    public abstract void execute() throws RouterException;

    public UpnpService getUpnpService() {
        return this.upnpService;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            execute();
        } catch (Exception e) {
            Throwable thUnwrap = Exceptions.unwrap(e);
            if (!(thUnwrap instanceof InterruptedException)) {
                wpe0.m207455a("Fatal error while executing protocol '", getClass().getSimpleName(), "': ", e);
                return;
            }
            log.log(Level.INFO, "Interrupted protocol '" + getClass().getSimpleName() + "': " + e, thUnwrap);
        }
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ")";
    }
}
