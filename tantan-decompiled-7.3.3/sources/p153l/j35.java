package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserSource;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;

/* JADX INFO: loaded from: classes4.dex */
public class j35 {

    /* JADX INFO: renamed from: a */
    public static String f118151a = "chat_room_scene_live";

    /* JADX INFO: renamed from: b */
    public static String f118152b = "chat_room_scene_voice";

    /* JADX INFO: renamed from: a */
    public static int m143316a(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = m143320e(z);
        view.setLayoutParams(layoutParams);
        return layoutParams.width;
    }

    /* JADX INFO: renamed from: b */
    public static String m143317b(String str) {
        return str.replaceAll("\n|\r", "").trim();
    }

    /* JADX INFO: renamed from: c */
    public static int m143318c() {
        return bnl0.m105592y0() - qa00.m175859d(146.0f);
    }

    /* JADX INFO: renamed from: d */
    public static int m143319d() {
        return pae.m171418a();
    }

    /* JADX INFO: renamed from: e */
    public static int m143320e(boolean z) {
        if (!z) {
            return m143319d();
        }
        return Math.min(m143319d(), m143318c());
    }

    /* JADX INFO: renamed from: f */
    public static int m143321f(boolean z, View view, View view2, Boolean bool) {
        if (z) {
            return ((view2.getBottom() - (((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin + bnl0.m105592y0())) - pae.f151272p) - (bool.booleanValue() ? 0 : bnl0.m105511F0());
        }
        return pae.f151269m;
    }

    /* JADX INFO: renamed from: g */
    public static int m143322g(boolean z, View view, View view2, Boolean bool) {
        if (z) {
            return (((view2.getBottom() - (((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin + bnl0.m105592y0())) - (bool.booleanValue() ? 0 : bnl0.m105511F0())) - pae.f151267k) - pae.f151273q;
        }
        return pae.f151257a;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m143323h() {
        Settings settings;
        User userM207651V = zrv.f205799a.m207651V();
        if (userM207651V == null || (settings = userM207651V.settings) == null) {
            return true;
        }
        if (TextUtils.isEmpty(settings.linkedPhoneNumber.number) && TextUtils.isEmpty(userM207651V.settings.phoneNumber.number)) {
            return TEnum.equals(userM207651V.source, "wechat") || TEnum.equals(userM207651V.source, "qq") || TEnum.equals(userM207651V.source, UserSource.network_security);
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m143324i(String str) {
        return TextUtils.equals(str, f118152b);
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r5v3, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r5v7, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r6v2, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: j */
    public static void m143325j(i6t i6tVar, LiveUserInfo liveUserInfo, long j, boolean z) {
        if (liveUserInfo == null || i6tVar == null || i6tVar.m213810E2() == 0) {
            return;
        }
        if (i6tVar.m213810E2().mo183435j().isVoiceLive()) {
            ydn0.m215258k(i6tVar, i6tVar.m213810E2().m168532l0().f56859id, liveUserInfo.userId);
        } else {
            i6tVar.m213811F2().OpenUserCardDialogEvent.show().mo199273j(UserCardData.builder(100).messageId(j).trackFrom("liveMessage").userId(liveUserInfo.userId).setSource("chat").setFromIdentity(csq.m112227a(i6tVar, i6tVar.m213810E2().m168532l0().f56859id, liveUserInfo.userId, 100)).setTo(csq.m112230d(i6tVar, i6tVar.m213810E2().m168532l0().f56859id, liveUserInfo.userId, 100)).setScene("live").build());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2] */
    /* JADX INFO: renamed from: k */
    public static void m143326k(i6t i6tVar) {
        tfs.C20303a c20303aM190972b = tfs.m190969k().m190972b(i6tVar.m213810E2(), true);
        c20303aM190972b.m190975e("liveMessage");
        afu.m97554c(i6tVar.mo78457R2(), c20303aM190972b.m190971a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2] */
    /* JADX INFO: renamed from: l */
    public static void m143327l(i6t i6tVar, LiveMessage liveMessage) {
        tfs.C20303a c20303aM190972b = tfs.m190969k().m190972b(i6tVar.m213810E2(), false);
        c20303aM190972b.m190975e("liveMessage");
        c20303aM190972b.m190978h(liveMessage.extInfo.followUserId);
        afu.m97554c(i6tVar.mo78457R2(), c20303aM190972b.m190971a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2] */
    /* JADX INFO: renamed from: m */
    public static void m143328m(i6t i6tVar, LiveMessage liveMessage) {
        tfs.C20303a c20303aM190972b = tfs.m190969k().m190972b(i6tVar.m213810E2(), false);
        c20303aM190972b.m190975e(afu.m97567p(liveMessage.getVoiceFollowSource()));
        c20303aM190972b.m190978h(liveMessage.extInfo.followUserId);
        afu.m97554c(i6tVar.mo78457R2(), c20303aM190972b.m190971a());
    }
}
