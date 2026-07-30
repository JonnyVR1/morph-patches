package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractContainerBox;
import java.util.List;
import p153l.ef3;

/* JADX INFO: loaded from: classes.dex */
public class TrackBox extends AbstractContainerBox {
    public static final String TYPE = "trak";
    private SampleTableBox sampleTableBox;

    public TrackBox() {
        super(TYPE);
    }

    public MediaBox getMediaBox() {
        for (ef3 ef3Var : getBoxes()) {
            if (ef3Var instanceof MediaBox) {
                return (MediaBox) ef3Var;
            }
        }
        return null;
    }

    public SampleTableBox getSampleTableBox() {
        MediaInformationBox mediaInformationBox;
        SampleTableBox sampleTableBox = this.sampleTableBox;
        if (sampleTableBox != null) {
            return sampleTableBox;
        }
        MediaBox mediaBox = getMediaBox();
        if (mediaBox == null || (mediaInformationBox = mediaBox.getMediaInformationBox()) == null) {
            return null;
        }
        SampleTableBox sampleTableBox2 = mediaInformationBox.getSampleTableBox();
        this.sampleTableBox = sampleTableBox2;
        return sampleTableBox2;
    }

    public TrackHeaderBox getTrackHeaderBox() {
        for (ef3 ef3Var : getBoxes()) {
            if (ef3Var instanceof TrackHeaderBox) {
                return (TrackHeaderBox) ef3Var;
            }
        }
        return null;
    }

    @Override // com.googlecode.mp4parser.BasicContainer
    public void setBoxes(List<ef3> list) {
        super.setBoxes(list);
        this.sampleTableBox = null;
    }
}
