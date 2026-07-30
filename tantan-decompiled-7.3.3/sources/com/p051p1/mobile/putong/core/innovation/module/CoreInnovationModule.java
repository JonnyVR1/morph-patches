package com.p051p1.mobile.putong.core.innovation.module;

import android.content.Context;
import com.p051p1.mobile.putong.core.CoreModule;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.putong.module.Module;
import p137rx.C22421c;
import p153l.k49;
import p153l.l49;
import p153l.uxj0;
import p153l.wr2;

/* JADX INFO: loaded from: classes10.dex */
@Route(name = "CoreInnovationModule", path = "/innovation_module/module")
public class CoreInnovationModule implements Module {

    /* JADX INFO: renamed from: a */
    public static k49 f21275a;

    /* JADX INFO: renamed from: b */
    public static wr2 f21276b;

    /* JADX INFO: renamed from: c */
    public static l49 f21277c = new l49();

    /* JADX INFO: renamed from: F */
    private void m36916F() {
        if (f21276b == null) {
            wr2 wr2Var = CoreModule.f18274m;
            f21276b = wr2Var;
            wr2Var.m207529a(f21277c);
        }
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Jh */
    public C22421c<uxj0> mo29134Jh() {
        return C22421c.just(uxj0.f181467a);
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Qh */
    public void mo29136Qh() {
        m36916F();
        k49 k49Var = new k49();
        f21275a = k49Var;
        k49Var.m148240a();
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: ft */
    public C22421c<uxj0> mo29137ft() {
        return C22421c.just(uxj0.f181467a);
    }

    @Override // com.tantanapp.putong.module.Module
    public Context getContext() {
        return CoreModule.f18263b;
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: ms */
    public void mo29138ms() {
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: tr */
    public void mo29139tr(boolean z) {
    }
}
