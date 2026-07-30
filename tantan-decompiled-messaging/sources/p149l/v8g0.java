package p149l;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.p046p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.state.SudMGPMGState;
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
public final class v8g0 implements ISudFSTAPP, crg0 {

    /* JADX INFO: renamed from: F */
    public static final String f180492F = "SudGIP ".concat(v8g0.class.getSimpleName());

    /* JADX INFO: renamed from: G */
    public static v8g0 f180493G;

    /* JADX INFO: renamed from: A */
    public boolean f180494A;

    /* JADX INFO: renamed from: B */
    public jgg0 f180495B;

    /* JADX INFO: renamed from: C */
    public img0 f180496C;

    /* JADX INFO: renamed from: D */
    public pdg0 f180497D;

    /* JADX INFO: renamed from: E */
    public zbg0 f180498E;

    /* JADX INFO: renamed from: a */
    public final SudLoadMGParamModel f180499a;

    /* JADX INFO: renamed from: b */
    public final Activity f180500b;

    /* JADX INFO: renamed from: c */
    public final String f180501c;

    /* JADX INFO: renamed from: d */
    public final String f180502d;

    /* JADX INFO: renamed from: e */
    public final long f180503e;

    /* JADX INFO: renamed from: f */
    public final ISudFSMMG f180504f;

    /* JADX INFO: renamed from: g */
    public GameInfo f180505g;

    /* JADX INFO: renamed from: h */
    public final Context f180506h;

    /* JADX INFO: renamed from: i */
    public boolean f180507i = false;

    /* JADX INFO: renamed from: j */
    public boolean f180508j = false;

    /* JADX INFO: renamed from: k */
    public boolean f180509k = false;

    /* JADX INFO: renamed from: l */
    public boolean f180510l = true;

    /* JADX INFO: renamed from: m */
    public dmg0 f180511m;

    /* JADX INFO: renamed from: n */
    public final SudGameView f180512n;

    /* JADX INFO: renamed from: o */
    public ylg0 f180513o;

    /* JADX INFO: renamed from: p */
    public t7g0 f180514p;

    /* JADX INFO: renamed from: q */
    public View f180515q;

    /* JADX INFO: renamed from: r */
    public final cjg0 f180516r;

    /* JADX INFO: renamed from: s */
    public final sfg0 f180517s;

    /* JADX INFO: renamed from: t */
    public final t6g0 f180518t;

    /* JADX INFO: renamed from: u */
    public final oqg0 f180519u;

    /* JADX INFO: renamed from: v */
    public ecg0 f180520v;

    /* JADX INFO: renamed from: w */
    public final amg0 f180521w;

    /* JADX INFO: renamed from: x */
    public GameInfo f180522x;

    /* JADX INFO: renamed from: y */
    public String f180523y;

    /* JADX INFO: renamed from: z */
    public ArrayList f180524z;

