package com.tantanapp.putong.module;

import com.tantanapp.android.injecter.facade.template.ISyringe;
import p149l.ksm;
import p149l.tqq0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedModuleHolder$$Injecter$$Autowired implements ISyringe {
    @Override // com.tantanapp.android.injecter.facade.template.ISyringe
    public void inject(Object obj) {
        Module module = (Module) ksm.m147096d().m147098a("/feed_module/module").navigation();
        ((FeedModuleHolder) obj).module = module;
        if (module != null) {
            return;
        }
        tqq0.m190155a("The field 'module' is null, in class '", FeedModuleHolder.class.getName(), "!");
    }
}
