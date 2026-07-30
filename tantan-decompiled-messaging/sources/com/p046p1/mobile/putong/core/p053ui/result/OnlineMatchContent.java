package com.p046p1.mobile.putong.core.p053ui.result;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.Interpolator;
import android.widget.ScrollView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.tantanapp.common.utils.NullChecker;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;
import p149l.bt0;
import p149l.d3c0;
import p149l.dj50;
import p149l.hmb;
import p149l.q8b0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class OnlineMatchContent extends ScrollView implements q8b0 {

    /* JADX INFO: renamed from: a */
    public VFrame f35583a;

    /* JADX INFO: renamed from: b */
    public VImage f35584b;

    /* JADX INFO: renamed from: c */
    public VText f35585c;

    /* JADX INFO: renamed from: d */
    public boolean f35586d;

    /* JADX INFO: renamed from: e */
    public Animator f35587e;

    /* JADX INFO: renamed from: f */
    public Animator f35588f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.OnlineMatchContent$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC8831a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.OnlineMatchContent$a$a */
        public class a extends bt0.C15966j {
            public a() {
            }

            @Override // p149l.bt0.C15966j, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (OnlineMatchContent.this.f35586d) {
                    xdl0.m208345M0(OnlineMatchContent.this.f35584b, true);
                    OnlineMatchContent.this.f35588f.start();
                }
            }
        }

        public ViewTreeObserverOnGlobalLayoutListenerC8831a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            OnlineMatchContent onlineMatchContent = OnlineMatchContent.this;
            VFrame vFrame = onlineMatchContent.f35583a;
            Interpolator interpolator = bt0.f77156c;
            onlineMatchContent.f35587e = bt0.m103743p(vFrame, "translationY", 0L, 400L, interpolator, -vFrame.getHeight(), 0.0f);
            OnlineMatchContent onlineMatchContent2 = OnlineMatchContent.this;
            VImage vImage = onlineMatchContent2.f35584b;
            onlineMatchContent2.f35588f = bt0.m103743p(vImage, "translationY", 0L, 400L, interpolator, vImage.getHeight(), 0.0f);
            OnlineMatchContent.this.f35587e.addListener(new a());
            OnlineMatchContent.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public OnlineMatchContent(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: g */
    private void m54719g() {
        if (xdl0.m208408w0() <= 1280) {
            this.f35583a.getLayoutParams().height = t100.m186890d(hmb.m131708m1() * 260.0f);
            this.f35584b.getLayoutParams().width = t100.m186890d(hmb.m131708m1() * 250.0f);
        }
    }

    /* JADX INFO: renamed from: h */
    private void m54720h() {
        this.f35585c.setText(R$string.f27456g7);
        m54719g();
        this.f35584b.setImageResource(d3c0.f83625Jb);
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC8831a());
    }

    /* JADX INFO: renamed from: f */
    public final void m54721f(View view) {
        dj50.m112020a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public void m54722i() {
        xdl0.m208345M0(this.f35584b, false);
        if (!NullChecker.m81303a(this.f35587e)) {
            xdl0.m208345M0(this.f35584b, true);
        } else {
            this.f35586d = true;
            this.f35587e.start();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        m54721f(this);
        super.onFinishInflate();
        m54720h();
    }

    @Override // p149l.q8b0
    /* JADX INFO: renamed from: w */
    public void mo54713w(PutongFrag putongFrag) {
        m54722i();
    }

    public OnlineMatchContent(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OnlineMatchContent(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
