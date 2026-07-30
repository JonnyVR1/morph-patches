package org.eclipse.jetty.util.ssl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.security.InvalidParameterException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.Security;
import java.security.cert.CRL;
import java.security.cert.CertStore;
import java.security.cert.Certificate;
import java.security.cert.CollectionCertStoreParameters;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.net.ssl.CertPathTrustManagerParameters;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;
import org.eclipse.jetty.util.C21953IO;
import org.eclipse.jetty.util.component.AbstractLifeCycle;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import org.eclipse.jetty.util.resource.Resource;
import org.eclipse.jetty.util.security.CertificateUtils;
import org.eclipse.jetty.util.security.CertificateValidator;
import org.eclipse.jetty.util.security.Password;
import p149l.j850;
import p149l.phg0;
import p149l.qkq0;

/* JADX INFO: loaded from: classes3.dex */
public class SslContextFactory extends AbstractLifeCycle {
    public static final String DEFAULT_KEYMANAGERFACTORY_ALGORITHM;
    public static final String DEFAULT_KEYSTORE_PATH;
    public static final String DEFAULT_TRUSTMANAGERFACTORY_ALGORITHM;
    public static final String KEYPASSWORD_PROPERTY = "org.eclipse.jetty.ssl.keypassword";
    public static final String PASSWORD_PROPERTY = "org.eclipse.jetty.ssl.password";
    private boolean _allowRenegotiate;
    private String _certAlias;
    private SSLContext _context;
    private String _crlPath;
    private boolean _enableCRLDP;
    private boolean _enableOCSP;
    private final Set<String> _excludeCipherSuites;
    private final Set<String> _excludeProtocols;
    private Set<String> _includeCipherSuites;
    private Set<String> _includeProtocols;
    private String _keyManagerFactoryAlgorithm;
    private transient Password _keyManagerPassword;
    private KeyStore _keyStore;
    private InputStream _keyStoreInputStream;
    private transient Password _keyStorePassword;
    private String _keyStorePath;
    private String _keyStoreProvider;
    private String _keyStoreType;
    private int _maxCertPathLength;
    private boolean _needClientAuth;
    private String _ocspResponderURL;
    private String _secureRandomAlgorithm;
    private boolean _sessionCachingEnabled;
    private String _sslProtocol;
    private String _sslProvider;
    private int _sslSessionCacheSize;
    private int _sslSessionTimeout;
    private boolean _trustAll;
    private String _trustManagerFactoryAlgorithm;
    private KeyStore _trustStore;
    private InputStream _trustStoreInputStream;
    private transient Password _trustStorePassword;
    private String _trustStorePath;
    private String _trustStoreProvider;
    private String _trustStoreType;
    private boolean _validateCerts;
    private boolean _validatePeerCerts;
    private boolean _wantClientAuth;
    public static final TrustManager[] TRUST_ALL_CERTS = {new X509TrustManager() { // from class: org.eclipse.jetty.util.ssl.SslContextFactory.1
        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }};
    private static final Logger LOG = Log.getLogger((Class<?>) SslContextFactory.class);

    static {
        DEFAULT_KEYMANAGERFACTORY_ALGORITHM = Security.getProperty("ssl.KeyManagerFactory.algorithm") == null ? "SunX509" : Security.getProperty("ssl.KeyManagerFactory.algorithm");
        DEFAULT_TRUSTMANAGERFACTORY_ALGORITHM = Security.getProperty("ssl.TrustManagerFactory.algorithm") != null ? Security.getProperty("ssl.TrustManagerFactory.algorithm") : "SunX509";
        DEFAULT_KEYSTORE_PATH = System.getProperty("user.home") + File.separator + ".keystore";
    }

