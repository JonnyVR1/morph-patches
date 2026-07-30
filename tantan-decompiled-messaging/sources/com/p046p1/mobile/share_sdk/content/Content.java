package com.p046p1.mobile.share_sdk.content;

import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public interface Content extends Serializable {
    File getFile();

    String getLargeBmpPath();

    String getSummary();

    String getThumbBmpPath();

    String getTitle();

    int getType();

    String getURL();
}
