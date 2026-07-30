package com.immomo.moment.mask.batchbean;

import com.google.gson.annotations.SerializedName;
import com.p046p1.mobile.putong.feed.data.Frame;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public class BatchSticker implements Serializable {

    @SerializedName(Frame.TYPE)
    private BatchFrame frame;

    public BatchFrame getFrame() {
        return this.frame;
    }

    public void setFrame(BatchFrame batchFrame) {
        this.frame = batchFrame;
    }
}
