package p149l;

import com.cosmos.mdlog.MDLog;

/* JADX INFO: loaded from: classes7.dex */
public class qyx {
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
            rdc0.m178959a(dv0.f88023b, "yuvutils");
            rdc0.m178959a(dv0.f88023b, "mmcrypto");
            rdc0.m178959a(dv0.f88023b, "mmssl");
            rdc0.m178959a(dv0.f88023b, "cosmosffmpeg");
            rdc0.m178959a(dv0.f88023b, "MediaUtils");
        }
    }
}
