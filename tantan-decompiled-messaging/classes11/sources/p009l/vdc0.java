package p009l;

import android.content.Intent;
import android.graphics.BitmapFactory;
import com.p000p1.mobile.putong.newui.mediaoperation.cropper.NewAlbumCropperAct;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.util.C0469a;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import com.p000p1.mobile.putong.newui.mediaoperation.preview.MediaPreviewAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.common.R;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Video;
import l.lsi0;
import l.qib0;
import l.rhi;
import l.t100;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class vdc0 {
    /* JADX INFO: renamed from: a */
    public static Intent m23356a(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject, Media media) {
        return media instanceof Video ? MediaPreviewAct.m9332F2(act).m9392g(mediaPickerParamsObject).m9391f(mediaPickerParamsObject.getMaxVideoSelectCount()).m9394i(media).m9395j(mediaWrapper.allSelectedMedias).m9388c().m9390e().m9386a() : MediaPreviewAct.m9332F2(act).m9395j(mediaWrapper.allSelectedMedias).m9392g(mediaPickerParamsObject).m9391f(mediaPickerParamsObject.getMaxImageSelectCount()).m9394i(media).m9390e().m9393h(mediaWrapper.selectedFolderPath).m9389d().m9386a();
    }

    /* JADX INFO: renamed from: b */
    public static void m23357b(Act act, String str, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        act.startActivityForResult(NewAlbumCropperAct.m9198m2(act, str, 0.8f, xdl0.y0() - t100.d(60.0f), z), 24576);
    }

    /* JADX INFO: renamed from: c */
    public static void m23358c(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject, Picture picture) {
        String strU = rhi.u(C0469a.m9325c(mediaWrapper.croppedMap, ((Media) picture).url));
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(strU, options);
        float f = mediaWrapper.imageCropProportion;
        if (mediaPickerParamsObject != null) {
            act.startActivityForResult(NewAlbumCropperAct.m9198m2(act, strU, f, mediaWrapper.imageCropWidth, mediaPickerParamsObject.croppingNewStyle), 24576);
        } else {
            act.startActivityForResult(NewAlbumCropperAct.m9197l2(act, strU, f, mediaWrapper.imageCropWidth), 24576);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m23359d(Act act, Video video, String str) {
        float f = video.duration;
        if (f > 180000.0f || f < 3000.0f) {
            lsi0.h(R.string.U);
        } else {
            qib0.c0.B5(act, video, str);
        }
    }
}
