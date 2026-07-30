package tv.danmaku.ijk.media.streamer;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import org.eclipse.jetty.util.StringUtil;

/* JADX INFO: loaded from: classes3.dex */
public class IjkStreamerLogHelper {

    /* JADX INFO: renamed from: a */
    Context f208409a;

    /* JADX INFO: renamed from: b */
    private String f208410b;

    /* JADX INFO: renamed from: c */
    private String f208411c;

    /* JADX INFO: renamed from: d */
    private int f208412d;

    /* JADX INFO: renamed from: e */
    private int f208413e;

    /* JADX INFO: renamed from: f */
    private int f208414f;

    /* JADX INFO: renamed from: h */
    private long f208416h;

    /* JADX INFO: renamed from: k */
    private NetUtil f208419k;

    /* JADX INFO: renamed from: l */
    ijkMediaStreamer f208420l;

    /* JADX INFO: renamed from: m */
    private logStatus f208421m;

    /* JADX INFO: renamed from: n */
    private logStatus f208422n;

    /* JADX INFO: renamed from: o */
    private logStatus f208423o;

    /* JADX INFO: renamed from: p */
    private logStatus f208424p;

    /* JADX INFO: renamed from: q */
    private logStatus f208425q;

    /* JADX INFO: renamed from: r */
    protected LoopLogReporter f208426r;

    /* JADX INFO: renamed from: s */
    HashSet<Integer> f208427s;

    /* JADX INFO: renamed from: g */
    private String f208415g = "";

    /* JADX INFO: renamed from: i */
    private boolean f208417i = false;

