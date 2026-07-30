package com.p074ss.bytertc.engine.audio;

import com.p074ss.bytertc.engine.data.Position;
import com.p074ss.bytertc.engine.data.ReceiveRange;
import com.p074ss.bytertc.engine.type.AttenuationType;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public interface IRangeAudio {
    void enableRangeAudio(boolean z);

    int setAttenuationModel(AttenuationType attenuationType, float f);

    void setNoAttenuationFlags(List<String> list);

    int updatePosition(Position position);

    int updateReceiveRange(ReceiveRange receiveRange);
}
