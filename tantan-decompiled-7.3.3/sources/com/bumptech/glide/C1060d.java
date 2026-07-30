package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.bumptech.glide.d */
/* JADX INFO: loaded from: classes.dex */
public class C1060d {

    /* JADX INFO: renamed from: a */
    private final Map<Class<?>, Object> f4366a;

    /* JADX INFO: renamed from: com.bumptech.glide.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final Map<Class<?>, Object> f4367a = new HashMap();

        /* JADX INFO: renamed from: b */
        public C1060d m5353b() {
            return new C1060d(this);
        }
    }

    public C1060d(a aVar) {
        this.f4366a = Collections.unmodifiableMap(new HashMap(aVar.f4367a));
    }

    /* JADX INFO: renamed from: a */
    public boolean m5351a(Class<Object> cls) {
        return this.f4366a.containsKey(cls);
    }
}
