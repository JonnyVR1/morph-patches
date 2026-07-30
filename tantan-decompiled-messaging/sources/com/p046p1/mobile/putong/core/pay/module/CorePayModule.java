package com.p046p1.mobile.putong.core.pay.module;

import android.content.Context;
import com.p046p1.mobile.putong.core.CoreModule;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.putong.module.Module;
import p133rx.C22306c;
import p149l.i6a;
import p149l.o6a;
import p149l.roj0;

/* JADX INFO: loaded from: classes11.dex */
@Route(name = "CorePayModule", path = "/pay_module/module")
public class CorePayModule implements Module {

    /* JADX INFO: renamed from: a */
    public static i6a f27678a;

    /* JADX INFO: renamed from: b */
    public static o6a f27679b = new o6a();

    /* JADX INFO: renamed from: F */
    private void m43882F() {
        CoreModule.f17555m.m127648a(f27679b);
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Jh */
    public C22306c<roj0> mo28135Jh() {
        return C22306c.just(roj0.f160388a);
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Qh */
    public void mo28137Qh() {
        m43882F();
        i6a i6aVar = new i6a();
        f27678a = i6aVar;
        i6aVar.m134600a();
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
