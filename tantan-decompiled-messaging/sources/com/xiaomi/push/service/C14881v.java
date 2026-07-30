package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.C14763hb;
import com.xiaomi.push.C14766he;
import java.util.Map;
import p149l.ilq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.v */
/* JADX INFO: loaded from: classes2.dex */
public class C14881v {

    /* JADX INFO: renamed from: a */
    private static a f63133a;

    /* JADX INFO: renamed from: a */
    private static b f63134a;

    /* JADX INFO: renamed from: com.xiaomi.push.service.v$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        Map<String, String> m86827a(Context context, C14763hb c14763hb);

        /* JADX INFO: renamed from: a */
        void m86828a(Context context, C14763hb c14763hb);

        /* JADX INFO: renamed from: a */
        void m86829a(Context context, C14763hb c14763hb, C14766he c14766he);

        /* JADX INFO: renamed from: a */
        boolean m86830a(Context context, C14763hb c14763hb, boolean z);
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.v$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void m86831a(C14763hb c14763hb);

        /* JADX INFO: renamed from: a */
        void m86832a(String str);

        /* JADX INFO: renamed from: a */
        boolean m86833a(C14763hb c14763hb);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m86825a(Context context, C14763hb c14763hb, boolean z) {
        a aVar = f63133a;
        if (aVar != null && c14763hb != null) {
            return aVar.m86830a(context, c14763hb, z);
        }
        ilq0.m137040m("pepa judement listener or container is null");
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static void m86822a(Context context, C14763hb c14763hb, C14766he c14766he) {
        a aVar = f63133a;
        if (aVar == null) {
            ilq0.m137025B("The Listener of EventProcessor must be set. Please check extension plugin initialization.");
        } else {
            aVar.m86829a(context, c14763hb, c14766he);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m86821a(Context context, C14763hb c14763hb) {
        a aVar = f63133a;
        if (aVar != null && c14763hb != null) {
            aVar.m86828a(context, c14763hb);
        } else {
            ilq0.m137040m("handle msg wrong");
        }
    }

    /* JADX INFO: renamed from: a */
    public static Map<String, String> m86820a(Context context, C14763hb c14763hb) {
        a aVar = f63133a;
        if (aVar != null && c14763hb != null) {
            return aVar.m86827a(context, c14763hb);
        }
        ilq0.m137040m("pepa listener or container is null");
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m86826a(C14763hb c14763hb) {
        b bVar = f63134a;
        if (bVar != null && c14763hb != null) {
            return bVar.m86833a(c14763hb);
        }
        ilq0.m137040m("pepa handleReceiveMessage is null");
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static void m86823a(C14763hb c14763hb) {
        b bVar = f63134a;
        if (bVar != null && c14763hb != null) {
            bVar.m86831a(c14763hb);
        } else {
            ilq0.m137040m("pepa clearMessage is null");
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m86824a(String str) {
        b bVar = f63134a;
        if (bVar != null && str != null) {
            bVar.m86832a(str);
        } else {
            ilq0.m137040m("pepa clearMessage is null");
        }
    }
}
