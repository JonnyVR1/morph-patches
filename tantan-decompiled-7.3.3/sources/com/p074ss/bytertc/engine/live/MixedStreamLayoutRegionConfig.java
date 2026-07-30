package com.p074ss.bytertc.engine.live;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p074ss.bytertc.engine.data.Position;

/* JADX INFO: loaded from: classes11.dex */
public class MixedStreamLayoutRegionConfig {
    public String userID = "";
    public String roomID = "";
    public int locationX = 0;
    public int locationY = 0;
    public int width = 360;
    public int height = 640;
    public int zOrder = 0;
    public double alpha = 1.0d;
    public double cornerRadius = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    public MixedStreamMediaType mediaType = MixedStreamMediaType.MIXED_STREAM_MEDIA_TYPE_AUDIO_AND_VIDEO;
    public MixedStreamRenderMode renderMode = MixedStreamRenderMode.MIXED_STREAM_RENDER_MODE_HIDDEN;
    public boolean isLocalUser = false;
    public MixedStreamVideoType streamType = MixedStreamVideoType.MIXED_STREAM_VIDEO_TYPE_MAIN;
    public MixedStreamLayoutRegionType regionContentType = MixedStreamLayoutRegionType.MIXED_STREAM_LAYOUT_REGION_TYPE_VIDEO_STREAM;
    public byte[] imageWaterMark = null;
    public MixedStreamLayoutRegionImageWaterMarkConfig imageWaterMarkConfig = new MixedStreamLayoutRegionImageWaterMarkConfig(0, 0);
    public MixedStreamAlternateImageFillMode alternateImageFillMode = MixedStreamAlternateImageFillMode.FIT;
    public String alternateImageURL = "";
    public Position spatialPosition = new Position();
    public boolean applySpatialAudio = true;
    public SourceCrop sourceCrop = new SourceCrop();
}
