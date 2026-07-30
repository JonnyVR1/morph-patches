package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class qz4 extends pz4 {
    @Override // p153l.pz4, p153l.s0y
    /* JADX INFO: renamed from: a */
    public boolean mo99892a(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject) {
        ArrayList<Media> arrayList = mediaWrapper.allSelectedMedias;
        if (!mediaWrapper.isVideoSelected()) {
            m174344i(act, arrayList, mediaPickerParamsObject);
        } else {
            if (m174343h(act, arrayList)) {
                return true;
            }
            m174345j(act, arrayList);
        }
        return true;
    }
}
