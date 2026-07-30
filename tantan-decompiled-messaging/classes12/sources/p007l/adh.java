package p007l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.MediaLocalStatus;
import com.p000p1.mobile.putong.data.MediaMeta;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.util.a;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import l.e30;
import l.lsi0;
import l.mkd0;
import l.rd70;
import l.vdc0;
import l.vrx;
import l.vwb;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class adh implements vrx {
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ ArrayList m8493g(Act act, ArrayList arrayList, MediaWrapper mediaWrapper) {
        if (!act.isFinishing() && !vwb.J(arrayList) && arrayList.size() == 1 && TEnum.equals(((Media) arrayList.get(0)).status, MediaLocalStatus.raw)) {
            String str = ((Media) arrayList.get(0)).url;
            Media mediaB = a.b(str);
            if (NullChecker.a(mediaB)) {
                if (TextUtils.isEmpty(((Media) arrayList.get(0)).originUrl)) {
                    mediaB.originUrl = str;
                } else {
                    mediaB.originUrl = ((Media) arrayList.get(0)).originUrl;
                }
                mediaWrapper.clearAllSelectedMedia();
                mediaWrapper.addSelectedMedia(mediaB);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public boolean m8496a(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject) {
        if (mediaWrapper.allSelectedMedias.isEmpty()) {
            return false;
        }
        if (mediaWrapper.isVideoSelected()) {
            Video video = (Video) mediaWrapper.allSelectedMedias.get(0);
            if (a.f(video.size)) {
                lsi0.j("视频分辨率过高，暂不支持");
                return true;
            }
            vdc0.d(act, video, mediaPickerParamsObject.fromType == 5 ? "immersion" : "");
        } else if (mediaWrapper.isImageSelected()) {
            m8499l(act, mediaWrapper, mediaPickerParamsObject);
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    public void m8497j(ArrayList<Media> arrayList) {
        Media media = arrayList.get(0);
        if (media instanceof Video) {
            Video video = (Video) media;
            video.isFromNewCamera = true;
            video.hasOriginalSound = true;
        }
    }

    /* JADX INFO: renamed from: k */
    public c<ArrayList<Media>> m8498k(final Act act, final ArrayList<Media> arrayList, final MediaWrapper mediaWrapper) {
        return c.fromCallable(new Callable() { // from class: l.ych
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return adh.m8493g(act, arrayList, mediaWrapper);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: l */
    public void m8499l(final Act act, final MediaWrapper mediaWrapper, final MediaPickerParamsObject mediaPickerParamsObject) {
        a.g(mediaWrapper.allSelectedMedias, mediaWrapper.croppedMap);
        m8498k(act, mediaWrapper.allSelectedMedias, mediaWrapper).subscribe(mkd0.G(new e30() { // from class: l.xch
            public final void call(Object obj) {
                this.f14864a.m8500m(act, mediaWrapper, mediaPickerParamsObject, (ArrayList) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m8500m(Act act, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject, ArrayList arrayList) {
        if (act.isFinishing()) {
            return;
        }
        act.progressDismiss();
        m8503p(act, arrayList, Boolean.FALSE, mediaWrapper, mediaPickerParamsObject);
    }

    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void m8501n(Media media) {
        boolean z = media instanceof Video;
        MediaMeta mediaMetaNew_ = MediaMeta.new_();
        media.meta = mediaMetaNew_;
        mediaMetaNew_.type = z ? "video" : "photo";
        mediaMetaNew_.source = "upload";
        mediaMetaNew_.hasAudio = z;
    }

    /* JADX INFO: renamed from: p */
    public void m8503p(Act act, ArrayList<Media> arrayList, Boolean bool, MediaWrapper mediaWrapper, MediaPickerParamsObject mediaPickerParamsObject) {
        if (bool.booleanValue()) {
            m8497j(arrayList);
        }
        vwb.z(arrayList, new e30() { // from class: l.zch
            public final void call(Object obj) {
                this.f15690a.m8501n((Media) obj);
            }
        });
        if (mediaPickerParamsObject.fromType == 8) {
            rd70.j(mediaPickerParamsObject.jsBridgeTimestamp, arrayList);
        } else {
            oe40.m12599s0(act, arrayList, NullChecker.a(mediaWrapper.selectedFolder) ? mediaWrapper.selectedFolder.b : "", false, mediaPickerParamsObject.fromType == 5 ? "immersion" : "");
        }
        act.finish();
    }
}
