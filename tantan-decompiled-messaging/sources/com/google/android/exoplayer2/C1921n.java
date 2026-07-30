package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1921n;
import com.google.android.exoplayer2.InterfaceC1863e;
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
import p149l.oi3;
import p149l.p11;
import p149l.vck0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.n */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1921n implements InterfaceC1863e {

    /* JADX INFO: renamed from: i */
    public static final C1921n f7951i = new c().m10633a();

    /* JADX INFO: renamed from: j */
    public static final String f7952j = vck0.m197903z0(0);

    /* JADX INFO: renamed from: k */
    public static final String f7953k = vck0.m197903z0(1);

    /* JADX INFO: renamed from: l */
    public static final String f7954l = vck0.m197903z0(2);

    /* JADX INFO: renamed from: m */
    public static final String f7955m = vck0.m197903z0(3);

    /* JADX INFO: renamed from: n */
    public static final String f7956n = vck0.m197903z0(4);

    /* JADX INFO: renamed from: o */
    public static final String f7957o = vck0.m197903z0(5);

    /* JADX INFO: renamed from: p */
    public static final InterfaceC1863e.a<C1921n> f7958p = new InterfaceC1863e.a() { // from class: l.vjx
        @Override // com.google.android.exoplayer2.InterfaceC1863e.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC1863e mo9980a(Bundle bundle) {
            return C1921n.m10624c(bundle);
        }
    };

    /* JADX INFO: renamed from: a */
    public final String f7959a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final h f7960b;

    /* JADX INFO: renamed from: c */
    @Nullable
    @Deprecated
    public final h f7961c;

    /* JADX INFO: renamed from: d */
    public final g f7962d;

    /* JADX INFO: renamed from: e */
    public final C1922o f7963e;

    /* JADX INFO: renamed from: f */
    public final d f7964f;

    /* JADX INFO: renamed from: g */
    @Deprecated
    public final e f7965g;

    /* JADX INFO: renamed from: h */
    public final i f7966h;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.n$b */
    public static final class b implements InterfaceC1863e {

        /* JADX INFO: renamed from: c */
        public static final String f7967c = vck0.m197903z0(0);

        /* JADX INFO: renamed from: d */
        public static final InterfaceC1863e.a<b> f7968d = new InterfaceC1863e.a() { // from class: l.wjx
            @Override // com.google.android.exoplayer2.InterfaceC1863e.a
            /* JADX INFO: renamed from: a */
            public final InterfaceC1863e mo9980a(Bundle bundle) {
                return C1921n.b.m10629b(bundle);
            }
        };

        /* JADX INFO: renamed from: a */
        public final Uri f7969a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final Object f7970b;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.n$b$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public Uri f7971a;

            /* JADX INFO: renamed from: b */
            @Nullable
            public Object f7972b;

            public a(Uri uri) {
                this.f7971a = uri;
            }

            /* JADX INFO: renamed from: c */
            public b m10632c() {
                return new b(this);
            }
        }

        public b(a aVar) {
            this.f7969a = aVar.f7971a;
            this.f7970b = aVar.f7972b;
        }

        /* JADX INFO: renamed from: b */
        public static b m10629b(Bundle bundle) {
            Uri uri = (Uri) bundle.getParcelable(f7967c);
            p11.m167011e(uri);
            return new a(uri).m10632c();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f7969a.equals(bVar.f7969a) && vck0.m197845c(this.f7970b, bVar.f7970b);
        }

        public int hashCode() {
            int iHashCode = this.f7969a.hashCode() * 31;
            Object obj = this.f7970b;
            return iHashCode + (obj != null ? obj.hashCode() : 0);
        }

        @Override // com.google.android.exoplayer2.InterfaceC1863e
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f7967c, this.f7969a);
            return bundle;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.n$e */
    @Deprecated
    public static final class e extends d {

        /* JADX INFO: renamed from: m */
        public static final e f8003m = new d.a().m10648g();

        public e(d.a aVar) {
            super(aVar);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.n$h */
    public static final class h implements InterfaceC1863e {

        /* JADX INFO: renamed from: j */
        public static final String f8049j = vck0.m197903z0(0);

        /* JADX INFO: renamed from: k */
        public static final String f8050k = vck0.m197903z0(1);

        /* JADX INFO: renamed from: l */
        public static final String f8051l = vck0.m197903z0(2);

        /* JADX INFO: renamed from: m */
        public static final String f8052m = vck0.m197903z0(3);

        /* JADX INFO: renamed from: n */
        public static final String f8053n = vck0.m197903z0(4);

        /* JADX INFO: renamed from: o */
        public static final String f8054o = vck0.m197903z0(5);

        /* JADX INFO: renamed from: p */
        public static final String f8055p = vck0.m197903z0(6);

        /* JADX INFO: renamed from: q */
        public static final InterfaceC1863e.a<h> f8056q = new InterfaceC1863e.a() { // from class: l.akx
            @Override // com.google.android.exoplayer2.InterfaceC1863e.a
            /* JADX INFO: renamed from: a */
            public final InterfaceC1863e mo9980a(Bundle bundle) {
                return C1921n.h.m10689b(bundle);
            }
        };

        /* JADX INFO: renamed from: a */
        public final Uri f8057a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final String f8058b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public final f f8059c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public final b f8060d;

        /* JADX INFO: renamed from: e */
        public final List<StreamKey> f8061e;

        /* JADX INFO: renamed from: f */
        @Nullable
        public final String f8062f;

        /* JADX INFO: renamed from: g */
        public final ImmutableList<k> f8063g;

        /* JADX INFO: renamed from: h */
        @Deprecated
        public final List<j> f8064h;

        /* JADX INFO: renamed from: i */
        @Nullable
        public final Object f8065i;

        public h(Uri uri, @Nullable String str, @Nullable f fVar, @Nullable b bVar, List<StreamKey> list, @Nullable String str2, ImmutableList<k> immutableList, @Nullable Object obj) {
            this.f8057a = uri;
            this.f8058b = str;
            this.f8059c = fVar;
            this.f8060d = bVar;
            this.f8061e = list;
            this.f8062f = str2;
            this.f8063g = immutableList;
            ImmutableList.C2781a c2781aBuilder = ImmutableList.builder();
            for (int i = 0; i < immutableList.size(); i++) {
                c2781aBuilder.mo15683a(immutableList.get(i).m10700b().m10710j());
            }
            this.f8064h = c2781aBuilder.m15702m();
            this.f8065i = obj;
        }

        /* JADX INFO: renamed from: b */
        public static h m10689b(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(f8051l);
            f fVar = bundle2 == null ? null : (f) f.f8012t.mo9980a(bundle2);
            Bundle bundle3 = bundle.getBundle(f8052m);
            b bVar = bundle3 != null ? (b) b.f7968d.mo9980a(bundle3) : null;
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f8053n);
            ImmutableList immutableListM15685of = parcelableArrayList == null ? ImmutableList.m15685of() : oi3.m164495d(new InterfaceC1863e.a() { // from class: l.bkx
                @Override // com.google.android.exoplayer2.InterfaceC1863e.a
                /* JADX INFO: renamed from: a */
                public final InterfaceC1863e mo9980a(Bundle bundle4) {
                    return StreamKey.m10803b(bundle4);
                }
            }, parcelableArrayList);
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(f8055p);
            return new h((Uri) p11.m167011e((Uri) bundle.getParcelable(f8049j)), bundle.getString(f8050k), fVar, bVar, immutableListM15685of, bundle.getString(f8054o), parcelableArrayList2 == null ? ImmutableList.m15685of() : oi3.m164495d(k.f8084o, parcelableArrayList2), null);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f8057a.equals(hVar.f8057a) && vck0.m197845c(this.f8058b, hVar.f8058b) && vck0.m197845c(this.f8059c, hVar.f8059c) && vck0.m197845c(this.f8060d, hVar.f8060d) && this.f8061e.equals(hVar.f8061e) && vck0.m197845c(this.f8062f, hVar.f8062f) && this.f8063g.equals(hVar.f8063g) && vck0.m197845c(this.f8065i, hVar.f8065i);
        }

        public int hashCode() {
            int iHashCode = this.f8057a.hashCode() * 31;
            String str = this.f8058b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            f fVar = this.f8059c;
            int iHashCode3 = (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
            b bVar = this.f8060d;
            int iHashCode4 = (((iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.f8061e.hashCode()) * 31;
            String str2 = this.f8062f;
            int iHashCode5 = (((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f8063g.hashCode()) * 31;
            Object obj = this.f8065i;
            return iHashCode5 + (obj != null ? obj.hashCode() : 0);
        }

        @Override // com.google.android.exoplayer2.InterfaceC1863e
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f8049j, this.f8057a);
            String str = this.f8058b;
            if (str != null) {
                bundle.putString(f8050k, str);
            }
            f fVar = this.f8059c;
            if (fVar != null) {
                bundle.putBundle(f8051l, fVar.toBundle());
            }
            b bVar = this.f8060d;
            if (bVar != null) {
                bundle.putBundle(f8052m, bVar.toBundle());
            }
            if (!this.f8061e.isEmpty()) {
                bundle.putParcelableArrayList(f8053n, oi3.m164500i(this.f8061e));
            }
            String str2 = this.f8062f;
            if (str2 != null) {
                bundle.putString(f8054o, str2);
            }
            if (!this.f8063g.isEmpty()) {
                bundle.putParcelableArrayList(f8055p, oi3.m164500i(this.f8063g));
            }
            return bundle;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.n$i */
    public static final class i implements InterfaceC1863e {

        /* JADX INFO: renamed from: d */
        public static final i f8066d = new a().m10694d();

        /* JADX INFO: renamed from: e */
        public static final String f8067e = vck0.m197903z0(0);

        /* JADX INFO: renamed from: f */
        public static final String f8068f = vck0.m197903z0(1);

        /* JADX INFO: renamed from: g */
        public static final String f8069g = vck0.m197903z0(2);

        /* JADX INFO: renamed from: h */
        public static final InterfaceC1863e.a<i> f8070h = new InterfaceC1863e.a() { // from class: l.ckx
            @Override // com.google.android.exoplayer2.InterfaceC1863e.a
            /* JADX INFO: renamed from: a */
            public final InterfaceC1863e mo9980a(Bundle bundle) {
                return new C1921n.i.a().m10696f((Uri) bundle.getParcelable(C1921n.i.f8067e)).m10697g(bundle.getString(C1921n.i.f8068f)).m10695e(bundle.getBundle(C1921n.i.f8069g)).m10694d();
            }
        };

        /* JADX INFO: renamed from: a */
        @Nullable
        public final Uri f8071a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final String f8072b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public final Bundle f8073c;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.n$i$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            @Nullable
            public Uri f8074a;

            /* JADX INFO: renamed from: b */
            @Nullable
            public String f8075b;

            /* JADX INFO: renamed from: c */
            @Nullable
            public Bundle f8076c;

            /* JADX INFO: renamed from: d */
            public i m10694d() {
                return new i(this);
            }

            /* JADX INFO: renamed from: e */
            public a m10695e(@Nullable Bundle bundle) {
                this.f8076c = bundle;
                return this;
            }

            /* JADX INFO: renamed from: f */
            public a m10696f(@Nullable Uri uri) {
                this.f8074a = uri;
                return this;
            }

            /* JADX INFO: renamed from: g */
            public a m10697g(@Nullable String str) {
                this.f8075b = str;
                return this;
            }
        }

        public i(a aVar) {
            this.f8071a = aVar.f8074a;
            this.f8072b = aVar.f8075b;
            this.f8073c = aVar.f8076c;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return vck0.m197845c(this.f8071a, iVar.f8071a) && vck0.m197845c(this.f8072b, iVar.f8072b);
        }

        public int hashCode() {
            Uri uri = this.f8071a;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f8072b;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // com.google.android.exoplayer2.InterfaceC1863e
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            Uri uri = this.f8071a;
            if (uri != null) {
                bundle.putParcelable(f8067e, uri);
            }
            String str = this.f8072b;
            if (str != null) {
                bundle.putString(f8068f, str);
            }
            Bundle bundle2 = this.f8073c;
            if (bundle2 != null) {
                bundle.putBundle(f8069g, bundle2);
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

    public C1921n(String str, e eVar, @Nullable h hVar, g gVar, C1922o c1922o, i iVar) {
        this.f7959a = str;
        this.f7960b = hVar;
        this.f7961c = hVar;
        this.f7962d = gVar;
        this.f7963e = c1922o;
        this.f7964f = eVar;
        this.f7965g = eVar;
        this.f7966h = iVar;
    }

    /* JADX INFO: renamed from: c */
    public static C1921n m10624c(Bundle bundle) {
        String str = (String) p11.m167011e(bundle.getString(f7952j, ""));
        Bundle bundle2 = bundle.getBundle(f7953k);
        g gVar = bundle2 == null ? g.f8032f : (g) g.f8038l.mo9980a(bundle2);
        Bundle bundle3 = bundle.getBundle(f7954l);
        C1922o c1922o = bundle3 == null ? C1922o.f8103I : (C1922o) C1922o.f8124S0.mo9980a(bundle3);
        Bundle bundle4 = bundle.getBundle(f7955m);
        e eVar = bundle4 == null ? e.f8003m : (e) d.f7992l.mo9980a(bundle4);
        Bundle bundle5 = bundle.getBundle(f7956n);
        i iVar = bundle5 == null ? i.f8066d : (i) i.f8070h.mo9980a(bundle5);
        Bundle bundle6 = bundle.getBundle(f7957o);
        return new C1921n(str, eVar, bundle6 == null ? null : (h) h.f8056q.mo9980a(bundle6), gVar, c1922o, iVar);
    }

    /* JADX INFO: renamed from: d */
    public static C1921n m10625d(String str) {
        return new c().m10639g(str).m10633a();
    }

    /* JADX INFO: renamed from: e */
    private Bundle m10626e(boolean z) {
        h hVar;
        Bundle bundle = new Bundle();
        if (!this.f7959a.equals("")) {
            bundle.putString(f7952j, this.f7959a);
        }
        if (!this.f7962d.equals(g.f8032f)) {
            bundle.putBundle(f7953k, this.f7962d.toBundle());
        }
        if (!this.f7963e.equals(C1922o.f8103I)) {
            bundle.putBundle(f7954l, this.f7963e.toBundle());
        }
        if (!this.f7964f.equals(d.f7986f)) {
            bundle.putBundle(f7955m, this.f7964f.toBundle());
        }
        if (!this.f7966h.equals(i.f8066d)) {
            bundle.putBundle(f7956n, this.f7966h.toBundle());
        }
        if (z && (hVar = this.f7960b) != null) {
            bundle.putBundle(f7957o, hVar.toBundle());
        }
        return bundle;
    }

    /* JADX INFO: renamed from: b */
    public c m10627b() {
        return new c();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1921n)) {
            return false;
        }
        C1921n c1921n = (C1921n) obj;
        return vck0.m197845c(this.f7959a, c1921n.f7959a) && this.f7964f.equals(c1921n.f7964f) && vck0.m197845c(this.f7960b, c1921n.f7960b) && vck0.m197845c(this.f7962d, c1921n.f7962d) && vck0.m197845c(this.f7963e, c1921n.f7963e) && vck0.m197845c(this.f7966h, c1921n.f7966h);
    }

    public int hashCode() {
        int iHashCode = this.f7959a.hashCode() * 31;
        h hVar = this.f7960b;
        return ((((((((iHashCode + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.f7962d.hashCode()) * 31) + this.f7964f.hashCode()) * 31) + this.f7963e.hashCode()) * 31) + this.f7966h.hashCode();
    }

    @Override // com.google.android.exoplayer2.InterfaceC1863e
    public Bundle toBundle() {
        return m10626e(false);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.n$d */
    public static class d implements InterfaceC1863e {

        /* JADX INFO: renamed from: f */
        public static final d f7986f = new a().m10647f();

        /* JADX INFO: renamed from: g */
        public static final String f7987g = vck0.m197903z0(0);

        /* JADX INFO: renamed from: h */
        public static final String f7988h = vck0.m197903z0(1);

        /* JADX INFO: renamed from: i */
        public static final String f7989i = vck0.m197903z0(2);

        /* JADX INFO: renamed from: j */
        public static final String f7990j = vck0.m197903z0(3);

        /* JADX INFO: renamed from: k */
        public static final String f7991k = vck0.m197903z0(4);

        /* JADX INFO: renamed from: l */
        public static final InterfaceC1863e.a<e> f7992l = new InterfaceC1863e.a() { // from class: l.xjx
            @Override // com.google.android.exoplayer2.InterfaceC1863e.a
            /* JADX INFO: renamed from: a */
            public final InterfaceC1863e mo9980a(Bundle bundle) {
                return C1921n.d.m10640a(bundle);
            }
        };

        /* JADX INFO: renamed from: a */
        @IntRange(from = 0)
        public final long f7993a;

        /* JADX INFO: renamed from: b */
        public final long f7994b;

        /* JADX INFO: renamed from: c */
        public final boolean f7995c;

        /* JADX INFO: renamed from: d */
        public final boolean f7996d;

        /* JADX INFO: renamed from: e */
        public final boolean f7997e;

        public d(a aVar) {
            this.f7993a = aVar.f7998a;
            this.f7994b = aVar.f7999b;
            this.f7995c = aVar.f8000c;
            this.f7996d = aVar.f8001d;
            this.f7997e = aVar.f8002e;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ e m10640a(Bundle bundle) {
            a aVar = new a();
            String str = f7987g;
            d dVar = f7986f;
            return aVar.m10652k(bundle.getLong(str, dVar.f7993a)).m10649h(bundle.getLong(f7988h, dVar.f7994b)).m10651j(bundle.getBoolean(f7989i, dVar.f7995c)).m10650i(bundle.getBoolean(f7990j, dVar.f7996d)).m10653l(bundle.getBoolean(f7991k, dVar.f7997e)).m10648g();
        }

        /* JADX INFO: renamed from: b */
        public a m10641b() {
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
            return this.f7993a == dVar.f7993a && this.f7994b == dVar.f7994b && this.f7995c == dVar.f7995c && this.f7996d == dVar.f7996d && this.f7997e == dVar.f7997e;
        }

        public int hashCode() {
            long j = this.f7993a;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            long j2 = this.f7994b;
            return ((((((i + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.f7995c ? 1 : 0)) * 31) + (this.f7996d ? 1 : 0)) * 31) + (this.f7997e ? 1 : 0);
        }

        @Override // com.google.android.exoplayer2.InterfaceC1863e
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            long j = this.f7993a;
            d dVar = f7986f;
            if (j != dVar.f7993a) {
                bundle.putLong(f7987g, j);
            }
            long j2 = this.f7994b;
            if (j2 != dVar.f7994b) {
                bundle.putLong(f7988h, j2);
            }
            boolean z = this.f7995c;
            if (z != dVar.f7995c) {
                bundle.putBoolean(f7989i, z);
            }
            boolean z2 = this.f7996d;
            if (z2 != dVar.f7996d) {
                bundle.putBoolean(f7990j, z2);
            }
            boolean z3 = this.f7997e;
            if (z3 != dVar.f7997e) {
                bundle.putBoolean(f7991k, z3);
            }
            return bundle;
        }

        /* JADX INFO: renamed from: com.google.android.exoplayer2.n$d$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public long f7998a;

            /* JADX INFO: renamed from: b */
            public long f7999b;

            /* JADX INFO: renamed from: c */
            public boolean f8000c;

            /* JADX INFO: renamed from: d */
            public boolean f8001d;

            /* JADX INFO: renamed from: e */
            public boolean f8002e;

            public a(d dVar) {
                this.f7998a = dVar.f7993a;
                this.f7999b = dVar.f7994b;
                this.f8000c = dVar.f7995c;
                this.f8001d = dVar.f7996d;
                this.f8002e = dVar.f7997e;
            }

            /* JADX INFO: renamed from: f */
            public d m10647f() {
                return m10648g();
            }

            @Deprecated
            /* JADX INFO: renamed from: g */
            public e m10648g() {
                return new e(this);
            }

            /* JADX INFO: renamed from: h */
            public a m10649h(long j) {
                p11.m167007a(j == Long.MIN_VALUE || j >= 0);
                this.f7999b = j;
                return this;
            }

            /* JADX INFO: renamed from: i */
            public a m10650i(boolean z) {
                this.f8001d = z;
                return this;
            }

            /* JADX INFO: renamed from: j */
            public a m10651j(boolean z) {
                this.f8000c = z;
                return this;
            }

            /* JADX INFO: renamed from: k */
            public a m10652k(@IntRange(from = 0) long j) {
                p11.m167007a(j >= 0);
                this.f7998a = j;
                return this;
            }

            /* JADX INFO: renamed from: l */
            public a m10653l(boolean z) {
                this.f8002e = z;
                return this;
            }

            public a() {
                this.f7999b = Long.MIN_VALUE;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.n$g */
    public static final class g implements InterfaceC1863e {

        /* JADX INFO: renamed from: f */
        public static final g f8032f = new a().m10682f();

        /* JADX INFO: renamed from: g */
        public static final String f8033g = vck0.m197903z0(0);

        /* JADX INFO: renamed from: h */
        public static final String f8034h = vck0.m197903z0(1);

        /* JADX INFO: renamed from: i */
        public static final String f8035i = vck0.m197903z0(2);

        /* JADX INFO: renamed from: j */
        public static final String f8036j = vck0.m197903z0(3);

        /* JADX INFO: renamed from: k */
        public static final String f8037k = vck0.m197903z0(4);

        /* JADX INFO: renamed from: l */
        public static final InterfaceC1863e.a<g> f8038l = new InterfaceC1863e.a() { // from class: l.zjx
            @Override // com.google.android.exoplayer2.InterfaceC1863e.a
            /* JADX INFO: renamed from: a */
            public final InterfaceC1863e mo9980a(Bundle bundle) {
                return C1921n.g.m10675a(bundle);
            }
        };

        /* JADX INFO: renamed from: a */
        public final long f8039a;

        /* JADX INFO: renamed from: b */
        public final long f8040b;

        /* JADX INFO: renamed from: c */
        public final long f8041c;

        /* JADX INFO: renamed from: d */
        public final float f8042d;

        /* JADX INFO: renamed from: e */
        public final float f8043e;

        public g(a aVar) {
            this(aVar.f8044a, aVar.f8045b, aVar.f8046c, aVar.f8047d, aVar.f8048e);
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ g m10675a(Bundle bundle) {
            String str = f8033g;
            g gVar = f8032f;
            return new g(bundle.getLong(str, gVar.f8039a), bundle.getLong(f8034h, gVar.f8040b), bundle.getLong(f8035i, gVar.f8041c), bundle.getFloat(f8036j, gVar.f8042d), bundle.getFloat(f8037k, gVar.f8043e));
        }

        /* JADX INFO: renamed from: b */
        public a m10676b() {
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
            return this.f8039a == gVar.f8039a && this.f8040b == gVar.f8040b && this.f8041c == gVar.f8041c && this.f8042d == gVar.f8042d && this.f8043e == gVar.f8043e;
        }

        public int hashCode() {
            long j = this.f8039a;
            long j2 = this.f8040b;
            int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f8041c;
            int i2 = (i + ((int) ((j3 >>> 32) ^ j3))) * 31;
            float f = this.f8042d;
            int iFloatToIntBits = (i2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
            float f2 = this.f8043e;
            return iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
        }

        @Override // com.google.android.exoplayer2.InterfaceC1863e
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            long j = this.f8039a;
            g gVar = f8032f;
            if (j != gVar.f8039a) {
                bundle.putLong(f8033g, j);
            }
            long j2 = this.f8040b;
            if (j2 != gVar.f8040b) {
                bundle.putLong(f8034h, j2);
            }
            long j3 = this.f8041c;
            if (j3 != gVar.f8041c) {
                bundle.putLong(f8035i, j3);
            }
            float f = this.f8042d;
            if (f != gVar.f8042d) {
                bundle.putFloat(f8036j, f);
            }
            float f2 = this.f8043e;
            if (f2 != gVar.f8043e) {
                bundle.putFloat(f8037k, f2);
            }
            return bundle;
        }

        /* JADX INFO: renamed from: com.google.android.exoplayer2.n$g$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public long f8044a;

            /* JADX INFO: renamed from: b */
            public long f8045b;

            /* JADX INFO: renamed from: c */
            public long f8046c;

            /* JADX INFO: renamed from: d */
            public float f8047d;

            /* JADX INFO: renamed from: e */
            public float f8048e;

            public a(g gVar) {
                this.f8044a = gVar.f8039a;
                this.f8045b = gVar.f8040b;
                this.f8046c = gVar.f8041c;
                this.f8047d = gVar.f8042d;
                this.f8048e = gVar.f8043e;
            }

            /* JADX INFO: renamed from: f */
            public g m10682f() {
                return new g(this);
            }

            /* JADX INFO: renamed from: g */
            public a m10683g(long j) {
                this.f8046c = j;
                return this;
            }

            /* JADX INFO: renamed from: h */
            public a m10684h(float f) {
                this.f8048e = f;
                return this;
            }

            /* JADX INFO: renamed from: i */
            public a m10685i(long j) {
                this.f8045b = j;
                return this;
            }

            /* JADX INFO: renamed from: j */
            public a m10686j(float f) {
                this.f8047d = f;
                return this;
            }

            /* JADX INFO: renamed from: k */
            public a m10687k(long j) {
                this.f8044a = j;
                return this;
            }

            public a() {
                this.f8044a = -9223372036854775807L;
                this.f8045b = -9223372036854775807L;
                this.f8046c = -9223372036854775807L;
                this.f8047d = -3.4028235E38f;
                this.f8048e = -3.4028235E38f;
            }
        }

        @Deprecated
        public g(long j, long j2, long j3, float f, float f2) {
            this.f8039a = j;
            this.f8040b = j2;
            this.f8041c = j3;
            this.f8042d = f;
            this.f8043e = f2;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.n$k */
    public static class k implements InterfaceC1863e {

        /* JADX INFO: renamed from: h */
        public static final String f8077h = vck0.m197903z0(0);

        /* JADX INFO: renamed from: i */
        public static final String f8078i = vck0.m197903z0(1);

        /* JADX INFO: renamed from: j */
        public static final String f8079j = vck0.m197903z0(2);

        /* JADX INFO: renamed from: k */
        public static final String f8080k = vck0.m197903z0(3);

        /* JADX INFO: renamed from: l */
        public static final String f8081l = vck0.m197903z0(4);

        /* JADX INFO: renamed from: m */
        public static final String f8082m = vck0.m197903z0(5);

        /* JADX INFO: renamed from: n */
        public static final String f8083n = vck0.m197903z0(6);

        /* JADX INFO: renamed from: o */
        public static final InterfaceC1863e.a<k> f8084o = new InterfaceC1863e.a() { // from class: l.dkx
            @Override // com.google.android.exoplayer2.InterfaceC1863e.a
            /* JADX INFO: renamed from: a */
            public final InterfaceC1863e mo9980a(Bundle bundle) {
                return C1921n.k.m10699c(bundle);
            }
        };

        /* JADX INFO: renamed from: a */
        public final Uri f8085a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final String f8086b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public final String f8087c;

        /* JADX INFO: renamed from: d */
        public final int f8088d;

        /* JADX INFO: renamed from: e */
        public final int f8089e;

        /* JADX INFO: renamed from: f */
        @Nullable
        public final String f8090f;

        /* JADX INFO: renamed from: g */
        @Nullable
        public final String f8091g;

        public k(a aVar) {
            this.f8085a = aVar.f8092a;
            this.f8086b = aVar.f8093b;
            this.f8087c = aVar.f8094c;
            this.f8088d = aVar.f8095d;
            this.f8089e = aVar.f8096e;
            this.f8090f = aVar.f8097f;
            this.f8091g = aVar.f8098g;
        }

        /* JADX INFO: renamed from: c */
        public static k m10699c(Bundle bundle) {
            Uri uri = (Uri) p11.m167011e((Uri) bundle.getParcelable(f8077h));
            String string = bundle.getString(f8078i);
            String string2 = bundle.getString(f8079j);
            int i = bundle.getInt(f8080k, 0);
            int i2 = bundle.getInt(f8081l, 0);
            String string3 = bundle.getString(f8082m);
            return new a(uri).m10714n(string).m10713m(string2).m10716p(i).m10715o(i2).m10712l(string3).m10711k(bundle.getString(f8083n)).m10709i();
        }

        /* JADX INFO: renamed from: b */
        public a m10700b() {
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
            return this.f8085a.equals(kVar.f8085a) && vck0.m197845c(this.f8086b, kVar.f8086b) && vck0.m197845c(this.f8087c, kVar.f8087c) && this.f8088d == kVar.f8088d && this.f8089e == kVar.f8089e && vck0.m197845c(this.f8090f, kVar.f8090f) && vck0.m197845c(this.f8091g, kVar.f8091g);
        }

        public int hashCode() {
            int iHashCode = this.f8085a.hashCode() * 31;
            String str = this.f8086b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f8087c;
            int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f8088d) * 31) + this.f8089e) * 31;
            String str3 = this.f8090f;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f8091g;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // com.google.android.exoplayer2.InterfaceC1863e
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f8077h, this.f8085a);
            String str = this.f8086b;
            if (str != null) {
                bundle.putString(f8078i, str);
            }
            String str2 = this.f8087c;
            if (str2 != null) {
                bundle.putString(f8079j, str2);
            }
            int i = this.f8088d;
            if (i != 0) {
                bundle.putInt(f8080k, i);
            }
            int i2 = this.f8089e;
            if (i2 != 0) {
                bundle.putInt(f8081l, i2);
            }
            String str3 = this.f8090f;
            if (str3 != null) {
                bundle.putString(f8082m, str3);
            }
            String str4 = this.f8091g;
            if (str4 != null) {
                bundle.putString(f8083n, str4);
            }
            return bundle;
        }

        /* JADX INFO: renamed from: com.google.android.exoplayer2.n$k$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public Uri f8092a;

            /* JADX INFO: renamed from: b */
            @Nullable
            public String f8093b;

            /* JADX INFO: renamed from: c */
            @Nullable
            public String f8094c;

            /* JADX INFO: renamed from: d */
            public int f8095d;

            /* JADX INFO: renamed from: e */
            public int f8096e;

            /* JADX INFO: renamed from: f */
            @Nullable
            public String f8097f;

            /* JADX INFO: renamed from: g */
            @Nullable
            public String f8098g;

            public a(k kVar) {
                this.f8092a = kVar.f8085a;
                this.f8093b = kVar.f8086b;
                this.f8094c = kVar.f8087c;
                this.f8095d = kVar.f8088d;
                this.f8096e = kVar.f8089e;
                this.f8097f = kVar.f8090f;
                this.f8098g = kVar.f8091g;
            }

            /* JADX INFO: renamed from: i */
            public k m10709i() {
                return new k(this);
            }

            /* JADX INFO: renamed from: j */
            public final j m10710j() {
                return new j(this);
            }

            /* JADX INFO: renamed from: k */
            public a m10711k(@Nullable String str) {
                this.f8098g = str;
                return this;
            }

            /* JADX INFO: renamed from: l */
            public a m10712l(@Nullable String str) {
                this.f8097f = str;
                return this;
            }

            /* JADX INFO: renamed from: m */
            public a m10713m(@Nullable String str) {
                this.f8094c = str;
                return this;
            }

            /* JADX INFO: renamed from: n */
            public a m10714n(@Nullable String str) {
                this.f8093b = str;
                return this;
            }

            /* JADX INFO: renamed from: o */
            public a m10715o(int i) {
                this.f8096e = i;
                return this;
            }

            /* JADX INFO: renamed from: p */
            public a m10716p(int i) {
                this.f8095d = i;
                return this;
            }

            public a(Uri uri) {
                this.f8092a = uri;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.n$f */
    public static final class f implements InterfaceC1863e {

        /* JADX INFO: renamed from: l */
        public static final String f8004l = vck0.m197903z0(0);

        /* JADX INFO: renamed from: m */
        public static final String f8005m = vck0.m197903z0(1);

        /* JADX INFO: renamed from: n */
        public static final String f8006n = vck0.m197903z0(2);

        /* JADX INFO: renamed from: o */
        public static final String f8007o = vck0.m197903z0(3);

        /* JADX INFO: renamed from: p */
        public static final String f8008p = vck0.m197903z0(4);

        /* JADX INFO: renamed from: q */
        public static final String f8009q = vck0.m197903z0(5);

        /* JADX INFO: renamed from: r */
        public static final String f8010r = vck0.m197903z0(6);

        /* JADX INFO: renamed from: s */
        public static final String f8011s = vck0.m197903z0(7);

        /* JADX INFO: renamed from: t */
        public static final InterfaceC1863e.a<f> f8012t = new InterfaceC1863e.a() { // from class: l.yjx
            @Override // com.google.android.exoplayer2.InterfaceC1863e.a
            /* JADX INFO: renamed from: a */
            public final InterfaceC1863e mo9980a(Bundle bundle) {
                return C1921n.f.m10656d(bundle);
            }
        };

        /* JADX INFO: renamed from: a */
        public final UUID f8013a;

        /* JADX INFO: renamed from: b */
        @Deprecated
        public final UUID f8014b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public final Uri f8015c;

        /* JADX INFO: renamed from: d */
        @Deprecated
        public final ImmutableMap<String, String> f8016d;

        /* JADX INFO: renamed from: e */
        public final ImmutableMap<String, String> f8017e;

        /* JADX INFO: renamed from: f */
        public final boolean f8018f;

        /* JADX INFO: renamed from: g */
        public final boolean f8019g;

        /* JADX INFO: renamed from: h */
        public final boolean f8020h;

        /* JADX INFO: renamed from: i */
        @Deprecated
        public final ImmutableList<Integer> f8021i;

        /* JADX INFO: renamed from: j */
        public final ImmutableList<Integer> f8022j;

        /* JADX INFO: renamed from: k */
        @Nullable
        public final byte[] f8023k;

        public f(a aVar) {
            p11.m167013g((aVar.f8029f && aVar.f8025b == null) ? false : true);
            UUID uuid = (UUID) p11.m167011e(aVar.f8024a);
            this.f8013a = uuid;
            this.f8014b = uuid;
            this.f8015c = aVar.f8025b;
            this.f8016d = aVar.f8026c;
            this.f8017e = aVar.f8026c;
            this.f8018f = aVar.f8027d;
            this.f8020h = aVar.f8029f;
            this.f8019g = aVar.f8028e;
            this.f8021i = aVar.f8030g;
            this.f8022j = aVar.f8030g;
            this.f8023k = aVar.f8031h != null ? Arrays.copyOf(aVar.f8031h, aVar.f8031h.length) : null;
        }

        /* JADX INFO: renamed from: d */
        public static f m10656d(Bundle bundle) {
            UUID uuidFromString = UUID.fromString((String) p11.m167011e(bundle.getString(f8004l)));
            Uri uri = (Uri) bundle.getParcelable(f8005m);
            ImmutableMap<String, String> immutableMapM164493b = oi3.m164493b(oi3.m164497f(bundle, f8006n, Bundle.EMPTY));
            boolean z = bundle.getBoolean(f8007o, false);
            boolean z2 = bundle.getBoolean(f8008p, false);
            boolean z3 = bundle.getBoolean(f8009q, false);
            ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) oi3.m164498g(bundle, f8010r, new ArrayList()));
            return new a(uuidFromString).m10672n(uri).m10671m(immutableMapM164493b).m10673o(z).m10668j(z3).m10674p(z2).m10669k(immutableListCopyOf).m10670l(bundle.getByteArray(f8011s)).m10667i();
        }

        /* JADX INFO: renamed from: c */
        public a m10657c() {
            return new a();
        }

        @Nullable
        /* JADX INFO: renamed from: e */
        public byte[] m10658e() {
            byte[] bArr = this.f8023k;
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
            return this.f8013a.equals(fVar.f8013a) && vck0.m197845c(this.f8015c, fVar.f8015c) && vck0.m197845c(this.f8017e, fVar.f8017e) && this.f8018f == fVar.f8018f && this.f8020h == fVar.f8020h && this.f8019g == fVar.f8019g && this.f8022j.equals(fVar.f8022j) && Arrays.equals(this.f8023k, fVar.f8023k);
        }

        public int hashCode() {
            int iHashCode = this.f8013a.hashCode() * 31;
            Uri uri = this.f8015c;
            return ((((((((((((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f8017e.hashCode()) * 31) + (this.f8018f ? 1 : 0)) * 31) + (this.f8020h ? 1 : 0)) * 31) + (this.f8019g ? 1 : 0)) * 31) + this.f8022j.hashCode()) * 31) + Arrays.hashCode(this.f8023k);
        }

        @Override // com.google.android.exoplayer2.InterfaceC1863e
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putString(f8004l, this.f8013a.toString());
            Uri uri = this.f8015c;
            if (uri != null) {
                bundle.putParcelable(f8005m, uri);
            }
            if (!this.f8017e.isEmpty()) {
                bundle.putBundle(f8006n, oi3.m164499h(this.f8017e));
            }
            boolean z = this.f8018f;
            if (z) {
                bundle.putBoolean(f8007o, z);
            }
            boolean z2 = this.f8019g;
            if (z2) {
                bundle.putBoolean(f8008p, z2);
            }
            boolean z3 = this.f8020h;
            if (z3) {
                bundle.putBoolean(f8009q, z3);
            }
            if (!this.f8022j.isEmpty()) {
                bundle.putIntegerArrayList(f8010r, new ArrayList<>(this.f8022j));
            }
            byte[] bArr = this.f8023k;
            if (bArr != null) {
                bundle.putByteArray(f8011s, bArr);
            }
            return bundle;
        }

        /* JADX INFO: renamed from: com.google.android.exoplayer2.n$f$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            @Nullable
            public UUID f8024a;

            /* JADX INFO: renamed from: b */
            @Nullable
            public Uri f8025b;

            /* JADX INFO: renamed from: c */
            public ImmutableMap<String, String> f8026c;

            /* JADX INFO: renamed from: d */
            public boolean f8027d;

            /* JADX INFO: renamed from: e */
            public boolean f8028e;

            /* JADX INFO: renamed from: f */
            public boolean f8029f;

            /* JADX INFO: renamed from: g */
            public ImmutableList<Integer> f8030g;

            /* JADX INFO: renamed from: h */
            @Nullable
            public byte[] f8031h;

            public a(f fVar) {
                this.f8024a = fVar.f8013a;
                this.f8025b = fVar.f8015c;
                this.f8026c = fVar.f8017e;
                this.f8027d = fVar.f8018f;
                this.f8028e = fVar.f8019g;
                this.f8029f = fVar.f8020h;
                this.f8030g = fVar.f8022j;
                this.f8031h = fVar.f8023k;
            }

            /* JADX INFO: renamed from: i */
            public f m10667i() {
                return new f(this);
            }

            /* JADX INFO: renamed from: j */
            public a m10668j(boolean z) {
                this.f8029f = z;
                return this;
            }

            /* JADX INFO: renamed from: k */
            public a m10669k(List<Integer> list) {
                this.f8030g = ImmutableList.copyOf((Collection) list);
                return this;
            }

            /* JADX INFO: renamed from: l */
            public a m10670l(@Nullable byte[] bArr) {
                this.f8031h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
                return this;
            }

            /* JADX INFO: renamed from: m */
            public a m10671m(Map<String, String> map) {
                this.f8026c = ImmutableMap.copyOf((Map) map);
                return this;
            }

            /* JADX INFO: renamed from: n */
            public a m10672n(@Nullable Uri uri) {
                this.f8025b = uri;
                return this;
            }

            /* JADX INFO: renamed from: o */
            public a m10673o(boolean z) {
                this.f8027d = z;
                return this;
            }

            /* JADX INFO: renamed from: p */
            public a m10674p(boolean z) {
                this.f8028e = z;
                return this;
            }

            public a(UUID uuid) {
                this.f8024a = uuid;
                this.f8026c = ImmutableMap.m15715of();
                this.f8030g = ImmutableList.m15685of();
            }

            @Deprecated
            public a() {
                this.f8026c = ImmutableMap.m15715of();
                this.f8030g = ImmutableList.m15685of();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.n$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        @Nullable
        public String f7973a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public Uri f7974b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public String f7975c;

        /* JADX INFO: renamed from: d */
        public d.a f7976d;

        /* JADX INFO: renamed from: e */
        public f.a f7977e;

        /* JADX INFO: renamed from: f */
        public List<StreamKey> f7978f;

        /* JADX INFO: renamed from: g */
        @Nullable
        public String f7979g;

        /* JADX INFO: renamed from: h */
        public ImmutableList<k> f7980h;

        /* JADX INFO: renamed from: i */
        @Nullable
        public b f7981i;

        /* JADX INFO: renamed from: j */
        @Nullable
        public Object f7982j;

        /* JADX INFO: renamed from: k */
        @Nullable
        public C1922o f7983k;

        /* JADX INFO: renamed from: l */
        public g.a f7984l;

        /* JADX INFO: renamed from: m */
        public i f7985m;

        public c(C1921n c1921n) {
            this();
            this.f7976d = c1921n.f7964f.m10641b();
            this.f7973a = c1921n.f7959a;
            this.f7983k = c1921n.f7963e;
            this.f7984l = c1921n.f7962d.m10676b();
            this.f7985m = c1921n.f7966h;
            h hVar = c1921n.f7960b;
            if (hVar != null) {
                this.f7979g = hVar.f8062f;
                this.f7975c = hVar.f8058b;
                this.f7974b = hVar.f8057a;
                this.f7978f = hVar.f8061e;
                this.f7980h = hVar.f8063g;
                this.f7982j = hVar.f8065i;
                f fVar = hVar.f8059c;
                this.f7977e = fVar != null ? fVar.m10657c() : new f.a();
                this.f7981i = hVar.f8060d;
            }
        }

        /* JADX INFO: renamed from: a */
        public C1921n m10633a() {
            h hVar;
            p11.m167013g(this.f7977e.f8025b == null || this.f7977e.f8024a != null);
            Uri uri = this.f7974b;
            if (uri != null) {
                hVar = new h(uri, this.f7975c, this.f7977e.f8024a != null ? this.f7977e.m10667i() : null, this.f7981i, this.f7978f, this.f7979g, this.f7980h, this.f7982j);
            } else {
                hVar = null;
            }
            String str = this.f7973a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            e eVarM10648g = this.f7976d.m10648g();
            g gVarM10682f = this.f7984l.m10682f();
            C1922o c1922o = this.f7983k;
            if (c1922o == null) {
                c1922o = C1922o.f8103I;
            }
            return new C1921n(str2, eVarM10648g, hVar, gVarM10682f, c1922o, this.f7985m);
        }

        /* JADX INFO: renamed from: b */
        public c m10634b(g gVar) {
            this.f7984l = gVar.m10676b();
            return this;
        }

        /* JADX INFO: renamed from: c */
        public c m10635c(String str) {
            this.f7973a = (String) p11.m167011e(str);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public c m10636d(List<k> list) {
            this.f7980h = ImmutableList.copyOf((Collection) list);
            return this;
        }

        /* JADX INFO: renamed from: e */
        public c m10637e(@Nullable Object obj) {
            this.f7982j = obj;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public c m10638f(@Nullable Uri uri) {
            this.f7974b = uri;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public c m10639g(@Nullable String str) {
            return m10638f(str == null ? null : Uri.parse(str));
        }

        public c() {
            this.f7976d = new d.a();
            this.f7977e = new f.a();
            this.f7978f = Collections.EMPTY_LIST;
            this.f7980h = ImmutableList.m15685of();
            this.f7984l = new g.a();
            this.f7985m = i.f8066d;
        }
    }
}
