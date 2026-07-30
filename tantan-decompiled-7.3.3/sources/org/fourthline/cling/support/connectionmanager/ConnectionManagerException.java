package org.fourthline.cling.support.connectionmanager;

import org.fourthline.cling.model.action.ActionException;
import org.fourthline.cling.model.types.ErrorCode;

/* JADX INFO: loaded from: classes3.dex */
public class ConnectionManagerException extends ActionException {
    public ConnectionManagerException(ConnectionManagerErrorCode connectionManagerErrorCode, String str) {
        super(connectionManagerErrorCode.getCode(), connectionManagerErrorCode.getDescription() + ". " + str + ".");
    }

    public ConnectionManagerException(int i, String str, Throwable th) {
        super(i, str, th);
    }

    public ConnectionManagerException(ErrorCode errorCode, String str) {
        super(errorCode, str);
    }

    public ConnectionManagerException(ErrorCode errorCode) {
        super(errorCode);
    }

    public ConnectionManagerException(int i, String str) {
        super(i, str);
    }

    public ConnectionManagerException(ConnectionManagerErrorCode connectionManagerErrorCode) {
        super(connectionManagerErrorCode.getCode(), connectionManagerErrorCode.getDescription());
    }
}
