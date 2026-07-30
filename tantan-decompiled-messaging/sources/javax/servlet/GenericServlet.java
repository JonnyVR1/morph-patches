package javax.servlet;

import java.io.IOException;
import java.io.Serializable;
import java.util.Enumeration;
import java.util.ResourceBundle;
import p149l.bke0;
import p149l.gke0;
import p149l.qkq0;
import p149l.tje0;
import p149l.uje0;
import p149l.vje0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GenericServlet implements tje0, uje0, Serializable {
    private static final String LSTRING_FILE = "javax.servlet.LocalStrings";
    private static ResourceBundle lStrings = ResourceBundle.getBundle(LSTRING_FILE);
    private transient uje0 config;

    @Override // p149l.tje0
    public void destroy() {
    }

    @Override // p149l.uje0
    public String getInitParameter(String str) {
        uje0 servletConfig = getServletConfig();
        if (servletConfig != null) {
            return servletConfig.getInitParameter(str);
        }
        qkq0.m175383a(lStrings.getString("err.servlet_config_not_initialized"));
        return null;
    }

    @Override // p149l.uje0
    public Enumeration<String> getInitParameterNames() {
        uje0 servletConfig = getServletConfig();
        if (servletConfig != null) {
            return servletConfig.getInitParameterNames();
        }
        qkq0.m175383a(lStrings.getString("err.servlet_config_not_initialized"));
        return null;
    }

    public uje0 getServletConfig() {
        return this.config;
    }

    @Override // p149l.uje0
    public vje0 getServletContext() {
        uje0 servletConfig = getServletConfig();
        if (servletConfig != null) {
            return servletConfig.getServletContext();
        }
        qkq0.m175383a(lStrings.getString("err.servlet_config_not_initialized"));
        return null;
    }

    public String getServletInfo() {
        return "";
    }

    @Override // p149l.uje0
    public String getServletName() {
        uje0 servletConfig = getServletConfig();
        if (servletConfig != null) {
            return servletConfig.getServletName();
        }
        qkq0.m175383a(lStrings.getString("err.servlet_config_not_initialized"));
        return null;
    }

    @Override // p149l.tje0
    public void init(uje0 uje0Var) throws ServletException {
        this.config = uje0Var;
        init();
    }

    public void log(String str) {
        getServletContext().log(getServletName() + ": " + str);
    }

    @Override // p149l.tje0
    public abstract void service(bke0 bke0Var, gke0 gke0Var) throws ServletException, IOException;

    public void init() throws ServletException {
    }

    public void log(String str, Throwable th) {
        getServletContext().log(getServletName() + ": " + str, th);
    }
}
