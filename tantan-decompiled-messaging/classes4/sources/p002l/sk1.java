package p002l;

import com.p000p1.mobile.putong.core.p001ui.profile.photo.C0113b;
import com.p000p1.mobile.putong.core.p001ui.profile.photo.C0114c;
import com.p000p1.mobile.putong.core.p001ui.profile.photo.C0115d;
import com.p000p1.mobile.putong.core.p001ui.profile.photo.C0116e;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.view.AvatarUpdateType;
import l.e3c0;
import l.lqa;
import l.qib0;
import l.ura;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class sk1 {
    /* JADX INFO: renamed from: a */
    public static qk1 m22497a(int i) {
        if (CoreModule.c.e0.a8()) {
            return m22499c(i).m21346u();
        }
        if (lqa.w()) {
            return ura.e().d().I4() ? m22502f(i).m21346u() : m22499c(i).m21346u();
        }
        return m22500d(i).m21346u();
    }

    /* JADX INFO: renamed from: b */
    public static int m22498b() {
        if (CoreModule.c.e0.a8()) {
            return lqa.q() ? 9 : 6;
        }
        return lqa.w() ? 9 : 6;
    }

    /* JADX INFO: renamed from: c */
    public static qk1.C0790a m22499c(int i) {
        return new qk1.C0790a().m21349x(e3c0.v1).m21333A(i == 0 ? e3c0.s1 : e3c0.q1).m21348w(qib0.R.c()).m21340H(new rqd(i)).m21335C(i > 0).m21334B(i > 0).m21344L(i == 0 ? "封面" : null).m21351z(new C0113b()).m21350y(i > 0).m21337E(true).m21345M(AvatarUpdateType.AVATAR).m21343K((String) vwb.f0(new String[]{"真实的正面照", "户外照", "全身照", "兴趣爱好", "我的才艺", "我的宠物", "游戏战绩", "我的厨艺", "任意生活照"}).get(i)).m21342J(e3c0.y1).m21338F(i < 6).m21347v(i == 1 || i == 2);
    }

    /* JADX INFO: renamed from: d */
    public static qk1.C0790a m22500d(int i) {
        return new qk1.C0790a().m21349x(e3c0.v1).m21333A(e3c0.t).m21348w(qib0.R.c()).m21340H(new rqd(i)).m21335C(false).m21334B(false).m21344L(i == 0 ? "封面" : null).m21351z(new C0114c()).m21350y(true).m21337E(false).m21345M(AvatarUpdateType.AVATAR).m21343K((String) vwb.f0(new String[]{"真实的正面照", "最好看的旅行照", "独一无二的才艺", "我的宠物或生活照", "最爱的美食", "我的有趣视频"}).get(i)).m21342J(((Integer) vwb.f0(new Integer[]{Integer.valueOf(CoreModule.c.e0.p9().isFemale() ? e3c0.b0 : e3c0.e0), Integer.valueOf(e3c0.f0), Integer.valueOf(e3c0.i0), Integer.valueOf(e3c0.d0), Integer.valueOf(e3c0.c0), Integer.valueOf(e3c0.h0)}).get(i)).intValue()).m21338F(true).m21347v(false);
    }

    /* JADX INFO: renamed from: e */
    public static qk1.C0790a m22501e(int i) {
        return new qk1.C0790a().m21349x(e3c0.v1).m21333A(e3c0.t).m21348w(qib0.R.c()).m21340H(new rqd(i)).m21335C(false).m21334B(false).m21344L(i == 0 ? "封面" : null).m21351z(new C0115d()).m21350y(!lqa.q() || i > 0).m21337E(lqa.q()).m21345M(AvatarUpdateType.AVATAR).m21343K((String) vwb.f0(new String[]{"真实的正面照", "最好看的旅行照", "独一无二的才艺", "我的宠物或生活照", "最爱的美食", lqa.q() ? "我的有趣照片" : "我的有趣视频", null, null, null}).get(i)).m21342J(((Integer) vwb.f0(new Integer[]{Integer.valueOf(CoreModule.c.e0.p9().isFemale() ? e3c0.b0 : e3c0.e0), Integer.valueOf(e3c0.f0), Integer.valueOf(e3c0.i0), Integer.valueOf(e3c0.d0), Integer.valueOf(e3c0.c0), Integer.valueOf(e3c0.h0), Integer.valueOf(e3c0.y1), Integer.valueOf(e3c0.y1), Integer.valueOf(e3c0.y1)}).get(i)).intValue()).m21338F(false).m21347v(false);
    }

    /* JADX INFO: renamed from: f */
    public static qk1.C0790a m22502f(int i) {
        return m22499c(i).m21339G(true).m21349x(e3c0.A).m21351z(new C0116e()).m21344L(i == 0 ? "首图" : null).m21333A(0).m21341I(e3c0.C).m21336D(e3c0.B).m21343K((String) vwb.f0(new String[]{"真实的正面照", "户外照", "全身照", "兴趣爱好", "我的才艺", "我的宠物", "游戏战绩", "我的厨艺", "任意生活照"}).get(i)).m21342J(e3c0.w);
    }
}
