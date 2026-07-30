package com.immomo.moment.datadot;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public class DataDotUtils implements Serializable {
    private static volatile DataDotUtils instance;

    @SerializedName("edit_info")
    private EditDataDotInfo mEditDataDotInfo;

    @SerializedName("recoder_info")
    private RecoderDataDotInfo mRecoderDataDotInfo;

    private DataDotUtils() {
    }

    public static DataDotUtils getInstance() {
        if (instance == null) {
            synchronized (DataDotUtils.class) {
                try {
                    if (instance == null) {
                        instance = new DataDotUtils();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    public void clearEditDataDotInfo() {
        if (this.mEditDataDotInfo != null) {
            this.mEditDataDotInfo = null;
        }
    }

    public void clearRecoderDataDotInfo() {
        if (this.mRecoderDataDotInfo != null) {
            this.mRecoderDataDotInfo = null;
        }
    }

    public EditDataDotInfo getEditDataDotInfo() {
        if (this.mEditDataDotInfo == null) {
            this.mEditDataDotInfo = new EditDataDotInfo();
        }
        return this.mEditDataDotInfo;
    }

    public RecoderDataDotInfo getRecoderDataDotInfo() {
        if (this.mRecoderDataDotInfo == null) {
            this.mRecoderDataDotInfo = new RecoderDataDotInfo();
        }
        return this.mRecoderDataDotInfo;
    }
}
