package p153l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveKnightsInfosSummary;
import com.p051p1.mobile.putong.live.base.data.BLiveUserProfileConfig;
import com.p051p1.mobile.putong.live.livingroom.increment.knight.view.LiveGuardEntranceView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class w8k0<D extends oo2> implements iam<z8k0<D>> {

    /* JADX INFO: renamed from: a */
    public jxd0 f187862a = new jxd0("has_anim_guard_shown_" + zrv.f205799a.m207631D0(), Boolean.FALSE);

    /* JADX INFO: renamed from: b */
    public z8k0<D> f187863b;

    /* JADX INFO: renamed from: c */
    public final LinearLayout f187864c;

    /* JADX INFO: renamed from: d */
    public LiveGuardEntranceView f187865d;

    public w8k0(LinearLayout linearLayout, LiveGuardEntranceView liveGuardEntranceView) {
        this.f187864c = linearLayout;
        this.f187865d = liveGuardEntranceView;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f187864c.getContext();
    }

    /* JADX INFO: renamed from: d */
    public final void m205414d() {
        this.f187865d.setAlpha(0.0f);
        bnl0.m105505C0(this.f187864c, qa00.m175859d(1.0f));
        this.f187863b.m138879z3(1000L, new Runnable() { // from class: l.u8k0
            @Override // java.lang.Runnable
            public final void run() {
                this.f178055a.m205417i();
            }
        });
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(z8k0<D> z8k0Var) {
        this.f187863b = z8k0Var;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m205416f(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        bnl0.m105505C0(this.f187864c, iIntValue);
        this.f187865d.setTranslationY(qa00.m175859d(52.0f) - iIntValue);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m205417i() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(qa00.m175859d(1.0f), qa00.m175859d(52.0f));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.v8k0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f182880a.m205416f(valueAnimator);
            }
        });
        Animator animatorM132180z = gt0.m132180z(gt0.m132171q(this.f187865d, "alpha", 0.0f, 1.0f), valueAnimatorOfInt);
        animatorM132180z.setDuration(500L);
        animatorM132180z.start();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m205418j(Integer num, Integer num2) {
        if (num2.intValue() - num.intValue() != 3 || this.f187863b.m213809D2()) {
            return;
        }
        this.f187863b.m219007n4();
    }

    /* JADX INFO: renamed from: k */
    public void m205419k(boolean z, @Nullable BLiveData bLiveData, List<BLiveKnightsInfosSummary> list) {
        this.f187865d.m75826l0(z, bLiveData, list, this.f187863b.m213810E2().m168532l0().f56859id.equals(uqb0.f180397c0.userId()));
    }

    /* JADX INFO: renamed from: l */
    public void m205420l(String str, @Nullable BLiveUserProfileConfig bLiveUserProfileConfig) {
        boolean z = NullChecker.m82486a(bLiveUserProfileConfig) && this.f187863b.m219005l4(bLiveUserProfileConfig, str);
        boolean z2 = NullChecker.m82486a(bLiveUserProfileConfig) && this.f187863b.m219004k4(bLiveUserProfileConfig);
        bnl0.m105524M(this.f187865d, z);
        bnl0.m105524M(this.f187864c, z);
        bnl0.m105537U(this.f187864c, z2 ? qa00.f156322i : qa00.f156328o);
        if (!z) {
            bnl0.m105524M(this.f187865d, false);
            return;
        }
        if (!this.f187862a.get().booleanValue()) {
            m205414d();
            this.f187862a.put(Boolean.TRUE);
        }
        this.f187865d.m75826l0(true, null, null, this.f187863b.m159735i0(uqb0.f180397c0.userId()));
        this.f187863b.m219006m4();
        this.f187865d.setNextAction(new z20() { // from class: l.t8k0
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f172550a.m205418j((Integer) obj, (Integer) obj2);
            }
        });
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
