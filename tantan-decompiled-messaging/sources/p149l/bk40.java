package p149l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.p048ui.cropiwa.CropperAct;
import com.p046p1.mobile.putong.p065ui.download.C13111a;
import com.p046p1.mobile.putong.p065ui.download.DownloadTask;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;

/* JADX INFO: loaded from: classes11.dex */
public class bk40 {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m102263c(d30 d30Var, DownloadTask downloadTask, Throwable th) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: d */
    public static File m102264d(Context context, String str) {
        String str2 = ogw.m164284e(str) + ".png";
        File fileM21054G1 = CropperAct.m21054G1(context);
        if (!fileM21054G1.exists()) {
            fileM21054G1.mkdir();
        }
        return new File(fileM21054G1, str2);
    }

    /* JADX INFO: renamed from: e */
    public static void m102265e(Bitmap bitmap, DownloadTask downloadTask) {
        if (NullChecker.m81303a(bitmap) && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        if (NullChecker.m81303a(downloadTask)) {
            C13111a.m79654u().m79664n(downloadTask);
        }
    }

    /* JADX INFO: renamed from: f */
    public static DownloadTask m102266f(String str, File file, final e30<File> e30Var, @Nullable final d30 d30Var) {
        DownloadTask downloadTaskM79626a = new DownloadTask.C13110b(qib0.f154693H.getDownloadHttp()).m79642q(str).m79640o(file.getAbsolutePath()).m79635j(new f30() { // from class: l.yj40
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                e51.m114742G(new Runnable() { // from class: l.ak40
                    @Override // java.lang.Runnable
                    public final void run() {
                        e30Var.call(file);
                    }
                });
            }
        }).m79631f(new f30() { // from class: l.zj40
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                bk40.m102263c(d30Var, (DownloadTask) obj, (Throwable) obj2);
            }
        }).m79626a();
        C13111a.m79654u().m79665o(downloadTaskM79626a);
        return downloadTaskM79626a;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m102267g(float f, float f2) {
        return f + (1.0f - f2) >= 1.0f;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static Bitmap m102268h(View view, File file) {
        return m102269i(view, BitmapFactory.decodeFile(file.getAbsolutePath()), t100.m186890d(5.0f), 0, t100.m186890d(5.0f), 0, 0.49f, 0.51f, 0.0f, 0.0f);
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static Bitmap m102269i(View view, Bitmap bitmap, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4) {
        Bitmap bitmapCreateScaledBitmap;
        if (bitmap == null || bitmap.getHeight() == 0 || bitmap.getWidth() == 0 || view == null || view.getWidth() == 0 || view.getHeight() == 0) {
            return null;
        }
        view.setPadding(i, i2, i3, i4);
        if (bitmap.getHeight() >= view.getHeight() || m102267g(f3, f4)) {
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), view.getHeight(), true);
            if (!bitmapCreateScaledBitmap.equals(bitmap)) {
                bitmap.recycle();
            }
        } else {
            int height = (int) (bitmap.getHeight() * f3);
            int height2 = (int) (bitmap.getHeight() * (1.0f - f4));
            int iMax = Math.max((view.getHeight() - height) - height2, 1);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), height);
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmap, 0, height, bitmap.getWidth(), (bitmap.getHeight() - height) - height2);
            Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(bitmap, 0, bitmap.getHeight() - height2, bitmap.getWidth(), height2);
            Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmapCreateBitmap2, bitmap.getWidth(), iMax, true);
            bitmapCreateScaledBitmap = Bitmap.createBitmap(bitmap.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateScaledBitmap);
            canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, (Paint) null);
            canvas.drawBitmap(bitmapCreateScaledBitmap2, 0.0f, height, (Paint) null);
            canvas.drawBitmap(bitmapCreateBitmap3, 0.0f, height + bitmapCreateScaledBitmap2.getHeight(), (Paint) null);
            bitmapCreateBitmap.recycle();
            bitmapCreateBitmap2.recycle();
            bitmapCreateScaledBitmap2.recycle();
            bitmapCreateBitmap3.recycle();
            if (!bitmap.equals(bitmapCreateScaledBitmap)) {
                bitmap.recycle();
            }
        }
        if (bitmapCreateScaledBitmap.getWidth() >= view.getWidth() || m102267g(f, f2)) {
            view.setBackground(new BitmapDrawable(view.getResources(), bitmapCreateScaledBitmap));
            return bitmapCreateScaledBitmap;
        }
        int width = (int) (bitmapCreateScaledBitmap.getWidth() * f);
        int width2 = (int) (bitmapCreateScaledBitmap.getWidth() * (1.0f - f2));
        int iMax2 = Math.max((view.getWidth() - width) - width2, 1);
        Bitmap bitmapCreateBitmap4 = Bitmap.createBitmap(bitmapCreateScaledBitmap, 0, 0, width, bitmapCreateScaledBitmap.getHeight());
        Bitmap bitmapCreateBitmap5 = Bitmap.createBitmap(bitmapCreateScaledBitmap, width, 0, (bitmapCreateScaledBitmap.getWidth() - width) - width2, bitmapCreateScaledBitmap.getHeight());
        Bitmap bitmapCreateBitmap6 = Bitmap.createBitmap(bitmapCreateScaledBitmap, bitmapCreateScaledBitmap.getWidth() - width2, 0, width2, bitmapCreateScaledBitmap.getHeight());
        Bitmap bitmapCreateScaledBitmap3 = Bitmap.createScaledBitmap(bitmapCreateBitmap5, iMax2, view.getHeight(), true);
        Bitmap bitmapCreateBitmap7 = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(bitmapCreateBitmap7);
        canvas2.drawBitmap(bitmapCreateBitmap4, 0.0f, 0.0f, (Paint) null);
        canvas2.drawBitmap(bitmapCreateScaledBitmap3, width, 0.0f, (Paint) null);
        canvas2.drawBitmap(bitmapCreateBitmap6, width + bitmapCreateScaledBitmap3.getWidth(), 0.0f, (Paint) null);
        view.setBackground(new BitmapDrawable(view.getResources(), bitmapCreateBitmap7));
        bitmapCreateBitmap4.recycle();
        bitmapCreateBitmap5.recycle();
        bitmapCreateBitmap6.recycle();
        bitmapCreateScaledBitmap3.recycle();
        bitmapCreateScaledBitmap.recycle();
        return bitmapCreateBitmap7;
    }
}
