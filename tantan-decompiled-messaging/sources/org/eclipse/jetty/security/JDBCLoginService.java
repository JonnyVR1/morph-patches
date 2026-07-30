package org.eclipse.jetty.security;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.SignInGrantType;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;
import org.eclipse.jetty.server.UserIdentity;
import org.eclipse.jetty.util.Loader;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import org.eclipse.jetty.util.resource.Resource;
import org.eclipse.jetty.util.security.Credential;
import p149l.qkq0;

/* JADX INFO: loaded from: classes3.dex */
public class JDBCLoginService extends MappedLoginService {
    private static final Logger LOG = Log.getLogger((Class<?>) JDBCLoginService.class);
    private int _cacheTime;
    private Connection _con;
    private String _config;
    private String _jdbcDriver;
    private long _lastHashPurge;
    private String _password;
    private String _roleSql;
    private String _roleTableRoleField;
    private String _url;
    private String _userName;
    private String _userSql;
    private String _userTableKey;
    private String _userTablePasswordField;

    public JDBCLoginService(String str, IdentityService identityService, String str2) throws IOException {
        setName(str);
        setIdentityService(identityService);
        setConfig(str2);
    }

    private void closeConnection() {
        if (this._con != null) {
            Logger logger = LOG;
            if (logger.isDebugEnabled()) {
                logger.debug("Closing db connection for JDBCUserRealm", new Object[0]);
            }
            try {
                this._con.close();
            } catch (Exception e) {
                LOG.ignore(e);
            }
        }
        this._con = null;
    }

    public void connectDatabase() {
        try {
            Class.forName(this._jdbcDriver);
            this._con = DriverManager.getConnection(this._url, this._userName, this._password);
        } catch (ClassNotFoundException e) {
            LOG.warn("UserRealm " + getName() + " could not connect to database; will try later", e);
        } catch (SQLException e2) {
            LOG.warn("UserRealm " + getName() + " could not connect to database; will try later", e2);
        }
    }

    @Override // org.eclipse.jetty.security.MappedLoginService, org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStart() throws Exception {
        String str;
        String str2;
        Properties properties = new Properties();
        properties.load(Resource.newResource(this._config).getInputStream());
        this._jdbcDriver = properties.getProperty("jdbcdriver");
        this._url = properties.getProperty("url");
        this._userName = properties.getProperty("username");
        this._password = properties.getProperty(SignInGrantType.password);
        String property = properties.getProperty("usertable");
        this._userTableKey = properties.getProperty("usertablekey");
        String property2 = properties.getProperty("usertableuserfield");
        this._userTablePasswordField = properties.getProperty("usertablepasswordfield");
        String property3 = properties.getProperty("roletable");
        String property4 = properties.getProperty("roletablekey");
        this._roleTableRoleField = properties.getProperty("roletablerolefield");
        String property5 = properties.getProperty("userroletable");
        String property6 = properties.getProperty("userroletableuserkey");
        String property7 = properties.getProperty("userroletablerolekey");
        this._cacheTime = new Integer(properties.getProperty("cachetime")).intValue();
        String str3 = this._jdbcDriver;
        if (str3 == null || str3.equals("") || (str = this._url) == null || str.equals("") || (str2 = this._userName) == null || str2.equals("") || this._password == null || this._cacheTime < 0) {
            LOG.warn("UserRealm " + getName() + " has not been properly configured", new Object[0]);
        }
        this._cacheTime *= 1000;
        this._lastHashPurge = 0L;
        this._userSql = "select " + this._userTableKey + Constants.SEPARATOR_COMMA + this._userTablePasswordField + " from " + property + " where " + property2 + " = ?";
        this._roleSql = "select r." + this._roleTableRoleField + " from " + property3 + " r, " + property5 + " u where u." + property6 + " = ? and r." + property4 + " = u." + property7;
        Loader.loadClass(getClass(), this._jdbcDriver).newInstance();
        super.doStart();
    }

    public String getConfig() {
        return this._config;
    }

    @Override // org.eclipse.jetty.security.MappedLoginService
    public UserIdentity loadUser(String str) {
        try {
            if (this._con == null) {
                connectDatabase();
            }
            Connection connection = this._con;
            if (connection == null) {
                throw new SQLException("Can't connect to database");
            }
            PreparedStatement preparedStatementPrepareStatement = connection.prepareStatement(this._userSql);
            preparedStatementPrepareStatement.setObject(1, str);
            ResultSet resultSetExecuteQuery = preparedStatementPrepareStatement.executeQuery();
            if (!resultSetExecuteQuery.next()) {
                return null;
            }
            int i = resultSetExecuteQuery.getInt(this._userTableKey);
            String string = resultSetExecuteQuery.getString(this._userTablePasswordField);
            preparedStatementPrepareStatement.close();
            PreparedStatement preparedStatementPrepareStatement2 = this._con.prepareStatement(this._roleSql);
            preparedStatementPrepareStatement2.setInt(1, i);
            ResultSet resultSetExecuteQuery2 = preparedStatementPrepareStatement2.executeQuery();
            ArrayList arrayList = new ArrayList();
            while (resultSetExecuteQuery2.next()) {
                arrayList.add(resultSetExecuteQuery2.getString(this._roleTableRoleField));
            }
            preparedStatementPrepareStatement2.close();
            return putUser(str, Credential.getCredential(string), (String[]) arrayList.toArray(new String[arrayList.size()]));
        } catch (SQLException e) {
            LOG.warn("UserRealm " + getName() + " could not load user information from database", e);
            closeConnection();
            return null;
        }
    }

    @Override // org.eclipse.jetty.security.MappedLoginService
    public void loadUsers() {
    }

    @Override // org.eclipse.jetty.security.MappedLoginService, org.eclipse.jetty.security.LoginService
    public UserIdentity login(String str, Object obj) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this._lastHashPurge;
        int i = this._cacheTime;
        if (j > i || i == 0) {
            this._users.clear();
            this._lastHashPurge = jCurrentTimeMillis;
            closeConnection();
        }
        return super.login(str, obj);
    }

    public void setConfig(String str) {
        if (isRunning()) {
            qkq0.m175383a("Running");
        } else {
            this._config = str;
        }
    }

    public JDBCLoginService(String str) throws IOException {
        setName(str);
    }

    public JDBCLoginService(String str, String str2) throws IOException {
        setName(str);
        setConfig(str2);
    }

    public JDBCLoginService() throws IOException {
    }
}
