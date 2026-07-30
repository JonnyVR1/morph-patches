package org.eclipse.jetty.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/* JADX INFO: loaded from: classes3.dex */
public interface CrossContextPsuedoSession<T> {
    void clear(HttpServletRequest httpServletRequest);

    T fetch(HttpServletRequest httpServletRequest);

    void store(T t, HttpServletResponse httpServletResponse);
}
