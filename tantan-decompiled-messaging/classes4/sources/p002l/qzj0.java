package p002l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.increment.knight.view.LiveGuardEntranceView;
import com.p1.mobile.putong.live.base.data.BLiveData;
import com.p1.mobile.putong.live.base.data.BLiveKnightsInfosSummary;
import com.p1.mobile.putong.live.base.data.BLiveUserProfileConfig;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.bt0;
import l.f30;
import l.hpd0;
import l.qib0;
import l.s7m;
import l.t100;
import l.xdl0;
import l.ypv;
import p002l.ho2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class qzj0<D extends ho2> implements s7m<tzj0<D>> {

    /* JADX INFO: renamed from: a */
    public hpd0 f18289a = new hpd0("has_anim_guard_shown_" + ypv.a.D0(), Boolean.FALSE);

    /* JADX INFO: renamed from: b */
    public tzj0<D> f18290b;

    /* JADX INFO: renamed from: c */
    public final LinearLayout f18291c;

    /* JADX INFO: renamed from: d */
    public LiveGuardEntranceView f18292d;

    public qzj0(LinearLayout linearLayout, LiveGuardEntranceView liveGuardEntranceView) {
        this.f18291c = linearLayout;
        this.f18292d = liveGuardEntranceView;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m21639C0() {
        return this.f18291c.getContext();
    }

    /* JADX INFO: renamed from: d */
    public final void m21640d() {
        this.f18292d.setAlpha(0.0f);
        xdl0.C0(this.f18291c, t100.d(1.0f));
        this.f18290b.m14207z3(1000L, new Runnable() { // from class: l.ozj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f16919a.m21643i();
            }
        });
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void m21644i1(tzj0<D> tzj0Var) {
        this.f18290b = tzj0Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m21642f(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        xdl0.C0(this.f18291c, iIntValue);
        this.f18292d.setTranslationY(t100.d(52.0f) - iIntValue);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m21643i() {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(t100.d(1.0f), t100.d(52.0f));
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.pzj0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f17731a.m21642f(valueAnimator);
            }
        });
        Animator animatorZ = bt0.z(new Animator[]{bt0.q(this.f18292d, "alpha", new float[]{0.0f, 1.0f}), valueAnimatorOfInt});
        animatorZ.setDuration(500L);
        animatorZ.start();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m21645j(Integer num, Integer num2) {
        if (num2.intValue() - num.intValue() != 3 || this.f18290b.m25546D2()) {
            return;
        }
        this.f18290b.m23244n4();
    }

    /* JADX INFO: renamed from: k */
    public void m21646k(boolean z, @Nullable BLiveData bLiveData, List<BLiveKnightsInfosSummary> list) {
        this.f18292d.m8236l0(z, bLiveData, list, ((DbObject) this.f18290b.m25547E2().m14582l0()).id.equals(qib0.c0.userId()));
    }

    /* JADX INFO: renamed from: l */
    public void m21647l(String str, @Nullable BLiveUserProfileConfig bLiveUserProfileConfig) {
        boolean z = NullChecker.a(bLiveUserProfileConfig) && this.f18290b.m23242l4(bLiveUserProfileConfig, str);
        boolean z2 = NullChecker.a(bLiveUserProfileConfig) && this.f18290b.m23241k4(bLiveUserProfileConfig);
        xdl0.M(this.f18292d, z);
        xdl0.M(this.f18291c, z);
        xdl0.U(this.f18291c, z2 ? t100.i : t100.o);
        if (!z) {
            xdl0.M(this.f18292d, false);
            return;
        }
        if (!((Boolean) this.f18289a.get()).booleanValue()) {
            m21640d();
            this.f18289a.put(Boolean.TRUE);
        }
        this.f18292d.m8236l0(true, null, null, this.f18290b.m25337i0(qib0.c0.userId()));
        this.f18290b.m23243m4();
        this.f18292d.setNextAction(new f30() { // from class: l.nzj0
            public final void call(Object obj, Object obj2) {
                this.f16318a.m21645j((Integer) obj, (Integer) obj2);
            }
        });
    }

    public void destroy() {
    }
}
