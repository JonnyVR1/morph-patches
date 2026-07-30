package com.immomo.moment.mask.batchbean;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public class BatchSize implements Serializable {

    @SerializedName("h")
    private int imageBatchHeight;

    @SerializedName("w")
    private int imageBatchWidth;

    public int getImageBatchHeight() {
        return this.imageBatchHeight;
    }

    public int getImageBatchWidth() {
        return this.imageBatchWidth;
    }

    public void setImageBatchHeight(int i) {
        this.imageBatchHeight = i;
    }

    public void setImageBatchWidth(int i) {
        this.imageBatchWidth = i;
    }
}
