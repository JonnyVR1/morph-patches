package com.p069ss.bytertc.engine.live;

import com.p069ss.bytertc.engine.data.DestInfo;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class PushSingleStreamParam {
    public List<DestInfo> destInfos;
    public boolean isScreen;
    public SingleStreamPushType pushType;
    public String roomId;
    public String url;
    public String userId;

    public PushSingleStreamParam(String str, String str2, String str3, boolean z) {
        this.isScreen = false;
        SingleStreamPushType singleStreamPushType = SingleStreamPushType.SINGLE_STREAM_PUSH_TYPE_TO_CDN;
        this.roomId = str;
        this.userId = str2;
        this.url = str3;
        this.isScreen = z;
        this.destInfos = null;
        this.pushType = singleStreamPushType;
    }

    public PushSingleStreamParam(String str, String str2, String str3, boolean z, List<DestInfo> list, SingleStreamPushType singleStreamPushType) {
        this.isScreen = false;
        SingleStreamPushType singleStreamPushType2 = SingleStreamPushType.SINGLE_STREAM_PUSH_TYPE_TO_CDN;
        this.roomId = str;
        this.userId = str2;
        this.url = str3;
        this.isScreen = z;
        this.destInfos = list;
        this.pushType = singleStreamPushType;
    }

    public PushSingleStreamParam() {
        this.isScreen = false;
        this.pushType = SingleStreamPushType.SINGLE_STREAM_PUSH_TYPE_TO_CDN;
    }
}
