package com.immomo.moment.mediautils;

import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import com.core.glcore.util.ErrorCode;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;
import com.p051p1.mobile.putong.live.base.arch.card.cardmodel.videoFeed.LiveVideoFeedSmallStyleCardView;
import com.tantanapp.ijk.media.player.misc.IMediaFormat;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import p153l.ad60;
import p153l.d710;
import p153l.g8g0;
import p153l.kpw;
import p153l.spw;

/* JADX INFO: renamed from: com.immomo.moment.mediautils.p */
/* JADX INFO: loaded from: classes7.dex */
public class C4002p {

    /* JADX INFO: renamed from: f */
    private LinkedList<ad60> f14295f;

    /* JADX INFO: renamed from: g */
    private LinkedList<ad60> f14296g;

    /* JADX INFO: renamed from: a */
    private final String f14290a = "MediaSplicingThread";

    /* JADX INFO: renamed from: b */
    private List<String> f14291b = null;

    /* JADX INFO: renamed from: c */
    private String f14292c = null;

    /* JADX INFO: renamed from: d */
    private d710 f14293d = null;

    /* JADX INFO: renamed from: e */
    private C3996j f14294e = null;

    /* JADX INFO: renamed from: h */
    Object f14297h = new Object();

    /* JADX INFO: renamed from: i */
    Object f14298i = new Object();

    /* JADX INFO: renamed from: j */
    Object f14299j = new Object();

    /* JADX INFO: renamed from: k */
    private Thread f14300k = null;

    /* JADX INFO: renamed from: l */
    private Thread f14301l = null;

    /* JADX INFO: renamed from: m */
    private int f14302m = 0;

    /* JADX INFO: renamed from: n */
    private int f14303n = 0;

    /* JADX INFO: renamed from: o */
    private int f14304o = 0;

    /* JADX INFO: renamed from: p */
    private boolean f14305p = false;

    /* JADX INFO: renamed from: q */
    private boolean f14306q = false;

    /* JADX INFO: renamed from: r */
    private boolean f14307r = false;

    /* JADX INFO: renamed from: s */
    private long f14308s = 10000000;

    /* JADX INFO: renamed from: t */
    private int f14309t = 0;

    /* JADX INFO: renamed from: u */
    private int f14310u = LiveVideoFeedSmallStyleCardView.DISTANCE_DIFFERENT_CITY;

    /* JADX INFO: renamed from: v */
    private kpw f14311v = null;

    /* JADX INFO: renamed from: w */
    private spw f14312w = null;

    /* JADX INFO: renamed from: x */
    private Runnable f14313x = new b();

    /* JADX INFO: renamed from: y */
    private Runnable f14314y = new c();

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.p$a */
    public class a implements AbstractC3992f.a {
        public a() {
        }

