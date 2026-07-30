package p153l;

import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes2.dex */
public interface ase0 {
    Object getAttribute(String str);

    String getContextPath();

    String getInitParameter(String str);

    int getMajorVersion();

    String getMimeType(String str);

    c2d0 getRequestDispatcher(String str);

    URL getResource(String str) throws MalformedURLException;

    void log(String str);

    void log(String str, Throwable th);
}
