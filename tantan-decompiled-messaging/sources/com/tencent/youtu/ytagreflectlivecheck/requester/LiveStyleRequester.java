package com.tencent.youtu.ytagreflectlivecheck.requester;

import com.tencent.youtu.ytagreflectlivecheck.YTAGReflectLiveCheckInterface;

/* JADX INFO: loaded from: classes2.dex */
public interface LiveStyleRequester {

    public static class LiveStyleAndroidData {
        public float lux = 0.0f;
    }

    public static class SeleceData {
        public LiveStyleAndroidData android_data;
        public int platform = 2;
        public int protocal = 1;
        public String version = YTAGReflectLiveCheckInterface.VERSION;
        public String reflect_param = " version 2 ";
        public int change_point_num = 2;

        public SeleceData(float f) {
            LiveStyleAndroidData liveStyleAndroidData = new LiveStyleAndroidData();
            this.android_data = liveStyleAndroidData;
            liveStyleAndroidData.lux = f;
        }
    }
}
