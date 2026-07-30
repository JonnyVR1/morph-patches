package com.immomo.moment.mediautils;

import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import com.core.glcore.util.ErrorCode;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.util.MDLogTag;
import com.p046p1.mobile.putong.live.base.arch.card.cardmodel.videoFeed.LiveVideoFeedSmallStyleCardView;
import com.tantanapp.ijk.media.player.misc.IMediaFormat;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import p149l.lmw;
import p149l.tmw;
import p149l.ty00;
import p149l.u460;
import p149l.zzf0;

/* JADX INFO: renamed from: com.immomo.moment.mediautils.p */
/* JADX INFO: loaded from: classes7.dex */
public class C3859p {

    /* JADX INFO: renamed from: f */
    private LinkedList<u460> f13601f;

    /* JADX INFO: renamed from: g */
    private LinkedList<u460> f13602g;

    /* JADX INFO: renamed from: a */
    private final String f13596a = "MediaSplicingThread";

    /* JADX INFO: renamed from: b */
    private List<String> f13597b = null;

    /* JADX INFO: renamed from: c */
    private String f13598c = null;

    /* JADX INFO: renamed from: d */
    private ty00 f13599d = null;

    /* JADX INFO: renamed from: e */
    private C3853j f13600e = null;

    /* JADX INFO: renamed from: h */
    Object f13603h = new Object();

    /* JADX INFO: renamed from: i */
    Object f13604i = new Object();

    /* JADX INFO: renamed from: j */
    Object f13605j = new Object();

    /* JADX INFO: renamed from: k */
    private Thread f13606k = null;

    /* JADX INFO: renamed from: l */
    private Thread f13607l = null;

    /* JADX INFO: renamed from: m */
    private int f13608m = 0;

    /* JADX INFO: renamed from: n */
    private int f13609n = 0;

    /* JADX INFO: renamed from: o */
    private int f13610o = 0;

    /* JADX INFO: renamed from: p */
    private boolean f13611p = false;

    /* JADX INFO: renamed from: q */
    private boolean f13612q = false;

    /* JADX INFO: renamed from: r */
    private boolean f13613r = false;

    /* JADX INFO: renamed from: s */
    private long f13614s = 10000000;

    /* JADX INFO: renamed from: t */
    private int f13615t = 0;

    /* JADX INFO: renamed from: u */
    private int f13616u = LiveVideoFeedSmallStyleCardView.DISTANCE_DIFFERENT_CITY;

    /* JADX INFO: renamed from: v */
    private lmw f13617v = null;

    /* JADX INFO: renamed from: w */
    private tmw f13618w = null;

    /* JADX INFO: renamed from: x */
    private Runnable f13619x = new b();

    /* JADX INFO: renamed from: y */
    private Runnable f13620y = new c();

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.p$a */
    public class a implements AbstractC3849f.a {
        public a() {
        }

