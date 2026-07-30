package org.eclipse.jetty.server;

import org.eclipse.jetty.util.component.LifeCycle;

/* JADX INFO: loaded from: classes2.dex */
public interface RequestLog extends LifeCycle {
    void log(Request request, Response response);
}
