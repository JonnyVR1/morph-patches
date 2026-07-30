package p149l;

import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.newui.home.opt.CardAnimType;
import com.p046p1.mobile.putong.core.newui.home.opt.CardOperation;
import com.p046p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes11.dex */
public class hnf extends fr2 {

    /* JADX INFO: renamed from: a */
    public static PathInterpolator f108614a = new PathInterpolator(0.57f, 0.0f, 0.55f, 1.0f);

    /* JADX INFO: renamed from: b */
    public static PathInterpolator f108615b = new PathInterpolator(0.32f, 0.4f, 0.55f, 1.0f);

    @Override // p149l.fr2
    /* JADX INFO: renamed from: a */
    public float mo122781a() {
        if (!upa.m194842y() || mah0.m153729s0().m153740A0()) {
            return zo0.f204044H;
        }
        return 0.0f;
    }

    @Override // p149l.fr2
    /* JADX INFO: renamed from: b */
    public float mo122782b() {
        if (!upa.m194842y() || mah0.m153729s0().m153740A0()) {
            return zo0.f204050N;
        }
        return 2.0f;
    }

    @Override // p149l.fr2
    /* JADX INFO: renamed from: c */
    public PathInterpolator mo122783c(float f) {
        return new PathInterpolator(0.0f, 0.0f, 0.58f, f);
    }

    @Override // p149l.fr2
    /* JADX INFO: renamed from: d */
    public Interpolator mo122784d() {
        return new PathInterpolator(0.0f, 0.0f, 0.58f, 1.0f);
    }

    @Override // p149l.fr2
    /* JADX INFO: renamed from: e */
    public PathInterpolator mo122785e(float f) {
        return new PathInterpolator(0.62f, 0.2f, 0.73f, 1.0f);
    }

    @Override // p149l.fr2
    /* JADX INFO: renamed from: f */
    public void mo122786f(og4 og4Var) {
        User userM169430Pa;
        super.mo122786f(og4Var);
        if (upa.m194723Z2() && og4Var.m164167h() == CardAnimType.ANIM_OUT && og4Var.m164166g() == CardOperation.SWIPE_RIGHT && CoreModule.f17545c.f19704z2.m30255r3()) {
            pol0 pol0VarM164168i = og4Var.m164168i();
            Object obj = pol0VarM164168i.f150532c;
            if (obj instanceof CoreSuggested.UserInfo) {
                CoreSuggested.UserInfo userInfo = (CoreSuggested.UserInfo) obj;
                if (userInfo.isVirtualCard() || (userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(userInfo.f19472id)) == null) {
                    return;
                }
                qo0 qo0VarM164164e = og4Var.m164164e();
                if (og4Var.m164170k()) {
                    og4Var.m164175p(f108614a);
                    og4Var.m164176q(true);
                    qo0VarM164164e.f155525h = -5.0f;
                    qo0VarM164164e.f155521d = t100.m186890d(120.0f);
                    qo0VarM164164e.f155519b = qo0VarM164164e.f155518a;
                    og4Var.m164174o(450L);
                    View view = pol0VarM164168i.f150530a;
                    psq.m171202R(userM169430Pa, view.getWidth(), view.getHeight(), view.getPivotX(), view.getPivotY(), qo0VarM164164e.f155521d, qo0VarM164164e.f155519b, qo0VarM164164e.f155525h);
                    return;
                }
                og4Var.m164175p(f108615b);
                if (qo0VarM164164e.f155521d >= t100.m186890d(120.0f)) {
                    qo0VarM164164e.f155519b = qo0VarM164164e.f155518a;
                }
                float fMax = Math.max(t100.m186890d(120.0f), qo0VarM164164e.f155520c);
                qo0VarM164164e.f155521d = fMax;
                og4Var.m164174o(Math.min(Math.max(100L, (long) (Math.abs(fMax - qo0VarM164164e.f155520c) * 2.5f)), 400L));
                View view2 = pol0VarM164168i.f150530a;
                psq.m171202R(userM169430Pa, view2.getWidth(), view2.getHeight(), view2.getPivotX(), view2.getPivotY(), qo0VarM164164e.f155521d, qo0VarM164164e.f155519b, qo0VarM164164e.f155525h);
            }
        }
    }

    @Override // p149l.fr2
    /* JADX INFO: renamed from: g */
    public long mo122787g() {
        return zo0.f204047K;
    }

    @Override // p149l.fr2
    /* JADX INFO: renamed from: h */
    public boolean mo122788h() {
        return zo0.f204049M;
    }

    @Override // p149l.fr2
    /* JADX INFO: renamed from: i */
    public boolean mo122789i() {
        return zo0.f204048L;
    }

    @Override // p149l.fr2
    /* JADX INFO: renamed from: j */
    public boolean mo122790j() {
        return zo0.f204046J;
    }
}
