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
import p153l.gfj;
import p153l.oxd0;
import p153l.t9c;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import tv.danmaku.ijk.media.streamer.MomoSurface;
import tv.danmaku.ijk.media.streamer.StreamProducer;
import tv.danmaku.ijk.media.streamer.ijkMediaStreamer;
import tv.danmaku.ijk.media.util.helpSurface;

/* JADX INFO: loaded from: classes3.dex */
public class AidSource extends gfj {

    /* JADX INFO: renamed from: a */
    private Activity f209169a;

    /* JADX INFO: renamed from: b */
    private String f209170b;

    /* JADX INFO: renamed from: c */
    private int f209171c;

    /* JADX INFO: renamed from: d */
    private int f209172d;

    /* JADX INFO: renamed from: e */
    private long f209173e;

    /* JADX INFO: renamed from: f */
    private int f209174f;

    /* JADX INFO: renamed from: g */
    private Bitmap f209175g;

    /* JADX INFO: renamed from: i */
    private ijkMediaStreamer.SizeChangedCallback f209176i;

    /* JADX INFO: renamed from: j */
    private ijkMediaStreamer.aidSwitchResolution f209177j;

    /* JADX INFO: renamed from: k */
    private StreamProducer f209178k;

    /* JADX INFO: renamed from: l */
    private ijkMediaStreamer f209179l;

    /* JADX INFO: renamed from: m */
    private IjkMediaPlayer f209180m;

    /* JADX INFO: renamed from: n */
    private helpSurface f209181n;

    /* JADX INFO: renamed from: o */
    private MomoSurface f209182o;

    /* JADX INFO: renamed from: p */
    private long f209183p;

    /* JADX INFO: renamed from: q */
    private int f209184q;

    /* JADX INFO: renamed from: r */
    private int f209185r;

    /* JADX INFO: renamed from: s */
    private int f209186s;

    /* JADX INFO: renamed from: t */
    private ByteBuffer f209187t;

    /* JADX INFO: renamed from: u */
    private AudioProcess f209188u;

    /* JADX INFO: renamed from: v */
    private int f209189v;

    /* JADX INFO: renamed from: x */
    private IjkMediaPlayer.MediaDateCallback f209190x;

    public interface FirstFrameDrawCallback {
        /* JADX INFO: renamed from: a */
        void mo223472a();
    }

