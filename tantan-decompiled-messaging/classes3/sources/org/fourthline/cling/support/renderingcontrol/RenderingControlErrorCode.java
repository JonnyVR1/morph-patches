package org.fourthline.cling.support.renderingcontrol;

import tv.danmaku.ijk.media.player.IMediaPlayer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public enum RenderingControlErrorCode {
    INVALID_PRESET_NAME(IMediaPlayer.MEDIA_INFO_BUFFERING_START, "The specified name is not a valid preset name"),
    INVALID_INSTANCE_ID(IMediaPlayer.MEDIA_INFO_BUFFERING_END, "The specified instanceID is invalid for this RenderingControl");

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