    /* JADX INFO: renamed from: j */
    private int f208418j = 0;

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
        this.f208409a = null;
        this.f208419k = null;
        this.f208420l = null;
        logStatus logstatus = logStatus.PUSHNULL;
        this.f208421m = logstatus;
        this.f208422n = logstatus;
        this.f208423o = logstatus;
        this.f208424p = logstatus;
        this.f208425q = logstatus;
        this.f208426r = new LoopLogReporter() { // from class: tv.danmaku.ijk.media.streamer.IjkStreamerLogHelper.1

            /* JADX INFO: renamed from: h */
            long f208428h;

            /* JADX INFO: renamed from: i */
            long f208429i;

            /* JADX INFO: renamed from: j */
            long f208430j;

            /* JADX INFO: renamed from: k */
            long f208431k;

            /* JADX INFO: renamed from: l */
            long f208432l;

            /* JADX INFO: renamed from: m */
            long f208433m;

            /* JADX INFO: renamed from: n */
            long f208434n;

            /* JADX INFO: renamed from: o */
            long f208435o;

            /* JADX INFO: renamed from: p */
            long f208436p;

            /* JADX INFO: renamed from: q */
            boolean f208437q = true;

            /* JADX INFO: renamed from: r */
            long f208438r;

            @Override // tv.danmaku.ijk.media.streamer.LoopLogReporter
            /* JADX INFO: renamed from: c */
            public void mo222363c() {
                IjkStreamerLogHelper ijkStreamerLogHelper = IjkStreamerLogHelper.this;
                if (ijkStreamerLogHelper.f208420l == null) {
                    return;
                }
                if (ijkStreamerLogHelper.f208417i) {
                    boolean z = this.f208438r != IjkStreamerLogHelper.this.f208420l.getTxbytes();
                    this.f208438r = IjkStreamerLogHelper.this.f208420l.getTxbytes();
                    if (z) {
                        this.f208437q = true;
                    } else if (!this.f208437q) {
                        return;
                    } else {
                        this.f208437q = false;
                    }
                }
                ijkMediaStreamer ijkmediastreamer2 = IjkStreamerLogHelper.this.f208420l;
                long audioFrameCapture = ijkmediastreamer2 != null ? ijkmediastreamer2.getAudioFrameCapture() : 0L;
                ijkMediaStreamer ijkmediastreamer3 = IjkStreamerLogHelper.this.f208420l;
                long videoFrameCapture = ijkmediastreamer3 != null ? ijkmediastreamer3.getVideoFrameCapture() : 0L;
                ijkMediaStreamer ijkmediastreamer4 = IjkStreamerLogHelper.this.f208420l;
                long audioEncoderSizes = ijkmediastreamer4 != null ? ijkmediastreamer4.getAudioEncoderSizes() : 0L;
                ijkMediaStreamer ijkmediastreamer5 = IjkStreamerLogHelper.this.f208420l;
                long videoEncoderSize = ijkmediastreamer5 != null ? ijkmediastreamer5.getVideoEncoderSize() : 0L;
                ijkMediaStreamer ijkmediastreamer6 = IjkStreamerLogHelper.this.f208420l;
                long videoEncoderPackets = ijkmediastreamer6 != null ? ijkmediastreamer6.getVideoEncoderPackets() : 0L;
                ijkMediaStreamer ijkmediastreamer7 = IjkStreamerLogHelper.this.f208420l;
                long rtmpSendSize = ijkmediastreamer7 != null ? ijkmediastreamer7.getRtmpSendSize() : 0L;
                ijkMediaStreamer ijkmediastreamer8 = IjkStreamerLogHelper.this.f208420l;
                long writeByte = ijkmediastreamer8 != null ? ijkmediastreamer8.getWriteByte() : 0L;
                ijkMediaStreamer ijkmediastreamer9 = IjkStreamerLogHelper.this.f208420l;
                long videoPts = ijkmediastreamer9 != null ? ijkmediastreamer9.getVideoPts() : 0L;
                long j = writeByte;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.f208436p == 0) {
                    this.f208436p = jCurrentTimeMillis;
                }
                MediaReportLogManager mediaReportLogManagerM222373b = MediaReportLogManager.m222373b();
                Long lValueOf = Long.valueOf(System.currentTimeMillis());
                Long lValueOf2 = Long.valueOf(audioFrameCapture - this.f208428h);
                Long lValueOf3 = Long.valueOf(videoFrameCapture - this.f208429i);
                ijkMediaStreamer ijkmediastreamer10 = IjkStreamerLogHelper.this.f208420l;
                Long lValueOf4 = Long.valueOf(ijkmediastreamer10 != null ? ijkmediastreamer10.getAudioFrameCache() : 0L);
                Long lValueOf5 = Long.valueOf(audioEncoderSizes - this.f208430j);
                Long lValueOf6 = Long.valueOf(videoEncoderSize - this.f208431k);
                Long lValueOf7 = Long.valueOf(videoEncoderPackets - this.f208432l);
                ijkMediaStreamer ijkmediastreamer11 = IjkStreamerLogHelper.this.f208420l;
                Long lValueOf8 = Long.valueOf(ijkmediastreamer11 != null ? ijkmediastreamer11.getAudioCacheSize() : 0L);
                ijkMediaStreamer ijkmediastreamer12 = IjkStreamerLogHelper.this.f208420l;
                Long lValueOf9 = Long.valueOf(ijkmediastreamer12 != null ? ijkmediastreamer12.getVideoCacheSize() : 0L);
                ijkMediaStreamer ijkmediastreamer13 = IjkStreamerLogHelper.this.f208420l;
                Long lValueOf10 = Long.valueOf(ijkmediastreamer13 != null ? ijkmediastreamer13.getVideoPacketCache() : 0L);
                Long lValueOf11 = Long.valueOf(rtmpSendSize - this.f208433m);
                Long lValueOf12 = Long.valueOf(j - this.f208434n);
                ijkMediaStreamer ijkmediastreamer14 = IjkStreamerLogHelper.this.f208420l;
                Integer numValueOf = Integer.valueOf(ijkmediastreamer14 != null ? ijkmediastreamer14.getRenderToCodecSurfaceCost() : 0);
                ijkMediaStreamer ijkmediastreamer15 = IjkStreamerLogHelper.this.f208420l;
                Integer numValueOf2 = Integer.valueOf(ijkmediastreamer15 != null ? ijkmediastreamer15.getRenderToDisplayCost() : 0);
                Long lValueOf13 = Long.valueOf(IjkStreamerLogHelper.this.f208419k.m222495a());
                ijkMediaStreamer ijkmediastreamer16 = IjkStreamerLogHelper.this.f208420l;
                Long lValueOf14 = Long.valueOf(ijkmediastreamer16 != null ? ijkmediastreamer16.getAVDiff() : 0L);
                Long lValueOf15 = Long.valueOf((videoPts - this.f208435o) - (jCurrentTimeMillis - this.f208436p));
                ijkMediaStreamer ijkmediastreamer17 = IjkStreamerLogHelper.this.f208420l;
                Long lValueOf16 = Long.valueOf(ijkmediastreamer17 != null ? ijkmediastreamer17.getPacketCacheDuration() : 0L);
                ijkMediaStreamer ijkmediastreamer18 = IjkStreamerLogHelper.this.f208420l;
                Long lValueOf17 = Long.valueOf(ijkmediastreamer18 != null ? ijkmediastreamer18.getFaceDetectionCount() : 0L);
                ijkMediaStreamer ijkmediastreamer19 = IjkStreamerLogHelper.this.f208420l;
                Long lValueOf18 = Long.valueOf(ijkmediastreamer19 != null ? ijkmediastreamer19.getFaceDetectionDuration() : 0L);
                ijkMediaStreamer ijkmediastreamer20 = IjkStreamerLogHelper.this.f208420l;
                Long lValueOf19 = Long.valueOf(ijkmediastreamer20 != null ? ijkmediastreamer20.getCpuVideoProcessingCount() : 0L);
                ijkMediaStreamer ijkmediastreamer21 = IjkStreamerLogHelper.this.f208420l;
                Long lValueOf20 = Long.valueOf(ijkmediastreamer21 != null ? ijkmediastreamer21.getCpuVideoProcessingDuration() : 0L);
                ijkMediaStreamer ijkmediastreamer22 = IjkStreamerLogHelper.this.f208420l;
                Long lValueOf21 = Long.valueOf(ijkmediastreamer22 != null ? ijkmediastreamer22.getGpuVideoProcessingCount() : 0L);
                ijkMediaStreamer ijkmediastreamer23 = IjkStreamerLogHelper.this.f208420l;
                Long lValueOf22 = Long.valueOf(ijkmediastreamer23 != null ? ijkmediastreamer23.getGpuVideoProcessingDuration() : 0L);
                ijkMediaStreamer ijkmediastreamer24 = IjkStreamerLogHelper.this.f208420l;
                Integer numValueOf3 = Integer.valueOf(ijkmediastreamer24 != null ? ijkmediastreamer24.getAudioBitRate() : 0);
                ijkMediaStreamer ijkmediastreamer25 = IjkStreamerLogHelper.this.f208420l;
                Integer numValueOf4 = Integer.valueOf(ijkmediastreamer25 != null ? ijkmediastreamer25.getVideoBitRate() : 0);
                ijkMediaStreamer ijkmediastreamer26 = IjkStreamerLogHelper.this.f208420l;
                Integer numValueOf5 = Integer.valueOf(ijkmediastreamer26 != null ? ijkmediastreamer26.getVideoFrameRate() : 0);
                ijkMediaStreamer ijkmediastreamer27 = IjkStreamerLogHelper.this.f208420l;
                Integer numValueOf6 = Integer.valueOf(ijkmediastreamer27 != null ? ijkmediastreamer27.getVideoFreezeCount() : 0);
                ijkMediaStreamer ijkmediastreamer28 = IjkStreamerLogHelper.this.f208420l;
                Integer numValueOf7 = Integer.valueOf(ijkmediastreamer28 != null ? ijkmediastreamer28.getPublisherVideoWidth() : 0);
                ijkMediaStreamer ijkmediastreamer29 = IjkStreamerLogHelper.this.f208420l;
                Integer numValueOf8 = Integer.valueOf(ijkmediastreamer29 != null ? ijkmediastreamer29.getPublisherVideoHigh() : 0);
                ijkMediaStreamer ijkmediastreamer30 = IjkStreamerLogHelper.this.f208420l;
                Integer numValueOf9 = Integer.valueOf(ijkmediastreamer30 != null ? ijkmediastreamer30.getAvFlag() : 1);
                ijkMediaStreamer ijkmediastreamer31 = IjkStreamerLogHelper.this.f208420l;
                Integer numValueOf10 = Integer.valueOf(ijkmediastreamer31 != null ? ijkmediastreamer31.getRoomType() : 0);
                ijkMediaStreamer ijkmediastreamer32 = IjkStreamerLogHelper.this.f208420l;
                Long lValueOf23 = Long.valueOf(ijkmediastreamer32 != null ? ijkmediastreamer32.getRxbytes() : 0L);
                ijkMediaStreamer ijkmediastreamer33 = IjkStreamerLogHelper.this.f208420l;
                Long lValueOf24 = Long.valueOf(ijkmediastreamer33 != null ? ijkmediastreamer33.getVideoRxbytes() : 0L);
                ijkMediaStreamer ijkmediastreamer34 = IjkStreamerLogHelper.this.f208420l;
                Long lValueOf25 = Long.valueOf(ijkmediastreamer34 != null ? ijkmediastreamer34.getAudioRxbytes() : 0L);
                ijkMediaStreamer ijkmediastreamer35 = IjkStreamerLogHelper.this.f208420l;
                String audioVideoStatics = ijkmediastreamer35 != null ? ijkmediastreamer35.getAudioVideoStatics() : "[(0)]";
                ijkMediaStreamer ijkmediastreamer36 = IjkStreamerLogHelper.this.f208420l;
                this.f208444e.add(mediaReportLogManagerM222373b.m222375d(lValueOf, lValueOf2, lValueOf3, lValueOf4, lValueOf5, lValueOf6, lValueOf7, lValueOf8, lValueOf9, lValueOf10, lValueOf11, lValueOf12, numValueOf, numValueOf2, 0, lValueOf13, lValueOf14, lValueOf15, lValueOf16, "M", lValueOf17, lValueOf18, lValueOf19, lValueOf20, lValueOf21, lValueOf22, numValueOf3, numValueOf4, numValueOf5, numValueOf6, numValueOf7, numValueOf8, numValueOf9, numValueOf10, lValueOf23, lValueOf24, lValueOf25, audioVideoStatics, 0, ijkmediastreamer36 != null ? ijkmediastreamer36.getCPUandMemStatistics() : "0,0"));
                this.f208428h = audioFrameCapture;
                this.f208429i = videoFrameCapture;
                this.f208430j = audioEncoderSizes;
                this.f208431k = videoEncoderSize;
                this.f208432l = videoEncoderPackets;
                this.f208433m = rtmpSendSize;
                this.f208434n = j;
                this.f208435o = videoPts;
                this.f208436p = jCurrentTimeMillis;
                super.mo222363c();
            }

