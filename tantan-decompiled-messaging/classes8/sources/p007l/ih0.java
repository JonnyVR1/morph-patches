package p007l;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.momo.piplinemomoext.input.audio.InterfaceC0021a;
import com.momo.xeengine.gift.XEGiftErrorCode;
import l.eix;
import l.hu00;
import l.ii70;
import l.mcj;
import l.rkw;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import tv.danmaku.ijk.media.player.OnPlayerStateCallback;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@RequiresApi(api = 14)
public class ih0 extends hdm {

    /* JADX INFO: renamed from: Q */
    private int f2889Q;

    /* JADX INFO: renamed from: R */
    private int f2890R;

    /* JADX INFO: renamed from: S */
    private hu00.a f2891S;

    /* JADX INFO: renamed from: T */
    private int f2892T;

    /* JADX INFO: renamed from: U */
    private OnPlayerStateCallback f2893U;

    public ih0(Context context, String str, hu00.a aVar, int i, boolean z, eix eixVar) {
        super(context, str, z, eixVar);
        this.f2889Q = 0;
        this.f2890R = 0;
        this.f2891S = aVar;
        this.f2892T = i;
        ((mcj) this).useCache = false;
    }

    @Override // p007l.hdm
    /* JADX INFO: renamed from: V1 */
    public void mo9310V1(InterfaceC0021a interfaceC0021a) {
        super.mo9310V1(interfaceC0021a);
    }

    @Override // p007l.hdm
    /* JADX INFO: renamed from: W1 */
    public void mo9311W1(int i, int i2, int i3) {
        super.mo9311W1(i, i2, i3);
    }

    @Override // p007l.hdm
    /* JADX INFO: renamed from: Y1 */
    public void mo9313Y1(float f) {
        super.mo9313Y1(f);
    }

    /* JADX INFO: renamed from: Z1 */
    public int m9402Z1() {
        int i = this.f2892T;
        return (i == 0 || i == 1 || i == 8) ? Math.min(getInputWidth(), getInputHeight()) : getInputHeight();
    }

    /* JADX INFO: renamed from: a2 */
    public int m9403a2() {
        int i = this.f2892T;
        return (i == 0 || i == 1 || i == 8) ? Math.min(getInputWidth(), getInputHeight()) : getInputWidth();
    }

    /* JADX INFO: renamed from: b2 */
    public void m9404b2(OnPlayerStateCallback onPlayerStateCallback) {
        this.f2893U = onPlayerStateCallback;
    }

    @Override // p007l.hdm
    public void catchErrorLog0() {
        hu00.a aVar;
        super.catchErrorLog0();
        int i = this.f2892T;
        if (i == 0 || i == 1) {
            hu00.a aVar2 = this.f2891S;
            if (aVar2 != null) {
                aVar2.g(32770, 210, 0, this);
                return;
            }
            return;
        }
        if (i == 2 || i == 3 || i == 9) {
            hu00.a aVar3 = this.f2891S;
            if (aVar3 != null) {
                aVar3.g(32770, 209, 0, this);
                return;
            }
            return;
        }
        if (i != 8 || (aVar = this.f2891S) == null) {
            return;
        }
        aVar.g(32770, 210, 0, this);
    }

    @Override // p007l.hdm
    public void catchErrorLog1() {
        hu00.a aVar;
        super.catchErrorLog1();
        int i = this.f2892T;
        if (i == 0 || i == 1) {
            hu00.a aVar2 = this.f2891S;
            if (aVar2 != null) {
                aVar2.g(32770, 210, 0, this);
                return;
            }
            return;
        }
        if (i == 2 || i == 3 || i == 9) {
            hu00.a aVar3 = this.f2891S;
            if (aVar3 != null) {
                aVar3.g(32770, 209, 0, this);
                return;
            }
            return;
        }
        if (i != 8 || (aVar = this.f2891S) == null) {
            return;
        }
        aVar.g(32770, 210, 0, this);
    }

    @Override // p007l.hdm
    public void destroy() {
        super.destroy();
        ii70.d().c("Pipeline_Normal_pip->PIPLINE", "zk destroy AidInput");
    }

