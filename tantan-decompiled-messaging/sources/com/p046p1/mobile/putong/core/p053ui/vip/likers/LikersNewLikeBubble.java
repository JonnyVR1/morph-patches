package com.p046p1.mobile.putong.core.p053ui.vip.likers;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p149l.bt0;
import p149l.qjr;
import p149l.t100;

/* JADX INFO: loaded from: classes9.dex */
public class LikersNewLikeBubble extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f37317a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f37318b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f37319c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f37320d;

    /* JADX INFO: renamed from: e */
    public View f37321e;

    /* JADX INFO: renamed from: f */
    public View f37322f;

    /* JADX INFO: renamed from: g */
    public View f37323g;

    /* JADX INFO: renamed from: h */
    public Animator f37324h;

    /* JADX INFO: renamed from: i */
    public Animator f37325i;

    public LikersNewLikeBubble(Context context) {
        super(context);
    }

    private Animator getAnimatorDismiss() {
        if (NullChecker.m81303a(this.f37325i)) {
            this.f37325i.cancel();
        }
        Animator animatorM103743p = bt0.m103743p(this.f37321e, "alpha", 200L, 200L, null, 1.0f, 0.0f);
        this.f37325i = animatorM103743p;
        bt0.m103733f(animatorM103743p, new Runnable() { // from class: l.ojr
            @Override // java.lang.Runnable
            public final void run() {
                this.f144333a.m56610d();
            }
        });
        return this.f37325i;
    }

    private Animator getAnimatorShow() {
        if (NullChecker.m81303a(this.f37324h)) {
            this.f37324h.cancel();
        }
        Animator animatorM103743p = bt0.m103743p(this.f37323g, "alpha", 0L, 600L, null, 0.0f, 1.0f);
        View view = this.f37321e;
        Animator animatorM103743p2 = bt0.m103743p(view, "translationX", 0L, 600L, null, view.getTranslationX(), this.f37321e.getTranslationX() - t100.m186890d(10.0f));
        View view2 = this.f37322f;
        Animator animatorM103753z = bt0.m103753z(animatorM103743p, animatorM103743p2, bt0.m103743p(view2, "translationX", 100L, 600L, null, view2.getTranslationX(), this.f37322f.getTranslationX() - t100.m186890d(10.0f)));
        this.f37324h = animatorM103753z;
        bt0.m103733f(animatorM103753z, new Runnable() { // from class: l.pjr
            @Override // java.lang.Runnable
            public final void run() {
                this.f149870a.m56611e();
            }
        });
        return this.f37324h;
    }

    /* JADX INFO: renamed from: c */
    public final void m56609c(View view) {
        qjr.m175034a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m56610d() {
        View view = this.f37321e;
        this.f37321e = this.f37322f;
        this.f37322f = this.f37323g;
        this.f37323g = view;
        view.setTranslationX(this.f37318b.getLeft() - this.f37323g.getLeft());
        this.f37322f.bringToFront();
        this.f37321e.bringToFront();
        getAnimatorShow().start();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m56611e() {
        Animator animatorDismiss = getAnimatorDismiss();
        animatorDismiss.setStartDelay(600L);
        animatorDismiss.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (NullChecker.m81303a(this.f37325i)) {
            this.f37325i.cancel();
            this.f37325i = null;
        }
        if (NullChecker.m81303a(this.f37324h)) {
            this.f37324h.cancel();
            this.f37324h = null;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56609c(this);
    }

    public LikersNewLikeBubble(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LikersNewLikeBubble(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
