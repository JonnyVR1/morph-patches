package org.eclipse.jetty.server;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import org.eclipse.jetty.continuation.Continuation;
import org.eclipse.jetty.continuation.ContinuationListener;
import org.eclipse.jetty.continuation.ContinuationThrowable;
import org.eclipse.jetty.p123io.AsyncEndPoint;
import org.eclipse.jetty.p123io.EndPoint;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.util.URIUtil;
import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;
import org.eclipse.jetty.util.thread.Timeout;
import p149l.bke0;
import p149l.gke0;
import p149l.h21;
import p149l.i21;
import p149l.k21;
import p149l.vje0;

/* JADX INFO: loaded from: classes3.dex */
public class AsyncContinuation implements h21, Continuation {
    private static final long DEFAULT_TIMEOUT = 30000;
    private static final int __ASYNCSTARTED = 2;
    private static final int __ASYNCWAIT = 4;
    private static final int __COMPLETED = 9;
    private static final int __COMPLETING = 7;
    private static final int __DISPATCHED = 1;
    private static final int __IDLE = 0;
    private static final int __REDISPATCH = 5;
    private static final int __REDISPATCHED = 6;
    private static final int __REDISPATCHING = 3;
    private static final int __UNCOMPLETED = 8;
    private List<k21> _asyncListeners;
    protected AbstractHttpConnection _connection;
    private volatile boolean _continuation;
    private List<ContinuationListener> _continuationListeners;
    private AsyncEventState _event;
    private volatile long _expireAt;
    private boolean _expired;
    private List<k21> _lastAsyncListeners;
    private volatile boolean _responseWrapped;
    private boolean _resumed;
    private static final Logger LOG = Log.getLogger((Class<?>) AsyncContinuation.class);
    private static final ContinuationThrowable __exception = new ContinuationThrowable();
    private long _timeoutMs = 30000;
    private int _state = 0;
    private boolean _initial = true;

    public class AsyncEventState extends i21 {
        private vje0 _dispatchContext;
        private String _pathInContext;
        private final vje0 _suspendedContext;
        private Timeout.Task _timeout;

        public AsyncEventState(vje0 vje0Var, bke0 bke0Var, gke0 gke0Var) {
            super(AsyncContinuation.this, bke0Var, gke0Var);
            this._timeout = AsyncContinuation.this.new AsyncTimeout();
            this._suspendedContext = vje0Var;
            Request request = AsyncContinuation.this._connection.getRequest();
            if (request.getAttribute("javax.servlet.async.request_uri") == null) {
                String str = (String) request.getAttribute("javax.servlet.forward.request_uri");
                if (str != null) {
                    request.setAttribute("javax.servlet.async.request_uri", str);
                    request.setAttribute("javax.servlet.async.context_path", request.getAttribute("javax.servlet.forward.context_path"));
                    request.setAttribute("javax.servlet.async.servlet_path", request.getAttribute("javax.servlet.forward.servlet_path"));
                    request.setAttribute("javax.servlet.async.path_info", request.getAttribute("javax.servlet.forward.path_info"));
                    request.setAttribute("javax.servlet.async.query_string", request.getAttribute("javax.servlet.forward.query_string"));
                    return;
                }
                request.setAttribute("javax.servlet.async.request_uri", request.getRequestURI());
                request.setAttribute("javax.servlet.async.context_path", request.getContextPath());
                request.setAttribute("javax.servlet.async.servlet_path", request.getServletPath());
                request.setAttribute("javax.servlet.async.path_info", request.getPathInfo());
                request.setAttribute("javax.servlet.async.query_string", request.getQueryString());
            }
        }

        public vje0 getDispatchContext() {
            return this._dispatchContext;
        }

        public String getPath() {
            return this._pathInContext;
        }

        public vje0 getServletContext() {
            vje0 vje0Var = this._dispatchContext;
            return vje0Var == null ? this._suspendedContext : vje0Var;
        }

        public vje0 getSuspendedContext() {
            return this._suspendedContext;
        }
    }

    public class AsyncTimeout extends Timeout.Task implements Runnable {
        public AsyncTimeout() {
        }

        @Override // org.eclipse.jetty.util.thread.Timeout.Task
        public void expired() {
            AsyncContinuation.this.expired();
        }

