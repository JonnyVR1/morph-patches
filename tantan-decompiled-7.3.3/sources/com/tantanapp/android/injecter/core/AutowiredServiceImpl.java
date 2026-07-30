package com.tantanapp.android.injecter.core;

import android.content.Context;
import android.util.LruCache;
import com.tantanapp.android.injecter.facade.service.AutowiredService;
import com.tantanapp.android.injecter.facade.template.ISyringe;
import p153l.evc0;

/* JADX INFO: loaded from: classes11.dex */
public class AutowiredServiceImpl implements AutowiredService {

    /* JADX INFO: renamed from: a */
    public LruCache<String, ISyringe> f56682a;

    @Override // com.tantanapp.android.injecter.facade.service.AutowiredService
    public void autowire(Object obj) {
        String name = obj.getClass().getName();
        ISyringe iSyringe = this.f56682a.get(name);
        if (iSyringe == null) {
            try {
                iSyringe = (ISyringe) Class.forName(obj.getClass().getName().concat("$$Injecter$$Autowired")).getConstructor(null).newInstance(null);
            } catch (Exception e) {
                evc0.m122777a("autowire error! ", e.getMessage(), e);
                return;
            }
        }
        iSyringe.inject(obj);
        this.f56682a.put(name, iSyringe);
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
        this.f56682a = new LruCache<>(66);
    }
}
