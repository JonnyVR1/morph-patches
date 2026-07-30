package org.eclipse.jetty.server.session;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSessionEvent;
import l.qkq0;
import l.wkl;
import org.eclipse.jetty.server.SessionIdManager;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.util.StringUtil;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class JDBCSessionManager extends AbstractSessionManager {
    private static final Logger LOG = Log.getLogger((Class<?>) JDBCSessionManager.class);
    protected JDBCSessionIdManager _jdbcSessionIdMgr = null;
    protected long _saveIntervalSec = 60;
    private ConcurrentHashMap<String, AbstractSession> _sessions;

    private String calculateRowId(SessionData sessionData) {
        return (canonicalize(this._context.getContextPath()) + "_" + getVirtualHost(this._context)) + "_" + sessionData.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String canonicalize(String str) {
        return str == null ? "" : str.replace('/', '_').replace('.', '_').replace('\\', '_');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Connection getConnection() throws SQLException {
        return ((JDBCSessionIdManager) getSessionIdManager()).getConnection();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getVirtualHost(ContextHandler.Context context) {
        String[] virtualHosts;
        String str;
        return (context == null || (virtualHosts = context.getContextHandler().getVirtualHosts()) == null || virtualHosts.length == 0 || (str = virtualHosts[0]) == null) ? StringUtil.ALL_INTERFACES : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateSessionAccessTime(SessionData sessionData) throws Exception {
        Connection connection = getConnection();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            connection.setAutoCommit(true);
            PreparedStatement preparedStatementPrepareStatement = connection.prepareStatement(this._jdbcSessionIdMgr._updateSessionAccessTime);
            preparedStatementPrepareStatement.setString(1, getSessionIdManager().getWorkerName());
            preparedStatementPrepareStatement.setLong(2, sessionData.getAccessed());
            preparedStatementPrepareStatement.setLong(3, sessionData.getLastAccessed());
            preparedStatementPrepareStatement.setLong(4, jCurrentTimeMillis);
            preparedStatementPrepareStatement.setLong(5, sessionData.getExpiryTime());
            preparedStatementPrepareStatement.setString(6, sessionData.getRowId());
            preparedStatementPrepareStatement.executeUpdate();
            sessionData.setLastSaved(jCurrentTimeMillis);
            preparedStatementPrepareStatement.close();
            Logger logger = LOG;
            if (logger.isDebugEnabled()) {
                logger.debug("Updated access time session id=" + sessionData.getId(), new Object[0]);
            }
            connection.close();
        } catch (Throwable th) {
            if (connection != null) {
                connection.close();
            }
            throw th;
        }
    }

    @Override // org.eclipse.jetty.server.session.AbstractSessionManager
    public void addSession(AbstractSession abstractSession) {
        if (abstractSession == null) {
            return;
        }
        synchronized (this) {
            this._sessions.put(abstractSession.getClusterId(), abstractSession);
        }
        try {
            abstractSession.willPassivate();
            storeSession(((Session) abstractSession)._data);
            abstractSession.didActivate();
        } catch (Exception e) {
            LOG.warn("Unable to store new session id=" + abstractSession.getId(), e);
        }
    }

    public void cacheInvalidate(Session session) {
    }

    public void deleteSession(SessionData sessionData) throws Exception {
        Connection connection = getConnection();
        try {
            connection.setAutoCommit(true);
            PreparedStatement preparedStatementPrepareStatement = connection.prepareStatement(this._jdbcSessionIdMgr._deleteSession);
            preparedStatementPrepareStatement.setString(1, sessionData.getRowId());
            preparedStatementPrepareStatement.executeUpdate();
            Logger logger = LOG;
            if (logger.isDebugEnabled()) {
                logger.debug("Deleted Session " + sessionData, new Object[0]);
            }
            connection.close();
        } catch (Throwable th) {
            if (connection != null) {
                connection.close();
            }
            throw th;
        }
    }

    @Override // org.eclipse.jetty.server.session.AbstractSessionManager, org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStart() throws Exception {
        SessionIdManager sessionIdManager = this._sessionIdManager;
        if (sessionIdManager == null) {
            qkq0.a("No session id manager defined");
            return;
        }
        this._jdbcSessionIdMgr = (JDBCSessionIdManager) sessionIdManager;
        this._sessions = new ConcurrentHashMap<>();
        super.doStart();
    }

    @Override // org.eclipse.jetty.server.session.AbstractSessionManager, org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStop() throws Exception {
        this._sessions.clear();
        this._sessions = null;
        super.doStop();
    }

    public void expire(List<?> list) {
        if (isStopping() || isStopped()) {
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        ClassLoader contextClassLoader = threadCurrentThread.getContextClassLoader();
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            try {
                String str = (String) listIterator.next();
                Logger logger = LOG;
                if (logger.isDebugEnabled()) {
                    logger.debug("Expiring session id " + str, new Object[0]);
                }
                Session session = (Session) this._sessions.get(str);
                if (session != null) {
                    session.timeout();
                    listIterator.remove();
                } else if (logger.isDebugEnabled()) {
                    logger.debug("Unrecognized session id=" + str, new Object[0]);
                }
            } catch (Throwable th) {
                try {
                    LOG.warn("Problem expiring sessions", th);
                    return;
                } finally {
                    threadCurrentThread.setContextClassLoader(contextClassLoader);
                }
            }
        }
        threadCurrentThread.setContextClassLoader(contextClassLoader);
    }

    public long getSaveInterval() {
        return this._saveIntervalSec;
    }

    @Override // org.eclipse.jetty.server.session.AbstractSessionManager
    public Session getSession(String str) {
        Session session;
        SessionData sessionDataLoadSession;
        Session session2 = (Session) this._sessions.get(str);
        synchronized (this) {
            try {
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Logger logger = LOG;
                    session = null;
                    try {
                        if (logger.isDebugEnabled()) {
                            if (session2 == null) {
                                StringBuilder sb = new StringBuilder("getSession(");
                                sb.append(str);
                                sb.append("): not in session map, now=");
                                sb.append(jCurrentTimeMillis);
                                sb.append(" lastSaved=");
                                sb.append(session2 == null ? 0L : session2._data._lastSaved);
                                sb.append(" interval=");
                                sb.append(this._saveIntervalSec * 1000);
                                logger.debug(sb.toString(), new Object[0]);
                            } else {
                                logger.debug("getSession(" + str + "): in session map,  now=" + jCurrentTimeMillis + " lastSaved=" + session2._data._lastSaved + " interval=" + (this._saveIntervalSec * 1000) + " lastNode=" + session2._data.getLastNode() + " thisNode=" + getSessionIdManager().getWorkerName() + " difference=" + (jCurrentTimeMillis - session2._data._lastSaved), new Object[0]);
                            }
                        }
                        if (session2 == null || jCurrentTimeMillis - session2._data._lastSaved >= this._saveIntervalSec * 1000) {
                            logger.debug("getSession(" + str + "): no session in session map or stale session. Reloading session data from db.", new Object[0]);
                            sessionDataLoadSession = loadSession(str, canonicalize(this._context.getContextPath()), getVirtualHost(this._context));
                        } else if (jCurrentTimeMillis - session2._data._lastSaved >= this._saveIntervalSec * 1000) {
                            logger.debug("getSession(" + str + "): stale session. Reloading session data from db.", new Object[0]);
                            sessionDataLoadSession = loadSession(str, canonicalize(this._context.getContextPath()), getVirtualHost(this._context));
                        } else {
                            logger.debug("getSession(" + str + "): session in session map", new Object[0]);
                            sessionDataLoadSession = session2._data;
                        }
                        if (sessionDataLoadSession == null) {
                            logger.debug("getSession({}): No session in database matching id={}", str, str);
                            session2 = null;
                        } else if (sessionDataLoadSession.getLastNode().equals(getSessionIdManager().getWorkerName()) && session2 != null) {
                            logger.debug("getSession({}): Session not stale {}", str, session2._data);
                        } else if (sessionDataLoadSession._expiryTime <= 0 || sessionDataLoadSession._expiryTime > jCurrentTimeMillis) {
                            if (logger.isDebugEnabled()) {
                                logger.debug("getSession(" + str + "): lastNode=" + sessionDataLoadSession.getLastNode() + " thisNode=" + getSessionIdManager().getWorkerName(), new Object[0]);
                            }
                            sessionDataLoadSession.setLastNode(getSessionIdManager().getWorkerName());
                            session2 = new Session(jCurrentTimeMillis, sessionDataLoadSession);
                            this._sessions.put(str, session2);
                            session2.didActivate();
                            updateSessionNode(sessionDataLoadSession);
                        } else {
                            logger.debug("getSession ({}): Session has expired", str);
                        }
                        return session2;
                    } catch (Exception e) {
                        e = e;
                        LOG.warn("Unable to load session from database", e);
                        return session;
                    }
                } catch (Exception e2) {
                    e = e2;
                    session = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.eclipse.jetty.server.session.AbstractSessionManager
    public int getSessions() {
        int size;
        synchronized (this) {
            size = this._sessions.size();
        }
        return size;
    }

    public void invalidateSession(String str) {
        Session session;
        synchronized (this) {
            session = (Session) this._sessions.get(str);
        }
        if (session != null) {
            session.invalidate();
        }
    }

    @Override // org.eclipse.jetty.server.session.AbstractSessionManager
    public void invalidateSessions() {
    }

    public SessionData loadSession(final String str, final String str2, final String str3) throws Exception {
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicReference atomicReference2 = new AtomicReference();
        Runnable runnable = new Runnable() { // from class: org.eclipse.jetty.server.session.JDBCSessionManager.1
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                Connection connection = null;
                SessionData sessionData = null;
                connection = null;
                try {
                    try {
                        try {
                            Connection connection2 = JDBCSessionManager.this.getConnection();
                            try {
                                ResultSet resultSetExecuteQuery = JDBCSessionManager.this._jdbcSessionIdMgr._dbAdaptor.getLoadStatement(connection2, str, str2, str3).executeQuery();
                                if (resultSetExecuteQuery.next()) {
                                    sessionData = JDBCSessionManager.this.new SessionData(str);
                                    sessionData.setRowId(resultSetExecuteQuery.getString(JDBCSessionManager.this._jdbcSessionIdMgr._sessionTableRowId));
                                    sessionData.setCookieSet(resultSetExecuteQuery.getLong("cookieTime"));
                                    sessionData.setLastAccessed(resultSetExecuteQuery.getLong("lastAccessTime"));
                                    sessionData.setAccessed(resultSetExecuteQuery.getLong("accessTime"));
                                    sessionData.setCreated(resultSetExecuteQuery.getLong("createTime"));
                                    sessionData.setLastNode(resultSetExecuteQuery.getString("lastNode"));
                                    sessionData.setLastSaved(resultSetExecuteQuery.getLong("lastSavedTime"));
                                    sessionData.setExpiryTime(resultSetExecuteQuery.getLong("expiryTime"));
                                    sessionData.setCanonicalContext(resultSetExecuteQuery.getString("contextPath"));
                                    sessionData.setVirtualHost(resultSetExecuteQuery.getString("virtualHost"));
                                    ClassLoadingObjectInputStream classLoadingObjectInputStream = JDBCSessionManager.this.new ClassLoadingObjectInputStream(((JDBCSessionIdManager) JDBCSessionManager.this.getSessionIdManager())._dbAdaptor.getBlobInputStream(resultSetExecuteQuery, "map"));
                                    sessionData.setAttributeMap((Map) classLoadingObjectInputStream.readObject());
                                    classLoadingObjectInputStream.close();
                                    if (JDBCSessionManager.LOG.isDebugEnabled()) {
                                        JDBCSessionManager.LOG.debug("LOADED session " + sessionData, new Object[0]);
                                    }
                                }
                                atomicReference.set(sessionData);
                                if (connection2 != null) {
                                    connection2.close();
                                }
                            } catch (Exception e) {
                                e = e;
                                connection = connection2;
                                atomicReference2.set(e);
                                if (connection != null) {
                                    connection.close();
                                }
                            } catch (Throwable th) {
                                th = th;
                                connection = connection2;
                                if (connection != null) {
                                    try {
                                        connection.close();
                                    } catch (Exception e2) {
                                        JDBCSessionManager.LOG.warn(e2);
                                    }
                                }
                                throw th;
                            }
                        } catch (Exception e3) {
                            JDBCSessionManager.LOG.warn(e3);
                        }
                    } catch (Exception e4) {
                        e = e4;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        };
        ContextHandler.Context context = this._context;
        if (context == null) {
            runnable.run();
        } else {
            context.getContextHandler().handle(runnable);
        }
        if (atomicReference2.get() == null) {
            return (SessionData) atomicReference.get();
        }
        throw ((Exception) atomicReference2.get());
    }

    @Override // org.eclipse.jetty.server.session.AbstractSessionManager
    public AbstractSession newSession(HttpServletRequest httpServletRequest) {
        return new Session(httpServletRequest);
    }

    @Override // org.eclipse.jetty.server.session.AbstractSessionManager
    public void removeSession(AbstractSession abstractSession, boolean z) {
        boolean z2;
        synchronized (this) {
            try {
                if (getSession(abstractSession.getClusterId()) != null) {
                    removeSession(abstractSession.getClusterId());
                    z2 = true;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            this._sessionIdManager.removeSession(abstractSession);
            if (z) {
                this._sessionIdManager.invalidateAll(abstractSession.getClusterId());
            }
            if (z && !this._sessionListeners.isEmpty()) {
                HttpSessionEvent httpSessionEvent = new HttpSessionEvent(abstractSession);
                Iterator<wkl> it = this._sessionListeners.iterator();
                while (it.hasNext()) {
                    it.next().sessionDestroyed(httpSessionEvent);
                }
            }
            if (z) {
                return;
            }
            abstractSession.willPassivate();
        }
    }

    public void setSaveInterval(long j) {
        this._saveIntervalSec = j;
    }

    public void storeSession(SessionData sessionData) throws Exception {
        if (sessionData == null) {
            return;
        }
        Connection connection = getConnection();
        try {
            String strCalculateRowId = calculateRowId(sessionData);
            long jCurrentTimeMillis = System.currentTimeMillis();
            connection.setAutoCommit(true);
            PreparedStatement preparedStatementPrepareStatement = connection.prepareStatement(this._jdbcSessionIdMgr._insertSession);
            preparedStatementPrepareStatement.setString(1, strCalculateRowId);
            preparedStatementPrepareStatement.setString(2, sessionData.getId());
            preparedStatementPrepareStatement.setString(3, sessionData.getCanonicalContext());
            preparedStatementPrepareStatement.setString(4, sessionData.getVirtualHost());
            preparedStatementPrepareStatement.setString(5, getSessionIdManager().getWorkerName());
            preparedStatementPrepareStatement.setLong(6, sessionData.getAccessed());
            preparedStatementPrepareStatement.setLong(7, sessionData.getLastAccessed());
            preparedStatementPrepareStatement.setLong(8, sessionData.getCreated());
            preparedStatementPrepareStatement.setLong(9, sessionData.getCookieSet());
            preparedStatementPrepareStatement.setLong(10, jCurrentTimeMillis);
            preparedStatementPrepareStatement.setLong(11, sessionData.getExpiryTime());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new ObjectOutputStream(byteArrayOutputStream).writeObject(sessionData.getAttributeMap());
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            preparedStatementPrepareStatement.setBinaryStream(12, (InputStream) new ByteArrayInputStream(byteArray), byteArray.length);
            preparedStatementPrepareStatement.executeUpdate();
            sessionData.setRowId(strCalculateRowId);
            sessionData.setLastSaved(jCurrentTimeMillis);
            Logger logger = LOG;
            if (logger.isDebugEnabled()) {
                logger.debug("Stored session " + sessionData, new Object[0]);
            }
            connection.close();
        } catch (Throwable th) {
            if (connection != null) {
                connection.close();
            }
            throw th;
        }
    }

    public void updateSession(SessionData sessionData) throws Exception {
        if (sessionData == null) {
            return;
        }
        Connection connection = getConnection();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            connection.setAutoCommit(true);
            PreparedStatement preparedStatementPrepareStatement = connection.prepareStatement(this._jdbcSessionIdMgr._updateSession);
            preparedStatementPrepareStatement.setString(1, getSessionIdManager().getWorkerName());
            preparedStatementPrepareStatement.setLong(2, sessionData.getAccessed());
            preparedStatementPrepareStatement.setLong(3, sessionData.getLastAccessed());
            preparedStatementPrepareStatement.setLong(4, jCurrentTimeMillis);
            preparedStatementPrepareStatement.setLong(5, sessionData.getExpiryTime());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new ObjectOutputStream(byteArrayOutputStream).writeObject(sessionData.getAttributeMap());
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            preparedStatementPrepareStatement.setBinaryStream(6, (InputStream) new ByteArrayInputStream(byteArray), byteArray.length);
            preparedStatementPrepareStatement.setString(7, sessionData.getRowId());
            preparedStatementPrepareStatement.executeUpdate();
            sessionData.setLastSaved(jCurrentTimeMillis);
            Logger logger = LOG;
            if (logger.isDebugEnabled()) {
                logger.debug("Updated session " + sessionData, new Object[0]);
            }
            connection.close();
        } catch (Throwable th) {
            if (connection != null) {
                connection.close();
            }
            throw th;
        }
    }

    public void updateSessionNode(SessionData sessionData) throws Exception {
        String workerName = getSessionIdManager().getWorkerName();
        Connection connection = getConnection();
        try {
            connection.setAutoCommit(true);
            PreparedStatement preparedStatementPrepareStatement = connection.prepareStatement(this._jdbcSessionIdMgr._updateSessionNode);
            preparedStatementPrepareStatement.setString(1, workerName);
            preparedStatementPrepareStatement.setString(2, sessionData.getRowId());
            preparedStatementPrepareStatement.executeUpdate();
            preparedStatementPrepareStatement.close();
            Logger logger = LOG;
            if (logger.isDebugEnabled()) {
                logger.debug("Updated last node for session id=" + sessionData.getId() + ", lastNode = " + workerName, new Object[0]);
            }
            connection.close();
        } catch (Throwable th) {
            if (connection != null) {
                connection.close();
            }
            throw th;
        }
    }

    public class ClassLoadingObjectInputStream extends ObjectInputStream {
        public ClassLoadingObjectInputStream(InputStream inputStream) throws IOException {
            super(inputStream);
        }

        @Override // java.io.ObjectInputStream
        public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
            try {
                return Class.forName(objectStreamClass.getName(), false, Thread.currentThread().getContextClassLoader());
            } catch (ClassNotFoundException unused) {
                return super.resolveClass(objectStreamClass);
            }
        }

        public ClassLoadingObjectInputStream() throws IOException {
        }
    }

    public class SessionData {
        private long _accessed;
        private Map<String, Object> _attributes;
        private String _canonicalContext;
        private long _cookieSet;
        private long _created;
        private long _expiryTime;
        private final String _id;
        private long _lastAccessed;
        private String _lastNode;
        private long _lastSaved;
        private long _maxIdleMs = -1;
        private String _rowId;
        private String _virtualHost;

        public SessionData(String str) {
            this._id = str;
            long jCurrentTimeMillis = System.currentTimeMillis();
            this._created = jCurrentTimeMillis;
            this._accessed = jCurrentTimeMillis;
            this._attributes = new HashMap();
            this._lastNode = JDBCSessionManager.this.getSessionIdManager().getWorkerName();
        }

        public synchronized long getAccessed() {
            return this._accessed;
        }

        public synchronized Map<String, Object> getAttributeMap() {
            return this._attributes;
        }

        public synchronized String getCanonicalContext() {
            return this._canonicalContext;
        }

        public synchronized long getCookieSet() {
            return this._cookieSet;
        }

        public synchronized long getCreated() {
            return this._created;
        }

        public synchronized long getExpiryTime() {
            return this._expiryTime;
        }

        public synchronized String getId() {
            return this._id;
        }

        public synchronized long getLastAccessed() {
            return this._lastAccessed;
        }

        public synchronized String getLastNode() {
            return this._lastNode;
        }

        public synchronized long getLastSaved() {
            return this._lastSaved;
        }

        public synchronized long getMaxIdleMs() {
            return this._maxIdleMs;
        }

        public synchronized String getRowId() {
            return this._rowId;
        }

        public synchronized String getVirtualHost() {
            return this._virtualHost;
        }

        public synchronized void setAccessed(long j) {
            this._accessed = j;
        }

        public synchronized void setAttributeMap(Map<String, Object> map) {
            this._attributes = map;
        }

        public synchronized void setCanonicalContext(String str) {
            this._canonicalContext = str;
        }

        public void setCookieSet(long j) {
            this._cookieSet = j;
        }

        public synchronized void setCreated(long j) {
            this._created = j;
        }

        public synchronized void setExpiryTime(long j) {
            this._expiryTime = j;
        }

        public synchronized void setLastAccessed(long j) {
            this._lastAccessed = j;
        }

        public synchronized void setLastNode(String str) {
            this._lastNode = str;
        }

        public synchronized void setLastSaved(long j) {
            this._lastSaved = j;
        }

        public synchronized void setMaxIdleMs(long j) {
            this._maxIdleMs = j;
        }

        public synchronized void setRowId(String str) {
            this._rowId = str;
        }

        public synchronized void setVirtualHost(String str) {
            this._virtualHost = str;
        }

        public String toString() {
            return "Session rowId=" + this._rowId + ",id=" + this._id + ",lastNode=" + this._lastNode + ",created=" + this._created + ",accessed=" + this._accessed + ",lastAccessed=" + this._lastAccessed + ",cookieSet=" + this._cookieSet + "lastSaved=" + this._lastSaved;
        }

        public SessionData(String str, Map<String, Object> map) {
            this._id = str;
            long jCurrentTimeMillis = System.currentTimeMillis();
            this._created = jCurrentTimeMillis;
            this._accessed = jCurrentTimeMillis;
            this._attributes = map;
            this._lastNode = JDBCSessionManager.this.getSessionIdManager().getWorkerName();
        }
    }

    public class Session extends AbstractSession {
        private static final long serialVersionUID = 5208464051134226143L;
        private final SessionData _data;
        private boolean _dirty;

        public Session(HttpServletRequest httpServletRequest) {
            long jCurrentTimeMillis;
            super(JDBCSessionManager.this, httpServletRequest);
            this._dirty = false;
            SessionData sessionData = JDBCSessionManager.this.new SessionData(getClusterId(), getAttributeMap());
            this._data = sessionData;
            int i = JDBCSessionManager.this._dftMaxIdleSecs;
            if (i > 0) {
                sessionData.setMaxIdleMs(((long) i) * 1000);
            }
            sessionData.setCanonicalContext(JDBCSessionManager.this.canonicalize(JDBCSessionManager.this._context.getContextPath()));
            sessionData.setVirtualHost(JDBCSessionManager.this.getVirtualHost(JDBCSessionManager.this._context));
            int maxInactiveInterval = getMaxInactiveInterval();
            if (maxInactiveInterval <= 0) {
                jCurrentTimeMillis = 0;
            } else {
                jCurrentTimeMillis = (((long) maxInactiveInterval) * 1000) + System.currentTimeMillis();
            }
            sessionData.setExpiryTime(jCurrentTimeMillis);
        }

        @Override // org.eclipse.jetty.server.session.AbstractSession
        public boolean access(long j) {
            if (!super.access(j)) {
                return false;
            }
            SessionData sessionData = this._data;
            sessionData.setLastAccessed(sessionData.getAccessed());
            this._data.setAccessed(j);
            int maxInactiveInterval = getMaxInactiveInterval();
            this._data.setExpiryTime(maxInactiveInterval <= 0 ? 0L : j + (((long) maxInactiveInterval) * 1000));
            return true;
        }

        @Override // org.eclipse.jetty.server.session.AbstractSession
        public void complete() {
            super.complete();
            try {
                if (this._dirty) {
                    willPassivate();
                    JDBCSessionManager.this.updateSession(this._data);
                    didActivate();
                } else if (this._data._accessed - this._data._lastSaved >= JDBCSessionManager.this.getSaveInterval() * 1000) {
                    JDBCSessionManager.this.updateSessionAccessTime(this._data);
                }
            } catch (Exception e) {
                AbstractSession.LOG.warn("Problem persisting changed session data id=" + getId(), e);
            } finally {
                this._dirty = false;
            }
        }

        @Override // org.eclipse.jetty.server.session.AbstractSession
        public void cookieSet() {
            SessionData sessionData = this._data;
            sessionData.setCookieSet(sessionData.getAccessed());
        }

        @Override // org.eclipse.jetty.server.session.AbstractSession, org.eclipse.jetty.server.session.AbstractSessionManager.SessionIf
        public void removeAttribute(String str) {
            super.removeAttribute(str);
            this._dirty = true;
        }

        @Override // org.eclipse.jetty.server.session.AbstractSession, org.eclipse.jetty.server.session.AbstractSessionManager.SessionIf
        public void setAttribute(String str, Object obj) {
            super.setAttribute(str, obj);
            this._dirty = true;
        }

        @Override // org.eclipse.jetty.server.session.AbstractSession
        public void timeout() throws IllegalStateException {
            Logger logger = AbstractSession.LOG;
            if (logger.isDebugEnabled()) {
                logger.debug("Timing out session id=" + getClusterId(), new Object[0]);
            }
            super.timeout();
        }

        public Session(long j, SessionData sessionData) {
            super(JDBCSessionManager.this, sessionData.getCreated(), j, sessionData.getId());
            this._dirty = false;
            this._data = sessionData;
            int i = JDBCSessionManager.this._dftMaxIdleSecs;
            if (i > 0) {
                sessionData.setMaxIdleMs(((long) i) * 1000);
            }
            addAttributes(sessionData.getAttributeMap());
            sessionData.setAttributeMap(getAttributeMap());
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    @Override // org.eclipse.jetty.server.session.AbstractSessionManager
    public boolean removeSession(String str) {
        boolean z;
        synchronized (this) {
            Session session = (Session) this._sessions.remove(str);
            if (session != null) {
                try {
                    deleteSession(session._data);
                } catch (Exception e) {
                    LOG.warn("Problem deleting session id=" + str, e);
                }
                if (session != null) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (session != null) {
                z = true;
            } else {
                z = false;
            }
            throw th;
        }
        return z;
    }
}
