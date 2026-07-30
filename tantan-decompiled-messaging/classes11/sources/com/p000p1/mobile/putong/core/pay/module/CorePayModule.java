package com.p000p1.mobile.putong.core.pay.module;

import android.content.Context;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.putong.module.Module;
import l.roj0;
import p009l.i6a;
import p009l.o6a;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Route(name = "CorePayModule", path = "/pay_module/module")
public class CorePayModule implements Module {

    /* JADX INFO: renamed from: a */
    public static i6a f6456a;

    /* JADX INFO: renamed from: b */
    public static o6a f6457b = new o6a();

    /* JADX INFO: renamed from: F */
    private void m8151F() {
        CoreModule.m.a(f6457b);
    }

    /* JADX INFO: renamed from: Jh */
    public c<roj0> m8152Jh() {
        return c.just(roj0.a);
    }

    /* JADX INFO: renamed from: Qh */
    public void m8153Qh() {
        m8151F();
        i6a i6aVar = new i6a();
        f6456a = i6aVar;
        i6aVar.m16183a();
    }

    /* JADX INFO: renamed from: ft */
    public c<roj0> m8154ft() {
        return c.just(roj0.a);
    }

    public Context getContext() {
        return CoreModule.b;
    }

    public void init(Context context) {
    }

    /* JADX INFO: renamed from: ms */
    public void m8155ms() {
    }

    /* JADX INFO: renamed from: tr */
    public void m8156tr(boolean z) {
    }
}
