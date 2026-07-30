package p149l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveKnightsInfosSummary;
import com.p046p1.mobile.putong.live.base.data.BLiveUserProfileConfig;
import com.p046p1.mobile.putong.live.livingroom.increment.knight.view.LiveGuardEntranceView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class qzj0<D extends ho2> implements s7m<tzj0<D>> {

    /* JADX INFO: renamed from: a */
    public hpd0 f157058a = new hpd0("has_anim_guard_shown_" + ypv.f199493a.m199309D0(), Boolean.FALSE);

    /* JADX INFO: renamed from: b */
    public tzj0<D> f157059b;

    /* JADX INFO: renamed from: c */
    public final LinearLayout f157060c;

    /* JADX INFO: renamed from: d */
    public LiveGuardEntranceView f157061d;

    public qzj0(LinearLayout linearLayout, LiveGuardEntranceView liveGuardEntranceView) {
        this.f157060c = linearLayout;
        this.f157061d = liveGuardEntranceView;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f157060c.getContext();
    }

    /* JADX INFO: renamed from: d */
    public final void m177225d() {
        this.f157061d.setAlpha(0.0f);
        xdl0.m208325C0(this.f157060c, t100.m186890d(1.0f));
        this.f157059b.m129320z3(1000L, new Runnable() { // from class: l.ozj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f146473a.m177228i();
            }
        });
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(tzj0<D> tzj0Var) {
        this.f157059b = tzj0Var;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m177227f(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        xdl0.m208325C0(this.f157060c, iIntValue);
        this.f157061d.setTranslationY(t100.m186890d(52.0f) - iIntValue);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m177228i() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(t100.m186890d(1.0f), t100.m186890d(52.0f));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.pzj0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f151958a.m177227f(valueAnimator);
            }
        });
        Animator animatorM103753z = bt0.m103753z(bt0.m103744q(this.f157061d, "alpha", 0.0f, 1.0f), valueAnimatorOfInt);
        animatorM103753z.setDuration(500L);
        animatorM103753z.start();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m177229j(Integer num, Integer num2) {
        if (num2.intValue() - num.intValue() != 3 || this.f157059b.m206026D2()) {
            return;
        }
        this.f157059b.m191204n4();
    }

    /* JADX INFO: renamed from: k */
    public void m177230k(boolean z, @Nullable BLiveData bLiveData, List<BLiveKnightsInfosSummary> list) {
        this.f157061d.m74643l0(z, bLiveData, list, this.f157059b.m206027E2().m132146l0().f56011id.equals(qib0.f154714c0.userId()));
    }

    /* JADX INFO: renamed from: l */
    public void m177231l(String str, @Nullable BLiveUserProfileConfig bLiveUserProfileConfig) {
        boolean z = NullChecker.m81303a(bLiveUserProfileConfig) && this.f157059b.m191202l4(bLiveUserProfileConfig, str);
        boolean z2 = NullChecker.m81303a(bLiveUserProfileConfig) && this.f157059b.m191201k4(bLiveUserProfileConfig);
        xdl0.m208344M(this.f157061d, z);
        xdl0.m208344M(this.f157060c, z);
        xdl0.m208357U(this.f157060c, z2 ? t100.f167260i : t100.f167266o);
        if (!z) {
            xdl0.m208344M(this.f157061d, false);
            return;
        }
        if (!this.f157058a.get().booleanValue()) {
            m177225d();
            this.f157058a.put(Boolean.TRUE);
        }
        this.f157061d.m74643l0(true, null, null, this.f157059b.m205087i0(qib0.f154714c0.userId()));
        this.f157059b.m191203m4();
        this.f157061d.setNextAction(new f30() { // from class: l.nzj0
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f141235a.m177229j((Integer) obj, (Integer) obj2);
            }
        });
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
