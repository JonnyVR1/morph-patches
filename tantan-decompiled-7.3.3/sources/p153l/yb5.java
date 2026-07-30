package p153l;

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
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.Detect;
import com.p051p1.mobile.putong.data.DetectRequest;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.UploadSource;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class yb5 extends xi5 {
    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m214974C(List list) {
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
    public static /* synthetic */ x1d0 m214976E(ku10.C18260a c18260a, String str, String str2, UploadSource uploadSource, x1d0.C21228a c21228a, String str3, boolean z, String str4, String str5) {
        String strM211105g;
        z1d0 z1d0VarM151431e = c18260a.m151431e();
        d3d0 d3d0Var = new d3d0(str, wd00.CLOUD_API_TAG);
        d3d0Var.f84889c = str2;
        if (uploadSource != null) {
            c21228a.m209027a("X-Putong-Cloud-Module", uploadSource.toString());
        }
        if (str != null && "video".equals(str2)) {
            x1d0.C21228a c21228aM209041o = c21228a.m209027a("X-Putong-Module", str).m209042p(d3d0Var).m209041o(String.class, str3);
            if (z) {
                strM211105g = xi5.m211106h("/verification-video/upload");
            } else {
                strM211105g = xi5.m211105g("/upload/" + str2);
            }
            return c21228aM209041o.m209043q(strM211105g).m209038l(z1d0VarM151431e).m209028b();
        }
        if (!TextUtils.isEmpty(str)) {
            d3d0Var.f84887a = str;
        } else if ("moment".equals(str4)) {
            d3d0Var.f84887a = str4;
        } else {
            d3d0Var.f84887a = "unknown";
        }
        x1d0.C21228a c21228aM209041o2 = c21228a.m209042p(d3d0Var).m209041o(String.class, str3);
        if (TextUtils.isEmpty(str5)) {
            str5 = xi5.m211105g("/upload/" + str2);
        }
        return c21228aM209041o2.m209043q(str5).m209038l(z1d0VarM151431e).m209028b();
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ List m214977F(List list, boolean z, List list2, Envelope envelope) {
        Picture picture;
        List<Media> list3 = ((CommonData) envelope.getModuleData(CommonData.class)).media;
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (final int i = 0; i < list.size(); i++) {
            Media media = (Media) list.get(i);
            if (TEnum.equals(media.status, MediaLocalStatus.preprocessed)) {
                Media media2 = z ? list3.get(0) : (Media) jyb.m147529r(list3, new qcj() { // from class: l.ub5
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(("media" + i).equals(((Media) obj).name));
                    }
                });
                if (media2 == null) {
                    throw new ApiExcep.UploadedMediaNotFound(null);
                }
                if ((media instanceof Video) && (picture = (Picture) jyb.m147529r(list3, new qcj() { // from class: l.vb5
                    @Override // p153l.qcj
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
                        uqb0.f180374G.m127105G0(pictureCover.urlKey, pictureCover2.url);
                    } else {
                        uqb0.f180374G.m127105G0(pictureCover.urlKey, pictureCover2.tempUrl);
                    }
                }
                TrackMediaUploadUtil.m81499m(media2, media);
                media2.uploadEndTime = jUptimeMillis;
                list2.set(i, media2);
                media2.name = null;
            }
        }
        return list2;
    }

    /* JADX INFO: renamed from: G */
    public static void m214978G(ku10.C18260a c18260a, String str, String str2, String str3) {
        c18260a.m151429c(e0l.m118872j(HttpHeaders.CONTENT_DISPOSITION, "form-data; name=\"" + str3 + "\"; filename=\"filename.cache\"", "Content-Transfer-Encoding", "binary"), z1d0.create(e7y.m119773d(str), new File(str2)));
    }

    /* JADX INFO: renamed from: H */
    public static Bitmap m214979H(Context context, Uri uri, BitmapFactory.Options options) {
        Bitmap bitmapDecodeStream;
        int i;
        do {
            bitmapDecodeStream = null;
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(context.getContentResolver().openInputStream(uri), null, options);
                break;
            } catch (FileNotFoundException e) {
                CrashHelper.m82479c(e);
                i = options.inSampleSize * 2;
                options.inSampleSize = i;
            }
        } while (i < 1024);
        return bitmapDecodeStream;
    }

    /* JADX INFO: renamed from: I */
    public static C22421c<List<Media>> m214980I(List<Media> list, String str) {
        return m214981J(list, str, null);
    }

    /* JADX INFO: renamed from: J */
    public static C22421c<List<Media>> m214981J(List<Media> list, String str, String str2) {
        return m214982K(list, str, str2, null);
    }

    /* JADX INFO: renamed from: K */
    public static C22421c<List<Media>> m214982K(List<Media> list, String str, String str2, UploadSource uploadSource) {
        return m214983L(list, str, str2, null, uploadSource);
    }

    /* JADX INFO: renamed from: L */
    public static C22421c<List<Media>> m214983L(List<Media> list, String str, String str2, Map<String, String> map, UploadSource uploadSource) {
        return m214985N(list, str, str2, false, map, uploadSource);
    }

    /* JADX INFO: renamed from: M */
    public static C22421c<List<Media>> m214984M(List<Media> list, String str, String str2, boolean z) {
        return m214985N(list, str, str2, z, null, null);
    }

    /* JADX INFO: renamed from: N */
    public static C22421c<List<Media>> m214985N(List<Media> list, String str, String str2, boolean z, Map<String, String> map, UploadSource uploadSource) {
        return m214986O(list, str, str2, z, map, null, uploadSource);
    }

    /* JADX INFO: renamed from: O */
    public static C22421c<List<Media>> m214986O(final List<Media> list, final String str, final String str2, final boolean z, Map<String, String> map, final String str3, final UploadSource uploadSource) {
        Picture picture;
        final ku10.C18260a c18260aM151432f = new ku10.C18260a().m151432f(ku10.f128786j);
        if (NullChecker.m82486a(map) && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                c18260aM151432f.m151427a(entry.getKey(), entry.getValue());
            }
        }
        int i = 0;
        int i2 = 0;
        for (Media media : list) {
            if (!TEnum.equals(media.status, "normal")) {
                if (TEnum.equals(media.status, "raw")) {
                    wpg0.m207458a();
                    return null;
                }
                if (TEnum.equals(media.status, MediaLocalStatus.preprocessed)) {
                    i++;
                    boolean z2 = media instanceof Video;
                    if (z2 && (picture = ((Video) media).cover) != null) {
                        m214978G(c18260aM151432f, picture.mediaType, oki.m168038z(picture.url), "cover" + i2);
                    }
                    if (z2) {
                        Video video = (Video) media;
                        if (video.isFromNewCamera) {
                            c18260aM151432f.m151427a("take_photo", (video.isLocalMusic || (video.hasOriginalSound && !video.hasMusic)) ? "both" : "gif");
                        }
                    }
                    m214978G(c18260aM151432f, media.mediaType, oki.m168038z(media.url), "media" + i2);
                }
            }
            i2++;
        }
        if (i == 0) {
            return C22421c.just(list);
        }
        final ArrayList arrayList = new ArrayList(list);
        final String str4 = jyb.m147529r(list, new qcj() { // from class: l.pb5
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return yb5.m214991z((Media) obj);
            }
        }) != null ? "video" : jyb.m147529r(list, new qcj() { // from class: l.qb5
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return yb5.m214989x((Media) obj);
            }
        }) != null ? "audio" : "image";
        final String strM81500n = TrackMediaUploadUtil.m81500n(list);
        x1d0.C21228a c21228aAuth = uqb0.f180376H.auth();
        if (uqb0.f180397c0.mo105284D5()) {
            c21228aAuth = uqb0.f180376H.authBeforeSignUp();
        } else if (!uqb0.f180397c0.signedIn_()) {
            c21228aAuth = uqb0.f180376H.basic();
        }
        final x1d0.C21228a c21228a = c21228aAuth;
        return new ti20((pcj<x1d0>) new pcj() { // from class: l.rb5
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return yb5.m214976E(c18260aM151432f, str2, str4, uploadSource, c21228a, strM81500n, z, str, str3);
            }
        }, true).compose(TrackMediaUploadUtil.m81491g0(list)).map(new qcj() { // from class: l.sb5
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return yb5.m214977F(list, z, arrayList, (Envelope) obj);
            }
        }).doOnSubscribe(new x20() { // from class: l.tb5
            @Override // p153l.x20
            public final void call() {
                yb5.m214974C(list);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public static Bitmap m214987P(Bitmap bitmap, int i, int i2) {
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
    public static C22421c<Detect> m214988Q(final DetectRequest detectRequest) {
        final boolean zSignedIn_ = uqb0.f180397c0.signedIn_();
        return new ti20(new pcj() { // from class: l.wb5
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return (zSignedIn_ ? xi5.network.auth() : xi5.network.authBeforeSignUp()).m209043q(xi5.m211107i("/antispam/content/detect")).m209038l(z1d0.create(Network.JSON, detectRequest.toJson())).m209028b();
            }
        }).map(new qcj() { // from class: l.xb5
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((CommonData) ((Envelope) obj).getModuleData(CommonData.class)).detect;
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ Boolean m214989x(Media media) {
        String str = media.mediaType;
        return Boolean.valueOf(str != null && str.contains("audio"));
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ Boolean m214991z(Media media) {
        String str = media.mediaType;
        return Boolean.valueOf(str != null && str.contains("video"));
    }
}
