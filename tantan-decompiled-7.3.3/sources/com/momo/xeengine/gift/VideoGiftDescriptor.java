package com.momo.xeengine.gift;

import android.text.TextUtils;
import java.io.File;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class VideoGiftDescriptor {
    private String videoPath;

    public static VideoGiftDescriptor create(String str, JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("video");
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            File file = new File(str + "/" + string);
            if (file.exists()) {
                VideoGiftDescriptor videoGiftDescriptor = new VideoGiftDescriptor();
                videoGiftDescriptor.videoPath = file.getAbsolutePath();
                return videoGiftDescriptor;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public String getVideoPath() {
        return this.videoPath;
    }

    public static VideoGiftDescriptor create(String str) {
        VideoGiftDescriptor videoGiftDescriptor = new VideoGiftDescriptor();
        videoGiftDescriptor.videoPath = str;
        return videoGiftDescriptor;
    }
}
