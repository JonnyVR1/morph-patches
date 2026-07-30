package com.p000p1.mobile.putong.core.profile.module;

import android.content.Context;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.putong.module.Module;
import l.roj0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Route(name = "CoreProfileModule", path = "/profile_module/module")
public class CoreProfileModule implements Module {
    /* JADX INFO: renamed from: Jh */
    public c<roj0> m8256Jh() {
        return c.just(roj0.a);
    }

    /* JADX INFO: renamed from: Qh */
    public void m8257Qh() {
    }

    /* JADX INFO: renamed from: ft */
    public c<roj0> m8258ft() {
        return c.just(roj0.a);
    }

    public Context getContext() {
        return CoreModule.b;
    }

    public void init(Context context) {
    }

    /* JADX INFO: renamed from: ms */
    public void m8259ms() {
    }

    /* JADX INFO: renamed from: tr */
    public void m8260tr(boolean z) {
    }
}
