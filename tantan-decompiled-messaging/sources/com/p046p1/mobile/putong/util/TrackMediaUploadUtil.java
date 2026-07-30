package com.p046p1.mobile.putong.util;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.webkit.URLUtil;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.media.TTFFmpegCommand;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.api.mobile.ChinaMobileController;
import com.p046p1.mobile.putong.data.Audio;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Moments;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.util.TrackMediaUploadUtil;
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
import p133rx.C22306c;
import p133rx.Notification;
import p149l.cll;
import p149l.e30;
import p149l.e51;
import p149l.l3f;
import p149l.pgm;
import p149l.qib0;
import p149l.r5l0;
import p149l.rhi;
import p149l.v9j;
import p149l.vwb;
import p149l.w9j;
import p149l.wc40;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class TrackMediaUploadUtil {

    /* JADX INFO: renamed from: a */
    public static ConcurrentHashMap<String, NetworkTrackInfo> f54811a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b */
    public static ArrayList<Pair<String, String>> f54812b = new ArrayList<>();

    public static class GetVideoFrameException extends RuntimeException {
        public GetVideoFrameException(String str, Throwable th) {
            super(str, th);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.p1.mobile.putong.util.TrackMediaUploadUtil$a */
    public class C13148a<T> implements C22306c.d<T, T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f54813a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ w9j f54814b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f54815c;

        public C13148a(List list, w9j w9jVar, String str) {
            this.f54813a = list;
            this.f54814b = w9jVar;
            this.f54815c = str;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m80331b(w9j w9jVar, String str, Object obj) {
            if (TrackMediaUploadUtil.m80289U(obj, w9jVar)) {
                TrackMediaUploadUtil.m80312i0(str, TrackMediaUploadUtil.m80273E(obj, w9jVar));
                TrackMediaUploadUtil.m80304e0(str, TrackMediaUploadUtil.m80273E(obj, w9jVar), false, null);
            }
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C22306c<T> call(C22306c<T> c22306c) {
            if (!TrackMediaUploadUtil.m80288T(this.f54813a)) {
                return c22306c;
            }
            final w9j w9jVar = this.f54814b;
            final String str = this.f54815c;
            C22306c<T> c22306cDoOnNext = c22306c.doOnNext(new e30() { // from class: l.h6j0
                @Override // p149l.e30
                public final void call(Object obj) {
                    TrackMediaUploadUtil.C13148a.m80331b(w9jVar, str, obj);
                }
            });
            final String str2 = this.f54815c;
            final List list = this.f54813a;
            return c22306cDoOnNext.doOnError(new e30() { // from class: l.i6j0
                @Override // p149l.e30
                public final void call(Object obj) {
                    TrackMediaUploadUtil.m80304e0(str2, list, true, (Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.p1.mobile.putong.util.TrackMediaUploadUtil$b */
    public class C13149b<T> implements C22306c.d<T, T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f54816a;

        public C13149b(List list) {
            this.f54816a = list;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m80333a(List list, Notification notification) {
            if ((notification.m221299j() || notification.m221300k()) && list != null && list.size() > 0) {
                NetworkTrackInfo networkTrackInfoM80278J = TrackMediaUploadUtil.m80278J(TrackMediaUploadUtil.m80279K(list));
                ((Media) list.get(0)).netReqTimeParams = TrackMediaUploadUtil.m80276H(networkTrackInfoM80278J);
            }
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C22306c<T> call(C22306c<T> c22306c) {
            final List list = this.f54816a;
            return c22306c.doOnEach(new e30() { // from class: l.j6j0
                @Override // p149l.e30
                public final void call(Object obj) {
                    TrackMediaUploadUtil.C13149b.m80333a(list, (Notification) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: A */
    public static String m80269A() {
        return ChinaMobileController.m29594c();
    }

    /* JADX INFO: renamed from: B */
    public static long m80270B(Media media) {
        long j = media.mediaFileLength;
        if (j > 0) {
            return j;
        }
        if (m80290V(media.url)) {
            return 0L;
        }
        return m80324u(rhi.m179382z(media.url));
    }

    /* JADX INFO: renamed from: C */
    public static long m80271C(List<Media> list) {
        Media media;
        if (list == null || list.size() <= 0 || (media = list.get(0)) == null) {
            return 0L;
        }
        long j = media.mediaFileLength;
        if (j > 0) {
            return j;
        }
        if (m80290V(media.url)) {
            return 0L;
        }
        return m80324u(rhi.m179382z(media.url));
    }

    /* JADX INFO: renamed from: D */
    public static long m80272D(List<Media> list) {
        long jM80270B = 0;
        if (list == null || list.size() <= 0) {
            return 0L;
        }
        for (Media media : list) {
            if (media != null) {
                jM80270B += m80270B(media);
            }
        }
        return jM80270B / ((long) list.size());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public static <T> List<Media> m80273E(T t, w9j<T, List<Media>> w9jVar) {
        if (t != 0) {
            if (t instanceof Video) {
                return vwb.m200324f0((Video) t);
            }
            if (t instanceof Picture) {
                return vwb.m200324f0((Picture) t);
            }
            if (t instanceof Audio) {
                return vwb.m200324f0((Audio) t);
            }
            if (w9jVar != null) {
                List<Media> listCall = w9jVar.call(t);
                if (!vwb.m200296J(listCall)) {
                    return listCall;
                }
            }
        }
        return new ArrayList();
    }

    /* JADX INFO: renamed from: F */
    public static long m80274F(List<Media> list) {
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
    public static long m80275G(List<Media> list) {
        Media media;
        if (list == null || list.size() <= 0 || (media = list.get(0)) == null) {
            return 0L;
        }
        return Math.max(0L, media.uploadEndTime - media.uploadStartTime);
    }

    /* JADX INFO: renamed from: H */
    public static ArrayList<Object> m80276H(NetworkTrackInfo networkTrackInfo) {
        return vwb.m200324f0("dns_time", Long.valueOf(m80320q(networkTrackInfo)), "connection_time", Long.valueOf(m80319p(networkTrackInfo)), "request_time", Long.valueOf(m80321r(networkTrackInfo)), "response_time", Long.valueOf(m80322s(networkTrackInfo)));
    }

    /* JADX INFO: renamed from: I */
    public static Map<String, Object> m80277I(List<Media> list) {
        HashMap map = new HashMap();
        if (list == null || list.size() <= 0) {
            map.put("dns_time", 0);
            map.put("connection_time", 0);
            map.put("request_time", 0);
            map.put("response_time", 0);
            return map;
        }
        ArrayList<Object> arrayList = list.get(0).netReqTimeParams;
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
    public static NetworkTrackInfo m80278J(String str) {
        return f54811a.remove(str);
    }

    /* JADX INFO: renamed from: K */
    public static String m80279K(List<Media> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        return list.get(0).okPerformanceKey;
    }

    /* JADX INFO: renamed from: L */
    public static Dimension m80280L(List<Media> list) {
        Dimension dimension = new Dimension(0, 0);
        if (list != null && list.size() > 0) {
            Media media = list.get(0);
            if (media instanceof Picture) {
                Picture picture = (Picture) media;
                if (picture.size == null && !m80290V(picture.url)) {
                    picture.size = new Dimension(new pgm(rhi.m179382z(picture.url)).f148730d);
                }
                Dimension dimension2 = picture.size;
                if (dimension2 != null) {
                    return dimension2;
                }
            }
        }
        return dimension;
    }

    /* JADX INFO: renamed from: M */
    public static String m80281M(String str) {
        return !TextUtils.isEmpty(str) ? Uri.parse(str).getHost() : "";
    }

    /* JADX INFO: renamed from: N */
    public static String m80282N(String str) {
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
    public static boolean m80283O(List<Media> list) {
        if (list != null && list.size() > 0) {
            Media media = list.get(0);
            if (m80290V(media.url) && media.uploadStartTime > 0 && media.uploadEndTime > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: P */
    public static boolean m80284P() {
        long jLongValue;
        if ("sample".equals(ABManager.m29350i0("media_metrics_collection")) || "sample".equals(ABManager.m29352j0("media_metrics_collection"))) {
            return true;
        }
        if (qib0.f154714c0.userId() == null) {
            return false;
        }
        try {
            jLongValue = Long.valueOf(qib0.f154714c0.userId()).longValue();
        } catch (NumberFormatException e) {
            CrashHelper.m81296c(e);
            jLongValue = 0;
        }
        return jLongValue > 0 && jLongValue % 1000 == 1;
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m80285Q(v9j<Boolean> v9jVar) {
        long jLongValue;
        if (!wc40.m202626c() && !wc40.m202627d()) {
            return false;
        }
        if (v9jVar.call().booleanValue()) {
            return true;
        }
        if (qib0.f154714c0.userId() == null) {
            return false;
        }
        try {
            jLongValue = Long.valueOf(qib0.f154714c0.userId()).longValue();
        } catch (NumberFormatException e) {
            CrashHelper.m81296c(e);
            jLongValue = 0;
        }
        return jLongValue > 0 && jLongValue % 100 == 2;
    }

    /* JADX INFO: renamed from: R */
    public static boolean m80286R(NetworkTrackInfo networkTrackInfo) {
        if (networkTrackInfo == null || networkTrackInfo.getThrowable() == null || TextUtils.isEmpty(networkTrackInfo.getThrowable().toString())) {
            return false;
        }
        return networkTrackInfo.getThrowable().toString().contains("java.io.IOException: Canceled");
    }

    /* JADX INFO: renamed from: S */
    public static boolean m80287S(NetworkTrackInfo networkTrackInfo) {
        cll cllVarM185881k;
        if (networkTrackInfo == null || networkTrackInfo.getRequest() == null || (cllVarM185881k = networkTrackInfo.getRequest().m185881k()) == null) {
            return false;
        }
        String strM107522m = cllVarM185881k.m107522m();
        return strM107522m.contains("tantantribe") || strM107522m.contains("tantanapp") || strM107522m.contains("p1staff") || strM107522m.contains("tancdn");
    }

    /* JADX INFO: renamed from: T */
    public static boolean m80288T(List<Media> list) {
        if (list == null || list.size() <= 0) {
            return false;
        }
        return (list.get(0) instanceof Video) || (list.get(0) instanceof Picture) || (list.get(0) instanceof Audio);
    }

    /* JADX INFO: renamed from: U */
    public static <T> boolean m80289U(T t, w9j<T, List<Media>> w9jVar) {
        return m80283O(m80273E(t, w9jVar));
    }

    /* JADX INFO: renamed from: V */
    public static boolean m80290V(String str) {
        return URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str);
    }

    /* JADX INFO: renamed from: W */
    public static boolean m80291W() {
        String property = System.getProperty("http.proxyHost");
        String property2 = System.getProperty("http.proxyPort");
        if (TextUtils.isEmpty(property2)) {
            property2 = User.ID_TEAM_ACCOUNT;
        }
        return (TextUtils.isEmpty(property) || Integer.parseInt(property2) == -1) ? false : true;
    }

    /* JADX INFO: renamed from: X */
    public static void m80292X(final String str, final String str2) {
        e51.m114775z(new Runnable() { // from class: l.g6j0
            @Override // java.lang.Runnable
            public final void run() {
                TrackMediaUploadUtil.m80297b(str, str2);
            }
        }, true);
    }

    /* JADX INFO: renamed from: Y */
    public static void m80293Y(String str, NetworkTrackInfo networkTrackInfo) {
        f54811a.put(str, networkTrackInfo);
    }

    /* JADX INFO: renamed from: Z */
    public static void m80294Z(final String str) {
        e51.m114775z(new Runnable() { // from class: l.f6j0
            @Override // java.lang.Runnable
            public final void run() {
                TrackMediaUploadUtil.m80299c(str);
            }
        }, true);
    }

    /* JADX INFO: renamed from: a0 */
    public static void m80296a0(Media media) {
        if (media != null) {
            media.uploadStartTime = 0L;
            media.uploadEndTime = 0L;
            media.processStartTime = 0L;
            media.processEndTime = 0L;
            media.okPerformanceKey = null;
            media.netReqTimeParams = null;
            media.mediaFileLength = m80324u(media.url);
            media.compressType = 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m80297b(String str, String str2) {
        synchronized (f54812b) {
            f54812b.add(new Pair<>(str, str2));
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static void m80298b0(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        l3f l3fVar = new l3f();
        l3fVar.f125885d = EventNameEnum.SYS_CHECK;
        l3fVar.f125900s = "e_FeedLoadingDuration";
        HashMap map = new HashMap();
        str.getClass();
        switch (str) {
            case "follow":
                map.put("tag", "follow");
                map.put(BLiveOperationTitleShowType.duration, String.valueOf(j));
                l3fVar.f125895n = "p_follow";
                break;
            case "nearby":
                map.put("tag", "nearby");
                map.put(BLiveOperationTitleShowType.duration, String.valueOf(j));
                l3fVar.f125895n = OMSDialogPositon.p_nearby;
                break;
            case "moments":
                map.put("tag", Moments.TYPE);
                map.put(BLiveOperationTitleShowType.duration, String.valueOf(j));
                l3fVar.f125895n = "p_moments_view";
                break;
        }
        zvf0.m220392n(l3fVar, map);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m80299c(String str) {
        Pair<String, String> next;
        synchronized (f54812b) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    Iterator<Pair<String, String>> it = f54812b.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!next.first.equals(str));
                    if (next != null) {
                        f54812b.remove(next);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static void m80300c0(final NetworkTrackInfo networkTrackInfo) {
        if (networkTrackInfo != null && m80287S(networkTrackInfo) && !m80286R(networkTrackInfo) && (m80284P() || m80285Q(new v9j() { // from class: l.e6j0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                NetworkTrackInfo networkTrackInfo2 = networkTrackInfo;
                return Boolean.valueOf((networkTrackInfo2.getThrowable() == null && (networkTrackInfo2.getResponse() == null || networkTrackInfo2.getResponse().m118597I())) ? false : true);
            }
        }))) {
            HashMap map = new HashMap();
            map.put("media_type", "image");
            map.put("download_time", Long.valueOf(networkTrackInfo.getFinishTime() - networkTrackInfo.getCreateTime()));
            map.put("size", Long.valueOf(networkTrackInfo.getResponseBodyByteCount()));
            map.put("identifier", m80282N(networkTrackInfo.getRequestUrl()));
            map.put("url", m80281M(networkTrackInfo.getRequestUrl()));
            map.put("error", m80328y(networkTrackInfo));
            map.put("dns_time", String.valueOf(Math.max(networkTrackInfo.getDnsEndTime() - networkTrackInfo.getDnsStartTime(), 0L)));
            map.put("connection_time", Long.valueOf(m80319p(networkTrackInfo)));
            map.put("request_time", Long.valueOf(m80321r(networkTrackInfo)));
            map.put("response_time", Long.valueOf(m80322s(networkTrackInfo)));
            map.putAll(m80318o(""));
            l3f l3fVar = new l3f();
            l3fVar.f125885d = EventNameEnum.SYS_CHECK;
            l3fVar.f125900s = "e_media_download_state";
            zvf0.m220392n(l3fVar, map);
        }
        if (networkTrackInfo == null || networkTrackInfo.getThrowable() != null) {
            return;
        }
        String requestUrl = networkTrackInfo.getRequestUrl();
        m80302d0(requestUrl, m80325v(requestUrl), Math.max(networkTrackInfo.getFinishTime() - networkTrackInfo.getCreateTime(), 0L));
    }

    /* JADX INFO: renamed from: d0 */
    public static void m80302d0(String str, String str2, long j) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        l3f l3fVar = new l3f();
        l3fVar.f125885d = EventNameEnum.SYS_CHECK;
        HashMap map = new HashMap();
        if (str2.equals("chat")) {
            l3fVar.f125895n = OMSDialogPositon.p_chat_view;
            l3fVar.f125900s = "e_DownloadImageDuration_chat";
        } else if (str2.equals(Moments.TYPE)) {
            l3fVar.f125895n = "p_moments_view";
            l3fVar.f125900s = "e_DownloadImageDuration_feed";
        } else if (str2.equals("follow")) {
            l3fVar.f125895n = "p_follow";
            l3fVar.f125900s = "e_DownloadImageDuration_feed";
        } else if (str2.equals("nearby")) {
            l3fVar.f125895n = OMSDialogPositon.p_nearby;
            l3fVar.f125900s = "e_DownloadImageDuration_feed";
        } else if (str2.equals("profile")) {
            l3fVar.f125895n = OMSDialogPositon.p_suggest_user_profile_info_view;
            l3fVar.f125900s = "e_DownloadImageDuration_profile";
        }
        if (!TextUtils.isEmpty(l3fVar.f125900s)) {
            map.put(BLiveOperationTitleShowType.duration, String.valueOf(j));
            map.put("url", str);
            zvf0.m220392n(l3fVar, map);
        }
        m80294Z(str);
    }

    /* JADX INFO: renamed from: e0 */
    public static void m80304e0(String str, List<Media> list, boolean z, Throwable th) {
        HashMap map = new HashMap();
        map.putAll(m80318o(str));
        map.putAll(m80314k(list, z));
        map.putAll(m80313j(th));
        map.putAll(m80277I(list));
        l3f l3fVar = new l3f();
        l3fVar.f125885d = EventNameEnum.SYS_CHECK;
        l3fVar.f125900s = "e_media_upload_state";
        zvf0.m220392n(l3fVar, map);
    }

    /* JADX INFO: renamed from: f0 */
    public static <T> C22306c.d<T, T> m80306f0(String str, List<Media> list, w9j<T, List<Media>> w9jVar) {
        return new C13148a(list, w9jVar, str);
    }

    /* JADX INFO: renamed from: g0 */
    public static <T> C22306c.d<T, T> m80308g0(List<Media> list) {
        return new C13149b(list);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m80310h0(long j, String str, String str2) {
        qib0.f154714c0.trackPlayerBlockTime(j, str, str2);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m80312i0(String str, List<Media> list) {
        if (TextUtils.isEmpty(str) || list == null || list.size() == 0 || !str.equals("profile")) {
            return;
        }
        Media media = list.get(0);
        l3f l3fVar = new l3f();
        l3fVar.f125885d = EventNameEnum.SYS_CHECK;
        l3fVar.f125895n = OMSDialogPositon.p_suggest_user_profile_info_view;
        HashMap map = new HashMap();
        map.put(BLiveOperationTitleShowType.duration, String.valueOf(m80275G(list)));
        if (media instanceof Video) {
            l3fVar.f125900s = "e_UploadVideoDuration_profile";
            map.put("video_size", String.valueOf(m80271C(list)));
        } else if (media instanceof Picture) {
            l3fVar.f125900s = "e_UploadImageDuration_profile";
            map.put("image_size", String.valueOf(m80271C(list)));
        }
        zvf0.m220392n(l3fVar, map);
    }

    /* JADX INFO: renamed from: j */
    public static Map<String, Object> m80313j(Throwable th) {
        HashMap map = new HashMap();
        map.put("error", m80323t(th));
        return map;
    }

    /* JADX INFO: renamed from: k */
    public static Map<String, Object> m80314k(List<Media> list, boolean z) {
        HashMap map = new HashMap();
        if (list != null && list.size() > 0) {
            if (list.get(0) instanceof Video) {
                Video video = (Video) list.get(0);
                m80315l(video);
                map.put("media_type", "video");
                map.put("process_time", Long.valueOf(m80274F(list)));
                map.put("upload_time", Long.valueOf(m80275G(list)));
                Dimension dimension = video.size;
                map.put("res_resolution_w", Integer.valueOf(dimension == null ? 0 : dimension.width));
                Dimension dimension2 = video.size;
                map.put("res_resolution_h", Integer.valueOf(dimension2 != null ? dimension2.height : 0));
                map.put(BLiveOperationTitleShowType.duration, String.valueOf(video.duration));
                map.put("size", Long.valueOf(m80270B(video)));
                map.put("identifier", z ? "" : m80327x(list));
                map.put("url", z ? "" : m80326w(list));
                map.put("compress_type", Integer.valueOf(video.compressType));
                return map;
            }
            if (list.get(0) instanceof Picture) {
                Dimension dimensionM80280L = m80280L(list);
                map.put("media_type", "image");
                map.put("process_time", Long.valueOf(m80274F(list)));
                map.put("upload_time", Long.valueOf(m80275G(list)));
                map.put("res_resolution_w", Integer.valueOf(dimensionM80280L.width));
                map.put("res_resolution_h", Integer.valueOf(dimensionM80280L.height));
                map.put("size", Long.valueOf(m80272D(list)));
                map.put("identifier", z ? "" : m80327x(list));
                map.put("url", z ? "" : m80326w(list));
                return map;
            }
            if (list.get(0) instanceof Audio) {
                Audio audio = (Audio) list.get(0);
                map.put("media_type", "audio");
                map.put("identifier", z ? "" : m80327x(list));
                map.put("url", z ? "" : m80326w(list));
                map.put("upload_time", Long.valueOf(m80275G(list)));
                map.put(BLiveOperationTitleShowType.duration, String.valueOf(audio.duration));
                map.put("size", Long.valueOf(m80270B(audio)));
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: l */
    public static void m80315l(Video video) {
        if (video == null || TextUtils.isEmpty(video.url) || m80290V(video.url) || video.size != null) {
            return;
        }
        r5l0 r5l0Var = new r5l0(rhi.m179382z(video.url));
        Dimension dimension = new Dimension();
        dimension.height = r5l0Var.f157833d;
        dimension.width = r5l0Var.f157832c;
        video.size = dimension;
        video.duration = r5l0Var.f157831b;
    }

    /* JADX INFO: renamed from: m */
    public static void m80316m(Media media, Media media2) {
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
    public static String m80317n(List<Media> list) {
        String string = UUID.randomUUID().toString();
        if (list != null && list.size() > 0) {
            list.get(0).okPerformanceKey = string;
        }
        return string;
    }

    /* JADX INFO: renamed from: o */
    public static Map<String, Object> m80318o(String str) {
        HashMap map = new HashMap();
        DisplayMetrics displayMetrics = App.f15369e.getResources().getDisplayMetrics();
        if (!TextUtils.isEmpty(str)) {
            map.put("module", str);
        }
        map.put("model", Build.MODEL);
        map.put("dev_resolution_w", displayMetrics == null ? "" : Integer.valueOf(displayMetrics.widthPixels));
        map.put("dev_resolution_h", displayMetrics != null ? Integer.valueOf(displayMetrics.heightPixels) : "");
        map.put("network", ConnectivityReceiver.m81283f());
        map.put("isp", m80269A());
        map.put("is_proxy", Boolean.valueOf(m80291W()));
        return map;
    }

    /* JADX INFO: renamed from: p */
    public static long m80319p(NetworkTrackInfo networkTrackInfo) {
        if (networkTrackInfo != null) {
            return Math.max(networkTrackInfo.getConnectEndTime() - networkTrackInfo.getConnectStartTime(), 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: q */
    public static long m80320q(NetworkTrackInfo networkTrackInfo) {
        if (networkTrackInfo != null) {
            return Math.max(networkTrackInfo.getDnsEndTime() - networkTrackInfo.getDnsStartTime(), 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: r */
    public static long m80321r(NetworkTrackInfo networkTrackInfo) {
        if (networkTrackInfo != null) {
            return Math.max(networkTrackInfo.getRequestBodyEndTime() - networkTrackInfo.getRequestHeadersStartTime(), 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: s */
    public static long m80322s(NetworkTrackInfo networkTrackInfo) {
        if (networkTrackInfo != null) {
            return Math.max(networkTrackInfo.getResponseBodyEndTime() - networkTrackInfo.getResponseHeadersStartTime(), 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: t */
    public static String m80323t(Throwable th) {
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
    public static long m80324u(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        if (str.startsWith("file:///")) {
            str = str.substring(7);
        }
        return new File(str).length();
    }

    /* JADX INFO: renamed from: v */
    public static String m80325v(String str) {
        synchronized (f54812b) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return "";
                }
                for (Pair<String, String> pair : f54812b) {
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
    public static String m80326w(List<Media> list) {
        StringBuilder sb = new StringBuilder();
        if (list != null && list.size() > 0) {
            sb.append(m80281M(list.get(0).url));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: x */
    public static String m80327x(List<Media> list) {
        StringBuilder sb = new StringBuilder();
        if (list != null && list.size() > 0) {
            sb.append(m80282N(list.get(0).url));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: y */
    public static String m80328y(NetworkTrackInfo networkTrackInfo) {
        StringBuffer stringBuffer = new StringBuffer();
        if (networkTrackInfo != null) {
            if (networkTrackInfo.getThrowable() != null) {
                stringBuffer.append(networkTrackInfo.getThrowable());
            } else if (networkTrackInfo.getResponse() != null && !networkTrackInfo.getResponse().m118597I()) {
                stringBuffer.append("code:");
                stringBuffer.append(networkTrackInfo.getResponseCode());
                stringBuffer.append("message:");
                stringBuffer.append(networkTrackInfo.getResponse().m118598J());
            }
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: z */
    public static String m80329z(List<Media> list) {
        if (list == null || list.size() == 0) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Media> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(m80270B(it.next())));
        }
        return arrayList.toString();
    }
}
