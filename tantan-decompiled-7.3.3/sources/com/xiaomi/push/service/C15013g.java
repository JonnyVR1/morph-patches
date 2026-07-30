package com.xiaomi.push.service;

import com.xiaomi.push.C14914he;
import p153l.l4r0;
import p153l.ouq0;
import p153l.t5r0;

/* JADX INFO: renamed from: com.xiaomi.push.service.g */
/* JADX INFO: loaded from: classes2.dex */
public class C15013g {

    /* JADX INFO: renamed from: a */
    private static a f63890a;

    /* JADX INFO: renamed from: a */
    private static b f63891a;

    /* JADX INFO: renamed from: com.xiaomi.push.service.g$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        boolean m87828a(C14914he c14914he);
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.g$b */
    public interface b {
    }

    /* JADX INFO: renamed from: a */
    public static boolean m87827a(C14914he c14914he) {
        if (f63890a == null || c14914he == null) {
            ouq0.m169393m("rc params is null, not cpra");
            return false;
        }
        if (l4r0.m152825j(t5r0.m189418b())) {
            return f63890a.m87828a(c14914he);
        }
        ouq0.m169393m("rc app not permission to cpra");
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static void m87826a(b bVar) {
        f63891a = bVar;
    }
}
