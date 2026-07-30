package com.coremedia.iso.boxes.fragment;

import com.googlecode.mp4parser.AbstractContainerBox;
import p153l.ef3;

/* JADX INFO: loaded from: classes.dex */
public class TrackFragmentBox extends AbstractContainerBox {
    public static final String TYPE = "traf";

    public TrackFragmentBox() {
        super(TYPE);
    }

    public TrackFragmentHeaderBox getTrackFragmentHeaderBox() {
        for (ef3 ef3Var : getBoxes()) {
            if (ef3Var instanceof TrackFragmentHeaderBox) {
                return (TrackFragmentHeaderBox) ef3Var;
            }
        }
        return null;
    }
}
