package p002l;

import android.content.Intent;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import com.p1.mobile.putong.newui.mediaoperation.preview.MediaPreviewAct;
import com.p1.mobile.putong.ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.vdc0;
import l.vrx;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class jqa implements vrx {

    /* JADX INFO: renamed from: a */
    public float f13980a = 0.0f;

    /* JADX INFO: renamed from: b */
    public ArrayList<Picture> f13981b = new ArrayList<>(1);

    /* JADX INFO: renamed from: a */
    public boolean m16163a(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject) {
        this.f13980a = 0.0f;
        if (mediaWrapper.selectedIsVideo()) {
            this.f13980a = mediaWrapper.getSelectedVideo().duration;
            act.startActivityForResult(m16168i(act, mediaWrapper, mediaPickerParamsObject, mediaWrapper.getSelectedVideo()), 1);
        } else {
            m16167h(mediaWrapper);
            vdc0.c(act, mediaWrapper, mediaPickerParamsObject, mediaWrapper.getSelectedImage());
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m16164b(Intent intent) {
        intent.putExtra("selected_origin_images", this.f13981b);
    }

    /* JADX INFO: renamed from: f */
    public void m16165f(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject, Intent intent) {
        if (NullChecker.a(intent) ? intent.getBooleanExtra("extra_images_just_back", false) : false) {
            if (mediaWrapper.isVideoSelected() || this.f13980a > 0.0f) {
                m16170k(act, mediaWrapper.allSelectedMedias);
            } else {
                m16169j(act, mediaWrapper.allSelectedMedias);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m16166g(Act act, ArrayList<Media> arrayList) {
        float f = this.f13980a;
        if (f >= 16000.0f) {
            act.setResult(4097, new Intent());
            act.finish();
            return true;
        }
        if (f >= 3000.0f) {
            return false;
        }
        act.setResult(4098, new Intent());
        act.finish();
        return true;
    }

    /* JADX INFO: renamed from: h */
    public void m16167h(MediaWrapper mediaWrapper) {
        this.f13981b.clear();
        Picture selectedImage = mediaWrapper.getSelectedImage();
        if (NullChecker.a(selectedImage)) {
            this.f13981b.add(selectedImage);
        }
    }

    /* JADX INFO: renamed from: i */
    public Intent m16168i(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject, Media media) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(media);
        return MediaPreviewAct.F2(act).f(mediaWrapper.getCurrentMaxCount(mediaPickerParamsObject)).j(arrayList).c().b().g(mediaPickerParamsObject).i(media).a();
    }

    /* JADX INFO: renamed from: j */
    public void m16169j(Act act, ArrayList<Media> arrayList) {
        if (vwb.J(arrayList)) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(MediaPickerBaseAct.h, arrayList);
        act.setResult(-1, intent);
        act.finish();
    }

    /* JADX INFO: renamed from: k */
    public void m16170k(Act act, ArrayList<Media> arrayList) {
        if (m16166g(act, arrayList) || vwb.J(arrayList)) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(MediaPickerBaseAct.h, arrayList);
        act.setResult(-1, intent);
        act.finish();
    }
}
