package p153l;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.p070ui.download.C13274a;
import com.p051p1.mobile.putong.p070ui.download.DownloadTask;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.tantanapp.common.utils.CrashHelper;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class snh {

    /* JADX INFO: renamed from: a */
    public static volatile snh f169690a;

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m186924c(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m186926e(DownloadTask downloadTask, Throwable th) {
        o1j0.m165634h(R$string.f39823T);
        CrashHelper.m82480d(new Exception("downloadMedia Fail exception:" + th.getMessage(), th), 50);
    }

    /* JADX INFO: renamed from: f */
    public static Bitmap m186927f(Act act, float f, float f2, Bitmap bitmap, Bitmap bitmap2) {
        float f3;
        Bitmap bitmapCreateBitmap;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f4 = 1.0f;
        if (width >= bnl0.m105592y0() || height > bnl0.m105590x0(act)) {
            if (height > bnl0.m105590x0(act)) {
                float f5 = width;
                float fM105590x0 = bnl0.m105590x0(act) / height;
                Matrix matrix = new Matrix();
                matrix.postScale((f5 * fM105590x0) / f5, fM105590x0);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
                width = bitmapCreateBitmap.getWidth();
                height = bitmapCreateBitmap.getHeight();
            } else {
                f4 = width / f;
                f3 = height / f2;
                bitmapCreateBitmap = bitmap;
            }
            int width2 = bitmap2.getWidth();
            int height2 = bitmap2.getHeight();
            Matrix matrix2 = new Matrix();
            matrix2.postScale(f4, f3);
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmap2, 0, 0, width2, height2, matrix2, true);
            int width3 = bitmapCreateBitmap2.getWidth();
            int height3 = bitmapCreateBitmap2.getHeight();
            Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap3);
            canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, (Paint) null);
            canvas.drawBitmap(bitmapCreateBitmap2, (width - width3) - qa00.m175859d(24.0f), (height - height3) - qa00.m175859d(20.0f), (Paint) null);
            canvas.save();
            canvas.restore();
            return bitmapCreateBitmap3;
        }
        float fM105592y0 = bnl0.m105592y0();
        float f6 = height;
        float f7 = width;
        float fM105590x1 = (fM105592y0 / f7) * f6;
        if (fM105590x1 > bnl0.m105590x0(act)) {
            fM105590x1 = bnl0.m105590x0(act);
            fM105592y0 = f7 * (fM105590x1 / f6);
        }
        Matrix matrix3 = new Matrix();
        matrix3.postScale(fM105592y0 / f7, fM105590x1 / f6);
        bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix3, true);
        width = bitmapCreateBitmap.getWidth();
        height = bitmapCreateBitmap.getHeight();
        f3 = 1.0f;
        int width4 = bitmap2.getWidth();
        int height4 = bitmap2.getHeight();
        Matrix matrix4 = new Matrix();
        matrix4.postScale(f4, f3);
        Bitmap bitmapCreateBitmap4 = Bitmap.createBitmap(bitmap2, 0, 0, width4, height4, matrix4, true);
        int width5 = bitmapCreateBitmap4.getWidth();
        int height5 = bitmapCreateBitmap4.getHeight();
        Bitmap bitmapCreateBitmap5 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(bitmapCreateBitmap5);
        canvas2.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, (Paint) null);
        canvas2.drawBitmap(bitmapCreateBitmap4, (width - width5) - qa00.m175859d(24.0f), (height - height5) - qa00.m175859d(20.0f), (Paint) null);
        canvas2.save();
        canvas2.restore();
        return bitmapCreateBitmap5;
    }

    /* JADX INFO: renamed from: k */
    public static snh m186928k() {
        if (f169690a == null) {
            synchronized (snh.class) {
                try {
                    if (f169690a == null) {
                        f169690a = new snh();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f169690a;
    }

    /* JADX INFO: renamed from: g */
    public final void m186929g(Act act, File file, float f, float f2) {
        try {
            m186937p(m186927f(act, f, f2, BitmapFactory.decodeStream(new FileInputStream(file)), BitmapFactory.decodeResource(act.getResources(), lbc0.f130886L0)), file, Bitmap.CompressFormat.JPEG, true);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: h */
    public void m186930h(Act act, Media media) {
        m186931i(act, media, false);
    }

    /* JADX INFO: renamed from: i */
    public void m186931i(final Act act, final Media media, final boolean z) {
        if (wzx.m208784k()) {
            m186934m(act, media, z);
        } else {
            PermissionHelper.m81065c().m81083r("android.permission.WRITE_EXTERNAL_STORAGE").m81088w(false).m81086u(true).m81078m(new x20() { // from class: l.nnh
                @Override // p153l.x20
                public final void call() {
                    this.f142789a.m186934m(act, media, z);
                }
            }, new y20() { // from class: l.onh
                @Override // p153l.y20
                public final void call(Object obj) {
                    snh.m186924c((PermissionHelper.PermissionDeniedReason) obj);
                }
            }).m81074i(act);
        }
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void m186934m(final Act act, final Media media, final boolean z) {
        String str;
        String aspectRatio;
        String str2;
        String str3;
        final StringBuilder sb = new StringBuilder();
        String str4 = null;
        try {
            if (media instanceof Video) {
                aspectRatio = ((Video) media).formatAspectRatio();
                str2 = Environment.DIRECTORY_MOVIES;
            } else if (media instanceof Picture) {
                aspectRatio = ((Picture) media).aspectRatioBiggest().formatted();
                str2 = Environment.DIRECTORY_PICTURES;
            } else {
                aspectRatio = null;
                str2 = null;
            }
            if (!TextUtils.isEmpty(aspectRatio) && !TextUtils.isEmpty(str2)) {
                String strSubstring = aspectRatio.substring(aspectRatio.lastIndexOf("."), aspectRatio.length());
                int iIndexOf = strSubstring.indexOf(63);
                if (iIndexOf == -1) {
                    str3 = System.currentTimeMillis() + strSubstring;
                } else {
                    str3 = System.currentTimeMillis() + strSubstring.substring(0, iIndexOf);
                }
                StringBuilder sb2 = new StringBuilder(Environment.getExternalStoragePublicDirectory(str2).getAbsolutePath());
                String str5 = File.separator;
                sb2.append(str5);
                sb2.append("Tantan");
                String string = sb2.toString();
                File file = new File(string);
                if (file.exists() || (!file.exists() && file.mkdirs())) {
                    sb.append(str2);
                    sb.append(str5);
                    sb.append("Tantan");
                    sb.append(str5);
                    sb.append(str3);
                    str4 = string + str5 + str3;
                }
            }
            str = str4;
            str4 = aspectRatio;
        } catch (Exception e) {
            CrashHelper.m82479c(new Exception("downloadMediaWithPermission exception:" + e.getMessage(), e));
            str = null;
        }
        if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str)) {
            o1j0.m165634h(R$string.f39823T);
            return;
        }
        DownloadTask downloadTaskM80809a = new DownloadTask.C13273b(uqb0.f180376H.getDownloadHttp()).m80825q(str4).m80823o(str).m80818j(new z20() { // from class: l.pnh
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f153302a.m186936o(media, z, act, sb, (DownloadTask) obj, (File) obj2);
            }
        }).m80814f(new z20() { // from class: l.qnh
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                snh.m186926e((DownloadTask) obj, (Throwable) obj2);
            }
        }).m80809a();
        if (C13274a.m80837u().m80857y(downloadTaskM80809a.m80806x())) {
            o1j0.m165634h(R$string.f39934j5);
        } else {
            C13274a.m80837u().m80848o(downloadTaskM80809a);
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m186933l(Bitmap bitmap) {
        return bitmap == null || bitmap.getWidth() == 0 || bitmap.getHeight() == 0;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m186935n(DownloadTask downloadTask, Media media, boolean z, Act act, File file, StringBuilder sb) {
        FeedModule.f39700a.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse("file://" + downloadTask.m80804v())));
        Picture picture = (Picture) media;
        if (!z) {
            o1j0.m165636j(FeedModule.f39700a.getString(R$string.f39799P, sb.toString()));
        } else {
            Dimension dimension = picture.size;
            m186929g(act, file, dimension.width, dimension.height);
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m186936o(final Media media, final boolean z, final Act act, final StringBuilder sb, final DownloadTask downloadTask, final File file) {
        l51.m152887G(new Runnable() { // from class: l.rnh
            @Override // java.lang.Runnable
            public final void run() {
                this.f164041a.m186935n(downloadTask, media, z, act, file, sb);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final boolean m186937p(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat, boolean z) {
        boolean zCompress = false;
        if (m186933l(bitmap)) {
            return false;
        }
        try {
            zCompress = bitmap.compress(compressFormat, 100, new BufferedOutputStream(new FileOutputStream(file)));
            if (z && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
            o1j0.m165636j("图片已保存到相册");
            FeedModule.f39700a.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse("file://" + file.getAbsolutePath())));
            return zCompress;
        } catch (IOException e) {
            CrashHelper.m82479c(e);
            e.printStackTrace();
            return zCompress;
        }
    }
}
