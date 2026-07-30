package com.tencent.could.component.common.p084ai.clipphoto;

import android.net.Uri;

/* JADX INFO: loaded from: classes12.dex */
public interface ClipPhotoEventListener {
    void doStartCompressImage();

    void getSelectPhotoUri(Uri uri);

    void sendBitmapWithBase64(String str);

    void sendClipPhotoError(String str);
}
