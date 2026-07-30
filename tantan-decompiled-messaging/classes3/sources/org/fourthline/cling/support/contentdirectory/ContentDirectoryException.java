package org.fourthline.cling.support.contentdirectory;

import org.fourthline.cling.model.action.ActionException;
import org.fourthline.cling.model.types.ErrorCode;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ContentDirectoryException extends ActionException {
    public ContentDirectoryException(ContentDirectoryErrorCode contentDirectoryErrorCode, String str) {
        super(contentDirectoryErrorCode.getCode(), contentDirectoryErrorCode.getDescription() + ". " + str + ".");
    }

    public ContentDirectoryException(int i, String str, Throwable th) {
        super(i, str, th);
    }

    public ContentDirectoryException(ErrorCode errorCode, String str) {
        super(errorCode, str);
    }

    public ContentDirectoryException(ErrorCode errorCode) {
        super(errorCode);
    }

    public ContentDirectoryException(int i, String str) {
        super(i, str);
    }

    public ContentDirectoryException(ContentDirectoryErrorCode contentDirectoryErrorCode) {
        super(contentDirectoryErrorCode.getCode(), contentDirectoryErrorCode.getDescription());
    }
}
