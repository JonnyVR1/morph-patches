package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.data.BLiveLovePlanet;
import com.p051p1.mobile.putong.live.base.data.BLiveLovePlanetPlayerInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public class ifw {
    /* JADX INFO: renamed from: a */
    public static w2m m139750a(Context context, BLiveLovePlanet bLiveLovePlanet, HashMap<String, w2m> map) {
        String str;
        w2m w2mVar;
        if (bLiveLovePlanet == null || "unknown_".equals(bLiveLovePlanet.stage.toString()) || "prepare".equals(bLiveLovePlanet.stage.toString()) || "introduction".equals(bLiveLovePlanet.stage.toString()) || LovePlanetStage.choice.equals(bLiveLovePlanet.stage.toString())) {
            str = "stage_before_team";
            w2mVar = map.get("stage_before_team");
            if (w2mVar == null) {
                w2mVar = (w2m) LayoutInflater.from(context).inflate(yec0.f198918Sa, (ViewGroup) null);
            }
        } else if (NullChecker.m82486a(bLiveLovePlanet.teamInfos) && bLiveLovePlanet.teamInfos.size() == 2) {
            str = "stage_team_two";
            w2mVar = map.get("stage_team_two");
            if (w2mVar == null) {
                w2mVar = (w2m) LayoutInflater.from(context).inflate(yec0.f198942Ua, (ViewGroup) null);
            }
        } else {
            str = "stage_team_other";
            w2mVar = map.get("stage_team_other");
            if (w2mVar == null) {
                w2mVar = (w2m) p9r.m171370a(context).inflate(yec0.f198930Ta, (ViewGroup) null);
            }
        }
        map.put(str, w2mVar);
        return w2mVar;
    }

    /* JADX INFO: renamed from: b */
    public static String m139751b(BLiveLovePlanet bLiveLovePlanet, BLiveVoiceCall bLiveVoiceCall, BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo) {
        if (bLiveLovePlanet == null) {
            if (guk0.m132334m(bLiveVoiceCall)) {
                return "已申请";
            }
            return guk0.m132329h(bLiveVoiceCall) ? "" : "加入游戏";
        }
        String strM207631D0 = zrv.f205799a.m207631D0();
        String string = bLiveLovePlanet.stage.toString();
        boolean z = "prepare".equals(string) || "unknown_".equals(string);
        if (!NullChecker.m82486a(bLiveLovePlanet.host) || !TextUtils.equals(bLiveLovePlanet.host.userId, strM207631D0)) {
            if (NullChecker.m82486a(bLiveLovePlanetPlayerInfo) && !bLiveLovePlanetPlayerInfo.isLeave) {
                return "";
            }
            if (guk0.m132334m(bLiveVoiceCall)) {
                return "已申请";
            }
            return guk0.m132329h(bLiveVoiceCall) ? "" : "加入游戏";
        }
        if (z) {
            return "开始游戏";
        }
        if ("introduction".equals(string) || LovePlanetStage.choice.equals(string) || LovePlanetStage.result.equals(string)) {
            return "下一环节";
        }
        if ("trip".equals(string)) {
            return "";
        }
        return null;
    }
}
