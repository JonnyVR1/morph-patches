package com.p051p1.mobile.putong.core.pay.module;

import android.content.Context;
import com.p051p1.mobile.putong.core.CoreModule;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.putong.module.Module;
import p137rx.C22421c;
import p153l.a8a;
import p153l.u7a;
import p153l.uxj0;

/* JADX INFO: loaded from: classes11.dex */
@Route(name = "CorePayModule", path = "/pay_module/module")
public class CorePayModule implements Module {

    /* JADX INFO: renamed from: a */
    public static u7a f28526a;

    /* JADX INFO: renamed from: b */
    public static a8a f28527b = new a8a();

    /* JADX INFO: renamed from: F */
    private void m45068F() {
        CoreModule.f18274m.m207529a(f28527b);
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Jh */
    public C22421c<uxj0> mo29134Jh() {
        return C22421c.just(uxj0.f181467a);
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Qh */
    public void mo29136Qh() {
        m45068F();
        u7a u7aVar = new u7a();
        f28526a = u7aVar;
        u7aVar.m194838a();
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
