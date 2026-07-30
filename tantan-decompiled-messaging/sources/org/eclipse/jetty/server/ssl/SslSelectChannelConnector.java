package org.eclipse.jetty.server.ssl;

import java.io.IOException;
import java.nio.channels.SocketChannel;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLSession;
import org.eclipse.jetty.p123io.AsyncEndPoint;
import org.eclipse.jetty.p123io.Buffers;
import org.eclipse.jetty.p123io.BuffersFactory;
import org.eclipse.jetty.p123io.EndPoint;
import org.eclipse.jetty.p123io.RuntimeIOException;
import org.eclipse.jetty.p123io.nio.AsyncConnection;
import org.eclipse.jetty.p123io.nio.SslConnection;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.nio.SelectChannelConnector;
import org.eclipse.jetty.util.ssl.SslContextFactory;

/* JADX INFO: loaded from: classes3.dex */
public class SslSelectChannelConnector extends SelectChannelConnector implements SslConnector {
    private Buffers _sslBuffers;
    private final SslContextFactory _sslContextFactory;

    public SslSelectChannelConnector(SslContextFactory sslContextFactory) {
        this._sslContextFactory = sslContextFactory;
        addBean(sslContextFactory);
        setUseDirectBuffers(false);
        setSoLingerTime(30000);
    }

    public SSLEngine createSSLEngine(SocketChannel socketChannel) throws IOException {
        SSLEngine sSLEngineNewSslEngine;
        if (socketChannel != null) {
            sSLEngineNewSslEngine = this._sslContextFactory.newSslEngine(socketChannel.socket().getInetAddress().getHostAddress(), socketChannel.socket().getPort());
        } else {
            sSLEngineNewSslEngine = this._sslContextFactory.newSslEngine();
        }
        sSLEngineNewSslEngine.setUseClientMode(false);
        return sSLEngineNewSslEngine;
    }

    @Override // org.eclipse.jetty.server.nio.SelectChannelConnector, org.eclipse.jetty.server.AbstractConnector, org.eclipse.jetty.server.Connector
    public void customize(EndPoint endPoint, Request request) throws IOException {
        request.setScheme("https");
        super.customize(endPoint, request);
        SslCertificates.customize(((SslConnection.SslEndPoint) endPoint).getSslEngine().getSession(), endPoint, request);
    }

