package com.tantanapp.android.injecter.facade.service;

import android.net.Uri;
import com.tantanapp.android.injecter.facade.template.IProvider;

/* JADX INFO: loaded from: classes13.dex */
public interface PathReplaceService extends IProvider {
    String forString(String str);

    Uri forUri(Uri uri);
}
