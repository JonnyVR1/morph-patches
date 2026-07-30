package p153l;

import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.live.base.api.LiveApiBuilder;
import com.p051p1.mobile.putong.live.base.apibean.BaseLiveBean;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.network.RunnerProxy;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes10.dex */
public class vrv {

    /* JADX INFO: renamed from: a */
    public static final RunnerProxy f185524a = new RunnerProxy();

    /* JADX INFO: renamed from: b */
    public static final RunnerProxy f185525b = new RunnerProxy();

    /* JADX INFO: renamed from: c */
    public static Network f185526c = uqb0.f180376H;

    /* JADX INFO: renamed from: a */
    public static C22421c<BLiveEnvelope> m202540a(@NonNull rnl rnlVar, @NonNull String str, @NonNull String str2) {
        return m202564y().scheduled(str, -1, LiveApiBuilder.m68494q(f185526c, LiveApiBuilder.ReqType.DELETE, rnlVar, str2, zrv.f205804f.m123609c()));
    }

    /* JADX INFO: renamed from: b */
    public static C22421c<BLiveEnvelope> m202541b(@NonNull rnl rnlVar, @NonNull String str, @NonNull String str2) {
        return m202564y().scheduled(str, -1, LiveApiBuilder.m68494q(f185526c, LiveApiBuilder.ReqType.PATCH, rnlVar, str2, zrv.f205804f.m123609c()));
    }

    /* JADX INFO: renamed from: c */
    public static <T> C22421c<T> m202542c(@NonNull rnl rnlVar, @NonNull String str, JsonAdapter<T> jsonAdapter) {
        return m202543d(rnlVar, str, jsonAdapter, "");
    }

    /* JADX INFO: renamed from: d */
    public static <T> C22421c<T> m202543d(@NonNull rnl rnlVar, @NonNull String str, JsonAdapter<T> jsonAdapter, @NonNull String str2) {
        return m202564y().scheduled(str, -1, LiveApiBuilder.m68495r(f185526c, LiveApiBuilder.ReqType.PATCH, rnlVar, jsonAdapter, str2, new st0[0]));
    }

    /* JADX INFO: renamed from: e */
    public static C22421c<BLiveEnvelope> m202544e(@NonNull rnl rnlVar, @NonNull String str, @NonNull String str2) {
        return m202564y().scheduled(str, -1, LiveApiBuilder.m68494q(f185526c, LiveApiBuilder.ReqType.POST, rnlVar, str2, zrv.f205804f.m123609c()));
    }

    /* JADX INFO: renamed from: f */
    public static <T> C22421c<T> m202545f(@NonNull rnl rnlVar, @NonNull String str, JsonAdapter<T> jsonAdapter, @NonNull String str2) {
        return m202564y().scheduled(str, -1, LiveApiBuilder.m68495r(f185526c, LiveApiBuilder.ReqType.POST, rnlVar, jsonAdapter, str2, zrv.f205804f.m123609c()));
    }

    /* JADX INFO: renamed from: g */
    public static C22421c<BLiveEnvelope> m202546g(@NonNull rnl rnlVar, @NonNull String str, @NonNull String str2) {
        return m202564y().scheduled(str, -1, LiveApiBuilder.m68494q(f185526c, LiveApiBuilder.ReqType.PUT, rnlVar, str2, zrv.f205804f.m123609c()));
    }

    /* JADX INFO: renamed from: h */
    public static C22421c<BLiveEnvelope> m202547h(@NonNull rnl rnlVar, @NonNull String str) {
        return m202564y().scheduled(str, 0, LiveApiBuilder.m68494q(f185526c, LiveApiBuilder.ReqType.GET, rnlVar, "", zrv.f205804f.m123609c()));
    }

    /* JADX INFO: renamed from: i */
    public static <T> C22421c<T> m202548i(@NonNull rnl rnlVar, @NonNull String str, JsonAdapter<T> jsonAdapter) {
        return m202564y().scheduled(str, 0, LiveApiBuilder.m68495r(f185526c, LiveApiBuilder.ReqType.GET, rnlVar, jsonAdapter, "", zrv.f205804f.m123609c()));
    }

    /* JADX INFO: renamed from: j */
    public static C22421c<BLiveEnvelope> m202549j(@NonNull rnl rnlVar, @NonNull String str, @NonNull String str2) {
        return m202565z().scheduled(str, -1, LiveApiBuilder.m68494q(f185526c, LiveApiBuilder.ReqType.DELETE, rnlVar, str2, zrv.f205804f.m123609c()));
    }

    /* JADX INFO: renamed from: k */
    public static <T> C22421c<T> m202550k(@NonNull rnl rnlVar, @NonNull String str, JsonAdapter<T> jsonAdapter) {
        return m202564y().scheduled(str, 0, LiveApiBuilder.m68495r(f185526c, LiveApiBuilder.ReqType.GET, rnlVar, jsonAdapter, "", new st0[0]));
    }

    /* JADX INFO: renamed from: l */
    public static <T extends BaseLiveBean> C22421c<T> m202551l(@NonNull rnl rnlVar, @NonNull String str, String str2, wxr wxrVar) {
        wxrVar.m208440b(str);
        return m202565z().scheduled(str, -1, LiveApiBuilder.m68496s(f185526c, LiveApiBuilder.ReqType.PATCH, rnlVar, str2, wxrVar));
    }

