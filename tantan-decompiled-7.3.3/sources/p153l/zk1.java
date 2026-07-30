package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.profile.photo.C8851b;
import com.p051p1.mobile.putong.core.p058ui.profile.photo.C8852c;
import com.p051p1.mobile.putong.core.p058ui.profile.photo.C8853d;
import com.p051p1.mobile.putong.core.p058ui.profile.photo.C8854e;
import com.p051p1.mobile.putong.core.view.AvatarUpdateType;

/* JADX INFO: loaded from: classes4.dex */
public class zk1 {
    /* JADX INFO: renamed from: a */
    public static xk1 m219992a(int i) {
        if (CoreModule.f18264c.f20381e0.m116541a8()) {
            return m219994c(i).m211333u();
        }
        if (xra.m212804w()) {
            return gta.m132210e().m132214d().mo34702I4() ? m219997f(i).m211333u() : m219994c(i).m211333u();
        }
        return m219995d(i).m211333u();
    }

    /* JADX INFO: renamed from: b */
    public static int m219993b() {
        if (CoreModule.f18264c.f20381e0.m116541a8()) {
            return xra.m212798q() ? 9 : 6;
        }
        return xra.m212804w() ? 9 : 6;
    }

    /* JADX INFO: renamed from: c */
    public static xk1.C21357a m219994c(int i) {
        return new xk1.C21357a().m211336x(kbc0.f124918v1).m211320A(i == 0 ? kbc0.f124909s1 : kbc0.f124903q1).m211335w(uqb0.f180386R.m184740c()).m211327H(new gsd(i)).m211322C(i > 0).m211321B(i > 0).m211331L(i == 0 ? "封面" : null).m211338z(new C8851b()).m211337y(i > 0).m211324E(true).m211332M(AvatarUpdateType.AVATAR).m211330K((String) jyb.m147507f0("真实的正面照", "户外照", "全身照", "兴趣爱好", "我的才艺", "我的宠物", "游戏战绩", "我的厨艺", "任意生活照").get(i)).m211329J(kbc0.f124927y1).m211325F(i < 6).m211334v(i == 1 || i == 2);
    }

    /* JADX INFO: renamed from: d */
    public static xk1.C21357a m219995d(int i) {
        return new xk1.C21357a().m211336x(kbc0.f124918v1).m211320A(kbc0.f124910t).m211335w(uqb0.f180386R.m184740c()).m211327H(new gsd(i)).m211322C(false).m211321B(false).m211331L(i == 0 ? "封面" : null).m211338z(new C8852c()).m211337y(true).m211324E(false).m211332M(AvatarUpdateType.AVATAR).m211330K((String) jyb.m147507f0("真实的正面照", "最好看的旅行照", "独一无二的才艺", "我的宠物或生活照", "最爱的美食", "我的有趣视频").get(i)).m211329J(((Integer) jyb.m147507f0(Integer.valueOf(CoreModule.f18264c.f20381e0.m116600p9().isFemale() ? kbc0.f124851b0 : kbc0.f124863e0), Integer.valueOf(kbc0.f124867f0), Integer.valueOf(kbc0.f124878i0), Integer.valueOf(kbc0.f124859d0), Integer.valueOf(kbc0.f124855c0), Integer.valueOf(kbc0.f124875h0)).get(i)).intValue()).m211325F(true).m211334v(false);
    }

    /* JADX INFO: renamed from: e */
    public static xk1.C21357a m219996e(int i) {
        return new xk1.C21357a().m211336x(kbc0.f124918v1).m211320A(kbc0.f124910t).m211335w(uqb0.f180386R.m184740c()).m211327H(new gsd(i)).m211322C(false).m211321B(false).m211331L(i == 0 ? "封面" : null).m211338z(new C8853d()).m211337y(!xra.m212798q() || i > 0).m211324E(xra.m212798q()).m211332M(AvatarUpdateType.AVATAR).m211330K((String) jyb.m147507f0("真实的正面照", "最好看的旅行照", "独一无二的才艺", "我的宠物或生活照", "最爱的美食", xra.m212798q() ? "我的有趣照片" : "我的有趣视频", null, null, null).get(i)).m211329J(((Integer) jyb.m147507f0(Integer.valueOf(CoreModule.f18264c.f20381e0.m116600p9().isFemale() ? kbc0.f124851b0 : kbc0.f124863e0), Integer.valueOf(kbc0.f124867f0), Integer.valueOf(kbc0.f124878i0), Integer.valueOf(kbc0.f124859d0), Integer.valueOf(kbc0.f124855c0), Integer.valueOf(kbc0.f124875h0), Integer.valueOf(kbc0.f124927y1), Integer.valueOf(kbc0.f124927y1), Integer.valueOf(kbc0.f124927y1)).get(i)).intValue()).m211325F(false).m211334v(false);
    }

    /* JADX INFO: renamed from: f */
    public static xk1.C21357a m219997f(int i) {
        return m219994c(i).m211326G(true).m211336x(kbc0.f124768A).m211338z(new C8854e()).m211331L(i == 0 ? "首图" : null).m211320A(0).m211328I(kbc0.f124774C).m211323D(kbc0.f124771B).m211330K((String) jyb.m147507f0("真实的正面照", "户外照", "全身照", "兴趣爱好", "我的才艺", "我的宠物", "游戏战绩", "我的厨艺", "任意生活照").get(i)).m211329J(kbc0.f124919w);
    }
}
