package org.eclipse.jetty.server.session;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.naming.InitialContext;
import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.SessionManager;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.util.log.Logger;
import p153l.hnl;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
public class JDBCSessionIdManager extends AbstractSessionIdManager {
    static final Logger LOG = SessionHandler.LOG;
    protected String _blobType;
    protected String _connectionUrl;
    protected String _createSessionIdTable;
    protected String _createSessionTable;
    protected DataSource _datasource;
    protected DatabaseAdaptor _dbAdaptor;
    protected String _deleteId;
    protected String _deleteOldExpiredSessions;
    protected String _deleteSession;
    protected Driver _driver;
    protected String _driverClassName;
    protected String _insertId;
    protected String _insertSession;
    protected String _jndiName;
    protected long _lastScavengeTime;
    protected String _longType;
    protected String _queryId;
    protected long _scavengeIntervalMs;
    protected String _selectBoundedExpiredSessions;
    private String _selectExpiredSessions;
    protected Server _server;
    protected String _sessionIdTable;
    protected final HashSet<String> _sessionIds;
    protected String _sessionTable;
    protected String _sessionTableRowId;
    protected TimerTask _task;
    protected Timer _timer;
    protected String _updateSession;
    protected String _updateSessionAccessTime;
    protected String _updateSessionNode;

    public class DatabaseAdaptor {
        String _dbName;
        boolean _isLower;
        boolean _isUpper;

        public DatabaseAdaptor(DatabaseMetaData databaseMetaData) throws SQLException {
            String lowerCase = databaseMetaData.getDatabaseProductName().toLowerCase(Locale.ENGLISH);
            this._dbName = lowerCase;
            JDBCSessionIdManager.LOG.debug("Using database {}", lowerCase);
            this._isLower = databaseMetaData.storesLowerCaseIdentifiers();
            this._isUpper = databaseMetaData.storesUpperCaseIdentifiers();
        }

        public String convertIdentifier(String str) {
            if (this._isLower) {
                return str.toLowerCase(Locale.ENGLISH);
            }
            return this._isUpper ? str.toUpperCase(Locale.ENGLISH) : str;
        }

        public InputStream getBlobInputStream(ResultSet resultSet, String str) throws SQLException {
            return this._dbName.startsWith("postgres") ? new ByteArrayInputStream(resultSet.getBytes(str)) : resultSet.getBlob(str).getBinaryStream();
        }

        public String getBlobType() {
            String str = JDBCSessionIdManager.this._blobType;
            if (str != null) {
                return str;
            }
            return this._dbName.startsWith("postgres") ? "bytea" : "blob";
        }

        public String getDBName() {
            return this._dbName;
        }

        public PreparedStatement getLoadStatement(Connection connection, String str, String str2, String str3) throws SQLException {
            if ((str2 == null || "".equals(str2)) && isEmptyStringNull()) {
                PreparedStatement preparedStatementPrepareStatement = connection.prepareStatement("select * from " + JDBCSessionIdManager.this._sessionTable + " where sessionId = ? and contextPath is null and virtualHost = ?");
                preparedStatementPrepareStatement.setString(1, str);
                preparedStatementPrepareStatement.setString(2, str3);
                return preparedStatementPrepareStatement;
            }
            PreparedStatement preparedStatementPrepareStatement2 = connection.prepareStatement("select * from " + JDBCSessionIdManager.this._sessionTable + " where sessionId = ? and contextPath = ? and virtualHost = ?");
            preparedStatementPrepareStatement2.setString(1, str);
            preparedStatementPrepareStatement2.setString(2, str2);
            preparedStatementPrepareStatement2.setString(3, str3);
            return preparedStatementPrepareStatement2;
        }

        public String getLongType() {
            String str = JDBCSessionIdManager.this._longType;
            if (str != null) {
                return str;
            }
            return this._dbName.startsWith("oracle") ? "number(20)" : "bigint";
        }

        public String getRowIdColumnName() {
            String str = this._dbName;
            return (str == null || !str.startsWith("oracle")) ? "rowId" : "srowId";
        }

        public boolean isEmptyStringNull() {
            return this._dbName.startsWith("oracle");
        }
    }

