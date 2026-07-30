package org.fourthline.cling.support.renderingcontrol;

/* JADX INFO: loaded from: classes3.dex */
public enum RenderingControlErrorCode {
    INVALID_PRESET_NAME(701, "The specified name is not a valid preset name"),
    INVALID_INSTANCE_ID(702, "The specified instanceID is invalid for this RenderingControl");

    private int code;
    private String description;

    RenderingControlErrorCode(int i, String str) {
        this.code = i;
        this.description = str;
    }

    public static RenderingControlErrorCode getByCode(int i) {
        for (RenderingControlErrorCode renderingControlErrorCode : values()) {
            if (renderingControlErrorCode.getCode() == i) {
                return renderingControlErrorCode;
            }
        }
        return null;
    }

    public int getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }
}
