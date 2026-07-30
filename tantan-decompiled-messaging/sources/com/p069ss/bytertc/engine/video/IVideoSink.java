package com.p069ss.bytertc.engine.video;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes13.dex */
public interface IVideoSink {

    @Retention(RetentionPolicy.SOURCE)
    public @interface PixelFormat {
        public static final int I420 = 1;
        public static final int Original = 0;
        public static final int RGBA = 5;
    }

    int getRenderElapse();

    void onFrame(IVideoFrame iVideoFrame);
}
