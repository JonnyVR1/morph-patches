package com.p051p1.mobile.putong.live.base.api;

import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.live.base.api.LiveBaseApi;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.tantanapp.common.data.INetParser;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.network.RunnerProxy;
import java.util.Map;
import java.util.Set;
import p137rx.C22421c;
import p153l.e9t;
import p153l.g2d0;
import p153l.jyb;
import p153l.pcj;
import p153l.rai0;
import p153l.rnl;
import p153l.uqb0;
import p153l.wxr;
import p153l.x1d0;
import p153l.y20;
import p153l.z1d0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveBaseApi {

    /* JADX INFO: renamed from: a */
    public static final RunnerProxy f45076a;

    /* JADX INFO: renamed from: b */
    public static Network f45077b;

    /* JADX INFO: renamed from: c */
    public static g2d0 f45078c;

    public enum ReqType {
        POST,
        GET,
        PATCH,
        PUT,
        DELETE
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.api.LiveBaseApi$a */
    public static /* synthetic */ class C11585a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f45079a;

        static {
            int[] iArr = new int[ReqType.values().length];
            f45079a = iArr;
            try {
                iArr[ReqType.POST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45079a[ReqType.PATCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45079a[ReqType.PUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45079a[ReqType.DELETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        RunnerProxy runnerProxy = new RunnerProxy();
        f45076a = runnerProxy;
        runnerProxy.setErrorHandler(new rai0());
        f45077b = uqb0.f180376H;
        f45078c = new g2d0();
    }

    /* JADX INFO: renamed from: k */
    public static pcj<x1d0> m68509k(ReqType reqType, rnl rnlVar, String str) {
        final z1d0 z1d0VarCreate = z1d0.create(Network.JSON, str);
        final x1d0.C21228a c21228aM209045s = f45077b.auth().m209045s(rnlVar);
        Set<Map.Entry<String, String>> setEntrySet = f45078c.getHeader().entrySet();
        if (!jyb.m147479J(setEntrySet)) {
            jyb.m147537z(setEntrySet, new y20() { // from class: l.lxr
                @Override // p153l.y20
                public final void call(Object obj) {
                    Map.Entry entry = (Map.Entry) obj;
                    c21228aM209045s.m209027a((String) entry.getKey(), (String) entry.getValue());
                }
            });
        }
        int i = C11585a.f45079a[reqType.ordinal()];
        if (i == 1) {
            return new pcj() { // from class: l.mxr
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return c21228aM209045s.m209038l(z1d0VarCreate).m209028b();
                }
            };
        }
        if (i == 2) {
            return new pcj() { // from class: l.nxr
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return c21228aM209045s.m209037k(z1d0VarCreate).m209028b();
                }
            };
        }
        if (i != 3) {
            return i != 4 ? new pcj() { // from class: l.qxr
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return c21228aM209045s.m209032f().m209028b();
                }
            } : new pcj() { // from class: l.pxr
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return c21228aM209045s.m209031e(z1d0VarCreate).m209028b();
                }
            };
        }
        return new pcj() { // from class: l.oxr
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return c21228aM209045s.m209039m(z1d0VarCreate).m209028b();
            }
        };
    }

    /* JADX INFO: renamed from: l */
    public static pcj<C22421c<BLiveEnvelope>> m68510l(final ReqType reqType, final rnl rnlVar, final String str) {
        return new pcj() { // from class: l.txr
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return e9t.m119954d(LiveBaseApi.m68509k(reqType, rnlVar, str)).compose(psd0.m173606Q());
            }
        };
    }

    /* JADX INFO: renamed from: m */
    public static C22421c<BLiveEnvelope> m68511m(ReqType reqType, rnl rnlVar, String str) {
        return e9t.m119951a(m68509k(reqType, rnlVar, str));
    }

    /* JADX INFO: renamed from: n */
    public static pcj<C22421c<BLiveEnvelope>> m68512n(final ReqType reqType, final rnl rnlVar, final String str) {
        return new pcj() { // from class: l.rxr
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return e9t.m119951a(LiveBaseApi.m68509k(reqType, rnlVar, str));
            }
        };
    }

    /* JADX INFO: renamed from: o */
    public static <T> pcj<C22421c<T>> m68513o(final ReqType reqType, final rnl rnlVar, final JsonAdapter<T> jsonAdapter, final String str) {
        return new pcj() { // from class: l.kxr
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return e9t.m119953c(LiveBaseApi.m68509k(reqType, rnlVar, str), jsonAdapter);
            }
        };
    }

    /* JADX INFO: renamed from: p */
    public static <T extends BaseLiveBean> pcj<C22421c<T>> m68514p(final ReqType reqType, final rnl rnlVar, final String str, final INetParser<T> iNetParser) {
        return new pcj() { // from class: l.sxr
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return e9t.m119952b(LiveBaseApi.m68509k(reqType, rnlVar, str), iNetParser);
            }
        };
    }

    /* JADX INFO: renamed from: q */
    public static RunnerProxy m68515q() {
        return f45076a;
    }

    /* JADX INFO: renamed from: r */
    public static C22421c<BLiveEnvelope> m68516r(@NonNull rnl rnlVar) {
        return m68515q().scheduled(rnlVar.toString(), 0, m68512n(ReqType.GET, rnlVar, ""));
    }

    /* JADX INFO: renamed from: s */
    public static <T extends BaseLiveBean> C22421c<T> m68517s(@NonNull rnl rnlVar, wxr<T> wxrVar) {
        wxrVar.m208440b(rnlVar.toString());
        return m68515q().scheduled(rnlVar.toString(), 0, m68514p(ReqType.GET, rnlVar, "", wxrVar));
    }

    /* JADX INFO: renamed from: t */
    public static <T> C22421c<T> m68518t(@NonNull rnl rnlVar, JsonAdapter<T> jsonAdapter) {
        return m68515q().scheduled(rnlVar.toString(), 0, m68513o(ReqType.GET, rnlVar, jsonAdapter, ""));
    }

    /* JADX INFO: renamed from: u */
    public static C22421c<BLiveEnvelope> m68519u(@NonNull rnl rnlVar) {
        return m68515q().scheduled(rnlVar.toString(), 0, m68510l(ReqType.GET, rnlVar, ""));
    }

    /* JADX INFO: renamed from: v */
    public static C22421c<BLiveEnvelope> m68520v(@NonNull rnl rnlVar, @NonNull String str) {
        return m68515q().now(rnlVar.toString(), m68511m(ReqType.PATCH, rnlVar, str));
    }

    /* JADX INFO: renamed from: w */
    public static C22421c<BLiveEnvelope> m68521w(@NonNull rnl rnlVar, @NonNull String str) {
        return m68515q().now(rnlVar.toString(), m68511m(ReqType.POST, rnlVar, str));
    }

    /* JADX INFO: renamed from: x */
    public static <T extends BaseLiveBean> C22421c<T> m68522x(@NonNull rnl rnlVar, @NonNull String str, wxr<T> wxrVar) {
        wxrVar.m208440b(rnlVar.toString());
        return m68515q().now(rnlVar.toString(), e9t.m119952b(m68509k(ReqType.POST, rnlVar, str), wxrVar));
    }

    /* JADX INFO: renamed from: y */
    public static C22421c<BLiveEnvelope> m68523y(@NonNull rnl rnlVar, @NonNull String str) {
        return m68515q().now(rnlVar.toString(), m68511m(ReqType.PUT, rnlVar, str));
    }
}
