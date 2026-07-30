package p149l;

import android.animation.Animator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.p053ui.match.MatchAct;
import com.p046p1.mobile.putong.core.p053ui.match.view.MatchSuccessNewLayout;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes3.dex */
public class vdx implements yvl<sdx> {

    /* JADX INFO: renamed from: a */
    public final MatchAct f181134a;

    /* JADX INFO: renamed from: b */
    public fyq f181135b;

    /* JADX INFO: renamed from: c */
    public int f181136c;

    /* JADX INFO: renamed from: d */
    public MatchSuccessNewLayout f181137d;

    /* JADX INFO: renamed from: e */
    public sdx f181138e;

    /* JADX INFO: renamed from: f */
    public boolean f181139f = false;

    public vdx(MatchAct matchAct) {
        this.f181134a = matchAct;
    }

    /* JADX INFO: renamed from: e */
    private void m198107e() {
        if (this.f181135b == null) {
            this.f181135b = new fyq(getAct());
        }
        getAct().getWindow().getDecorView().post(new Runnable() { // from class: l.udx
            @Override // java.lang.Runnable
            public final void run() {
                this.f175974a.m198111i();
            }
        });
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f181134a;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public MatchAct getAct() {
        return this.f181134a;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(sdx sdxVar) {
        this.f181138e = sdxVar;
    }

    @Override // p149l.yvl
    public Animator enterAnimation() {
        return bt0.m103737j(1);
    }

    @Override // p149l.yvl
    public Animator exitAnimation() {
        return bt0.m103737j(1);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Boolean m198110f() {
        return this.f181138e.m183579E0();
    }

    @Override // p149l.yvl
    /* JADX INFO: renamed from: h */
    public void mo129557h(int i, int i2) {
        int i3 = this.f181136c;
        if (i - i3 > 0 || i > 0) {
            if (NullChecker.m81303a(this.f181137d) && !this.f181139f) {
                this.f181137d.m47715b0(true, i);
            }
            this.f181139f = true;
        } else if (i - i3 < 0) {
            if (this.f181139f) {
                this.f181137d.m47715b0(false, i);
            }
            this.f181139f = false;
        }
        this.f181136c = i;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m198111i() {
        this.f181135b.m123795h();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        MatchSuccessNewLayout matchSuccessNewLayout = (MatchSuccessNewLayout) layoutInflater.inflate(f6c0.f95927o7, viewGroup, false);
        this.f181137d = matchSuccessNewLayout;
        return matchSuccessNewLayout;
    }

    /* JADX INFO: renamed from: j */
    public void m198112j() {
        if (NullChecker.m81303a(this.f181137d)) {
            this.f181137d.m47695G0();
        }
    }

    /* JADX INFO: renamed from: r */
    public void m198113r() {
        m198107e();
        this.f181137d.m47712Y(this.f181138e.m148671o0(), new v9j() { // from class: l.tdx
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f169774a.m198110f();
            }
        });
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.yvl
    public void initAnimationState() {
    }
}
