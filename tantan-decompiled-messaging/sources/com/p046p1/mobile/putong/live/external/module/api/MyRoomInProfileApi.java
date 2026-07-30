package com.p046p1.mobile.putong.live.external.module.api;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveActivity;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p046p1.mobile.putong.live.external.module.api.MyRoomInProfileApi;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;
import p149l.aw10;
import p149l.cll;
import p149l.vdt;
import p149l.vwb;
import p149l.w9j;
import p149l.ytr;

/* JADX INFO: loaded from: classes13.dex */
public class MyRoomInProfileApi {
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ List m70484h(final String str, BLiveEnvelope bLiveEnvelope) {
        BLiveAbsRoom bLiveAbsRoom;
        ArrayList arrayList = new ArrayList();
        for (final BLiveActivity bLiveActivity : bLiveEnvelope.data.liveActivities) {
            BLiveAbsData bLiveAbsData = null;
            BLiveAbsRoom bLiveAbsRoom2 = null;
            if (vwb.m200296J(bLiveEnvelope.data.lives)) {
                bLiveAbsRoom = null;
            } else {
                BLiveAbsData bLiveAbsData2 = (BLiveAbsData) vwb.m200346r(bLiveEnvelope.data.lives, new w9j() { // from class: l.rv10
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals(bLiveActivity.reference.f44419id, ((BLive) obj).f44323id));
                    }
                });
                if (NullChecker.m81303a(bLiveAbsData2)) {
                    final String str2 = bLiveAbsData2.room.f44419id;
                    bLiveAbsRoom2 = (BLiveAbsRoom) vwb.m200346r(bLiveEnvelope.data.rooms, new w9j() { // from class: l.sv10
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return Boolean.valueOf(TextUtils.equals(str2, ((BLiveRoom) obj).f44324id));
                        }
                    });
                }
                BLiveAbsRoom bLiveAbsRoom3 = bLiveAbsRoom2;
                bLiveAbsData = bLiveAbsData2;
                bLiveAbsRoom = bLiveAbsRoom3;
            }
            if (bLiveAbsData == null) {
                bLiveAbsData = (BLiveAbsData) vwb.m200346r(bLiveEnvelope.data.voiceLives, new w9j() { // from class: l.tv10
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals(bLiveActivity.reference.f44419id, ((BLiveVoice) obj).f44323id));
                    }
                });
                if (NullChecker.m81303a(bLiveAbsData)) {
                    final String str3 = bLiveAbsData.room.f44419id;
                    bLiveAbsRoom = (BLiveAbsRoom) vwb.m200346r(bLiveEnvelope.data.voiceRooms, new w9j() { // from class: l.uv10
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return Boolean.valueOf(TextUtils.equals(((BLiveVoiceRoom) obj).f44324id, str3));
                        }
                    });
                }
            }
            if (bLiveAbsData != null) {
                arrayList.add(new aw10(bLiveAbsData, bLiveAbsRoom, (User) vwb.m200346r(bLiveEnvelope.data.users, new w9j() { // from class: l.vv10
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals(((User) obj).f56011id, str));
                    }
                }), bLiveActivity));
            }
        }
        return arrayList;
    }

    public C22306c<List<aw10>> getMyRoomInProfile(final String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(ytr.m216073b(!vdt.m198092b(2) ? "/feed/room-in-profile/" : "/room-in-profile/"));
        sb.append(str);
        return LiveExternalApi.buildLiveReadReq(cll.m107501r(sb.toString()).m107524p().m107536c("with", "lives,voice-lives,rooms,voice-rooms,users").m107537d(), "get_my_room_in_profile" + str).filter(new w9j() { // from class: l.ov10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J(((BLiveEnvelope) obj).data.liveActivities));
            }
        }).map(new w9j() { // from class: l.pv10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return MyRoomInProfileApi.m70484h(str, (BLiveEnvelope) obj);
            }
        }).filter(new w9j() { // from class: l.qv10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!vwb.m200296J((List) obj));
            }
        });
    }
}
