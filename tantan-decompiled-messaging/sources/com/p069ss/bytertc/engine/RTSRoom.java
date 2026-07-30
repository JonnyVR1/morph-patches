package com.p069ss.bytertc.engine;

import com.p069ss.bytertc.engine.handler.IRTSRoomEventHandler;
import com.p069ss.bytertc.engine.type.MessageConfig;

/* JADX INFO: loaded from: classes13.dex */
public abstract class RTSRoom {
    public abstract void destroy();

    public abstract int joinRTSRoom(String str, UserInfo userInfo);

    public abstract int leaveRoom();

    public abstract long sendRoomBinaryMessage(byte[] bArr);

    public abstract long sendRoomMessage(String str);

    public abstract long sendUserBinaryMessage(String str, byte[] bArr, MessageConfig messageConfig);

    public abstract long sendUserMessage(String str, String str2, MessageConfig messageConfig);

    public abstract int setRTSRoomEventHandler(IRTSRoomEventHandler iRTSRoomEventHandler);

    public abstract int updateToken(String str);
}
