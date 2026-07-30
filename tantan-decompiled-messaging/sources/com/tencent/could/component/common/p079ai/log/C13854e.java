package com.tencent.could.component.common.p079ai.log;

import com.tencent.could.component.common.p079ai.utils.SimplePool;

/* JADX INFO: renamed from: com.tencent.could.component.common.ai.log.e */
/* JADX INFO: loaded from: classes2.dex */
public class C13854e {

    /* JADX INFO: renamed from: a */
    public SimplePool<C13853d> f57276a = new SimplePool<>(30, "LogInfoPool");

    /* JADX INFO: renamed from: com.tencent.could.component.common.ai.log.e$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final C13854e f57277a = new C13854e();
    }

    /* JADX INFO: renamed from: a */
    public void m82203a(C13853d c13853d) {
        c13853d.f57270a = 2;
        c13853d.f57271b = 0L;
        c13853d.f57272c = "";
        c13853d.f57273d = "";
        c13853d.f57274e = "";
        c13853d.f57275f = "";
        synchronized (C13854e.class) {
            this.f57276a.release(c13853d);
        }
    }
}
