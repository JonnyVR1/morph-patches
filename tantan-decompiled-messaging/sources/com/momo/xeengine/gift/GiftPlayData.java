package com.momo.xeengine.gift;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
final class GiftPlayData {
    private final GiftEntity giftEntity;
    private SVGAGiftDescriptor svgaGiftDescriptor;
    private GiftType type;
    private VideoGiftDescriptor videoGiftDescriptor;

    public GiftPlayData(@NotNull GiftEntity giftEntity) {
        JSONObject jSONObjectLoadJsonFile;
        this.type = GiftType.UNKNOWN;
        this.giftEntity = giftEntity;
        String path = giftEntity.getPath();
        if (isEngineGift(path)) {
            this.type = GiftType.ENGINE;
            return;
        }
        JSONObject jSONObjectLoadJsonFile2 = loadJsonFile(new File(path, "config.json"));
        if (jSONObjectLoadJsonFile2 != null) {
            if (loadVideoIfAvailable(path, jSONObjectLoadJsonFile2)) {
                this.type = GiftType.VIDEO;
                return;
            } else if (loadSvgaIfAvailable(path, jSONObjectLoadJsonFile2)) {
                this.svgaGiftDescriptor.setLoops(giftEntity.getLoops());
                this.type = GiftType.SVGA;
                return;
            }
        }
        if (isVideoFileAtPath(path)) {
            this.type = GiftType.VIDEO;
            this.videoGiftDescriptor = VideoGiftDescriptor.create(path);
            return;
        }
        if (TextUtils.isEmpty(giftEntity.getSpecJson())) {
            jSONObjectLoadJsonFile = loadJsonFile(new File(path, "spec.json"));
        } else {
            try {
                JSONObject jSONObject = new JSONObject(giftEntity.getSpecJson());
                if (!jSONObject.has("scaleType")) {
                    jSONObject.put("scaleType", SVGAScaleType.WIDTH.getValue());
                }
                jSONObjectLoadJsonFile = jSONObject;
            } catch (JSONException unused) {
                return;
            }
        }
        if (jSONObjectLoadJsonFile == null || !loadSvgaIfAvailableFromSpec(path, jSONObjectLoadJsonFile)) {
            return;
        }
        this.svgaGiftDescriptor.setLoops(giftEntity.getLoops());
        this.type = GiftType.SVGA;
        if (giftEntity.getScaleType() != SVGAScaleType.AUTO) {
            this.svgaGiftDescriptor.getSvgaInfo().setScaleType(giftEntity.getScaleType());
        }
        if (giftEntity.getPositionType() != SVGAPositionType.AUTO) {
            this.svgaGiftDescriptor.getSvgaInfo().setPositionType(giftEntity.getPositionType());
        }
    }

    private boolean isEngineGift(String str) {
        return new File(str, "app.lua").exists();
    }

    private boolean isVideoFileAtPath(String str) {
        String name;
        int iLastIndexOf;
        if (str == null) {
            return false;
        }
        try {
            File file = new File(str);
            if (!file.exists() || file.isDirectory() || (iLastIndexOf = (name = file.getName()).lastIndexOf(46)) == -1) {
                return false;
            }
            return name.substring(iLastIndexOf + 1).toLowerCase().equals("mp4");
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean loadSvgaIfAvailable(String str, JSONObject jSONObject) {
        SVGAGiftDescriptor sVGAGiftDescriptorCreateWithConfig = SVGAGiftDescriptor.createWithConfig(str, jSONObject);
        if (sVGAGiftDescriptorCreateWithConfig == null) {
            return false;
        }
        this.svgaGiftDescriptor = sVGAGiftDescriptorCreateWithConfig;
        return true;
    }

    private boolean loadSvgaIfAvailableFromSpec(String str, JSONObject jSONObject) {
        SVGAGiftDescriptor sVGAGiftDescriptorCreateWithSpec = SVGAGiftDescriptor.createWithSpec(str, jSONObject);
        if (sVGAGiftDescriptorCreateWithSpec == null) {
            return false;
        }
        this.svgaGiftDescriptor = sVGAGiftDescriptorCreateWithSpec;
        return true;
    }

    private boolean loadVideoIfAvailable(String str, JSONObject jSONObject) {
        VideoGiftDescriptor videoGiftDescriptorCreate = VideoGiftDescriptor.create(str, jSONObject);
        if (videoGiftDescriptorCreate == null) {
            return false;
        }
        this.videoGiftDescriptor = videoGiftDescriptorCreate;
        return true;
    }

    public GiftEntity getGiftEntity() {
        return this.giftEntity;
    }

    public SVGAGiftDescriptor getSvgaGiftData() {
        return this.svgaGiftDescriptor;
    }

    public GiftType getType() {
        return this.type;
    }

    public VideoGiftDescriptor getVideoGiftData() {
        return this.videoGiftDescriptor;
    }

    public JSONObject loadJsonFile(File file) {
        if (!file.exists()) {
            return null;
        }
        try {
            String fileToString = GiftUtils.readFileToString(file);
            if (TextUtils.isEmpty(fileToString)) {
                return null;
            }
            return new JSONObject(fileToString);
        } catch (Exception unused) {
            return null;
        }
    }

    @NonNull
    public String toString() {
        return "[" + this.type.name() + "]:" + this.giftEntity.getId();
    }
}
