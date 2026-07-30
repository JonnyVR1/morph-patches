package org.eclipse.jetty.servlet;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.EventListener;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.servlet.DispatcherType;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletException;
import javax.servlet.SessionTrackingMode;
import org.eclipse.jetty.security.ConstraintAware;
import org.eclipse.jetty.security.ConstraintMapping;
import org.eclipse.jetty.security.ConstraintSecurityHandler;
import org.eclipse.jetty.security.SecurityHandler;
import org.eclipse.jetty.server.Dispatcher;
import org.eclipse.jetty.server.HandlerContainer;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.server.handler.ErrorHandler;
import org.eclipse.jetty.server.handler.HandlerCollection;
import org.eclipse.jetty.server.handler.HandlerWrapper;
import org.eclipse.jetty.server.session.SessionHandler;
import org.eclipse.jetty.util.LazyList;
import org.eclipse.jetty.util.component.AbstractLifeCycle;
import p153l.asq;
import p153l.c2d0;
import p153l.cse0;
import p153l.fse0;
import p153l.gli;
import p153l.l710;
import p153l.nse0;
import p153l.pse0;
import p153l.umi;
import p153l.wpg0;
import p153l.wtq0;
import p153l.x2i0;
import p153l.xpg0;
import p153l.yre0;
import p153l.zrq;

/* JADX INFO: loaded from: classes2.dex */
public class ServletContextHandler extends ContextHandler {
    public static final int NO_SECURITY = 0;
    public static final int NO_SESSIONS = 0;
    public static final int SECURITY = 2;
    public static final int SESSIONS = 1;
    protected final List<Decorator> _decorators;
    protected Class<? extends SecurityHandler> _defaultSecurityHandlerClass;
    protected zrq _jspConfig;
    protected int _options;
    private boolean _restrictListeners;
    protected Object _restrictedContextListeners;
    protected SecurityHandler _securityHandler;
    protected ServletHandler _servletHandler;
    protected SessionHandler _sessionHandler;
    protected HandlerWrapper _wrapper;

    public interface Decorator {
        void decorateFilterHolder(FilterHolder filterHolder) throws ServletException;

        <T extends gli> T decorateFilterInstance(T t) throws ServletException;

        <T extends EventListener> T decorateListenerInstance(T t) throws ServletException;

        void decorateServletHolder(ServletHolder servletHolder) throws ServletException;

        <T extends yre0> T decorateServletInstance(T t) throws ServletException;

        void destroyFilterInstance(gli gliVar);

        void destroyListenerInstance(EventListener eventListener);

        void destroyServletInstance(yre0 yre0Var);
    }

    public static class JspConfig implements zrq {
        private List<x2i0> _taglibs = new ArrayList();
        private List<asq> _jspPropertyGroups = new ArrayList();

        public void addJspPropertyGroup(asq asqVar) {
            this._jspPropertyGroups.add(asqVar);
        }

        public void addTaglibDescriptor(x2i0 x2i0Var) {
            this._taglibs.add(x2i0Var);
        }

        public Collection<asq> getJspPropertyGroups() {
            return new ArrayList(this._jspPropertyGroups);
        }

        public Collection<x2i0> getTaglibs() {
            return new ArrayList(this._taglibs);
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer("JspConfigDescriptor: \n");
            Iterator<x2i0> it = this._taglibs.iterator();
            while (it.hasNext()) {
                stringBuffer.append(it.next() + SignParameters.NEW_LINE);
            }
            Iterator<asq> it2 = this._jspPropertyGroups.iterator();
            while (it2.hasNext()) {
                stringBuffer.append(it2.next() + SignParameters.NEW_LINE);
            }
            return stringBuffer.toString();
        }
    }

    public static class JspPropertyGroup implements asq {
        private String _buffer;
        private String _defaultContentType;
        private String _deferredSyntaxAllowedAsLiteral;
        private String _elIgnored;
        private String _errorOnUndeclaredNamespace;
        private String _isXml;
        private String _pageEncoding;
        private String _scriptingInvalid;
        private String _trimDirectiveWhitespaces;
        private List<String> _urlPatterns = new ArrayList();
        private List<String> _includePreludes = new ArrayList();
        private List<String> _includeCodas = new ArrayList();

