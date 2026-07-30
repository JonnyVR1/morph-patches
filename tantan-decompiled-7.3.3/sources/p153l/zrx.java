package p153l;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.util.Log;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import com.clevertap.android.sdk.Constants;
import com.immomo.medialog.LogLevel;
import com.tantanapp.ijk.media.player.misc.IMediaFormat;
import java.nio.ByteBuffer;
import java.security.InvalidParameterException;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes8.dex */
public class zrx {

    /* JADX INFO: renamed from: e */
    private g220 f205815e;

    /* JADX INFO: renamed from: i */
    private ByteBuffer[] f205819i;

    /* JADX INFO: renamed from: a */
    private final String f205811a = "Mp4MuxerWrapper";

    /* JADX INFO: renamed from: b */
    private final String f205812b = "video";

    /* JADX INFO: renamed from: c */
    private final String f205813c = "audio";

    /* JADX INFO: renamed from: d */
    private MediaCodec f205814d = null;

    /* JADX INFO: renamed from: f */
    private dyx f205816f = null;

    /* JADX INFO: renamed from: g */
    private Surface f205817g = null;

    /* JADX INFO: renamed from: h */
    private String f205818h = null;

    /* JADX INFO: renamed from: j */
    private LinkedBlockingQueue<oxd0> f205820j = new LinkedBlockingQueue<>();

    /* JADX INFO: renamed from: k */
    private int f205821k = -1;

    /* JADX INFO: renamed from: l */
    private int f205822l = -1;

    /* JADX INFO: renamed from: m */
    private volatile boolean f205823m = false;

    /* JADX INFO: renamed from: n */
    private Thread f205824n = null;

    /* JADX INFO: renamed from: o */
    private Object f205825o = new Object();

    /* JADX INFO: renamed from: l.zrx$a */
    public class RunnableC21875a implements Runnable {

        /* JADX INFO: renamed from: a */
        private long f205826a = 10000;

