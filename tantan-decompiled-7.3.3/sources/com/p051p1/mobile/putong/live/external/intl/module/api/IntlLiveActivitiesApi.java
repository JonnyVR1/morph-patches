package com.p051p1.mobile.putong.live.external.intl.module.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.Pagination;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.external.intl.module.api.IntlLiveActivitiesApi;
import com.p051p1.mobile.putong.live.external.module.api.LiveExternalApi;
import java.util.Objects;
import p137rx.C22421c;
import p153l.ek20;
import p153l.itn;
import p153l.mvn;
import p153l.qcj;
import p153l.rnl;
import p153l.zvr;

/* JADX INFO: loaded from: classes9.dex */
public class IntlLiveActivitiesApi {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ mvn m71393a(mvn mvnVar, Throwable th) {
        return mvnVar;
    }

    public static C22421c<mvn> getLiveActivitiesInfo() {
        return LiveExternalApi.buildLiveReadReq(rnl.m182263l(zvr.m221802b("/live-activities")).m182288p().m182300c("with", "live-feeds,rooms,voice-rooms,users,lives,voice-lives").m182300c(Constants.KEY_LIMIT, String.valueOf(50)).m182301d(), "getLiveActivities").map(new itn()).flatMap(new qcj() { // from class: l.jtn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                mvn mvnVar = (mvn) obj;
                return IntlLiveActivitiesApi.getLiveActivitiesSuggests(mvnVar).onErrorReturn(new qcj() { // from class: l.gtn
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return IntlLiveActivitiesApi.m71393a(mvnVar, (Throwable) obj2);
                    }
                });
            }
        });
    }

    public static C22421c<BLiveEnvelope> getLiveActivitiesSuggests() {
        return LiveExternalApi.buildLiveReadReq(rnl.m182263l(zvr.m221802b("/live-activity-suggests")).m182288p().m182300c("with", "rooms,users,lives").m182301d(), "getLiveActivitiesSuggests");
    }

    public static C22421c<BLiveEnvelope> getNextLiveActivities(@NonNull Pagination pagination, @Nullable String str) {
        rnl.C19886a c19886aM182300c = rnl.m182263l(zvr.m221802b("/live-activities")).m182288p().m182300c("with", "live-feeds,rooms,voice-rooms,users,lives,voice-lives");
        if (!TextUtils.isEmpty(str)) {
            c19886aM182300c.m182300c("source", str);
        }
        return LiveExternalApi.buildLiveReadReq(rnl.m182263l(c19886aM182300c.toString() + "&" + pagination.links.next), "nextliveActivities");
    }

    public static C22421c<mvn> getNextPage(@Nullable Pagination pagination) {
        return (pagination == null || TextUtils.isEmpty(pagination.links.next)) ? C22421c.create(new ek20()) : getNextLiveActivities(pagination, null).map(new itn());
    }

    public static C22421c<mvn> getLiveActivitiesSuggests(final mvn mvnVar) {
        C22421c<BLiveEnvelope> liveActivitiesSuggests = getLiveActivitiesSuggests();
        Objects.requireNonNull(mvnVar);
        return liveActivitiesSuggests.map(new qcj() { // from class: l.htn
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return mvnVar.m160299s((BLiveEnvelope) obj);
            }
        });
    }
}
