package p153l;

import android.content.Intent;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import com.p051p1.mobile.putong.newui.mediaoperation.preview.MediaPreviewAct;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class vra implements s0y {

    /* JADX INFO: renamed from: a */
    public float f185440a = 0.0f;

    /* JADX INFO: renamed from: b */
    public ArrayList<Picture> f185441b = new ArrayList<>(1);

    @Override // p153l.s0y
    /* JADX INFO: renamed from: a */
    public boolean mo99892a(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject) {
        this.f185440a = 0.0f;
        if (mediaWrapper.selectedIsVideo()) {
            this.f185440a = ((Video) mediaWrapper.getSelectedVideo()).duration;
            act.startActivityForResult(m202477i(act, mediaWrapper, mediaPickerParamsObject, (Video) mediaWrapper.getSelectedVideo()), 1);
        } else {
            m202476h(mediaWrapper);
            cmc0.m111163c(act, mediaWrapper, mediaPickerParamsObject, mediaWrapper.getSelectedImage());
        }
        return true;
    }

    @Override // p153l.s0y
    /* JADX INFO: renamed from: b */
    public void mo172491b(Intent intent) {
        intent.putExtra("selected_origin_images", this.f185441b);
    }

    @Override // p153l.s0y
    /* JADX INFO: renamed from: f */
    public void mo99893f(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject, Intent intent) {
        if (NullChecker.m82486a(intent) ? intent.getBooleanExtra("extra_images_just_back", false) : false) {
            if (mediaWrapper.isVideoSelected() || this.f185440a > 0.0f) {
                m202479k(act, mediaWrapper.allSelectedMedias);
            } else {
                m202478j(act, mediaWrapper.allSelectedMedias);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m202475g(Act act, ArrayList<Media> arrayList) {
        float f = this.f185440a;
        if (f >= 16000.0f) {
            act.setResult(4097, new Intent());
            act.m68056e2();
            return true;
        }
        if (f >= 3000.0f) {
            return false;
        }
        act.setResult(4098, new Intent());
        act.m68056e2();
        return true;
    }

    /* JADX INFO: renamed from: h */
    public void m202476h(MediaWrapper mediaWrapper) {
        this.f185441b.clear();
        Picture selectedImage = mediaWrapper.getSelectedImage();
        if (NullChecker.m82486a(selectedImage)) {
            this.f185441b.add(selectedImage);
        }
    }

    /* JADX INFO: renamed from: i */
    public Intent m202477i(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject, Media media) {
        ArrayList<Media> arrayList = new ArrayList<>();
        arrayList.add(media);
        return MediaPreviewAct.m80207H2(act).m80266f(mediaWrapper.getCurrentMaxCount(mediaPickerParamsObject)).m80270j(arrayList).m80263c().m80262b().m80267g(mediaPickerParamsObject).m80269i(media).m80261a();
    }

    /* JADX INFO: renamed from: j */
    public void m202478j(Act act, ArrayList<Media> arrayList) {
        if (jyb.m147479J(arrayList)) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(MediaPickerBaseAct.f55451h, arrayList);
        act.setResult(-1, intent);
        act.m68056e2();
    }

    /* JADX INFO: renamed from: k */
    public void m202479k(Act act, ArrayList<Media> arrayList) {
        if (m202475g(act, arrayList) || jyb.m147479J(arrayList)) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(MediaPickerBaseAct.f55451h, arrayList);
        act.setResult(-1, intent);
        act.m68056e2();
    }
}
