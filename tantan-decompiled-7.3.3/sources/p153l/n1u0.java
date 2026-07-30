package p153l;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes6.dex */
public abstract class n1u0 {

    /* JADX INFO: renamed from: a */
    public static n1u0 f139794a = new f0u0();

    /* JADX INFO: renamed from: b */
    public static synchronized n1u0 m161145b() {
        return f139794a;
    }

    /* JADX INFO: renamed from: a */
    public abstract URLConnection mo123516a(URL url, String str) throws IOException;
}
