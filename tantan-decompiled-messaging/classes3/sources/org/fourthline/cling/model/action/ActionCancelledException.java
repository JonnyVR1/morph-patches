package org.fourthline.cling.model.action;

import org.fourthline.cling.model.types.ErrorCode;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ActionCancelledException extends ActionException {
    public ActionCancelledException(InterruptedException interruptedException) {
        super(ErrorCode.ACTION_FAILED, "Action execution interrupted", interruptedException);
    }
}
