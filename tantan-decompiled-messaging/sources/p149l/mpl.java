package p149l;

import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public abstract class mpl {
    public abstract String getAppId();

    public abstract String getDefaultLocalDNSConfigs();

    public String getDocumentBasePath() {
        File file = new File(j0c.m139157a().getFilesDir(), "mmdns_cache");
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
