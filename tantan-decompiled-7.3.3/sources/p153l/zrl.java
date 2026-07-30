package p153l;

import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public abstract class zrl {
    public abstract String getAppId();

    public abstract String getDefaultLocalDNSConfigs();

    public String getDocumentBasePath() {
        File file = new File(w1c.m204390a().getFilesDir(), "mmdns_cache");
        if (!file.exists()) {
            file.mkdir();
        }
        return file.getAbsolutePath() + File.separator;
    }

    public String getKeyStoreSha1() {
        return "";
    }

    public String getPreHost() {
        return "";
    }

    public abstract String getUserAgent();
}
