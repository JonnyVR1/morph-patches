package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.ReminderAction;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaMeta;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.util.C13230a;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public class peh implements s0y {
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ ArrayList m171996g(Act act, ArrayList arrayList, MediaWrapper mediaWrapper) throws Throwable {
        if (!act.isFinishing() && !jyb.m147479J(arrayList) && arrayList.size() == 1 && TEnum.equals(((Media) arrayList.get(0)).status, "raw")) {
            String str = ((Media) arrayList.get(0)).url;
            Media mediaM80199b = C13230a.m80199b(str);
            if (NullChecker.m82486a(mediaM80199b)) {
                if (TextUtils.isEmpty(((Media) arrayList.get(0)).originUrl)) {
                    mediaM80199b.originUrl = str;
                } else {
                    mediaM80199b.originUrl = ((Media) arrayList.get(0)).originUrl;
                }
                mediaWrapper.clearAllSelectedMedia();
                mediaWrapper.addSelectedMedia(mediaM80199b);
            }
        }
        return arrayList;
    }

    @Override // p153l.s0y
    /* JADX INFO: renamed from: a */
    public boolean mo99892a(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject) {
        if (mediaWrapper.allSelectedMedias.isEmpty()) {
            return false;
        }
        if (mediaWrapper.isVideoSelected()) {
            Video video = (Video) mediaWrapper.allSelectedMedias.get(0);
            if (C13230a.m80203f(video.size)) {
                o1j0.m165636j("视频分辨率过高，暂不支持");
                return true;
            }
            cmc0.m111164d(act, video, mediaPickerParamsObject.fromType == 5 ? "immersion" : "");
        } else if (mediaWrapper.isImageSelected()) {
            m172001l(act, mediaWrapper, mediaPickerParamsObject);
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    public void m171999j(ArrayList<Media> arrayList) {
        Media media = arrayList.get(0);
        if (media instanceof Video) {
            Video video = (Video) media;
            video.isFromNewCamera = true;
            video.hasOriginalSound = true;
        }
    }

    /* JADX INFO: renamed from: k */
    public C22421c<ArrayList<Media>> m172000k(final Act act, final ArrayList<Media> arrayList, final MediaWrapper mediaWrapper) {
        return C22421c.fromCallable(new Callable() { // from class: l.neh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return peh.m171996g(act, arrayList, mediaWrapper);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: l */
    public void m172001l(final Act act, final MediaWrapper mediaWrapper, final MediaPickerParamsObject mediaPickerParamsObject) {
        C13230a.m80204g(mediaWrapper.allSelectedMedias, mediaWrapper.croppedMap);
        m172000k(act, mediaWrapper.allSelectedMedias, mediaWrapper).subscribe(psd0.m173596G(new y20() { // from class: l.meh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f136498a.m172002m(act, mediaWrapper, mediaPickerParamsObject, (ArrayList) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m172002m(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject, ArrayList arrayList) {
        if (act.isFinishing()) {
            return;
        }
        act.progressDismiss();
        m172005p(act, arrayList, Boolean.FALSE, mediaWrapper, mediaPickerParamsObject);
    }

    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void m172003n(Media media) {
        boolean z = media instanceof Video;
        MediaMeta mediaMetaNew_ = MediaMeta.new_();
        media.meta = mediaMetaNew_;
        mediaMetaNew_.type = z ? "video" : ReminderAction.photo;
        mediaMetaNew_.source = "upload";
        mediaMetaNew_.hasAudio = z;
    }

    /* JADX INFO: renamed from: p */
    public void m172005p(Act act, ArrayList<Media> arrayList, Boolean bool, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject) {
        if (bool.booleanValue()) {
            m171999j(arrayList);
        }
        jyb.m147537z(arrayList, new y20() { // from class: l.oeh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f146991a.m172003n((Media) obj);
            }
        });
        if (mediaPickerParamsObject.fromType == 8) {
            xl70.m211537j(mediaPickerParamsObject.jsBridgeTimestamp, arrayList);
        } else {
            cn40.m111412s0(act, arrayList, NullChecker.m82486a(mediaWrapper.selectedFolder) ? mediaWrapper.selectedFolder.f96162b : "", false, mediaPickerParamsObject.fromType == 5 ? "immersion" : "");
        }
        act.m68056e2();
    }
}
