package p153l;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.zip.GZIPOutputStream;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
class tum implements yxl {
    /* JADX INFO: renamed from: c */
    private static byte[] m192754c(String str, String str2) {
        if (str == null || str.length() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes(str2));
            gZIPOutputStream.close();
        } catch (IOException e) {
            gqw.m131497u(e);
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // p153l.yxl
    /* JADX INFO: renamed from: a */
    public String mo192755a(JSONObject jSONObject) throws Exception {
        if (!gqw.m131493q()) {
            gqw.m131499w("global realtime log disabled");
            return null;
        }
        if (jSONObject == null) {
            gqw.m131499w("postParams is null");
            return null;
        }
        HashMap map = new HashMap();
        map.put("Content-Encoding", HttpHeaderValues.GZIP);
        return gqw.m131486j().mo130072b("https://cm.immomo.com/api/clientLog/uploadv2", map, m192754c(jSONObject.toString(), "UTF-8"));
    }

    @Override // p153l.yxl
    /* JADX INFO: renamed from: b */
    public boolean mo192756b(File file) throws Exception {
        if (!gqw.m131492p()) {
            gqw.m131499w("global offline log disabled");
            return false;
        }
        if (file == null || !file.exists()) {
            gqw.m131496t("file not exist");
            return false;
        }
        xxl xxlVarM131486j = gqw.m131486j();
        HashMap map = new HashMap();
        map.put("timestamp", System.currentTimeMillis() + "");
        if (xxlVarM131486j.mo130071a("https://cm.immomo.com/offline/api/clientLog/upload?fr=" + gqw.m131480d().mo130070h(), map, file)) {
            gqw.m131495s("upload offline file success");
            return true;
        }
        gqw.m131496t("upload offline file failed: path: " + file.getAbsolutePath());
        return false;
    }
}