        @Override // com.immomo.moment.mediautils.AbstractC3992f.a
        /* JADX INFO: renamed from: a */
        public void mo19679a(String str) {
            if (C4002p.this.f14312w != null) {
                C4002p.this.f14312w.onFail(ErrorCode.DECODE_VIDEO_INIT_MUXER_FAILED, "init media demuxer failed !!! Exception:" + str);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.p$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a */
        private int f14316a = 0;

        /* JADX INFO: renamed from: b */
        int f14317b = 1;

        /* JADX INFO: renamed from: c */
        long f14318c = 0;

        /* JADX INFO: renamed from: d */
        long f14319d = 0;

        /* JADX INFO: renamed from: e */
        final int f14320e = 10;

        /* JADX INFO: renamed from: f */
        final int f14321f = 5;

        /* JADX INFO: renamed from: g */
        private ad60 f14322g;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!C4002p.this.f14305p) {
                synchronized (C4002p.this.f14297h) {
                    this.f14322g = (ad60) C4002p.this.f14295f.pollFirst();
                }
                if (C4002p.this.f14296g.size() >= 10) {
                    try {
                        Thread.sleep(5L);
                    } catch (InterruptedException e) {
                        MDLog.m7445e(MDLogTag.MEDIA_SPLICE_TAG, "Running demuxer failed when splice video !!! " + e.toString());
                        if (C4002p.this.f14312w != null) {
                            C4002p.this.f14312w.onFail(1005, "Running demuxer failed when splice video !!! " + e.toString());
                        }
                    }
                } else {
                    ad60 ad60VarM19845i = C4002p.this.f14294e.m19845i(this.f14322g);
                    this.f14322g = ad60VarM19845i;
                    if (ad60VarM19845i != null) {
                        synchronized (C4002p.this.f14298i) {
                            this.f14316a += this.f14322g.m97016b().size;
                            this.f14322g.m97016b().presentationTimeUs += this.f14318c;
                            this.f14319d = this.f14322g.m97016b().presentationTimeUs;
                            C4002p.this.f14296g.offer(this.f14322g);
                            MDLog.m7449i(MDLogTag.MEDIA_SPLICE_TAG, "total size is " + this.f14316a + " cur size=" + this.f14322g.m97016b().size + " cur pts=" + this.f14319d + " correct=" + this.f14318c);
                        }
                    } else {
                        if (this.f14317b >= C4002p.this.f14291b.size()) {
                            break;
                        }
                        this.f14318c = this.f14319d;
                        C4002p.this.f14294e.m19846j((String) C4002p.this.f14291b.get(this.f14317b));
                        this.f14317b++;
                    }
                }
            }
            C4002p.this.f14306q = true;
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.p$c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a */
        private final int f14324a = 10;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ad60 ad60Var;
            int i = 0;
            while (!C4002p.this.f14305p) {
                synchronized (C4002p.this.f14298i) {
                    ad60Var = (ad60) C4002p.this.f14296g.pollFirst();
                }
                if (ad60Var != null) {
                    int iM97017c = ad60Var.m97017c();
                    long j = ad60Var.m97016b().presentationTimeUs;
                    i += ad60Var.m97016b().size;
                    if (iM97017c == 1) {
                        C4002p.this.f14293d.mo114583f(C4002p.this.f14303n, ad60Var.m97015a(), ad60Var.m97016b());
                    } else if (iM97017c == 0) {
                        C4002p.this.f14293d.mo114583f(C4002p.this.f14302m, ad60Var.m97015a(), ad60Var.m97016b());
                    }
                    synchronized (C4002p.this.f14297h) {
                        C4002p.this.f14295f.offer(ad60Var);
                    }
                    if (C4002p.this.f14311v != null) {
                        MDLog.m7445e(MDLogTag.MEDIA_SPLICE_TAG, "ProcessedSize=" + i + " totalSize=" + C4002p.this.f14309t);
                        C4002p.this.f14311v.onProcessProgress((((float) i) * 1.0f) / ((float) C4002p.this.f14309t));
                    }
                } else {
                    try {
                        Thread.sleep(10L);
                    } catch (InterruptedException e) {
                        MDLog.m7449i(MDLogTag.MEDIA_SPLICE_TAG, "Running muxer failed when splice video !!! " + e.toString());
                        if (C4002p.this.f14312w != null) {
                            C4002p.this.f14312w.onFail(1005, "Running muxer failed when splice video !!! " + e.toString());
                        }
                    }
                    if (C4002p.this.f14306q) {
                        break;
                    }
                }
            }
            if (!C4002p.this.f14305p) {
                C4002p.this.f14293d.mo114582e();
                C4002p.this.f14294e.mo19739e();
            }
            if (C4002p.this.f14311v != null) {
                C4002p.this.f14311v.onProcessProgress(1.0f);
                C4002p.this.f14311v.mo62200a();
            }
            C4002p.this.m20005o();
        }
    }

    public C4002p() {
        this.f14295f = null;
        this.f14296g = null;
        this.f14295f = new LinkedList<>();
        this.f14296g = new LinkedList<>();
    }

