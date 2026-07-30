package com.xiaomi.push.service;

import com.xiaomi.push.C14766he;
import p149l.fvq0;
import p149l.ilq0;
import p149l.nwq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.g */
/* JADX INFO: loaded from: classes2.dex */
public class C14865g {

    /* JADX INFO: renamed from: a */
    private static a f63043a;

    /* JADX INFO: renamed from: a */
    private static b f63044a;

    /* JADX INFO: renamed from: com.xiaomi.push.service.g$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        boolean m86657a(C14766he c14766he);
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.g$b */
    public interface b {
    }

    /* JADX INFO: renamed from: a */
    public static boolean m86656a(C14766he c14766he) {
        if (f63043a == null || c14766he == null) {
            ilq0.m137040m("rc params is null, not cpra");
            return false;
        }
        if (fvq0.m123356j(nwq0.m161879b())) {
            return f63043a.m86657a(c14766he);
        }
        ilq0.m137040m("rc app not permission to cpra");
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static void m86655a(b bVar) {
        f63044a = bVar;
    }
}
