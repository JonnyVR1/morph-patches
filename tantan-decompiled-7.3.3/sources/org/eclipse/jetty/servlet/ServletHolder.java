package org.eclipse.jetty.servlet;

import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import javax.servlet.ServletException;
import javax.servlet.UnavailableException;
import org.eclipse.jetty.security.IdentityService;
import org.eclipse.jetty.security.RunAsToken;
import org.eclipse.jetty.server.Dispatcher;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.UserIdentity;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.util.Loader;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import p153l.ase0;
import p153l.fse0;
import p153l.gse0;
import p153l.lse0;
import p153l.lu10;
import p153l.nse0;
import p153l.wqf0;
import p153l.yre0;
import p153l.zre0;

/* JADX INFO: loaded from: classes2.dex */
public class ServletHolder extends Holder<yre0> implements UserIdentity.Scope, Comparable {
    private static final Logger LOG = Log.getLogger((Class<?>) ServletHolder.class);
    public static final Map<String, String> NO_MAPPED_ROLES = Collections.EMPTY_MAP;
    private transient Config _config;
    private transient boolean _enabled;
    private String _forcedPath;
    private IdentityService _identityService;
    private boolean _initOnStartup;
    private int _initOrder;
    private fse0.InterfaceC17064a _registration;
    private Map<String, String> _roleMap;
    private String _runAsRole;
    private RunAsToken _runAsToken;
    private transient yre0 _servlet;
    private transient long _unavailable;
    private transient UnavailableException _unavailableEx;

    public class Config extends Holder<yre0>.HolderConfig implements zre0 {
        public Config() {
            super();
        }

        @Override // p153l.zre0
        public String getServletName() {
            return ServletHolder.this.getName();
        }
    }

    public class Registration extends Holder<yre0>.HolderRegistration implements fse0.InterfaceC17064a {
        protected lu10 _multipartConfig;

        public Registration() {
            super();
        }

        public Set<String> addMapping(String... strArr) {
            ServletHolder.this.illegalStateIfContextStarted();
            HashSet hashSet = null;
            for (String str : strArr) {
                ServletMapping servletMapping = ServletHolder.this._servletHandler.getServletMapping(str);
                if (servletMapping != null && !servletMapping.isDefault()) {
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(str);
                }
            }
            if (hashSet != null) {
                return hashSet;
            }
            ServletMapping servletMapping2 = new ServletMapping();
            servletMapping2.setServletName(ServletHolder.this.getName());
            servletMapping2.setPathSpecs(strArr);
            ServletHolder.this._servletHandler.addServletMapping(servletMapping2);
            return Collections.EMPTY_SET;
        }

        @Override // org.eclipse.jetty.servlet.Holder.HolderRegistration
        public /* bridge */ /* synthetic */ String getClassName() {
            return super.getClassName();
        }

        public int getInitOrder() {
            return ServletHolder.this.getInitOrder();
        }

        @Override // org.eclipse.jetty.servlet.Holder.HolderRegistration
        public /* bridge */ /* synthetic */ String getInitParameter(String str) {
            return super.getInitParameter(str);
        }

        @Override // org.eclipse.jetty.servlet.Holder.HolderRegistration
        public /* bridge */ /* synthetic */ Map getInitParameters() {
            return super.getInitParameters();
        }

        @Override // p153l.fse0
        public Collection<String> getMappings() {
            String[] pathSpecs;
            ServletMapping[] servletMappings = ServletHolder.this._servletHandler.getServletMappings();
            ArrayList arrayList = new ArrayList();
            if (servletMappings != null) {
                for (ServletMapping servletMapping : servletMappings) {
                    if (servletMapping.getServletName().equals(getName()) && (pathSpecs = servletMapping.getPathSpecs()) != null && pathSpecs.length > 0) {
                        arrayList.addAll(Arrays.asList(pathSpecs));
                    }
                }
            }
            return arrayList;
        }

        public lu10 getMultipartConfig() {
            return this._multipartConfig;
        }

        @Override // org.eclipse.jetty.servlet.Holder.HolderRegistration, p153l.uvc0
        public /* bridge */ /* synthetic */ String getName() {
            return super.getName();
        }

        public String getRunAsRole() {
            return ServletHolder.this._runAsRole;
        }

        @Override // org.eclipse.jetty.servlet.Holder.HolderRegistration
        public /* bridge */ /* synthetic */ void setAsyncSupported(boolean z) {
            super.setAsyncSupported(z);
        }

