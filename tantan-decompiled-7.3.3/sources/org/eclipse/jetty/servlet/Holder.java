package org.eclipse.jetty.servlet;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.io.IOException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.servlet.UnavailableException;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.util.Loader;
import org.eclipse.jetty.util.component.AbstractLifeCycle;
import org.eclipse.jetty.util.component.AggregateLifeCycle;
import org.eclipse.jetty.util.component.Dumpable;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import p153l.ase0;
import p153l.uvc0;
import p153l.wg3;
import p153l.wtq0;
import p153l.yg3;

/* JADX INFO: loaded from: classes2.dex */
public class Holder<T> extends AbstractLifeCycle implements Dumpable {
    private static final Logger LOG = Log.getLogger((Class<?>) Holder.class);
    protected transient Class<? extends T> _class;
    protected String _className;
    protected String _displayName;
    protected boolean _extInstance;
    protected String _name;
    protected ServletHandler _servletHandler;
    private final Source _source;
    protected final Map<String, String> _initParams = new HashMap(3);
    protected boolean _asyncSupported = true;

    public class HolderConfig {
        public HolderConfig() {
        }

        public String getInitParameter(String str) {
            return Holder.this.getInitParameter(str);
        }

        public Enumeration getInitParameterNames() {
            return Holder.this.getInitParameterNames();
        }

        public ase0 getServletContext() {
            return Holder.this._servletHandler.getServletContext();
        }
    }

    public class HolderRegistration implements uvc0 {
        public HolderRegistration() {
        }

        public String getClassName() {
            return Holder.this.getClassName();
        }

        public String getInitParameter(String str) {
            return Holder.this.getInitParameter(str);
        }

        public Map<String, String> getInitParameters() {
            return Holder.this.getInitParameters();
        }

        @Override // p153l.uvc0
        public String getName() {
            return Holder.this.getName();
        }

        public void setAsyncSupported(boolean z) {
            Holder.this.illegalStateIfContextStarted();
            Holder.this.setAsyncSupported(z);
        }

        public void setDescription(String str) {
            if (Holder.LOG.isDebugEnabled()) {
                Holder.LOG.debug(this + " is " + str, new Object[0]);
            }
        }

        public boolean setInitParameter(String str, String str2) {
            Holder.this.illegalStateIfContextStarted();
            if (str == null) {
                wg3.m206174a("init parameter name required");
                return false;
            }
            if (str2 == null) {
                wg3.m206174a("non-null value required for init parameter ".concat(str));
                return false;
            }
            if (Holder.this.getInitParameter(str) != null) {
                return false;
            }
            Holder.this.setInitParameter(str, str2);
            return true;
        }

        public Set<String> setInitParameters(Map<String, String> map) {
            Holder.this.illegalStateIfContextStarted();
            HashSet hashSet = null;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() == null) {
                    wg3.m206174a("init parameter name required");
                    return null;
                }
                if (entry.getValue() == null) {
                    yg3.m215829a("non-null value required for init parameter ", entry.getKey());
                    return null;
                }
                if (Holder.this.getInitParameter(entry.getKey()) != null) {
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(entry.getKey());
                }
            }
            if (hashSet != null) {
                return hashSet;
            }
            Holder.this.getInitParameters().putAll(map);
            return Collections.EMPTY_SET;
        }
    }

    public enum Source {
        EMBEDDED,
        JAVAX_API,
        DESCRIPTOR,
        ANNOTATION
    }

    public Holder(Source source) {
        this._source = source;
    }

    public void destroyInstance(Object obj) throws Exception {
    }

    @Override // org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStart() throws Exception {
        String str;
        if (this._class == null && ((str = this._className) == null || str.equals(""))) {
            throw new UnavailableException("No class for Servlet or Filter for " + this._name, -1);
        }
        if (this._class == null) {
            try {
                this._class = Loader.loadClass(Holder.class, this._className);
                Logger logger = LOG;
                if (logger.isDebugEnabled()) {
                    logger.debug("Holding {}", this._class);
                }
            } catch (Exception e) {
                LOG.warn(e);
                throw new UnavailableException(e.getMessage(), -1);
            }
        }
    }

    @Override // org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStop() throws Exception {
        if (this._extInstance) {
            return;
        }
        this._class = null;
    }

    @Override // org.eclipse.jetty.util.component.Dumpable
    public void dump(Appendable appendable, String str) throws IOException {
        appendable.append(this._name).append("==").append(this._className).append(" - ").append(AbstractLifeCycle.getState(this)).append(SignParameters.NEW_LINE);
        AggregateLifeCycle.dump(appendable, str, this._initParams.entrySet());
    }

    public String getClassName() {
        return this._className;
    }

    public String getDisplayName() {
        return this._displayName;
    }

    public Class<? extends T> getHeldClass() {
        return this._class;
    }

    public String getInitParameter(String str) {
        Map<String, String> map = this._initParams;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public Enumeration getInitParameterNames() {
        Map<String, String> map = this._initParams;
        return map == null ? Collections.enumeration(Collections.EMPTY_LIST) : Collections.enumeration(map.keySet());
    }

    public Map<String, String> getInitParameters() {
        return this._initParams;
    }

    public String getName() {
        return this._name;
    }

    public ServletHandler getServletHandler() {
        return this._servletHandler;
    }

    public Source getSource() {
        return this._source;
    }

    public void illegalStateIfContextStarted() {
        ContextHandler.Context context;
        ServletHandler servletHandler = this._servletHandler;
        if (servletHandler == null || (context = (ContextHandler.Context) servletHandler.getServletContext()) == null || !context.getContextHandler().isStarted()) {
            return;
        }
        wtq0.m207906a("Started");
    }

    public boolean isAsyncSupported() {
        return this._asyncSupported;
    }

    public boolean isInstance() {
        return this._extInstance;
    }

    public void setAsyncSupported(boolean z) {
        this._asyncSupported = z;
    }

    public void setClassName(String str) {
        this._className = str;
        this._class = null;
    }

    public void setDisplayName(String str) {
        this._displayName = str;
    }

    public void setHeldClass(Class<? extends T> cls) {
        this._class = cls;
        if (cls != null) {
            this._className = cls.getName();
            if (this._name == null) {
                this._name = cls.getName() + "-" + hashCode();
            }
        }
    }

    public void setInitParameter(String str, String str2) {
        this._initParams.put(str, str2);
    }

    public void setInitParameters(Map<String, String> map) {
        this._initParams.clear();
        this._initParams.putAll(map);
    }

    public void setName(String str) {
        this._name = str;
    }

    public void setServletHandler(ServletHandler servletHandler) {
        this._servletHandler = servletHandler;
    }

    public String toString() {
        return this._name;
    }

    @Override // org.eclipse.jetty.util.component.Dumpable
    public String dump() {
        return AggregateLifeCycle.dump(this);
    }
}
