package com.tencent.cloud.p075ai.network.okhttp3.internal.connection;

import com.tencent.cloud.p075ai.network.okhttp3.AbstractC13764m;
import com.tencent.cloud.p075ai.network.okhttp3.C13695a;
import com.tencent.cloud.p075ai.network.okhttp3.C13767p;
import com.tencent.cloud.p075ai.network.okhttp3.C13770s;
import com.tencent.cloud.p075ai.network.okhttp3.Call;
import com.tencent.cloud.p075ai.network.okhttp3.internal.C13706c;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.connection.i */
/* JADX INFO: loaded from: classes13.dex */
public final class C13719i {

    /* JADX INFO: renamed from: a */
    public final C13695a f56533a;

    /* JADX INFO: renamed from: b */
    public final C13717g f56534b;

    /* JADX INFO: renamed from: c */
    public final Call f56535c;

    /* JADX INFO: renamed from: d */
    public final AbstractC13764m f56536d;

    /* JADX INFO: renamed from: e */
    public List<Proxy> f56537e;

    /* JADX INFO: renamed from: f */
    public int f56538f;

    /* JADX INFO: renamed from: g */
    public List<InetSocketAddress> f56539g;

    /* JADX INFO: renamed from: h */
    public final List<C13770s> f56540h;

    /* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.connection.i$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final List<C13770s> f56541a;

        /* JADX INFO: renamed from: b */
        public int f56542b = 0;

        public a(List<C13770s> list) {
            this.f56541a = list;
        }

        /* JADX INFO: renamed from: a */
        public boolean m81675a() {
            return this.f56542b < this.f56541a.size();
        }
    }

    public C13719i(C13695a c13695a, C13717g c13717g, Call call, AbstractC13764m abstractC13764m) {
        List list = Collections.EMPTY_LIST;
        this.f56537e = list;
        this.f56539g = list;
        this.f56540h = new ArrayList();
        this.f56533a = c13695a;
        this.f56534b = c13717g;
        this.f56535c = call;
        this.f56536d = abstractC13764m;
        m81673a(c13695a.m81587b(), c13695a.m81585a());
    }

    /* JADX INFO: renamed from: a */
    public final void m81673a(C13767p c13767p, Proxy proxy) {
        if (proxy != null) {
            this.f56537e = Collections.singletonList(proxy);
        } else {
            List<Proxy> listSelect = this.f56533a.f56401g.select(c13767p.m81867g());
            this.f56537e = (listSelect == null || listSelect.isEmpty()) ? Collections.unmodifiableList(Arrays.asList((Object[]) new Proxy[]{Proxy.NO_PROXY}.clone())) : C13706c.m81609a(listSelect);
        }
        this.f56538f = 0;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m81674a() {
        return this.f56538f < this.f56537e.size();
    }
}
