package com.p069ss.bytertc.engine.audio;

import com.p069ss.bytertc.engine.data.PositionInfo;

/* JADX INFO: loaded from: classes13.dex */
public interface ISpatialAudio {
    void disableRemoteOrientation();

    void enableSpatialAudio(boolean z);

    int removeAllRemotePosition();

    int removeRemotePosition(String str);

    int updateRemotePosition(String str, PositionInfo positionInfo);

    int updateSelfPosition(PositionInfo positionInfo);
}
