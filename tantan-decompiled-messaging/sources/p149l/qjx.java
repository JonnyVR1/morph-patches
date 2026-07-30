package p149l;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.ijk.media.player.misc.IMediaFormat;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import java.security.InvalidParameterException;

/* JADX INFO: loaded from: classes6.dex */
public class qjx {

    /* JADX INFO: renamed from: k */
    public static int f155001k = 0;

    /* JADX INFO: renamed from: l */
    public static int f155002l = 1;

    /* JADX INFO: renamed from: a */
    private final String f155003a = "MediaEncoderWrapper";

    /* JADX INFO: renamed from: b */
    private final String f155004b = YtVideoEncoder.MIME_TYPE;

    /* JADX INFO: renamed from: c */
    private final String f155005c = "audio/mp4a-latm";

    /* JADX INFO: renamed from: d */
    protected cjx f155006d = null;

    /* JADX INFO: renamed from: e */
    protected cjx f155007e = null;

    /* JADX INFO: renamed from: f */
    protected yt10 f155008f = null;

    /* JADX INFO: renamed from: g */
    protected MediaFormat f155009g = null;

    /* JADX INFO: renamed from: h */
    protected MediaFormat f155010h = null;

    /* JADX INFO: renamed from: i */
    protected Object f155011i = new Object();

    /* JADX INFO: renamed from: j */
    protected int f155012j = 0;

