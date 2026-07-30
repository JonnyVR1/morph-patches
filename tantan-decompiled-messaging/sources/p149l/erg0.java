package p149l;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import com.cosmos.photon.push.service.PushService;
import com.p046p1.mobile.putong.live.base.data.BLivePkInviteSource;
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
import tech.sud.runtime.p137a.C22402c;
import tech.sud.runtime.p137a.InterfaceC22400a;

/* JADX INFO: loaded from: classes.dex */
public final class erg0 extends dmg0 {

    /* JADX INFO: renamed from: k */
    public static final String f92914k = "SudGIP ".concat(erg0.class.getSimpleName());

    /* JADX INFO: renamed from: l */
    public static final ExecutorService f92915l = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: m */
    public static boolean f92916m;

    /* JADX INFO: renamed from: a */
    public final Activity f92917a;

    /* JADX INFO: renamed from: b */
    public final FrameLayout f92918b;

    /* JADX INFO: renamed from: c */
    public final String f92919c;

    /* JADX INFO: renamed from: d */
    public final long f92920d;

    /* JADX INFO: renamed from: e */
    public h8g0 f92921e;

    /* JADX INFO: renamed from: g */
    public final yjg0 f92923g;

    /* JADX INFO: renamed from: h */
    public final kdg0 f92924h;

    /* JADX INFO: renamed from: i */
    public agg0 f92925i;

    /* JADX INFO: renamed from: j */
    public boolean f92926j = false;

    /* JADX INFO: renamed from: f */
    public final icg0 f92922f = new icg0(this);

    static {
        try {
            log0 log0Var = new log0();
            h8g0.f106406C = log0Var;
            qkg0.f155121a = log0Var;
        } catch (Throwable th) {
            th.printStackTrace();
            LogUtils.file("SUDRealSudFSTAPPImpl", "初始化引擎的日志监听发生了异常：" + LogUtils.getErrorInfo(th));
        }
    }