    /* JADX INFO: renamed from: m */
    public static C22421c<BLiveEnvelope> m202552m(@NonNull rnl rnlVar, @NonNull String str, @NonNull String str2) {
        return m202565z().scheduled(str, -1, LiveApiBuilder.m68494q(f185526c, LiveApiBuilder.ReqType.PATCH, rnlVar, str2, zrv.f205804f.m123609c()));
    }

    /* JADX INFO: renamed from: n */
    public static <T> C22421c<T> m202553n(@NonNull rnl rnlVar, @NonNull String str, JsonAdapter<T> jsonAdapter, @NonNull String str2) {
        return m202564y().scheduled(str, -1, LiveApiBuilder.m68495r(f185526c, LiveApiBuilder.ReqType.PATCH, rnlVar, jsonAdapter, str2, new st0[0]));
    }

    /* JADX INFO: renamed from: o */
    public static <T extends BaseLiveBean> C22421c<T> m202554o(@NonNull rnl rnlVar, @NonNull String str, @NonNull String str2, wxr wxrVar) {
        wxrVar.m208440b(str);
        return m202565z().scheduled(str, -1, LiveApiBuilder.m68496s(f185526c, LiveApiBuilder.ReqType.POST, rnlVar, str2, wxrVar));
    }

    /* JADX INFO: renamed from: p */
    public static C22421c<BLiveEnvelope> m202555p(@NonNull rnl rnlVar, @NonNull String str, @NonNull String str2) {
        return m202565z().scheduled(str, -1, LiveApiBuilder.m68494q(f185526c, LiveApiBuilder.ReqType.POST, rnlVar, str2, zrv.f205804f.m123609c()));
    }

    /* JADX INFO: renamed from: q */
    public static <T> C22421c<T> m202556q(@NonNull rnl rnlVar, @NonNull String str, JsonAdapter<T> jsonAdapter, @NonNull String str2) {
        return m202565z().scheduled(str, -1, LiveApiBuilder.m68495r(f185526c, LiveApiBuilder.ReqType.POST, rnlVar, jsonAdapter, str2, new st0[0]));
    }

    /* JADX INFO: renamed from: r */
    public static C22421c<BLiveEnvelope> m202557r(@NonNull rnl rnlVar, @NonNull String str, @NonNull String str2) {
        return m202565z().now(str, LiveApiBuilder.m68493p(f185526c, LiveApiBuilder.ReqType.POST, rnlVar, str2, zrv.f205804f.m123609c()));
    }

    /* JADX INFO: renamed from: s */
    public static <T extends BaseLiveBean> C22421c<T> m202558s(@NonNull rnl rnlVar, @NonNull String str, String str2, wxr wxrVar) {
        wxrVar.m208440b(str);
        return m202565z().scheduled(str, -1, LiveApiBuilder.m68496s(f185526c, LiveApiBuilder.ReqType.PUT, rnlVar, str2, wxrVar));
    }

    /* JADX INFO: renamed from: t */
    public static C22421c<BLiveEnvelope> m202559t(@NonNull rnl rnlVar, @NonNull String str, @NonNull String str2) {
        return m202565z().scheduled(str, -1, LiveApiBuilder.m68494q(f185526c, LiveApiBuilder.ReqType.PUT, rnlVar, str2, zrv.f205804f.m123609c()));
    }

    /* JADX INFO: renamed from: u */
    public static C22421c<BLiveEnvelope> m202560u(@NonNull rnl rnlVar, @NonNull String str, @NonNull String str2) {
        return m202565z().now(str, LiveApiBuilder.m68493p(f185526c, LiveApiBuilder.ReqType.PUT, rnlVar, str2, zrv.f205804f.m123609c()));
    }

    /* JADX INFO: renamed from: v */
    public static <T extends BaseLiveBean> C22421c<T> m202561v(@NonNull rnl rnlVar, @NonNull String str, wxr wxrVar) {
        wxrVar.m208440b(str);
        return m202565z().scheduled(str, 0, LiveApiBuilder.m68496s(f185526c, LiveApiBuilder.ReqType.GET, rnlVar, "", wxrVar));
    }

    /* JADX INFO: renamed from: w */
    public static C22421c<BLiveEnvelope> m202562w(@NonNull rnl rnlVar, @NonNull String str) {
        return m202565z().scheduled(str, 0, LiveApiBuilder.m68494q(f185526c, LiveApiBuilder.ReqType.GET, rnlVar, "", zrv.f205804f.m123609c()));
    }

    /* JADX INFO: renamed from: x */
    public static void m202563x() {
        RunnerProxy runnerProxy = f185524a;
        runnerProxy.clearRequestsAndStop();
        runnerProxy.runnerStart();
    }

    /* JADX INFO: renamed from: y */
    public static RunnerProxy m202564y() {
        return f185525b;
    }

    /* JADX INFO: renamed from: z */
    public static RunnerProxy m202565z() {
        return f185524a;
    }
}
