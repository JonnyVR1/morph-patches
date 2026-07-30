package org.fourthline.cling.transport.impl;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.logging.Logger;
import org.fourthline.cling.model.message.Connection;
import org.fourthline.cling.transport.Router;
import org.fourthline.cling.transport.spi.InitializationException;
import org.fourthline.cling.transport.spi.StreamServer;

/* JADX INFO: loaded from: classes3.dex */
public class StreamServerImpl implements StreamServer<StreamServerConfigurationImpl> {
    private static Logger log = Logger.getLogger(StreamServer.class.getName());
    protected final StreamServerConfigurationImpl configuration;
    protected HttpServer server;

    public class HttpServerConnection implements Connection {
        protected HttpExchange exchange;

        public HttpServerConnection(HttpExchange httpExchange) {
            this.exchange = httpExchange;
        }

        @Override // org.fourthline.cling.model.message.Connection
        public InetAddress getLocalAddress() {
            if (this.exchange.getLocalAddress() != null) {
                return this.exchange.getLocalAddress().getAddress();
            }
            return null;
        }

        @Override // org.fourthline.cling.model.message.Connection
        public InetAddress getRemoteAddress() {
            if (this.exchange.getRemoteAddress() != null) {
                return this.exchange.getRemoteAddress().getAddress();
            }
            return null;
        }

        @Override // org.fourthline.cling.model.message.Connection
        public boolean isOpen() {
            return StreamServerImpl.this.isConnectionOpen(this.exchange);
        }
    }

    public class RequestHttpHandler implements HttpHandler {
        private final Router router;

        public RequestHttpHandler(Router router) {
            this.router = router;
        }

        public void handle(final HttpExchange httpExchange) throws IOException {
            StreamServerImpl.log.fine("Received HTTP exchange: " + httpExchange.getRequestMethod() + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + httpExchange.getRequestURI());
            this.router.received(new HttpExchangeUpnpStream(this.router.getProtocolFactory(), httpExchange) { // from class: org.fourthline.cling.transport.impl.StreamServerImpl.RequestHttpHandler.1
                @Override // org.fourthline.cling.transport.impl.HttpExchangeUpnpStream
                public Connection createConnection() {
                    return StreamServerImpl.this.new HttpServerConnection(httpExchange);
                }
            });
        }
    }

    public StreamServerImpl(StreamServerConfigurationImpl streamServerConfigurationImpl) {
        this.configuration = streamServerConfigurationImpl;
    }

    @Override // org.fourthline.cling.transport.spi.StreamServer
    public synchronized int getPort() {
        return this.server.getAddress().getPort();
    }

    @Override // org.fourthline.cling.transport.spi.StreamServer
    public synchronized void init(InetAddress inetAddress, Router router) throws InitializationException {
        try {
            HttpServer httpServerCreate = HttpServer.create(new InetSocketAddress(inetAddress, this.configuration.getListenPort()), this.configuration.getTcpConnectionBacklog());
            this.server = httpServerCreate;
            httpServerCreate.createContext("/", new RequestHttpHandler(router));
            log.info("Created server (for receiving TCP streams) on: " + this.server.getAddress());
        } catch (Exception e) {
            throw new InitializationException("Could not initialize " + getClass().getSimpleName() + ": " + e.toString(), e);
        }
    }

    public boolean isConnectionOpen(HttpExchange httpExchange) {
        log.warning("Can't check client connection, socket access impossible on JDK webserver!");
        return true;
    }

    @Override // java.lang.Runnable
    public synchronized void run() {
        log.fine("Starting StreamServer...");
        this.server.start();
    }

    @Override // org.fourthline.cling.transport.spi.StreamServer
    public synchronized void stop() {
        log.fine("Stopping StreamServer...");
        HttpServer httpServer = this.server;
        if (httpServer != null) {
            httpServer.stop(1);
        }
    }

    @Override // org.fourthline.cling.transport.spi.StreamServer
    public StreamServerConfigurationImpl getConfiguration() {
        return this.configuration;
    }
}
