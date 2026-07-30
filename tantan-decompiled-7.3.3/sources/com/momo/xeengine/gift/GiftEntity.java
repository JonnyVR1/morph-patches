package com.momo.xeengine.gift;

import androidx.annotation.Keep;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public class GiftEntity {
    private Map<String, String> extendValues;

    /* JADX INFO: renamed from: id */
    private String f15306id;
    private String name;
    private String path;
    private String specJson;
    private int loops = 1;
    private SVGAScaleType scaleType = SVGAScaleType.AUTO;
    private SVGAPositionType positionType = SVGAPositionType.AUTO;
    private boolean syncDownloadResource = true;

    @Nullable
    public Map<String, String> getExtendValues() {
        return this.extendValues;
    }

    public String getId() {
        return this.f15306id;
    }

    public int getLoops() {
        return this.loops;
    }

    public String getName() {
        return this.name;
    }

    public String getPath() {
        return this.path;
    }

    public SVGAPositionType getPositionType() {
        return this.positionType;
    }

    public SVGAScaleType getScaleType() {
        return this.scaleType;
    }

    public String getSpecJson() {
        return this.specJson;
    }

    public boolean isSyncDownloadResource() {
        return this.syncDownloadResource;
    }

    public void setExtendValue(@NotNull String str, @NotNull String str2) {
        if (this.extendValues == null) {
            this.extendValues = new HashMap();
        }
        this.extendValues.put(str, str2);
    }

    public void setExtendValues(@NotNull String str, @NotNull List<String> list) {
        if (this.extendValues == null) {
            this.extendValues = new HashMap();
        }
        for (int i = 0; i < list.size(); i++) {
            String str2 = list.get(i);
            this.extendValues.put(str + "_" + i, str2);
        }
    }

    public void setId(String str) {
        this.f15306id = str;
    }

    public void setLoops(int i) {
        this.loops = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPath(@NotNull String str) {
        this.path = str;
    }

    public void setPositionType(SVGAPositionType sVGAPositionType) {
        this.positionType = sVGAPositionType;
    }

    public void setScaleType(SVGAScaleType sVGAScaleType) {
        this.scaleType = sVGAScaleType;
    }

    public void setSpecJson(String str) {
        this.specJson = str;
    }

    public void setSyncDownloadResource(boolean z) {
        this.syncDownloadResource = z;
    }

    public String toString() {
        return "GiftEntity{path='" + this.path + "'}";
    }

    public boolean verify() {
        try {
            return GiftResourceVerifier.verifyGiftResources(this.path);
        } catch (Throwable unused) {
            return false;
        }
    }

    public void setExtendValues(@NotNull Map<String, String> map) {
        if (this.extendValues == null) {
            this.extendValues = new HashMap();
        }
        this.extendValues.putAll(map);
    }
}
