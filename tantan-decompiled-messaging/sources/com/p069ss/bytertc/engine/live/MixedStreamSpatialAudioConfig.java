package com.p069ss.bytertc.engine.live;

import com.p069ss.bytertc.engine.data.HumanOrientation;
import com.p069ss.bytertc.engine.data.Position;

/* JADX INFO: loaded from: classes13.dex */
public class MixedStreamSpatialAudioConfig {
    public boolean enableSpatialRender = false;
    public Position audienceSpatialPosition = new Position();
    public HumanOrientation audienceSpatialOrientation = new HumanOrientation();

    public MixedStreamSpatialAudioConfig setAudienceSpatialPosition(float f, float f2, float f3) {
        Position position = this.audienceSpatialPosition;
        position.f55621x = f;
        position.f55622y = f2;
        position.f55623z = f3;
        return this;
    }
}
