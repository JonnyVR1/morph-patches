package javax.servlet.http;

import java.io.IOException;
import java.util.Collection;
import p149l.gke0;

/* JADX INFO: loaded from: classes2.dex */
public interface HttpServletResponse extends gke0 {
    void addCookie(Cookie cookie);

    void addDateHeader(String str, long j);

    void addHeader(String str, String str2);

    void addIntHeader(String str, int i);

    boolean containsHeader(String str);

    String encodeRedirectURL(String str);

    String encodeRedirectUrl(String str);

    String encodeURL(String str);

    String encodeUrl(String str);

    String getHeader(String str);

    Collection<String> getHeaderNames();

    Collection<String> getHeaders(String str);

    int getStatus();

    void sendError(int i) throws IOException;

    void sendError(int i, String str) throws IOException;

    void sendRedirect(String str) throws IOException;

    void setDateHeader(String str, long j);

    void setHeader(String str, String str2);

    void setIntHeader(String str, int i);

    void setStatus(int i);

    void setStatus(int i, String str);
}
