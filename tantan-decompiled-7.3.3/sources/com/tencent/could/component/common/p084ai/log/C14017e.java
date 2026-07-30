package com.tencent.could.component.common.p084ai.log;

import com.tencent.could.component.common.p084ai.utils.SimplePool;

/* JADX INFO: renamed from: com.tencent.could.component.common.ai.log.e */
/* JADX INFO: loaded from: classes12.dex */
public class C14017e {

    /* JADX INFO: renamed from: a */
    public SimplePool<C14016d> f58124a = new SimplePool<>(30, "LogInfoPool");

    /* JADX INFO: renamed from: com.tencent.could.component.common.ai.log.e$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final C14017e f58125a = new C14017e();
    }

    /* JADX INFO: renamed from: a */
    public void m83386a(C14016d c14016d) {
        c14016d.f58118a = 2;
        c14016d.f58119b = 0L;
        c14016d.f58120c = "";
        c14016d.f58121d = "";
        c14016d.f58122e = "";
        c14016d.f58123f = "";
        synchronized (C14017e.class) {
            this.f58124a.release(c14016d);
        }
    }
}
