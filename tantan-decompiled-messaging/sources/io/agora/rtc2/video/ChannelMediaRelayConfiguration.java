package io.agora.rtc2.video;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ChannelMediaRelayConfiguration {
    private Map<String, ChannelMediaInfo> destInfos;
    private ChannelMediaInfo srcInfo;

    public ChannelMediaRelayConfiguration() {
        this.srcInfo = null;
        this.destInfos = null;
        this.destInfos = new HashMap();
        this.srcInfo = new ChannelMediaInfo(null, null, 0);
    }

    public Map<String, ChannelMediaInfo> getDestChannelMediaInfos() {
        return this.destInfos;
    }

    public ChannelMediaInfo getSrcChannelMediaInfo() {
        return this.srcInfo;
    }

    public void removeDestChannelInfo(String str) {
        this.destInfos.remove(str);
    }

    public void setDestChannelInfo(String str, ChannelMediaInfo channelMediaInfo) {
        this.destInfos.put(str, channelMediaInfo);
    }

    public void setSrcChannelInfo(ChannelMediaInfo channelMediaInfo) {
        this.srcInfo = channelMediaInfo;
    }
}