        public void addIncludeCoda(String str) {
            if (this._includeCodas.contains(str)) {
                return;
            }
            this._includeCodas.add(str);
        }

        public void addIncludePrelude(String str) {
            if (this._includePreludes.contains(str)) {
                return;
            }
            this._includePreludes.add(str);
        }

        public void addUrlPattern(String str) {
            if (this._urlPatterns.contains(str)) {
                return;
            }
            this._urlPatterns.add(str);
        }

        public String getBuffer() {
            return this._buffer;
        }

        public String getDefaultContentType() {
            return this._defaultContentType;
        }

        public String getDeferredSyntaxAllowedAsLiteral() {
            return this._deferredSyntaxAllowedAsLiteral;
        }

        public String getElIgnored() {
            return this._elIgnored;
        }

        public String getErrorOnUndeclaredNamespace() {
            return this._errorOnUndeclaredNamespace;
        }

        public Collection<String> getIncludeCodas() {
            return new ArrayList(this._includeCodas);
        }

        public Collection<String> getIncludePreludes() {
            return new ArrayList(this._includePreludes);
        }

        public String getIsXml() {
            return this._isXml;
        }

        public String getPageEncoding() {
            return this._pageEncoding;
        }

        public String getScriptingInvalid() {
            return this._scriptingInvalid;
        }

        public String getTrimDirectiveWhitespaces() {
            return this._trimDirectiveWhitespaces;
        }

        public Collection<String> getUrlPatterns() {
            return new ArrayList(this._urlPatterns);
        }

        public void setBuffer(String str) {
            this._buffer = str;
        }

        public void setDefaultContentType(String str) {
            this._defaultContentType = str;
        }

        public void setDeferredSyntaxAllowedAsLiteral(String str) {
            this._deferredSyntaxAllowedAsLiteral = str;
        }

        public void setElIgnored(String str) {
            this._elIgnored = str;
        }

        public void setErrorOnUndeclaredNamespace(String str) {
            this._errorOnUndeclaredNamespace = str;
        }

        public void setIsXml(String str) {
            this._isXml = str;
        }

        public void setPageEncoding(String str) {
            this._pageEncoding = str;
        }

        public void setScriptingInvalid(String str) {
            this._scriptingInvalid = str;
        }

        public void setTrimDirectiveWhitespaces(String str) {
            this._trimDirectiveWhitespaces = str;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer("JspPropertyGroupDescriptor:");
            stringBuffer.append(" el-ignored=" + this._elIgnored);
            stringBuffer.append(" is-xml=" + this._isXml);
            stringBuffer.append(" page-encoding=" + this._pageEncoding);
            stringBuffer.append(" scripting-invalid=" + this._scriptingInvalid);
            stringBuffer.append(" deferred-syntax-allowed-as-literal=" + this._deferredSyntaxAllowedAsLiteral);
            stringBuffer.append(" trim-directive-whitespaces" + this._trimDirectiveWhitespaces);
            stringBuffer.append(" default-content-type=" + this._defaultContentType);
            stringBuffer.append(" buffer=" + this._buffer);
            stringBuffer.append(" error-on-undeclared-namespace=" + this._errorOnUndeclaredNamespace);
            Iterator<String> it = this._includePreludes.iterator();
            while (it.hasNext()) {
                stringBuffer.append(" include-prelude=" + it.next());
            }
            Iterator<String> it2 = this._includeCodas.iterator();
            while (it2.hasNext()) {
                stringBuffer.append(" include-coda=" + it2.next());
            }
            return stringBuffer.toString();
        }
    }

    public static class TagLib implements x2i0 {
        private String _location;
        private String _uri;

        public String getTaglibLocation() {
            return this._location;
        }

        public String getTaglibURI() {
            return this._uri;
        }

        public void setTaglibLocation(String str) {
            this._location = str;
        }

        public void setTaglibURI(String str) {
            this._uri = str;
        }

        public String toString() {
            return "TagLibDescriptor: taglib-uri=" + this._uri + " location=" + this._location;
        }
    }

