package org.fourthline.cling.support.connectionmanager;

import tv.danmaku.ijk.media.player.IMediaPlayer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public enum ConnectionManagerErrorCode {
    INCOMPATIBLE_PROTOCOL_INFO(IMediaPlayer.MEDIA_INFO_BUFFERING_START, "The connection cannot be established because the protocol info parameter is incompatible"),
    INCOMPATIBLE_DIRECTIONS(IMediaPlayer.MEDIA_INFO_BUFFERING_END, "The connection cannot be established because the directions of the involved ConnectionManagers (source/sink) are incompatible"),
    INSUFFICIENT_NETWORK_RESOURCES(703, "The connection cannot be established because there are insufficient network resources"),
    LOCAL_RESTRICTIONS(IMediaPlayer.MEDIA_INFO_INITBUFFERING_START, "The connection cannot be established because of local restrictions in the device"),
    ACCESS_DENIED(IMediaPlayer.MEDIA_INFO_INITBUFFERING_END, "The connection cannot be established because the client is not permitted."),
    INVALID_CONNECTION_REFERENCE(706, "Not a valid connection established by this service"),
    NOT_IN_NETWORK(707, "The connection cannot be established because the ConnectionManagers are not part of the same physical network.");

    private int code;
    private String description;

    ConnectionManagerErrorCode(int i, String str) {
        this.code = i;
        this.description = str;
    }

    public static ConnectionManagerErrorCode getByCode(int i) {
        for (ConnectionManagerErrorCode connectionManagerErrorCode : values()) {
            if (connectionManagerErrorCode.getCode() == i) {
                return connectionManagerErrorCode;
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
