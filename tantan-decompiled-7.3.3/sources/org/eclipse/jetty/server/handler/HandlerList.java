package org.eclipse.jetty.server.handler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Request;

/* JADX INFO: loaded from: classes2.dex */
public class HandlerList extends HandlerCollection {
    @Override // org.eclipse.jetty.server.handler.HandlerCollection, org.eclipse.jetty.server.Handler
    public void handle(String str, Request request, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        Handler[] handlers = getHandlers();
        if (handlers == null || !isStarted()) {
            return;
        }
        for (Handler handler : handlers) {
            handler.handle(str, request, httpServletRequest, httpServletResponse);
            if (request.isHandled()) {
                return;
            }
        }
    }
}
