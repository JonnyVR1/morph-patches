package p007l;

import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.os.Build;
import android.os.CancellationSignal;
import android.util.Size;
import androidx.annotation.Nullable;
import com.google.common.collect.Lists;
import com.momo.xeengine.gift.GiftLogEvent;
import com.p003p1.mobile.android.media.TTFFmpegCommand;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import l.rhi;
import l.t95;
import l.wuv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public final class s5l0 {

    /* JADX INFO: renamed from: o */
    public static Random f4101o = new Random();

    /* JADX INFO: renamed from: a */
    public final r5l0 f4102a;

    /* JADX INFO: renamed from: b */
    public final long f4103b;

    /* JADX INFO: renamed from: c */
    public final boolean f4104c;

    /* JADX INFO: renamed from: d */
    public uy00 f4105d;

    /* JADX INFO: renamed from: e */
    public int f4106e;

    /* JADX INFO: renamed from: f */
    public int f4107f;

    /* JADX INFO: renamed from: g */
    public int f4108g;

    /* JADX INFO: renamed from: h */
    public int f4109h;

    /* JADX INFO: renamed from: i */
    public int f4110i;

    /* JADX INFO: renamed from: j */
    public int f4111j;

    /* JADX INFO: renamed from: k */
    public int f4112k = -1;

    /* JADX INFO: renamed from: l */
    public es5 f4113l = new es5();

    /* JADX INFO: renamed from: m */
    public ds5 f4114m = new ds5();

    /* JADX INFO: renamed from: n */
    public nmd f4115n = new nmd();

    public s5l0(r5l0 r5l0Var, boolean z, boolean z2) {
        this.f4105d = new uy00(r5l0Var.f4050a);
        this.f4102a = r5l0Var;
        this.f4103b = r5l0Var.f4051b;
        this.f4104c = z;
        m10619j();
    }

    /* JADX INFO: renamed from: d */
    public static String m10610d(String str, String str2, int i) {
        synchronized (s5l0.class) {
            ArrayList arrayListM = Lists.m(new String[]{"ffmpeg", "-probesize", "32M", "-analyzeduration", "10000000", "-ss", ddj0.m8989g(i), "-i", str2, "-frames:v", GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "-y", str});
            String[] strArr = new String[arrayListM.size()];
            arrayListM.toArray(strArr);
            arrayListM.toString();
            TTFFmpegCommand.m1001a(strArr);
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    @Nullable
    /* JADX INFO: renamed from: g */
    public static File m10611g(String str, int i, int i2, String str2) throws Throwable {
        FileOutputStream fileOutputStream;
        ?? r2 = 0;
        Bitmap bitmapA = Build.VERSION.SDK_INT >= 29 ? wuv.a(new File(rhi.z(str)), new Size(i, i2), (CancellationSignal) null) : ThumbnailUtils.createVideoThumbnail(rhi.z(str), 1);
        if (!NullChecker.a(bitmapA)) {
            return null;
        }
        File file = new File(str2);
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    bitmapA.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                    fileOutputStream.flush();
                    t95.b(fileOutputStream);
                    return file;
                } catch (IOException e) {
                    e = e;
                    CrashHelper.c(e);
                    t95.b(fileOutputStream);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                r2 = i2;
                t95.b((Closeable) r2);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            t95.b((Closeable) r2);
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public String m10612a() {
        return m10613b(-1L, -1L);
    }

    /* JADX INFO: renamed from: b */
    public String m10613b(long j, long j2) {
        int i;
        es5 es5Var = this.f4113l;
        int i2 = es5Var.f2634d;
        if ((i2 == -1 || this.f4102a.f4052c <= i2) && ((i = es5Var.f2635e) == -1 || this.f4102a.f4053d <= i)) {
            r5l0 r5l0Var = this.f4102a;
            if (r5l0Var.f4055f == 0 && "video/mp4".equals(r5l0Var.f4054e) && j2 == -1) {
                return this.f4102a.f4050a;
            }
        }
        synchronized (s5l0.class) {
            try {
                String absolutePath = k9j.m9572O("mp4").getAbsolutePath();
                es5 es5Var2 = this.f4113l;
                if (j <= 0) {
                    j = -1;
                }
                es5Var2.f2638h = j;
                if (j2 <= 0) {
                    j2 = -1;
                }
                es5Var2.f2639i = j2;
                boolean zM10244d = false;
                if (kb5.m9593f()) {
                    zM10244d = p3l0.m10241c().m10249i(this.f4102a.f4050a).m10248h(this.f4114m).m10247g(absolutePath).m10250j(this.f4113l).m10245e(this.f4115n).m10246f(false).m10244d();
                    this.f4112k = zM10244d ? -3 : -2;
                }
                if (zM10244d) {
                    return absolutePath;
                }
                p3l0.m10241c().m10249i(this.f4102a.f4050a).m10248h(this.f4114m).m10247g(absolutePath).m10250j(this.f4113l).m10245e(this.f4115n).m10246f(true).m10244d();
                return absolutePath;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public String m10614c(int i) {
        String absolutePath = k9j.m9572O("jpg").getAbsolutePath();
        String str = "crop=" + this.f4106e + ":" + this.f4107f + ":" + this.f4110i + ":" + this.f4111j;
        if (this.f4106e != this.f4108g || this.f4107f != this.f4109h) {
            str = str + ",scale=" + this.f4108g + ":" + this.f4109h;
        }
        String str2 = str;
        this.f4102a.m10552a();
        synchronized (s5l0.class) {
            ArrayList arrayListM = Lists.m(new String[]{"ffmpeg", "-probesize", "32M", "-analyzeduration", "10000000", "-ss", ddj0.m8989g(i), "-i", this.f4102a.f4050a, "-vf", str2, "-frames:v", GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "-y", absolutePath});
            String[] strArr = new String[arrayListM.size()];
            arrayListM.toArray(strArr);
            arrayListM.toString();
            TTFFmpegCommand.m1001a(strArr);
        }
        return absolutePath;
    }

    /* JADX INFO: renamed from: e */
    public String m10615e(int i) {
        if (this.f4104c) {
            return m10616f();
        }
        if (i <= 0) {
            i = 0;
        }
        return m10614c(i);
    }

    /* JADX INFO: renamed from: f */
    public String m10616f() {
        return m10614c((int) ((((this.f4102a.f4051b * 1.0f) / 1000.0f) * (f4101o.nextInt(4) + 1)) / 5.0f));
    }

    /* JADX INFO: renamed from: h */
    public int m10617h() {
        return this.f4112k;
    }

    /* JADX INFO: renamed from: i */
    public final void m10618i(int i, int i2) {
        int iMin = Math.min(i, i2);
        boolean z = this.f4104c;
        if (z) {
            this.f4106e = iMin;
            this.f4107f = iMin;
        } else {
            this.f4106e = i;
            this.f4107f = i2;
        }
        float f = i;
        if (f <= 960.0f && i2 <= 960.0f) {
            if (z) {
                this.f4108g = iMin;
                this.f4109h = iMin;
                return;
            }
            return;
        }
        if (!z) {
            float f2 = f / i2;
            if (i > i2) {
                this.f4108g = 960;
                this.f4109h = (int) (960.0f / f2);
                return;
            } else {
                this.f4108g = (int) (f2 * 960.0f);
                this.f4109h = 960;
                return;
            }
        }
        this.f4108g = 960;
        this.f4109h = 960;
        if (i > i2) {
            this.f4110i = (i - i2) / 2;
            this.f4111j = 0;
        } else {
            this.f4110i = 0;
            this.f4111j = (i2 - i) / 2;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m10619j() {
        r5l0 r5l0Var = this.f4102a;
        int i = r5l0Var.f4055f;
        if (i == 90 || i == 270) {
            ds5 ds5Var = this.f4114m;
            ds5Var.f2588a = r5l0Var.f4053d;
            ds5Var.f2589b = r5l0Var.f4052c;
        } else {
            ds5 ds5Var2 = this.f4114m;
            ds5Var2.f2588a = r5l0Var.f4052c;
            ds5Var2.f2589b = r5l0Var.f4053d;
        }
        boolean z = this.f4104c;
        ds5 ds5Var3 = this.f4114m;
        if (z) {
            int iMin = Math.min(ds5Var3.f2588a, ds5Var3.f2589b);
            es5 es5Var = this.f4113l;
            int iMin2 = Math.min(iMin, 720);
            es5Var.f2635e = iMin2;
            es5Var.f2634d = iMin2;
            es5 es5Var2 = this.f4113l;
            es5Var2.f2637g = iMin;
            es5Var2.f2636f = iMin;
            ds5 ds5Var4 = this.f4114m;
            int i2 = ds5Var4.f2588a;
            int i3 = ds5Var4.f2589b;
            if (i2 > i3) {
                es5Var2.f2640j = (i2 - i3) / 2;
                es5Var2.f2641k = 0;
            } else {
                es5Var2.f2640j = 0;
                es5Var2.f2641k = (i3 - i2) / 2;
            }
        } else {
            int i4 = ds5Var3.f2588a;
            int i5 = ds5Var3.f2589b;
            float f = i4 / i5;
            es5 es5Var3 = this.f4113l;
            es5Var3.f2636f = i4;
            es5Var3.f2637g = i5;
            if (i == 90 || i == 270) {
                es5Var3.f2634d = (Math.min(r5l0Var.f4053d, 720) / 8) * 8;
                es5 es5Var4 = this.f4113l;
                es5Var4.f2635e = ((int) ((es5Var4.f2634d / f) / 8.0f)) * 8;
            } else if (f > 1.0f) {
                es5Var3.f2634d = (Math.min(r5l0Var.f4052c, 1280) / 8) * 8;
                es5 es5Var5 = this.f4113l;
                es5Var5.f2635e = ((int) ((es5Var5.f2634d / f) / 8.0f)) * 8;
            } else {
                es5Var3.f2635e = (Math.min(r5l0Var.f4053d, 1280) / 8) * 8;
                es5 es5Var6 = this.f4113l;
                es5Var6.f2634d = ((int) ((es5Var6.f2635e * f) / 8.0f)) * 8;
            }
        }
        this.f4113l.f2642l = this.f4104c;
        if (Math.abs(this.f4102a.f4058i - 52428800) < 5000000) {
            this.f4113l.f2632b = 3000000;
        } else {
            r5l0 r5l0Var2 = this.f4102a;
            if (r5l0Var2.f4058i > 52428800) {
                this.f4113l.f2632b = 3000000;
            } else if (Math.abs(r5l0Var2.f4057h - 5000000) < 200000) {
                this.f4113l.f2632b = 5000000;
            } else {
                int i6 = this.f4102a.f4057h;
                es5 es5Var7 = this.f4113l;
                if (i6 > 5000000) {
                    es5Var7.f2632b = 5000000;
                } else {
                    es5Var7.f2632b = i6;
                }
            }
        }
        ds5 ds5Var5 = this.f4114m;
        m10618i(ds5Var5.f2588a, ds5Var5.f2589b);
        this.f4113l.toString();
    }

    /* JADX INFO: renamed from: k */
    public int[] m10620k() {
        return new int[]{this.f4106e, this.f4107f};
    }

    /* JADX INFO: renamed from: l */
    public final int[] m10621l() {
        es5 es5Var = this.f4113l;
        return new int[]{es5Var.f2634d, es5Var.f2635e};
    }

    /* JADX INFO: renamed from: m */
    public int[] m10622m() {
        return m10621l();
    }

    /* JADX INFO: renamed from: n */
    public int[] m10623n() {
        return m10621l();
    }
}
