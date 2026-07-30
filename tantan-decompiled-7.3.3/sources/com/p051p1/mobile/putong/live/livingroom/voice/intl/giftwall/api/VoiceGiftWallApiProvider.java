package com.p051p1.mobile.putong.live.livingroom.voice.intl.giftwall.api;

import com.p051p1.mobile.putong.data.OMSFontStyle;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGiftWallBookInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceUserGiftItem;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.giftwall.api.VoiceGiftWallApiProvider;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.giftwall.bean.VoiceGiftWallData;
import java.util.List;
import p137rx.C22421c;
import p153l.qcj;
import p153l.rnl;
import p153l.vrv;
import p153l.zvr;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceGiftWallApiProvider {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ VoiceGiftWallData m79346a(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        return new VoiceGiftWallData(bLiveData.voiceGiftWallList, bLiveData.voiceGiftWallBriefInfo);
    }

    public static C22421c<List<BLiveVoiceUserGiftItem>> getGiftWallList(String str, String str2) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/live/voice-live-users/" + str + "/gifts")).m182288p().m182300c("liveId", str2).m182301d(), "getGiftWallList").map(new qcj() { // from class: l.ljn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceUserGiftItems;
            }
        });
    }

    public static C22421c<BLiveVoiceGiftWallBookInfo> requestGiftWallDetail(String str, String str2) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/voice-gift-wall/" + str + "/detail/" + str2)).m182288p().m182301d(), "requestGiftWallDetail").map(new qcj() { // from class: l.mjn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveEnvelope) obj).data.voiceGiftWallBookDetail;
            }
        });
    }

    public static C22421c<VoiceGiftWallData> requestGiftWallList(String str, boolean z) {
        return vrv.m202562w(rnl.m182263l(zvr.m221802b("/voice-gift-wall/" + str + "/list")).m182288p().m182300c("tab", z ? OMSFontStyle.light : "unlight").m182301d(), "requestGiftWallList").map(new qcj() { // from class: l.njn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return VoiceGiftWallApiProvider.m79346a((BLiveEnvelope) obj);
            }
        });
    }
}
