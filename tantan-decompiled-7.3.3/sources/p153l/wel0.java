package p153l;

import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.os.Build;
import android.util.Size;
import androidx.annotation.Nullable;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.google.android.gms.common.util.GmsVersion;
import com.google.common.collect.Lists;
import com.p051p1.mobile.android.media.TTFFmpegCommand;
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
public final class wel0 {

    /* JADX INFO: renamed from: o */
    public static Random f188700o = new Random();

    /* JADX INFO: renamed from: a */
    public final vel0 f188701a;

    /* JADX INFO: renamed from: b */
    public final long f188702b;

    /* JADX INFO: renamed from: c */
    public final boolean f188703c;

    /* JADX INFO: renamed from: d */
    public e710 f188704d;

    /* JADX INFO: renamed from: e */
    public int f188705e;

    /* JADX INFO: renamed from: f */
    public int f188706f;

    /* JADX INFO: renamed from: g */
    public int f188707g;

    /* JADX INFO: renamed from: h */
    public int f188708h;

    /* JADX INFO: renamed from: i */
    public int f188709i;

    /* JADX INFO: renamed from: j */
    public int f188710j;

    /* JADX INFO: renamed from: k */
    public int f188711k = -1;

    /* JADX INFO: renamed from: l */
    public it5 f188712l = new it5();

    /* JADX INFO: renamed from: m */
    public ht5 f188713m = new ht5();

    /* JADX INFO: renamed from: n */
    public tnd f188714n = new tnd();

    public wel0(vel0 vel0Var, boolean z, boolean z2) {
        this.f188704d = new e710(vel0Var.f183805a);
        this.f188701a = vel0Var;
        this.f188702b = vel0Var.f183806b;
        this.f188703c = z;
        m206018j();
    }

