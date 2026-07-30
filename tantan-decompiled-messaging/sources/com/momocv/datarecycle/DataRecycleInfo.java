package com.momocv.datarecycle;

import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public class DataRecycleInfo implements Serializable {
    public int type_ = 0;
    public float score_ = 0.0f;
    public byte[] datum_buf_ = null;
    public String info_ = "";

    public class DataRecyleType {
        public static final int DR_NAKED = 1;
        public static final int DR_NONE = 0;
        public static final int DR_POUT = 3;
        public static final int DR_SMILE = 2;

        public DataRecyleType() {
        }
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public DataRecycleInfo m223815clone() {
        DataRecycleInfo dataRecycleInfo = new DataRecycleInfo();
        dataRecycleInfo.copy_from(this);
        return dataRecycleInfo;
    }

    public boolean copy_from(DataRecycleInfo dataRecycleInfo) {
        if (dataRecycleInfo == null) {
            return false;
        }
        this.info_ = dataRecycleInfo.info_;
        this.type_ = dataRecycleInfo.type_;
        this.score_ = dataRecycleInfo.score_;
        byte[] bArr = dataRecycleInfo.datum_buf_;
        if (bArr == null) {
            return false;
        }
        this.datum_buf_ = (byte[]) bArr.clone();
        return true;
    }
}
