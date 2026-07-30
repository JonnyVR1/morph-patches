package p153l;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.momo.piplinemomoext.input.audio.InterfaceC4260a;
import org.spongycastle.math.Primes;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import tv.danmaku.ijk.media.player.OnPlayerStateCallback;

/* JADX INFO: loaded from: classes8.dex */
@RequiresApi(api = 14)
public class eh0 extends xfm {

    /* JADX INFO: renamed from: Q */
    private int f93990Q;

    /* JADX INFO: renamed from: R */
    private int f93991R;

    /* JADX INFO: renamed from: S */
    private q210.InterfaceC19500a f93992S;

    /* JADX INFO: renamed from: T */
    private int f93993T;

    /* JADX INFO: renamed from: U */
    private OnPlayerStateCallback f93994U;

    public eh0(Context context, String str, q210.InterfaceC19500a interfaceC19500a, int i, boolean z, brx brxVar) {
        super(context, str, z, brxVar);
        this.f93990Q = 0;
        this.f93991R = 0;
        this.f93992S = interfaceC19500a;
        this.f93993T = i;
        this.useCache = false;
    }

    @Override // p153l.xfm
    /* JADX INFO: renamed from: V1 */
    public void mo120831V1(InterfaceC4260a interfaceC4260a) {
        super.mo120831V1(interfaceC4260a);
    }

    @Override // p153l.xfm
    /* JADX INFO: renamed from: W1 */
    public void mo120832W1(int i, int i2, int i3) {
        super.mo120832W1(i, i2, i3);
    }

    @Override // p153l.xfm
    /* JADX INFO: renamed from: Y1 */
    public void mo120833Y1(float f) {
        super.mo120833Y1(f);
    }

    /* JADX INFO: renamed from: Z1 */
    public int m120834Z1() {
        int i = this.f93993T;
        return (i == 0 || i == 1 || i == 8) ? Math.min(getInputWidth(), getInputHeight()) : getInputHeight();
    }

    /* JADX INFO: renamed from: a2 */
    public int m120835a2() {
        int i = this.f93993T;
        return (i == 0 || i == 1 || i == 8) ? Math.min(getInputWidth(), getInputHeight()) : getInputWidth();
    }

    /* JADX INFO: renamed from: b2 */
    public void m120836b2(OnPlayerStateCallback onPlayerStateCallback) {
        this.f93994U = onPlayerStateCallback;
    }

    @Override // p153l.xfm
    public void catchErrorLog0() {
        q210.InterfaceC19500a interfaceC19500a;
        super.catchErrorLog0();
        int i = this.f93993T;
        if (i == 0 || i == 1) {
            q210.InterfaceC19500a interfaceC19500a2 = this.f93992S;
            if (interfaceC19500a2 != null) {
                interfaceC19500a2.mo165950g(32770, 210, 0, this);
                return;
            }
            return;
        }
        if (i == 2 || i == 3 || i == 9) {
            q210.InterfaceC19500a interfaceC19500a3 = this.f93992S;
            if (interfaceC19500a3 != null) {
                interfaceC19500a3.mo165950g(32770, 209, 0, this);
                return;
            }
            return;
        }
        if (i != 8 || (interfaceC19500a = this.f93992S) == null) {
            return;
        }
        interfaceC19500a.mo165950g(32770, 210, 0, this);
    }

    @Override // p153l.xfm
    public void catchErrorLog1() {
        q210.InterfaceC19500a interfaceC19500a;
        super.catchErrorLog1();
        int i = this.f93993T;
        if (i == 0 || i == 1) {
            q210.InterfaceC19500a interfaceC19500a2 = this.f93992S;
            if (interfaceC19500a2 != null) {
                interfaceC19500a2.mo165950g(32770, 210, 0, this);
                return;
            }
            return;
        }
        if (i == 2 || i == 3 || i == 9) {
            q210.InterfaceC19500a interfaceC19500a3 = this.f93992S;
            if (interfaceC19500a3 != null) {
                interfaceC19500a3.mo165950g(32770, 209, 0, this);
                return;
            }
            return;
        }
        if (i != 8 || (interfaceC19500a = this.f93992S) == null) {
            return;
        }
        interfaceC19500a.mo165950g(32770, 210, 0, this);
    }

    @Override // p153l.xfm, p153l.qnw, p153l.gfj, p153l.wej
    public void destroy() {
        super.destroy();
        oq70.m168791d().m168795c("Pipeline_Normal_pip->PIPLINE", "zk destroy AidInput");
    }

