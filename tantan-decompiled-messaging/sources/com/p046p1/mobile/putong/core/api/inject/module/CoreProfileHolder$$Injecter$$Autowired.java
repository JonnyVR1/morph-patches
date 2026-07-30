package com.p046p1.mobile.putong.core.api.inject.module;

import com.tantanapp.android.injecter.facade.template.ISyringe;
import com.tantanapp.putong.module.Module;
import p149l.ksm;
import p149l.tqq0;

/* JADX INFO: loaded from: classes9.dex */
public class CoreProfileHolder$$Injecter$$Autowired implements ISyringe {
    @Override // com.tantanapp.android.injecter.facade.template.ISyringe
    public void inject(Object obj) {
        Module module = (Module) ksm.m147096d().m147098a("/profile_module/module").navigation();
        ((CoreProfileHolder) obj).profileModule = module;
        if (module != null) {
            return;
        }
        tqq0.m190155a("The field 'profileModule' is null, in class '", CoreProfileHolder.class.getName(), "!");
    }
}
