package p149l;

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
public class gkw {

    /* JADX INFO: renamed from: j */
    private static int f103259j;

    /* JADX INFO: renamed from: a */
    private IjkMediaPlayer f103260a;

    /* JADX INFO: renamed from: b */
    private C17105a f103261b;

    /* JADX INFO: renamed from: d */
    private MMLiveUserConfig f103263d;

    /* JADX INFO: renamed from: f */
    private String f103265f;

    /* JADX INFO: renamed from: g */
    private String f103266g;

    /* JADX INFO: renamed from: c */
    private MMLivePlayerStatus f103262c = MMLivePlayerStatus.MMLivePlayerStatusStopped;

    /* JADX INFO: renamed from: e */
    private PullWatchInfo f103264e = new PullWatchInfo();

    /* JADX INFO: renamed from: h */
    private Surface f103267h = null;

    /* JADX INFO: renamed from: i */
    private SurfaceHolder f103268i = null;

    /* JADX INFO: renamed from: l.gkw$a */
    public class C17105a implements IMediaPlayer.OnPreparedListener, IMediaPlayer.OnCompletionListener, IMediaPlayer.OnBufferingUpdateListener, IMediaPlayer.OnSeekCompleteListener, IMediaPlayer.OnVideoSizeChangedListener, IMediaPlayer.OnVideoMediacodecChangedListener, IMediaPlayer.OnErrorListener, IMediaPlayer.OnInfoListener, IMediaPlayer.RenderTimestampListener, IjkMediaPlayer.MediaDateCallback, IjkMediaPlayer.JsonDateCallback {

        /* JADX INFO: renamed from: a */
        private ekw f103269a;

        public C17105a() {
        }

