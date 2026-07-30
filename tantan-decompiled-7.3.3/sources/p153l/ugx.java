package p153l;

import android.animation.Animator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.p058ui.match.MatchAct;
import com.p051p1.mobile.putong.core.p058ui.match.view.MatchSuccessNewLayout;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes3.dex */
public class ugx implements qyl<rgx> {

    /* JADX INFO: renamed from: a */
    public final MatchAct f178941a;

    /* JADX INFO: renamed from: b */
    public f0r f178942b;

    /* JADX INFO: renamed from: c */
    public int f178943c;

    /* JADX INFO: renamed from: d */
    public MatchSuccessNewLayout f178944d;

    /* JADX INFO: renamed from: e */
    public rgx f178945e;

    /* JADX INFO: renamed from: f */
    public boolean f178946f = false;

    public ugx(MatchAct matchAct) {
        this.f178941a = matchAct;
    }

    /* JADX INFO: renamed from: e */
    private void m195954e() {
        if (this.f178942b == null) {
            this.f178942b = new f0r(getAct());
        }
        getAct().getWindow().getDecorView().post(new Runnable() { // from class: l.tgx
            @Override // java.lang.Runnable
            public final void run() {
                this.f174175a.m195958i();
            }
        });
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f178941a;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public MatchAct getAct() {
        return this.f178941a;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(rgx rgxVar) {
        this.f178945e = rgxVar;
    }

    @Override // p153l.qyl
    public Animator enterAnimation() {
        return gt0.m132164j(1);
    }

    @Override // p153l.qyl
    public Animator exitAnimation() {
        return gt0.m132164j(1);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Boolean m195957f() {
        return this.f178945e.m181512E0();
    }

    @Override // p153l.qyl
    /* JADX INFO: renamed from: h */
    public void mo114282h(int i, int i2) {
        int i3 = this.f178943c;
        if (i - i3 > 0 || i > 0) {
            if (NullChecker.m82486a(this.f178944d) && !this.f178946f) {
                this.f178944d.m48898b0(true, i);
            }
            this.f178946f = true;
        } else if (i - i3 < 0) {
            if (this.f178946f) {
                this.f178944d.m48898b0(false, i);
            }
            this.f178946f = false;
        }
        this.f178943c = i;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m195958i() {
        this.f178942b.m123510h();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        MatchSuccessNewLayout matchSuccessNewLayout = (MatchSuccessNewLayout) layoutInflater.inflate(kec0.f125998p7, viewGroup, false);
        this.f178944d = matchSuccessNewLayout;
        return matchSuccessNewLayout;
    }

    /* JADX INFO: renamed from: j */
    public void m195959j() {
        if (NullChecker.m82486a(this.f178944d)) {
            this.f178944d.m48878G0();
        }
    }

    /* JADX INFO: renamed from: r */
    public void m195960r() {
        m195954e();
        this.f178944d.m48895Y(this.f178945e.m148775o0(), new pcj() { // from class: l.sgx
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f168565a.m195957f();
            }
        });
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.qyl
    public void initAnimationState() {
    }
}
