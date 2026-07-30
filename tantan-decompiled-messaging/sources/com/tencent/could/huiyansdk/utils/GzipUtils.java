package com.tencent.could.huiyansdk.utils;

import com.tencent.could.component.common.p079ai.utils.GZipUtils;

/* JADX INFO: loaded from: classes2.dex */
public class GzipUtils {
    public static byte[] compress(String str) {
        return GZipUtils.compress(str);
    }

    public static String uncompressToString(byte[] bArr) {
        return GZipUtils.uncompressToString(bArr);
    }
}
