package org.fourthline.cling.support.model.dlna.types;

import org.fourthline.cling.model.types.BytesRange;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class TimeSeekRangeType {
    private BytesRange bytesRange;
    private NormalPlayTimeRange normalPlayTimeRange;

    public TimeSeekRangeType(NormalPlayTimeRange normalPlayTimeRange, BytesRange bytesRange) {
        this.normalPlayTimeRange = normalPlayTimeRange;
        this.bytesRange = bytesRange;
    }

    public BytesRange getBytesRange() {
        return this.bytesRange;
    }

    public NormalPlayTimeRange getNormalPlayTimeRange() {
        return this.normalPlayTimeRange;
    }

    public void setBytesRange(BytesRange bytesRange) {
        this.bytesRange = bytesRange;
    }

    public TimeSeekRangeType(NormalPlayTimeRange normalPlayTimeRange) {
        this.normalPlayTimeRange = normalPlayTimeRange;
    }
}
