package com.xiaomi.push.service;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import com.xiaomi.push.C14887g;
import p153l.ouq0;
import p153l.t5r0;

/* JADX INFO: renamed from: com.xiaomi.push.service.a */
/* JADX INFO: loaded from: classes2.dex */
public class C14977a {

    /* JADX INFO: renamed from: a */
    private static final SparseArray<C14984ag.a<String, String, String>> f63678a = new SparseArray<C14984ag.a<String, String, String>>(6) { // from class: com.xiaomi.push.service.a.1
        {
            put(1, C14984ag.f63710g);
            put(2, C14984ag.f63709f);
            put(4, C14984ag.f63708e);
            put(8, C14984ag.f63705b);
            put(16, C14984ag.f63706c);
            put(32, C14984ag.f63711h);
        }
    };

    /* JADX INFO: renamed from: a */
    public static int m87544a(Context context, String str) {
        int i = 0;
        if (context == null || TextUtils.isEmpty(str)) {
            ouq0.m169393m("context | packageName must not be null");
            return 0;
        }
        C14887g.b bVarM86757f = C14887g.m86757f(context, str, true);
        if (bVarM86757f == C14887g.b.ALLOWED) {
            i = 1;
        } else if (bVarM86757f == C14887g.b.NOT_ALLOWED) {
            i = 2;
        }
        if (C14984ag.m87639a()) {
            Bundle bundleM87546a = m87546a(str);
            C14984ag.a<String, String, String> aVar = C14984ag.f63710g;
            if (bundleM87546a.containsKey(aVar.f63714c)) {
                i |= bundleM87546a.getBoolean(aVar.f63714c) ? 4 : 8;
            }
            C14984ag.a<String, String, String> aVar2 = C14984ag.f63708e;
            if (bundleM87546a.containsKey(aVar2.f63714c)) {
                i |= bundleM87546a.getBoolean(aVar2.f63714c) ? 16 : 32;
            }
            C14984ag.a<String, String, String> aVar3 = C14984ag.f63709f;
            if (bundleM87546a.containsKey(aVar3.f63714c)) {
                i |= bundleM87546a.getBoolean(aVar3.f63714c) ? 64 : 128;
            }
            C14984ag.a<String, String, String> aVar4 = C14984ag.f63705b;
            if (bundleM87546a.containsKey(aVar4.f63714c)) {
                i |= bundleM87546a.getBoolean(aVar4.f63714c) ? 256 : 512;
            }
            C14984ag.a<String, String, String> aVar5 = C14984ag.f63706c;
            if (bundleM87546a.containsKey(aVar5.f63714c)) {
                i |= bundleM87546a.getBoolean(aVar5.f63714c) ? 1024 : 2048;
            }
            C14984ag.a<String, String, String> aVar6 = C14984ag.f63711h;
            if (bundleM87546a.containsKey(aVar6.f63714c)) {
                return i | (bundleM87546a.getBoolean(aVar6.f63714c) ? 4096 : 8192);
            }
            return i;
        }
        int iM87545a = m87545a(str, 1);
        if (iM87545a == 1) {
            i |= 4;
        } else if (iM87545a == 0) {
            i |= 8;
        }
        int iM87545a2 = m87545a(str, 4);
        if (iM87545a2 == 1) {
            i |= 16;
        } else if (iM87545a2 == 0) {
            i |= 32;
        }
        int iM87545a3 = m87545a(str, 2);
        if (iM87545a3 == 1) {
            i |= 64;
        } else if (iM87545a3 == 0) {
            i |= 128;
        }
        int iM87545a4 = m87545a(str, 8);
        if (iM87545a4 == 1) {
            i |= 256;
        } else if (iM87545a4 == 0) {
            i |= 512;
        }
        int iM87545a5 = m87545a(str, 16);
        if (iM87545a5 == 1) {
            i |= 1024;
        } else if (iM87545a5 == 0) {
            i |= 2048;
        }
        int iM87545a6 = m87545a(str, 32);
        if (iM87545a6 == 1) {
            return i | 4096;
        }
        return iM87545a6 == 0 ? i | 8192 : i;
    }

    /* JADX INFO: renamed from: a */
    private static Bundle m87546a(String str) {
        return C14984ag.m87627a(t5r0.m189418b(), str, (String) null);
    }

    /* JADX INFO: renamed from: a */
    private static int m87545a(String str, int i) {
        return C14984ag.m87626a(t5r0.m189418b(), str, null, f63678a.get(i));
    }
}
