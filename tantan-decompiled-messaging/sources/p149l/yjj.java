package p149l;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.cosmos.mdlog.MDLog;
import fi.iki.elonen.NanoHTTPD;
import immomo.com.mklibrary.server.LocalServerHandler;
import java.io.File;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class yjj implements zjj {
    /* JADX INFO: renamed from: c */
    private String m215066c(File file) {
        if (file == null) {
            return null;
        }
        String strM152645a = m200.m152645a(file);
        return strM152645a == null ? OSSConstants.DEFAULT_OBJECT_CONTENT_TYPE : strM152645a;
    }

    /* JADX INFO: renamed from: d */
    private void m215067d(File file, String str) throws Exception {
        if (file == null || TextUtils.isEmpty(str)) {
            return;
        }
        File file2 = file;
        while (file2.exists()) {
            file2 = new File(file.getAbsolutePath() + ".temp0");
        }
        phw.m169153b().m169154a().mo87144b(str, file2, null, null);
        if (!file2.exists() || file2.length() <= 0) {
            file2.delete();
        } else if (file2 != file) {
            file.delete();
            file2.renameTo(file);
        }
    }

    @Override // p149l.w0m
    /* JADX INFO: renamed from: a */
    public boolean mo97152a(Map<String, String> map, String str, String str2) {
        return m200.m152647c(str) != null;
    }

    @Override // p149l.w0m
    /* JADX INFO: renamed from: b */
    public NanoHTTPD.Response mo97153b(Map<String, String> map, String str, String str2) {
        boolean zEquals = "1".equals(map.get("cache"));
        File fileM220666g = zwm.m220666g(str);
        if (fileM220666g != null) {
            String strM215066c = m215066c(fileM220666g);
            if (strM215066c == null) {
                strM215066c = m200.m152647c(str);
            }
            try {
                return fqd.m122694a(strM215066c, fileM220666g);
            } catch (Exception e) {
                MDLog.m7389d("LOCAL_SERVER_IProcessor", "read local file failed! try to download from " + str);
                MDLog.printErrStackTrace("LOCAL_SERVER_IProcessor", e);
                if (zEquals) {
                    try {
                        m215067d(fileM220666g, str);
                        NanoHTTPD.Response responseM122694a = fqd.m122694a(strM215066c, fileM220666g);
                        if (LocalServerHandler.m87200g()) {
                            responseM122694a.m86960b("file_from", "server");
                        }
                        return responseM122694a;
                    } catch (Exception e2) {
                        MDLog.printErrStackTrace("LOCAL_SERVER_IProcessor", e2, "download file failed!", new Object[0]);
                        return fqd.m122701h("no file in online server for uri: " + str);
                    }
                }
            }
        }
        return fqd.m122701h("no file for uri: " + str);
    }
}
