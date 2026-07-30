package p003l;

import android.content.Intent;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Map;
import l.dd80;
import l.vdc0;
import l.vrx;
import l.vwb;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class qy4 implements vrx {

    /* JADX INFO: renamed from: a */
    public static String f6726a = "selected_image";

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m7070g() {
    }

    /* JADX INFO: renamed from: a */
    public boolean mo7071a(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject) {
        if (mediaWrapper.isVideoSelected()) {
            act.startActivityForResult(vdc0.a(act, mediaWrapper, mediaPickerParamsObject, mediaWrapper.getSelectedVideo()), 1);
            return true;
        }
        m7075i(act, mediaWrapper.allSelectedMedias, mediaPickerParamsObject);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public void m7072e(int i, String str, Map<String, Object> map) {
        if (i == 10 || i == 11 || i == 13) {
            zvf0.s("e_picture_moment_preview_send", str, map);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m7073f(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject, Intent intent) {
        if (NullChecker.a(intent) ? intent.getBooleanExtra("extra_images_just_back", false) : false) {
            boolean zIsVideoSelected = mediaWrapper.isVideoSelected();
            ArrayList<Media> arrayList = mediaWrapper.allSelectedMedias;
            if (zIsVideoSelected) {
                m7076j(act, arrayList);
            } else {
                m7075i(act, arrayList, mediaPickerParamsObject);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m7074h(Act act, ArrayList<Media> arrayList) {
        if (vwb.J(arrayList) || !(arrayList.get(0) instanceof Video) || arrayList.get(0).duration < 60000.0f) {
            return false;
        }
        new dd80.a(act).y0(act.getString(R.string.A4)).s0(R.string.D5, new Object[0]).c0(act.getString(R.string.k), new Runnable() { // from class: l.py4
            @Override // java.lang.Runnable
            public final void run() {
                qy4.m7070g();
            }
        }).r0();
        return true;
    }

    /* JADX INFO: renamed from: i */
    public void m7075i(Act act, ArrayList<Media> arrayList, MediaPickerParamsObject mediaPickerParamsObject) {
        if (m7074h(act, arrayList) || vwb.J(arrayList)) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(f6726a, arrayList);
        intent.putExtra("extra_images", arrayList);
        intent.putExtra("extra_images_just_back", true);
        intent.putExtra("extra_from_type", NullChecker.a(mediaPickerParamsObject) ? mediaPickerParamsObject.fromType : 0);
        act.setResult(-1, intent);
        act.finish();
    }

    /* JADX INFO: renamed from: j */
    public void m7076j(Act act, ArrayList<Media> arrayList) {
        if (vwb.J(arrayList)) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(f6726a, arrayList);
        intent.putExtra("extra_images", arrayList);
        intent.putExtra("extra_images_just_back", true);
        act.setResult(-1, intent);
        act.finish();
    }
}
