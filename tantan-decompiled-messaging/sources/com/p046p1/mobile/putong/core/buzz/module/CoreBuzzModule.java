package com.p046p1.mobile.putong.core.buzz.module;

import android.content.Context;
import com.p046p1.mobile.putong.core.CoreModule;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.putong.module.Module;
import p133rx.C22306c;
import p149l.j8w;
import p149l.roj0;
import p149l.x97;

/* JADX INFO: loaded from: classes9.dex */
@Route(name = "CoreBuzzModule", path = "/buzz_module/module")
public class CoreBuzzModule implements Module {

    /* JADX INFO: renamed from: a */
    public static x97 f20268a;

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Jh */
    public C22306c<roj0> mo28135Jh() {
        j8w.INSTANCE.m140473a().m140431Q0();
        return C22306c.just(roj0.f160388a);
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Qh */
    public void mo28137Qh() {
        x97 x97Var = new x97();
        f20268a = x97Var;
        x97Var.m207487c();
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: ft */
    public C22306c<roj0> mo28138ft() {
        return C22306c.just(roj0.f160388a);
    }

    @Override // com.tantanapp.putong.module.Module
    public Context getContext() {
        return CoreModule.f17544b;
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: ms */
    public void mo28139ms() {
        j8w.INSTANCE.m140473a().m140429O0();
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: tr */
    public void mo28140tr(boolean z) {
        j8w.INSTANCE.m140473a().m140438b0();
    }
}