        @Override // org.eclipse.jetty.servlet.Holder.HolderRegistration
        public /* bridge */ /* synthetic */ void setDescription(String str) {
            super.setDescription(str);
        }

        @Override // org.eclipse.jetty.servlet.Holder.HolderRegistration
        public /* bridge */ /* synthetic */ boolean setInitParameter(String str, String str2) {
            return super.setInitParameter(str, str2);
        }

        @Override // org.eclipse.jetty.servlet.Holder.HolderRegistration
        public /* bridge */ /* synthetic */ Set setInitParameters(Map map) {
            return super.setInitParameters(map);
        }

        public void setLoadOnStartup(int i) {
            ServletHolder.this.illegalStateIfContextStarted();
            ServletHolder.this.setInitOrder(i);
        }

        public void setMultipartConfig(lu10 lu10Var) {
            this._multipartConfig = lu10Var;
        }

        public void setRunAsRole(String str) {
            ServletHolder.this._runAsRole = str;
        }

        public Set<String> setServletSecurity(nse0 nse0Var) {
            return ServletHolder.this._servletHandler.setServletSecurity(this, nse0Var);
        }
    }

    public class SingleThreadedWrapper implements yre0 {
        Stack<yre0> _stack;

        private SingleThreadedWrapper() {
            this._stack = new Stack<>();
        }

        @Override // p153l.yre0
        public void destroy() {
            synchronized (this) {
                while (this._stack.size() > 0) {
                    try {
                        this._stack.pop().destroy();
                    } catch (Exception e) {
                        ServletHolder.LOG.warn(e);
                    }
                }
            }
        }

        public zre0 getServletConfig() {
            return ServletHolder.this._config;
        }

        public String getServletInfo() {
            return null;
        }

        @Override // p153l.yre0
        public void init(zre0 zre0Var) throws ServletException {
            synchronized (this) {
                if (this._stack.size() == 0) {
                    try {
                        yre0 yre0VarNewInstance = ServletHolder.this.newInstance();
                        yre0VarNewInstance.init(zre0Var);
                        this._stack.push(yre0VarNewInstance);
                    } catch (ServletException e) {
                        throw e;
                    } catch (Exception e2) {
                        throw new ServletException(e2);
                    }
                }
            }
        }

        @Override // p153l.yre0
        public void service(gse0 gse0Var, lse0 lse0Var) throws ServletException, IOException {
            yre0 yre0VarNewInstance;
            synchronized (this) {
                if (this._stack.size() > 0) {
                    yre0VarNewInstance = this._stack.pop();
                } else {
                    try {
                        yre0VarNewInstance = ServletHolder.this.newInstance();
                        yre0VarNewInstance.init(ServletHolder.this._config);
                    } catch (ServletException e) {
                        throw e;
                    } catch (Exception e2) {
                        throw new ServletException(e2);
                    }
                }
            }
            try {
                yre0VarNewInstance.service(gse0Var, lse0Var);
                synchronized (this) {
                    this._stack.push(yre0VarNewInstance);
                }
            } catch (Throwable th) {
                synchronized (this) {
                    this._stack.push(yre0VarNewInstance);
                    throw th;
                }
            }
        }
    }

