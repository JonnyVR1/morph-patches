package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.profile.photo.C8688b;
import com.p046p1.mobile.putong.core.p053ui.profile.photo.C8689c;
import com.p046p1.mobile.putong.core.p053ui.profile.photo.C8690d;
import com.p046p1.mobile.putong.core.p053ui.profile.photo.C8691e;
import com.p046p1.mobile.putong.core.view.AvatarUpdateType;

/* JADX INFO: loaded from: classes4.dex */
public class sk1 {
    /* JADX INFO: renamed from: a */
    public static qk1 m184569a(int i) {
        if (CoreModule.f17545c.f19639e0.m169468a8()) {
            return m184571c(i).m175124u();
        }
        if (lqa.m150985w()) {
            return ura.m195053e().m195057d().mo33699I4() ? m184574f(i).m175124u() : m184571c(i).m175124u();
        }
        return m184572d(i).m175124u();
    }

    /* JADX INFO: renamed from: b */
    public static int m184570b() {
        if (CoreModule.f17545c.f19639e0.m169468a8()) {
            return lqa.m150979q() ? 9 : 6;
        }
        return lqa.m150985w() ? 9 : 6;
    }

    /* JADX INFO: renamed from: c */
    public static qk1.C19527a m184571c(int i) {
        return new qk1.C19527a().m175127x(e3c0.f89155v1).m175111A(i == 0 ? e3c0.f89146s1 : e3c0.f89140q1).m175126w(qib0.f154703R.m94727c()).m175118H(new rqd(i)).m175113C(i > 0).m175112B(i > 0).m175122L(i == 0 ? "封面" : null).m175129z(new C8688b()).m175128y(i > 0).m175115E(true).m175123M(AvatarUpdateType.AVATAR).m175121K((String) vwb.m200324f0("真实的正面照", "户外照", "全身照", "兴趣爱好", "我的才艺", "我的宠物", "游戏战绩", "我的厨艺", "任意生活照").get(i)).m175120J(e3c0.f89164y1).m175116F(i < 6).m175125v(i == 1 || i == 2);
    }

    /* JADX INFO: renamed from: d */
    public static qk1.C19527a m184572d(int i) {
        return new qk1.C19527a().m175127x(e3c0.f89155v1).m175111A(e3c0.f89147t).m175126w(qib0.f154703R.m94727c()).m175118H(new rqd(i)).m175113C(false).m175112B(false).m175122L(i == 0 ? "封面" : null).m175129z(new C8689c()).m175128y(true).m175115E(false).m175123M(AvatarUpdateType.AVATAR).m175121K((String) vwb.m200324f0("真实的正面照", "最好看的旅行照", "独一无二的才艺", "我的宠物或生活照", "最爱的美食", "我的有趣视频").get(i)).m175120J(((Integer) vwb.m200324f0(Integer.valueOf(CoreModule.f17545c.f19639e0.m169527p9().isFemale() ? e3c0.f89088b0 : e3c0.f89100e0), Integer.valueOf(e3c0.f89104f0), Integer.valueOf(e3c0.f89115i0), Integer.valueOf(e3c0.f89096d0), Integer.valueOf(e3c0.f89092c0), Integer.valueOf(e3c0.f89112h0)).get(i)).intValue()).m175116F(true).m175125v(false);
    }

    /* JADX INFO: renamed from: e */
    public static qk1.C19527a m184573e(int i) {
        return new qk1.C19527a().m175127x(e3c0.f89155v1).m175111A(e3c0.f89147t).m175126w(qib0.f154703R.m94727c()).m175118H(new rqd(i)).m175113C(false).m175112B(false).m175122L(i == 0 ? "封面" : null).m175129z(new C8690d()).m175128y(!lqa.m150979q() || i > 0).m175115E(lqa.m150979q()).m175123M(AvatarUpdateType.AVATAR).m175121K((String) vwb.m200324f0("真实的正面照", "最好看的旅行照", "独一无二的才艺", "我的宠物或生活照", "最爱的美食", lqa.m150979q() ? "我的有趣照片" : "我的有趣视频", null, null, null).get(i)).m175120J(((Integer) vwb.m200324f0(Integer.valueOf(CoreModule.f17545c.f19639e0.m169527p9().isFemale() ? e3c0.f89088b0 : e3c0.f89100e0), Integer.valueOf(e3c0.f89104f0), Integer.valueOf(e3c0.f89115i0), Integer.valueOf(e3c0.f89096d0), Integer.valueOf(e3c0.f89092c0), Integer.valueOf(e3c0.f89112h0), Integer.valueOf(e3c0.f89164y1), Integer.valueOf(e3c0.f89164y1), Integer.valueOf(e3c0.f89164y1)).get(i)).intValue()).m175116F(false).m175125v(false);
    }

    /* JADX INFO: renamed from: f */
    public static qk1.C19527a m184574f(int i) {
        return m184571c(i).m175117G(true).m175127x(e3c0.f89005A).m175129z(new C8691e()).m175122L(i == 0 ? "首图" : null).m175111A(0).m175119I(e3c0.f89011C).m175114D(e3c0.f89008B).m175121K((String) vwb.m200324f0("真实的正面照", "户外照", "全身照", "兴趣爱好", "我的才艺", "我的宠物", "游戏战绩", "我的厨艺", "任意生活照").get(i)).m175120J(e3c0.f89156w);
    }
}
