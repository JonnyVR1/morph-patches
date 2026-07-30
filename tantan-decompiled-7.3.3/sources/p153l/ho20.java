package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Map;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes13.dex */
public class ho20 {

    /* JADX INFO: renamed from: a */
    public static C22507a<MediaWrapper> f110865a = C22507a.m222758b();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m136382a(Map map, ArrayList arrayList, Media media) {
        if (TextUtils.isEmpty(media.originUrl)) {
            media.originUrl = media.url;
        }
        String strM136383b = m136383b(map, media.url);
        media.url = strM136383b;
        MediaWrapper.C13229a c13229a = (MediaWrapper.C13229a) map.get(strM136383b);
        media.mediaType = "image/*";
        if (NullChecker.m82486a(c13229a)) {
            if (c13229a.f54899b == (arrayList.size() != 1)) {
                media.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
                media.url = m136383b(map, media.url);
                return;
            }
        }
        media.status = MediaLocalStatus.get("raw");
    }

    /* JADX INFO: renamed from: b */
    public static String m136383b(Map<String, MediaWrapper.C13229a> map, String str) {
        return map.containsKey(str) ? map.get(str).m80197a() : str;
    }

    /* JADX INFO: renamed from: c */
    public static void m136384c(final ArrayList<Media> arrayList, final Map<String, MediaWrapper.C13229a> map) {
        if (jyb.m147479J(arrayList)) {
            return;
        }
        jyb.m147537z(arrayList, new y20() { // from class: l.go20
            @Override // p153l.y20
            public final void call(Object obj) {
                ho20.m136382a(map, arrayList, (Media) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static void m136385d(MediaWrapper mediaWrapper) {
        f110865a.onNext(mediaWrapper);
    }
}
