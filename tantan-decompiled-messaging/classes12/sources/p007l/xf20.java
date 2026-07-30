package p007l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.MediaLocalStatus;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.util.MediaWrapper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Map;
import l.e30;
import l.vwb;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class xf20 {

    /* JADX INFO: renamed from: a */
    public static a<MediaWrapper> f14881a = a.b();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m16082a(Map map, ArrayList arrayList, Media media) {
        if (TextUtils.isEmpty(media.originUrl)) {
            media.originUrl = media.url;
        }
        String strM16083b = m16083b(map, media.url);
        media.url = strM16083b;
        MediaWrapper.a aVar = (MediaWrapper.a) map.get(strM16083b);
        media.mediaType = "image/*";
        if (NullChecker.a(aVar)) {
            if (aVar.b == (arrayList.size() != 1)) {
                media.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
                media.url = m16083b(map, media.url);
                return;
            }
        }
        media.status = MediaLocalStatus.get(MediaLocalStatus.raw);
    }

    /* JADX INFO: renamed from: b */
    public static String m16083b(Map<String, MediaWrapper.a> map, String str) {
        return map.containsKey(str) ? map.get(str).a() : str;
    }

    /* JADX INFO: renamed from: c */
    public static void m16084c(final ArrayList<Media> arrayList, final Map<String, MediaWrapper.a> map) {
        if (vwb.J(arrayList)) {
            return;
        }
        vwb.z(arrayList, new e30() { // from class: l.wf20
            public final void call(Object obj) {
                xf20.m16082a(map, arrayList, (Media) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static void m16085d(MediaWrapper mediaWrapper) {
        f14881a.onNext(mediaWrapper);
    }
}
