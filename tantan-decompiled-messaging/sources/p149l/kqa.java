package p149l;

import android.content.Intent;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class kqa implements vrx {
    @Override // p149l.vrx
    /* JADX INFO: renamed from: a */
    public boolean mo95873a(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject) {
        Video video = (Video) mediaWrapper.getSelectedVideo();
        Intent intent = new Intent();
        ArrayList arrayList = new ArrayList();
        arrayList.add(video);
        intent.putExtra("extra_images", arrayList);
        intent.putExtra("extra_images_just_back", true);
        act.setResult(-1, intent);
        act.lambda$debugItems$19();
        return true;
    }
}
