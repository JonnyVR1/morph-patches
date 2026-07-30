package org.fourthline.cling.support.model;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class TransportSettings {
    private PlayMode playMode;
    private RecordQualityMode recQualityMode;

    public TransportSettings(PlayMode playMode) {
        this.playMode = PlayMode.NORMAL;
        this.recQualityMode = RecordQualityMode.NOT_IMPLEMENTED;
        this.playMode = playMode;
    }

    public PlayMode getPlayMode() {
        return this.playMode;
    }

    public RecordQualityMode getRecQualityMode() {
        return this.recQualityMode;
    }

    public TransportSettings() {
        this.playMode = PlayMode.NORMAL;
        this.recQualityMode = RecordQualityMode.NOT_IMPLEMENTED;
    }

    public TransportSettings(PlayMode playMode, RecordQualityMode recordQualityMode) {
        this.playMode = PlayMode.NORMAL;
        RecordQualityMode recordQualityMode2 = RecordQualityMode.EP;
        this.playMode = playMode;
        this.recQualityMode = recordQualityMode;
    }
}
