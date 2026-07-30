package com.coremedia.iso.boxes.fragment;

import com.googlecode.mp4parser.AbstractContainerBox;
import p149l.pe3;

/* JADX INFO: loaded from: classes.dex */
public class TrackFragmentBox extends AbstractContainerBox {
    public static final String TYPE = "traf";

    public TrackFragmentBox() {
        super(TYPE);
    }

    public TrackFragmentHeaderBox getTrackFragmentHeaderBox() {
        for (pe3 pe3Var : getBoxes()) {
            if (pe3Var instanceof TrackFragmentHeaderBox) {
                return (TrackFragmentHeaderBox) pe3Var;
            }
        }
        return null;
    }
}
