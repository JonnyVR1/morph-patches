package com.momo.mcamera.mask;

import android.content.Context;
import com.core.glcore.util.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.momo.mcamera.mask.batchbean.BatchMeta;
import com.momo.mcamera.mask.batchbean.BatchSticker;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class Etc1Batch implements Serializable {

    @SerializedName("meta")
    private BatchMeta batchMeta;

    @SerializedName("frames")
    List<BatchSticker> batchStickers;

    public static Etc1Batch getEffectModel(String str) {
        return (Etc1Batch) JsonUtil.getInstance().fromJson(str, Etc1Batch.class);
    }

    public static String getEtc1Batch(Context context, String str) {
        return JsonUtil.getInstance().jsonStringFromFile(context, str);
    }

    public static String toEffectCmd(Etc1Batch etc1Batch) {
        return JsonUtil.getInstance().toJson(etc1Batch);
    }

    public BatchMeta getBatchMeta() {
        return this.batchMeta;
    }

    public List<BatchSticker> getBatchStickers() {
        return this.batchStickers;
    }

    public void setBatchMeta(BatchMeta batchMeta) {
        this.batchMeta = batchMeta;
    }

    public void setBatchStickers(List<BatchSticker> list) {
        this.batchStickers = list;
    }
}