    @Override // p007l.hdm
    public long getDuration() {
        long duration = super.getDuration();
        ii70.d().a("Pipeline_Normal_pip->PIPLINE", "------onPrepared aid:duration=" + duration);
        return duration;
    }

    @Override // p007l.hdm
    public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i) {
        super.onBufferingUpdate(iMediaPlayer, i);
        OnPlayerStateCallback onPlayerStateCallback = this.f2893U;
        if (onPlayerStateCallback != null) {
            onPlayerStateCallback.onBufferingUpdate(iMediaPlayer, i);
        }
    }

    @Override // p007l.hdm
    public void onCompletion(IMediaPlayer iMediaPlayer) {
        hu00.a aVar;
        super.onCompletion(iMediaPlayer);
        int i = this.f2892T;
        if (i == 0 || i == 1) {
            hu00.a aVar2 = this.f2891S;
            if (aVar2 != null) {
                aVar2.g(32770, XEGiftErrorCode.ERROR_CODE_SSL_ERROR, 0, this);
            }
        } else if (i == 3 || i == 9) {
            hu00.a aVar3 = this.f2891S;
            if (aVar3 != null) {
                aVar3.g(32770, 206, 0, this);
            }
        } else if (i == 2 && (aVar = this.f2891S) != null) {
            aVar.g(32770, 205, 0, this);
        }
        if (this.f2893U != null) {
            Log.e("aidinput@", "onCompletion: call onCompletion interface");
            this.f2893U.onCompletion(iMediaPlayer);
        }
    }

    @Override // p007l.hdm
    @RequiresApi(api = 15)
    public void onDrawFrame() {
        super.onDrawFrame();
        int i = this.f2892T;
        if ((i == 2 || i == 3 || i == 9) && this.f2827K) {
            hu00.a aVar = this.f2891S;
            if (aVar != null) {
                aVar.g(32770, 208, 0, this);
            }
            this.f2827K = false;
            if (this.f2893U != null) {
                ii70.d().a("Pipeline_Normal_pip->PIPLINE", "---ktv---onPrepared aid:w=" + getWidth() + ";h=" + getHeight());
                this.f2893U.onVideoSizeChanged(this.f2834x, getWidth(), getHeight(), 0, 0);
            }
        }
    }

    @Override // p007l.hdm
    public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
        hu00.a aVar;
        boolean zOnError = super.onError(iMediaPlayer, i, i2);
        Log.e("Pipeline_Normal_pip->PIPLINE", getClass().getSimpleName() + "what:" + i + ", extra:" + i2);
        int i3 = this.f2892T;
        if (i3 == 0 || i3 == 1) {
            hu00.a aVar2 = this.f2891S;
            if (aVar2 != null) {
                aVar2.g(32770, 210, 0, this);
            }
        } else if (i3 == 2 || i3 == 3 || i3 == 9) {
            hu00.a aVar3 = this.f2891S;
            if (aVar3 != null) {
                aVar3.g(32770, 209, 0, this);
            }
            OnPlayerStateCallback onPlayerStateCallback = this.f2893U;
            if (onPlayerStateCallback != null) {
                onPlayerStateCallback.onInfo(iMediaPlayer, 209, i2);
                return zOnError;
            }
        } else if (i3 == 8 && (aVar = this.f2891S) != null) {
            aVar.g(32770, 210, 0, this);
            return zOnError;
        }
        return zOnError;
    }

    @Override // p007l.hdm
    public boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
        boolean zOnInfo = super.onInfo(iMediaPlayer, i, i2);
        if (this.f2893U != null) {
            Log.e("aidinput@", "onInfo-onInfo: what=" + i + ";extra=" + i2);
            this.f2893U.onInfo(iMediaPlayer, i, i2);
        }
        return zOnInfo;
    }

    @Override // p007l.hdm
    public void onMediaDateCallback(byte[] bArr, int i, int i2, IjkMediaPlayer ijkMediaPlayer) {
        super.onMediaDateCallback(bArr, i, i2, ijkMediaPlayer);
    }

    @Override // p007l.hdm
    @RequiresApi(api = 15)
    public void onPrepared(IMediaPlayer iMediaPlayer) {
        hu00.a aVar;
        super.onPrepared(iMediaPlayer);
        int audioTrackNum = iMediaPlayer.getAudioTrackNum();
        if (this.f2893U != null) {
            Log.e("aidinput@", "onPrepared-onInfo: what=213;extra=" + audioTrackNum);
            this.f2893U.onInfo(iMediaPlayer, 213, audioTrackNum);
        }
        OnPlayerStateCallback onPlayerStateCallback = this.f2893U;
        if (onPlayerStateCallback != null) {
            onPlayerStateCallback.onPrepared(iMediaPlayer);
        }
        int i = this.f2892T;
        if (i == 0 || i == 1) {
            hu00.a aVar2 = this.f2891S;
            if (aVar2 != null) {
                aVar2.g(32770, XEGiftErrorCode.ERROR_CODE_HTTP_ERROR, 0, this);
                return;
            }
            return;
        }
        if (i == 2 || i == 3 || i == 9) {
            hu00.a aVar3 = this.f2891S;
            if (aVar3 != null) {
                aVar3.g(32770, 204, 0, this);
                return;
            }
            return;
        }
        if (i != 8 || (aVar = this.f2891S) == null) {
            return;
        }
        aVar.g(32770, XEGiftErrorCode.ERROR_CODE_HTTP_ERROR, 0, this);
    }

    @Override // p007l.hdm
    public void onSeekComplete(IMediaPlayer iMediaPlayer) {
        super.onSeekComplete(iMediaPlayer);
        hu00.a aVar = this.f2891S;
        if (aVar != null) {
            aVar.g(32770, 212, 0, this);
        }
        OnPlayerStateCallback onPlayerStateCallback = this.f2893U;
        if (onPlayerStateCallback != null) {
            onPlayerStateCallback.onSeekComplete(iMediaPlayer);
        }
    }

    @Override // p007l.hdm
    public void onVideoMediacodecChanged(IMediaPlayer iMediaPlayer, int i) {
        hu00.a aVar;
        super.onVideoMediacodecChanged(iMediaPlayer, i);
        int i2 = this.f2892T;
        if (i2 == 0 || i2 == 1) {
            hu00.a aVar2 = this.f2891S;
            if (aVar2 != null) {
                aVar2.g(32770, 210, 0, this);
            }
        } else if (i2 == 2 || i2 == 3 || i2 == 9) {
            hu00.a aVar3 = this.f2891S;
            if (aVar3 != null) {
                aVar3.g(32770, 209, 0, this);
            }
        } else if (i2 == 8 && (aVar = this.f2891S) != null) {
            aVar.g(32770, 210, 0, this);
        }
        OnPlayerStateCallback onPlayerStateCallback = this.f2893U;
        if (onPlayerStateCallback != null) {
            onPlayerStateCallback.onVideoMediacodecChanged(iMediaPlayer, i);
        }
    }

    public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i, int i2, int i3, int i4) {
        if (i == 0 || i2 == 0) {
            return;
        }
        if (this.f2889Q == i && i2 == this.f2890R) {
            return;
        }
        int videoDarDen = iMediaPlayer.getVideoDarDen();
        int videoDarNum = iMediaPlayer.getVideoDarNum();
        int i5 = (videoDarDen <= 0 || videoDarNum <= 0) ? i : (videoDarNum * i2) / videoDarDen;
        this.f2889Q = i;
        this.f2890R = i2;
        SurfaceTexture surfaceTexture = ((rkw) this).b;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i, i2);
        }
        setRenderSize(i5, i2);
        ii70.d().a("Pipeline_Normal_pip->PIPLINE", "-ktv,onVideoSizeChanged:" + i5 + ", height:" + i2);
    }

    @Override // p007l.hdm
    public void stop() {
        hu00.a aVar;
        super.stop();
        int i = this.f2892T;
        if (i == 0 || i == 1) {
            hu00.a aVar2 = this.f2891S;
            if (aVar2 != null) {
                aVar2.g(32770, 211, 0, this);
                return;
            }
            return;
        }
        if (i == 2 || i == 3 || i == 9) {
            hu00.a aVar3 = this.f2891S;
            if (aVar3 != null) {
                aVar3.g(32770, 207, 0, this);
                return;
            }
            return;
        }
        if (i != 8 || (aVar = this.f2891S) == null) {
            return;
        }
        aVar.g(32770, 211, 0, this);
    }
}
