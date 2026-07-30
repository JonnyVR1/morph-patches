package com.p051p1.mobile.putong.core.message.module;

import android.content.Context;
import com.p051p1.mobile.putong.core.CoreModule;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.putong.module.Module;
import p137rx.C22421c;
import p153l.e4q;
import p153l.uxj0;

/* JADX INFO: loaded from: classes10.dex */
@Route(name = "CoreMessageModule", path = "/message_module/module")
public class CoreMessageModule implements Module {
    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Ai */
    public void mo30909Ai() {
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Jh */
    public C22421c<uxj0> mo29134Jh() {
        return C22421c.just(uxj0.f181467a);
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Qh */
    public void mo29136Qh() {
        e4q.m119458a();
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
