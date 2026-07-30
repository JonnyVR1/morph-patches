package com.p046p1.mobile.putong.core.card.module;

import android.content.Context;
import com.p046p1.mobile.putong.core.CoreModule;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.putong.module.Module;
import p133rx.C22306c;
import p149l.roj0;

/* JADX INFO: loaded from: classes9.dex */
@Route(name = "CoreCardModule", path = "/card_module/module")
public class CoreCardModule implements Module {
    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Jh */
    public C22306c<roj0> mo28135Jh() {
        return C22306c.just(roj0.f160388a);
    }

    @Override // com.tantanapp.putong.module.Module
    /* JADX INFO: renamed from: Qh */
    public void mo28137Qh() {
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
