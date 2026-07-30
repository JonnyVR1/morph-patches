package com.p046p1.mobile.putong.core.api.inject.module;

import com.tantanapp.android.injecter.facade.template.ISyringe;
import com.tantanapp.putong.module.Module;
import p149l.ksm;
import p149l.tqq0;

/* JADX INFO: loaded from: classes9.dex */
public class CoreCardHolder$$Injecter$$Autowired implements ISyringe {
    @Override // com.tantanapp.android.injecter.facade.template.ISyringe
    public void inject(Object obj) {
        Module module = (Module) ksm.m147096d().m147098a("/card_module/module").navigation();
        ((CoreCardHolder) obj).cardModule = module;
        if (module != null) {
            return;
        }
        tqq0.m190155a("The field 'cardModule' is null, in class '", CoreCardHolder.class.getName(), "!");
    }
}