    public JDBCSessionIdManager(Server server) {
        this._sessionIds = new HashSet<>();
        this._sessionIdTable = "JettySessionIds";
        this._sessionTable = "JettySessions";
        this._sessionTableRowId = "rowId";
        this._scavengeIntervalMs = AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED;
        this._server = server;
    }

    private void cleanExpiredSessions() throws Exception {
        ArrayList arrayList = new ArrayList();
        Connection connection = null;
        try {
            try {
                connection = getConnection();
                connection.setTransactionIsolation(8);
                connection.setAutoCommit(false);
                PreparedStatement preparedStatementPrepareStatement = connection.prepareStatement(this._selectExpiredSessions);
                long jCurrentTimeMillis = System.currentTimeMillis();
                Logger logger = LOG;
                if (logger.isDebugEnabled()) {
                    logger.debug("Searching for sessions expired before {}", Long.valueOf(jCurrentTimeMillis));
                }
                preparedStatementPrepareStatement.setLong(1, jCurrentTimeMillis);
                ResultSet resultSetExecuteQuery = preparedStatementPrepareStatement.executeQuery();
                while (resultSetExecuteQuery.next()) {
                    String string = resultSetExecuteQuery.getString("sessionId");
                    arrayList.add(string);
                    Logger logger2 = LOG;
                    if (logger2.isDebugEnabled()) {
                        logger2.debug("Found expired sessionId={}", string);
                    }
                }
                if (!arrayList.isEmpty()) {
                    connection.createStatement().executeUpdate(createCleanExpiredSessionsSql("delete from " + this._sessionTable + " where sessionId in ", arrayList));
                    connection.createStatement().executeUpdate(createCleanExpiredSessionsSql("delete from " + this._sessionIdTable + " where id in ", arrayList));
                }
                connection.commit();
                synchronized (this._sessionIds) {
                    this._sessionIds.removeAll(arrayList);
                }
                try {
                    connection.close();
                } catch (SQLException e) {
                    LOG.warn(e);
                }
            } catch (Throwable th) {
                if (connection != null) {
                    try {
                        connection.close();
                    } catch (SQLException e2) {
                        LOG.warn(e2);
                    }
                }
                throw th;
            }
        } catch (Exception e3) {
            if (connection != null) {
                connection.rollback();
            }
            throw e3;
        }
    }

