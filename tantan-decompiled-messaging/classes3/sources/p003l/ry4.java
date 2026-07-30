package p003l;

import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import java.util.ArrayList;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ry4 extends qy4 {
    @Override // p003l.qy4
    /* JADX INFO: renamed from: a */
    public boolean mo7071a(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject) {
        ArrayList<Media> arrayList = mediaWrapper.allSelectedMedias;
        if (!mediaWrapper.isVideoSelected()) {
            m7075i(act, arrayList, mediaPickerParamsObject);
        } else {
            if (m7074h(act, arrayList)) {
                return true;
            }
            m7076j(act, arrayList);
        }
        return true;
    }
}
