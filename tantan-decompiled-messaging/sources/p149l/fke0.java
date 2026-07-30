package p149l;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;
import javax.servlet.DispatcherType;

/* JADX INFO: loaded from: classes2.dex */
public class fke0 implements bke0 {
    private bke0 request;

    public fke0(bke0 bke0Var) {
        if (bke0Var != null) {
            this.request = bke0Var;
        } else {
            ig3.m135964a("Request cannot be null");
            throw null;
        }
    }

    @Override // p149l.bke0
    public h21 getAsyncContext() {
        return this.request.getAsyncContext();
    }

    @Override // p149l.bke0
    public Object getAttribute(String str) {
        return this.request.getAttribute(str);
    }

    @Override // p149l.bke0
    public Enumeration<String> getAttributeNames() {
        return this.request.getAttributeNames();
    }

    @Override // p149l.bke0
    public String getCharacterEncoding() {
        return this.request.getCharacterEncoding();
    }

    @Override // p149l.bke0
    public int getContentLength() {
        return this.request.getContentLength();
    }

    @Override // p149l.bke0
    public String getContentType() {
        return this.request.getContentType();
    }

    @Override // p149l.bke0
    public DispatcherType getDispatcherType() {
        return this.request.getDispatcherType();
    }

    @Override // p149l.bke0
    public yje0 getInputStream() throws IOException {
        return this.request.getInputStream();
    }

    @Override // p149l.bke0
    public String getLocalAddr() {
        return this.request.getLocalAddr();
    }

    @Override // p149l.bke0
    public String getLocalName() {
        return this.request.getLocalName();
    }

    @Override // p149l.bke0
    public int getLocalPort() {
        return this.request.getLocalPort();
    }

    @Override // p149l.bke0
    public Locale getLocale() {
        return this.request.getLocale();
    }

    @Override // p149l.bke0
    public Enumeration<Locale> getLocales() {
        return this.request.getLocales();
    }

    @Override // p149l.bke0
    public String getParameter(String str) {
        return this.request.getParameter(str);
    }

    @Override // p149l.bke0
    public Map<String, String[]> getParameterMap() {
        return this.request.getParameterMap();
    }

    @Override // p149l.bke0
    public Enumeration<String> getParameterNames() {
        return this.request.getParameterNames();
    }

    @Override // p149l.bke0
    public String[] getParameterValues(String str) {
        return this.request.getParameterValues(str);
    }

    @Override // p149l.bke0
    public String getProtocol() {
        return this.request.getProtocol();
    }

    @Override // p149l.bke0
    public BufferedReader getReader() throws IOException {
        return this.request.getReader();
    }

    @Override // p149l.bke0
    public String getRealPath(String str) {
        return this.request.getRealPath(str);
    }

    @Override // p149l.bke0
    public String getRemoteAddr() {
        return this.request.getRemoteAddr();
    }

    @Override // p149l.bke0
    public String getRemoteHost() {
        return this.request.getRemoteHost();
    }

    @Override // p149l.bke0
    public int getRemotePort() {
        return this.request.getRemotePort();
    }

    public bke0 getRequest() {
        return this.request;
    }

    @Override // p149l.bke0
    public ytc0 getRequestDispatcher(String str) {
        return this.request.getRequestDispatcher(str);
    }

    @Override // p149l.bke0
    public String getScheme() {
        return this.request.getScheme();
    }

    @Override // p149l.bke0
    public String getServerName() {
        return this.request.getServerName();
    }

    @Override // p149l.bke0
    public int getServerPort() {
        return this.request.getServerPort();
    }

    @Override // p149l.bke0
    public vje0 getServletContext() {
        return this.request.getServletContext();
    }

    @Override // p149l.bke0
    public boolean isAsyncStarted() {
        return this.request.isAsyncStarted();
    }

    @Override // p149l.bke0
    public boolean isAsyncSupported() {
        return this.request.isAsyncSupported();
    }

    @Override // p149l.bke0
    public boolean isSecure() {
        return this.request.isSecure();
    }

    public boolean isWrapperFor(Class cls) {
        if (!bke0.class.isAssignableFrom(cls)) {
            eke0.m116959a("Given class ", cls.getName(), " not a subinterface of ", bke0.class.getName());
            return false;
        }
        if (cls.isAssignableFrom(this.request.getClass())) {
            return true;
        }
        bke0 bke0Var = this.request;
        if (bke0Var instanceof fke0) {
            return ((fke0) bke0Var).isWrapperFor(cls);
        }
        return false;
    }

    @Override // p149l.bke0
    public void removeAttribute(String str) {
        this.request.removeAttribute(str);
    }

    @Override // p149l.bke0
    public void setAttribute(String str, Object obj) {
        this.request.setAttribute(str, obj);
    }

    @Override // p149l.bke0
    public void setCharacterEncoding(String str) throws UnsupportedEncodingException {
        this.request.setCharacterEncoding(str);
    }

    public void setRequest(bke0 bke0Var) {
        if (bke0Var != null) {
            this.request = bke0Var;
        } else {
            ig3.m135964a("Request cannot be null");
        }
    }

    @Override // p149l.bke0
    public h21 startAsync() throws IllegalStateException {
        return this.request.startAsync();
    }

    @Override // p149l.bke0
    public h21 startAsync(bke0 bke0Var, gke0 gke0Var) throws IllegalStateException {
        return this.request.startAsync(bke0Var, gke0Var);
    }

    public boolean isWrapperFor(bke0 bke0Var) {
        bke0 bke0Var2 = this.request;
        if (bke0Var2 == bke0Var) {
            return true;
        }
        if (bke0Var2 instanceof fke0) {
            return ((fke0) bke0Var2).isWrapperFor(bke0Var);
        }
        return false;
    }
}
