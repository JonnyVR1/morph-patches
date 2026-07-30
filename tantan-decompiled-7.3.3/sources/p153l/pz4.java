package p153l;

import android.content.Intent;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class pz4 implements s0y {

    /* JADX INFO: renamed from: a */
    public static String f154719a = "selected_image";

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m174341g() {
    }

    @Override // p153l.s0y
    /* JADX INFO: renamed from: a */
    public boolean mo99892a(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject) {
        if (mediaWrapper.isVideoSelected()) {
            act.startActivityForResult(cmc0.m111161a(act, mediaWrapper, mediaPickerParamsObject, mediaWrapper.getSelectedVideo()), 1);
            return true;
        }
        m174344i(act, mediaWrapper.allSelectedMedias, mediaPickerParamsObject);
        return true;
    }

    @Override // p153l.s0y
    /* JADX INFO: renamed from: e */
    public void mo174342e(int i, String str, Map<String, Object> map) {
        if (i == 10 || i == 11 || i == 13) {
            i4g0.m138521s("e_picture_moment_preview_send", str, map);
        }
    }

    @Override // p153l.s0y
    /* JADX INFO: renamed from: f */
    public void mo99893f(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject, Intent intent) {
        if (NullChecker.m82486a(intent) ? intent.getBooleanExtra("extra_images_just_back", false) : false) {
            boolean zIsVideoSelected = mediaWrapper.isVideoSelected();
            ArrayList<Media> arrayList = mediaWrapper.allSelectedMedias;
            if (zIsVideoSelected) {
                m174345j(act, arrayList);
            } else {
                m174344i(act, arrayList, mediaPickerParamsObject);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m174343h(Act act, ArrayList<Media> arrayList) {
        if (jyb.m147479J(arrayList) || !(arrayList.get(0) instanceof Video) || ((Video) arrayList.get(0)).duration < 60000.0f) {
            return false;
        }
        new jl80.C17971a(act).m146056y0(act.getString(R$string.f21455A4)).m146050s0(R$string.f21480D5, new Object[0]).m146034c0(act.getString(R$string.f21748k), new Runnable() { // from class: l.oz4
            @Override // java.lang.Runnable
            public final void run() {
                pz4.m174341g();
            }
        }).m146049r0();
        return true;
    }

    /* JADX INFO: renamed from: i */
    public void m174344i(Act act, ArrayList<Media> arrayList, MediaPickerParamsObject mediaPickerParamsObject) {
        if (m174343h(act, arrayList) || jyb.m147479J(arrayList)) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(f154719a, arrayList);
        intent.putExtra("extra_images", arrayList);
        intent.putExtra("extra_images_just_back", true);
        intent.putExtra("extra_from_type", NullChecker.m82486a(mediaPickerParamsObject) ? mediaPickerParamsObject.fromType : 0);
        act.setResult(-1, intent);
        act.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: j */
    public void m174345j(Act act, ArrayList<Media> arrayList) {
        if (jyb.m147479J(arrayList)) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(f154719a, arrayList);
        intent.putExtra("extra_images", arrayList);
        intent.putExtra("extra_images_just_back", true);
        act.setResult(-1, intent);
        act.lambda$debugItems$19();
    }
}