    public SslContextFactory() {
        this._excludeProtocols = new LinkedHashSet();
        this._includeProtocols = null;
        this._excludeCipherSuites = new LinkedHashSet();
        this._includeCipherSuites = null;
        this._keyStoreType = "JKS";
        this._trustStoreType = "JKS";
        this._needClientAuth = false;
        this._wantClientAuth = false;
        this._allowRenegotiate = true;
        this._sslProtocol = "TLS";
        this._keyManagerFactoryAlgorithm = DEFAULT_KEYMANAGERFACTORY_ALGORITHM;
        this._trustManagerFactoryAlgorithm = DEFAULT_TRUSTMANAGERFACTORY_ALGORITHM;
        this._maxCertPathLength = -1;
        this._enableCRLDP = false;
        this._enableOCSP = false;
        this._sessionCachingEnabled = true;
        this._trustAll = true;
    }

    public void addExcludeCipherSuites(String... strArr) {
        checkNotStarted();
        this._excludeCipherSuites.addAll(Arrays.asList(strArr));
    }

    public void addExcludeProtocols(String... strArr) {
        checkNotStarted();
        this._excludeProtocols.addAll(Arrays.asList(strArr));
    }

    public void checkKeyStore() {
        if (this._context != null) {
            return;
        }
        KeyStore keyStore = this._keyStore;
        if (keyStore == null && this._keyStoreInputStream == null && this._keyStorePath == null) {
            qkq0.m175383a("SSL doesn't have a valid keystore");
            return;
        }
        if (this._trustStore == null && this._trustStoreInputStream == null && this._trustStorePath == null) {
            this._trustStore = keyStore;
            this._trustStorePath = this._keyStorePath;
            this._trustStoreInputStream = this._keyStoreInputStream;
            this._trustStoreType = this._keyStoreType;
            this._trustStoreProvider = this._keyStoreProvider;
            this._trustStorePassword = this._keyStorePassword;
            this._trustManagerFactoryAlgorithm = this._keyManagerFactoryAlgorithm;
        }
        InputStream inputStream = this._keyStoreInputStream;
        if (inputStream == null || inputStream != this._trustStoreInputStream) {
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C21953IO.copy(this._keyStoreInputStream, byteArrayOutputStream);
            this._keyStoreInputStream.close();
            this._keyStoreInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            this._trustStoreInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        } catch (Exception e) {
            phg0.m168968a(e);
        }
    }

    public void checkNotStarted() {
        if (isStarted()) {
            j850.m140190a("Cannot modify configuration when ", getState());
        }
    }

    public void customize(SSLEngine sSLEngine) {
        if (getWantClientAuth()) {
            sSLEngine.setWantClientAuth(getWantClientAuth());
        }
        if (getNeedClientAuth()) {
            sSLEngine.setNeedClientAuth(getNeedClientAuth());
        }
        sSLEngine.setEnabledCipherSuites(selectCipherSuites(sSLEngine.getEnabledCipherSuites(), sSLEngine.getSupportedCipherSuites()));
        sSLEngine.setEnabledProtocols(selectProtocols(sSLEngine.getEnabledProtocols(), sSLEngine.getSupportedProtocols()));
    }