    @Override // p153l.xfm
    public long getDuration() {
        long duration = super.getDuration();
        oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "------onPrepared aid:duration=" + duration);
        return duration;
    }

    @Override // p153l.xfm, tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i) {
        super.onBufferingUpdate(iMediaPlayer, i);
        OnPlayerStateCallback onPlayerStateCallback = this.f93994U;
        if (onPlayerStateCallback != null) {
            onPlayerStateCallback.onBufferingUpdate(iMediaPlayer, i);
        }
    }

    @Override // p153l.xfm, tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
    public void onCompletion(IMediaPlayer iMediaPlayer) {
        q210.InterfaceC19500a interfaceC19500a;
        super.onCompletion(iMediaPlayer);
        int i = this.f93993T;
        if (i == 0 || i == 1) {
            q210.InterfaceC19500a interfaceC19500a2 = this.f93992S;
            if (interfaceC19500a2 != null) {
                interfaceC19500a2.mo165950g(32770, 203, 0, this);
            }
        } else if (i == 3 || i == 9) {
            q210.InterfaceC19500a interfaceC19500a3 = this.f93992S;
            if (interfaceC19500a3 != null) {
                interfaceC19500a3.mo165950g(32770, 206, 0, this);
            }
        } else if (i == 2 && (interfaceC19500a = this.f93992S) != null) {
            interfaceC19500a.mo165950g(32770, 205, 0, this);
        }
        if (this.f93994U != null) {
            Log.e("aidinput@", "onCompletion: call onCompletion interface");
            this.f93994U.onCompletion(iMediaPlayer);
        }
    }

    @Override // p153l.xfm, p153l.wej
    @RequiresApi(api = 15)
    public void onDrawFrame() {
        super.onDrawFrame();
        int i = this.f93993T;
        if ((i == 2 || i == 3 || i == 9) && this.f194058K) {
            q210.InterfaceC19500a interfaceC19500a = this.f93992S;
            if (interfaceC19500a != null) {
                interfaceC19500a.mo165950g(32770, 208, 0, this);
            }
            this.f194058K = false;
            if (this.f93994U != null) {
                oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "---ktv---onPrepared aid:w=" + getWidth() + ";h=" + getHeight());
                this.f93994U.onVideoSizeChanged(this.f194065x, getWidth(), getHeight(), 0, 0);
            }
        }
    }

    @Override // p153l.xfm, tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
    public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
        q210.InterfaceC19500a interfaceC19500a;
        boolean zOnError = super.onError(iMediaPlayer, i, i2);
        Log.e("Pipeline_Normal_pip->PIPLINE", getClass().getSimpleName() + "what:" + i + ", extra:" + i2);
        int i3 = this.f93993T;
        if (i3 == 0 || i3 == 1) {
            q210.InterfaceC19500a interfaceC19500a2 = this.f93992S;
            if (interfaceC19500a2 != null) {
                interfaceC19500a2.mo165950g(32770, 210, 0, this);
            }
        } else if (i3 == 2 || i3 == 3 || i3 == 9) {
            q210.InterfaceC19500a interfaceC19500a3 = this.f93992S;
            if (interfaceC19500a3 != null) {
                interfaceC19500a3.mo165950g(32770, 209, 0, this);
            }
            OnPlayerStateCallback onPlayerStateCallback = this.f93994U;
            if (onPlayerStateCallback != null) {
                onPlayerStateCallback.onInfo(iMediaPlayer, 209, i2);
                return zOnError;
            }
        } else if (i3 == 8 && (interfaceC19500a = this.f93992S) != null) {
            interfaceC19500a.mo165950g(32770, 210, 0, this);
            return zOnError;
        }
        return zOnError;
    }

    @Override // p153l.xfm, tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
    public boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
        boolean zOnInfo = super.onInfo(iMediaPlayer, i, i2);
        if (this.f93994U != null) {
            Log.e("aidinput@", "onInfo-onInfo: what=" + i + ";extra=" + i2);
            this.f93994U.onInfo(iMediaPlayer, i, i2);
        }
        return zOnInfo;
    }

    @Override // p153l.xfm, tv.danmaku.ijk.media.player.IjkMediaPlayer.MediaDateCallback
    public void onMediaDateCallback(byte[] bArr, int i, int i2, IjkMediaPlayer ijkMediaPlayer) {
        super.onMediaDateCallback(bArr, i, i2, ijkMediaPlayer);
    }

    @Override // p153l.xfm, tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
    @RequiresApi(api = 15)
    public void onPrepared(IMediaPlayer iMediaPlayer) {
        q210.InterfaceC19500a interfaceC19500a;
        super.onPrepared(iMediaPlayer);
        int audioTrackNum = iMediaPlayer.getAudioTrackNum();
        if (this.f93994U != null) {
            Log.e("aidinput@", "onPrepared-onInfo: what=213;extra=" + audioTrackNum);
            this.f93994U.onInfo(iMediaPlayer, 213, audioTrackNum);
        }
        OnPlayerStateCallback onPlayerStateCallback = this.f93994U;
        if (onPlayerStateCallback != null) {
            onPlayerStateCallback.onPrepared(iMediaPlayer);
        }
        int i = this.f93993T;
        if (i == 0 || i == 1) {
            q210.InterfaceC19500a interfaceC19500a2 = this.f93992S;
            if (interfaceC19500a2 != null) {
                interfaceC19500a2.mo165950g(32770, 202, 0, this);
                return;
            }
            return;
        }
        if (i == 2 || i == 3 || i == 9) {
            q210.InterfaceC19500a interfaceC19500a3 = this.f93992S;
            if (interfaceC19500a3 != null) {
                interfaceC19500a3.mo165950g(32770, 204, 0, this);
                return;
            }
            return;
        }
        if (i != 8 || (interfaceC19500a = this.f93992S) == null) {
            return;
        }
        interfaceC19500a.mo165950g(32770, 202, 0, this);
    }

    @Override // p153l.xfm, tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
    public void onSeekComplete(IMediaPlayer iMediaPlayer) {
        super.onSeekComplete(iMediaPlayer);
        q210.InterfaceC19500a interfaceC19500a = this.f93992S;
        if (interfaceC19500a != null) {
            interfaceC19500a.mo165950g(32770, 212, 0, this);
        }
        OnPlayerStateCallback onPlayerStateCallback = this.f93994U;
        if (onPlayerStateCallback != null) {
            onPlayerStateCallback.onSeekComplete(iMediaPlayer);
        }
    }

    @Override // p153l.xfm, tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoMediacodecChangedListener
    public void onVideoMediacodecChanged(IMediaPlayer iMediaPlayer, int i) {
        q210.InterfaceC19500a interfaceC19500a;
        super.onVideoMediacodecChanged(iMediaPlayer, i);
        int i2 = this.f93993T;
        if (i2 == 0 || i2 == 1) {
            q210.InterfaceC19500a interfaceC19500a2 = this.f93992S;
            if (interfaceC19500a2 != null) {
                interfaceC19500a2.mo165950g(32770, 210, 0, this);
            }
        } else if (i2 == 2 || i2 == 3 || i2 == 9) {
            q210.InterfaceC19500a interfaceC19500a3 = this.f93992S;
            if (interfaceC19500a3 != null) {
                interfaceC19500a3.mo165950g(32770, 209, 0, this);
            }
        } else if (i2 == 8 && (interfaceC19500a = this.f93992S) != null) {
            interfaceC19500a.mo165950g(32770, 210, 0, this);
        }
        OnPlayerStateCallback onPlayerStateCallback = this.f93994U;
        if (onPlayerStateCallback != null) {
            onPlayerStateCallback.onVideoMediacodecChanged(iMediaPlayer, i);
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i, int i2, int i3, int i4) {
        if (i == 0 || i2 == 0) {
            return;
        }
        if (this.f93990Q == i && i2 == this.f93991R) {
            return;
        }
        int videoDarDen = iMediaPlayer.getVideoDarDen();
        int videoDarNum = iMediaPlayer.getVideoDarNum();
        int i5 = (videoDarDen <= 0 || videoDarNum <= 0) ? i : (videoDarNum * i2) / videoDarDen;
        this.f93990Q = i;
        this.f93991R = i2;
        SurfaceTexture surfaceTexture = this.f158650b;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i, i2);
        }
        setRenderSize(i5, i2);
        oq70.m168791d().m168793a("Pipeline_Normal_pip->PIPLINE", "-ktv,onVideoSizeChanged:" + i5 + ", height:" + i2);
    }

    @Override // p153l.xfm
    public void stop() {
        q210.InterfaceC19500a interfaceC19500a;
        super.stop();
        int i = this.f93993T;
        if (i == 0 || i == 1) {
            q210.InterfaceC19500a interfaceC19500a2 = this.f93992S;
            if (interfaceC19500a2 != null) {
                interfaceC19500a2.mo165950g(32770, Primes.SMALL_FACTOR_LIMIT, 0, this);
                return;
            }
            return;
        }
        if (i == 2 || i == 3 || i == 9) {
            q210.InterfaceC19500a interfaceC19500a3 = this.f93992S;
            if (interfaceC19500a3 != null) {
                interfaceC19500a3.mo165950g(32770, 207, 0, this);
                return;
            }
            return;
        }
        if (i != 8 || (interfaceC19500a = this.f93992S) == null) {
            return;
        }
        interfaceC19500a.mo165950g(32770, Primes.SMALL_FACTOR_LIMIT, 0, this);
    }
}
