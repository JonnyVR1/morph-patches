package io.agora.rtc2;

import io.agora.rtc2.video.VideoEncoderConfiguration;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class LocalTranscoderConfiguration {
    public ArrayList<TranscodingVideoStream> transcodingVideoStreams = new ArrayList<>();
    public boolean syncWithPrimaryCamera = true;
    public VideoEncoderConfiguration videoOutputConfiguration = new VideoEncoderConfiguration();

    public static class TranscodingVideoStream {
        public int mediaPlayerId;
        public int remoteUserUid = 0;
        public Constants.VideoSourceType sourceType = Constants.VideoSourceType.VIDEO_SOURCE_CAMERA_PRIMARY;
        public String imageUrl = null;

        /* JADX INFO: renamed from: x */
        public int f63351x = 0;

        /* JADX INFO: renamed from: y */
        public int f63352y = 0;
        public int width = 0;
        public int height = 0;
        public int zOrder = 0;
        public double alpha = 1.0d;
        public boolean mirror = false;
    }
}
