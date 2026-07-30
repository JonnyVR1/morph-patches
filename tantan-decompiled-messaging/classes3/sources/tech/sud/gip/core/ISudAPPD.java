package tech.sud.gip.core;

import l.fcg0;
import l.mlg0;
import p003l.mqg0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ISudAPPD {
    /* JADX INFO: renamed from: d */
    public static void m10025d() {
        if (mlg0.f != 1) {
            fcg0.a = true;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m10026e(int i) {
        mqg0 mqg0Var;
        if (mlg0.f != i && (mqg0Var = mlg0.b) != null) {
            mqg0Var.m6433f();
        }
        mlg0.f = i;
        mlg0.b.getClass();
        mqg0.m6431z();
    }
}
