package p153l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.p053ui.cropiwa.CropperAct;
import com.p051p1.mobile.putong.p070ui.download.C13274a;
import com.p051p1.mobile.putong.p070ui.download.DownloadTask;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;

/* JADX INFO: loaded from: classes10.dex */
public class ps40 {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m173582c(x20 x20Var, DownloadTask downloadTask, Throwable th) {
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: d */
    public static File m173583d(Context context, String str) {
        String str2 = niw.m163315e(str) + ".png";
        File fileM22053H1 = CropperAct.m22053H1(context);
        if (!fileM22053H1.exists()) {
            fileM22053H1.mkdir();
        }
        return new File(fileM22053H1, str2);
    }

    /* JADX INFO: renamed from: e */
    public static void m173584e(Bitmap bitmap, DownloadTask downloadTask) {
        if (NullChecker.m82486a(bitmap) && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        if (NullChecker.m82486a(downloadTask)) {
            C13274a.m80837u().m80847n(downloadTask);
        }
    }

    /* JADX INFO: renamed from: f */
    public static DownloadTask m173585f(String str, File file, final y20<File> y20Var, @Nullable final x20 x20Var) {
        DownloadTask downloadTaskM80809a = new DownloadTask.C13273b(uqb0.f180376H.getDownloadHttp()).m80825q(str).m80823o(file.getAbsolutePath()).m80818j(new z20() { // from class: l.ms40
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                l51.m152887G(new Runnable() { // from class: l.os40
                    @Override // java.lang.Runnable
                    public final void run() {
                        y20Var.call(file);
                    }
                });
            }
        }).m80814f(new z20() { // from class: l.ns40
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                ps40.m173582c(x20Var, (DownloadTask) obj, (Throwable) obj2);
            }
        }).m80809a();
        C13274a.m80837u().m80848o(downloadTaskM80809a);
        return downloadTaskM80809a;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m173586g(float f, float f2) {
        return f + (1.0f - f2) >= 1.0f;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static Bitmap m173587h(View view, File file) {
        return m173588i(view, BitmapFactory.decodeFile(file.getAbsolutePath()), qa00.m175859d(5.0f), 0, qa00.m175859d(5.0f), 0, 0.49f, 0.51f, 0.0f, 0.0f);
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static Bitmap m173588i(View view, Bitmap bitmap, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4) {
        Bitmap bitmapCreateScaledBitmap;
        if (bitmap == null || bitmap.getHeight() == 0 || bitmap.getWidth() == 0 || view == null || view.getWidth() == 0 || view.getHeight() == 0) {
            return null;
        }
        view.setPadding(i, i2, i3, i4);
        if (bitmap.getHeight() >= view.getHeight() || m173586g(f3, f4)) {
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
        if (bitmapCreateScaledBitmap.getWidth() >= view.getWidth() || m173586g(f, f2)) {
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
