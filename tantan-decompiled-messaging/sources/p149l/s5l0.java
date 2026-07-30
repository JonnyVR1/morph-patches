package p149l;

import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.os.Build;
import android.util.Size;
import androidx.annotation.Nullable;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.google.android.gms.common.util.GmsVersion;
import com.google.common.collect.Lists;
import com.p046p1.mobile.android.media.TTFFmpegCommand;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.liteav.audio.TXEAudioDef;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;

/* JADX INFO: loaded from: classes8.dex */
public final class s5l0 {

    /* JADX INFO: renamed from: o */
    public static Random f162559o = new Random();

    /* JADX INFO: renamed from: a */
    public final r5l0 f162560a;

    /* JADX INFO: renamed from: b */
    public final long f162561b;

    /* JADX INFO: renamed from: c */
    public final boolean f162562c;

    /* JADX INFO: renamed from: d */
    public uy00 f162563d;

    /* JADX INFO: renamed from: e */
    public int f162564e;

    /* JADX INFO: renamed from: f */
    public int f162565f;

    /* JADX INFO: renamed from: g */
    public int f162566g;

    /* JADX INFO: renamed from: h */
    public int f162567h;

    /* JADX INFO: renamed from: i */
    public int f162568i;

    /* JADX INFO: renamed from: j */
    public int f162569j;

    /* JADX INFO: renamed from: k */
    public int f162570k = -1;

    /* JADX INFO: renamed from: l */
    public es5 f162571l = new es5();

    /* JADX INFO: renamed from: m */
    public ds5 f162572m = new ds5();

    /* JADX INFO: renamed from: n */
    public nmd f162573n = new nmd();

    public s5l0(r5l0 r5l0Var, boolean z, boolean z2) {
        this.f162563d = new uy00(r5l0Var.f157830a);
        this.f162560a = r5l0Var;
        this.f162561b = r5l0Var.f157831b;
        this.f162562c = z;
        m182361j();
    }

