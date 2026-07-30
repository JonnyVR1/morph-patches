package p153l;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
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
public final class ugj0 {

    /* JADX INFO: renamed from: a */
    private static final Paint f178903a = new Paint(6);

    /* JADX INFO: renamed from: b */
    private static final Paint f178904b = new Paint(7);

    /* JADX INFO: renamed from: c */
    private static final Paint f178905c;

    /* JADX INFO: renamed from: d */
    private static final Set<String> f178906d;

    /* JADX INFO: renamed from: e */
    private static final Lock f178907e;

    /* JADX INFO: renamed from: l.ugj0$a */
    public class C20570a implements InterfaceC20571b {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ int f178908a;

        public C20570a(int i) {
            this.f178908a = i;
        }

        @Override // p153l.ugj0.InterfaceC20571b
        /* JADX INFO: renamed from: a */
        public void mo195920a(Canvas canvas, Paint paint, RectF rectF) {
            int i = this.f178908a;
            canvas.drawRoundRect(rectF, i, i, paint);
        }
    }

    /* JADX INFO: renamed from: l.ugj0$b */
    public interface InterfaceC20571b {
        /* JADX INFO: renamed from: a */
        void mo195920a(Canvas canvas, Paint paint, RectF rectF);
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        f178906d = hashSet;
        f178907e = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new LockC20572c();
        Paint paint = new Paint(7);
        f178905c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* JADX INFO: renamed from: a */
    private static void m195904a(@NonNull Bitmap bitmap, @NonNull Bitmap bitmap2, Matrix matrix) {
        f178907e.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f178903a);
            m195907d(canvas);
        } finally {
            f178907e.unlock();
        }
    }

    /* JADX INFO: renamed from: b */
    public static Bitmap m195905b(@NonNull w23 w23Var, @NonNull Bitmap bitmap, int i, int i2) {
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
        Bitmap bitmapMo191127d = w23Var.mo191127d(i, i2, m195913j(bitmap));
        m195919p(bitmap, bitmapMo191127d);
        m195904a(bitmap, bitmapMo191127d, matrix);
        return bitmapMo191127d;
    }

    /* JADX INFO: renamed from: c */
    public static Bitmap m195906c(@NonNull w23 w23Var, @NonNull Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            Log.isLoggable("TransformationUtils", 2);
            return m195908e(w23Var, bitmap, i, i2);
        }
        Log.isLoggable("TransformationUtils", 2);
        return bitmap;
    }

    /* JADX INFO: renamed from: d */
    private static void m195907d(Canvas canvas) {
        canvas.setBitmap(null);
    }

    /* JADX INFO: renamed from: e */
    public static Bitmap m195908e(@NonNull w23 w23Var, @NonNull Bitmap bitmap, int i, int i2) {
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
        Bitmap bitmapMo191127d = w23Var.mo191127d((int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), m195913j(bitmap));
        m195919p(bitmap, bitmapMo191127d);
        if (Log.isLoggable("TransformationUtils", 2)) {
            bitmap.getWidth();
            bitmap.getHeight();
            bitmapMo191127d.getWidth();
            bitmapMo191127d.getHeight();
        }
        Matrix matrix = new Matrix();
        matrix.setScale(fMin, fMin);
        m195904a(bitmap, bitmapMo191127d, matrix);
        return bitmapMo191127d;
    }

    /* JADX INFO: renamed from: f */
    private static Bitmap m195909f(@NonNull w23 w23Var, @NonNull Bitmap bitmap) {
        Bitmap.Config configM195910g = m195910g(bitmap);
        if (configM195910g.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap bitmapMo191127d = w23Var.mo191127d(bitmap.getWidth(), bitmap.getHeight(), configM195910g);
        new Canvas(bitmapMo191127d).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return bitmapMo191127d;
    }

    @NonNull
    /* JADX INFO: renamed from: g */
    private static Bitmap.Config m195910g(@NonNull Bitmap bitmap) {
        return (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGBA_F16;
    }

    /* JADX INFO: renamed from: h */
    public static Lock m195911h() {
        return f178907e;
    }

    /* JADX INFO: renamed from: i */
    public static int m195912i(int i) {
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
    /* JADX INFO: renamed from: j */
    private static Bitmap.Config m195913j(@NonNull Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: k */
    public static void m195914k(int i, Matrix matrix) {
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

    /* JADX INFO: renamed from: l */
    public static boolean m195915l(int i) {
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

    /* JADX INFO: renamed from: m */
    public static Bitmap m195916m(@NonNull w23 w23Var, @NonNull Bitmap bitmap, int i) {
        if (!m195915l(i)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        m195914k(i, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap bitmapMo191127d = w23Var.mo191127d(Math.round(rectF.width()), Math.round(rectF.height()), m195913j(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        bitmapMo191127d.setHasAlpha(bitmap.hasAlpha());
        m195904a(bitmap, bitmapMo191127d, matrix);
        return bitmapMo191127d;
    }

    /* JADX INFO: renamed from: n */
    public static Bitmap m195917n(@NonNull w23 w23Var, @NonNull Bitmap bitmap, int i) {
        vn80.m201941a(i > 0, "roundingRadius must be greater than 0.");
        return m195918o(w23Var, bitmap, new C20570a(i));
    }

    /* JADX INFO: renamed from: o */
    private static Bitmap m195918o(@NonNull w23 w23Var, @NonNull Bitmap bitmap, InterfaceC20571b interfaceC20571b) {
        Bitmap.Config configM195910g = m195910g(bitmap);
        Bitmap bitmapM195909f = m195909f(w23Var, bitmap);
        Bitmap bitmapMo191127d = w23Var.mo191127d(bitmapM195909f.getWidth(), bitmapM195909f.getHeight(), configM195910g);
        bitmapMo191127d.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapM195909f, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, bitmapMo191127d.getWidth(), bitmapMo191127d.getHeight());
        Lock lock = f178907e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapMo191127d);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            interfaceC20571b.mo195920a(canvas, paint, rectF);
            m195907d(canvas);
            lock.unlock();
            if (!bitmapM195909f.equals(bitmap)) {
                w23Var.mo191126c(bitmapM195909f);
            }
            return bitmapMo191127d;
        } catch (Throwable th) {
            f178907e.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m195919p(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }

    /* JADX INFO: renamed from: l.ugj0$c */
    public static final class LockC20572c implements Lock {
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
