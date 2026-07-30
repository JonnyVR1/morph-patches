package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p046p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.network.RunnerProxy;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class upv {

    /* JADX INFO: renamed from: a */
    public static final RunnerProxy f177675a = new RunnerProxy();

    /* JADX INFO: renamed from: b */
    public static final RunnerProxy f177676b = new RunnerProxy();

    /* JADX INFO: renamed from: c */
    public static Network f177677c = qib0.f154693H;

    /* JADX INFO: renamed from: a */
    public static C22306c<BLiveEnvelope> m194913a(@NonNull cll cllVar, @NonNull String str, @NonNull String str2) {
        return m194937y().scheduled(str, -1, LiveApiBuilder.m67311q(f177677c, LiveApiBuilder.ReqType.DELETE, cllVar, str2, ypv.f199498f.m108747c()));
    }

    /* JADX INFO: renamed from: b */
    public static C22306c<BLiveEnvelope> m194914b(@NonNull cll cllVar, @NonNull String str, @NonNull String str2) {
        return m194937y().scheduled(str, -1, LiveApiBuilder.m67311q(f177677c, LiveApiBuilder.ReqType.PATCH, cllVar, str2, ypv.f199498f.m108747c()));
    }

    /* JADX INFO: renamed from: c */
    public static <T> C22306c<T> m194915c(@NonNull cll cllVar, @NonNull String str, JsonAdapter<T> jsonAdapter) {
        return m194916d(cllVar, str, jsonAdapter, "");
    }

    /* JADX INFO: renamed from: d */
    public static <T> C22306c<T> m194916d(@NonNull cll cllVar, @NonNull String str, JsonAdapter<T> jsonAdapter, @NonNull String str2) {
        return m194937y().scheduled(str, -1, LiveApiBuilder.m67312r(f177677c, LiveApiBuilder.ReqType.PATCH, cllVar, jsonAdapter, str2, new mt0[0]));
    }

    /* JADX INFO: renamed from: e */
    public static C22306c<BLiveEnvelope> m194917e(@NonNull cll cllVar, @NonNull String str, @NonNull String str2) {
        return m194937y().scheduled(str, -1, LiveApiBuilder.m67311q(f177677c, LiveApiBuilder.ReqType.POST, cllVar, str2, ypv.f199498f.m108747c()));
    }

    /* JADX INFO: renamed from: f */
    public static <T> C22306c<T> m194918f(@NonNull cll cllVar, @NonNull String str, JsonAdapter<T> jsonAdapter, @NonNull String str2) {
        return m194937y().scheduled(str, -1, LiveApiBuilder.m67312r(f177677c, LiveApiBuilder.ReqType.POST, cllVar, jsonAdapter, str2, ypv.f199498f.m108747c()));
    }

    /* JADX INFO: renamed from: g */
    public static C22306c<BLiveEnvelope> m194919g(@NonNull cll cllVar, @NonNull String str, @NonNull String str2) {
        return m194937y().scheduled(str, -1, LiveApiBuilder.m67311q(f177677c, LiveApiBuilder.ReqType.PUT, cllVar, str2, ypv.f199498f.m108747c()));
    }

    /* JADX INFO: renamed from: h */
    public static C22306c<BLiveEnvelope> m194920h(@NonNull cll cllVar, @NonNull String str) {
        return m194937y().scheduled(str, 0, LiveApiBuilder.m67311q(f177677c, LiveApiBuilder.ReqType.GET, cllVar, "", ypv.f199498f.m108747c()));
    }

    /* JADX INFO: renamed from: i */
    public static <T> C22306c<T> m194921i(@NonNull cll cllVar, @NonNull String str, JsonAdapter<T> jsonAdapter) {
        return m194937y().scheduled(str, 0, LiveApiBuilder.m67312r(f177677c, LiveApiBuilder.ReqType.GET, cllVar, jsonAdapter, "", ypv.f199498f.m108747c()));
    }

    /* JADX INFO: renamed from: j */
    public static C22306c<BLiveEnvelope> m194922j(@NonNull cll cllVar, @NonNull String str, @NonNull String str2) {
        return m194938z().scheduled(str, -1, LiveApiBuilder.m67311q(f177677c, LiveApiBuilder.ReqType.DELETE, cllVar, str2, ypv.f199498f.m108747c()));
    }

    /* JADX INFO: renamed from: k */
    public static <T> C22306c<T> m194923k(@NonNull cll cllVar, @NonNull String str, JsonAdapter<T> jsonAdapter) {
        return m194937y().scheduled(str, 0, LiveApiBuilder.m67312r(f177677c, LiveApiBuilder.ReqType.GET, cllVar, jsonAdapter, "", new mt0[0]));
    }

    /* JADX INFO: renamed from: l */
    public static <T extends BaseLiveBean> C22306c<T> m194924l(@NonNull cll cllVar, @NonNull String str, String str2, vvr vvrVar) {
        vvrVar.m200206b(str);
        return m194938z().scheduled(str, -1, LiveApiBuilder.m67313s(f177677c, LiveApiBuilder.ReqType.PATCH, cllVar, str2, vvrVar));
    }

    /* JADX INFO: renamed from: m */
    public static C22306c<BLiveEnvelope> m194925m(@NonNull cll cllVar, @NonNull String str, @NonNull String str2) {
        return m194938z().scheduled(str, -1, LiveApiBuilder.m67311q(f177677c, LiveApiBuilder.ReqType.PATCH, cllVar, str2, ypv.f199498f.m108747c()));
    }

    /* JADX INFO: renamed from: n */
    public static <T> C22306c<T> m194926n(@NonNull cll cllVar, @NonNull String str, JsonAdapter<T> jsonAdapter, @NonNull String str2) {
        return m194937y().scheduled(str, -1, LiveApiBuilder.m67312r(f177677c, LiveApiBuilder.ReqType.PATCH, cllVar, jsonAdapter, str2, new mt0[0]));
    }

    /* JADX INFO: renamed from: o */
    public static <T extends BaseLiveBean> C22306c<T> m194927o(@NonNull cll cllVar, @NonNull String str, @NonNull String str2, vvr vvrVar) {
        vvrVar.m200206b(str);
        return m194938z().scheduled(str, -1, LiveApiBuilder.m67313s(f177677c, LiveApiBuilder.ReqType.POST, cllVar, str2, vvrVar));
    }

    /* JADX INFO: renamed from: p */
    public static C22306c<BLiveEnvelope> m194928p(@NonNull cll cllVar, @NonNull String str, @NonNull String str2) {
        return m194938z().scheduled(str, -1, LiveApiBuilder.m67311q(f177677c, LiveApiBuilder.ReqType.POST, cllVar, str2, ypv.f199498f.m108747c()));
    }

    /* JADX INFO: renamed from: q */
    public static <T> C22306c<T> m194929q(@NonNull cll cllVar, @NonNull String str, JsonAdapter<T> jsonAdapter, @NonNull String str2) {
        return m194938z().scheduled(str, -1, LiveApiBuilder.m67312r(f177677c, LiveApiBuilder.ReqType.POST, cllVar, jsonAdapter, str2, new mt0[0]));
    }

    /* JADX INFO: renamed from: r */
    public static C22306c<BLiveEnvelope> m194930r(@NonNull cll cllVar, @NonNull String str, @NonNull String str2) {
        return m194938z().now(str, LiveApiBuilder.m67310p(f177677c, LiveApiBuilder.ReqType.POST, cllVar, str2, ypv.f199498f.m108747c()));
    }

    /* JADX INFO: renamed from: s */
    public static <T extends BaseLiveBean> C22306c<T> m194931s(@NonNull cll cllVar, @NonNull String str, String str2, vvr vvrVar) {
        vvrVar.m200206b(str);
        return m194938z().scheduled(str, -1, LiveApiBuilder.m67313s(f177677c, LiveApiBuilder.ReqType.PUT, cllVar, str2, vvrVar));
    }

    /* JADX INFO: renamed from: t */
    public static C22306c<BLiveEnvelope> m194932t(@NonNull cll cllVar, @NonNull String str, @NonNull String str2) {
        return m194938z().scheduled(str, -1, LiveApiBuilder.m67311q(f177677c, LiveApiBuilder.ReqType.PUT, cllVar, str2, ypv.f199498f.m108747c()));
    }

    /* JADX INFO: renamed from: u */
    public static C22306c<BLiveEnvelope> m194933u(@NonNull cll cllVar, @NonNull String str, @NonNull String str2) {
        return m194938z().now(str, LiveApiBuilder.m67310p(f177677c, LiveApiBuilder.ReqType.PUT, cllVar, str2, ypv.f199498f.m108747c()));
    }

    /* JADX INFO: renamed from: v */
    public static <T extends BaseLiveBean> C22306c<T> m194934v(@NonNull cll cllVar, @NonNull String str, vvr vvrVar) {
        vvrVar.m200206b(str);
        return m194938z().scheduled(str, 0, LiveApiBuilder.m67313s(f177677c, LiveApiBuilder.ReqType.GET, cllVar, "", vvrVar));
    }

    /* JADX INFO: renamed from: w */
    public static C22306c<BLiveEnvelope> m194935w(@NonNull cll cllVar, @NonNull String str) {
        return m194938z().scheduled(str, 0, LiveApiBuilder.m67311q(f177677c, LiveApiBuilder.ReqType.GET, cllVar, "", ypv.f199498f.m108747c()));
    }

    /* JADX INFO: renamed from: x */
    public static void m194936x() {
        RunnerProxy runnerProxy = f177675a;
        runnerProxy.clearRequestsAndStop();
        runnerProxy.runnerStart();
    }

    /* JADX INFO: renamed from: y */
    public static RunnerProxy m194937y() {
        return f177676b;
    }

    /* JADX INFO: renamed from: z */
    public static RunnerProxy m194938z() {
        return f177675a;
    }
}
