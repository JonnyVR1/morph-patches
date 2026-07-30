package com.p000p1.mobile.putong.core.card.module;

import android.content.Context;
import com.p000p1.mobile.putong.core.CoreModule;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.putong.module.Module;
import l.roj0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Route(name = "CoreCardModule", path = "/card_module/module")
public class CoreCardModule implements Module {
    /* JADX INFO: renamed from: Jh */
    public c<roj0> m7140Jh() {
        return c.just(roj0.a);
    }

    /* JADX INFO: renamed from: Qh */
    public void m7141Qh() {
    }

    /* JADX INFO: renamed from: ft */
    public c<roj0> m7142ft() {
        return c.just(roj0.a);
    }

    public Context getContext() {
        return CoreModule.f1533b;
    }

    public void init(Context context) {
    }

    /* JADX INFO: renamed from: ms */
    public void m7143ms() {
    }

    /* JADX INFO: renamed from: tr */
    public void m7144tr(boolean z) {
    }
}
