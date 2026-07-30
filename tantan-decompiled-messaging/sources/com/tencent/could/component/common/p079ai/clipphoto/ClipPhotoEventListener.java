package com.tencent.could.component.common.p079ai.clipphoto;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public interface ClipPhotoEventListener {
    void doStartCompressImage();

    void getSelectPhotoUri(Uri uri);

    void sendBitmapWithBase64(String str);

    void sendClipPhotoError(String str);
}
