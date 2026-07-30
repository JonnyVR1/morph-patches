package com.p074ss.bytertc.engine.audio;

import com.p074ss.bytertc.engine.data.PositionInfo;

/* JADX INFO: loaded from: classes11.dex */
public interface ISpatialAudio {
    void disableRemoteOrientation();

    void enableSpatialAudio(boolean z);

    int removeAllRemotePosition();

    int removeRemotePosition(String str);

    int updateRemotePosition(String str, PositionInfo positionInfo);

    int updateSelfPosition(PositionInfo positionInfo);
}
