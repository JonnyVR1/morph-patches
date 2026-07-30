package com.p046p1.mobile.putong.live.livingroom.voice.intl.giftwall.api;

import com.p046p1.mobile.putong.data.OMSFontStyle;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGiftWallBookInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceUserGiftItem;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.giftwall.api.VoiceGiftWallApiProvider;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.giftwall.bean.VoiceGiftWallData;
import java.util.List;
import p133rx.C22306c;
import p149l.cll;
import p149l.upv;
import p149l.w9j;
import p149l.ytr;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceGiftWallApiProvider {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ VoiceGiftWallData m78163a(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        return new VoiceGiftWallData(bLiveData.voiceGiftWallList, bLiveData.voiceGiftWallBriefInfo);
    }

    public static C22306c<List<BLiveVoiceUserGiftItem>> getGiftWallList(String str, String str2) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/live/voice-live-users/" + str + "/gifts")).m107524p().m107536c("liveId", str2).m107537d(), "getGiftWallList").map(new w9j() { // from class: l.han0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceUserGiftItems;
            }
        });
    }

    public static C22306c<BLiveVoiceGiftWallBookInfo> requestGiftWallDetail(String str, String str2) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/voice-gift-wall/" + str + "/detail/" + str2)).m107524p().m107537d(), "requestGiftWallDetail").map(new w9j() { // from class: l.ian0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceGiftWallBookDetail;
            }
        });
    }

    public static C22306c<VoiceGiftWallData> requestGiftWallList(String str, boolean z) {
        return upv.m194935w(cll.m107499l(ytr.m216073b("/voice-gift-wall/" + str + "/list")).m107524p().m107536c("tab", z ? OMSFontStyle.light : "unlight").m107537d(), "requestGiftWallList").map(new w9j() { // from class: l.jan0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return VoiceGiftWallApiProvider.m78163a((BLiveEnvelope) obj);
            }
        });
    }
}
