package com.p074ss.bytertc.engine.handler;

import com.p074ss.bytertc.engine.UserInfo;
import com.p074ss.bytertc.engine.type.RTCRoomStats;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes11.dex */
public abstract class IRTSRoomEventHandler {
    public void onLeaveRoom(RTCRoomStats rTCRoomStats) {
    }

    public void onRoomBinaryMessageReceived(long j, String str, ByteBuffer byteBuffer) {
    }

    public void onRoomMessageReceived(long j, String str, String str2) {
    }

    public void onRoomMessageSendResult(long j, int i) {
    }

    public void onRoomStateChanged(String str, String str2, int i, String str3) {
    }

    public void onUserBinaryMessageReceived(long j, String str, ByteBuffer byteBuffer) {
    }

    public void onUserJoined(UserInfo userInfo) {
    }

    public void onUserLeave(String str, int i) {
    }

    public void onUserMessageReceived(long j, String str, String str2) {
    }

    public void onUserMessageSendResult(long j, int i) {
    }

    public void onRoomBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
    }

    public void onRoomMessageReceived(String str, String str2) {
    }

    public void onUserBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
    }

    public void onUserMessageReceived(String str, String str2) {
    }
}