        public RunnableC21875a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.interrupted() && zrx.this.f205823m) {
                try {
                    if (zrx.this.f205820j.size() > 0) {
                        oxd0 oxd0Var = (oxd0) zrx.this.f205820j.take();
                        if (oxd0Var == null || oxd0Var.f149639b == null) {
                            Thread.sleep(5L);
                        } else {
                            int iDequeueInputBuffer = zrx.this.f205814d.dequeueInputBuffer(this.f205826a);
                            if (iDequeueInputBuffer >= 0) {
                                zrx.this.f205819i[iDequeueInputBuffer].put(oxd0Var.f149639b);
                                zrx.this.f205819i[iDequeueInputBuffer].flip();
                                zrx.this.f205814d.queueInputBuffer(iDequeueInputBuffer, 0, oxd0Var.f149639b.limit(), oxd0Var.m169688d(), 0);
                                oxd0Var.m169690f();
                            }
                        }
                    } else {
                        Thread.sleep(5L);
                    }
                } catch (Exception e) {
                    Log.e("Mp4MuxerWrapper", "MediaCodec deque or queue buffer error ! [" + e.toString() + Constants.AES_SUFFIX);
                    p4f.m170561a(4097);
                }
            }
            Log.e("Mp4MuxerWrapper", "");
        }
    }

    public zrx(g220 g220Var) {
        this.f205815e = null;
        if (g220Var == null) {
            throw new InvalidParameterException("mp4MuxerWrapper format is null");
        }
        this.f205815e = g220Var;
    }

    /* JADX INFO: renamed from: i */
    private MediaCodecInfo m221232i(String str) {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                for (String str2 : codecInfoAt.getSupportedTypes()) {
                    if (str2.equalsIgnoreCase(str)) {
                        return codecInfoAt;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m221233e(MediaFormat mediaFormat) {
        synchronized (this.f205825o) {
            if (mediaFormat == null) {
                oq70.m168791d().m168795c("Mp4MuxerWrapper", "Media format is null");
                return false;
            }
            try {
                String string = mediaFormat.getString(IMediaFormat.KEY_MIME);
                this.f205818h = string;
                if (string == null) {
                    oq70.m168791d().m168795c("Mp4MuxerWrapper", "Media codec name is null");
                    return false;
                }
                dyx dyxVar = this.f205816f;
                if (dyxVar != null) {
                    dyxVar.m118727b();
                }
                MediaCodec mediaCodec = this.f205814d;
                if (mediaCodec != null) {
                    mediaCodec.stop();
                    this.f205814d.release();
                }
                boolean zStartsWith = this.f205818h.startsWith("video");
                String str = this.f205818h;
                if (zStartsWith) {
                    MediaCodecInfo mediaCodecInfoM221232i = m221232i(str);
                    if (mediaCodecInfoM221232i == null) {
                        oq70.m168791d().m168795c("Mp4MuxerWrapper", "CreateMediaCodec Can't find mediacode names = " + this.f205818h);
                        return false;
                    }
                    this.f205814d = MediaCodec.createByCodecName(mediaCodecInfoM221232i.getName());
                    this.f205821k = 2;
                } else if (str.startsWith("audio")) {
                    this.f205814d = MediaCodec.createEncoderByType(this.f205818h);
                    this.f205821k = 1;
                }
                MediaCodec mediaCodec2 = this.f205814d;
                if (mediaCodec2 == null) {
                    b7y.m102882c().m102888g("createMediaCodec  line 151" + this.f205818h);
                    oq70.m168791d().m168795c("Mp4MuxerWrapper", "CreateMediaCodec error:" + this.f205818h);
                    return false;
                }
                mediaCodec2.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
                if (this.f205818h.startsWith("video") && mediaFormat.getInteger("color-format") == 2130708361) {
                    this.f205817g = this.f205814d.createInputSurface();
                }
                this.f205814d.start();
                this.f205819i = this.f205814d.getInputBuffers();
                dyx dyxVar2 = new dyx("live-media-Muxer", this.f205814d, this.f205815e, this.f205821k, this.f205822l);
                this.f205816f = dyxVar2;
                dyxVar2.start();
                return true;
            } catch (Exception e) {
                b7y.m102882c().m102888g("createMediaCodec " + this.f205818h + Constants.SEPARATOR_COMMA + e.toString());
                oq70.m168791d().m168795c("Mp4MuxerWrapper", "CreateMediaCodec Error [" + e.toString() + Constants.AES_SUFFIX);
                p4f.m170561a(4097);
                b7y.m102882c().m102886e("encoder", "create_mediacodec", 1, "createMediaCodec " + e.toString(), LogLevel.ERROR.value());
                b410.m102397a(20736, this.f205821k, 2, null);
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m221234f(oxd0 oxd0Var) {
        if (oxd0Var != null) {
            this.f205820j.offer(oxd0Var);
        } else {
            Log.e("Mp4MuxerWrapper", "feeding mediacodec null data !");
        }
    }

    /* JADX INFO: renamed from: g */
    public Surface m221235g() {
        synchronized (this.f205825o) {
            try {
                String str = this.f205818h;
                if (str == null || !str.startsWith("video")) {
                    return null;
                }
                return this.f205817g;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m221236h() {
        synchronized (this.f205825o) {
            try {
                if (this.f205824n != null) {
                    m221239l();
                    this.f205824n = null;
                }
                dyx dyxVar = this.f205816f;
                if (dyxVar != null) {
                    dyxVar.m118727b();
                    this.f205816f = null;
                }
                MediaCodec mediaCodec = this.f205814d;
                if (mediaCodec != null) {
                    try {
                        mediaCodec.signalEndOfInputStream();
                    } catch (Exception unused) {
                    }
                    try {
                        this.f205814d.stop();
                    } catch (Exception unused2) {
                    }
                    try {
                        this.f205814d.release();
                    } catch (Exception unused3) {
                    }
                    this.f205814d = null;
                }
                this.f205815e = null;
                this.f205818h = null;
                try {
                    Surface surface = this.f205817g;
                    if (surface != null) {
                        surface.release();
                    }
                } catch (Exception unused4) {
                }
                this.f205817g = null;
                this.f205821k = -1;
                this.f205822l = -1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @RequiresApi(api = 19)
    /* JADX INFO: renamed from: j */
    public boolean m221237j(int i) {
        t9c.m189745c("Mp4MuxerWrapper", "setRates: " + i);
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("video-bitrate", i);
            MediaCodec mediaCodec = this.f205814d;
            if (mediaCodec == null) {
                return true;
            }
            mediaCodec.setParameters(bundle);
            return true;
        } catch (Error e) {
            t9c.m189746d("Mp4MuxerWrapper", "setRates failed not susport", e);
            return false;
        } catch (Exception e2) {
            t9c.m189746d("Mp4MuxerWrapper", "setRates failed", e2);
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m221238k() {
        synchronized (this.f205825o) {
            try {
                if (this.f205824n == null) {
                    this.f205823m = true;
                    Thread thread = new Thread(new RunnableC21875a(), "live-media-MCDrain");
                    this.f205824n = thread;
                    thread.start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m221239l() {
        synchronized (this.f205825o) {
            if (this.f205824n != null) {
                this.f205823m = false;
                try {
                    this.f205824n.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
