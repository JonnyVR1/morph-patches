package com.p046p1.mobile.putong.live.external.intl.module.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.Pagination;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.external.intl.module.api.IntlLiveActivitiesApi;
import com.p046p1.mobile.putong.live.external.module.api.LiveExternalApi;
import java.util.Objects;
import p133rx.C22306c;
import p149l.cll;
import p149l.irn;
import p149l.mtn;
import p149l.vb20;
import p149l.w9j;
import p149l.ytr;

/* JADX INFO: loaded from: classes13.dex */
public class IntlLiveActivitiesApi {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ mtn m70210a(mtn mtnVar, Throwable th) {
        return mtnVar;
    }

    public static C22306c<mtn> getLiveActivitiesInfo() {
        return LiveExternalApi.buildLiveReadReq(cll.m107499l(ytr.m216073b("/live-activities")).m107524p().m107536c("with", "live-feeds,rooms,voice-rooms,users,lives,voice-lives").m107536c(Constants.KEY_LIMIT, String.valueOf(50)).m107537d(), "getLiveActivities").map(new irn()).flatMap(new w9j() { // from class: l.jrn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                mtn mtnVar = (mtn) obj;
                return IntlLiveActivitiesApi.getLiveActivitiesSuggests(mtnVar).onErrorReturn(new w9j() { // from class: l.grn
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return IntlLiveActivitiesApi.m70210a(mtnVar, (Throwable) obj2);
                    }
                });
            }
        });
    }

    public static C22306c<BLiveEnvelope> getLiveActivitiesSuggests() {
        return LiveExternalApi.buildLiveReadReq(cll.m107499l(ytr.m216073b("/live-activity-suggests")).m107524p().m107536c("with", "rooms,users,lives").m107537d(), "getLiveActivitiesSuggests");
    }

    public static C22306c<BLiveEnvelope> getNextLiveActivities(@NonNull Pagination pagination, @Nullable String str) {
        cll.C16188a c16188aM107536c = cll.m107499l(ytr.m216073b("/live-activities")).m107524p().m107536c("with", "live-feeds,rooms,voice-rooms,users,lives,voice-lives");
        if (!TextUtils.isEmpty(str)) {
            c16188aM107536c.m107536c("source", str);
        }
        return LiveExternalApi.buildLiveReadReq(cll.m107499l(c16188aM107536c.toString() + "&" + pagination.links.next), "nextliveActivities");
    }

    public static C22306c<mtn> getNextPage(@Nullable Pagination pagination) {
        return (pagination == null || TextUtils.isEmpty(pagination.links.next)) ? C22306c.create(new vb20()) : getNextLiveActivities(pagination, null).map(new irn());
    }

    public static C22306c<mtn> getLiveActivitiesSuggests(final mtn mtnVar) {
        C22306c<BLiveEnvelope> liveActivitiesSuggests = getLiveActivitiesSuggests();
        Objects.requireNonNull(mtnVar);
        return liveActivitiesSuggests.map(new w9j() { // from class: l.hrn
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return mtnVar.m156327s((BLiveEnvelope) obj);
            }
        });
    }
}