    public ServletHolder(String str, Class<? extends yre0> cls) {
        super(Holder.Source.EMBEDDED);
        this._initOnStartup = false;
        this._enabled = true;
        setName(str);
        setHeldClass(cls);
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0078: MOVE (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:121), block:B:41:0x0078 */
    private void initServlet() throws Throwable {
        Object obj;
        Object obj2 = null;
        try {
            try {
                if (this._servlet == null) {
                    this._servlet = newInstance();
                }
                if (this._config == null) {
                    this._config = new Config();
                }
                IdentityService identityService = this._identityService;
                Object runAs = identityService != null ? identityService.setRunAs(identityService.getSystemUserIdentity(), this._runAsToken) : null;
                try {
                    if (isJspServlet()) {
                        initJspServlet();
                    }
                    initMultiPart();
                    this._servlet.init(this._config);
                    IdentityService identityService2 = this._identityService;
                    if (identityService2 != null) {
                        identityService2.unsetRunAs(runAs);
                    }
                } catch (UnavailableException e) {
                    e = e;
                    makeUnavailable(e);
                    this._servlet = null;
                    this._config = null;
                    throw e;
                } catch (ServletException e2) {
                    e = e2;
                    makeUnavailable(e.getCause() == null ? e : e.getCause());
                    this._servlet = null;
                    this._config = null;
                    throw e;
                } catch (Exception e3) {
                    e = e3;
                    makeUnavailable(e);
                    this._servlet = null;
                    this._config = null;
                    throw new ServletException(toString(), e);
                } catch (Throwable th) {
                    Object obj3 = runAs;
                    th = th;
                    obj2 = obj3;
                    IdentityService identityService3 = this._identityService;
                    if (identityService3 != null) {
                        identityService3.unsetRunAs(obj2);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                obj2 = obj;
            }
        } catch (UnavailableException e4) {
            e = e4;
        } catch (ServletException e5) {
            e = e5;
        } catch (Exception e6) {
            e = e6;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private boolean isJspServlet() {
        yre0 yre0Var = this._servlet;
        boolean zIsJspServlet = false;
        if (yre0Var == null) {
            return false;
        }
        for (Class<?> superclass = yre0Var.getClass(); superclass != null && !zIsJspServlet; superclass = superclass.getSuperclass()) {
            zIsJspServlet = isJspServlet(superclass.getName());
        }
        return zIsJspServlet;
    }

    private void makeUnavailable(UnavailableException unavailableException) {
        if (this._unavailableEx != unavailableException || this._unavailable == 0) {
            this._servletHandler.getServletContext().log("unavailable", unavailableException);
            this._unavailableEx = unavailableException;
            this._unavailable = -1L;
            if (unavailableException.isPermanent()) {
                this._unavailable = -1L;
            } else if (this._unavailableEx.getUnavailableSeconds() > 0) {
                this._unavailable = System.currentTimeMillis() + ((long) (this._unavailableEx.getUnavailableSeconds() * 1000));
            } else {
                this._unavailable = System.currentTimeMillis() + Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS;
            }
        }
    }

    public void checkServletType() throws UnavailableException {
        Class<? extends T> cls = this._class;
        if (cls == 0 || !yre0.class.isAssignableFrom(cls)) {
            throw new UnavailableException("Servlet " + this._class + " is not a javax.servlet.Servlet");
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        String str;
        if (!(obj instanceof ServletHolder)) {
            return 1;
        }
        ServletHolder servletHolder = (ServletHolder) obj;
        int iCompareTo = 0;
        if (servletHolder == this) {
            return 0;
        }
        int i = servletHolder._initOrder;
        int i2 = this._initOrder;
        if (i < i2) {
            return 1;
        }
        if (i > i2) {
            return -1;
        }
        String str2 = this._className;
        if (str2 != null && (str = servletHolder._className) != null) {
            iCompareTo = str2.compareTo(str);
        }
        if (iCompareTo == 0) {
            iCompareTo = this._name.compareTo(servletHolder._name);
        }
        if (iCompareTo == 0) {
            return hashCode() > obj.hashCode() ? 1 : -1;
        }
        return iCompareTo;
    }

    @Override // org.eclipse.jetty.servlet.Holder
    public void destroyInstance(Object obj) throws Exception {
        if (obj == null) {
            return;
        }
        yre0 yre0Var = (yre0) obj;
        yre0Var.destroy();
        getServletHandler().destroyServlet(yre0Var);
    }

    @Override // org.eclipse.jetty.servlet.Holder, org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStart() throws Exception {
        String str;
        this._unavailable = 0L;
        if (this._enabled) {
            try {
                super.doStart();
                try {
                    checkServletType();
                } catch (UnavailableException e) {
                    makeUnavailable(e);
                    if (!this._servletHandler.isStartWithUnavailable()) {
                        throw e;
                    }
                }
                IdentityService identityService = this._servletHandler.getIdentityService();
                this._identityService = identityService;
                if (identityService != null && (str = this._runAsRole) != null) {
                    this._runAsToken = identityService.newRunAsToken(str);
                }
                this._config = new Config();
                Class<? extends T> cls = this._class;
                if (cls != 0 && wqf0.class.isAssignableFrom(cls)) {
                    this._servlet = new SingleThreadedWrapper();
                }
                if (this._extInstance || this._initOnStartup) {
                    try {
                        initServlet();
                    } catch (Exception e2) {
                        if (!this._servletHandler.isStartWithUnavailable()) {
                            throw e2;
                        }
                        LOG.ignore(e2);
                    }
                }
            } catch (UnavailableException e3) {
                makeUnavailable(e3);
                throw e3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0043  */
    @Override // org.eclipse.jetty.servlet.Holder, org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStop() throws Exception {
        Object obj;
        IdentityService identityService;
        Object obj2 = null;
        if (this._servlet != null) {
            try {
                IdentityService identityService2 = this._identityService;
                Object runAs = identityService2 != null ? identityService2.setRunAs(identityService2.getSystemUserIdentity(), this._runAsToken) : null;
                try {
                    destroyInstance(this._servlet);
                    IdentityService identityService3 = this._identityService;
                    if (identityService3 != null) {
                        identityService3.unsetRunAs(runAs);
                    }
                } catch (Exception e) {
                    obj = runAs;
                    e = e;
                    try {
                        LOG.warn(e);
                        IdentityService identityService4 = this._identityService;
                        if (identityService4 != null) {
                            identityService4.unsetRunAs(obj);
                        }
                    } catch (Throwable th) {
                        th = th;
                        obj2 = obj;
                        identityService = this._identityService;
                        if (identityService != null) {
                            identityService.unsetRunAs(obj2);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    obj2 = runAs;
                    th = th2;
                    identityService = this._identityService;
                    if (identityService != null) {
                        identityService.unsetRunAs(obj2);
                    }
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                obj = null;
            } catch (Throwable th3) {
                th = th3;
            }
        }
        if (!this._extInstance) {
            this._servlet = null;
        }
        this._config = null;
    }

    public boolean equals(Object obj) {
        return compareTo(obj) == 0;
    }

    @Override // org.eclipse.jetty.server.UserIdentity.Scope
    public String getContextPath() {
        return this._config.getServletContext().getContextPath();
    }

    public String getForcedPath() {
        return this._forcedPath;
    }

    public int getInitOrder() {
        return this._initOrder;
    }

    public fse0.InterfaceC17064a getRegistration() {
        if (this._registration == null) {
            this._registration = new Registration();
        }
        return this._registration;
    }

    public Map<String, String> getRoleMap() {
        Map<String, String> map = this._roleMap;
        return map == null ? NO_MAPPED_ROLES : map;
    }

    @Override // org.eclipse.jetty.server.UserIdentity.Scope
    public Map<String, String> getRoleRefMap() {
        return this._roleMap;
    }

    public String getRunAsRole() {
        return this._runAsRole;
    }

    public synchronized yre0 getServlet() throws ServletException {
        try {
            long j = this._unavailable;
            if (j != 0) {
                if (j < 0 || (j > 0 && System.currentTimeMillis() < this._unavailable)) {
                    throw this._unavailableEx;
                }
                this._unavailable = 0L;
                this._unavailableEx = null;
            }
            if (this._servlet == null) {
                initServlet();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this._servlet;
    }

    public yre0 getServletInstance() {
        return this._servlet;
    }

    public UnavailableException getUnavailableException() {
        return this._unavailableEx;
    }

    public String getUserRoleLink(String str) {
        String str2;
        Map<String, String> map = this._roleMap;
        return (map == null || (str2 = map.get(str)) == null) ? str : str2;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x002f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void handle(Request request, gse0 gse0Var, lse0 lse0Var) throws ServletException, IOException {
        if (this._class == null) {
            throw new UnavailableException("Servlet Not Initialized");
        }
        yre0 servlet = this._servlet;
        synchronized (this) {
            try {
                if (this._unavailable != 0 || !this._initOnStartup) {
                    servlet = getServlet();
                }
                if (servlet == null) {
                    throw new UnavailableException("Could not instantiate " + this._class);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean zIsAsyncSupported = request.isAsyncSupported();
        Object runAs = null;
        try {
            String str = this._forcedPath;
            if (str != null) {
                gse0Var.setAttribute(Dispatcher.__JSP_FILE, str);
            }
            IdentityService identityService = this._identityService;
            runAs = identityService != null ? identityService.setRunAs(request.getResolvedUserIdentity(), this._runAsToken) : null;
            if (!isAsyncSupported()) {
                request.setAsyncSupported(false);
            }
            lu10 multipartConfig = ((Registration) getRegistration()).getMultipartConfig();
            if (multipartConfig != null) {
                gse0Var.setAttribute(Request.__MULTIPART_CONFIG_ELEMENT, multipartConfig);
            }
            servlet.service(gse0Var, lse0Var);
            request.setAsyncSupported(zIsAsyncSupported);
            IdentityService identityService2 = this._identityService;
            if (identityService2 != null) {
                identityService2.unsetRunAs(runAs);
            }
        } catch (UnavailableException e) {
            makeUnavailable(e);
            throw this._unavailableEx;
        }
    }

    public int hashCode() {
        String str = this._name;
        return str == null ? System.identityHashCode(this) : str.hashCode();
    }

    public void initJspServlet() throws Exception {
        ContextHandler contextHandler = ((ContextHandler.Context) getServletHandler().getServletContext()).getContextHandler();
        contextHandler.setAttribute("org.apache.catalina.jsp_classpath", contextHandler.getClassPath());
        setInitParameter("com.sun.appserv.jsp.classpath", Loader.getClassPath(contextHandler.getClassLoader().getParent()));
        if ("?".equals(getInitParameter("classpath"))) {
            String classPath = contextHandler.getClassPath();
            LOG.debug("classpath=" + classPath, new Object[0]);
            if (classPath != null) {
                setInitParameter("classpath", classPath);
            }
        }
    }

    public void initMultiPart() throws Exception {
        if (((Registration) getRegistration()).getMultipartConfig() != null) {
            ((ContextHandler.Context) getServletHandler().getServletContext()).getContextHandler().addEventListener(new Request.MultiPartCleanerListener());
        }
    }

    public boolean isAvailable() {
        if (isStarted() && this._unavailable == 0) {
            return true;
        }
        try {
            getServlet();
        } catch (Exception e) {
            LOG.ignore(e);
        }
        return isStarted() && this._unavailable == 0;
    }

    public boolean isEnabled() {
        return this._enabled;
    }

    public boolean isSetInitOrder() {
        return this._initOnStartup;
    }

    public yre0 newInstance() throws IllegalAccessException, ServletException, InstantiationException {
        try {
            ase0 servletContext = getServletHandler().getServletContext();
            return servletContext == null ? getHeldClass().newInstance() : ((ServletContextHandler.Context) servletContext).createServlet(getHeldClass());
        } catch (ServletException e) {
            Throwable rootCause = e.getRootCause();
            if (rootCause instanceof InstantiationException) {
                throw ((InstantiationException) rootCause);
            }
            if (rootCause instanceof IllegalAccessException) {
                throw ((IllegalAccessException) rootCause);
            }
            throw e;
        }
    }

    public void setEnabled(boolean z) {
        this._enabled = z;
    }

    public void setForcedPath(String str) {
        this._forcedPath = str;
    }

    public void setInitOrder(int i) {
        this._initOnStartup = true;
        this._initOrder = i;
    }

    public void setRunAsRole(String str) {
        this._runAsRole = str;
    }

    public synchronized void setServlet(yre0 yre0Var) {
        if (yre0Var != null) {
            if (!(yre0Var instanceof wqf0)) {
                this._extInstance = true;
                this._servlet = yre0Var;
                setHeldClass(yre0Var.getClass());
                if (getName() == null) {
                    setName(yre0Var.getClass().getName() + "-" + super.hashCode());
                }
            }
        }
        throw new IllegalArgumentException();
    }

    public synchronized void setUserRoleLink(String str, String str2) {
        try {
            if (this._roleMap == null) {
                this._roleMap = new HashMap();
            }
            this._roleMap.put(str, str2);
        } catch (Throwable th) {
            throw th;
        }
    }

    public ServletHolder(Holder.Source source) {
        super(source);
        this._initOnStartup = false;
        this._enabled = true;
    }

    public ServletHolder(yre0 yre0Var) {
        super(Holder.Source.EMBEDDED);
        this._initOnStartup = false;
        this._enabled = true;
        setServlet(yre0Var);
    }

    public ServletHolder() {
        super(Holder.Source.EMBEDDED);
        this._initOnStartup = false;
        this._enabled = true;
    }

    public ServletHolder(String str, yre0 yre0Var) {
        super(Holder.Source.EMBEDDED);
        this._initOnStartup = false;
        this._enabled = true;
        setName(str);
        setServlet(yre0Var);
    }

    private boolean isJspServlet(String str) {
        if (str == null) {
            return false;
        }
        return "org.apache.jasper.servlet.JspServlet".equals(str);
    }

    public ServletHolder(Class<? extends yre0> cls) {
        super(Holder.Source.EMBEDDED);
        this._initOnStartup = false;
        this._enabled = true;
        setHeldClass(cls);
    }

    private void makeUnavailable(Throwable th) {
        if (th instanceof UnavailableException) {
            makeUnavailable((UnavailableException) th);
            return;
        }
        ase0 servletContext = this._servletHandler.getServletContext();
        if (servletContext == null) {
            LOG.info("unavailable", th);
        } else {
            servletContext.log("unavailable", th);
        }
        this._unavailableEx = new UnavailableException(String.valueOf(th), -1, th) { // from class: org.eclipse.jetty.servlet.ServletHolder.1
            final /* synthetic */ Throwable val$e;

            {
                this.val$e = th;
                initCause(th);
            }
        };
        this._unavailable = -1L;
    }
}
