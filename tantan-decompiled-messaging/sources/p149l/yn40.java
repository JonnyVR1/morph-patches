package p149l;

import com.immomo.momomediaext.utils.MMLiveMediaConfig;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.p046p1.mobile.putong.live.base.data.BLiveEncode;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoQuality;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoQualityConf;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b;
import com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.liteav.audio.TXEAudioDef;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class yn40 extends C12714b {

    /* JADX INFO: renamed from: h */
    public final zn40 f199142h;

    /* JADX INFO: renamed from: i */
    public MMLiveMediaConfig f199143i;

    /* JADX INFO: renamed from: l.yn40$a */
    public static class RunnableC21446a implements Runnable {

        /* JADX INFO: renamed from: a */
        public WeakReference<hw00> f199144a;

        public RunnableC21446a(hw00 hw00Var) {
            this.f199144a = new WeakReference<>(hw00Var);
        }

        @Override // java.lang.Runnable
        public void run() {
            hw00 hw00Var;
            WeakReference<hw00> weakReference = this.f199144a;
            if (weakReference == null || (hw00Var = weakReference.get()) == null) {
                return;
            }
            hw00Var.m133228l1(yn40.m215394v1());
        }
    }

    public yn40(zn40 zn40Var) {
        super(zn40Var);
        this.f199142h = zn40Var;
    }

    /* JADX INFO: renamed from: p1 */
    public static /* synthetic */ void m215389p1(int[] iArr) {
        iArr[0] = 540;
        iArr[1] = 960;
    }

    /* JADX INFO: renamed from: r1 */
    public static /* synthetic */ void m215391r1(int[] iArr) {
        iArr[0] = 480;
        iArr[1] = 640;
    }

    /* JADX INFO: renamed from: t1 */
    public static C12714b m215393t1(MotionParams motionParams) {
        return new yn40((zn40) motionParams);
    }

    /* JADX INFO: renamed from: v1 */
    public static String m215394v1() {
        StringBuilder sb = new StringBuilder();
        sb.append(ypv.f199497e.getFilesDir().getAbsolutePath());
        sb.append(File.separator);
        sb.append(w8u.m202204B() ? "watermark.png" : "watermark_en.png");
        return sb.toString();
    }

    /* JADX INFO: renamed from: y1 */
    private void m215395y1() {
        this.f47798e.f152052d.m133218b1();
        this.f47798e.f152052d.m133230n1();
        this.f199143i = null;
    }

    @Override // p149l.d8s, p149l.g4m
    /* JADX INFO: renamed from: S */
    public void mo110350S(MMLiveRoomParams.MMLivePushType mMLivePushType, int i, int i2) {
        super.mo110350S(mMLivePushType, i, i2);
        if (i == o2f.m162294b()) {
            m215395y1();
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b
    /* JADX INFO: renamed from: X0 */
    public void mo71895X0() {
        super.mo71895X0();
        m71896Y0();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b
    /* JADX INFO: renamed from: g1 */
    public void mo71903g1() {
        super.mo71903g1();
        this.f47798e.f152052d.m133230n1();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12714b
    /* JADX INFO: renamed from: o1 */
    public int mo71911o1() {
        super.mo71911o1();
        this.f47798e.f152056h.m133285d(new mo40());
        m215398x1();
        this.f47798e.f152052d.m133225i1(m71894W0());
        zn40 zn40Var = this.f199142h;
        MMLiveMediaConfig mMLiveMediaConfigM215396u1 = m215396u1(zn40Var.f203960l, zn40Var.f203959k, zn40Var.f203958j);
        this.f199143i = mMLiveMediaConfigM215396u1;
        return this.f47798e.f152052d.m133229m1(mMLiveMediaConfigM215396u1);
    }

    /* JADX INFO: renamed from: u1 */
    public final MMLiveMediaConfig m215396u1(String str, String str2, BLiveVideoQualityConf bLiveVideoQualityConf) {
        int i;
        int i2;
        int i3;
        MMLiveMediaConfig mMLiveMediaConfig = new MMLiveMediaConfig();
        mMLiveMediaConfig.audioChannels = 2;
        mMLiveMediaConfig.audioSampleRate = 44100;
        mMLiveMediaConfig.audioBitrate = 64000;
        final int[] iArr = {540, TXEAudioDef.TXE_OPUS_SAMPLE_NUM};
        cu00.m108718a(new d30() { // from class: l.vn40
            @Override // p149l.d30
            public final void call() {
                yn40.m215389p1(iArr);
            }
        }, new d30() { // from class: l.wn40
            @Override // p149l.d30
            public final void call() {
                yn40.m215391r1(iArr);
            }
        });
        mMLiveMediaConfig.url = str;
        mMLiveMediaConfig.ipv6Url = str2;
        if (NullChecker.m81303a(bLiveVideoQualityConf) && bLiveVideoQualityConf.encode.isValid()) {
            BLiveEncode bLiveEncode = bLiveVideoQualityConf.encode;
            i = bLiveEncode.fps;
            i2 = bLiveEncode.bitRate;
            iArr[0] = bLiveEncode.width;
            iArr[1] = bLiveEncode.heigth;
            i3 = bLiveVideoQualityConf.videoCodecType;
        } else {
            BLiveVideoQuality bLiveVideoQualityM185820a1 = this.f47798e.f152051c.m185820a1();
            if (bLiveVideoQualityM185820a1 == null || !bLiveVideoQualityM185820a1.isValid()) {
                i = 20;
                i2 = 1200000;
                i3 = 0;
            } else {
                i = bLiveVideoQualityM185820a1.pushFps;
                i2 = bLiveVideoQualityM185820a1.pushBitrate;
                iArr[0] = bLiveVideoQualityM185820a1.pushWidth;
                iArr[1] = bLiveVideoQualityM185820a1.pushHeight;
                i3 = bLiveVideoQualityM185820a1.videoCodecType;
            }
        }
        mMLiveMediaConfig.encodeWidth = iArr[0];
        mMLiveMediaConfig.encodeHeight = iArr[1];
        mMLiveMediaConfig.videoFPS = i;
        mMLiveMediaConfig.videoBitRate = i2;
        mMLiveMediaConfig.videoCodecType = i3;
        gkh0.m126627j("[live]sdk_engine", "pushUrl:" + str + "pushUrlIpv6:" + str2 + "encodeSize:" + Arrays.toString(iArr) + " fps:" + i + " bitrate:" + i2);
        mMLiveMediaConfig.businessType = Integer.parseInt(this.f199142h.f47787c);
        mMLiveMediaConfig.cdnType = Integer.parseInt(this.f199142h.f47786b);
        return mMLiveMediaConfig;
    }

    /* JADX INFO: renamed from: w1 */
    public final /* synthetic */ void m215397w1(File file) {
        if (rhi.m179360d(ypv.f199497e, w8u.m202204B() ? "watermark.png" : "watermark_en.png", file)) {
            e51.m114748M(new RunnableC21446a(this.f47798e.f152052d));
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m215398x1() {
        final File file = new File(m215394v1());
        if (file.exists()) {
            this.f47798e.f152052d.m133228l1(file.getAbsolutePath());
        } else {
            e51.m114774y(new Runnable() { // from class: l.xn40
                @Override // java.lang.Runnable
                public final void run() {
                    this.f193639a.m215397w1(file);
                }
            });
        }
    }
}
