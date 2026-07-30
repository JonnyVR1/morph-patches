package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.ReminderAction;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaMeta;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.util.C13067a;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public class adh implements vrx {
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ ArrayList m95870g(Act act, ArrayList arrayList, MediaWrapper mediaWrapper) throws Throwable {
        if (!act.isFinishing() && !vwb.m200296J(arrayList) && arrayList.size() == 1 && TEnum.equals(((Media) arrayList.get(0)).status, "raw")) {
            String str = ((Media) arrayList.get(0)).url;
            Media mediaM79016b = C13067a.m79016b(str);
            if (NullChecker.m81303a(mediaM79016b)) {
                if (TextUtils.isEmpty(((Media) arrayList.get(0)).originUrl)) {
                    mediaM79016b.originUrl = str;
                } else {
                    mediaM79016b.originUrl = ((Media) arrayList.get(0)).originUrl;
                }
                mediaWrapper.clearAllSelectedMedia();
                mediaWrapper.addSelectedMedia(mediaM79016b);
            }
        }
        return arrayList;
    }

    @Override // p149l.vrx
    /* JADX INFO: renamed from: a */
    public boolean mo95873a(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject) {
        if (mediaWrapper.allSelectedMedias.isEmpty()) {
            return false;
        }
        if (mediaWrapper.isVideoSelected()) {
            Video video = (Video) mediaWrapper.allSelectedMedias.get(0);
            if (C13067a.m79020f(video.size)) {
                lsi0.m151580j("视频分辨率过高，暂不支持");
                return true;
            }
            vdc0.m197990d(act, video, mediaPickerParamsObject.fromType == 5 ? "immersion" : "");
        } else if (mediaWrapper.isImageSelected()) {
            m95876l(act, mediaWrapper, mediaPickerParamsObject);
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    public void m95874j(ArrayList<Media> arrayList) {
        Media media = arrayList.get(0);
        if (media instanceof Video) {
            Video video = (Video) media;
            video.isFromNewCamera = true;
            video.hasOriginalSound = true;
        }
    }

    /* JADX INFO: renamed from: k */
    public C22306c<ArrayList<Media>> m95875k(final Act act, final ArrayList<Media> arrayList, final MediaWrapper mediaWrapper) {
        return C22306c.fromCallable(new Callable() { // from class: l.ych
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return adh.m95870g(act, arrayList, mediaWrapper);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: l */
    public void m95876l(final Act act, final MediaWrapper mediaWrapper, final MediaPickerParamsObject mediaPickerParamsObject) {
        C13067a.m79021g(mediaWrapper.allSelectedMedias, mediaWrapper.croppedMap);
        m95875k(act, mediaWrapper.allSelectedMedias, mediaWrapper).subscribe(mkd0.m154955G(new e30() { // from class: l.xch
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f192233a.m95877m(act, mediaWrapper, mediaPickerParamsObject, (ArrayList) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m95877m(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject, ArrayList arrayList) {
        if (act.isFinishing()) {
            return;
        }
        act.progressDismiss();
        m95880p(act, arrayList, Boolean.FALSE, mediaWrapper, mediaPickerParamsObject);
    }

    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void m95878n(Media media) {
        boolean z = media instanceof Video;
        MediaMeta mediaMetaNew_ = MediaMeta.new_();
        media.meta = mediaMetaNew_;
        mediaMetaNew_.type = z ? "video" : ReminderAction.photo;
        mediaMetaNew_.source = "upload";
        mediaMetaNew_.hasAudio = z;
    }

    /* JADX INFO: renamed from: p */
    public void m95880p(Act act, ArrayList<Media> arrayList, Boolean bool, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject) {
        if (bool.booleanValue()) {
            m95874j(arrayList);
        }
        vwb.m200354z(arrayList, new e30() { // from class: l.zch
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202535a.m95878n((Media) obj);
            }
        });
        if (mediaPickerParamsObject.fromType == 8) {
            rd70.m178952j(mediaPickerParamsObject.jsBridgeTimestamp, arrayList);
        } else {
            oe40.m163862s0(act, arrayList, NullChecker.m81303a(mediaWrapper.selectedFolder) ? mediaWrapper.selectedFolder.f114885b : "", false, mediaPickerParamsObject.fromType == 5 ? "immersion" : "");
        }
        act.m66873d2();
    }
}
