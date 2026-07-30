package p009l;

import android.animation.Animator;
import android.view.View;
import android.widget.PopupWindow;
import com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView;
import com.p1.mobile.putong.data.PushMessageCustom;
import com.tantanapp.common.utils.NullChecker;
import l.bt0;
import l.d30;
import l.v7c0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class uys extends PopupWindow {

    /* JADX INFO: renamed from: a */
    public d30 f21374a;

    /* JADX INFO: renamed from: b */
    public d30 f21375b;

    /* JADX INFO: renamed from: c */
    public Animator f21376c;

    /* JADX INFO: renamed from: d */
    public Animator f21377d;

    /* JADX INFO: renamed from: e */
    public final LiveInternalPushBaseView f21378e;

    public uys(LiveInternalPushBaseView liveInternalPushBaseView) {
        super(xdl0.y0(), -2);
        this.f21378e = liveInternalPushBaseView;
        setContentView(liveInternalPushBaseView);
        setAnimationStyle(v7c0.H);
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        m23195f();
    }

    /* JADX INFO: renamed from: f */
    public final void m23195f() {
        Animator animator = this.f21377d;
        if (animator == null || !animator.isRunning()) {
            bt0.f(this.f21377d, new Runnable() { // from class: l.pys
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18973a.m23199j();
                }
            });
            this.f21377d.start();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m23196g() {
        Animator animator = this.f21377d;
        if (animator == null || !animator.isRunning()) {
            bt0.f(this.f21377d, new Runnable() { // from class: l.tys
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20916a.m23200k();
                }
            });
            this.f21377d.start();
        }
    }

    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void m23201l(PushMessageCustom pushMessageCustom) {
        Animator animator = this.f21377d;
        if (animator != null) {
            animator.cancel();
        }
        if (NullChecker.a(this.f21375b)) {
            this.f21375b.call();
        }
    }

    @Override // android.widget.PopupWindow
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public LiveInternalPushBaseView getContentView() {
        return this.f21378e;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m23199j() {
        super.dismiss();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m23200k() {
        super.dismiss();
        getContentView().setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m23202m(View view) {
        dismiss();
        if (NullChecker.a(this.f21374a)) {
            this.f21374a.call();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m23203n(d30 d30Var) {
        this.f21374a = d30Var;
    }

    /* JADX INFO: renamed from: o */
    public void m23204o(d30 d30Var) {
        this.f21375b = d30Var;
    }

    /* JADX INFO: renamed from: p */
    public void m23205p(View view, final PushMessageCustom pushMessageCustom, int i, int i2, Animator animator, Animator animator2) {
        Animator animator3 = this.f21376c;
        if (animator3 == null || !animator3.isRunning()) {
            this.f21376c = animator;
            this.f21377d = animator2;
            LiveInternalPushBaseView contentView = getContentView();
            contentView.setOnExitAction(new d30() { // from class: l.qys
                public final void call() {
                    this.f19584a.m23201l(pushMessageCustom);
                }
            });
            contentView.setOnDismissAction(new d30() { // from class: l.rys
                public final void call() {
                    this.f20034a.m23196g();
                }
            });
            if (getContentView().mo1801a()) {
                xdl0.E0(getContentView(), new View.OnClickListener() { // from class: l.sys
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f20499a.m23202m(view2);
                    }
                });
            }
            animator.start();
            showAtLocation(view, 8388659, i, i2);
        }
    }
}