    public v8g0(SudLoadMGParamModel sudLoadMGParamModel, ISudFSMMG iSudFSMMG) {
        amg0 amg0Var = new amg0(this);
        this.f180521w = amg0Var;
        LogUtils.file("ProxySudFSTAPPImpl", "初始化" + LogUtils.buildField("userId", sudLoadMGParamModel.userId) + LogUtils.buildField("roomId", sudLoadMGParamModel.roomId) + LogUtils.buildField("code", sudLoadMGParamModel.code) + LogUtils.buildField("mgId", Long.valueOf(sudLoadMGParamModel.mgId)) + LogUtils.buildField(IjkMediaMeta.IJKM_KEY_LANGUAGE, sudLoadMGParamModel.language));
        if (f180493G != null) {
            LogUtils.file("ProxySudFSTAPPImpl", "Hey, guy! You not hold or call the destroyMG, but the instance will be dealloc. Please check it!");
            SudLogger.m221565d(f180492F, "Hey, guy! You not hold or call the destroyMG, but the instance will be dealloc. Please check it!");
            f180493G.destroyMG();
        }
        f180493G = this;
        this.f180499a = sudLoadMGParamModel;
        Activity activity = sudLoadMGParamModel.activity;
        this.f180500b = activity;
        String str = sudLoadMGParamModel.userId;
        this.f180501c = str;
        String str2 = sudLoadMGParamModel.roomId;
        this.f180502d = str2;
        String str3 = sudLoadMGParamModel.code;
        long j = sudLoadMGParamModel.mgId;
        this.f180503e = j;
        this.f180504f = iSudFSMMG;
        Context applicationContext = activity.getApplicationContext();
        this.f180506h = applicationContext;
        amg0Var.f70618s = activity;
        GameInfo gameInfo = new GameInfo();
        this.f180505g = gameInfo;
        gameInfo.mgId = sudLoadMGParamModel.mgId;
        SudGameView sudGameView = new SudGameView(activity);
        sudGameView.setLifecycleListener(new rbg0(this));
        this.f180512n = sudGameView;
        long j2 = sudLoadMGParamModel.mgId;
        String str4 = xlg0.f193417a;
        xlg0.f193420d.put(String.valueOf(j2), yog0.m215499b(UUID.randomUUID().toString()));
        if (vcg0.f180926c == null) {
            vcg0.f180926c = new vcg0(applicationContext);
        }
        this.f180516r = new cjg0(this);
        this.f180517s = new sfg0(this);
        t6g0 t6g0Var = new t6g0(this, this);
        this.f180518t = t6g0Var;
        oqg0 oqg0Var = new oqg0(applicationContext);
        this.f180519u = oqg0Var;
        if (iSudFSMMG == null) {
            SudLogger.m221573w(oqg0.f145137n, "fsmMg2App is null");
        } else {
            oqg0Var.f145140c = new WeakReference(iSudFSMMG);
            oqg0Var.f145141d = str;
            oqg0Var.f145142e = str2;
            oqg0Var.f145143f = str3;
            oqg0Var.f145144g = j;
            oqg0Var.f145147j.clear();
            oqg0Var.f145148k.clear();
            oqg0Var.f145149l.clear();
            oqg0Var.f145138a.clear();
            oqg0Var.f145138a.put("m2as-set-debug", new jng0());
            oqg0Var.f145138a.put("m2as-mg-log", new yrg0(oqg0Var));
            oqg0Var.f145138a.put("m2as-get-net-status", new e6g0(oqg0Var));
            oqg0Var.f145138a.put("m2as-get-game-view-info", new m8g0(oqg0Var));
            oqg0Var.f145138a.put("m2as-get-game-cfg", new m9g0(oqg0Var));
            oqg0Var.f145138a.put("m2as-login", new q9g0(oqg0Var));
            oqg0Var.f145138a.put("m2as-expire-code", new peg0(oqg0Var));
            oqg0Var.f145138a.put("m2as-vibrate", new weg0(oqg0Var));
            oqg0Var.f145138a.put("m2as-get-sdk-info", new jpg0(oqg0Var));
            oqg0Var.f145138a.put("m2as-get-state", new kkg0(oqg0Var));
            oqg0Var.f145138a.put("m2as-notify-game-load-started", new pgg0(oqg0Var));
            oqg0Var.f145138a.put("m2as-notify-game-load-completed", new omg0(oqg0Var));
            oqg0Var.f145138a.put("m2as-notify-game-started", new rog0(oqg0Var));
            oqg0Var.f145138a.put(SudMGPMGState.MG_COMMON_GAME_ASR, new chg0(oqg0Var));
            oqg0Var.f145138a.put("mg_common_game_load_percent", new irg0(oqg0Var));
            oqg0Var.f145138a.put("mg_common_game_reload", new b7g0(oqg0Var));
            oqg0Var.f145138a.put("m2as-ai-common", new v7g0(oqg0Var));
            oqg0Var.f145138a.put("m2as-ai-sse", new y8g0(oqg0Var));
            oqg0Var.f145138a.put("mg_common_game_player_self_info", new zdg0(oqg0Var));
            oqg0Var.f145138a.put("mg_common_game_llm_asr", new lqg0(oqg0Var));
        }
        oqg0Var.f145150m = t6g0Var;
        m197442c(this.f180505g);
    }

