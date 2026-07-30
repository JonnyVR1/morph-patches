package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.C14911hb;
import com.xiaomi.push.C14914he;
import java.util.Map;
import p153l.ouq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.v */
/* JADX INFO: loaded from: classes2.dex */
public class C15029v {

    /* JADX INFO: renamed from: a */
    private static a f63980a;

    /* JADX INFO: renamed from: a */
    private static b f63981a;

    /* JADX INFO: renamed from: com.xiaomi.push.service.v$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        Map<String, String> m87998a(Context context, C14911hb c14911hb);

        /* JADX INFO: renamed from: a */
        void m87999a(Context context, C14911hb c14911hb);

        /* JADX INFO: renamed from: a */
        void m88000a(Context context, C14911hb c14911hb, C14914he c14914he);

        /* JADX INFO: renamed from: a */
        boolean m88001a(Context context, C14911hb c14911hb, boolean z);
    }

    /* JADX INFO: renamed from: com.xiaomi.push.service.v$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void m88002a(C14911hb c14911hb);

        /* JADX INFO: renamed from: a */
        void m88003a(String str);

        /* JADX INFO: renamed from: a */
        boolean m88004a(C14911hb c14911hb);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m87996a(Context context, C14911hb c14911hb, boolean z) {
        a aVar = f63980a;
        if (aVar != null && c14911hb != null) {
            return aVar.m88001a(context, c14911hb, z);
        }
        ouq0.m169393m("pepa judement listener or container is null");
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static void m87993a(Context context, C14911hb c14911hb, C14914he c14914he) {
        a aVar = f63980a;
        if (aVar == null) {
            ouq0.m169378B("The Listener of EventProcessor must be set. Please check extension plugin initialization.");
        } else {
            aVar.m88000a(context, c14911hb, c14914he);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m87992a(Context context, C14911hb c14911hb) {
        a aVar = f63980a;
        if (aVar != null && c14911hb != null) {
            aVar.m87999a(context, c14911hb);
        } else {
            ouq0.m169393m("handle msg wrong");
        }
    }

    /* JADX INFO: renamed from: a */
    public static Map<String, String> m87991a(Context context, C14911hb c14911hb) {
        a aVar = f63980a;
        if (aVar != null && c14911hb != null) {
            return aVar.m87998a(context, c14911hb);
        }
        ouq0.m169393m("pepa listener or container is null");
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m87997a(C14911hb c14911hb) {
        b bVar = f63981a;
        if (bVar != null && c14911hb != null) {
            return bVar.m88004a(c14911hb);
        }
        ouq0.m169393m("pepa handleReceiveMessage is null");
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static void m87994a(C14911hb c14911hb) {
        b bVar = f63981a;
        if (bVar != null && c14911hb != null) {
            bVar.m88002a(c14911hb);
        } else {
            ouq0.m169393m("pepa clearMessage is null");
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m87995a(String str) {
        b bVar = f63981a;
        if (bVar != null && str != null) {
            bVar.m88003a(str);
        } else {
            ouq0.m169393m("pepa clearMessage is null");
        }
    }
}
