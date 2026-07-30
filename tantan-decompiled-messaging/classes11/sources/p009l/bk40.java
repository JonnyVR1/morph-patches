package p009l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.p004ui.download.C0513a;
import com.p000p1.mobile.putong.p004ui.download.DownloadTask;
import com.p1.mobile.android.ui.cropiwa.CropperAct;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import l.d30;
import l.e30;
import l.e51;
import l.f30;
import l.ogw;
import l.qib0;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class bk40 {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m12067c(d30 d30Var, DownloadTask downloadTask, Throwable th) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: d */
    public static File m12068d(Context context, String str) {
        String str2 = ogw.e(str) + ".png";
        File fileG1 = CropperAct.G1(context);
        if (!fileG1.exists()) {
            fileG1.mkdir();
        }
        return new File(fileG1, str2);
    }

    /* JADX INFO: renamed from: e */
    public static void m12069e(Bitmap bitmap, DownloadTask downloadTask) {
        if (NullChecker.a(bitmap) && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        if (NullChecker.a(downloadTask)) {
            C0513a.m9975u().m9985n(downloadTask);
        }
    }

    /* JADX INFO: renamed from: f */
    public static DownloadTask m12070f(String str, File file, final e30<File> e30Var, @Nullable final d30 d30Var) {
        DownloadTask downloadTaskM9947a = new DownloadTask.C0512b(qib0.H.getDownloadHttp()).m9963q(str).m9961o(file.getAbsolutePath()).m9956j(new f30() { // from class: l.yj40
            public final void call(Object obj, Object obj2) {
                e51.G(new Runnable() { // from class: l.ak40
                    @Override // java.lang.Runnable
                    public final void run() {
                        e30Var.call(file);
                    }
                });
            }
        }).m9952f(new f30() { // from class: l.zj40
            public final void call(Object obj, Object obj2) {
                bk40.m12067c(d30Var, (DownloadTask) obj, (Throwable) obj2);
            }
        }).m9947a();
        C0513a.m9975u().m9986o(downloadTaskM9947a);
        return downloadTaskM9947a;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m12071g(float f, float f2) {
        return f + (1.0f - f2) >= 1.0f;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static Bitmap m12072h(View view, File file) {
        return m12073i(view, BitmapFactory.decodeFile(file.getAbsolutePath()), t100.d(5.0f), 0, t100.d(5.0f), 0, 0.49f, 0.51f, 0.0f, 0.0f);
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static Bitmap m12073i(View view, Bitmap bitmap, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4) {
        Bitmap bitmapCreateScaledBitmap;
        if (bitmap == null || bitmap.getHeight() == 0 || bitmap.getWidth() == 0 || view == null || view.getWidth() == 0 || view.getHeight() == 0) {
            return null;
        }
        view.setPadding(i, i2, i3, i4);
        if (bitmap.getHeight() >= view.getHeight() || m12071g(f3, f4)) {
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
        if (bitmapCreateScaledBitmap.getWidth() >= view.getWidth() || m12071g(f, f2)) {
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
