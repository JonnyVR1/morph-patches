package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractContainerBox;
import p153l.ef3;

/* JADX INFO: loaded from: classes.dex */
public class SampleTableBox extends AbstractContainerBox {
    public static final String TYPE = "stbl";
    private SampleToChunkBox sampleToChunkBox;

    public SampleTableBox() {
        super(TYPE);
    }

    public ChunkOffsetBox getChunkOffsetBox() {
        for (ef3 ef3Var : getBoxes()) {
            if (ef3Var instanceof ChunkOffsetBox) {
                return (ChunkOffsetBox) ef3Var;
            }
        }
        return null;
    }

    public CompositionTimeToSample getCompositionTimeToSample() {
        for (ef3 ef3Var : getBoxes()) {
            if (ef3Var instanceof CompositionTimeToSample) {
                return (CompositionTimeToSample) ef3Var;
            }
        }
        return null;
    }

    public SampleDependencyTypeBox getSampleDependencyTypeBox() {
        for (ef3 ef3Var : getBoxes()) {
            if (ef3Var instanceof SampleDependencyTypeBox) {
                return (SampleDependencyTypeBox) ef3Var;
            }
        }
        return null;
    }

    public SampleDescriptionBox getSampleDescriptionBox() {
        for (ef3 ef3Var : getBoxes()) {
            if (ef3Var instanceof SampleDescriptionBox) {
                return (SampleDescriptionBox) ef3Var;
            }
        }
        return null;
    }

    public SampleSizeBox getSampleSizeBox() {
        for (ef3 ef3Var : getBoxes()) {
            if (ef3Var instanceof SampleSizeBox) {
                return (SampleSizeBox) ef3Var;
            }
        }
        return null;
    }

    public SampleToChunkBox getSampleToChunkBox() {
        SampleToChunkBox sampleToChunkBox = this.sampleToChunkBox;
        if (sampleToChunkBox != null) {
            return sampleToChunkBox;
        }
        for (ef3 ef3Var : getBoxes()) {
            if (ef3Var instanceof SampleToChunkBox) {
                SampleToChunkBox sampleToChunkBox2 = (SampleToChunkBox) ef3Var;
                this.sampleToChunkBox = sampleToChunkBox2;
                return sampleToChunkBox2;
            }
        }
        return null;
    }

    public SyncSampleBox getSyncSampleBox() {
        for (ef3 ef3Var : getBoxes()) {
            if (ef3Var instanceof SyncSampleBox) {
                return (SyncSampleBox) ef3Var;
            }
        }
        return null;
    }

    public TimeToSampleBox getTimeToSampleBox() {
        for (ef3 ef3Var : getBoxes()) {
            if (ef3Var instanceof TimeToSampleBox) {
                return (TimeToSampleBox) ef3Var;
            }
        }
        return null;
    }
}
