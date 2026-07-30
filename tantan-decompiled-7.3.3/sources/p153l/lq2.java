package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.CallSuper;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import java.util.ArrayList;
import java.util.List;
import p153l.iam;
import p153l.l6t;

/* JADX INFO: loaded from: classes5.dex */
public abstract class lq2<V extends iam<P>, P extends l6t<V>> {

    /* JADX INFO: renamed from: a */
    public dum<? extends rwn0> f133135a;

    /* JADX INFO: renamed from: b */
    public P f133136b;

    /* JADX INFO: renamed from: c */
    public V f133137c;

    /* JADX INFO: renamed from: d */
    public final VirtualVoiceMotionType f133138d;

    /* JADX INFO: renamed from: e */
    public ViewGroup f133139e;

    /* JADX INFO: renamed from: f */
    public l6t f133140f;

    /* JADX INFO: renamed from: g */
    public lq2<?, ?> f133141g;

    public lq2(dum<? extends rwn0> dumVar, VirtualVoiceMotionType virtualVoiceMotionType) {
        this.f133135a = dumVar;
        this.f133138d = virtualVoiceMotionType;
    }

    /* JADX INFO: renamed from: b */
    public boolean m155303b(VirtualVoiceMotionType virtualVoiceMotionType) {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public List<lq2<?, ?>> m155304c() {
        return new ArrayList();
    }

    /* JADX INFO: renamed from: d */
    public void m155305d(l6t l6tVar, ViewGroup viewGroup) {
        this.f133140f = l6tVar;
        this.f133139e = viewGroup;
        View viewM155306e = m155306e();
        if (viewM155306e == null) {
            return;
        }
        viewGroup.removeAllViews();
        int i = bnl0.f77544e;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 8388611;
        mo146834r(viewGroup);
        bnl0.m105524M(viewGroup, true);
        viewGroup.addView(viewM155306e, layoutParams);
        viewGroup.setClipChildren(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public ViewGroup m155306e() {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f133135a.f90815a).inflate(mo129542g(), (ViewGroup) null);
        if (viewGroup instanceof iam) {
            P p = (P) mo129543h();
            this.f133136b = p;
            V v2 = (V) viewGroup;
            this.f133137c = v2;
            if (p != null) {
                p.mo52715C(v2);
                qct<?> qctVarM155310k = m155310k();
                l6t l6tVar = this.f133140f;
                if (qctVarM155310k != null) {
                    l6tVar.m153103z2(qctVarM155310k);
                    qctVarM155310k.m153103z2(this.f133136b);
                    return viewGroup;
                }
                l6tVar.m153103z2(this.f133136b);
            }
        }
        return viewGroup;
    }

    /* JADX INFO: renamed from: g */
    public abstract int mo129542g();

    /* JADX INFO: renamed from: h */
    public abstract P mo129543h();

    /* JADX INFO: renamed from: i */
    public lq2<?, ?> m155308i(final String str) {
        return (lq2) jyb.m147529r(m155304c(), new qcj() { // from class: l.kq2
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((lq2) obj).m155311l(str));
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public VirtualVoiceMotionType m155309j() {
        return this.f133138d;
    }

    /* JADX INFO: renamed from: k */
    public qct<?> m155310k() {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public boolean m155311l(String str) {
        return TEnum.equals(this.f133138d, str);
    }

    @CallSuper
    /* JADX INFO: renamed from: m */
    public void mo129544m(VirtualVoiceMotionType virtualVoiceMotionType) {
        lq2<?, ?> lq2VarM123634d = f2m0.m123634d(m155304c(), virtualVoiceMotionType.toString());
        this.f133141g = lq2VarM123634d;
        if (lq2VarM123634d != null) {
            lq2VarM123634d.mo129544m(virtualVoiceMotionType);
        }
    }

    @CallSuper
    /* JADX INFO: renamed from: n */
    public void m155312n() {
        l6t l6tVar;
        lq2<?, ?> lq2Var = this.f133141g;
        if (lq2Var != null) {
            lq2Var.m155312n();
        }
        ViewGroup viewGroup = this.f133139e;
        if (viewGroup != null) {
            if (viewGroup.getChildCount() != 0) {
                this.f133139e.removeAllViews();
            }
            bnl0.m105524M(this.f133139e, false);
        }
        P p = this.f133136b;
        if (p == null || (l6tVar = this.f133140f) == null) {
            return;
        }
        l6tVar.m153097C2(p);
        this.f133136b = null;
    }

    /* JADX INFO: renamed from: q */
    public void m155313q(l6t l6tVar, ViewGroup viewGroup) {
        lq2<?, ?> lq2Var = this.f133141g;
        if (lq2Var != null) {
            lq2Var.m155305d(l6tVar, viewGroup);
        }
    }

    /* JADX INFO: renamed from: r */
    public void mo146834r(ViewGroup viewGroup) {
    }

    /* JADX INFO: renamed from: f */
    public void m155307f() {
    }

    /* JADX INFO: renamed from: o */
    public void mo129545o() {
    }

    /* JADX INFO: renamed from: p */
    public void mo129546p() {
    }
}
