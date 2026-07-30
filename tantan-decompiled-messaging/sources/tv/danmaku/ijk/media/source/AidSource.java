package tv.danmaku.ijk.media.source;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.immomo.mediacore.audio.AudioProcess;
import com.tencent.mmkv.MMKV;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.spongycastle.math.Primes;
import p149l.mcj;
import p149l.mpd0;
import p149l.n8c;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import tv.danmaku.ijk.media.streamer.MomoSurface;
import tv.danmaku.ijk.media.streamer.StreamProducer;
import tv.danmaku.ijk.media.streamer.ijkMediaStreamer;
import tv.danmaku.ijk.media.util.helpSurface;

/* JADX INFO: loaded from: classes3.dex */
public class AidSource extends mcj {

    /* JADX INFO: renamed from: a */
    private Activity f208247a;

    /* JADX INFO: renamed from: b */
    private String f208248b;

    /* JADX INFO: renamed from: c */
    private int f208249c;

    /* JADX INFO: renamed from: d */
    private int f208250d;

    /* JADX INFO: renamed from: e */
    private long f208251e;

    /* JADX INFO: renamed from: f */
    private int f208252f;

    /* JADX INFO: renamed from: g */
    private Bitmap f208253g;

    /* JADX INFO: renamed from: i */
    private ijkMediaStreamer.SizeChangedCallback f208254i;

    /* JADX INFO: renamed from: j */
    private ijkMediaStreamer.aidSwitchResolution f208255j;

    /* JADX INFO: renamed from: k */
    private StreamProducer f208256k;

    /* JADX INFO: renamed from: l */
    private ijkMediaStreamer f208257l;

    /* JADX INFO: renamed from: m */
    private IjkMediaPlayer f208258m;

    /* JADX INFO: renamed from: n */
    private helpSurface f208259n;

    /* JADX INFO: renamed from: o */
    private MomoSurface f208260o;

    /* JADX INFO: renamed from: p */
    private long f208261p;

    /* JADX INFO: renamed from: q */
    private int f208262q;

    /* JADX INFO: renamed from: r */
    private int f208263r;

    /* JADX INFO: renamed from: s */
    private int f208264s;

    /* JADX INFO: renamed from: t */
    private ByteBuffer f208265t;

    /* JADX INFO: renamed from: u */
    private AudioProcess f208266u;

    /* JADX INFO: renamed from: v */
    private int f208267v;

    /* JADX INFO: renamed from: x */
    private IjkMediaPlayer.MediaDateCallback f208268x;

    public interface FirstFrameDrawCallback {
        /* JADX INFO: renamed from: a */
        void mo222226a();
    }

