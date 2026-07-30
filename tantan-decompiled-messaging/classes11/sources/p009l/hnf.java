package p009l;

import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.p000p1.mobile.putong.core.newui.home.opt.CardAnimType;
import com.p000p1.mobile.putong.core.newui.home.opt.CardOperation;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.data.User;
import l.mah0;
import l.t100;
import l.upa;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class hnf extends fr2 {

    /* JADX INFO: renamed from: a */
    public static PathInterpolator f14183a = new PathInterpolator(0.57f, 0.0f, 0.55f, 1.0f);

    /* JADX INFO: renamed from: b */
    public static PathInterpolator f14184b = new PathInterpolator(0.32f, 0.4f, 0.55f, 1.0f);

    @Override // p009l.fr2
    /* JADX INFO: renamed from: a */
    public float mo14552a() {
        if (!upa.y() || mah0.s0().A0()) {
            return zo0.f23768H;
        }
        return 0.0f;
    }

    @Override // p009l.fr2
    /* JADX INFO: renamed from: b */
    public float mo14553b() {
        if (!upa.y() || mah0.s0().A0()) {
            return zo0.f23774N;
        }
        return 2.0f;
    }

    @Override // p009l.fr2
    /* JADX INFO: renamed from: c */
    public PathInterpolator mo14554c(float f) {
        return new PathInterpolator(0.0f, 0.0f, 0.58f, f);
    }

    @Override // p009l.fr2
    /* JADX INFO: renamed from: d */
    public Interpolator mo14555d() {
        return new PathInterpolator(0.0f, 0.0f, 0.58f, 1.0f);
    }

    @Override // p009l.fr2
    /* JADX INFO: renamed from: e */
    public PathInterpolator mo14556e(float f) {
        return new PathInterpolator(0.62f, 0.2f, 0.73f, 1.0f);
    }

    @Override // p009l.fr2
    /* JADX INFO: renamed from: f */
    public void mo14557f(og4 og4Var) {
        User userPa;
        super.mo14557f(og4Var);
        if (upa.Z2() && og4Var.m19746h() == CardAnimType.ANIM_OUT && og4Var.m19745g() == CardOperation.SWIPE_RIGHT && CoreModule.c.z2.r3()) {
            pol0 pol0VarM19747i = og4Var.m19747i();
            Object obj = pol0VarM19747i.f18802c;
            if (obj instanceof CoreSuggested.UserInfo) {
                CoreSuggested.UserInfo userInfo = (CoreSuggested.UserInfo) obj;
                if (userInfo.isVirtualCard() || (userPa = CoreModule.c.e0.Pa(userInfo.id)) == null) {
                    return;
                }
                qo0 qo0VarM19743e = og4Var.m19743e();
                if (og4Var.m19749k()) {
                    og4Var.m19754p(f14183a);
                    og4Var.m19755q(true);
                    qo0VarM19743e.f19402h = -5.0f;
                    qo0VarM19743e.f19398d = t100.d(120.0f);
                    qo0VarM19743e.f19396b = qo0VarM19743e.f19395a;
                    og4Var.m19753o(450L);
                    View view = pol0VarM19747i.f18800a;
                    psq.m20647R(userPa, view.getWidth(), view.getHeight(), view.getPivotX(), view.getPivotY(), qo0VarM19743e.f19398d, qo0VarM19743e.f19396b, qo0VarM19743e.f19402h);
                    return;
                }
                og4Var.m19754p(f14184b);
                if (qo0VarM19743e.f19398d >= t100.d(120.0f)) {
                    qo0VarM19743e.f19396b = qo0VarM19743e.f19395a;
                }
                float fMax = Math.max(t100.d(120.0f), qo0VarM19743e.f19397c);
                qo0VarM19743e.f19398d = fMax;
                og4Var.m19753o(Math.min(Math.max(100L, (long) (Math.abs(fMax - qo0VarM19743e.f19397c) * 2.5f)), 400L));
                View view2 = pol0VarM19747i.f18800a;
                psq.m20647R(userPa, view2.getWidth(), view2.getHeight(), view2.getPivotX(), view2.getPivotY(), qo0VarM19743e.f19398d, qo0VarM19743e.f19396b, qo0VarM19743e.f19402h);
            }
        }
    }

    @Override // p009l.fr2
    /* JADX INFO: renamed from: g */
    public long mo14558g() {
        return zo0.f23771K;
    }

    @Override // p009l.fr2
    /* JADX INFO: renamed from: h */
    public boolean mo14559h() {
        return zo0.f23773M;
    }

    @Override // p009l.fr2
    /* JADX INFO: renamed from: i */
    public boolean mo14560i() {
        return zo0.f23772L;
    }

    @Override // p009l.fr2
    /* JADX INFO: renamed from: j */
    public boolean mo14561j() {
        return zo0.f23770J;
    }
}