        @Override // java.lang.Runnable
        public void run() {
            AsyncContinuation.this.expired();
        }
    }

    private void doSuspend(vje0 vje0Var, bke0 bke0Var, gke0 gke0Var) {
        synchronized (this) {
            try {
                int i = this._state;
                if (i != 1 && i != 6) {
                    throw new IllegalStateException(getStatusString());
                }
                this._resumed = false;
                this._expired = false;
                AsyncEventState asyncEventState = this._event;
                if (asyncEventState != null && bke0Var == asyncEventState.getSuppliedRequest() && gke0Var == this._event.getSuppliedResponse() && vje0Var == this._event.getServletContext()) {
                    this._event._dispatchContext = null;
                    this._event._pathInContext = null;
                } else {
                    this._event = new AsyncEventState(vje0Var, bke0Var, gke0Var);
                }
                this._state = 2;
                List<k21> list = this._lastAsyncListeners;
                this._lastAsyncListeners = this._asyncListeners;
                this._asyncListeners = list;
                if (list != null) {
                    list.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        List<k21> list2 = this._lastAsyncListeners;
        if (list2 != null) {
            Iterator<k21> it = list2.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onStartAsync(this._event);
                } catch (Exception e) {
                    LOG.warn(e);
                }
            }
        }
    }

    @Override // org.eclipse.jetty.continuation.Continuation
    public void addContinuationListener(ContinuationListener continuationListener) {
        synchronized (this) {
            try {
                if (this._continuationListeners == null) {
                    this._continuationListeners = new ArrayList();
                }
                this._continuationListeners.add(continuationListener);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.h21
    public void addListener(k21 k21Var) {
        synchronized (this) {
            try {
                if (this._asyncListeners == null) {
                    this._asyncListeners = new ArrayList();
                }
                this._asyncListeners.add(k21Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void cancel() {
        synchronized (this) {
            cancelTimeout();
            this._continuationListeners = null;
        }
    }

    public void cancelTimeout() {
        EndPoint endPoint = this._connection.getEndPoint();
        if (endPoint.isBlocking()) {
            synchronized (this) {
                this._expireAt = 0L;
                notifyAll();
            }
        } else {
            AsyncEventState asyncEventState = this._event;
            if (asyncEventState != null) {
                ((AsyncEndPoint) endPoint).cancelTimeout(asyncEventState._timeout);
            }
        }
    }

    @Override // p149l.h21, org.eclipse.jetty.continuation.Continuation
    public void complete() {
        synchronized (this) {
            try {
                int i = this._state;
                if (i != 1) {
                    if (i == 2) {
                        this._state = 7;
                        return;
                    }
                    if (i == 4) {
                        this._state = 7;
                        boolean z = this._expired;
                        if (z) {
                            return;
                        }
                        cancelTimeout();
                        scheduleDispatch();
                        return;
                    }
                    if (i != 6) {
                        throw new IllegalStateException(getStatusString());
                    }
                }
                throw new IllegalStateException(getStatusString());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public <T extends k21> T createListener(Class<T> cls) throws ServletException {
        try {
            return cls.newInstance();
        } catch (Exception e) {
            throw new ServletException(e);
        }
    }

    @Override // p149l.h21
    public void dispatch() {
        synchronized (this) {
            try {
                int i = this._state;
                if (i == 2) {
                    this._state = 3;
                    this._resumed = true;
                    return;
                }
                if (i != 4) {
                    if (i != 5) {
                        throw new IllegalStateException(getStatusString());
                    }
                    return;
                }
                boolean z = this._expired;
                this._state = 5;
                this._resumed = true;
                if (z) {
                    return;
                }
                cancelTimeout();
                scheduleDispatch();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void doComplete(Throwable th) {
        List<ContinuationListener> list;
        List<k21> list2;
        synchronized (this) {
            if (this._state != 8) {
                throw new IllegalStateException(getStatusString());
            }
            this._state = 9;
            list = this._continuationListeners;
            list2 = this._asyncListeners;
        }
        if (list2 != null) {
            for (k21 k21Var : list2) {
                AsyncEventState asyncEventState = this._event;
                if (th != null) {
                    try {
                        asyncEventState.getSuppliedRequest().setAttribute("javax.servlet.error.exception", th);
                        this._event.getSuppliedRequest().setAttribute("javax.servlet.error.message", th.getMessage());
                        k21Var.onError(this._event);
                    } catch (Exception e) {
                        LOG.warn(e);
                    }
                } else {
                    k21Var.onComplete(asyncEventState);
                }
            }
        }
        if (list != null) {
            Iterator<ContinuationListener> it = list.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onComplete(this);
                } catch (Exception e2) {
                    LOG.warn(e2);
                }
            }
        }
    }

    public void expired() {
        synchronized (this) {
            try {
                int i = this._state;
                if (i == 2 || i == 4) {
                    List<ContinuationListener> list = this._continuationListeners;
                    List<k21> list2 = this._asyncListeners;
                    this._expired = true;
                    if (list2 != null) {
                        Iterator<k21> it = list2.iterator();
                        while (it.hasNext()) {
                            try {
                                it.next().onTimeout(this._event);
                            } catch (Exception e) {
                                LOG.warn(e);
                            }
                        }
                    }
                    if (list != null) {
                        Iterator<ContinuationListener> it2 = list.iterator();
                        while (it2.hasNext()) {
                            try {
                                it2.next().onTimeout(this);
                            } catch (Exception e2) {
                                LOG.warn(e2);
                            }
                        }
                    }
                    synchronized (this) {
                        try {
                            int i2 = this._state;
                            if (i2 == 2 || i2 == 4) {
                                if (this._continuation) {
                                    dispatch();
                                } else {
                                    complete();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    scheduleDispatch();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public AsyncEventState getAsyncEventState() {
        AsyncEventState asyncEventState;
        synchronized (this) {
            asyncEventState = this._event;
        }
        return asyncEventState;
    }

    @Override // org.eclipse.jetty.continuation.Continuation
    public Object getAttribute(String str) {
        return this._connection.getRequest().getAttribute(str);
    }

    public Request getBaseRequest() {
        return this._connection.getRequest();
    }

    public ContextHandler getContextHandler() {
        AsyncEventState asyncEventState = this._event;
        if (asyncEventState != null) {
            return ((ContextHandler.Context) asyncEventState.getServletContext()).getContextHandler();
        }
        return null;
    }

    public bke0 getRequest() {
        AsyncEventState asyncEventState = this._event;
        return asyncEventState != null ? asyncEventState.getSuppliedRequest() : this._connection.getRequest();
    }

    @Override // p149l.h21
    public gke0 getResponse() {
        AsyncEventState asyncEventState;
        return (!this._responseWrapped || (asyncEventState = this._event) == null || asyncEventState.getSuppliedResponse() == null) ? this._connection.getResponse() : this._event.getSuppliedResponse();
    }

    @Override // org.eclipse.jetty.continuation.Continuation
    public gke0 getServletResponse() {
        AsyncEventState asyncEventState;
        return (!this._responseWrapped || (asyncEventState = this._event) == null || asyncEventState.getSuppliedResponse() == null) ? this._connection.getResponse() : this._event.getSuppliedResponse();
    }

    public String getStatusString() {
        String str;
        String string;
        synchronized (this) {
            try {
                StringBuilder sb = new StringBuilder();
                int i = this._state;
                if (i == 0) {
                    str = "IDLE";
                } else if (i == 1) {
                    str = "DISPATCHED";
                } else if (i == 2) {
                    str = "ASYNCSTARTED";
                } else if (i == 4) {
                    str = "ASYNCWAIT";
                } else if (i == 3) {
                    str = "REDISPATCHING";
                } else if (i == 5) {
                    str = "REDISPATCH";
                } else if (i == 6) {
                    str = "REDISPATCHED";
                } else if (i == 7) {
                    str = "COMPLETING";
                } else if (i == 8) {
                    str = "UNCOMPLETED";
                } else if (i == 9) {
                    str = "COMPLETE";
                } else {
                    str = "UNKNOWN?" + this._state;
                }
                sb.append(str);
                sb.append(this._initial ? ",initial" : "");
                sb.append(this._resumed ? ",resumed" : "");
                sb.append(this._expired ? ",expired" : "");
                string = sb.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    public long getTimeout() {
        long j;
        synchronized (this) {
            j = this._timeoutMs;
        }
        return j;
    }

    public boolean handling() {
        synchronized (this) {
            try {
                this._continuation = false;
                this._responseWrapped = false;
                int i = this._state;
                if (i != 0) {
                    if (i == 7) {
                        this._state = 8;
                        return false;
                    }
                    if (i == 4) {
                        return false;
                    }
                    if (i != 5) {
                        throw new IllegalStateException(getStatusString());
                    }
                    this._state = 6;
                    return true;
                }
                this._initial = true;
                this._state = 1;
                List<k21> list = this._lastAsyncListeners;
                if (list != null) {
                    list.clear();
                }
                List<k21> list2 = this._asyncListeners;
                if (list2 != null) {
                    list2.clear();
                } else {
                    this._asyncListeners = this._lastAsyncListeners;
                    this._lastAsyncListeners = null;
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean hasOriginalRequestAndResponse() {
        boolean z;
        synchronized (this) {
            try {
                AsyncEventState asyncEventState = this._event;
                z = asyncEventState != null && asyncEventState.getSuppliedRequest() == this._connection._request && this._event.getSuppliedResponse() == this._connection._response;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public boolean isAsync() {
        synchronized (this) {
            try {
                int i = this._state;
                return (i == 0 || i == 1 || i == 8 || i == 9) ? false : true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean isAsyncStarted() {
        synchronized (this) {
            try {
                int i = this._state;
                return i == 2 || i == 3 || i == 4 || i == 5;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean isComplete() {
        boolean z;
        synchronized (this) {
            z = this._state == 9;
        }
        return z;
    }

    public boolean isCompleting() {
        boolean z;
        synchronized (this) {
            z = this._state == 7;
        }
        return z;
    }

    public boolean isDispatchable() {
        synchronized (this) {
            try {
                int i = this._state;
                return i == 3 || i == 5 || i == 6 || i == 7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.eclipse.jetty.continuation.Continuation
    public boolean isExpired() {
        boolean z;
        synchronized (this) {
            z = this._expired;
        }
        return z;
    }

    @Override // org.eclipse.jetty.continuation.Continuation
    public boolean isInitial() {
        boolean z;
        synchronized (this) {
            z = this._initial;
        }
        return z;
    }

    @Override // org.eclipse.jetty.continuation.Continuation
    public boolean isResponseWrapped() {
        return this._responseWrapped;
    }

    @Override // org.eclipse.jetty.continuation.Continuation
    public boolean isResumed() {
        boolean z;
        synchronized (this) {
            z = this._resumed;
        }
        return z;
    }

    @Override // org.eclipse.jetty.continuation.Continuation
    public boolean isSuspended() {
        synchronized (this) {
            try {
                int i = this._state;
                return i == 2 || i == 3 || i == 4 || i == 7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean isSuspending() {
        synchronized (this) {
            try {
                int i = this._state;
                return i == 2 || i == 4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean isUncompleted() {
        boolean z;
        synchronized (this) {
            z = this._state == 8;
        }
        return z;
    }

    public void recycle() {
        synchronized (this) {
            try {
                int i = this._state;
                if (i == 1 || i == 6) {
                    throw new IllegalStateException(getStatusString());
                }
                this._state = 0;
                this._initial = true;
                this._resumed = false;
                this._expired = false;
                this._responseWrapped = false;
                cancelTimeout();
                this._timeoutMs = 30000L;
                this._continuationListeners = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.eclipse.jetty.continuation.Continuation
    public void removeAttribute(String str) {
        this._connection.getRequest().removeAttribute(str);
    }

    @Override // org.eclipse.jetty.continuation.Continuation
    public void resume() {
        dispatch();
    }

    public void scheduleDispatch() {
        EndPoint endPoint = this._connection.getEndPoint();
        if (endPoint.isBlocking()) {
            return;
        }
        ((AsyncEndPoint) endPoint).asyncDispatch();
    }

    public void scheduleTimeout() {
        EndPoint endPoint = this._connection.getEndPoint();
        if (this._timeoutMs > 0) {
            if (!endPoint.isBlocking()) {
                ((AsyncEndPoint) endPoint).scheduleTimeout(this._event._timeout, this._timeoutMs);
                return;
            }
            synchronized (this) {
                this._expireAt = System.currentTimeMillis() + this._timeoutMs;
                long jCurrentTimeMillis = this._timeoutMs;
                while (this._expireAt > 0 && jCurrentTimeMillis > 0 && this._connection.getServer().isRunning()) {
                    try {
                        wait(jCurrentTimeMillis);
                    } catch (InterruptedException e) {
                        LOG.ignore(e);
                    }
                    jCurrentTimeMillis = this._expireAt - System.currentTimeMillis();
                }
                if (this._expireAt > 0 && jCurrentTimeMillis <= 0 && this._connection.getServer().isRunning()) {
                    expired();
                }
            }
        }
    }

    @Override // org.eclipse.jetty.continuation.Continuation
    public void setAttribute(String str, Object obj) {
        this._connection.getRequest().setAttribute(str, obj);
    }

    public void setConnection(AbstractHttpConnection abstractHttpConnection) {
        synchronized (this) {
            this._connection = abstractHttpConnection;
        }
    }

    @Override // p149l.h21, org.eclipse.jetty.continuation.Continuation
    public void setTimeout(long j) {
        synchronized (this) {
            this._timeoutMs = j;
        }
    }

    public void start(final Runnable runnable) {
        final AsyncEventState asyncEventState = this._event;
        if (asyncEventState != null) {
            this._connection.getServer().getThreadPool().dispatch(new Runnable() { // from class: org.eclipse.jetty.server.AsyncContinuation.1
                @Override // java.lang.Runnable
                public void run() throws Throwable {
                    ((ContextHandler.Context) asyncEventState.getServletContext()).getContextHandler().handle(runnable);
                }
            });
        }
    }

    public void suspend(vje0 vje0Var, bke0 bke0Var, gke0 gke0Var) {
        synchronized (this) {
            try {
                this._responseWrapped = !(gke0Var instanceof Response);
                doSuspend(vje0Var, bke0Var, gke0Var);
                if (bke0Var instanceof HttpServletRequest) {
                    this._event._pathInContext = URIUtil.addPaths(((HttpServletRequest) bke0Var).getServletPath(), ((HttpServletRequest) bke0Var).getPathInfo());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        String str;
        synchronized (this) {
            str = super.toString() + "@" + getStatusString();
        }
        return str;
    }

    @Override // org.eclipse.jetty.continuation.Continuation
    public void undispatch() {
        if (!isSuspended()) {
            throw new IllegalStateException("!suspended");
        }
        if (!LOG.isDebugEnabled()) {
            throw __exception;
        }
        throw new ContinuationThrowable();
    }

    public boolean unhandle() {
        synchronized (this) {
            try {
                int i = this._state;
                if (i == 0) {
                    throw new IllegalStateException(getStatusString());
                }
                if (i != 1) {
                    if (i == 2) {
                        this._initial = false;
                        this._state = 4;
                        scheduleTimeout();
                        int i2 = this._state;
                        if (i2 == 4) {
                            return true;
                        }
                        if (i2 == 7) {
                            this._state = 8;
                            return true;
                        }
                        this._initial = false;
                        this._state = 6;
                        return false;
                    }
                    if (i == 3) {
                        this._initial = false;
                        this._state = 6;
                        return false;
                    }
                    if (i != 6) {
                        if (i != 7) {
                            throw new IllegalStateException(getStatusString());
                        }
                        this._initial = false;
                        this._state = 8;
                        return true;
                    }
                }
                this._state = 8;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void addListener(k21 k21Var, bke0 bke0Var, gke0 gke0Var) {
        synchronized (this) {
            try {
                if (this._asyncListeners == null) {
                    this._asyncListeners = new ArrayList();
                }
                this._asyncListeners.add(k21Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.eclipse.jetty.continuation.Continuation
    public void suspend(gke0 gke0Var) {
        this._continuation = true;
        this._responseWrapped = true ^ (gke0Var instanceof Response);
        doSuspend(this._connection.getRequest().getServletContext(), this._connection.getRequest(), gke0Var);
    }

    @Override // org.eclipse.jetty.continuation.Continuation
    public void suspend() {
        this._responseWrapped = false;
        this._continuation = true;
        doSuspend(this._connection.getRequest().getServletContext(), this._connection.getRequest(), this._connection.getResponse());
    }

    public void dispatch(vje0 vje0Var, String str) {
        this._event._dispatchContext = vje0Var;
        this._event._pathInContext = str;
        dispatch();
    }

    public void dispatch(String str) {
        this._event._pathInContext = str;
        dispatch();
    }
}
