package com.p046p1.mobile.putong.live.base.arch.card.cardmodel.tvline;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.arch.card.cardmodel.tvline.LiveMsgAutoScrollView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p149l.bt0;
import p149l.c4g0;
import p149l.d5c0;
import p149l.e30;
import p149l.f30;
import p149l.ffw;
import p149l.jo0;
import p149l.lig;
import p149l.mcr;
import p149l.mkd0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveMsgAutoScrollView extends FrameLayout {
    private Animator all;
    private c4g0 subs;
    private View view1;
    private View view2;
    private View view3;
    ArrayList<View> viewList;
    private f30<Long, View> viewRender;

    public LiveMsgAutoScrollView(@NonNull Context context) {
        super(context);
        this.viewList = new ArrayList<>();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m67518b(View view, View view2, View view3) {
        view.setAlpha(0.0f);
        view2.setAlpha(1.0f);
        view3.setAlpha(0.4f);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m67519c(Long l2) {
        if (l2.longValue() < 0) {
            return;
        }
        if (this.viewRender != null) {
            xdl0.m208344M(this.viewList.get(0), true);
            this.viewRender.call(l2, this.viewList.get(0));
        }
        m67520d(this.viewList.get(0), this.viewList.get(2), this.viewList.get(1));
        this.viewList.add(this.viewList.remove(0));
    }

    /* JADX INFO: renamed from: d */
    public final void m67520d(final View view, final View view2, final View view3) {
        lig ligVar = new lig();
        int i = t100.f167267p;
        Animator animatorM103753z = bt0.m103753z(bt0.m103743p(view, "translationY", 0L, 500L, ligVar, i, 0.0f), bt0.m103743p(view2, "translationY", 0L, 500L, ligVar, 0.0f, -i), bt0.m103743p(view3, "translationY", 0L, 500L, ligVar, -i, -t100.f167277z), bt0.m103743p(view, "alpha", 0L, 500L, ligVar, 0.0f, 1.0f), bt0.m103743p(view2, "alpha", 0L, 500L, ligVar, 1.0f, 0.4f), bt0.m103743p(view3, "alpha", 0L, 500L, ligVar, 0.4f, 0.0f));
        this.all = animatorM103753z;
        bt0.m103749v(animatorM103753z, new Runnable() { // from class: l.y4t
            @Override // java.lang.Runnable
            public final void run() {
                LiveMsgAutoScrollView.m67518b(view, view2, view3);
            }
        });
        this.all.start();
    }

    /* JADX INFO: renamed from: e */
    public void m67521e(mcr mcrVar) {
        xdl0.m208344M(this.view1, false);
        xdl0.m208344M(this.view2, false);
        xdl0.m208344M(this.view3, false);
        mkd0.m154992z(this.subs);
        Animator animator = this.all;
        if (animator != null) {
            animator.cancel();
        }
        this.subs = mcrVar.duringCreated(C22306c.interval(0L, 3L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.x4t
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f191058a.m67519c((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f */
    public void m67522f() {
        mkd0.m154992z(this.subs);
        xdl0.m208344M(this.view1, false);
        xdl0.m208344M(this.view2, false);
        xdl0.m208344M(this.view3, false);
        this.viewRender = null;
        Animator animator = this.all;
        if (animator != null) {
            animator.cancel();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m67522f();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.view1 = findViewById(d5c0.f84445T0);
        this.view2 = findViewById(d5c0.f84447U0);
        this.view3 = findViewById(d5c0.f84449V0);
        this.viewList.add(this.view1);
        this.viewList.add(this.view2);
        this.viewList.add(this.view3);
    }

    public void setViewRender(f30<Long, View> f30Var) {
        this.viewRender = f30Var;
    }

    public LiveMsgAutoScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.viewList = new ArrayList<>();
    }

    public LiveMsgAutoScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.viewList = new ArrayList<>();
    }
}