    public ServletContextHandler(HandlerContainer handlerContainer, String str, SessionHandler sessionHandler, SecurityHandler securityHandler, ServletHandler servletHandler, ErrorHandler errorHandler) {
        super((ContextHandler.Context) null);
        this._decorators = new ArrayList();
        this._defaultSecurityHandlerClass = ConstraintSecurityHandler.class;
        this._restrictListeners = true;
        this._scontext = new Context();
        this._sessionHandler = sessionHandler;
        this._securityHandler = securityHandler;
        this._servletHandler = servletHandler;
        if (errorHandler != null) {
            setErrorHandler(errorHandler);
        }
        if (str != null) {
            setContextPath(str);
        }
        if (handlerContainer instanceof HandlerWrapper) {
            ((HandlerWrapper) handlerContainer).setHandler(this);
        } else if (handlerContainer instanceof HandlerCollection) {
            ((HandlerCollection) handlerContainer).addHandler(this);
        }
    }

    public void addDecorator(Decorator decorator) {
        this._decorators.add(decorator);
    }

    public FilterHolder addFilter(Class<? extends gli> cls, String str, EnumSet<DispatcherType> enumSet) {
        return getServletHandler().addFilterWithMapping(cls, str, enumSet);
    }

    public void addRoles(String... strArr) {
        SecurityHandler securityHandler = this._securityHandler;
        if (securityHandler == null || !(securityHandler instanceof ConstraintAware)) {
            return;
        }
        HashSet hashSet = new HashSet();
        Set<String> roles = ((ConstraintAware) this._securityHandler).getRoles();
        if (roles != null) {
            hashSet.addAll(roles);
        }
        hashSet.addAll(Arrays.asList(strArr));
        ((ConstraintSecurityHandler) this._securityHandler).setRoles(hashSet);
    }

    public ServletHolder addServlet(Class<? extends yre0> cls, String str) {
        return getServletHandler().addServletWithMapping(cls.getName(), str);
    }

    @Override // org.eclipse.jetty.server.handler.ContextHandler
    public void callContextDestroyed(cse0 cse0Var, ServletContextEvent servletContextEvent) {
        super.callContextDestroyed(cse0Var, servletContextEvent);
    }

    @Override // org.eclipse.jetty.server.handler.ContextHandler
    public void callContextInitialized(cse0 cse0Var, ServletContextEvent servletContextEvent) {
        try {
            if (LazyList.contains(this._restrictedContextListeners, cse0Var)) {
                getServletContext().setEnabled(false);
            }
            super.callContextInitialized(cse0Var, servletContextEvent);
        } finally {
            getServletContext().setEnabled(true);
        }
    }

    public void destroyFilter(gli gliVar) {
        Iterator<Decorator> it = this._decorators.iterator();
        while (it.hasNext()) {
            it.next().destroyFilterInstance(gliVar);
        }
    }

    public void destroyServlet(yre0 yre0Var) {
        Iterator<Decorator> it = this._decorators.iterator();
        while (it.hasNext()) {
            it.next().destroyServletInstance(yre0Var);
        }
    }

