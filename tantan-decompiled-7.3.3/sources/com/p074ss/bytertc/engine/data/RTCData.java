package com.p074ss.bytertc.engine.data;

import android.util.Pair;
import com.p074ss.bytertc.engine.VideoStreamDescription;
import com.p074ss.bytertc.engine.utils.LogUtil;
import com.p074ss.bytertc.engine.video.VideoEncoderConfiguration;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public class RTCData {
    private static final String TAG = "RTCData";
    private VideoEncoderConfiguration.OrientationMode mOrientationMode;
    private VideoStreamDescription[] videoStreamDescriptions = new VideoStreamDescription[1];

    public static class SingletonHelper {
        private static final RTCData INSTANCE = new RTCData();

        private SingletonHelper() {
        }
    }

    public RTCData() {
        VideoStreamDescription videoStreamDescription = new VideoStreamDescription();
        videoStreamDescription.videoSize = new Pair<>(640, 360);
        videoStreamDescription.frameRate = 20;
        videoStreamDescription.maxKbps = 600;
        this.videoStreamDescriptions[0] = videoStreamDescription;
        this.mOrientationMode = VideoEncoderConfiguration.OrientationMode.ORIENTATION_MODE_ADAPTIVE;
    }

    public static RTCData instance() {
        return SingletonHelper.INSTANCE;
    }

    public VideoEncoderConfiguration.OrientationMode getOrientationMode() {
        return this.mOrientationMode;
    }

    public VideoStreamDescription[] getVideoStreamDescriptions() {
        return this.videoStreamDescriptions;
    }

    public void setOrientationMode(VideoEncoderConfiguration.OrientationMode orientationMode) {
        this.mOrientationMode = orientationMode;
    }

    public void setVideoStreamDescriptions(VideoStreamDescription[] videoStreamDescriptionArr) {
        LogUtil.m82086i(TAG, "setVideoStreamDescriptions: " + Arrays.toString(videoStreamDescriptionArr));
        this.videoStreamDescriptions = videoStreamDescriptionArr;
    }
}