        @Override // com.immomo.moment.mediautils.AbstractC3849f.a
        /* JADX INFO: renamed from: a */
        public void mo18699a(String str) {
            if (C3859p.this.f13618w != null) {
                C3859p.this.f13618w.onFail(ErrorCode.DECODE_VIDEO_INIT_MUXER_FAILED, "init media demuxer failed !!! Exception:" + str);
            }
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.p$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a */
        private int f13622a = 0;

        /* JADX INFO: renamed from: b */
        int f13623b = 1;

        /* JADX INFO: renamed from: c */
        long f13624c = 0;

        /* JADX INFO: renamed from: d */
        long f13625d = 0;

        /* JADX INFO: renamed from: e */
        final int f13626e = 10;

        /* JADX INFO: renamed from: f */
        final int f13627f = 5;

        /* JADX INFO: renamed from: g */
        private u460 f13628g;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!C3859p.this.f13611p) {
                synchronized (C3859p.this.f13603h) {
                    this.f13628g = (u460) C3859p.this.f13601f.pollFirst();
                }
                if (C3859p.this.f13602g.size() >= 10) {
                    try {
                        Thread.sleep(5L);
                    } catch (InterruptedException e) {
                        MDLog.m7391e(MDLogTag.MEDIA_SPLICE_TAG, "Running demuxer failed when splice video !!! " + e.toString());
                        if (C3859p.this.f13618w != null) {
                            C3859p.this.f13618w.onFail(1005, "Running demuxer failed when splice video !!! " + e.toString());
                        }
                    }
                } else {
                    u460 u460VarM18865i = C3859p.this.f13600e.m18865i(this.f13628g);
                    this.f13628g = u460VarM18865i;
                    if (u460VarM18865i != null) {
                        synchronized (C3859p.this.f13604i) {
                            this.f13622a += this.f13628g.m191673b().size;
                            this.f13628g.m191673b().presentationTimeUs += this.f13624c;
                            this.f13625d = this.f13628g.m191673b().presentationTimeUs;
                            C3859p.this.f13602g.offer(this.f13628g);
                            MDLog.m7395i(MDLogTag.MEDIA_SPLICE_TAG, "total size is " + this.f13622a + " cur size=" + this.f13628g.m191673b().size + " cur pts=" + this.f13625d + " correct=" + this.f13624c);
                        }
                    } else {
                        if (this.f13623b >= C3859p.this.f13597b.size()) {
                            break;
                        }
                        this.f13624c = this.f13625d;
                        C3859p.this.f13600e.m18866j((String) C3859p.this.f13597b.get(this.f13623b));
                        this.f13623b++;
                    }
                }
            }
            C3859p.this.f13612q = true;
        }
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.p$c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a */
        private final int f13630a = 10;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            u460 u460Var;
            int i = 0;
            while (!C3859p.this.f13611p) {
                synchronized (C3859p.this.f13604i) {
                    u460Var = (u460) C3859p.this.f13602g.pollFirst();
                }
                if (u460Var != null) {
                    int iM191674c = u460Var.m191674c();
                    long j = u460Var.m191673b().presentationTimeUs;
                    i += u460Var.m191673b().size;
                    if (iM191674c == 1) {
                        C3859p.this.f13599d.mo191000f(C3859p.this.f13609n, u460Var.m191672a(), u460Var.m191673b());
                    } else if (iM191674c == 0) {
                        C3859p.this.f13599d.mo191000f(C3859p.this.f13608m, u460Var.m191672a(), u460Var.m191673b());
                    }
                    synchronized (C3859p.this.f13603h) {
                        C3859p.this.f13601f.offer(u460Var);
                    }
                    if (C3859p.this.f13617v != null) {
                        MDLog.m7391e(MDLogTag.MEDIA_SPLICE_TAG, "ProcessedSize=" + i + " totalSize=" + C3859p.this.f13615t);
                        C3859p.this.f13617v.onProcessProgress((((float) i) * 1.0f) / ((float) C3859p.this.f13615t));
                    }
                } else {
                    try {
                        Thread.sleep(10L);
                    } catch (InterruptedException e) {
                        MDLog.m7395i(MDLogTag.MEDIA_SPLICE_TAG, "Running muxer failed when splice video !!! " + e.toString());
                        if (C3859p.this.f13618w != null) {
                            C3859p.this.f13618w.onFail(1005, "Running muxer failed when splice video !!! " + e.toString());
                        }
                    }
                    if (C3859p.this.f13612q) {
                        break;
                    }
                }
            }
            if (!C3859p.this.f13611p) {
                C3859p.this.f13599d.mo190999e();
                C3859p.this.f13600e.mo18759e();
            }
            if (C3859p.this.f13617v != null) {
                C3859p.this.f13617v.onProcessProgress(1.0f);
                C3859p.this.f13617v.mo61016a();
            }
            C3859p.this.m19025o();
        }
    }

    public C3859p() {
        this.f13601f = null;
        this.f13602g = null;
        this.f13601f = new LinkedList<>();
        this.f13602g = new LinkedList<>();
    }

    /* JADX INFO: renamed from: n */
    private boolean m19024n(List<String> list) {
        if (list == null) {
            return false;
        }
        for (String str : list) {
            File file = new File(str);
            if (!file.exists()) {
                MDLog.m7391e(MDLogTag.MEDIA_SPLICE_TAG, str + " File not exist !!");
                return false;
            }
            try {
                this.f13615t += new FileInputStream(file).available();
            } catch (IOException e) {
                MDLog.m7391e(MDLogTag.MEDIA_SPLICE_TAG, e.getMessage());
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    /* JADX INFO: renamed from: o */
    public void m19025o() {
        Thread thread;
        synchronized (this.f13605j) {
            if (!this.f13611p) {
                this.f13611p = true;
                Thread thread2 = this.f13606k;
                if (thread2 != null) {
                    try {
                        thread2.join(200L);
                    } catch (InterruptedException e) {
                        MDLog.m7391e(MDLogTag.MEDIA_SPLICE_TAG, "Release failed when splice video !!! " + e.toString());
                        tmw tmwVar = this.f13618w;
                        if (tmwVar != null) {
                            tmwVar.onFail(1006, "Release failed when splice video !!! " + e.toString());
                        }
                    }
                    this.f13606k = null;
                    thread = this.f13607l;
                    if (thread != null) {
                        try {
                            thread.join(50L);
                        } catch (InterruptedException e2) {
                            MDLog.m7391e(MDLogTag.MEDIA_SPLICE_TAG, "Release failed when splice video !!! " + e2.toString());
                            tmw tmwVar2 = this.f13618w;
                            if (tmwVar2 != null) {
                                tmwVar2.onFail(1006, "Release failed when splice video !!! " + e2.toString());
                            }
                        }
                        this.f13607l = null;
                    }
                    this.f13599d.mo190999e();
                    this.f13600e.mo18759e();
                    this.f13599d = null;
                    this.f13600e = null;
                    this.f13613r = false;
                } else {
                    thread = this.f13607l;
                    if (thread != null) {
                        thread.join(50L);
                        this.f13607l = null;
                    }
                    this.f13599d.mo190999e();
                    this.f13600e.mo18759e();
                    this.f13599d = null;
                    this.f13600e = null;
                    this.f13613r = false;
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public void m19026p(tmw tmwVar) {
        this.f13618w = tmwVar;
    }

    /* JADX INFO: renamed from: q */
    public void m19027q(lmw lmwVar) {
        synchronized (this.f13605j) {
            this.f13617v = lmwVar;
        }
    }

    /* JADX INFO: renamed from: r */
    public boolean m19028r(List<String> list, String str) {
        int iIntValue;
        synchronized (this.f13605j) {
            if (list != null) {
                try {
                    if (list.size() > 0 && str != null) {
                        if (!this.f13613r) {
                            this.f13597b = list;
                            this.f13598c = str;
                            if (!m19024n(list)) {
                                MDLog.m7391e(MDLogTag.MEDIA_SPLICE_TAG, "Check Splice media file list error !");
                                return false;
                            }
                            C3853j c3853j = this.f13600e;
                            if (c3853j != null) {
                                c3853j.mo18759e();
                                this.f13600e = null;
                            }
                            C3853j c3853j2 = new C3853j();
                            this.f13600e = c3853j2;
                            c3853j2.m18762h(new a());
                            if (!this.f13600e.mo18757c(this.f13597b.get(0))) {
                                MDLog.m7391e(MDLogTag.MEDIA_SPLICE_TAG, "init media demuxer failed !!!");
                                return false;
                            }
                            try {
                                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                                mediaMetadataRetriever.setDataSource(this.f13597b.get(0));
                                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(24);
                                iIntValue = (strExtractMetadata == null || strExtractMetadata.length() <= 0) ? 0 : Integer.valueOf(strExtractMetadata).intValue();
                                try {
                                    mediaMetadataRetriever.release();
                                } catch (Exception e) {
                                    e = e;
                                    MDLog.m7391e(MDLogTag.MEDIA_SPLICE_TAG, "Get the video info failed when splice init !!! " + e.toString());
                                    tmw tmwVar = this.f13618w;
                                    if (tmwVar != null) {
                                        tmwVar.onFail(1004, "Get the video info failed when splice init !!! " + e.toString());
                                    }
                                }
                            } catch (Exception e2) {
                                e = e2;
                                iIntValue = 0;
                            }
                            List<MediaFormat> listMo18756b = this.f13600e.mo18756b();
                            if (listMo18756b.size() <= 0) {
                                MDLog.m7391e(MDLogTag.MEDIA_SPLICE_TAG, "Invalid file type, no media info !!");
                                return false;
                            }
                            for (MediaFormat mediaFormat : listMo18756b) {
                                if (mediaFormat.getString(IMediaFormat.KEY_MIME).startsWith("video")) {
                                    this.f13610o |= 2;
                                } else if (mediaFormat.getString(IMediaFormat.KEY_MIME).startsWith("audio")) {
                                    this.f13610o |= 1;
                                }
                            }
                            ty00 ty00Var = this.f13599d;
                            if (ty00Var != null) {
                                ty00Var.mo190999e();
                                this.f13599d = null;
                            }
                            try {
                                this.f13599d = new ty00(this.f13598c, this.f13610o);
                                for (MediaFormat mediaFormat2 : listMo18756b) {
                                    if (mediaFormat2.getString(IMediaFormat.KEY_MIME).startsWith("video")) {
                                        this.f13609n = this.f13599d.mo190995a(mediaFormat2, 2);
                                        if (iIntValue != 0) {
                                            this.f13599d.mo190997c(iIntValue);
                                        }
                                    } else if (mediaFormat2.getString(IMediaFormat.KEY_MIME).startsWith("audio")) {
                                        this.f13608m = this.f13599d.mo190995a(mediaFormat2, 1);
                                    }
                                    if (!this.f13600e.mo18761g(mediaFormat2)) {
                                        return false;
                                    }
                                }
                            } catch (Exception e3) {
                                MDLog.m7391e(MDLogTag.MEDIA_SPLICE_TAG, "Create muxer failed when splice init !!! " + e3.getMessage());
                                tmw tmwVar2 = this.f13618w;
                                if (tmwVar2 != null) {
                                    tmwVar2.onFail(1004, "Create muxer failed when splice init !!! " + e3.toString());
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
            MDLog.m7391e(MDLogTag.MEDIA_SPLICE_TAG, "splicingList is null or the outpath is null !!!");
            return false;
        }
    }

    /* JADX INFO: renamed from: s */
    public void m19029s() {
        synchronized (this.f13605j) {
            try {
                ty00 ty00Var = this.f13599d;
                if (ty00Var != null && this.f13600e != null && !this.f13613r) {
                    ty00Var.mo190998d();
                    this.f13606k = new Thread(this.f13619x, "Splicing" + zzf0.m221018b());
                    this.f13607l = new Thread(this.f13620y, "Muxing" + zzf0.m221018b());
                    this.f13606k.start();
                    this.f13607l.start();
                    this.f13613r = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
