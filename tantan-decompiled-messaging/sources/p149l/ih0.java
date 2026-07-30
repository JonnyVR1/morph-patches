package p149l;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.momo.piplinemomoext.input.audio.InterfaceC4109a;
import org.spongycastle.math.Primes;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import tv.danmaku.ijk.media.player.OnPlayerStateCallback;

/* JADX INFO: loaded from: classes8.dex */
@RequiresApi(api = 14)
public class ih0 extends hdm {

    /* JADX INFO: renamed from: Q */
    private int f113192Q;

    /* JADX INFO: renamed from: R */
    private int f113193R;

    /* JADX INFO: renamed from: S */
    private hu00.InterfaceC17392a f113194S;

    /* JADX INFO: renamed from: T */
    private int f113195T;

    /* JADX INFO: renamed from: U */
    private OnPlayerStateCallback f113196U;

    public ih0(Context context, String str, hu00.InterfaceC17392a interfaceC17392a, int i, boolean z, eix eixVar) {
        super(context, str, z, eixVar);
        this.f113192Q = 0;
        this.f113193R = 0;
        this.f113194S = interfaceC17392a;
        this.f113195T = i;
        this.useCache = false;
    }

    @Override // p149l.hdm
    /* JADX INFO: renamed from: V1 */
    public void mo130600V1(InterfaceC4109a interfaceC4109a) {
        super.mo130600V1(interfaceC4109a);
    }

    @Override // p149l.hdm
    /* JADX INFO: renamed from: W1 */
    public void mo130601W1(int i, int i2, int i3) {
        super.mo130601W1(i, i2, i3);
    }

    @Override // p149l.hdm
    /* JADX INFO: renamed from: Y1 */
    public void mo130603Y1(float f) {
        super.mo130603Y1(f);
    }

    /* JADX INFO: renamed from: Z1 */
    public int m136180Z1() {
        int i = this.f113195T;
        return (i == 0 || i == 1 || i == 8) ? Math.min(getInputWidth(), getInputHeight()) : getInputHeight();
    }

    /* JADX INFO: renamed from: a2 */
    public int m136181a2() {
        int i = this.f113195T;
        return (i == 0 || i == 1 || i == 8) ? Math.min(getInputWidth(), getInputHeight()) : getInputWidth();
    }

    /* JADX INFO: renamed from: b2 */
    public void m136182b2(OnPlayerStateCallback onPlayerStateCallback) {
        this.f113196U = onPlayerStateCallback;
    }

    @Override // p149l.hdm
    public void catchErrorLog0() {
        hu00.InterfaceC17392a interfaceC17392a;
        super.catchErrorLog0();
        int i = this.f113195T;
        if (i == 0 || i == 1) {
            hu00.InterfaceC17392a interfaceC17392a2 = this.f113194S;
            if (interfaceC17392a2 != null) {
                interfaceC17392a2.mo128349g(32770, 210, 0, this);
                return;
            }
            return;
        }
        if (i == 2 || i == 3 || i == 9) {
            hu00.InterfaceC17392a interfaceC17392a3 = this.f113194S;
            if (interfaceC17392a3 != null) {
                interfaceC17392a3.mo128349g(32770, 209, 0, this);
                return;
            }
            return;
        }
        if (i != 8 || (interfaceC17392a = this.f113194S) == null) {
            return;
        }
        interfaceC17392a.mo128349g(32770, 210, 0, this);
    }

    @Override // p149l.hdm
    public void catchErrorLog1() {
        hu00.InterfaceC17392a interfaceC17392a;
        super.catchErrorLog1();
        int i = this.f113195T;
        if (i == 0 || i == 1) {
            hu00.InterfaceC17392a interfaceC17392a2 = this.f113194S;
            if (interfaceC17392a2 != null) {
                interfaceC17392a2.mo128349g(32770, 210, 0, this);
                return;
            }
            return;
        }
        if (i == 2 || i == 3 || i == 9) {
            hu00.InterfaceC17392a interfaceC17392a3 = this.f113194S;
            if (interfaceC17392a3 != null) {
                interfaceC17392a3.mo128349g(32770, 209, 0, this);
                return;
            }
            return;
        }
        if (i != 8 || (interfaceC17392a = this.f113194S) == null) {
            return;
        }
        interfaceC17392a.mo128349g(32770, 210, 0, this);
    }

    @Override // p149l.hdm, p149l.rkw, p149l.mcj, p149l.ccj
    public void destroy() {
        super.destroy();
        ii70.m136344d().m136348c("Pipeline_Normal_pip->PIPLINE", "zk destroy AidInput");
    }

