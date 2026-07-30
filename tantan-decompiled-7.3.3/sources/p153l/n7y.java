package p153l;

import com.cosmos.mdlog.MDLog;

/* JADX INFO: loaded from: classes7.dex */
public class n7y {
    static {
        try {
            System.loadLibrary("yuvutils");
            System.loadLibrary("mmcrypto");
            System.loadLibrary("mmssl");
            System.loadLibrary("cosmosffmpeg");
            System.loadLibrary("c++_shared");
            System.loadLibrary("MediaUtils");
        } catch (UnsatisfiedLinkError e) {
            MDLog.printErrStackTrace("MediaUtils", e);
            ylc0.m216566a(kv0.f128935b, "yuvutils");
            ylc0.m216566a(kv0.f128935b, "mmcrypto");
            ylc0.m216566a(kv0.f128935b, "mmssl");
            ylc0.m216566a(kv0.f128935b, "cosmosffmpeg");
            ylc0.m216566a(kv0.f128935b, "MediaUtils");
        }
    }
}
