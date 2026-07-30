package com.p051p1.mobile.putong.live.external.module.api;

import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveRoomInProfile;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomInProfile;
import com.p051p1.mobile.putong.live.external.module.api.MyRoomInProfileNewApi;
import p137rx.C22421c;
import p153l.pf60;
import p153l.qcj;
import p153l.rnl;
import p153l.zvr;

/* JADX INFO: loaded from: classes9.dex */
public class MyRoomInProfileNewApi {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ pf60 m71668a(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        return new pf60(bLiveData.liveRoomInProfile, bLiveData.voiceRoomInProfile);
    }

    public C22421c<pf60<BLiveRoomInProfile, BLiveVoiceRoomInProfile>> getMyRoomInProfileNew(String str) {
        return LiveExternalApi.buildLiveReadReq(rnl.m182265r(zvr.m221802b("/room-in-profile-v2/") + str).m182288p().m182301d(), "get_my_room_in_profile-v2" + str).map(new qcj() { // from class: l.k420
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return MyRoomInProfileNewApi.m71668a((BLiveEnvelope) obj);
            }
        });
    }
}
