package com.xiaomi.push.service;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import com.xiaomi.push.C14739g;
import p149l.ilq0;
import p149l.nwq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14829a {

    /* JADX INFO: renamed from: a */
    private static final SparseArray<C14836ag.a<String, String, String>> f62831a = new SparseArray<C14836ag.a<String, String, String>>(6) { // from class: com.xiaomi.push.service.a.1
        {
            put(1, C14836ag.f62863g);
            put(2, C14836ag.f62862f);
            put(4, C14836ag.f62861e);
            put(8, C14836ag.f62858b);
            put(16, C14836ag.f62859c);
            put(32, C14836ag.f62864h);
        }
    };

    /* JADX INFO: renamed from: a */
    public static int m86373a(Context context, String str) {
        int i = 0;
        if (context == null || TextUtils.isEmpty(str)) {
            ilq0.m137040m("context | packageName must not be null");
            return 0;
        }
        C14739g.b bVarM85586f = C14739g.m85586f(context, str, true);
        if (bVarM85586f == C14739g.b.ALLOWED) {
            i = 1;
        } else if (bVarM85586f == C14739g.b.NOT_ALLOWED) {
            i = 2;
        }
        if (C14836ag.m86468a()) {
            Bundle bundleM86375a = m86375a(str);
            C14836ag.a<String, String, String> aVar = C14836ag.f62863g;
            if (bundleM86375a.containsKey(aVar.f62867c)) {
                i |= bundleM86375a.getBoolean(aVar.f62867c) ? 4 : 8;
            }
            C14836ag.a<String, String, String> aVar2 = C14836ag.f62861e;
            if (bundleM86375a.containsKey(aVar2.f62867c)) {
                i |= bundleM86375a.getBoolean(aVar2.f62867c) ? 16 : 32;
            }
            C14836ag.a<String, String, String> aVar3 = C14836ag.f62862f;
            if (bundleM86375a.containsKey(aVar3.f62867c)) {
                i |= bundleM86375a.getBoolean(aVar3.f62867c) ? 64 : 128;
            }
            C14836ag.a<String, String, String> aVar4 = C14836ag.f62858b;
            if (bundleM86375a.containsKey(aVar4.f62867c)) {
                i |= bundleM86375a.getBoolean(aVar4.f62867c) ? 256 : 512;
            }
            C14836ag.a<String, String, String> aVar5 = C14836ag.f62859c;
            if (bundleM86375a.containsKey(aVar5.f62867c)) {
                i |= bundleM86375a.getBoolean(aVar5.f62867c) ? 1024 : 2048;
            }
            C14836ag.a<String, String, String> aVar6 = C14836ag.f62864h;
            if (bundleM86375a.containsKey(aVar6.f62867c)) {
                return i | (bundleM86375a.getBoolean(aVar6.f62867c) ? 4096 : 8192);
            }
            return i;
        }
        int iM86374a = m86374a(str, 1);
        if (iM86374a == 1) {
            i |= 4;
        } else if (iM86374a == 0) {
            i |= 8;
        }
        int iM86374a2 = m86374a(str, 4);
        if (iM86374a2 == 1) {
            i |= 16;
        } else if (iM86374a2 == 0) {
            i |= 32;
        }
        int iM86374a3 = m86374a(str, 2);
        if (iM86374a3 == 1) {
            i |= 64;
        } else if (iM86374a3 == 0) {
            i |= 128;
        }
        int iM86374a4 = m86374a(str, 8);
        if (iM86374a4 == 1) {
            i |= 256;
        } else if (iM86374a4 == 0) {
            i |= 512;
        }
        int iM86374a5 = m86374a(str, 16);
        if (iM86374a5 == 1) {
            i |= 1024;
        } else if (iM86374a5 == 0) {
            i |= 2048;
        }
        int iM86374a6 = m86374a(str, 32);
        if (iM86374a6 == 1) {
            return i | 4096;
        }
        return iM86374a6 == 0 ? i | 8192 : i;
    }

    /* JADX INFO: renamed from: a */
    private static Bundle m86375a(String str) {
        return C14836ag.m86456a(nwq0.m161879b(), str, (String) null);
    }

    /* JADX INFO: renamed from: a */
    private static int m86374a(String str, int i) {
        return C14836ag.m86455a(nwq0.m161879b(), str, null, f62831a.get(i));
    }
}
