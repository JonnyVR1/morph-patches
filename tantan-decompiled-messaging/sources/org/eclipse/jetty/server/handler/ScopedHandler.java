package org.eclipse.jetty.server.handler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Request;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ScopedHandler extends HandlerWrapper {
    private static final ThreadLocal<ScopedHandler> __outerScope = new ThreadLocal<>();
    protected ScopedHandler _nextScope;
    protected ScopedHandler _outerScope;

    public abstract void doHandle(String str, Request request, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException;

    public abstract void doScope(String str, Request request, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException;

    @Override // org.eclipse.jetty.server.handler.HandlerWrapper, org.eclipse.jetty.server.handler.AbstractHandler, org.eclipse.jetty.util.component.AggregateLifeCycle, org.eclipse.jetty.util.component.AbstractLifeCycle
    public void doStart() throws Exception {
        try {
            ThreadLocal<ScopedHandler> threadLocal = __outerScope;
            ScopedHandler scopedHandler = threadLocal.get();
            this._outerScope = scopedHandler;
            if (scopedHandler == null) {
                threadLocal.set(this);
            }
            super.doStart();
            this._nextScope = (ScopedHandler) getChildHandlerByClass(ScopedHandler.class);
            if (this._outerScope == null) {
            }
        } finally {
            if (this._outerScope == null) {
                __outerScope.set(null);
            }
        }
    }

    @Override // org.eclipse.jetty.server.handler.HandlerWrapper, org.eclipse.jetty.server.Handler
    public final void handle(String str, Request request, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        if (this._outerScope == null) {
            doScope(str, request, httpServletRequest, httpServletResponse);
        } else {
            doHandle(str, request, httpServletRequest, httpServletResponse);
        }
    }

    public boolean never() {
        return false;
    }

    public final void nextHandle(String str, Request request, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        ScopedHandler scopedHandler = this._nextScope;
        if (scopedHandler != null && scopedHandler == this._handler) {
            scopedHandler.doHandle(str, request, httpServletRequest, httpServletResponse);
            return;
        }
        Handler handler = this._handler;
        if (handler != null) {
            handler.handle(str, request, httpServletRequest, httpServletResponse);
        }
    }

    public final void nextScope(String str, Request request, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        ScopedHandler scopedHandler = this._nextScope;
        if (scopedHandler != null) {
            scopedHandler.doScope(str, request, httpServletRequest, httpServletResponse);
            return;
        }
        ScopedHandler scopedHandler2 = this._outerScope;
        if (scopedHandler2 != null) {
            scopedHandler2.doHandle(str, request, httpServletRequest, httpServletResponse);
        } else {
            doHandle(str, request, httpServletRequest, httpServletResponse);
        }
    }
}
