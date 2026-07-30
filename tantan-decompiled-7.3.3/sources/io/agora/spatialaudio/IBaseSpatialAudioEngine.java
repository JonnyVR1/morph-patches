package io.agora.spatialaudio;

import io.agora.rtc2.RtcConnection;

/* JADX INFO: loaded from: classes2.dex */
public abstract class IBaseSpatialAudioEngine {
    public abstract int clearRemotePositions();

    public abstract int muteAllRemoteAudioStreams(boolean z);

    public abstract int muteLocalAudioStream(boolean z);

    public abstract int muteRemoteAudioStream(int i, boolean z);

    public abstract int release();

    public abstract int setAudioRecvRange(float f);

    public abstract int setDistanceUnit(float f);

    public abstract int setMaxAudioRecvCount(int i);

    public abstract int setPlayerAttenuation(int i, double d, boolean z);

    public abstract int setZones(SpatialAudioZone[] spatialAudioZoneArr);

    public abstract int updatePlayerPositionInfo(int i, RemoteVoicePositionInfo remoteVoicePositionInfo);

    public abstract int updateSelfPosition(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4);

    public abstract int updateSelfPositionEx(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, RtcConnection rtcConnection);
}
