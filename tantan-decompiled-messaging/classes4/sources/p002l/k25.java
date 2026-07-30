package p002l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.p000p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import l.l9e;
import l.sds;
import l.t100;
import l.u4n0;
import l.xdl0;
import l.ypv;
import l.zcu;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class k25 {

    /* JADX INFO: renamed from: a */
    public static String f14172a = "chat_room_scene_live";

    /* JADX INFO: renamed from: b */
    public static String f14173b = "chat_room_scene_voice";

    /* JADX INFO: renamed from: a */
    public static int m16465a(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = m16469e(z);
        view.setLayoutParams(layoutParams);
        return layoutParams.width;
    }

    /* JADX INFO: renamed from: b */
    public static String m16466b(String str) {
        return str.replaceAll("\n|\r", "").trim();
    }

    /* JADX INFO: renamed from: c */
    public static int m16467c() {
        return xdl0.y0() - t100.d(146.0f);
    }

    /* JADX INFO: renamed from: d */
    public static int m16468d() {
        return l9e.a();
    }

    /* JADX INFO: renamed from: e */
    public static int m16469e(boolean z) {
        if (!z) {
            return m16468d();
        }
        return Math.min(m16468d(), m16467c());
    }

    /* JADX INFO: renamed from: f */
    public static int m16470f(boolean z, View view, View view2, Boolean bool) {
        if (z) {
            return ((view2.getBottom() - (((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin + xdl0.y0())) - l9e.p) - (bool.booleanValue() ? 0 : xdl0.F0());
        }
        return l9e.m;
    }

    /* JADX INFO: renamed from: g */
    public static int m16471g(boolean z, View view, View view2, Boolean bool) {
        if (z) {
            return (((view2.getBottom() - (((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin + xdl0.y0())) - (bool.booleanValue() ? 0 : xdl0.F0())) - l9e.k) - l9e.q;
        }
        return l9e.a;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m16472h() {
        Settings settings;
        User userV = ypv.a.V();
        if (userV == null || (settings = userV.settings) == null) {
            return true;
        }
        if (TextUtils.isEmpty(settings.linkedPhoneNumber.number) && TextUtils.isEmpty(userV.settings.phoneNumber.number)) {
            return TEnum.equals(userV.source, "wechat") || TEnum.equals(userV.source, "qq") || TEnum.equals(userV.source, "network-security");
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m16473i(String str) {
        return TextUtils.equals(str, f14173b);
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r5v3, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r5v7, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r6v2, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: j */
    public static void m16474j(h4t h4tVar, LiveUserInfo liveUserInfo, long j, boolean z) {
        if (liveUserInfo == null || h4tVar == null || h4tVar.m25547E2() == 0) {
            return;
        }
        if (h4tVar.m25547E2().m17234j().isVoiceLive()) {
            u4n0.k(h4tVar, ((DbObject) h4tVar.m25547E2().m14582l0()).id, liveUserInfo.userId);
        } else {
            h4tVar.m25548F2().OpenUserCardDialogEvent.show().j(UserCardData.builder(100).messageId(j).trackFrom("liveMessage").userId(liveUserInfo.userId).setSource("chat").setFromIdentity(bqq.m10554a(h4tVar, ((DbObject) h4tVar.m25547E2().m14582l0()).id, liveUserInfo.userId, 100)).setTo(bqq.m10557d(h4tVar, ((DbObject) h4tVar.m25547E2().m14582l0()).id, liveUserInfo.userId, 100)).setScene("live").build());
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX INFO: renamed from: k */
    public static void m16475k(h4t h4tVar) {
        sds.a aVarB = sds.k().b((ho2) h4tVar.m25547E2(), true);
        aVarB.e("liveMessage");
        zcu.c(h4tVar.mo21430R2(), aVarB.a());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX INFO: renamed from: l */
    public static void m16476l(h4t h4tVar, LiveMessage liveMessage) {
        sds.a aVarB = sds.k().b((ho2) h4tVar.m25547E2(), false);
        aVarB.e("liveMessage");
        aVarB.h(liveMessage.extInfo.followUserId);
        zcu.c(h4tVar.mo21430R2(), aVarB.a());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX INFO: renamed from: m */
    public static void m16477m(h4t h4tVar, LiveMessage liveMessage) {
        sds.a aVarB = sds.k().b((ho2) h4tVar.m25547E2(), false);
        aVarB.e(zcu.p(liveMessage.getVoiceFollowSource()));
        aVarB.h(liveMessage.extInfo.followUserId);
        zcu.c(h4tVar.mo21430R2(), aVarB.a());
    }
}
