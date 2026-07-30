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
import p153l.gli;
import p153l.sli;
import p153l.umi;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
public class FilterHolder extends Holder<gli> {
    private static final Logger LOG = Log.getLogger((Class<?>) FilterHolder.class);
    private transient Config _config;
    private transient gli _filter;
    private transient umi.InterfaceC20598a _registration;

    public class Config extends Holder<gli>.HolderConfig implements sli {
        public Config() {
            super();
        }

        public String getFilterName() {
            return FilterHolder.this._name;
        }
    }

    public class Registration extends Holder<gli>.HolderRegistration implements umi.InterfaceC20598a {
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

    public FilterHolder(Class<? extends gli> cls) {
        super(Holder.Source.EMBEDDED);
        setHeldClass(cls);
    }

    @Override // org.eclipse.jetty.servlet.Holder
    public void destroyInstance(Object obj) throws Exception {
        if (obj == null) {
            return;
        }
        gli gliVar = (gli) obj;
        gliVar.destroy();
        getServletHandler().destroyFilter(gliVar);
    }

    @Override // org.eclipse.jetty.servlet.Holder, org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStart() throws Exception {
        super.doStart();
        if (!gli.class.isAssignableFrom(this._class)) {
            String str = this._class + " is not a javax.servlet.Filter";
            super.stop();
            wtq0.m207906a(str);
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
        gli gliVar = this._filter;
        if (gliVar != null) {
            try {
                destroyInstance(gliVar);
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

    public gli getFilter() {
        return this._filter;
    }

    public umi.InterfaceC20598a getRegistration() {
        if (this._registration == null) {
            this._registration = new Registration();
        }
        return this._registration;
    }

    public synchronized void setFilter(gli gliVar) {
        this._filter = gliVar;
        this._extInstance = true;
        setHeldClass(gliVar.getClass());
        if (getName() == null) {
            setName(gliVar.getClass().getName());
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

    public FilterHolder(gli gliVar) {
        super(Holder.Source.EMBEDDED);
        setFilter(gliVar);
    }
}
