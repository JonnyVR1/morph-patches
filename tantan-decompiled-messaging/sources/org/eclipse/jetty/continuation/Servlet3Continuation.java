package org.eclipse.jetty.continuation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.servlet.DispatcherType;
import p149l.bke0;
import p149l.gke0;
import p149l.h21;
import p149l.hke0;
import p149l.i21;
import p149l.k21;
import p149l.ohg0;

/* JADX INFO: loaded from: classes3.dex */
public class Servlet3Continuation implements Continuation {
    private static final ContinuationThrowable __exception = new ContinuationThrowable();
    private h21 _context;
    private final bke0 _request;
    private gke0 _response;
    private List<k21> _listeners = new ArrayList();
    private volatile boolean _initial = true;
    private volatile boolean _resumed = false;
    private volatile boolean _expired = false;
    private volatile boolean _responseWrapped = false;
    private long _timeoutMs = -1;

    public Servlet3Continuation(bke0 bke0Var) {
        this._request = bke0Var;
        this._listeners.add(new k21() { // from class: org.eclipse.jetty.continuation.Servlet3Continuation.1
            @Override // p149l.k21
            public void onStartAsync(i21 i21Var) throws IOException {
                i21Var.getAsyncContext().addListener(this);
            }

            @Override // p149l.k21
            public void onTimeout(i21 i21Var) throws IOException {
                Servlet3Continuation.this._initial = false;
                i21Var.getAsyncContext().dispatch();
            }

            @Override // p149l.k21
            public void onComplete(i21 i21Var) throws IOException {
            }

            @Override // p149l.k21
            public void onError(i21 i21Var) throws IOException {
            }
        });
    }

    @Override // org.eclipse.jetty.continuation.Continuation
    public void addContinuationListener(final ContinuationListener continuationListener) {
        k21 k21Var = new k21() { // from class: org.eclipse.jetty.continuation.Servlet3Continuation.2
            @Override // p149l.k21
            public void onComplete(i21 i21Var) throws IOException {
                continuationListener.onComplete(Servlet3Continuation.this);
            }

            @Override // p149l.k21
            public void onError(i21 i21Var) throws IOException {
                continuationListener.onComplete(Servlet3Continuation.this);
            }

            @Override // p149l.k21
            public void onStartAsync(i21 i21Var) throws IOException {
                i21Var.getAsyncContext().addListener(this);
            }

            @Override // p149l.k21
            public void onTimeout(i21 i21Var) throws IOException {
                Servlet3Continuation.this._expired = true;
                continuationListener.onTimeout(Servlet3Continuation.this);
            }
        };
        h21 h21Var = this._context;
        if (h21Var != null) {
            h21Var.addListener(k21Var);
        } else {
            this._listeners.add(k21Var);
        }
    }

    @Override // org.eclipse.jetty.continuation.Continuation
    public void complete() {
        h21 h21Var = this._context;
        if (h21Var != null) {
            h21Var.complete();
        } else {
            ohg0.m164364a();
        }
    }

    @Override // org.eclipse.jetty.continuation.Continuation
    public Object getAttribute(String str) {
        return this._request.getAttribute(str);
    }

    @Override // org.eclipse.jetty.continuation.Continuation
    public gke0 getServletResponse() {
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
            ohg0.m164364a();
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
        h21 h21Var = this._context;
        if (h21Var != null) {
            h21Var.setTimeout(j);
        }
    }

    @Override // org.eclipse.jetty.continuation.Continuation
    public void suspend(gke0 gke0Var) {
        this._response = gke0Var;
        this._responseWrapped = gke0Var instanceof hke0;
        this._resumed = false;
        this._expired = false;
        h21 h21VarStartAsync = this._request.startAsync();
        this._context = h21VarStartAsync;
        h21VarStartAsync.setTimeout(this._timeoutMs);
        Iterator<k21> it = this._listeners.iterator();
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
        h21 h21VarStartAsync = this._request.startAsync();
        this._context = h21VarStartAsync;
        h21VarStartAsync.setTimeout(this._timeoutMs);
        Iterator<k21> it = this._listeners.iterator();
        while (it.hasNext()) {
            this._context.addListener(it.next());
        }
        this._listeners.clear();
    }
}