            @Override // tv.danmaku.ijk.media.streamer.LoopLogReporter
            /* JADX INFO: renamed from: d */
            public void mo222364d() {
                if (this.f208444e.size() == 0) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                int i3 = 0;
                while (true) {
                    int size = this.f208444e.size();
                    ArrayList<String> arrayList = this.f208444e;
                    if (i3 >= size) {
                        arrayList.clear();
                        MediaReportLogManager.m222373b().m222377f("v2.pushWatch", "", IjkStreamerLogHelper.this.f208411c, sb.toString(), IjkStreamerLogHelper.this.f208412d, IjkStreamerLogHelper.this.m222355e());
                        return;
                    } else {
                        sb.append(arrayList.get(i3));
                        i3++;
                    }
                }
            }

            @Override // tv.danmaku.ijk.media.streamer.LoopLogReporter
            /* JADX INFO: renamed from: i */
            public void mo222365i() {
                super.mo222365i();
                this.f208428h = 0L;
                this.f208429i = 0L;
                this.f208430j = 0L;
                this.f208431k = 0L;
                this.f208432l = 0L;
                this.f208433m = 0L;
                this.f208434n = 0L;
                this.f208435o = 0L;
                this.f208436p = 0L;
                this.f208437q = true;
                this.f208438r = 0L;
            }
        };
        this.f208427s = new HashSet<>();
        this.f208420l = ijkmediastreamer;
        this.f208413e = i;
        this.f208414f = i2;
        this.f208426r.m222368e(true);
        this.f208426r.m222369f(this.f208413e);
        this.f208426r.m222370g(this.f208414f);
        this.f208409a = context;
        MediaReportLogManager.m222373b().m222378g(logUploadCallBack);
        this.f208419k = new NetUtil(this.f208409a);
    }

    /* JADX INFO: renamed from: e */
    public String m222355e() {
        return this.f208415g;
    }

    /* JADX INFO: renamed from: f */
    public void m222356f() {
        String str = this.f208410b;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        this.f208416h = System.currentTimeMillis();
        MediaReportLogManager.m222373b().m222377f("v2.pushBufferStart", str2, this.f208411c, MediaReportLogManager.m222373b().m222375d(Long.valueOf(this.f208416h), 0), this.f208412d, m222355e());
    }

    /* JADX INFO: renamed from: g */
    public void m222357g() {
        String str = this.f208410b;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        MediaReportLogManager.m222373b().m222377f("v2.pushBufferStop", str2, this.f208411c, MediaReportLogManager.m222373b().m222375d(Long.valueOf(jCurrentTimeMillis), Long.valueOf(MediaReportLogManager.m222372a(jCurrentTimeMillis, this.f208416h))), this.f208412d, m222355e());
    }

    /* JADX INFO: renamed from: h */
    public synchronized void m222358h(String str) {
        try {
            if (this.f208420l == null) {
                return;
            }
            logStatus logstatus = this.f208422n;
            logStatus logstatus2 = logStatus.PUSHSTART;
            if (logstatus == logstatus2) {
                return;
            }
            String str2 = this.f208410b;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = this.f208419k.m222498d() ? "wifi" : "other";
            MediaReportLogManager.m222373b().m222377f("v2.pushStart", str2, this.f208411c, MediaReportLogManager.m222373b().m222375d(Long.valueOf(System.currentTimeMillis()), TextUtils.isEmpty(this.f208420l.getServerIpAddr()) ? StringUtil.ALL_INTERFACES : this.f208420l.getServerIpAddr(), Long.valueOf(this.f208420l.getConnectTime()), Long.valueOf(this.f208420l.getFirstAuidoPacketTime()), Long.valueOf(this.f208420l.getFirstVideoPacketTime()), Long.valueOf(this.f208420l.getFirstSendPacketTime()), str3, 0, str == null ? 0 : str, 1, StringUtil.ALL_INTERFACES), this.f208412d, m222355e());
            this.f208422n = logstatus2;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: i */
    public synchronized void m222359i(int i, String str) {
        String strM222375d;
        if (this.f208422n == logStatus.PUSHSTOP) {
            return;
        }
        if (this.f208420l == null) {
            strM222375d = MediaReportLogManager.m222373b().m222375d(Long.valueOf(System.currentTimeMillis()), Integer.valueOf(i), 0, "0", str);
        } else {
            try {
                strM222375d = MediaReportLogManager.m222373b().m222375d(Long.valueOf(System.currentTimeMillis()), Integer.valueOf(i), Long.valueOf(this.f208420l.getRtmpSendSize()), TextUtils.isEmpty(this.f208420l.getServerIpAddr()) ? "0" : this.f208420l.getServerIpAddr(), str);
            } catch (Exception e) {
                e.printStackTrace();
                strM222375d = MediaReportLogManager.m222373b().m222375d(Long.valueOf(System.currentTimeMillis()), Integer.valueOf(i), 0, "0", str);
            }
        }
        String str2 = strM222375d;
        MediaReportLogManager.m222373b().m222377f("v2.pushStop", "", this.f208411c, str2, this.f208412d, m222355e());
        MediaReportLogManager.m222373b().m222377f("v2.pushStop", "", this.f208411c, str2, this.f208412d, m222355e());
        this.f208422n = logStatus.PUSHSTOP;
    }

    /* JADX INFO: renamed from: j */
    public synchronized void m222360j() {
        try {
            m222362l();
            MediaReportLogManager.m222373b().m222376e();
            NetUtil netUtil = this.f208419k;
            if (netUtil != null) {
                netUtil.m222499e();
                this.f208419k = null;
            }
            this.f208420l = null;
            this.f208409a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m222361k() {
        logStatus logstatus = this.f208421m;
        logStatus logstatus2 = logStatus.PUSHSTARTWATCH;
        if (logstatus == logstatus2) {
            return;
        }
        this.f208426r.m222371h();
        this.f208421m = logstatus2;
    }

    /* JADX INFO: renamed from: l */
    public void m222362l() {
        logStatus logstatus = this.f208421m;
        logStatus logstatus2 = logStatus.PUSHSTOPWATCH;
        if (logstatus == logstatus2) {
            return;
        }
        this.f208426r.mo222365i();
        this.f208421m = logstatus2;
    }
}
