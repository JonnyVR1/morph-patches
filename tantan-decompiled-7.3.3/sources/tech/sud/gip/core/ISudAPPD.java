package tech.sud.gip.core;

import p153l.nkg0;
import p153l.utg0;
import p153l.uyg0;

/* JADX INFO: loaded from: classes3.dex */
public class ISudAPPD {
    /* JADX INFO: renamed from: d */
    public static void m222804d() {
        if (utg0.f180951f != 1) {
            nkg0.f142458a = true;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m222805e(int i) {
        uyg0 uyg0Var;
        if (utg0.f180951f != i && (uyg0Var = utg0.f180947b) != null) {
            uyg0Var.m198637f();
        }
        utg0.f180951f = i;
        utg0.f180947b.getClass();
        uyg0.m198635z();
    }
}
