package com.p000p1.mobile.putong.core.api.inject.module;

import com.tantanapp.android.injecter.facade.template.ISyringe;
import com.tantanapp.putong.module.Module;
import l.ksm;
import l.tqq0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class CorePayHolder$$Injecter$$Autowired implements ISyringe {
    public void inject(Object obj) {
        Module module = (Module) ksm.d().a("/pay_module/module").navigation();
        ((CorePayHolder) obj).payModule = module;
        if (module != null) {
            return;
        }
        tqq0.a("The field 'payModule' is null, in class '", CorePayHolder.class.getName(), "!");
    }
}
