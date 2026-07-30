package com.facebook.cache.disk;

import java.io.IOException;
import java.util.Collection;
import p153l.dy2;
import p153l.rkq0;

/* JADX INFO: renamed from: com.facebook.cache.disk.b */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1609b {

    /* JADX INFO: renamed from: com.facebook.cache.disk.b$a */
    public interface a {
        String getId();

        long getSize();

        long getTimestamp();
    }

    /* JADX INFO: renamed from: com.facebook.cache.disk.b$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo8163a(rkq0 rkq0Var, Object obj) throws IOException;

        /* JADX INFO: renamed from: b */
        dy2 mo8164b(Object obj) throws IOException;

        boolean cleanUp();
    }

    /* JADX INFO: renamed from: a */
    long mo8139a(a aVar) throws IOException;

    /* JADX INFO: renamed from: b */
    b mo8140b(String str, Object obj) throws IOException;

    /* JADX INFO: renamed from: c */
    boolean mo8141c(String str, Object obj) throws IOException;

    /* JADX INFO: renamed from: d */
    void mo8142d();

    /* JADX INFO: renamed from: e */
    boolean mo8143e(String str, Object obj) throws IOException;

    /* JADX INFO: renamed from: f */
    dy2 mo8144f(String str, Object obj) throws IOException;

    /* JADX INFO: renamed from: g */
    Collection<a> mo8145g() throws IOException;

    boolean isExternal();

    long remove(String str) throws IOException;
}
