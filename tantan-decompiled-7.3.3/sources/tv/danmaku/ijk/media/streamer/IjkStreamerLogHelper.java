package tv.danmaku.ijk.media.streamer;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import org.eclipse.jetty.util.StringUtil;

/* JADX INFO: loaded from: classes3.dex */
public class IjkStreamerLogHelper {

    /* JADX INFO: renamed from: a */
    Context f209331a;

    /* JADX INFO: renamed from: b */
    private String f209332b;

    /* JADX INFO: renamed from: c */
    private String f209333c;

    /* JADX INFO: renamed from: d */
    private int f209334d;

    /* JADX INFO: renamed from: e */
    private int f209335e;

    /* JADX INFO: renamed from: f */
    private int f209336f;

    /* JADX INFO: renamed from: h */
    private long f209338h;

    /* JADX INFO: renamed from: k */
    private NetUtil f209341k;

    /* JADX INFO: renamed from: l */
    ijkMediaStreamer f209342l;

    /* JADX INFO: renamed from: m */
    private logStatus f209343m;

    /* JADX INFO: renamed from: n */
    private logStatus f209344n;

    /* JADX INFO: renamed from: o */
    private logStatus f209345o;

    /* JADX INFO: renamed from: p */
    private logStatus f209346p;

    /* JADX INFO: renamed from: q */
    private logStatus f209347q;

    /* JADX INFO: renamed from: r */
    protected LoopLogReporter f209348r;

    /* JADX INFO: renamed from: s */
    HashSet<Integer> f209349s;

    /* JADX INFO: renamed from: g */
    private String f209337g = "";

    /* JADX INFO: renamed from: i */
    private boolean f209339i = false;

    /* JADX INFO: renamed from: j */
    private int f209340j = 0;

    public enum logStatus {
        PUSHNULL,
        PUSHINIT,
        PUSHSTARTWATCH,
        PUSHSTOPWATCH,
        PPUSHDETECT,
        CONFERENCHSTART,
        CONFERENCHSOP,
        PUSHSTART,
        PUSHSTOP,
        PUSHBUFFERSTART,
        PUSHBUFFERSTOP
    }

