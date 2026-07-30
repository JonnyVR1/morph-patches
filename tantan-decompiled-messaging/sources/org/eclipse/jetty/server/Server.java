package org.eclipse.jetty.server;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.http.HttpGenerator;
import org.eclipse.jetty.http.HttpURI;
import org.eclipse.jetty.server.handler.HandlerWrapper;
import org.eclipse.jetty.server.nio.SelectChannelConnector;
import org.eclipse.jetty.util.Attributes;
import org.eclipse.jetty.util.AttributesMap;
import org.eclipse.jetty.util.LazyList;
import org.eclipse.jetty.util.MultiException;
import org.eclipse.jetty.util.TypeUtil;
import org.eclipse.jetty.util.URIUtil;
import org.eclipse.jetty.util.component.AggregateLifeCycle;
import org.eclipse.jetty.util.component.Container;
import org.eclipse.jetty.util.component.LifeCycle;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import org.eclipse.jetty.util.thread.QueuedThreadPool;
import org.eclipse.jetty.util.thread.ShutdownThread;
import org.eclipse.jetty.util.thread.ThreadPool;

/* JADX INFO: loaded from: classes3.dex */
public class Server extends HandlerWrapper implements Attributes {
    private static final Logger LOG = Log.getLogger((Class<?>) Server.class);
    private static final String __version;
    private Connector[] _connectors;
    private SessionIdManager _sessionIdManager;
    private boolean _stopAtShutdown;
    private ThreadPool _threadPool;
    private final Container _container = new Container();
    private final AttributesMap _attributes = new AttributesMap();
    private boolean _sendServerVersion = true;
    private boolean _sendDateHeader = false;
    private int _graceful = 0;
    private boolean _dumpAfterStart = false;
    private boolean _dumpBeforeStop = false;
    private boolean _uncheckedPrintWriter = false;

    public interface Graceful extends Handler {
        void setShutdown(boolean z);
    }

    static {
        if (Server.class.getPackage() == null || !"Eclipse.org - Jetty".equals(Server.class.getPackage().getImplementationVendor()) || Server.class.getPackage().getImplementationVersion() == null) {
            __version = System.getProperty("jetty.version", "8.y.z-SNAPSHOT");
        } else {
            __version = Server.class.getPackage().getImplementationVersion();
        }
    }

    public Server(InetSocketAddress inetSocketAddress) {
        setServer(this);
        SelectChannelConnector selectChannelConnector = new SelectChannelConnector();
        selectChannelConnector.setHost(inetSocketAddress.getHostName());
        selectChannelConnector.setPort(inetSocketAddress.getPort());
        setConnectors(new Connector[]{selectChannelConnector});
    }

    public static String getVersion() {
        return __version;
    }

    public static void main(String... strArr) throws Exception {
        System.err.println(getVersion());
    }

    @Override // org.eclipse.jetty.util.component.AggregateLifeCycle
    public boolean addBean(Object obj) {
        if (!super.addBean(obj)) {
            return false;
        }
        this._container.addBean(obj);
        return true;
    }

    public void addConnector(Connector connector) {
        setConnectors((Connector[]) LazyList.addToArray(getConnectors(), connector, Connector.class));
    }

    @Deprecated
    public void addLifeCycle(LifeCycle lifeCycle) {
        addBean(lifeCycle);
    }

    @Override // org.eclipse.jetty.util.Attributes
    public void clearAttributes() {
        this._attributes.clearAttributes();
    }

