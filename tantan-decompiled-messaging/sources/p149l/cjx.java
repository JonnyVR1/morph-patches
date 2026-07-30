package p149l;

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

/* JADX INFO: loaded from: classes6.dex */
public class cjx {

    /* JADX INFO: renamed from: e */
    private yt10 f81243e;

    /* JADX INFO: renamed from: i */
    private ByteBuffer[] f81247i;

    /* JADX INFO: renamed from: a */
    private final String f81239a = "Mp4MuxerWrapper";

    /* JADX INFO: renamed from: b */
    private final String f81240b = "video";

    /* JADX INFO: renamed from: c */
    private final String f81241c = "audio";

    /* JADX INFO: renamed from: d */
    private MediaCodec f81242d = null;

    /* JADX INFO: renamed from: f */
    private gpx f81244f = null;

    /* JADX INFO: renamed from: g */
    private Surface f81245g = null;

    /* JADX INFO: renamed from: h */
    private String f81246h = null;

    /* JADX INFO: renamed from: j */
    private LinkedBlockingQueue<mpd0> f81248j = new LinkedBlockingQueue<>();

    /* JADX INFO: renamed from: k */
    private int f81249k = -1;

    /* JADX INFO: renamed from: l */
    private int f81250l = -1;

    /* JADX INFO: renamed from: m */
    private volatile boolean f81251m = false;

    /* JADX INFO: renamed from: n */
    private Thread f81252n = null;

    /* JADX INFO: renamed from: o */
    private Object f81253o = new Object();

    /* JADX INFO: renamed from: l.cjx$a */
    public class RunnableC16171a implements Runnable {

        /* JADX INFO: renamed from: a */
        private long f81254a = 10000;

