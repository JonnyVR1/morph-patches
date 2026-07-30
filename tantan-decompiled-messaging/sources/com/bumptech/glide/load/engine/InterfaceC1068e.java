package com.bumptech.glide.load.engine;

import androidx.annotation.Nullable;
import com.bumptech.glide.load.DataSource;
import p149l.kxq;
import p149l.l4c;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.e */
/* JADX INFO: loaded from: classes.dex */
interface InterfaceC1068e {

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.e$a */
    public interface a {
        /* JADX INFO: renamed from: b */
        void mo5377b(kxq kxqVar, Exception exc, l4c<?> l4cVar, DataSource dataSource);

        /* JADX INFO: renamed from: f */
        void mo5378f();

        /* JADX INFO: renamed from: g */
        void mo5379g(kxq kxqVar, @Nullable Object obj, l4c<?> l4cVar, DataSource dataSource, kxq kxqVar2);
    }

    /* JADX INFO: renamed from: a */
    boolean mo5406a();

    void cancel();
}
