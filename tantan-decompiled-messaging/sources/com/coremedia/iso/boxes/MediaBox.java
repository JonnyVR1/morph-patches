package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractContainerBox;
import p149l.pe3;

/* JADX INFO: loaded from: classes.dex */
public class MediaBox extends AbstractContainerBox {
    public static final String TYPE = "mdia";

    public MediaBox() {
        super(TYPE);
    }

    public HandlerBox getHandlerBox() {
        for (pe3 pe3Var : getBoxes()) {
            if (pe3Var instanceof HandlerBox) {
                return (HandlerBox) pe3Var;
            }
        }
        return null;
    }

    public MediaHeaderBox getMediaHeaderBox() {
        for (pe3 pe3Var : getBoxes()) {
            if (pe3Var instanceof MediaHeaderBox) {
                return (MediaHeaderBox) pe3Var;
            }
        }
        return null;
    }

    public MediaInformationBox getMediaInformationBox() {
        for (pe3 pe3Var : getBoxes()) {
            if (pe3Var instanceof MediaInformationBox) {
                return (MediaInformationBox) pe3Var;
            }
        }
        return null;
    }
}
