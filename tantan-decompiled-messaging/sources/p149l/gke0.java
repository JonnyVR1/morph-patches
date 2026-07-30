package p149l;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public interface gke0 {
    void flushBuffer() throws IOException;

    int getBufferSize();

    String getCharacterEncoding();

    String getContentType();

    Locale getLocale();

    zje0 getOutputStream() throws IOException;

    PrintWriter getWriter() throws IOException;

    boolean isCommitted();

    void reset();

    void resetBuffer();

    void setBufferSize(int i);

    void setCharacterEncoding(String str);

    void setContentLength(int i);

    void setContentType(String str);

    void setLocale(Locale locale);
}
