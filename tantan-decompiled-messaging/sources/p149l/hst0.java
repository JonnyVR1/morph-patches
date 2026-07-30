package p149l;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes6.dex */
public abstract class hst0 {

    /* JADX INFO: renamed from: a */
    public static hst0 f109348a = new zqt0();

    /* JADX INFO: renamed from: b */
    public static synchronized hst0 m132803b() {
        return f109348a;
    }

    /* JADX INFO: renamed from: a */
    public abstract URLConnection mo132804a(URL url, String str) throws IOException;
}