    public AidSource(Activity activity, StreamProducer streamProducer, ijkMediaStreamer ijkmediastreamer, String str, MomoSurface momoSurface, long j, ijkMediaStreamer.SizeChangedCallback sizeChangedCallback, int i, int i2, ijkMediaStreamer.aidSwitchResolution aidswitchresolution) {
        boolean z;
        int i3;
        boolean z2;
        StreamProducer streamProducer2;
        this.f208247a = null;
        this.f208249c = -1;
        this.f208250d = -1;
        this.f208251e = -1L;
        this.f208252f = -1;
        this.f208253g = null;
        this.f208254i = null;
        this.f208255j = null;
        this.f208256k = null;
        this.f208257l = null;
        this.f208258m = null;
        this.f208259n = null;
        this.f208260o = null;
        this.f208262q = 0;
        this.f208263r = 1024;
        this.f208264s = 0;
        this.f208265t = ByteBuffer.allocate(1024);
        this.f208267v = -1;
        this.f208268x = new IjkMediaPlayer.MediaDateCallback() { // from class: tv.danmaku.ijk.media.source.AidSource.1
            @Override // tv.danmaku.ijk.media.player.IjkMediaPlayer.MediaDateCallback
            public void onMediaDateCallback(byte[] bArr, int i4, int i5, IjkMediaPlayer ijkMediaPlayer) {
                int length = bArr.length;
                if (AidSource.this.f208256k == null || !AidSource.this.f208256k.m222662L0()) {
                    return;
                }
                n8c.m158485c("aidStream", "public help data.len" + bArr.length + ";recording:" + AidSource.this.f208256k.m222662L0());
                int i6 = 0;
                while (length >= AidSource.this.f208263r) {
                    try {
                        int i7 = AidSource.this.f208264s;
                        AidSource aidSource = AidSource.this;
                        if (i7 > 0) {
                            byte[] bArr2 = new byte[aidSource.f208263r];
                            AidSource.this.f208265t.rewind();
                            AidSource.this.f208265t.get(bArr2, 0, AidSource.this.f208264s);
                            AidSource.this.f208265t.clear();
                            n8c.m158485c("aidStream", "mRemainAudioIndex > 0 arraycopy :" + i6 + ";mRemainAudioIndex:" + AidSource.this.f208264s);
                            System.arraycopy(bArr, i6, bArr2, AidSource.this.f208264s, AidSource.this.f208263r - AidSource.this.f208264s);
                            i6 += AidSource.this.f208263r - AidSource.this.f208264s;
                            length -= AidSource.this.f208263r - AidSource.this.f208264s;
                            if (AidSource.this.f208266u == null) {
                                n8c.m158485c("aidStream", "publichelp: new mHelpMixAudioProcess");
                                AidSource.this.f208266u = new AudioProcess();
                            }
                            if (AidSource.this.f208258m != null && AidSource.this.f208266u != null) {
                                n8c.m158485c("aidStream", "publichelp: mRemainAudioIndex > 0, pos=" + i6 + ";lens:" + length);
                                AidSource.this.f208266u.putSurroundData(new mpd0(bArr2, System.nanoTime() / 1000, 2));
                            }
                            AidSource.this.f208264s = 0;
                        } else {
                            byte[] bArr3 = new byte[aidSource.f208263r];
                            System.arraycopy(bArr, i6, bArr3, 0, AidSource.this.f208263r);
                            if (AidSource.this.f208258m != null && AidSource.this.f208266u != null) {
                                n8c.m158485c("aidStream", "mRemainAudioIndex=0, pos=" + i6 + ";lens:" + length + ",mAudiobufferSize=" + AidSource.this.f208263r);
                                AidSource.this.f208266u.putSurroundData(new mpd0(bArr3, System.nanoTime() / 1000, 2));
                            }
                            length -= AidSource.this.f208263r;
                            i6 += AidSource.this.f208263r;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        AidSource.this.f208264s = 0;
                        AidSource.this.f208265t.clear();
                        n8c.m158485c("aidStream", "onMediaDateCallback:exception");
                        return;
                    }
                }
                if (length > 0) {
                    AidSource.this.f208265t.put(bArr, i6, length);
                    AidSource.this.f208264s = length;
                    n8c.m158485c("aidStream", "mRemainAudioPublishHelp.put:pos:" + i6 + ";lens:" + AidSource.this.f208264s);
                }
            }
        };
        this.f208248b = str;
        this.f208247a = activity;
        this.f208251e = j;
        this.f208260o = momoSurface;
        this.f208257l = ijkmediastreamer;
        this.f208256k = streamProducer;
        if (i == 1) {
            m222224y2(sizeChangedCallback);
        }
        m222223x2(aidswitchresolution);
        if (this.f208247a == null || momoSurface == null || ijkmediastreamer == null || str == null) {
            n8c.m158485c("aidStream", "----AidSource: input error---userid=" + this.f208251e);
            return;
        }
        int i4 = this.f208262q;
        if (i4 != 0 && i4 != 5) {
            n8c.m158485c("aidStream", "----AidSource: open status error: " + this.f208262q);
        }
        n8c.m158485c("aidStream", "----AidSource: begin old:" + this.f208252f + "--->new:" + i + "; player status:" + this.f208262q);
        if (i2 != 3 && i2 != -1 && this.f208252f == 9) {
            m222212t2(false);
        }
        this.f208252f = i;
        this.f208262q = 0;
        this.f208261p = System.currentTimeMillis();
        n8c.m158485c("aidStream", "AidSource: begin, " + this.f208248b + ", type=" + i + ",id=" + this.f208251e);
        this.f208259n = new helpSurface(null, this.f208251e);
        this.f208260o.m222471d0(j, this.f208252f, 0);
        try {
            try {
                IjkMediaPlayer ijkMediaPlayer = new IjkMediaPlayer(this.f208247a.getApplicationContext());
                this.f208258m = ijkMediaPlayer;
                ijkMediaPlayer.setOnPreparedListener(new IMediaPlayer.OnPreparedListener() { // from class: tv.danmaku.ijk.media.source.AidSource.3
                    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
                    public void onPrepared(IMediaPlayer iMediaPlayer) {
                        AidSource.this.f208250d = iMediaPlayer.getVideoWidth();
                        AidSource.this.f208249c = iMediaPlayer.getVideoHeight();
                        n8c.m158485c("aidStream", "----AidSource: <onPrepared> cost time:" + (System.currentTimeMillis() - AidSource.this.f208261p) + "ms,mAidMode=" + AidSource.this.f208252f + ",width=" + AidSource.this.f208250d + ", height=" + AidSource.this.f208249c);
                        if (AidSource.this.f208260o != null && AidSource.this.f208249c > 0 && AidSource.this.f208250d > 0) {
                            AidSource.this.m222189R1(iMediaPlayer);
                            return;
                        }
                        n8c.m158485c("aidStream", "----AidSource: <onPrepared> get size[" + AidSource.this.f208250d + Constants.SEPARATOR_COMMA + AidSource.this.f208249c + "] params failed!!!");
                    }
                });
                int i5 = this.f208252f;
                if (i5 == 2 || i5 == 3 || i5 == 9) {
                    this.f208258m.setMediaCodecEnabled(false);
                    this.f208267v = 0;
                    n8c.m158485c("aidStream", "----Media codec 0");
                } else if (i5 == 1 && (streamProducer2 = this.f208256k) != null && streamProducer2.m222654H0() == 0) {
                    this.f208258m.setMediaCodecEnabled(false);
                    this.f208267v = 0;
                    n8c.m158485c("aidStream", "----Media codec 1 change 0");
                } else {
                    i3 = 1;
                    try {
                        this.f208258m.setMediaCodecEnabled(true);
                        this.f208267v = 1;
                        n8c.m158485c("aidStream", "----Media codec 1");
                    } catch (IOException unused) {
                        int i6 = this.f208252f;
                        if (i6 == 0 || i6 == i3) {
                            ijkMediaStreamer.postEventFromStreamPro(this.f208257l, 200, 210, 0, null);
                            n8c.m158485c("aidStream", "AidSource: msg:210");
                        } else if (i6 == 2 || i6 == 3 || i6 == 9) {
                            ijkMediaStreamer.postEventFromStreamPro(this.f208257l, 200, 209, 0, null);
                            n8c.m158485c("aidStream", "AidSource: msg:209");
                        } else if (i6 == 8) {
                            ijkMediaStreamer.postEventFromStreamPro(this.f208257l, 200, 210, 0, null);
                            n8c.m158485c("aidStream", "AidSource: msg:210");
                        }
                        if (m222217q2() != null) {
                            z2 = true;
                            if (this.f208252f == 1) {
                                m222217q2().m222838a(352, 640);
                            }
                        } else {
                            z2 = true;
                        }
                        this.f208262q = 4;
                        m222212t2(z2);
                        return;
                    }
                }
                this.f208258m.setOnCompletionListener(new IMediaPlayer.OnCompletionListener() { // from class: tv.danmaku.ijk.media.source.AidSource.4
                    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
                    public void onCompletion(IMediaPlayer iMediaPlayer) {
                        n8c.m158485c("aidStream", "----AidSource: <onCompletion> cost time:" + (System.currentTimeMillis() - AidSource.this.f208261p) + "ms");
                        boolean z3 = false;
                        if (AidSource.this.f208252f != 0 && AidSource.this.f208252f != 1) {
                            if (AidSource.this.f208252f == 3 || AidSource.this.f208252f == 9) {
                                ijkMediaStreamer.postEventFromStreamPro(AidSource.this.f208257l, 200, 206, 0, null);
                                n8c.m158485c("aidStream", "AidSource: msg:206");
                            } else if (AidSource.this.f208252f == 2) {
                                ijkMediaStreamer.postEventFromStreamPro(AidSource.this.f208257l, 200, 205, 0, null);
                                n8c.m158485c("aidStream", "AidSource: msg:205");
                            }
                            if (AidSource.this.m222217q2() != null && AidSource.this.f208252f == 1) {
                                AidSource.this.m222217q2().m222838a(352, 640);
                            }
                            AidSource.this.m222212t2(z3);
                        }
                        ijkMediaStreamer.postEventFromStreamPro(AidSource.this.f208257l, 200, 203, 0, null);
                        n8c.m158485c("aidStream", "AidSource: msg:203");
                        z3 = true;
                        if (AidSource.this.m222217q2() != null) {
                            AidSource.this.m222217q2().m222838a(352, 640);
                        }
                        AidSource.this.m222212t2(z3);
                    }
                });
                this.f208258m.setOnSeekCompleteListener(new IMediaPlayer.OnSeekCompleteListener() { // from class: tv.danmaku.ijk.media.source.AidSource.5
                    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
                    public void onSeekComplete(IMediaPlayer iMediaPlayer) {
                        ijkMediaStreamer.postEventFromStreamPro(AidSource.this.f208257l, 200, 212, 0, null);
                        n8c.m158485c("aidStream", "-------------SeekComplete");
                    }
                });
                this.f208258m.setOnInfoListener(new IMediaPlayer.OnInfoListener() { // from class: tv.danmaku.ijk.media.source.AidSource.6
                    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
                    public boolean onInfo(IMediaPlayer iMediaPlayer, int i7, int i8) {
                        if (iMediaPlayer == null) {
                            return true;
                        }
                        if (i7 == 701) {
                            n8c.m158485c("aidStream", "-------------start");
                            return true;
                        }
                        if (i7 != 702) {
                            return true;
                        }
                        n8c.m158485c("aidStream", "-------------end");
                        return true;
                    }
                });
                this.f208258m.setOnBufferingUpdateListener(new IMediaPlayer.OnBufferingUpdateListener() { // from class: tv.danmaku.ijk.media.source.AidSource.7
                    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
                    public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i7) {
                    }
                });
                this.f208258m.setOnVideoMediacodecChangedListener(new IMediaPlayer.OnVideoMediacodecChangedListener() { // from class: tv.danmaku.ijk.media.source.AidSource.8
                    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoMediacodecChangedListener
                    public void onVideoMediacodecChanged(IMediaPlayer iMediaPlayer, int i7) {
                        n8c.m158485c("aidStream", "----AidSource: <MediacodecChanged> " + AidSource.this.f208267v + Constants.SEPARATOR_COMMA + i7);
                        if (i7 == 1 && AidSource.this.f208267v == 1) {
                            AidSource.this.f208267v = 0;
                            if (AidSource.this.f208256k != null) {
                                AidSource.this.f208256k.m222739x1(AidSource.this.f208267v);
                            }
                            if (AidSource.this.f208252f == 0 || AidSource.this.f208252f == 1) {
                                ijkMediaStreamer.postEventFromStreamPro(AidSource.this.f208257l, 200, 210, 0, null);
                                n8c.m158485c("aidStream", "AidSource: msg:210");
                            } else if (AidSource.this.f208252f == 2 || AidSource.this.f208252f == 3 || AidSource.this.f208252f == 9) {
                                ijkMediaStreamer.postEventFromStreamPro(AidSource.this.f208257l, 200, 209, 0, null);
                                n8c.m158485c("aidStream", "AidSource: msg:209");
                            } else if (AidSource.this.f208252f == 8) {
                                ijkMediaStreamer.postEventFromStreamPro(AidSource.this.f208257l, 200, 210, 0, null);
                                n8c.m158485c("aidStream", "AidSource: msg:210");
                            }
                            if (AidSource.this.m222217q2() != null && AidSource.this.f208252f == 1) {
                                AidSource.this.m222217q2().m222838a(352, 640);
                            }
                            AidSource.this.m222212t2(true);
                        }
                    }
                });
                this.f208258m.setOnVideoSizeChangedListener(new IMediaPlayer.OnVideoSizeChangedListener() { // from class: tv.danmaku.ijk.media.source.AidSource.9
                    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
                    public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i7, int i8, int i9, int i10) {
                        int videoWidth = iMediaPlayer.getVideoWidth();
                        int videoHeight = iMediaPlayer.getVideoHeight();
                        if (AidSource.this.f208250d == -1 || AidSource.this.f208249c == -1) {
                            return;
                        }
                        if (videoWidth != i7 || videoHeight != i8) {
                            n8c.m158485c("aidStream", "----AidSource: <changed> no same" + i7 + Constants.SEPARATOR_COMMA + i8);
                        }
                        if (videoWidth == AidSource.this.f208250d && videoHeight == AidSource.this.f208249c) {
                            return;
                        }
                        n8c.m158485c("aidStream", "----AidSource: <changed>(" + AidSource.this.f208250d + Constants.SEPARATOR_COMMA + AidSource.this.f208249c + ")--->(" + videoWidth + Constants.SEPARATOR_COMMA + videoHeight + "), cost time:" + (System.currentTimeMillis() - AidSource.this.f208261p) + "ms, mAidMode=" + AidSource.this.f208252f);
                        if (AidSource.this.f208250d == 0 || AidSource.this.f208249c == 0) {
                            AidSource.this.f208250d = videoWidth;
                            AidSource.this.f208249c = videoHeight;
                            AidSource.this.m222189R1(iMediaPlayer);
                            return;
                        }
                        AidSource.this.f208250d = videoWidth;
                        AidSource.this.f208249c = videoHeight;
                        if (AidSource.this.f208260o != null) {
                            AidSource.this.f208260o.m222462X0(AidSource.this.f208251e, AidSource.this.f208250d, AidSource.this.f208249c, 1, AidSource.this.f208252f);
                        }
                        if (AidSource.this.m222218r2() != null) {
                            AidSource.this.m222218r2().m222837a(AidSource.this.f208250d, AidSource.this.f208249c);
                        }
                        AidSource aidSource = AidSource.this;
                        aidSource.m222222w2(aidSource.f208250d, AidSource.this.f208249c);
                    }
                });
                this.f208258m.setOnErrorListener(new IMediaPlayer.OnErrorListener() { // from class: tv.danmaku.ijk.media.source.AidSource.10
                    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
                    public boolean onError(IMediaPlayer iMediaPlayer, int i7, int i8) {
                        n8c.m158485c("aidStream", "AidSource: <OnError> cost time:" + (System.currentTimeMillis() - AidSource.this.f208261p) + "ms, " + i7 + Constants.SEPARATOR_COMMA + i8);
                        if (AidSource.this.f208252f == 0 || AidSource.this.f208252f == 1) {
                            ijkMediaStreamer.postEventFromStreamPro(AidSource.this.f208257l, 200, 210, 0, null);
                            n8c.m158485c("aidStream", "AidSource: msg:210");
                        } else if (AidSource.this.f208252f == 2 || AidSource.this.f208252f == 3 || AidSource.this.f208252f == 9) {
                            ijkMediaStreamer.postEventFromStreamPro(AidSource.this.f208257l, 200, 209, 0, null);
                            n8c.m158485c("aidStream", "AidSource: msg:209");
                        } else if (AidSource.this.f208252f == 8) {
                            ijkMediaStreamer.postEventFromStreamPro(AidSource.this.f208257l, 200, 210, 0, null);
                            n8c.m158485c("aidStream", "AidSource: msg:210");
                        }
                        if (AidSource.this.m222217q2() != null && AidSource.this.f208252f == 1) {
                            AidSource.this.m222217q2().m222838a(352, 640);
                        }
                        AidSource.this.m222212t2(true);
                        return true;
                    }
                });
                this.f208258m.setSurfaceH(this.f208259n.m222870c());
                this.f208258m.setDataSource(this.f208248b.toString());
                i3 = 1;
                this.f208258m.setMediaDateCallbackFlags(1);
                this.f208259n.m222874h(this.f208260o);
                this.f208262q = 1;
                this.f208258m.prepareAsync();
                int i7 = this.f208252f;
                if (i7 == 3 || i7 == 8 || i7 == 9) {
                    this.f208258m.setVolume(1.0f, 1.0f);
                } else {
                    this.f208258m.setVolume(0.0f, 0.0f);
                }
                n8c.m158485c("aidStream", "AidSource: end, cost time:" + (System.currentTimeMillis() - this.f208261p) + "ms");
            } catch (IOException unused2) {
                i3 = 1;
            }
        } catch (IllegalArgumentException unused3) {
            int i8 = this.f208252f;
            if (i8 == 0 || i8 == 1) {
                ijkMediaStreamer.postEventFromStreamPro(this.f208257l, 200, 210, 0, null);
                n8c.m158485c("aidStream", "AidSource: msg:210");
            } else if (i8 == 2 || i8 == 3 || i8 == 9) {
                ijkMediaStreamer.postEventFromStreamPro(this.f208257l, 200, 209, 0, null);
                n8c.m158485c("aidStream", "AidSource: msg:209");
            } else if (i8 == 8) {
                ijkMediaStreamer.postEventFromStreamPro(this.f208257l, 200, 210, 0, null);
                n8c.m158485c("aidStream", "AidSource: msg:210");
            }
            if (m222217q2() != null) {
                z = true;
                if (this.f208252f == 1) {
                    m222217q2().m222838a(352, 640);
                }
            } else {
                z = true;
            }
            this.f208262q = 4;
            m222212t2(z);
        }
    }

    /* JADX INFO: renamed from: A2 */
    private String m222187A2(long j) {
        int i = (int) (j / 1000);
        int i2 = i % 60;
        int i3 = (i / 60) % 60;
        return Integer.toString(i / MMKV.ExpireInHour) + ":" + Integer.toString(i3) + ":" + Integer.toString(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q1 */
    public void m222188Q1(int i, int i2, int i3, int i4) {
        int i5 = (i * i4) / i3;
        int i6 = (i2 * i3) / i4;
        if (i6 < i) {
            this.f208260o.m222460W0(this.f208251e, (i - i6) / 2, 0, i6, i2, 0);
            return;
        }
        MomoSurface momoSurface = this.f208260o;
        if (i5 < i2) {
            momoSurface.m222460W0(this.f208251e, 0, (i2 - i5) / 2, i, i5, 0);
        } else {
            momoSurface.m222460W0(this.f208251e, 0, 0, i, i2, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R1 */
    public void m222189R1(IMediaPlayer iMediaPlayer) {
        MomoSurface momoSurface = this.f208260o;
        if (momoSurface == null || iMediaPlayer == null) {
            return;
        }
        momoSurface.m222462X0(this.f208251e, this.f208250d, this.f208249c, 0, this.f208252f);
        this.f208260o.m222456T0(this.f208251e, new FirstFrameDrawCallback() { // from class: tv.danmaku.ijk.media.source.AidSource.2
            @Override // tv.danmaku.ijk.media.source.AidSource.FirstFrameDrawCallback
            /* JADX INFO: renamed from: a */
            public void mo222226a() {
                n8c.m158483a("aidStream", "----FirstFrameDrawCallback");
                if (AidSource.this.f208257l != null) {
                    if (AidSource.this.f208252f == 2 || AidSource.this.f208252f == 3 || AidSource.this.f208252f == 9) {
                        ijkMediaStreamer.postEventFromStreamPro(AidSource.this.f208257l, 200, 208, 0, null);
                        n8c.m158485c("aidStream", "----first frame draw finish callback: msg:208;" + AidSource.this.f208252f);
                        if (AidSource.this.f208252f == 9) {
                            AidSource aidSource = AidSource.this;
                            aidSource.m222188Q1(352, 640, aidSource.f208250d, AidSource.this.f208249c);
                        }
                    }
                }
            }
        });
        this.f208262q = 2;
        if (m222218r2() != null) {
            m222218r2().m222837a(this.f208250d, this.f208249c);
        }
        m222222w2(this.f208250d, this.f208249c);
        int i = this.f208252f;
        if (i == 0 || i == 1) {
            ijkMediaStreamer.postEventFromStreamPro(this.f208257l, 200, 202, 0, null);
            n8c.m158485c("aidStream", "AidSource: msg:202");
        } else if (i == 2 || i == 3 || i == 9) {
            ijkMediaStreamer.postEventFromStreamPro(this.f208257l, 200, 204, 0, null);
            n8c.m158485c("aidStream", "AidSource: msg:204");
        } else if (i == 8) {
            ijkMediaStreamer.postEventFromStreamPro(this.f208257l, 200, 202, 0, null);
            n8c.m158485c("aidStream", "AidSource: msg:202");
        }
        iMediaPlayer.start();
        this.f208262q = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t2 */
    public void m222212t2(boolean z) {
        if (z) {
            MomoSurface momoSurface = this.f208260o;
            if (momoSurface != null) {
                momoSurface.m222468b1(this.f208251e, true);
            }
            this.f208252f = -1;
        }
        if (this.f208258m != null && this.f208262q != 5) {
            this.f208262q = 5;
            m222224y2(null);
            this.f208258m.setMediaDataCallback(null);
            this.f208258m.setOnErrorListener(null);
            this.f208258m.setOnCompletionListener(null);
            this.f208258m.setOnPreparedListener(null);
            this.f208258m.setOnVideoSizeChangedListener(null);
            m222222w2(0, 0);
            this.f208258m.stop();
            this.f208258m.release();
            this.f208258m = null;
            helpSurface helpsurface = this.f208259n;
            if (helpsurface != null) {
                helpsurface.m222873g();
                this.f208259n = null;
            }
        }
        m222223x2(null);
        n8c.m158485c("aidStream", "AidSource: release, cost time:" + (System.currentTimeMillis() - this.f208261p) + "ms");
    }

    /* JADX INFO: renamed from: B2 */
    public void m222213B2(long j, SurfaceTexture surfaceTexture, int i, Bitmap bitmap) {
        MomoSurface momoSurface = this.f208260o;
        if (momoSurface != null) {
            momoSurface.m222479i1(j, surfaceTexture, i, bitmap);
        }
    }

    /* JADX INFO: renamed from: C2 */
    public void m222214C2(long j, int i, int i2, int i3, int i4, int i5) {
        if (this.f208260o != null) {
            n8c.m158485c("aidStream", "@@@ viewPort: id[" + j + "], view[" + i + Constants.SEPARATOR_COMMA + i2 + Constants.SEPARATOR_COMMA + i3 + Constants.SEPARATOR_COMMA + i4 + "], z=" + i5);
            int i6 = this.f208252f;
            this.f208260o.m222460W0(j, i, i2, i3, i4, (j == ((long) i6) && i6 == 7) ? 0 : 1);
        }
    }

    public long getDuration() {
        IjkMediaPlayer ijkMediaPlayer = this.f208258m;
        if (ijkMediaPlayer != null) {
            return ijkMediaPlayer.getDuration();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: o2 */
    public void m222215o2(long j, boolean z) {
        if (this.f208260o != null) {
            n8c.m158485c("aidStream", "@@@ fullScreen: id[" + j + "], full=" + z);
            this.f208260o.m222458U0(j, z);
        }
    }

    /* JADX INFO: renamed from: p2 */
    public long m222216p2() {
        IjkMediaPlayer ijkMediaPlayer = this.f208258m;
        if (ijkMediaPlayer != null) {
            return ijkMediaPlayer.getCurrentPosition();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: q2 */
    public ijkMediaStreamer.aidSwitchResolution m222217q2() {
        n8c.m158485c("aidStream", InternalFrame.f7932ID + this.f208250d + Constants.SEPARATOR_COMMA + this.f208249c + "--->352,640");
        return this.f208255j;
    }

    /* JADX INFO: renamed from: r2 */
    public ijkMediaStreamer.SizeChangedCallback m222218r2() {
        return this.f208254i;
    }

    /* JADX INFO: renamed from: s2 */
    public void m222219s2(long j, boolean z) {
        MomoSurface momoSurface = this.f208260o;
        if (momoSurface != null) {
            momoSurface.m222459V0(j, z);
        }
    }

    /* JADX INFO: renamed from: u2 */
    public void m222220u2(int i) {
        int i2;
        n8c.m158485c("aidStream", " remove, start[" + i + "]: cost time:" + (System.currentTimeMillis() - this.f208261p) + "ms");
        int i3 = this.f208262q;
        if (i3 == 3 || i3 == 1 || i3 == 2) {
            this.f208262q = 4;
        }
        if (i == 1) {
            int i4 = this.f208252f;
            m222212t2(true);
            if (i4 == 0 || i4 == 1) {
                ijkMediaStreamer.postEventFromStreamPro(this.f208257l, 200, Primes.SMALL_FACTOR_LIMIT, 0, null);
                n8c.m158485c("aidStream", "remove: msg:211");
            } else if (i4 == 2 || i4 == 3 || (i2 = this.f208252f) == 9) {
                ijkMediaStreamer.postEventFromStreamPro(this.f208257l, 200, 207, 0, null);
                n8c.m158485c("aidStream", "remove: msg:207");
            } else if (i2 == 8) {
                ijkMediaStreamer.postEventFromStreamPro(this.f208257l, 200, Primes.SMALL_FACTOR_LIMIT, 0, null);
                n8c.m158485c("aidStream", "remove: msg:211");
            }
            this.f208252f = -1;
        } else {
            m222212t2(false);
        }
        n8c.m158485c("aidStream", "remove, end[" + i + "]: cost time:" + (System.currentTimeMillis() - this.f208261p) + "ms");
    }

    /* JADX INFO: renamed from: v2 */
    public void m222221v2(long j) {
        if (this.f208258m != null) {
            n8c.m158485c("aidStream", "-----seekTo:" + j + "(" + m222187A2(j) + ")ms");
            this.f208258m.seekTo(j);
        }
    }

    /* JADX INFO: renamed from: w2 */
    public void m222222w2(int i, int i2) {
    }

    /* JADX INFO: renamed from: x2 */
    public void m222223x2(ijkMediaStreamer.aidSwitchResolution aidswitchresolution) {
        this.f208255j = aidswitchresolution;
    }

    /* JADX INFO: renamed from: y2 */
    public void m222224y2(ijkMediaStreamer.SizeChangedCallback sizeChangedCallback) {
        this.f208254i = sizeChangedCallback;
    }

    /* JADX INFO: renamed from: z2 */
    public void m222225z2(long j, int i, int i2, int i3, int i4) {
        MomoSurface momoSurface = this.f208260o;
        if (momoSurface != null) {
            momoSurface.m222462X0(j, i, i2, i3, i4);
        }
    }

    public AidSource(Bitmap bitmap, MomoSurface momoSurface, long j, int i) {
        this.f208247a = null;
        this.f208249c = -1;
        this.f208250d = -1;
        this.f208251e = -1L;
        this.f208252f = -1;
        this.f208253g = null;
        this.f208254i = null;
        this.f208255j = null;
        this.f208256k = null;
        this.f208257l = null;
        this.f208258m = null;
        this.f208259n = null;
        this.f208260o = null;
        this.f208262q = 0;
        this.f208263r = 1024;
        this.f208264s = 0;
        this.f208265t = ByteBuffer.allocate(1024);
        this.f208267v = -1;
        this.f208268x = new IjkMediaPlayer.MediaDateCallback() { // from class: tv.danmaku.ijk.media.source.AidSource.1
            @Override // tv.danmaku.ijk.media.player.IjkMediaPlayer.MediaDateCallback
            public void onMediaDateCallback(byte[] bArr, int i4, int i5, IjkMediaPlayer ijkMediaPlayer) {
                int length = bArr.length;
                if (AidSource.this.f208256k == null || !AidSource.this.f208256k.m222662L0()) {
                    return;
                }
                n8c.m158485c("aidStream", "public help data.len" + bArr.length + ";recording:" + AidSource.this.f208256k.m222662L0());
                int i6 = 0;
                while (length >= AidSource.this.f208263r) {
                    try {
                        int i7 = AidSource.this.f208264s;
                        AidSource aidSource = AidSource.this;
                        if (i7 > 0) {
                            byte[] bArr2 = new byte[aidSource.f208263r];
                            AidSource.this.f208265t.rewind();
                            AidSource.this.f208265t.get(bArr2, 0, AidSource.this.f208264s);
                            AidSource.this.f208265t.clear();
                            n8c.m158485c("aidStream", "mRemainAudioIndex > 0 arraycopy :" + i6 + ";mRemainAudioIndex:" + AidSource.this.f208264s);
                            System.arraycopy(bArr, i6, bArr2, AidSource.this.f208264s, AidSource.this.f208263r - AidSource.this.f208264s);
                            i6 += AidSource.this.f208263r - AidSource.this.f208264s;
                            length -= AidSource.this.f208263r - AidSource.this.f208264s;
                            if (AidSource.this.f208266u == null) {
                                n8c.m158485c("aidStream", "publichelp: new mHelpMixAudioProcess");
                                AidSource.this.f208266u = new AudioProcess();
                            }
                            if (AidSource.this.f208258m != null && AidSource.this.f208266u != null) {
                                n8c.m158485c("aidStream", "publichelp: mRemainAudioIndex > 0, pos=" + i6 + ";lens:" + length);
                                AidSource.this.f208266u.putSurroundData(new mpd0(bArr2, System.nanoTime() / 1000, 2));
                            }
                            AidSource.this.f208264s = 0;
                        } else {
                            byte[] bArr3 = new byte[aidSource.f208263r];
                            System.arraycopy(bArr, i6, bArr3, 0, AidSource.this.f208263r);
                            if (AidSource.this.f208258m != null && AidSource.this.f208266u != null) {
                                n8c.m158485c("aidStream", "mRemainAudioIndex=0, pos=" + i6 + ";lens:" + length + ",mAudiobufferSize=" + AidSource.this.f208263r);
                                AidSource.this.f208266u.putSurroundData(new mpd0(bArr3, System.nanoTime() / 1000, 2));
                            }
                            length -= AidSource.this.f208263r;
                            i6 += AidSource.this.f208263r;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        AidSource.this.f208264s = 0;
                        AidSource.this.f208265t.clear();
                        n8c.m158485c("aidStream", "onMediaDateCallback:exception");
                        return;
                    }
                }
                if (length > 0) {
                    AidSource.this.f208265t.put(bArr, i6, length);
                    AidSource.this.f208264s = length;
                    n8c.m158485c("aidStream", "mRemainAudioPublishHelp.put:pos:" + i6 + ";lens:" + AidSource.this.f208264s);
                }
            }
        };
        if (bitmap == null || momoSurface == null) {
            return;
        }
        n8c.m158485c("aidStream", "@@@ AidSource: image begin---userid=" + j);
        this.f208260o = momoSurface;
        this.f208253g = bitmap;
        this.f208251e = j;
        this.f208252f = 7;
        n8c.m158485c("aidStream", "@@@ AidSource: cast image---userid=" + this.f208251e + ";aidMode=" + this.f208252f);
        this.f208250d = bitmap.getWidth();
        this.f208249c = bitmap.getHeight();
        MomoSurface momoSurface2 = this.f208260o;
        if (momoSurface2 != null) {
            momoSurface2.m222471d0(j, this.f208252f, 0);
            this.f208260o.m222462X0(this.f208251e, this.f208250d, this.f208249c, 0, this.f208252f);
            this.f208260o.m222479i1(this.f208251e, null, -1, this.f208253g);
        }
        n8c.m158485c("aidStream", "@@@ AidSource: image end, cost time:" + (System.currentTimeMillis() - this.f208261p) + "ms");
    }
}
