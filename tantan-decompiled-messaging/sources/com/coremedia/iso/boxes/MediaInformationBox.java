package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractContainerBox;
import p149l.pe3;

/* JADX INFO: loaded from: classes.dex */
public class MediaInformationBox extends AbstractContainerBox {
    public static final String TYPE = "minf";

    public MediaInformationBox() {
        super(TYPE);
    }

    public AbstractMediaHeaderBox getMediaHeaderBox() {
        for (pe3 pe3Var : getBoxes()) {
            if (pe3Var instanceof AbstractMediaHeaderBox) {
                return (AbstractMediaHeaderBox) pe3Var;
            }
        }
        return null;
    }

    public SampleTableBox getSampleTableBox() {
        for (pe3 pe3Var : getBoxes()) {
            if (pe3Var instanceof SampleTableBox) {
                return (SampleTableBox) pe3Var;
            }
        }
        return null;
    }
}
