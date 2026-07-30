package com.p000p1.mobile.putong.core.api.inject.module;

import com.tantanapp.android.injecter.facade.template.ISyringe;
import com.tantanapp.putong.module.Module;
import l.ksm;
import l.tqq0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class CoreProfileHolder$$Injecter$$Autowired implements ISyringe {
    public void inject(Object obj) {
        Module module = (Module) ksm.d().a("/profile_module/module").navigation();
        ((CoreProfileHolder) obj).profileModule = module;
        if (module != null) {
            return;
        }
        tqq0.a("The field 'profileModule' is null, in class '", CoreProfileHolder.class.getName(), "!");
    }
}
