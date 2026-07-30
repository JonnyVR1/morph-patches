package com.p074ss.bytertc.engine.live;

import com.p074ss.bytertc.engine.data.HumanOrientation;
import com.p074ss.bytertc.engine.data.Position;

/* JADX INFO: loaded from: classes11.dex */
public class MixedStreamSpatialAudioConfig {
    public boolean enableSpatialRender = false;
    public Position audienceSpatialPosition = new Position();
    public HumanOrientation audienceSpatialOrientation = new HumanOrientation();

    public MixedStreamSpatialAudioConfig setAudienceSpatialPosition(float f, float f2, float f3) {
        Position position = this.audienceSpatialPosition;
        position.f56469x = f;
        position.f56470y = f2;
        position.f56471z = f3;
        return this;
    }
}
