package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractContainerBox;
import java.util.List;
import p153l.ef3;

/* JADX INFO: loaded from: classes.dex */
public class MovieBox extends AbstractContainerBox {
    public static final String TYPE = "moov";

    public MovieBox() {
        super(TYPE);
    }

    public MovieHeaderBox getMovieHeaderBox() {
        for (ef3 ef3Var : getBoxes()) {
            if (ef3Var instanceof MovieHeaderBox) {
                return (MovieHeaderBox) ef3Var;
            }
        }
        return null;
    }

    public int getTrackCount() {
        return getBoxes(TrackBox.class).size();
    }

    public long[] getTrackNumbers() {
        List boxes = getBoxes(TrackBox.class);
        long[] jArr = new long[boxes.size()];
        for (int i = 0; i < boxes.size(); i++) {
            jArr[i] = ((TrackBox) boxes.get(i)).getTrackHeaderBox().getTrackId();
        }
        return jArr;
    }
}