    /* JADX INFO: renamed from: a */
    public final void m197440a() {
        dmg0 dmg0Var;
        if (this.f180514p != null) {
            if (this.f180505g != null && (dmg0Var = this.f180511m) != null) {
                if (dmg0Var instanceof tcg0) {
                } else if (dmg0Var instanceof scg0) {
                }
            }
            this.f180512n.removeView(this.f180515q);
            this.f180514p = null;
            this.f180515q = null;
        }
        ylg0 ylg0Var = this.f180513o;
        if (ylg0Var != null) {
            String str = ylg0.f198884i;
            SudLogger.m221571v(str, "stop loading");
            ylg0Var.f198889e = null;
            if (ylg0Var.f198891g < ylg0Var.f198888d.size()) {
                ((tbg0) ylg0Var.f198888d.get(ylg0Var.f198891g)).cancel();
                ylg0Var.f198891g = 0;
                LogUtils.file("SudGameLoadingModel", "loading canceled");
                SudLogger.m221565d(str, "loading canceled");
            } else if (ylg0Var.f198892h != null) {
                LogUtils.file("SudGameLoadingModel", "loading done");
                SudLogger.m221565d(str, "loading done");
                ylg0Var.f198892h.getClass();
            }
            this.f180513o = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m197441b(int i, int i2, int i3, boolean z) {
        String str = "onGameLoadingProgress stage:" + i + "  retCode:" + i2 + "  progress:" + i3;
        LogUtils.file("ProxySudFSTAPPImpl", str);
        SudLogger.m221569i(f180492F, str);
        amg0 amg0Var = this.f180521w;
        amg0Var.getClass();
        if (i2 == 0 && !z) {
            amg0Var.f70613n = i3;
            amg0Var.f70611l.reset();
            amg0Var.f70611l.start();
        }
        ISudFSMMG iSudFSMMG = this.f180504f;
        if (iSudFSMMG != null) {
            iSudFSMMG.onGameLoadingProgress(i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m197442c(GameInfo gameInfo) {
        LogUtils.file("ProxySudFSTAPPImpl", "_loadGame");
        String str = f180492F;
        SudLogger.m221565d(str, "_loadGame");
        this.f180507i = false;
        this.f180510l = true;
        amg0 amg0Var = this.f180521w;
        amg0Var.getClass();
        LogUtils.file("LoadGameStatsManager", "startLoad:" + gameInfo.mgId);
        mcg0 mcg0Var = new mcg0("loadGameFinished");
        amg0Var.f70600a = mcg0Var;
        mcg0Var.f133123m = 0;
        amg0Var.f70601b = new ArrayList();
        mcg0 mcg0Var2 = amg0Var.f70600a;
        Boolean bool = Boolean.TRUE;
        mcg0Var2.f133122l = bool;
        mcg0Var2.f133121k = bool;
        mcg0Var2.f133117g = String.valueOf(gameInfo.mgId);
        amg0Var.f70615p = gameInfo.mgId;
        amg0Var.f70602c = System.nanoTime() / 1000000;
        amg0Var.m97554a();
        amg0Var.f70609j.reset();
        amg0Var.f70610k.reset();
        amg0Var.f70611l.reset();
        amg0Var.f70611l.start();
        amg0Var.f70606g = false;
        amg0Var.f70608i = false;
        amg0Var.f70607h = false;
        amg0Var.f70605f = false;
        amg0Var.f70603d = null;
        amg0Var.f70612m.clear();
        amg0Var.f70614o = false;
        amg0Var.f70613n = 0;
        this.f180514p = new t7g0(this.f180500b);
        Activity activity = this.f180500b;
        SudLoadMGParamModel sudLoadMGParamModel = this.f180499a;
        ylg0 ylg0Var = new ylg0(activity, sudLoadMGParamModel, sudLoadMGParamModel.loadMGMode, sudLoadMGParamModel.authorizationSecret, this.f180516r);
        this.f180513o = ylg0Var;
        t7g0 t7g0Var = this.f180514p;
        View view = t7g0Var.f168720f;
        this.f180515q = view;
        t7g0Var.f143311a = this.f180517s;
        ylg0Var.f198892h = t7g0Var;
        this.f180512n.addView(view);
        sfg0 sfg0Var = this.f180514p.f143311a;
        sfg0Var.getClass();
        LogUtils.file("ProxySudFSTAPPImpl", "onLoadingStart");
        SudLogger.m221565d(str, "onLoadingStart");
        ylg0 ylg0Var2 = sfg0Var.f164291a.f180513o;
        ylg0Var2.getClass();
        SudLogger.m221571v(ylg0.f198884i, "start loading");
        ylg0Var2.f198889e = gameInfo;
        t7g0 t7g0Var2 = ylg0Var2.f198892h;
        if (t7g0Var2 != null) {
            t7g0Var2.f168717c = 10;
            t7g0Var2.f168723i.setProgress(10);
            t7g0Var2.f168727m.setVisibility(0);
            if (!fcg0.f96796a || t7g0Var2.f168733s) {
                t7g0Var2.f168725k.setVisibility(4);
            } else {
                t7g0Var2.f168725k.setVisibility(0);
            }
            t7g0Var2.f143311a.f164291a.m197441b(1, 0, t7g0Var2.f168717c, false);
            t7g0Var2.m187462g();
            t7g0Var2.m187456a();
            t7g0Var2.m187458c(0, true, t7g0Var2.f168717c, false);
            t7g0Var2.f168721g.setVisibility(4);
        }
        int i = ylg0Var2.f198891g;
        if (i != 0 && i < ylg0Var2.f198888d.size()) {
            ((tbg0) ylg0Var2.f198888d.get(ylg0Var2.f198891g)).cancel();
        }
        ylg0Var2.f198891g = 0;
        ((tbg0) ylg0Var2.f198888d.get(0)).mo149032a(ylg0Var2.f198889e, ylg0Var2.f198886b, ylg0Var2.f198887c);
    }

    @Override // tech.sud.gip.core.ISudFSTAPP
    public final boolean destroyMG() {
        BaseRealSudASRImpl baseRealSudASRImpl;
        String str = f180492F;
        SudLogger.m221569i(str, "destroyMG");
        LogUtils.file("ProxySudFSTAPPImpl", "destroyMG");
        if (!this.f180509k) {
            this.f180509k = true;
            LogUtils.file("ProxySudFSTAPPImpl", "_destroyMGInternal");
            SudLogger.m221565d(str, "_destroyMGInternal");
            amg0 amg0Var = this.f180521w;
            amg0Var.f70608i = true;
            amg0Var.f70609j.stop();
            amg0Var.f70610k.stop();
            amg0Var.f70611l.stop();
            amg0Var.m97554a();
            mcg0 mcg0Var = amg0Var.f70600a;
            if (mcg0Var != null) {
                mcg0Var.f133115e = -10301;
            }
            if (mcg0Var != null) {
                mcg0Var.f133116f = "销毁游戏";
            }
            amg0Var.m97561h();
            m197440a();
            dmg0 dmg0Var = this.f180511m;
            if (dmg0Var != null) {
                dmg0Var.destroyMG();
                this.f180511m = null;
            }
            xlg0.f193420d.remove(String.valueOf(this.f180503e));
            jgg0 jgg0Var = this.f180495B;
            if (jgg0Var != null) {
                jgg0Var.m141290a();
                this.f180495B = null;
            }
            img0 img0Var = this.f180496C;
            if (img0Var != null) {
                SudLogger.m221565d(img0Var.f113927a, "destroy isRunning:" + img0Var.f113932f.get());
                LogUtils.file("SudGIPWebSocket", "destroy isRunning:" + img0Var.f113932f.get());
                if (img0Var.f113932f.get()) {
                    img0Var.f113932f.set(false);
                    img0Var.f113933g.removeCallbacks(img0Var.f113935i);
                    cjp0 cjp0Var = img0Var.f113934h;
                    if (cjp0Var != null) {
                        cjp0Var.close(1000, "destroy");
                        img0Var.f113934h = null;
                    }
                }
                this.f180496C = null;
            }
            ecg0 ecg0Var = this.f180520v;
            if (ecg0Var != null && (baseRealSudASRImpl = ecg0Var.f90501a) != null) {
                baseRealSudASRImpl.stopASR(true);
            }
        }
        if (f180493G == this) {
            f180493G = null;
        }
        return true;
    }

    @Override // tech.sud.gip.core.ISudFSTAPP
    public final ISudAiAgent getAiAgent() {
        synchronized (this) {
            try {
                if (this.f180495B == null) {
                    jgg0 jgg0Var = new jgg0();
                    this.f180495B = jgg0Var;
                    pdg0 pdg0Var = this.f180497D;
                    if (pdg0Var != null) {
                        jgg0Var.f117788m = pdg0Var.f148301a;
                        jgg0Var.f117789n = pdg0Var.f148303c;
                    }
                    jgg0Var.f117777b = this.f180503e;
                    jgg0Var.f117778c = this.f180502d;
                    jgg0Var.f117779d = this.f180501c;
                    SudLoadMGParamModel sudLoadMGParamModel = this.f180499a;
                    if (sudLoadMGParamModel != null) {
                        jgg0Var.f117782g = sudLoadMGParamModel.language;
                    }
                    zbg0 zbg0Var = this.f180498E;
                    if (zbg0Var != null) {
                        jgg0Var.f117790o = zbg0Var;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f180495B;
    }

    @Override // tech.sud.gip.core.ISudFSTAPP
    public final String getGameState(String str) {
        dmg0 dmg0Var;
        if (!ThreadUtils.checkUIThread()) {
            SudLogger.m221567e(f180492F, "Please call on UI or Main thread");
        }
        return (this.f180509k || (dmg0Var = this.f180511m) == null) ? WeJson.EMPTY_MAP : dmg0Var.getGameState(str);
    }

    @Override // tech.sud.gip.core.ISudFSTAPP
    public final View getGameView() {
        LogUtils.file("ProxySudFSTAPPImpl", "getGameView");
        return this.f180512n;
    }

    @Override // tech.sud.gip.core.ISudFSTAPP
    public final String getPlayerState(String str, String str2) {
        dmg0 dmg0Var;
        if (!ThreadUtils.checkUIThread()) {
            SudLogger.m221567e(f180492F, "Please call on UI or Main thread");
        }
        return (this.f180509k || (dmg0Var = this.f180511m) == null) ? WeJson.EMPTY_MAP : dmg0Var.getPlayerState(str, str2);
    }

    @Override // tech.sud.gip.core.ISudFSTAPP
    public final void notifyStateChange(String str, String str2, ISudListenerNotifyStateChange iSudListenerNotifyStateChange) {
        dmg0 dmg0Var;
        if (!ThreadUtils.checkUIThread()) {
            SudLogger.m221567e(f180492F, "Please call on UI or Main thread");
        }
        boolean z = this.f180509k;
        if (!z) {
            if (z || (dmg0Var = this.f180511m) == null) {
                return;
            }
            dmg0Var.notifyStateChange(str, str2, iSudListenerNotifyStateChange);
            return;
        }
        LogUtils.file("ProxySudFSTAPPImpl", "notifyStateChange 游戏已销毁 state:" + str + "  dataJson:" + str2);
        SudLogger.m221567e(f180492F, "This SudFSTAPP instance has been destroyed. Please attention");
        if (iSudListenerNotifyStateChange != null) {
            iSudListenerNotifyStateChange.onFailure(-1, "This SudFSTAPP instance has been destroyed. Please attention");
        }
    }

    @Override // tech.sud.gip.core.ISudFSTAPP
    public final void pauseMG() {
        dmg0 dmg0Var;
        LogUtils.file("ProxySudFSTAPPImpl", "pauseMG");
        if (!ThreadUtils.checkUIThread()) {
            SudLogger.m221567e(f180492F, "Please call on UI or Main thread");
        }
        if (!this.f180509k && (dmg0Var = this.f180511m) != null) {
            dmg0Var.pauseMG();
        }
        amg0 amg0Var = this.f180521w;
        amg0Var.getClass();
        ThreadUtils.getUIHandler().postDelayed(new ijg0(amg0Var), 1L);
    }

    @Override // tech.sud.gip.core.ISudFSTAPP
    public final void playMG() {
        dmg0 dmg0Var;
        LogUtils.file("ProxySudFSTAPPImpl", "playMG");
        if (!ThreadUtils.checkUIThread()) {
            SudLogger.m221567e(f180492F, "Please call on UI or Main thread");
        }
        if (!this.f180509k && (dmg0Var = this.f180511m) != null) {
            dmg0Var.playMG();
        }
        amg0 amg0Var = this.f180521w;
        amg0Var.getClass();
        ThreadUtils.getUIHandler().postDelayed(new xfg0(amg0Var), 1L);
    }

    @Override // tech.sud.gip.core.ISudFSTAPP
    public final void pushAudio(ByteBuffer byteBuffer, int i) {
        ecg0 ecg0Var;
        BaseRealSudASRImpl baseRealSudASRImpl;
        if (this.f180509k || this.f180511m == null || byteBuffer == null || i <= 0 || (ecg0Var = this.f180520v) == null || (baseRealSudASRImpl = ecg0Var.f90501a) == null) {
            return;
        }
        baseRealSudASRImpl.pushAudio(byteBuffer, i);
    }

    @Override // tech.sud.gip.core.ISudFSTAPP
    public final void reloadMG() {
        LogUtils.file("ProxySudFSTAPPImpl", "reloadMG");
        if (!ThreadUtils.checkUIThread()) {
            SudLogger.m221567e(f180492F, "Please call on UI or Main thread");
        }
        if (sig0.f164716a.f106931b && this.f180507i) {
            this.f180521w.m97561h();
            m197440a();
            m197442c(this.f180505g);
        }
    }

    @Override // tech.sud.gip.core.ISudFSTAPP
    public final void startMG() {
        dmg0 dmg0Var;
        LogUtils.file("ProxySudFSTAPPImpl", "startMG");
        if (!ThreadUtils.checkUIThread()) {
            SudLogger.m221567e(f180492F, "Please call on UI or Main thread");
        }
        if (this.f180509k || (dmg0Var = this.f180511m) == null) {
            return;
        }
        dmg0Var.startMG();
    }

    @Override // tech.sud.gip.core.ISudFSTAPP
    public final void stopMG() {
        dmg0 dmg0Var;
        LogUtils.file("ProxySudFSTAPPImpl", "stopMG");
        if (!ThreadUtils.checkUIThread()) {
            SudLogger.m221567e(f180492F, "Please call on UI or Main thread");
        }
        if (this.f180509k || (dmg0Var = this.f180511m) == null) {
            return;
        }
        dmg0Var.stopMG();
    }

    @Override // tech.sud.gip.core.ISudFSTAPP
    public final void updateCode(String str, ISudListenerNotifyStateChange iSudListenerNotifyStateChange) {
        dmg0 dmg0Var;
        LogUtils.file("ProxySudFSTAPPImpl", "updateCode:" + str);
        if (!ThreadUtils.checkUIThread()) {
            SudLogger.m221567e(f180492F, "Please call on UI or Main thread");
        }
        if (this.f180509k || (dmg0Var = this.f180511m) == null) {
            return;
        }
        dmg0Var.updateCode(str, iSudListenerNotifyStateChange);
    }
}
