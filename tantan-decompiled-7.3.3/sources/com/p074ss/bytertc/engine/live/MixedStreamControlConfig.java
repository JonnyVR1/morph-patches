package com.p074ss.bytertc.engine.live;

/* JADX INFO: loaded from: classes11.dex */
public class MixedStreamControlConfig {
    public boolean enableVolumeIndication = false;
    public float volumeIndicationInterval = 2.0f;
    public int talkVolume = 0;
    public boolean isAddVolumeValue = false;
    public MixedStreamSEIContentMode seiContentMode = MixedStreamSEIContentMode.MIXED_STREAM_SEI_CONTENT_MODE_DEFAULT;
    public int seiPayloadType = 100;
    public String seiPayloadUuid = "";
    public MixedStreamMediaType mediaType = MixedStreamMediaType.MIXED_STREAM_MEDIA_TYPE_AUDIO_AND_VIDEO;
    public MixedStreamPushMode pushStreamMode = MixedStreamPushMode.ON_STREAM;
}
