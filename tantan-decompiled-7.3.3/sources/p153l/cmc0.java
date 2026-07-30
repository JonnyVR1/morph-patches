package p153l;

import android.content.Intent;
import android.graphics.BitmapFactory;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.common.R$string;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.newui.mediaoperation.cropper.NewAlbumCropperAct;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.util.C13230a;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import com.p051p1.mobile.putong.newui.mediaoperation.preview.MediaPreviewAct;

/* JADX INFO: loaded from: classes10.dex */
public class cmc0 {
    /* JADX INFO: renamed from: a */
    public static Intent m111161a(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject, Media media) {
        return media instanceof Video ? MediaPreviewAct.m80207H2(act).m80267g(mediaPickerParamsObject).m80266f(mediaPickerParamsObject.getMaxVideoSelectCount()).m80269i(media).m80270j(mediaWrapper.allSelectedMedias).m80263c().m80265e().m80261a() : MediaPreviewAct.m80207H2(act).m80270j(mediaWrapper.allSelectedMedias).m80267g(mediaPickerParamsObject).m80266f(mediaPickerParamsObject.getMaxImageSelectCount()).m80269i(media).m80265e().m80268h(mediaWrapper.selectedFolderPath).m80264d().m80261a();
    }

    /* JADX INFO: renamed from: b */
    public static void m111162b(Act act, String str, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        act.startActivityForResult(NewAlbumCropperAct.m80086n2(act, str, 0.8f, bnl0.m105592y0() - qa00.m175859d(60.0f), z), Act.CROP_IMAGE);
    }

    /* JADX INFO: renamed from: c */
    public static void m111163c(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject, Picture picture) {
        String strM168033u = oki.m168033u(C13230a.m80200c(mediaWrapper.croppedMap, picture.url));
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(strM168033u, options);
        float f = mediaWrapper.imageCropProportion;
        if (mediaPickerParamsObject != null) {
            act.startActivityForResult(NewAlbumCropperAct.m80086n2(act, strM168033u, f, mediaWrapper.imageCropWidth, mediaPickerParamsObject.croppingNewStyle), Act.CROP_IMAGE);
        } else {
            act.startActivityForResult(NewAlbumCropperAct.m80085m2(act, strM168033u, f, mediaWrapper.imageCropWidth), Act.CROP_IMAGE);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m111164d(Act act, Video video, String str) {
        float f = video.duration;
        if (f > 180000.0f || f < 3000.0f) {
            o1j0.m165634h(R$string.f18100U);
        } else {
            uqb0.f180397c0.mo105282B5(act, video, str);
        }
    }
}
