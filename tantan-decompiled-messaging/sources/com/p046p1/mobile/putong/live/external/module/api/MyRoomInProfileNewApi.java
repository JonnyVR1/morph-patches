package com.p046p1.mobile.putong.live.external.module.api;

import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveRoomInProfile;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomInProfile;
import com.p046p1.mobile.putong.live.external.module.api.MyRoomInProfileNewApi;
import p133rx.C22306c;
import p149l.cll;
import p149l.j760;
import p149l.w9j;
import p149l.ytr;

/* JADX INFO: loaded from: classes13.dex */
public class MyRoomInProfileNewApi {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ j760 m70485a(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        return new j760(bLiveData.liveRoomInProfile, bLiveData.voiceRoomInProfile);
    }

    public C22306c<j760<BLiveRoomInProfile, BLiveVoiceRoomInProfile>> getMyRoomInProfileNew(String str) {
        return LiveExternalApi.buildLiveReadReq(cll.m107501r(ytr.m216073b("/room-in-profile-v2/") + str).m107524p().m107537d(), "get_my_room_in_profile-v2" + str).map(new w9j() { // from class: l.cw10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return MyRoomInProfileNewApi.m70485a((BLiveEnvelope) obj);
            }
        });
    }
}
