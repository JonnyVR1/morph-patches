package p002l;

import com.immomo.momomediaext.utils.MMLiveMediaConfig;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0303b;
import com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.p1.mobile.putong.live.base.data.BLiveEncode;
import com.p1.mobile.putong.live.base.data.BLiveVideoQuality;
import com.p1.mobile.putong.live.base.data.BLiveVideoQualityConf;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import l.d30;
import l.e51;
import l.gkh0;
import l.o2f;
import l.rhi;
import l.w8u;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class yn40 extends C0303b {

    /* JADX INFO: renamed from: h */
    public final zn40 f22982h;

    /* JADX INFO: renamed from: i */
    public MMLiveMediaConfig f22983i;

    /* JADX INFO: renamed from: l.yn40$a */
    public static class RunnableC0923a implements Runnable {

        /* JADX INFO: renamed from: a */
        public WeakReference<hw00> f22984a;

        public RunnableC0923a(hw00 hw00Var) {
            this.f22984a = new WeakReference<>(hw00Var);
        }

        @Override // java.lang.Runnable
        public void run() {
            hw00 hw00Var;
            WeakReference<hw00> weakReference = this.f22984a;
            if (weakReference == null || (hw00Var = weakReference.get()) == null) {
                return;
            }
            hw00Var.m14879l1(yn40.m26819v1());
        }
    }

    public yn40(zn40 zn40Var) {
        super(zn40Var);
        this.f22982h = zn40Var;
    }

    /* JADX INFO: renamed from: p1 */
    public static /* synthetic */ void m26814p1(int[] iArr) {
        iArr[0] = 540;
        iArr[1] = 960;
    }

    /* JADX INFO: renamed from: r1 */
    public static /* synthetic */ void m26816r1(int[] iArr) {
        iArr[0] = 480;
        iArr[1] = 640;
    }

    /* JADX INFO: renamed from: t1 */
    public static C0303b m26818t1(MotionParams motionParams) {
        return new yn40((zn40) motionParams);
    }

    /* JADX INFO: renamed from: v1 */
    public static String m26819v1() {
        StringBuilder sb = new StringBuilder();
        sb.append(ypv.e.getFilesDir().getAbsolutePath());
        sb.append(File.separator);
        sb.append(w8u.B() ? "watermark.png" : "watermark_en.png");
        return sb.toString();
    }

    /* JADX INFO: renamed from: y1 */
    private void m26820y1() {
        this.f3840e.f17745d.m14869b1();
        this.f3840e.f17745d.m14881n1();
        this.f22983i = null;
    }

    /* JADX INFO: renamed from: S */
    public void m26821S(MMLiveRoomParams.MMLivePushType mMLivePushType, int i, int i2) {
        super.S(mMLivePushType, i, i2);
        if (i == o2f.b()) {
            m26820y1();
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0303b
    /* JADX INFO: renamed from: X0 */
    public void mo5273X0() {
        super.mo5273X0();
        m5274Y0();
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0303b
    /* JADX INFO: renamed from: g1 */
    public void mo5282g1() {
        super.mo5282g1();
        this.f3840e.f17745d.m14881n1();
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C0303b
    /* JADX INFO: renamed from: o1 */
    public int mo5290o1() {
        super.mo5290o1();
        this.f3840e.f17749h.m14892d(new mo40());
        m26824x1();
        this.f3840e.f17745d.m14876i1(m5272W0());
        zn40 zn40Var = this.f22982h;
        MMLiveMediaConfig mMLiveMediaConfigM26822u1 = m26822u1(zn40Var.f23517l, zn40Var.f23516k, zn40Var.f23515j);
        this.f22983i = mMLiveMediaConfigM26822u1;
        return this.f3840e.f17745d.m14880m1(mMLiveMediaConfigM26822u1);
    }

    /* JADX INFO: renamed from: u1 */
    public final MMLiveMediaConfig m26822u1(String str, String str2, BLiveVideoQualityConf bLiveVideoQualityConf) {
        int i;
        int i2;
        int i3;
        MMLiveMediaConfig mMLiveMediaConfig = new MMLiveMediaConfig();
        mMLiveMediaConfig.audioChannels = 2;
        mMLiveMediaConfig.audioSampleRate = 44100;
        mMLiveMediaConfig.audioBitrate = 64000;
        final int[] iArr = {540, 960};
        cu00.m11349a(new d30() { // from class: l.vn40
            public final void call() {
                yn40.m26814p1(iArr);
            }
        }, new d30() { // from class: l.wn40
            public final void call() {
                yn40.m26816r1(iArr);
            }
        });
        mMLiveMediaConfig.url = str;
        mMLiveMediaConfig.ipv6Url = str2;
        if (NullChecker.a(bLiveVideoQualityConf) && bLiveVideoQualityConf.encode.isValid()) {
            BLiveEncode bLiveEncode = bLiveVideoQualityConf.encode;
            i = bLiveEncode.fps;
            i2 = bLiveEncode.bitRate;
            iArr[0] = bLiveEncode.width;
            iArr[1] = bLiveEncode.heigth;
            i3 = bLiveVideoQualityConf.videoCodecType;
        } else {
            BLiveVideoQuality bLiveVideoQualityM22650a1 = this.f3840e.f17744c.m22650a1();
            if (bLiveVideoQualityM22650a1 == null || !bLiveVideoQualityM22650a1.isValid()) {
                i = 20;
                i2 = 1200000;
                i3 = 0;
            } else {
                i = bLiveVideoQualityM22650a1.pushFps;
                i2 = bLiveVideoQualityM22650a1.pushBitrate;
                iArr[0] = bLiveVideoQualityM22650a1.pushWidth;
                iArr[1] = bLiveVideoQualityM22650a1.pushHeight;
                i3 = bLiveVideoQualityM22650a1.videoCodecType;
            }
        }
        mMLiveMediaConfig.encodeWidth = iArr[0];
        mMLiveMediaConfig.encodeHeight = iArr[1];
        mMLiveMediaConfig.videoFPS = i;
        mMLiveMediaConfig.videoBitRate = i2;
        mMLiveMediaConfig.videoCodecType = i3;
        gkh0.j("[live]sdk_engine", "pushUrl:" + str + "pushUrlIpv6:" + str2 + "encodeSize:" + Arrays.toString(iArr) + " fps:" + i + " bitrate:" + i2);
        mMLiveMediaConfig.businessType = Integer.parseInt(this.f22982h.f3829c);
        mMLiveMediaConfig.cdnType = Integer.parseInt(this.f22982h.f3828b);
        return mMLiveMediaConfig;
    }

    /* JADX INFO: renamed from: w1 */
    public final /* synthetic */ void m26823w1(File file) {
        if (rhi.d(ypv.e, w8u.B() ? "watermark.png" : "watermark_en.png", file)) {
            e51.M(new RunnableC0923a(this.f3840e.f17745d));
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m26824x1() {
        final File file = new File(m26819v1());
        if (file.exists()) {
            this.f3840e.f17745d.m14879l1(file.getAbsolutePath());
        } else {
            e51.y(new Runnable() { // from class: l.xn40
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22361a.m26823w1(file);
                }
            });
        }
    }
}