    public IjkStreamerLogHelper(Context context, ijkMediaStreamer ijkmediastreamer, int i, int i2, MediaReportLogManager.LogUploadCallBack logUploadCallBack) {
        this.f209331a = null;
        this.f209341k = null;
        this.f209342l = null;
        logStatus logstatus = logStatus.PUSHNULL;
        this.f209343m = logstatus;
        this.f209344n = logstatus;
        this.f209345o = logstatus;
        this.f209346p = logstatus;
        this.f209347q = logstatus;
        this.f209348r = new LoopLogReporter() { // from class: tv.danmaku.ijk.media.streamer.IjkStreamerLogHelper.1

            /* JADX INFO: renamed from: h */
            long f209350h;

            /* JADX INFO: renamed from: i */
            long f209351i;

            /* JADX INFO: renamed from: j */
            long f209352j;

            /* JADX INFO: renamed from: k */
            long f209353k;

            /* JADX INFO: renamed from: l */
            long f209354l;

            /* JADX INFO: renamed from: m */
            long f209355m;

            /* JADX INFO: renamed from: n */
            long f209356n;

            /* JADX INFO: renamed from: o */
            long f209357o;

            /* JADX INFO: renamed from: p */
            long f209358p;

            /* JADX INFO: renamed from: q */
            boolean f209359q = true;

            /* JADX INFO: renamed from: r */
            long f209360r;

            @Override // tv.danmaku.ijk.media.streamer.LoopLogReporter
            /* JADX INFO: renamed from: c */
            public void mo223609c() {
                IjkStreamerLogHelper ijkStreamerLogHelper = IjkStreamerLogHelper.this;
                if (ijkStreamerLogHelper.f209342l == null) {
                    return;
                }
                if (ijkStreamerLogHelper.f209339i) {
                    boolean z = this.f209360r != IjkStreamerLogHelper.this.f209342l.getTxbytes();
                    this.f209360r = IjkStreamerLogHelper.this.f209342l.getTxbytes();
                    if (z) {
                        this.f209359q = true;
                    } else if (!this.f209359q) {
                        return;
                    } else {
                        this.f209359q = false;
                    }
                }
                ijkMediaStreamer ijkmediastreamer2 = IjkStreamerLogHelper.this.f209342l;
                long audioFrameCapture = ijkmediastreamer2 != null ? ijkmediastreamer2.getAudioFrameCapture() : 0L;
                ijkMediaStreamer ijkmediastreamer3 = IjkStreamerLogHelper.this.f209342l;
                long videoFrameCapture = ijkmediastreamer3 != null ? ijkmediastreamer3.getVideoFrameCapture() : 0L;
                ijkMediaStreamer ijkmediastreamer4 = IjkStreamerLogHelper.this.f209342l;
                long audioEncoderSizes = ijkmediastreamer4 != null ? ijkmediastreamer4.getAudioEncoderSizes() : 0L;
                ijkMediaStreamer ijkmediastreamer5 = IjkStreamerLogHelper.this.f209342l;
                long videoEncoderSize = ijkmediastreamer5 != null ? ijkmediastreamer5.getVideoEncoderSize() : 0L;
                ijkMediaStreamer ijkmediastreamer6 = IjkStreamerLogHelper.this.f209342l;
                long videoEncoderPackets = ijkmediastreamer6 != null ? ijkmediastreamer6.getVideoEncoderPackets() : 0L;
                ijkMediaStreamer ijkmediastreamer7 = IjkStreamerLogHelper.this.f209342l;
                long rtmpSendSize = ijkmediastreamer7 != null ? ijkmediastreamer7.getRtmpSendSize() : 0L;
                ijkMediaStreamer ijkmediastreamer8 = IjkStreamerLogHelper.this.f209342l;
                long writeByte = ijkmediastreamer8 != null ? ijkmediastreamer8.getWriteByte() : 0L;
                ijkMediaStreamer ijkmediastreamer9 = IjkStreamerLogHelper.this.f209342l;
                long videoPts = ijkmediastreamer9 != null ? ijkmediastreamer9.getVideoPts() : 0L;
                long j = writeByte;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.f209358p == 0) {
                    this.f209358p = jCurrentTimeMillis;
                }
                MediaReportLogManager mediaReportLogManagerM223619b = MediaReportLogManager.m223619b();
                Long lValueOf = Long.valueOf(System.currentTimeMillis());
                Long lValueOf2 = Long.valueOf(audioFrameCapture - this.f209350h);
                Long lValueOf3 = Long.valueOf(videoFrameCapture - this.f209351i);
                ijkMediaStreamer ijkmediastreamer10 = IjkStreamerLogHelper.this.f209342l;
                Long lValueOf4 = Long.valueOf(ijkmediastreamer10 != null ? ijkmediastreamer10.getAudioFrameCache() : 0L);
                Long lValueOf5 = Long.valueOf(audioEncoderSizes - this.f209352j);
                Long lValueOf6 = Long.valueOf(videoEncoderSize - this.f209353k);
                Long lValueOf7 = Long.valueOf(videoEncoderPackets - this.f209354l);
                ijkMediaStreamer ijkmediastreamer11 = IjkStreamerLogHelper.this.f209342l;
                Long lValueOf8 = Long.valueOf(ijkmediastreamer11 != null ? ijkmediastreamer11.getAudioCacheSize() : 0L);
                ijkMediaStreamer ijkmediastreamer12 = IjkStreamerLogHelper.this.f209342l;
                Long lValueOf9 = Long.valueOf(ijkmediastreamer12 != null ? ijkmediastreamer12.getVideoCacheSize() : 0L);
                ijkMediaStreamer ijkmediastreamer13 = IjkStreamerLogHelper.this.f209342l;
                Long lValueOf10 = Long.valueOf(ijkmediastreamer13 != null ? ijkmediastreamer13.getVideoPacketCache() : 0L);
                Long lValueOf11 = Long.valueOf(rtmpSendSize - this.f209355m);
                Long lValueOf12 = Long.valueOf(j - this.f209356n);
                ijkMediaStreamer ijkmediastreamer14 = IjkStreamerLogHelper.this.f209342l;
                Integer numValueOf = Integer.valueOf(ijkmediastreamer14 != null ? ijkmediastreamer14.getRenderToCodecSurfaceCost() : 0);
                ijkMediaStreamer ijkmediastreamer15 = IjkStreamerLogHelper.this.f209342l;
                Integer numValueOf2 = Integer.valueOf(ijkmediastreamer15 != null ? ijkmediastreamer15.getRenderToDisplayCost() : 0);
                Long lValueOf13 = Long.valueOf(IjkStreamerLogHelper.this.f209341k.m223741a());
                ijkMediaStreamer ijkmediastreamer16 = IjkStreamerLogHelper.this.f209342l;
                Long lValueOf14 = Long.valueOf(ijkmediastreamer16 != null ? ijkmediastreamer16.getAVDiff() : 0L);
                Long lValueOf15 = Long.valueOf((videoPts - this.f209357o) - (jCurrentTimeMillis - this.f209358p));
                ijkMediaStreamer ijkmediastreamer17 = IjkStreamerLogHelper.this.f209342l;
                Long lValueOf16 = Long.valueOf(ijkmediastreamer17 != null ? ijkmediastreamer17.getPacketCacheDuration() : 0L);
                ijkMediaStreamer ijkmediastreamer18 = IjkStreamerLogHelper.this.f209342l;
                Long lValueOf17 = Long.valueOf(ijkmediastreamer18 != null ? ijkmediastreamer18.getFaceDetectionCount() : 0L);
                ijkMediaStreamer ijkmediastreamer19 = IjkStreamerLogHelper.this.f209342l;
                Long lValueOf18 = Long.valueOf(ijkmediastreamer19 != null ? ijkmediastreamer19.getFaceDetectionDuration() : 0L);
                ijkMediaStreamer ijkmediastreamer20 = IjkStreamerLogHelper.this.f209342l;
                Long lValueOf19 = Long.valueOf(ijkmediastreamer20 != null ? ijkmediastreamer20.getCpuVideoProcessingCount() : 0L);
                ijkMediaStreamer ijkmediastreamer21 = IjkStreamerLogHelper.this.f209342l;
                Long lValueOf20 = Long.valueOf(ijkmediastreamer21 != null ? ijkmediastreamer21.getCpuVideoProcessingDuration() : 0L);
                ijkMediaStreamer ijkmediastreamer22 = IjkStreamerLogHelper.this.f209342l;
                Long lValueOf21 = Long.valueOf(ijkmediastreamer22 != null ? ijkmediastreamer22.getGpuVideoProcessingCount() : 0L);
                ijkMediaStreamer ijkmediastreamer23 = IjkStreamerLogHelper.this.f209342l;
                Long lValueOf22 = Long.valueOf(ijkmediastreamer23 != null ? ijkmediastreamer23.getGpuVideoProcessingDuration() : 0L);
                ijkMediaStreamer ijkmediastreamer24 = IjkStreamerLogHelper.this.f209342l;
                Integer numValueOf3 = Integer.valueOf(ijkmediastreamer24 != null ? ijkmediastreamer24.getAudioBitRate() : 0);
                ijkMediaStreamer ijkmediastreamer25 = IjkStreamerLogHelper.this.f209342l;
                Integer numValueOf4 = Integer.valueOf(ijkmediastreamer25 != null ? ijkmediastreamer25.getVideoBitRate() : 0);
                ijkMediaStreamer ijkmediastreamer26 = IjkStreamerLogHelper.this.f209342l;
                Integer numValueOf5 = Integer.valueOf(ijkmediastreamer26 != null ? ijkmediastreamer26.getVideoFrameRate() : 0);
                ijkMediaStreamer ijkmediastreamer27 = IjkStreamerLogHelper.this.f209342l;
                Integer numValueOf6 = Integer.valueOf(ijkmediastreamer27 != null ? ijkmediastreamer27.getVideoFreezeCount() : 0);
                ijkMediaStreamer ijkmediastreamer28 = IjkStreamerLogHelper.this.f209342l;
                Integer numValueOf7 = Integer.valueOf(ijkmediastreamer28 != null ? ijkmediastreamer28.getPublisherVideoWidth() : 0);
                ijkMediaStreamer ijkmediastreamer29 = IjkStreamerLogHelper.this.f209342l;
                Integer numValueOf8 = Integer.valueOf(ijkmediastreamer29 != null ? ijkmediastreamer29.getPublisherVideoHigh() : 0);
                ijkMediaStreamer ijkmediastreamer30 = IjkStreamerLogHelper.this.f209342l;
                Integer numValueOf9 = Integer.valueOf(ijkmediastreamer30 != null ? ijkmediastreamer30.getAvFlag() : 1);
                ijkMediaStreamer ijkmediastreamer31 = IjkStreamerLogHelper.this.f209342l;
                Integer numValueOf10 = Integer.valueOf(ijkmediastreamer31 != null ? ijkmediastreamer31.getRoomType() : 0);
                ijkMediaStreamer ijkmediastreamer32 = IjkStreamerLogHelper.this.f209342l;
                Long lValueOf23 = Long.valueOf(ijkmediastreamer32 != null ? ijkmediastreamer32.getRxbytes() : 0L);
                ijkMediaStreamer ijkmediastreamer33 = IjkStreamerLogHelper.this.f209342l;
                Long lValueOf24 = Long.valueOf(ijkmediastreamer33 != null ? ijkmediastreamer33.getVideoRxbytes() : 0L);
                ijkMediaStreamer ijkmediastreamer34 = IjkStreamerLogHelper.this.f209342l;
                Long lValueOf25 = Long.valueOf(ijkmediastreamer34 != null ? ijkmediastreamer34.getAudioRxbytes() : 0L);
                ijkMediaStreamer ijkmediastreamer35 = IjkStreamerLogHelper.this.f209342l;
                String audioVideoStatics = ijkmediastreamer35 != null ? ijkmediastreamer35.getAudioVideoStatics() : "[(0)]";
                ijkMediaStreamer ijkmediastreamer36 = IjkStreamerLogHelper.this.f209342l;
                this.f209366e.add(mediaReportLogManagerM223619b.m223621d(lValueOf, lValueOf2, lValueOf3, lValueOf4, lValueOf5, lValueOf6, lValueOf7, lValueOf8, lValueOf9, lValueOf10, lValueOf11, lValueOf12, numValueOf, numValueOf2, 0, lValueOf13, lValueOf14, lValueOf15, lValueOf16, "M", lValueOf17, lValueOf18, lValueOf19, lValueOf20, lValueOf21, lValueOf22, numValueOf3, numValueOf4, numValueOf5, numValueOf6, numValueOf7, numValueOf8, numValueOf9, numValueOf10, lValueOf23, lValueOf24, lValueOf25, audioVideoStatics, 0, ijkmediastreamer36 != null ? ijkmediastreamer36.getCPUandMemStatistics() : "0,0"));
                this.f209350h = audioFrameCapture;
                this.f209351i = videoFrameCapture;
                this.f209352j = audioEncoderSizes;
                this.f209353k = videoEncoderSize;
                this.f209354l = videoEncoderPackets;
                this.f209355m = rtmpSendSize;
                this.f209356n = j;
                this.f209357o = videoPts;
                this.f209358p = jCurrentTimeMillis;
                super.mo223609c();
            }

            @Override // tv.danmaku.ijk.media.streamer.LoopLogReporter
            /* JADX INFO: renamed from: d */
            public void mo223610d() {
                if (this.f209366e.size() == 0) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                int i3 = 0;
                while (true) {
                    int size = this.f209366e.size();
                    ArrayList<String> arrayList = this.f209366e;
                    if (i3 >= size) {
                        arrayList.clear();
                        MediaReportLogManager.m223619b().m223623f("v2.pushWatch", "", IjkStreamerLogHelper.this.f209333c, sb.toString(), IjkStreamerLogHelper.this.f209334d, IjkStreamerLogHelper.this.m223601e());
                        return;
                    } else {
                        sb.append(arrayList.get(i3));
                        i3++;
                    }
                }
            }

            @Override // tv.danmaku.ijk.media.streamer.LoopLogReporter
            /* JADX INFO: renamed from: i */
            public void mo223611i() {
                super.mo223611i();
                this.f209350h = 0L;
                this.f209351i = 0L;
                this.f209352j = 0L;
                this.f209353k = 0L;
                this.f209354l = 0L;
                this.f209355m = 0L;
                this.f209356n = 0L;
                this.f209357o = 0L;
                this.f209358p = 0L;
                this.f209359q = true;
                this.f209360r = 0L;
            }
        };
        this.f209349s = new HashSet<>();
        this.f209342l = ijkmediastreamer;
        this.f209335e = i;
        this.f209336f = i2;
        this.f209348r.m223614e(true);
        this.f209348r.m223615f(this.f209335e);
        this.f209348r.m223616g(this.f209336f);
        this.f209331a = context;
        MediaReportLogManager.m223619b().m223624g(logUploadCallBack);
        this.f209341k = new NetUtil(this.f209331a);
    }

    /* JADX INFO: renamed from: e */
    public String m223601e() {
        return this.f209337g;
    }

    /* JADX INFO: renamed from: f */
    public void m223602f() {
        String str = this.f209332b;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        this.f209338h = System.currentTimeMillis();
        MediaReportLogManager.m223619b().m223623f("v2.pushBufferStart", str2, this.f209333c, MediaReportLogManager.m223619b().m223621d(Long.valueOf(this.f209338h), 0), this.f209334d, m223601e());
    }

    /* JADX INFO: renamed from: g */
    public void m223603g() {
        String str = this.f209332b;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        MediaReportLogManager.m223619b().m223623f("v2.pushBufferStop", str2, this.f209333c, MediaReportLogManager.m223619b().m223621d(Long.valueOf(jCurrentTimeMillis), Long.valueOf(MediaReportLogManager.m223618a(jCurrentTimeMillis, this.f209338h))), this.f209334d, m223601e());
    }

    /* JADX INFO: renamed from: h */
    public synchronized void m223604h(String str) {
        try {
            if (this.f209342l == null) {
                return;
            }
            logStatus logstatus = this.f209344n;
            logStatus logstatus2 = logStatus.PUSHSTART;
            if (logstatus == logstatus2) {
                return;
            }
            String str2 = this.f209332b;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = this.f209341k.m223744d() ? "wifi" : "other";
            MediaReportLogManager.m223619b().m223623f("v2.pushStart", str2, this.f209333c, MediaReportLogManager.m223619b().m223621d(Long.valueOf(System.currentTimeMillis()), TextUtils.isEmpty(this.f209342l.getServerIpAddr()) ? StringUtil.ALL_INTERFACES : this.f209342l.getServerIpAddr(), Long.valueOf(this.f209342l.getConnectTime()), Long.valueOf(this.f209342l.getFirstAuidoPacketTime()), Long.valueOf(this.f209342l.getFirstVideoPacketTime()), Long.valueOf(this.f209342l.getFirstSendPacketTime()), str3, 0, str == null ? 0 : str, 1, StringUtil.ALL_INTERFACES), this.f209334d, m223601e());
            this.f209344n = logstatus2;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: i */
    public synchronized void m223605i(int i, String str) {
        String strM223621d;
        if (this.f209344n == logStatus.PUSHSTOP) {
            return;
        }
        if (this.f209342l == null) {
            strM223621d = MediaReportLogManager.m223619b().m223621d(Long.valueOf(System.currentTimeMillis()), Integer.valueOf(i), 0, "0", str);
        } else {
            try {
                strM223621d = MediaReportLogManager.m223619b().m223621d(Long.valueOf(System.currentTimeMillis()), Integer.valueOf(i), Long.valueOf(this.f209342l.getRtmpSendSize()), TextUtils.isEmpty(this.f209342l.getServerIpAddr()) ? "0" : this.f209342l.getServerIpAddr(), str);
            } catch (Exception e) {
                e.printStackTrace();
                strM223621d = MediaReportLogManager.m223619b().m223621d(Long.valueOf(System.currentTimeMillis()), Integer.valueOf(i), 0, "0", str);
            }
        }
        String str2 = strM223621d;
        MediaReportLogManager.m223619b().m223623f("v2.pushStop", "", this.f209333c, str2, this.f209334d, m223601e());
        MediaReportLogManager.m223619b().m223623f("v2.pushStop", "", this.f209333c, str2, this.f209334d, m223601e());
        this.f209344n = logStatus.PUSHSTOP;
    }

    /* JADX INFO: renamed from: j */
    public synchronized void m223606j() {
        try {
            m223608l();
            MediaReportLogManager.m223619b().m223622e();
            NetUtil netUtil = this.f209341k;
            if (netUtil != null) {
                netUtil.m223745e();
                this.f209341k = null;
            }
            this.f209342l = null;
            this.f209331a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m223607k() {
        logStatus logstatus = this.f209343m;
        logStatus logstatus2 = logStatus.PUSHSTARTWATCH;
        if (logstatus == logstatus2) {
            return;
        }
        this.f209348r.m223617h();
        this.f209343m = logstatus2;
    }

    /* JADX INFO: renamed from: l */
    public void m223608l() {
        logStatus logstatus = this.f209343m;
        logStatus logstatus2 = logStatus.PUSHSTOPWATCH;
        if (logstatus == logstatus2) {
            return;
        }
        this.f209348r.mo223611i();
        this.f209343m = logstatus2;
    }
}
