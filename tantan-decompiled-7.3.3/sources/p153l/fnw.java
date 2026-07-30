package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.immomo.medialog.LogLevel;
import com.immomo.momomediaext.utils.MMLivePlayerConfig;
import com.immomo.momomediaext.utils.MMLivePlayerStatus;
import com.immomo.momomediaext.utils.MMLiveTranscoding;
import com.immomo.momomediaext.utils.MMLiveUserConfig;
import com.immomo.network.bean.UrlType;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import tv.danmaku.ijk.media.player.PullWatchInfo;
import tv.danmaku.ijk.media.player.option.AvFourCC;

/* JADX INFO: loaded from: classes7.dex */
public class fnw {

    /* JADX INFO: renamed from: j */
    private static int f99968j;

    /* JADX INFO: renamed from: a */
    private IjkMediaPlayer f99969a;

    /* JADX INFO: renamed from: b */
    private C17021a f99970b;

    /* JADX INFO: renamed from: d */
    private MMLiveUserConfig f99972d;

    /* JADX INFO: renamed from: f */
    private String f99974f;

    /* JADX INFO: renamed from: g */
    private String f99975g;

    /* JADX INFO: renamed from: c */
    private MMLivePlayerStatus f99971c = MMLivePlayerStatus.MMLivePlayerStatusStopped;

    /* JADX INFO: renamed from: e */
    private PullWatchInfo f99973e = new PullWatchInfo();

    /* JADX INFO: renamed from: h */
    private Surface f99976h = null;

    /* JADX INFO: renamed from: i */
    private SurfaceHolder f99977i = null;

    /* JADX INFO: renamed from: l.fnw$a */
    public class C17021a implements IMediaPlayer.OnPreparedListener, IMediaPlayer.OnCompletionListener, IMediaPlayer.OnBufferingUpdateListener, IMediaPlayer.OnSeekCompleteListener, IMediaPlayer.OnVideoSizeChangedListener, IMediaPlayer.OnVideoMediacodecChangedListener, IMediaPlayer.OnErrorListener, IMediaPlayer.OnInfoListener, IMediaPlayer.RenderTimestampListener, IjkMediaPlayer.MediaDateCallback, IjkMediaPlayer.JsonDateCallback {

        /* JADX INFO: renamed from: a */
        private dnw f99978a;

        public C17021a() {
        }

