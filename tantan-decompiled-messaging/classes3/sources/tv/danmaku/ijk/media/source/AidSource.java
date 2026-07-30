package tv.danmaku.ijk.media.source;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import com.immomo.mediacore.audio.AudioProcess;
import java.io.IOException;
import java.nio.ByteBuffer;
import l.mpd0;
import l.n8c;
import org.eclipse.jetty.http.HttpStatus;
import org.spongycastle.math.Primes;
import p003l.mcj;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import tv.danmaku.ijk.media.streamer.MomoSurface;
import tv.danmaku.ijk.media.streamer.StreamProducer;
import tv.danmaku.ijk.media.streamer.ijkMediaStreamer;
import tv.danmaku.ijk.media.util.helpSurface;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class AidSource extends mcj {

    /* JADX INFO: renamed from: a */
    private Activity f11872a;

    /* JADX INFO: renamed from: b */
    private String f11873b;

    /* JADX INFO: renamed from: c */
    private int f11874c;

    /* JADX INFO: renamed from: d */
    private int f11875d;

    /* JADX INFO: renamed from: e */
    private long f11876e;

    /* JADX INFO: renamed from: f */
    private int f11877f;

    /* JADX INFO: renamed from: g */
    private Bitmap f11878g;

    /* JADX INFO: renamed from: i */
    private ijkMediaStreamer.SizeChangedCallback f11879i;

    /* JADX INFO: renamed from: j */
    private ijkMediaStreamer.aidSwitchResolution f11880j;

    /* JADX INFO: renamed from: k */
    private StreamProducer f11881k;

    /* JADX INFO: renamed from: l */
    private ijkMediaStreamer f11882l;

    /* JADX INFO: renamed from: m */
    private IjkMediaPlayer f11883m;

    /* JADX INFO: renamed from: n */
    private helpSurface f11884n;

    /* JADX INFO: renamed from: o */
    private MomoSurface f11885o;

    /* JADX INFO: renamed from: p */
    private long f11886p;

    /* JADX INFO: renamed from: q */
    private int f11887q;

    /* JADX INFO: renamed from: r */
    private int f11888r;

    /* JADX INFO: renamed from: s */
    private int f11889s;

    /* JADX INFO: renamed from: t */
    private ByteBuffer f11890t;

    /* JADX INFO: renamed from: u */
    private AudioProcess f11891u;

    /* JADX INFO: renamed from: v */
    private int f11892v;

    /* JADX INFO: renamed from: x */
    private IjkMediaPlayer.MediaDateCallback f11893x;

    public interface FirstFrameDrawCallback {
        /* JADX INFO: renamed from: a */
        void mo10697a();
    }

    public AidSource(Activity activity, StreamProducer streamProducer, ijkMediaStreamer ijkmediastreamer, String str, MomoSurface momoSurface, long j, ijkMediaStreamer.SizeChangedCallback sizeChangedCallback, int i, int i2, ijkMediaStreamer.aidSwitchResolution aidswitchresolution) {
        boolean z;
        int i3;
        boolean z2;
        StreamProducer streamProducer2;
        this.f11872a = null;
        this.f11874c = -1;
        this.f11875d = -1;
        this.f11876e = -1L;
        this.f11877f = -1;
        this.f11878g = null;
        this.f11879i = null;
        this.f11880j = null;
        this.f11881k = null;
        this.f11882l = null;
        this.f11883m = null;
        this.f11884n = null;
        this.f11885o = null;
        this.f11887q = 0;
        this.f11888r = 1024;
        this.f11889s = 0;
        this.f11890t = ByteBuffer.allocate(1024);
        this.f11892v = -1;
        this.f11893x = new IjkMediaPlayer.MediaDateCallback() { // from class: tv.danmaku.ijk.media.source.AidSource.1
            @Override // tv.danmaku.ijk.media.player.IjkMediaPlayer.MediaDateCallback
            public void onMediaDateCallback(byte[] bArr, int i4, int i5, IjkMediaPlayer ijkMediaPlayer) {
                int length = bArr.length;
                if (AidSource.this.f11881k == null || !AidSource.this.f11881k.m11133L0()) {
                    return;
                }
                n8c.c("aidStream", "public help data.len" + bArr.length + ";recording:" + AidSource.this.f11881k.m11133L0());
                int i6 = 0;
                while (length >= AidSource.this.f11888r) {
                    try {
                        int i7 = AidSource.this.f11889s;
                        AidSource aidSource = AidSource.this;
                        if (i7 > 0) {
                            byte[] bArr2 = new byte[aidSource.f11888r];
                            AidSource.this.f11890t.rewind();
                            AidSource.this.f11890t.get(bArr2, 0, AidSource.this.f11889s);
                            AidSource.this.f11890t.clear();
                            n8c.c("aidStream", "mRemainAudioIndex > 0 arraycopy :" + i6 + ";mRemainAudioIndex:" + AidSource.this.f11889s);
                            System.arraycopy(bArr, i6, bArr2, AidSource.this.f11889s, AidSource.this.f11888r - AidSource.this.f11889s);
                            i6 += AidSource.this.f11888r - AidSource.this.f11889s;
                            length -= AidSource.this.f11888r - AidSource.this.f11889s;
                            if (AidSource.this.f11891u == null) {
                                n8c.c("aidStream", "publichelp: new mHelpMixAudioProcess");
                                AidSource.this.f11891u = new AudioProcess();
                            }
                            if (AidSource.this.f11883m != null && AidSource.this.f11891u != null) {
                                n8c.c("aidStream", "publichelp: mRemainAudioIndex > 0, pos=" + i6 + ";lens:" + length);
                                AidSource.this.f11891u.putSurroundData(new mpd0(bArr2, System.nanoTime() / 1000, 2));
                            }
                            AidSource.this.f11889s = 0;
                        } else {
                            byte[] bArr3 = new byte[aidSource.f11888r];
                            System.arraycopy(bArr, i6, bArr3, 0, AidSource.this.f11888r);
                            if (AidSource.this.f11883m != null && AidSource.this.f11891u != null) {
                                n8c.c("aidStream", "mRemainAudioIndex=0, pos=" + i6 + ";lens:" + length + ",mAudiobufferSize=" + AidSource.this.f11888r);
                                AidSource.this.f11891u.putSurroundData(new mpd0(bArr3, System.nanoTime() / 1000, 2));
                            }
                            length -= AidSource.this.f11888r;
                            i6 += AidSource.this.f11888r;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        AidSource.this.f11889s = 0;
                        AidSource.this.f11890t.clear();
                        n8c.c("aidStream", "onMediaDateCallback:exception");
                        return;
                    }
                }
                if (length > 0) {
                    AidSource.this.f11890t.put(bArr, i6, length);
                    AidSource.this.f11889s = length;
                    n8c.c("aidStream", "mRemainAudioPublishHelp.put:pos:" + i6 + ";lens:" + AidSource.this.f11889s);
                }
            }
        };
        this.f11873b = str;
        this.f11872a = activity;
        this.f11876e = j;
        this.f11885o = momoSurface;
        this.f11882l = ijkmediastreamer;
        this.f11881k = streamProducer;
        if (i == 1) {
            m10695y2(sizeChangedCallback);
        }
        m10694x2(aidswitchresolution);
        if (this.f11872a == null || momoSurface == null || ijkmediastreamer == null || str == null) {
            n8c.c("aidStream", "----AidSource: input error---userid=" + this.f11876e);
            return;
        }
        int i4 = this.f11887q;
        if (i4 != 0 && i4 != 5) {
            n8c.c("aidStream", "----AidSource: open status error: " + this.f11887q);
        }
        n8c.c("aidStream", "----AidSource: begin old:" + this.f11877f + "--->new:" + i + "; player status:" + this.f11887q);
        if (i2 != 3 && i2 != -1 && this.f11877f == 9) {
            m10683t2(false);
        }
        this.f11877f = i;
        this.f11887q = 0;
        this.f11886p = System.currentTimeMillis();
        n8c.c("aidStream", "AidSource: begin, " + this.f11873b + ", type=" + i + ",id=" + this.f11876e);
        this.f11884n = new helpSurface(null, this.f11876e);
        this.f11885o.m10942d0(j, this.f11877f, 0);
        try {
            try {
                IjkMediaPlayer ijkMediaPlayer = new IjkMediaPlayer(this.f11872a.getApplicationContext());
                this.f11883m = ijkMediaPlayer;
                ijkMediaPlayer.setOnPreparedListener(new IMediaPlayer.OnPreparedListener() { // from class: tv.danmaku.ijk.media.source.AidSource.3
                    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
                    public void onPrepared(IMediaPlayer iMediaPlayer) {
                        AidSource.this.f11875d = iMediaPlayer.getVideoWidth();
                        AidSource.this.f11874c = iMediaPlayer.getVideoHeight();
                        n8c.c("aidStream", "----AidSource: <onPrepared> cost time:" + (System.currentTimeMillis() - AidSource.this.f11886p) + "ms,mAidMode=" + AidSource.this.f11877f + ",width=" + AidSource.this.f11875d + ", height=" + AidSource.this.f11874c);
                        if (AidSource.this.f11885o != null && AidSource.this.f11874c > 0 && AidSource.this.f11875d > 0) {
                            AidSource.this.m10660R1(iMediaPlayer);
                            return;
                        }
                        n8c.c("aidStream", "----AidSource: <onPrepared> get size[" + AidSource.this.f11875d + "," + AidSource.this.f11874c + "] params failed!!!");
                    }
                });
                int i5 = this.f11877f;
                if (i5 == 2 || i5 == 3 || i5 == 9) {
                    this.f11883m.setMediaCodecEnabled(false);
                    this.f11892v = 0;
                    n8c.c("aidStream", "----Media codec 0");
                } else if (i5 == 1 && (streamProducer2 = this.f11881k) != null && streamProducer2.m11125H0() == 0) {
                    this.f11883m.setMediaCodecEnabled(false);
                    this.f11892v = 0;
                    n8c.c("aidStream", "----Media codec 1 change 0");
                } else {
                    i3 = 1;
                    try {
                        this.f11883m.setMediaCodecEnabled(true);
                        this.f11892v = 1;
                        n8c.c("aidStream", "----Media codec 1");
                    } catch (IOException unused) {
                        int i6 = this.f11877f;
                        if (i6 == 0 || i6 == i3) {
                            ijkMediaStreamer.postEventFromStreamPro(this.f11882l, 200, 210, 0, null);
                            n8c.c("aidStream", "AidSource: msg:210");
                        } else if (i6 == 2 || i6 == 3 || i6 == 9) {
                            ijkMediaStreamer.postEventFromStreamPro(this.f11882l, 200, 209, 0, null);
                            n8c.c("aidStream", "AidSource: msg:209");
                        } else if (i6 == 8) {
                            ijkMediaStreamer.postEventFromStreamPro(this.f11882l, 200, 210, 0, null);
                            n8c.c("aidStream", "AidSource: msg:210");
                        }
                        if (m10688q2() != null) {
                            z2 = true;
                            if (this.f11877f == 1) {
                                m10688q2().m11309a(352, 640);
                            }
                        } else {
                            z2 = true;
                        }
                        this.f11887q = 4;
                        m10683t2(z2);
                        return;
                    }
                }
                this.f11883m.setOnCompletionListener(new IMediaPlayer.OnCompletionListener() { // from class: tv.danmaku.ijk.media.source.AidSource.4
                    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
                    public void onCompletion(IMediaPlayer iMediaPlayer) {
                        n8c.c("aidStream", "----AidSource: <onCompletion> cost time:" + (System.currentTimeMillis() - AidSource.this.f11886p) + "ms");
                        boolean z3 = false;
                        if (AidSource.this.f11877f != 0 && AidSource.this.f11877f != 1) {
                            if (AidSource.this.f11877f == 3 || AidSource.this.f11877f == 9) {
                                ijkMediaStreamer.postEventFromStreamPro(AidSource.this.f11882l, 200, HttpStatus.PARTIAL_CONTENT_206, 0, null);
                                n8c.c("aidStream", "AidSource: msg:206");
                            } else if (AidSource.this.f11877f == 2) {
                                ijkMediaStreamer.postEventFromStreamPro(AidSource.this.f11882l, 200, HttpStatus.RESET_CONTENT_205, 0, null);
                                n8c.c("aidStream", "AidSource: msg:205");
                            }
                            if (AidSource.this.m10688q2() != null && AidSource.this.f11877f == 1) {
                                AidSource.this.m10688q2().m11309a(352, 640);
                            }
                            AidSource.this.m10683t2(z3);
                        }
                        ijkMediaStreamer.postEventFromStreamPro(AidSource.this.f11882l, 200, HttpStatus.NON_AUTHORITATIVE_INFORMATION_203, 0, null);
                        n8c.c("aidStream", "AidSource: msg:203");
                        z3 = true;
                        if (AidSource.this.m10688q2() != null) {
                            AidSource.this.m10688q2().m11309a(352, 640);
                        }
                        AidSource.this.m10683t2(z3);
                    }
                });
                this.f11883m.setOnSeekCompleteListener(new IMediaPlayer.OnSeekCompleteListener() { // from class: tv.danmaku.ijk.media.source.AidSource.5
                    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
                    public void onSeekComplete(IMediaPlayer iMediaPlayer) {
                        ijkMediaStreamer.postEventFromStreamPro(AidSource.this.f11882l, 200, 212, 0, null);
                        n8c.c("aidStream", "-------------SeekComplete");
                    }
                });
                this.f11883m.setOnInfoListener(new IMediaPlayer.OnInfoListener() { // from class: tv.danmaku.ijk.media.source.AidSource.6
                    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
                    public boolean onInfo(IMediaPlayer iMediaPlayer, int i7, int i8) {
                        if (iMediaPlayer == null) {
                            return true;
                        }
                        if (i7 == 701) {
                            n8c.c("aidStream", "-------------start");
                            return true;
                        }
                        if (i7 != 702) {
                            return true;
                        }
                        n8c.c("aidStream", "-------------end");
                        return true;
                    }
                });
                this.f11883m.setOnBufferingUpdateListener(new IMediaPlayer.OnBufferingUpdateListener() { // from class: tv.danmaku.ijk.media.source.AidSource.7
                    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
                    public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i7) {
                    }
                });
                this.f11883m.setOnVideoMediacodecChangedListener(new IMediaPlayer.OnVideoMediacodecChangedListener() { // from class: tv.danmaku.ijk.media.source.AidSource.8
                    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoMediacodecChangedListener
                    public void onVideoMediacodecChanged(IMediaPlayer iMediaPlayer, int i7) {
                        n8c.c("aidStream", "----AidSource: <MediacodecChanged> " + AidSource.this.f11892v + "," + i7);
                        if (i7 == 1 && AidSource.this.f11892v == 1) {
                            AidSource.this.f11892v = 0;
                            if (AidSource.this.f11881k != null) {
                                AidSource.this.f11881k.m11210x1(AidSource.this.f11892v);
                            }
                            if (AidSource.this.f11877f == 0 || AidSource.this.f11877f == 1) {
                                ijkMediaStreamer.postEventFromStreamPro(AidSource.this.f11882l, 200, 210, 0, null);
                                n8c.c("aidStream", "AidSource: msg:210");
                            } else if (AidSource.this.f11877f == 2 || AidSource.this.f11877f == 3 || AidSource.this.f11877f == 9) {
                                ijkMediaStreamer.postEventFromStreamPro(AidSource.this.f11882l, 200, 209, 0, null);
                                n8c.c("aidStream", "AidSource: msg:209");
                            } else if (AidSource.this.f11877f == 8) {
                                ijkMediaStreamer.postEventFromStreamPro(AidSource.this.f11882l, 200, 210, 0, null);
                                n8c.c("aidStream", "AidSource: msg:210");
                            }
                            if (AidSource.this.m10688q2() != null && AidSource.this.f11877f == 1) {
                                AidSource.this.m10688q2().m11309a(352, 640);
                            }
                            AidSource.this.m10683t2(true);
                        }
                    }
                });
                this.f11883m.setOnVideoSizeChangedListener(new IMediaPlayer.OnVideoSizeChangedListener() { // from class: tv.danmaku.ijk.media.source.AidSource.9
                    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
                    public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i7, int i8, int i9, int i10) {
                        int videoWidth = iMediaPlayer.getVideoWidth();
                        int videoHeight = iMediaPlayer.getVideoHeight();
                        if (AidSource.this.f11875d == -1 || AidSource.this.f11874c == -1) {
                            return;
                        }
                        if (videoWidth != i7 || videoHeight != i8) {
                            n8c.c("aidStream", "----AidSource: <changed> no same" + i7 + "," + i8);
                        }
                        if (videoWidth == AidSource.this.f11875d && videoHeight == AidSource.this.f11874c) {
                            return;
                        }
                        n8c.c("aidStream", "----AidSource: <changed>(" + AidSource.this.f11875d + "," + AidSource.this.f11874c + ")--->(" + videoWidth + "," + videoHeight + "), cost time:" + (System.currentTimeMillis() - AidSource.this.f11886p) + "ms, mAidMode=" + AidSource.this.f11877f);
                        if (AidSource.this.f11875d == 0 || AidSource.this.f11874c == 0) {
                            AidSource.this.f11875d = videoWidth;
                            AidSource.this.f11874c = videoHeight;
                            AidSource.this.m10660R1(iMediaPlayer);
                            return;
                        }
                        AidSource.this.f11875d = videoWidth;
                        AidSource.this.f11874c = videoHeight;
                        if (AidSource.this.f11885o != null) {
                            AidSource.this.f11885o.m10933X0(AidSource.this.f11876e, AidSource.this.f11875d, AidSource.this.f11874c, 1, AidSource.this.f11877f);
                        }
                        if (AidSource.this.m10689r2() != null) {
                            AidSource.this.m10689r2().m11308a(AidSource.this.f11875d, AidSource.this.f11874c);
                        }
                        AidSource aidSource = AidSource.this;
                        aidSource.m10693w2(aidSource.f11875d, AidSource.this.f11874c);
                    }
                });
                this.f11883m.setOnErrorListener(new IMediaPlayer.OnErrorListener() { // from class: tv.danmaku.ijk.media.source.AidSource.10
                    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
                    public boolean onError(IMediaPlayer iMediaPlayer, int i7, int i8) {
                        n8c.c("aidStream", "AidSource: <OnError> cost time:" + (System.currentTimeMillis() - AidSource.this.f11886p) + "ms, " + i7 + "," + i8);
                        if (AidSource.this.f11877f == 0 || AidSource.this.f11877f == 1) {
                            ijkMediaStreamer.postEventFromStreamPro(AidSource.this.f11882l, 200, 210, 0, null);
                            n8c.c("aidStream", "AidSource: msg:210");
                        } else if (AidSource.this.f11877f == 2 || AidSource.this.f11877f == 3 || AidSource.this.f11877f == 9) {
                            ijkMediaStreamer.postEventFromStreamPro(AidSource.this.f11882l, 200, 209, 0, null);
                            n8c.c("aidStream", "AidSource: msg:209");
                        } else if (AidSource.this.f11877f == 8) {
                            ijkMediaStreamer.postEventFromStreamPro(AidSource.this.f11882l, 200, 210, 0, null);
                            n8c.c("aidStream", "AidSource: msg:210");
                        }
                        if (AidSource.this.m10688q2() != null && AidSource.this.f11877f == 1) {
                            AidSource.this.m10688q2().m11309a(352, 640);
                        }
                        AidSource.this.m10683t2(true);
                        return true;
                    }
                });
                this.f11883m.setSurfaceH(this.f11884n.m11341c());
                this.f11883m.setDataSource(this.f11873b.toString());
                i3 = 1;
                this.f11883m.setMediaDateCallbackFlags(1);
                this.f11884n.m11345h(this.f11885o);
                this.f11887q = 1;
                this.f11883m.prepareAsync();
                int i7 = this.f11877f;
                if (i7 == 3 || i7 == 8 || i7 == 9) {
                    this.f11883m.setVolume(1.0f, 1.0f);
                } else {
                    this.f11883m.setVolume(0.0f, 0.0f);
                }
                n8c.c("aidStream", "AidSource: end, cost time:" + (System.currentTimeMillis() - this.f11886p) + "ms");
            } catch (IOException unused2) {
                i3 = 1;
            }
        } catch (IllegalArgumentException unused3) {
            int i8 = this.f11877f;
            if (i8 == 0 || i8 == 1) {
                ijkMediaStreamer.postEventFromStreamPro(this.f11882l, 200, 210, 0, null);
                n8c.c("aidStream", "AidSource: msg:210");
            } else if (i8 == 2 || i8 == 3 || i8 == 9) {
                ijkMediaStreamer.postEventFromStreamPro(this.f11882l, 200, 209, 0, null);
                n8c.c("aidStream", "AidSource: msg:209");
            } else if (i8 == 8) {
                ijkMediaStreamer.postEventFromStreamPro(this.f11882l, 200, 210, 0, null);
                n8c.c("aidStream", "AidSource: msg:210");
            }
            if (m10688q2() != null) {
                z = true;
                if (this.f11877f == 1) {
                    m10688q2().m11309a(352, 640);
                }
            } else {
                z = true;
            }
            this.f11887q = 4;
            m10683t2(z);
        }
    }

    /* JADX INFO: renamed from: A2 */
    private String m10658A2(long j) {
        int i = (int) (j / 1000);
        return Integer.toString(i / 3600) + ":" + Integer.toString((i / 60) % 60) + ":" + Integer.toString(i % 60);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q1 */
    public void m10659Q1(int i, int i2, int i3, int i4) {
        int i5 = (i * i4) / i3;
        int i6 = (i2 * i3) / i4;
        if (i6 < i) {
            this.f11885o.m10931W0(this.f11876e, (i - i6) / 2, 0, i6, i2, 0);
            return;
        }
        MomoSurface momoSurface = this.f11885o;
        if (i5 < i2) {
            momoSurface.m10931W0(this.f11876e, 0, (i2 - i5) / 2, i, i5, 0);
        } else {
            momoSurface.m10931W0(this.f11876e, 0, 0, i, i2, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R1 */
    public void m10660R1(IMediaPlayer iMediaPlayer) {
        MomoSurface momoSurface = this.f11885o;
        if (momoSurface == null || iMediaPlayer == null) {
            return;
        }
        momoSurface.m10933X0(this.f11876e, this.f11875d, this.f11874c, 0, this.f11877f);
        this.f11885o.m10927T0(this.f11876e, new FirstFrameDrawCallback() { // from class: tv.danmaku.ijk.media.source.AidSource.2
            @Override // tv.danmaku.ijk.media.source.AidSource.FirstFrameDrawCallback
            /* JADX INFO: renamed from: a */
            public void mo10697a() {
                n8c.a("aidStream", "----FirstFrameDrawCallback");
                if (AidSource.this.f11882l != null) {
                    if (AidSource.this.f11877f == 2 || AidSource.this.f11877f == 3 || AidSource.this.f11877f == 9) {
                        ijkMediaStreamer.postEventFromStreamPro(AidSource.this.f11882l, 200, 208, 0, null);
                        n8c.c("aidStream", "----first frame draw finish callback: msg:208;" + AidSource.this.f11877f);
                        if (AidSource.this.f11877f == 9) {
                            AidSource aidSource = AidSource.this;
                            aidSource.m10659Q1(352, 640, aidSource.f11875d, AidSource.this.f11874c);
                        }
                    }
                }
            }
        });
        this.f11887q = 2;
        if (m10689r2() != null) {
            m10689r2().m11308a(this.f11875d, this.f11874c);
        }
        m10693w2(this.f11875d, this.f11874c);
        int i = this.f11877f;
        if (i == 0 || i == 1) {
            ijkMediaStreamer.postEventFromStreamPro(this.f11882l, 200, HttpStatus.ACCEPTED_202, 0, null);
            n8c.c("aidStream", "AidSource: msg:202");
        } else if (i == 2 || i == 3 || i == 9) {
            ijkMediaStreamer.postEventFromStreamPro(this.f11882l, 200, HttpStatus.NO_CONTENT_204, 0, null);
            n8c.c("aidStream", "AidSource: msg:204");
        } else if (i == 8) {
            ijkMediaStreamer.postEventFromStreamPro(this.f11882l, 200, HttpStatus.ACCEPTED_202, 0, null);
            n8c.c("aidStream", "AidSource: msg:202");
        }
        iMediaPlayer.start();
        this.f11887q = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t2 */
    public void m10683t2(boolean z) {
        if (z) {
            MomoSurface momoSurface = this.f11885o;
            if (momoSurface != null) {
                momoSurface.m10939b1(this.f11876e, true);
            }
            this.f11877f = -1;
        }
        if (this.f11883m != null && this.f11887q != 5) {
            this.f11887q = 5;
            m10695y2(null);
            this.f11883m.setMediaDataCallback(null);
            this.f11883m.setOnErrorListener(null);
            this.f11883m.setOnCompletionListener(null);
            this.f11883m.setOnPreparedListener(null);
            this.f11883m.setOnVideoSizeChangedListener(null);
            m10693w2(0, 0);
            this.f11883m.stop();
            this.f11883m.release();
            this.f11883m = null;
            helpSurface helpsurface = this.f11884n;
            if (helpsurface != null) {
                helpsurface.m11344g();
                this.f11884n = null;
            }
        }
        m10694x2(null);
        n8c.c("aidStream", "AidSource: release, cost time:" + (System.currentTimeMillis() - this.f11886p) + "ms");
    }

    /* JADX INFO: renamed from: B2 */
    public void m10684B2(long j, SurfaceTexture surfaceTexture, int i, Bitmap bitmap) {
        MomoSurface momoSurface = this.f11885o;
        if (momoSurface != null) {
            momoSurface.m10950i1(j, surfaceTexture, i, bitmap);
        }
    }

    /* JADX INFO: renamed from: C2 */
    public void m10685C2(long j, int i, int i2, int i3, int i4, int i5) {
        if (this.f11885o != null) {
            n8c.c("aidStream", "@@@ viewPort: id[" + j + "], view[" + i + "," + i2 + "," + i3 + "," + i4 + "], z=" + i5);
            int i6 = this.f11877f;
            this.f11885o.m10931W0(j, i, i2, i3, i4, (j == ((long) i6) && i6 == 7) ? 0 : 1);
        }
    }

    public long getDuration() {
        IjkMediaPlayer ijkMediaPlayer = this.f11883m;
        if (ijkMediaPlayer != null) {
            return ijkMediaPlayer.getDuration();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: o2 */
    public void m10686o2(long j, boolean z) {
        if (this.f11885o != null) {
            n8c.c("aidStream", "@@@ fullScreen: id[" + j + "], full=" + z);
            this.f11885o.m10929U0(j, z);
        }
    }

    /* JADX INFO: renamed from: p2 */
    public long m10687p2() {
        IjkMediaPlayer ijkMediaPlayer = this.f11883m;
        if (ijkMediaPlayer != null) {
            return ijkMediaPlayer.getCurrentPosition();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: q2 */
    public ijkMediaStreamer.aidSwitchResolution m10688q2() {
        n8c.c("aidStream", "----" + this.f11875d + "," + this.f11874c + "--->352,640");
        return this.f11880j;
    }

    /* JADX INFO: renamed from: r2 */
    public ijkMediaStreamer.SizeChangedCallback m10689r2() {
        return this.f11879i;
    }

    /* JADX INFO: renamed from: s2 */
    public void m10690s2(long j, boolean z) {
        MomoSurface momoSurface = this.f11885o;
        if (momoSurface != null) {
            momoSurface.m10930V0(j, z);
        }
    }

    /* JADX INFO: renamed from: u2 */
    public void m10691u2(int i) {
        int i2;
        n8c.c("aidStream", " remove, start[" + i + "]: cost time:" + (System.currentTimeMillis() - this.f11886p) + "ms");
        int i3 = this.f11887q;
        if (i3 == 3 || i3 == 1 || i3 == 2) {
            this.f11887q = 4;
        }
        if (i == 1) {
            int i4 = this.f11877f;
            m10683t2(true);
            if (i4 == 0 || i4 == 1) {
                ijkMediaStreamer.postEventFromStreamPro(this.f11882l, 200, Primes.SMALL_FACTOR_LIMIT, 0, null);
                n8c.c("aidStream", "remove: msg:211");
            } else if (i4 == 2 || i4 == 3 || (i2 = this.f11877f) == 9) {
                ijkMediaStreamer.postEventFromStreamPro(this.f11882l, 200, HttpStatus.MULTI_STATUS_207, 0, null);
                n8c.c("aidStream", "remove: msg:207");
            } else if (i2 == 8) {
                ijkMediaStreamer.postEventFromStreamPro(this.f11882l, 200, Primes.SMALL_FACTOR_LIMIT, 0, null);
                n8c.c("aidStream", "remove: msg:211");
            }
            this.f11877f = -1;
        } else {
            m10683t2(false);
        }
        n8c.c("aidStream", "remove, end[" + i + "]: cost time:" + (System.currentTimeMillis() - this.f11886p) + "ms");
    }

    /* JADX INFO: renamed from: v2 */
    public void m10692v2(long j) {
        if (this.f11883m != null) {
            n8c.c("aidStream", "-----seekTo:" + j + "(" + m10658A2(j) + ")ms");
            this.f11883m.seekTo(j);
        }
    }

    /* JADX INFO: renamed from: w2 */
    public void m10693w2(int i, int i2) {
    }

    /* JADX INFO: renamed from: x2 */
    public void m10694x2(ijkMediaStreamer.aidSwitchResolution aidswitchresolution) {
        this.f11880j = aidswitchresolution;
    }

    /* JADX INFO: renamed from: y2 */
    public void m10695y2(ijkMediaStreamer.SizeChangedCallback sizeChangedCallback) {
        this.f11879i = sizeChangedCallback;
    }

    /* JADX INFO: renamed from: z2 */
    public void m10696z2(long j, int i, int i2, int i3, int i4) {
        MomoSurface momoSurface = this.f11885o;
        if (momoSurface != null) {
            momoSurface.m10933X0(j, i, i2, i3, i4);
        }
    }

    public AidSource(Bitmap bitmap, MomoSurface momoSurface, long j, int i) {
        this.f11872a = null;
        this.f11874c = -1;
        this.f11875d = -1;
        this.f11876e = -1L;
        this.f11877f = -1;
        this.f11878g = null;
        this.f11879i = null;
        this.f11880j = null;
        this.f11881k = null;
        this.f11882l = null;
        this.f11883m = null;
        this.f11884n = null;
        this.f11885o = null;
        this.f11887q = 0;
        this.f11888r = 1024;
        this.f11889s = 0;
        this.f11890t = ByteBuffer.allocate(1024);
        this.f11892v = -1;
        this.f11893x = new IjkMediaPlayer.MediaDateCallback() { // from class: tv.danmaku.ijk.media.source.AidSource.1
            @Override // tv.danmaku.ijk.media.player.IjkMediaPlayer.MediaDateCallback
            public void onMediaDateCallback(byte[] bArr, int i4, int i5, IjkMediaPlayer ijkMediaPlayer) {
                int length = bArr.length;
                if (AidSource.this.f11881k == null || !AidSource.this.f11881k.m11133L0()) {
                    return;
                }
                n8c.c("aidStream", "public help data.len" + bArr.length + ";recording:" + AidSource.this.f11881k.m11133L0());
                int i6 = 0;
                while (length >= AidSource.this.f11888r) {
                    try {
                        int i7 = AidSource.this.f11889s;
                        AidSource aidSource = AidSource.this;
                        if (i7 > 0) {
                            byte[] bArr2 = new byte[aidSource.f11888r];
                            AidSource.this.f11890t.rewind();
                            AidSource.this.f11890t.get(bArr2, 0, AidSource.this.f11889s);
                            AidSource.this.f11890t.clear();
                            n8c.c("aidStream", "mRemainAudioIndex > 0 arraycopy :" + i6 + ";mRemainAudioIndex:" + AidSource.this.f11889s);
                            System.arraycopy(bArr, i6, bArr2, AidSource.this.f11889s, AidSource.this.f11888r - AidSource.this.f11889s);
                            i6 += AidSource.this.f11888r - AidSource.this.f11889s;
                            length -= AidSource.this.f11888r - AidSource.this.f11889s;
                            if (AidSource.this.f11891u == null) {
                                n8c.c("aidStream", "publichelp: new mHelpMixAudioProcess");
                                AidSource.this.f11891u = new AudioProcess();
                            }
                            if (AidSource.this.f11883m != null && AidSource.this.f11891u != null) {
                                n8c.c("aidStream", "publichelp: mRemainAudioIndex > 0, pos=" + i6 + ";lens:" + length);
                                AidSource.this.f11891u.putSurroundData(new mpd0(bArr2, System.nanoTime() / 1000, 2));
                            }
                            AidSource.this.f11889s = 0;
                        } else {
                            byte[] bArr3 = new byte[aidSource.f11888r];
                            System.arraycopy(bArr, i6, bArr3, 0, AidSource.this.f11888r);
                            if (AidSource.this.f11883m != null && AidSource.this.f11891u != null) {
                                n8c.c("aidStream", "mRemainAudioIndex=0, pos=" + i6 + ";lens:" + length + ",mAudiobufferSize=" + AidSource.this.f11888r);
                                AidSource.this.f11891u.putSurroundData(new mpd0(bArr3, System.nanoTime() / 1000, 2));
                            }
                            length -= AidSource.this.f11888r;
                            i6 += AidSource.this.f11888r;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        AidSource.this.f11889s = 0;
                        AidSource.this.f11890t.clear();
                        n8c.c("aidStream", "onMediaDateCallback:exception");
                        return;
                    }
                }
                if (length > 0) {
                    AidSource.this.f11890t.put(bArr, i6, length);
                    AidSource.this.f11889s = length;
                    n8c.c("aidStream", "mRemainAudioPublishHelp.put:pos:" + i6 + ";lens:" + AidSource.this.f11889s);
                }
            }
        };
        if (bitmap == null || momoSurface == null) {
            return;
        }
        n8c.c("aidStream", "@@@ AidSource: image begin---userid=" + j);
        this.f11885o = momoSurface;
        this.f11878g = bitmap;
        this.f11876e = j;
        this.f11877f = 7;
        n8c.c("aidStream", "@@@ AidSource: cast image---userid=" + this.f11876e + ";aidMode=" + this.f11877f);
        this.f11875d = bitmap.getWidth();
        this.f11874c = bitmap.getHeight();
        MomoSurface momoSurface2 = this.f11885o;
        if (momoSurface2 != null) {
            momoSurface2.m10942d0(j, this.f11877f, 0);
            this.f11885o.m10933X0(this.f11876e, this.f11875d, this.f11874c, 0, this.f11877f);
            this.f11885o.m10950i1(this.f11876e, null, -1, this.f11878g);
        }
        n8c.c("aidStream", "@@@ AidSource: image end, cost time:" + (System.currentTimeMillis() - this.f11886p) + "ms");
    }
}
