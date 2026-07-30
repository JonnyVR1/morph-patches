package com.p046p1.mobile.putong.core.innovation.module;

import android.content.Context;
import com.p046p1.mobile.putong.core.CoreModule;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.putong.module.Module;
import p133rx.C22306c;
import p149l.b39;
import p149l.c39;
import p149l.gr2;
import p149l.roj0;

/* JADX INFO: loaded from: classes10.dex */
@Route(name = "CoreInnovationModule", path = "/innovation_module/module")
public class CoreInnovationModule implements Module {

    /* JADX INFO: renamed from: a */
    public static b39 f20533a;

    /* JADX INFO: renamed from: b */
    public static gr2 f20534b;

    /* JADX INFO: renamed from: c */
    public static c39 f20535c = new c39();

    /* JADX INFO: renamed from: F */
    private void m35913F() {
        if (f20534b == null) {
            gr2 gr2Var = CoreModule.f17555m;
            f20534b = gr2Var;
            gr2Var.m127648a(f20535c);
        }
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Jh */
    public C22306c<roj0> mo28135Jh() {
        return C22306c.just(roj0.f160388a);
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Qh */
    public void mo28137Qh() {
        m35913F();
        b39 b39Var = new b39();
        f20533a = b39Var;
        b39Var.m100055a();
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
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: tr */
    public void mo28140tr(boolean z) {
    }
}