    /* JADX INFO: renamed from: d */
    public static String m182352d(String str, String str2, int i) {
        synchronized (s5l0.class) {
            ArrayList arrayListM15926m = Lists.m15926m("ffmpeg", "-probesize", "32M", "-analyzeduration", "10000000", "-ss", ddj0.m111026g(i), "-i", str2, "-frames:v", "1", "-y", str);
            String[] strArr = new String[arrayListM15926m.size()];
            arrayListM15926m.toArray(strArr);
            arrayListM15926m.toString();
            TTFFmpegCommand.m20730a(strArr);
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
    public static File m182353g(String str, int i, int i2, String str2) throws IOException {
        FileOutputStream fileOutputStream;
        ?? r2 = 0;
        Bitmap bitmapCreateVideoThumbnail = Build.VERSION.SDK_INT >= 29 ? ThumbnailUtils.createVideoThumbnail(new File(rhi.m179382z(str)), new Size(i, i2), null) : ThumbnailUtils.createVideoThumbnail(rhi.m179382z(str), 1);
        if (!NullChecker.m81303a(bitmapCreateVideoThumbnail)) {
            return null;
        }
        File file = new File(str2);
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    bitmapCreateVideoThumbnail.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                    fileOutputStream.flush();
                    t95.m187604b(fileOutputStream);
                    return file;
                } catch (IOException e) {
                    e = e;
                    CrashHelper.m81296c(e);
                    t95.m187604b(fileOutputStream);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                r2 = i2;
                t95.m187604b(r2);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            t95.m187604b(r2);
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public String m182354a() {
        return m182355b(-1L, -1L);
    }

    /* JADX INFO: renamed from: b */
    public String m182355b(long j, long j2) {
        int i;
        es5 es5Var = this.f162571l;
        int i2 = es5Var.f92983d;
        if ((i2 == -1 || this.f162560a.f157832c <= i2) && ((i = es5Var.f92984e) == -1 || this.f162560a.f157833d <= i)) {
            r5l0 r5l0Var = this.f162560a;
            if (r5l0Var.f157835f == 0 && DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4.equals(r5l0Var.f157834e) && j2 == -1) {
                return this.f162560a.f157830a;
            }
        }
        synchronized (s5l0.class) {
            try {
                String absolutePath = k9j.m145083O("mp4").getAbsolutePath();
                es5 es5Var2 = this.f162571l;
                if (j <= 0) {
                    j = -1;
                }
                es5Var2.f92987h = j;
                if (j2 <= 0) {
                    j2 = -1;
                }
                es5Var2.f92988i = j2;
                boolean zM167259d = false;
                if (kb5.m145210f()) {
                    zM167259d = p3l0.m167256c().m167264i(this.f162560a.f157830a).m167263h(this.f162572m).m167262g(absolutePath).m167265j(this.f162571l).m167260e(this.f162573n).m167261f(false).m167259d();
                    this.f162570k = zM167259d ? -3 : -2;
                }
                if (zM167259d) {
                    return absolutePath;
                }
                p3l0.m167256c().m167264i(this.f162560a.f157830a).m167263h(this.f162572m).m167262g(absolutePath).m167265j(this.f162571l).m167260e(this.f162573n).m167261f(true).m167259d();
                return absolutePath;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public String m182356c(int i) {
        String absolutePath = k9j.m145083O("jpg").getAbsolutePath();
        String str = "crop=" + this.f162564e + ":" + this.f162565f + ":" + this.f162568i + ":" + this.f162569j;
        if (this.f162564e != this.f162566g || this.f162565f != this.f162567h) {
            str = str + ",scale=" + this.f162566g + ":" + this.f162567h;
        }
        String str2 = str;
        this.f162560a.m177946a();
        synchronized (s5l0.class) {
            ArrayList arrayListM15926m = Lists.m15926m("ffmpeg", "-probesize", "32M", "-analyzeduration", "10000000", "-ss", ddj0.m111026g(i), "-i", this.f162560a.f157830a, "-vf", str2, "-frames:v", "1", "-y", absolutePath);
            String[] strArr = new String[arrayListM15926m.size()];
            arrayListM15926m.toArray(strArr);
            arrayListM15926m.toString();
            TTFFmpegCommand.m20730a(strArr);
        }
        return absolutePath;
    }

    /* JADX INFO: renamed from: e */
    public String m182357e(int i) {
        if (this.f162562c) {
            return m182358f();
        }
        if (i <= 0) {
            i = 0;
        }
        return m182356c(i);
    }

    /* JADX INFO: renamed from: f */
    public String m182358f() {
        return m182356c((int) ((((this.f162560a.f157831b * 1.0f) / 1000.0f) * (f162559o.nextInt(4) + 1)) / 5.0f));
    }

    /* JADX INFO: renamed from: h */
    public int m182359h() {
        return this.f162570k;
    }

    /* JADX INFO: renamed from: i */
    public final void m182360i(int i, int i2) {
        int iMin = Math.min(i, i2);
        boolean z = this.f162562c;
        if (z) {
            this.f162564e = iMin;
            this.f162565f = iMin;
        } else {
            this.f162564e = i;
            this.f162565f = i2;
        }
        float f = i;
        if (f <= 960.0f && i2 <= 960.0f) {
            if (z) {
                this.f162566g = iMin;
                this.f162567h = iMin;
                return;
            }
            return;
        }
        if (!z) {
            float f2 = f / i2;
            if (i > i2) {
                this.f162566g = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
                this.f162567h = (int) (960.0f / f2);
                return;
            } else {
                this.f162566g = (int) (f2 * 960.0f);
                this.f162567h = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
                return;
            }
        }
        this.f162566g = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
        this.f162567h = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
        if (i > i2) {
            this.f162568i = (i - i2) / 2;
            this.f162569j = 0;
        } else {
            this.f162568i = 0;
            this.f162569j = (i2 - i) / 2;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m182361j() {
        r5l0 r5l0Var = this.f162560a;
        int i = r5l0Var.f157835f;
        if (i == 90 || i == 270) {
            ds5 ds5Var = this.f162572m;
            ds5Var.f87720a = r5l0Var.f157833d;
            ds5Var.f87721b = r5l0Var.f157832c;
        } else {
            ds5 ds5Var2 = this.f162572m;
            ds5Var2.f87720a = r5l0Var.f157832c;
            ds5Var2.f87721b = r5l0Var.f157833d;
        }
        boolean z = this.f162562c;
        ds5 ds5Var3 = this.f162572m;
        if (z) {
            int iMin = Math.min(ds5Var3.f87720a, ds5Var3.f87721b);
            es5 es5Var = this.f162571l;
            int iMin2 = Math.min(iMin, 720);
            es5Var.f92984e = iMin2;
            es5Var.f92983d = iMin2;
            es5 es5Var2 = this.f162571l;
            es5Var2.f92986g = iMin;
            es5Var2.f92985f = iMin;
            ds5 ds5Var4 = this.f162572m;
            int i2 = ds5Var4.f87720a;
            int i3 = ds5Var4.f87721b;
            if (i2 > i3) {
                es5Var2.f92989j = (i2 - i3) / 2;
                es5Var2.f92990k = 0;
            } else {
                es5Var2.f92989j = 0;
                es5Var2.f92990k = (i3 - i2) / 2;
            }
        } else {
            int i4 = ds5Var3.f87720a;
            int i5 = ds5Var3.f87721b;
            float f = i4 / i5;
            es5 es5Var3 = this.f162571l;
            es5Var3.f92985f = i4;
            es5Var3.f92986g = i5;
            if (i == 90 || i == 270) {
                es5Var3.f92983d = (Math.min(r5l0Var.f157833d, 720) / 8) * 8;
                es5 es5Var4 = this.f162571l;
                es5Var4.f92984e = ((int) ((es5Var4.f92983d / f) / 8.0f)) * 8;
            } else if (f > 1.0f) {
                es5Var3.f92983d = (Math.min(r5l0Var.f157832c, EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK) / 8) * 8;
                es5 es5Var5 = this.f162571l;
                es5Var5.f92984e = ((int) ((es5Var5.f92983d / f) / 8.0f)) * 8;
            } else {
                es5Var3.f92984e = (Math.min(r5l0Var.f157833d, EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK) / 8) * 8;
                es5 es5Var6 = this.f162571l;
                es5Var6.f92983d = ((int) ((es5Var6.f92984e * f) / 8.0f)) * 8;
            }
        }
        this.f162571l.f92991l = this.f162562c;
        if (Math.abs(this.f162560a.f157838i - 52428800) < 5000000) {
            this.f162571l.f92981b = 3000000;
        } else {
            r5l0 r5l0Var2 = this.f162560a;
            if (r5l0Var2.f157838i > 52428800) {
                this.f162571l.f92981b = 3000000;
            } else if (Math.abs(r5l0Var2.f157837h - GmsVersion.VERSION_LONGHORN) < 200000) {
                this.f162571l.f92981b = GmsVersion.VERSION_LONGHORN;
            } else {
                int i6 = this.f162560a.f157837h;
                es5 es5Var7 = this.f162571l;
                if (i6 > 5000000) {
                    es5Var7.f92981b = GmsVersion.VERSION_LONGHORN;
                } else {
                    es5Var7.f92981b = i6;
                }
            }
        }
        ds5 ds5Var5 = this.f162572m;
        m182360i(ds5Var5.f87720a, ds5Var5.f87721b);
        this.f162571l.toString();
    }

    /* JADX INFO: renamed from: k */
    public int[] m182362k() {
        return new int[]{this.f162564e, this.f162565f};
    }

    /* JADX INFO: renamed from: l */
    public final int[] m182363l() {
        es5 es5Var = this.f162571l;
        return new int[]{es5Var.f92983d, es5Var.f92984e};
    }

    /* JADX INFO: renamed from: m */
    public int[] m182364m() {
        return m182363l();
    }

    /* JADX INFO: renamed from: n */
    public int[] m182365n() {
        return m182363l();
    }
}
