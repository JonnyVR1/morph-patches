package p149l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class q7j0 {

    /* JADX INFO: renamed from: a */
    private static final Paint f153049a = new Paint(6);

    /* JADX INFO: renamed from: b */
    private static final Paint f153050b = new Paint(7);

    /* JADX INFO: renamed from: c */
    private static final Paint f153051c;

    /* JADX INFO: renamed from: d */
    private static final Set<String> f153052d;

    /* JADX INFO: renamed from: e */
    private static final Lock f153053e;

    static {
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        f153052d = hashSet;
        f153053e = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new LockC19442a();
        Paint paint = new Paint(7);
        f153051c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* JADX INFO: renamed from: a */
    private static void m173278a(@NonNull Bitmap bitmap, @NonNull Bitmap bitmap2, Matrix matrix) {
        f153053e.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f153049a);
            m173281d(canvas);
        } finally {
            f153053e.unlock();
        }
    }

    /* JADX INFO: renamed from: b */
    public static Bitmap m173279b(@NonNull g23 g23Var, @NonNull Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            width = i2 / bitmap.getHeight();
            width2 = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapMo124143d = g23Var.mo124143d(i, i2, m173285h(bitmap));
        m173289l(bitmap, bitmapMo124143d);
        m173278a(bitmap, bitmapMo124143d, matrix);
        return bitmapMo124143d;
    }

    /* JADX INFO: renamed from: c */
    public static Bitmap m173280c(@NonNull g23 g23Var, @NonNull Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            Log.isLoggable("TransformationUtils", 2);
            return m173282e(g23Var, bitmap, i, i2);
        }
        Log.isLoggable("TransformationUtils", 2);
        return bitmap;
    }

    /* JADX INFO: renamed from: d */
    private static void m173281d(Canvas canvas) {
        canvas.setBitmap(null);
    }

    /* JADX INFO: renamed from: e */
    public static Bitmap m173282e(@NonNull g23 g23Var, @NonNull Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            Log.isLoggable("TransformationUtils", 2);
            return bitmap;
        }
        float fMin = Math.min(i / bitmap.getWidth(), i2 / bitmap.getHeight());
        int iRound = Math.round(bitmap.getWidth() * fMin);
        int iRound2 = Math.round(bitmap.getHeight() * fMin);
        if (bitmap.getWidth() == iRound && bitmap.getHeight() == iRound2) {
            Log.isLoggable("TransformationUtils", 2);
            return bitmap;
        }
        Bitmap bitmapMo124143d = g23Var.mo124143d((int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), m173285h(bitmap));
        m173289l(bitmap, bitmapMo124143d);
        if (Log.isLoggable("TransformationUtils", 2)) {
            bitmap.getWidth();
            bitmap.getHeight();
            bitmapMo124143d.getWidth();
            bitmapMo124143d.getHeight();
        }
        Matrix matrix = new Matrix();
        matrix.setScale(fMin, fMin);
        m173278a(bitmap, bitmapMo124143d, matrix);
        return bitmapMo124143d;
    }

    /* JADX INFO: renamed from: f */
    public static Lock m173283f() {
        return f153053e;
    }

    /* JADX INFO: renamed from: g */
    public static int m173284g(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    private static Bitmap.Config m173285h(@NonNull Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: i */
    public static void m173286i(int i, Matrix matrix) {
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m173287j(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public static Bitmap m173288k(@NonNull g23 g23Var, @NonNull Bitmap bitmap, int i) {
        if (!m173287j(i)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        m173286i(i, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap bitmapMo124143d = g23Var.mo124143d(Math.round(rectF.width()), Math.round(rectF.height()), m173285h(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        bitmapMo124143d.setHasAlpha(bitmap.hasAlpha());
        m173278a(bitmap, bitmapMo124143d, matrix);
        return bitmapMo124143d;
    }

    /* JADX INFO: renamed from: l */
    public static void m173289l(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }

    /* JADX INFO: renamed from: l.q7j0$a */
    public static final class LockC19442a implements Lock {
        @Override // java.util.concurrent.locks.Lock
        @NonNull
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long j, @NonNull TimeUnit timeUnit) throws InterruptedException {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
        }

        @Override // java.util.concurrent.locks.Lock
        public void unlock() {
        }
    }
}
