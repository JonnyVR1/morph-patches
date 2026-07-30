package com.p051p1.mobile.putong.util;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.webkit.URLUtil;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.media.TTFFmpegCommand;
import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.api.mobile.ChinaMobileController;
import com.p051p1.mobile.putong.data.Audio;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Moments;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.util.TrackMediaUploadUtil;
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
import p137rx.C22421c;
import p137rx.Notification;
import p153l.i4g0;
import p153l.jyb;
import p153l.kl40;
import p153l.l51;
import p153l.oki;
import p153l.pcj;
import p153l.q4f;
import p153l.qcj;
import p153l.rnl;
import p153l.sim;
import p153l.uqb0;
import p153l.vel0;
import p153l.y20;

/* JADX INFO: loaded from: classes10.dex */
public class TrackMediaUploadUtil {

    /* JADX INFO: renamed from: a */
    public static ConcurrentHashMap<String, NetworkTrackInfo> f55659a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b */
    public static ArrayList<Pair<String, String>> f55660b = new ArrayList<>();

    public static class GetVideoFrameException extends RuntimeException {
        public GetVideoFrameException(String str, Throwable th) {
            super(str, th);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.p1.mobile.putong.util.TrackMediaUploadUtil$a */
    public class C13311a<T> implements C22421c.d<T, T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f55661a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ qcj f55662b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f55663c;

        public C13311a(List list, qcj qcjVar, String str) {
            this.f55661a = list;
            this.f55662b = qcjVar;
            this.f55663c = str;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ void m81514b(qcj qcjVar, String str, Object obj) {
            if (TrackMediaUploadUtil.m81472U(obj, qcjVar)) {
                TrackMediaUploadUtil.m81495i0(str, TrackMediaUploadUtil.m81456E(obj, qcjVar));
                TrackMediaUploadUtil.m81487e0(str, TrackMediaUploadUtil.m81456E(obj, qcjVar), false, null);
            }
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C22421c<T> call(C22421c<T> c22421c) {
            if (!TrackMediaUploadUtil.m81471T(this.f55661a)) {
                return c22421c;
            }
            final qcj qcjVar = this.f55662b;
            final String str = this.f55663c;
            C22421c<T> c22421cDoOnNext = c22421c.doOnNext(new y20() { // from class: l.lfj0
                @Override // p153l.y20
                public final void call(Object obj) {
                    TrackMediaUploadUtil.C13311a.m81514b(qcjVar, str, obj);
                }
            });
            final String str2 = this.f55663c;
            final List list = this.f55661a;
            return c22421cDoOnNext.doOnError(new y20() { // from class: l.mfj0
                @Override // p153l.y20
                public final void call(Object obj) {
                    TrackMediaUploadUtil.m81487e0(str2, list, true, (Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.p1.mobile.putong.util.TrackMediaUploadUtil$b */
    public class C13312b<T> implements C22421c.d<T, T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f55664a;

        public C13312b(List list) {
            this.f55664a = list;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m81516a(List list, Notification notification) {
            if ((notification.m222545j() || notification.m222546k()) && list != null && list.size() > 0) {
                NetworkTrackInfo networkTrackInfoM81461J = TrackMediaUploadUtil.m81461J(TrackMediaUploadUtil.m81462K(list));
                ((Media) list.get(0)).netReqTimeParams = TrackMediaUploadUtil.m81459H(networkTrackInfoM81461J);
            }
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C22421c<T> call(C22421c<T> c22421c) {
            final List list = this.f55664a;
            return c22421c.doOnEach(new y20() { // from class: l.nfj0
                @Override // p153l.y20
                public final void call(Object obj) {
                    TrackMediaUploadUtil.C13312b.m81516a(list, (Notification) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: A */
    public static String m81452A() {
        return ChinaMobileController.m30592c();
    }

    /* JADX INFO: renamed from: B */
    public static long m81453B(Media media) {
        long j = media.mediaFileLength;
        if (j > 0) {
            return j;
        }
        if (m81473V(media.url)) {
            return 0L;
        }
        return m81507u(oki.m168038z(media.url));
    }

    /* JADX INFO: renamed from: C */
    public static long m81454C(List<Media> list) {
        Media media;
        if (list == null || list.size() <= 0 || (media = list.get(0)) == null) {
            return 0L;
        }
        long j = media.mediaFileLength;
        if (j > 0) {
            return j;
        }
        if (m81473V(media.url)) {
            return 0L;
        }
        return m81507u(oki.m168038z(media.url));
    }

    /* JADX INFO: renamed from: D */
    public static long m81455D(List<Media> list) {
        long jM81453B = 0;
        if (list == null || list.size() <= 0) {
            return 0L;
        }
        for (Media media : list) {
            if (media != null) {
                jM81453B += m81453B(media);
            }
        }
        return jM81453B / ((long) list.size());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public static <T> List<Media> m81456E(T t, qcj<T, List<Media>> qcjVar) {
        if (t != 0) {
            if (t instanceof Video) {
                return jyb.m147507f0((Video) t);
            }
            if (t instanceof Picture) {
                return jyb.m147507f0((Picture) t);
            }
            if (t instanceof Audio) {
                return jyb.m147507f0((Audio) t);
            }
            if (qcjVar != null) {
                List<Media> listCall = qcjVar.call(t);
                if (!jyb.m147479J(listCall)) {
                    return listCall;
                }
            }
        }
        return new ArrayList();
    }

    /* JADX INFO: renamed from: F */
    public static long m81457F(List<Media> list) {
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
    public static long m81458G(List<Media> list) {
        Media media;
        if (list == null || list.size() <= 0 || (media = list.get(0)) == null) {
            return 0L;
        }
        return Math.max(0L, media.uploadEndTime - media.uploadStartTime);
    }

    /* JADX INFO: renamed from: H */
    public static ArrayList<Object> m81459H(NetworkTrackInfo networkTrackInfo) {
        return jyb.m147507f0("dns_time", Long.valueOf(m81503q(networkTrackInfo)), "connection_time", Long.valueOf(m81502p(networkTrackInfo)), "request_time", Long.valueOf(m81504r(networkTrackInfo)), "response_time", Long.valueOf(m81505s(networkTrackInfo)));
    }

    /* JADX INFO: renamed from: I */
    public static Map<String, Object> m81460I(List<Media> list) {
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
    public static NetworkTrackInfo m81461J(String str) {
        return f55659a.remove(str);
    }

    /* JADX INFO: renamed from: K */
    public static String m81462K(List<Media> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        return list.get(0).okPerformanceKey;
    }

    /* JADX INFO: renamed from: L */
    public static Dimension m81463L(List<Media> list) {
        Dimension dimension = new Dimension(0, 0);
        if (list != null && list.size() > 0) {
            Media media = list.get(0);
            if (media instanceof Picture) {
                Picture picture = (Picture) media;
                if (picture.size == null && !m81473V(picture.url)) {
                    picture.size = new Dimension(new sim(oki.m168038z(picture.url)).f168843d);
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
    public static String m81464M(String str) {
        return !TextUtils.isEmpty(str) ? Uri.parse(str).getHost() : "";
    }

    /* JADX INFO: renamed from: N */
    public static String m81465N(String str) {
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
    public static boolean m81466O(List<Media> list) {
        if (list != null && list.size() > 0) {
            Media media = list.get(0);
            if (m81473V(media.url) && media.uploadStartTime > 0 && media.uploadEndTime > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: P */
    public static boolean m81467P() {
        long jLongValue;
        if ("sample".equals(ABManager.m30348i0("media_metrics_collection")) || "sample".equals(ABManager.m30350j0("media_metrics_collection"))) {
            return true;
        }
        if (uqb0.f180397c0.userId() == null) {
            return false;
        }
        try {
            jLongValue = Long.valueOf(uqb0.f180397c0.userId()).longValue();
        } catch (NumberFormatException e) {
            CrashHelper.m82479c(e);
            jLongValue = 0;
        }
        return jLongValue > 0 && jLongValue % 1000 == 1;
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m81468Q(pcj<Boolean> pcjVar) {
        long jLongValue;
        if (!kl40.m150345c() && !kl40.m150346d()) {
            return false;
        }
        if (pcjVar.call().booleanValue()) {
            return true;
        }
        if (uqb0.f180397c0.userId() == null) {
            return false;
        }
        try {
            jLongValue = Long.valueOf(uqb0.f180397c0.userId()).longValue();
        } catch (NumberFormatException e) {
            CrashHelper.m82479c(e);
            jLongValue = 0;
        }
        return jLongValue > 0 && jLongValue % 100 == 2;
    }

    /* JADX INFO: renamed from: R */
    public static boolean m81469R(NetworkTrackInfo networkTrackInfo) {
        if (networkTrackInfo == null || networkTrackInfo.getThrowable() == null || TextUtils.isEmpty(networkTrackInfo.getThrowable().toString())) {
            return false;
        }
        return networkTrackInfo.getThrowable().toString().contains("java.io.IOException: Canceled");
    }

    /* JADX INFO: renamed from: S */
    public static boolean m81470S(NetworkTrackInfo networkTrackInfo) {
        rnl rnlVarM209026k;
        if (networkTrackInfo == null || networkTrackInfo.getRequest() == null || (rnlVarM209026k = networkTrackInfo.getRequest().m209026k()) == null) {
            return false;
        }
        String strM182286m = rnlVarM209026k.m182286m();
        return strM182286m.contains("tantantribe") || strM182286m.contains("tantanapp") || strM182286m.contains("p1staff") || strM182286m.contains("tancdn");
    }

    /* JADX INFO: renamed from: T */
    public static boolean m81471T(List<Media> list) {
        if (list == null || list.size() <= 0) {
            return false;
        }
        return (list.get(0) instanceof Video) || (list.get(0) instanceof Picture) || (list.get(0) instanceof Audio);
    }

    /* JADX INFO: renamed from: U */
    public static <T> boolean m81472U(T t, qcj<T, List<Media>> qcjVar) {
        return m81466O(m81456E(t, qcjVar));
    }

    /* JADX INFO: renamed from: V */
    public static boolean m81473V(String str) {
        return URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str);
    }

    /* JADX INFO: renamed from: W */
    public static boolean m81474W() {
        String property = System.getProperty("http.proxyHost");
        String property2 = System.getProperty("http.proxyPort");
        if (TextUtils.isEmpty(property2)) {
            property2 = User.ID_TEAM_ACCOUNT;
        }
        return (TextUtils.isEmpty(property) || Integer.parseInt(property2) == -1) ? false : true;
    }

    /* JADX INFO: renamed from: X */
    public static void m81475X(final String str, final String str2) {
        l51.m152920z(new Runnable() { // from class: l.kfj0
            @Override // java.lang.Runnable
            public final void run() {
                TrackMediaUploadUtil.m81480b(str, str2);
            }
        }, true);
    }

    /* JADX INFO: renamed from: Y */
    public static void m81476Y(String str, NetworkTrackInfo networkTrackInfo) {
        f55659a.put(str, networkTrackInfo);
    }

    /* JADX INFO: renamed from: Z */
    public static void m81477Z(final String str) {
        l51.m152920z(new Runnable() { // from class: l.jfj0
            @Override // java.lang.Runnable
            public final void run() {
                TrackMediaUploadUtil.m81482c(str);
            }
        }, true);
    }

    /* JADX INFO: renamed from: a0 */
    public static void m81479a0(Media media) {
        if (media != null) {
            media.uploadStartTime = 0L;
            media.uploadEndTime = 0L;
            media.processStartTime = 0L;
            media.processEndTime = 0L;
            media.okPerformanceKey = null;
            media.netReqTimeParams = null;
            media.mediaFileLength = m81507u(media.url);
            media.compressType = 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m81480b(String str, String str2) {
        synchronized (f55660b) {
            f55660b.add(new Pair<>(str, str2));
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static void m81481b0(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        q4f q4fVar = new q4f();
        q4fVar.f155566d = EventNameEnum.SYS_CHECK;
        q4fVar.f155581s = "e_FeedLoadingDuration";
        HashMap map = new HashMap();
        str.getClass();
        switch (str) {
            case "follow":
                map.put("tag", "follow");
                map.put(BLiveOperationTitleShowType.duration, String.valueOf(j));
                q4fVar.f155576n = "p_follow";
                break;
            case "nearby":
                map.put("tag", "nearby");
                map.put(BLiveOperationTitleShowType.duration, String.valueOf(j));
                q4fVar.f155576n = OMSDialogPositon.p_nearby;
                break;
            case "moments":
                map.put("tag", Moments.TYPE);
                map.put(BLiveOperationTitleShowType.duration, String.valueOf(j));
                q4fVar.f155576n = "p_moments_view";
                break;
        }
        i4g0.m138516n(q4fVar, map);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m81482c(String str) {
        Pair<String, String> next;
        synchronized (f55660b) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    Iterator<Pair<String, String>> it = f55660b.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!next.first.equals(str));
                    if (next != null) {
                        f55660b.remove(next);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static void m81483c0(final NetworkTrackInfo networkTrackInfo) {
        if (networkTrackInfo != null && m81470S(networkTrackInfo) && !m81469R(networkTrackInfo) && (m81467P() || m81468Q(new pcj() { // from class: l.ifj0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                NetworkTrackInfo networkTrackInfo2 = networkTrackInfo;
                return Boolean.valueOf((networkTrackInfo2.getThrowable() == null && (networkTrackInfo2.getResponse() == null || networkTrackInfo2.getResponse().m138661I())) ? false : true);
            }
        }))) {
            HashMap map = new HashMap();
            map.put("media_type", "image");
            map.put("download_time", Long.valueOf(networkTrackInfo.getFinishTime() - networkTrackInfo.getCreateTime()));
            map.put("size", Long.valueOf(networkTrackInfo.getResponseBodyByteCount()));
            map.put("identifier", m81465N(networkTrackInfo.getRequestUrl()));
            map.put("url", m81464M(networkTrackInfo.getRequestUrl()));
            map.put("error", m81511y(networkTrackInfo));
            map.put("dns_time", String.valueOf(Math.max(networkTrackInfo.getDnsEndTime() - networkTrackInfo.getDnsStartTime(), 0L)));
            map.put("connection_time", Long.valueOf(m81502p(networkTrackInfo)));
            map.put("request_time", Long.valueOf(m81504r(networkTrackInfo)));
            map.put("response_time", Long.valueOf(m81505s(networkTrackInfo)));
            map.putAll(m81501o(""));
            q4f q4fVar = new q4f();
            q4fVar.f155566d = EventNameEnum.SYS_CHECK;
            q4fVar.f155581s = "e_media_download_state";
            i4g0.m138516n(q4fVar, map);
        }
        if (networkTrackInfo == null || networkTrackInfo.getThrowable() != null) {
            return;
        }
        String requestUrl = networkTrackInfo.getRequestUrl();
        m81485d0(requestUrl, m81508v(requestUrl), Math.max(networkTrackInfo.getFinishTime() - networkTrackInfo.getCreateTime(), 0L));
    }

    /* JADX INFO: renamed from: d0 */
    public static void m81485d0(String str, String str2, long j) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        q4f q4fVar = new q4f();
        q4fVar.f155566d = EventNameEnum.SYS_CHECK;
        HashMap map = new HashMap();
        if (str2.equals("chat")) {
            q4fVar.f155576n = OMSDialogPositon.p_chat_view;
            q4fVar.f155581s = "e_DownloadImageDuration_chat";
        } else if (str2.equals(Moments.TYPE)) {
            q4fVar.f155576n = "p_moments_view";
            q4fVar.f155581s = "e_DownloadImageDuration_feed";
        } else if (str2.equals("follow")) {
            q4fVar.f155576n = "p_follow";
            q4fVar.f155581s = "e_DownloadImageDuration_feed";
        } else if (str2.equals("nearby")) {
            q4fVar.f155576n = OMSDialogPositon.p_nearby;
            q4fVar.f155581s = "e_DownloadImageDuration_feed";
        } else if (str2.equals("profile")) {
            q4fVar.f155576n = OMSDialogPositon.p_suggest_user_profile_info_view;
            q4fVar.f155581s = "e_DownloadImageDuration_profile";
        }
        if (!TextUtils.isEmpty(q4fVar.f155581s)) {
            map.put(BLiveOperationTitleShowType.duration, String.valueOf(j));
            map.put("url", str);
            i4g0.m138516n(q4fVar, map);
        }
        m81477Z(str);
    }

    /* JADX INFO: renamed from: e0 */
    public static void m81487e0(String str, List<Media> list, boolean z, Throwable th) {
        HashMap map = new HashMap();
        map.putAll(m81501o(str));
        map.putAll(m81497k(list, z));
        map.putAll(m81496j(th));
        map.putAll(m81460I(list));
        q4f q4fVar = new q4f();
        q4fVar.f155566d = EventNameEnum.SYS_CHECK;
        q4fVar.f155581s = "e_media_upload_state";
        i4g0.m138516n(q4fVar, map);
    }

    /* JADX INFO: renamed from: f0 */
    public static <T> C22421c.d<T, T> m81489f0(String str, List<Media> list, qcj<T, List<Media>> qcjVar) {
        return new C13311a(list, qcjVar, str);
    }

    /* JADX INFO: renamed from: g0 */
    public static <T> C22421c.d<T, T> m81491g0(List<Media> list) {
        return new C13312b(list);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m81493h0(long j, String str, String str2) {
        uqb0.f180397c0.trackPlayerBlockTime(j, str, str2);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m81495i0(String str, List<Media> list) {
        if (TextUtils.isEmpty(str) || list == null || list.size() == 0 || !str.equals("profile")) {
            return;
        }
        Media media = list.get(0);
        q4f q4fVar = new q4f();
        q4fVar.f155566d = EventNameEnum.SYS_CHECK;
        q4fVar.f155576n = OMSDialogPositon.p_suggest_user_profile_info_view;
        HashMap map = new HashMap();
        map.put(BLiveOperationTitleShowType.duration, String.valueOf(m81458G(list)));
        if (media instanceof Video) {
            q4fVar.f155581s = "e_UploadVideoDuration_profile";
            map.put("video_size", String.valueOf(m81454C(list)));
        } else if (media instanceof Picture) {
            q4fVar.f155581s = "e_UploadImageDuration_profile";
            map.put("image_size", String.valueOf(m81454C(list)));
        }
        i4g0.m138516n(q4fVar, map);
    }

    /* JADX INFO: renamed from: j */
    public static Map<String, Object> m81496j(Throwable th) {
        HashMap map = new HashMap();
        map.put("error", m81506t(th));
        return map;
    }

    /* JADX INFO: renamed from: k */
    public static Map<String, Object> m81497k(List<Media> list, boolean z) {
        HashMap map = new HashMap();
        if (list != null && list.size() > 0) {
            if (list.get(0) instanceof Video) {
                Video video = (Video) list.get(0);
                m81498l(video);
                map.put("media_type", "video");
                map.put("process_time", Long.valueOf(m81457F(list)));
                map.put("upload_time", Long.valueOf(m81458G(list)));
                Dimension dimension = video.size;
                map.put("res_resolution_w", Integer.valueOf(dimension == null ? 0 : dimension.width));
                Dimension dimension2 = video.size;
                map.put("res_resolution_h", Integer.valueOf(dimension2 != null ? dimension2.height : 0));
                map.put(BLiveOperationTitleShowType.duration, String.valueOf(video.duration));
                map.put("size", Long.valueOf(m81453B(video)));
                map.put("identifier", z ? "" : m81510x(list));
                map.put("url", z ? "" : m81509w(list));
                map.put("compress_type", Integer.valueOf(video.compressType));
                return map;
            }
            if (list.get(0) instanceof Picture) {
                Dimension dimensionM81463L = m81463L(list);
                map.put("media_type", "image");
                map.put("process_time", Long.valueOf(m81457F(list)));
                map.put("upload_time", Long.valueOf(m81458G(list)));
                map.put("res_resolution_w", Integer.valueOf(dimensionM81463L.width));
                map.put("res_resolution_h", Integer.valueOf(dimensionM81463L.height));
                map.put("size", Long.valueOf(m81455D(list)));
                map.put("identifier", z ? "" : m81510x(list));
                map.put("url", z ? "" : m81509w(list));
                return map;
            }
            if (list.get(0) instanceof Audio) {
                Audio audio = (Audio) list.get(0);
                map.put("media_type", "audio");
                map.put("identifier", z ? "" : m81510x(list));
                map.put("url", z ? "" : m81509w(list));
                map.put("upload_time", Long.valueOf(m81458G(list)));
                map.put(BLiveOperationTitleShowType.duration, String.valueOf(audio.duration));
                map.put("size", Long.valueOf(m81453B(audio)));
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: l */
    public static void m81498l(Video video) {
        if (video == null || TextUtils.isEmpty(video.url) || m81473V(video.url) || video.size != null) {
            return;
        }
        vel0 vel0Var = new vel0(oki.m168038z(video.url));
        Dimension dimension = new Dimension();
        dimension.height = vel0Var.f183808d;
        dimension.width = vel0Var.f183807c;
        video.size = dimension;
        video.duration = vel0Var.f183806b;
    }

    /* JADX INFO: renamed from: m */
    public static void m81499m(Media media, Media media2) {
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
    public static String m81500n(List<Media> list) {
        String string = UUID.randomUUID().toString();
        if (list != null && list.size() > 0) {
            list.get(0).okPerformanceKey = string;
        }
        return string;
    }

    /* JADX INFO: renamed from: o */
    public static Map<String, Object> m81501o(String str) {
        HashMap map = new HashMap();
        DisplayMetrics displayMetrics = App.f16088e.getResources().getDisplayMetrics();
        if (!TextUtils.isEmpty(str)) {
            map.put("module", str);
        }
        map.put("model", Build.MODEL);
        map.put("dev_resolution_w", displayMetrics == null ? "" : Integer.valueOf(displayMetrics.widthPixels));
        map.put("dev_resolution_h", displayMetrics != null ? Integer.valueOf(displayMetrics.heightPixels) : "");
        map.put("network", ConnectivityReceiver.m82466f());
        map.put("isp", m81452A());
        map.put("is_proxy", Boolean.valueOf(m81474W()));
        return map;
    }

    /* JADX INFO: renamed from: p */
    public static long m81502p(NetworkTrackInfo networkTrackInfo) {
        if (networkTrackInfo != null) {
            return Math.max(networkTrackInfo.getConnectEndTime() - networkTrackInfo.getConnectStartTime(), 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: q */
    public static long m81503q(NetworkTrackInfo networkTrackInfo) {
        if (networkTrackInfo != null) {
            return Math.max(networkTrackInfo.getDnsEndTime() - networkTrackInfo.getDnsStartTime(), 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: r */
    public static long m81504r(NetworkTrackInfo networkTrackInfo) {
        if (networkTrackInfo != null) {
            return Math.max(networkTrackInfo.getRequestBodyEndTime() - networkTrackInfo.getRequestHeadersStartTime(), 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: s */
    public static long m81505s(NetworkTrackInfo networkTrackInfo) {
        if (networkTrackInfo != null) {
            return Math.max(networkTrackInfo.getResponseBodyEndTime() - networkTrackInfo.getResponseHeadersStartTime(), 0L);
        }
        return 0L;
    }

    /* JADX INFO: renamed from: t */
    public static String m81506t(Throwable th) {
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
    public static long m81507u(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        if (str.startsWith("file:///")) {
            str = str.substring(7);
        }
        return new File(str).length();
    }

    /* JADX INFO: renamed from: v */
    public static String m81508v(String str) {
        synchronized (f55660b) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return "";
                }
                for (Pair<String, String> pair : f55660b) {
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
    public static String m81509w(List<Media> list) {
        StringBuilder sb = new StringBuilder();
        if (list != null && list.size() > 0) {
            sb.append(m81464M(list.get(0).url));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: x */
    public static String m81510x(List<Media> list) {
        StringBuilder sb = new StringBuilder();
        if (list != null && list.size() > 0) {
            sb.append(m81465N(list.get(0).url));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: y */
    public static String m81511y(NetworkTrackInfo networkTrackInfo) {
        StringBuffer stringBuffer = new StringBuffer();
        if (networkTrackInfo != null) {
            if (networkTrackInfo.getThrowable() != null) {
                stringBuffer.append(networkTrackInfo.getThrowable());
            } else if (networkTrackInfo.getResponse() != null && !networkTrackInfo.getResponse().m138661I()) {
                stringBuffer.append("code:");
                stringBuffer.append(networkTrackInfo.getResponseCode());
                stringBuffer.append("message:");
                stringBuffer.append(networkTrackInfo.getResponse().m138662J());
            }
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: z */
    public static String m81512z(List<Media> list) {
        if (list == null || list.size() == 0) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Media> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(m81453B(it.next())));
        }
        return arrayList.toString();
    }
}
