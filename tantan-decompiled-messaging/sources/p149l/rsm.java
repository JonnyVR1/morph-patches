package p149l;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.zip.GZIPOutputStream;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
class rsm implements gvl {
    /* JADX INFO: renamed from: c */
    private static byte[] m180692c(String str, String str2) {
        if (str == null || str.length() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes(str2));
            gZIPOutputStream.close();
        } catch (IOException e) {
            inw.m137183u(e);
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // p149l.gvl
    /* JADX INFO: renamed from: a */
    public String mo128259a(JSONObject jSONObject) throws Exception {
        if (!inw.m137179q()) {
            inw.m137185w("global realtime log disabled");
            return null;
        }
        if (jSONObject == null) {
            inw.m137185w("postParams is null");
            return null;
        }
        HashMap map = new HashMap();
        map.put("Content-Encoding", HttpHeaderValues.GZIP);
        return inw.m137172j().mo105190b("https://cm.immomo.com/api/clientLog/uploadv2", map, m180692c(jSONObject.toString(), "UTF-8"));
    }

    @Override // p149l.gvl
    /* JADX INFO: renamed from: b */
    public boolean mo128260b(File file) throws Exception {
        if (!inw.m137178p()) {
            inw.m137185w("global offline log disabled");
            return false;
        }
        if (file == null || !file.exists()) {
            inw.m137182t("file not exist");
            return false;
        }
        fvl fvlVarM137172j = inw.m137172j();
        HashMap map = new HashMap();
        map.put("timestamp", System.currentTimeMillis() + "");
        if (fvlVarM137172j.mo105189a("https://cm.immomo.com/offline/api/clientLog/upload?fr=" + inw.m137166d().mo105191h(), map, file)) {
            inw.m137181s("upload offline file success");
            return true;
        }
        inw.m137182t("upload offline file failed: path: " + file.getAbsolutePath());
        return false;
    }
}