    @Override // org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStart() throws Exception {
        String str;
        TrustManager[] trustManagerArr;
        if (this._context == null) {
            if (this._keyStore == null && this._keyStoreInputStream == null && this._keyStorePath == null && this._trustStore == null && this._trustStoreInputStream == null && this._trustStorePath == null) {
                if (this._trustAll) {
                    LOG.debug("No keystore or trust store configured.  ACCEPTING UNTRUSTED CERTIFICATES!!!!!", new Object[0]);
                    trustManagerArr = TRUST_ALL_CERTS;
                } else {
                    trustManagerArr = null;
                }
                String str2 = this._secureRandomAlgorithm;
                SecureRandom secureRandom = str2 == null ? null : SecureRandom.getInstance(str2);
                SSLContext sSLContext = SSLContext.getInstance(this._sslProtocol);
                this._context = sSLContext;
                sSLContext.init(null, trustManagerArr, secureRandom);
                return;
            }
            checkKeyStore();
            KeyStore keyStoreLoadKeyStore = loadKeyStore();
            KeyStore keyStoreLoadTrustStore = loadTrustStore();
            Collection<? extends CRL> collectionLoadCRL = loadCRL(this._crlPath);
            if (this._validateCerts && keyStoreLoadKeyStore != null) {
                if (this._certAlias == null) {
                    ArrayList list = Collections.list(keyStoreLoadKeyStore.aliases());
                    this._certAlias = list.size() == 1 ? (String) list.get(0) : null;
                }
                String str3 = this._certAlias;
                Certificate certificate = str3 == null ? null : keyStoreLoadKeyStore.getCertificate(str3);
                if (certificate == null) {
                    if (this._certAlias == null) {
                        str = "";
                    } else {
                        str = " for alias " + this._certAlias;
                    }
                    throw new Exception("No certificate found in the keystore".concat(str));
                }
                CertificateValidator certificateValidator = new CertificateValidator(keyStoreLoadTrustStore, collectionLoadCRL);
                certificateValidator.setMaxCertPathLength(this._maxCertPathLength);
                certificateValidator.setEnableCRLDP(this._enableCRLDP);
                certificateValidator.setEnableOCSP(this._enableOCSP);
                certificateValidator.setOcspResponderURL(this._ocspResponderURL);
                certificateValidator.validate(keyStoreLoadKeyStore, certificate);
            }
            KeyManager[] keyManagers = getKeyManagers(keyStoreLoadKeyStore);
            TrustManager[] trustManagers = getTrustManagers(keyStoreLoadTrustStore, collectionLoadCRL);
            String str4 = this._secureRandomAlgorithm;
            SecureRandom secureRandom2 = str4 != null ? SecureRandom.getInstance(str4) : null;
            String str5 = this._sslProvider;
            String str6 = this._sslProtocol;
            SSLContext sSLContext2 = str5 == null ? SSLContext.getInstance(str6) : SSLContext.getInstance(str6, str5);
            this._context = sSLContext2;
            sSLContext2.init(keyManagers, trustManagers, secureRandom2);
            SSLEngine sSLEngineNewSslEngine = newSslEngine();
            Logger logger = LOG;
            logger.info("Enabled Protocols {} of {}", Arrays.asList(sSLEngineNewSslEngine.getEnabledProtocols()), Arrays.asList(sSLEngineNewSslEngine.getSupportedProtocols()));
            if (logger.isDebugEnabled()) {
                logger.debug("Enabled Ciphers   {} of {}", Arrays.asList(sSLEngineNewSslEngine.getEnabledCipherSuites()), Arrays.asList(sSLEngineNewSslEngine.getSupportedCipherSuites()));
            }
        }
    }

    public String getCertAlias() {
        return this._certAlias;
    }

    public String getCrlPath() {
        return this._crlPath;
    }

    public String[] getExcludeCipherSuites() {
        Set<String> set = this._excludeCipherSuites;
        return (String[]) set.toArray(new String[set.size()]);
    }

    public String[] getExcludeProtocols() {
        Set<String> set = this._excludeProtocols;
        return (String[]) set.toArray(new String[set.size()]);
    }

    public String[] getIncludeCipherSuites() {
        Set<String> set = this._includeCipherSuites;
        return (String[]) set.toArray(new String[set.size()]);
    }

    public String[] getIncludeProtocols() {
        Set<String> set = this._includeProtocols;
        return (String[]) set.toArray(new String[set.size()]);
    }

    public KeyManager[] getKeyManagers(KeyStore keyStore) throws Exception {
        if (keyStore == null) {
            return null;
        }
        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(this._keyManagerFactoryAlgorithm);
        Password password = this._keyManagerPassword;
        keyManagerFactory.init(keyStore, (password == null && (password = this._keyStorePassword) == null) ? null : password.toString().toCharArray());
        KeyManager[] keyManagers = keyManagerFactory.getKeyManagers();
        if (this._certAlias != null) {
            for (int i = 0; i < keyManagers.length; i++) {
                if (keyManagers[i] instanceof X509KeyManager) {
                    keyManagers[i] = new AliasedX509ExtendedKeyManager(this._certAlias, (X509KeyManager) keyManagers[i]);
                }
            }
        }
        return keyManagers;
    }

    @Deprecated
    public KeyStore getKeyStore(InputStream inputStream, String str, String str2, String str3, String str4) throws Exception {
        return CertificateUtils.getKeyStore(inputStream, str, str2, str3, str4);
    }

    @Deprecated
    public InputStream getKeyStoreInputStream() {
        checkKeyStore();
        return this._keyStoreInputStream;
    }

    public String getKeyStorePath() {
        return this._keyStorePath;
    }

    public String getKeyStoreProvider() {
        return this._keyStoreProvider;
    }

    public String getKeyStoreType() {
        return this._keyStoreType;
    }

    public int getMaxCertPathLength() {
        return this._maxCertPathLength;
    }

    public boolean getNeedClientAuth() {
        return this._needClientAuth;
    }

    public String getOcspResponderURL() {
        return this._ocspResponderURL;
    }

    public String getProtocol() {
        return this._sslProtocol;
    }

    public String getProvider() {
        return this._sslProvider;
    }

    public String getSecureRandomAlgorithm() {
        return this._secureRandomAlgorithm;
    }

    public SSLContext getSslContext() {
        if (isStarted()) {
            return this._context;
        }
        qkq0.m175383a(getState());
        return null;
    }

    public String getSslKeyManagerFactoryAlgorithm() {
        return this._keyManagerFactoryAlgorithm;
    }

    public int getSslSessionCacheSize() {
        return this._sslSessionCacheSize;
    }

    public int getSslSessionTimeout() {
        return this._sslSessionTimeout;
    }

    public String getTrustManagerFactoryAlgorithm() {
        return this._trustManagerFactoryAlgorithm;
    }

    public TrustManager[] getTrustManagers(KeyStore keyStore, Collection<? extends CRL> collection) throws Exception {
        if (keyStore == null) {
            return null;
        }
        if (!this._validatePeerCerts || !this._trustManagerFactoryAlgorithm.equalsIgnoreCase("PKIX")) {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(this._trustManagerFactoryAlgorithm);
            trustManagerFactory.init(keyStore);
            return trustManagerFactory.getTrustManagers();
        }
        PKIXBuilderParameters pKIXBuilderParameters = new PKIXBuilderParameters(keyStore, new X509CertSelector());
        pKIXBuilderParameters.setMaxPathLength(this._maxCertPathLength);
        pKIXBuilderParameters.setRevocationEnabled(true);
        if (collection != null && !collection.isEmpty()) {
            pKIXBuilderParameters.addCertStore(CertStore.getInstance("Collection", new CollectionCertStoreParameters(collection)));
        }
        if (this._enableCRLDP) {
            System.setProperty("com.sun.security.enableCRLDP", "true");
        }
        if (this._enableOCSP) {
            Security.setProperty("ocsp.enable", "true");
            String str = this._ocspResponderURL;
            if (str != null) {
                Security.setProperty("ocsp.responderURL", str);
            }
        }
        TrustManagerFactory trustManagerFactory2 = TrustManagerFactory.getInstance(this._trustManagerFactoryAlgorithm);
        trustManagerFactory2.init(new CertPathTrustManagerParameters(pKIXBuilderParameters));
        return trustManagerFactory2.getTrustManagers();
    }

    public String getTrustStore() {
        return this._trustStorePath;
    }

    @Deprecated
    public InputStream getTrustStoreInputStream() {
        checkKeyStore();
        return this._trustStoreInputStream;
    }

    public String getTrustStoreProvider() {
        return this._trustStoreProvider;
    }

    public String getTrustStoreType() {
        return this._trustStoreType;
    }

    @Deprecated
    public boolean getValidateCerts() {
        return this._validateCerts;
    }

    public boolean getWantClientAuth() {
        return this._wantClientAuth;
    }

    public boolean isAllowRenegotiate() {
        return this._allowRenegotiate;
    }

    public boolean isEnableCRLDP() {
        return this._enableCRLDP;
    }

    public boolean isEnableOCSP() {
        return this._enableOCSP;
    }

    public boolean isSessionCachingEnabled() {
        return this._sessionCachingEnabled;
    }

    public boolean isTrustAll() {
        return this._trustAll;
    }

    public boolean isValidateCerts() {
        return this._validateCerts;
    }

    public boolean isValidatePeerCerts() {
        return this._validatePeerCerts;
    }

    public Collection<? extends CRL> loadCRL(String str) throws Exception {
        return CertificateUtils.loadCRL(str);
    }

    public KeyStore loadKeyStore() throws Exception {
        KeyStore keyStore = this._keyStore;
        if (keyStore != null) {
            return keyStore;
        }
        InputStream inputStream = this._keyStoreInputStream;
        String str = this._keyStorePath;
        String str2 = this._keyStoreType;
        String str3 = this._keyStoreProvider;
        Password password = this._keyStorePassword;
        return getKeyStore(inputStream, str, str2, str3, password == null ? null : password.toString());
    }

    public KeyStore loadTrustStore() throws Exception {
        KeyStore keyStore = this._trustStore;
        if (keyStore != null) {
            return keyStore;
        }
        InputStream inputStream = this._trustStoreInputStream;
        String str = this._trustStorePath;
        String str2 = this._trustStoreType;
        String str3 = this._trustStoreProvider;
        Password password = this._trustStorePassword;
        return getKeyStore(inputStream, str, str2, str3, password == null ? null : password.toString());
    }

    public SSLEngine newSslEngine(String str, int i) {
        boolean zIsSessionCachingEnabled = isSessionCachingEnabled();
        SSLContext sSLContext = this._context;
        SSLEngine sSLEngineCreateSSLEngine = zIsSessionCachingEnabled ? sSLContext.createSSLEngine(str, i) : sSLContext.createSSLEngine();
        customize(sSLEngineCreateSSLEngine);
        return sSLEngineCreateSSLEngine;
    }

    public SSLServerSocket newSslServerSocket(String str, int i, int i2) throws IOException {
        SSLServerSocketFactory serverSocketFactory = this._context.getServerSocketFactory();
        SSLServerSocket sSLServerSocket = (SSLServerSocket) (str == null ? serverSocketFactory.createServerSocket(i, i2) : serverSocketFactory.createServerSocket(i, i2, InetAddress.getByName(str)));
        if (getWantClientAuth()) {
            sSLServerSocket.setWantClientAuth(getWantClientAuth());
        }
        if (getNeedClientAuth()) {
            sSLServerSocket.setNeedClientAuth(getNeedClientAuth());
        }
        sSLServerSocket.setEnabledCipherSuites(selectCipherSuites(sSLServerSocket.getEnabledCipherSuites(), sSLServerSocket.getSupportedCipherSuites()));
        sSLServerSocket.setEnabledProtocols(selectProtocols(sSLServerSocket.getEnabledProtocols(), sSLServerSocket.getSupportedProtocols()));
        return sSLServerSocket;
    }

    public SSLSocket newSslSocket() throws IOException {
        SSLSocket sSLSocket = (SSLSocket) this._context.getSocketFactory().createSocket();
        if (getWantClientAuth()) {
            sSLSocket.setWantClientAuth(getWantClientAuth());
        }
        if (getNeedClientAuth()) {
            sSLSocket.setNeedClientAuth(getNeedClientAuth());
        }
        sSLSocket.setEnabledCipherSuites(selectCipherSuites(sSLSocket.getEnabledCipherSuites(), sSLSocket.getSupportedCipherSuites()));
        sSLSocket.setEnabledProtocols(selectProtocols(sSLSocket.getEnabledProtocols(), sSLSocket.getSupportedProtocols()));
        return sSLSocket;
    }

    public String[] selectCipherSuites(String[] strArr, String[] strArr2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Set<String> set = this._includeCipherSuites;
        if (set != null) {
            for (String str : set) {
                if (Arrays.asList(strArr2).contains(str)) {
                    linkedHashSet.add(str);
                }
            }
        } else {
            linkedHashSet.addAll(Arrays.asList(strArr));
        }
        Set<String> set2 = this._excludeCipherSuites;
        if (set2 != null) {
            linkedHashSet.removeAll(set2);
        }
        return (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
    }

    public String[] selectProtocols(String[] strArr, String[] strArr2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Set<String> set = this._includeProtocols;
        if (set != null) {
            for (String str : set) {
                if (Arrays.asList(strArr2).contains(str)) {
                    linkedHashSet.add(str);
                }
            }
        } else {
            linkedHashSet.addAll(Arrays.asList(strArr));
        }
        Set<String> set2 = this._excludeProtocols;
        if (set2 != null) {
            linkedHashSet.removeAll(set2);
        }
        return (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
    }

    public void setAllowRenegotiate(boolean z) {
        checkNotStarted();
        this._allowRenegotiate = z;
    }

    public void setCertAlias(String str) {
        checkNotStarted();
        this._certAlias = str;
    }

    public void setCrlPath(String str) {
        checkNotStarted();
        this._crlPath = str;
    }

    public void setEnableCRLDP(boolean z) {
        checkNotStarted();
        this._enableCRLDP = z;
    }

    public void setEnableOCSP(boolean z) {
        checkNotStarted();
        this._enableOCSP = z;
    }

    public void setExcludeCipherSuites(String... strArr) {
        checkNotStarted();
        this._excludeCipherSuites.clear();
        this._excludeCipherSuites.addAll(Arrays.asList(strArr));
    }

    public void setExcludeProtocols(String... strArr) {
        checkNotStarted();
        this._excludeProtocols.clear();
        this._excludeProtocols.addAll(Arrays.asList(strArr));
    }

    public void setIncludeCipherSuites(String... strArr) {
        checkNotStarted();
        this._includeCipherSuites = new LinkedHashSet(Arrays.asList(strArr));
    }

    public void setIncludeProtocols(String... strArr) {
        checkNotStarted();
        this._includeProtocols = new LinkedHashSet(Arrays.asList(strArr));
    }

    public void setKeyManagerPassword(String str) {
        checkNotStarted();
        this._keyManagerPassword = Password.getPassword("org.eclipse.jetty.ssl.keypassword", str, null);
    }

    @Deprecated
    public void setKeyStore(String str) {
        checkNotStarted();
        this._keyStorePath = str;
    }

    @Deprecated
    public void setKeyStoreInputStream(InputStream inputStream) {
        checkNotStarted();
        this._keyStoreInputStream = inputStream;
    }

    public void setKeyStorePassword(String str) {
        checkNotStarted();
        this._keyStorePassword = Password.getPassword("org.eclipse.jetty.ssl.password", str, null);
    }

    public void setKeyStorePath(String str) {
        checkNotStarted();
        this._keyStorePath = str;
    }

    public void setKeyStoreProvider(String str) {
        checkNotStarted();
        this._keyStoreProvider = str;
    }

    public void setKeyStoreResource(Resource resource) {
        checkNotStarted();
        try {
            this._keyStoreInputStream = resource.getInputStream();
        } catch (IOException unused) {
            throw new InvalidParameterException("Unable to get resource input stream for resource " + resource.toString());
        }
    }

    public void setKeyStoreType(String str) {
        checkNotStarted();
        this._keyStoreType = str;
    }

    public void setMaxCertPathLength(int i) {
        checkNotStarted();
        this._maxCertPathLength = i;
    }

    public void setNeedClientAuth(boolean z) {
        checkNotStarted();
        this._needClientAuth = z;
    }

    public void setOcspResponderURL(String str) {
        checkNotStarted();
        this._ocspResponderURL = str;
    }

    public void setProtocol(String str) {
        checkNotStarted();
        this._sslProtocol = str;
    }

    public void setProvider(String str) {
        checkNotStarted();
        this._sslProvider = str;
    }

    public void setSecureRandomAlgorithm(String str) {
        checkNotStarted();
        this._secureRandomAlgorithm = str;
    }

    public void setSessionCachingEnabled(boolean z) {
        this._sessionCachingEnabled = z;
    }

    public void setSslContext(SSLContext sSLContext) {
        checkNotStarted();
        this._context = sSLContext;
    }

    public void setSslKeyManagerFactoryAlgorithm(String str) {
        checkNotStarted();
        this._keyManagerFactoryAlgorithm = str;
    }

    public void setSslSessionCacheSize(int i) {
        this._sslSessionCacheSize = i;
    }

    public void setSslSessionTimeout(int i) {
        this._sslSessionTimeout = i;
    }

    public void setTrustAll(boolean z) {
        this._trustAll = z;
    }

    public void setTrustManagerFactoryAlgorithm(String str) {
        checkNotStarted();
        this._trustManagerFactoryAlgorithm = str;
    }

    public void setTrustStore(String str) {
        checkNotStarted();
        this._trustStorePath = str;
    }

    @Deprecated
    public void setTrustStoreInputStream(InputStream inputStream) {
        checkNotStarted();
        this._trustStoreInputStream = inputStream;
    }

    public void setTrustStorePassword(String str) {
        checkNotStarted();
        this._trustStorePassword = Password.getPassword("org.eclipse.jetty.ssl.password", str, null);
    }

    public void setTrustStoreProvider(String str) {
        checkNotStarted();
        this._trustStoreProvider = str;
    }

    public void setTrustStoreResource(Resource resource) {
        checkNotStarted();
        try {
            this._trustStoreInputStream = resource.getInputStream();
        } catch (IOException unused) {
            throw new InvalidParameterException("Unable to get resource input stream for resource " + resource.toString());
        }
    }

    public void setTrustStoreType(String str) {
        checkNotStarted();
        this._trustStoreType = str;
    }

    public void setValidateCerts(boolean z) {
        checkNotStarted();
        this._validateCerts = z;
    }

    public void setValidatePeerCerts(boolean z) {
        checkNotStarted();
        this._validatePeerCerts = z;
    }

    public void setWantClientAuth(boolean z) {
        checkNotStarted();
        this._wantClientAuth = z;
    }

    public String toString() {
        return String.format("%s@%x(%s,%s)", getClass().getSimpleName(), Integer.valueOf(hashCode()), this._keyStorePath, this._trustStorePath);
    }

    @Deprecated
    public String getKeyStore() {
        return this._keyStorePath;
    }

    public void setKeyStore(KeyStore keyStore) {
        checkNotStarted();
        this._keyStore = keyStore;
    }

    public void setTrustStore(KeyStore keyStore) {
        checkNotStarted();
        this._trustStore = keyStore;
    }

    public SSLEngine newSslEngine() {
        SSLEngine sSLEngineCreateSSLEngine = this._context.createSSLEngine();
        customize(sSLEngineCreateSSLEngine);
        return sSLEngineCreateSSLEngine;
    }

    public SslContextFactory(boolean z) {
        this._excludeProtocols = new LinkedHashSet();
        this._includeProtocols = null;
        this._excludeCipherSuites = new LinkedHashSet();
        this._includeCipherSuites = null;
        this._keyStoreType = "JKS";
        this._trustStoreType = "JKS";
        this._needClientAuth = false;
        this._wantClientAuth = false;
        this._allowRenegotiate = true;
        this._sslProtocol = "TLS";
        this._keyManagerFactoryAlgorithm = DEFAULT_KEYMANAGERFACTORY_ALGORITHM;
        this._trustManagerFactoryAlgorithm = DEFAULT_TRUSTMANAGERFACTORY_ALGORITHM;
        this._maxCertPathLength = -1;
        this._enableCRLDP = false;
        this._enableOCSP = false;
        this._sessionCachingEnabled = true;
        this._trustAll = z;
    }

    public SslContextFactory(String str) {
        this._excludeProtocols = new LinkedHashSet();
        this._includeProtocols = null;
        this._excludeCipherSuites = new LinkedHashSet();
        this._includeCipherSuites = null;
        this._keyStoreType = "JKS";
        this._trustStoreType = "JKS";
        this._needClientAuth = false;
        this._wantClientAuth = false;
        this._allowRenegotiate = true;
        this._sslProtocol = "TLS";
        this._keyManagerFactoryAlgorithm = DEFAULT_KEYMANAGERFACTORY_ALGORITHM;
        this._trustManagerFactoryAlgorithm = DEFAULT_TRUSTMANAGERFACTORY_ALGORITHM;
        this._maxCertPathLength = -1;
        this._enableCRLDP = false;
        this._enableOCSP = false;
        this._sessionCachingEnabled = true;
        this._keyStorePath = str;
    }
}
