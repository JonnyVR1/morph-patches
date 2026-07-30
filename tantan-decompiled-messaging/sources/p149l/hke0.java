package p149l;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class hke0 implements gke0 {
    private gke0 response;

    public hke0(gke0 gke0Var) {
        if (gke0Var != null) {
            this.response = gke0Var;
        } else {
            ig3.m135964a("Response cannot be null");
            throw null;
        }
    }

    @Override // p149l.gke0
    public void flushBuffer() throws IOException {
        this.response.flushBuffer();
    }

    @Override // p149l.gke0
    public int getBufferSize() {
        return this.response.getBufferSize();
    }

    @Override // p149l.gke0
    public String getCharacterEncoding() {
        return this.response.getCharacterEncoding();
    }

    @Override // p149l.gke0
    public String getContentType() {
        return this.response.getContentType();
    }

    @Override // p149l.gke0
    public Locale getLocale() {
        return this.response.getLocale();
    }

    @Override // p149l.gke0
    public zje0 getOutputStream() throws IOException {
        return this.response.getOutputStream();
    }

    public gke0 getResponse() {
        return this.response;
    }

    @Override // p149l.gke0
    public PrintWriter getWriter() throws IOException {
        return this.response.getWriter();
    }

    @Override // p149l.gke0
    public boolean isCommitted() {
        return this.response.isCommitted();
    }

    public boolean isWrapperFor(Class cls) {
        if (!gke0.class.isAssignableFrom(cls)) {
            eke0.m116959a("Given class ", cls.getName(), " not a subinterface of ", gke0.class.getName());
            return false;
        }
        if (cls.isAssignableFrom(this.response.getClass())) {
            return true;
        }
        gke0 gke0Var = this.response;
        if (gke0Var instanceof hke0) {
            return ((hke0) gke0Var).isWrapperFor(cls);
        }
        return false;
    }

    @Override // p149l.gke0
    public void reset() {
        this.response.reset();
    }

    @Override // p149l.gke0
    public void resetBuffer() {
        this.response.resetBuffer();
    }

    @Override // p149l.gke0
    public void setBufferSize(int i) {
        this.response.setBufferSize(i);
    }

    @Override // p149l.gke0
    public void setCharacterEncoding(String str) {
        this.response.setCharacterEncoding(str);
    }

    @Override // p149l.gke0
    public void setContentLength(int i) {
        this.response.setContentLength(i);
    }

    @Override // p149l.gke0
    public void setContentType(String str) {
        this.response.setContentType(str);
    }

    @Override // p149l.gke0
    public void setLocale(Locale locale) {
        this.response.setLocale(locale);
    }

    public void setResponse(gke0 gke0Var) {
        if (gke0Var != null) {
            this.response = gke0Var;
        } else {
            ig3.m135964a("Response cannot be null");
        }
    }

    public boolean isWrapperFor(gke0 gke0Var) {
        gke0 gke0Var2 = this.response;
        if (gke0Var2 == gke0Var) {
            return true;
        }
        if (gke0Var2 instanceof hke0) {
            return ((hke0) gke0Var2).isWrapperFor(gke0Var);
        }
        return false;
    }
}
