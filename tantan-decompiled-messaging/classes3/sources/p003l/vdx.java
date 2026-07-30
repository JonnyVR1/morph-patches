package p003l;

import android.animation.Animator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.match.MatchAct;
import com.p000p1.mobile.putong.core.p001ui.match.view.MatchSuccessNewLayout;
import com.tantanapp.common.utils.NullChecker;
import l.bt0;
import l.f6c0;
import l.fyq;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class vdx implements yvl<sdx> {

    /* JADX INFO: renamed from: a */
    public final MatchAct f8317a;

    /* JADX INFO: renamed from: b */
    public fyq f8318b;

    /* JADX INFO: renamed from: c */
    public int f8319c;

    /* JADX INFO: renamed from: d */
    public MatchSuccessNewLayout f8320d;

    /* JADX INFO: renamed from: e */
    public sdx f8321e;

    /* JADX INFO: renamed from: f */
    public boolean f8322f = false;

    public vdx(MatchAct matchAct) {
        this.f8317a = matchAct;
    }

    /* JADX INFO: renamed from: e */
    private void m8373e() {
        if (this.f8318b == null) {
            this.f8318b = new fyq(act());
        }
        act().getWindow().getDecorView().post(new Runnable() { // from class: l.udx
            @Override // java.lang.Runnable
            public final void run() {
                this.f7969a.m8378i();
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m8374C0() {
        return this.f8317a;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public MatchAct act() {
        return this.f8317a;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m8379i1(sdx sdxVar) {
        this.f8321e = sdxVar;
    }

    @Override // p003l.yvl
    public Animator enterAnimation() {
        return bt0.j(1);
    }

    @Override // p003l.yvl
    public Animator exitAnimation() {
        return bt0.j(1);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Boolean m8377f() {
        return this.f8321e.m7558E0();
    }

    @Override // p003l.yvl
    /* JADX INFO: renamed from: h */
    public void mo4943h(int i, int i2) {
        int i3 = this.f8319c;
        if (i - i3 > 0 || i > 0) {
            if (NullChecker.a(this.f8320d) && !this.f8322f) {
                this.f8320d.m779b0(true, i);
            }
            this.f8322f = true;
        } else if (i - i3 < 0) {
            if (this.f8322f) {
                this.f8320d.m779b0(false, i);
            }
            this.f8322f = false;
        }
        this.f8319c = i;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m8378i() {
        this.f8318b.h();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        MatchSuccessNewLayout matchSuccessNewLayout = (MatchSuccessNewLayout) layoutInflater.inflate(f6c0.o7, viewGroup, false);
        this.f8320d = matchSuccessNewLayout;
        return matchSuccessNewLayout;
    }

    /* JADX INFO: renamed from: j */
    public void m8380j() {
        if (NullChecker.a(this.f8320d)) {
            this.f8320d.m759G0();
        }
    }

    /* JADX INFO: renamed from: r */
    public void m8381r() {
        m8373e();
        this.f8320d.m776Y(this.f8321e.m5985o0(), new v9j() { // from class: l.tdx
            @Override // p003l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f7456a.m8377f();
            }
        });
    }

    public void destroy() {
    }

    @Override // p003l.yvl
    public void initAnimationState() {
    }
}
