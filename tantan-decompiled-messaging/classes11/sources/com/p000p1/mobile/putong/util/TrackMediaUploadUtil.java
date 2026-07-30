package com.p000p1.mobile.putong.util;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.webkit.URLUtil;
import com.p000p1.mobile.putong.util.TrackMediaUploadUtil;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.media.TTFFmpegCommand;
import com.p1.mobile.putong.api.ABManager;
import com.p1.mobile.putong.api.mobile.ChinaMobileController;
import com.p1.mobile.putong.data.Audio;
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Video;
import com.tantanapp.common.network.NetworkTrackInfo;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import l.cll;
import l.e30;
import l.e51;
import l.l3f;
import l.pgm;
import l.qib0;
import l.r5l0;
import l.rhi;
import l.v9j;
import l.vwb;
import l.w9j;
import l.wc40;
import l.zvf0;
import rx.Notification;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class TrackMediaUploadUtil {

    /* JADX INFO: renamed from: a */
    public static ConcurrentHashMap<String, NetworkTrackInfo> f8417a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b */
    public static ArrayList<Pair<String, String>> f8418b = new ArrayList<>();

    public static class GetVideoFrameException extends RuntimeException {
        public GetVideoFrameException(String str, Throwable th) {
            super(str, th);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.p1.mobile.putong.util.TrackMediaUploadUtil$a */
    public class C0550a<T> implements c.d<T, T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f8419a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ w9j f8420b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f8421c;

        public C0550a(List list, w9j w9jVar, String str) {
            this.f8419a = list;
            this.f8420b = w9jVar;
            this.f8421c = str;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m10682b(w9j w9jVar, String str, Object obj) {
            if (TrackMediaUploadUtil.m10640U(obj, w9jVar)) {
                TrackMediaUploadUtil.m10663i0(str, TrackMediaUploadUtil.m10624E(obj, w9jVar));
                TrackMediaUploadUtil.m10655e0(str, TrackMediaUploadUtil.m10624E(obj, w9jVar), false, null);
            }
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public c<T> call(c<T> cVar) {
            if (!TrackMediaUploadUtil.m10639T(this.f8419a)) {
                return cVar;
            }
            final w9j w9jVar = this.f8420b;
            final String str = this.f8421c;
            c cVarDoOnNext = cVar.doOnNext(new e30() { // from class: l.h6j0
                public final void call(Object obj) {
                    TrackMediaUploadUtil.C0550a.m10682b(w9jVar, str, obj);
                }
            });
            final String str2 = this.f8421c;
            final List list = this.f8419a;
            return cVarDoOnNext.doOnError(new e30() { // from class: l.i6j0
                public final void call(Object obj) {
                    TrackMediaUploadUtil.m10655e0(str2, list, true, (Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.p1.mobile.putong.util.TrackMediaUploadUtil$b */
    public class C0551b<T> implements c.d<T, T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f8422a;

        public C0551b(List list) {
            this.f8422a = list;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m10684a(List list, Notification notification) {
            if ((notification.j() || notification.k()) && list != null && list.size() > 0) {
                NetworkTrackInfo networkTrackInfoM10629J = TrackMediaUploadUtil.m10629J(TrackMediaUploadUtil.m10630K(list));
                ((Media) list.get(0)).netReqTimeParams = TrackMediaUploadUtil.m10627H(networkTrackInfoM10629J);
            }
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c<T> call(c<T> cVar) {
            final List list = this.f8422a;
            return cVar.doOnEach(new e30() { // from class: l.j6j0
                public final void call(Object obj) {
                    TrackMediaUploadUtil.C0551b.m10684a(list, (Notification) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: A */
    public static String m10620A() {
        return ChinaMobileController.c();
    }

    /* JADX INFO: renamed from: B */
    public static long m10621B(Media media) {
        long j = media.mediaFileLength;
        if (j > 0) {
            return j;
        }
        if (m10641V(media.url)) {
            return 0L;
        }
        return m10675u(rhi.z(media.url));
    }

    /* JADX INFO: renamed from: C */
    public static long m10622C(List<Media> list) {
        Media media;
        if (list == null || list.size() <= 0 || (media = list.get(0)) == null) {
            return 0L;
        }
        long j = media.mediaFileLength;
        if (j > 0) {
            return j;
        }
        if (m10641V(media.url)) {
            return 0L;
        }
        return m10675u(rhi.z(media.url));
    }

    /* JADX INFO: renamed from: D */
    public static long m10623D(List<Media> list) {
        long jM10621B = 0;
        if (list == null || list.size() <= 0) {
            return 0L;
        }
        for (Media media : list) {
            if (media != null) {
                jM10621B += m10621B(media);
            }
        }
        return jM10621B / ((long) list.size());
    }

    /* JADX INFO: renamed from: E */
    public static <T> List<Media> m10624E(T t, w9j<T, List<Media>> w9jVar) {
        if (t != null) {
            if (t instanceof Video) {
                return vwb.f0(new Media[]{(Video) t});
            }
            if (t instanceof Picture) {
                return vwb.f0(new Media[]{(Picture) t});
            }
            if (t instanceof Audio) {
                return vwb.f0(new Media[]{(Audio) t});
            }
            if (w9jVar != null) {
                List<Media> list = (List) w9jVar.call(t);
                if (!vwb.J(list)) {
                    return list;
                }
            }
        }
        return new ArrayList();
    }

    /* JADX INFO: renamed from: F */
    public static long m10625F(List<Media> list) {
        if (list == null || list.size() <= 0) {
            return 0L;
        }
        long jMax = 0;
        for (Media media : list) {
            if (media != null) {
                jMax += Math.max(0L, media.processEndTime - media.processStartTime);
            }
        }
        return jMax;
    }

    /* JADX INFO: renamed from: G */
    public static long m10626G(List<Media> list) {
        Media media;
        if (list == null || list.size() <= 0 || (media = list.get(0)) == null) {
            return 0L;
        }
        return Math.max(0L, media.uploadEndTime - media.uploadStartTime);
    }

    /* JADX INFO: renamed from: H */
    public static ArrayList<Object> m10627H(NetworkTrackInfo networkTrackInfo) {
        return vwb.f0(new Object[]{"dns_time", Long.valueOf(m10671q(networkTrackInfo)), "connection_time", Long.valueOf(m10670p(networkTrackInfo)), "request_time", Long.valueOf(m10672r(networkTrackInfo)), "response_time", Long.valueOf(m10673s(networkTrackInfo))});
    }

    /* JADX INFO: renamed from: I */
    public static Map<String, Object> m10628I(List<Media> list) {
        HashMap map = new HashMap();
        if (list == null || list.size() <= 0) {
            map.put("dns_time", 0);
            map.put("connection_time", 0);
            map.put("request_time", 0);
            map.put("response_time", 0);
            return map;
        }
        ArrayList arrayList = list.get(0).netReqTimeParams;
        if (arrayList != null) {
            String str = "";
            for (int i = 0; i < arrayList.size(); i++) {
                int i2 = i % 2;
                if (i2 == 0) {
                    str = (String) arrayList.get(i);
                } else if (i2 == 1 && !TextUtils.isEmpty(str)) {
                    map.put(str, arrayList.get(i));
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: J */
    public static NetworkTrackInfo m10629J(String str) {
        return f8417a.remove(str);
    }

    /* JADX INFO: renamed from: K */
    public static String m10630K(List<Media> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        return list.get(0).okPerformanceKey;
    }

    /* JADX INFO: renamed from: L */
    public static Dimension m10631L(List<Media> list) {
        Dimension dimension = new Dimension(0, 0);
        if (list != null && list.size() > 0) {
            Picture picture = (Media) list.get(0);
            if (picture instanceof Picture) {
                Picture picture2 = picture;
                if (picture2.size == null && !m10641V(((Media) picture2).url)) {
                    picture2.size = new Dimension(new pgm(rhi.z(((Media) picture2).url)).d);
                }
                Dimension dimension2 = picture2.size;
                if (dimension2 != null) {
                    return dimension2;
                }
            }
        }
        return dimension;
    }

    /* JADX INFO: renamed from: M */
    public static String m10632M(String str) {
        return !TextUtils.isEmpty(str) ? Uri.parse(str).getHost() : "";
    }

    /* JADX INFO: renamed from: N */
    public static String m10633N(String str) {
        String[] strArrSplit;
        if (TextUtils.isEmpty(str) || str.endsWith("/") || (strArrSplit = str.split("/")) == null || strArrSplit.length <= 0) {
            return "";
        }
        String str2 = strArrSplit[strArrSplit.length - 1];
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        int iLastIndexOf = str2.lastIndexOf(".");
        return iLastIndexOf >= 0 ? str2.substring(0, iLastIndexOf) : str2;
    }

    /* JADX INFO: renamed from: O */
    public static boolean m10634O(List<Media> list) {
        if (list != null && list.size() > 0) {
            Media media = list.get(0);
            if (m10641V(media.url) && media.uploadStartTime > 0 && media.uploadEndTime > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: P */
    public static boolean m10635P() {
        long jLongValue;
        if ("sample".equals(ABManager.i0("media_metrics_collection")) || "sample".equals(ABManager.j0("media_metrics_collection"))) {
            return true;
        }
        if (qib0.c0.userId() == null) {
            return false;
        }
        try {
            jLongValue = Long.valueOf(qib0.c0.userId()).longValue();
        } catch (NumberFormatException e) {
            CrashHelper.c(e);
            jLongValue = 0;
        }
        return jLongValue > 0 && jLongValue % 1000 == 1;
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m10636Q(v9j<Boolean> v9jVar) {
        long jLongValue;
        if (!wc40.c() && !wc40.d()) {
            return false;
        }
        if (((Boolean) v9jVar.call()).booleanValue()) {
            return true;
        }
        if (qib0.c0.userId() == null) {
            return false;
        }
        try {
            jLongValue = Long.valueOf(qib0.c0.userId()).longValue();
        } catch (NumberFormatException e) {
            CrashHelper.c(e);
            jLongValue = 0;
        }
        return jLongValue > 0 && jLongValue % 100 == 2;
    }

    /* JADX INFO: renamed from: R */
    public static boolean m10637R(NetworkTrackInfo networkTrackInfo) {
        if (networkTrackInfo == null || networkTrackInfo.getThrowable() == null || TextUtils.isEmpty(networkTrackInfo.getThrowable().toString())) {
            return false;
        }
        return networkTrackInfo.getThrowable().toString().contains("java.io.IOException: Canceled");
    }

    /* JADX INFO: renamed from: S */
    public static boolean m10638S(NetworkTrackInfo networkTrackInfo) {
        cll cllVarK;
        if (networkTrackInfo == null || networkTrackInfo.getRequest() == null || (cllVarK = networkTrackInfo.getRequest().k()) == null) {
            return false;
        }
        String strM = cllVarK.m();
        return strM.contains("tantantribe") || strM.contains("tantanapp") || strM.contains("p1staff") || strM.contains("tancdn");
    }

    /* JADX INFO: renamed from: T */
    public static boolean m10639T(List<Media> list) {
        if (list == null || list.size() <= 0) {
            return false;
        }
        return (list.get(0) instanceof Video) || (list.get(0) instanceof Picture) || (list.get(0) instanceof Audio);
    }

    /* JADX INFO: renamed from: U */
    public static <T> boolean m10640U(T t, w9j<T, List<Media>> w9jVar) {
        return m10634O(m10624E(t, w9jVar));
    }

    /* JADX INFO: renamed from: V */
    public static boolean m10641V(String str) {
        return URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str);
    }

    /* JADX INFO: renamed from: W */
    public static boolean m10642W() {
        String property = System.getProperty("http.proxyHost");
        String property2 = System.getProperty("http.proxyPort");
        if (TextUtils.isEmpty(property2)) {
            property2 = "-1";
        }
        return (TextUtils.isEmpty(property) || Integer.parseInt(property2) == -1) ? false : true;
    }

    /* JADX INFO: renamed from: X */
    public static void m10643X(final String str, final String str2) {
        e51.z(new Runnable() { // from class: l.g6j0
            @Override // java.lang.Runnable
            public final void run() {
                TrackMediaUploadUtil.m10648b(str, str2);
            }
        }, true);
    }

    /* JADX INFO: renamed from: Y */
    public static void m10644Y(String str, NetworkTrackInfo networkTrackInfo) {
        f8417a.put(str, networkTrackInfo);
    }

    /* JADX INFO: renamed from: Z */
    public static void m10645Z(final String str) {
        e51.z(new Runnable() { // from class: l.f6j0
            @Override // java.lang.Runnable
            public final void run() {
                TrackMediaUploadUtil.m10650c(str);
            }
        }, true);
    }

    /* JADX INFO: renamed from: a0 */
    public static void m10647a0(Media media) {
        if (media != null) {
            media.uploadStartTime = 0L;
            media.uploadEndTime = 0L;
            media.processStartTime = 0L;
            media.processEndTime = 0L;
            media.okPerformanceKey = null;
            media.netReqTimeParams = null;
            media.mediaFileLength = m10675u(media.url);
            media.compressType = 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m10648b(String str, String str2) {
        synchronized (f8418b) {
            f8418b.add(new Pair<>(str, str2));
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static void m10649b0(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        l3f l3fVar = new l3f();
        l3fVar.d = EventNameEnum.SYS_CHECK;
        l3fVar.s = "e_FeedLoadingDuration";
        HashMap map = new HashMap();
        str.getClass();
        switch (str) {
            case "follow":
                map.put("tag", "follow");
                map.put("duration", String.valueOf(j));
                l3fVar.n = "p_follow";
                break;
            case "nearby":
                map.put("tag", "nearby");
                map.put("duration", String.valueOf(j));
                l3fVar.n = "p_nearby";
                break;
            case "moments":
                map.put("tag", "moments");
                map.put("duration", String.valueOf(j));
                l3fVar.n = "p_moments_view";
                break;
        }
        zvf0.n(l3fVar, map);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m10650c(String str) {
        Pair<String, String> next;
        synchronized (f8418b) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    Iterator<Pair<String, String>> it = f8418b.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!next.first.equals(str));
                    if (next != null) {
                        f8418b.remove(next);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static void m10651c0(final NetworkTrackInfo networkTrackInfo) {
        if (networkTrackInfo != null && m10638S(networkTrackInfo) && !m10637R(networkTrackInfo) && (m10635P() || m10636Q(new v9j() { // from class: l.e6j0
            public final Object call() {
                NetworkTrackInfo networkTrackInfo2 = networkTrackInfo;
                return Boolean.valueOf((networkTrackInfo2.getThrowable() == null && (networkTrackInfo2.getResponse() == null || networkTrackInfo2.getResponse().I())) ? false : true);
            }
        }))) {
            HashMap map = new HashMap();
            map.put("media_type", "image");
            map.put("download_time", Long.valueOf(networkTrackInfo.getFinishTime() - networkTrackInfo.getCreateTime()));
            map.put("size", Long.valueOf(networkTrackInfo.getResponseBodyByteCount()));
            map.put("identifier", m10633N(networkTrackInfo.getRequestUrl()));
            map.put("url", m10632M(networkTrackInfo.getRequestUrl()));
            map.put("error", m10679y(networkTrackInfo));
            map.put("dns_time", String.valueOf(Math.max(networkTrackInfo.getDnsEndTime() - networkTrackInfo.getDnsStartTime(), 0L)));
            map.put("connection_time", Long.valueOf(m10670p(networkTrackInfo)));
            map.put("request_time", Long.valueOf(m10672r(networkTrackInfo)));
            map.put("response_time", Long.valueOf(m10673s(networkTrackInfo)));
            map.putAll(m10669o(""));
            l3f l3fVar = new l3f();
            l3fVar.d = EventNameEnum.SYS_CHECK;
            l3fVar.s = "e_media_download_state";
            zvf0.n(l3fVar, map);
        }
        if (networkTrackInfo == null || networkTrackInfo.getThrowable() != null) {
            return;
        }
        String requestUrl = networkTrackInfo.getRequestUrl();
        m10653d0(requestUrl, m10676v(requestUrl), Math.max(networkTrackInfo.getFinishTime() - networkTrackInfo.getCreateTime(), 0L));
    }

    /* JADX INFO: renamed from: d0 */
    public static void m10653d0(String str, String str2, long j) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        l3f l3fVar = new l3f();
        l3fVar.d = EventNameEnum.SYS_CHECK;
        HashMap map = new HashMap();
        if (str2.equals("chat")) {
            l3fVar.n = "p_chat_view";
            l3fVar.s = "e_DownloadImageDuration_chat";
        } else if (str2.equals("moments")) {
            l3fVar.n = "p_moments_view";
            l3fVar.s = "e_DownloadImageDuration_feed";
        } else if (str2.equals("follow")) {
            l3fVar.n = "p_follow";
            l3fVar.s = "e_DownloadImageDuration_feed";
        } else if (str2.equals("nearby")) {
            l3fVar.n = "p_nearby";
            l3fVar.s = "e_DownloadImageDuration_feed";
        } else if (str2.equals("profile")) {
            l3fVar.n = "p_suggest_user_profile_info_view";
            l3fVar.s = "e_DownloadImageDuration_profile";
        }
        if (!TextUtils.isEmpty(l3fVar.s)) {
            map.put("duration", String.valueOf(j));
            map.put("url", str);
            zvf0.n(l3fVar, map);
        }
        m10645Z(str);
    }

    /* JADX INFO: renamed from: e0 */
    public static void m10655e0(String str, List<Media> list, boolean z, Throwable th) {
        HashMap map = new HashMap();
        map.putAll(m10669o(str));
        map.putAll(m10665k(list, z));
        map.putAll(m10664j(th));
        map.putAll(m10628I(list));
        l3f l3fVar = new l3f();
        l3fVar.d = EventNameEnum.SYS_CHECK;
        l3fVar.s = "e_media_upload_state";
        zvf0.n(l3fVar, map);
    }

    /* JADX INFO: renamed from: f0 */
    public static <T> c.d<T, T> m10657f0(String str, List<Media> list, w9j<T, List<Media>> w9jVar) {
        return new C0550a(list, w9jVar, str);
    }

    /* JADX INFO: renamed from: g0 */
    public static <T> c.d<T, T> m10659g0(List<Media> list) {
        return new C0551b(list);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m10661h0(long j, String str, String str2) {
        qib0.c0.trackPlayerBlockTime(j, str, str2);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m10663i0(String str, List<Media> list) {
        if (TextUtils.isEmpty(str) || list == null || list.size() == 0 || !str.equals("profile")) {
            return;
        }
        Media media = list.get(0);
        l3f l3fVar = new l3f();
        l3fVar.d = EventNameEnum.SYS_CHECK;
        l3fVar.n = "p_suggest_user_profile_info_view";
        HashMap map = new HashMap();
        map.put("duration", String.valueOf(m10626G(list)));
        if (media instanceof Video) {
            l3fVar.s = "e_UploadVideoDuration_profile";
            map.put("video_size", String.valueOf(m10622C(list)));
        } else if (media instanceof Picture) {
            l3fVar.s = "e_UploadImageDuration_profile";
            map.put("image_size", String.valueOf(m10622C(list)));
        }
        zvf0.n(l3fVar, map);
    }

    /* JADX INFO: renamed from: j */
    public static Map<String, Object> m10664j(Throwable th) {
        HashMap map = new HashMap();
        map.put("error", m10674t(th));
        return map;
    }

    /* JADX INFO: renamed from: k */
    public static Map<String, Object> m10665k(List<Media> list, boolean z) {
        HashMap map = new HashMap();
        if (list != null && list.size() > 0) {
            if (list.get(0) instanceof Video) {
                Video video = list.get(0);
                m10666l(video);
                map.put("media_type", "video");
                map.put("process_time", Long.valueOf(m10625F(list)));
                map.put("upload_time", Long.valueOf(m10626G(list)));
                Dimension dimension = video.size;
                map.put("res_resolution_w", Integer.valueOf(dimension == null ? 0 : dimension.width));
                Dimension dimension2 = video.size;
                map.put("res_resolution_h", Integer.valueOf(dimension2 != null ? dimension2.height : 0));
                map.put("duration", String.valueOf(video.duration));
                map.put("size", Long.valueOf(m10621B(video)));
                map.put("identifier", z ? "" : m10678x(list));
                map.put("url", z ? "" : m10677w(list));
                map.put("compress_type", Integer.valueOf(((Media) video).compressType));
                return map;
            }
            if (list.get(0) instanceof Picture) {
                Dimension dimensionM10631L = m10631L(list);
                map.put("media_type", "image");
                map.put("process_time", Long.valueOf(m10625F(list)));
                map.put("upload_time", Long.valueOf(m10626G(list)));
                map.put("res_resolution_w", Integer.valueOf(dimensionM10631L.width));
                map.put("res_resolution_h", Integer.valueOf(dimensionM10631L.height));
                map.put("size", Long.valueOf(m10623D(list)));
                map.put("identifier", z ? "" : m10678x(list));
                map.put("url", z ? "" : m10677w(list));
                return map;
            }
            if (list.get(0) instanceof Audio) {
                Audio audio = list.get(0);
                map.put("media_type", "audio");
                map.put("identifier", z ? "" : m10678x(list));
                map.put("url", z ? "" : m10677w(list));
                map.put("upload_time", Long.valueOf(m10626G(list)));
                map.put("duration", String.valueOf(audio.duration));
                map.put("size", Long.valueOf(m10621B(audio)));
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: l */
    public static void m10666l(Video video) {
        if (video == null || TextUtils.isEmpty(((Media) video).url) || m10641V(((Media) video).url) || video.size != null) {
            return;
        }
        r5l0 r5l0Var = new r5l0(rhi.z(((Media) video).url));
        Dimension dimension = new Dimension();
        dimension.height = r5l0Var.d;
        dimension.width = r5l0Var.c;
        video.size = dimension;
        video.duration = r5l0Var.b;
    }

    /* JADX INFO: renamed from: m */
    public static void m10667m(Media media, Media media2) {
        if (media == null || media2 == null) {
            return;
        }
        media.uploadStartTime = media2.uploadStartTime;
        media.uploadEndTime = media2.uploadEndTime;
        media.mediaFileLength = media2.mediaFileLength;
        media.processStartTime = media2.processStartTime;
        media.processEndTime = media2.processEndTime;
        media.netReqTimeParams = media2.netReqTimeParams;
        media.okPerformanceKey = media2.okPerformanceKey;
        media.compressType = media2.compressType;
    }

    /* JADX INFO: renamed from: n */
    public static String m10668n(List<Media> list) {
        String string = UUID.randomUUID().toString();
        if (list != null && list.size() > 0) {
            list.get(0).okPerformanceKey = string;
        }
        return string;
    }

    /* JADX INFO: renamed from: o */
    public static Map<String, Object> m10669o(String str) {
        HashMap map = new HashMap();
        DisplayMetrics displayMetrics = App.e.getResources().getDisplayMetrics();
        if (!TextUtils.isEmpty(str)) {
            map.put("module", str);
        }
        map.put("model", Build.MODEL);
        map.put("dev_resolution_w", displayMetrics == null ? "" : Integer.valueOf(displayMetrics.widthPixels));
        map.put("dev_resolution_h", displayMetrics != null ? Integer.valueOf(displayMetrics.heightPixels) : "");
        map.put("network", ConnectivityReceiver.f());
        map.put("isp", m10620A());
        map.put("is_proxy", Boolean.valueOf(m10642W()));
        return map;
    }

    /* JADX INFO: renamed from: p */
    public static long m10670p(NetworkTrackInfo networkTrackInfo) {
        if (networkTrackInfo != null) {
            return Math.max(networkTrackInfo.getConnectEndTime() - networkTrackInfo.getConnectStartTime(), 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: q */
    public static long m10671q(NetworkTrackInfo networkTrackInfo) {
        if (networkTrackInfo != null) {
            return Math.max(networkTrackInfo.getDnsEndTime() - networkTrackInfo.getDnsStartTime(), 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: r */
    public static long m10672r(NetworkTrackInfo networkTrackInfo) {
        if (networkTrackInfo != null) {
            return Math.max(networkTrackInfo.getRequestBodyEndTime() - networkTrackInfo.getRequestHeadersStartTime(), 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: s */
    public static long m10673s(NetworkTrackInfo networkTrackInfo) {
        if (networkTrackInfo != null) {
            return Math.max(networkTrackInfo.getResponseBodyEndTime() - networkTrackInfo.getResponseHeadersStartTime(), 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: t */
    public static String m10674t(Throwable th) {
        if (th == null) {
            return "";
        }
        if (th instanceof GetVideoFrameException) {
            return "ExtractCoverError:" + th.toString();
        }
        if (th instanceof TTFFmpegCommand.FFmpegCommandException) {
            return "CompressError:" + th.toString();
        }
        return "ServerError:" + th.toString();
    }

    /* JADX INFO: renamed from: u */
    public static long m10675u(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        if (str.startsWith("file:///")) {
            str = str.substring(7);
        }
        return new File(str).length();
    }

    /* JADX INFO: renamed from: v */
    public static String m10676v(String str) {
        synchronized (f8418b) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return "";
                }
                for (Pair<String, String> pair : f8418b) {
                    if (((String) pair.first).equals(str)) {
                        return (String) pair.second;
                    }
                }
                return "";
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public static String m10677w(List<Media> list) {
        StringBuilder sb = new StringBuilder();
        if (list != null && list.size() > 0) {
            sb.append(m10632M(list.get(0).url));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: x */
    public static String m10678x(List<Media> list) {
        StringBuilder sb = new StringBuilder();
        if (list != null && list.size() > 0) {
            sb.append(m10633N(list.get(0).url));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: y */
    public static String m10679y(NetworkTrackInfo networkTrackInfo) {
        StringBuffer stringBuffer = new StringBuffer();
        if (networkTrackInfo != null) {
            if (networkTrackInfo.getThrowable() != null) {
                stringBuffer.append(networkTrackInfo.getThrowable());
            } else if (networkTrackInfo.getResponse() != null && !networkTrackInfo.getResponse().I()) {
                stringBuffer.append("code:");
                stringBuffer.append(networkTrackInfo.getResponseCode());
                stringBuffer.append("message:");
                stringBuffer.append(networkTrackInfo.getResponse().J());
            }
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: z */
    public static String m10680z(List<Media> list) {
        if (list == null || list.size() == 0) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Media> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(m10621B(it.next())));
        }
        return arrayList.toString();
    }
}
