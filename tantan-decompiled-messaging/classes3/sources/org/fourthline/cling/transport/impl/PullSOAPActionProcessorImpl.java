package org.fourthline.cling.transport.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Logger;
import javax.enterprise.inject.Alternative;
import org.fourthline.cling.model.UnsupportedDataException;
import org.fourthline.cling.model.action.ActionArgumentValue;
import org.fourthline.cling.model.action.ActionException;
import org.fourthline.cling.model.action.ActionInvocation;
import org.fourthline.cling.model.message.control.ActionRequestMessage;
import org.fourthline.cling.model.message.control.ActionResponseMessage;
import org.fourthline.cling.model.meta.ActionArgument;
import org.fourthline.cling.model.types.ErrorCode;
import org.fourthline.cling.transport.spi.SOAPActionProcessor;
import org.seamless.xml.XmlPullParserUtils;
import org.xmlpull.v1.XmlPullParser;
import p003l.bld0;
import p003l.upk0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@Alternative
public class PullSOAPActionProcessorImpl extends SOAPActionProcessorImpl {
    protected static Logger log = Logger.getLogger(SOAPActionProcessor.class.getName());

    public String findActionArgumentValue(Map<String, String> map, ActionArgument actionArgument) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (actionArgument.isNameOrAlias(entry.getKey())) {
                return entry.getValue();
            }
        }
        return null;
    }

    public Map<String, String> getMatchingNodes(XmlPullParser xmlPullParser, ActionArgument[] actionArgumentArr) throws Exception {
        ArrayList arrayList = new ArrayList();
        for (ActionArgument actionArgument : actionArgumentArr) {
            arrayList.add(actionArgument.getName().toUpperCase(Locale.ROOT));
            Iterator it = Arrays.asList(actionArgument.getAliases()).iterator();
            while (it.hasNext()) {
                arrayList.add(((String) it.next()).toUpperCase(Locale.ROOT));
            }
        }
        HashMap map = new HashMap();
        String name = xmlPullParser.getName();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2 && arrayList.contains(xmlPullParser.getName().toUpperCase(Locale.ROOT))) {
                map.put(xmlPullParser.getName(), xmlPullParser.nextText());
            }
            if (next == 1 || (next == 3 && xmlPullParser.getName().equals(name))) {
                break;
            }
        }
        if (map.size() >= actionArgumentArr.length) {
            return map;
        }
        throw new ActionException(ErrorCode.ARGUMENT_VALUE_INVALID, "Invalid number of input or output arguments in XML message, expected " + actionArgumentArr.length + " but found " + map.size());
    }

    public void readActionInputArguments(XmlPullParser xmlPullParser, ActionInvocation actionInvocation) throws Exception {
        actionInvocation.setInput(readArgumentValues(xmlPullParser, actionInvocation.getAction().getInputArguments()));
    }

    public void readActionOutputArguments(XmlPullParser xmlPullParser, ActionInvocation actionInvocation) throws Exception {
        actionInvocation.setOutput(readArgumentValues(xmlPullParser, actionInvocation.getAction().getOutputArguments()));
    }

    public ActionArgumentValue[] readArgumentValues(XmlPullParser xmlPullParser, ActionArgument[] actionArgumentArr) throws Exception {
        Map<String, String> matchingNodes = getMatchingNodes(xmlPullParser, actionArgumentArr);
        ActionArgumentValue[] actionArgumentValueArr = new ActionArgumentValue[actionArgumentArr.length];
        for (int i = 0; i < actionArgumentArr.length; i++) {
            ActionArgument actionArgument = actionArgumentArr[i];
            String strFindActionArgumentValue = findActionArgumentValue(matchingNodes, actionArgument);
            if (strFindActionArgumentValue == null) {
                throw new ActionException(ErrorCode.ARGUMENT_VALUE_INVALID, "Could not find argument '" + actionArgument.getName() + "' node");
            }
            log.fine("Reading action argument: " + actionArgument.getName());
            actionArgumentValueArr[i] = createValue(actionArgument, strFindActionArgumentValue);
        }
        return actionArgumentValueArr;
    }

    @Override // org.fourthline.cling.transport.impl.SOAPActionProcessorImpl, org.fourthline.cling.transport.spi.SOAPActionProcessor
    public void readBody(ActionResponseMessage actionResponseMessage, ActionInvocation actionInvocation) throws UnsupportedDataException {
        String messageBody = getMessageBody(actionResponseMessage);
        try {
            XmlPullParser xmlPullParserCreateParser = XmlPullParserUtils.createParser(messageBody);
            readBodyElement(xmlPullParserCreateParser);
            readBodyResponse(xmlPullParserCreateParser, actionInvocation);
        } catch (Exception e) {
            bld0.m2961a(e, messageBody);
        }
    }

    public void readBodyElement(XmlPullParser xmlPullParser) throws Exception {
        XmlPullParserUtils.searchTag(xmlPullParser, "Body");
    }

    public void readBodyRequest(XmlPullParser xmlPullParser, ActionRequestMessage actionRequestMessage, ActionInvocation actionInvocation) throws Exception {
        XmlPullParserUtils.searchTag(xmlPullParser, actionInvocation.getAction().getName());
        readActionInputArguments(xmlPullParser, actionInvocation);
    }

    public void readBodyResponse(XmlPullParser xmlPullParser, ActionInvocation actionInvocation) throws Exception {
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                if (xmlPullParser.getName().equals("Fault")) {
                    actionInvocation.setFailure(readFaultElement(xmlPullParser));
                    return;
                }
                if (xmlPullParser.getName().equals(actionInvocation.getAction().getName() + "Response")) {
                    readActionOutputArguments(xmlPullParser, actionInvocation);
                    return;
                }
            }
            if (next == 1 || (next == 3 && xmlPullParser.getName().equals("Body"))) {
                throw new ActionException(ErrorCode.ACTION_FAILED, String.format("Action SOAP response do not contain %s element", actionInvocation.getAction().getName() + "Response"));
            }
        }
    }

    public ActionException readFaultElement(XmlPullParser xmlPullParser) throws Exception {
        XmlPullParserUtils.searchTag(xmlPullParser, "UPnPError");
        String strNextText = null;
        String strNextText2 = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("errorCode")) {
                    strNextText = xmlPullParser.nextText();
                } else if (name.equals("errorDescription")) {
                    strNextText2 = xmlPullParser.nextText();
                }
            }
            if (next == 1 || (next == 3 && xmlPullParser.getName().equals("UPnPError"))) {
                break;
            }
        }
        if (strNextText == null) {
            upk0.m8197a("Received fault element but no error code");
            return null;
        }
        try {
            int iIntValue = Integer.valueOf(strNextText).intValue();
            ErrorCode byCode = ErrorCode.getByCode(iIntValue);
            if (byCode != null) {
                log.fine("Reading fault element: " + byCode.getCode() + " - " + strNextText2);
                return new ActionException(byCode, strNextText2, false);
            }
            log.fine("Reading fault element: " + iIntValue + " - " + strNextText2);
            return new ActionException(iIntValue, strNextText2);
        } catch (NumberFormatException unused) {
            upk0.m8197a("Error code was not a number");
            return null;
        }
    }

    @Override // org.fourthline.cling.transport.impl.SOAPActionProcessorImpl, org.fourthline.cling.transport.spi.SOAPActionProcessor
    public void readBody(ActionRequestMessage actionRequestMessage, ActionInvocation actionInvocation) throws UnsupportedDataException {
        String messageBody = getMessageBody(actionRequestMessage);
        try {
            readBodyRequest(XmlPullParserUtils.createParser(messageBody), actionRequestMessage, actionInvocation);
        } catch (Exception e) {
            bld0.m2961a(e, messageBody);
        }
    }
}
