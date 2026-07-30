package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.material.badge.BadgeDrawable;
import org.json.JSONObject;
import tech.sud.gip.C22396R;
import tech.sud.gip.core.GameInfo;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class ejg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ylg0 f91721a;

    public ejg0(ylg0 ylg0Var) {
        this.f91721a = ylg0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m116841a(int i) {
        dmg0 dmg0Var;
        String str;
        this.f91721a.f198892h.m187457b(i, null);
        if (1 == i) {
            ylg0 ylg0Var = this.f91721a;
            ydg0 ydg0Var = (ydg0) ylg0Var.f198888d.get(ylg0Var.f198891g);
            ylg0 ylg0Var2 = this.f91721a;
            GameInfo gameInfo = ydg0Var.f197566d;
            ylg0Var2.f198889e = gameInfo;
            ylg0Var2.f198892h.m187461f(gameInfo.bigLoadingPic);
            ylg0 ylg0Var3 = this.f91721a;
            vfg0 vfg0Var = ylg0Var3.f198890f;
            GameInfo gameInfo2 = ylg0Var3.f198889e;
            cjg0 cjg0Var = (cjg0) vfg0Var;
            if (gameInfo2 != null) {
                v8g0 v8g0Var = cjg0Var.f81179a;
                pdg0 pdg0Var = gameInfo2.gameLargeModelCfg;
                v8g0Var.f180497D = pdg0Var;
                jgg0 jgg0Var = v8g0Var.f180495B;
                if (jgg0Var != null && pdg0Var != null) {
                    jgg0Var.f117788m = pdg0Var.f148301a;
                    jgg0Var.f117789n = pdg0Var.f148303c;
                }
                v8g0Var.f180505g = gameInfo2;
                oqg0 oqg0Var = v8g0Var.f180519u;
                String str2 = gameInfo2.dynamicConfig;
                oqg0Var.getClass();
                LogUtils.file("SudFSMMGStateHandlerImpl", "setDynamicConfigJson dynamicConfig = " + str2);
                SudLogger.m221565d(oqg0.f145137n, "setDynamicConfigJson dynamicConfig = " + str2);
                oqg0Var.f145145h = str2;
                v8g0 v8g0Var2 = cjg0Var.f81179a;
                oqg0 oqg0Var2 = v8g0Var2.f180519u;
                String str3 = v8g0Var2.f180499a.authorizationSecret;
                oqg0Var2.getClass();
                if (str3 != null && str3.length() > 0) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("authorization_secret", str3);
                        oqg0Var2.f145146i = jSONObject.toString();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                int i2 = gameInfo2.engine;
                if (1 == i2) {
                    v8g0 v8g0Var3 = cjg0Var.f81179a;
                    v8g0 v8g0Var4 = cjg0Var.f81179a;
                    v8g0Var3.f180511m = new erg0(v8g0Var4.f180500b, v8g0Var4.f180501c, v8g0Var4.f180503e, v8g0Var4.f180512n, v8g0Var4.f180519u);
                    int i3 = mlg0.f134431f;
                    if (i3 == 4 || i3 == 3) {
                        erg0.f92916m = true;
                    } else {
                        erg0.f92916m = false;
                    }
                } else if (5 == i2) {
                    cjg0Var.f81179a.f180494A = mlg0.m155147f();
                    v8g0 v8g0Var5 = cjg0Var.f81179a;
                    SudLogger.m221565d(v8g0.f180492F, "isOpenUnityMultiProcess:" + v8g0Var5.f180494A);
                    LogUtils.file("ProxySudFSTAPPImpl", "isOpenUnityMultiProcess:" + v8g0Var5.f180494A);
                    boolean z = v8g0Var5.f180494A;
                    v8g0 v8g0Var6 = cjg0Var.f81179a;
                    if (z) {
                        v8g0Var6.f180511m = new tcg0();
                    } else {
                        v8g0Var6.f180511m = new scg0();
                    }
                }
            } else {
                cjg0Var.getClass();
            }
        }
        ylg0 ylg0Var4 = this.f91721a;
        int i4 = ylg0Var4.f198891g + 1;
        ylg0Var4.f198891g = i4;
        if (i4 < ylg0Var4.f198888d.size()) {
            ylg0 ylg0Var5 = this.f91721a;
            tbg0 tbg0Var = (tbg0) ylg0Var5.f198888d.get(ylg0Var5.f198891g);
            ylg0 ylg0Var6 = this.f91721a;
            tbg0Var.mo149032a(ylg0Var6.f198889e, ylg0Var6.f198886b, ylg0Var6.f198887c);
            return;
        }
        LogUtils.file("SudGameLoadingModel", "loading finish");
        SudLogger.m221565d(ylg0.f198884i, "loading finish");
        Context context = this.f91721a.f198885a;
        if (context != null) {
            m116843c(context.getString(C22396R.string.fsm_mgp_game_loading_stage_loadPackage_launch_game));
        }
        if (this.f91721a.f198892h != null) {
            LogUtils.file("SudGameLoadingNormalViewModel", "loading complete");
            SudLogger.m221565d(t7g0.f168716v, "loading complete");
        }
        ylg0 ylg0Var7 = this.f91721a;
        vfg0 vfg0Var2 = ylg0Var7.f198890f;
        GameInfo gameInfo3 = ylg0Var7.f198889e;
        cjg0 cjg0Var2 = (cjg0) vfg0Var2;
        if (gameInfo3 == null) {
            cjg0Var2.getClass();
            return;
        }
        v8g0 v8g0Var7 = cjg0Var2.f81179a;
        String str4 = gameInfo3.gamePath;
        v8g0Var7.f180522x = gameInfo3;
        v8g0Var7.f180523y = str4;
        LogUtils.file("ProxySudFSTAPPImpl", "_startGame");
        String str5 = v8g0.f180492F;
        SudLogger.m221565d(str5, "proxy _startGame");
        if (v8g0Var7.f180509k || v8g0Var7.f180505g == null || (dmg0Var = v8g0Var7.f180511m) == null) {
            return;
        }
        dmg0Var.mo112474a(v8g0Var7.f180521w);
        int i5 = gameInfo3.engine;
        if (1 == i5) {
            v8g0Var7.f180511m.mo112475b(gameInfo3, str4);
        } else {
            if (5 != i5) {
                return;
            }
            SudLogger.m221565d(str5, "isOpenUnityMultiProcess:" + v8g0Var7.f180494A);
            LogUtils.file("ProxySudFSTAPPImpl", "isOpenUnityMultiProcess:" + v8g0Var7.f180494A);
            boolean z2 = v8g0Var7.f180494A;
            amg0 amg0Var = v8g0Var7.f180521w;
            if (z2) {
                amg0Var.f70614o = true;
                v8g0Var7.f180511m.mo112475b(gameInfo3, str4);
            } else {
                amg0Var.f70614o = false;
                v8g0Var7.f180511m.mo112475b(gameInfo3, str4);
            }
        }
        if (mlg0.f134431f == 2) {
            View viewInflate = LayoutInflater.from(v8g0Var7.f180500b).inflate(C22396R.layout.fsm_mgp_game_running_sud_test_logo, (ViewGroup) null);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, BadgeDrawable.BOTTOM_END);
            layoutParams.setMargins(0, 0, (int) ((v8g0Var7.f180500b.getResources().getDisplayMetrics().density * 10.0f) + 0.5f), (int) ((10.0f * v8g0Var7.f180500b.getResources().getDisplayMetrics().density) + 0.5f));
            viewInflate.setLayoutParams(layoutParams);
            TextView textView = (TextView) viewInflate.findViewById(C22396R.id.fsm_mgp_game_running_only_test);
            String str6 = mlg0.f134429d;
            if (str6 == null || !str6.substring(0, 2).equals("zh")) {
                str = "Only Test";
            } else {
                str = mlg0.f134429d.equals("zh-CN") ? "仅供测试" : "僅供測試";
            }
            textView.setText(str);
            v8g0Var7.f180512n.addView(viewInflate);
        }
        amg0 amg0Var2 = v8g0Var7.f180521w;
        amg0Var2.getClass();
        LogUtils.file("LoadGameStatsManager", "onStartGame");
        amg0Var2.f70605f = true;
        amg0Var2.m97558e(true);
        if (v8g0Var7.f180496C == null) {
            pdg0 pdg0Var2 = gameInfo3.gameLargeModelCfg;
            if (pdg0Var2 != null ? pdg0Var2.f148302b : false) {
                img0 img0Var = new img0(mlg0.f134432g, v8g0Var7.f180501c, v8g0Var7.f180502d, v8g0Var7.f180503e, new r7g0(v8g0Var7));
                v8g0Var7.f180496C = img0Var;
                SudLogger.m221565d(img0Var.f113927a, "start curIsRunning:" + img0Var.f113932f.get());
                LogUtils.file("SudGIPWebSocket", "start curIsRunning:" + img0Var.f113932f.get());
                if (img0Var.f113932f.get()) {
                    return;
                }
                img0Var.f113932f.set(true);
                img0Var.m137076a();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m116842b(int i, int i2, String str) {
        String str2;
        LogUtils.file("SudGameLoadingModel", "loading failed=" + str);
        SudLogger.m221565d(ylg0.f198884i, "loading failed=" + str);
        t7g0 t7g0Var = this.f91721a.f198892h;
        if (t7g0Var != null) {
            if (fcg0.f96796a) {
                TextView textView = t7g0Var.f168725k;
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
            t7g0Var.f143311a.f164291a.m197441b(2, i2, t7g0Var.f168717c, false);
            t7g0Var.m187462g();
            t7g0Var.m187456a();
            t7g0Var.m187458c(i2, true, t7g0Var.f168718d, false);
            if (!t7g0Var.f168733s) {
                t7g0Var.f168721g.setVisibility(0);
            }
            v8g0 v8g0Var = t7g0Var.f143311a.f164291a;
            v8g0Var.f180507i = true;
            amg0 amg0Var = v8g0Var.f180521w;
            amg0Var.f70609j.stop();
            amg0Var.f70610k.stop();
            amg0Var.f70611l.stop();
            amg0Var.m97554a();
            mcg0 mcg0Var = amg0Var.f70600a;
            if (mcg0Var != null) {
                mcg0Var.f133115e = i2;
            }
            if (mcg0Var != null && str != null) {
                mcg0Var.f133116f = str;
            }
            amg0Var.m97561h();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m116843c(String str) {
        t7g0 t7g0Var = this.f91721a.f198892h;
        if (t7g0Var != null) {
            if (fcg0.f96796a) {
                t7g0Var.f168725k.setText(str);
            }
            t7g0Var.f143312b = str;
        }
    }
}
