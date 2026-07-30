package com.p051p1.mobile.putong.live.base.api;

import android.util.Pair;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.tantanapp.common.data.INetParser;
import com.tantanapp.common.data.JsonAdapter;
import p137rx.C22421c;
import p153l.e9t;
import p153l.jyb;
import p153l.pcj;
import p153l.rnl;
import p153l.st0;
import p153l.x1d0;
import p153l.y20;
import p153l.z1d0;

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
    public static /* synthetic */ class C11584a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f45075a;

        static {
            int[] iArr = new int[ReqType.values().length];
            f45075a = iArr;
            try {
                iArr[ReqType.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45075a[ReqType.POST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45075a[ReqType.PATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45075a[ReqType.PUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45075a[ReqType.DELETE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m68488k(@NonNull rnl.C19886a c19886a, st0... st0VarArr) {
        Object obj;
        for (st0 st0Var : st0VarArr) {
            if (st0Var != null && (obj = ((Pair) st0Var).first) != null) {
                c19886a.m182300c((String) obj, (String) ((Pair) st0Var).second);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static pcj<x1d0> m68489l(Network network, ReqType reqType, rnl rnlVar, String str, st0... st0VarArr) {
        final z1d0 z1d0VarCreate = z1d0.create(Network.JSON, str);
        final x1d0.C21228a c21228aM209045s = network.auth().m209045s(rnlVar);
        if (!jyb.m147480K(st0VarArr)) {
            jyb.m147470A(st0VarArr, new y20() { // from class: l.rvr
                @Override // p153l.y20
                public final void call(Object obj) {
                    st0 st0Var = (st0) obj;
                    c21228aM209045s.m209027a((String) ((Pair) st0Var).first, (String) ((Pair) st0Var).second);
                }
            });
        }
        int i = C11584a.f45075a[reqType.ordinal()];
        if (i == 1) {
            return new pcj() { // from class: l.svr
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return c21228aM209045s.m209032f().m209028b();
                }
            };
        }
        if (i == 2) {
            return new pcj() { // from class: l.tvr
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return c21228aM209045s.m209038l(z1d0VarCreate).m209028b();
                }
            };
        }
        if (i == 3) {
            return new pcj() { // from class: l.uvr
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return c21228aM209045s.m209037k(z1d0VarCreate).m209028b();
                }
            };
        }
        if (i == 4) {
            return new pcj() { // from class: l.vvr
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return c21228aM209045s.m209039m(z1d0VarCreate).m209028b();
                }
            };
        }
        if (i != 5) {
            return null;
        }
        return new pcj() { // from class: l.wvr
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return c21228aM209045s.m209031e(z1d0VarCreate).m209028b();
            }
        };
    }

    /* JADX INFO: renamed from: m */
    public static rnl.C19886a m68490m(String str) {
        return rnl.m182265r(str).m182288p();
    }

    /* JADX INFO: renamed from: n */
    public static rnl m68491n(rnl.C19886a c19886a) {
        return c19886a.m182301d();
    }

    /* JADX INFO: renamed from: o */
    public static pcj<C22421c<BLiveEnvelope>> m68492o(final Network network, final ReqType reqType, final rnl rnlVar, final String str, final st0... st0VarArr) {
        return new pcj() { // from class: l.ovr
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return e9t.m119954d(LiveApiBuilder.m68489l(network, reqType, rnlVar, str, st0VarArr)).compose(psd0.m173606Q());
            }
        };
    }

    /* JADX INFO: renamed from: p */
    public static C22421c m68493p(Network network, ReqType reqType, rnl rnlVar, String str, st0... st0VarArr) {
        return e9t.m119951a(m68489l(network, reqType, rnlVar, str, st0VarArr));
    }

    /* JADX INFO: renamed from: q */
    public static pcj<C22421c<BLiveEnvelope>> m68494q(final Network network, final ReqType reqType, final rnl rnlVar, final String str, final st0... st0VarArr) {
        return new pcj() { // from class: l.qvr
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return e9t.m119951a(LiveApiBuilder.m68489l(network, reqType, rnlVar, str, st0VarArr));
            }
        };
    }

    /* JADX INFO: renamed from: r */
    public static <T> pcj<C22421c<T>> m68495r(final Network network, final ReqType reqType, final rnl rnlVar, final JsonAdapter<T> jsonAdapter, final String str, final st0... st0VarArr) {
        return new pcj() { // from class: l.xvr
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return e9t.m119953c(LiveApiBuilder.m68489l(network, reqType, rnlVar, str, st0VarArr), jsonAdapter);
            }
        };
    }

    /* JADX INFO: renamed from: s */
    public static <T extends BaseLiveBean> pcj<C22421c<T>> m68496s(final Network network, final ReqType reqType, final rnl rnlVar, final String str, final INetParser<T> iNetParser) {
        return new pcj() { // from class: l.pvr
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return e9t.m119952b(LiveApiBuilder.m68489l(network, reqType, rnlVar, str, new st0[0]), iNetParser);
            }
        };
    }

    /* JADX INFO: renamed from: t */
    public static <T extends BaseLiveBean> C22421c<T> m68497t(Network network, ReqType reqType, rnl rnlVar, String str, INetParser<T> iNetParser) {
        return e9t.m119952b(m68489l(network, reqType, rnlVar, str, new st0[0]), iNetParser);
    }

    /* JADX INFO: renamed from: u */
    public static rnl m68498u(@NonNull String str, st0... st0VarArr) {
        rnl.C19886a c19886aM68490m = m68490m(str);
        if (st0VarArr != null) {
            m68488k(c19886aM68490m, st0VarArr);
        }
        return m68491n(c19886aM68490m);
    }
}