    /* JADX INFO: renamed from: d */
    public static String m206009d(String str, String str2, int i) {
        synchronized (wel0.class) {
            ArrayList arrayListM15980m = Lists.m15980m("ffmpeg", "-probesize", "32M", "-analyzeduration", "10000000", "-ss", hmj0.m135871g(i), "-i", str2, "-frames:v", "1", "-y", str);
            String[] strArr = new String[arrayListM15980m.size()];
            arrayListM15980m.toArray(strArr);
            arrayListM15980m.toString();
            TTFFmpegCommand.m21729a(strArr);
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
    public static File m206010g(String str, int i, int i2, String str2) throws IOException {
        FileOutputStream fileOutputStream;
        ?? r2 = 0;
        Bitmap bitmapCreateVideoThumbnail = Build.VERSION.SDK_INT >= 29 ? ThumbnailUtils.createVideoThumbnail(new File(oki.m168038z(str)), new Size(i, i2), null) : ThumbnailUtils.createVideoThumbnail(oki.m168038z(str), 1);
        if (!NullChecker.m82486a(bitmapCreateVideoThumbnail)) {
            return null;
        }
        File file = new File(str2);
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    bitmapCreateVideoThumbnail.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                    fileOutputStream.flush();
                    ua5.m195158b(fileOutputStream);
                    return file;
                } catch (IOException e) {
                    e = e;
                    CrashHelper.m82479c(e);
                    ua5.m195158b(fileOutputStream);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                r2 = i2;
                ua5.m195158b(r2);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            ua5.m195158b(r2);
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public String m206011a() {
        return m206012b(-1L, -1L);
    }

    /* JADX INFO: renamed from: b */
    public String m206012b(long j, long j2) {
        int i;
        it5 it5Var = this.f188712l;
        int i2 = it5Var.f116792d;
        if ((i2 == -1 || this.f188701a.f183807c <= i2) && ((i = it5Var.f116793e) == -1 || this.f188701a.f183808d <= i)) {
            vel0 vel0Var = this.f188701a;
            if (vel0Var.f183810f == 0 && DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4.equals(vel0Var.f183809e) && j2 == -1) {
                return this.f188701a.f183805a;
            }
        }
        synchronized (wel0.class) {
            try {
                String absolutePath = ecj.m120381O("mp4").getAbsolutePath();
                it5 it5Var2 = this.f188712l;
                if (j <= 0) {
                    j = -1;
                }
                it5Var2.f116796h = j;
                if (j2 <= 0) {
                    j2 = -1;
                }
                it5Var2.f116797i = j2;
                boolean zM195412d = false;
                if (kc5.m149101f()) {
                    zM195412d = ucl0.m195409c().m195417i(this.f188701a.f183805a).m195416h(this.f188713m).m195415g(absolutePath).m195418j(this.f188712l).m195413e(this.f188714n).m195414f(false).m195412d();
                    this.f188711k = zM195412d ? -3 : -2;
                }
                if (zM195412d) {
                    return absolutePath;
                }
                ucl0.m195409c().m195417i(this.f188701a.f183805a).m195416h(this.f188713m).m195415g(absolutePath).m195418j(this.f188712l).m195413e(this.f188714n).m195414f(true).m195412d();
                return absolutePath;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public String m206013c(int i) {
        String absolutePath = ecj.m120381O("jpg").getAbsolutePath();
        String str = "crop=" + this.f188705e + ":" + this.f188706f + ":" + this.f188709i + ":" + this.f188710j;
        if (this.f188705e != this.f188707g || this.f188706f != this.f188708h) {
            str = str + ",scale=" + this.f188707g + ":" + this.f188708h;
        }
        String str2 = str;
        this.f188701a.m201068a();
        synchronized (wel0.class) {
            ArrayList arrayListM15980m = Lists.m15980m("ffmpeg", "-probesize", "32M", "-analyzeduration", "10000000", "-ss", hmj0.m135871g(i), "-i", this.f188701a.f183805a, "-vf", str2, "-frames:v", "1", "-y", absolutePath);
            String[] strArr = new String[arrayListM15980m.size()];
            arrayListM15980m.toArray(strArr);
            arrayListM15980m.toString();
            TTFFmpegCommand.m21729a(strArr);
        }
        return absolutePath;
    }

    /* JADX INFO: renamed from: e */
    public String m206014e(int i) {
        if (this.f188703c) {
            return m206015f();
        }
        if (i <= 0) {
            i = 0;
        }
        return m206013c(i);
    }

    /* JADX INFO: renamed from: f */
    public String m206015f() {
        return m206013c((int) ((((this.f188701a.f183806b * 1.0f) / 1000.0f) * (f188700o.nextInt(4) + 1)) / 5.0f));
    }

    /* JADX INFO: renamed from: h */
    public int m206016h() {
        return this.f188711k;
    }

    /* JADX INFO: renamed from: i */
    public final void m206017i(int i, int i2) {
        int iMin = Math.min(i, i2);
        boolean z = this.f188703c;
        if (z) {
            this.f188705e = iMin;
            this.f188706f = iMin;
        } else {
            this.f188705e = i;
            this.f188706f = i2;
        }
        float f = i;
        if (f <= 960.0f && i2 <= 960.0f) {
            if (z) {
                this.f188707g = iMin;
                this.f188708h = iMin;
                return;
            }
            return;
        }
        if (!z) {
            float f2 = f / i2;
            if (i > i2) {
                this.f188707g = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
                this.f188708h = (int) (960.0f / f2);
                return;
            } else {
                this.f188707g = (int) (f2 * 960.0f);
                this.f188708h = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
                return;
            }
        }
        this.f188707g = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
        this.f188708h = TXEAudioDef.TXE_OPUS_SAMPLE_NUM;
        if (i > i2) {
            this.f188709i = (i - i2) / 2;
            this.f188710j = 0;
        } else {
            this.f188709i = 0;
            this.f188710j = (i2 - i) / 2;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m206018j() {
        vel0 vel0Var = this.f188701a;
        int i = vel0Var.f183810f;
        if (i == 90 || i == 270) {
            ht5 ht5Var = this.f188713m;
            ht5Var.f111507a = vel0Var.f183808d;
            ht5Var.f111508b = vel0Var.f183807c;
        } else {
            ht5 ht5Var2 = this.f188713m;
            ht5Var2.f111507a = vel0Var.f183807c;
            ht5Var2.f111508b = vel0Var.f183808d;
        }
        boolean z = this.f188703c;
        ht5 ht5Var3 = this.f188713m;
        if (z) {
            int iMin = Math.min(ht5Var3.f111507a, ht5Var3.f111508b);
            it5 it5Var = this.f188712l;
            int iMin2 = Math.min(iMin, 720);
            it5Var.f116793e = iMin2;
            it5Var.f116792d = iMin2;
            it5 it5Var2 = this.f188712l;
            it5Var2.f116795g = iMin;
            it5Var2.f116794f = iMin;
            ht5 ht5Var4 = this.f188713m;
            int i2 = ht5Var4.f111507a;
            int i3 = ht5Var4.f111508b;
            if (i2 > i3) {
                it5Var2.f116798j = (i2 - i3) / 2;
                it5Var2.f116799k = 0;
            } else {
                it5Var2.f116798j = 0;
                it5Var2.f116799k = (i3 - i2) / 2;
            }
        } else {
            int i4 = ht5Var3.f111507a;
            int i5 = ht5Var3.f111508b;
            float f = i4 / i5;
            it5 it5Var3 = this.f188712l;
            it5Var3.f116794f = i4;
            it5Var3.f116795g = i5;
            if (i == 90 || i == 270) {
                it5Var3.f116792d = (Math.min(vel0Var.f183808d, 720) / 8) * 8;
                it5 it5Var4 = this.f188712l;
                it5Var4.f116793e = ((int) ((it5Var4.f116792d / f) / 8.0f)) * 8;
            } else if (f > 1.0f) {
                it5Var3.f116792d = (Math.min(vel0Var.f183807c, EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK) / 8) * 8;
                it5 it5Var5 = this.f188712l;
                it5Var5.f116793e = ((int) ((it5Var5.f116792d / f) / 8.0f)) * 8;
            } else {
                it5Var3.f116793e = (Math.min(vel0Var.f183808d, EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK) / 8) * 8;
                it5 it5Var6 = this.f188712l;
                it5Var6.f116792d = ((int) ((it5Var6.f116793e * f) / 8.0f)) * 8;
            }
        }
        this.f188712l.f116800l = this.f188703c;
        if (Math.abs(this.f188701a.f183813i - 52428800) < 5000000) {
            this.f188712l.f116790b = 3000000;
        } else {
            vel0 vel0Var2 = this.f188701a;
            if (vel0Var2.f183813i > 52428800) {
                this.f188712l.f116790b = 3000000;
            } else if (Math.abs(vel0Var2.f183812h - GmsVersion.VERSION_LONGHORN) < 200000) {
                this.f188712l.f116790b = GmsVersion.VERSION_LONGHORN;
            } else {
                int i6 = this.f188701a.f183812h;
                it5 it5Var7 = this.f188712l;
                if (i6 > 5000000) {
                    it5Var7.f116790b = GmsVersion.VERSION_LONGHORN;
                } else {
                    it5Var7.f116790b = i6;
                }
            }
        }
        ht5 ht5Var5 = this.f188713m;
        m206017i(ht5Var5.f111507a, ht5Var5.f111508b);
        this.f188712l.toString();
    }

    /* JADX INFO: renamed from: k */
    public int[] m206019k() {
        return new int[]{this.f188705e, this.f188706f};
    }

    /* JADX INFO: renamed from: l */
    public final int[] m206020l() {
        it5 it5Var = this.f188712l;
        return new int[]{it5Var.f116792d, it5Var.f116793e};
    }

    /* JADX INFO: renamed from: m */
    public int[] m206021m() {
        return m206020l();
    }

    /* JADX INFO: renamed from: n */
    public int[] m206022n() {
        return m206020l();
    }
}