    private String createCleanExpiredSessionsSql(String str, Collection<String> collection) throws Exception {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append("(");
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            stringBuffer.append("'" + it.next() + "'");
            if (it.hasNext()) {
                stringBuffer.append(Constants.SEPARATOR_COMMA);
            }
        }
        stringBuffer.append(")");
        Logger logger = LOG;
        if (logger.isDebugEnabled()) {
            logger.debug("Cleaning expired sessions with: {}", stringBuffer);
        }
        return stringBuffer.toString();
    }

    private void delete(String str) throws Throwable {
        Connection connection;
        try {
            connection = getConnection();
            try {
                connection.setAutoCommit(true);
                PreparedStatement preparedStatementPrepareStatement = connection.prepareStatement(this._deleteId);
                preparedStatementPrepareStatement.setString(1, str);
                preparedStatementPrepareStatement.executeUpdate();
                connection.close();
            } catch (Throwable th) {
                th = th;
                if (connection != null) {
                    connection.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            connection = null;
        }
    }

    private boolean exists(String str) throws Throwable {
        Connection connection;
        try {
            connection = getConnection();
            try {
                connection.setAutoCommit(true);
                PreparedStatement preparedStatementPrepareStatement = connection.prepareStatement(this._queryId);
                preparedStatementPrepareStatement.setString(1, str);
                boolean next = preparedStatementPrepareStatement.executeQuery().next();
                connection.close();
                return next;
            } catch (Throwable th) {
                th = th;
                if (connection != null) {
                    connection.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            connection = null;
        }
    }

    private void initializeDatabase() throws Exception {
        if (this._datasource != null) {
            return;
        }
        if (this._jndiName != null) {
            this._datasource = (DataSource) new InitialContext().lookup(this._jndiName);
            return;
        }
        Driver driver = this._driver;
        if (driver != null && this._connectionUrl != null) {
            DriverManager.registerDriver(driver);
            return;
        }
        String str = this._driverClassName;
        if (str == null || this._connectionUrl == null) {
            wtq0.m207906a("No database configured for sessions");
        } else {
            Class.forName(str);
        }
    }

    private void insert(String str) throws Throwable {
        Connection connection;
        try {
            connection = getConnection();
            try {
                connection.setAutoCommit(true);
                PreparedStatement preparedStatementPrepareStatement = connection.prepareStatement(this._queryId);
                preparedStatementPrepareStatement.setString(1, str);
                if (!preparedStatementPrepareStatement.executeQuery().next()) {
                    PreparedStatement preparedStatementPrepareStatement2 = connection.prepareStatement(this._insertId);
                    preparedStatementPrepareStatement2.setString(1, str);
                    preparedStatementPrepareStatement2.executeUpdate();
                }
                connection.close();
            } catch (Throwable th) {
                th = th;
                if (connection != null) {
                    connection.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            connection = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x02ba  */
    private void prepareTables() throws Throwable {
        Connection connection;
        this._createSessionIdTable = "create table " + this._sessionIdTable + " (id varchar(120), primary key(id))";
        this._selectBoundedExpiredSessions = "select * from " + this._sessionTable + " where expiryTime >= ? and expiryTime <= ?";
        this._selectExpiredSessions = "select * from " + this._sessionTable + " where expiryTime >0 and expiryTime <= ?";
        this._deleteOldExpiredSessions = "delete from " + this._sessionTable + " where expiryTime >0 and expiryTime <= ?";
        this._insertId = "insert into " + this._sessionIdTable + " (id)  values (?)";
        this._deleteId = "delete from " + this._sessionIdTable + " where id = ?";
        this._queryId = "select * from " + this._sessionIdTable + " where id = ?";
        Connection connection2 = null;
        try {
            Connection connection3 = getConnection();
            try {
                connection3.setAutoCommit(true);
                DatabaseMetaData metaData = connection3.getMetaData();
                DatabaseAdaptor databaseAdaptor = new DatabaseAdaptor(metaData);
                this._dbAdaptor = databaseAdaptor;
                this._sessionTableRowId = databaseAdaptor.getRowIdColumnName();
                if (!metaData.getTables(null, null, this._dbAdaptor.convertIdentifier(this._sessionIdTable), null).next()) {
                    try {
                        connection3.createStatement().executeUpdate(this._createSessionIdTable);
                    } catch (Throwable th) {
                        th = th;
                        connection2 = connection3;
                        if (connection2 != null) {
                            connection2.close();
                        }
                        throw th;
                    }
                }
                String strConvertIdentifier = this._dbAdaptor.convertIdentifier(this._sessionTable);
                if (metaData.getTables(null, null, strConvertIdentifier, null).next()) {
                    connection = connection3;
                } else {
                    String blobType = this._dbAdaptor.getBlobType();
                    String longType = this._dbAdaptor.getLongType();
                    connection = connection3;
                    try {
                        this._createSessionTable = "create table " + this._sessionTable + " (" + this._sessionTableRowId + " varchar(120), sessionId varchar(120),  contextPath varchar(60), virtualHost varchar(60), lastNode varchar(60), accessTime " + longType + ",  lastAccessTime " + longType + ", createTime " + longType + ", cookieTime " + longType + ",  lastSavedTime " + longType + ", expiryTime " + longType + ", map " + blobType + ", primary key(" + this._sessionTableRowId + "))";
                        connection.createStatement().executeUpdate(this._createSessionTable);
                    } catch (Throwable th2) {
                        th = th2;
                        connection2 = connection;
                        if (connection2 != null) {
                            connection2.close();
                        }
                        throw th;
                    }
                }
                String str = "idx_" + this._sessionTable + "_expiry";
                String str2 = "idx_" + this._sessionTable + "_session";
                ResultSet indexInfo = metaData.getIndexInfo(null, null, strConvertIdentifier, false, false);
                boolean z = false;
                boolean z2 = false;
                while (indexInfo.next()) {
                    String string = indexInfo.getString("INDEX_NAME");
                    if (str.equalsIgnoreCase(string)) {
                        z = true;
                    } else if (str2.equalsIgnoreCase(string)) {
                        z2 = true;
                    }
                }
                if (!z || !z2) {
                    Statement statementCreateStatement = connection.createStatement();
                    if (!z) {
                        statementCreateStatement.executeUpdate("create index " + str + " on " + this._sessionTable + " (expiryTime)");
                    }
                    if (!z2) {
                        statementCreateStatement.executeUpdate("create index " + str2 + " on " + this._sessionTable + " (sessionId, contextPath)");
                    }
                }
                this._insertSession = "insert into " + this._sessionTable + " (" + this._sessionTableRowId + ", sessionId, contextPath, virtualHost, lastNode, accessTime, lastAccessTime, createTime, cookieTime, lastSavedTime, expiryTime, map)  values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                StringBuilder sb = new StringBuilder();
                sb.append("delete from ");
                sb.append(this._sessionTable);
                sb.append(" where ");
                sb.append(this._sessionTableRowId);
                sb.append(" = ?");
                this._deleteSession = sb.toString();
                this._updateSession = "update " + this._sessionTable + " set lastNode = ?, accessTime = ?, lastAccessTime = ?, lastSavedTime = ?, expiryTime = ?, map = ? where " + this._sessionTableRowId + " = ?";
                this._updateSessionNode = "update " + this._sessionTable + " set lastNode = ? where " + this._sessionTableRowId + " = ?";
                this._updateSessionAccessTime = "update " + this._sessionTable + " set lastNode = ?, accessTime = ?, lastAccessTime = ?, lastSavedTime = ?, expiryTime = ? where " + this._sessionTableRowId + " = ?";
                connection.close();
            } catch (Throwable th3) {
                th = th3;
                connection = connection3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scavenge() {
        SessionManager sessionManager;
        ArrayList arrayList = new ArrayList();
        Connection connection = null;
        try {
            try {
                try {
                    Logger logger = LOG;
                    if (logger.isDebugEnabled()) {
                        logger.debug("Scavenge sweep started at " + System.currentTimeMillis(), new Object[0]);
                    }
                    if (this._lastScavengeTime > 0) {
                        connection = getConnection();
                        connection.setAutoCommit(true);
                        PreparedStatement preparedStatementPrepareStatement = connection.prepareStatement(this._selectBoundedExpiredSessions);
                        long j = this._lastScavengeTime;
                        long j2 = j - this._scavengeIntervalMs;
                        if (logger.isDebugEnabled()) {
                            logger.debug(" Searching for sessions expired between " + j2 + " and " + j, new Object[0]);
                        }
                        preparedStatementPrepareStatement.setLong(1, j2);
                        preparedStatementPrepareStatement.setLong(2, j);
                        ResultSet resultSetExecuteQuery = preparedStatementPrepareStatement.executeQuery();
                        while (resultSetExecuteQuery.next()) {
                            String string = resultSetExecuteQuery.getString("sessionId");
                            arrayList.add(string);
                            Logger logger2 = LOG;
                            if (logger2.isDebugEnabled()) {
                                logger2.debug(" Found expired sessionId=" + string, new Object[0]);
                            }
                        }
                        Handler[] childHandlersByClass = this._server.getChildHandlersByClass(ContextHandler.class);
                        for (int i = 0; childHandlersByClass != null && i < childHandlersByClass.length; i++) {
                            SessionHandler sessionHandler = (SessionHandler) ((ContextHandler) childHandlersByClass[i]).getChildHandlerByClass(SessionHandler.class);
                            if (sessionHandler != null && (sessionManager = sessionHandler.getSessionManager()) != null && (sessionManager instanceof JDBCSessionManager)) {
                                ((JDBCSessionManager) sessionManager).expire(arrayList);
                            }
                        }
                        long j3 = this._lastScavengeTime - (this._scavengeIntervalMs * 2);
                        if (j3 > 0) {
                            Logger logger3 = LOG;
                            if (logger3.isDebugEnabled()) {
                                logger3.debug("Deleting old expired sessions expired before " + j3, new Object[0]);
                            }
                            PreparedStatement preparedStatementPrepareStatement2 = connection.prepareStatement(this._deleteOldExpiredSessions);
                            preparedStatementPrepareStatement2.setLong(1, j3);
                            int iExecuteUpdate = preparedStatementPrepareStatement2.executeUpdate();
                            if (logger3.isDebugEnabled()) {
                                logger3.debug("Deleted " + iExecuteUpdate + " rows", new Object[0]);
                            }
                        }
                    }
                    this._lastScavengeTime = System.currentTimeMillis();
                    Logger logger4 = LOG;
                    if (logger4.isDebugEnabled()) {
                        logger4.debug("Scavenge sweep ended at " + this._lastScavengeTime, new Object[0]);
                    }
                    if (connection != null) {
                        connection.close();
                    }
                } catch (Exception e) {
                    if (isRunning()) {
                        LOG.warn("Problem selecting expired sessions", e);
                    } else {
                        LOG.ignore(e);
                    }
                    this._lastScavengeTime = System.currentTimeMillis();
                    Logger logger5 = LOG;
                    if (logger5.isDebugEnabled()) {
                        logger5.debug("Scavenge sweep ended at " + this._lastScavengeTime, new Object[0]);
                    }
                    if (connection != null) {
                        connection.close();
                    }
                }
            } catch (SQLException e2) {
                LOG.warn(e2);
            }
        } catch (Throwable th) {
            this._lastScavengeTime = System.currentTimeMillis();
            Logger logger6 = LOG;
            if (logger6.isDebugEnabled()) {
                logger6.debug("Scavenge sweep ended at " + this._lastScavengeTime, new Object[0]);
            }
            if (0 != 0) {
                try {
                    connection.close();
                } catch (SQLException e3) {
                    LOG.warn(e3);
                }
            }
            throw th;
        }
    }

    @Override // org.eclipse.jetty.server.SessionIdManager
    public void addSession(hnl hnlVar) {
        if (hnlVar == null) {
            return;
        }
        synchronized (this._sessionIds) {
            String clusterId = ((JDBCSessionManager.Session) hnlVar).getClusterId();
            try {
                insert(clusterId);
                this._sessionIds.add(clusterId);
            } catch (Exception e) {
                LOG.warn("Problem storing session id=" + clusterId, e);
            }
        }
    }

    @Override // org.eclipse.jetty.server.session.AbstractSessionIdManager, org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStart() throws Throwable {
        try {
            initializeDatabase();
            prepareTables();
            cleanExpiredSessions();
            super.doStart();
            Logger logger = LOG;
            if (logger.isDebugEnabled()) {
                logger.debug("Scavenging interval = " + getScavengeInterval() + " sec", new Object[0]);
            }
            this._timer = new Timer("JDBCSessionScavenger", true);
            setScavengeInterval(getScavengeInterval());
        } catch (Exception e) {
            LOG.warn("Problem initialising JettySessionIds table", e);
        }
    }

    @Override // org.eclipse.jetty.server.session.AbstractSessionIdManager, org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStop() throws Exception {
        synchronized (this) {
            try {
                TimerTask timerTask = this._task;
                if (timerTask != null) {
                    timerTask.cancel();
                }
                Timer timer = this._timer;
                if (timer != null) {
                    timer.cancel();
                }
                this._timer = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        this._sessionIds.clear();
        super.doStop();
    }

    public String getBlobType() {
        return this._blobType;
    }

    @Override // org.eclipse.jetty.server.SessionIdManager
    public String getClusterId(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf > 0 ? str.substring(0, iLastIndexOf) : str;
    }

    public Connection getConnection() throws SQLException {
        DataSource dataSource = this._datasource;
        return dataSource != null ? dataSource.getConnection() : DriverManager.getConnection(this._connectionUrl);
    }

    public String getConnectionUrl() {
        return this._connectionUrl;
    }

    public DataSource getDataSource() {
        return this._datasource;
    }

    public String getDatasourceName() {
        return this._jndiName;
    }

    public String getDriverClassName() {
        return this._driverClassName;
    }

    public String getLongType() {
        return this._longType;
    }

    @Override // org.eclipse.jetty.server.SessionIdManager
    public String getNodeId(String str, HttpServletRequest httpServletRequest) {
        if (this._workerName == null) {
            return str;
        }
        return str + '.' + this._workerName;
    }

    public long getScavengeInterval() {
        return this._scavengeIntervalMs / 1000;
    }

    @Override // org.eclipse.jetty.server.SessionIdManager
    public boolean idInUse(String str) {
        boolean zContains;
        if (str == null) {
            return false;
        }
        String clusterId = getClusterId(str);
        synchronized (this._sessionIds) {
            zContains = this._sessionIds.contains(clusterId);
        }
        if (zContains) {
            return true;
        }
        try {
            return exists(clusterId);
        } catch (Exception e) {
            LOG.warn("Problem checking inUse for id=" + clusterId, e);
            return false;
        }
    }

    @Override // org.eclipse.jetty.server.SessionIdManager
    public void invalidateAll(String str) {
        SessionManager sessionManager;
        removeSession(str);
        synchronized (this._sessionIds) {
            try {
                Handler[] childHandlersByClass = this._server.getChildHandlersByClass(ContextHandler.class);
                for (int i = 0; childHandlersByClass != null && i < childHandlersByClass.length; i++) {
                    SessionHandler sessionHandler = (SessionHandler) ((ContextHandler) childHandlersByClass[i]).getChildHandlerByClass(SessionHandler.class);
                    if (sessionHandler != null && (sessionManager = sessionHandler.getSessionManager()) != null && (sessionManager instanceof JDBCSessionManager)) {
                        ((JDBCSessionManager) sessionManager).invalidateSession(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void removeSession(String str) {
        if (str == null) {
            return;
        }
        synchronized (this._sessionIds) {
            Logger logger = LOG;
            if (logger.isDebugEnabled()) {
                logger.debug("Removing session id=".concat(str), new Object[0]);
            }
            try {
                this._sessionIds.remove(str);
                delete(str);
            } catch (Exception e) {
                LOG.warn("Problem removing session id=".concat(str), e);
            }
        }
    }

    public void setBlobType(String str) {
        this._blobType = str;
    }

    public void setDatasource(DataSource dataSource) {
        this._datasource = dataSource;
    }

    public void setDatasourceName(String str) {
        this._jndiName = str;
    }

    public void setDriverInfo(String str, String str2) {
        this._driverClassName = str;
        this._connectionUrl = str2;
    }

    public void setLongType(String str) {
        this._longType = str;
    }

    public void setScavengeInterval(long j) {
        if (j <= 0) {
            j = 60;
        }
        long j2 = this._scavengeIntervalMs;
        long j3 = j * 1000;
        this._scavengeIntervalMs = j3;
        long j4 = j3 / 10;
        if (System.currentTimeMillis() % 2 == 0) {
            this._scavengeIntervalMs += j4;
        }
        Logger logger = LOG;
        if (logger.isDebugEnabled()) {
            logger.debug("Scavenging every " + this._scavengeIntervalMs + " ms", new Object[0]);
        }
        if (this._timer != null) {
            if (j3 != j2 || this._task == null) {
                synchronized (this) {
                    try {
                        TimerTask timerTask = this._task;
                        if (timerTask != null) {
                            timerTask.cancel();
                        }
                        TimerTask timerTask2 = new TimerTask() { // from class: org.eclipse.jetty.server.session.JDBCSessionIdManager.1
                            @Override // java.util.TimerTask, java.lang.Runnable
                            public void run() {
                                JDBCSessionIdManager.this.scavenge();
                            }
                        };
                        this._task = timerTask2;
                        Timer timer = this._timer;
                        long j5 = this._scavengeIntervalMs;
                        timer.schedule(timerTask2, j5, j5);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    public void setDriverInfo(Driver driver, String str) {
        this._driver = driver;
        this._connectionUrl = str;
    }

    public JDBCSessionIdManager(Server server, Random random) {
        super(random);
        this._sessionIds = new HashSet<>();
        this._sessionIdTable = "JettySessionIds";
        this._sessionTable = "JettySessions";
        this._sessionTableRowId = "rowId";
        this._scavengeIntervalMs = AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED;
        this._server = server;
    }

    @Override // org.eclipse.jetty.server.SessionIdManager
    public void removeSession(hnl hnlVar) {
        if (hnlVar == null) {
            return;
        }
        removeSession(((JDBCSessionManager.Session) hnlVar).getClusterId());
    }
}
