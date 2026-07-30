package p002l;

import android.content.Intent;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.dd80;
import l.vdc0;
import l.vrx;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class oqa implements vrx {

    /* JADX INFO: renamed from: a */
    public static String f16744a = "selected_image";

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m19674g() {
    }

    /* JADX INFO: renamed from: a */
    public boolean m19675a(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject) {
        if (mediaWrapper.isVideoSelected()) {
            act.startActivityForResult(vdc0.a(act, mediaWrapper, mediaPickerParamsObject, mediaWrapper.getSelectedVideo()), 1);
            return true;
        }
        m19678i(act, mediaWrapper.allSelectedMedias, mediaPickerParamsObject);
        return true;
    }

    /* JADX INFO: renamed from: f */
    public void m19676f(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject, Intent intent) {
        if (NullChecker.a(intent) ? intent.getBooleanExtra("extra_images_just_back", false) : false) {
            boolean zIsVideoSelected = mediaWrapper.isVideoSelected();
            ArrayList<Media> arrayList = mediaWrapper.allSelectedMedias;
            if (zIsVideoSelected) {
                m19679j(act, arrayList);
            } else {
                m19678i(act, arrayList, mediaPickerParamsObject);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m19677h(Act act, ArrayList<Media> arrayList) {
        if (vwb.J(arrayList) || !(arrayList.get(0) instanceof Video) || arrayList.get(0).duration < 60000.0f) {
            return false;
        }
        new dd80.a(act).y0(act.getString(R.string.A4)).s0(R.string.D5, new Object[0]).c0(act.getString(R.string.k), new Runnable() { // from class: l.nqa
            @Override // java.lang.Runnable
            public final void run() {
                oqa.m19674g();
            }
        }).r0();
        return true;
    }

    /* JADX INFO: renamed from: i */
    public void m19678i(Act act, ArrayList<Media> arrayList, MediaPickerParamsObject mediaPickerParamsObject) {
        if (m19677h(act, arrayList) || vwb.J(arrayList)) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(f16744a, arrayList);
        intent.putExtra("extra_images", arrayList);
        intent.putExtra("extra_images_just_back", true);
        intent.putExtra("extra_from_type", NullChecker.a(mediaPickerParamsObject) ? mediaPickerParamsObject.fromType : 0);
        act.setResult(-1, intent);
        act.finish();
    }

    /* JADX INFO: renamed from: j */
    public void m19679j(Act act, ArrayList<Media> arrayList) {
        if (vwb.J(arrayList)) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(f16744a, arrayList);
        intent.putExtra("extra_images", arrayList);
        intent.putExtra("extra_images_just_back", true);
        act.setResult(-1, intent);
        act.finish();
    }
}
