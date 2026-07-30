package p149l;

import android.content.Intent;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import com.p046p1.mobile.putong.newui.mediaoperation.preview.MediaPreviewAct;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class jqa implements vrx {

    /* JADX INFO: renamed from: a */
    public float f119256a = 0.0f;

    /* JADX INFO: renamed from: b */
    public ArrayList<Picture> f119257b = new ArrayList<>(1);

    @Override // p149l.vrx
    /* JADX INFO: renamed from: a */
    public boolean mo95873a(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject) {
        this.f119256a = 0.0f;
        if (mediaWrapper.selectedIsVideo()) {
            this.f119256a = ((Video) mediaWrapper.getSelectedVideo()).duration;
            act.startActivityForResult(m142782i(act, mediaWrapper, mediaPickerParamsObject, (Video) mediaWrapper.getSelectedVideo()), 1);
        } else {
            m142781h(mediaWrapper);
            vdc0.m197989c(act, mediaWrapper, mediaPickerParamsObject, mediaWrapper.getSelectedImage());
        }
        return true;
    }

    @Override // p149l.vrx
    /* JADX INFO: renamed from: b */
    public void mo96814b(Intent intent) {
        intent.putExtra("selected_origin_images", this.f119257b);
    }

    @Override // p149l.vrx
    /* JADX INFO: renamed from: f */
    public void mo142779f(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject, Intent intent) {
        if (NullChecker.m81303a(intent) ? intent.getBooleanExtra("extra_images_just_back", false) : false) {
            if (mediaWrapper.isVideoSelected() || this.f119256a > 0.0f) {
                m142784k(act, mediaWrapper.allSelectedMedias);
            } else {
                m142783j(act, mediaWrapper.allSelectedMedias);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m142780g(Act act, ArrayList<Media> arrayList) {
        float f = this.f119256a;
        if (f >= 16000.0f) {
            act.setResult(4097, new Intent());
            act.m66873d2();
            return true;
        }
        if (f >= 3000.0f) {
            return false;
        }
        act.setResult(4098, new Intent());
        act.m66873d2();
        return true;
    }

    /* JADX INFO: renamed from: h */
    public void m142781h(MediaWrapper mediaWrapper) {
        this.f119257b.clear();
        Picture selectedImage = mediaWrapper.getSelectedImage();
        if (NullChecker.m81303a(selectedImage)) {
            this.f119257b.add(selectedImage);
        }
    }

    /* JADX INFO: renamed from: i */
    public Intent m142782i(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject, Media media) {
        ArrayList<Media> arrayList = new ArrayList<>();
        arrayList.add(media);
        return MediaPreviewAct.m79024F2(act).m79083f(mediaWrapper.getCurrentMaxCount(mediaPickerParamsObject)).m79087j(arrayList).m79080c().m79079b().m79084g(mediaPickerParamsObject).m79086i(media).m79078a();
    }

    /* JADX INFO: renamed from: j */
    public void m142783j(Act act, ArrayList<Media> arrayList) {
        if (vwb.m200296J(arrayList)) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(MediaPickerBaseAct.f54603h, arrayList);
        act.setResult(-1, intent);
        act.m66873d2();
    }

    /* JADX INFO: renamed from: k */
    public void m142784k(Act act, ArrayList<Media> arrayList) {
        if (m142780g(act, arrayList) || vwb.m200296J(arrayList)) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(MediaPickerBaseAct.f54603h, arrayList);
        act.setResult(-1, intent);
        act.m66873d2();
    }
}
