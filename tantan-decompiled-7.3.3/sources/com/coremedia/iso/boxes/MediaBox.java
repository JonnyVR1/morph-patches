package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractContainerBox;
import p153l.ef3;

/* JADX INFO: loaded from: classes.dex */
public class MediaBox extends AbstractContainerBox {
    public static final String TYPE = "mdia";

    public MediaBox() {
        super(TYPE);
    }

    public HandlerBox getHandlerBox() {
        for (ef3 ef3Var : getBoxes()) {
            if (ef3Var instanceof HandlerBox) {
                return (HandlerBox) ef3Var;
            }
        }
        return null;
    }

    public MediaHeaderBox getMediaHeaderBox() {
        for (ef3 ef3Var : getBoxes()) {
            if (ef3Var instanceof MediaHeaderBox) {
                return (MediaHeaderBox) ef3Var;
            }
        }
        return null;
    }

    public MediaInformationBox getMediaInformationBox() {
        for (ef3 ef3Var : getBoxes()) {
            if (ef3Var instanceof MediaInformationBox) {
                return (MediaInformationBox) ef3Var;
            }
        }
        return null;
    }
}
