package com.p046p1.mobile.putong.live.base.api;

import android.util.Pair;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.tantanapp.common.data.INetParser;
import com.tantanapp.common.data.JsonAdapter;
import p133rx.C22306c;
import p149l.cll;
import p149l.d7t;
import p149l.e30;
import p149l.mt0;
import p149l.stc0;
import p149l.utc0;
import p149l.v9j;
import p149l.vwb;

/* JADX INFO: loaded from: classes13.dex */
public class LiveApiBuilder {

    public enum ReqType {
        POST,
        GET,
        PATCH,
        PUT,
        DELETE
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.api.LiveApiBuilder$a */
    public static /* synthetic */ class C11421a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f44227a;

        static {
            int[] iArr = new int[ReqType.values().length];
            f44227a = iArr;
            try {
                iArr[ReqType.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44227a[ReqType.POST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44227a[ReqType.PATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44227a[ReqType.PUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44227a[ReqType.DELETE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m67305k(@NonNull cll.C16188a c16188a, mt0... mt0VarArr) {
        Object obj;
        for (mt0 mt0Var : mt0VarArr) {
            if (mt0Var != null && (obj = ((Pair) mt0Var).first) != null) {
                c16188a.m107536c((String) obj, (String) ((Pair) mt0Var).second);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static v9j<stc0> m67306l(Network network, ReqType reqType, cll cllVar, String str, mt0... mt0VarArr) {
        final utc0 utc0VarCreate = utc0.create(Network.JSON, str);
        final stc0.C20027a c20027aM185900s = network.auth().m185900s(cllVar);
        if (!vwb.m200297K(mt0VarArr)) {
            vwb.m200287A(mt0VarArr, new e30() { // from class: l.qtr
                @Override // p149l.e30
                public final void call(Object obj) {
                    mt0 mt0Var = (mt0) obj;
                    c20027aM185900s.m185882a((String) ((Pair) mt0Var).first, (String) ((Pair) mt0Var).second);
                }
            });
        }
        int i = C11421a.f44227a[reqType.ordinal()];
        if (i == 1) {
            return new v9j() { // from class: l.rtr
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return c20027aM185900s.m185887f().m185883b();
                }
            };
        }
        if (i == 2) {
            return new v9j() { // from class: l.str
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return c20027aM185900s.m185893l(utc0VarCreate).m185883b();
                }
            };
        }
        if (i == 3) {
            return new v9j() { // from class: l.ttr
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return c20027aM185900s.m185892k(utc0VarCreate).m185883b();
                }
            };
        }
        if (i == 4) {
            return new v9j() { // from class: l.utr
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return c20027aM185900s.m185894m(utc0VarCreate).m185883b();
                }
            };
        }
        if (i != 5) {
            return null;
        }
        return new v9j() { // from class: l.vtr
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return c20027aM185900s.m185886e(utc0VarCreate).m185883b();
            }
        };
    }

    /* JADX INFO: renamed from: m */
    public static cll.C16188a m67307m(String str) {
        return cll.m107501r(str).m107524p();
    }

    /* JADX INFO: renamed from: n */
    public static cll m67308n(cll.C16188a c16188a) {
        return c16188a.m107537d();
    }

    /* JADX INFO: renamed from: o */
    public static v9j<C22306c<BLiveEnvelope>> m67309o(final Network network, final ReqType reqType, final cll cllVar, final String str, final mt0... mt0VarArr) {
        return new v9j() { // from class: l.ntr
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return d7t.m110250d(LiveApiBuilder.m67306l(network, reqType, cllVar, str, mt0VarArr)).compose(mkd0.m154965Q());
            }
        };
    }

    /* JADX INFO: renamed from: p */
    public static C22306c m67310p(Network network, ReqType reqType, cll cllVar, String str, mt0... mt0VarArr) {
        return d7t.m110247a(m67306l(network, reqType, cllVar, str, mt0VarArr));
    }

    /* JADX INFO: renamed from: q */
    public static v9j<C22306c<BLiveEnvelope>> m67311q(final Network network, final ReqType reqType, final cll cllVar, final String str, final mt0... mt0VarArr) {
        return new v9j() { // from class: l.ptr
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return d7t.m110247a(LiveApiBuilder.m67306l(network, reqType, cllVar, str, mt0VarArr));
            }
        };
    }

    /* JADX INFO: renamed from: r */
    public static <T> v9j<C22306c<T>> m67312r(final Network network, final ReqType reqType, final cll cllVar, final JsonAdapter<T> jsonAdapter, final String str, final mt0... mt0VarArr) {
        return new v9j() { // from class: l.wtr
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return d7t.m110249c(LiveApiBuilder.m67306l(network, reqType, cllVar, str, mt0VarArr), jsonAdapter);
            }
        };
    }

    /* JADX INFO: renamed from: s */
    public static <T extends BaseLiveBean> v9j<C22306c<T>> m67313s(final Network network, final ReqType reqType, final cll cllVar, final String str, final INetParser<T> iNetParser) {
        return new v9j() { // from class: l.otr
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return d7t.m110248b(LiveApiBuilder.m67306l(network, reqType, cllVar, str, new mt0[0]), iNetParser);
            }
        };
    }

    /* JADX INFO: renamed from: t */
    public static <T extends BaseLiveBean> C22306c<T> m67314t(Network network, ReqType reqType, cll cllVar, String str, INetParser<T> iNetParser) {
        return d7t.m110248b(m67306l(network, reqType, cllVar, str, new mt0[0]), iNetParser);
    }

    /* JADX INFO: renamed from: u */
    public static cll m67315u(@NonNull String str, mt0... mt0VarArr) {
        cll.C16188a c16188aM67307m = m67307m(str);
        if (mt0VarArr != null) {
            m67305k(c16188aM67307m, mt0VarArr);
        }
        return m67308n(c16188aM67307m);
    }
}
