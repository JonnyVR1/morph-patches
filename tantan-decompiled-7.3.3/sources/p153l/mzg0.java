package p153l;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import com.cosmos.photon.push.service.PushService;
import com.p051p1.mobile.putong.live.base.data.BLivePkInviteSource;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.core.GameInfo;
import tech.sud.gip.core.ISudCfg;
import tech.sud.gip.core.ISudFSMMG;
import tech.sud.gip.core.ISudListenerNotifyStateChange;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;
import tech.sud.runtime.p141a.C22517c;
import tech.sud.runtime.p141a.InterfaceC22515a;

/* JADX INFO: loaded from: classes.dex */
public final class mzg0 extends lug0 {

    /* JADX INFO: renamed from: k */
    public static final String f139506k = "SudGIP ".concat(mzg0.class.getSimpleName());

    /* JADX INFO: renamed from: l */
    public static final ExecutorService f139507l = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: m */
    public static boolean f139508m;

    /* JADX INFO: renamed from: a */
    public final Activity f139509a;

    /* JADX INFO: renamed from: b */
    public final FrameLayout f139510b;

    /* JADX INFO: renamed from: c */
    public final String f139511c;

    /* JADX INFO: renamed from: d */
    public final long f139512d;

    /* JADX INFO: renamed from: e */
    public pgg0 f139513e;

    /* JADX INFO: renamed from: g */
    public final gsg0 f139515g;

    /* JADX INFO: renamed from: h */
    public final slg0 f139516h;

    /* JADX INFO: renamed from: i */
    public iog0 f139517i;

    /* JADX INFO: renamed from: j */
    public boolean f139518j = false;

    /* JADX INFO: renamed from: f */
    public final qkg0 f139514f = new qkg0(this);

    static {
        try {
            twg0 twg0Var = new twg0();
            pgg0.f152260C = twg0Var;
            ysg0.f201404a = twg0Var;
        } catch (Throwable th) {
            th.printStackTrace();
            LogUtils.file("SUDRealSudFSTAPPImpl", "初始化引擎的日志监听发生了异常：" + LogUtils.getErrorInfo(th));
        }
    }

