package com.tencent.cloud.p080ai.network.okhttp3.internal.connection;

import com.tencent.cloud.p080ai.network.okhttp3.AbstractC13927m;
import com.tencent.cloud.p080ai.network.okhttp3.C13858a;
import com.tencent.cloud.p080ai.network.okhttp3.C13930p;
import com.tencent.cloud.p080ai.network.okhttp3.C13933s;
import com.tencent.cloud.p080ai.network.okhttp3.Call;
import com.tencent.cloud.p080ai.network.okhttp3.internal.C13869c;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.connection.i */
/* JADX INFO: loaded from: classes12.dex */
public final class C13882i {

    /* JADX INFO: renamed from: a */
    public final C13858a f57381a;

    /* JADX INFO: renamed from: b */
    public final C13880g f57382b;

    /* JADX INFO: renamed from: c */
    public final Call f57383c;

    /* JADX INFO: renamed from: d */
    public final AbstractC13927m f57384d;

    /* JADX INFO: renamed from: e */
    public List<Proxy> f57385e;

    /* JADX INFO: renamed from: f */
    public int f57386f;

    /* JADX INFO: renamed from: g */
    public List<InetSocketAddress> f57387g;

    /* JADX INFO: renamed from: h */
    public final List<C13933s> f57388h;

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.connection.i$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final List<C13933s> f57389a;

        /* JADX INFO: renamed from: b */
        public int f57390b = 0;

        public a(List<C13933s> list) {
            this.f57389a = list;
        }

        /* JADX INFO: renamed from: a */
        public boolean m82858a() {
            return this.f57390b < this.f57389a.size();
        }
    }

    public C13882i(C13858a c13858a, C13880g c13880g, Call call, AbstractC13927m abstractC13927m) {
        List list = Collections.EMPTY_LIST;
        this.f57385e = list;
        this.f57387g = list;
        this.f57388h = new ArrayList();
        this.f57381a = c13858a;
        this.f57382b = c13880g;
        this.f57383c = call;
        this.f57384d = abstractC13927m;
        m82856a(c13858a.m82770b(), c13858a.m82768a());
    }

    /* JADX INFO: renamed from: a */
    public final void m82856a(C13930p c13930p, Proxy proxy) {
        if (proxy != null) {
            this.f57385e = Collections.singletonList(proxy);
        } else {
            List<Proxy> listSelect = this.f57381a.f57249g.select(c13930p.m83050g());
            this.f57385e = (listSelect == null || listSelect.isEmpty()) ? Collections.unmodifiableList(Arrays.asList((Object[]) new Proxy[]{Proxy.NO_PROXY}.clone())) : C13869c.m82792a(listSelect);
        }
        this.f57386f = 0;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m82857a() {
        return this.f57386f < this.f57385e.size();
    }
}
