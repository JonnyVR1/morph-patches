package p153l;

import android.animation.Animator;
import android.view.View;
import android.widget.PopupWindow;
import com.google.android.material.badge.BadgeDrawable;
import com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class v0t extends PopupWindow {

    /* JADX INFO: renamed from: a */
    public x20 f181893a;

    /* JADX INFO: renamed from: b */
    public x20 f181894b;

    /* JADX INFO: renamed from: c */
    public Animator f181895c;

    /* JADX INFO: renamed from: d */
    public Animator f181896d;

    /* JADX INFO: renamed from: e */
    public final LiveInternalPushBaseView f181897e;

    public v0t(LiveInternalPushBaseView liveInternalPushBaseView) {
        super(bnl0.m105592y0(), -2);
        this.f181897e = liveInternalPushBaseView;
        setContentView(liveInternalPushBaseView);
        setAnimationStyle(agc0.f71114H);
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        m198918f();
    }

    /* JADX INFO: renamed from: f */
    public final void m198918f() {
        Animator animator = this.f181896d;
        if (animator == null || !animator.isRunning()) {
            gt0.m132160f(this.f181896d, new Runnable() { // from class: l.q0t
                @Override // java.lang.Runnable
                public final void run() {
                    this.f155083a.m198922j();
                }
            });
            this.f181896d.start();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m198919g() {
        Animator animator = this.f181896d;
        if (animator == null || !animator.isRunning()) {
            gt0.m132160f(this.f181896d, new Runnable() { // from class: l.u0t
                @Override // java.lang.Runnable
                public final void run() {
                    this.f176934a.m198923k();
                }
            });
            this.f181896d.start();
        }
    }

    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void m198924l(PushMessageCustom pushMessageCustom) {
        Animator animator = this.f181896d;
        if (animator != null) {
            animator.cancel();
        }
        if (NullChecker.m82486a(this.f181894b)) {
            this.f181894b.call();
        }
    }

    @Override // android.widget.PopupWindow
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public LiveInternalPushBaseView getContentView() {
        return this.f181897e;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m198922j() {
        super.dismiss();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m198923k() {
        super.dismiss();
        getContentView().setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m198925m(View view) {
        dismiss();
        if (NullChecker.m82486a(this.f181893a)) {
            this.f181893a.call();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m198926n(x20 x20Var) {
        this.f181893a = x20Var;
    }

    /* JADX INFO: renamed from: o */
    public void m198927o(x20 x20Var) {
        this.f181894b = x20Var;
    }

    /* JADX INFO: renamed from: p */
    public void m198928p(View view, final PushMessageCustom pushMessageCustom, int i, int i2, Animator animator, Animator animator2) {
        Animator animator3 = this.f181895c;
        if (animator3 == null || !animator3.isRunning()) {
            this.f181895c = animator;
            this.f181896d = animator2;
            LiveInternalPushBaseView contentView = getContentView();
            contentView.setOnExitAction(new x20() { // from class: l.r0t
                @Override // p153l.x20
                public final void call() {
                    this.f160668a.m198924l(pushMessageCustom);
                }
            });
            contentView.setOnDismissAction(new x20() { // from class: l.s0t
                @Override // p153l.x20
                public final void call() {
                    this.f165730a.m198919g();
                }
            });
            if (getContentView().mo38833a()) {
                bnl0.m105509E0(getContentView(), new View.OnClickListener() { // from class: l.t0t
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f171560a.m198925m(view2);
                    }
                });
            }
            animator.start();
            showAtLocation(view, BadgeDrawable.TOP_START, i, i2);
        }
    }
}
