package com.p051p1.mobile.putong.core.member.module;

import android.content.Context;
import com.p051p1.mobile.putong.core.CoreModule;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.putong.module.Module;
import p137rx.C22421c;
import p153l.ss9;
import p153l.us9;
import p153l.uxj0;
import p153l.ws9;

/* JADX INFO: loaded from: classes10.dex */
@Route(name = "CoreMemberModule", path = "/member_module/module")
public class CoreMemberModule implements Module {

    /* JADX INFO: renamed from: a */
    public static us9 f21447a;

    /* JADX INFO: renamed from: b */
    public static ws9 f21448b = new ws9();

    /* JADX INFO: renamed from: c */
    public static ss9 f21449c;

    /* JADX INFO: renamed from: F */
    public static ss9 m37004F() {
        return f21449c;
    }

    /* JADX INFO: renamed from: H */
    private void m37005H() {
        CoreModule.f18274m.m207529a(f21448b);
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Jh */
    public C22421c<uxj0> mo29134Jh() {
        return C22421c.just(uxj0.f181467a);
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Qh */
    public void mo29136Qh() {
        m37005H();
        us9 us9Var = new us9();
        f21447a = us9Var;
        us9Var.m197818a();
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
        f21449c = ss9.m187692a();
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: ms */
    public void mo29138ms() {
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: tr */
    public void mo29139tr(boolean z) {
        if (z && CoreModule.m30933P().m143405a().mo180463f()) {
            CoreModule.f18264c.f20410n2.m121481a4(CoreModule.m30929H().userId(), "entry", "", false);
        }
    }
}
