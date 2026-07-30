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

/* JADX INFO: loaded from: classes4.dex */
public class asa implements s0y {

    /* JADX INFO: renamed from: a */
    public static String f73101a = "selected_image";

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m99891g() {
    }

    @Override // p153l.s0y
    /* JADX INFO: renamed from: a */
    public boolean mo99892a(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject) {
        if (mediaWrapper.isVideoSelected()) {
            act.startActivityForResult(cmc0.m111161a(act, mediaWrapper, mediaPickerParamsObject, mediaWrapper.getSelectedVideo()), 1);
            return true;
        }
        m99895i(act, mediaWrapper.allSelectedMedias, mediaPickerParamsObject);
        return true;
    }

    @Override // p153l.s0y
    /* JADX INFO: renamed from: f */
    public void mo99893f(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject, Intent intent) {
        if (NullChecker.m82486a(intent) ? intent.getBooleanExtra("extra_images_just_back", false) : false) {
            boolean zIsVideoSelected = mediaWrapper.isVideoSelected();
            ArrayList<Media> arrayList = mediaWrapper.allSelectedMedias;
            if (zIsVideoSelected) {
                m99896j(act, arrayList);
            } else {
                m99895i(act, arrayList, mediaPickerParamsObject);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m99894h(Act act, ArrayList<Media> arrayList) {
        if (jyb.m147479J(arrayList) || !(arrayList.get(0) instanceof Video) || ((Video) arrayList.get(0)).duration < 60000.0f) {
            return false;
        }
        new jl80.C17971a(act).m146056y0(act.getString(R$string.f21455A4)).m146050s0(R$string.f21480D5, new Object[0]).m146034c0(act.getString(R$string.f21748k), new Runnable() { // from class: l.zra
            @Override // java.lang.Runnable
            public final void run() {
                asa.m99891g();
            }
        }).m146049r0();
        return true;
    }

    /* JADX INFO: renamed from: i */
    public void m99895i(Act act, ArrayList<Media> arrayList, MediaPickerParamsObject mediaPickerParamsObject) {
        if (m99894h(act, arrayList) || jyb.m147479J(arrayList)) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(f73101a, arrayList);
        intent.putExtra("extra_images", arrayList);
        intent.putExtra("extra_images_just_back", true);
        intent.putExtra("extra_from_type", NullChecker.m82486a(mediaPickerParamsObject) ? mediaPickerParamsObject.fromType : 0);
        act.setResult(-1, intent);
        act.lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: j */
    public void m99896j(Act act, ArrayList<Media> arrayList) {
        if (jyb.m147479J(arrayList)) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(f73101a, arrayList);
        intent.putExtra("extra_images", arrayList);
        intent.putExtra("extra_images_just_back", true);
        act.setResult(-1, intent);
        act.lambda$debugItems$19();
    }
}
