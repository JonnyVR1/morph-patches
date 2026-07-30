package p153l;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.ijk.media.player.misc.IMediaFormat;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import java.security.InvalidParameterException;

/* JADX INFO: loaded from: classes8.dex */
public class nsx {

    /* JADX INFO: renamed from: k */
    public static int f143548k = 0;

    /* JADX INFO: renamed from: l */
    public static int f143549l = 1;

    /* JADX INFO: renamed from: a */
    private final String f143550a = "MediaEncoderWrapper";

    /* JADX INFO: renamed from: b */
    private final String f143551b = YtVideoEncoder.MIME_TYPE;

    /* JADX INFO: renamed from: c */
    private final String f143552c = "audio/mp4a-latm";

    /* JADX INFO: renamed from: d */
    protected zrx f143553d = null;

    /* JADX INFO: renamed from: e */
    protected zrx f143554e = null;

    /* JADX INFO: renamed from: f */
    protected g220 f143555f = null;

    /* JADX INFO: renamed from: g */
    protected MediaFormat f143556g = null;

    /* JADX INFO: renamed from: h */
    protected MediaFormat f143557h = null;

    /* JADX INFO: renamed from: i */
    protected Object f143558i = new Object();

    /* JADX INFO: renamed from: j */
    protected int f143559j = 0;

    @RequiresApi(api = 16)
    /* JADX INFO: renamed from: c */
    private boolean m164648c(String str, int i) {
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
    public void m164649a(oxd0 oxd0Var) {
        synchronized (this.f143558i) {
            try {
                zrx zrxVar = this.f143554e;
                if (zrxVar != null) {
                    zrxVar.m221234f(oxd0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public Surface m164650b() {
        synchronized (this.f143558i) {
            try {
                zrx zrxVar = this.f143553d;
                if (zrxVar == null) {
                    return null;
                }
                return zrxVar.m221235g();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @RequiresApi(api = 16)
    /* JADX INFO: renamed from: d */
    public void m164651d(int i, int i2, int i3, int i4, int i5, int i6) {
        synchronized (this.f143558i) {
            try {
                if (i == 0 || i3 == 0 || i4 == 0 || i5 == 0) {
                    throw new InvalidParameterException("Invalid parameter!  sampleRate=" + i + " bits=" + i2 + " channels=" + i3 + " bitrate=" + i4 + " maxInputBufsize=" + i5);
                }
                if (this.f143557h == null) {
                    MediaFormat mediaFormat = new MediaFormat();
                    this.f143557h = mediaFormat;
                    mediaFormat.setString(IMediaFormat.KEY_MIME, "audio/mp4a-latm");
                    this.f143557h.setInteger("bitrate", i4);
                    this.f143557h.setInteger("channel-count", i3);
                    this.f143557h.setInteger("sample-rate", i);
                    this.f143557h.setInteger("max-input-size", i5);
                    this.f143559j |= 1;
                    if (i6 != 1) {
                        MediaFormat mediaFormat2 = this.f143557h;
                        if (i6 != 2) {
                            mediaFormat2.setInteger("aac-profile", 2);
                        } else {
                            mediaFormat2.setInteger("aac-profile", 29);
                        }
                    } else {
                        this.f143557h.setInteger("aac-profile", 5);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @RequiresApi(api = 19)
    /* JADX INFO: renamed from: e */
    public boolean m164652e(int i) {
        b7y.m102882c().m102888g("setVideoEncodeingBitRate", "bitRate:" + i);
        zrx zrxVar = this.f143553d;
        if (zrxVar != null) {
            return zrxVar.m221237j(i);
        }
        return false;
    }

    @RequiresApi(api = 16)
    /* JADX INFO: renamed from: f */
    public void m164653f(String str, int i, int i2, int i3, int i4, int i5, int i6) {
        synchronized (this.f143558i) {
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
                    if (i6 >= f143548k && i6 <= f143549l) {
                        if (this.f143556g == null) {
                            MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(str, i, i2);
                            this.f143556g = mediaFormatCreateVideoFormat;
                            mediaFormatCreateVideoFormat.setInteger("bitrate", i4);
                            this.f143556g.setInteger("frame-rate", i3);
                            this.f143556g.setInteger("i-frame-interval", i5);
                            if (Build.VERSION.SDK_INT >= 29 && csx.m112235R().m112269L() == 1) {
                                this.f143556g.setInteger("max-bframes", 1);
                            }
                            if (csx.m112235R().m112260I()) {
                                if (m164648c(str, 1)) {
                                    t9c.m189743a("zhengjijian", "MediaFormat BITRATE_MODE_VBR");
                                    b7y.m102882c().m102888g("EVMode=1");
                                    this.f143556g.setInteger("bitrate-mode", 1);
                                }
                                b7y.m102882c().m102888g("EVMode=".concat(m164648c(str, 2) ? "2" : User.ID_TEAM_ACCOUNT));
                            }
                            if (i6 == f143548k) {
                                this.f143556g.setInteger("color-format", 2130708361);
                            } else if (i6 == f143549l) {
                                this.f143556g.setInteger("color-format", 19);
                            }
                            this.f143559j |= 2;
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
    public int mo164654g(g220 g220Var) {
        synchronized (this.f143558i) {
            try {
                if (this.f143555f == null) {
                    this.f143555f = g220Var;
                    g220Var.mo20753H1(this.f143559j);
                }
                if (this.f143557h != null && this.f143554e == null) {
                    this.f143554e = new zrx(this.f143555f);
                    t9c.m189745c("Mp4MuxerWrapper", "init mAudioCodec" + this.f143554e);
                    if (!this.f143554e.m221233e(this.f143557h)) {
                        this.f143554e = null;
                        return 5;
                    }
                    this.f143554e.m221238k();
                }
                if (this.f143556g != null && this.f143553d == null) {
                    this.f143553d = new zrx(this.f143555f);
                    t9c.m189745c("Mp4MuxerWrapper", "init mVideoCodec" + this.f143553d);
                    if (!this.f143553d.m221233e(this.f143556g)) {
                        this.f143553d = null;
                        return 4;
                    }
                    if (this.f143556g.getInteger("color-format") == 19) {
                        this.f143553d.m221238k();
                    }
                }
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m164655h() {
        synchronized (this.f143558i) {
            try {
                if (this.f143553d != null) {
                    t9c.m189745c("MediaEncoderWrapper", "mVideoCodec stop ##############");
                    this.f143553d.m221239l();
                    this.f143553d.m221236h();
                    this.f143553d = null;
                }
                if (this.f143554e != null) {
                    t9c.m189745c("MediaEncoderWrapper", "mAudioCodec stop ##############");
                    this.f143554e.m221239l();
                    this.f143554e.m221236h();
                    this.f143554e = null;
                }
                if (this.f143555f != null) {
                    t9c.m189745c("MediaEncoderWrapper", "mMuxerWrapper stop ##############");
                    this.f143555f.mo20761k1();
                    this.f143555f = null;
                }
                this.f143557h = null;
                this.f143556g = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
