package com.android.volley;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p149l.ixk;

/* JADX INFO: renamed from: com.android.volley.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0915a {

    /* JADX INFO: renamed from: com.android.volley.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public byte[] f4144a;

        /* JADX INFO: renamed from: b */
        public String f4145b;

        /* JADX INFO: renamed from: c */
        public long f4146c;

        /* JADX INFO: renamed from: d */
        public long f4147d;

        /* JADX INFO: renamed from: e */
        public long f4148e;

        /* JADX INFO: renamed from: f */
        public long f4149f;

        /* JADX INFO: renamed from: g */
        public Map<String, String> f4150g = Collections.EMPTY_MAP;

        /* JADX INFO: renamed from: h */
        public List<ixk> f4151h;

        /* JADX INFO: renamed from: a */
        public boolean m5083a() {
            return m5084b(System.currentTimeMillis());
        }

        /* JADX INFO: renamed from: b */
        public boolean m5084b(long j) {
            return this.f4148e < j;
        }

        /* JADX INFO: renamed from: c */
        public boolean m5085c(long j) {
            return this.f4149f < j;
        }
    }

    /* JADX INFO: renamed from: a */
    void mo5081a(String str, boolean z);

    /* JADX INFO: renamed from: b */
    void mo5082b(String str, a aVar);

    @Nullable
    a get(String str);

    void initialize();
}
