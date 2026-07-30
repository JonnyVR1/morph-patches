package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Map;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes12.dex */
public class xf20 {

    /* JADX INFO: renamed from: a */
    public static C22392a<MediaWrapper> f192645a = C22392a.m221512b();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m208590a(Map map, ArrayList arrayList, Media media) {
        if (TextUtils.isEmpty(media.originUrl)) {
            media.originUrl = media.url;
        }
        String strM208591b = m208591b(map, media.url);
        media.url = strM208591b;
        MediaWrapper.C13066a c13066a = (MediaWrapper.C13066a) map.get(strM208591b);
        media.mediaType = "image/*";
        if (NullChecker.m81303a(c13066a)) {
            if (c13066a.f54051b == (arrayList.size() != 1)) {
                media.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
                media.url = m208591b(map, media.url);
                return;
            }
        }
        media.status = MediaLocalStatus.get("raw");
    }

    /* JADX INFO: renamed from: b */
    public static String m208591b(Map<String, MediaWrapper.C13066a> map, String str) {
        return map.containsKey(str) ? map.get(str).m79014a() : str;
    }

    /* JADX INFO: renamed from: c */
    public static void m208592c(final ArrayList<Media> arrayList, final Map<String, MediaWrapper.C13066a> map) {
        if (vwb.m200296J(arrayList)) {
            return;
        }
        vwb.m200354z(arrayList, new e30() { // from class: l.wf20
            @Override // p149l.e30
            public final void call(Object obj) {
                xf20.m208590a(map, arrayList, (Media) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static void m208593d(MediaWrapper mediaWrapper) {
        f192645a.onNext(mediaWrapper);
    }
}
