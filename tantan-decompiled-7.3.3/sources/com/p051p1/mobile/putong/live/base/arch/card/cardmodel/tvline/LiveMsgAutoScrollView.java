package com.p051p1.mobile.putong.live.base.arch.card.cardmodel.tvline;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.arch.card.cardmodel.tvline.LiveMsgAutoScrollView;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p153l.bnl0;
import p153l.dhw;
import p153l.fo0;
import p153l.gt0;
import p153l.jdc0;
import p153l.kcg0;
import p153l.ner;
import p153l.psd0;
import p153l.qa00;
import p153l.y20;
import p153l.z20;
import p153l.zjg;

/* JADX INFO: loaded from: classes13.dex */
public class LiveMsgAutoScrollView extends FrameLayout {
    private Animator all;
    private kcg0 subs;
    private View view1;
    private View view2;
    private View view3;
    ArrayList<View> viewList;
    private z20<Long, View> viewRender;

    public LiveMsgAutoScrollView(@NonNull Context context) {
        super(context);
        this.viewList = new ArrayList<>();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m68701b(View view, View view2, View view3) {
        view.setAlpha(0.0f);
        view2.setAlpha(1.0f);
        view3.setAlpha(0.4f);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m68702c(Long l2) {
        if (l2.longValue() < 0) {
            return;
        }
        if (this.viewRender != null) {
            bnl0.m105524M(this.viewList.get(0), true);
            this.viewRender.call(l2, this.viewList.get(0));
        }
        m68703d(this.viewList.get(0), this.viewList.get(2), this.viewList.get(1));
        this.viewList.add(this.viewList.remove(0));
    }

    /* JADX INFO: renamed from: d */
    public final void m68703d(final View view, final View view2, final View view3) {
        zjg zjgVar = new zjg();
        int i = qa00.f156329p;
        Animator animatorM132180z = gt0.m132180z(gt0.m132170p(view, "translationY", 0L, 500L, zjgVar, i, 0.0f), gt0.m132170p(view2, "translationY", 0L, 500L, zjgVar, 0.0f, -i), gt0.m132170p(view3, "translationY", 0L, 500L, zjgVar, -i, -qa00.f156339z), gt0.m132170p(view, "alpha", 0L, 500L, zjgVar, 0.0f, 1.0f), gt0.m132170p(view2, "alpha", 0L, 500L, zjgVar, 1.0f, 0.4f), gt0.m132170p(view3, "alpha", 0L, 500L, zjgVar, 0.4f, 0.0f));
        this.all = animatorM132180z;
        gt0.m132176v(animatorM132180z, new Runnable() { // from class: l.z6t
            @Override // java.lang.Runnable
            public final void run() {
                LiveMsgAutoScrollView.m68701b(view, view2, view3);
            }
        });
        this.all.start();
    }

    /* JADX INFO: renamed from: e */
    public void m68704e(ner nerVar) {
        bnl0.m105524M(this.view1, false);
        bnl0.m105524M(this.view2, false);
        bnl0.m105524M(this.view3, false);
        psd0.m173633z(this.subs);
        Animator animator = this.all;
        if (animator != null) {
            animator.cancel();
        }
        this.subs = nerVar.duringCreated(C22421c.interval(0L, 3L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.y6t
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197713a.m68702c((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f */
    public void m68705f() {
        psd0.m173633z(this.subs);
        bnl0.m105524M(this.view1, false);
        bnl0.m105524M(this.view2, false);
        bnl0.m105524M(this.view3, false);
        this.viewRender = null;
        Animator animator = this.all;
        if (animator != null) {
            animator.cancel();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m68705f();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.view1 = findViewById(jdc0.f120163T0);
        this.view2 = findViewById(jdc0.f120165U0);
        this.view3 = findViewById(jdc0.f120167V0);
        this.viewList.add(this.view1);
        this.viewList.add(this.view2);
        this.viewList.add(this.view3);
    }

    public void setViewRender(z20<Long, View> z20Var) {
        this.viewRender = z20Var;
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