    @Override // org.eclipse.jetty.server.nio.SelectChannelConnector, org.eclipse.jetty.server.AbstractConnector, org.eclipse.jetty.util.component.AggregateLifeCycle, org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStart() throws Exception {
        this._sslContextFactory.checkKeyStore();
        this._sslContextFactory.start();
        SSLEngine sSLEngineNewSslEngine = this._sslContextFactory.newSslEngine();
        sSLEngineNewSslEngine.setUseClientMode(false);
        SSLSession session = sSLEngineNewSslEngine.getSession();
        this._sslBuffers = BuffersFactory.newBuffers(getUseDirectBuffers() ? Buffers.Type.DIRECT : Buffers.Type.INDIRECT, session.getApplicationBufferSize(), getUseDirectBuffers() ? Buffers.Type.DIRECT : Buffers.Type.INDIRECT, session.getApplicationBufferSize(), getUseDirectBuffers() ? Buffers.Type.DIRECT : Buffers.Type.INDIRECT, getMaxBuffers());
        if (getRequestHeaderSize() < session.getApplicationBufferSize()) {
            setRequestHeaderSize(session.getApplicationBufferSize());
        }
        if (getRequestBufferSize() < session.getApplicationBufferSize()) {
            setRequestBufferSize(session.getApplicationBufferSize());
        }
        super.doStart();
    }

    @Override // org.eclipse.jetty.server.AbstractConnector, org.eclipse.jetty.util.component.AggregateLifeCycle, org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStop() throws Exception {
        this._sslBuffers = null;
        super.doStop();
    }

    @Deprecated
    public String getAlgorithm() {
        throw new UnsupportedOperationException();
    }

    @Override // org.eclipse.jetty.server.ssl.SslConnector
    @Deprecated
    public String[] getExcludeCipherSuites() {
        return this._sslContextFactory.getExcludeCipherSuites();
    }

    @Override // org.eclipse.jetty.server.ssl.SslConnector
    @Deprecated
    public String[] getIncludeCipherSuites() {
        return this._sslContextFactory.getIncludeCipherSuites();
    }

    @Override // org.eclipse.jetty.server.ssl.SslConnector
    @Deprecated
    public String getKeystore() {
        return this._sslContextFactory.getKeyStorePath();
    }

    @Override // org.eclipse.jetty.server.ssl.SslConnector
    @Deprecated
    public String getKeystoreType() {
        return this._sslContextFactory.getKeyStoreType();
    }

    @Override // org.eclipse.jetty.server.ssl.SslConnector
    @Deprecated
    public boolean getNeedClientAuth() {
        return this._sslContextFactory.getNeedClientAuth();
    }

    @Override // org.eclipse.jetty.server.ssl.SslConnector
    @Deprecated
    public String getProtocol() {
        return this._sslContextFactory.getProtocol();
    }

    @Override // org.eclipse.jetty.server.ssl.SslConnector
    @Deprecated
    public String getProvider() {
        return this._sslContextFactory.getProvider();
    }

    @Override // org.eclipse.jetty.server.ssl.SslConnector
    @Deprecated
    public String getSecureRandomAlgorithm() {
        return this._sslContextFactory.getSecureRandomAlgorithm();
    }

    public Buffers getSslBuffers() {
        return this._sslBuffers;
    }

    @Override // org.eclipse.jetty.server.ssl.SslConnector
    @Deprecated
    public SSLContext getSslContext() {
        return this._sslContextFactory.getSslContext();
    }

    @Override // org.eclipse.jetty.server.ssl.SslConnector
    public SslContextFactory getSslContextFactory() {
        return this._sslContextFactory;
    }

    @Override // org.eclipse.jetty.server.ssl.SslConnector
    @Deprecated
    public String getSslKeyManagerFactoryAlgorithm() {
        return this._sslContextFactory.getSslKeyManagerFactoryAlgorithm();
    }

    @Override // org.eclipse.jetty.server.ssl.SslConnector
    @Deprecated
    public String getSslTrustManagerFactoryAlgorithm() {
        return this._sslContextFactory.getTrustManagerFactoryAlgorithm();
    }

    @Override // org.eclipse.jetty.server.ssl.SslConnector
    @Deprecated
    public String getTruststore() {
        return this._sslContextFactory.getTrustStore();
    }

    @Override // org.eclipse.jetty.server.ssl.SslConnector
    @Deprecated
    public String getTruststoreType() {
        return this._sslContextFactory.getTrustStoreType();
    }

    @Override // org.eclipse.jetty.server.ssl.SslConnector
    @Deprecated
    public boolean getWantClientAuth() {
        return this._sslContextFactory.getWantClientAuth();
    }

    @Override // org.eclipse.jetty.server.ssl.SslConnector
    @Deprecated
    public boolean isAllowRenegotiate() {
        return this._sslContextFactory.isAllowRenegotiate();
    }

    @Override // org.eclipse.jetty.server.AbstractConnector, org.eclipse.jetty.server.Connector
    public boolean isConfidential(Request request) {
        int confidentialPort = getConfidentialPort();
        return confidentialPort == 0 || confidentialPort == request.getServerPort();
    }

    @Override // org.eclipse.jetty.server.AbstractConnector, org.eclipse.jetty.server.Connector
    public boolean isIntegral(Request request) {
        int integralPort = getIntegralPort();
        return integralPort == 0 || integralPort == request.getServerPort();
    }

    @Override // org.eclipse.jetty.server.nio.SelectChannelConnector
    public AsyncConnection newConnection(SocketChannel socketChannel, AsyncEndPoint asyncEndPoint) {
        try {
            SslConnection sslConnectionNewSslConnection = newSslConnection(asyncEndPoint, createSSLEngine(socketChannel));
            sslConnectionNewSslConnection.getSslEndPoint().setConnection(newPlainConnection(socketChannel, sslConnectionNewSslConnection.getSslEndPoint()));
            sslConnectionNewSslConnection.setAllowRenegotiate(this._sslContextFactory.isAllowRenegotiate());
            return sslConnectionNewSslConnection;
        } catch (IOException e) {
            throw new RuntimeIOException(e);
        }
    }

    public AsyncConnection newPlainConnection(SocketChannel socketChannel, AsyncEndPoint asyncEndPoint) {
        return super.newConnection(socketChannel, asyncEndPoint);
    }

    public SslConnection newSslConnection(AsyncEndPoint asyncEndPoint, SSLEngine sSLEngine) {
        return new SslConnection(sSLEngine, asyncEndPoint);
    }

    @Deprecated
    public void setAlgorithm(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // org.eclipse.jetty.server.ssl.SslConnector
    @Deprecated
    public void setAllowRenegotiate(boolean z) {
        this._sslContextFactory.setAllowRenegotiate(z);
    }

    @Override // org.eclipse.jetty.server.ssl.SslConnector
    @Deprecated
    public void setExcludeCipherSuites(String[] strArr) {
        this._sslContextFactory.setExcludeCipherSuites(strArr);
    }

    @Override // org.eclipse.jetty.server.ssl.SslConnector
    @Deprecated
    public void setIncludeCipherSuites(String[] strArr) {
        this._sslContextFactory.setIncludeCipherSuites(strArr);
    }

    @Override // org.eclipse.jetty.server.ssl.SslConnector
    @Deprecated
    public void setKeyPassword(String str) {
        this._sslContextFactory.setKeyManagerPassword(str);
    }

    @Override // org.eclipse.jetty.server.ssl.SslConnector
    @Deprecated
    public void setKeystore(String str) {
        this._sslContextFactory.setKeyStorePath(str);
    }

    @Override // org.eclipse.jetty.server.ssl.SslConnector
    @Deprecated
    public void setKeystoreType(String str) {
        this._sslContextFactory.setKeyStoreType(str);
    }

    @Override // org.eclipse.jetty.server.ssl.SslConnector
    @Deprecated
    public void setNeedClientAuth(boolean z) {
        this._sslContextFactory.setNeedClientAuth(z);
    }

    @Override // org.eclipse.jetty.server.ssl.SslConnector
    @Deprecated
    public void setPassword(String str) {
        this._sslContextFactory.setKeyStorePassword(str);
    }

    @Override // org.eclipse.jetty.server.ssl.SslConnector
    @Deprecated
    public void setProtocol(String str) {
        this._sslContextFactory.setProtocol(str);
    }

    @Override // org.eclipse.jetty.server.ssl.SslConnector
    @Deprecated
    public void setProvider(String str) {
        this._sslContextFactory.setProvider(str);
    }

    @Override // org.eclipse.jetty.server.ssl.SslConnector
    @Deprecated
    public void setSecureRandomAlgorithm(String str) {
        this._sslContextFactory.setSecureRandomAlgorithm(str);
    }

    @Override // org.eclipse.jetty.server.ssl.SslConnector
    @Deprecated
    public void setSslContext(SSLContext sSLContext) {
        this._sslContextFactory.setSslContext(sSLContext);
    }

    @Override // org.eclipse.jetty.server.ssl.SslConnector
    @Deprecated
    public void setSslKeyManagerFactoryAlgorithm(String str) {
        this._sslContextFactory.setSslKeyManagerFactoryAlgorithm(str);
    }

    @Override // org.eclipse.jetty.server.ssl.SslConnector
    @Deprecated
    public void setSslTrustManagerFactoryAlgorithm(String str) {
        this._sslContextFactory.setTrustManagerFactoryAlgorithm(str);
    }

    @Override // org.eclipse.jetty.server.ssl.SslConnector
    @Deprecated
    public void setTrustPassword(String str) {
        this._sslContextFactory.setTrustStorePassword(str);
    }

    @Override // org.eclipse.jetty.server.ssl.SslConnector
    @Deprecated
    public void setTruststore(String str) {
        this._sslContextFactory.setTrustStore(str);
    }

    @Override // org.eclipse.jetty.server.ssl.SslConnector
    @Deprecated
    public void setTruststoreType(String str) {
        this._sslContextFactory.setTrustStoreType(str);
    }

    @Override // org.eclipse.jetty.server.ssl.SslConnector
    @Deprecated
    public void setWantClientAuth(boolean z) {
        this._sslContextFactory.setWantClientAuth(z);
    }

    public SslSelectChannelConnector() {
        this(new SslContextFactory(SslContextFactory.DEFAULT_KEYSTORE_PATH));
        setSoLingerTime(30000);
    }
}
