package p153l;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;
import javax.servlet.DispatcherType;

/* JADX INFO: loaded from: classes2.dex */
public class kse0 implements gse0 {
    private gse0 request;

    public kse0(gse0 gse0Var) {
        if (gse0Var != null) {
            this.request = gse0Var;
        } else {
            wg3.m206174a("Request cannot be null");
            throw null;
        }
    }

    @Override // p153l.gse0
    public o21 getAsyncContext() {
        return this.request.getAsyncContext();
    }

    @Override // p153l.gse0
    public Object getAttribute(String str) {
        return this.request.getAttribute(str);
    }

    @Override // p153l.gse0
    public Enumeration<String> getAttributeNames() {
        return this.request.getAttributeNames();
    }

    @Override // p153l.gse0
    public String getCharacterEncoding() {
        return this.request.getCharacterEncoding();
    }

    @Override // p153l.gse0
    public int getContentLength() {
        return this.request.getContentLength();
    }

    @Override // p153l.gse0
    public String getContentType() {
        return this.request.getContentType();
    }

    @Override // p153l.gse0
    public DispatcherType getDispatcherType() {
        return this.request.getDispatcherType();
    }

    @Override // p153l.gse0
    public dse0 getInputStream() throws IOException {
        return this.request.getInputStream();
    }

    @Override // p153l.gse0
    public String getLocalAddr() {
        return this.request.getLocalAddr();
    }

    @Override // p153l.gse0
    public String getLocalName() {
        return this.request.getLocalName();
    }

    @Override // p153l.gse0
    public int getLocalPort() {
        return this.request.getLocalPort();
    }

    @Override // p153l.gse0
    public Locale getLocale() {
        return this.request.getLocale();
    }

    @Override // p153l.gse0
    public Enumeration<Locale> getLocales() {
        return this.request.getLocales();
    }

    @Override // p153l.gse0
    public String getParameter(String str) {
        return this.request.getParameter(str);
    }

    @Override // p153l.gse0
    public Map<String, String[]> getParameterMap() {
        return this.request.getParameterMap();
    }

    @Override // p153l.gse0
    public Enumeration<String> getParameterNames() {
        return this.request.getParameterNames();
    }

    @Override // p153l.gse0
    public String[] getParameterValues(String str) {
        return this.request.getParameterValues(str);
    }

    @Override // p153l.gse0
    public String getProtocol() {
        return this.request.getProtocol();
    }

    @Override // p153l.gse0
    public BufferedReader getReader() throws IOException {
        return this.request.getReader();
    }

    @Override // p153l.gse0
    public String getRealPath(String str) {
        return this.request.getRealPath(str);
    }

    @Override // p153l.gse0
    public String getRemoteAddr() {
        return this.request.getRemoteAddr();
    }

    @Override // p153l.gse0
    public String getRemoteHost() {
        return this.request.getRemoteHost();
    }

    @Override // p153l.gse0
    public int getRemotePort() {
        return this.request.getRemotePort();
    }

    public gse0 getRequest() {
        return this.request;
    }

    @Override // p153l.gse0
    public c2d0 getRequestDispatcher(String str) {
        return this.request.getRequestDispatcher(str);
    }

    @Override // p153l.gse0
    public String getScheme() {
        return this.request.getScheme();
    }

    @Override // p153l.gse0
    public String getServerName() {
        return this.request.getServerName();
    }

    @Override // p153l.gse0
    public int getServerPort() {
        return this.request.getServerPort();
    }

    @Override // p153l.gse0
    public ase0 getServletContext() {
        return this.request.getServletContext();
    }

    @Override // p153l.gse0
    public boolean isAsyncStarted() {
        return this.request.isAsyncStarted();
    }

    @Override // p153l.gse0
    public boolean isAsyncSupported() {
        return this.request.isAsyncSupported();
    }

    @Override // p153l.gse0
    public boolean isSecure() {
        return this.request.isSecure();
    }

    public boolean isWrapperFor(Class cls) {
        if (!gse0.class.isAssignableFrom(cls)) {
            jse0.m146838a("Given class ", cls.getName(), " not a subinterface of ", gse0.class.getName());
            return false;
        }
        if (cls.isAssignableFrom(this.request.getClass())) {
            return true;
        }
        gse0 gse0Var = this.request;
        if (gse0Var instanceof kse0) {
            return ((kse0) gse0Var).isWrapperFor(cls);
        }
        return false;
    }

    @Override // p153l.gse0
    public void removeAttribute(String str) {
        this.request.removeAttribute(str);
    }

    @Override // p153l.gse0
    public void setAttribute(String str, Object obj) {
        this.request.setAttribute(str, obj);
    }

    @Override // p153l.gse0
    public void setCharacterEncoding(String str) throws UnsupportedEncodingException {
        this.request.setCharacterEncoding(str);
    }

    public void setRequest(gse0 gse0Var) {
        if (gse0Var != null) {
            this.request = gse0Var;
        } else {
            wg3.m206174a("Request cannot be null");
        }
    }

    @Override // p153l.gse0
    public o21 startAsync() throws IllegalStateException {
        return this.request.startAsync();
    }

    @Override // p153l.gse0
    public o21 startAsync(gse0 gse0Var, lse0 lse0Var) throws IllegalStateException {
        return this.request.startAsync(gse0Var, lse0Var);
    }

    public boolean isWrapperFor(gse0 gse0Var) {
        gse0 gse0Var2 = this.request;
        if (gse0Var2 == gse0Var) {
            return true;
        }
        if (gse0Var2 instanceof kse0) {
            return ((kse0) gse0Var2).isWrapperFor(gse0Var);
        }
        return false;
    }
}
