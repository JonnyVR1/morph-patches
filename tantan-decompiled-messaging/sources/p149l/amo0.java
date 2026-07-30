package p149l;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.data.OMSFontStyle;
import com.p046p1.mobile.putong.live.base.data.BLiveMemberActivityData;
import com.p046p1.mobile.putong.live.base.data.BLiveResOperation;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class amo0 {
    /* JADX INFO: renamed from: a */
    public static String m97564a(String str, int i) {
        return str + "_index_" + i;
    }

    /* JADX INFO: renamed from: b */
    public static void m97565b(int i, String str) {
        zvf0.m220399u("e_start_audio_room_entrance", "p_audio_explore_recommend", new j760("audio_tab_id", "0"), new j760("entrance_type", m97564a(str, i)));
    }

    /* JADX INFO: renamed from: c */
    public static void m97566c() {
        zvf0.m220399u("e_start_audio_room_entrance", "p_audio_explore_recommend", new j760("audio_tab_id", ""), new j760("entrance_type", "top_right"));
    }

    /* JADX INFO: renamed from: d */
    public static void m97567d() {
        zvf0.m220368A("e_start_audio_room_entrance", "p_audio_explore_recommend", new j760("audio_tab_id", ""), new j760("entrance_type", "top_right"));
    }

    /* JADX INFO: renamed from: e */
    public static void m97568e(BLiveMemberActivityData bLiveMemberActivityData, boolean z, int i) {
        String str = "match";
        if (!"match".equals(bLiveMemberActivityData.relationStatus) && !"all".equals(bLiveMemberActivityData.relationStatus)) {
            if ("follow".equals(bLiveMemberActivityData.relationStatus)) {
                str = "follow_anchor";
            } else {
                str = "likeother".equals(bLiveMemberActivityData.relationStatus) ? "like" : "may_interest";
            }
        }
        String strM159639u = ((nj3) s9s.m182763m(gld0.f103312b)).m159639u();
        l3f l3fVar = new l3f();
        l3fVar.f125900s = "e_live_audio_room_enter";
        l3fVar.f125885d = z ? EventNameEnum.MODULE_CLICK : EventNameEnum.MODULE_VIEW;
        l3fVar.f125895n = "p_audio_follow";
        j760 j760Var = new j760("anchorId", bLiveMemberActivityData.userId);
        j760 j760Var2 = new j760("audio_card_type", "follow_entrance");
        j760 j760Var3 = new j760("audio_room_type", "normal_audio");
        j760 j760Var4 = new j760("audio_tab_id", TextUtils.isEmpty(strM159639u) ? "NA" : strM159639u);
        j760 j760Var5 = new j760(FirebaseAnalytics.Param.INDEX, String.valueOf(i));
        j760 j760Var6 = new j760("liveId", bLiveMemberActivityData.voiceLiveId);
        if (TextUtils.isEmpty(strM159639u)) {
            strM159639u = "NA";
        }
        zvf0.m220393o(l3fVar, j760Var, j760Var2, j760Var3, j760Var4, j760Var5, j760Var6, new j760("topic_id", strM159639u), new j760("is_audio_continue", Boolean.valueOf(!TextUtils.isEmpty(bLiveMemberActivityData.status))), new j760("anchor_type", str));
    }

    /* JADX INFO: renamed from: f */
    public static void m97569f(iyu iyuVar, boolean z, boolean z2, boolean z3) {
        String str;
        if (iyuVar == null) {
            return;
        }
        int iM139016e = iyuVar.m139016e();
        boolean z4 = true;
        if (iM139016e == 0) {
            str = "unread_msg";
        } else {
            str = iM139016e == 1 ? "have_audio_available" : "no_audio_ available";
        }
        String str2 = "red_dot_small";
        Object objValueOf = "NA";
        if (iyuVar.m139017f() > 0) {
            if (iyuVar.m139019h()) {
                str2 = "red_dot_figure";
            }
        } else if (!"dot".equals(iyuVar.m139015d())) {
            str2 = "NA";
        }
        String strM159639u = ((nj3) s9s.m182763m(gld0.f103312b)).m159639u();
        l3f l3fVar = new l3f();
        l3fVar.f125900s = "e_audio_follow";
        l3fVar.f125885d = z ? EventNameEnum.MODULE_CLICK : EventNameEnum.MODULE_VIEW;
        l3fVar.f125895n = "p_audio_explore_recommend";
        ArrayList arrayList = new ArrayList();
        arrayList.add(new j760(NotificationCompat.CATEGORY_STATUS, str));
        if (iyuVar.m139017f() <= 0 && !"dot".equals(iyuVar.m139015d())) {
            z4 = false;
        }
        arrayList.add(new j760("is_show_red_dot", Boolean.valueOf(z4)));
        arrayList.add(new j760("tooltips_type_ui", str2));
        if (TextUtils.isEmpty(strM159639u)) {
            strM159639u = "NA";
        }
        arrayList.add(new j760("audio_tab_id", strM159639u));
        if (iyuVar.m139017f() > 0 && iyuVar.m139019h()) {
            objValueOf = Integer.valueOf(iyuVar.m139017f());
        }
        arrayList.add(new j760("red_dot_num", objValueOf));
        if (z) {
            arrayList.add(new j760("button_ui_status", z2 ? OMSFontStyle.light : "normal"));
            arrayList.add(new j760("type", z3 ? BLiveResOperation.clear : "enter"));
        }
        zvf0.m220393o(l3fVar, (j760[]) arrayList.toArray(new j760[arrayList.size()]));
    }
}
