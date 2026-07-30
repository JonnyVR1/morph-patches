package tech.sud.gip.core;

import p149l.fcg0;
import p149l.mlg0;
import p149l.mqg0;

/* JADX INFO: loaded from: classes3.dex */
public class ISudAPPD {
    /* JADX INFO: renamed from: d */
    public static void m221558d() {
        if (mlg0.f134431f != 1) {
            fcg0.f96796a = true;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m221559e(int i) {
        mqg0 mqg0Var;
        if (mlg0.f134431f != i && (mqg0Var = mlg0.f134427b) != null) {
            mqg0Var.m155904f();
        }
        mlg0.f134431f = i;
        mlg0.f134427b.getClass();
        mqg0.m155902z();
    }
}
