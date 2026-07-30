package com.tantanapp.media.ttmediautils.p074io;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes13.dex */
public class FileUtil {
    public static File getCacheDirectory(Context context) {
        return context.getExternalCacheDir();
    }
}
