package org.fourthline.cling.support.contentdirectory.callback;

import java.util.logging.Logger;
import org.fourthline.cling.controlpoint.ActionCallback;
import org.fourthline.cling.model.action.ActionException;
import org.fourthline.cling.model.action.ActionInvocation;
import org.fourthline.cling.model.meta.Service;
import org.fourthline.cling.model.types.ErrorCode;
import org.fourthline.cling.model.types.UnsignedIntegerFourBytes;
import org.fourthline.cling.support.contentdirectory.DIDLParser;
import org.fourthline.cling.support.model.DIDLContent;
import org.fourthline.cling.support.model.SearchResult;
import org.fourthline.cling.support.model.SortCriterion;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Search extends ActionCallback {
    public static final String CAPS_WILDCARD = "*";
    private static Logger log = Logger.getLogger(Search.class.getName());

    public enum Status {
        NO_CONTENT("No Content"),
        LOADING("Loading..."),
        OK("OK");

        private String defaultMessage;

        Status(String str) {
            this.defaultMessage = str;
        }

        public String getDefaultMessage() {
            return this.defaultMessage;
        }
    }

    public Search(Service service, String str, String str2, String str3, long j, Long l2, SortCriterion... sortCriterionArr) {
        super(new ActionInvocation(service.getAction("Search")));
        log.fine("Creating browse action for container ID: " + str);
        getActionInvocation().setInput("ContainerID", str);
        getActionInvocation().setInput("SearchCriteria", str2);
        getActionInvocation().setInput("Filter", str3);
        getActionInvocation().setInput("StartingIndex", new UnsignedIntegerFourBytes(j));
        getActionInvocation().setInput("RequestedCount", new UnsignedIntegerFourBytes((l2 == null ? getDefaultMaxResults() : l2).longValue()));
        getActionInvocation().setInput("SortCriteria", SortCriterion.toString(sortCriterionArr));
    }

    public Long getDefaultMaxResults() {
        return 999L;
    }

    public abstract void received(ActionInvocation actionInvocation, DIDLContent dIDLContent);

    public boolean receivedRaw(ActionInvocation actionInvocation, SearchResult searchResult) {
        return true;
    }

    @Override // org.fourthline.cling.controlpoint.ActionCallback, java.lang.Runnable
    public void run() {
        updateStatus(Status.LOADING);
        super.run();
    }

    @Override // org.fourthline.cling.controlpoint.ActionCallback
    public void success(ActionInvocation actionInvocation) {
        log.fine("Successful search action, reading output argument values");
        SearchResult searchResult = new SearchResult(actionInvocation.getOutput("Result").getValue().toString(), (UnsignedIntegerFourBytes) actionInvocation.getOutput("NumberReturned").getValue(), (UnsignedIntegerFourBytes) actionInvocation.getOutput("TotalMatches").getValue(), (UnsignedIntegerFourBytes) actionInvocation.getOutput("UpdateID").getValue());
        if (!receivedRaw(actionInvocation, searchResult) || searchResult.getCountLong() <= 0 || searchResult.getResult().length() <= 0) {
            received(actionInvocation, new DIDLContent());
            updateStatus(Status.NO_CONTENT);
            return;
        }
        try {
            received(actionInvocation, new DIDLParser().parse(searchResult.getResult()));
            updateStatus(Status.OK);
        } catch (Exception e) {
            actionInvocation.setFailure(new ActionException(ErrorCode.ACTION_FAILED, "Can't parse DIDL XML response: " + e, e));
            failure(actionInvocation, null);
        }
    }

    public abstract void updateStatus(Status status);

    public Search(Service service, String str, String str2) {
        this(service, str, str2, "*", 0L, null, new SortCriterion[0]);
    }
}
