package p153l;

import android.content.Intent;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.newui.camera.VideoEditAct;
import com.p051p1.mobile.putong.feed.newui.mediapicker.NewAlbumVideoEditAct;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.util.C13230a;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;

/* JADX INFO: loaded from: classes13.dex */
public class pjh implements s0y {
    @Override // p153l.s0y
    /* JADX INFO: renamed from: a */
    public boolean mo99892a(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject) {
        if (jyb.m147479J(mediaWrapper.allSelectedMedias)) {
            return false;
        }
        if (mediaWrapper.isVideoSelected()) {
            Video video = (Video) mediaWrapper.allSelectedMedias.get(0);
            if (C13230a.m80203f(video.size)) {
                o1j0.m165636j("视频分辨率过高，暂不支持");
                return true;
            }
            float f = video.duration;
            if (f < 3000.0f) {
                o1j0.m165636j("该视频长度不支持上传");
            } else if (f < 16000.0f) {
                act.startActivity(VideoEditAct.m62418a2(act, video.url, false, "my_states"));
            } else {
                act.startActivity(NewAlbumVideoEditAct.m63587L2(act, video, "my_states"));
            }
        } else if (mediaWrapper.isImageSelected()) {
            cmc0.m111163c(act, mediaWrapper, mediaPickerParamsObject, mediaWrapper.getSelectedImage());
        }
        return true;
    }

    @Override // p153l.s0y
    /* JADX INFO: renamed from: b */
    public void mo172491b(Intent intent) {
    }
}