        public RunnableC16171a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.interrupted() && cjx.this.f81251m) {
                try {
                    if (cjx.this.f81248j.size() > 0) {
                        mpd0 mpd0Var = (mpd0) cjx.this.f81248j.take();
                        if (mpd0Var == null || mpd0Var.f135036b == null) {
                            Thread.sleep(5L);
                        } else {
                            int iDequeueInputBuffer = cjx.this.f81242d.dequeueInputBuffer(this.f81254a);
                            if (iDequeueInputBuffer >= 0) {
                                cjx.this.f81247i[iDequeueInputBuffer].put(mpd0Var.f135036b);
                                cjx.this.f81247i[iDequeueInputBuffer].flip();
                                cjx.this.f81242d.queueInputBuffer(iDequeueInputBuffer, 0, mpd0Var.f135036b.limit(), mpd0Var.m155801d(), 0);
                                mpd0Var.m155803f();
                            }
                        }
                    } else {
                        Thread.sleep(5L);
                    }
                } catch (Exception e) {
                    Log.e("Mp4MuxerWrapper", "MediaCodec deque or queue buffer error ! [" + e.toString() + Constants.AES_SUFFIX);
                    k3f.m144382a(4097);
                }
            }
            Log.e("Mp4MuxerWrapper", "");
        }
    }

    public cjx(yt10 yt10Var) {
        this.f81243e = null;
        if (yt10Var == null) {
            throw new InvalidParameterException("mp4MuxerWrapper format is null");
        }
        this.f81243e = yt10Var;
    }

    /* JADX INFO: renamed from: i */
    private MediaCodecInfo m107287i(String str) {
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
    public boolean m107288e(MediaFormat mediaFormat) {
        synchronized (this.f81253o) {
            if (mediaFormat == null) {
                ii70.m136344d().m136348c("Mp4MuxerWrapper", "Media format is null");
                return false;
            }
            try {
                String string = mediaFormat.getString(IMediaFormat.KEY_MIME);
                this.f81246h = string;
                if (string == null) {
                    ii70.m136344d().m136348c("Mp4MuxerWrapper", "Media codec name is null");
                    return false;
                }
                gpx gpxVar = this.f81244f;
                if (gpxVar != null) {
                    gpxVar.m127496b();
                }
                MediaCodec mediaCodec = this.f81242d;
                if (mediaCodec != null) {
                    mediaCodec.stop();
                    this.f81242d.release();
                }
                boolean zStartsWith = this.f81246h.startsWith("video");
                String str = this.f81246h;
                if (zStartsWith) {
                    MediaCodecInfo mediaCodecInfoM107287i = m107287i(str);
                    if (mediaCodecInfoM107287i == null) {
                        ii70.m136344d().m136348c("Mp4MuxerWrapper", "CreateMediaCodec Can't find mediacode names = " + this.f81246h);
                        return false;
                    }
                    this.f81242d = MediaCodec.createByCodecName(mediaCodecInfoM107287i.getName());
                    this.f81249k = 2;
                } else if (str.startsWith("audio")) {
                    this.f81242d = MediaCodec.createEncoderByType(this.f81246h);
                    this.f81249k = 1;
                }
                MediaCodec mediaCodec2 = this.f81242d;
                if (mediaCodec2 == null) {
                    eyx.m118802c().m118808g("createMediaCodec  line 151" + this.f81246h);
                    ii70.m136344d().m136348c("Mp4MuxerWrapper", "CreateMediaCodec error:" + this.f81246h);
                    return false;
                }
                mediaCodec2.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
                if (this.f81246h.startsWith("video") && mediaFormat.getInteger("color-format") == 2130708361) {
                    this.f81245g = this.f81242d.createInputSurface();
                }
                this.f81242d.start();
                this.f81247i = this.f81242d.getInputBuffers();
                gpx gpxVar2 = new gpx("live-media-Muxer", this.f81242d, this.f81243e, this.f81249k, this.f81250l);
                this.f81244f = gpxVar2;
                gpxVar2.start();
                return true;
            } catch (Exception e) {
                eyx.m118802c().m118808g("createMediaCodec " + this.f81246h + Constants.SEPARATOR_COMMA + e.toString());
                ii70.m136344d().m136348c("Mp4MuxerWrapper", "CreateMediaCodec Error [" + e.toString() + Constants.AES_SUFFIX);
                k3f.m144382a(4097);
                eyx.m118802c().m118806e("encoder", "create_mediacodec", 1, "createMediaCodec " + e.toString(), LogLevel.ERROR.value());
                tv00.m190718a(20736, this.f81249k, 2, null);
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m107289f(mpd0 mpd0Var) {
        if (mpd0Var != null) {
            this.f81248j.offer(mpd0Var);
        } else {
            Log.e("Mp4MuxerWrapper", "feeding mediacodec null data !");
        }
    }

    /* JADX INFO: renamed from: g */
    public Surface m107290g() {
        synchronized (this.f81253o) {
            try {
                String str = this.f81246h;
                if (str == null || !str.startsWith("video")) {
                    return null;
                }
                return this.f81245g;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m107291h() {
        synchronized (this.f81253o) {
            try {
                if (this.f81252n != null) {
                    m107294l();
                    this.f81252n = null;
                }
                gpx gpxVar = this.f81244f;
                if (gpxVar != null) {
                    gpxVar.m127496b();
                    this.f81244f = null;
                }
                MediaCodec mediaCodec = this.f81242d;
                if (mediaCodec != null) {
                    try {
                        mediaCodec.signalEndOfInputStream();
                    } catch (Exception unused) {
                    }
                    try {
                        this.f81242d.stop();
                    } catch (Exception unused2) {
                    }
                    try {
                        this.f81242d.release();
                    } catch (Exception unused3) {
                    }
                    this.f81242d = null;
                }
                this.f81243e = null;
                this.f81246h = null;
                try {
                    Surface surface = this.f81245g;
                    if (surface != null) {
                        surface.release();
                    }
                } catch (Exception unused4) {
                }
                this.f81245g = null;
                this.f81249k = -1;
                this.f81250l = -1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @RequiresApi(api = 19)
    /* JADX INFO: renamed from: j */
    public boolean m107292j(int i) {
        n8c.m158485c("Mp4MuxerWrapper", "setRates: " + i);
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("video-bitrate", i);
            MediaCodec mediaCodec = this.f81242d;
            if (mediaCodec == null) {
                return true;
            }
            mediaCodec.setParameters(bundle);
            return true;
        } catch (Error e) {
            n8c.m158486d("Mp4MuxerWrapper", "setRates failed not susport", e);
            return false;
        } catch (Exception e2) {
            n8c.m158486d("Mp4MuxerWrapper", "setRates failed", e2);
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m107293k() {
        synchronized (this.f81253o) {
            try {
                if (this.f81252n == null) {
                    this.f81251m = true;
                    Thread thread = new Thread(new RunnableC16171a(), "live-media-MCDrain");
                    this.f81252n = thread;
                    thread.start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m107294l() {
        synchronized (this.f81253o) {
            if (this.f81252n != null) {
                this.f81251m = false;
                try {
                    this.f81252n.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
