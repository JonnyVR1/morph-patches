package p149l;

import android.content.Intent;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.newui.camera.VideoEditAct;
import com.p046p1.mobile.putong.feed.newui.mediapicker.NewAlbumVideoEditAct;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.util.C13067a;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;

/* JADX INFO: loaded from: classes12.dex */
public class aih implements vrx {
    @Override // p149l.vrx
    /* JADX INFO: renamed from: a */
    public boolean mo95873a(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject) {
        if (vwb.m200296J(mediaWrapper.allSelectedMedias)) {
            return false;
        }
        if (mediaWrapper.isVideoSelected()) {
            Video video = (Video) mediaWrapper.allSelectedMedias.get(0);
            if (C13067a.m79020f(video.size)) {
                lsi0.m151580j("视频分辨率过高，暂不支持");
                return true;
            }
            float f = video.duration;
            if (f < 3000.0f) {
                lsi0.m151580j("该视频长度不支持上传");
            } else if (f < 16000.0f) {
                act.startActivity(VideoEditAct.m61234Z1(act, video.url, false, "my_states"));
            } else {
                act.startActivity(NewAlbumVideoEditAct.m62403K2(act, video, "my_states"));
            }
        } else if (mediaWrapper.isImageSelected()) {
            vdc0.m197989c(act, mediaWrapper, mediaPickerParamsObject, mediaWrapper.getSelectedImage());
        }
        return true;
    }

    @Override // p149l.vrx
    /* JADX INFO: renamed from: b */
    public void mo96814b(Intent intent) {
    }
}