    @RequiresApi(api = 16)
    /* JADX INFO: renamed from: c */
    private boolean m175039c(String str, int i) {
        String[] supportedTypes;
        MediaCodecInfo.EncoderCapabilities encoderCapabilities;
        if (str != null) {
            int codecCount = MediaCodecList.getCodecCount();
            for (int i2 = 0; i2 < codecCount; i2++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
                if (codecInfoAt != null && codecInfoAt.isEncoder() && (supportedTypes = codecInfoAt.getSupportedTypes()) != null) {
                    for (String str2 : supportedTypes) {
                        if (str2.equalsIgnoreCase(str) && (encoderCapabilities = codecInfoAt.getCapabilitiesForType(str).getEncoderCapabilities()) != null) {
                            return encoderCapabilities.isBitrateModeSupported(i);
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public void m175040a(mpd0 mpd0Var) {
        synchronized (this.f155011i) {
            try {
                cjx cjxVar = this.f155007e;
                if (cjxVar != null) {
                    cjxVar.m107289f(mpd0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public Surface m175041b() {
        synchronized (this.f155011i) {
            try {
                cjx cjxVar = this.f155006d;
                if (cjxVar == null) {
                    return null;
                }
                return cjxVar.m107290g();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @RequiresApi(api = 16)
    /* JADX INFO: renamed from: d */
    public void m175042d(int i, int i2, int i3, int i4, int i5, int i6) {
        synchronized (this.f155011i) {
            try {
                if (i == 0 || i3 == 0 || i4 == 0 || i5 == 0) {
                    throw new InvalidParameterException("Invalid parameter!  sampleRate=" + i + " bits=" + i2 + " channels=" + i3 + " bitrate=" + i4 + " maxInputBufsize=" + i5);
                }
                if (this.f155010h == null) {
                    MediaFormat mediaFormat = new MediaFormat();
                    this.f155010h = mediaFormat;
                    mediaFormat.setString(IMediaFormat.KEY_MIME, "audio/mp4a-latm");
                    this.f155010h.setInteger("bitrate", i4);
                    this.f155010h.setInteger("channel-count", i3);
                    this.f155010h.setInteger("sample-rate", i);
                    this.f155010h.setInteger("max-input-size", i5);
                    this.f155012j |= 1;
                    if (i6 != 1) {
                        MediaFormat mediaFormat2 = this.f155010h;
                        if (i6 != 2) {
                            mediaFormat2.setInteger("aac-profile", 2);
                        } else {
                            mediaFormat2.setInteger("aac-profile", 29);
                        }
                    } else {
                        this.f155010h.setInteger("aac-profile", 5);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @RequiresApi(api = 19)
    /* JADX INFO: renamed from: e */
    public boolean m175043e(int i) {
        eyx.m118802c().m118808g("setVideoEncodeingBitRate", "bitRate:" + i);
        cjx cjxVar = this.f155006d;
        if (cjxVar != null) {
            return cjxVar.m107292j(i);
        }
        return false;
    }

    @RequiresApi(api = 16)
    /* JADX INFO: renamed from: f */
    public void m175044f(String str, int i, int i2, int i3, int i4, int i5, int i6) {
        synchronized (this.f155011i) {
            if (i3 == 0) {
                i3 = 15;
            }
            if (i4 == 0) {
                i4 = 500000;
            }
            if (i5 == 0) {
                i5 = 1;
            }
            if (i != 0 && i2 != 0 && i3 != 0 && i4 != 0 && i5 != 0) {
                try {
                    if (i6 >= f155001k && i6 <= f155002l) {
                        if (this.f155009g == null) {
                            MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(str, i, i2);
                            this.f155009g = mediaFormatCreateVideoFormat;
                            mediaFormatCreateVideoFormat.setInteger("bitrate", i4);
                            this.f155009g.setInteger("frame-rate", i3);
                            this.f155009g.setInteger("i-frame-interval", i5);
                            if (Build.VERSION.SDK_INT >= 29 && fjx.m121638R().m121672L() == 1) {
                                this.f155009g.setInteger("max-bframes", 1);
                            }
                            if (fjx.m121638R().m121663I()) {
                                if (m175039c(str, 1)) {
                                    n8c.m158483a("zhengjijian", "MediaFormat BITRATE_MODE_VBR");
                                    eyx.m118802c().m118808g("EVMode=1");
                                    this.f155009g.setInteger("bitrate-mode", 1);
                                }
                                eyx.m118802c().m118808g("EVMode=".concat(m175039c(str, 2) ? "2" : User.ID_TEAM_ACCOUNT));
                            }
                            if (i6 == f155001k) {
                                this.f155009g.setInteger("color-format", 2130708361);
                            } else if (i6 == f155002l) {
                                this.f155009g.setInteger("color-format", 19);
                            }
                            this.f155012j |= 2;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            throw new InvalidParameterException("Parameter is invalid ! width=" + i + " height=" + i2 + " fps=" + i3 + " bitrate=" + i4 + " gopSize=" + i5 + " srcType=" + i6);
        }
    }

    @TargetApi(18)
    /* JADX INFO: renamed from: g */
    public int mo175045g(yt10 yt10Var) {
        synchronized (this.f155011i) {
            try {
                if (this.f155008f == null) {
                    this.f155008f = yt10Var;
                    yt10Var.mo19754H1(this.f155012j);
                }
                if (this.f155010h != null && this.f155007e == null) {
                    this.f155007e = new cjx(this.f155008f);
                    n8c.m158485c("Mp4MuxerWrapper", "init mAudioCodec" + this.f155007e);
                    if (!this.f155007e.m107288e(this.f155010h)) {
                        this.f155007e = null;
                        return 5;
                    }
                    this.f155007e.m107293k();
                }
                if (this.f155009g != null && this.f155006d == null) {
                    this.f155006d = new cjx(this.f155008f);
                    n8c.m158485c("Mp4MuxerWrapper", "init mVideoCodec" + this.f155006d);
                    if (!this.f155006d.m107288e(this.f155009g)) {
                        this.f155006d = null;
                        return 4;
                    }
                    if (this.f155009g.getInteger("color-format") == 19) {
                        this.f155006d.m107293k();
                    }
                }
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m175046h() {
        synchronized (this.f155011i) {
            try {
                if (this.f155006d != null) {
                    n8c.m158485c("MediaEncoderWrapper", "mVideoCodec stop ##############");
                    this.f155006d.m107294l();
                    this.f155006d.m107291h();
                    this.f155006d = null;
                }
                if (this.f155007e != null) {
                    n8c.m158485c("MediaEncoderWrapper", "mAudioCodec stop ##############");
                    this.f155007e.m107294l();
                    this.f155007e.m107291h();
                    this.f155007e = null;
                }
                if (this.f155008f != null) {
                    n8c.m158485c("MediaEncoderWrapper", "mMuxerWrapper stop ##############");
                    this.f155008f.mo19762k1();
                    this.f155008f = null;
                }
                this.f155010h = null;
                this.f155009g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
