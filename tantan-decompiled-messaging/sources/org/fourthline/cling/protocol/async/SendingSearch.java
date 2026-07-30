package org.fourthline.cling.protocol.async;

import java.util.logging.Logger;
import org.fourthline.cling.UpnpService;
import org.fourthline.cling.model.message.discovery.OutgoingSearchRequest;
import org.fourthline.cling.model.message.header.MXHeader;
import org.fourthline.cling.model.message.header.STAllHeader;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.protocol.SendingAsync;
import org.fourthline.cling.transport.RouterException;
import p149l.kg3;

/* JADX INFO: loaded from: classes3.dex */
public class SendingSearch extends SendingAsync {
    private static final Logger log = Logger.getLogger(SendingSearch.class.getName());
    private final int mxSeconds;
    private final UpnpHeader searchTarget;

    /* JADX WARN: Multi-variable type inference failed */
    public SendingSearch(UpnpService upnpService, UpnpHeader upnpHeader, int i) {
        super(upnpService);
        if (!UpnpHeader.Type.ST.isValidHeaderType(upnpHeader.getClass())) {
            kg3.m145878a("Given search target instance is not a valid header class for type ST: ", upnpHeader.getClass());
            throw null;
        }
        this.searchTarget = upnpHeader;
        this.mxSeconds = i;
    }

    @Override // org.fourthline.cling.protocol.SendingAsync
    public void execute() throws RouterException {
        log.fine("Executing search for target: " + this.searchTarget.getString() + " with MX seconds: " + getMxSeconds());
        OutgoingSearchRequest outgoingSearchRequest = new OutgoingSearchRequest(this.searchTarget, getMxSeconds());
        prepareOutgoingSearchRequest(outgoingSearchRequest);
        for (int i = 0; i < getBulkRepeat(); i++) {
            try {
                getUpnpService().getRouter().send(outgoingSearchRequest);
                log.finer("Sleeping " + getBulkIntervalMilliseconds() + " milliseconds");
                Thread.sleep((long) getBulkIntervalMilliseconds());
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    public int getBulkIntervalMilliseconds() {
        return 500;
    }

    public int getBulkRepeat() {
        return 5;
    }

    public int getMxSeconds() {
        return this.mxSeconds;
    }

    public UpnpHeader getSearchTarget() {
        return this.searchTarget;
    }

    public void prepareOutgoingSearchRequest(OutgoingSearchRequest outgoingSearchRequest) {
    }

    public SendingSearch(UpnpService upnpService, UpnpHeader upnpHeader) {
        this(upnpService, upnpHeader, MXHeader.DEFAULT_VALUE.intValue());
    }

    public SendingSearch(UpnpService upnpService) {
        this(upnpService, new STAllHeader());
    }
}
