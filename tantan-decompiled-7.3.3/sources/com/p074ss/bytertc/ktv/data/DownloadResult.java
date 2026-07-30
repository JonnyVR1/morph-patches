package com.p074ss.bytertc.ktv.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public class DownloadResult {
    public String filePath;
    public DownloadFileType fileType;
    public String musicId;

    @CalledByNative
    public DownloadResult(@NonNull String str, @NonNull DownloadFileType downloadFileType, @Nullable String str2) {
        this.musicId = str;
        this.fileType = downloadFileType;
        this.filePath = str2;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DownloadResult{musicId='");
        sb.append(this.musicId);
        sb.append("', fileType=");
        sb.append(this.fileType);
        if (DownloadFileType.MUSIC == this.fileType) {
            str = "";
        } else {
            str = ", filePath='" + this.filePath + '\'';
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
