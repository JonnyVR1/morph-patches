package com.tantanapp.putong.module;

import com.tantanapp.android.injecter.facade.template.ISyringe;
import p153l.mum;
import p153l.zzq0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedModuleHolder$$Injecter$$Autowired implements ISyringe {
    @Override // com.tantanapp.android.injecter.facade.template.ISyringe
    public void inject(Object obj) {
        Module module = (Module) mum.m160228d().m160230a("/feed_module/module").navigation();
        ((FeedModuleHolder) obj).module = module;
        if (module != null) {
            return;
        }
        zzq0.m222278a("The field 'module' is null, in class '", FeedModuleHolder.class.getName(), "!");
    }
}
