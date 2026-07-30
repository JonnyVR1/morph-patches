package com.tantanapp.android.injecter.core;

import android.content.Context;
import android.util.LruCache;
import com.tantanapp.android.injecter.facade.service.AutowiredService;
import com.tantanapp.android.injecter.facade.template.ISyringe;
import p149l.zmc0;

/* JADX INFO: loaded from: classes13.dex */
public class AutowiredServiceImpl implements AutowiredService {

    /* JADX INFO: renamed from: a */
    public LruCache<String, ISyringe> f55834a;

    @Override // com.tantanapp.android.injecter.facade.service.AutowiredService
    public void autowire(Object obj) {
        String name = obj.getClass().getName();
        ISyringe iSyringe = this.f55834a.get(name);
        if (iSyringe == null) {
            try {
                iSyringe = (ISyringe) Class.forName(obj.getClass().getName().concat("$$Injecter$$Autowired")).getConstructor(null).newInstance(null);
            } catch (Exception e) {
                zmc0.m219321a("autowire error! ", e.getMessage(), e);
                return;
            }
        }
        iSyringe.inject(obj);
        this.f55834a.put(name, iSyringe);
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
        this.f55834a = new LruCache<>(66);
    }
}
