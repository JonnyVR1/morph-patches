package org.fourthline.cling.support.contentdirectory;

import tv.danmaku.ijk.media.player.IMediaPlayer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public enum ContentDirectoryErrorCode {
    NO_SUCH_OBJECT(IMediaPlayer.MEDIA_INFO_BUFFERING_START, "The specified ObjectID is invalid"),
    UNSUPPORTED_SORT_CRITERIA(709, "Unsupported or invalid sort criteria"),
    CANNOT_PROCESS(720, "Cannot process the request");

    private int code;
    private String description;

    ContentDirectoryErrorCode(int i, String str) {
        this.code = i;
        this.description = str;
    }

    public static ContentDirectoryErrorCode getByCode(int i) {
        for (ContentDirectoryErrorCode contentDirectoryErrorCode : values()) {
            if (contentDirectoryErrorCode.getCode() == i) {
                return contentDirectoryErrorCode;
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
