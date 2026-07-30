package com.p051p1.mobile.putong.core.api.inject.module;

import com.tantanapp.android.injecter.facade.template.ISyringe;
import com.tantanapp.putong.module.Module;
import p153l.mum;
import p153l.zzq0;

/* JADX INFO: loaded from: classes9.dex */
public class CoreGlobalHolder$$Injecter$$Autowired implements ISyringe {
    @Override // com.tantanapp.android.injecter.facade.template.ISyringe
    public void inject(Object obj) {
        Module module = (Module) mum.m160228d().m160230a("/core_module/module").navigation();
        ((CoreGlobalHolder) obj).globalModule = module;
        if (module != null) {
            return;
        }
        zzq0.m222278a("The field 'globalModule' is null, in class '", CoreGlobalHolder.class.getName(), "!");
    }
}
