package p149l;

import android.animation.Animator;
import android.view.View;
import android.widget.PopupWindow;
import com.google.android.material.badge.BadgeDrawable;
import com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class uys extends PopupWindow {

    /* JADX INFO: renamed from: a */
    public d30 f178906a;

    /* JADX INFO: renamed from: b */
    public d30 f178907b;

    /* JADX INFO: renamed from: c */
    public Animator f178908c;

    /* JADX INFO: renamed from: d */
    public Animator f178909d;

    /* JADX INFO: renamed from: e */
    public final LiveInternalPushBaseView f178910e;

    public uys(LiveInternalPushBaseView liveInternalPushBaseView) {
        super(xdl0.m208412y0(), -2);
        this.f178910e = liveInternalPushBaseView;
        setContentView(liveInternalPushBaseView);
        setAnimationStyle(v7c0.f180353H);
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        m196353f();
    }

    /* JADX INFO: renamed from: f */
    public final void m196353f() {
        Animator animator = this.f178909d;
        if (animator == null || !animator.isRunning()) {
            bt0.m103733f(this.f178909d, new Runnable() { // from class: l.pys
                @Override // java.lang.Runnable
                public final void run() {
                    this.f151891a.m196357j();
                }
            });
            this.f178909d.start();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m196354g() {
        Animator animator = this.f178909d;
        if (animator == null || !animator.isRunning()) {
            bt0.m103733f(this.f178909d, new Runnable() { // from class: l.tys
                @Override // java.lang.Runnable
                public final void run() {
                    this.f172624a.m196358k();
                }
            });
            this.f178909d.start();
        }
    }

    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void m196359l(PushMessageCustom pushMessageCustom) {
        Animator animator = this.f178909d;
        if (animator != null) {
            animator.cancel();
        }
        if (NullChecker.m81303a(this.f178907b)) {
            this.f178907b.call();
        }
    }

    @Override // android.widget.PopupWindow
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public LiveInternalPushBaseView getContentView() {
        return this.f178910e;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m196357j() {
        super.dismiss();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m196358k() {
        super.dismiss();
        getContentView().setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m196360m(View view) {
        dismiss();
        if (NullChecker.m81303a(this.f178906a)) {
            this.f178906a.call();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m196361n(d30 d30Var) {
        this.f178906a = d30Var;
    }

    /* JADX INFO: renamed from: o */
    public void m196362o(d30 d30Var) {
        this.f178907b = d30Var;
    }

    /* JADX INFO: renamed from: p */
    public void m196363p(View view, final PushMessageCustom pushMessageCustom, int i, int i2, Animator animator, Animator animator2) {
        Animator animator3 = this.f178908c;
        if (animator3 == null || !animator3.isRunning()) {
            this.f178908c = animator;
            this.f178909d = animator2;
            LiveInternalPushBaseView contentView = getContentView();
            contentView.setOnExitAction(new d30() { // from class: l.qys
                @Override // p149l.d30
                public final void call() {
                    this.f156951a.m196359l(pushMessageCustom);
                }
            });
            contentView.setOnDismissAction(new d30() { // from class: l.rys
                @Override // p149l.d30
                public final void call() {
                    this.f161581a.m196354g();
                }
            });
            if (getContentView().mo37830a()) {
                xdl0.m208329E0(getContentView(), new View.OnClickListener() { // from class: l.sys
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f166989a.m196360m(view2);
                    }
                });
            }
            animator.start();
            showAtLocation(view, BadgeDrawable.TOP_START, i, i2);
        }
    }
}
