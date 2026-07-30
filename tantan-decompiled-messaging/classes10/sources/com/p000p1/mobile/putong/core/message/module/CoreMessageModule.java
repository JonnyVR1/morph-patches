package com.p000p1.mobile.putong.core.message.module;

import android.content.Context;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.putong.module.Module;
import l.e2q;
import l.roj0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Route(name = "CoreMessageModule", path = "/message_module/module")
public class CoreMessageModule implements Module {
    /* JADX INFO: renamed from: Ai */
    public void m881Ai() {
    }

    /* JADX INFO: renamed from: Jh */
    public c<roj0> m882Jh() {
        return c.just(roj0.a);
    }

    /* JADX INFO: renamed from: Qh */
    public void m883Qh() {
        e2q.a();
    }

    /* JADX INFO: renamed from: ft */
    public c<roj0> m884ft() {
        return c.just(roj0.a);
    }

    public Context getContext() {
        return CoreModule.b;
    }

    public void init(Context context) {
    }

    /* JADX INFO: renamed from: ms */
    public void m885ms() {
    }

    /* JADX INFO: renamed from: tr */
    public void m886tr(boolean z) {
    }
}
