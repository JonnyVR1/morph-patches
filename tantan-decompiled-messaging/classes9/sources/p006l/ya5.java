package p006l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.p000p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.Detect;
import com.p1.mobile.putong.data.DetectRequest;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.UploadSource;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.cm10;
import l.d30;
import l.exc0;
import l.hyx;
import l.mkd0;
import l.ohg0;
import l.oxk;
import l.rhi;
import l.stc0;
import l.utc0;
import l.v9j;
import l.vwb;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ya5 extends xh5 {
    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m28121C(List list) {
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
    public static /* synthetic */ stc0 m28123E(cm10.a aVar, String str, String str2, UploadSource uploadSource, stc0.a aVar2, String str3, boolean z, String str4, String str5) {
        String strM27248g;
        cm10 cm10VarE = aVar.e();
        avc0 avc0Var = new avc0(str, "cloud_tag");
        avc0Var.f8555c = str2;
        if (uploadSource != null) {
            aVar2.a("X-Putong-Cloud-Module", uploadSource.toString());
        }
        if (str != null && "video".equals(str2)) {
            stc0.a aVarO = aVar2.a("X-Putong-Module", str).p(avc0Var).o(String.class, str3);
            if (z) {
                strM27248g = xh5.m27249h("/verification-video/upload");
            } else {
                strM27248g = xh5.m27248g("/upload/" + str2);
            }
            return aVarO.q(strM27248g).l(cm10VarE).b();
        }
        if (!TextUtils.isEmpty(str)) {
            avc0Var.f8553a = str;
        } else if ("moment".equals(str4)) {
            avc0Var.f8553a = str4;
        } else {
            avc0Var.f8553a = "unknown";
        }
        stc0.a aVarO2 = aVar2.p(avc0Var).o(String.class, str3);
        if (TextUtils.isEmpty(str5)) {
            str5 = xh5.m27248g("/upload/" + str2);
        }
        return aVarO2.q(str5).l(cm10VarE).b();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.tantanapp.common.network.ApiExcep$UploadedMediaNotFound */
    /* JADX INFO: renamed from: F */
    public static /* synthetic */ List m28124F(List list, boolean z, List list2, Envelope envelope) throws ApiExcep.UploadedMediaNotFound {
        Picture picture;
        List list3 = envelope.getModuleData(CommonData.class).media;
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (final int i = 0; i < list.size(); i++) {
            Media media = (Media) list.get(i);
            if (TEnum.equals(media.status, "preprocessed")) {
                Media media2 = z ? (Media) list3.get(0) : (Media) vwb.r(list3, new w9j() { // from class: l.ua5
                    public final Object call(Object obj) {
                        return Boolean.valueOf(("media" + i).equals(((Media) obj).name));
                    }
                });
                if (media2 == null) {
                    throw new ApiExcep.UploadedMediaNotFound((exc0) null);
                }
                if ((media instanceof Video) && (picture = (Picture) vwb.r(list3, new w9j() { // from class: l.va5
                    public final Object call(Object obj) {
                        return Boolean.valueOf(("cover" + i).equals(((Media) obj).name));
                    }
                })) != null && (media2 instanceof Video)) {
                    ((Video) media2).cover = picture;
                }
                if (media2.cover() != null && media.cover() != null) {
                    Picture pictureCover = media2.cover();
                    Picture pictureCover2 = media.cover();
                    if (TextUtils.isEmpty(((Media) pictureCover2).tempUrl)) {
                        qib0.f19782G.m12734G0(((Media) pictureCover).urlKey, ((Media) pictureCover2).url);
                    } else {
                        qib0.f19782G.m12734G0(((Media) pictureCover).urlKey, ((Media) pictureCover2).tempUrl);
                    }
                }
                TrackMediaUploadUtil.m(media2, media);
                media2.uploadEndTime = jUptimeMillis;
                list2.set(i, media2);
                media2.name = null;
            }
        }
        return list2;
    }

    /* JADX INFO: renamed from: G */
    public static void m28125G(cm10.a aVar, String str, String str2, String str3) {
        aVar.c(oxk.j(new String[]{"Content-Disposition", "form-data; name=\"" + str3 + "\"; filename=\"filename.cache\"", "Content-Transfer-Encoding", "binary"}), utc0.create(hyx.d(str), new File(str2)));
    }

    /* JADX INFO: renamed from: H */
    public static Bitmap m28126H(Context context, Uri uri, BitmapFactory.Options options) {
        Bitmap bitmapDecodeStream;
        int i;
        do {
            bitmapDecodeStream = null;
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(context.getContentResolver().openInputStream(uri), null, options);
                break;
            } catch (FileNotFoundException e) {
                CrashHelper.c(e);
                i = options.inSampleSize * 2;
                options.inSampleSize = i;
            }
        } while (i < 1024);
        return bitmapDecodeStream;
    }

    /* JADX INFO: renamed from: I */
    public static c<List<Media>> m28127I(List<Media> list, String str) {
        return m28128J(list, str, null);
    }

    /* JADX INFO: renamed from: J */
    public static c<List<Media>> m28128J(List<Media> list, String str, String str2) {
        return m28129K(list, str, str2, null);
    }

    /* JADX INFO: renamed from: K */
    public static c<List<Media>> m28129K(List<Media> list, String str, String str2, UploadSource uploadSource) {
        return m28130L(list, str, str2, null, uploadSource);
    }

    /* JADX INFO: renamed from: L */
    public static c<List<Media>> m28130L(List<Media> list, String str, String str2, Map<String, String> map, UploadSource uploadSource) {
        return m28132N(list, str, str2, false, map, uploadSource);
    }

    /* JADX INFO: renamed from: M */
    public static c<List<Media>> m28131M(List<Media> list, String str, String str2, boolean z) {
        return m28132N(list, str, str2, z, null, null);
    }

    /* JADX INFO: renamed from: N */
    public static c<List<Media>> m28132N(List<Media> list, String str, String str2, boolean z, Map<String, String> map, UploadSource uploadSource) {
        return m28133O(list, str, str2, z, map, null, uploadSource);
    }

    /* JADX INFO: renamed from: O */
    public static c<List<Media>> m28133O(final List<Media> list, final String str, final String str2, final boolean z, Map<String, String> map, final String str3, final UploadSource uploadSource) {
        Picture picture;
        final cm10.a aVarF = new cm10.a().f(cm10.j);
        if (NullChecker.a(map) && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                aVarF.a(entry.getKey(), entry.getValue());
            }
        }
        Iterator<Media> it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            Video video = (Media) it.next();
            if (!TEnum.equals(((Media) video).status, "normal")) {
                if (TEnum.equals(((Media) video).status, "raw")) {
                    ohg0.a();
                    return null;
                }
                if (TEnum.equals(((Media) video).status, "preprocessed")) {
                    i++;
                    boolean z2 = video instanceof Video;
                    if (z2 && (picture = video.cover) != null) {
                        m28125G(aVarF, ((Media) picture).mediaType, rhi.z(((Media) picture).url), "cover" + i2);
                    }
                    if (z2) {
                        Video video2 = video;
                        if (video2.isFromNewCamera) {
                            aVarF.a("take_photo", (video2.isLocalMusic || (video2.hasOriginalSound && !video2.hasMusic)) ? "both" : "gif");
                        }
                    }
                    m28125G(aVarF, ((Media) video).mediaType, rhi.z(((Media) video).url), "media" + i2);
                }
            }
            i2++;
        }
        if (i == 0) {
            return c.just(list);
        }
        final ArrayList arrayList = new ArrayList(list);
        final String str4 = vwb.r(list, new w9j() { // from class: l.pa5
            public final Object call(Object obj) {
                return ya5.m28138z((Media) obj);
            }
        }) != null ? "video" : vwb.r(list, new w9j() { // from class: l.qa5
            public final Object call(Object obj) {
                return ya5.m28136x((Media) obj);
            }
        }) != null ? "audio" : "image";
        final String strN = TrackMediaUploadUtil.n(list);
        stc0.a aVarAuth = qib0.f19784H.auth();
        if (qib0.f19805c0.mo11987D5()) {
            aVarAuth = qib0.f19784H.authBeforeSignUp();
        } else if (!qib0.f19805c0.signedIn_()) {
            aVarAuth = qib0.f19784H.basic();
        }
        final stc0.a aVar = aVarAuth;
        return new la20((v9j<stc0>) new v9j() { // from class: l.ra5
            public final Object call() {
                return ya5.m28123E(aVarF, str2, str4, uploadSource, aVar, strN, z, str, str3);
            }
        }, true).compose(TrackMediaUploadUtil.g0(list)).map(new w9j() { // from class: l.sa5
            public final Object call(Object obj) {
                return ya5.m28124F(list, z, arrayList, (Envelope) obj);
            }
        }).doOnSubscribe(new d30() { // from class: l.ta5
            public final void call() {
                ya5.m28121C(list);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public static Bitmap m28134P(Bitmap bitmap, int i, int i2) {
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
    public static c<Detect> m28135Q(final DetectRequest detectRequest) {
        final boolean zSignedIn_ = qib0.f19805c0.signedIn_();
        return new la20(new v9j() { // from class: l.wa5
            public final Object call() {
                return (zSignedIn_ ? xh5.network.auth() : xh5.network.authBeforeSignUp()).q(xh5.m27250i("/antispam/content/detect")).l(utc0.create(Network.JSON, detectRequest.toJson())).b();
            }
        }).map(new w9j() { // from class: l.xa5
            public final Object call(Object obj) {
                return ((Envelope) obj).getModuleData(CommonData.class).detect;
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ Boolean m28136x(Media media) {
        String str = media.mediaType;
        return Boolean.valueOf(str != null && str.contains("audio"));
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ Boolean m28138z(Media media) {
        String str = media.mediaType;
        return Boolean.valueOf(str != null && str.contains("video"));
    }
}