    public AidSource(Activity activity, StreamProducer streamProducer, ijkMediaStreamer ijkmediastreamer, String str, MomoSurface momoSurface, long j, ijkMediaStreamer.SizeChangedCallback sizeChangedCallback, int i, int i2, ijkMediaStreamer.aidSwitchResolution aidswitchresolution) {
        boolean z;
        int i3;
        boolean z2;
        StreamProducer streamProducer2;
        this.f209169a = null;
        this.f209171c = -1;
        this.f209172d = -1;
        this.f209173e = -1L;
        this.f209174f = -1;
        this.f209175g = null;
        this.f209176i = null;
        this.f209177j = null;
        this.f209178k = null;
        this.f209179l = null;
        this.f209180m = null;
        this.f209181n = null;
        this.f209182o = null;
        this.f209184q = 0;
        this.f209185r = 1024;
        this.f209186s = 0;
        this.f209187t = ByteBuffer.allocate(1024);
        this.f209189v = -1;
        this.f209190x = new IjkMediaPlayer.MediaDateCallback() { // from class: tv.danmaku.ijk.media.source.AidSource.1
            @Override // tv.danmaku.ijk.media.player.IjkMediaPlayer.MediaDateCallback
            public void onMediaDateCallback(byte[] bArr, int i4, int i5, IjkMediaPlayer ijkMediaPlayer) {
                int length = bArr.length;
                if (AidSource.this.f209178k == null || !AidSource.this.f209178k.m223908L0()) {
                    return;
                }
                t9c.m189745c("aidStream", "public help data.len" + bArr.length + ";recording:" + AidSource.this.f209178k.m223908L0());
                int i6 = 0;
                while (length >= AidSource.this.f209185r) {
                    try {
                        int i7 = AidSource.this.f209186s;
                        AidSource aidSource = AidSource.this;
                        if (i7 > 0) {
                            byte[] bArr2 = new byte[aidSource.f209185r];
                            AidSource.this.f209187t.rewind();
                            AidSource.this.f209187t.get(bArr2, 0, AidSource.this.f209186s);
                            AidSource.this.f209187t.clear();
                            t9c.m189745c("aidStream", "mRemainAudioIndex > 0 arraycopy :" + i6 + ";mRemainAudioIndex:" + AidSource.this.f209186s);
                            System.arraycopy(bArr, i6, bArr2, AidSource.this.f209186s, AidSource.this.f209185r - AidSource.this.f209186s);
                            i6 += AidSource.this.f209185r - AidSource.this.f209186s;
                            length -= AidSource.this.f209185r - AidSource.this.f209186s;
                            if (AidSource.this.f209188u == null) {
                                t9c.m189745c("aidStream", "publichelp: new mHelpMixAudioProcess");
                                AidSource.this.f209188u = new AudioProcess();
                            }
                            if (AidSource.this.f209180m != null && AidSource.this.f209188u != null) {
                                t9c.m189745c("aidStream", "publichelp: mRemainAudioIndex > 0, pos=" + i6 + ";lens:" + length);
                                AidSource.this.f209188u.putSurroundData(new oxd0(bArr2, System.nanoTime() / 1000, 2));
                            }
                            AidSource.this.f209186s = 0;
                        } else {
                            byte[] bArr3 = new byte[aidSource.f209185r];
                            System.arraycopy(bArr, i6, bArr3, 0, AidSource.this.f209185r);
                            if (AidSource.this.f209180m != null && AidSource.this.f209188u != null) {
                                t9c.m189745c("aidStream", "mRemainAudioIndex=0, pos=" + i6 + ";lens:" + length + ",mAudiobufferSize=" + AidSource.this.f209185r);
                                AidSource.this.f209188u.putSurroundData(new oxd0(bArr3, System.nanoTime() / 1000, 2));
                            }
                            length -= AidSource.this.f209185r;
                            i6 += AidSource.this.f209185r;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        AidSource.this.f209186s = 0;
                        AidSource.this.f209187t.clear();
                        t9c.m189745c("aidStream", "onMediaDateCallback:exception");
                        return;
                    }
                }
                if (length > 0) {
                    AidSource.this.f209187t.put(bArr, i6, length);
                    AidSource.this.f209186s = length;
                    t9c.m189745c("aidStream", "mRemainAudioPublishHelp.put:pos:" + i6 + ";lens:" + AidSource.this.f209186s);
                }
            }
        };
        this.f209170b = str;
        this.f209169a = activity;
        this.f209173e = j;
        this.f209182o = momoSurface;
        this.f209179l = ijkmediastreamer;
        this.f209178k = streamProducer;
        if (i == 1) {
            m223470y2(sizeChangedCallback);
        }
        m223469x2(aidswitchresolution);
        if (this.f209169a == null || momoSurface == null || ijkmediastreamer == null || str == null) {
            t9c.m189745c("aidStream", "----AidSource: input error---userid=" + this.f209173e);
            return;
        }
        int i4 = this.f209184q;
        if (i4 != 0 && i4 != 5) {
            t9c.m189745c("aidStream", "----AidSource: open status error: " + this.f209184q);
        }
        t9c.m189745c("aidStream", "----AidSource: begin old:" + this.f209174f + "--->new:" + i + "; player status:" + this.f209184q);
        if (i2 != 3 && i2 != -1 && this.f209174f == 9) {
            m223458t2(false);
        }
        this.f209174f = i;
        this.f209184q = 0;
        this.f209183p = System.currentTimeMillis();
        t9c.m189745c("aidStream", "AidSource: begin, " + this.f209170b + ", type=" + i + ",id=" + this.f209173e);
        this.f209181n = new helpSurface(null, this.f209173e);
        this.f209182o.m223717d0(j, this.f209174f, 0);
        try {
            try {
                IjkMediaPlayer ijkMediaPlayer = new IjkMediaPlayer(this.f209169a.getApplicationContext());
                this.f209180m = ijkMediaPlayer;
                ijkMediaPlayer.setOnPreparedListener(new IMediaPlayer.OnPreparedListener() { // from class: tv.danmaku.ijk.media.source.AidSource.3
                    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
                    public void onPrepared(IMediaPlayer iMediaPlayer) {
                        AidSource.this.f209172d = iMediaPlayer.getVideoWidth();
                        AidSource.this.f209171c = iMediaPlayer.getVideoHeight();
                        t9c.m189745c("aidStream", "----AidSource: <onPrepared> cost time:" + (System.currentTimeMillis() - AidSource.this.f209183p) + "ms,mAidMode=" + AidSource.this.f209174f + ",width=" + AidSource.this.f209172d + ", height=" + AidSource.this.f209171c);
                        if (AidSource.this.f209182o != null && AidSource.this.f209171c > 0 && AidSource.this.f209172d > 0) {
                            AidSource.this.m223435R1(iMediaPlayer);
                            return;
                        }
                        t9c.m189745c("aidStream", "----AidSource: <onPrepared> get size[" + AidSource.this.f209172d + Constants.SEPARATOR_COMMA + AidSource.this.f209171c + "] params failed!!!");
                    }
                });
                int i5 = this.f209174f;
                if (i5 == 2 || i5 == 3 || i5 == 9) {
                    this.f209180m.setMediaCodecEnabled(false);
                    this.f209189v = 0;
                    t9c.m189745c("aidStream", "----Media codec 0");
                } else if (i5 == 1 && (streamProducer2 = this.f209178k) != null && streamProducer2.m223900H0() == 0) {
                    this.f209180m.setMediaCodecEnabled(false);
                    this.f209189v = 0;
                    t9c.m189745c("aidStream", "----Media codec 1 change 0");
                } else {
                    i3 = 1;
                    try {
                        this.f209180m.setMediaCodecEnabled(true);
                        this.f209189v = 1;
                        t9c.m189745c("aidStream", "----Media codec 1");
                    } catch (IOException unused) {
                        int i6 = this.f209174f;
                        if (i6 == 0 || i6 == i3) {
                            ijkMediaStreamer.postEventFromStreamPro(this.f209179l, 200, 210, 0, null);
                            t9c.m189745c("aidStream", "AidSource: msg:210");
                        } else if (i6 == 2 || i6 == 3 || i6 == 9) {
                            ijkMediaStreamer.postEventFromStreamPro(this.f209179l, 200, 209, 0, null);
                            t9c.m189745c("aidStream", "AidSource: msg:209");
                        } else if (i6 == 8) {
                            ijkMediaStreamer.postEventFromStreamPro(this.f209179l, 200, 210, 0, null);
                            t9c.m189745c("aidStream", "AidSource: msg:210");
                        }
                        if (m223463q2() != null) {
                            z2 = true;
                            if (this.f209174f == 1) {
                                m223463q2().m224084a(352, 640);
                            }
                        } else {
                            z2 = true;
                        }
                        this.f209184q = 4;
                        m223458t2(z2);
                        return;
                    }
                }
                this.f209180m.setOnCompletionListener(new IMediaPlayer.OnCompletionListener() { // from class: tv.danmaku.ijk.media.source.AidSource.4
                    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
                    public void onCompletion(IMediaPlayer iMediaPlayer) {
                        t9c.m189745c("aidStream", "----AidSource: <onCompletion> cost time:" + (System.currentTimeMillis() - AidSource.this.f209183p) + "ms");
                        boolean z3 = false;
                        if (AidSource.this.f209174f != 0 && AidSource.this.f209174f != 1) {
                            if (AidSource.this.f209174f == 3 || AidSource.this.f209174f == 9) {
                                ijkMediaStreamer.postEventFromStreamPro(AidSource.this.f209179l, 200, 206, 0, null);
                                t9c.m189745c("aidStream", "AidSource: msg:206");
                            } else if (AidSource.this.f209174f == 2) {
                                ijkMediaStreamer.postEventFromStreamPro(AidSource.this.f209179l, 200, 205, 0, null);
                                t9c.m189745c("aidStream", "AidSource: msg:205");
                            }
                            if (AidSource.this.m223463q2() != null && AidSource.this.f209174f == 1) {
                                AidSource.this.m223463q2().m224084a(352, 640);
                            }
                            AidSource.this.m223458t2(z3);
                        }
                        ijkMediaStreamer.postEventFromStreamPro(AidSource.this.f209179l, 200, 203, 0, null);
                        t9c.m189745c("aidStream", "AidSource: msg:203");
                        z3 = true;
                        if (AidSource.this.m223463q2() != null) {
                            AidSource.this.m223463q2().m224084a(352, 640);
                        }
                        AidSource.this.m223458t2(z3);
                    }
                });
                this.f209180m.setOnSeekCompleteListener(new IMediaPlayer.OnSeekCompleteListener() { // from class: tv.danmaku.ijk.media.source.AidSource.5
                    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
                    public void onSeekComplete(IMediaPlayer iMediaPlayer) {
                        ijkMediaStreamer.postEventFromStreamPro(AidSource.this.f209179l, 200, 212, 0, null);
                        t9c.m189745c("aidStream", "-------------SeekComplete");
                    }
                });
                this.f209180m.setOnInfoListener(new IMediaPlayer.OnInfoListener() { // from class: tv.danmaku.ijk.media.source.AidSource.6
                    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
                    public boolean onInfo(IMediaPlayer iMediaPlayer, int i7, int i8) {
                        if (iMediaPlayer == null) {
                            return true;
                        }
                        if (i7 == 701) {
                            t9c.m189745c("aidStream", "-------------start");
                            return true;
                        }
                        if (i7 != 702) {
                            return true;
                        }
                        t9c.m189745c("aidStream", "-------------end");
                        return true;
                    }
                });
                this.f209180m.setOnBufferingUpdateListener(new IMediaPlayer.OnBufferingUpdateListener() { // from class: tv.danmaku.ijk.media.source.AidSource.7
                    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
                    public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i7) {
                    }
                });
                this.f209180m.setOnVideoMediacodecChangedListener(new IMediaPlayer.OnVideoMediacodecChangedListener() { // from class: tv.danmaku.ijk.media.source.AidSource.8
                    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoMediacodecChangedListener
                    public void onVideoMediacodecChanged(IMediaPlayer iMediaPlayer, int i7) {
                        t9c.m189745c("aidStream", "----AidSource: <MediacodecChanged> " + AidSource.this.f209189v + Constants.SEPARATOR_COMMA + i7);
                        if (i7 == 1 && AidSource.this.f209189v == 1) {
                            AidSource.this.f209189v = 0;
                            if (AidSource.this.f209178k != null) {
                                AidSource.this.f209178k.m223985x1(AidSource.this.f209189v);
                            }
                            if (AidSource.this.f209174f == 0 || AidSource.this.f209174f == 1) {
                                ijkMediaStreamer.postEventFromStreamPro(AidSource.this.f209179l, 200, 210, 0, null);
                                t9c.m189745c("aidStream", "AidSource: msg:210");
                            } else if (AidSource.this.f209174f == 2 || AidSource.this.f209174f == 3 || AidSource.this.f209174f == 9) {
                                ijkMediaStreamer.postEventFromStreamPro(AidSource.this.f209179l, 200, 209, 0, null);
                                t9c.m189745c("aidStream", "AidSource: msg:209");
                            } else if (AidSource.this.f209174f == 8) {
                                ijkMediaStreamer.postEventFromStreamPro(AidSource.this.f209179l, 200, 210, 0, null);
                                t9c.m189745c("aidStream", "AidSource: msg:210");
                            }
                            if (AidSource.this.m223463q2() != null && AidSource.this.f209174f == 1) {
                                AidSource.this.m223463q2().m224084a(352, 640);
                            }
                            AidSource.this.m223458t2(true);
                        }
                    }
                });
                this.f209180m.setOnVideoSizeChangedListener(new IMediaPlayer.OnVideoSizeChangedListener() { // from class: tv.danmaku.ijk.media.source.AidSource.9
                    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
                    public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i7, int i8, int i9, int i10) {
                        int videoWidth = iMediaPlayer.getVideoWidth();
                        int videoHeight = iMediaPlayer.getVideoHeight();
                        if (AidSource.this.f209172d == -1 || AidSource.this.f209171c == -1) {
                            return;
                        }
                        if (videoWidth != i7 || videoHeight != i8) {
                            t9c.m189745c("aidStream", "----AidSource: <changed> no same" + i7 + Constants.SEPARATOR_COMMA + i8);
                        }
                        if (videoWidth == AidSource.this.f209172d && videoHeight == AidSource.this.f209171c) {
                            return;
                        }
                        t9c.m189745c("aidStream", "----AidSource: <changed>(" + AidSource.this.f209172d + Constants.SEPARATOR_COMMA + AidSource.this.f209171c + ")--->(" + videoWidth + Constants.SEPARATOR_COMMA + videoHeight + "), cost time:" + (System.currentTimeMillis() - AidSource.this.f209183p) + "ms, mAidMode=" + AidSource.this.f209174f);
                        if (AidSource.this.f209172d == 0 || AidSource.this.f209171c == 0) {
                            AidSource.this.f209172d = videoWidth;
                            AidSource.this.f209171c = videoHeight;
                            AidSource.this.m223435R1(iMediaPlayer);
                            return;
                        }
                        AidSource.this.f209172d = videoWidth;
                        AidSource.this.f209171c = videoHeight;
                        if (AidSource.this.f209182o != null) {
                            AidSource.this.f209182o.m223708X0(AidSource.this.f209173e, AidSource.this.f209172d, AidSource.this.f209171c, 1, AidSource.this.f209174f);
                        }
                        if (AidSource.this.m223464r2() != null) {
                            AidSource.this.m223464r2().m224083a(AidSource.this.f209172d, AidSource.this.f209171c);
                        }
                        AidSource aidSource = AidSource.this;
                        aidSource.m223468w2(aidSource.f209172d, AidSource.this.f209171c);
                    }
                });
                this.f209180m.setOnErrorListener(new IMediaPlayer.OnErrorListener() { // from class: tv.danmaku.ijk.media.source.AidSource.10
                    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
                    public boolean onError(IMediaPlayer iMediaPlayer, int i7, int i8) {
                        t9c.m189745c("aidStream", "AidSource: <OnError> cost time:" + (System.currentTimeMillis() - AidSource.this.f209183p) + "ms, " + i7 + Constants.SEPARATOR_COMMA + i8);
                        if (AidSource.this.f209174f == 0 || AidSource.this.f209174f == 1) {
                            ijkMediaStreamer.postEventFromStreamPro(AidSource.this.f209179l, 200, 210, 0, null);
                            t9c.m189745c("aidStream", "AidSource: msg:210");
                        } else if (AidSource.this.f209174f == 2 || AidSource.this.f209174f == 3 || AidSource.this.f209174f == 9) {
                            ijkMediaStreamer.postEventFromStreamPro(AidSource.this.f209179l, 200, 209, 0, null);
                            t9c.m189745c("aidStream", "AidSource: msg:209");
                        } else if (AidSource.this.f209174f == 8) {
                            ijkMediaStreamer.postEventFromStreamPro(AidSource.this.f209179l, 200, 210, 0, null);
                            t9c.m189745c("aidStream", "AidSource: msg:210");
                        }
                        if (AidSource.this.m223463q2() != null && AidSource.this.f209174f == 1) {
                            AidSource.this.m223463q2().m224084a(352, 640);
                        }
                        AidSource.this.m223458t2(true);
                        return true;
                    }
                });
                this.f209180m.setSurfaceH(this.f209181n.m224116c());
                this.f209180m.setDataSource(this.f209170b.toString());
                i3 = 1;
                this.f209180m.setMediaDateCallbackFlags(1);
                this.f209181n.m224120h(this.f209182o);
                this.f209184q = 1;
                this.f209180m.prepareAsync();
                int i7 = this.f209174f;
                if (i7 == 3 || i7 == 8 || i7 == 9) {
                    this.f209180m.setVolume(1.0f, 1.0f);
                } else {
                    this.f209180m.setVolume(0.0f, 0.0f);
                }
                t9c.m189745c("aidStream", "AidSource: end, cost time:" + (System.currentTimeMillis() - this.f209183p) + "ms");
            } catch (IOException unused2) {
                i3 = 1;
            }
        } catch (IllegalArgumentException unused3) {
            int i8 = this.f209174f;
            if (i8 == 0 || i8 == 1) {
                ijkMediaStreamer.postEventFromStreamPro(this.f209179l, 200, 210, 0, null);
                t9c.m189745c("aidStream", "AidSource: msg:210");
            } else if (i8 == 2 || i8 == 3 || i8 == 9) {
                ijkMediaStreamer.postEventFromStreamPro(this.f209179l, 200, 209, 0, null);
                t9c.m189745c("aidStream", "AidSource: msg:209");
            } else if (i8 == 8) {
                ijkMediaStreamer.postEventFromStreamPro(this.f209179l, 200, 210, 0, null);
                t9c.m189745c("aidStream", "AidSource: msg:210");
            }
            if (m223463q2() != null) {
                z = true;
                if (this.f209174f == 1) {
                    m223463q2().m224084a(352, 640);
                }
            } else {
                z = true;
            }
            this.f209184q = 4;
            m223458t2(z);
        }
    }

    /* JADX INFO: renamed from: A2 */
    private String m223433A2(long j) {
        int i = (int) (j / 1000);
        int i2 = i % 60;
        int i3 = (i / 60) % 60;
        return Integer.toString(i / MMKV.ExpireInHour) + ":" + Integer.toString(i3) + ":" + Integer.toString(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q1 */
    public void m223434Q1(int i, int i2, int i3, int i4) {
        int i5 = (i * i4) / i3;
        int i6 = (i2 * i3) / i4;
        if (i6 < i) {
            this.f209182o.m223706W0(this.f209173e, (i - i6) / 2, 0, i6, i2, 0);
            return;
        }
        MomoSurface momoSurface = this.f209182o;
        if (i5 < i2) {
            momoSurface.m223706W0(this.f209173e, 0, (i2 - i5) / 2, i, i5, 0);
        } else {
            momoSurface.m223706W0(this.f209173e, 0, 0, i, i2, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R1 */
    public void m223435R1(IMediaPlayer iMediaPlayer) {
        MomoSurface momoSurface = this.f209182o;
        if (momoSurface == null || iMediaPlayer == null) {
            return;
        }
        momoSurface.m223708X0(this.f209173e, this.f209172d, this.f209171c, 0, this.f209174f);
        this.f209182o.m223702T0(this.f209173e, new FirstFrameDrawCallback() { // from class: tv.danmaku.ijk.media.source.AidSource.2
            @Override // tv.danmaku.ijk.media.source.AidSource.FirstFrameDrawCallback
            /* JADX INFO: renamed from: a */
            public void mo223472a() {
                t9c.m189743a("aidStream", "----FirstFrameDrawCallback");
                if (AidSource.this.f209179l != null) {
                    if (AidSource.this.f209174f == 2 || AidSource.this.f209174f == 3 || AidSource.this.f209174f == 9) {
                        ijkMediaStreamer.postEventFromStreamPro(AidSource.this.f209179l, 200, 208, 0, null);
                        t9c.m189745c("aidStream", "----first frame draw finish callback: msg:208;" + AidSource.this.f209174f);
                        if (AidSource.this.f209174f == 9) {
                            AidSource aidSource = AidSource.this;
                            aidSource.m223434Q1(352, 640, aidSource.f209172d, AidSource.this.f209171c);
                        }
                    }
                }
            }
        });
        this.f209184q = 2;
        if (m223464r2() != null) {
            m223464r2().m224083a(this.f209172d, this.f209171c);
        }
        m223468w2(this.f209172d, this.f209171c);
        int i = this.f209174f;
        if (i == 0 || i == 1) {
            ijkMediaStreamer.postEventFromStreamPro(this.f209179l, 200, 202, 0, null);
            t9c.m189745c("aidStream", "AidSource: msg:202");
        } else if (i == 2 || i == 3 || i == 9) {
            ijkMediaStreamer.postEventFromStreamPro(this.f209179l, 200, 204, 0, null);
            t9c.m189745c("aidStream", "AidSource: msg:204");
        } else if (i == 8) {
            ijkMediaStreamer.postEventFromStreamPro(this.f209179l, 200, 202, 0, null);
            t9c.m189745c("aidStream", "AidSource: msg:202");
        }
        iMediaPlayer.start();
        this.f209184q = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t2 */
    public void m223458t2(boolean z) {
        if (z) {
            MomoSurface momoSurface = this.f209182o;
            if (momoSurface != null) {
                momoSurface.m223714b1(this.f209173e, true);
            }
            this.f209174f = -1;
        }
        if (this.f209180m != null && this.f209184q != 5) {
            this.f209184q = 5;
            m223470y2(null);
            this.f209180m.setMediaDataCallback(null);
            this.f209180m.setOnErrorListener(null);
            this.f209180m.setOnCompletionListener(null);
            this.f209180m.setOnPreparedListener(null);
            this.f209180m.setOnVideoSizeChangedListener(null);
            m223468w2(0, 0);
            this.f209180m.stop();
            this.f209180m.release();
            this.f209180m = null;
            helpSurface helpsurface = this.f209181n;
            if (helpsurface != null) {
                helpsurface.m224119g();
                this.f209181n = null;
            }
        }
        m223469x2(null);
        t9c.m189745c("aidStream", "AidSource: release, cost time:" + (System.currentTimeMillis() - this.f209183p) + "ms");
    }

    /* JADX INFO: renamed from: B2 */
    public void m223459B2(long j, SurfaceTexture surfaceTexture, int i, Bitmap bitmap) {
        MomoSurface momoSurface = this.f209182o;
        if (momoSurface != null) {
            momoSurface.m223725i1(j, surfaceTexture, i, bitmap);
        }
    }

    /* JADX INFO: renamed from: C2 */
    public void m223460C2(long j, int i, int i2, int i3, int i4, int i5) {
        if (this.f209182o != null) {
            t9c.m189745c("aidStream", "@@@ viewPort: id[" + j + "], view[" + i + Constants.SEPARATOR_COMMA + i2 + Constants.SEPARATOR_COMMA + i3 + Constants.SEPARATOR_COMMA + i4 + "], z=" + i5);
            int i6 = this.f209174f;
            this.f209182o.m223706W0(j, i, i2, i3, i4, (j == ((long) i6) && i6 == 7) ? 0 : 1);
        }
    }

    public long getDuration() {
        IjkMediaPlayer ijkMediaPlayer = this.f209180m;
        if (ijkMediaPlayer != null) {
            return ijkMediaPlayer.getDuration();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: o2 */
    public void m223461o2(long j, boolean z) {
        if (this.f209182o != null) {
            t9c.m189745c("aidStream", "@@@ fullScreen: id[" + j + "], full=" + z);
            this.f209182o.m223704U0(j, z);
        }
    }

    /* JADX INFO: renamed from: p2 */
    public long m223462p2() {
        IjkMediaPlayer ijkMediaPlayer = this.f209180m;
        if (ijkMediaPlayer != null) {
            return ijkMediaPlayer.getCurrentPosition();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: q2 */
    public ijkMediaStreamer.aidSwitchResolution m223463q2() {
        t9c.m189745c("aidStream", InternalFrame.f7969ID + this.f209172d + Constants.SEPARATOR_COMMA + this.f209171c + "--->352,640");
        return this.f209177j;
    }

    /* JADX INFO: renamed from: r2 */
    public ijkMediaStreamer.SizeChangedCallback m223464r2() {
        return this.f209176i;
    }

    /* JADX INFO: renamed from: s2 */
    public void m223465s2(long j, boolean z) {
        MomoSurface momoSurface = this.f209182o;
        if (momoSurface != null) {
            momoSurface.m223705V0(j, z);
        }
    }

    /* JADX INFO: renamed from: u2 */
    public void m223466u2(int i) {
        int i2;
        t9c.m189745c("aidStream", " remove, start[" + i + "]: cost time:" + (System.currentTimeMillis() - this.f209183p) + "ms");
        int i3 = this.f209184q;
        if (i3 == 3 || i3 == 1 || i3 == 2) {
            this.f209184q = 4;
        }
        if (i == 1) {
            int i4 = this.f209174f;
            m223458t2(true);
            if (i4 == 0 || i4 == 1) {
                ijkMediaStreamer.postEventFromStreamPro(this.f209179l, 200, Primes.SMALL_FACTOR_LIMIT, 0, null);
                t9c.m189745c("aidStream", "remove: msg:211");
            } else if (i4 == 2 || i4 == 3 || (i2 = this.f209174f) == 9) {
                ijkMediaStreamer.postEventFromStreamPro(this.f209179l, 200, 207, 0, null);
                t9c.m189745c("aidStream", "remove: msg:207");
            } else if (i2 == 8) {
                ijkMediaStreamer.postEventFromStreamPro(this.f209179l, 200, Primes.SMALL_FACTOR_LIMIT, 0, null);
                t9c.m189745c("aidStream", "remove: msg:211");
            }
            this.f209174f = -1;
        } else {
            m223458t2(false);
        }
        t9c.m189745c("aidStream", "remove, end[" + i + "]: cost time:" + (System.currentTimeMillis() - this.f209183p) + "ms");
    }

    /* JADX INFO: renamed from: v2 */
    public void m223467v2(long j) {
        if (this.f209180m != null) {
            t9c.m189745c("aidStream", "-----seekTo:" + j + "(" + m223433A2(j) + ")ms");
            this.f209180m.seekTo(j);
        }
    }

    /* JADX INFO: renamed from: w2 */
    public void m223468w2(int i, int i2) {
    }

    /* JADX INFO: renamed from: x2 */
    public void m223469x2(ijkMediaStreamer.aidSwitchResolution aidswitchresolution) {
        this.f209177j = aidswitchresolution;
    }

    /* JADX INFO: renamed from: y2 */
    public void m223470y2(ijkMediaStreamer.SizeChangedCallback sizeChangedCallback) {
        this.f209176i = sizeChangedCallback;
    }

    /* JADX INFO: renamed from: z2 */
    public void m223471z2(long j, int i, int i2, int i3, int i4) {
        MomoSurface momoSurface = this.f209182o;
        if (momoSurface != null) {
            momoSurface.m223708X0(j, i, i2, i3, i4);
        }
    }

    public AidSource(Bitmap bitmap, MomoSurface momoSurface, long j, int i) {
        this.f209169a = null;
        this.f209171c = -1;
        this.f209172d = -1;
        this.f209173e = -1L;
        this.f209174f = -1;
        this.f209175g = null;
        this.f209176i = null;
        this.f209177j = null;
        this.f209178k = null;
        this.f209179l = null;
        this.f209180m = null;
        this.f209181n = null;
        this.f209182o = null;
        this.f209184q = 0;
        this.f209185r = 1024;
        this.f209186s = 0;
        this.f209187t = ByteBuffer.allocate(1024);
        this.f209189v = -1;
        this.f209190x = new IjkMediaPlayer.MediaDateCallback() { // from class: tv.danmaku.ijk.media.source.AidSource.1
            @Override // tv.danmaku.ijk.media.player.IjkMediaPlayer.MediaDateCallback
            public void onMediaDateCallback(byte[] bArr, int i4, int i5, IjkMediaPlayer ijkMediaPlayer) {
                int length = bArr.length;
                if (AidSource.this.f209178k == null || !AidSource.this.f209178k.m223908L0()) {
                    return;
                }
                t9c.m189745c("aidStream", "public help data.len" + bArr.length + ";recording:" + AidSource.this.f209178k.m223908L0());
                int i6 = 0;
                while (length >= AidSource.this.f209185r) {
                    try {
                        int i7 = AidSource.this.f209186s;
                        AidSource aidSource = AidSource.this;
                        if (i7 > 0) {
                            byte[] bArr2 = new byte[aidSource.f209185r];
                            AidSource.this.f209187t.rewind();
                            AidSource.this.f209187t.get(bArr2, 0, AidSource.this.f209186s);
                            AidSource.this.f209187t.clear();
                            t9c.m189745c("aidStream", "mRemainAudioIndex > 0 arraycopy :" + i6 + ";mRemainAudioIndex:" + AidSource.this.f209186s);
                            System.arraycopy(bArr, i6, bArr2, AidSource.this.f209186s, AidSource.this.f209185r - AidSource.this.f209186s);
                            i6 += AidSource.this.f209185r - AidSource.this.f209186s;
                            length -= AidSource.this.f209185r - AidSource.this.f209186s;
                            if (AidSource.this.f209188u == null) {
                                t9c.m189745c("aidStream", "publichelp: new mHelpMixAudioProcess");
                                AidSource.this.f209188u = new AudioProcess();
                            }
                            if (AidSource.this.f209180m != null && AidSource.this.f209188u != null) {
                                t9c.m189745c("aidStream", "publichelp: mRemainAudioIndex > 0, pos=" + i6 + ";lens:" + length);
                                AidSource.this.f209188u.putSurroundData(new oxd0(bArr2, System.nanoTime() / 1000, 2));
                            }
                            AidSource.this.f209186s = 0;
                        } else {
                            byte[] bArr3 = new byte[aidSource.f209185r];
                            System.arraycopy(bArr, i6, bArr3, 0, AidSource.this.f209185r);
                            if (AidSource.this.f209180m != null && AidSource.this.f209188u != null) {
                                t9c.m189745c("aidStream", "mRemainAudioIndex=0, pos=" + i6 + ";lens:" + length + ",mAudiobufferSize=" + AidSource.this.f209185r);
                                AidSource.this.f209188u.putSurroundData(new oxd0(bArr3, System.nanoTime() / 1000, 2));
                            }
                            length -= AidSource.this.f209185r;
                            i6 += AidSource.this.f209185r;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        AidSource.this.f209186s = 0;
                        AidSource.this.f209187t.clear();
                        t9c.m189745c("aidStream", "onMediaDateCallback:exception");
                        return;
                    }
                }
                if (length > 0) {
                    AidSource.this.f209187t.put(bArr, i6, length);
                    AidSource.this.f209186s = length;
                    t9c.m189745c("aidStream", "mRemainAudioPublishHelp.put:pos:" + i6 + ";lens:" + AidSource.this.f209186s);
                }
            }
        };
        if (bitmap == null || momoSurface == null) {
            return;
        }
        t9c.m189745c("aidStream", "@@@ AidSource: image begin---userid=" + j);
        this.f209182o = momoSurface;
        this.f209175g = bitmap;
        this.f209173e = j;
        this.f209174f = 7;
        t9c.m189745c("aidStream", "@@@ AidSource: cast image---userid=" + this.f209173e + ";aidMode=" + this.f209174f);
        this.f209172d = bitmap.getWidth();
        this.f209171c = bitmap.getHeight();
        MomoSurface momoSurface2 = this.f209182o;
        if (momoSurface2 != null) {
            momoSurface2.m223717d0(j, this.f209174f, 0);
            this.f209182o.m223708X0(this.f209173e, this.f209172d, this.f209171c, 0, this.f209174f);
            this.f209182o.m223725i1(this.f209173e, null, -1, this.f209175g);
        }
        t9c.m189745c("aidStream", "@@@ AidSource: image end, cost time:" + (System.currentTimeMillis() - this.f209183p) + "ms");
    }
}
