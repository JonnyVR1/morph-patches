package org.fourthline.cling.support.model.dlna.types;

import org.fourthline.cling.model.types.BytesRange;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class AvailableSeekRangeType {
    private BytesRange bytesRange;
    private Mode modeFlag;
    private NormalPlayTimeRange normalPlayTimeRange;

    public enum Mode {
        MODE_0,
        MODE_1
    }

    public AvailableSeekRangeType(Mode mode, NormalPlayTimeRange normalPlayTimeRange, BytesRange bytesRange) {
        this.modeFlag = mode;
        this.normalPlayTimeRange = normalPlayTimeRange;
        this.bytesRange = bytesRange;
    }

    public BytesRange getBytesRange() {
        return this.bytesRange;
    }

    public Mode getModeFlag() {
        return this.modeFlag;
    }

    public NormalPlayTimeRange getNormalPlayTimeRange() {
        return this.normalPlayTimeRange;
    }

    public AvailableSeekRangeType(Mode mode, BytesRange bytesRange) {
        this.modeFlag = mode;
        this.bytesRange = bytesRange;
    }

    public AvailableSeekRangeType(Mode mode, NormalPlayTimeRange normalPlayTimeRange) {
        this.modeFlag = mode;
        this.normalPlayTimeRange = normalPlayTimeRange;
    }
}
