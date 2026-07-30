package com.p051p1.mobile.putong.core.api.inject.module;

import com.tantanapp.android.injecter.facade.template.ISyringe;
import com.tantanapp.putong.module.Module;
import p153l.mum;
import p153l.zzq0;

/* JADX INFO: loaded from: classes9.dex */
public class CoreMessageHolder$$Injecter$$Autowired implements ISyringe {
    @Override // com.tantanapp.android.injecter.facade.template.ISyringe
    public void inject(Object obj) {
        Module module = (Module) mum.m160228d().m160230a("/message_module/module").navigation();
        ((CoreMessageHolder) obj).messageModule = module;
        if (module != null) {
            return;
        }
        zzq0.m222278a("The field 'messageModule' is null, in class '", CoreMessageHolder.class.getName(), "!");
    }
}
