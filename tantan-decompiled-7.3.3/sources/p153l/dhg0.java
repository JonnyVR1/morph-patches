package p153l;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.p051p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.state.SudMGPMGState;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.UUID;
import tech.sud.gip.asr.base.BaseRealSudASRImpl;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.core.GameInfo;
import tech.sud.gip.core.ISudAiAgent;
import tech.sud.gip.core.ISudFSMMG;
import tech.sud.gip.core.ISudFSTAPP;
import tech.sud.gip.core.ISudListenerNotifyStateChange;
import tech.sud.gip.core.SudLoadMGParamModel;
import tech.sud.gip.core.view.SudGameView;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class dhg0 implements ISudFSTAPP, kzg0 {

    /* JADX INFO: renamed from: F */
    public static final String f88494F = "SudGIP ".concat(dhg0.class.getSimpleName());

    /* JADX INFO: renamed from: G */
    public static dhg0 f88495G;

    /* JADX INFO: renamed from: A */
    public boolean f88496A;

    /* JADX INFO: renamed from: B */
    public rog0 f88497B;

    /* JADX INFO: renamed from: C */
    public qug0 f88498C;

    /* JADX INFO: renamed from: D */
    public xlg0 f88499D;

    /* JADX INFO: renamed from: E */
    public hkg0 f88500E;

    /* JADX INFO: renamed from: a */
    public final SudLoadMGParamModel f88501a;

    /* JADX INFO: renamed from: b */
    public final Activity f88502b;

    /* JADX INFO: renamed from: c */
    public final String f88503c;

    /* JADX INFO: renamed from: d */
    public final String f88504d;

    /* JADX INFO: renamed from: e */
    public final long f88505e;

    /* JADX INFO: renamed from: f */
    public final ISudFSMMG f88506f;

    /* JADX INFO: renamed from: g */
    public GameInfo f88507g;

    /* JADX INFO: renamed from: h */
    public final Context f88508h;

    /* JADX INFO: renamed from: i */
    public boolean f88509i = false;

    /* JADX INFO: renamed from: j */
    public boolean f88510j = false;

    /* JADX INFO: renamed from: k */
    public boolean f88511k = false;

    /* JADX INFO: renamed from: l */
    public boolean f88512l = true;

    /* JADX INFO: renamed from: m */
    public lug0 f88513m;

    /* JADX INFO: renamed from: n */
    public final SudGameView f88514n;

    /* JADX INFO: renamed from: o */
    public gug0 f88515o;

    /* JADX INFO: renamed from: p */
    public bgg0 f88516p;

    /* JADX INFO: renamed from: q */
    public View f88517q;

    /* JADX INFO: renamed from: r */
    public final krg0 f88518r;

    /* JADX INFO: renamed from: s */
    public final aog0 f88519s;

    /* JADX INFO: renamed from: t */
    public final bfg0 f88520t;

    /* JADX INFO: renamed from: u */
    public final wyg0 f88521u;

    /* JADX INFO: renamed from: v */
    public mkg0 f88522v;

    /* JADX INFO: renamed from: w */
    public final iug0 f88523w;

    /* JADX INFO: renamed from: x */
    public GameInfo f88524x;

    /* JADX INFO: renamed from: y */
    public String f88525y;

    /* JADX INFO: renamed from: z */
    public ArrayList f88526z;

    public dhg0(SudLoadMGParamModel sudLoadMGParamModel, ISudFSMMG iSudFSMMG) {
        iug0 iug0Var = new iug0(this);
        this.f88523w = iug0Var;
        LogUtils.file("ProxySudFSTAPPImpl", "初始化" + LogUtils.buildField("userId", sudLoadMGParamModel.userId) + LogUtils.buildField("roomId", sudLoadMGParamModel.roomId) + LogUtils.buildField("code", sudLoadMGParamModel.code) + LogUtils.buildField("mgId", Long.valueOf(sudLoadMGParamModel.mgId)) + LogUtils.buildField(IjkMediaMeta.IJKM_KEY_LANGUAGE, sudLoadMGParamModel.language));
        if (f88495G != null) {
            LogUtils.file("ProxySudFSTAPPImpl", "Hey, guy! You not hold or call the destroyMG, but the instance will be dealloc. Please check it!");
            SudLogger.m222811d(f88494F, "Hey, guy! You not hold or call the destroyMG, but the instance will be dealloc. Please check it!");
            f88495G.destroyMG();
        }
        f88495G = this;
        this.f88501a = sudLoadMGParamModel;
        Activity activity = sudLoadMGParamModel.activity;
        this.f88502b = activity;
        String str = sudLoadMGParamModel.userId;
        this.f88503c = str;
        String str2 = sudLoadMGParamModel.roomId;
        this.f88504d = str2;
        String str3 = sudLoadMGParamModel.code;
        long j = sudLoadMGParamModel.mgId;
        this.f88505e = j;
        this.f88506f = iSudFSMMG;
        Context applicationContext = activity.getApplicationContext();
        this.f88508h = applicationContext;
        iug0Var.f116948s = activity;
        GameInfo gameInfo = new GameInfo();
        this.f88507g = gameInfo;
        gameInfo.mgId = sudLoadMGParamModel.mgId;
        SudGameView sudGameView = new SudGameView(activity);
        sudGameView.setLifecycleListener(new zjg0(this));
        this.f88514n = sudGameView;
        long j2 = sudLoadMGParamModel.mgId;
        String str4 = fug0.f100911a;
        fug0.f100914d.put(String.valueOf(j2), gxg0.m132863b(UUID.randomUUID().toString()));
        if (dlg0.f89532c == null) {
            dlg0.f89532c = new dlg0(applicationContext);
        }
        this.f88518r = new krg0(this);
        this.f88519s = new aog0(this);
        bfg0 bfg0Var = new bfg0(this, this);
        this.f88520t = bfg0Var;
        wyg0 wyg0Var = new wyg0(applicationContext);
        this.f88521u = wyg0Var;
        if (iSudFSMMG == null) {
            SudLogger.m222819w(wyg0.f191639n, "fsmMg2App is null");
        } else {
            wyg0Var.f191642c = new WeakReference(iSudFSMMG);
            wyg0Var.f191643d = str;
            wyg0Var.f191644e = str2;
            wyg0Var.f191645f = str3;
            wyg0Var.f191646g = j;
            wyg0Var.f191649j.clear();
            wyg0Var.f191650k.clear();
            wyg0Var.f191651l.clear();
            wyg0Var.f191640a.clear();
            wyg0Var.f191640a.put("m2as-set-debug", new rvg0());
            wyg0Var.f191640a.put("m2as-mg-log", new g0h0(wyg0Var));
            wyg0Var.f191640a.put("m2as-get-net-status", new meg0(wyg0Var));
            wyg0Var.f191640a.put("m2as-get-game-view-info", new ugg0(wyg0Var));
            wyg0Var.f191640a.put("m2as-get-game-cfg", new uhg0(wyg0Var));
            wyg0Var.f191640a.put("m2as-login", new yhg0(wyg0Var));
            wyg0Var.f191640a.put("m2as-expire-code", new xmg0(wyg0Var));
            wyg0Var.f191640a.put("m2as-vibrate", new eng0(wyg0Var));
            wyg0Var.f191640a.put("m2as-get-sdk-info", new rxg0(wyg0Var));
            wyg0Var.f191640a.put("m2as-get-state", new ssg0(wyg0Var));
            wyg0Var.f191640a.put("m2as-notify-game-load-started", new xog0(wyg0Var));
            wyg0Var.f191640a.put("m2as-notify-game-load-completed", new wug0(wyg0Var));
            wyg0Var.f191640a.put("m2as-notify-game-started", new zwg0(wyg0Var));
            wyg0Var.f191640a.put(SudMGPMGState.MG_COMMON_GAME_ASR, new kpg0(wyg0Var));
            wyg0Var.f191640a.put("mg_common_game_load_percent", new qzg0(wyg0Var));
            wyg0Var.f191640a.put("mg_common_game_reload", new jfg0(wyg0Var));
            wyg0Var.f191640a.put("m2as-ai-common", new dgg0(wyg0Var));
            wyg0Var.f191640a.put("m2as-ai-sse", new ghg0(wyg0Var));
            wyg0Var.f191640a.put("mg_common_game_player_self_info", new hmg0(wyg0Var));
            wyg0Var.f191640a.put("mg_common_game_llm_asr", new tyg0(wyg0Var));
        }
        wyg0Var.f191652m = bfg0Var;
        m115801c(this.f88507g);
    }

    /* JADX INFO: renamed from: a */
    public final void m115799a() {
        lug0 lug0Var;
        if (this.f88516p != null) {
            if (this.f88507g != null && (lug0Var = this.f88513m) != null) {
                if (lug0Var instanceof blg0) {
                } else if (lug0Var instanceof alg0) {
                }
            }
            this.f88514n.removeView(this.f88517q);
            this.f88516p = null;
            this.f88517q = null;
        }
        gug0 gug0Var = this.f88515o;
        if (gug0Var != null) {
            String str = gug0.f106499i;
            SudLogger.m222817v(str, "stop loading");
            gug0Var.f106504e = null;
            if (gug0Var.f106506g < gug0Var.f106503d.size()) {
                ((bkg0) gug0Var.f106503d.get(gug0Var.f106506g)).cancel();
                gug0Var.f106506g = 0;
                LogUtils.file("SudGameLoadingModel", "loading canceled");
                SudLogger.m222811d(str, "loading canceled");
            } else if (gug0Var.f106507h != null) {
                LogUtils.file("SudGameLoadingModel", "loading done");
                SudLogger.m222811d(str, "loading done");
                gug0Var.f106507h.getClass();
            }
            this.f88515o = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m115800b(int i, int i2, int i3, boolean z) {
        String str = "onGameLoadingProgress stage:" + i + "  retCode:" + i2 + "  progress:" + i3;
        LogUtils.file("ProxySudFSTAPPImpl", str);
        SudLogger.m222815i(f88494F, str);
        iug0 iug0Var = this.f88523w;
        iug0Var.getClass();
        if (i2 == 0 && !z) {
            iug0Var.f116943n = i3;
            iug0Var.f116941l.reset();
            iug0Var.f116941l.start();
        }
        ISudFSMMG iSudFSMMG = this.f88506f;
        if (iSudFSMMG != null) {
            iSudFSMMG.onGameLoadingProgress(i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m115801c(GameInfo gameInfo) {
        LogUtils.file("ProxySudFSTAPPImpl", "_loadGame");
        String str = f88494F;
        SudLogger.m222811d(str, "_loadGame");
        this.f88509i = false;
        this.f88512l = true;
        iug0 iug0Var = this.f88523w;
        iug0Var.getClass();
        LogUtils.file("LoadGameStatsManager", "startLoad:" + gameInfo.mgId);
        ukg0 ukg0Var = new ukg0("loadGameFinished");
        iug0Var.f116930a = ukg0Var;
        ukg0Var.f179404m = 0;
        iug0Var.f116931b = new ArrayList();
        ukg0 ukg0Var2 = iug0Var.f116930a;
        Boolean bool = Boolean.TRUE;
        ukg0Var2.f179403l = bool;
        ukg0Var2.f179402k = bool;
        ukg0Var2.f179398g = String.valueOf(gameInfo.mgId);
        iug0Var.f116945p = gameInfo.mgId;
        iug0Var.f116932c = System.nanoTime() / 1000000;
        iug0Var.m142189a();
        iug0Var.f116939j.reset();
        iug0Var.f116940k.reset();
        iug0Var.f116941l.reset();
        iug0Var.f116941l.start();
        iug0Var.f116936g = false;
        iug0Var.f116938i = false;
        iug0Var.f116937h = false;
        iug0Var.f116935f = false;
        iug0Var.f116933d = null;
        iug0Var.f116942m.clear();
        iug0Var.f116944o = false;
        iug0Var.f116943n = 0;
        this.f88516p = new bgg0(this.f88502b);
        Activity activity = this.f88502b;
        SudLoadMGParamModel sudLoadMGParamModel = this.f88501a;
        gug0 gug0Var = new gug0(activity, sudLoadMGParamModel, sudLoadMGParamModel.loadMGMode, sudLoadMGParamModel.authorizationSecret, this.f88518r);
        this.f88515o = gug0Var;
        bgg0 bgg0Var = this.f88516p;
        View view = bgg0Var.f76624f;
        this.f88517q = view;
        bgg0Var.f189794a = this.f88519s;
        gug0Var.f106507h = bgg0Var;
        this.f88514n.addView(view);
        aog0 aog0Var = this.f88516p.f189794a;
        aog0Var.getClass();
        LogUtils.file("ProxySudFSTAPPImpl", "onLoadingStart");
        SudLogger.m222811d(str, "onLoadingStart");
        gug0 gug0Var2 = aog0Var.f72452a.f88515o;
        gug0Var2.getClass();
        SudLogger.m222817v(gug0.f106499i, "start loading");
        gug0Var2.f106504e = gameInfo;
        bgg0 bgg0Var2 = gug0Var2.f106507h;
        if (bgg0Var2 != null) {
            bgg0Var2.f76621c = 10;
            bgg0Var2.f76627i.setProgress(10);
            bgg0Var2.f76631m.setVisibility(0);
            if (!nkg0.f142458a || bgg0Var2.f76637s) {
                bgg0Var2.f76629k.setVisibility(4);
            } else {
                bgg0Var2.f76629k.setVisibility(0);
            }
            bgg0Var2.f189794a.f72452a.m115800b(1, 0, bgg0Var2.f76621c, false);
            bgg0Var2.m104168g();
            bgg0Var2.m104162a();
            bgg0Var2.m104164c(0, true, bgg0Var2.f76621c, false);
            bgg0Var2.f76625g.setVisibility(4);
        }
        int i = gug0Var2.f106506g;
        if (i != 0 && i < gug0Var2.f106503d.size()) {
            ((bkg0) gug0Var2.f106503d.get(gug0Var2.f106506g)).cancel();
        }
        gug0Var2.f106506g = 0;
        ((bkg0) gug0Var2.f106503d.get(0)).mo104809a(gug0Var2.f106504e, gug0Var2.f106501b, gug0Var2.f106502c);
    }

    @Override // tech.sud.gip.core.ISudFSTAPP
    public final boolean destroyMG() {
        BaseRealSudASRImpl baseRealSudASRImpl;
        String str = f88494F;
        SudLogger.m222815i(str, "destroyMG");
        LogUtils.file("ProxySudFSTAPPImpl", "destroyMG");
        if (!this.f88511k) {
            this.f88511k = true;
            LogUtils.file("ProxySudFSTAPPImpl", "_destroyMGInternal");
            SudLogger.m222811d(str, "_destroyMGInternal");
            iug0 iug0Var = this.f88523w;
            iug0Var.f116938i = true;
            iug0Var.f116939j.stop();
            iug0Var.f116940k.stop();
            iug0Var.f116941l.stop();
            iug0Var.m142189a();
            ukg0 ukg0Var = iug0Var.f116930a;
            if (ukg0Var != null) {
                ukg0Var.f179396e = -10301;
            }
            if (ukg0Var != null) {
                ukg0Var.f179397f = "销毁游戏";
            }
            iug0Var.m142196h();
            m115799a();
            lug0 lug0Var = this.f88513m;
            if (lug0Var != null) {
                lug0Var.destroyMG();
                this.f88513m = null;
            }
            fug0.f100914d.remove(String.valueOf(this.f88505e));
            rog0 rog0Var = this.f88497B;
            if (rog0Var != null) {
                rog0Var.m182410a();
                this.f88497B = null;
            }
            qug0 qug0Var = this.f88498C;
            if (qug0Var != null) {
                SudLogger.m222811d(qug0Var.f159573a, "destroy isRunning:" + qug0Var.f159578f.get());
                LogUtils.file("SudGIPWebSocket", "destroy isRunning:" + qug0Var.f159578f.get());
                if (qug0Var.f159578f.get()) {
                    qug0Var.f159578f.set(false);
                    qug0Var.f159579g.removeCallbacks(qug0Var.f159581i);
                    hsp0 hsp0Var = qug0Var.f159580h;
                    if (hsp0Var != null) {
                        hsp0Var.close(1000, "destroy");
                        qug0Var.f159580h = null;
                    }
                }
                this.f88498C = null;
            }
            mkg0 mkg0Var = this.f88522v;
            if (mkg0Var != null && (baseRealSudASRImpl = mkg0Var.f137298a) != null) {
                baseRealSudASRImpl.stopASR(true);
            }
        }
        if (f88495G == this) {
            f88495G = null;
        }
        return true;
    }

    @Override // tech.sud.gip.core.ISudFSTAPP
    public final ISudAiAgent getAiAgent() {
        synchronized (this) {
            try {
                if (this.f88497B == null) {
                    rog0 rog0Var = new rog0();
                    this.f88497B = rog0Var;
                    xlg0 xlg0Var = this.f88499D;
                    if (xlg0Var != null) {
                        rog0Var.f164206m = xlg0Var.f194967a;
                        rog0Var.f164207n = xlg0Var.f194969c;
                    }
                    rog0Var.f164195b = this.f88505e;
                    rog0Var.f164196c = this.f88504d;
                    rog0Var.f164197d = this.f88503c;
                    SudLoadMGParamModel sudLoadMGParamModel = this.f88501a;
                    if (sudLoadMGParamModel != null) {
                        rog0Var.f164200g = sudLoadMGParamModel.language;
                    }
                    hkg0 hkg0Var = this.f88500E;
                    if (hkg0Var != null) {
                        rog0Var.f164208o = hkg0Var;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f88497B;
    }

    @Override // tech.sud.gip.core.ISudFSTAPP
    public final String getGameState(String str) {
        lug0 lug0Var;
        if (!ThreadUtils.checkUIThread()) {
            SudLogger.m222813e(f88494F, "Please call on UI or Main thread");
        }
        return (this.f88511k || (lug0Var = this.f88513m) == null) ? WeJson.EMPTY_MAP : lug0Var.getGameState(str);
    }

    @Override // tech.sud.gip.core.ISudFSTAPP
    public final View getGameView() {
        LogUtils.file("ProxySudFSTAPPImpl", "getGameView");
        return this.f88514n;
    }

    @Override // tech.sud.gip.core.ISudFSTAPP
    public final String getPlayerState(String str, String str2) {
        lug0 lug0Var;
        if (!ThreadUtils.checkUIThread()) {
            SudLogger.m222813e(f88494F, "Please call on UI or Main thread");
        }
        return (this.f88511k || (lug0Var = this.f88513m) == null) ? WeJson.EMPTY_MAP : lug0Var.getPlayerState(str, str2);
    }

    @Override // tech.sud.gip.core.ISudFSTAPP
    public final void notifyStateChange(String str, String str2, ISudListenerNotifyStateChange iSudListenerNotifyStateChange) {
        lug0 lug0Var;
        if (!ThreadUtils.checkUIThread()) {
            SudLogger.m222813e(f88494F, "Please call on UI or Main thread");
        }
        boolean z = this.f88511k;
        if (!z) {
            if (z || (lug0Var = this.f88513m) == null) {
                return;
            }
            lug0Var.notifyStateChange(str, str2, iSudListenerNotifyStateChange);
            return;
        }
        LogUtils.file("ProxySudFSTAPPImpl", "notifyStateChange 游戏已销毁 state:" + str + "  dataJson:" + str2);
        SudLogger.m222813e(f88494F, "This SudFSTAPP instance has been destroyed. Please attention");
        if (iSudListenerNotifyStateChange != null) {
            iSudListenerNotifyStateChange.onFailure(-1, "This SudFSTAPP instance has been destroyed. Please attention");
        }
    }

    @Override // tech.sud.gip.core.ISudFSTAPP
    public final void pauseMG() {
        lug0 lug0Var;
        LogUtils.file("ProxySudFSTAPPImpl", "pauseMG");
        if (!ThreadUtils.checkUIThread()) {
            SudLogger.m222813e(f88494F, "Please call on UI or Main thread");
        }
        if (!this.f88511k && (lug0Var = this.f88513m) != null) {
            lug0Var.pauseMG();
        }
        iug0 iug0Var = this.f88523w;
        iug0Var.getClass();
        ThreadUtils.getUIHandler().postDelayed(new qrg0(iug0Var), 1L);
    }

    @Override // tech.sud.gip.core.ISudFSTAPP
    public final void playMG() {
        lug0 lug0Var;
        LogUtils.file("ProxySudFSTAPPImpl", "playMG");
        if (!ThreadUtils.checkUIThread()) {
            SudLogger.m222813e(f88494F, "Please call on UI or Main thread");
        }
        if (!this.f88511k && (lug0Var = this.f88513m) != null) {
            lug0Var.playMG();
        }
        iug0 iug0Var = this.f88523w;
        iug0Var.getClass();
        ThreadUtils.getUIHandler().postDelayed(new fog0(iug0Var), 1L);
    }

    @Override // tech.sud.gip.core.ISudFSTAPP
    public final void pushAudio(ByteBuffer byteBuffer, int i) {
        mkg0 mkg0Var;
        BaseRealSudASRImpl baseRealSudASRImpl;
        if (this.f88511k || this.f88513m == null || byteBuffer == null || i <= 0 || (mkg0Var = this.f88522v) == null || (baseRealSudASRImpl = mkg0Var.f137298a) == null) {
            return;
        }
        baseRealSudASRImpl.pushAudio(byteBuffer, i);
    }

    @Override // tech.sud.gip.core.ISudFSTAPP
    public final void reloadMG() {
        LogUtils.file("ProxySudFSTAPPImpl", "reloadMG");
        if (!ThreadUtils.checkUIThread()) {
            SudLogger.m222813e(f88494F, "Please call on UI or Main thread");
        }
        if (arg0.f72934a.f152693b && this.f88509i) {
            this.f88523w.m142196h();
            m115799a();
            m115801c(this.f88507g);
        }
    }

    @Override // tech.sud.gip.core.ISudFSTAPP
    public final void startMG() {
        lug0 lug0Var;
        LogUtils.file("ProxySudFSTAPPImpl", "startMG");
        if (!ThreadUtils.checkUIThread()) {
            SudLogger.m222813e(f88494F, "Please call on UI or Main thread");
        }
        if (this.f88511k || (lug0Var = this.f88513m) == null) {
            return;
        }
        lug0Var.startMG();
    }

    @Override // tech.sud.gip.core.ISudFSTAPP
    public final void stopMG() {
        lug0 lug0Var;
        LogUtils.file("ProxySudFSTAPPImpl", "stopMG");
        if (!ThreadUtils.checkUIThread()) {
            SudLogger.m222813e(f88494F, "Please call on UI or Main thread");
        }
        if (this.f88511k || (lug0Var = this.f88513m) == null) {
            return;
        }
        lug0Var.stopMG();
    }

    @Override // tech.sud.gip.core.ISudFSTAPP
    public final void updateCode(String str, ISudListenerNotifyStateChange iSudListenerNotifyStateChange) {
        lug0 lug0Var;
        LogUtils.file("ProxySudFSTAPPImpl", "updateCode:" + str);
        if (!ThreadUtils.checkUIThread()) {
            SudLogger.m222813e(f88494F, "Please call on UI or Main thread");
        }
        if (this.f88511k || (lug0Var = this.f88513m) == null) {
            return;
        }
        lug0Var.updateCode(str, iSudListenerNotifyStateChange);
    }
}