    /* JADX INFO: renamed from: n */
    private boolean m20004n(List<String> list) {
        if (list == null) {
            return false;
        }
        for (String str : list) {
            File file = new File(str);
            if (!file.exists()) {
                MDLog.m7445e(MDLogTag.MEDIA_SPLICE_TAG, str + " File not exist !!");
                return false;
            }
            try {
                this.f14309t += new FileInputStream(file).available();
            } catch (IOException e) {
                MDLog.m7445e(MDLogTag.MEDIA_SPLICE_TAG, e.getMessage());
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    /* JADX INFO: renamed from: o */
    public void m20005o() {
        Thread thread;
        synchronized (this.f14299j) {
            if (!this.f14305p) {
                this.f14305p = true;
                Thread thread2 = this.f14300k;
                if (thread2 != null) {
                    try {
                        thread2.join(200L);
                    } catch (InterruptedException e) {
                        MDLog.m7445e(MDLogTag.MEDIA_SPLICE_TAG, "Release failed when splice video !!! " + e.toString());
                        spw spwVar = this.f14312w;
                        if (spwVar != null) {
                            spwVar.onFail(1006, "Release failed when splice video !!! " + e.toString());
                        }
                    }
                    this.f14300k = null;
                    thread = this.f14301l;
                    if (thread != null) {
                        try {
                            thread.join(50L);
                        } catch (InterruptedException e2) {
                            MDLog.m7445e(MDLogTag.MEDIA_SPLICE_TAG, "Release failed when splice video !!! " + e2.toString());
                            spw spwVar2 = this.f14312w;
                            if (spwVar2 != null) {
                                spwVar2.onFail(1006, "Release failed when splice video !!! " + e2.toString());
                            }
                        }
                        this.f14301l = null;
                    }
                    this.f14293d.mo114582e();
                    this.f14294e.mo19739e();
                    this.f14293d = null;
                    this.f14294e = null;
                    this.f14307r = false;
                } else {
                    thread = this.f14301l;
                    if (thread != null) {
                        thread.join(50L);
                        this.f14301l = null;
                    }
                    this.f14293d.mo114582e();
                    this.f14294e.mo19739e();
                    this.f14293d = null;
                    this.f14294e = null;
                    this.f14307r = false;
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public void m20006p(spw spwVar) {
        this.f14312w = spwVar;
    }

    /* JADX INFO: renamed from: q */
    public void m20007q(kpw kpwVar) {
        synchronized (this.f14299j) {
            this.f14311v = kpwVar;
        }
    }

    /* JADX INFO: renamed from: r */
    public boolean m20008r(List<String> list, String str) {
        int iIntValue;
        synchronized (this.f14299j) {
            if (list != null) {
                try {
                    if (list.size() > 0 && str != null) {
                        if (!this.f14307r) {
                            this.f14291b = list;
                            this.f14292c = str;
                            if (!m20004n(list)) {
                                MDLog.m7445e(MDLogTag.MEDIA_SPLICE_TAG, "Check Splice media file list error !");
                                return false;
                            }
                            C3996j c3996j = this.f14294e;
                            if (c3996j != null) {
                                c3996j.mo19739e();
                                this.f14294e = null;
                            }
                            C3996j c3996j2 = new C3996j();
                            this.f14294e = c3996j2;
                            c3996j2.m19742h(new a());
                            if (!this.f14294e.mo19737c(this.f14291b.get(0))) {
                                MDLog.m7445e(MDLogTag.MEDIA_SPLICE_TAG, "init media demuxer failed !!!");
                                return false;
                            }
                            try {
                                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                                mediaMetadataRetriever.setDataSource(this.f14291b.get(0));
                                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(24);
                                iIntValue = (strExtractMetadata == null || strExtractMetadata.length() <= 0) ? 0 : Integer.valueOf(strExtractMetadata).intValue();
                                try {
                                    mediaMetadataRetriever.release();
                                } catch (Exception e) {
                                    e = e;
                                    MDLog.m7445e(MDLogTag.MEDIA_SPLICE_TAG, "Get the video info failed when splice init !!! " + e.toString());
                                    spw spwVar = this.f14312w;
                                    if (spwVar != null) {
                                        spwVar.onFail(1004, "Get the video info failed when splice init !!! " + e.toString());
                                    }
                                }
                            } catch (Exception e2) {
                                e = e2;
                                iIntValue = 0;
                            }
                            List<MediaFormat> listMo19736b = this.f14294e.mo19736b();
                            if (listMo19736b.size() <= 0) {
                                MDLog.m7445e(MDLogTag.MEDIA_SPLICE_TAG, "Invalid file type, no media info !!");
                                return false;
                            }
                            for (MediaFormat mediaFormat : listMo19736b) {
                                if (mediaFormat.getString(IMediaFormat.KEY_MIME).startsWith("video")) {
                                    this.f14304o |= 2;
                                } else if (mediaFormat.getString(IMediaFormat.KEY_MIME).startsWith("audio")) {
                                    this.f14304o |= 1;
                                }
                            }
                            d710 d710Var = this.f14293d;
                            if (d710Var != null) {
                                d710Var.mo114582e();
                                this.f14293d = null;
                            }
                            try {
                                this.f14293d = new d710(this.f14292c, this.f14304o);
                                for (MediaFormat mediaFormat2 : listMo19736b) {
                                    if (mediaFormat2.getString(IMediaFormat.KEY_MIME).startsWith("video")) {
                                        this.f14303n = this.f14293d.mo114578a(mediaFormat2, 2);
                                        if (iIntValue != 0) {
                                            this.f14293d.mo114580c(iIntValue);
                                        }
                                    } else if (mediaFormat2.getString(IMediaFormat.KEY_MIME).startsWith("audio")) {
                                        this.f14302m = this.f14293d.mo114578a(mediaFormat2, 1);
                                    }
                                    if (!this.f14294e.mo19741g(mediaFormat2)) {
                                        return false;
                                    }
                                }
                            } catch (Exception e3) {
                                MDLog.m7445e(MDLogTag.MEDIA_SPLICE_TAG, "Create muxer failed when splice init !!! " + e3.getMessage());
                                spw spwVar2 = this.f14312w;
                                if (spwVar2 != null) {
                                    spwVar2.onFail(1004, "Create muxer failed when splice init !!! " + e3.toString());
                                }
                                return false;
                            }
                        }
                        return true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            MDLog.m7445e(MDLogTag.MEDIA_SPLICE_TAG, "splicingList is null or the outpath is null !!!");
            return false;
        }
    }

    /* JADX INFO: renamed from: s */
    public void m20009s() {
        synchronized (this.f14299j) {
            try {
                d710 d710Var = this.f14293d;
                if (d710Var != null && this.f14294e != null && !this.f14307r) {
                    d710Var.mo114581d();
                    this.f14300k = new Thread(this.f14313x, "Splicing" + g8g0.m129407b());
                    this.f14301l = new Thread(this.f14314y, "Muxing" + g8g0.m129407b());
                    this.f14300k.start();
                    this.f14301l.start();
                    this.f14307r = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
