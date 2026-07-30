package com.p046p1.mobile.putong.live.base.api;

import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.live.base.api.LiveBaseApi;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.tantanapp.common.data.INetParser;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.network.RunnerProxy;
import java.util.Map;
import java.util.Set;
import p133rx.C22306c;
import p149l.cll;
import p149l.d7t;
import p149l.duc0;
import p149l.e30;
import p149l.i2i0;
import p149l.qib0;
import p149l.stc0;
import p149l.utc0;
import p149l.v9j;
import p149l.vvr;
import p149l.vwb;

/* JADX INFO: loaded from: classes13.dex */
public class LiveBaseApi {

    /* JADX INFO: renamed from: a */
    public static final RunnerProxy f44228a;

    /* JADX INFO: renamed from: b */
    public static Network f44229b;

    /* JADX INFO: renamed from: c */
    public static duc0 f44230c;

    public enum ReqType {
        POST,
        GET,
        PATCH,
        PUT,
        DELETE
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.api.LiveBaseApi$a */
    public static /* synthetic */ class C11422a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f44231a;

        static {
            int[] iArr = new int[ReqType.values().length];
            f44231a = iArr;
            try {
                iArr[ReqType.POST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44231a[ReqType.PATCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44231a[ReqType.PUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44231a[ReqType.DELETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        RunnerProxy runnerProxy = new RunnerProxy();
        f44228a = runnerProxy;
        runnerProxy.setErrorHandler(new i2i0());
        f44229b = qib0.f154693H;
        f44230c = new duc0();
    }

    /* JADX INFO: renamed from: k */
    public static v9j<stc0> m67326k(ReqType reqType, cll cllVar, String str) {
        final utc0 utc0VarCreate = utc0.create(Network.JSON, str);
        final stc0.C20027a c20027aM185900s = f44229b.auth().m185900s(cllVar);
        Set<Map.Entry<String, String>> setEntrySet = f44230c.getHeader().entrySet();
        if (!vwb.m200296J(setEntrySet)) {
            vwb.m200354z(setEntrySet, new e30() { // from class: l.kvr
                @Override // p149l.e30
                public final void call(Object obj) {
                    Map.Entry entry = (Map.Entry) obj;
                    c20027aM185900s.m185882a((String) entry.getKey(), (String) entry.getValue());
                }
            });
        }
        int i = C11422a.f44231a[reqType.ordinal()];
        if (i == 1) {
            return new v9j() { // from class: l.lvr
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return c20027aM185900s.m185893l(utc0VarCreate).m185883b();
                }
            };
        }
        if (i == 2) {
            return new v9j() { // from class: l.mvr
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return c20027aM185900s.m185892k(utc0VarCreate).m185883b();
                }
            };
        }
        if (i != 3) {
            return i != 4 ? new v9j() { // from class: l.pvr
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return c20027aM185900s.m185887f().m185883b();
                }
            } : new v9j() { // from class: l.ovr
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return c20027aM185900s.m185886e(utc0VarCreate).m185883b();
                }
            };
        }
        return new v9j() { // from class: l.nvr
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return c20027aM185900s.m185894m(utc0VarCreate).m185883b();
            }
        };
    }

    /* JADX INFO: renamed from: l */
    public static v9j<C22306c<BLiveEnvelope>> m67327l(final ReqType reqType, final cll cllVar, final String str) {
        return new v9j() { // from class: l.svr
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return d7t.m110250d(LiveBaseApi.m67326k(reqType, cllVar, str)).compose(mkd0.m154965Q());
            }
        };
    }

    /* JADX INFO: renamed from: m */
    public static C22306c<BLiveEnvelope> m67328m(ReqType reqType, cll cllVar, String str) {
        return d7t.m110247a(m67326k(reqType, cllVar, str));
    }

    /* JADX INFO: renamed from: n */
    public static v9j<C22306c<BLiveEnvelope>> m67329n(final ReqType reqType, final cll cllVar, final String str) {
        return new v9j() { // from class: l.qvr
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return d7t.m110247a(LiveBaseApi.m67326k(reqType, cllVar, str));
            }
        };
    }

    /* JADX INFO: renamed from: o */
    public static <T> v9j<C22306c<T>> m67330o(final ReqType reqType, final cll cllVar, final JsonAdapter<T> jsonAdapter, final String str) {
        return new v9j() { // from class: l.jvr
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return d7t.m110249c(LiveBaseApi.m67326k(reqType, cllVar, str), jsonAdapter);
            }
        };
    }

    /* JADX INFO: renamed from: p */
    public static <T extends BaseLiveBean> v9j<C22306c<T>> m67331p(final ReqType reqType, final cll cllVar, final String str, final INetParser<T> iNetParser) {
        return new v9j() { // from class: l.rvr
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return d7t.m110248b(LiveBaseApi.m67326k(reqType, cllVar, str), iNetParser);
            }
        };
    }

    /* JADX INFO: renamed from: q */
    public static RunnerProxy m67332q() {
        return f44228a;
    }

    /* JADX INFO: renamed from: r */
    public static C22306c<BLiveEnvelope> m67333r(@NonNull cll cllVar) {
        return m67332q().scheduled(cllVar.toString(), 0, m67329n(ReqType.GET, cllVar, ""));
    }

    /* JADX INFO: renamed from: s */
    public static <T extends BaseLiveBean> C22306c<T> m67334s(@NonNull cll cllVar, vvr<T> vvrVar) {
        vvrVar.m200206b(cllVar.toString());
        return m67332q().scheduled(cllVar.toString(), 0, m67331p(ReqType.GET, cllVar, "", vvrVar));
    }

    /* JADX INFO: renamed from: t */
    public static <T> C22306c<T> m67335t(@NonNull cll cllVar, JsonAdapter<T> jsonAdapter) {
        return m67332q().scheduled(cllVar.toString(), 0, m67330o(ReqType.GET, cllVar, jsonAdapter, ""));
    }

    /* JADX INFO: renamed from: u */
    public static C22306c<BLiveEnvelope> m67336u(@NonNull cll cllVar) {
        return m67332q().scheduled(cllVar.toString(), 0, m67327l(ReqType.GET, cllVar, ""));
    }

    /* JADX INFO: renamed from: v */
    public static C22306c<BLiveEnvelope> m67337v(@NonNull cll cllVar, @NonNull String str) {
        return m67332q().now(cllVar.toString(), m67328m(ReqType.PATCH, cllVar, str));
    }

    /* JADX INFO: renamed from: w */
    public static C22306c<BLiveEnvelope> m67338w(@NonNull cll cllVar, @NonNull String str) {
        return m67332q().now(cllVar.toString(), m67328m(ReqType.POST, cllVar, str));
    }

    /* JADX INFO: renamed from: x */
    public static <T extends BaseLiveBean> C22306c<T> m67339x(@NonNull cll cllVar, @NonNull String str, vvr<T> vvrVar) {
        vvrVar.m200206b(cllVar.toString());
        return m67332q().now(cllVar.toString(), d7t.m110248b(m67326k(ReqType.POST, cllVar, str), vvrVar));
    }

    /* JADX INFO: renamed from: y */
    public static C22306c<BLiveEnvelope> m67340y(@NonNull cll cllVar, @NonNull String str) {
        return m67332q().now(cllVar.toString(), m67328m(ReqType.PUT, cllVar, str));
    }
}
