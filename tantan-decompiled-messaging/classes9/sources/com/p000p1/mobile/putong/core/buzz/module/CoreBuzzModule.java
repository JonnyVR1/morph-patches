package com.p000p1.mobile.putong.core.buzz.module;

import android.content.Context;
import com.p000p1.mobile.putong.core.CoreModule;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.putong.module.Module;
import l.j8w;
import l.roj0;
import p006l.x97;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Route(name = "CoreBuzzModule", path = "/buzz_module/module")
public class CoreBuzzModule implements Module {

    /* JADX INFO: renamed from: a */
    public static x97 f4257a;

    /* JADX INFO: renamed from: Jh */
    public c<roj0> m7071Jh() {
        j8w.Companion.a().Q0();
        return c.just(roj0.a);
    }

    /* JADX INFO: renamed from: Qh */
    public void m7072Qh() {
        x97 x97Var = new x97();
        f4257a = x97Var;
        x97Var.m27161c();
    }

    /* JADX INFO: renamed from: ft */
    public c<roj0> m7073ft() {
        return c.just(roj0.a);
    }

    public Context getContext() {
        return CoreModule.f1533b;
    }

    public void init(Context context) {
    }

    /* JADX INFO: renamed from: ms */
    public void m7074ms() {
        j8w.Companion.a().O0();
    }

    /* JADX INFO: renamed from: tr */
    public void m7075tr(boolean z) {
        j8w.Companion.a().b0();
    }
}
