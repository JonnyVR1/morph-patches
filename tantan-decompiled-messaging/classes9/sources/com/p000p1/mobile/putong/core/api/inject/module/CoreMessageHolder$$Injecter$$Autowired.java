package com.p000p1.mobile.putong.core.api.inject.module;

import com.tantanapp.android.injecter.facade.template.ISyringe;
import com.tantanapp.putong.module.Module;
import l.ksm;
import l.tqq0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class CoreMessageHolder$$Injecter$$Autowired implements ISyringe {
    public void inject(Object obj) {
        Module module = (Module) ksm.d().a("/message_module/module").navigation();
        ((CoreMessageHolder) obj).messageModule = module;
        if (module != null) {
            return;
        }
        tqq0.a("The field 'messageModule' is null, in class '", CoreMessageHolder.class.getName(), "!");
    }
}
