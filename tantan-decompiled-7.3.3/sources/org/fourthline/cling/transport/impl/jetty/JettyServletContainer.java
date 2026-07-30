package org.fourthline.cling.transport.impl.jetty;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.bio.SocketConnector;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.util.thread.ExecutorThreadPool;
import org.fourthline.cling.transport.spi.ServletContainerAdapter;
import p153l.yre0;

/* JADX INFO: loaded from: classes3.dex */
public class JettyServletContainer implements ServletContainerAdapter {
    protected Server server;
    private static final Logger log = Logger.getLogger(JettyServletContainer.class.getName());
    public static final JettyServletContainer INSTANCE = new JettyServletContainer();

    private JettyServletContainer() {
        resetServer();
    }

    public static boolean isConnectionOpen(HttpServletRequest httpServletRequest, byte[] bArr) {
        Socket socket = (Socket) ((Request) httpServletRequest).getConnection().getEndPoint().getTransport();
        Logger logger = log;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine("Checking if client connection is still open: " + socket.getRemoteSocketAddress());
        }
        try {
            socket.getOutputStream().write(bArr);
            socket.getOutputStream().flush();
            return true;
        } catch (IOException unused) {
            Logger logger2 = log;
            if (!logger2.isLoggable(Level.FINE)) {
                return false;
            }
            logger2.fine("Client connection has been closed: " + socket.getRemoteSocketAddress());
            return false;
        }
    }

    @Override // org.fourthline.cling.transport.spi.ServletContainerAdapter
    public synchronized int addConnector(String str, int i) throws IOException {
        SocketConnector socketConnector;
        socketConnector = new SocketConnector();
        socketConnector.setHost(str);
        socketConnector.setPort(i);
        socketConnector.open();
        this.server.addConnector(socketConnector);
        if (this.server.isStarted()) {
            try {
                socketConnector.start();
            } catch (Exception e) {
                log.severe("Couldn't start connector: " + socketConnector + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + e);
                throw new RuntimeException(e);
            }
        }
        return socketConnector.getLocalPort();
    }

    @Override // org.fourthline.cling.transport.spi.ServletContainerAdapter
    public synchronized void registerServlet(String str, yre0 yre0Var) {
        try {
            if (this.server.getHandler() != null) {
                return;
            }
            log.info("Registering UPnP servlet under context path: " + str);
            ServletContextHandler servletContextHandler = new ServletContextHandler(0);
            if (str != null && str.length() > 0) {
                servletContextHandler.setContextPath(str);
            }
            servletContextHandler.addServlet(new ServletHolder(yre0Var), "/*");
            this.server.setHandler(servletContextHandler);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // org.fourthline.cling.transport.spi.ServletContainerAdapter
    public synchronized void removeConnector(String str, int i) {
        try {
            Connector[] connectors = this.server.getConnectors();
            for (Connector connector : connectors) {
                if (connector.getHost().equals(str) && connector.getLocalPort() == i) {
                    if (connector.isStarted() || connector.isStarting()) {
                        try {
                            connector.stop();
                        } catch (Exception e) {
                            log.severe("Couldn't stop connector: " + connector + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + e);
                            throw new RuntimeException(e);
                        }
                    }
                    this.server.removeConnector(connector);
                    if (connectors.length != 1) {
                        break;
                    }
                    log.info("No more connectors, stopping Jetty server");
                    stopIfRunning();
                    break;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void resetServer() {
        Server server = new Server();
        this.server = server;
        server.setGracefulShutdown(1000);
    }

    @Override // org.fourthline.cling.transport.spi.ServletContainerAdapter
    public synchronized void setExecutorService(ExecutorService executorService) {
        JettyServletContainer jettyServletContainer = INSTANCE;
        if (jettyServletContainer.server.getThreadPool() == null) {
            jettyServletContainer.server.setThreadPool(new ExecutorThreadPool(executorService) { // from class: org.fourthline.cling.transport.impl.jetty.JettyServletContainer.1
                @Override // org.eclipse.jetty.util.thread.ExecutorThreadPool, org.eclipse.jetty.util.component.AbstractLifeCycle
                public void doStop() throws Exception {
                }
            });
        }
    }

    @Override // org.fourthline.cling.transport.spi.ServletContainerAdapter
    public synchronized void startIfNotRunning() {
        if (!this.server.isStarted() && !this.server.isStarting()) {
            log.info("Starting Jetty server... ");
            try {
                this.server.start();
            } catch (Exception e) {
                log.severe("Couldn't start Jetty server: " + e);
                throw new RuntimeException(e);
            }
        }
    }

    @Override // org.fourthline.cling.transport.spi.ServletContainerAdapter
    public synchronized void stopIfRunning() {
        if (!this.server.isStopped() && !this.server.isStopping()) {
            log.info("Stopping Jetty server...");
            try {
                try {
                    this.server.stop();
                    resetServer();
                } catch (Exception e) {
                    log.severe("Couldn't stop Jetty server: " + e);
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                resetServer();
                throw th;
            }
        }
    }

    public static boolean isConnectionOpen(HttpServletRequest httpServletRequest) {
        return isConnectionOpen(httpServletRequest, MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR.getBytes());
    }
}
