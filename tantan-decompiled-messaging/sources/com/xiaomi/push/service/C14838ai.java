package com.xiaomi.push.service;

import android.util.Pair;
import com.xiaomi.push.C14749go;
import com.xiaomi.push.C14751gq;
import com.xiaomi.push.C14764hc;
import com.xiaomi.push.C14765hd;
import com.xiaomi.push.EnumC14746gl;
import com.xiaomi.push.EnumC14747gm;
import java.util.ArrayList;
import java.util.List;
import p149l.ilq0;
import p149l.kxq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.ai */
/* JADX INFO: loaded from: classes2.dex */
public class C14838ai {

    /* JADX INFO: renamed from: com.xiaomi.push.service.ai$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f62872a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f62873b;

        static {
            int[] iArr = new int[EnumC14747gm.values().length];
            f62873b = iArr;
            try {
                iArr[EnumC14747gm.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62873b[EnumC14747gm.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62873b[EnumC14747gm.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f62873b[EnumC14747gm.BOOLEAN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[EnumC14746gl.values().length];
            f62872a = iArr2;
            try {
                iArr2[EnumC14746gl.MISC_CONFIG.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f62872a[EnumC14746gl.PLUGIN_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static List<Pair<Integer, Object>> m86492a(List<C14751gq> list, boolean z) {
        Pair pair;
        if (kxq0.m147805a(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C14751gq c14751gq : list) {
            int iM85670a = c14751gq.m85670a();
            EnumC14747gm enumC14747gmM85649a = EnumC14747gm.m85649a(c14751gq.m85678b());
            if (enumC14747gmM85649a != null) {
                if (z && c14751gq.f62123a) {
                    arrayList.add(new Pair(Integer.valueOf(iM85670a), null));
                } else {
                    int i = AnonymousClass1.f62873b[enumC14747gmM85649a.ordinal()];
                    if (i == 1) {
                        pair = new Pair(Integer.valueOf(iM85670a), Integer.valueOf(c14751gq.m85681c()));
                    } else if (i == 2) {
                        pair = new Pair(Integer.valueOf(iM85670a), Long.valueOf(c14751gq.m85672a()));
                    } else if (i != 3) {
                        pair = i != 4 ? null : new Pair(Integer.valueOf(iM85670a), Boolean.valueOf(c14751gq.m85690g()));
                    } else {
                        pair = new Pair(Integer.valueOf(iM85670a), c14751gq.m85673a());
                    }
                    arrayList.add(pair);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static void m86493a(C14837ah c14837ah, C14764hc c14764hc) {
        ilq0.m137052y("OnlineConfigHelper", "-->updateCustomConfigs(): onlineConfig=", c14837ah, ", configMessage=", c14764hc);
        c14837ah.m86487a(m86492a(c14764hc.m85932a(), true));
        c14837ah.m86490b();
    }

    /* JADX INFO: renamed from: a */
    public static int m86491a(C14837ah c14837ah, EnumC14746gl enumC14746gl) {
        return c14837ah.m86482a(enumC14746gl, AnonymousClass1.f62872a[enumC14746gl.ordinal()] != 1 ? 0 : 1);
    }

    /* JADX INFO: renamed from: a */
    public static void m86494a(C14837ah c14837ah, C14765hd c14765hd) {
        ilq0.m137052y("OnlineConfigHelper", "-->updateNormalConfigs(): onlineConfig=", c14837ah, ", configMessage=", c14765hd);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C14749go c14749go : c14765hd.m85937a()) {
            arrayList.add(new Pair<>(c14749go.m85663a(), Integer.valueOf(c14749go.m85661a())));
            List<Pair<Integer, Object>> listM86492a = m86492a(c14749go.f62047a, false);
            if (!kxq0.m147805a(listM86492a)) {
                arrayList2.addAll(listM86492a);
            }
        }
        c14837ah.m86488a(arrayList, arrayList2);
        c14837ah.m86490b();
    }
}
