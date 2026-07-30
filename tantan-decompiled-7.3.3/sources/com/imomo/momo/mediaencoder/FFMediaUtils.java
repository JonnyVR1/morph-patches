package com.imomo.momo.mediaencoder;

import com.momo.mcamera.util.MDLogTag;

/* JADX INFO: loaded from: classes7.dex */
public class FFMediaUtils {
    static {
        try {
            System.loadLibrary("mdlog");
            System.loadLibrary("mmcrypto");
            System.loadLibrary("mmssl");
            System.loadLibrary("cosmosffmpeg");
            System.loadLibrary("c++_shared");
            System.loadLibrary(MDLogTag.MEDIA_ENCODER_TAG);
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }
}
