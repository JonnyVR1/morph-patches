package org.fourthline.cling.transport.impl;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.inject.Alternative;
import org.fourthline.cling.model.UnsupportedDataException;
import org.fourthline.cling.model.message.gena.IncomingEventRequestMessage;
import org.fourthline.cling.model.meta.RemoteService;
import org.fourthline.cling.model.meta.StateVariable;
import org.fourthline.cling.model.state.StateVariableValue;
import org.fourthline.cling.transport.spi.GENAEventProcessor;
import org.seamless.xml.XmlPullParserUtils;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@Alternative
public class PullGENAEventProcessorImpl extends GENAEventProcessorImpl {
    private static Logger log = Logger.getLogger(GENAEventProcessor.class.getName());

    @Override // org.fourthline.cling.transport.impl.GENAEventProcessorImpl, org.fourthline.cling.transport.spi.GENAEventProcessor
    public void readBody(IncomingEventRequestMessage incomingEventRequestMessage) throws UnsupportedDataException {
        log.fine("Reading body of: " + incomingEventRequestMessage);
        if (log.isLoggable(Level.FINER)) {
            log.finer("===================================== GENA BODY BEGIN ============================================");
            log.finer(incomingEventRequestMessage.getBody() != null ? incomingEventRequestMessage.getBody().toString() : null);
            log.finer("-===================================== GENA BODY END ============================================");
        }
        String messageBody = getMessageBody(incomingEventRequestMessage);
        try {
            readProperties(XmlPullParserUtils.createParser(messageBody), incomingEventRequestMessage);
        } catch (Exception e) {
            throw new UnsupportedDataException("Can't transform message payload: " + e.getMessage(), e, messageBody);
        }
    }

    public void readProperties(XmlPullParser xmlPullParser, IncomingEventRequestMessage incomingEventRequestMessage) throws Exception {
        StateVariable<RemoteService>[] stateVariables = incomingEventRequestMessage.getService().getStateVariables();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            if (next == 2 && xmlPullParser.getName().equals("property")) {
                readProperty(xmlPullParser, incomingEventRequestMessage, stateVariables);
            }
        }
    }

    public void readProperty(XmlPullParser xmlPullParser, IncomingEventRequestMessage incomingEventRequestMessage, StateVariable[] stateVariableArr) throws Exception {
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                for (StateVariable stateVariable : stateVariableArr) {
                    if (stateVariable.getName().equals(name)) {
                        log.fine("Reading state variable value: " + name);
                        incomingEventRequestMessage.getStateVariableValues().add(new StateVariableValue(stateVariable, xmlPullParser.nextText()));
                        break;
                    }
                }
            }
            if (next == 1) {
                return;
            }
            if (next == 3 && xmlPullParser.getName().equals("property")) {
                return;
            }
        }
    }
}
