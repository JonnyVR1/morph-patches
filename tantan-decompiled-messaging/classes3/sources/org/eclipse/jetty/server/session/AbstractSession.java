package org.eclipse.jetty.server.session;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import l.ohg0;
import l.skl;
import l.ukl;
import l.vje0;
import l.vkl;
import org.eclipse.jetty.util.log.Logger;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class AbstractSession implements AbstractSessionManager.SessionIf {
    static final Logger LOG = SessionHandler.LOG;
    private long _accessed;
    private final Map<String, Object> _attributes;
    private final String _clusterId;
    private long _cookieSet;
    private final long _created;
    private boolean _doInvalidate;
    private boolean _idChanged;
    private boolean _invalid;
    private long _lastAccessed;
    private final AbstractSessionManager _manager;
    private long _maxIdleMs;
    private boolean _newSession;
    private final String _nodeId;
    private int _requests;

    public AbstractSession(AbstractSessionManager abstractSessionManager, HttpServletRequest httpServletRequest) {
        this._attributes = new HashMap();
        this._manager = abstractSessionManager;
        this._newSession = true;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this._created = jCurrentTimeMillis;
        String strNewSessionId = abstractSessionManager._sessionIdManager.newSessionId(httpServletRequest, jCurrentTimeMillis);
        this._clusterId = strNewSessionId;
        String nodeId = abstractSessionManager._sessionIdManager.getNodeId(strNewSessionId, httpServletRequest);
        this._nodeId = nodeId;
        this._accessed = jCurrentTimeMillis;
        this._lastAccessed = jCurrentTimeMillis;
        this._requests = 1;
        int i = abstractSessionManager._dftMaxIdleSecs;
        this._maxIdleMs = i > 0 ? ((long) i) * 1000 : -1L;
        Logger logger = LOG;
        if (logger.isDebugEnabled()) {
            logger.debug("new session & id " + nodeId + " " + strNewSessionId, new Object[0]);
        }
    }

    public boolean access(long j) {
        synchronized (this) {
            try {
                if (this._invalid) {
                    return false;
                }
                this._newSession = false;
                long j2 = this._accessed;
                this._lastAccessed = j2;
                this._accessed = j;
                long j3 = this._maxIdleMs;
                if (j3 <= 0 || j2 <= 0 || j2 + j3 >= j) {
                    this._requests++;
                    return true;
                }
                invalidate();
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void addAttributes(Map<String, Object> map) {
        this._attributes.putAll(map);
    }

    public void bindValue(String str, Object obj) {
        if (obj == null || !(obj instanceof ukl)) {
            return;
        }
        ((ukl) obj).valueBound(new HttpSessionBindingEvent(this, str));
    }

    public void checkValid() throws IllegalStateException {
        if (this._invalid) {
            ohg0.a();
        }
    }

    public void clearAttributes() {
        ArrayList<String> arrayList;
        Object objDoPutOrRemove;
        while (true) {
            Map<String, Object> map = this._attributes;
            if (map == null || map.size() <= 0) {
                break;
            }
            synchronized (this) {
                arrayList = new ArrayList(this._attributes.keySet());
            }
            for (String str : arrayList) {
                synchronized (this) {
                    objDoPutOrRemove = doPutOrRemove(str, null);
                }
                unbindValue(str, objDoPutOrRemove);
                this._manager.doSessionAttributeListeners(this, str, objDoPutOrRemove, null);
            }
        }
        Map<String, Object> map2 = this._attributes;
        if (map2 != null) {
            map2.clear();
        }
    }

    public void complete() {
        synchronized (this) {
            try {
                int i = this._requests - 1;
                this._requests = i;
                if (this._doInvalidate && i <= 0) {
                    doInvalidate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void cookieSet() {
        synchronized (this) {
            this._cookieSet = this._accessed;
        }
    }

    public void didActivate() {
        synchronized (this) {
            try {
                HttpSessionEvent httpSessionEvent = new HttpSessionEvent(this);
                for (Object obj : this._attributes.values()) {
                    if (obj instanceof skl) {
                        ((skl) obj).sessionDidActivate(httpSessionEvent);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Object doGet(String str) {
        return this._attributes.get(str);
    }

    public void doInvalidate() throws IllegalStateException {
        try {
            LOG.debug("invalidate {}", this._clusterId);
            if (isValid()) {
                clearAttributes();
            }
            synchronized (this) {
                this._invalid = true;
            }
        } catch (Throwable th) {
            synchronized (this) {
                this._invalid = true;
                throw th;
            }
        }
    }

    public Object doPutOrRemove(String str, Object obj) {
        Map<String, Object> map = this._attributes;
        return obj == null ? map.remove(str) : map.put(str, obj);
    }

    public long getAccessed() {
        long j;
        synchronized (this) {
            j = this._accessed;
        }
        return j;
    }

    @Override // org.eclipse.jetty.server.session.AbstractSessionManager.SessionIf
    public Object getAttribute(String str) {
        Object obj;
        synchronized (this) {
            checkValid();
            obj = this._attributes.get(str);
        }
        return obj;
    }

    public Map<String, Object> getAttributeMap() {
        return this._attributes;
    }

    @Override // org.eclipse.jetty.server.session.AbstractSessionManager.SessionIf
    public Enumeration<String> getAttributeNames() {
        Enumeration<String> enumeration;
        synchronized (this) {
            try {
                checkValid();
                enumeration = Collections.enumeration(this._attributes == null ? Collections.EMPTY_LIST : new ArrayList(this._attributes.keySet()));
            } catch (Throwable th) {
                throw th;
            }
        }
        return enumeration;
    }

    public int getAttributes() {
        int size;
        synchronized (this) {
            checkValid();
            size = this._attributes.size();
        }
        return size;
    }

    public String getClusterId() {
        return this._clusterId;
    }

    public long getCookieSetTime() {
        return this._cookieSet;
    }

    @Override // org.eclipse.jetty.server.session.AbstractSessionManager.SessionIf
    public long getCreationTime() throws IllegalStateException {
        return this._created;
    }

    @Override // org.eclipse.jetty.server.session.AbstractSessionManager.SessionIf
    public String getId() throws IllegalStateException {
        return this._manager._nodeIdInSessionId ? this._nodeId : this._clusterId;
    }

    @Override // org.eclipse.jetty.server.session.AbstractSessionManager.SessionIf
    public long getLastAccessedTime() throws IllegalStateException {
        checkValid();
        return this._lastAccessed;
    }

    @Override // org.eclipse.jetty.server.session.AbstractSessionManager.SessionIf
    public int getMaxInactiveInterval() {
        checkValid();
        return (int) (this._maxIdleMs / 1000);
    }

    public Set<String> getNames() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this._attributes.keySet());
        }
        return hashSet;
    }

    public String getNodeId() {
        return this._nodeId;
    }

    public int getRequests() {
        int i;
        synchronized (this) {
            i = this._requests;
        }
        return i;
    }

    @Override // org.eclipse.jetty.server.session.AbstractSessionManager.SessionIf
    public vje0 getServletContext() {
        return this._manager._context;
    }

    @Override // org.eclipse.jetty.server.session.AbstractSessionManager.SessionIf
    public AbstractSession getSession() {
        return this;
    }

    @Override // org.eclipse.jetty.server.session.AbstractSessionManager.SessionIf
    @Deprecated
    public vkl getSessionContext() throws IllegalStateException {
        checkValid();
        return AbstractSessionManager.__nullSessionContext;
    }

    @Override // org.eclipse.jetty.server.session.AbstractSessionManager.SessionIf
    @Deprecated
    public Object getValue(String str) throws IllegalStateException {
        return getAttribute(str);
    }

    @Override // org.eclipse.jetty.server.session.AbstractSessionManager.SessionIf
    @Deprecated
    public String[] getValueNames() throws IllegalStateException {
        synchronized (this) {
            try {
                checkValid();
                Map<String, Object> map = this._attributes;
                if (map == null) {
                    return new String[0];
                }
                return (String[]) this._attributes.keySet().toArray(new String[map.size()]);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.eclipse.jetty.server.session.AbstractSessionManager.SessionIf
    public void invalidate() throws IllegalStateException {
        this._manager.removeSession(this, true);
        doInvalidate();
    }

    public boolean isIdChanged() {
        return this._idChanged;
    }

    @Override // org.eclipse.jetty.server.session.AbstractSessionManager.SessionIf
    public boolean isNew() throws IllegalStateException {
        checkValid();
        return this._newSession;
    }

    public boolean isValid() {
        return !this._invalid;
    }

    @Override // org.eclipse.jetty.server.session.AbstractSessionManager.SessionIf
    @Deprecated
    public void putValue(String str, Object obj) throws IllegalStateException {
        setAttribute(str, obj);
    }

    @Override // org.eclipse.jetty.server.session.AbstractSessionManager.SessionIf
    public void removeAttribute(String str) {
        setAttribute(str, null);
    }

    @Override // org.eclipse.jetty.server.session.AbstractSessionManager.SessionIf
    @Deprecated
    public void removeValue(String str) throws IllegalStateException {
        removeAttribute(str);
    }

    @Override // org.eclipse.jetty.server.session.AbstractSessionManager.SessionIf
    public void setAttribute(String str, Object obj) {
        Object objDoPutOrRemove;
        synchronized (this) {
            checkValid();
            objDoPutOrRemove = doPutOrRemove(str, obj);
        }
        if (obj == null || !obj.equals(objDoPutOrRemove)) {
            if (objDoPutOrRemove != null) {
                unbindValue(str, objDoPutOrRemove);
            }
            if (obj != null) {
                bindValue(str, obj);
            }
            this._manager.doSessionAttributeListeners(this, str, objDoPutOrRemove, obj);
        }
    }

    public void setIdChanged(boolean z) {
        this._idChanged = z;
    }

    @Override // org.eclipse.jetty.server.session.AbstractSessionManager.SessionIf
    public void setMaxInactiveInterval(int i) {
        this._maxIdleMs = ((long) i) * 1000;
    }

    public void setRequests(int i) {
        synchronized (this) {
            this._requests = i;
        }
    }

    public void timeout() throws IllegalStateException {
        this._manager.removeSession(this, true);
        synchronized (this) {
            try {
                if (!this._invalid) {
                    if (this._requests <= 0) {
                        doInvalidate();
                    } else {
                        this._doInvalidate = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return getClass().getName() + ":" + getId() + "@" + hashCode();
    }

    public void unbindValue(String str, Object obj) {
        if (obj == null || !(obj instanceof ukl)) {
            return;
        }
        ((ukl) obj).valueUnbound(new HttpSessionBindingEvent(this, str));
    }

    public void willPassivate() {
        synchronized (this) {
            try {
                HttpSessionEvent httpSessionEvent = new HttpSessionEvent(this);
                for (Object obj : this._attributes.values()) {
                    if (obj instanceof skl) {
                        ((skl) obj).sessionWillPassivate(httpSessionEvent);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public AbstractSession(AbstractSessionManager abstractSessionManager, long j, long j2, String str) {
        this._attributes = new HashMap();
        this._manager = abstractSessionManager;
        this._created = j;
        this._clusterId = str;
        String nodeId = abstractSessionManager._sessionIdManager.getNodeId(str, null);
        this._nodeId = nodeId;
        this._accessed = j2;
        this._lastAccessed = j2;
        this._requests = 1;
        int i = abstractSessionManager._dftMaxIdleSecs;
        this._maxIdleMs = i > 0 ? ((long) i) * 1000 : -1L;
        Logger logger = LOG;
        if (logger.isDebugEnabled()) {
            logger.debug("new session " + nodeId + " " + str, new Object[0]);
        }
    }
}
