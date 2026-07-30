package com.cosmos.photon.baseim.p025im;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface IConnectionManager {
    String getCFlag();

    void notifySyncMsgSaved(String str, long j);

    void notifySyncMsgSaved(Map<String, Long> map);

    void post(String str);

    void registerActionHandler(String str, IMessageHandler iMessageHandler);

    void release();

    void removeActionHandler(String str);

    void removeAllActionHandler();

    void send(SendTask sendTask);

    void setAddressProvider(IMJConnectionAddressProvider iMJConnectionAddressProvider);

    void setAuthInfo(AuthInfo authInfo);

    void setIMJEventListener(IMJEventListener iMJEventListener);

    void setTrafficReporter(TrafficReporter trafficReporter);

    void startIMJ();

    void stopIMJ();
}
