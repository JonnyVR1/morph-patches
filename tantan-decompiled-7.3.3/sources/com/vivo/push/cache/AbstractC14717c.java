package com.vivo.push.cache;

import android.content.Context;
import android.text.TextUtils;
import com.vivo.push.util.C14786g;
import com.vivo.push.util.C14795p;
import com.vivo.push.util.C14802w;
import com.vivo.push.util.C14804y;
import com.vivo.push.util.ContextDelegate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.vivo.push.cache.c */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC14717c<T> {

    /* JADX INFO: renamed from: a */
    protected static final Object f61810a = new Object();

    /* JADX INFO: renamed from: b */
    protected List<T> f61811b = new ArrayList();

    /* JADX INFO: renamed from: c */
    protected Context f61812c;

    /* JADX INFO: renamed from: d */
    private byte[] f61813d;

    /* JADX INFO: renamed from: e */
    private byte[] f61814e;

    public AbstractC14717c(Context context) {
        this.f61812c = ContextDelegate.getContext(context);
        C14802w c14802wM86216b = C14802w.m86216b();
        c14802wM86216b.m86218a(this.f61812c);
        this.f61813d = c14802wM86216b.m86219c();
        this.f61814e = c14802wM86216b.m86220d();
        m85981c();
    }

    /* JADX INFO: renamed from: b */
    private String m85978b() {
        return C14804y.m86222b(this.f61812c).mo86142a(mo85971a(), null);
    }

    /* JADX INFO: renamed from: c */
    private void m85979c(String str) {
        if (TextUtils.isEmpty(str)) {
            C14795p.m86192d("CacheSettings", "ClientManager init " + mo85971a() + " strApps empty.");
            return;
        }
        if (str.length() > 10000) {
            C14795p.m86192d("CacheSettings", "sync " + mo85971a() + " strApps lenght too large");
            m85982d();
            return;
        }
        try {
            C14795p.m86192d("CacheSettings", "ClientManager init " + mo85971a() + " strApps : " + str);
            List<T> listMo85972a = mo85972a(mo85974b(str));
            if (listMo85972a != null) {
                this.f61811b.addAll(listMo85972a);
            }
        } catch (Exception e) {
            m85982d();
            C14795p.m86192d("CacheSettings", C14795p.m86182a(e));
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract String mo85971a();

    /* JADX INFO: renamed from: a */
    public abstract List<T> mo85972a(String str);

    /* JADX INFO: renamed from: b */
    public abstract String mo85974b(String str) throws Exception;

    /* JADX INFO: renamed from: d */
    public final void m85982d() {
        synchronized (f61810a) {
            this.f61811b.clear();
            m85980d("");
            C14795p.m86192d("CacheSettings", "clear " + mo85971a() + " strApps");
        }
    }

    /* JADX INFO: renamed from: e */
    public final byte[] m85983e() {
        byte[] bArr = this.f61813d;
        return (bArr == null || bArr.length <= 0) ? C14802w.m86216b().m86219c() : bArr;
    }

    /* JADX INFO: renamed from: f */
    public final byte[] m85984f() {
        byte[] bArr = this.f61814e;
        return (bArr == null || bArr.length <= 0) ? C14802w.m86216b().m86220d() : bArr;
    }

    /* JADX INFO: renamed from: d */
    private void m85980d(String str) {
        C14804y.m86222b(this.f61812c).mo86144b(mo85971a(), str);
    }

    /* JADX INFO: renamed from: c */
    public final void m85981c() {
        synchronized (f61810a) {
            C14786g.m86149a(mo85971a());
            this.f61811b.clear();
            m85979c(m85978b());
        }
    }
}
