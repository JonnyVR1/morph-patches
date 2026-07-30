package com.core.glcore.datadot;

import com.core.glcore.util.JsonUtil;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class DataDotUtils implements Serializable {
    private static volatile DataDotUtils instance;

    @SerializedName("edit_info")
    private EditDataDotInfo mEditDataDotInfo;

    @SerializedName("photo_info")
    private PhotoDataDotInfo mPhotoDataDotInfo;

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

    public void clearPhotoDataDotInfo() {
        if (this.mPhotoDataDotInfo != null) {
            this.mPhotoDataDotInfo = null;
        }
    }

    public void clearRecoderDataDotInfo() {
        if (this.mRecoderDataDotInfo != null) {
            this.mRecoderDataDotInfo = null;
        }
    }

    public DataDotUtils getDataDot(String str) {
        return (DataDotUtils) JsonUtil.getInstance().fromJson(str, DataDotUtils.class);
    }

    public EditDataDotInfo getEditDataDotInfo() {
        if (this.mEditDataDotInfo == null) {
            this.mEditDataDotInfo = new EditDataDotInfo();
        }
        return this.mEditDataDotInfo;
    }

    public PhotoDataDotInfo getPhotoDataDotInfo() {
        if (this.mPhotoDataDotInfo == null) {
            this.mPhotoDataDotInfo = new PhotoDataDotInfo();
        }
        return this.mPhotoDataDotInfo;
    }

    public RecoderDataDotInfo getRecoderDataDotInfo() {
        if (this.mRecoderDataDotInfo == null) {
            this.mRecoderDataDotInfo = new RecoderDataDotInfo();
        }
        return this.mRecoderDataDotInfo;
    }

    public void setEditDataDotInfo(EditDataDotInfo editDataDotInfo) {
        this.mEditDataDotInfo = editDataDotInfo;
    }

    public void setPhotoDataDotInfo(PhotoDataDotInfo photoDataDotInfo) {
        this.mPhotoDataDotInfo = photoDataDotInfo;
    }

    public void setRecoderDataDotInfo(RecoderDataDotInfo recoderDataDotInfo) {
        this.mRecoderDataDotInfo = recoderDataDotInfo;
    }

    public String toDataDot() {
        return JsonUtil.getInstance().toJson(instance);
    }
}
