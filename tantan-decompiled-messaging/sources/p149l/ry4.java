package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class ry4 extends qy4 {
    @Override // p149l.qy4, p149l.vrx
    /* JADX INFO: renamed from: a */
    public boolean mo95873a(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject) {
        ArrayList<Media> arrayList = mediaWrapper.allSelectedMedias;
        if (!mediaWrapper.isVideoSelected()) {
            m177024i(act, arrayList, mediaPickerParamsObject);
        } else {
            if (m177023h(act, arrayList)) {
                return true;
            }
            m177025j(act, arrayList);
        }
        return true;
    }
}
