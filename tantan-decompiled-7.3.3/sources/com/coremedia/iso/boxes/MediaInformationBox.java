package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractContainerBox;
import p153l.ef3;

/* JADX INFO: loaded from: classes.dex */
public class MediaInformationBox extends AbstractContainerBox {
    public static final String TYPE = "minf";

    public MediaInformationBox() {
        super(TYPE);
    }

    public AbstractMediaHeaderBox getMediaHeaderBox() {
        for (ef3 ef3Var : getBoxes()) {
            if (ef3Var instanceof AbstractMediaHeaderBox) {
                return (AbstractMediaHeaderBox) ef3Var;
            }
        }
        return null;
    }

    public SampleTableBox getSampleTableBox() {
        for (ef3 ef3Var : getBoxes()) {
            if (ef3Var instanceof SampleTableBox) {
                return (SampleTableBox) ef3Var;
            }
        }
        return null;
    }
}
