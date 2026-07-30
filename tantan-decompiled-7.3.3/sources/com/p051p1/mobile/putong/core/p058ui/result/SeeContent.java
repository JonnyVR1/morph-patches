package com.p051p1.mobile.putong.core.p058ui.result;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.Interpolator;
import android.widget.ScrollView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.pay.R$string;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.gt0;
import p153l.jbc0;
import p153l.lge0;
import p153l.qa00;
import p153l.vnb;

/* JADX INFO: loaded from: classes12.dex */
public class SeeContent extends ScrollView {

    /* JADX INFO: renamed from: a */
    public VFrame f36472a;

    /* JADX INFO: renamed from: b */
    public VLinear f36473b;

    /* JADX INFO: renamed from: c */
    public VLinear f36474c;

    /* JADX INFO: renamed from: d */
    public VImage f36475d;

    /* JADX INFO: renamed from: e */
    public VText f36476e;

    /* JADX INFO: renamed from: f */
    public boolean f36477f;

    /* JADX INFO: renamed from: g */
    public Animator f36478g;

    /* JADX INFO: renamed from: h */
    public Animator f36479h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.SeeContent$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC8996a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.SeeContent$a$a */
        public class a extends gt0.C17308j {
            public a() {
            }

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void m55950b() {
                bnl0.m105525M0(SeeContent.this.f36474c, true);
                SeeContent.this.f36479h.start();
            }

            @Override // p153l.gt0.C17308j, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // p153l.gt0.C17308j, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                if (SeeContent.this.f36477f) {
                    SeeContent.this.f36474c.postDelayed(new Runnable() { // from class: l.kge0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f126598a.m55950b();
                        }
                    }, 100L);
                }
            }
        }

        public ViewTreeObserverOnGlobalLayoutListenerC8996a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            SeeContent seeContent = SeeContent.this;
            VLinear vLinear = seeContent.f36473b;
            Interpolator interpolator = gt0.f106348c;
            seeContent.f36478g = gt0.m132170p(vLinear, "translationY", 0L, 200L, interpolator, vLinear.getHeight(), 0.0f);
            SeeContent seeContent2 = SeeContent.this;
            VLinear vLinear2 = seeContent2.f36474c;
            seeContent2.f36479h = gt0.m132170p(vLinear2, "translationY", 0L, 200L, interpolator, vLinear2.getHeight(), 0.0f);
            SeeContent.this.f36478g.addListener(new a());
            SeeContent.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public SeeContent(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: f */
    public final void m55946f(View view) {
        lge0.m154066a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final void m55947g() {
        if (bnl0.m105588w0() <= 1280) {
            this.f36472a.getLayoutParams().height = qa00.m175859d(vnb.m201953m1() * 260.0f);
            this.f36473b.getLayoutParams().width = qa00.m175859d(vnb.m201953m1() * 199.0f);
            this.f36473b.getLayoutParams().height = qa00.m175859d(vnb.m201953m1() * 246.0f);
            this.f36474c.getLayoutParams().width = qa00.m175859d(vnb.m201953m1() * 238.0f);
            this.f36474c.getLayoutParams().height = qa00.m175859d(vnb.m201953m1() * 182.0f);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m55948h() {
        this.f36476e.setText(String.format("%s\n%s", getContext().getString(R$string.f28127R1), getContext().getString(R$string.f28132R6)));
        m55947g();
        this.f36475d.setImageResource(CoreModule.f18264c.f20381e0.m116600p9().isFemale() ? jbc0.f119322Mb : jbc0.f119308Lb);
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC8996a());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        m55946f(this);
        super.onFinishInflate();
        m55948h();
        if (bnl0.m105588w0() / getResources().getDisplayMetrics().density <= 700.0f) {
            this.f36472a.getLayoutParams().height = qa00.m175859d(245.0f);
            this.f36476e.setPadding(0, 0, 0, 0);
        }
    }

    public SeeContent(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SeeContent(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
