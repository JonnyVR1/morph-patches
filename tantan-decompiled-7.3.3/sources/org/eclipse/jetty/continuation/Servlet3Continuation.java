package org.eclipse.jetty.continuation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.servlet.DispatcherType;
import p153l.gse0;
import p153l.lse0;
import p153l.mse0;
import p153l.o21;
import p153l.p21;
import p153l.r21;
import p153l.wpg0;

/* JADX INFO: loaded from: classes2.dex */
public class Servlet3Continuation implements Continuation {
    private static final ContinuationThrowable __exception = new ContinuationThrowable();
    private o21 _context;
    private final gse0 _request;
    private lse0 _response;
    private List<r21> _listeners = new ArrayList();
    private volatile boolean _initial = true;
    private volatile boolean _resumed = false;
    private volatile boolean _expired = false;
    private volatile boolean _responseWrapped = false;
    private long _timeoutMs = -1;

    public Servlet3Continuation(gse0 gse0Var) {
        this._request = gse0Var;
        this._listeners.add(new r21() { // from class: org.eclipse.jetty.continuation.Servlet3Continuation.1
            @Override // p153l.r21
            public void onStartAsync(p21 p21Var) throws IOException {
                p21Var.getAsyncContext().addListener(this);
            }

            @Override // p153l.r21
            public void onTimeout(p21 p21Var) throws IOException {
                Servlet3Continuation.this._initial = false;
                p21Var.getAsyncContext().dispatch();
            }

            @Override // p153l.r21
            public void onComplete(p21 p21Var) throws IOException {
            }

            @Override // p153l.r21
            public void onError(p21 p21Var) throws IOException {
            }
        });
    }

    @Override // org.eclipse.jetty.continuation.Continuation
    public void addContinuationListener(final ContinuationListener continuationListener) {
        r21 r21Var = new r21() { // from class: org.eclipse.jetty.continuation.Servlet3Continuation.2
            @Override // p153l.r21
            public void onComplete(p21 p21Var) throws IOException {
                continuationListener.onComplete(Servlet3Continuation.this);
            }

            @Override // p153l.r21
            public void onError(p21 p21Var) throws IOException {
                continuationListener.onComplete(Servlet3Continuation.this);
            }

            @Override // p153l.r21
            public void onStartAsync(p21 p21Var) throws IOException {
                p21Var.getAsyncContext().addListener(this);
            }

            @Override // p153l.r21
            public void onTimeout(p21 p21Var) throws IOException {
                Servlet3Continuation.this._expired = true;
                continuationListener.onTimeout(Servlet3Continuation.this);
            }
        };
        o21 o21Var = this._context;
        if (o21Var != null) {
            o21Var.addListener(r21Var);
        } else {
            this._listeners.add(r21Var);
        }
    }

    @Override // org.eclipse.jetty.continuation.Continuation
    public void complete() {
        o21 o21Var = this._context;
        if (o21Var != null) {
            o21Var.complete();
        } else {
            wpg0.m207458a();
        }
    }

    @Override // org.eclipse.jetty.continuation.Continuation
    public Object getAttribute(String str) {
        return this._request.getAttribute(str);
    }

    @Override // org.eclipse.jetty.continuation.Continuation
    public lse0 getServletResponse() {
        return this._response;
    }

    @Override // org.eclipse.jetty.continuation.Continuation
    public boolean isExpired() {
        return this._expired;
    }

    @Override // org.eclipse.jetty.continuation.Continuation
    public boolean isInitial() {
        return this._initial && this._request.getDispatcherType() != DispatcherType.ASYNC;
    }

    @Override // org.eclipse.jetty.continuation.Continuation
    public boolean isResponseWrapped() {
        return this._responseWrapped;
    }

    @Override // org.eclipse.jetty.continuation.Continuation
    public boolean isResumed() {
        return this._resumed;
    }

    @Override // org.eclipse.jetty.continuation.Continuation
    public boolean isSuspended() {
        return this._request.isAsyncStarted();
    }

    public void keepWrappers() {
        this._responseWrapped = true;
    }

    @Override // org.eclipse.jetty.continuation.Continuation
    public void removeAttribute(String str) {
        this._request.removeAttribute(str);
    }

    @Override // org.eclipse.jetty.continuation.Continuation
    public void resume() {
        if (this._context == null) {
            wpg0.m207458a();
        } else {
            this._resumed = true;
            this._context.dispatch();
        }
    }

    @Override // org.eclipse.jetty.continuation.Continuation
    public void setAttribute(String str, Object obj) {
        this._request.setAttribute(str, obj);
    }

    @Override // org.eclipse.jetty.continuation.Continuation
    public void setTimeout(long j) {
        this._timeoutMs = j;
        o21 o21Var = this._context;
        if (o21Var != null) {
            o21Var.setTimeout(j);
        }
    }

    @Override // org.eclipse.jetty.continuation.Continuation
    public void suspend(lse0 lse0Var) {
        this._response = lse0Var;
        this._responseWrapped = lse0Var instanceof mse0;
        this._resumed = false;
        this._expired = false;
        o21 o21VarStartAsync = this._request.startAsync();
        this._context = o21VarStartAsync;
        o21VarStartAsync.setTimeout(this._timeoutMs);
        Iterator<r21> it = this._listeners.iterator();
        while (it.hasNext()) {
            this._context.addListener(it.next());
        }
        this._listeners.clear();
    }

    @Override // org.eclipse.jetty.continuation.Continuation
    public void undispatch() {
        if (!isSuspended()) {
            throw new IllegalStateException("!suspended");
        }
        if (!ContinuationFilter.__debug) {
            throw __exception;
        }
        throw new ContinuationThrowable();
    }

    @Override // org.eclipse.jetty.continuation.Continuation
    public void suspend() {
        this._resumed = false;
        this._expired = false;
        o21 o21VarStartAsync = this._request.startAsync();
        this._context = o21VarStartAsync;
        o21VarStartAsync.setTimeout(this._timeoutMs);
        Iterator<r21> it = this._listeners.iterator();
        while (it.hasNext()) {
            this._context.addListener(it.next());
        }
        this._listeners.clear();
    }
}
