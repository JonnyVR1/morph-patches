package javax.servlet;

import java.io.IOException;
import java.io.Serializable;
import java.util.Enumeration;
import java.util.ResourceBundle;
import p153l.ase0;
import p153l.gse0;
import p153l.lse0;
import p153l.wtq0;
import p153l.yre0;
import p153l.zre0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GenericServlet implements yre0, zre0, Serializable {
    private static final String LSTRING_FILE = "javax.servlet.LocalStrings";
    private static ResourceBundle lStrings = ResourceBundle.getBundle(LSTRING_FILE);
    private transient zre0 config;

    @Override // p153l.yre0
    public void destroy() {
    }

    @Override // p153l.zre0
    public String getInitParameter(String str) {
        zre0 servletConfig = getServletConfig();
        if (servletConfig != null) {
            return servletConfig.getInitParameter(str);
        }
        wtq0.m207906a(lStrings.getString("err.servlet_config_not_initialized"));
        return null;
    }

    @Override // p153l.zre0
    public Enumeration<String> getInitParameterNames() {
        zre0 servletConfig = getServletConfig();
        if (servletConfig != null) {
            return servletConfig.getInitParameterNames();
        }
        wtq0.m207906a(lStrings.getString("err.servlet_config_not_initialized"));
        return null;
    }

    public zre0 getServletConfig() {
        return this.config;
    }

    @Override // p153l.zre0
    public ase0 getServletContext() {
        zre0 servletConfig = getServletConfig();
        if (servletConfig != null) {
            return servletConfig.getServletContext();
        }
        wtq0.m207906a(lStrings.getString("err.servlet_config_not_initialized"));
        return null;
    }

    public String getServletInfo() {
        return "";
    }

    @Override // p153l.zre0
    public String getServletName() {
        zre0 servletConfig = getServletConfig();
        if (servletConfig != null) {
            return servletConfig.getServletName();
        }
        wtq0.m207906a(lStrings.getString("err.servlet_config_not_initialized"));
        return null;
    }

    @Override // p153l.yre0
    public void init(zre0 zre0Var) throws ServletException {
        this.config = zre0Var;
        init();
    }

    public void log(String str) {
        getServletContext().log(getServletName() + ": " + str);
    }

    @Override // p153l.yre0
    public abstract void service(gse0 gse0Var, lse0 lse0Var) throws ServletException, IOException;

    public void init() throws ServletException {
    }

    public void log(String str, Throwable th) {
        getServletContext().log(getServletName() + ": " + str, th);
    }
}
