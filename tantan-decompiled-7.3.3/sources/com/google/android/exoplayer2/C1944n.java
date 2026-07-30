package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1944n;
import com.google.android.exoplayer2.InterfaceC1886e;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p153l.bmk0;
import p153l.cj3;
import p153l.w11;

/* JADX INFO: renamed from: com.google.android.exoplayer2.n */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1944n implements InterfaceC1886e {

    /* JADX INFO: renamed from: i */
    public static final C1944n f7988i = new c().m10687a();

    /* JADX INFO: renamed from: j */
    public static final String f7989j = bmk0.m105181z0(0);

    /* JADX INFO: renamed from: k */
    public static final String f7990k = bmk0.m105181z0(1);

    /* JADX INFO: renamed from: l */
    public static final String f7991l = bmk0.m105181z0(2);

    /* JADX INFO: renamed from: m */
    public static final String f7992m = bmk0.m105181z0(3);

    /* JADX INFO: renamed from: n */
    public static final String f7993n = bmk0.m105181z0(4);

    /* JADX INFO: renamed from: o */
    public static final String f7994o = bmk0.m105181z0(5);

    /* JADX INFO: renamed from: p */
    public static final InterfaceC1886e.a<C1944n> f7995p = new InterfaceC1886e.a() { // from class: l.ssx
        @Override // com.google.android.exoplayer2.InterfaceC1886e.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC1886e mo10034a(Bundle bundle) {
            return C1944n.m10678c(bundle);
        }
    };

    /* JADX INFO: renamed from: a */
    public final String f7996a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final h f7997b;

    /* JADX INFO: renamed from: c */
    @Nullable
    @Deprecated
    public final h f7998c;

    /* JADX INFO: renamed from: d */
    public final g f7999d;

    /* JADX INFO: renamed from: e */
    public final C1945o f8000e;

    /* JADX INFO: renamed from: f */
    public final d f8001f;

    /* JADX INFO: renamed from: g */
    @Deprecated
    public final e f8002g;

    /* JADX INFO: renamed from: h */
    public final i f8003h;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.n$b */
    public static final class b implements InterfaceC1886e {

        /* JADX INFO: renamed from: c */
        public static final String f8004c = bmk0.m105181z0(0);

        /* JADX INFO: renamed from: d */
        public static final InterfaceC1886e.a<b> f8005d = new InterfaceC1886e.a() { // from class: l.tsx
            @Override // com.google.android.exoplayer2.InterfaceC1886e.a
            /* JADX INFO: renamed from: a */
            public final InterfaceC1886e mo10034a(Bundle bundle) {
                return C1944n.b.m10683b(bundle);
            }
        };

        /* JADX INFO: renamed from: a */
        public final Uri f8006a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final Object f8007b;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.n$b$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public Uri f8008a;

            /* JADX INFO: renamed from: b */
            @Nullable
            public Object f8009b;

            public a(Uri uri) {
                this.f8008a = uri;
            }

            /* JADX INFO: renamed from: c */
            public b m10686c() {
                return new b(this);
            }
        }

        public b(a aVar) {
            this.f8006a = aVar.f8008a;
            this.f8007b = aVar.f8009b;
        }

        /* JADX INFO: renamed from: b */
        public static b m10683b(Bundle bundle) {
            Uri uri = (Uri) bundle.getParcelable(f8004c);
            w11.m204369e(uri);
            return new a(uri).m10686c();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f8006a.equals(bVar.f8006a) && bmk0.m105123c(this.f8007b, bVar.f8007b);
        }

        public int hashCode() {
            int iHashCode = this.f8006a.hashCode() * 31;
            Object obj = this.f8007b;
            return iHashCode + (obj != null ? obj.hashCode() : 0);
        }

        @Override // com.google.android.exoplayer2.InterfaceC1886e
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f8004c, this.f8006a);
            return bundle;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.n$e */
    @Deprecated
    public static final class e extends d {

        /* JADX INFO: renamed from: m */
        public static final e f8040m = new d.a().m10702g();

        public e(d.a aVar) {
            super(aVar);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.n$h */
    public static final class h implements InterfaceC1886e {

        /* JADX INFO: renamed from: j */
        public static final String f8086j = bmk0.m105181z0(0);

        /* JADX INFO: renamed from: k */
        public static final String f8087k = bmk0.m105181z0(1);

        /* JADX INFO: renamed from: l */
        public static final String f8088l = bmk0.m105181z0(2);

        /* JADX INFO: renamed from: m */
        public static final String f8089m = bmk0.m105181z0(3);

        /* JADX INFO: renamed from: n */
        public static final String f8090n = bmk0.m105181z0(4);

        /* JADX INFO: renamed from: o */
        public static final String f8091o = bmk0.m105181z0(5);

        /* JADX INFO: renamed from: p */
        public static final String f8092p = bmk0.m105181z0(6);

        /* JADX INFO: renamed from: q */
        public static final InterfaceC1886e.a<h> f8093q = new InterfaceC1886e.a() { // from class: l.xsx
            @Override // com.google.android.exoplayer2.InterfaceC1886e.a
            /* JADX INFO: renamed from: a */
            public final InterfaceC1886e mo10034a(Bundle bundle) {
                return C1944n.h.m10743b(bundle);
            }
        };

        /* JADX INFO: renamed from: a */
        public final Uri f8094a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final String f8095b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public final f f8096c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public final b f8097d;

        /* JADX INFO: renamed from: e */
        public final List<StreamKey> f8098e;

        /* JADX INFO: renamed from: f */
        @Nullable
        public final String f8099f;

        /* JADX INFO: renamed from: g */
        public final ImmutableList<k> f8100g;

        /* JADX INFO: renamed from: h */
        @Deprecated
        public final List<j> f8101h;

        /* JADX INFO: renamed from: i */
        @Nullable
        public final Object f8102i;

        public h(Uri uri, @Nullable String str, @Nullable f fVar, @Nullable b bVar, List<StreamKey> list, @Nullable String str2, ImmutableList<k> immutableList, @Nullable Object obj) {
            this.f8094a = uri;
            this.f8095b = str;
            this.f8096c = fVar;
            this.f8097d = bVar;
            this.f8098e = list;
            this.f8099f = str2;
            this.f8100g = immutableList;
            ImmutableList.C2804a c2804aBuilder = ImmutableList.builder();
            for (int i = 0; i < immutableList.size(); i++) {
                c2804aBuilder.mo15737a(immutableList.get(i).m10754b().m10764j());
            }
            this.f8101h = c2804aBuilder.m15756m();
            this.f8102i = obj;
        }

        /* JADX INFO: renamed from: b */
        public static h m10743b(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(f8088l);
            f fVar = bundle2 == null ? null : (f) f.f8049t.mo10034a(bundle2);
            Bundle bundle3 = bundle.getBundle(f8089m);
            b bVar = bundle3 != null ? (b) b.f8005d.mo10034a(bundle3) : null;
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f8090n);
            ImmutableList immutableListM15739of = parcelableArrayList == null ? ImmutableList.m15739of() : cj3.m110054d(new InterfaceC1886e.a() { // from class: l.ysx
                @Override // com.google.android.exoplayer2.InterfaceC1886e.a
                /* JADX INFO: renamed from: a */
                public final InterfaceC1886e mo10034a(Bundle bundle4) {
                    return StreamKey.m10857b(bundle4);
                }
            }, parcelableArrayList);
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(f8092p);
            return new h((Uri) w11.m204369e((Uri) bundle.getParcelable(f8086j)), bundle.getString(f8087k), fVar, bVar, immutableListM15739of, bundle.getString(f8091o), parcelableArrayList2 == null ? ImmutableList.m15739of() : cj3.m110054d(k.f8121o, parcelableArrayList2), null);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f8094a.equals(hVar.f8094a) && bmk0.m105123c(this.f8095b, hVar.f8095b) && bmk0.m105123c(this.f8096c, hVar.f8096c) && bmk0.m105123c(this.f8097d, hVar.f8097d) && this.f8098e.equals(hVar.f8098e) && bmk0.m105123c(this.f8099f, hVar.f8099f) && this.f8100g.equals(hVar.f8100g) && bmk0.m105123c(this.f8102i, hVar.f8102i);
        }

        public int hashCode() {
            int iHashCode = this.f8094a.hashCode() * 31;
            String str = this.f8095b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            f fVar = this.f8096c;
            int iHashCode3 = (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
            b bVar = this.f8097d;
            int iHashCode4 = (((iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.f8098e.hashCode()) * 31;
            String str2 = this.f8099f;
            int iHashCode5 = (((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f8100g.hashCode()) * 31;
            Object obj = this.f8102i;
            return iHashCode5 + (obj != null ? obj.hashCode() : 0);
        }

        @Override // com.google.android.exoplayer2.InterfaceC1886e
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f8086j, this.f8094a);
            String str = this.f8095b;
            if (str != null) {
                bundle.putString(f8087k, str);
            }
            f fVar = this.f8096c;
            if (fVar != null) {
                bundle.putBundle(f8088l, fVar.toBundle());
            }
            b bVar = this.f8097d;
            if (bVar != null) {
                bundle.putBundle(f8089m, bVar.toBundle());
            }
            if (!this.f8098e.isEmpty()) {
                bundle.putParcelableArrayList(f8090n, cj3.m110059i(this.f8098e));
            }
            String str2 = this.f8099f;
            if (str2 != null) {
                bundle.putString(f8091o, str2);
            }
            if (!this.f8100g.isEmpty()) {
                bundle.putParcelableArrayList(f8092p, cj3.m110059i(this.f8100g));
            }
            return bundle;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.n$i */
    public static final class i implements InterfaceC1886e {

        /* JADX INFO: renamed from: d */
        public static final i f8103d = new a().m10748d();

        /* JADX INFO: renamed from: e */
        public static final String f8104e = bmk0.m105181z0(0);

        /* JADX INFO: renamed from: f */
        public static final String f8105f = bmk0.m105181z0(1);

        /* JADX INFO: renamed from: g */
        public static final String f8106g = bmk0.m105181z0(2);

        /* JADX INFO: renamed from: h */
        public static final InterfaceC1886e.a<i> f8107h = new InterfaceC1886e.a() { // from class: l.zsx
            @Override // com.google.android.exoplayer2.InterfaceC1886e.a
            /* JADX INFO: renamed from: a */
            public final InterfaceC1886e mo10034a(Bundle bundle) {
                return new C1944n.i.a().m10750f((Uri) bundle.getParcelable(C1944n.i.f8104e)).m10751g(bundle.getString(C1944n.i.f8105f)).m10749e(bundle.getBundle(C1944n.i.f8106g)).m10748d();
            }
        };

        /* JADX INFO: renamed from: a */
        @Nullable
        public final Uri f8108a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final String f8109b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public final Bundle f8110c;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.n$i$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            @Nullable
            public Uri f8111a;

            /* JADX INFO: renamed from: b */
            @Nullable
            public String f8112b;

            /* JADX INFO: renamed from: c */
            @Nullable
            public Bundle f8113c;

            /* JADX INFO: renamed from: d */
            public i m10748d() {
                return new i(this);
            }

            /* JADX INFO: renamed from: e */
            public a m10749e(@Nullable Bundle bundle) {
                this.f8113c = bundle;
                return this;
            }

            /* JADX INFO: renamed from: f */
            public a m10750f(@Nullable Uri uri) {
                this.f8111a = uri;
                return this;
            }

            /* JADX INFO: renamed from: g */
            public a m10751g(@Nullable String str) {
                this.f8112b = str;
                return this;
            }
        }

        public i(a aVar) {
            this.f8108a = aVar.f8111a;
            this.f8109b = aVar.f8112b;
            this.f8110c = aVar.f8113c;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return bmk0.m105123c(this.f8108a, iVar.f8108a) && bmk0.m105123c(this.f8109b, iVar.f8109b);
        }

        public int hashCode() {
            Uri uri = this.f8108a;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f8109b;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // com.google.android.exoplayer2.InterfaceC1886e
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            Uri uri = this.f8108a;
            if (uri != null) {
                bundle.putParcelable(f8104e, uri);
            }
            String str = this.f8109b;
            if (str != null) {
                bundle.putString(f8105f, str);
            }
            Bundle bundle2 = this.f8110c;
            if (bundle2 != null) {
                bundle.putBundle(f8106g, bundle2);
            }
            return bundle;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.n$j */
    @Deprecated
    public static final class j extends k {
        public j(k.a aVar) {
            super(aVar);
        }
    }

    public C1944n(String str, e eVar, @Nullable h hVar, g gVar, C1945o c1945o, i iVar) {
        this.f7996a = str;
        this.f7997b = hVar;
        this.f7998c = hVar;
        this.f7999d = gVar;
        this.f8000e = c1945o;
        this.f8001f = eVar;
        this.f8002g = eVar;
        this.f8003h = iVar;
    }

    /* JADX INFO: renamed from: c */
    public static C1944n m10678c(Bundle bundle) {
        String str = (String) w11.m204369e(bundle.getString(f7989j, ""));
        Bundle bundle2 = bundle.getBundle(f7990k);
        g gVar = bundle2 == null ? g.f8069f : (g) g.f8075l.mo10034a(bundle2);
        Bundle bundle3 = bundle.getBundle(f7991l);
        C1945o c1945o = bundle3 == null ? C1945o.f8140I : (C1945o) C1945o.f8161S0.mo10034a(bundle3);
        Bundle bundle4 = bundle.getBundle(f7992m);
        e eVar = bundle4 == null ? e.f8040m : (e) d.f8029l.mo10034a(bundle4);
        Bundle bundle5 = bundle.getBundle(f7993n);
        i iVar = bundle5 == null ? i.f8103d : (i) i.f8107h.mo10034a(bundle5);
        Bundle bundle6 = bundle.getBundle(f7994o);
        return new C1944n(str, eVar, bundle6 == null ? null : (h) h.f8093q.mo10034a(bundle6), gVar, c1945o, iVar);
    }

    /* JADX INFO: renamed from: d */
    public static C1944n m10679d(String str) {
        return new c().m10693g(str).m10687a();
    }

    /* JADX INFO: renamed from: e */
    private Bundle m10680e(boolean z) {
        h hVar;
        Bundle bundle = new Bundle();
        if (!this.f7996a.equals("")) {
            bundle.putString(f7989j, this.f7996a);
        }
        if (!this.f7999d.equals(g.f8069f)) {
            bundle.putBundle(f7990k, this.f7999d.toBundle());
        }
        if (!this.f8000e.equals(C1945o.f8140I)) {
            bundle.putBundle(f7991l, this.f8000e.toBundle());
        }
        if (!this.f8001f.equals(d.f8023f)) {
            bundle.putBundle(f7992m, this.f8001f.toBundle());
        }
        if (!this.f8003h.equals(i.f8103d)) {
            bundle.putBundle(f7993n, this.f8003h.toBundle());
        }
        if (z && (hVar = this.f7997b) != null) {
            bundle.putBundle(f7994o, hVar.toBundle());
        }
        return bundle;
    }

    /* JADX INFO: renamed from: b */
    public c m10681b() {
        return new c();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1944n)) {
            return false;
        }
        C1944n c1944n = (C1944n) obj;
        return bmk0.m105123c(this.f7996a, c1944n.f7996a) && this.f8001f.equals(c1944n.f8001f) && bmk0.m105123c(this.f7997b, c1944n.f7997b) && bmk0.m105123c(this.f7999d, c1944n.f7999d) && bmk0.m105123c(this.f8000e, c1944n.f8000e) && bmk0.m105123c(this.f8003h, c1944n.f8003h);
    }

    public int hashCode() {
        int iHashCode = this.f7996a.hashCode() * 31;
        h hVar = this.f7997b;
        return ((((((((iHashCode + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.f7999d.hashCode()) * 31) + this.f8001f.hashCode()) * 31) + this.f8000e.hashCode()) * 31) + this.f8003h.hashCode();
    }

    @Override // com.google.android.exoplayer2.InterfaceC1886e
    public Bundle toBundle() {
        return m10680e(false);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.n$d */
    public static class d implements InterfaceC1886e {

        /* JADX INFO: renamed from: f */
        public static final d f8023f = new a().m10701f();

        /* JADX INFO: renamed from: g */
        public static final String f8024g = bmk0.m105181z0(0);

        /* JADX INFO: renamed from: h */
        public static final String f8025h = bmk0.m105181z0(1);

        /* JADX INFO: renamed from: i */
        public static final String f8026i = bmk0.m105181z0(2);

        /* JADX INFO: renamed from: j */
        public static final String f8027j = bmk0.m105181z0(3);

        /* JADX INFO: renamed from: k */
        public static final String f8028k = bmk0.m105181z0(4);

        /* JADX INFO: renamed from: l */
        public static final InterfaceC1886e.a<e> f8029l = new InterfaceC1886e.a() { // from class: l.usx
            @Override // com.google.android.exoplayer2.InterfaceC1886e.a
            /* JADX INFO: renamed from: a */
            public final InterfaceC1886e mo10034a(Bundle bundle) {
                return C1944n.d.m10694a(bundle);
            }
        };

        /* JADX INFO: renamed from: a */
        @IntRange(from = 0)
        public final long f8030a;

        /* JADX INFO: renamed from: b */
        public final long f8031b;

        /* JADX INFO: renamed from: c */
        public final boolean f8032c;

        /* JADX INFO: renamed from: d */
        public final boolean f8033d;

        /* JADX INFO: renamed from: e */
        public final boolean f8034e;

        public d(a aVar) {
            this.f8030a = aVar.f8035a;
            this.f8031b = aVar.f8036b;
            this.f8032c = aVar.f8037c;
            this.f8033d = aVar.f8038d;
            this.f8034e = aVar.f8039e;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ e m10694a(Bundle bundle) {
            a aVar = new a();
            String str = f8024g;
            d dVar = f8023f;
            return aVar.m10706k(bundle.getLong(str, dVar.f8030a)).m10703h(bundle.getLong(f8025h, dVar.f8031b)).m10705j(bundle.getBoolean(f8026i, dVar.f8032c)).m10704i(bundle.getBoolean(f8027j, dVar.f8033d)).m10707l(bundle.getBoolean(f8028k, dVar.f8034e)).m10702g();
        }

        /* JADX INFO: renamed from: b */
        public a m10695b() {
            return new a();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f8030a == dVar.f8030a && this.f8031b == dVar.f8031b && this.f8032c == dVar.f8032c && this.f8033d == dVar.f8033d && this.f8034e == dVar.f8034e;
        }

        public int hashCode() {
            long j = this.f8030a;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            long j2 = this.f8031b;
            return ((((((i + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.f8032c ? 1 : 0)) * 31) + (this.f8033d ? 1 : 0)) * 31) + (this.f8034e ? 1 : 0);
        }

        @Override // com.google.android.exoplayer2.InterfaceC1886e
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            long j = this.f8030a;
            d dVar = f8023f;
            if (j != dVar.f8030a) {
                bundle.putLong(f8024g, j);
            }
            long j2 = this.f8031b;
            if (j2 != dVar.f8031b) {
                bundle.putLong(f8025h, j2);
            }
            boolean z = this.f8032c;
            if (z != dVar.f8032c) {
                bundle.putBoolean(f8026i, z);
            }
            boolean z2 = this.f8033d;
            if (z2 != dVar.f8033d) {
                bundle.putBoolean(f8027j, z2);
            }
            boolean z3 = this.f8034e;
            if (z3 != dVar.f8034e) {
                bundle.putBoolean(f8028k, z3);
            }
            return bundle;
        }

        /* JADX INFO: renamed from: com.google.android.exoplayer2.n$d$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public long f8035a;

            /* JADX INFO: renamed from: b */
            public long f8036b;

            /* JADX INFO: renamed from: c */
            public boolean f8037c;

            /* JADX INFO: renamed from: d */
            public boolean f8038d;

            /* JADX INFO: renamed from: e */
            public boolean f8039e;

            public a(d dVar) {
                this.f8035a = dVar.f8030a;
                this.f8036b = dVar.f8031b;
                this.f8037c = dVar.f8032c;
                this.f8038d = dVar.f8033d;
                this.f8039e = dVar.f8034e;
            }

            /* JADX INFO: renamed from: f */
            public d m10701f() {
                return m10702g();
            }

            @Deprecated
            /* JADX INFO: renamed from: g */
            public e m10702g() {
                return new e(this);
            }

            /* JADX INFO: renamed from: h */
            public a m10703h(long j) {
                w11.m204365a(j == Long.MIN_VALUE || j >= 0);
                this.f8036b = j;
                return this;
            }

            /* JADX INFO: renamed from: i */
            public a m10704i(boolean z) {
                this.f8038d = z;
                return this;
            }

            /* JADX INFO: renamed from: j */
            public a m10705j(boolean z) {
                this.f8037c = z;
                return this;
            }

            /* JADX INFO: renamed from: k */
            public a m10706k(@IntRange(from = 0) long j) {
                w11.m204365a(j >= 0);
                this.f8035a = j;
                return this;
            }

            /* JADX INFO: renamed from: l */
            public a m10707l(boolean z) {
                this.f8039e = z;
                return this;
            }

            public a() {
                this.f8036b = Long.MIN_VALUE;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.n$g */
    public static final class g implements InterfaceC1886e {

        /* JADX INFO: renamed from: f */
        public static final g f8069f = new a().m10736f();

        /* JADX INFO: renamed from: g */
        public static final String f8070g = bmk0.m105181z0(0);

        /* JADX INFO: renamed from: h */
        public static final String f8071h = bmk0.m105181z0(1);

        /* JADX INFO: renamed from: i */
        public static final String f8072i = bmk0.m105181z0(2);

        /* JADX INFO: renamed from: j */
        public static final String f8073j = bmk0.m105181z0(3);

        /* JADX INFO: renamed from: k */
        public static final String f8074k = bmk0.m105181z0(4);

        /* JADX INFO: renamed from: l */
        public static final InterfaceC1886e.a<g> f8075l = new InterfaceC1886e.a() { // from class: l.wsx
            @Override // com.google.android.exoplayer2.InterfaceC1886e.a
            /* JADX INFO: renamed from: a */
            public final InterfaceC1886e mo10034a(Bundle bundle) {
                return C1944n.g.m10729a(bundle);
            }
        };

        /* JADX INFO: renamed from: a */
        public final long f8076a;

        /* JADX INFO: renamed from: b */
        public final long f8077b;

        /* JADX INFO: renamed from: c */
        public final long f8078c;

        /* JADX INFO: renamed from: d */
        public final float f8079d;

        /* JADX INFO: renamed from: e */
        public final float f8080e;

        public g(a aVar) {
            this(aVar.f8081a, aVar.f8082b, aVar.f8083c, aVar.f8084d, aVar.f8085e);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ g m10729a(Bundle bundle) {
            String str = f8070g;
            g gVar = f8069f;
            return new g(bundle.getLong(str, gVar.f8076a), bundle.getLong(f8071h, gVar.f8077b), bundle.getLong(f8072i, gVar.f8078c), bundle.getFloat(f8073j, gVar.f8079d), bundle.getFloat(f8074k, gVar.f8080e));
        }

        /* JADX INFO: renamed from: b */
        public a m10730b() {
            return new a();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f8076a == gVar.f8076a && this.f8077b == gVar.f8077b && this.f8078c == gVar.f8078c && this.f8079d == gVar.f8079d && this.f8080e == gVar.f8080e;
        }

        public int hashCode() {
            long j = this.f8076a;
            long j2 = this.f8077b;
            int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f8078c;
            int i2 = (i + ((int) ((j3 >>> 32) ^ j3))) * 31;
            float f = this.f8079d;
            int iFloatToIntBits = (i2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
            float f2 = this.f8080e;
            return iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
        }

        @Override // com.google.android.exoplayer2.InterfaceC1886e
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            long j = this.f8076a;
            g gVar = f8069f;
            if (j != gVar.f8076a) {
                bundle.putLong(f8070g, j);
            }
            long j2 = this.f8077b;
            if (j2 != gVar.f8077b) {
                bundle.putLong(f8071h, j2);
            }
            long j3 = this.f8078c;
            if (j3 != gVar.f8078c) {
                bundle.putLong(f8072i, j3);
            }
            float f = this.f8079d;
            if (f != gVar.f8079d) {
                bundle.putFloat(f8073j, f);
            }
            float f2 = this.f8080e;
            if (f2 != gVar.f8080e) {
                bundle.putFloat(f8074k, f2);
            }
            return bundle;
        }

        /* JADX INFO: renamed from: com.google.android.exoplayer2.n$g$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public long f8081a;

            /* JADX INFO: renamed from: b */
            public long f8082b;

            /* JADX INFO: renamed from: c */
            public long f8083c;

            /* JADX INFO: renamed from: d */
            public float f8084d;

            /* JADX INFO: renamed from: e */
            public float f8085e;

            public a(g gVar) {
                this.f8081a = gVar.f8076a;
                this.f8082b = gVar.f8077b;
                this.f8083c = gVar.f8078c;
                this.f8084d = gVar.f8079d;
                this.f8085e = gVar.f8080e;
            }

            /* JADX INFO: renamed from: f */
            public g m10736f() {
                return new g(this);
            }

            /* JADX INFO: renamed from: g */
            public a m10737g(long j) {
                this.f8083c = j;
                return this;
            }

            /* JADX INFO: renamed from: h */
            public a m10738h(float f) {
                this.f8085e = f;
                return this;
            }

            /* JADX INFO: renamed from: i */
            public a m10739i(long j) {
                this.f8082b = j;
                return this;
            }

            /* JADX INFO: renamed from: j */
            public a m10740j(float f) {
                this.f8084d = f;
                return this;
            }

            /* JADX INFO: renamed from: k */
            public a m10741k(long j) {
                this.f8081a = j;
                return this;
            }

            public a() {
                this.f8081a = -9223372036854775807L;
                this.f8082b = -9223372036854775807L;
                this.f8083c = -9223372036854775807L;
                this.f8084d = -3.4028235E38f;
                this.f8085e = -3.4028235E38f;
            }
        }

        @Deprecated
        public g(long j, long j2, long j3, float f, float f2) {
            this.f8076a = j;
            this.f8077b = j2;
            this.f8078c = j3;
            this.f8079d = f;
            this.f8080e = f2;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.n$k */
    public static class k implements InterfaceC1886e {

        /* JADX INFO: renamed from: h */
        public static final String f8114h = bmk0.m105181z0(0);

        /* JADX INFO: renamed from: i */
        public static final String f8115i = bmk0.m105181z0(1);

        /* JADX INFO: renamed from: j */
        public static final String f8116j = bmk0.m105181z0(2);

        /* JADX INFO: renamed from: k */
        public static final String f8117k = bmk0.m105181z0(3);

        /* JADX INFO: renamed from: l */
        public static final String f8118l = bmk0.m105181z0(4);

        /* JADX INFO: renamed from: m */
        public static final String f8119m = bmk0.m105181z0(5);

        /* JADX INFO: renamed from: n */
        public static final String f8120n = bmk0.m105181z0(6);

        /* JADX INFO: renamed from: o */
        public static final InterfaceC1886e.a<k> f8121o = new InterfaceC1886e.a() { // from class: l.atx
            @Override // com.google.android.exoplayer2.InterfaceC1886e.a
            /* JADX INFO: renamed from: a */
            public final InterfaceC1886e mo10034a(Bundle bundle) {
                return C1944n.k.m10753c(bundle);
            }
        };

        /* JADX INFO: renamed from: a */
        public final Uri f8122a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final String f8123b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public final String f8124c;

        /* JADX INFO: renamed from: d */
        public final int f8125d;

        /* JADX INFO: renamed from: e */
        public final int f8126e;

        /* JADX INFO: renamed from: f */
        @Nullable
        public final String f8127f;

        /* JADX INFO: renamed from: g */
        @Nullable
        public final String f8128g;

        public k(a aVar) {
            this.f8122a = aVar.f8129a;
            this.f8123b = aVar.f8130b;
            this.f8124c = aVar.f8131c;
            this.f8125d = aVar.f8132d;
            this.f8126e = aVar.f8133e;
            this.f8127f = aVar.f8134f;
            this.f8128g = aVar.f8135g;
        }

        /* JADX INFO: renamed from: c */
        public static k m10753c(Bundle bundle) {
            Uri uri = (Uri) w11.m204369e((Uri) bundle.getParcelable(f8114h));
            String string = bundle.getString(f8115i);
            String string2 = bundle.getString(f8116j);
            int i = bundle.getInt(f8117k, 0);
            int i2 = bundle.getInt(f8118l, 0);
            String string3 = bundle.getString(f8119m);
            return new a(uri).m10768n(string).m10767m(string2).m10770p(i).m10769o(i2).m10766l(string3).m10765k(bundle.getString(f8120n)).m10763i();
        }

        /* JADX INFO: renamed from: b */
        public a m10754b() {
            return new a();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.f8122a.equals(kVar.f8122a) && bmk0.m105123c(this.f8123b, kVar.f8123b) && bmk0.m105123c(this.f8124c, kVar.f8124c) && this.f8125d == kVar.f8125d && this.f8126e == kVar.f8126e && bmk0.m105123c(this.f8127f, kVar.f8127f) && bmk0.m105123c(this.f8128g, kVar.f8128g);
        }

        public int hashCode() {
            int iHashCode = this.f8122a.hashCode() * 31;
            String str = this.f8123b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f8124c;
            int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f8125d) * 31) + this.f8126e) * 31;
            String str3 = this.f8127f;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f8128g;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // com.google.android.exoplayer2.InterfaceC1886e
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f8114h, this.f8122a);
            String str = this.f8123b;
            if (str != null) {
                bundle.putString(f8115i, str);
            }
            String str2 = this.f8124c;
            if (str2 != null) {
                bundle.putString(f8116j, str2);
            }
            int i = this.f8125d;
            if (i != 0) {
                bundle.putInt(f8117k, i);
            }
            int i2 = this.f8126e;
            if (i2 != 0) {
                bundle.putInt(f8118l, i2);
            }
            String str3 = this.f8127f;
            if (str3 != null) {
                bundle.putString(f8119m, str3);
            }
            String str4 = this.f8128g;
            if (str4 != null) {
                bundle.putString(f8120n, str4);
            }
            return bundle;
        }

        /* JADX INFO: renamed from: com.google.android.exoplayer2.n$k$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public Uri f8129a;

            /* JADX INFO: renamed from: b */
            @Nullable
            public String f8130b;

            /* JADX INFO: renamed from: c */
            @Nullable
            public String f8131c;

            /* JADX INFO: renamed from: d */
            public int f8132d;

            /* JADX INFO: renamed from: e */
            public int f8133e;

            /* JADX INFO: renamed from: f */
            @Nullable
            public String f8134f;

            /* JADX INFO: renamed from: g */
            @Nullable
            public String f8135g;

            public a(k kVar) {
                this.f8129a = kVar.f8122a;
                this.f8130b = kVar.f8123b;
                this.f8131c = kVar.f8124c;
                this.f8132d = kVar.f8125d;
                this.f8133e = kVar.f8126e;
                this.f8134f = kVar.f8127f;
                this.f8135g = kVar.f8128g;
            }

            /* JADX INFO: renamed from: i */
            public k m10763i() {
                return new k(this);
            }

            /* JADX INFO: renamed from: j */
            public final j m10764j() {
                return new j(this);
            }

            /* JADX INFO: renamed from: k */
            public a m10765k(@Nullable String str) {
                this.f8135g = str;
                return this;
            }

            /* JADX INFO: renamed from: l */
            public a m10766l(@Nullable String str) {
                this.f8134f = str;
                return this;
            }

            /* JADX INFO: renamed from: m */
            public a m10767m(@Nullable String str) {
                this.f8131c = str;
                return this;
            }

            /* JADX INFO: renamed from: n */
            public a m10768n(@Nullable String str) {
                this.f8130b = str;
                return this;
            }

            /* JADX INFO: renamed from: o */
            public a m10769o(int i) {
                this.f8133e = i;
                return this;
            }

            /* JADX INFO: renamed from: p */
            public a m10770p(int i) {
                this.f8132d = i;
                return this;
            }

            public a(Uri uri) {
                this.f8129a = uri;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.n$f */
    public static final class f implements InterfaceC1886e {

        /* JADX INFO: renamed from: l */
        public static final String f8041l = bmk0.m105181z0(0);

        /* JADX INFO: renamed from: m */
        public static final String f8042m = bmk0.m105181z0(1);

        /* JADX INFO: renamed from: n */
        public static final String f8043n = bmk0.m105181z0(2);

        /* JADX INFO: renamed from: o */
        public static final String f8044o = bmk0.m105181z0(3);

        /* JADX INFO: renamed from: p */
        public static final String f8045p = bmk0.m105181z0(4);

        /* JADX INFO: renamed from: q */
        public static final String f8046q = bmk0.m105181z0(5);

        /* JADX INFO: renamed from: r */
        public static final String f8047r = bmk0.m105181z0(6);

        /* JADX INFO: renamed from: s */
        public static final String f8048s = bmk0.m105181z0(7);

        /* JADX INFO: renamed from: t */
        public static final InterfaceC1886e.a<f> f8049t = new InterfaceC1886e.a() { // from class: l.vsx
            @Override // com.google.android.exoplayer2.InterfaceC1886e.a
            /* JADX INFO: renamed from: a */
            public final InterfaceC1886e mo10034a(Bundle bundle) {
                return C1944n.f.m10710d(bundle);
            }
        };

        /* JADX INFO: renamed from: a */
        public final UUID f8050a;

        /* JADX INFO: renamed from: b */
        @Deprecated
        public final UUID f8051b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public final Uri f8052c;

        /* JADX INFO: renamed from: d */
        @Deprecated
        public final ImmutableMap<String, String> f8053d;

        /* JADX INFO: renamed from: e */
        public final ImmutableMap<String, String> f8054e;

        /* JADX INFO: renamed from: f */
        public final boolean f8055f;

        /* JADX INFO: renamed from: g */
        public final boolean f8056g;

        /* JADX INFO: renamed from: h */
        public final boolean f8057h;

        /* JADX INFO: renamed from: i */
        @Deprecated
        public final ImmutableList<Integer> f8058i;

        /* JADX INFO: renamed from: j */
        public final ImmutableList<Integer> f8059j;

        /* JADX INFO: renamed from: k */
        @Nullable
        public final byte[] f8060k;

        public f(a aVar) {
            w11.m204371g((aVar.f8066f && aVar.f8062b == null) ? false : true);
            UUID uuid = (UUID) w11.m204369e(aVar.f8061a);
            this.f8050a = uuid;
            this.f8051b = uuid;
            this.f8052c = aVar.f8062b;
            this.f8053d = aVar.f8063c;
            this.f8054e = aVar.f8063c;
            this.f8055f = aVar.f8064d;
            this.f8057h = aVar.f8066f;
            this.f8056g = aVar.f8065e;
            this.f8058i = aVar.f8067g;
            this.f8059j = aVar.f8067g;
            this.f8060k = aVar.f8068h != null ? Arrays.copyOf(aVar.f8068h, aVar.f8068h.length) : null;
        }

        /* JADX INFO: renamed from: d */
        public static f m10710d(Bundle bundle) {
            UUID uuidFromString = UUID.fromString((String) w11.m204369e(bundle.getString(f8041l)));
            Uri uri = (Uri) bundle.getParcelable(f8042m);
            ImmutableMap<String, String> immutableMapM110052b = cj3.m110052b(cj3.m110056f(bundle, f8043n, Bundle.EMPTY));
            boolean z = bundle.getBoolean(f8044o, false);
            boolean z2 = bundle.getBoolean(f8045p, false);
            boolean z3 = bundle.getBoolean(f8046q, false);
            ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) cj3.m110057g(bundle, f8047r, new ArrayList()));
            return new a(uuidFromString).m10726n(uri).m10725m(immutableMapM110052b).m10727o(z).m10722j(z3).m10728p(z2).m10723k(immutableListCopyOf).m10724l(bundle.getByteArray(f8048s)).m10721i();
        }

        /* JADX INFO: renamed from: c */
        public a m10711c() {
            return new a();
        }

        @Nullable
        /* JADX INFO: renamed from: e */
        public byte[] m10712e() {
            byte[] bArr = this.f8060k;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f8050a.equals(fVar.f8050a) && bmk0.m105123c(this.f8052c, fVar.f8052c) && bmk0.m105123c(this.f8054e, fVar.f8054e) && this.f8055f == fVar.f8055f && this.f8057h == fVar.f8057h && this.f8056g == fVar.f8056g && this.f8059j.equals(fVar.f8059j) && Arrays.equals(this.f8060k, fVar.f8060k);
        }

        public int hashCode() {
            int iHashCode = this.f8050a.hashCode() * 31;
            Uri uri = this.f8052c;
            return ((((((((((((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f8054e.hashCode()) * 31) + (this.f8055f ? 1 : 0)) * 31) + (this.f8057h ? 1 : 0)) * 31) + (this.f8056g ? 1 : 0)) * 31) + this.f8059j.hashCode()) * 31) + Arrays.hashCode(this.f8060k);
        }

        @Override // com.google.android.exoplayer2.InterfaceC1886e
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putString(f8041l, this.f8050a.toString());
            Uri uri = this.f8052c;
            if (uri != null) {
                bundle.putParcelable(f8042m, uri);
            }
            if (!this.f8054e.isEmpty()) {
                bundle.putBundle(f8043n, cj3.m110058h(this.f8054e));
            }
            boolean z = this.f8055f;
            if (z) {
                bundle.putBoolean(f8044o, z);
            }
            boolean z2 = this.f8056g;
            if (z2) {
                bundle.putBoolean(f8045p, z2);
            }
            boolean z3 = this.f8057h;
            if (z3) {
                bundle.putBoolean(f8046q, z3);
            }
            if (!this.f8059j.isEmpty()) {
                bundle.putIntegerArrayList(f8047r, new ArrayList<>(this.f8059j));
            }
            byte[] bArr = this.f8060k;
            if (bArr != null) {
                bundle.putByteArray(f8048s, bArr);
            }
            return bundle;
        }

        /* JADX INFO: renamed from: com.google.android.exoplayer2.n$f$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            @Nullable
            public UUID f8061a;

            /* JADX INFO: renamed from: b */
            @Nullable
            public Uri f8062b;

            /* JADX INFO: renamed from: c */
            public ImmutableMap<String, String> f8063c;

            /* JADX INFO: renamed from: d */
            public boolean f8064d;

            /* JADX INFO: renamed from: e */
            public boolean f8065e;

            /* JADX INFO: renamed from: f */
            public boolean f8066f;

            /* JADX INFO: renamed from: g */
            public ImmutableList<Integer> f8067g;

            /* JADX INFO: renamed from: h */
            @Nullable
            public byte[] f8068h;

            public a(f fVar) {
                this.f8061a = fVar.f8050a;
                this.f8062b = fVar.f8052c;
                this.f8063c = fVar.f8054e;
                this.f8064d = fVar.f8055f;
                this.f8065e = fVar.f8056g;
                this.f8066f = fVar.f8057h;
                this.f8067g = fVar.f8059j;
                this.f8068h = fVar.f8060k;
            }

            /* JADX INFO: renamed from: i */
            public f m10721i() {
                return new f(this);
            }

            /* JADX INFO: renamed from: j */
            public a m10722j(boolean z) {
                this.f8066f = z;
                return this;
            }

            /* JADX INFO: renamed from: k */
            public a m10723k(List<Integer> list) {
                this.f8067g = ImmutableList.copyOf((Collection) list);
                return this;
            }

            /* JADX INFO: renamed from: l */
            public a m10724l(@Nullable byte[] bArr) {
                this.f8068h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
                return this;
            }

            /* JADX INFO: renamed from: m */
            public a m10725m(Map<String, String> map) {
                this.f8063c = ImmutableMap.copyOf((Map) map);
                return this;
            }

            /* JADX INFO: renamed from: n */
            public a m10726n(@Nullable Uri uri) {
                this.f8062b = uri;
                return this;
            }

            /* JADX INFO: renamed from: o */
            public a m10727o(boolean z) {
                this.f8064d = z;
                return this;
            }

            /* JADX INFO: renamed from: p */
            public a m10728p(boolean z) {
                this.f8065e = z;
                return this;
            }

            public a(UUID uuid) {
                this.f8061a = uuid;
                this.f8063c = ImmutableMap.m15769of();
                this.f8067g = ImmutableList.m15739of();
            }

            @Deprecated
            public a() {
                this.f8063c = ImmutableMap.m15769of();
                this.f8067g = ImmutableList.m15739of();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.n$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        @Nullable
        public String f8010a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public Uri f8011b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public String f8012c;

        /* JADX INFO: renamed from: d */
        public d.a f8013d;

        /* JADX INFO: renamed from: e */
        public f.a f8014e;

        /* JADX INFO: renamed from: f */
        public List<StreamKey> f8015f;

        /* JADX INFO: renamed from: g */
        @Nullable
        public String f8016g;

        /* JADX INFO: renamed from: h */
        public ImmutableList<k> f8017h;

        /* JADX INFO: renamed from: i */
        @Nullable
        public b f8018i;

        /* JADX INFO: renamed from: j */
        @Nullable
        public Object f8019j;

        /* JADX INFO: renamed from: k */
        @Nullable
        public C1945o f8020k;

        /* JADX INFO: renamed from: l */
        public g.a f8021l;

        /* JADX INFO: renamed from: m */
        public i f8022m;

        public c(C1944n c1944n) {
            this();
            this.f8013d = c1944n.f8001f.m10695b();
            this.f8010a = c1944n.f7996a;
            this.f8020k = c1944n.f8000e;
            this.f8021l = c1944n.f7999d.m10730b();
            this.f8022m = c1944n.f8003h;
            h hVar = c1944n.f7997b;
            if (hVar != null) {
                this.f8016g = hVar.f8099f;
                this.f8012c = hVar.f8095b;
                this.f8011b = hVar.f8094a;
                this.f8015f = hVar.f8098e;
                this.f8017h = hVar.f8100g;
                this.f8019j = hVar.f8102i;
                f fVar = hVar.f8096c;
                this.f8014e = fVar != null ? fVar.m10711c() : new f.a();
                this.f8018i = hVar.f8097d;
            }
        }

        /* JADX INFO: renamed from: a */
        public C1944n m10687a() {
            h hVar;
            w11.m204371g(this.f8014e.f8062b == null || this.f8014e.f8061a != null);
            Uri uri = this.f8011b;
            if (uri != null) {
                hVar = new h(uri, this.f8012c, this.f8014e.f8061a != null ? this.f8014e.m10721i() : null, this.f8018i, this.f8015f, this.f8016g, this.f8017h, this.f8019j);
            } else {
                hVar = null;
            }
            String str = this.f8010a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            e eVarM10702g = this.f8013d.m10702g();
            g gVarM10736f = this.f8021l.m10736f();
            C1945o c1945o = this.f8020k;
            if (c1945o == null) {
                c1945o = C1945o.f8140I;
            }
            return new C1944n(str2, eVarM10702g, hVar, gVarM10736f, c1945o, this.f8022m);
        }

        /* JADX INFO: renamed from: b */
        public c m10688b(g gVar) {
            this.f8021l = gVar.m10730b();
            return this;
        }

        /* JADX INFO: renamed from: c */
        public c m10689c(String str) {
            this.f8010a = (String) w11.m204369e(str);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public c m10690d(List<k> list) {
            this.f8017h = ImmutableList.copyOf((Collection) list);
            return this;
        }

        /* JADX INFO: renamed from: e */
        public c m10691e(@Nullable Object obj) {
            this.f8019j = obj;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public c m10692f(@Nullable Uri uri) {
            this.f8011b = uri;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public c m10693g(@Nullable String str) {
            return m10692f(str == null ? null : Uri.parse(str));
        }

        public c() {
            this.f8013d = new d.a();
            this.f8014e = new f.a();
            this.f8015f = Collections.EMPTY_LIST;
            this.f8017h = ImmutableList.m15739of();
            this.f8021l = new g.a();
            this.f8022m = i.f8103d;
        }
    }
}
