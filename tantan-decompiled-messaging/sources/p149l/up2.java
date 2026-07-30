package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.CallSuper;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import java.util.ArrayList;
import java.util.List;
import p149l.k4t;
import p149l.s7m;

/* JADX INFO: loaded from: classes5.dex */
public abstract class up2<V extends s7m<P>, P extends k4t<V>> {

    /* JADX INFO: renamed from: a */
    public bsm<? extends nnn0> f177562a;

    /* JADX INFO: renamed from: b */
    public P f177563b;

    /* JADX INFO: renamed from: c */
    public V f177564c;

    /* JADX INFO: renamed from: d */
    public final VirtualVoiceMotionType f177565d;

    /* JADX INFO: renamed from: e */
    public ViewGroup f177566e;

    /* JADX INFO: renamed from: f */
    public k4t f177567f;

    /* JADX INFO: renamed from: g */
    public up2<?, ?> f177568g;

    public up2(bsm<? extends nnn0> bsmVar, VirtualVoiceMotionType virtualVoiceMotionType) {
        this.f177562a = bsmVar;
        this.f177565d = virtualVoiceMotionType;
    }

    /* JADX INFO: renamed from: b */
    public boolean m194585b(VirtualVoiceMotionType virtualVoiceMotionType) {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public List<up2<?, ?>> m194586c() {
        return new ArrayList();
    }

    /* JADX INFO: renamed from: d */
    public void m194587d(k4t k4tVar, ViewGroup viewGroup) {
        this.f177567f = k4tVar;
        this.f177566e = viewGroup;
        View viewM194588e = m194588e();
        if (viewM194588e == null) {
            return;
        }
        viewGroup.removeAllViews();
        int i = xdl0.f192403e;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 8388611;
        mo194596r(viewGroup);
        xdl0.m208344M(viewGroup, true);
        viewGroup.addView(viewM194588e, layoutParams);
        viewGroup.setClipChildren(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public ViewGroup m194588e() {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f177562a.f77095a).inflate(mo105616g(), (ViewGroup) null);
        if (viewGroup instanceof s7m) {
            P p = (P) mo105617h();
            this.f177563b = p;
            V v2 = (V) viewGroup;
            this.f177564c = v2;
            if (p != null) {
                p.mo51532C(v2);
                pat<?> patVarM194592k = m194592k();
                k4t k4tVar = this.f177567f;
                if (patVarM194592k != null) {
                    k4tVar.m144512z2(patVarM194592k);
                    patVarM194592k.m144512z2(this.f177563b);
                    return viewGroup;
                }
                k4tVar.m144512z2(this.f177563b);
            }
        }
        return viewGroup;
    }

    /* JADX INFO: renamed from: g */
    public abstract int mo105616g();

    /* JADX INFO: renamed from: h */
    public abstract P mo105617h();

    /* JADX INFO: renamed from: i */
    public up2<?, ?> m194590i(final String str) {
        return (up2) vwb.m200346r(m194586c(), new w9j() { // from class: l.tp2
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((up2) obj).m194593l(str));
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public VirtualVoiceMotionType m194591j() {
        return this.f177565d;
    }

    /* JADX INFO: renamed from: k */
    public pat<?> m194592k() {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public boolean m194593l(String str) {
        return TEnum.equals(this.f177565d, str);
    }

    @CallSuper
    /* JADX INFO: renamed from: m */
    public void mo109608m(VirtualVoiceMotionType virtualVoiceMotionType) {
        up2<?, ?> up2VarM103864d = btl0.m103864d(m194586c(), virtualVoiceMotionType.toString());
        this.f177568g = up2VarM103864d;
        if (up2VarM103864d != null) {
            up2VarM103864d.mo109608m(virtualVoiceMotionType);
        }
    }

    @CallSuper
    /* JADX INFO: renamed from: n */
    public void m194594n() {
        k4t k4tVar;
        up2<?, ?> up2Var = this.f177568g;
        if (up2Var != null) {
            up2Var.m194594n();
        }
        ViewGroup viewGroup = this.f177566e;
        if (viewGroup != null) {
            if (viewGroup.getChildCount() != 0) {
                this.f177566e.removeAllViews();
            }
            xdl0.m208344M(this.f177566e, false);
        }
        P p = this.f177563b;
        if (p == null || (k4tVar = this.f177567f) == null) {
            return;
        }
        k4tVar.m144506C2(p);
        this.f177563b = null;
    }

    /* JADX INFO: renamed from: q */
    public void m194595q(k4t k4tVar, ViewGroup viewGroup) {
        up2<?, ?> up2Var = this.f177568g;
        if (up2Var != null) {
            up2Var.m194587d(k4tVar, viewGroup);
        }
    }

    /* JADX INFO: renamed from: r */
    public void mo194596r(ViewGroup viewGroup) {
    }

    /* JADX INFO: renamed from: f */
    public void m194589f() {
    }

    /* JADX INFO: renamed from: o */
    public void mo105618o() {
    }

    /* JADX INFO: renamed from: p */
    public void mo105619p() {
    }
}
