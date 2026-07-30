package com.xiaomi.push.service;

import android.util.Pair;
import com.xiaomi.push.C14897go;
import com.xiaomi.push.C14899gq;
import com.xiaomi.push.C14912hc;
import com.xiaomi.push.C14913hd;
import com.xiaomi.push.EnumC14894gl;
import com.xiaomi.push.EnumC14895gm;
import java.util.ArrayList;
import java.util.List;
import p153l.ouq0;
import p153l.q6r0;

/* JADX INFO: renamed from: com.xiaomi.push.service.ai */
/* JADX INFO: loaded from: classes2.dex */
public class C14986ai {

    /* JADX INFO: renamed from: com.xiaomi.push.service.ai$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f63719a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f63720b;

        static {
            int[] iArr = new int[EnumC14895gm.values().length];
            f63720b = iArr;
            try {
                iArr[EnumC14895gm.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63720b[EnumC14895gm.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f63720b[EnumC14895gm.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f63720b[EnumC14895gm.BOOLEAN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[EnumC14894gl.values().length];
            f63719a = iArr2;
            try {
                iArr2[EnumC14894gl.MISC_CONFIG.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f63719a[EnumC14894gl.PLUGIN_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static List<Pair<Integer, Object>> m87663a(List<C14899gq> list, boolean z) {
        Pair pair;
        if (q6r0.m175606a(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C14899gq c14899gq : list) {
            int iM86841a = c14899gq.m86841a();
            EnumC14895gm enumC14895gmM86820a = EnumC14895gm.m86820a(c14899gq.m86849b());
            if (enumC14895gmM86820a != null) {
                if (z && c14899gq.f62970a) {
                    arrayList.add(new Pair(Integer.valueOf(iM86841a), null));
                } else {
                    int i = AnonymousClass1.f63720b[enumC14895gmM86820a.ordinal()];
                    if (i == 1) {
                        pair = new Pair(Integer.valueOf(iM86841a), Integer.valueOf(c14899gq.m86852c()));
                    } else if (i == 2) {
                        pair = new Pair(Integer.valueOf(iM86841a), Long.valueOf(c14899gq.m86843a()));
                    } else if (i != 3) {
                        pair = i != 4 ? null : new Pair(Integer.valueOf(iM86841a), Boolean.valueOf(c14899gq.m86861g()));
                    } else {
                        pair = new Pair(Integer.valueOf(iM86841a), c14899gq.m86844a());
                    }
                    arrayList.add(pair);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static void m87664a(C14985ah c14985ah, C14912hc c14912hc) {
        ouq0.m169405y("OnlineConfigHelper", "-->updateCustomConfigs(): onlineConfig=", c14985ah, ", configMessage=", c14912hc);
        c14985ah.m87658a(m87663a(c14912hc.m87103a(), true));
        c14985ah.m87661b();
    }

    /* JADX INFO: renamed from: a */
    public static int m87662a(C14985ah c14985ah, EnumC14894gl enumC14894gl) {
        return c14985ah.m87653a(enumC14894gl, AnonymousClass1.f63719a[enumC14894gl.ordinal()] != 1 ? 0 : 1);
    }

    /* JADX INFO: renamed from: a */
    public static void m87665a(C14985ah c14985ah, C14913hd c14913hd) {
        ouq0.m169405y("OnlineConfigHelper", "-->updateNormalConfigs(): onlineConfig=", c14985ah, ", configMessage=", c14913hd);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C14897go c14897go : c14913hd.m87108a()) {
            arrayList.add(new Pair<>(c14897go.m86834a(), Integer.valueOf(c14897go.m86832a())));
            List<Pair<Integer, Object>> listM87663a = m87663a(c14897go.f62894a, false);
            if (!q6r0.m175606a(listM87663a)) {
                arrayList2.addAll(listM87663a);
            }
        }
        c14985ah.m87659a(arrayList, arrayList2);
        c14985ah.m87661b();
    }
}
