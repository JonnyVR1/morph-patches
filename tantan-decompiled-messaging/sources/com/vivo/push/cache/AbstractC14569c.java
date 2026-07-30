package com.vivo.push.cache;

import android.content.Context;
import android.text.TextUtils;
import com.vivo.push.util.C14638g;
import com.vivo.push.util.C14647p;
import com.vivo.push.util.C14654w;
import com.vivo.push.util.C14656y;
import com.vivo.push.util.ContextDelegate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.vivo.push.cache.c */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC14569c<T> {

    /* JADX INFO: renamed from: a */
    protected static final Object f60963a = new Object();

    /* JADX INFO: renamed from: b */
    protected List<T> f60964b = new ArrayList();

    /* JADX INFO: renamed from: c */
    protected Context f60965c;

    /* JADX INFO: renamed from: d */
    private byte[] f60966d;

    /* JADX INFO: renamed from: e */
    private byte[] f60967e;

    public AbstractC14569c(Context context) {
        this.f60965c = ContextDelegate.getContext(context);
        C14654w c14654wM85045b = C14654w.m85045b();
        c14654wM85045b.m85047a(this.f60965c);
        this.f60966d = c14654wM85045b.m85048c();
        this.f60967e = c14654wM85045b.m85049d();
        m84810c();
    }

    /* JADX INFO: renamed from: b */
    private String m84807b() {
        return C14656y.m85051b(this.f60965c).mo84971a(mo84800a(), null);
    }

    /* JADX INFO: renamed from: c */
    private void m84808c(String str) {
        if (TextUtils.isEmpty(str)) {
            C14647p.m85021d("CacheSettings", "ClientManager init " + mo84800a() + " strApps empty.");
            return;
        }
        if (str.length() > 10000) {
            C14647p.m85021d("CacheSettings", "sync " + mo84800a() + " strApps lenght too large");
            m84811d();
            return;
        }
        try {
            C14647p.m85021d("CacheSettings", "ClientManager init " + mo84800a() + " strApps : " + str);
            List<T> listMo84801a = mo84801a(mo84803b(str));
            if (listMo84801a != null) {
                this.f60964b.addAll(listMo84801a);
            }
        } catch (Exception e) {
            m84811d();
            C14647p.m85021d("CacheSettings", C14647p.m85011a(e));
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract String mo84800a();

    /* JADX INFO: renamed from: a */
    public abstract List<T> mo84801a(String str);

    /* JADX INFO: renamed from: b */
    public abstract String mo84803b(String str) throws Exception;

    /* JADX INFO: renamed from: d */
    public final void m84811d() {
        synchronized (f60963a) {
            this.f60964b.clear();
            m84809d("");
            C14647p.m85021d("CacheSettings", "clear " + mo84800a() + " strApps");
        }
    }

    /* JADX INFO: renamed from: e */
    public final byte[] m84812e() {
        byte[] bArr = this.f60966d;
        return (bArr == null || bArr.length <= 0) ? C14654w.m85045b().m85048c() : bArr;
    }

    /* JADX INFO: renamed from: f */
    public final byte[] m84813f() {
        byte[] bArr = this.f60967e;
        return (bArr == null || bArr.length <= 0) ? C14654w.m85045b().m85049d() : bArr;
    }

    /* JADX INFO: renamed from: d */
    private void m84809d(String str) {
        C14656y.m85051b(this.f60965c).mo84973b(mo84800a(), str);
    }

    /* JADX INFO: renamed from: c */
    public final void m84810c() {
        synchronized (f60963a) {
            C14638g.m84978a(mo84800a());
            this.f60964b.clear();
            m84808c(m84807b());
        }
    }
}
