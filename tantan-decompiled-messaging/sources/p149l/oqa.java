package p149l;

import android.content.Intent;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class oqa implements vrx {

    /* JADX INFO: renamed from: a */
    public static String f145115a = "selected_image";

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m165406g() {
    }

    @Override // p149l.vrx
    /* JADX INFO: renamed from: a */
    public boolean mo95873a(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject) {
        if (mediaWrapper.isVideoSelected()) {
            act.startActivityForResult(vdc0.m197987a(act, mediaWrapper, mediaPickerParamsObject, mediaWrapper.getSelectedVideo()), 1);
            return true;
        }
        m165408i(act, mediaWrapper.allSelectedMedias, mediaPickerParamsObject);
        return true;
    }

    @Override // p149l.vrx
    /* JADX INFO: renamed from: f */
    public void mo142779f(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject, Intent intent) {
        if (NullChecker.m81303a(intent) ? intent.getBooleanExtra("extra_images_just_back", false) : false) {
            boolean zIsVideoSelected = mediaWrapper.isVideoSelected();
            ArrayList<Media> arrayList = mediaWrapper.allSelectedMedias;
            if (zIsVideoSelected) {
                m165409j(act, arrayList);
            } else {
                m165408i(act, arrayList, mediaPickerParamsObject);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m165407h(Act act, ArrayList<Media> arrayList) {
        if (vwb.m200296J(arrayList) || !(arrayList.get(0) instanceof Video) || ((Video) arrayList.get(0)).duration < 60000.0f) {
            return false;
        }
        new dd80.C16336a(act).m110996y0(act.getString(R$string.f20713A4)).m110990s0(R$string.f20738D5, new Object[0]).m110974c0(act.getString(R$string.f21006k), new Runnable() { // from class: l.nqa
            @Override // java.lang.Runnable
            public final void run() {
                oqa.m165406g();
            }
        }).m110989r0();
        return true;
    }

    /* JADX INFO: renamed from: i */
    public void m165408i(Act act, ArrayList<Media> arrayList, MediaPickerParamsObject mediaPickerParamsObject) {
        if (m165407h(act, arrayList) || vwb.m200296J(arrayList)) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(f145115a, arrayList);
        intent.putExtra("extra_images", arrayList);
        intent.putExtra("extra_images_just_back", true);
        intent.putExtra("extra_from_type", NullChecker.m81303a(mediaPickerParamsObject) ? mediaPickerParamsObject.fromType : 0);
        act.setResult(-1, intent);
        act.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: j */
    public void m165409j(Act act, ArrayList<Media> arrayList) {
        if (vwb.m200296J(arrayList)) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(f145115a, arrayList);
        intent.putExtra("extra_images", arrayList);
        intent.putExtra("extra_images_just_back", true);
        act.setResult(-1, intent);
        act.lambda$debugItems$19();
    }
}