    @Override // p149l.hdm
    public long getDuration() {
        long duration = super.getDuration();
        ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "------onPrepared aid:duration=" + duration);
        return duration;
    }

    @Override // p149l.hdm, tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i) {
        super.onBufferingUpdate(iMediaPlayer, i);
        OnPlayerStateCallback onPlayerStateCallback = this.f113196U;
        if (onPlayerStateCallback != null) {
            onPlayerStateCallback.onBufferingUpdate(iMediaPlayer, i);
        }
    }

    @Override // p149l.hdm, tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
    public void onCompletion(IMediaPlayer iMediaPlayer) {
        hu00.InterfaceC17392a interfaceC17392a;
        super.onCompletion(iMediaPlayer);
        int i = this.f113195T;
        if (i == 0 || i == 1) {
            hu00.InterfaceC17392a interfaceC17392a2 = this.f113194S;
            if (interfaceC17392a2 != null) {
                interfaceC17392a2.mo128349g(32770, 203, 0, this);
            }
        } else if (i == 3 || i == 9) {
            hu00.InterfaceC17392a interfaceC17392a3 = this.f113194S;
            if (interfaceC17392a3 != null) {
                interfaceC17392a3.mo128349g(32770, 206, 0, this);
            }
        } else if (i == 2 && (interfaceC17392a = this.f113194S) != null) {
            interfaceC17392a.mo128349g(32770, 205, 0, this);
        }
        if (this.f113196U != null) {
            Log.e("aidinput@", "onCompletion: call onCompletion interface");
            this.f113196U.onCompletion(iMediaPlayer);
        }
    }

    @Override // p149l.hdm, p149l.ccj
    @RequiresApi(api = 15)
    public void onDrawFrame() {
        super.onDrawFrame();
        int i = this.f113195T;
        if ((i == 2 || i == 3 || i == 9) && this.f107263K) {
            hu00.InterfaceC17392a interfaceC17392a = this.f113194S;
            if (interfaceC17392a != null) {
                interfaceC17392a.mo128349g(32770, 208, 0, this);
            }
            this.f107263K = false;
            if (this.f113196U != null) {
                ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "---ktv---onPrepared aid:w=" + getWidth() + ";h=" + getHeight());
                this.f113196U.onVideoSizeChanged(this.f107270x, getWidth(), getHeight(), 0, 0);
            }
        }
    }

    @Override // p149l.hdm, tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
    public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
        hu00.InterfaceC17392a interfaceC17392a;
        boolean zOnError = super.onError(iMediaPlayer, i, i2);
        Log.e("Pipeline_Normal_pip->PIPLINE", getClass().getSimpleName() + "what:" + i + ", extra:" + i2);
        int i3 = this.f113195T;
        if (i3 == 0 || i3 == 1) {
            hu00.InterfaceC17392a interfaceC17392a2 = this.f113194S;
            if (interfaceC17392a2 != null) {
                interfaceC17392a2.mo128349g(32770, 210, 0, this);
            }
        } else if (i3 == 2 || i3 == 3 || i3 == 9) {
            hu00.InterfaceC17392a interfaceC17392a3 = this.f113194S;
            if (interfaceC17392a3 != null) {
                interfaceC17392a3.mo128349g(32770, 209, 0, this);
            }
            OnPlayerStateCallback onPlayerStateCallback = this.f113196U;
            if (onPlayerStateCallback != null) {
                onPlayerStateCallback.onInfo(iMediaPlayer, 209, i2);
                return zOnError;
            }
        } else if (i3 == 8 && (interfaceC17392a = this.f113194S) != null) {
            interfaceC17392a.mo128349g(32770, 210, 0, this);
            return zOnError;
        }
        return zOnError;
    }

    @Override // p149l.hdm, tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
    public boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
        boolean zOnInfo = super.onInfo(iMediaPlayer, i, i2);
        if (this.f113196U != null) {
            Log.e("aidinput@", "onInfo-onInfo: what=" + i + ";extra=" + i2);
            this.f113196U.onInfo(iMediaPlayer, i, i2);
        }
        return zOnInfo;
    }

    @Override // p149l.hdm, tv.danmaku.ijk.media.player.IjkMediaPlayer.MediaDateCallback
    public void onMediaDateCallback(byte[] bArr, int i, int i2, IjkMediaPlayer ijkMediaPlayer) {
        super.onMediaDateCallback(bArr, i, i2, ijkMediaPlayer);
    }

    @Override // p149l.hdm, tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
    @RequiresApi(api = 15)
    public void onPrepared(IMediaPlayer iMediaPlayer) {
        hu00.InterfaceC17392a interfaceC17392a;
        super.onPrepared(iMediaPlayer);
        int audioTrackNum = iMediaPlayer.getAudioTrackNum();
        if (this.f113196U != null) {
            Log.e("aidinput@", "onPrepared-onInfo: what=213;extra=" + audioTrackNum);
            this.f113196U.onInfo(iMediaPlayer, 213, audioTrackNum);
        }
        OnPlayerStateCallback onPlayerStateCallback = this.f113196U;
        if (onPlayerStateCallback != null) {
            onPlayerStateCallback.onPrepared(iMediaPlayer);
        }
        int i = this.f113195T;
        if (i == 0 || i == 1) {
            hu00.InterfaceC17392a interfaceC17392a2 = this.f113194S;
            if (interfaceC17392a2 != null) {
                interfaceC17392a2.mo128349g(32770, 202, 0, this);
                return;
            }
            return;
        }
        if (i == 2 || i == 3 || i == 9) {
            hu00.InterfaceC17392a interfaceC17392a3 = this.f113194S;
            if (interfaceC17392a3 != null) {
                interfaceC17392a3.mo128349g(32770, 204, 0, this);
                return;
            }
            return;
        }
        if (i != 8 || (interfaceC17392a = this.f113194S) == null) {
            return;
        }
        interfaceC17392a.mo128349g(32770, 202, 0, this);
    }

    @Override // p149l.hdm, tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
    public void onSeekComplete(IMediaPlayer iMediaPlayer) {
        super.onSeekComplete(iMediaPlayer);
        hu00.InterfaceC17392a interfaceC17392a = this.f113194S;
        if (interfaceC17392a != null) {
            interfaceC17392a.mo128349g(32770, 212, 0, this);
        }
        OnPlayerStateCallback onPlayerStateCallback = this.f113196U;
        if (onPlayerStateCallback != null) {
            onPlayerStateCallback.onSeekComplete(iMediaPlayer);
        }
    }

    @Override // p149l.hdm, tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoMediacodecChangedListener
    public void onVideoMediacodecChanged(IMediaPlayer iMediaPlayer, int i) {
        hu00.InterfaceC17392a interfaceC17392a;
        super.onVideoMediacodecChanged(iMediaPlayer, i);
        int i2 = this.f113195T;
        if (i2 == 0 || i2 == 1) {
            hu00.InterfaceC17392a interfaceC17392a2 = this.f113194S;
            if (interfaceC17392a2 != null) {
                interfaceC17392a2.mo128349g(32770, 210, 0, this);
            }
        } else if (i2 == 2 || i2 == 3 || i2 == 9) {
            hu00.InterfaceC17392a interfaceC17392a3 = this.f113194S;
            if (interfaceC17392a3 != null) {
                interfaceC17392a3.mo128349g(32770, 209, 0, this);
            }
        } else if (i2 == 8 && (interfaceC17392a = this.f113194S) != null) {
            interfaceC17392a.mo128349g(32770, 210, 0, this);
        }
        OnPlayerStateCallback onPlayerStateCallback = this.f113196U;
        if (onPlayerStateCallback != null) {
            onPlayerStateCallback.onVideoMediacodecChanged(iMediaPlayer, i);
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i, int i2, int i3, int i4) {
        if (i == 0 || i2 == 0) {
            return;
        }
        if (this.f113192Q == i && i2 == this.f113193R) {
            return;
        }
        int videoDarDen = iMediaPlayer.getVideoDarDen();
        int videoDarNum = iMediaPlayer.getVideoDarNum();
        int i5 = (videoDarDen <= 0 || videoDarNum <= 0) ? i : (videoDarNum * i2) / videoDarDen;
        this.f113192Q = i;
        this.f113193R = i2;
        SurfaceTexture surfaceTexture = this.f159894b;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i, i2);
        }
        setRenderSize(i5, i2);
        ii70.m136344d().m136346a("Pipeline_Normal_pip->PIPLINE", "-ktv,onVideoSizeChanged:" + i5 + ", height:" + i2);
    }

    @Override // p149l.hdm
    public void stop() {
        hu00.InterfaceC17392a interfaceC17392a;
        super.stop();
        int i = this.f113195T;
        if (i == 0 || i == 1) {
            hu00.InterfaceC17392a interfaceC17392a2 = this.f113194S;
            if (interfaceC17392a2 != null) {
                interfaceC17392a2.mo128349g(32770, Primes.SMALL_FACTOR_LIMIT, 0, this);
                return;
            }
            return;
        }
        if (i == 2 || i == 3 || i == 9) {
            hu00.InterfaceC17392a interfaceC17392a3 = this.f113194S;
            if (interfaceC17392a3 != null) {
                interfaceC17392a3.mo128349g(32770, 207, 0, this);
                return;
            }
            return;
        }
        if (i != 8 || (interfaceC17392a = this.f113194S) == null) {
            return;
        }
        interfaceC17392a.mo128349g(32770, Primes.SMALL_FACTOR_LIMIT, 0, this);
    }
}
