package com.coremedia.iso.boxes.fragment;

import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.googlecode.mp4parser.AbstractContainerBox;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p149l.b5c;

/* JADX INFO: loaded from: classes.dex */
public class MovieFragmentBox extends AbstractContainerBox {
    public static final String TYPE = "moof";

    public MovieFragmentBox() {
        super(TYPE);
    }

    public b5c getFileChannel() {
        return this.dataSource;
    }

    public List<Long> getSyncSamples(SampleDependencyTypeBox sampleDependencyTypeBox) {
        ArrayList arrayList = new ArrayList();
        Iterator<SampleDependencyTypeBox.C1398a> it = sampleDependencyTypeBox.getEntries().iterator();
        long j = 1;
        while (it.hasNext()) {
            if (it.next().m7341c() == 2) {
                arrayList.add(Long.valueOf(j));
            }
            j++;
        }
        return arrayList;
    }

    public int getTrackCount() {
        return getBoxes(TrackFragmentBox.class, false).size();
    }

    public List<TrackFragmentHeaderBox> getTrackFragmentHeaderBoxes() {
        return getBoxes(TrackFragmentHeaderBox.class, true);
    }

    public long[] getTrackNumbers() {
        List boxes = getBoxes(TrackFragmentBox.class, false);
        long[] jArr = new long[boxes.size()];
        for (int i = 0; i < boxes.size(); i++) {
            jArr[i] = ((TrackFragmentBox) boxes.get(i)).getTrackFragmentHeaderBox().getTrackId();
        }
        return jArr;
    }

    public List<TrackRunBox> getTrackRunBoxes() {
        return getBoxes(TrackRunBox.class, true);
    }
}
