package p149l;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.p065ui.download.C13111a;
import com.p046p1.mobile.putong.p065ui.download.DownloadTask;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.tantanapp.common.utils.CrashHelper;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class dmh {

    /* JADX INFO: renamed from: a */
    public static volatile dmh f86948a;

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m112479c(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m112481e(DownloadTask downloadTask, Throwable th) {
        lsi0.m151578h(R$string.f38975T);
        CrashHelper.m81297d(new Exception("downloadMedia Fail exception:" + th.getMessage(), th), 50);
    }

    /* JADX INFO: renamed from: f */
    public static Bitmap m112482f(Act act, float f, float f2, Bitmap bitmap, Bitmap bitmap2) {
        float f3;
        Bitmap bitmapCreateBitmap;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f4 = 1.0f;
        if (width >= xdl0.m208412y0() || height > xdl0.m208410x0(act)) {
            if (height > xdl0.m208410x0(act)) {
                float f5 = width;
                float fM208410x0 = xdl0.m208410x0(act) / height;
                Matrix matrix = new Matrix();
                matrix.postScale((f5 * fM208410x0) / f5, fM208410x0);
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
            canvas.drawBitmap(bitmapCreateBitmap2, (width - width3) - t100.m186890d(24.0f), (height - height3) - t100.m186890d(20.0f), (Paint) null);
            canvas.save();
            canvas.restore();
            return bitmapCreateBitmap3;
        }
        float fM208412y0 = xdl0.m208412y0();
        float f6 = height;
        float f7 = width;
        float fM208410x1 = (fM208412y0 / f7) * f6;
        if (fM208410x1 > xdl0.m208410x0(act)) {
            fM208410x1 = xdl0.m208410x0(act);
            fM208412y0 = f7 * (fM208410x1 / f6);
        }
        Matrix matrix3 = new Matrix();
        matrix3.postScale(fM208412y0 / f7, fM208410x1 / f6);
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
        canvas2.drawBitmap(bitmapCreateBitmap4, (width - width5) - t100.m186890d(24.0f), (height - height5) - t100.m186890d(20.0f), (Paint) null);
        canvas2.save();
        canvas2.restore();
        return bitmapCreateBitmap5;
    }

    /* JADX INFO: renamed from: k */
    public static dmh m112483k() {
        if (f86948a == null) {
            synchronized (dmh.class) {
                try {
                    if (f86948a == null) {
                        f86948a = new dmh();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f86948a;
    }

    /* JADX INFO: renamed from: g */
    public final void m112484g(Act act, File file, float f, float f2) {
        try {
            m112492p(m112482f(act, f, f2, BitmapFactory.decodeStream(new FileInputStream(file)), BitmapFactory.decodeResource(act.getResources(), f3c0.f94368L0)), file, Bitmap.CompressFormat.JPEG, true);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: h */
    public void m112485h(Act act, Media media) {
        m112486i(act, media, false);
    }

    /* JADX INFO: renamed from: i */
    public void m112486i(final Act act, final Media media, final boolean z) {
        if (zqx.m219898k()) {
            m112489m(act, media, z);
        } else {
            PermissionHelper.m79882c().m79900r("android.permission.WRITE_EXTERNAL_STORAGE").m79905w(false).m79903u(true).m79895m(new d30() { // from class: l.ylh
                @Override // p149l.d30
                public final void call() {
                    this.f198893a.m112489m(act, media, z);
                }
            }, new e30() { // from class: l.zlh
                @Override // p149l.e30
                public final void call(Object obj) {
                    dmh.m112479c((PermissionHelper.PermissionDeniedReason) obj);
                }
            }).m79891i(act);
        }
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void m112489m(final Act act, final Media media, final boolean z) {
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
            CrashHelper.m81296c(new Exception("downloadMediaWithPermission exception:" + e.getMessage(), e));
            str = null;
        }
        if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str)) {
            lsi0.m151578h(R$string.f38975T);
            return;
        }
        DownloadTask downloadTaskM79626a = new DownloadTask.C13110b(qib0.f154693H.getDownloadHttp()).m79642q(str4).m79640o(str).m79635j(new f30() { // from class: l.amh
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f70619a.m112491o(media, z, act, sb, (DownloadTask) obj, (File) obj2);
            }
        }).m79631f(new f30() { // from class: l.bmh
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                dmh.m112481e((DownloadTask) obj, (Throwable) obj2);
            }
        }).m79626a();
        if (C13111a.m79654u().m79674y(downloadTaskM79626a.m79623x())) {
            lsi0.m151578h(R$string.f39086j5);
        } else {
            C13111a.m79654u().m79665o(downloadTaskM79626a);
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m112488l(Bitmap bitmap) {
        return bitmap == null || bitmap.getWidth() == 0 || bitmap.getHeight() == 0;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m112490n(DownloadTask downloadTask, Media media, boolean z, Act act, File file, StringBuilder sb) {
        FeedModule.f38852a.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse("file://" + downloadTask.m79621v())));
        Picture picture = (Picture) media;
        if (!z) {
            lsi0.m151580j(FeedModule.f38852a.getString(R$string.f38951P, sb.toString()));
        } else {
            Dimension dimension = picture.size;
            m112484g(act, file, dimension.width, dimension.height);
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m112491o(final Media media, final boolean z, final Act act, final StringBuilder sb, final DownloadTask downloadTask, final File file) {
        e51.m114742G(new Runnable() { // from class: l.cmh
            @Override // java.lang.Runnable
            public final void run() {
                this.f81561a.m112490n(downloadTask, media, z, act, file, sb);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final boolean m112492p(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat, boolean z) {
        boolean zCompress = false;
        if (m112488l(bitmap)) {
            return false;
        }
        try {
            zCompress = bitmap.compress(compressFormat, 100, new BufferedOutputStream(new FileOutputStream(file)));
            if (z && !bitmap.isRecycled()) {
                bitmap.recycle();
            }
            lsi0.m151580j("图片已保存到相册");
            FeedModule.f38852a.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse("file://" + file.getAbsolutePath())));
            return zCompress;
        } catch (IOException e) {
            CrashHelper.m81296c(e);
            e.printStackTrace();
            return zCompress;
        }
    }
}
