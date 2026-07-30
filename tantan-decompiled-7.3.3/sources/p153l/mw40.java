package p153l;

import com.immomo.momomediaext.utils.MMLiveMediaConfig;
import com.immomo.momomediaext.utils.MMLiveRoomParams;
import com.p051p1.mobile.putong.live.base.data.BLiveEncode;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoQuality;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoQualityConf;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b;
import com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.MotionParams;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.liteav.audio.TXEAudioDef;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class mw40 extends C12877b {

    /* JADX INFO: renamed from: h */
    public final nw40 f139022h;

    /* JADX INFO: renamed from: i */
    public MMLiveMediaConfig f139023i;

    /* JADX INFO: renamed from: l.mw40$a */
    public static class RunnableC18718a implements Runnable {

        /* JADX INFO: renamed from: a */
        public WeakReference<p410> f139024a;

        public RunnableC18718a(p410 p410Var) {
            this.f139024a = new WeakReference<>(p410Var);
        }

        @Override // java.lang.Runnable
        public void run() {
            p410 p410Var;
            WeakReference<p410> weakReference = this.f139024a;
            if (weakReference == null || (p410Var = weakReference.get()) == null) {
                return;
            }
            p410Var.m170534l1(mw40.m160458v1());
        }
    }

    public mw40(nw40 nw40Var) {
        super(nw40Var);
        this.f139022h = nw40Var;
    }

    /* JADX INFO: renamed from: p1 */
    public static /* synthetic */ void m160453p1(int[] iArr) {
        iArr[0] = 540;
        iArr[1] = 960;
    }

    /* JADX INFO: renamed from: r1 */
    public static /* synthetic */ void m160455r1(int[] iArr) {
        iArr[0] = 480;
        iArr[1] = 640;
    }

    /* JADX INFO: renamed from: t1 */
    public static C12877b m160457t1(MotionParams motionParams) {
        return new mw40((nw40) motionParams);
    }

    /* JADX INFO: renamed from: v1 */
    public static String m160458v1() {
        StringBuilder sb = new StringBuilder();
        sb.append(zrv.f205803e.getFilesDir().getAbsolutePath());
        sb.append(File.separator);
        sb.append(xau.m209897B() ? "watermark.png" : "watermark_en.png");
        return sb.toString();
    }

    /* JADX INFO: renamed from: y1 */
    private void m160459y1() {
        this.f48646e.f176995d.m170522b1();
        this.f48646e.f176995d.m170537n1();
        this.f139023i = null;
    }

    @Override // p153l.eas, p153l.w6m
    /* JADX INFO: renamed from: S */
    public void mo96683S(MMLiveRoomParams.MMLivePushType mMLivePushType, int i, int i2) {
        super.mo96683S(mMLivePushType, i, i2);
        if (i == t3f.m189084b()) {
            m160459y1();
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b
    /* JADX INFO: renamed from: X0 */
    public void mo73078X0() {
        super.mo73078X0();
        m73079Y0();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b
    /* JADX INFO: renamed from: g1 */
    public void mo73086g1() {
        super.mo73086g1();
        this.f48646e.f176995d.m170537n1();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.sdk.motion.base.C12877b
    /* JADX INFO: renamed from: o1 */
    public int mo73094o1() {
        super.mo73094o1();
        this.f48646e.f176999h.m179837d(new ax40());
        m160462x1();
        this.f48646e.f176995d.m170531i1(m73077W0());
        nw40 nw40Var = this.f139022h;
        MMLiveMediaConfig mMLiveMediaConfigM160460u1 = m160460u1(nw40Var.f143915l, nw40Var.f143914k, nw40Var.f143913j);
        this.f139023i = mMLiveMediaConfigM160460u1;
        return this.f48646e.f176995d.m170535m1(mMLiveMediaConfigM160460u1);
    }

    /* JADX INFO: renamed from: u1 */
    public final MMLiveMediaConfig m160460u1(String str, String str2, BLiveVideoQualityConf bLiveVideoQualityConf) {
        int i;
        int i2;
        int i3;
        MMLiveMediaConfig mMLiveMediaConfig = new MMLiveMediaConfig();
        mMLiveMediaConfig.audioChannels = 2;
        mMLiveMediaConfig.audioSampleRate = 44100;
        mMLiveMediaConfig.audioBitrate = 64000;
        final int[] iArr = {540, TXEAudioDef.TXE_OPUS_SAMPLE_NUM};
        l210.m152547a(new x20() { // from class: l.jw40
            @Override // p153l.x20
            public final void call() {
                mw40.m160453p1(iArr);
            }
        }, new x20() { // from class: l.kw40
            @Override // p153l.x20
            public final void call() {
                mw40.m160455r1(iArr);
            }
        });
        mMLiveMediaConfig.url = str;
        mMLiveMediaConfig.ipv6Url = str2;
        if (NullChecker.m82486a(bLiveVideoQualityConf) && bLiveVideoQualityConf.encode.isValid()) {
            BLiveEncode bLiveEncode = bLiveVideoQualityConf.encode;
            i = bLiveEncode.fps;
            i2 = bLiveEncode.bitRate;
            iArr[0] = bLiveEncode.width;
            iArr[1] = bLiveEncode.heigth;
            i3 = bLiveVideoQualityConf.videoCodecType;
        } else {
            BLiveVideoQuality bLiveVideoQualityM101583a1 = this.f48646e.f176994c.m101583a1();
            if (bLiveVideoQualityM101583a1 == null || !bLiveVideoQualityM101583a1.isValid()) {
                i = 20;
                i2 = 1200000;
                i3 = 0;
            } else {
                i = bLiveVideoQualityM101583a1.pushFps;
                i2 = bLiveVideoQualityM101583a1.pushBitrate;
                iArr[0] = bLiveVideoQualityM101583a1.pushWidth;
                iArr[1] = bLiveVideoQualityM101583a1.pushHeight;
                i3 = bLiveVideoQualityM101583a1.videoCodecType;
            }
        }
        mMLiveMediaConfig.encodeWidth = iArr[0];
        mMLiveMediaConfig.encodeHeight = iArr[1];
        mMLiveMediaConfig.videoFPS = i;
        mMLiveMediaConfig.videoBitRate = i2;
        mMLiveMediaConfig.videoCodecType = i3;
        nsh0.m164608j("[live]sdk_engine", "pushUrl:" + str + "pushUrlIpv6:" + str2 + "encodeSize:" + Arrays.toString(iArr) + " fps:" + i + " bitrate:" + i2);
        mMLiveMediaConfig.businessType = Integer.parseInt(this.f139022h.f48635c);
        mMLiveMediaConfig.cdnType = Integer.parseInt(this.f139022h.f48634b);
        return mMLiveMediaConfig;
    }

    /* JADX INFO: renamed from: w1 */
    public final /* synthetic */ void m160461w1(File file) {
        if (oki.m168016d(zrv.f205803e, xau.m209897B() ? "watermark.png" : "watermark_en.png", file)) {
            l51.m152893M(new RunnableC18718a(this.f48646e.f176995d));
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m160462x1() {
        final File file = new File(m160458v1());
        if (file.exists()) {
            this.f48646e.f176995d.m170534l1(file.getAbsolutePath());
        } else {
            l51.m152919y(new Runnable() { // from class: l.lw40
                @Override // java.lang.Runnable
                public final void run() {
                    this.f133773a.m160461w1(file);
                }
            });
        }
    }
}
