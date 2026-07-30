package org.eclipse.jetty.servlet;

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
import l.ake0;
import l.bke0;
import l.dm10;
import l.gke0;
import l.ike0;
import l.nif0;
import l.tje0;
import l.uje0;
import l.vje0;
import org.eclipse.jetty.security.IdentityService;
import org.eclipse.jetty.security.RunAsToken;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.UserIdentity;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.util.Loader;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ServletHolder extends Holder<tje0> implements UserIdentity.Scope, Comparable {
    private static final Logger LOG = Log.getLogger((Class<?>) ServletHolder.class);
    public static final Map<String, String> NO_MAPPED_ROLES = Collections.EMPTY_MAP;
    private transient Config _config;
    private transient boolean _enabled;
    private String _forcedPath;
    private IdentityService _identityService;
    private boolean _initOnStartup;
    private int _initOrder;
    private ake0.a _registration;
    private Map<String, String> _roleMap;
    private String _runAsRole;
    private RunAsToken _runAsToken;
    private transient tje0 _servlet;
    private transient long _unavailable;
    private transient UnavailableException _unavailableEx;

    public class Config extends Holder<tje0>.HolderConfig implements uje0 {
        public Config() {
            super();
        }

        public String getServletName() {
            return ServletHolder.this.getName();
        }
    }

    public class Registration extends Holder<tje0>.HolderRegistration implements ake0.a {
        protected dm10 _multipartConfig;

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

        public dm10 getMultipartConfig() {
            return this._multipartConfig;
        }

        @Override // org.eclipse.jetty.servlet.Holder.HolderRegistration
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

        public void setMultipartConfig(dm10 dm10Var) {
            this._multipartConfig = dm10Var;
        }

        public void setRunAsRole(String str) {
            ServletHolder.this._runAsRole = str;
        }

        public Set<String> setServletSecurity(ike0 ike0Var) {
            return ServletHolder.this._servletHandler.setServletSecurity(this, ike0Var);
        }
    }

    public class SingleThreadedWrapper implements tje0 {
        Stack<tje0> _stack;

        private SingleThreadedWrapper() {
            this._stack = new Stack<>();
        }

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

        public uje0 getServletConfig() {
            return ServletHolder.this._config;
        }

        public String getServletInfo() {
            return null;
        }

        public void init(uje0 uje0Var) throws ServletException {
            synchronized (this) {
                if (this._stack.size() == 0) {
                    try {
                        tje0 tje0VarNewInstance = ServletHolder.this.newInstance();
                        tje0VarNewInstance.init(uje0Var);
                        this._stack.push(tje0VarNewInstance);
                    } catch (Exception e) {
                        throw new ServletException(e);
                    } catch (ServletException e2) {
                        throw e2;
                    }
                }
            }
        }

        public void service(bke0 bke0Var, gke0 gke0Var) throws ServletException, IOException {
            tje0 tje0VarNewInstance;
            synchronized (this) {
                if (this._stack.size() > 0) {
                    tje0VarNewInstance = this._stack.pop();
                } else {
                    try {
                        tje0VarNewInstance = ServletHolder.this.newInstance();
                        tje0VarNewInstance.init(ServletHolder.this._config);
                    } catch (Exception e) {
                        throw new ServletException(e);
                    } catch (ServletException e2) {
                        throw e2;
                    }
                }
            }
            try {
                tje0VarNewInstance.service(bke0Var, gke0Var);
                synchronized (this) {
                    this._stack.push(tje0VarNewInstance);
                }
            } catch (Throwable th) {
                synchronized (this) {
                    this._stack.push(tje0VarNewInstance);
                    throw th;
                }
            }
        }
    }

    public ServletHolder(String str, Class<? extends tje0> cls) {
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
        } catch (Exception e4) {
            e = e4;
        } catch (UnavailableException e5) {
            e = e5;
        } catch (ServletException e6) {
            e = e6;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private boolean isJspServlet() {
        tje0 tje0Var = this._servlet;
        boolean zIsJspServlet = false;
        if (tje0Var == null) {
            return false;
        }
        for (Class<?> superclass = tje0Var.getClass(); superclass != null && !zIsJspServlet; superclass = superclass.getSuperclass()) {
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
                this._unavailable = System.currentTimeMillis() + 5000;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: javax.servlet.UnavailableException */
    public void checkServletType() throws UnavailableException {
        Class<? extends T> cls = this._class;
        if (cls == 0 || !tje0.class.isAssignableFrom(cls)) {
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
        tje0 tje0Var = (tje0) obj;
        tje0Var.destroy();
        getServletHandler().destroyServlet(tje0Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: javax.servlet.UnavailableException */
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
                if (cls != 0 && nif0.class.isAssignableFrom(cls)) {
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

    public ake0.a getRegistration() {
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

    public synchronized tje0 getServlet() throws ServletException {
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

    public tje0 getServletInstance() {
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
        To view partially-correct add '--show-bad-code' argument
    */
    public void handle(org.eclipse.jetty.server.Request r7, l.bke0 r8, l.gke0 r9) throws javax.servlet.UnavailableException, javax.servlet.ServletException, java.io.IOException {
        /*
            r6 = this;
            java.lang.String r0 = "Could not instantiate "
            java.lang.Class<? extends T> r1 = r6._class
            if (r1 == 0) goto L9a
            l.tje0 r1 = r6._servlet
            monitor-enter(r6)
            long r2 = r6._unavailable     // Catch: java.lang.Throwable -> L16
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L19
            boolean r2 = r6._initOnStartup     // Catch: java.lang.Throwable -> L16
            if (r2 != 0) goto L1d
            goto L19
        L16:
            r7 = move-exception
            goto L98
        L19:
            l.tje0 r1 = r6.getServlet()     // Catch: java.lang.Throwable -> L16
        L1d:
            if (r1 == 0) goto L84
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L16
            boolean r0 = r7.isAsyncSupported()
            r2 = 0
            java.lang.String r3 = r6._forcedPath     // Catch: java.lang.Throwable -> L2f javax.servlet.UnavailableException -> L31
            if (r3 == 0) goto L33
            java.lang.String r4 = "org.apache.catalina.jsp_file"
            r8.setAttribute(r4, r3)     // Catch: java.lang.Throwable -> L2f javax.servlet.UnavailableException -> L31
            goto L33
        L2f:
            r9 = move-exception
            goto L70
        L31:
            r9 = move-exception
            goto L6a
        L33:
            org.eclipse.jetty.security.IdentityService r3 = r6._identityService     // Catch: java.lang.Throwable -> L2f javax.servlet.UnavailableException -> L31
            if (r3 == 0) goto L41
            org.eclipse.jetty.server.UserIdentity r4 = r7.getResolvedUserIdentity()     // Catch: java.lang.Throwable -> L2f javax.servlet.UnavailableException -> L31
            org.eclipse.jetty.security.RunAsToken r5 = r6._runAsToken     // Catch: java.lang.Throwable -> L2f javax.servlet.UnavailableException -> L31
            java.lang.Object r2 = r3.setRunAs(r4, r5)     // Catch: java.lang.Throwable -> L2f javax.servlet.UnavailableException -> L31
        L41:
            boolean r3 = r6.isAsyncSupported()     // Catch: java.lang.Throwable -> L2f javax.servlet.UnavailableException -> L31
            if (r3 != 0) goto L4b
            r3 = 0
            r7.setAsyncSupported(r3)     // Catch: java.lang.Throwable -> L2f javax.servlet.UnavailableException -> L31
        L4b:
            l.ake0$a r3 = r6.getRegistration()     // Catch: java.lang.Throwable -> L2f javax.servlet.UnavailableException -> L31
            org.eclipse.jetty.servlet.ServletHolder$Registration r3 = (org.eclipse.jetty.servlet.ServletHolder.Registration) r3     // Catch: java.lang.Throwable -> L2f javax.servlet.UnavailableException -> L31
            l.dm10 r3 = r3.getMultipartConfig()     // Catch: java.lang.Throwable -> L2f javax.servlet.UnavailableException -> L31
            if (r3 == 0) goto L5c
            java.lang.String r4 = "org.eclipse.multipartConfig"
            r8.setAttribute(r4, r3)     // Catch: java.lang.Throwable -> L2f javax.servlet.UnavailableException -> L31
        L5c:
            r1.service(r8, r9)     // Catch: java.lang.Throwable -> L2f javax.servlet.UnavailableException -> L31
            r7.setAsyncSupported(r0)
            org.eclipse.jetty.security.IdentityService r6 = r6._identityService
            if (r6 == 0) goto L69
            r6.unsetRunAs(r2)
        L69:
            return
        L6a:
            r6.makeUnavailable(r9)     // Catch: java.lang.Throwable -> L2f
            javax.servlet.UnavailableException r9 = r6._unavailableEx     // Catch: java.lang.Throwable -> L2f
            throw r9     // Catch: java.lang.Throwable -> L2f
        L70:
            r7.setAsyncSupported(r0)
            org.eclipse.jetty.security.IdentityService r7 = r6._identityService
            if (r7 == 0) goto L7a
            r7.unsetRunAs(r2)
        L7a:
            java.lang.String r7 = "javax.servlet.error.servlet_name"
            java.lang.String r6 = r6.getName()
            r8.setAttribute(r7, r6)
            throw r9
        L84:
            javax.servlet.UnavailableException r7 = new javax.servlet.UnavailableException     // Catch: java.lang.Throwable -> L16
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L16
            java.lang.Class<? extends T> r9 = r6._class     // Catch: java.lang.Throwable -> L16
            r8.append(r9)     // Catch: java.lang.Throwable -> L16
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L16
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L16
            throw r7     // Catch: java.lang.Throwable -> L16
        L98:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L16
            throw r7
        L9a:
            javax.servlet.UnavailableException r6 = new javax.servlet.UnavailableException
            java.lang.String r7 = "Servlet Not Initialized"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.servlet.ServletHolder.handle(org.eclipse.jetty.server.Request, l.bke0, l.gke0):void");
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

    /* JADX INFO: Thrown type has an unknown type hierarchy: javax.servlet.ServletException */
    public boolean isAvailable() throws ServletException {
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

    /* JADX INFO: Thrown type has an unknown type hierarchy: javax.servlet.ServletException */
    public tje0 newInstance() throws IllegalAccessException, ServletException, InstantiationException {
        try {
            vje0 servletContext = getServletHandler().getServletContext();
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

    public synchronized void setServlet(tje0 tje0Var) {
        if (tje0Var != null) {
            if (!(tje0Var instanceof nif0)) {
                this._extInstance = true;
                this._servlet = tje0Var;
                setHeldClass(tje0Var.getClass());
                if (getName() == null) {
                    setName(tje0Var.getClass().getName() + "-" + super.hashCode());
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

    public ServletHolder(tje0 tje0Var) {
        super(Holder.Source.EMBEDDED);
        this._initOnStartup = false;
        this._enabled = true;
        setServlet(tje0Var);
    }

    public ServletHolder() {
        super(Holder.Source.EMBEDDED);
        this._initOnStartup = false;
        this._enabled = true;
    }

    public ServletHolder(String str, tje0 tje0Var) {
        super(Holder.Source.EMBEDDED);
        this._initOnStartup = false;
        this._enabled = true;
        setName(str);
        setServlet(tje0Var);
    }

    private boolean isJspServlet(String str) {
        if (str == null) {
            return false;
        }
        return "org.apache.jasper.servlet.JspServlet".equals(str);
    }

    public ServletHolder(Class<? extends tje0> cls) {
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
        vje0 servletContext = this._servletHandler.getServletContext();
        if (servletContext == null) {
            LOG.info("unavailable", th);
        } else {
            servletContext.log("unavailable", th);
        }
        this._unavailableEx = new UnavailableException(String.valueOf(th), -1, th) { // from class: org.eclipse.jetty.servlet.ServletHolder.1
            final /* synthetic */ Throwable val$e;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.val$e = th;
                initCause(th);
            }
        };
        this._unavailable = -1L;
    }
}
