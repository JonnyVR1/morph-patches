package p009l;

import androidx.annotation.NonNull;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.network.RunnerProxy;
import l.cll;
import l.mt0;
import l.qib0;
import l.vvr;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class upv {

    /* JADX INFO: renamed from: a */
    public static final RunnerProxy f21308a = new RunnerProxy();

    /* JADX INFO: renamed from: b */
    public static final RunnerProxy f21309b = new RunnerProxy();

    /* JADX INFO: renamed from: c */
    public static Network f21310c = qib0.H;

    /* JADX INFO: renamed from: a */
    public static c<BLiveEnvelope> m23133a(@NonNull cll cllVar, @NonNull String str, @NonNull String str2) {
        return m23157y().scheduled(str, -1, LiveApiBuilder.q(f21310c, LiveApiBuilder.ReqType.DELETE, cllVar, str2, ypv.f23201f.m12847c()));
    }

    /* JADX INFO: renamed from: b */
    public static c<BLiveEnvelope> m23134b(@NonNull cll cllVar, @NonNull String str, @NonNull String str2) {
        return m23157y().scheduled(str, -1, LiveApiBuilder.q(f21310c, LiveApiBuilder.ReqType.PATCH, cllVar, str2, ypv.f23201f.m12847c()));
    }

    /* JADX INFO: renamed from: c */
    public static <T> c<T> m23135c(@NonNull cll cllVar, @NonNull String str, JsonAdapter<T> jsonAdapter) {
        return m23136d(cllVar, str, jsonAdapter, "");
    }

    /* JADX INFO: renamed from: d */
    public static <T> c<T> m23136d(@NonNull cll cllVar, @NonNull String str, JsonAdapter<T> jsonAdapter, @NonNull String str2) {
        return m23157y().scheduled(str, -1, LiveApiBuilder.r(f21310c, LiveApiBuilder.ReqType.PATCH, cllVar, jsonAdapter, str2, new mt0[0]));
    }

    /* JADX INFO: renamed from: e */
    public static c<BLiveEnvelope> m23137e(@NonNull cll cllVar, @NonNull String str, @NonNull String str2) {
        return m23157y().scheduled(str, -1, LiveApiBuilder.q(f21310c, LiveApiBuilder.ReqType.POST, cllVar, str2, ypv.f23201f.m12847c()));
    }

    /* JADX INFO: renamed from: f */
    public static <T> c<T> m23138f(@NonNull cll cllVar, @NonNull String str, JsonAdapter<T> jsonAdapter, @NonNull String str2) {
        return m23157y().scheduled(str, -1, LiveApiBuilder.r(f21310c, LiveApiBuilder.ReqType.POST, cllVar, jsonAdapter, str2, ypv.f23201f.m12847c()));
    }

    /* JADX INFO: renamed from: g */
    public static c<BLiveEnvelope> m23139g(@NonNull cll cllVar, @NonNull String str, @NonNull String str2) {
        return m23157y().scheduled(str, -1, LiveApiBuilder.q(f21310c, LiveApiBuilder.ReqType.PUT, cllVar, str2, ypv.f23201f.m12847c()));
    }

    /* JADX INFO: renamed from: h */
    public static c<BLiveEnvelope> m23140h(@NonNull cll cllVar, @NonNull String str) {
        return m23157y().scheduled(str, 0, LiveApiBuilder.q(f21310c, LiveApiBuilder.ReqType.GET, cllVar, "", ypv.f23201f.m12847c()));
    }

    /* JADX INFO: renamed from: i */
    public static <T> c<T> m23141i(@NonNull cll cllVar, @NonNull String str, JsonAdapter<T> jsonAdapter) {
        return m23157y().scheduled(str, 0, LiveApiBuilder.r(f21310c, LiveApiBuilder.ReqType.GET, cllVar, jsonAdapter, "", ypv.f23201f.m12847c()));
    }

    /* JADX INFO: renamed from: j */
    public static c<BLiveEnvelope> m23142j(@NonNull cll cllVar, @NonNull String str, @NonNull String str2) {
        return m23158z().scheduled(str, -1, LiveApiBuilder.q(f21310c, LiveApiBuilder.ReqType.DELETE, cllVar, str2, ypv.f23201f.m12847c()));
    }

    /* JADX INFO: renamed from: k */
    public static <T> c<T> m23143k(@NonNull cll cllVar, @NonNull String str, JsonAdapter<T> jsonAdapter) {
        return m23157y().scheduled(str, 0, LiveApiBuilder.r(f21310c, LiveApiBuilder.ReqType.GET, cllVar, jsonAdapter, "", new mt0[0]));
    }

    /* JADX INFO: renamed from: l */
    public static <T extends BaseLiveBean> c<T> m23144l(@NonNull cll cllVar, @NonNull String str, String str2, vvr vvrVar) {
        vvrVar.b(str);
        return m23158z().scheduled(str, -1, LiveApiBuilder.s(f21310c, LiveApiBuilder.ReqType.PATCH, cllVar, str2, vvrVar));
    }

    /* JADX INFO: renamed from: m */
    public static c<BLiveEnvelope> m23145m(@NonNull cll cllVar, @NonNull String str, @NonNull String str2) {
        return m23158z().scheduled(str, -1, LiveApiBuilder.q(f21310c, LiveApiBuilder.ReqType.PATCH, cllVar, str2, ypv.f23201f.m12847c()));
    }

    /* JADX INFO: renamed from: n */
    public static <T> c<T> m23146n(@NonNull cll cllVar, @NonNull String str, JsonAdapter<T> jsonAdapter, @NonNull String str2) {
        return m23157y().scheduled(str, -1, LiveApiBuilder.r(f21310c, LiveApiBuilder.ReqType.PATCH, cllVar, jsonAdapter, str2, new mt0[0]));
    }

    /* JADX INFO: renamed from: o */
    public static <T extends BaseLiveBean> c<T> m23147o(@NonNull cll cllVar, @NonNull String str, @NonNull String str2, vvr vvrVar) {
        vvrVar.b(str);
        return m23158z().scheduled(str, -1, LiveApiBuilder.s(f21310c, LiveApiBuilder.ReqType.POST, cllVar, str2, vvrVar));
    }

    /* JADX INFO: renamed from: p */
    public static c<BLiveEnvelope> m23148p(@NonNull cll cllVar, @NonNull String str, @NonNull String str2) {
        return m23158z().scheduled(str, -1, LiveApiBuilder.q(f21310c, LiveApiBuilder.ReqType.POST, cllVar, str2, ypv.f23201f.m12847c()));
    }

    /* JADX INFO: renamed from: q */
    public static <T> c<T> m23149q(@NonNull cll cllVar, @NonNull String str, JsonAdapter<T> jsonAdapter, @NonNull String str2) {
        return m23158z().scheduled(str, -1, LiveApiBuilder.r(f21310c, LiveApiBuilder.ReqType.POST, cllVar, jsonAdapter, str2, new mt0[0]));
    }

    /* JADX INFO: renamed from: r */
    public static c<BLiveEnvelope> m23150r(@NonNull cll cllVar, @NonNull String str, @NonNull String str2) {
        return m23158z().now(str, LiveApiBuilder.p(f21310c, LiveApiBuilder.ReqType.POST, cllVar, str2, ypv.f23201f.m12847c()));
    }

    /* JADX INFO: renamed from: s */
    public static <T extends BaseLiveBean> c<T> m23151s(@NonNull cll cllVar, @NonNull String str, String str2, vvr vvrVar) {
        vvrVar.b(str);
        return m23158z().scheduled(str, -1, LiveApiBuilder.s(f21310c, LiveApiBuilder.ReqType.PUT, cllVar, str2, vvrVar));
    }

    /* JADX INFO: renamed from: t */
    public static c<BLiveEnvelope> m23152t(@NonNull cll cllVar, @NonNull String str, @NonNull String str2) {
        return m23158z().scheduled(str, -1, LiveApiBuilder.q(f21310c, LiveApiBuilder.ReqType.PUT, cllVar, str2, ypv.f23201f.m12847c()));
    }

    /* JADX INFO: renamed from: u */
    public static c<BLiveEnvelope> m23153u(@NonNull cll cllVar, @NonNull String str, @NonNull String str2) {
        return m23158z().now(str, LiveApiBuilder.p(f21310c, LiveApiBuilder.ReqType.PUT, cllVar, str2, ypv.f23201f.m12847c()));
    }

    /* JADX INFO: renamed from: v */
    public static <T extends BaseLiveBean> c<T> m23154v(@NonNull cll cllVar, @NonNull String str, vvr vvrVar) {
        vvrVar.b(str);
        return m23158z().scheduled(str, 0, LiveApiBuilder.s(f21310c, LiveApiBuilder.ReqType.GET, cllVar, "", vvrVar));
    }

    /* JADX INFO: renamed from: w */
    public static c<BLiveEnvelope> m23155w(@NonNull cll cllVar, @NonNull String str) {
        return m23158z().scheduled(str, 0, LiveApiBuilder.q(f21310c, LiveApiBuilder.ReqType.GET, cllVar, "", ypv.f23201f.m12847c()));
    }

    /* JADX INFO: renamed from: x */
    public static void m23156x() {
        RunnerProxy runnerProxy = f21308a;
        runnerProxy.clearRequestsAndStop();
        runnerProxy.runnerStart();
    }

    /* JADX INFO: renamed from: y */
    public static RunnerProxy m23157y() {
        return f21309b;
    }

    /* JADX INFO: renamed from: z */
    public static RunnerProxy m23158z() {
        return f21308a;
    }
}
