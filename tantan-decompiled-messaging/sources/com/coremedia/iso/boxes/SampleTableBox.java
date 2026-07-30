package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractContainerBox;
import p149l.pe3;

/* JADX INFO: loaded from: classes.dex */
public class SampleTableBox extends AbstractContainerBox {
    public static final String TYPE = "stbl";
    private SampleToChunkBox sampleToChunkBox;

    public SampleTableBox() {
        super(TYPE);
    }

    public ChunkOffsetBox getChunkOffsetBox() {
        for (pe3 pe3Var : getBoxes()) {
            if (pe3Var instanceof ChunkOffsetBox) {
                return (ChunkOffsetBox) pe3Var;
            }
        }
        return null;
    }

    public CompositionTimeToSample getCompositionTimeToSample() {
        for (pe3 pe3Var : getBoxes()) {
            if (pe3Var instanceof CompositionTimeToSample) {
                return (CompositionTimeToSample) pe3Var;
            }
        }
        return null;
    }

    public SampleDependencyTypeBox getSampleDependencyTypeBox() {
        for (pe3 pe3Var : getBoxes()) {
            if (pe3Var instanceof SampleDependencyTypeBox) {
                return (SampleDependencyTypeBox) pe3Var;
            }
        }
        return null;
    }

    public SampleDescriptionBox getSampleDescriptionBox() {
        for (pe3 pe3Var : getBoxes()) {
            if (pe3Var instanceof SampleDescriptionBox) {
                return (SampleDescriptionBox) pe3Var;
            }
        }
        return null;
    }

    public SampleSizeBox getSampleSizeBox() {
        for (pe3 pe3Var : getBoxes()) {
            if (pe3Var instanceof SampleSizeBox) {
                return (SampleSizeBox) pe3Var;
            }
        }
        return null;
    }

    public SampleToChunkBox getSampleToChunkBox() {
        SampleToChunkBox sampleToChunkBox = this.sampleToChunkBox;
        if (sampleToChunkBox != null) {
            return sampleToChunkBox;
        }
        for (pe3 pe3Var : getBoxes()) {
            if (pe3Var instanceof SampleToChunkBox) {
                SampleToChunkBox sampleToChunkBox2 = (SampleToChunkBox) pe3Var;
                this.sampleToChunkBox = sampleToChunkBox2;
                return sampleToChunkBox2;
            }
        }
        return null;
    }

    public SyncSampleBox getSyncSampleBox() {
        for (pe3 pe3Var : getBoxes()) {
            if (pe3Var instanceof SyncSampleBox) {
                return (SyncSampleBox) pe3Var;
            }
        }
        return null;
    }

    public TimeToSampleBox getTimeToSampleBox() {
        for (pe3 pe3Var : getBoxes()) {
            if (pe3Var instanceof TimeToSampleBox) {
                return (TimeToSampleBox) pe3Var;
            }
        }
        return null;
    }
}
