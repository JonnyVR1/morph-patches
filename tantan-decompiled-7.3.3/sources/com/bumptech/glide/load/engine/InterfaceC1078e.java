package com.bumptech.glide.load.engine;

import androidx.annotation.Nullable;
import com.bumptech.glide.load.DataSource;
import p153l.kzq;
import p153l.t5c;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.e */
/* JADX INFO: loaded from: classes.dex */
interface InterfaceC1078e {

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.e$a */
    public interface a {
        /* JADX INFO: renamed from: f */
        void mo5403f(kzq kzqVar, Exception exc, t5c<?> t5cVar, DataSource dataSource);

        /* JADX INFO: renamed from: g */
        void mo5404g();

        /* JADX INFO: renamed from: h */
        void mo5405h(kzq kzqVar, @Nullable Object obj, t5c<?> t5cVar, DataSource dataSource, kzq kzqVar2);
    }

    /* JADX INFO: renamed from: a */
    boolean mo5431a();

    void cancel();
}
