package com.p051p1.mobile.putong.core.buzz.module;

import android.content.Context;
import com.p051p1.mobile.putong.core.CoreModule;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.putong.module.Module;
import p137rx.C22421c;
import p153l.bb7;
import p153l.haw;
import p153l.uxj0;

/* JADX INFO: loaded from: classes9.dex */
@Route(name = "CoreBuzzModule", path = "/buzz_module/module")
public class CoreBuzzModule implements Module {

    /* JADX INFO: renamed from: a */
    public static bb7 f21010a;

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Jh */
    public C22421c<uxj0> mo29134Jh() {
        haw.INSTANCE.m134320a().m134278Q0();
        return C22421c.just(uxj0.f181467a);
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Qh */
    public void mo29136Qh() {
        bb7 bb7Var = new bb7();
        f21010a = bb7Var;
        bb7Var.m103258c();
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
        haw.INSTANCE.m134320a().m134276O0();
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: tr */
    public void mo29139tr(boolean z) {
        haw.INSTANCE.m134320a().m134285b0();
    }
}
