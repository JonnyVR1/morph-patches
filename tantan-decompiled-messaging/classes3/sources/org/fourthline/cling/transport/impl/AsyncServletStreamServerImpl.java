package org.fourthline.cling.transport.impl;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import l.aag0;
import l.h21;
import l.i21;
import l.k21;
import l.tje0;
import org.fourthline.cling.model.message.Connection;
import org.fourthline.cling.transport.Router;
import org.fourthline.cling.transport.spi.InitializationException;
import org.fourthline.cling.transport.spi.StreamServer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class AsyncServletStreamServerImpl implements StreamServer<AsyncServletStreamServerConfigurationImpl> {
    private static final Logger log = Logger.getLogger(StreamServer.class.getName());
    protected final AsyncServletStreamServerConfigurationImpl configuration;
    protected String hostAddress;
    protected int localPort;
    private int mCounter = 0;

    public class AsyncServletConnection implements Connection {
        protected HttpServletRequest request;

        public AsyncServletConnection(HttpServletRequest httpServletRequest) {
            this.request = httpServletRequest;
        }

        @Override // org.fourthline.cling.model.message.Connection
        public InetAddress getLocalAddress() {
            try {
                return InetAddress.getByName(getRequest().getLocalAddr());
            } catch (UnknownHostException e) {
                aag0.a(e);
                return null;
            }
        }

        @Override // org.fourthline.cling.model.message.Connection
        public InetAddress getRemoteAddress() {
            try {
                return InetAddress.getByName(getRequest().getRemoteAddr());
            } catch (UnknownHostException e) {
                aag0.a(e);
                return null;
            }
        }

        public HttpServletRequest getRequest() {
            return this.request;
        }

        @Override // org.fourthline.cling.model.message.Connection
        public boolean isOpen() {
            return AsyncServletStreamServerImpl.this.isConnectionOpen(getRequest());
        }
    }

    public AsyncServletStreamServerImpl(AsyncServletStreamServerConfigurationImpl asyncServletStreamServerConfigurationImpl) {
        this.configuration = asyncServletStreamServerConfigurationImpl;
    }

    public static /* synthetic */ int access$008(AsyncServletStreamServerImpl asyncServletStreamServerImpl) {
        int i = asyncServletStreamServerImpl.mCounter;
        asyncServletStreamServerImpl.mCounter = i + 1;
        return i;
    }

    public tje0 createServlet(final Router router) {
        return new HttpServlet() { // from class: org.fourthline.cling.transport.impl.AsyncServletStreamServerImpl.1
            public void service(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
                final long jCurrentTimeMillis = System.currentTimeMillis();
                final int iAccess$008 = AsyncServletStreamServerImpl.access$008(AsyncServletStreamServerImpl.this);
                if (AsyncServletStreamServerImpl.log.isLoggable(Level.FINE)) {
                    AsyncServletStreamServerImpl.log.fine(String.format("HttpServlet.service(): id: %3d, request URI: %s", Integer.valueOf(iAccess$008), httpServletRequest.getRequestURI()));
                }
                h21 h21VarStartAsync = httpServletRequest.startAsync();
                h21VarStartAsync.setTimeout(AsyncServletStreamServerImpl.this.getConfiguration().getAsyncTimeoutSeconds() * 1000);
                h21VarStartAsync.addListener(new k21() { // from class: org.fourthline.cling.transport.impl.AsyncServletStreamServerImpl.1.1
                    public void onComplete(i21 i21Var) throws IOException {
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        if (AsyncServletStreamServerImpl.log.isLoggable(Level.FINE)) {
                            AsyncServletStreamServerImpl.log.fine(String.format("AsyncListener.onComplete(): id: %3d, duration: %,4d, response: %s", Integer.valueOf(iAccess$008), Long.valueOf(jCurrentTimeMillis2), i21Var.getSuppliedResponse()));
                        }
                    }

                    public void onError(i21 i21Var) throws IOException {
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        if (AsyncServletStreamServerImpl.log.isLoggable(Level.FINE)) {
                            AsyncServletStreamServerImpl.log.fine(String.format("AsyncListener.onError(): id: %3d, duration: %,4d, response: %s", Integer.valueOf(iAccess$008), Long.valueOf(jCurrentTimeMillis2), i21Var.getSuppliedResponse()));
                        }
                    }

                    public void onStartAsync(i21 i21Var) throws IOException {
                        if (AsyncServletStreamServerImpl.log.isLoggable(Level.FINE)) {
                            AsyncServletStreamServerImpl.log.fine(String.format("AsyncListener.onStartAsync(): id: %3d, request: %s", Integer.valueOf(iAccess$008), i21Var.getSuppliedRequest()));
                        }
                    }

                    public void onTimeout(i21 i21Var) throws IOException {
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        if (AsyncServletStreamServerImpl.log.isLoggable(Level.FINE)) {
                            AsyncServletStreamServerImpl.log.fine(String.format("AsyncListener.onTimeout(): id: %3d, duration: %,4d, request: %s", Integer.valueOf(iAccess$008), Long.valueOf(jCurrentTimeMillis2), i21Var.getSuppliedRequest()));
                        }
                    }
                });
                router.received(new AsyncServletUpnpStream(router.getProtocolFactory(), h21VarStartAsync, httpServletRequest) { // from class: org.fourthline.cling.transport.impl.AsyncServletStreamServerImpl.1.2
                    @Override // org.fourthline.cling.transport.impl.AsyncServletUpnpStream
                    public Connection createConnection() {
                        return AsyncServletStreamServerImpl.this.new AsyncServletConnection(getRequest());
                    }
                });
            }
        };
    }

    @Override // org.fourthline.cling.transport.spi.StreamServer
    public synchronized int getPort() {
        return this.localPort;
    }

    @Override // org.fourthline.cling.transport.spi.StreamServer
    public synchronized void init(InetAddress inetAddress, Router router) throws InitializationException {
        try {
            try {
                Logger logger = log;
                Level level = Level.FINE;
                if (logger.isLoggable(level)) {
                    logger.fine("Setting executor service on servlet container adapter");
                }
                getConfiguration().getServletContainerAdapter().setExecutorService(router.getConfiguration().getStreamServerExecutorService());
                if (logger.isLoggable(level)) {
                    logger.fine("Adding connector: " + inetAddress + ":" + getConfiguration().getListenPort());
                }
                this.hostAddress = inetAddress.getHostAddress();
                this.localPort = getConfiguration().getServletContainerAdapter().addConnector(this.hostAddress, getConfiguration().getListenPort());
                getConfiguration().getServletContainerAdapter().registerServlet(router.getConfiguration().getNamespace().getBasePath().getPath(), createServlet(router));
            } catch (Exception e) {
                throw new InitializationException("Could not initialize " + getClass().getSimpleName() + ": " + e.toString(), e);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean isConnectionOpen(HttpServletRequest httpServletRequest) {
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        getConfiguration().getServletContainerAdapter().startIfNotRunning();
    }

    @Override // org.fourthline.cling.transport.spi.StreamServer
    public synchronized void stop() {
        getConfiguration().getServletContainerAdapter().removeConnector(this.hostAddress, this.localPort);
    }

    @Override // org.fourthline.cling.transport.spi.StreamServer
    public AsyncServletStreamServerConfigurationImpl getConfiguration() {
        return this.configuration;
    }
}
