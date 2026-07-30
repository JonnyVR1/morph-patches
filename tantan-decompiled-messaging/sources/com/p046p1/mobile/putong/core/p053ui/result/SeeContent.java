package com.p046p1.mobile.putong.core.p053ui.result;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.Interpolator;
import android.widget.ScrollView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.pay.R$string;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.bt0;
import p149l.d3c0;
import p149l.g8e0;
import p149l.hmb;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class SeeContent extends ScrollView {

    /* JADX INFO: renamed from: a */
    public VFrame f35624a;

    /* JADX INFO: renamed from: b */
    public VLinear f35625b;

    /* JADX INFO: renamed from: c */
    public VLinear f35626c;

    /* JADX INFO: renamed from: d */
    public VImage f35627d;

    /* JADX INFO: renamed from: e */
    public VText f35628e;

    /* JADX INFO: renamed from: f */
    public boolean f35629f;

    /* JADX INFO: renamed from: g */
    public Animator f35630g;

    /* JADX INFO: renamed from: h */
    public Animator f35631h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.SeeContent$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC8833a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.SeeContent$a$a */
        public class a extends bt0.C15966j {
            public a() {
            }

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void m54767b() {
                xdl0.m208345M0(SeeContent.this.f35626c, true);
                SeeContent.this.f35631h.start();
            }

            @Override // p149l.bt0.C15966j, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // p149l.bt0.C15966j, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                if (SeeContent.this.f35629f) {
                    SeeContent.this.f35626c.postDelayed(new Runnable() { // from class: l.f8e0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f96344a.m54767b();
                        }
                    }, 100L);
                }
            }
        }

        public ViewTreeObserverOnGlobalLayoutListenerC8833a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            SeeContent seeContent = SeeContent.this;
            VLinear vLinear = seeContent.f35625b;
            Interpolator interpolator = bt0.f77156c;
            seeContent.f35630g = bt0.m103743p(vLinear, "translationY", 0L, 200L, interpolator, vLinear.getHeight(), 0.0f);
            SeeContent seeContent2 = SeeContent.this;
            VLinear vLinear2 = seeContent2.f35626c;
            seeContent2.f35631h = bt0.m103743p(vLinear2, "translationY", 0L, 200L, interpolator, vLinear2.getHeight(), 0.0f);
            SeeContent.this.f35630g.addListener(new a());
            SeeContent.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public SeeContent(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: f */
    public final void m54763f(View view) {
        g8e0.m124747a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final void m54764g() {
        if (xdl0.m208408w0() <= 1280) {
            this.f35624a.getLayoutParams().height = t100.m186890d(hmb.m131708m1() * 260.0f);
            this.f35625b.getLayoutParams().width = t100.m186890d(hmb.m131708m1() * 199.0f);
            this.f35625b.getLayoutParams().height = t100.m186890d(hmb.m131708m1() * 246.0f);
            this.f35626c.getLayoutParams().width = t100.m186890d(hmb.m131708m1() * 238.0f);
            this.f35626c.getLayoutParams().height = t100.m186890d(hmb.m131708m1() * 182.0f);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m54765h() {
        this.f35628e.setText(String.format("%s\n%s", getContext().getString(R$string.f27279R1), getContext().getString(R$string.f27284R6)));
        m54764g();
        this.f35627d.setImageResource(CoreModule.f17545c.f19639e0.m169527p9().isFemale() ? d3c0.f83667Mb : d3c0.f83653Lb);
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC8833a());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        m54763f(this);
        super.onFinishInflate();
        m54765h();
        if (xdl0.m208408w0() / getResources().getDisplayMetrics().density <= 700.0f) {
            this.f35624a.getLayoutParams().height = t100.m186890d(245.0f);
            this.f35628e.setPadding(0, 0, 0, 0);
        }
    }

    public SeeContent(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SeeContent(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