        @Override // tv.danmaku.ijk.media.player.IjkMediaPlayer.JsonDateCallback
        public void JsonDateCallback(byte[] bArr, int i, IjkMediaPlayer ijkMediaPlayer) {
            if (this.f103269a != null) {
                try {
                    hjx.m131421d("MMLivePlayer", "JsonDateCallback->onRecvUserInfo: ".concat(new String(bArr)));
                    this.f103269a.mo117013j(new MMLiveTranscoding(new String(bArr)));
                    this.f103269a.m117004a(bArr, i);
                } catch (Exception unused) {
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public void m126735a(ekw ekwVar) {
            this.f103269a = ekwVar;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i) {
            ekw ekwVar = this.f103269a;
            if (ekwVar != null) {
                ekwVar.m117005b(i);
            }
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
        public void onCompletion(IMediaPlayer iMediaPlayer) {
            hjx.m131421d("MMLivePlayer", "");
            ekw ekwVar = this.f103269a;
            if (ekwVar != null) {
                ekwVar.mo117009f();
            }
            gkw.this.f103262c = MMLivePlayerStatus.MMLivePlayerStatusFinished;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
        public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
            hjx.m131421d("MMLivePlayer", "onError: what=" + i + ", extra=" + i2);
            if (gkw.this.f103260a != null) {
                mvj0 currentUrlInfo = gkw.this.f103260a.getCurrentUrlInfo();
                boolean zHasPrepared = gkw.this.f103260a.hasPrepared();
                eyx.m118802c().m118808g("onError", "hasPrepared:" + zHasPrepared);
                if (currentUrlInfo != null) {
                    eyx.m118802c().m118808g("onError", "url:" + currentUrlInfo.m156529d() + ",type:" + currentUrlInfo.m156528b());
                }
                if (currentUrlInfo == null || currentUrlInfo.m156528b() != UrlType.IPV6 || zHasPrepared) {
                    eyx.m118802c().m118808g("onError: currentUrlInfo" + currentUrlInfo);
                } else {
                    hb20.m130275f().m130291r(currentUrlInfo, false, false);
                    if (TextUtils.isEmpty(gkw.this.f103265f) && TextUtils.isEmpty(gkw.this.f103266g)) {
                        eyx.m118802c().m118808g("onError: NetworkDetector没有返回可用URL");
                    } else {
                        try {
                            gkw.this.f103260a.stop();
                            gkw.this.f103260a.resetInternal();
                            Surface surface = gkw.this.f103267h;
                            gkw gkwVar = gkw.this;
                            if (surface != null) {
                                gkwVar.f103260a.setSurface(gkw.this.f103267h);
                            } else if (gkwVar.f103268i != null) {
                                gkw.this.f103260a.setDisplay(gkw.this.f103268i);
                            }
                            gkw.this.f103260a.setDataSource(gkw.this.f103265f, gkw.this.f103266g);
                            gkw.this.f103260a.setScreenOnWhilePlaying(true);
                            gkw.this.f103260a.setPropertyLong(20024, 44100L);
                            gkw.this.f103260a.setPropertyLong(20022, 2L);
                            gkw.this.f103260a.setPropertyLong(20023, 3L);
                            gkw.this.f103260a.prepareAsync();
                            return false;
                        } catch (Exception e) {
                            eyx.m118802c().m118808g("retry play err" + e.toString());
                            e.printStackTrace();
                        }
                    }
                }
            }
            ekw ekwVar = this.f103269a;
            if (ekwVar != null) {
                ekwVar.mo117008e(i2);
            }
            gkw.this.f103262c = MMLivePlayerStatus.MMLivePlayerStatusFailed;
            return true;
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
        public boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
            hjx.m131421d("MMLivePlayer", "" + i + " / " + i2);
            if (i == 3) {
                hjx.m131418a("MMLivePlayer", "Info: MEDIA_INFO_VIDEO_RENDERING_START");
                ekw ekwVar = this.f103269a;
                if (ekwVar == null) {
                    return false;
                }
                ekwVar.mo117010g();
                return false;
            }
            if (i == 701) {
                hjx.m131418a("MMLivePlayer", "Info: MEDIA_INFO_BUFFERING_START");
                ekw ekwVar2 = this.f103269a;
                if (ekwVar2 != null) {
                    ekwVar2.mo117012i();
                }
                gkw.this.f103262c = MMLivePlayerStatus.MMLivePlayerStatusBuffering;
                return false;
            }
            if (i != 702) {
                return false;
            }
            hjx.m131418a("MMLivePlayer", "Info: MEDIA_INFO_BUFFERING_END");
            ekw ekwVar3 = this.f103269a;
            if (ekwVar3 == null) {
                return false;
            }
            ekwVar3.mo117007d();
            return false;
        }

        @Override // tv.danmaku.ijk.media.player.IjkMediaPlayer.MediaDateCallback
        public void onMediaDateCallback(byte[] bArr, int i, int i2, IjkMediaPlayer ijkMediaPlayer) {
            ekw ekwVar = this.f103269a;
            if (ekwVar != null) {
                ekwVar.m117006c(bArr, i, i2, ijkMediaPlayer);
            }
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            hjx.m131421d("MMLivePlayer", "");
            if (gkw.this.f103260a != null) {
                mvj0 currentUrlInfo = gkw.this.f103260a.getCurrentUrlInfo();
                if (currentUrlInfo != null && currentUrlInfo.m156528b() == UrlType.IPV6) {
                    hb20.m130275f().m130291r(currentUrlInfo, true, false);
                }
                gkw.this.f103260a.setPrepared();
            }
            ekw ekwVar = this.f103269a;
            if (ekwVar != null) {
                ekwVar.mo117011h();
            }
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.RenderTimestampListener
        public void onRenderTimestampChanged(long j) {
            hjx.m131421d("MMLivePlayer", "");
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(IMediaPlayer iMediaPlayer) {
            hjx.m131421d("MMLivePlayer", "");
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoMediacodecChangedListener
        public void onVideoMediacodecChanged(IMediaPlayer iMediaPlayer, int i) {
            hjx.m131421d("MMLivePlayer", "");
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i, int i2, int i3, int i4) {
            hjx.m131421d("MMLivePlayer", "");
            ekw ekwVar = this.f103269a;
            if (ekwVar != null) {
                ekwVar.mo117014k(i, i2);
            }
        }
    }

    public gkw(Context context, MMLiveUserConfig mMLiveUserConfig) {
        this.f103263d = new MMLiveUserConfig("0", "0", "0", "0", "0", "100", true);
        hjx.m131421d("MMLivePlayer", "");
        eix eixVar = new eix();
        if (mMLiveUserConfig == null) {
            mMLiveUserConfig = this.f103263d;
            eyx.m118802c().m118803a("MMLivePlayer", "userConfig", LogLevel.ERROR);
        }
        eixVar.m116739o(mMLiveUserConfig.getAppid());
        eixVar.m116745u(mMLiveUserConfig.getMomoid());
        eixVar.m116743s(mMLiveUserConfig.getRoomid());
        eixVar.m116744t(mMLiveUserConfig.getSecret());
        eixVar.m116738n(mMLiveUserConfig.getAppVersion());
        eixVar.m116741q(mMLiveUserConfig.getAppPatch());
        this.f103260a = new IjkMediaPlayer(context, eixVar);
        dix.m111940d().m111951o(qv00.m176690a());
        eyx.m118802c().m118808g("MMLivePlayer", "userConfig:" + mMLiveUserConfig.toString());
        this.f103263d = mMLiveUserConfig;
        this.f103260a.setLogRoomInfos(mMLiveUserConfig.getRoomid(), this.f103260a.hashCode() + "", 0);
        dix.C16387d c16387dM111948h = dix.m111940d().m111948h(this.f103263d.getAppid());
        if (c16387dM111948h != null && c16387dM111948h.f86452e != null) {
            pek0.m168517a().m168521e(c16387dM111948h.f86452e);
        }
        this.f103260a.setOverlayFormat(m126726j() ? AvFourCC.f207940a : AvFourCC.f207941b);
        f103259j++;
        hjx.m131418a("MMLivePlayer", "MomoMediaPlayer: Create: count:" + f103259j);
        C17105a c17105a = new C17105a();
        this.f103261b = c17105a;
        this.f103260a.setOnPreparedListener(c17105a);
        this.f103260a.setOnCompletionListener(this.f103261b);
        this.f103260a.setOnVideoSizeChangedListener(this.f103261b);
        this.f103260a.setOnErrorListener(this.f103261b);
        this.f103260a.setOnSeekCompleteListener(this.f103261b);
        this.f103260a.setOnInfoListener(this.f103261b);
        this.f103260a.setOnBufferingUpdateListener(this.f103261b);
        this.f103260a.setOnVideoMediacodecChangedListener(this.f103261b);
        this.f103260a.setMediaDataCallback(this.f103261b);
        this.f103260a.setJsonDataCallback(this.f103261b);
    }

    /* JADX INFO: renamed from: g */
    private void m126725g(String str) {
        ejx ejxVar;
        dix.C16387d c16387dM111948h;
        MMLiveUserConfig mMLiveUserConfig = this.f103263d;
        if (mMLiveUserConfig == null || TextUtils.isEmpty(mMLiveUserConfig.getAppVersion()) || (c16387dM111948h = dix.m111940d().m111948h(this.f103263d.getAppid())) == null || (ejxVar = c16387dM111948h.f86452e) == null) {
            ejxVar = new ejx();
        }
        if (!TextUtils.isEmpty(str)) {
            ejx ejxVarM168519b = pek0.m168517a().m168519b(str);
            ejxVar.f91807F0 = ejxVarM168519b.f91807F0;
            ejxVar.f91809G0 = ejxVarM168519b.f91809G0;
            ejxVar.f91811H0 = ejxVarM168519b.f91811H0;
            ejxVar.f91813I0 = ejxVarM168519b.f91813I0;
            ejxVar.f91815J0 = ejxVarM168519b.f91815J0;
            ejxVar.f91817K0 = ejxVarM168519b.f91817K0;
            ejxVar.f91819L0 = ejxVarM168519b.f91819L0;
            ejxVar.f91821M0 = ejxVarM168519b.f91821M0;
            ejxVar.f91823N0 = ejxVarM168519b.f91823N0;
            ejxVar.f91825O0 = ejxVarM168519b.f91825O0;
            ejxVar.f91827P0 = ejxVarM168519b.f91827P0;
            ejxVar.f91831R0 = ejxVarM168519b.f91831R0;
            ejxVar.f91837U0 = ejxVarM168519b.f91837U0;
            ejxVar.f91841W0 = ejxVarM168519b.f91841W0;
            ejxVar.f91843X0 = ejxVarM168519b.f91843X0;
            ejxVar.f91845Y0 = ejxVarM168519b.f91845Y0;
            ejxVar.f91847Z0 = ejxVarM168519b.f91847Z0;
            ejxVar.f91850a1 = ejxVarM168519b.f91850a1;
            ejxVar.f91853b1 = ejxVarM168519b.f91853b1;
            ejxVar.f91856c1 = ejxVarM168519b.f91856c1;
            ejxVar.f91859d1 = ejxVarM168519b.f91859d1;
            ejxVar.f91862e1 = ejxVarM168519b.f91862e1;
            ejxVar.f91865f1 = ejxVarM168519b.f91865f1;
            ejxVar.f91868g1 = ejxVarM168519b.f91868g1;
            ejxVar.f91871h1 = ejxVarM168519b.f91871h1;
            ejxVar.f91874i1 = ejxVarM168519b.f91874i1;
            ejxVar.f91877j1 = ejxVarM168519b.f91877j1;
            ejxVar.f91880k1 = ejxVarM168519b.f91880k1;
            ejxVar.f91883l1 = ejxVarM168519b.f91883l1;
        }
        IjkMediaPlayer ijkMediaPlayer = this.f103260a;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.applyMediaConfig(ejxVar);
        }
    }

    /* JADX INFO: renamed from: j */
    private static boolean m126726j() {
        return true;
    }

    /* JADX INFO: renamed from: h */
    public MMLivePlayerStatus m126727h() {
        hjx.m131421d("MMLivePlayer", "");
        IjkMediaPlayer ijkMediaPlayer = this.f103260a;
        return (ijkMediaPlayer == null || !ijkMediaPlayer.isPlaying()) ? this.f103262c : MMLivePlayerStatus.MMLivePlayerStatusPlaying;
    }

    /* JADX INFO: renamed from: i */
    public PullWatchInfo m126728i() {
        IjkMediaPlayer ijkMediaPlayer = this.f103260a;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.getPullWatchInfo(this.f103264e);
        }
        return this.f103264e;
    }

    /* JADX INFO: renamed from: k */
    public void m126729k() {
        IjkMediaPlayer ijkMediaPlayer = this.f103260a;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.release();
            this.f103260a = null;
            f103259j--;
        }
    }

    /* JADX INFO: renamed from: l */
    public void m126730l(boolean z) {
        hjx.m131421d("MMLivePlayer", "");
        IjkMediaPlayer ijkMediaPlayer = this.f103260a;
        if (ijkMediaPlayer != null) {
            float f = z ? 0.0f : 1.0f;
            ijkMediaPlayer.setVolume(f, f);
            hjx.m131418a("MMLivePlayer", "setMute: value: " + f + this.f103260a + ", count:" + f103259j);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m126731m(ekw ekwVar) {
        hjx.m131421d("MMLivePlayer", "");
        C17105a c17105a = this.f103261b;
        if (c17105a != null) {
            c17105a.m126735a(ekwVar);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m126732n(Surface surface) {
        hjx.m131421d("MMLivePlayer", "");
        this.f103267h = surface;
        eyx.m118802c().m118808g("setPlayerView surface:" + surface);
        IjkMediaPlayer ijkMediaPlayer = this.f103260a;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.setSurface(this.f103267h);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m126733o(MMLivePlayerConfig mMLivePlayerConfig) {
        hjx.m131421d("MMLivePlayer", "");
        eyx.m118802c().m118808g("MMLivePlayerConfig" + mMLivePlayerConfig.toString());
        try {
            if (this.f103260a != null) {
                if (mMLivePlayerConfig.mode == MMLivePlayerConfig.MMLivePlayerMode.MMLivePlayerModeLive) {
                    m126725g(mMLivePlayerConfig.mediaConfig);
                }
                MMLiveUserConfig mMLiveUserConfig = this.f103263d;
                if (mMLiveUserConfig != null) {
                    this.f103260a.setLogRoomInfos(mMLiveUserConfig.getRoomid(), this.f103260a.hashCode() + "", mMLivePlayerConfig.cdnType);
                }
                this.f103260a.setBusinessType(mMLivePlayerConfig.businessType);
                IjkMediaPlayer ijkMediaPlayer = this.f103260a;
                ijkMediaPlayer.setMediaCodecEnabled(ijkMediaPlayer.getHardDecoderFlagFromMediaConfig());
                if (!TextUtils.isEmpty(mMLivePlayerConfig.ipv6Url)) {
                    this.f103265f = mMLivePlayerConfig.ipv6Url;
                    this.f103266g = mMLivePlayerConfig.url;
                    eyx.m118802c().m118808g("startPlay", "setDataSource ipv6, ipv4");
                    this.f103260a.setDataSource(mMLivePlayerConfig.ipv6Url, mMLivePlayerConfig.url);
                } else if (TextUtils.isEmpty(mMLivePlayerConfig.url)) {
                    eyx.m118802c().m118803a("startPlay", "MMLivePlayerConfig url or ipv6 is empty", LogLevel.ERROR);
                } else {
                    this.f103265f = null;
                    this.f103266g = null;
                    eyx.m118802c().m118808g("startPlay", "setDataSource  ipv4");
                    this.f103260a.setDataSource(mMLivePlayerConfig.url);
                }
                this.f103260a.setScreenOnWhilePlaying(true);
                this.f103260a.setPropertyLong(20024, 44100L);
                this.f103260a.setPropertyLong(20022, 2L);
                this.f103260a.setPropertyLong(20023, 3L);
                this.f103260a.prepareAsync();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: p */
    public void m126734p() {
        hjx.m131421d("MMLivePlayer", "");
        IjkMediaPlayer ijkMediaPlayer = this.f103260a;
        if (ijkMediaPlayer != null) {
            ijkMediaPlayer.stop();
            hb20.m130275f().m130291r(this.f103260a.getCurrentUrlInfo(), true, true);
        }
    }
}
