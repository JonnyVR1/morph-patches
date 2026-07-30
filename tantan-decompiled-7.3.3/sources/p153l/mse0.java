package p153l;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class mse0 implements lse0 {
    private lse0 response;

    public mse0(lse0 lse0Var) {
        if (lse0Var != null) {
            this.response = lse0Var;
        } else {
            wg3.m206174a("Response cannot be null");
            throw null;
        }
    }

    @Override // p153l.lse0
    public void flushBuffer() throws IOException {
        this.response.flushBuffer();
    }

    @Override // p153l.lse0
    public int getBufferSize() {
        return this.response.getBufferSize();
    }

    @Override // p153l.lse0
    public String getCharacterEncoding() {
        return this.response.getCharacterEncoding();
    }

    @Override // p153l.lse0
    public String getContentType() {
        return this.response.getContentType();
    }

    @Override // p153l.lse0
    public Locale getLocale() {
        return this.response.getLocale();
    }

    @Override // p153l.lse0
    public ese0 getOutputStream() throws IOException {
        return this.response.getOutputStream();
    }

    public lse0 getResponse() {
        return this.response;
    }

    @Override // p153l.lse0
    public PrintWriter getWriter() throws IOException {
        return this.response.getWriter();
    }

    @Override // p153l.lse0
    public boolean isCommitted() {
        return this.response.isCommitted();
    }

    public boolean isWrapperFor(Class cls) {
        if (!lse0.class.isAssignableFrom(cls)) {
            jse0.m146838a("Given class ", cls.getName(), " not a subinterface of ", lse0.class.getName());
            return false;
        }
        if (cls.isAssignableFrom(this.response.getClass())) {
            return true;
        }
        lse0 lse0Var = this.response;
        if (lse0Var instanceof mse0) {
            return ((mse0) lse0Var).isWrapperFor(cls);
        }
        return false;
    }

    @Override // p153l.lse0
    public void reset() {
        this.response.reset();
    }

    @Override // p153l.lse0
    public void resetBuffer() {
        this.response.resetBuffer();
    }

    @Override // p153l.lse0
    public void setBufferSize(int i) {
        this.response.setBufferSize(i);
    }

    @Override // p153l.lse0
    public void setCharacterEncoding(String str) {
        this.response.setCharacterEncoding(str);
    }

    @Override // p153l.lse0
    public void setContentLength(int i) {
        this.response.setContentLength(i);
    }

    @Override // p153l.lse0
    public void setContentType(String str) {
        this.response.setContentType(str);
    }

    @Override // p153l.lse0
    public void setLocale(Locale locale) {
        this.response.setLocale(locale);
    }

    public void setResponse(lse0 lse0Var) {
        if (lse0Var != null) {
            this.response = lse0Var;
        } else {
            wg3.m206174a("Response cannot be null");
        }
    }

    public boolean isWrapperFor(lse0 lse0Var) {
        lse0 lse0Var2 = this.response;
        if (lse0Var2 == lse0Var) {
            return true;
        }
        if (lse0Var2 instanceof mse0) {
            return ((mse0) lse0Var2).isWrapperFor(lse0Var);
        }
        return false;
    }
}
