package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserSource;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;

/* JADX INFO: loaded from: classes4.dex */
public class k25 {

    /* JADX INFO: renamed from: a */
    public static String f120690a = "chat_room_scene_live";

    /* JADX INFO: renamed from: b */
    public static String f120691b = "chat_room_scene_voice";

    /* JADX INFO: renamed from: a */
    public static int m144260a(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = m144264e(z);
        view.setLayoutParams(layoutParams);
        return layoutParams.width;
    }

    /* JADX INFO: renamed from: b */
    public static String m144261b(String str) {
        return str.replaceAll("\n|\r", "").trim();
    }

    /* JADX INFO: renamed from: c */
    public static int m144262c() {
        return xdl0.m208412y0() - t100.m186890d(146.0f);
    }

    /* JADX INFO: renamed from: d */
    public static int m144263d() {
        return l9e.m149017a();
    }

    /* JADX INFO: renamed from: e */
    public static int m144264e(boolean z) {
        if (!z) {
            return m144263d();
        }
        return Math.min(m144263d(), m144262c());
    }

    /* JADX INFO: renamed from: f */
    public static int m144265f(boolean z, View view, View view2, Boolean bool) {
        if (z) {
            return ((view2.getBottom() - (((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin + xdl0.m208412y0())) - l9e.f127092p) - (bool.booleanValue() ? 0 : xdl0.m208331F0());
        }
        return l9e.f127089m;
    }

    /* JADX INFO: renamed from: g */
    public static int m144266g(boolean z, View view, View view2, Boolean bool) {
        if (z) {
            return (((view2.getBottom() - (((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin + xdl0.m208412y0())) - (bool.booleanValue() ? 0 : xdl0.m208331F0())) - l9e.f127087k) - l9e.f127093q;
        }
        return l9e.f127077a;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m144267h() {
        Settings settings;
        User userM199329V = ypv.f199493a.m199329V();
        if (userM199329V == null || (settings = userM199329V.settings) == null) {
            return true;
        }
        if (TextUtils.isEmpty(settings.linkedPhoneNumber.number) && TextUtils.isEmpty(userM199329V.settings.phoneNumber.number)) {
            return TEnum.equals(userM199329V.source, "wechat") || TEnum.equals(userM199329V.source, "qq") || TEnum.equals(userM199329V.source, UserSource.network_security);
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m144268i(String str) {
        return TextUtils.equals(str, f120691b);
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r5v3, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r5v7, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r6v2, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: j */
    public static void m144269j(h4t h4tVar, LiveUserInfo liveUserInfo, long j, boolean z) {
        if (liveUserInfo == null || h4tVar == null || h4tVar.m206027E2() == 0) {
            return;
        }
        if (h4tVar.m206027E2().mo149813j().isVoiceLive()) {
            u4n0.m191752k(h4tVar, h4tVar.m206027E2().m132146l0().f56011id, liveUserInfo.userId);
        } else {
            h4tVar.m206028F2().OpenUserCardDialogEvent.show().mo172463j(UserCardData.builder(100).messageId(j).trackFrom("liveMessage").userId(liveUserInfo.userId).setSource("chat").setFromIdentity(bqq.m103386a(h4tVar, h4tVar.m206027E2().m132146l0().f56011id, liveUserInfo.userId, 100)).setTo(bqq.m103389d(h4tVar, h4tVar.m206027E2().m132146l0().f56011id, liveUserInfo.userId, 100)).setScene("live").build());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX INFO: renamed from: k */
    public static void m144270k(h4t h4tVar) {
        sds.C19911a c19911aM183543b = sds.m183540k().m183543b(h4tVar.m206027E2(), true);
        c19911aM183543b.m183546e("liveMessage");
        zcu.m218088c(h4tVar.mo77274R2(), c19911aM183543b.m183542a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX INFO: renamed from: l */
    public static void m144271l(h4t h4tVar, LiveMessage liveMessage) {
        sds.C19911a c19911aM183543b = sds.m183540k().m183543b(h4tVar.m206027E2(), false);
        c19911aM183543b.m183546e("liveMessage");
        c19911aM183543b.m183549h(liveMessage.extInfo.followUserId);
        zcu.m218088c(h4tVar.mo77274R2(), c19911aM183543b.m183542a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX INFO: renamed from: m */
    public static void m144272m(h4t h4tVar, LiveMessage liveMessage) {
        sds.C19911a c19911aM183543b = sds.m183540k().m183543b(h4tVar.m206027E2(), false);
        c19911aM183543b.m183546e(zcu.m218101p(liveMessage.getVoiceFollowSource()));
        c19911aM183543b.m183549h(liveMessage.extInfo.followUserId);
        zcu.m218088c(h4tVar.mo77274R2(), c19911aM183543b.m183542a());
    }
}
