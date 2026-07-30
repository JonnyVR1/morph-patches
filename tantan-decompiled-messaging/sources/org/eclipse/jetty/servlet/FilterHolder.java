package org.eclipse.jetty.servlet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import javax.servlet.DispatcherType;
import javax.servlet.ServletException;
import org.eclipse.jetty.util.TypeUtil;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import p149l.jii;
import p149l.qkq0;
import p149l.vii;
import p149l.yji;

/* JADX INFO: loaded from: classes3.dex */
public class FilterHolder extends Holder<jii> {
    private static final Logger LOG = Log.getLogger((Class<?>) FilterHolder.class);
    private transient Config _config;
    private transient jii _filter;
    private transient yji.InterfaceC21419a _registration;

    public class Config extends Holder<jii>.HolderConfig implements vii {
        public Config() {
            super();
        }

        public String getFilterName() {
            return FilterHolder.this._name;
        }
    }

    public class Registration extends Holder<jii>.HolderRegistration implements yji.InterfaceC21419a {
        public Registration() {
            super();
        }

        public void addMappingForServletNames(EnumSet<DispatcherType> enumSet, boolean z, String... strArr) {
            FilterHolder.this.illegalStateIfContextStarted();
            FilterMapping filterMapping = new FilterMapping();
            filterMapping.setFilterHolder(FilterHolder.this);
            filterMapping.setServletNames(strArr);
            filterMapping.setDispatcherTypes(enumSet);
            FilterHolder filterHolder = FilterHolder.this;
            if (z) {
                filterHolder._servletHandler.addFilterMapping(filterMapping);
            } else {
                filterHolder._servletHandler.prependFilterMapping(filterMapping);
            }
        }

        public void addMappingForUrlPatterns(EnumSet<DispatcherType> enumSet, boolean z, String... strArr) {
            FilterHolder.this.illegalStateIfContextStarted();
            FilterMapping filterMapping = new FilterMapping();
            filterMapping.setFilterHolder(FilterHolder.this);
            filterMapping.setPathSpecs(strArr);
            filterMapping.setDispatcherTypes(enumSet);
            FilterHolder filterHolder = FilterHolder.this;
            if (z) {
                filterHolder._servletHandler.addFilterMapping(filterMapping);
            } else {
                filterHolder._servletHandler.prependFilterMapping(filterMapping);
            }
        }

        public Collection<String> getServletNameMappings() {
            String[] servletNames;
            FilterMapping[] filterMappings = FilterHolder.this._servletHandler.getFilterMappings();
            ArrayList arrayList = new ArrayList();
            for (FilterMapping filterMapping : filterMappings) {
                if (filterMapping.getFilterHolder() == FilterHolder.this && (servletNames = filterMapping.getServletNames()) != null && servletNames.length > 0) {
                    arrayList.addAll(Arrays.asList(servletNames));
                }
            }
            return arrayList;
        }

        public Collection<String> getUrlPatternMappings() {
            FilterMapping[] filterMappings = FilterHolder.this._servletHandler.getFilterMappings();
            ArrayList arrayList = new ArrayList();
            for (FilterMapping filterMapping : filterMappings) {
                if (filterMapping.getFilterHolder() == FilterHolder.this) {
                    arrayList.addAll(TypeUtil.asList(filterMapping.getPathSpecs()));
                }
            }
            return arrayList;
        }
    }

    public FilterHolder(Class<? extends jii> cls) {
        super(Holder.Source.EMBEDDED);
        setHeldClass(cls);
    }

    @Override // org.eclipse.jetty.servlet.Holder
    public void destroyInstance(Object obj) throws Exception {
        if (obj == null) {
            return;
        }
        jii jiiVar = (jii) obj;
        jiiVar.destroy();
        getServletHandler().destroyFilter(jiiVar);
    }

    @Override // org.eclipse.jetty.servlet.Holder, org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStart() throws Exception {
        super.doStart();
        if (!jii.class.isAssignableFrom(this._class)) {
            String str = this._class + " is not a javax.servlet.Filter";
            super.stop();
            qkq0.m175383a(str);
            return;
        }
        if (this._filter == null) {
            try {
                this._filter = ((ServletContextHandler.Context) this._servletHandler.getServletContext()).createFilter(getHeldClass());
            } catch (ServletException e) {
                Throwable rootCause = e.getRootCause();
                if (rootCause instanceof InstantiationException) {
                    throw ((InstantiationException) rootCause);
                }
                if (!(rootCause instanceof IllegalAccessException)) {
                    throw e;
                }
                throw ((IllegalAccessException) rootCause);
            }
        }
        Config config = new Config();
        this._config = config;
        this._filter.init(config);
    }

    @Override // org.eclipse.jetty.servlet.Holder, org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStop() throws Exception {
        jii jiiVar = this._filter;
        if (jiiVar != null) {
            try {
                destroyInstance(jiiVar);
            } catch (Exception e) {
                LOG.warn(e);
            }
        }
        if (!this._extInstance) {
            this._filter = null;
        }
        this._config = null;
        super.doStop();
    }

    public jii getFilter() {
        return this._filter;
    }

    public yji.InterfaceC21419a getRegistration() {
        if (this._registration == null) {
            this._registration = new Registration();
        }
        return this._registration;
    }

    public synchronized void setFilter(jii jiiVar) {
        this._filter = jiiVar;
        this._extInstance = true;
        setHeldClass(jiiVar.getClass());
        if (getName() == null) {
            setName(jiiVar.getClass().getName());
        }
    }

    @Override // org.eclipse.jetty.servlet.Holder
    public String toString() {
        return getName();
    }

    public FilterHolder(Holder.Source source) {
        super(source);
    }

    public FilterHolder() {
        super(Holder.Source.EMBEDDED);
    }

    public FilterHolder(jii jiiVar) {
        super(Holder.Source.EMBEDDED);
        setFilter(jiiVar);
    }
}
