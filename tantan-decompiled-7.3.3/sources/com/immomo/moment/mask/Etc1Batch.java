package com.immomo.moment.mask;

import android.content.Context;
import com.google.gson.annotations.SerializedName;
import com.immomo.moment.mask.batchbean.BatchMeta;
import com.immomo.moment.mask.batchbean.BatchSticker;
import java.io.Serializable;
import java.util.List;
import p153l.vrq;

/* JADX INFO: loaded from: classes7.dex */
public class Etc1Batch implements Serializable {

    @SerializedName("meta")
    private BatchMeta batchMeta;

    @SerializedName("frames")
    List<BatchSticker> batchStickers;

    public static Etc1Batch getEffectModel(String str) {
        return (Etc1Batch) vrq.m202514b().m202515a(str, Etc1Batch.class);
    }

    public static String getEtc1Batch(Context context, String str) {
        return vrq.m202514b().m202516c(str);
    }

    public static String toEffectCmd(Etc1Batch etc1Batch) {
        return vrq.m202514b().m202517d(etc1Batch);
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
