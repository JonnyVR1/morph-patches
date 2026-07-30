package p149l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.Detect;
import com.p046p1.mobile.putong.data.DetectRequest;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.UploadSource;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class ya5 extends xh5 {
    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m213787C(List list) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Media media = (Media) it.next();
            if (media != null) {
                media.uploadStartTime = jUptimeMillis;
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ stc0 m213789E(cm10.C16191a c16191a, String str, String str2, UploadSource uploadSource, stc0.C20027a c20027a, String str3, boolean z, String str4, String str5) {
        String strM208759g;
        utc0 utc0VarM107599e = c16191a.m107599e();
        avc0 avc0Var = new avc0(str, h500.CLOUD_API_TAG);
        avc0Var.f71931c = str2;
        if (uploadSource != null) {
            c20027a.m185882a("X-Putong-Cloud-Module", uploadSource.toString());
        }
        if (str != null && "video".equals(str2)) {
            stc0.C20027a c20027aM185896o = c20027a.m185882a("X-Putong-Module", str).m185897p(avc0Var).m185896o(String.class, str3);
            if (z) {
                strM208759g = xh5.m208760h("/verification-video/upload");
            } else {
                strM208759g = xh5.m208759g("/upload/" + str2);
            }
            return c20027aM185896o.m185898q(strM208759g).m185893l(utc0VarM107599e).m185883b();
        }
        if (!TextUtils.isEmpty(str)) {
            avc0Var.f71929a = str;
        } else if ("moment".equals(str4)) {
            avc0Var.f71929a = str4;
        } else {
            avc0Var.f71929a = "unknown";
        }
        stc0.C20027a c20027aM185896o2 = c20027a.m185897p(avc0Var).m185896o(String.class, str3);
        if (TextUtils.isEmpty(str5)) {
            str5 = xh5.m208759g("/upload/" + str2);
        }
        return c20027aM185896o2.m185898q(str5).m185893l(utc0VarM107599e).m185883b();
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ List m213790F(List list, boolean z, List list2, Envelope envelope) {
        Picture picture;
        List<Media> list3 = ((CommonData) envelope.getModuleData(CommonData.class)).media;
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (final int i = 0; i < list.size(); i++) {
            Media media = (Media) list.get(i);
            if (TEnum.equals(media.status, MediaLocalStatus.preprocessed)) {
                Media media2 = z ? list3.get(0) : (Media) vwb.m200346r(list3, new w9j() { // from class: l.ua5
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(("media" + i).equals(((Media) obj).name));
                    }
                });
                if (media2 == null) {
                    throw new ApiExcep.UploadedMediaNotFound(null);
                }
                if ((media instanceof Video) && (picture = (Picture) vwb.m200346r(list3, new w9j() { // from class: l.va5
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(("cover" + i).equals(((Media) obj).name));
                    }
                })) != null && (media2 instanceof Video)) {
                    ((Video) media2).cover = picture;
                }
                if (media2.cover() != null && media.cover() != null) {
                    Picture pictureCover = media2.cover();
                    Picture pictureCover2 = media.cover();
                    if (TextUtils.isEmpty(pictureCover2.tempUrl)) {
                        qib0.f154691G.m102321G0(pictureCover.urlKey, pictureCover2.url);
                    } else {
                        qib0.f154691G.m102321G0(pictureCover.urlKey, pictureCover2.tempUrl);
                    }
                }
                TrackMediaUploadUtil.m80316m(media2, media);
                media2.uploadEndTime = jUptimeMillis;
                list2.set(i, media2);
                media2.name = null;
            }
        }
        return list2;
    }

    /* JADX INFO: renamed from: G */
    public static void m213791G(cm10.C16191a c16191a, String str, String str2, String str3) {
        c16191a.m107597c(oxk.m166553j(HttpHeaders.CONTENT_DISPOSITION, "form-data; name=\"" + str3 + "\"; filename=\"filename.cache\"", "Content-Transfer-Encoding", "binary"), utc0.create(hyx.m133628d(str), new File(str2)));
    }

    /* JADX INFO: renamed from: H */
    public static Bitmap m213792H(Context context, Uri uri, BitmapFactory.Options options) {
        Bitmap bitmapDecodeStream;
        int i;
        do {
            bitmapDecodeStream = null;
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(context.getContentResolver().openInputStream(uri), null, options);
                break;
            } catch (FileNotFoundException e) {
                CrashHelper.m81296c(e);
                i = options.inSampleSize * 2;
                options.inSampleSize = i;
            }
        } while (i < 1024);
        return bitmapDecodeStream;
    }

    /* JADX INFO: renamed from: I */
    public static C22306c<List<Media>> m213793I(List<Media> list, String str) {
        return m213794J(list, str, null);
    }

    /* JADX INFO: renamed from: J */
    public static C22306c<List<Media>> m213794J(List<Media> list, String str, String str2) {
        return m213795K(list, str, str2, null);
    }

    /* JADX INFO: renamed from: K */
    public static C22306c<List<Media>> m213795K(List<Media> list, String str, String str2, UploadSource uploadSource) {
        return m213796L(list, str, str2, null, uploadSource);
    }

    /* JADX INFO: renamed from: L */
    public static C22306c<List<Media>> m213796L(List<Media> list, String str, String str2, Map<String, String> map, UploadSource uploadSource) {
        return m213798N(list, str, str2, false, map, uploadSource);
    }

    /* JADX INFO: renamed from: M */
    public static C22306c<List<Media>> m213797M(List<Media> list, String str, String str2, boolean z) {
        return m213798N(list, str, str2, z, null, null);
    }

    /* JADX INFO: renamed from: N */
    public static C22306c<List<Media>> m213798N(List<Media> list, String str, String str2, boolean z, Map<String, String> map, UploadSource uploadSource) {
        return m213799O(list, str, str2, z, map, null, uploadSource);
    }

    /* JADX INFO: renamed from: O */
    public static C22306c<List<Media>> m213799O(final List<Media> list, final String str, final String str2, final boolean z, Map<String, String> map, final String str3, final UploadSource uploadSource) {
        Picture picture;
        final cm10.C16191a c16191aM107600f = new cm10.C16191a().m107600f(cm10.f81492j);
        if (NullChecker.m81303a(map) && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                c16191aM107600f.m107595a(entry.getKey(), entry.getValue());
            }
        }
        int i = 0;
        int i2 = 0;
        for (Media media : list) {
            if (!TEnum.equals(media.status, "normal")) {
                if (TEnum.equals(media.status, "raw")) {
                    ohg0.m164364a();
                    return null;
                }
                if (TEnum.equals(media.status, MediaLocalStatus.preprocessed)) {
                    i++;
                    boolean z2 = media instanceof Video;
                    if (z2 && (picture = ((Video) media).cover) != null) {
                        m213791G(c16191aM107600f, picture.mediaType, rhi.m179382z(picture.url), "cover" + i2);
                    }
                    if (z2) {
                        Video video = (Video) media;
                        if (video.isFromNewCamera) {
                            c16191aM107600f.m107595a("take_photo", (video.isLocalMusic || (video.hasOriginalSound && !video.hasMusic)) ? "both" : "gif");
                        }
                    }
                    m213791G(c16191aM107600f, media.mediaType, rhi.m179382z(media.url), "media" + i2);
                }
            }
            i2++;
        }
        if (i == 0) {
            return C22306c.just(list);
        }
        final ArrayList arrayList = new ArrayList(list);
        final String str4 = vwb.m200346r(list, new w9j() { // from class: l.pa5
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ya5.m213804z((Media) obj);
            }
        }) != null ? "video" : vwb.m200346r(list, new w9j() { // from class: l.qa5
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ya5.m213802x((Media) obj);
            }
        }) != null ? "audio" : "image";
        final String strM80317n = TrackMediaUploadUtil.m80317n(list);
        stc0.C20027a c20027aAuth = qib0.f154693H.auth();
        if (qib0.f154714c0.mo97495D5()) {
            c20027aAuth = qib0.f154693H.authBeforeSignUp();
        } else if (!qib0.f154714c0.signedIn_()) {
            c20027aAuth = qib0.f154693H.basic();
        }
        final stc0.C20027a c20027a = c20027aAuth;
        return new la20((v9j<stc0>) new v9j() { // from class: l.ra5
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ya5.m213789E(c16191aM107600f, str2, str4, uploadSource, c20027a, strM80317n, z, str, str3);
            }
        }, true).compose(TrackMediaUploadUtil.m80308g0(list)).map(new w9j() { // from class: l.sa5
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ya5.m213790F(list, z, arrayList, (Envelope) obj);
            }
        }).doOnSubscribe(new d30() { // from class: l.ta5
            @Override // p149l.d30
            public final void call() {
                ya5.m213787C(list);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public static Bitmap m213800P(Bitmap bitmap, int i, int i2) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        float width = i / bitmap.getWidth();
        float height = i2 / bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.setScale(width, height, 0.0f, 0.0f);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.setMatrix(matrix);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, new Paint(2));
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: Q */
    public static C22306c<Detect> m213801Q(final DetectRequest detectRequest) {
        final boolean zSignedIn_ = qib0.f154714c0.signedIn_();
        return new la20(new v9j() { // from class: l.wa5
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return (zSignedIn_ ? xh5.network.auth() : xh5.network.authBeforeSignUp()).m185898q(xh5.m208761i("/antispam/content/detect")).m185893l(utc0.create(Network.JSON, detectRequest.toJson())).m185883b();
            }
        }).map(new w9j() { // from class: l.xa5
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((CommonData) ((Envelope) obj).getModuleData(CommonData.class)).detect;
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ Boolean m213802x(Media media) {
        String str = media.mediaType;
        return Boolean.valueOf(str != null && str.contains("audio"));
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ Boolean m213804z(Media media) {
        String str = media.mediaType;
        return Boolean.valueOf(str != null && str.contains("video"));
    }
}
