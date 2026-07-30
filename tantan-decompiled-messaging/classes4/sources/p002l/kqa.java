package p002l;

import android.content.Intent;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import java.util.ArrayList;
import l.vrx;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class kqa implements vrx {
    /* JADX INFO: renamed from: a */
    public boolean m16761a(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject) {
        Video selectedVideo = mediaWrapper.getSelectedVideo();
        Intent intent = new Intent();
        ArrayList arrayList = new ArrayList();
        arrayList.add(selectedVideo);
        intent.putExtra("extra_images", arrayList);
        intent.putExtra("extra_images_just_back", true);
        act.setResult(-1, intent);
        act.finish();
        return true;
    }
}
