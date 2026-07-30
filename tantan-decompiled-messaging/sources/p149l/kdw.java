package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.data.BLiveLovePlanet;
import com.p046p1.mobile.putong.live.base.data.BLiveLovePlanetPlayerInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public class kdw {
    /* JADX INFO: renamed from: a */
    public static c0m m145692a(Context context, BLiveLovePlanet bLiveLovePlanet, HashMap<String, c0m> map) {
        String str;
        c0m c0mVar;
        if (bLiveLovePlanet == null || "unknown_".equals(bLiveLovePlanet.stage.toString()) || "prepare".equals(bLiveLovePlanet.stage.toString()) || "introduction".equals(bLiveLovePlanet.stage.toString()) || LovePlanetStage.choice.equals(bLiveLovePlanet.stage.toString())) {
            str = "stage_before_team";
            c0mVar = map.get("stage_before_team");
            if (c0mVar == null) {
                c0mVar = (c0m) LayoutInflater.from(context).inflate(t6c0.f168186Sa, (ViewGroup) null);
            }
        } else if (NullChecker.m81303a(bLiveLovePlanet.teamInfos) && bLiveLovePlanet.teamInfos.size() == 2) {
            str = "stage_team_two";
            c0mVar = map.get("stage_team_two");
            if (c0mVar == null) {
                c0mVar = (c0m) LayoutInflater.from(context).inflate(t6c0.f168210Ua, (ViewGroup) null);
            }
        } else {
            str = "stage_team_other";
            c0mVar = map.get("stage_team_other");
            if (c0mVar == null) {
                c0mVar = (c0m) o7r.m163037a(context).inflate(t6c0.f168198Ta, (ViewGroup) null);
            }
        }
        map.put(str, c0mVar);
        return c0mVar;
    }

    /* JADX INFO: renamed from: b */
    public static String m145693b(BLiveLovePlanet bLiveLovePlanet, BLiveVoiceCall bLiveVoiceCall, BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo) {
        if (bLiveLovePlanet == null) {
            if (alk0.m97314m(bLiveVoiceCall)) {
                return "已申请";
            }
            return alk0.m97309h(bLiveVoiceCall) ? "" : "加入游戏";
        }
        String strM199309D0 = ypv.f199493a.m199309D0();
        String string = bLiveLovePlanet.stage.toString();
        boolean z = "prepare".equals(string) || "unknown_".equals(string);
        if (!NullChecker.m81303a(bLiveLovePlanet.host) || !TextUtils.equals(bLiveLovePlanet.host.userId, strM199309D0)) {
            if (NullChecker.m81303a(bLiveLovePlanetPlayerInfo) && !bLiveLovePlanetPlayerInfo.isLeave) {
                return "";
            }
            if (alk0.m97314m(bLiveVoiceCall)) {
                return "已申请";
            }
            return alk0.m97309h(bLiveVoiceCall) ? "" : "加入游戏";
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