    @Override // org.eclipse.jetty.server.handler.HandlerWrapper, org.eclipse.jetty.server.handler.AbstractHandler, org.eclipse.jetty.util.component.AggregateLifeCycle, org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStart() throws Exception {
        int i = 0;
        if (getStopAtShutdown()) {
            ShutdownThread.register(this);
        }
        Logger logger = LOG;
        StringBuilder sb = new StringBuilder("jetty-");
        String str = __version;
        sb.append(str);
        logger.info(sb.toString(), new Object[0]);
        HttpGenerator.setServerVersion(str);
        MultiException multiException = new MultiException();
        if (this._threadPool == null) {
            setThreadPool(new QueuedThreadPool());
        }
        try {
            super.doStart();
        } catch (Throwable th) {
            multiException.add(th);
        }
        if (this._connectors != null && multiException.size() == 0) {
            while (true) {
                Connector[] connectorArr = this._connectors;
                if (i >= connectorArr.length) {
                    break;
                }
                try {
                    connectorArr[i].start();
                } catch (Throwable th2) {
                    multiException.add(th2);
                }
                i++;
            }
        }
        if (isDumpAfterStart()) {
            dumpStdErr();
        }
        multiException.ifExceptionThrow();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    @Override // org.eclipse.jetty.server.handler.HandlerWrapper, org.eclipse.jetty.server.handler.AbstractHandler, org.eclipse.jetty.util.component.AggregateLifeCycle, org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStop() throws Exception {
        if (isDumpBeforeStop()) {
            dumpStdErr();
        }
        MultiException multiException = new MultiException();
        if (this._graceful > 0) {
            Connector[] connectorArr = this._connectors;
            if (connectorArr != null) {
                int length = connectorArr.length;
                while (true) {
                    int i = length - 1;
                    if (length <= 0) {
                        break;
                    }
                    LOG.info("Graceful shutdown {}", this._connectors[i]);
                    try {
                        this._connectors[i].close();
                    } catch (Throwable th) {
                        multiException.add(th);
                    }
                    length = i;
                }
            }
            for (Handler handler : getChildHandlersByClass(Graceful.class)) {
                Graceful graceful = (Graceful) handler;
                LOG.info("Graceful shutdown {}", graceful);
                graceful.setShutdown(true);
            }
            Thread.sleep(this._graceful);
        }
        Connector[] connectorArr2 = this._connectors;
        try {
            if (connectorArr2 != null) {
                int length2 = connectorArr2.length;
                while (true) {
                    int i2 = length2 - 1;
                    if (length2 <= 0) {
                        break;
                    }
                    try {
                        this._connectors[i2].stop();
                    } catch (Throwable th2) {
                        multiException.add(th2);
                    }
                    length2 = i2;
                }
                super.doStop();
                multiException.ifExceptionThrow();
                if (getStopAtShutdown()) {
                    ShutdownThread.deregister(this);
                }
            }
            super.doStop();
        } catch (Throwable th3) {
            multiException.add(th3);
        }
        multiException.ifExceptionThrow();
        if (getStopAtShutdown()) {
            ShutdownThread.deregister(this);
        }
    }

    @Override // org.eclipse.jetty.server.handler.AbstractHandlerContainer, org.eclipse.jetty.util.component.AggregateLifeCycle, org.eclipse.jetty.util.component.Dumpable
    public void dump(Appendable appendable, String str) throws IOException {
        dumpThis(appendable);
        AggregateLifeCycle.dump(appendable, str, TypeUtil.asList(getHandlers()), getBeans(), TypeUtil.asList(this._connectors));
    }

    @Override // org.eclipse.jetty.util.Attributes
    public Object getAttribute(String str) {
        return this._attributes.getAttribute(str);
    }

    @Override // org.eclipse.jetty.util.Attributes
    public Enumeration getAttributeNames() {
        return AttributesMap.getAttributeNamesCopy(this._attributes);
    }

    public Connector[] getConnectors() {
        return this._connectors;
    }

    public Container getContainer() {
        return this._container;
    }

    public int getGracefulShutdown() {
        return this._graceful;
    }

    @Deprecated
    public int getMaxCookieVersion() {
        return 1;
    }

    public boolean getSendDateHeader() {
        return this._sendDateHeader;
    }

    public boolean getSendServerVersion() {
        return this._sendServerVersion;
    }

    public SessionIdManager getSessionIdManager() {
        return this._sessionIdManager;
    }

    public boolean getStopAtShutdown() {
        return this._stopAtShutdown;
    }

    public ThreadPool getThreadPool() {
        return this._threadPool;
    }

    public void handle(AbstractHttpConnection abstractHttpConnection) throws ServletException, IOException {
        String pathInfo = abstractHttpConnection.getRequest().getPathInfo();
        Request request = abstractHttpConnection.getRequest();
        Response response = abstractHttpConnection.getResponse();
        Logger logger = LOG;
        if (!logger.isDebugEnabled()) {
            handle(pathInfo, request, request, response);
            return;
        }
        logger.debug("REQUEST " + pathInfo + " on " + abstractHttpConnection, new Object[0]);
        handle(pathInfo, request, request, response);
        logger.debug("RESPONSE " + pathInfo + "  " + abstractHttpConnection.getResponse().getStatus() + " handled=" + request.isHandled(), new Object[0]);
    }

    public void handleAsync(AbstractHttpConnection abstractHttpConnection) throws ServletException, IOException {
        AsyncContinuation asyncContinuation = abstractHttpConnection.getRequest().getAsyncContinuation();
        AsyncContinuation.AsyncEventState asyncEventState = asyncContinuation.getAsyncEventState();
        Request request = abstractHttpConnection.getRequest();
        String path = asyncEventState.getPath();
        if (path != null) {
            HttpURI httpURI = new HttpURI(URIUtil.addPaths(asyncEventState.getServletContext().getContextPath(), path));
            request.setUri(httpURI);
            request.setRequestURI(null);
            request.setPathInfo(request.getRequestURI());
            if (httpURI.getQuery() != null) {
                request.mergeQueryString(httpURI.getQuery());
            }
        }
        String pathInfo = request.getPathInfo();
        HttpServletRequest httpServletRequest = (HttpServletRequest) asyncContinuation.getRequest();
        HttpServletResponse httpServletResponse = (HttpServletResponse) asyncContinuation.getResponse();
        Logger logger = LOG;
        if (!logger.isDebugEnabled()) {
            handle(pathInfo, request, httpServletRequest, httpServletResponse);
            return;
        }
        logger.debug("REQUEST " + pathInfo + " on " + abstractHttpConnection, new Object[0]);
        handle(pathInfo, request, httpServletRequest, httpServletResponse);
        logger.debug("RESPONSE " + pathInfo + "  " + abstractHttpConnection.getResponse().getStatus(), new Object[0]);
    }

    public boolean isDumpAfterStart() {
        return this._dumpAfterStart;
    }

    public boolean isDumpBeforeStop() {
        return this._dumpBeforeStop;
    }

    public boolean isUncheckedPrintWriter() {
        return this._uncheckedPrintWriter;
    }

    public void join() throws InterruptedException {
        getThreadPool().join();
    }

    @Override // org.eclipse.jetty.util.Attributes
    public void removeAttribute(String str) {
        this._attributes.removeAttribute(str);
    }

    @Override // org.eclipse.jetty.util.component.AggregateLifeCycle
    public boolean removeBean(Object obj) {
        if (!super.removeBean(obj)) {
            return false;
        }
        this._container.removeBean(obj);
        return true;
    }

    public void removeConnector(Connector connector) {
        setConnectors((Connector[]) LazyList.removeFromArray(getConnectors(), connector));
    }

    @Deprecated
    public void removeLifeCycle(LifeCycle lifeCycle) {
        removeBean(lifeCycle);
    }

    @Override // org.eclipse.jetty.util.Attributes
    public void setAttribute(String str, Object obj) {
        this._attributes.setAttribute(str, obj);
    }

    public void setConnectors(Connector[] connectorArr) {
        if (connectorArr != null) {
            for (Connector connector : connectorArr) {
                connector.setServer(this);
            }
        }
        this._container.update((Object) this, (Object[]) this._connectors, (Object[]) connectorArr, com.p046p1.mobile.putong.data.Connector.TYPE);
        this._connectors = connectorArr;
    }

    public void setDumpAfterStart(boolean z) {
        this._dumpAfterStart = z;
    }

    public void setDumpBeforeStop(boolean z) {
        this._dumpBeforeStop = z;
    }

    public void setGracefulShutdown(int i) {
        this._graceful = i;
    }

    @Deprecated
    public void setMaxCookieVersion(int i) {
    }

    public void setSendDateHeader(boolean z) {
        this._sendDateHeader = z;
    }

    public void setSendServerVersion(boolean z) {
        this._sendServerVersion = z;
    }

    public void setSessionIdManager(SessionIdManager sessionIdManager) {
        SessionIdManager sessionIdManager2 = this._sessionIdManager;
        if (sessionIdManager2 != null) {
            removeBean(sessionIdManager2);
        }
        this._container.update((Object) this, (Object) this._sessionIdManager, (Object) sessionIdManager, "sessionIdManager", false);
        this._sessionIdManager = sessionIdManager;
        if (sessionIdManager != null) {
            addBean(sessionIdManager);
        }
    }

    public void setStopAtShutdown(boolean z) {
        if (!z) {
            ShutdownThread.deregister(this);
        } else if (!this._stopAtShutdown && isStarted()) {
            ShutdownThread.register(this);
        }
        this._stopAtShutdown = z;
    }

    public void setThreadPool(ThreadPool threadPool) {
        ThreadPool threadPool2 = this._threadPool;
        if (threadPool2 != null) {
            removeBean(threadPool2);
        }
        this._container.update((Object) this, (Object) this._threadPool, (Object) threadPool, "threadpool", false);
        this._threadPool = threadPool;
        if (threadPool != null) {
            addBean(threadPool);
        }
    }

    public void setUncheckedPrintWriter(boolean z) {
        this._uncheckedPrintWriter = z;
    }

    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    public Server(int i) {
        setServer(this);
        SelectChannelConnector selectChannelConnector = new SelectChannelConnector();
        selectChannelConnector.setPort(i);
        setConnectors(new Connector[]{selectChannelConnector});
    }

    public Server() {
        setServer(this);
    }
}
