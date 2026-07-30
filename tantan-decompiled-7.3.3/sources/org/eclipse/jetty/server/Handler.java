package org.eclipse.jetty.server;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.util.component.Destroyable;
import org.eclipse.jetty.util.component.LifeCycle;

/* JADX INFO: loaded from: classes2.dex */
public interface Handler extends LifeCycle, Destroyable {
    @Override // org.eclipse.jetty.util.component.Destroyable
    void destroy();

    Server getServer();

    void handle(String str, Request request, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException;

    void setServer(Server server);
}
