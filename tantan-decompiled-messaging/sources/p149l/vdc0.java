package p149l;

import android.content.Intent;
import android.graphics.BitmapFactory;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.common.R$string;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.newui.mediaoperation.cropper.NewAlbumCropperAct;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.util.C13067a;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import com.p046p1.mobile.putong.newui.mediaoperation.preview.MediaPreviewAct;

/* JADX INFO: loaded from: classes11.dex */
public class vdc0 {
    /* JADX INFO: renamed from: a */
    public static Intent m197987a(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject, Media media) {
        return media instanceof Video ? MediaPreviewAct.m79024F2(act).m79084g(mediaPickerParamsObject).m79083f(mediaPickerParamsObject.getMaxVideoSelectCount()).m79086i(media).m79087j(mediaWrapper.allSelectedMedias).m79080c().m79082e().m79078a() : MediaPreviewAct.m79024F2(act).m79087j(mediaWrapper.allSelectedMedias).m79084g(mediaPickerParamsObject).m79083f(mediaPickerParamsObject.getMaxImageSelectCount()).m79086i(media).m79082e().m79085h(mediaWrapper.selectedFolderPath).m79081d().m79078a();
    }

    /* JADX INFO: renamed from: b */
    public static void m197988b(Act act, String str, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        act.startActivityForResult(NewAlbumCropperAct.m78903m2(act, str, 0.8f, xdl0.m208412y0() - t100.m186890d(60.0f), z), Act.CROP_IMAGE);
    }

    /* JADX INFO: renamed from: c */
    public static void m197989c(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject, Picture picture) {
        String strM179377u = rhi.m179377u(C13067a.m79017c(mediaWrapper.croppedMap, picture.url));
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(strM179377u, options);
        float f = mediaWrapper.imageCropProportion;
        if (mediaPickerParamsObject != null) {
            act.startActivityForResult(NewAlbumCropperAct.m78903m2(act, strM179377u, f, mediaWrapper.imageCropWidth, mediaPickerParamsObject.croppingNewStyle), Act.CROP_IMAGE);
        } else {
            act.startActivityForResult(NewAlbumCropperAct.m78902l2(act, strM179377u, f, mediaWrapper.imageCropWidth), Act.CROP_IMAGE);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m197990d(Act act, Video video, String str) {
        float f = video.duration;
        if (f > 180000.0f || f < 3000.0f) {
            lsi0.m151578h(R$string.f17381U);
        } else {
            qib0.f154714c0.mo97493B5(act, video, str);
        }
    }
}
