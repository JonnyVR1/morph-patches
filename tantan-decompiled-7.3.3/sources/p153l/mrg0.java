package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.material.badge.BadgeDrawable;
import org.json.JSONObject;
import tech.sud.gip.C22511R;
import tech.sud.gip.core.GameInfo;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class mrg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gug0 f138369a;

    public mrg0(gug0 gug0Var) {
        this.f138369a = gug0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m159698a(int i) {
        lug0 lug0Var;
        String str;
        this.f138369a.f106507h.m104163b(i, null);
        if (1 == i) {
            gug0 gug0Var = this.f138369a;
            gmg0 gmg0Var = (gmg0) gug0Var.f106503d.get(gug0Var.f106506g);
            gug0 gug0Var2 = this.f138369a;
            GameInfo gameInfo = gmg0Var.f104980d;
            gug0Var2.f106504e = gameInfo;
            gug0Var2.f106507h.m104167f(gameInfo.bigLoadingPic);
            gug0 gug0Var3 = this.f138369a;
            dog0 dog0Var = gug0Var3.f106505f;
            GameInfo gameInfo2 = gug0Var3.f106504e;
            krg0 krg0Var = (krg0) dog0Var;
            if (gameInfo2 != null) {
                dhg0 dhg0Var = krg0Var.f128460a;
                xlg0 xlg0Var = gameInfo2.gameLargeModelCfg;
                dhg0Var.f88499D = xlg0Var;
                rog0 rog0Var = dhg0Var.f88497B;
                if (rog0Var != null && xlg0Var != null) {
                    rog0Var.f164206m = xlg0Var.f194967a;
                    rog0Var.f164207n = xlg0Var.f194969c;
                }
                dhg0Var.f88507g = gameInfo2;
                wyg0 wyg0Var = dhg0Var.f88521u;
                String str2 = gameInfo2.dynamicConfig;
                wyg0Var.getClass();
                LogUtils.file("SudFSMMGStateHandlerImpl", "setDynamicConfigJson dynamicConfig = " + str2);
                SudLogger.m222811d(wyg0.f191639n, "setDynamicConfigJson dynamicConfig = " + str2);
                wyg0Var.f191647h = str2;
                dhg0 dhg0Var2 = krg0Var.f128460a;
                wyg0 wyg0Var2 = dhg0Var2.f88521u;
                String str3 = dhg0Var2.f88501a.authorizationSecret;
                wyg0Var2.getClass();
                if (str3 != null && str3.length() > 0) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("authorization_secret", str3);
                        wyg0Var2.f191648i = jSONObject.toString();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                int i2 = gameInfo2.engine;
                if (1 == i2) {
                    dhg0 dhg0Var3 = krg0Var.f128460a;
                    dhg0 dhg0Var4 = krg0Var.f128460a;
                    dhg0Var3.f88513m = new mzg0(dhg0Var4.f88502b, dhg0Var4.f88503c, dhg0Var4.f88505e, dhg0Var4.f88514n, dhg0Var4.f88521u);
                    int i3 = utg0.f180951f;
                    if (i3 == 4 || i3 == 3) {
                        mzg0.f139508m = true;
                    } else {
                        mzg0.f139508m = false;
                    }
                } else if (5 == i2) {
                    krg0Var.f128460a.f88496A = utg0.m198038f();
                    dhg0 dhg0Var5 = krg0Var.f128460a;
                    SudLogger.m222811d(dhg0.f88494F, "isOpenUnityMultiProcess:" + dhg0Var5.f88496A);
                    LogUtils.file("ProxySudFSTAPPImpl", "isOpenUnityMultiProcess:" + dhg0Var5.f88496A);
                    boolean z = dhg0Var5.f88496A;
                    dhg0 dhg0Var6 = krg0Var.f128460a;
                    if (z) {
                        dhg0Var6.f88513m = new blg0();
                    } else {
                        dhg0Var6.f88513m = new alg0();
                    }
                }
            } else {
                krg0Var.getClass();
            }
        }
        gug0 gug0Var4 = this.f138369a;
        int i4 = gug0Var4.f106506g + 1;
        gug0Var4.f106506g = i4;
        if (i4 < gug0Var4.f106503d.size()) {
            gug0 gug0Var5 = this.f138369a;
            bkg0 bkg0Var = (bkg0) gug0Var5.f106503d.get(gug0Var5.f106506g);
            gug0 gug0Var6 = this.f138369a;
            bkg0Var.mo104809a(gug0Var6.f106504e, gug0Var6.f106501b, gug0Var6.f106502c);
            return;
        }
        LogUtils.file("SudGameLoadingModel", "loading finish");
        SudLogger.m222811d(gug0.f106499i, "loading finish");
        Context context = this.f138369a.f106500a;
        if (context != null) {
            m159700c(context.getString(C22511R.string.fsm_mgp_game_loading_stage_loadPackage_launch_game));
        }
        if (this.f138369a.f106507h != null) {
            LogUtils.file("SudGameLoadingNormalViewModel", "loading complete");
            SudLogger.m222811d(bgg0.f76620v, "loading complete");
        }
        gug0 gug0Var7 = this.f138369a;
        dog0 dog0Var2 = gug0Var7.f106505f;
        GameInfo gameInfo3 = gug0Var7.f106504e;
        krg0 krg0Var2 = (krg0) dog0Var2;
        if (gameInfo3 == null) {
            krg0Var2.getClass();
            return;
        }
        dhg0 dhg0Var7 = krg0Var2.f128460a;
        String str4 = gameInfo3.gamePath;
        dhg0Var7.f88524x = gameInfo3;
        dhg0Var7.f88525y = str4;
        LogUtils.file("ProxySudFSTAPPImpl", "_startGame");
        String str5 = dhg0.f88494F;
        SudLogger.m222811d(str5, "proxy _startGame");
        if (dhg0Var7.f88511k || dhg0Var7.f88507g == null || (lug0Var = dhg0Var7.f88513m) == null) {
            return;
        }
        lug0Var.mo155926a(dhg0Var7.f88523w);
        int i5 = gameInfo3.engine;
        if (1 == i5) {
            dhg0Var7.f88513m.mo155927b(gameInfo3, str4);
        } else {
            if (5 != i5) {
                return;
            }
            SudLogger.m222811d(str5, "isOpenUnityMultiProcess:" + dhg0Var7.f88496A);
            LogUtils.file("ProxySudFSTAPPImpl", "isOpenUnityMultiProcess:" + dhg0Var7.f88496A);
            boolean z2 = dhg0Var7.f88496A;
            iug0 iug0Var = dhg0Var7.f88523w;
            if (z2) {
                iug0Var.f116944o = true;
                dhg0Var7.f88513m.mo155927b(gameInfo3, str4);
            } else {
                iug0Var.f116944o = false;
                dhg0Var7.f88513m.mo155927b(gameInfo3, str4);
            }
        }
        if (utg0.f180951f == 2) {
            View viewInflate = LayoutInflater.from(dhg0Var7.f88502b).inflate(C22511R.layout.fsm_mgp_game_running_sud_test_logo, (ViewGroup) null);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, BadgeDrawable.BOTTOM_END);
            layoutParams.setMargins(0, 0, (int) ((dhg0Var7.f88502b.getResources().getDisplayMetrics().density * 10.0f) + 0.5f), (int) ((10.0f * dhg0Var7.f88502b.getResources().getDisplayMetrics().density) + 0.5f));
            viewInflate.setLayoutParams(layoutParams);
            TextView textView = (TextView) viewInflate.findViewById(C22511R.id.fsm_mgp_game_running_only_test);
            String str6 = utg0.f180949d;
            if (str6 == null || !str6.substring(0, 2).equals("zh")) {
                str = "Only Test";
            } else {
                str = utg0.f180949d.equals("zh-CN") ? "仅供测试" : "僅供測試";
            }
            textView.setText(str);
            dhg0Var7.f88514n.addView(viewInflate);
        }
        iug0 iug0Var2 = dhg0Var7.f88523w;
        iug0Var2.getClass();
        LogUtils.file("LoadGameStatsManager", "onStartGame");
        iug0Var2.f116935f = true;
        iug0Var2.m142193e(true);
        if (dhg0Var7.f88498C == null) {
            xlg0 xlg0Var2 = gameInfo3.gameLargeModelCfg;
            if (xlg0Var2 != null ? xlg0Var2.f194968b : false) {
                qug0 qug0Var = new qug0(utg0.f180952g, dhg0Var7.f88503c, dhg0Var7.f88504d, dhg0Var7.f88505e, new zfg0(dhg0Var7));
                dhg0Var7.f88498C = qug0Var;
                SudLogger.m222811d(qug0Var.f159573a, "start curIsRunning:" + qug0Var.f159578f.get());
                LogUtils.file("SudGIPWebSocket", "start curIsRunning:" + qug0Var.f159578f.get());
                if (qug0Var.f159578f.get()) {
                    return;
                }
                qug0Var.f159578f.set(true);
                qug0Var.m178149a();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m159699b(int i, int i2, String str) {
        String str2;
        LogUtils.file("SudGameLoadingModel", "loading failed=" + str);
        SudLogger.m222811d(gug0.f106499i, "loading failed=" + str);
        bgg0 bgg0Var = this.f138369a.f106507h;
        if (bgg0Var != null) {
            if (nkg0.f142458a) {
                TextView textView = bgg0Var.f76629k;
                StringBuilder sb = new StringBuilder();
                if (i == 1) {
                    str2 = "GetMGInfo";
                } else if (i == 2) {
                    str2 = "LoadCore";
                } else if (i == 3) {
                    str2 = "LoadPackage";
                } else if (i != 4) {
                    str2 = i != 5 ? "null" : "LoadGame";
                } else {
                    str2 = "LoadPlugin";
                }
                sb.append(str2);
                sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                sb.append(str);
                textView.setText(sb.toString());
            }
            bgg0Var.f189794a.f72452a.m115800b(2, i2, bgg0Var.f76621c, false);
            bgg0Var.m104168g();
            bgg0Var.m104162a();
            bgg0Var.m104164c(i2, true, bgg0Var.f76622d, false);
            if (!bgg0Var.f76637s) {
                bgg0Var.f76625g.setVisibility(0);
            }
            dhg0 dhg0Var = bgg0Var.f189794a.f72452a;
            dhg0Var.f88509i = true;
            iug0 iug0Var = dhg0Var.f88523w;
            iug0Var.f116939j.stop();
            iug0Var.f116940k.stop();
            iug0Var.f116941l.stop();
            iug0Var.m142189a();
            ukg0 ukg0Var = iug0Var.f116930a;
            if (ukg0Var != null) {
                ukg0Var.f179396e = i2;
            }
            if (ukg0Var != null && str != null) {
                ukg0Var.f179397f = str;
            }
            iug0Var.m142196h();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m159700c(String str) {
        bgg0 bgg0Var = this.f138369a.f106507h;
        if (bgg0Var != null) {
            if (nkg0.f142458a) {
                bgg0Var.f76629k.setText(str);
            }
            bgg0Var.f189795b = str;
        }
    }
}
