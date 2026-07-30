package p153l;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.data.OMSFontStyle;
import com.p051p1.mobile.putong.live.base.data.BLiveMemberActivityData;
import com.p051p1.mobile.putong.live.base.data.BLiveResOperation;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class evo0 {
    /* JADX INFO: renamed from: a */
    public static String m122803a(String str, int i) {
        return str + "_index_" + i;
    }

    /* JADX INFO: renamed from: b */
    public static void m122804b(int i, String str) {
        i4g0.m138523u("e_start_audio_room_entrance", "p_audio_explore_recommend", new pf60("audio_tab_id", "0"), new pf60("entrance_type", m122803a(str, i)));
    }

    /* JADX INFO: renamed from: c */
    public static void m122805c() {
        i4g0.m138523u("e_start_audio_room_entrance", "p_audio_explore_recommend", new pf60("audio_tab_id", ""), new pf60("entrance_type", "top_right"));
    }

    /* JADX INFO: renamed from: d */
    public static void m122806d() {
        i4g0.m138492A("e_start_audio_room_entrance", "p_audio_explore_recommend", new pf60("audio_tab_id", ""), new pf60("entrance_type", "top_right"));
    }

    /* JADX INFO: renamed from: e */
    public static void m122807e(BLiveMemberActivityData bLiveMemberActivityData, boolean z, int i) {
        String str = "match";
        if (!"match".equals(bLiveMemberActivityData.relationStatus) && !"all".equals(bLiveMemberActivityData.relationStatus)) {
            if ("follow".equals(bLiveMemberActivityData.relationStatus)) {
                str = "follow_anchor";
            } else {
                str = "likeother".equals(bLiveMemberActivityData.relationStatus) ? "like" : "may_interest";
            }
        }
        String strM125970u = ((fk3) tbs.m190077m(itd0.f116820b)).m125970u();
        q4f q4fVar = new q4f();
        q4fVar.f155581s = "e_live_audio_room_enter";
        q4fVar.f155566d = z ? EventNameEnum.MODULE_CLICK : EventNameEnum.MODULE_VIEW;
        q4fVar.f155576n = "p_audio_follow";
        pf60 pf60Var = new pf60("anchorId", bLiveMemberActivityData.userId);
        pf60 pf60Var2 = new pf60("audio_card_type", "follow_entrance");
        pf60 pf60Var3 = new pf60("audio_room_type", "normal_audio");
        pf60 pf60Var4 = new pf60("audio_tab_id", TextUtils.isEmpty(strM125970u) ? "NA" : strM125970u);
        pf60 pf60Var5 = new pf60(FirebaseAnalytics.Param.INDEX, String.valueOf(i));
        pf60 pf60Var6 = new pf60("liveId", bLiveMemberActivityData.voiceLiveId);
        if (TextUtils.isEmpty(strM125970u)) {
            strM125970u = "NA";
        }
        i4g0.m138517o(q4fVar, pf60Var, pf60Var2, pf60Var3, pf60Var4, pf60Var5, pf60Var6, new pf60("topic_id", strM125970u), new pf60("is_audio_continue", Boolean.valueOf(!TextUtils.isEmpty(bLiveMemberActivityData.status))), new pf60("anchor_type", str));
    }

    /* JADX INFO: renamed from: f */
    public static void m122808f(j0v j0vVar, boolean z, boolean z2, boolean z3) {
        String str;
        if (j0vVar == null) {
            return;
        }
        int iM143031e = j0vVar.m143031e();
        boolean z4 = true;
        if (iM143031e == 0) {
            str = "unread_msg";
        } else {
            str = iM143031e == 1 ? "have_audio_available" : "no_audio_ available";
        }
        String str2 = "red_dot_small";
        Object objValueOf = "NA";
        if (j0vVar.m143032f() > 0) {
            if (j0vVar.m143034h()) {
                str2 = "red_dot_figure";
            }
        } else if (!"dot".equals(j0vVar.m143030d())) {
            str2 = "NA";
        }
        String strM125970u = ((fk3) tbs.m190077m(itd0.f116820b)).m125970u();
        q4f q4fVar = new q4f();
        q4fVar.f155581s = "e_audio_follow";
        q4fVar.f155566d = z ? EventNameEnum.MODULE_CLICK : EventNameEnum.MODULE_VIEW;
        q4fVar.f155576n = "p_audio_explore_recommend";
        ArrayList arrayList = new ArrayList();
        arrayList.add(new pf60(NotificationCompat.CATEGORY_STATUS, str));
        if (j0vVar.m143032f() <= 0 && !"dot".equals(j0vVar.m143030d())) {
            z4 = false;
        }
        arrayList.add(new pf60("is_show_red_dot", Boolean.valueOf(z4)));
        arrayList.add(new pf60("tooltips_type_ui", str2));
        if (TextUtils.isEmpty(strM125970u)) {
            strM125970u = "NA";
        }
        arrayList.add(new pf60("audio_tab_id", strM125970u));
        if (j0vVar.m143032f() > 0 && j0vVar.m143034h()) {
            objValueOf = Integer.valueOf(j0vVar.m143032f());
        }
        arrayList.add(new pf60("red_dot_num", objValueOf));
        if (z) {
            arrayList.add(new pf60("button_ui_status", z2 ? OMSFontStyle.light : "normal"));
            arrayList.add(new pf60("type", z3 ? BLiveResOperation.clear : "enter"));
        }
        i4g0.m138517o(q4fVar, (pf60[]) arrayList.toArray(new pf60[arrayList.size()]));
    }
}
