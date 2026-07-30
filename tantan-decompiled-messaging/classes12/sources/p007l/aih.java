package p007l;

import android.content.Intent;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.newui.camera.VideoEditAct;
import com.p000p1.mobile.putong.feed.newui.mediapicker.NewAlbumVideoEditAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.util.a;
import l.lsi0;
import l.vdc0;
import l.vrx;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class aih implements vrx {
    /* JADX INFO: renamed from: a */
    public boolean m8575a(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject) {
        if (vwb.J(mediaWrapper.allSelectedMedias)) {
            return false;
        }
        if (mediaWrapper.isVideoSelected()) {
            Video video = (Video) mediaWrapper.allSelectedMedias.get(0);
            if (a.f(video.size)) {
                lsi0.j("视频分辨率过高，暂不支持");
                return true;
            }
            float f = video.duration;
            if (f < 3000.0f) {
                lsi0.j("该视频长度不支持上传");
            } else if (f < 16000.0f) {
                act.startActivity(VideoEditAct.m2170Z1(act, video.url, false, "my_states"));
            } else {
                act.startActivity(NewAlbumVideoEditAct.m3402K2(act, video, "my_states"));
            }
        } else if (mediaWrapper.isImageSelected()) {
            vdc0.c(act, mediaWrapper, mediaPickerParamsObject, mediaWrapper.getSelectedImage());
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m8576b(Intent intent) {
    }
}
