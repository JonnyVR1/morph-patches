package com.facebook.cache.disk;

import java.io.IOException;
import java.util.Collection;
import p149l.mbq0;
import p149l.ox2;

/* JADX INFO: renamed from: com.facebook.cache.disk.b */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1586b {

    /* JADX INFO: renamed from: com.facebook.cache.disk.b$a */
    public interface a {
        String getId();

        long getSize();

        long getTimestamp();
    }

    /* JADX INFO: renamed from: com.facebook.cache.disk.b$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo8109a(mbq0 mbq0Var, Object obj) throws IOException;

        /* JADX INFO: renamed from: b */
        ox2 mo8110b(Object obj) throws IOException;

        boolean cleanUp();
    }

    /* JADX INFO: renamed from: a */
    long mo8085a(a aVar) throws IOException;

    /* JADX INFO: renamed from: b */
    b mo8086b(String str, Object obj) throws IOException;

    /* JADX INFO: renamed from: c */
    boolean mo8087c(String str, Object obj) throws IOException;

    /* JADX INFO: renamed from: d */
    void mo8088d();

    /* JADX INFO: renamed from: e */
    boolean mo8089e(String str, Object obj) throws IOException;

    /* JADX INFO: renamed from: f */
    ox2 mo8090f(String str, Object obj) throws IOException;

    /* JADX INFO: renamed from: g */
    Collection<a> mo8091g() throws IOException;

    boolean isExternal();

    long remove(String str) throws IOException;
}