        @Override // tv.danmaku.ijk.media.player.IjkMediaPlayer.JsonDateCallback
        public void JsonDateCallback(byte[] bArr, int i, IjkMediaPlayer ijkMediaPlayer) {
            if (this.f99978a != null) {
                try {
                    esx.m122399d("MMLivePlayer", "JsonDateCallback->onRecvUserInfo: ".concat(new String(bArr)));
                    this.f99978a.mo117083j(new MMLiveTranscoding(new String(bArr)));
                    this.f99978a.m117074a(bArr, i);
                } catch (Exception unused) {
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public void m126402a(dnw dnwVar) {
            this.f99978a = dnwVar;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i) {
            dnw dnwVar = this.f99978a;
            if (dnwVar != null) {
                dnwVar.m117075b(i);
            }
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
        public void onCompletion(IMediaPlayer iMediaPlayer) {
            esx.m122399d("MMLivePlayer", "");
            dnw dnwVar = this.f99978a;
            if (dnwVar != null) {
                dnwVar.mo117079f();
            }
            fnw.this.f99971c = MMLivePlayerStatus.MMLivePlayerStatusFinished;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
        public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
            esx.m122399d("MMLivePlayer", "onError: what=" + i + ", extra=" + i2);
            if (fnw.this.f99969a != null) {
                p4k0 currentUrlInfo = fnw.this.f99969a.getCurrentUrlInfo();
                boolean zHasPrepared = fnw.this.f99969a.hasPrepared();
                b7y.m102882c().m102888g("onError", "hasPrepared:" + zHasPrepared);
                if (currentUrlInfo != null) {
                    b7y.m102882c().m102888g("onError", "url:" + currentUrlInfo.m170573d() + ",type:" + currentUrlInfo.m170572b());
                }
                if (currentUrlInfo == null || currentUrlInfo.m170572b() != UrlType.IPV6 || zHasPrepared) {
                    b7y.m102882c().m102888g("onError: currentUrlInfo" + currentUrlInfo);
                } else {
                    qj20.m176806f().m176822r(currentUrlInfo, false, false);
                    if (TextUtils.isEmpty(fnw.this.f99974f) && TextUtils.isEmpty(fnw.this.f99975g)) {
                        b7y.m102882c().m102888g("onError: NetworkDetector没有返回可用URL");
                    } else {
                        try {
                            fnw.this.f99969a.stop();
                            fnw.this.f99969a.resetInternal();
                            Surface surface = fnw.this.f99976h;
                            fnw fnwVar = fnw.this;
                            if (surface != null) {
                                fnwVar.f99969a.setSurface(fnw.this.f99976h);
                            } else if (fnwVar.f99977i != null) {
                                fnw.this.f99969a.setDisplay(fnw.this.f99977i);
                            }
                            fnw.this.f99969a.setDataSource(fnw.this.f99974f, fnw.this.f99975g);
                            fnw.this.f99969a.setScreenOnWhilePlaying(true);
                            fnw.this.f99969a.setPropertyLong(20024, 44100L);
                            fnw.this.f99969a.setPropertyLong(20022, 2L);
                            fnw.this.f99969a.setPropertyLong(20023, 3L);
                            fnw.this.f99969a.prepareAsync();
                            return false;
                        } catch (Exception e) {
                            b7y.m102882c().m102888g("retry play err" + e.toString());
                            e.printStackTrace();
                        }
                    }
                }
            }
            dnw dnwVar = this.f99978a;
            if (dnwVar != null) {
                dnwVar.mo117078e(i2);
            }
            fnw.this.f99971c = MMLivePlayerStatus.MMLivePlayerStatusFailed;
            return true;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
        public boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
            esx.m122399d("MMLivePlayer", "" + i + " / " + i2);
            if (i == 3) {
                esx.m122396a("MMLivePlayer", "Info: MEDIA_INFO_VIDEO_RENDERING_START");
                dnw dnwVar = this.f99978a;
                if (dnwVar == null) {
                    return false;
                }
                dnwVar.mo117080g();
                return false;
            }
            if (i == 701) {
                esx.m122396a("MMLivePlayer", "Info: MEDIA_INFO_BUFFERING_START");
                dnw dnwVar2 = this.f99978a;
                if (dnwVar2 != null) {
                    dnwVar2.mo117082i();
                }
                fnw.this.f99971c = MMLivePlayerStatus.MMLivePlayerStatusBuffering;
                return false;
            }
            if (i != 702) {
                return false;
            }
            esx.m122396a("MMLivePlayer", "Info: MEDIA_INFO_BUFFERING_END");
            dnw dnwVar3 = this.f99978a;
            if (dnwVar3 == null) {
                return false;
            }
            dnwVar3.mo117077d();
            return false;
        }

        @Override // tv.danmaku.ijk.media.player.IjkMediaPlayer.MediaDateCallback
        public void onMediaDateCallback(byte[] bArr, int i, int i2, IjkMediaPlayer ijkMediaPlayer) {
            dnw dnwVar = this.f99978a;
            if (dnwVar != null) {
                dnwVar.m117076c(bArr, i, i2, ijkMediaPlayer);
            }
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            esx.m122399d("MMLivePlayer", "");
            if (fnw.this.f99969a != null) {
                p4k0 currentUrlInfo = fnw.this.f99969a.getCurrentUrlInfo();
                if (currentUrlInfo != null && currentUrlInfo.m170572b() == UrlType.IPV6) {
                    qj20.m176806f().m176822r(currentUrlInfo, true, false);
                }
                fnw.this.f99969a.setPrepared();
            }
            dnw dnwVar = this.f99978a;
            if (dnwVar != null) {
                dnwVar.mo117081h();
            }
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.RenderTimestampListener
        public void onRenderTimestampChanged(long j) {
            esx.m122399d("MMLivePlayer", "");
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(IMediaPlayer iMediaPlayer) {
            esx.m122399d("MMLivePlayer", "");
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoMediacodecChangedListener
        public void onVideoMediacodecChanged(IMediaPlayer iMediaPlayer, int i) {
            esx.m122399d("MMLivePlayer", "");
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i, int i2, int i3, int i4) {
            esx.m122399d("MMLivePlayer", "");
            dnw dnwVar = this.f99978a;
            if (dnwVar != null) {
                dnwVar.mo117084k(i, i2);
            }
        }
    }

    public fnw(Context context, MMLiveUserConfig mMLiveUserConfig) {
        this.f99972d = new MMLiveUserConfig("0", "0", "0", "0", "0", "100", true);
        esx.m122399d("MMLivePlayer", "");
        brx brxVar = new brx();
        if (mMLiveUserConfig == null) {
            mMLiveUserConfig = this.f99972d;
            b7y.m102882c().m102883a("MMLivePlayer", "userConfig", LogLevel.ERROR);
        }
        brxVar.m106183o(mMLiveUserConfig.getAppid());
        brxVar.m106189u(mMLiveUserConfig.getMomoid());
        brxVar.m106187s(mMLiveUserConfig.getRoomid());
        brxVar.m106188t(mMLiveUserConfig.getSecret());
        brxVar.m106182n(mMLiveUserConfig.getAppVersion());
        brxVar.m106185q(mMLiveUserConfig.getAppPatch());
        this.f99969a = new IjkMediaPlayer(context, brxVar);
        arx.m99789d().m99800o(y310.m214113a());
        b7y.m102882c().m102888g("MMLivePlayer", "userConfig:" + mMLiveUserConfig.toString());
        this.f99972d = mMLiveUserConfig;
        this.f99969a.setLogRoomInfos(mMLiveUserConfig.getRoomid(), this.f99969a.hashCode() + "", 0);
        arx.C15814d c15814dM99797h = arx.m99789d().m99797h(this.f99972d.getAppid());
        if (c15814dM99797h != null && c15814dM99797h.f73012e != null) {
            vnk0.m201997a().m202001e(c15814dM99797h.f73012e);
        }
        this.f99969a.setOverlayFormat(m126393j() ? AvFourCC.f208862a : AvFourCC.f208863b);
        f99968j++;
        esx.m122396a("MMLivePlayer", "MomoMediaPlayer: Create: count:" + f99968j);
        C17021a c17021a = new C17021a();
        this.f99970b = c17021a;
        this.f99969a.setOnPreparedListener(c17021a);
        this.f99969a.setOnCompletionListener(this.f99970b);
        this.f99969a.setOnVideoSizeChangedListener(this.f99970b);
        this.f99969a.setOnErrorListener(this.f99970b);
        this.f99969a.setOnSeekCompleteListener(this.f99970b);
        this.f99969a.setOnInfoListener(this.f99970b);
        this.f99969a.setOnBufferingUpdateListener(this.f99970b);
        this.f99969a.setOnVideoMediacodecChangedListener(this.f99970b);
        this.f99969a.setMediaDataCallback(this.f99970b);
        this.f99969a.setJsonDataCallback(this.f99970b);
    }

    /* JADX INFO: renamed from: g */
    private void m126392g(String str) {
        bsx bsxVar;
        arx.C15814d c15814dM99797h;
        MMLiveUserConfig mMLiveUserConfig = this.f99972d;
        if (mMLiveUserConfig == null || TextUtils.isEmpty(mMLiveUserConfig.getAppVersion()) || (c15814dM99797h = arx.m99789d().m99797h(this.f99972d.getAppid())) == null || (bsxVar = c15814dM99797h.f73012e) == null) {
            bsxVar = new bsx();
        }
        if (!TextUtils.isEmpty(str)) {
            bsx bsxVarM201999b = vnk0.m201997a().m201999b(str);
            bsxVar.f78207F0 = bsxVarM201999b.f78207F0;
            bsxVar.f78209G0 = bsxVarM201999b.f78209G0;
            bsxVar.f78211H0 = bsxVarM201999b.f78211H0;
            bsxVar.f78213I0 = bsxVarM201999b.f78213I0;
            bsxVar.f78215J0 = bsxVarM201999b.f78215J0;
            bsxVar.f78217K0 = bsxVarM201999b.f78217K0;
            bsxVar.f78219L0 = bsxVarM201999b.f78219L0;
            bsxVar.f78221M0 = bsxVarM201999b.f78221M0;
            bsxVar.f78223N0 = bsxVarM201999b.f78223N0;
            bsxVar.f78225O0 = bsxVarM201999b.f78225O0;
            bsxVar.f78227P0 = bsxVarM201999b.f78227P0;
            bsxVar.f78231R0 = bsxVarM201999b.f78231R0;
            bsxVar.f78237U0 = bsxVarM201999b.f78237U0;
            bsxVar.f78241W0 = bsxVarM201999b.f78241W0;
            bsxVar.f78243X0 = bsxVarM201999b.f78243X0;
            bsxVar.f78245Y0 = bsxVarM201999b.f78245Y0;
            bsxVar.f78247Z0 = bsxVarM201999b.f78247Z0;
            bsxVar.f78250a1 = bsxVarM201999b.f78250a1;
            bsxVar.f78253b1 = bsxVarM201999b.f78253b1;
            bsxVar.f78256c1 = bsxVarM201999b.f78256c1;
            bsxVar.f78259d1 = bsxVarM201999b.f78259d1;
            bsxVar.f78262e1 = bsxVarM201999b.f78262e1;
            bsxVar.f78265f1 = bsxVarM201999b.f78265f1;
            bsxVar.f78268g1 = bsxVarM201999b.f78268g1;
            bsxVar.f78271h1 = bsxVarM201999b.f78271h1;
            bsxVar.f78274i1 = bsxVarM201999b.f78274i1;
            bsxVar.f78277j1 = bsxVarM201999b.f78277j1;
            bsxVar.f78280k1 = bsxVarM201999b.f78280k1;
            bsxVar.f78283l1 = bsxVarM201999b.f78283l1;
        }
        IjkMediaPlayer ijkMediaPlayer = this.f99969a;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.applyMediaConfig(bsxVar);
        }
    }

    /* JADX INFO: renamed from: j */
    private static boolean m126393j() {
        return true;
    }

    /* JADX INFO: renamed from: h */
    public MMLivePlayerStatus m126394h() {
        esx.m122399d("MMLivePlayer", "");
        IjkMediaPlayer ijkMediaPlayer = this.f99969a;
        return (ijkMediaPlayer == null || !ijkMediaPlayer.isPlaying()) ? this.f99971c : MMLivePlayerStatus.MMLivePlayerStatusPlaying;
    }

    /* JADX INFO: renamed from: i */
    public PullWatchInfo m126395i() {
        IjkMediaPlayer ijkMediaPlayer = this.f99969a;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.getPullWatchInfo(this.f99973e);
        }
        return this.f99973e;
    }

    /* JADX INFO: renamed from: k */
    public void m126396k() {
        IjkMediaPlayer ijkMediaPlayer = this.f99969a;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.release();
            this.f99969a = null;
            f99968j--;
        }
    }

    /* JADX INFO: renamed from: l */
    public void m126397l(boolean z) {
        esx.m122399d("MMLivePlayer", "");
        IjkMediaPlayer ijkMediaPlayer = this.f99969a;
        if (ijkMediaPlayer != null) {
            float f = z ? 0.0f : 1.0f;
            ijkMediaPlayer.setVolume(f, f);
            esx.m122396a("MMLivePlayer", "setMute: value: " + f + this.f99969a + ", count:" + f99968j);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m126398m(dnw dnwVar) {
        esx.m122399d("MMLivePlayer", "");
        C17021a c17021a = this.f99970b;
        if (c17021a != null) {
            c17021a.m126402a(dnwVar);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m126399n(Surface surface) {
        esx.m122399d("MMLivePlayer", "");
        this.f99976h = surface;
        b7y.m102882c().m102888g("setPlayerView surface:" + surface);
        IjkMediaPlayer ijkMediaPlayer = this.f99969a;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.setSurface(this.f99976h);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m126400o(MMLivePlayerConfig mMLivePlayerConfig) {
        esx.m122399d("MMLivePlayer", "");
        b7y.m102882c().m102888g("MMLivePlayerConfig" + mMLivePlayerConfig.toString());
        try {
            if (this.f99969a != null) {
                if (mMLivePlayerConfig.mode == MMLivePlayerConfig.MMLivePlayerMode.MMLivePlayerModeLive) {
                    m126392g(mMLivePlayerConfig.mediaConfig);
                }
                MMLiveUserConfig mMLiveUserConfig = this.f99972d;
                if (mMLiveUserConfig != null) {
                    this.f99969a.setLogRoomInfos(mMLiveUserConfig.getRoomid(), this.f99969a.hashCode() + "", mMLivePlayerConfig.cdnType);
                }
                this.f99969a.setBusinessType(mMLivePlayerConfig.businessType);
                IjkMediaPlayer ijkMediaPlayer = this.f99969a;
                ijkMediaPlayer.setMediaCodecEnabled(ijkMediaPlayer.getHardDecoderFlagFromMediaConfig());
                if (!TextUtils.isEmpty(mMLivePlayerConfig.ipv6Url)) {
                    this.f99974f = mMLivePlayerConfig.ipv6Url;
                    this.f99975g = mMLivePlayerConfig.url;
                    b7y.m102882c().m102888g("startPlay", "setDataSource ipv6, ipv4");
                    this.f99969a.setDataSource(mMLivePlayerConfig.ipv6Url, mMLivePlayerConfig.url);
                } else if (TextUtils.isEmpty(mMLivePlayerConfig.url)) {
                    b7y.m102882c().m102883a("startPlay", "MMLivePlayerConfig url or ipv6 is empty", LogLevel.ERROR);
                } else {
                    this.f99974f = null;
                    this.f99975g = null;
                    b7y.m102882c().m102888g("startPlay", "setDataSource  ipv4");
                    this.f99969a.setDataSource(mMLivePlayerConfig.url);
                }
                this.f99969a.setScreenOnWhilePlaying(true);
                this.f99969a.setPropertyLong(20024, 44100L);
                this.f99969a.setPropertyLong(20022, 2L);
                this.f99969a.setPropertyLong(20023, 3L);
                this.f99969a.prepareAsync();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: p */
    public void m126401p() {
        esx.m122399d("MMLivePlayer", "");
        IjkMediaPlayer ijkMediaPlayer = this.f99969a;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.stop();
            qj20.m176806f().m176822r(this.f99969a.getCurrentUrlInfo(), true, true);
        }
    }
}