    public mzg0(Activity activity, String str, long j, FrameLayout frameLayout, wyg0 wyg0Var) {
        this.f139509a = activity;
        this.f139510b = frameLayout;
        this.f139511c = str;
        this.f139512d = j;
        this.f139516h = wyg0Var;
        this.f139515g = new gsg0(wyg0Var);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m160909d(ISudListenerNotifyStateChange iSudListenerNotifyStateChange, JSONArray jSONArray) {
        if (iSudListenerNotifyStateChange != null) {
            if (jSONArray.length() <= 0) {
                iSudListenerNotifyStateChange.onSuccess(WeJson.EMPTY_MAP);
                return;
            }
            try {
                iSudListenerNotifyStateChange.onSuccess(jSONArray.getString(0));
            } catch (Exception e) {
                iSudListenerNotifyStateChange.onFailure(-1, e.toString());
            }
        }
    }

    @Override // p153l.lug0
    /* JADX INFO: renamed from: a */
    public final void mo155926a(iog0 iog0Var) {
        this.f139517i = iog0Var;
    }

    @Override // p153l.lug0
    /* JADX INFO: renamed from: b */
    public final void mo155927b(GameInfo gameInfo, String str) {
        String string;
        geg0 geg0Var;
        LogUtils.file("SUDRealSudFSTAPPImpl", "_startGame");
        String str2 = f139506k;
        SudLogger.m222811d(str2, "_startGame");
        if (this.f139518j) {
            return;
        }
        pgg0 pgg0Var = new pgg0(this.f139509a);
        this.f139513e = pgg0Var;
        pgg0Var.m172231b("custom.CustomCommand", new nug0(this.f139515g));
        pgg0 pgg0Var2 = this.f139513e;
        pgg0Var2.f152271h = this.f139514f;
        this.f139510b.addView(pgg0Var2.f152273j, 0, new FrameLayout.LayoutParams(-1, -1));
        yxg0 yxg0Var = this.f139513e.f152264a;
        if (yxg0Var == null || !yxg0Var.m217715c()) {
            LogUtils.file("SUDRealSudFSTAPPImpl", "error _startGame This device does not support OpenGL ES 2.0.");
            SudLogger.m222813e(str2, "_startGame This device does not support OpenGL ES 2.0.");
            return;
        }
        pgg0 pgg0Var3 = this.f139513e;
        pgg0Var3.f152277n = "";
        pgg0Var3.f152286w = false;
        pgg0Var3.f152285v = false;
        pgg0Var3.f152284u = true;
        if (nkg0.f142458a) {
            pgg0Var3.f152278o = true;
            pgg0Var3.f152280q = "";
            pgg0Var3.f152283t = true;
        } else {
            pgg0Var3.f152278o = false;
            pgg0Var3.f152280q = "";
            pgg0Var3.f152283t = false;
        }
        pjg0 pjg0Var = arg0.f72934a;
        pgg0Var3.f152262A = "true".equals(pjg0Var.f152695d.get(ISudCfg.DISABLE_AUDIO_FOCUS));
        String str3 = (String) pjg0Var.f152695d.get(ISudCfg.KEYBOARD_BOTTOM_OFFSET);
        if (str3 != null) {
            try {
                this.f139513e.f152263B = Integer.valueOf(Integer.parseInt(str3));
            } catch (Exception e) {
                LogUtils.file("SUDRealSudFSTAPPImpl", LogUtils.getErrorInfo(e));
            }
        }
        pgg0 pgg0Var4 = this.f139513e;
        pgg0Var4.f152288y = "local_storage.db";
        pgg0Var4.f152282s = "SudPlugin";
        zhg0 zhg0Var = new zhg0();
        Locale locale = Locale.US;
        String absolutePath = new File(this.f139509a.getFilesDir(), "sud/mgp/user/" + this.f139511c + "/" + gameInfo.mgId + "/data").getAbsolutePath();
        pgg0 pgg0Var5 = this.f139513e;
        String str4 = this.f139511c;
        String strValueOf = String.valueOf(gameInfo.mgId);
        yxg0 yxg0Var2 = pgg0Var5.f152264a;
        if (yxg0Var2 != null) {
            if (pgg0Var5.f152275l) {
                ysg0.m217257c("WXGame", "Game.start called more than once, skipped.");
            } else {
                pgg0Var5.f152275l = true;
                try {
                    int i = pgg0Var5.f152289z;
                    if (i == 6 || i == 8 || i == 0 || i == 1) {
                        yxg0Var2.m217713a("defaultOrientation", "1");
                    }
                    String str5 = str4 + "_" + strValueOf;
                    if (absolutePath == null || absolutePath.length() == 0) {
                        absolutePath = "{{USER_ID}}/{{GAME_ID}}";
                    }
                    if (!new File(absolutePath).isAbsolute()) {
                        absolutePath = new File(pgg0Var5.f152265b.getFilesDir(), absolutePath).getAbsolutePath();
                    }
                    if (!absolutePath.contains("{{USER_ID}}") && !absolutePath.contains("{{GAME_ID}}")) {
                        absolutePath = new File(absolutePath, "{{USER_ID}}/{{GAME_ID}}").getAbsolutePath();
                    }
                    String strReplace = absolutePath.replace("{{USER_ID}}", str4).replace("{{GAME_ID}}", strValueOf);
                    yxg0 yxg0Var3 = pgg0Var5.f152264a;
                    sxg0 sxg0Var = yxg0Var3.f201970b;
                    sxg0Var.f171134c = strReplace;
                    sxg0Var.f171132a = pgg0Var5.f152278o;
                    yxg0Var3.m217713a("runtime.mode", "" + pgg0Var5.f152279p);
                    pgg0Var5.f152264a.m217713a("runtime.LoadPath", pgg0Var5.f152277n);
                    yxg0 yxg0Var4 = pgg0Var5.f152264a;
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (zhg0Var.f204414a == 0) {
                            zhg0Var.f204414a = 1001L;
                        }
                        jSONObject.put("scene", zhg0Var.f204414a);
                        String str6 = zhg0Var.f204415b;
                        if (str6 == null || str6.length() == 0) {
                            zhg0Var.f204415b = WeJson.EMPTY_MAP;
                        }
                        jSONObject.put(BLivePkInviteSource.query, zhg0Var.f204415b);
                        jSONObject.put("shareTicket", "");
                        jSONObject.put("referrerInfo", new JSONObject());
                        string = jSONObject.toString();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        string = WeJson.EMPTY_MAP;
                    }
                    yxg0Var4.m217713a("wx.launchOptions", string);
                    pgg0Var5.f152264a.m217713a("wx.packHost", pgg0Var5.f152280q);
                    pgg0Var5.f152264a.m217713a("wx.packExt", pgg0Var5.f152281r);
                    pgg0Var5.f152264a.m217713a("wx.pluginPath", pgg0Var5.f152282s);
                    pgg0Var5.f152264a.m217713a("wx.identification", str5);
                    pgg0Var5.f152264a.m217713a("wx.gameId", strValueOf);
                    pgg0Var5.f152264a.m217713a("wx.userId", str4);
                    pgg0Var5.f152264a.m217713a("systemLanguage", pgg0Var5.f152287x);
                    pgg0Var5.f152264a.m217713a("disableAudioFocus", pgg0Var5.f152262A ? "true" : "false");
                    if (pgg0Var5.f152263B != null) {
                        pgg0Var5.f152264a.m217713a("keyboardBottomOffset", pgg0Var5.f152263B + "");
                    }
                    if (!pgg0Var5.f152284u) {
                        pgg0Var5.f152264a.m217713a("jsConsole.noLogcat", "1");
                    }
                    String str7 = pgg0Var5.f152288y;
                    if (str7 != null) {
                        pgg0Var5.f152264a.m217713a("localStorageDb", str7.replace("{{USER_ID}}", str4).replace("{{GAME_ID}}", strValueOf));
                    }
                    if (pgg0Var5.f152283t) {
                        pgg0Var5.f152264a.m217713a("jsConsole", "1");
                        pgg0Var5.f152264a.m217713a("jsConsole.autoCreate", "0");
                    }
                    if (!pgg0Var5.f152286w) {
                        pgg0Var5.f152264a.m217713a("sysUIVis", "0");
                    }
                    if (!pgg0Var5.f152285v) {
                        pgg0Var5.f152264a.m217713a("activityLifecycle", "0");
                    }
                    yxg0 yxg0Var5 = pgg0Var5.f152264a;
                    HashMap map = yxg0Var5.f201973e;
                    HashMap<String, String> map2 = map == null ? new HashMap<>() : (HashMap) map.clone();
                    map2.put("Entry", str);
                    yxg0Var5.f201970b.getClass();
                    map2.put("loadingTimeout", "0");
                    if (yxg0Var5.f201970b.f171132a) {
                        map2.put("fps.show", "true");
                        yxg0Var5.f201970b.getClass();
                        Long l2 = 30L;
                        map2.put("fps.logTime", l2.toString());
                    }
                    map2.put("nativeRender", yxg0Var5.f201970b.f171133b ? "NO" : "YES");
                    yxg0Var5.f201970b.getClass();
                    map2.put("nativeGLBatch", "NO");
                    map2.put("cachePath", yxg0Var5.f201970b.f171134c);
                    map2.put("preloadPath", yxg0Var5.f201970b.f171135d);
                    yxg0Var5.f201970b.getClass();
                    map2.put("transparent", "0");
                    map2.put("immersiveMode", yxg0Var5.f201970b.f171136e ? "1" : "0");
                    map2.put("useCutout", yxg0Var5.f201970b.f171137f ? "1" : "0");
                    yxg0Var5.f201970b.getClass();
                    map2.put("enableOrientation", "0");
                    ysg0.m217257c("SudNative", "NativePlayerFactory precreate");
                    try {
                        yxg0Var5.f201971c = new C22517c();
                    } catch (Exception e3) {
                        e3.printStackTrace();
                        ysg0.m217257c("SudNative", "NativePlayerFactory CreatePlayer error:" + ysg0.m217255a(e3));
                    }
                    if (yxg0Var5.f201971c == null) {
                        ysg0.m217256b("Unable to create player object.");
                    } else {
                        if (yxg0.f201968h == null && yxg0Var5.f201974f != null) {
                            synchronized (yxg0.class) {
                                try {
                                    if (yxg0.f201968h == null && (geg0Var = yxg0Var5.f201974f) != null) {
                                        yxg0.f201968h = geg0Var;
                                        yxg0Var5.f201971c.mo222832a(geg0Var);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        yxg0Var5.f201971c.mo222828a(yxg0Var5.f201969a, map2);
                        String[] strArrMo222838e = yxg0Var5.f201971c.mo222838e();
                        if (strArrMo222838e.length >= 2 && strArrMo222838e[0].equals(strArrMo222838e[1])) {
                            String str8 = strArrMo222838e[0];
                            yxg0Var5.f201970b.getClass();
                            for (Map.Entry entry : yxg0Var5.f201975g.entrySet()) {
                                yxg0Var5.f201971c.mo222831a((String) entry.getKey(), (InterfaceC22515a.a) entry.getValue());
                            }
                            yxg0Var5.f201975g.clear();
                            yxg0Var5.f201972d = true;
                            FrameLayout frameLayout = pgg0Var5.f152273j;
                            C22517c c22517c = pgg0Var5.f152264a.f201971c;
                            frameLayout.addView(c22517c == null ? null : (FrameLayout) c22517c.mo222827a(), -1, new FrameLayout.LayoutParams(-1, -1));
                            if (pgg0Var5.f152276m == null) {
                                pgg0Var5.f152276m = new FrameLayout(pgg0Var5.f152265b);
                            }
                            pgg0Var5.f152273j.addView(pgg0Var5.f152276m, new FrameLayout.LayoutParams(-1, -1));
                            pgg0Var5.f152273j.addView(pgg0Var5.f152274k, new FrameLayout.LayoutParams(-1, -1));
                            if (pgg0Var5.f152270g == null) {
                                pgg0Var5.f152270g = new sig0(pgg0Var5.f152265b, pgg0Var5);
                            }
                            if (pgg0Var5.f152283t) {
                                yxg0 yxg0Var6 = pgg0Var5.f152264a;
                                FrameLayout frameLayout2 = pgg0Var5.f152273j;
                                C22517c c22517c2 = yxg0Var6.f201971c;
                                if (c22517c2 == null) {
                                    return;
                                }
                                c22517c2.mo222829a(frameLayout2);
                                return;
                            }
                            return;
                        }
                        for (int i2 = 0; i2 < strArrMo222838e.length; i2++) {
                            ysg0.m217256b("index:" + i2 + "  version:" + strArrMo222838e[i2]);
                        }
                        ysg0.m217256b("Versions of jar and so are different.");
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                    ysg0.m217257c("WXGame", "read game.json failed");
                }
            }
        }
        LogUtils.file("SUDRealSudFSTAPPImpl", "error _game->start failed.");
        SudLogger.m222813e(f139506k, "_game->start failed.");
    }

    @Override // p153l.lug0
    /* JADX INFO: renamed from: c */
    public final void mo155928c(GameInfo gameInfo, String str) {
        if (this.f139518j) {
            return;
        }
        LogUtils.file("SUDRealSudFSTAPPImpl", "exeCommonGameReload");
        pgg0 pgg0Var = this.f139513e;
        if (pgg0Var != null) {
            pgg0Var.m172230a();
            this.f139513e = null;
        }
        mo155927b(gameInfo, str);
    }

    @Override // p153l.lug0, tech.sud.gip.core.ISudFSTAPP
    public final boolean destroyMG() {
        ISudFSMMG iSudFSMMG;
        if (!this.f139518j) {
            this.f139518j = true;
            LogUtils.file("SUDRealSudFSTAPPImpl", "_destroyMGInternal");
            String str = f139506k;
            SudLogger.m222811d(str, "_destroyMGInternal");
            pgg0 pgg0Var = this.f139513e;
            if (pgg0Var != null) {
                pgg0Var.m172230a();
                this.f139513e = null;
                slg0 slg0Var = this.f139516h;
                if (slg0Var != null && (iSudFSMMG = (ISudFSMMG) ((wyg0) slg0Var).f191642c.get()) != null) {
                    SudLogger.m222815i(str, "onGameDestroyed");
                    iSudFSMMG.onGameDestroyed();
                }
                new Thread(new kog0(this)).start();
            }
        }
        return true;
    }

    @Override // p153l.lug0, tech.sud.gip.core.ISudFSTAPP
    public final String getGameState(String str) {
        if (!ThreadUtils.checkUIThread()) {
            SudLogger.m222813e(f139506k, "Please call on UI or Main thread");
        }
        slg0 slg0Var = this.f139516h;
        if (slg0Var == null) {
            return "";
        }
        String str2 = (String) ((wyg0) slg0Var).f191649j.get(str);
        return str2 == null ? WeJson.EMPTY_MAP : str2;
    }

    @Override // p153l.lug0, tech.sud.gip.core.ISudFSTAPP
    public final View getGameView() {
        return this.f139510b;
    }

    @Override // p153l.lug0, tech.sud.gip.core.ISudFSTAPP
    public final String getPlayerState(String str, String str2) {
        String str3;
        if (!ThreadUtils.checkUIThread()) {
            SudLogger.m222813e(f139506k, "Please call on UI or Main thread");
        }
        slg0 slg0Var = this.f139516h;
        if (slg0Var == null) {
            return "";
        }
        Map map = (Map) ((wyg0) slg0Var).f191650k.get(str);
        return (map == null || (str3 = (String) map.get(str2)) == null) ? WeJson.EMPTY_MAP : str3;
    }

    @Override // p153l.lug0, tech.sud.gip.core.ISudFSTAPP
    public final void notifyStateChange(String str, String str2, final ISudListenerNotifyStateChange iSudListenerNotifyStateChange) {
        String string;
        int i;
        if (!ThreadUtils.checkUIThread()) {
            SudLogger.m222813e(f139506k, "Please call on UI or Main thread");
        }
        slg0 slg0Var = this.f139516h;
        if (slg0Var != null) {
            ((wyg0) slg0Var).f191651l.put(str, str2);
        }
        if (this.f139513e == null) {
            if (iSudListenerNotifyStateChange != null) {
                iSudListenerNotifyStateChange.onFailure(-1, "This game has been destroyed");
                return;
            }
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("state", str);
            jSONObject.put("dataJson", new JSONObject(str2));
            string = null;
        } catch (JSONException e) {
            LogUtils.file("error 发送给游戏的消息格式错误：" + LogUtils.getErrorInfo(e));
            string = e.toString();
        }
        if (string != null) {
            if (iSudListenerNotifyStateChange != null) {
                iSudListenerNotifyStateChange.onFailure(-1, string);
                return;
            }
            return;
        }
        LogUtils.file("SUDRealSudFSTAPPImpl", "notifyStateChange:" + jSONObject.toString());
        pgg0 pgg0Var = this.f139513e;
        b0h0 b0h0Var = new b0h0() { // from class: l.azg0
            @Override // p153l.b0h0
            /* JADX INFO: renamed from: a */
            public final void mo101070a(JSONArray jSONArray) {
                mzg0.m160909d(iSudListenerNotifyStateChange, jSONArray);
            }
        };
        pgg0Var.getClass();
        if (pgg0Var.f152264a != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(PushService.KEY_COMMAND, "custom.CustomCommandEvent");
                synchronized (pgg0Var.f152269f) {
                    i = pgg0Var.f152268e + 1;
                    pgg0Var.f152268e = i;
                    pgg0Var.f152269f.put(i, b0h0Var);
                }
                jSONObject2.put("id", i);
                jSONObject2.put("data", jSONObject);
                yxg0 yxg0Var = pgg0Var.f152264a;
                String string2 = jSONObject2.toString();
                C22517c c22517c = yxg0Var.f201971c;
                if (c22517c == null) {
                    return;
                }
                c22517c.mo222830a("RTGlobalEvent", string2);
            } catch (JSONException e2) {
                ysg0.m217257c("WXGame", e2.getMessage());
            }
        }
    }

    @Override // p153l.lug0, tech.sud.gip.core.ISudFSTAPP
    public final void pauseMG() {
        C22517c c22517c;
        if (!ThreadUtils.checkUIThread()) {
            SudLogger.m222813e(f139506k, "Please call on UI or Main thread");
        }
        if (this.f139513e != null) {
            notifyStateChange("a2ms-notify-pause-game", WeJson.EMPTY_MAP, null);
            yxg0 yxg0Var = this.f139513e.f152264a;
            if (yxg0Var == null || (c22517c = yxg0Var.f201971c) == null) {
                return;
            }
            c22517c.mo222836c();
        }
    }

    @Override // p153l.lug0, tech.sud.gip.core.ISudFSTAPP
    public final void playMG() {
        C22517c c22517c;
        if (!ThreadUtils.checkUIThread()) {
            SudLogger.m222813e(f139506k, "Please call on UI or Main thread");
        }
        pgg0 pgg0Var = this.f139513e;
        if (pgg0Var != null) {
            yxg0 yxg0Var = pgg0Var.f152264a;
            if (yxg0Var != null && (c22517c = yxg0Var.f201971c) != null) {
                c22517c.mo222837d();
            }
            notifyStateChange("a2ms-notify-resume-game", WeJson.EMPTY_MAP, null);
        }
    }

    @Override // p153l.lug0, tech.sud.gip.core.ISudFSTAPP
    public final void startMG() {
        if (ThreadUtils.checkUIThread()) {
            return;
        }
        SudLogger.m222813e(f139506k, "Please call on UI or Main thread");
    }

    @Override // p153l.lug0, tech.sud.gip.core.ISudFSTAPP
    public final void stopMG() {
        if (ThreadUtils.checkUIThread()) {
            return;
        }
        SudLogger.m222813e(f139506k, "Please call on UI or Main thread");
    }

    @Override // p153l.lug0, tech.sud.gip.core.ISudFSTAPP
    public final void updateCode(String str, ISudListenerNotifyStateChange iSudListenerNotifyStateChange) {
        String string;
        if (!ThreadUtils.checkUIThread()) {
            SudLogger.m222813e(f139506k, "Please call on UI or Main thread");
        }
        if (this.f139518j) {
            if (iSudListenerNotifyStateChange != null) {
                iSudListenerNotifyStateChange.onFailure(-1, "This Game has been destroyed");
                return;
            }
            return;
        }
        slg0 slg0Var = this.f139516h;
        if (slg0Var != null) {
            ((wyg0) slg0Var).f191645f = str;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ret_code", 0);
            jSONObject.put("ret_msg", "success");
            jSONObject.put("code", str);
            string = jSONObject.toString();
        } catch (Exception e) {
            SudLogger.m222813e(f139506k, e.toString());
            string = "";
        }
        notifyStateChange("a2ms-update-code", string, iSudListenerNotifyStateChange);
    }

    @Override // p153l.lug0, tech.sud.gip.core.ISudFSTAPP
    public final void reloadMG() {
    }

    @Override // p153l.lug0, tech.sud.gip.core.ISudFSTAPP
    public final void pushAudio(ByteBuffer byteBuffer, int i) {
    }
}