    @Override // org.eclipse.jetty.server.handler.ContextHandler, org.eclipse.jetty.server.handler.HandlerWrapper, org.eclipse.jetty.server.handler.AbstractHandler, org.eclipse.jetty.util.component.AggregateLifeCycle, org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStop() throws Exception {
        super.doStop();
        List<Decorator> list = this._decorators;
        if (list != null) {
            list.clear();
        }
        HandlerWrapper handlerWrapper = this._wrapper;
        if (handlerWrapper != null) {
            handlerWrapper.setHandler(null);
        }
    }

    public fse0.InterfaceC17064a dynamicHolderAdded(ServletHolder servletHolder) {
        return servletHolder.getRegistration();
    }

    public List<Decorator> getDecorators() {
        return Collections.unmodifiableList(this._decorators);
    }

    public Class<? extends SecurityHandler> getDefaultSecurityHandlerClass() {
        return this._defaultSecurityHandlerClass;
    }

    public SecurityHandler getSecurityHandler() {
        if (this._securityHandler == null && (this._options & 2) != 0 && !isStarted()) {
            this._securityHandler = newSecurityHandler();
        }
        return this._securityHandler;
    }

    public ServletHandler getServletHandler() {
        if (this._servletHandler == null && !isStarted()) {
            this._servletHandler = newServletHandler();
        }
        return this._servletHandler;
    }

    public SessionHandler getSessionHandler() {
        if (this._sessionHandler == null && (this._options & 1) != 0 && !isStarted()) {
            this._sessionHandler = newSessionHandler();
        }
        return this._sessionHandler;
    }

    public boolean isRestrictListeners() {
        return this._restrictListeners;
    }

    public SecurityHandler newSecurityHandler() {
        try {
            return this._defaultSecurityHandlerClass.newInstance();
        } catch (Exception e) {
            xpg0.m212648a(e);
            return null;
        }
    }

    public ServletHandler newServletHandler() {
        return new ServletHandler();
    }

    public SessionHandler newSessionHandler() {
        return new SessionHandler();
    }

    @Override // org.eclipse.jetty.server.handler.ContextHandler
    public void restrictEventListener(EventListener eventListener) {
        if (this._restrictListeners && (eventListener instanceof cse0)) {
            this._restrictedContextListeners = LazyList.add(this._restrictedContextListeners, eventListener);
        }
    }

    public void setDecorators(List<Decorator> list) {
        this._decorators.clear();
        this._decorators.addAll(list);
    }

    public void setDefaultSecurityHandlerClass(Class<? extends SecurityHandler> cls) {
        this._defaultSecurityHandlerClass = cls;
    }

    public void setRestrictListeners(boolean z) {
        this._restrictListeners = z;
    }

    public void setSecurityHandler(SecurityHandler securityHandler) {
        if (isStarted()) {
            wtq0.m207906a(AbstractLifeCycle.STARTED);
        } else {
            this._securityHandler = securityHandler;
        }
    }

    public void setServletHandler(ServletHandler servletHandler) {
        if (isStarted()) {
            wtq0.m207906a(AbstractLifeCycle.STARTED);
        } else {
            this._servletHandler = servletHandler;
        }
    }

    public Set<String> setServletSecurity(fse0.InterfaceC17064a interfaceC17064a, nse0 nse0Var) {
        Collection<String> mappings = interfaceC17064a.getMappings();
        if (mappings != null) {
            Iterator<String> it = mappings.iterator();
            while (it.hasNext()) {
                Iterator<ConstraintMapping> it2 = ConstraintSecurityHandler.createConstraintsWithMappingsForPath(interfaceC17064a.getName(), it.next(), nse0Var).iterator();
                while (it2.hasNext()) {
                    ((ConstraintAware) getSecurityHandler()).addConstraintMapping(it2.next());
                }
            }
        }
        return Collections.EMPTY_SET;
    }

    public void setSessionHandler(SessionHandler sessionHandler) {
        if (isStarted()) {
            wtq0.m207906a(AbstractLifeCycle.STARTED);
        } else {
            this._sessionHandler = sessionHandler;
        }
    }

    @Override // org.eclipse.jetty.server.handler.ContextHandler
    public void startContext() throws Exception {
        getSessionHandler();
        getSecurityHandler();
        getServletHandler();
        HandlerWrapper handlerWrapper = this._servletHandler;
        SecurityHandler securityHandler = this._securityHandler;
        if (securityHandler != null) {
            securityHandler.setHandler(handlerWrapper);
            handlerWrapper = this._securityHandler;
        }
        SessionHandler sessionHandler = this._sessionHandler;
        if (sessionHandler != null) {
            sessionHandler.setHandler(handlerWrapper);
            handlerWrapper = this._sessionHandler;
        }
        this._wrapper = this;
        while (true) {
            HandlerWrapper handlerWrapper2 = this._wrapper;
            if (handlerWrapper2 == handlerWrapper || !(handlerWrapper2.getHandler() instanceof HandlerWrapper)) {
                break;
            } else {
                this._wrapper = (HandlerWrapper) this._wrapper.getHandler();
            }
        }
        HandlerWrapper handlerWrapper3 = this._wrapper;
        if (handlerWrapper3 != handlerWrapper) {
            if (handlerWrapper3.getHandler() != null) {
                wtq0.m207906a("!ScopedHandler");
                return;
            }
            this._wrapper.setHandler(handlerWrapper);
        }
        super.startContext();
        ServletHandler servletHandler = this._servletHandler;
        if (servletHandler == null || !servletHandler.isStarted()) {
            return;
        }
        for (int size = this._decorators.size() - 1; size >= 0; size--) {
            Decorator decorator = this._decorators.get(size);
            if (this._servletHandler.getFilters() != null) {
                for (FilterHolder filterHolder : this._servletHandler.getFilters()) {
                    decorator.decorateFilterHolder(filterHolder);
                }
            }
            if (this._servletHandler.getServlets() != null) {
                for (ServletHolder servletHolder : this._servletHandler.getServlets()) {
                    decorator.decorateServletHolder(servletHolder);
                }
            }
        }
        this._servletHandler.initialize();
    }

    public void addFilter(FilterHolder filterHolder, String str, EnumSet<DispatcherType> enumSet) throws Throwable {
        getServletHandler().addFilterWithMapping(filterHolder, str, enumSet);
    }

    public FilterHolder addFilter(String str, String str2, EnumSet<DispatcherType> enumSet) {
        return getServletHandler().addFilterWithMapping(str, str2, enumSet);
    }

    public ServletHolder addServlet(String str, String str2) {
        return getServletHandler().addServletWithMapping(str, str2);
    }

    public void addServlet(ServletHolder servletHolder, String str) throws Throwable {
        getServletHandler().addServletWithMapping(servletHolder, str);
    }

    public class Context extends ContextHandler.Context {
        public Context() {
            super();
        }

        @Override // org.eclipse.jetty.server.handler.ContextHandler.Context
        public umi.InterfaceC20598a addFilter(String str, Class<? extends gli> cls) throws Throwable {
            if (ServletContextHandler.this.isStarted()) {
                wpg0.m207458a();
                return null;
            }
            if (!this._enabled) {
                l710.m153113a();
                return null;
            }
            ServletHandler servletHandler = ServletContextHandler.this.getServletHandler();
            FilterHolder filter = servletHandler.getFilter(str);
            if (filter == null) {
                FilterHolder filterHolderNewFilterHolder = servletHandler.newFilterHolder(Holder.Source.JAVAX_API);
                filterHolderNewFilterHolder.setName(str);
                filterHolderNewFilterHolder.setHeldClass(cls);
                servletHandler.addFilter(filterHolderNewFilterHolder);
                return filterHolderNewFilterHolder.getRegistration();
            }
            if (filter.getClassName() != null || filter.getHeldClass() != null) {
                return null;
            }
            filter.setHeldClass(cls);
            return filter.getRegistration();
        }

        @Override // org.eclipse.jetty.server.handler.ContextHandler.Context
        public void addListener(String str) {
            if (!ServletContextHandler.this.isStarting()) {
                wpg0.m207458a();
            } else if (this._enabled) {
                super.addListener(str);
            } else {
                l710.m153113a();
            }
        }

        @Override // org.eclipse.jetty.server.handler.ContextHandler.Context
        public fse0.InterfaceC17064a addServlet(String str, Class<? extends yre0> cls) throws Throwable {
            if (!ServletContextHandler.this.isStarting()) {
                wpg0.m207458a();
                return null;
            }
            if (!this._enabled) {
                l710.m153113a();
                return null;
            }
            ServletHandler servletHandler = ServletContextHandler.this.getServletHandler();
            ServletHolder servlet = servletHandler.getServlet(str);
            if (servlet == null) {
                ServletHolder servletHolderNewServletHolder = servletHandler.newServletHolder(Holder.Source.JAVAX_API);
                servletHolderNewServletHolder.setName(str);
                servletHolderNewServletHolder.setHeldClass(cls);
                servletHandler.addServlet(servletHolderNewServletHolder);
                return ServletContextHandler.this.dynamicHolderAdded(servletHolderNewServletHolder);
            }
            if (servlet.getClassName() != null || servlet.getHeldClass() != null) {
                return null;
            }
            servlet.setHeldClass(cls);
            return servlet.getRegistration();
        }

        @Override // org.eclipse.jetty.server.handler.ContextHandler.Context
        public <T extends gli> T createFilter(Class<T> cls) throws ServletException {
            try {
                T tNewInstance = cls.newInstance();
                for (int size = ServletContextHandler.this._decorators.size() - 1; size >= 0; size--) {
                    tNewInstance = (T) ServletContextHandler.this._decorators.get(size).decorateFilterInstance(tNewInstance);
                }
                return tNewInstance;
            } catch (IllegalAccessException e) {
                throw new ServletException(e);
            } catch (InstantiationException e2) {
                throw new ServletException(e2);
            }
        }

        @Override // org.eclipse.jetty.server.handler.ContextHandler.Context
        public <T extends EventListener> T createListener(Class<T> cls) throws ServletException {
            try {
                T t = (T) super.createListener(cls);
                for (int size = ServletContextHandler.this._decorators.size() - 1; size >= 0; size--) {
                    t = (T) ServletContextHandler.this._decorators.get(size).decorateListenerInstance(t);
                }
                return t;
            } catch (ServletException e) {
                throw e;
            } catch (Exception e2) {
                throw new ServletException(e2);
            }
        }

        @Override // org.eclipse.jetty.server.handler.ContextHandler.Context
        public <T extends yre0> T createServlet(Class<T> cls) throws ServletException {
            try {
                T tNewInstance = cls.newInstance();
                for (int size = ServletContextHandler.this._decorators.size() - 1; size >= 0; size--) {
                    tNewInstance = (T) ServletContextHandler.this._decorators.get(size).decorateServletInstance(tNewInstance);
                }
                return tNewInstance;
            } catch (IllegalAccessException e) {
                throw new ServletException(e);
            } catch (InstantiationException e2) {
                throw new ServletException(e2);
            }
        }

        @Override // org.eclipse.jetty.server.handler.ContextHandler.Context
        public void declareRoles(String... strArr) {
            if (!ServletContextHandler.this.isStarting()) {
                wpg0.m207458a();
            } else if (this._enabled) {
                ServletContextHandler.this.addRoles(strArr);
            } else {
                l710.m153113a();
            }
        }

        @Override // org.eclipse.jetty.server.handler.ContextHandler.Context
        public Set<SessionTrackingMode> getDefaultSessionTrackingModes() {
            SessionHandler sessionHandler = ServletContextHandler.this._sessionHandler;
            if (sessionHandler != null) {
                return sessionHandler.getSessionManager().getDefaultSessionTrackingModes();
            }
            return null;
        }

        @Override // org.eclipse.jetty.server.handler.ContextHandler.Context
        public Set<SessionTrackingMode> getEffectiveSessionTrackingModes() {
            SessionHandler sessionHandler = ServletContextHandler.this._sessionHandler;
            if (sessionHandler != null) {
                return sessionHandler.getSessionManager().getEffectiveSessionTrackingModes();
            }
            return null;
        }

        @Override // org.eclipse.jetty.server.handler.ContextHandler.Context
        public umi getFilterRegistration(String str) {
            if (!this._enabled) {
                l710.m153113a();
                return null;
            }
            FilterHolder filter = ServletContextHandler.this.getServletHandler().getFilter(str);
            if (filter == null) {
                return null;
            }
            return filter.getRegistration();
        }

        @Override // org.eclipse.jetty.server.handler.ContextHandler.Context
        public Map<String, ? extends umi> getFilterRegistrations() {
            if (!this._enabled) {
                l710.m153113a();
                return null;
            }
            HashMap map = new HashMap();
            FilterHolder[] filters = ServletContextHandler.this.getServletHandler().getFilters();
            if (filters != null) {
                for (FilterHolder filterHolder : filters) {
                    map.put(filterHolder.getName(), filterHolder.getRegistration());
                }
            }
            return map;
        }

        @Override // org.eclipse.jetty.server.handler.ContextHandler.Context
        public zrq getJspConfigDescriptor() {
            return ServletContextHandler.this._jspConfig;
        }

        @Override // org.eclipse.jetty.server.handler.ContextHandler.Context
        public c2d0 getNamedDispatcher(String str) {
            ServletHolder servlet;
            ServletContextHandler servletContextHandler = ServletContextHandler.this;
            ServletHandler servletHandler = servletContextHandler._servletHandler;
            if (servletHandler == null || (servlet = servletHandler.getServlet(str)) == null || !servlet.isEnabled()) {
                return null;
            }
            return new Dispatcher(servletContextHandler, str);
        }

        @Override // org.eclipse.jetty.server.handler.ContextHandler.Context
        public fse0 getServletRegistration(String str) {
            if (!this._enabled) {
                l710.m153113a();
                return null;
            }
            ServletHolder servlet = ServletContextHandler.this.getServletHandler().getServlet(str);
            if (servlet == null) {
                return null;
            }
            return servlet.getRegistration();
        }

        @Override // org.eclipse.jetty.server.handler.ContextHandler.Context
        public Map<String, ? extends fse0> getServletRegistrations() {
            if (!this._enabled) {
                l710.m153113a();
                return null;
            }
            HashMap map = new HashMap();
            ServletHolder[] servlets = ServletContextHandler.this.getServletHandler().getServlets();
            if (servlets != null) {
                for (ServletHolder servletHolder : servlets) {
                    map.put(servletHolder.getName(), servletHolder.getRegistration());
                }
            }
            return map;
        }

        @Override // org.eclipse.jetty.server.handler.ContextHandler.Context
        public pse0 getSessionCookieConfig() {
            if (!this._enabled) {
                l710.m153113a();
                return null;
            }
            SessionHandler sessionHandler = ServletContextHandler.this._sessionHandler;
            if (sessionHandler != null) {
                return sessionHandler.getSessionManager().getSessionCookieConfig();
            }
            return null;
        }

        @Override // org.eclipse.jetty.server.handler.ContextHandler.Context
        public boolean setInitParameter(String str, String str2) {
            if (!ServletContextHandler.this.isStarting()) {
                wpg0.m207458a();
                return false;
            }
            if (this._enabled) {
                return super.setInitParameter(str, str2);
            }
            l710.m153113a();
            return false;
        }

        @Override // org.eclipse.jetty.server.handler.ContextHandler.Context
        public void setJspConfigDescriptor(zrq zrqVar) {
            ServletContextHandler.this._jspConfig = zrqVar;
        }

        @Override // org.eclipse.jetty.server.handler.ContextHandler.Context
        public void setSessionTrackingModes(Set<SessionTrackingMode> set) {
            if (!ServletContextHandler.this.isStarting()) {
                wpg0.m207458a();
                return;
            }
            if (!this._enabled) {
                l710.m153113a();
                return;
            }
            SessionHandler sessionHandler = ServletContextHandler.this._sessionHandler;
            if (sessionHandler != null) {
                sessionHandler.getSessionManager().setSessionTrackingModes(set);
            }
        }

        @Override // org.eclipse.jetty.server.handler.ContextHandler.Context
        public <T extends EventListener> void addListener(T t) {
            if (ServletContextHandler.this.isStarting()) {
                if (this._enabled) {
                    super.addListener(t);
                    return;
                } else {
                    l710.m153113a();
                    return;
                }
            }
            wpg0.m207458a();
        }

        @Override // org.eclipse.jetty.server.handler.ContextHandler.Context
        public void addListener(Class<? extends EventListener> cls) {
            if (ServletContextHandler.this.isStarting()) {
                if (this._enabled) {
                    super.addListener(cls);
                    return;
                } else {
                    l710.m153113a();
                    return;
                }
            }
            wpg0.m207458a();
        }

        @Override // org.eclipse.jetty.server.handler.ContextHandler.Context
        public umi.InterfaceC20598a addFilter(String str, String str2) throws Throwable {
            if (!ServletContextHandler.this.isStarted()) {
                if (this._enabled) {
                    ServletHandler servletHandler = ServletContextHandler.this.getServletHandler();
                    FilterHolder filter = servletHandler.getFilter(str);
                    if (filter == null) {
                        FilterHolder filterHolderNewFilterHolder = servletHandler.newFilterHolder(Holder.Source.JAVAX_API);
                        filterHolderNewFilterHolder.setName(str);
                        filterHolderNewFilterHolder.setClassName(str2);
                        servletHandler.addFilter(filterHolderNewFilterHolder);
                        return filterHolderNewFilterHolder.getRegistration();
                    }
                    if (filter.getClassName() != null || filter.getHeldClass() != null) {
                        return null;
                    }
                    filter.setClassName(str2);
                    return filter.getRegistration();
                }
                l710.m153113a();
                return null;
            }
            wpg0.m207458a();
            return null;
        }

        @Override // org.eclipse.jetty.server.handler.ContextHandler.Context
        public fse0.InterfaceC17064a addServlet(String str, String str2) throws Throwable {
            if (ServletContextHandler.this.isStarting()) {
                if (this._enabled) {
                    ServletHandler servletHandler = ServletContextHandler.this.getServletHandler();
                    ServletHolder servlet = servletHandler.getServlet(str);
                    if (servlet == null) {
                        ServletHolder servletHolderNewServletHolder = servletHandler.newServletHolder(Holder.Source.JAVAX_API);
                        servletHolderNewServletHolder.setName(str);
                        servletHolderNewServletHolder.setClassName(str2);
                        servletHandler.addServlet(servletHolderNewServletHolder);
                        return ServletContextHandler.this.dynamicHolderAdded(servletHolderNewServletHolder);
                    }
                    if (servlet.getClassName() != null || servlet.getHeldClass() != null) {
                        return null;
                    }
                    servlet.setClassName(str2);
                    return servlet.getRegistration();
                }
                l710.m153113a();
                return null;
            }
            wpg0.m207458a();
            return null;
        }

        @Override // org.eclipse.jetty.server.handler.ContextHandler.Context
        public umi.InterfaceC20598a addFilter(String str, gli gliVar) throws Throwable {
            if (!ServletContextHandler.this.isStarted()) {
                if (this._enabled) {
                    ServletHandler servletHandler = ServletContextHandler.this.getServletHandler();
                    FilterHolder filter = servletHandler.getFilter(str);
                    if (filter == null) {
                        FilterHolder filterHolderNewFilterHolder = servletHandler.newFilterHolder(Holder.Source.JAVAX_API);
                        filterHolderNewFilterHolder.setName(str);
                        filterHolderNewFilterHolder.setFilter(gliVar);
                        servletHandler.addFilter(filterHolderNewFilterHolder);
                        return filterHolderNewFilterHolder.getRegistration();
                    }
                    if (filter.getClassName() != null || filter.getHeldClass() != null) {
                        return null;
                    }
                    filter.setFilter(gliVar);
                    return filter.getRegistration();
                }
                l710.m153113a();
                return null;
            }
            wpg0.m207458a();
            return null;
        }

        @Override // org.eclipse.jetty.server.handler.ContextHandler.Context
        public fse0.InterfaceC17064a addServlet(String str, yre0 yre0Var) throws Throwable {
            if (ServletContextHandler.this.isStarting()) {
                if (this._enabled) {
                    ServletHandler servletHandler = ServletContextHandler.this.getServletHandler();
                    ServletHolder servlet = servletHandler.getServlet(str);
                    if (servlet == null) {
                        ServletHolder servletHolderNewServletHolder = servletHandler.newServletHolder(Holder.Source.JAVAX_API);
                        servletHolderNewServletHolder.setName(str);
                        servletHolderNewServletHolder.setServlet(yre0Var);
                        servletHandler.addServlet(servletHolderNewServletHolder);
                        return ServletContextHandler.this.dynamicHolderAdded(servletHolderNewServletHolder);
                    }
                    if (servlet.getClassName() != null || servlet.getHeldClass() != null) {
                        return null;
                    }
                    servlet.setServlet(yre0Var);
                    return servlet.getRegistration();
                }
                l710.m153113a();
                return null;
            }
            wpg0.m207458a();
            return null;
        }
    }

    public ServletContextHandler(int i) {
        this(null, null, i);
    }

    public ServletContextHandler(HandlerContainer handlerContainer, String str) {
        this(handlerContainer, str, null, null, null, null);
    }

    public ServletContextHandler(HandlerContainer handlerContainer, String str, int i) {
        this(handlerContainer, str, null, null, null, null);
        this._options = i;
    }

    public ServletContextHandler(HandlerContainer handlerContainer, String str, boolean z, boolean z2) {
        this(handlerContainer, str, (z ? 1 : 0) | (z2 ? 2 : 0));
    }

    public ServletContextHandler(HandlerContainer handlerContainer, SessionHandler sessionHandler, SecurityHandler securityHandler, ServletHandler servletHandler, ErrorHandler errorHandler) {
        this(handlerContainer, null, sessionHandler, securityHandler, servletHandler, errorHandler);
    }

    public ServletContextHandler() {
        this(null, null, null, null, null);
    }
}