    public erg0(Activity activity, String str, long j, FrameLayout frameLayout, oqg0 oqg0Var) {
        this.f92917a = activity;
        this.f92918b = frameLayout;
        this.f92919c = str;
        this.f92920d = j;
        this.f92924h = oqg0Var;
        this.f92923g = new yjg0(oqg0Var);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m117826d(ISudListenerNotifyStateChange iSudListenerNotifyStateChange, JSONArray jSONArray) {
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

    @Override // p149l.dmg0
    /* JADX INFO: renamed from: a */
    public final void mo112474a(agg0 agg0Var) {
        this.f92925i = agg0Var;
    }

    @Override // p149l.dmg0
    /* JADX INFO: renamed from: b */
    public final void mo112475b(GameInfo gameInfo, String str) {
        String string;
        y5g0 y5g0Var;
        LogUtils.file("SUDRealSudFSTAPPImpl", "_startGame");
        String str2 = f92914k;
        SudLogger.m221565d(str2, "_startGame");
        if (this.f92926j) {
            return;
        }
        h8g0 h8g0Var = new h8g0(this.f92917a);
        this.f92921e = h8g0Var;
        h8g0Var.m129890b("custom.CustomCommand", new fmg0(this.f92923g));
        h8g0 h8g0Var2 = this.f92921e;
        h8g0Var2.f106417h = this.f92922f;
        this.f92918b.addView(h8g0Var2.f106419j, 0, new FrameLayout.LayoutParams(-1, -1));
        qpg0 qpg0Var = this.f92921e.f106410a;
        if (qpg0Var == null || !qpg0Var.m175838c()) {
            LogUtils.file("SUDRealSudFSTAPPImpl", "error _startGame This device does not support OpenGL ES 2.0.");
            SudLogger.m221567e(str2, "_startGame This device does not support OpenGL ES 2.0.");
            return;
        }
        h8g0 h8g0Var3 = this.f92921e;
        h8g0Var3.f106423n = "";
        h8g0Var3.f106432w = false;
        h8g0Var3.f106431v = false;
        h8g0Var3.f106430u = true;
        if (fcg0.f96796a) {
            h8g0Var3.f106424o = true;
            h8g0Var3.f106426q = "";
            h8g0Var3.f106429t = true;
        } else {
            h8g0Var3.f106424o = false;
            h8g0Var3.f106426q = "";
            h8g0Var3.f106429t = false;
        }
        hbg0 hbg0Var = sig0.f164716a;
        h8g0Var3.f106408A = "true".equals(hbg0Var.f106933d.get(ISudCfg.DISABLE_AUDIO_FOCUS));
        String str3 = (String) hbg0Var.f106933d.get(ISudCfg.KEYBOARD_BOTTOM_OFFSET);
        if (str3 != null) {
            try {
                this.f92921e.f106409B = Integer.valueOf(Integer.parseInt(str3));
            } catch (Exception e) {
                LogUtils.file("SUDRealSudFSTAPPImpl", LogUtils.getErrorInfo(e));
            }
        }
        h8g0 h8g0Var4 = this.f92921e;
        h8g0Var4.f106434y = "local_storage.db";
        h8g0Var4.f106428s = "SudPlugin";
        r9g0 r9g0Var = new r9g0();
        Locale locale = Locale.US;
        String absolutePath = new File(this.f92917a.getFilesDir(), "sud/mgp/user/" + this.f92919c + "/" + gameInfo.mgId + "/data").getAbsolutePath();
        h8g0 h8g0Var5 = this.f92921e;
        String str4 = this.f92919c;
        String strValueOf = String.valueOf(gameInfo.mgId);
        qpg0 qpg0Var2 = h8g0Var5.f106410a;
        if (qpg0Var2 != null) {
            if (h8g0Var5.f106421l) {
                qkg0.m175377c("WXGame", "Game.start called more than once, skipped.");
            } else {
                h8g0Var5.f106421l = true;
                try {
                    int i = h8g0Var5.f106435z;
                    if (i == 6 || i == 8 || i == 0 || i == 1) {
                        qpg0Var2.m175836a("defaultOrientation", "1");
                    }
                    String str5 = str4 + "_" + strValueOf;
                    if (absolutePath == null || absolutePath.length() == 0) {
                        absolutePath = "{{USER_ID}}/{{GAME_ID}}";
                    }
                    if (!new File(absolutePath).isAbsolute()) {
                        absolutePath = new File(h8g0Var5.f106411b.getFilesDir(), absolutePath).getAbsolutePath();
                    }
                    if (!absolutePath.contains("{{USER_ID}}") && !absolutePath.contains("{{GAME_ID}}")) {
                        absolutePath = new File(absolutePath, "{{USER_ID}}/{{GAME_ID}}").getAbsolutePath();
                    }
                    String strReplace = absolutePath.replace("{{USER_ID}}", str4).replace("{{GAME_ID}}", strValueOf);
                    qpg0 qpg0Var3 = h8g0Var5.f106410a;
                    kpg0 kpg0Var = qpg0Var3.f155750b;
                    kpg0Var.f124148c = strReplace;
                    kpg0Var.f124146a = h8g0Var5.f106424o;
                    qpg0Var3.m175836a("runtime.mode", "" + h8g0Var5.f106425p);
                    h8g0Var5.f106410a.m175836a("runtime.LoadPath", h8g0Var5.f106423n);
                    qpg0 qpg0Var4 = h8g0Var5.f106410a;
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (r9g0Var.f158376a == 0) {
                            r9g0Var.f158376a = 1001L;
                        }
                        jSONObject.put("scene", r9g0Var.f158376a);
                        String str6 = r9g0Var.f158377b;
                        if (str6 == null || str6.length() == 0) {
                            r9g0Var.f158377b = WeJson.EMPTY_MAP;
                        }
                        jSONObject.put(BLivePkInviteSource.query, r9g0Var.f158377b);
                        jSONObject.put("shareTicket", "");
                        jSONObject.put("referrerInfo", new JSONObject());
                        string = jSONObject.toString();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        string = WeJson.EMPTY_MAP;
                    }
                    qpg0Var4.m175836a("wx.launchOptions", string);
                    h8g0Var5.f106410a.m175836a("wx.packHost", h8g0Var5.f106426q);
                    h8g0Var5.f106410a.m175836a("wx.packExt", h8g0Var5.f106427r);
                    h8g0Var5.f106410a.m175836a("wx.pluginPath", h8g0Var5.f106428s);
                    h8g0Var5.f106410a.m175836a("wx.identification", str5);
                    h8g0Var5.f106410a.m175836a("wx.gameId", strValueOf);
                    h8g0Var5.f106410a.m175836a("wx.userId", str4);
                    h8g0Var5.f106410a.m175836a("systemLanguage", h8g0Var5.f106433x);
                    h8g0Var5.f106410a.m175836a("disableAudioFocus", h8g0Var5.f106408A ? "true" : "false");
                    if (h8g0Var5.f106409B != null) {
                        h8g0Var5.f106410a.m175836a("keyboardBottomOffset", h8g0Var5.f106409B + "");
                    }
                    if (!h8g0Var5.f106430u) {
                        h8g0Var5.f106410a.m175836a("jsConsole.noLogcat", "1");
                    }
                    String str7 = h8g0Var5.f106434y;
                    if (str7 != null) {
                        h8g0Var5.f106410a.m175836a("localStorageDb", str7.replace("{{USER_ID}}", str4).replace("{{GAME_ID}}", strValueOf));
                    }
                    if (h8g0Var5.f106429t) {
                        h8g0Var5.f106410a.m175836a("jsConsole", "1");
                        h8g0Var5.f106410a.m175836a("jsConsole.autoCreate", "0");
                    }
                    if (!h8g0Var5.f106432w) {
                        h8g0Var5.f106410a.m175836a("sysUIVis", "0");
                    }
                    if (!h8g0Var5.f106431v) {
                        h8g0Var5.f106410a.m175836a("activityLifecycle", "0");
                    }
                    qpg0 qpg0Var5 = h8g0Var5.f106410a;
                    HashMap map = qpg0Var5.f155753e;
                    HashMap<String, String> map2 = map == null ? new HashMap<>() : (HashMap) map.clone();
                    map2.put("Entry", str);
                    qpg0Var5.f155750b.getClass();
                    map2.put("loadingTimeout", "0");
                    if (qpg0Var5.f155750b.f124146a) {
                        map2.put("fps.show", "true");
                        qpg0Var5.f155750b.getClass();
                        Long l2 = 30L;
                        map2.put("fps.logTime", l2.toString());
                    }
                    map2.put("nativeRender", qpg0Var5.f155750b.f124147b ? "NO" : "YES");
                    qpg0Var5.f155750b.getClass();
                    map2.put("nativeGLBatch", "NO");
                    map2.put("cachePath", qpg0Var5.f155750b.f124148c);
                    map2.put("preloadPath", qpg0Var5.f155750b.f124149d);
                    qpg0Var5.f155750b.getClass();
                    map2.put("transparent", "0");
                    map2.put("immersiveMode", qpg0Var5.f155750b.f124150e ? "1" : "0");
                    map2.put("useCutout", qpg0Var5.f155750b.f124151f ? "1" : "0");
                    qpg0Var5.f155750b.getClass();
                    map2.put("enableOrientation", "0");
                    qkg0.m175377c("SudNative", "NativePlayerFactory precreate");
                    try {
                        qpg0Var5.f155751c = new C22402c();
                    } catch (Exception e3) {
                        e3.printStackTrace();
                        qkg0.m175377c("SudNative", "NativePlayerFactory CreatePlayer error:" + qkg0.m175375a(e3));
                    }
                    if (qpg0Var5.f155751c == null) {
                        qkg0.m175376b("Unable to create player object.");
                    } else {
                        if (qpg0.f155748h == null && qpg0Var5.f155754f != null) {
                            synchronized (qpg0.class) {
                                try {
                                    if (qpg0.f155748h == null && (y5g0Var = qpg0Var5.f155754f) != null) {
                                        qpg0.f155748h = y5g0Var;
                                        qpg0Var5.f155751c.mo221586a(y5g0Var);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        qpg0Var5.f155751c.mo221582a(qpg0Var5.f155749a, map2);
                        String[] strArrMo221592e = qpg0Var5.f155751c.mo221592e();
                        if (strArrMo221592e.length >= 2 && strArrMo221592e[0].equals(strArrMo221592e[1])) {
                            String str8 = strArrMo221592e[0];
                            qpg0Var5.f155750b.getClass();
                            for (Map.Entry entry : qpg0Var5.f155755g.entrySet()) {
                                qpg0Var5.f155751c.mo221585a((String) entry.getKey(), (InterfaceC22400a.a) entry.getValue());
                            }
                            qpg0Var5.f155755g.clear();
                            qpg0Var5.f155752d = true;
                            FrameLayout frameLayout = h8g0Var5.f106419j;
                            C22402c c22402c = h8g0Var5.f106410a.f155751c;
                            frameLayout.addView(c22402c == null ? null : (FrameLayout) c22402c.mo221581a(), -1, new FrameLayout.LayoutParams(-1, -1));
                            if (h8g0Var5.f106422m == null) {
                                h8g0Var5.f106422m = new FrameLayout(h8g0Var5.f106411b);
                            }
                            h8g0Var5.f106419j.addView(h8g0Var5.f106422m, new FrameLayout.LayoutParams(-1, -1));
                            h8g0Var5.f106419j.addView(h8g0Var5.f106420k, new FrameLayout.LayoutParams(-1, -1));
                            if (h8g0Var5.f106416g == null) {
                                h8g0Var5.f106416g = new kag0(h8g0Var5.f106411b, h8g0Var5);
                            }
                            if (h8g0Var5.f106429t) {
                                qpg0 qpg0Var6 = h8g0Var5.f106410a;
                                FrameLayout frameLayout2 = h8g0Var5.f106419j;
                                C22402c c22402c2 = qpg0Var6.f155751c;
                                if (c22402c2 == null) {
                                    return;
                                }
                                c22402c2.mo221583a(frameLayout2);
                                return;
                            }
                            return;
                        }
                        for (int i2 = 0; i2 < strArrMo221592e.length; i2++) {
                            qkg0.m175376b("index:" + i2 + "  version:" + strArrMo221592e[i2]);
                        }
                        qkg0.m175376b("Versions of jar and so are different.");
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                    qkg0.m175377c("WXGame", "read game.json failed");
                }
            }
        }
        LogUtils.file("SUDRealSudFSTAPPImpl", "error _game->start failed.");
        SudLogger.m221567e(f92914k, "_game->start failed.");
    }

    @Override // p149l.dmg0
    /* JADX INFO: renamed from: c */
    public final void mo112476c(GameInfo gameInfo, String str) {
        if (this.f92926j) {
            return;
        }
        LogUtils.file("SUDRealSudFSTAPPImpl", "exeCommonGameReload");
        h8g0 h8g0Var = this.f92921e;
        if (h8g0Var != null) {
            h8g0Var.m129889a();
            this.f92921e = null;
        }
        mo112475b(gameInfo, str);
    }

    @Override // p149l.dmg0, tech.sud.gip.core.ISudFSTAPP
    public final boolean destroyMG() {
        ISudFSMMG iSudFSMMG;
        if (!this.f92926j) {
            this.f92926j = true;
            LogUtils.file("SUDRealSudFSTAPPImpl", "_destroyMGInternal");
            String str = f92914k;
            SudLogger.m221565d(str, "_destroyMGInternal");
            h8g0 h8g0Var = this.f92921e;
            if (h8g0Var != null) {
                h8g0Var.m129889a();
                this.f92921e = null;
                kdg0 kdg0Var = this.f92924h;
                if (kdg0Var != null && (iSudFSMMG = (ISudFSMMG) ((oqg0) kdg0Var).f145140c.get()) != null) {
                    SudLogger.m221569i(str, "onGameDestroyed");
                    iSudFSMMG.onGameDestroyed();
                }
                new Thread(new cgg0(this)).start();
            }
        }
        return true;
    }

    @Override // p149l.dmg0, tech.sud.gip.core.ISudFSTAPP
    public final String getGameState(String str) {
        if (!ThreadUtils.checkUIThread()) {
            SudLogger.m221567e(f92914k, "Please call on UI or Main thread");
        }
        kdg0 kdg0Var = this.f92924h;
        if (kdg0Var == null) {
            return "";
        }
        String str2 = (String) ((oqg0) kdg0Var).f145147j.get(str);
        return str2 == null ? WeJson.EMPTY_MAP : str2;
    }

    @Override // p149l.dmg0, tech.sud.gip.core.ISudFSTAPP
    public final View getGameView() {
        return this.f92918b;
    }

    @Override // p149l.dmg0, tech.sud.gip.core.ISudFSTAPP
    public final String getPlayerState(String str, String str2) {
        String str3;
        if (!ThreadUtils.checkUIThread()) {
            SudLogger.m221567e(f92914k, "Please call on UI or Main thread");
        }
        kdg0 kdg0Var = this.f92924h;
        if (kdg0Var == null) {
            return "";
        }
        Map map = (Map) ((oqg0) kdg0Var).f145148k.get(str);
        return (map == null || (str3 = (String) map.get(str2)) == null) ? WeJson.EMPTY_MAP : str3;
    }

    @Override // p149l.dmg0, tech.sud.gip.core.ISudFSTAPP
    public final void notifyStateChange(String str, String str2, final ISudListenerNotifyStateChange iSudListenerNotifyStateChange) {
        String string;
        int i;
        if (!ThreadUtils.checkUIThread()) {
            SudLogger.m221567e(f92914k, "Please call on UI or Main thread");
        }
        kdg0 kdg0Var = this.f92924h;
        if (kdg0Var != null) {
            ((oqg0) kdg0Var).f145149l.put(str, str2);
        }
        if (this.f92921e == null) {
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
        h8g0 h8g0Var = this.f92921e;
        trg0 trg0Var = new trg0() { // from class: l.sqg0
            @Override // p149l.trg0
            /* JADX INFO: renamed from: a */
            public final void mo185590a(JSONArray jSONArray) {
                erg0.m117826d(iSudListenerNotifyStateChange, jSONArray);
            }
        };
        h8g0Var.getClass();
        if (h8g0Var.f106410a != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(PushService.KEY_COMMAND, "custom.CustomCommandEvent");
                synchronized (h8g0Var.f106415f) {
                    i = h8g0Var.f106414e + 1;
                    h8g0Var.f106414e = i;
                    h8g0Var.f106415f.put(i, trg0Var);
                }
                jSONObject2.put("id", i);
                jSONObject2.put("data", jSONObject);
                qpg0 qpg0Var = h8g0Var.f106410a;
                String string2 = jSONObject2.toString();
                C22402c c22402c = qpg0Var.f155751c;
                if (c22402c == null) {
                    return;
                }
                c22402c.mo221584a("RTGlobalEvent", string2);
            } catch (JSONException e2) {
                qkg0.m175377c("WXGame", e2.getMessage());
            }
        }
    }

    @Override // p149l.dmg0, tech.sud.gip.core.ISudFSTAPP
    public final void pauseMG() {
        C22402c c22402c;
        if (!ThreadUtils.checkUIThread()) {
            SudLogger.m221567e(f92914k, "Please call on UI or Main thread");
        }
        if (this.f92921e != null) {
            notifyStateChange("a2ms-notify-pause-game", WeJson.EMPTY_MAP, null);
            qpg0 qpg0Var = this.f92921e.f106410a;
            if (qpg0Var == null || (c22402c = qpg0Var.f155751c) == null) {
                return;
            }
            c22402c.mo221590c();
        }
    }

    @Override // p149l.dmg0, tech.sud.gip.core.ISudFSTAPP
    public final void playMG() {
        C22402c c22402c;
        if (!ThreadUtils.checkUIThread()) {
            SudLogger.m221567e(f92914k, "Please call on UI or Main thread");
        }
        h8g0 h8g0Var = this.f92921e;
        if (h8g0Var != null) {
            qpg0 qpg0Var = h8g0Var.f106410a;
            if (qpg0Var != null && (c22402c = qpg0Var.f155751c) != null) {
                c22402c.mo221591d();
            }
            notifyStateChange("a2ms-notify-resume-game", WeJson.EMPTY_MAP, null);
        }
    }

    @Override // p149l.dmg0, tech.sud.gip.core.ISudFSTAPP
    public final void startMG() {
        if (ThreadUtils.checkUIThread()) {
            return;
        }
        SudLogger.m221567e(f92914k, "Please call on UI or Main thread");
    }

    @Override // p149l.dmg0, tech.sud.gip.core.ISudFSTAPP
    public final void stopMG() {
        if (ThreadUtils.checkUIThread()) {
            return;
        }
        SudLogger.m221567e(f92914k, "Please call on UI or Main thread");
    }

    @Override // p149l.dmg0, tech.sud.gip.core.ISudFSTAPP
    public final void updateCode(String str, ISudListenerNotifyStateChange iSudListenerNotifyStateChange) {
        String string;
        if (!ThreadUtils.checkUIThread()) {
            SudLogger.m221567e(f92914k, "Please call on UI or Main thread");
        }
        if (this.f92926j) {
            if (iSudListenerNotifyStateChange != null) {
                iSudListenerNotifyStateChange.onFailure(-1, "This Game has been destroyed");
                return;
            }
            return;
        }
        kdg0 kdg0Var = this.f92924h;
        if (kdg0Var != null) {
            ((oqg0) kdg0Var).f145143f = str;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ret_code", 0);
            jSONObject.put("ret_msg", "success");
            jSONObject.put("code", str);
            string = jSONObject.toString();
        } catch (Exception e) {
            SudLogger.m221567e(f92914k, e.toString());
            string = "";
        }
        notifyStateChange("a2ms-update-code", string, iSudListenerNotifyStateChange);
    }

    @Override // p149l.dmg0, tech.sud.gip.core.ISudFSTAPP
    public final void reloadMG() {
    }

    @Override // p149l.dmg0, tech.sud.gip.core.ISudFSTAPP
    public final void pushAudio(ByteBuffer byteBuffer, int i) {
    }
}
