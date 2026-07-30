package com.idv.identity.base.algorithm;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public interface IIdentityDelegate {
    void handleCaptureCompleted(int i, Map<String, Object> map);

    void handleEventStated(int i);

    void handleInfoReady(IDFrame iDFrame);

    void handleStateUpdated(int i, IdentityFaceAttr identityFaceAttr);

    void reset();
}
