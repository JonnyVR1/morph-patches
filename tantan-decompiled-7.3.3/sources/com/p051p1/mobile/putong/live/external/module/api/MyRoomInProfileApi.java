package com.p051p1.mobile.putong.live.external.module.api;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveActivity;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p051p1.mobile.putong.live.external.module.api.MyRoomInProfileApi;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;
import p153l.i420;
import p153l.jyb;
import p153l.qcj;
import p153l.rnl;
import p153l.wft;
import p153l.zvr;

/* JADX INFO: loaded from: classes9.dex */
public class MyRoomInProfileApi {
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ List m71667h(final String str, BLiveEnvelope bLiveEnvelope) {
        BLiveAbsRoom bLiveAbsRoom;
        ArrayList arrayList = new ArrayList();
        for (final BLiveActivity bLiveActivity : bLiveEnvelope.data.liveActivities) {
            BLiveAbsData bLiveAbsData = null;
            BLiveAbsRoom bLiveAbsRoom2 = null;
            if (jyb.m147479J(bLiveEnvelope.data.lives)) {
                bLiveAbsRoom = null;
            } else {
                BLiveAbsData bLiveAbsData2 = (BLiveAbsData) jyb.m147529r(bLiveEnvelope.data.lives, new qcj() { // from class: l.z320
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals(bLiveActivity.reference.f45267id, ((BLive) obj).f45171id));
                    }
                });
                if (NullChecker.m82486a(bLiveAbsData2)) {
                    final String str2 = bLiveAbsData2.room.f45267id;
                    bLiveAbsRoom2 = (BLiveAbsRoom) jyb.m147529r(bLiveEnvelope.data.rooms, new qcj() { // from class: l.a420
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return Boolean.valueOf(TextUtils.equals(str2, ((BLiveRoom) obj).f45172id));
                        }
                    });
                }
                BLiveAbsRoom bLiveAbsRoom3 = bLiveAbsRoom2;
                bLiveAbsData = bLiveAbsData2;
                bLiveAbsRoom = bLiveAbsRoom3;
            }
            if (bLiveAbsData == null) {
                bLiveAbsData = (BLiveAbsData) jyb.m147529r(bLiveEnvelope.data.voiceLives, new qcj() { // from class: l.b420
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals(bLiveActivity.reference.f45267id, ((BLiveVoice) obj).f45171id));
                    }
                });
                if (NullChecker.m82486a(bLiveAbsData)) {
                    final String str3 = bLiveAbsData.room.f45267id;
                    bLiveAbsRoom = (BLiveAbsRoom) jyb.m147529r(bLiveEnvelope.data.voiceRooms, new qcj() { // from class: l.c420
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return Boolean.valueOf(TextUtils.equals(((BLiveVoiceRoom) obj).f45172id, str3));
                        }
                    });
                }
            }
            if (bLiveAbsData != null) {
                arrayList.add(new i420(bLiveAbsData, bLiveAbsRoom, (User) jyb.m147529r(bLiveEnvelope.data.users, new qcj() { // from class: l.d420
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals(((User) obj).f56859id, str));
                    }
                }), bLiveActivity));
            }
        }
        return arrayList;
    }

    public C22421c<List<i420>> getMyRoomInProfile(final String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(zvr.m221802b(!wft.m206159b(2) ? "/feed/room-in-profile/" : "/room-in-profile/"));
        sb.append(str);
        return LiveExternalApi.buildLiveReadReq(rnl.m182265r(sb.toString()).m182288p().m182300c("with", "lives,voice-lives,rooms,voice-rooms,users").m182301d(), "get_my_room_in_profile" + str).filter(new qcj() { // from class: l.w320
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J(((BLiveEnvelope) obj).data.liveActivities));
            }
        }).map(new qcj() { // from class: l.x320
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return MyRoomInProfileApi.m71667h(str, (BLiveEnvelope) obj);
            }
        }).filter(new qcj() { // from class: l.y320
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!jyb.m147479J((List) obj));
            }
        });
    }
}
