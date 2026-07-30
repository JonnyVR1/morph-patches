package org.fourthline.cling.support.renderingcontrol;

import org.fourthline.cling.model.action.ActionException;
import org.fourthline.cling.model.types.ErrorCode;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class RenderingControlException extends ActionException {
    public RenderingControlException(RenderingControlErrorCode renderingControlErrorCode, String str) {
        super(renderingControlErrorCode.getCode(), renderingControlErrorCode.getDescription() + ". " + str + ".");
    }

    public RenderingControlException(int i, String str, Throwable th) {
        super(i, str, th);
    }

    public RenderingControlException(ErrorCode errorCode, String str) {
        super(errorCode, str);
    }

    public RenderingControlException(ErrorCode errorCode) {
        super(errorCode);
    }

    public RenderingControlException(int i, String str) {
        super(i, str);
    }

    public RenderingControlException(RenderingControlErrorCode renderingControlErrorCode) {
        super(renderingControlErrorCode.getCode(), renderingControlErrorCode.getDescription());
    }
}
