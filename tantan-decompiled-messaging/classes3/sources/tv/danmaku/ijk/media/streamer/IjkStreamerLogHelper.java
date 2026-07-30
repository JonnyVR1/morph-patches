package tv.danmaku.ijk.media.streamer;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import org.eclipse.jetty.util.StringUtil;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class IjkStreamerLogHelper {

    /* JADX INFO: renamed from: a */
    Context f12034a;

    /* JADX INFO: renamed from: b */
    private String f12035b;

    /* JADX INFO: renamed from: c */
    private String f12036c;

    /* JADX INFO: renamed from: d */
    private int f12037d;

    /* JADX INFO: renamed from: e */
    private int f12038e;

    /* JADX INFO: renamed from: f */
    private int f12039f;

    /* JADX INFO: renamed from: h */
    private long f12041h;

    /* JADX INFO: renamed from: k */
    private NetUtil f12044k;

    /* JADX INFO: renamed from: l */
    ijkMediaStreamer f12045l;

    /* JADX INFO: renamed from: m */
    private logStatus f12046m;

    /* JADX INFO: renamed from: n */
    private logStatus f12047n;

    /* JADX INFO: renamed from: o */
    private logStatus f12048o;

    /* JADX INFO: renamed from: p */
    private logStatus f12049p;

    /* JADX INFO: renamed from: q */
    private logStatus f12050q;

    /* JADX INFO: renamed from: r */
    protected LoopLogReporter f12051r;

    /* JADX INFO: renamed from: s */
    HashSet<Integer> f12052s;

    /* JADX INFO: renamed from: g */
    private String f12040g = "";

    /* JADX INFO: renamed from: i */
    private boolean f12042i = false;

    /* JADX INFO: renamed from: j */
    private int f12043j = 0;

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
        this.f12034a = null;
        this.f12044k = null;
        this.f12045l = null;
        logStatus logstatus = logStatus.PUSHNULL;
        this.f12046m = logstatus;
        this.f12047n = logstatus;
        this.f12048o = logstatus;
        this.f12049p = logstatus;
        this.f12050q = logstatus;
        this.f12051r = new LoopLogReporter() { // from class: tv.danmaku.ijk.media.streamer.IjkStreamerLogHelper.1

            /* JADX INFO: renamed from: h */
            long f12053h;

            /* JADX INFO: renamed from: i */
            long f12054i;

            /* JADX INFO: renamed from: j */
            long f12055j;

            /* JADX INFO: renamed from: k */
            long f12056k;

            /* JADX INFO: renamed from: l */
            long f12057l;

            /* JADX INFO: renamed from: m */
            long f12058m;

            /* JADX INFO: renamed from: n */
            long f12059n;

            /* JADX INFO: renamed from: o */
            long f12060o;

            /* JADX INFO: renamed from: p */
            long f12061p;

            /* JADX INFO: renamed from: q */
            boolean f12062q = true;

            /* JADX INFO: renamed from: r */
            long f12063r;

            @Override // tv.danmaku.ijk.media.streamer.LoopLogReporter
            /* JADX INFO: renamed from: c */
            public void mo10834c() {
                IjkStreamerLogHelper ijkStreamerLogHelper = IjkStreamerLogHelper.this;
                if (ijkStreamerLogHelper.f12045l == null) {
                    return;
                }
                if (ijkStreamerLogHelper.f12042i) {
                    boolean z = this.f12063r != IjkStreamerLogHelper.this.f12045l.getTxbytes();
                    this.f12063r = IjkStreamerLogHelper.this.f12045l.getTxbytes();
                    if (z) {
                        this.f12062q = true;
                    } else if (!this.f12062q) {
                        return;
                    } else {
                        this.f12062q = false;
                    }
                }
                ijkMediaStreamer ijkmediastreamer2 = IjkStreamerLogHelper.this.f12045l;
                long audioFrameCapture = ijkmediastreamer2 != null ? ijkmediastreamer2.getAudioFrameCapture() : 0L;
                ijkMediaStreamer ijkmediastreamer3 = IjkStreamerLogHelper.this.f12045l;
                long videoFrameCapture = ijkmediastreamer3 != null ? ijkmediastreamer3.getVideoFrameCapture() : 0L;
                ijkMediaStreamer ijkmediastreamer4 = IjkStreamerLogHelper.this.f12045l;
                long audioEncoderSizes = ijkmediastreamer4 != null ? ijkmediastreamer4.getAudioEncoderSizes() : 0L;
                ijkMediaStreamer ijkmediastreamer5 = IjkStreamerLogHelper.this.f12045l;
                long videoEncoderSize = ijkmediastreamer5 != null ? ijkmediastreamer5.getVideoEncoderSize() : 0L;
                ijkMediaStreamer ijkmediastreamer6 = IjkStreamerLogHelper.this.f12045l;
                long videoEncoderPackets = ijkmediastreamer6 != null ? ijkmediastreamer6.getVideoEncoderPackets() : 0L;
                ijkMediaStreamer ijkmediastreamer7 = IjkStreamerLogHelper.this.f12045l;
                long rtmpSendSize = ijkmediastreamer7 != null ? ijkmediastreamer7.getRtmpSendSize() : 0L;
                ijkMediaStreamer ijkmediastreamer8 = IjkStreamerLogHelper.this.f12045l;
                long writeByte = ijkmediastreamer8 != null ? ijkmediastreamer8.getWriteByte() : 0L;
                ijkMediaStreamer ijkmediastreamer9 = IjkStreamerLogHelper.this.f12045l;
                long videoPts = ijkmediastreamer9 != null ? ijkmediastreamer9.getVideoPts() : 0L;
                long j = writeByte;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.f12061p == 0) {
                    this.f12061p = jCurrentTimeMillis;
                }
                MediaReportLogManager mediaReportLogManagerM10844b = MediaReportLogManager.m10844b();
                Long lValueOf = Long.valueOf(System.currentTimeMillis());
                Long lValueOf2 = Long.valueOf(audioFrameCapture - this.f12053h);
                Long lValueOf3 = Long.valueOf(videoFrameCapture - this.f12054i);
                ijkMediaStreamer ijkmediastreamer10 = IjkStreamerLogHelper.this.f12045l;
                Long lValueOf4 = Long.valueOf(ijkmediastreamer10 != null ? ijkmediastreamer10.getAudioFrameCache() : 0L);
                Long lValueOf5 = Long.valueOf(audioEncoderSizes - this.f12055j);
                Long lValueOf6 = Long.valueOf(videoEncoderSize - this.f12056k);
                Long lValueOf7 = Long.valueOf(videoEncoderPackets - this.f12057l);
                ijkMediaStreamer ijkmediastreamer11 = IjkStreamerLogHelper.this.f12045l;
                Long lValueOf8 = Long.valueOf(ijkmediastreamer11 != null ? ijkmediastreamer11.getAudioCacheSize() : 0L);
                ijkMediaStreamer ijkmediastreamer12 = IjkStreamerLogHelper.this.f12045l;
                Long lValueOf9 = Long.valueOf(ijkmediastreamer12 != null ? ijkmediastreamer12.getVideoCacheSize() : 0L);
                ijkMediaStreamer ijkmediastreamer13 = IjkStreamerLogHelper.this.f12045l;
                Long lValueOf10 = Long.valueOf(ijkmediastreamer13 != null ? ijkmediastreamer13.getVideoPacketCache() : 0L);
                Long lValueOf11 = Long.valueOf(rtmpSendSize - this.f12058m);
                Long lValueOf12 = Long.valueOf(j - this.f12059n);
                ijkMediaStreamer ijkmediastreamer14 = IjkStreamerLogHelper.this.f12045l;
                Integer numValueOf = Integer.valueOf(ijkmediastreamer14 != null ? ijkmediastreamer14.getRenderToCodecSurfaceCost() : 0);
                ijkMediaStreamer ijkmediastreamer15 = IjkStreamerLogHelper.this.f12045l;
                Integer numValueOf2 = Integer.valueOf(ijkmediastreamer15 != null ? ijkmediastreamer15.getRenderToDisplayCost() : 0);
                Long lValueOf13 = Long.valueOf(IjkStreamerLogHelper.this.f12044k.m10966a());
                ijkMediaStreamer ijkmediastreamer16 = IjkStreamerLogHelper.this.f12045l;
                Long lValueOf14 = Long.valueOf(ijkmediastreamer16 != null ? ijkmediastreamer16.getAVDiff() : 0L);
                Long lValueOf15 = Long.valueOf((videoPts - this.f12060o) - (jCurrentTimeMillis - this.f12061p));
                ijkMediaStreamer ijkmediastreamer17 = IjkStreamerLogHelper.this.f12045l;
                Long lValueOf16 = Long.valueOf(ijkmediastreamer17 != null ? ijkmediastreamer17.getPacketCacheDuration() : 0L);
                ijkMediaStreamer ijkmediastreamer18 = IjkStreamerLogHelper.this.f12045l;
                Long lValueOf17 = Long.valueOf(ijkmediastreamer18 != null ? ijkmediastreamer18.getFaceDetectionCount() : 0L);
                ijkMediaStreamer ijkmediastreamer19 = IjkStreamerLogHelper.this.f12045l;
                Long lValueOf18 = Long.valueOf(ijkmediastreamer19 != null ? ijkmediastreamer19.getFaceDetectionDuration() : 0L);
                ijkMediaStreamer ijkmediastreamer20 = IjkStreamerLogHelper.this.f12045l;
                Long lValueOf19 = Long.valueOf(ijkmediastreamer20 != null ? ijkmediastreamer20.getCpuVideoProcessingCount() : 0L);
                ijkMediaStreamer ijkmediastreamer21 = IjkStreamerLogHelper.this.f12045l;
                Long lValueOf20 = Long.valueOf(ijkmediastreamer21 != null ? ijkmediastreamer21.getCpuVideoProcessingDuration() : 0L);
                ijkMediaStreamer ijkmediastreamer22 = IjkStreamerLogHelper.this.f12045l;
                Long lValueOf21 = Long.valueOf(ijkmediastreamer22 != null ? ijkmediastreamer22.getGpuVideoProcessingCount() : 0L);
                ijkMediaStreamer ijkmediastreamer23 = IjkStreamerLogHelper.this.f12045l;
                Long lValueOf22 = Long.valueOf(ijkmediastreamer23 != null ? ijkmediastreamer23.getGpuVideoProcessingDuration() : 0L);
                ijkMediaStreamer ijkmediastreamer24 = IjkStreamerLogHelper.this.f12045l;
                Integer numValueOf3 = Integer.valueOf(ijkmediastreamer24 != null ? ijkmediastreamer24.getAudioBitRate() : 0);
                ijkMediaStreamer ijkmediastreamer25 = IjkStreamerLogHelper.this.f12045l;
                Integer numValueOf4 = Integer.valueOf(ijkmediastreamer25 != null ? ijkmediastreamer25.getVideoBitRate() : 0);
                ijkMediaStreamer ijkmediastreamer26 = IjkStreamerLogHelper.this.f12045l;
                Integer numValueOf5 = Integer.valueOf(ijkmediastreamer26 != null ? ijkmediastreamer26.getVideoFrameRate() : 0);
                ijkMediaStreamer ijkmediastreamer27 = IjkStreamerLogHelper.this.f12045l;
                Integer numValueOf6 = Integer.valueOf(ijkmediastreamer27 != null ? ijkmediastreamer27.getVideoFreezeCount() : 0);
                ijkMediaStreamer ijkmediastreamer28 = IjkStreamerLogHelper.this.f12045l;
                Integer numValueOf7 = Integer.valueOf(ijkmediastreamer28 != null ? ijkmediastreamer28.getPublisherVideoWidth() : 0);
                ijkMediaStreamer ijkmediastreamer29 = IjkStreamerLogHelper.this.f12045l;
                Integer numValueOf8 = Integer.valueOf(ijkmediastreamer29 != null ? ijkmediastreamer29.getPublisherVideoHigh() : 0);
                ijkMediaStreamer ijkmediastreamer30 = IjkStreamerLogHelper.this.f12045l;
                Integer numValueOf9 = Integer.valueOf(ijkmediastreamer30 != null ? ijkmediastreamer30.getAvFlag() : 1);
                ijkMediaStreamer ijkmediastreamer31 = IjkStreamerLogHelper.this.f12045l;
                Integer numValueOf10 = Integer.valueOf(ijkmediastreamer31 != null ? ijkmediastreamer31.getRoomType() : 0);
                ijkMediaStreamer ijkmediastreamer32 = IjkStreamerLogHelper.this.f12045l;
                Long lValueOf23 = Long.valueOf(ijkmediastreamer32 != null ? ijkmediastreamer32.getRxbytes() : 0L);
                ijkMediaStreamer ijkmediastreamer33 = IjkStreamerLogHelper.this.f12045l;
                Long lValueOf24 = Long.valueOf(ijkmediastreamer33 != null ? ijkmediastreamer33.getVideoRxbytes() : 0L);
                ijkMediaStreamer ijkmediastreamer34 = IjkStreamerLogHelper.this.f12045l;
                Long lValueOf25 = Long.valueOf(ijkmediastreamer34 != null ? ijkmediastreamer34.getAudioRxbytes() : 0L);
                ijkMediaStreamer ijkmediastreamer35 = IjkStreamerLogHelper.this.f12045l;
                String audioVideoStatics = ijkmediastreamer35 != null ? ijkmediastreamer35.getAudioVideoStatics() : "[(0)]";
                ijkMediaStreamer ijkmediastreamer36 = IjkStreamerLogHelper.this.f12045l;
                this.f12069e.add(mediaReportLogManagerM10844b.m10846d(lValueOf, lValueOf2, lValueOf3, lValueOf4, lValueOf5, lValueOf6, lValueOf7, lValueOf8, lValueOf9, lValueOf10, lValueOf11, lValueOf12, numValueOf, numValueOf2, 0, lValueOf13, lValueOf14, lValueOf15, lValueOf16, "M", lValueOf17, lValueOf18, lValueOf19, lValueOf20, lValueOf21, lValueOf22, numValueOf3, numValueOf4, numValueOf5, numValueOf6, numValueOf7, numValueOf8, numValueOf9, numValueOf10, lValueOf23, lValueOf24, lValueOf25, audioVideoStatics, 0, ijkmediastreamer36 != null ? ijkmediastreamer36.getCPUandMemStatistics() : "0,0"));
                this.f12053h = audioFrameCapture;
                this.f12054i = videoFrameCapture;
                this.f12055j = audioEncoderSizes;
                this.f12056k = videoEncoderSize;
                this.f12057l = videoEncoderPackets;
                this.f12058m = rtmpSendSize;
                this.f12059n = j;
                this.f12060o = videoPts;
                this.f12061p = jCurrentTimeMillis;
                super.mo10834c();
            }

            @Override // tv.danmaku.ijk.media.streamer.LoopLogReporter
            /* JADX INFO: renamed from: d */
            public void mo10835d() {
                if (this.f12069e.size() == 0) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                int i3 = 0;
                while (true) {
                    int size = this.f12069e.size();
                    ArrayList<String> arrayList = this.f12069e;
                    if (i3 >= size) {
                        arrayList.clear();
                        MediaReportLogManager.m10844b().m10848f("v2.pushWatch", "", IjkStreamerLogHelper.this.f12036c, sb.toString(), IjkStreamerLogHelper.this.f12037d, IjkStreamerLogHelper.this.m10826e());
                        return;
                    } else {
                        sb.append(arrayList.get(i3));
                        i3++;
                    }
                }
            }

            @Override // tv.danmaku.ijk.media.streamer.LoopLogReporter
            /* JADX INFO: renamed from: i */
            public void mo10836i() {
                super.mo10836i();
                this.f12053h = 0L;
                this.f12054i = 0L;
                this.f12055j = 0L;
                this.f12056k = 0L;
                this.f12057l = 0L;
                this.f12058m = 0L;
                this.f12059n = 0L;
                this.f12060o = 0L;
                this.f12061p = 0L;
                this.f12062q = true;
                this.f12063r = 0L;
            }
        };
        this.f12052s = new HashSet<>();
        this.f12045l = ijkmediastreamer;
        this.f12038e = i;
        this.f12039f = i2;
        this.f12051r.m10839e(true);
        this.f12051r.m10840f(this.f12038e);
        this.f12051r.m10841g(this.f12039f);
        this.f12034a = context;
        MediaReportLogManager.m10844b().m10849g(logUploadCallBack);
        this.f12044k = new NetUtil(this.f12034a);
    }

    /* JADX INFO: renamed from: e */
    public String m10826e() {
        return this.f12040g;
    }

    /* JADX INFO: renamed from: f */
    public void m10827f() {
        String str = this.f12035b;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        this.f12041h = System.currentTimeMillis();
        MediaReportLogManager.m10844b().m10848f("v2.pushBufferStart", str2, this.f12036c, MediaReportLogManager.m10844b().m10846d(Long.valueOf(this.f12041h), 0), this.f12037d, m10826e());
    }

    /* JADX INFO: renamed from: g */
    public void m10828g() {
        String str = this.f12035b;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        MediaReportLogManager.m10844b().m10848f("v2.pushBufferStop", str2, this.f12036c, MediaReportLogManager.m10844b().m10846d(Long.valueOf(jCurrentTimeMillis), Long.valueOf(MediaReportLogManager.m10843a(jCurrentTimeMillis, this.f12041h))), this.f12037d, m10826e());
    }

    /* JADX INFO: renamed from: h */
    public synchronized void m10829h(String str) {
        try {
            if (this.f12045l == null) {
                return;
            }
            logStatus logstatus = this.f12047n;
            logStatus logstatus2 = logStatus.PUSHSTART;
            if (logstatus == logstatus2) {
                return;
            }
            String str2 = this.f12035b;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = this.f12044k.m10969d() ? "wifi" : "other";
            MediaReportLogManager.m10844b().m10848f("v2.pushStart", str2, this.f12036c, MediaReportLogManager.m10844b().m10846d(Long.valueOf(System.currentTimeMillis()), TextUtils.isEmpty(this.f12045l.getServerIpAddr()) ? StringUtil.ALL_INTERFACES : this.f12045l.getServerIpAddr(), Long.valueOf(this.f12045l.getConnectTime()), Long.valueOf(this.f12045l.getFirstAuidoPacketTime()), Long.valueOf(this.f12045l.getFirstVideoPacketTime()), Long.valueOf(this.f12045l.getFirstSendPacketTime()), str3, 0, str == null ? 0 : str, 1, StringUtil.ALL_INTERFACES), this.f12037d, m10826e());
            this.f12047n = logstatus2;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: i */
    public synchronized void m10830i(int i, String str) {
        String strM10846d;
        if (this.f12047n == logStatus.PUSHSTOP) {
            return;
        }
        if (this.f12045l == null) {
            strM10846d = MediaReportLogManager.m10844b().m10846d(Long.valueOf(System.currentTimeMillis()), Integer.valueOf(i), 0, "0", str);
        } else {
            try {
                strM10846d = MediaReportLogManager.m10844b().m10846d(Long.valueOf(System.currentTimeMillis()), Integer.valueOf(i), Long.valueOf(this.f12045l.getRtmpSendSize()), TextUtils.isEmpty(this.f12045l.getServerIpAddr()) ? "0" : this.f12045l.getServerIpAddr(), str);
            } catch (Exception e) {
                e.printStackTrace();
                strM10846d = MediaReportLogManager.m10844b().m10846d(Long.valueOf(System.currentTimeMillis()), Integer.valueOf(i), 0, "0", str);
            }
        }
        String str2 = strM10846d;
        MediaReportLogManager.m10844b().m10848f("v2.pushStop", "", this.f12036c, str2, this.f12037d, m10826e());
        MediaReportLogManager.m10844b().m10848f("v2.pushStop", "", this.f12036c, str2, this.f12037d, m10826e());
        this.f12047n = logStatus.PUSHSTOP;
    }

    /* JADX INFO: renamed from: j */
    public synchronized void m10831j() {
        try {
            m10833l();
            MediaReportLogManager.m10844b().m10847e();
            NetUtil netUtil = this.f12044k;
            if (netUtil != null) {
                netUtil.m10970e();
                this.f12044k = null;
            }
            this.f12045l = null;
            this.f12034a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m10832k() {
        logStatus logstatus = this.f12046m;
        logStatus logstatus2 = logStatus.PUSHSTARTWATCH;
        if (logstatus == logstatus2) {
            return;
        }
        this.f12051r.m10842h();
        this.f12046m = logstatus2;
    }

    /* JADX INFO: renamed from: l */
    public void m10833l() {
        logStatus logstatus = this.f12046m;
        logStatus logstatus2 = logStatus.PUSHSTOPWATCH;
        if (logstatus == logstatus2) {
            return;
        }
        this.f12051r.mo10836i();
        this.f12046m = logstatus2;
    }
}
