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
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class qy4 implements vrx {

    /* JADX INFO: renamed from: a */
    public static String f156900a = "selected_image";

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m177021g() {
    }

    @Override // p149l.vrx
    /* JADX INFO: renamed from: a */
    public boolean mo95873a(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject) {
        if (mediaWrapper.isVideoSelected()) {
            act.startActivityForResult(vdc0.m197987a(act, mediaWrapper, mediaPickerParamsObject, mediaWrapper.getSelectedVideo()), 1);
            return true;
        }
        m177024i(act, mediaWrapper.allSelectedMedias, mediaPickerParamsObject);
        return true;
    }

    @Override // p149l.vrx
    /* JADX INFO: renamed from: e */
    public void mo177022e(int i, String str, Map<String, Object> map) {
        if (i == 10 || i == 11 || i == 13) {
            zvf0.m220397s("e_picture_moment_preview_send", str, map);
        }
    }

    @Override // p149l.vrx
    /* JADX INFO: renamed from: f */
    public void mo142779f(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject, Intent intent) {
        if (NullChecker.m81303a(intent) ? intent.getBooleanExtra("extra_images_just_back", false) : false) {
            boolean zIsVideoSelected = mediaWrapper.isVideoSelected();
            ArrayList<Media> arrayList = mediaWrapper.allSelectedMedias;
            if (zIsVideoSelected) {
                m177025j(act, arrayList);
            } else {
                m177024i(act, arrayList, mediaPickerParamsObject);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m177023h(Act act, ArrayList<Media> arrayList) {
        if (vwb.m200296J(arrayList) || !(arrayList.get(0) instanceof Video) || ((Video) arrayList.get(0)).duration < 60000.0f) {
            return false;
        }
        new dd80.C16336a(act).m110996y0(act.getString(R$string.f20713A4)).m110990s0(R$string.f20738D5, new Object[0]).m110974c0(act.getString(R$string.f21006k), new Runnable() { // from class: l.py4
            @Override // java.lang.Runnable
            public final void run() {
                qy4.m177021g();
            }
        }).m110989r0();
        return true;
    }

    /* JADX INFO: renamed from: i */
    public void m177024i(Act act, ArrayList<Media> arrayList, MediaPickerParamsObject mediaPickerParamsObject) {
        if (m177023h(act, arrayList) || vwb.m200296J(arrayList)) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(f156900a, arrayList);
        intent.putExtra("extra_images", arrayList);
        intent.putExtra("extra_images_just_back", true);
        intent.putExtra("extra_from_type", NullChecker.m81303a(mediaPickerParamsObject) ? mediaPickerParamsObject.fromType : 0);
        act.setResult(-1, intent);
        act.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: j */
    public void m177025j(Act act, ArrayList<Media> arrayList) {
        if (vwb.m200296J(arrayList)) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(f156900a, arrayList);
        intent.putExtra("extra_images", arrayList);
        intent.putExtra("extra_images_just_back", true);
        act.setResult(-1, intent);
        act.lambda$debugItems$19();
    }
}
