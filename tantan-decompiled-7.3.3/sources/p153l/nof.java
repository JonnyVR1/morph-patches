package p153l;

import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.newui.home.opt.CardAnimType;
import com.p051p1.mobile.putong.core.newui.home.opt.CardOperation;
import com.p051p1.mobile.putong.data.User;

/* JADX INFO: loaded from: classes11.dex */
public class nof extends vr2 {

    /* JADX INFO: renamed from: a */
    public static PathInterpolator f142978a = new PathInterpolator(0.57f, 0.0f, 0.55f, 1.0f);

    /* JADX INFO: renamed from: b */
    public static PathInterpolator f142979b = new PathInterpolator(0.32f, 0.4f, 0.55f, 1.0f);

    @Override // p153l.vr2
    /* JADX INFO: renamed from: a */
    public float mo164116a() {
        if (!gra.m131773y() || uih0.m196223s0().m196234A0()) {
            return vo0.f184950H;
        }
        return 0.0f;
    }

    @Override // p153l.vr2
    /* JADX INFO: renamed from: b */
    public float mo164117b() {
        if (!gra.m131773y() || uih0.m196223s0().m196234A0()) {
            return vo0.f184956N;
        }
        return 2.0f;
    }

    @Override // p153l.vr2
    /* JADX INFO: renamed from: c */
    public PathInterpolator mo164118c(float f) {
        return new PathInterpolator(0.0f, 0.0f, 0.58f, f);
    }

    @Override // p153l.vr2
    /* JADX INFO: renamed from: d */
    public Interpolator mo164119d() {
        return new PathInterpolator(0.0f, 0.0f, 0.58f, 1.0f);
    }

    @Override // p153l.vr2
    /* JADX INFO: renamed from: e */
    public PathInterpolator mo164120e(float f) {
        return new PathInterpolator(0.62f, 0.2f, 0.73f, 1.0f);
    }

    @Override // p153l.vr2
    /* JADX INFO: renamed from: f */
    public void mo164121f(nh4 nh4Var) {
        User userM116503Pa;
        super.mo164121f(nh4Var);
        if (gra.m131654Z2() && nh4Var.m163033h() == CardAnimType.ANIM_OUT && nh4Var.m163032g() == CardOperation.SWIPE_RIGHT && CoreModule.f18264c.f20446z2.m31253r3()) {
            txl0 txl0VarM163034i = nh4Var.m163034i();
            Object obj = txl0VarM163034i.f176570c;
            if (obj instanceof CoreSuggested.UserInfo) {
                CoreSuggested.UserInfo userInfo = (CoreSuggested.UserInfo) obj;
                if (userInfo.isVirtualCard() || (userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(userInfo.f20214id)) == null) {
                    return;
                }
                mo0 mo0VarM163030e = nh4Var.m163030e();
                if (nh4Var.m163036k()) {
                    nh4Var.m163041p(f142978a);
                    nh4Var.m163042q(true);
                    mo0VarM163030e.f137760h = -5.0f;
                    mo0VarM163030e.f137756d = qa00.m175859d(120.0f);
                    mo0VarM163030e.f137754b = mo0VarM163030e.f137753a;
                    nh4Var.m163040o(450L);
                    View view = txl0VarM163034i.f176568a;
                    quq.m178182R(userM116503Pa, view.getWidth(), view.getHeight(), view.getPivotX(), view.getPivotY(), mo0VarM163030e.f137756d, mo0VarM163030e.f137754b, mo0VarM163030e.f137760h);
                    return;
                }
                nh4Var.m163041p(f142979b);
                if (mo0VarM163030e.f137756d >= qa00.m175859d(120.0f)) {
                    mo0VarM163030e.f137754b = mo0VarM163030e.f137753a;
                }
                float fMax = Math.max(qa00.m175859d(120.0f), mo0VarM163030e.f137755c);
                mo0VarM163030e.f137756d = fMax;
                nh4Var.m163040o(Math.min(Math.max(100L, (long) (Math.abs(fMax - mo0VarM163030e.f137755c) * 2.5f)), 400L));
                View view2 = txl0VarM163034i.f176568a;
                quq.m178182R(userM116503Pa, view2.getWidth(), view2.getHeight(), view2.getPivotX(), view2.getPivotY(), mo0VarM163030e.f137756d, mo0VarM163030e.f137754b, mo0VarM163030e.f137760h);
            }
        }
    }

    @Override // p153l.vr2
    /* JADX INFO: renamed from: g */
    public long mo164122g() {
        return vo0.f184953K;
    }

    @Override // p153l.vr2
    /* JADX INFO: renamed from: h */
    public boolean mo164123h() {
        return vo0.f184955M;
    }

    @Override // p153l.vr2
    /* JADX INFO: renamed from: i */
    public boolean mo164124i() {
        return vo0.f184954L;
    }

    @Override // p153l.vr2
    /* JADX INFO: renamed from: j */
    public boolean mo164125j() {
        return vo0.f184952J;
    }
}
