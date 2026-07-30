package com.p069ss.bytertc.engine.audio;

import com.p069ss.bytertc.engine.ISingScoringEventHandler;
import com.p069ss.bytertc.engine.data.SingScoringConfig;
import com.p069ss.bytertc.engine.data.StandardPitchInfo;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public abstract class ISingScoringManager {
    public abstract int getAverageScore();

    public abstract int getLastSentenceScore();

    public abstract List<StandardPitchInfo> getStandardPitchInfo(String str);

    public abstract int getTotalScore();

    public abstract int initSingScoring(String str, String str2, ISingScoringEventHandler iSingScoringEventHandler);

    public abstract int setSingScoringConfig(SingScoringConfig singScoringConfig);

    public abstract int startSingScoring(int i, int i2);

    public abstract int stopSingScoring();
}
