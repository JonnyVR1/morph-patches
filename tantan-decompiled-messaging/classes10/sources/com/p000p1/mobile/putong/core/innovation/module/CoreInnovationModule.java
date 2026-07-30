package com.p000p1.mobile.putong.core.innovation.module;

import android.content.Context;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.putong.module.Module;
import l.gr2;
import l.roj0;
import p003l.b39;
import p003l.c39;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Route(name = "CoreInnovationModule", path = "/innovation_module/module")
public class CoreInnovationModule implements Module {

    /* JADX INFO: renamed from: a */
    public static b39 f195a;

    /* JADX INFO: renamed from: b */
    public static gr2 f196b;

    /* JADX INFO: renamed from: c */
    public static c39 f197c = new c39();

    /* JADX INFO: renamed from: F */
    private void m715F() {
        if (f196b == null) {
            gr2 gr2Var = CoreModule.m;
            f196b = gr2Var;
            gr2Var.a(f197c);
        }
    }

    /* JADX INFO: renamed from: Jh */
    public c<roj0> m716Jh() {
        return c.just(roj0.a);
    }

    /* JADX INFO: renamed from: Qh */
    public void m717Qh() {
        m715F();
        b39 b39Var = new b39();
        f195a = b39Var;
        b39Var.m5680a();
    }

    /* JADX INFO: renamed from: ft */
    public c<roj0> m718ft() {
        return c.just(roj0.a);
    }

    public Context getContext() {
        return CoreModule.b;
    }

    public void init(Context context) {
    }

    /* JADX INFO: renamed from: ms */
    public void m719ms() {
    }

    /* JADX INFO: renamed from: tr */
    public void m720tr(boolean z) {
    }
}
