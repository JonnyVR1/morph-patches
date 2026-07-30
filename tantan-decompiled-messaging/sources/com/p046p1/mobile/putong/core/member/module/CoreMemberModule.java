package com.p046p1.mobile.putong.core.member.module;

import android.content.Context;
import com.p046p1.mobile.putong.core.CoreModule;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.putong.module.Module;
import p133rx.C22306c;
import p149l.hr9;
import p149l.jr9;
import p149l.lr9;
import p149l.roj0;

/* JADX INFO: loaded from: classes10.dex */
@Route(name = "CoreMemberModule", path = "/member_module/module")
public class CoreMemberModule implements Module {

    /* JADX INFO: renamed from: a */
    public static jr9 f20705a;

    /* JADX INFO: renamed from: b */
    public static lr9 f20706b = new lr9();

    /* JADX INFO: renamed from: c */
    public static hr9 f20707c;

    /* JADX INFO: renamed from: F */
    public static hr9 m36001F() {
        return f20707c;
    }

    /* JADX INFO: renamed from: H */
    private void m36002H() {
        CoreModule.f17555m.m127648a(f20706b);
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Jh */
    public C22306c<roj0> mo28135Jh() {
        return C22306c.just(roj0.f160388a);
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Qh */
    public void mo28137Qh() {
        m36002H();
        jr9 jr9Var = new jr9();
        f20705a = jr9Var;
        jr9Var.m142923a();
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
        f20707c = hr9.m132650a();
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: ms */
    public void mo28139ms() {
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: tr */
    public void mo28140tr(boolean z) {
        if (z && CoreModule.m29935P().m94651a().mo158371f()) {
            CoreModule.f17545c.f19668n2.m175450a4(CoreModule.m29931H().userId(), "entry", "", false);
        }
    }
}
