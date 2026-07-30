package com.p051p1.mobile.putong.core.p058ui.result;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.Interpolator;
import android.widget.ScrollView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.tantanapp.common.utils.NullChecker;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.gt0;
import p153l.jbc0;
import p153l.jr50;
import p153l.qa00;
import p153l.ugb0;
import p153l.vnb;

/* JADX INFO: loaded from: classes12.dex */
public class OnlineMatchContent extends ScrollView implements ugb0 {

    /* JADX INFO: renamed from: a */
    public VFrame f36431a;

    /* JADX INFO: renamed from: b */
    public VImage f36432b;

    /* JADX INFO: renamed from: c */
    public VText f36433c;

    /* JADX INFO: renamed from: d */
    public boolean f36434d;

    /* JADX INFO: renamed from: e */
    public Animator f36435e;

    /* JADX INFO: renamed from: f */
    public Animator f36436f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.OnlineMatchContent$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC8994a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.OnlineMatchContent$a$a */
        public class a extends gt0.C17308j {
            public a() {
            }

            @Override // p153l.gt0.C17308j, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (OnlineMatchContent.this.f36434d) {
                    bnl0.m105525M0(OnlineMatchContent.this.f36432b, true);
                    OnlineMatchContent.this.f36436f.start();
                }
            }
        }

        public ViewTreeObserverOnGlobalLayoutListenerC8994a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            OnlineMatchContent onlineMatchContent = OnlineMatchContent.this;
            VFrame vFrame = onlineMatchContent.f36431a;
            Interpolator interpolator = gt0.f106348c;
            onlineMatchContent.f36435e = gt0.m132170p(vFrame, "translationY", 0L, 400L, interpolator, -vFrame.getHeight(), 0.0f);
            OnlineMatchContent onlineMatchContent2 = OnlineMatchContent.this;
            VImage vImage = onlineMatchContent2.f36432b;
            onlineMatchContent2.f36436f = gt0.m132170p(vImage, "translationY", 0L, 400L, interpolator, vImage.getHeight(), 0.0f);
            OnlineMatchContent.this.f36435e.addListener(new a());
            OnlineMatchContent.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public OnlineMatchContent(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: g */
    private void m55902g() {
        if (bnl0.m105588w0() <= 1280) {
            this.f36431a.getLayoutParams().height = qa00.m175859d(vnb.m201953m1() * 260.0f);
            this.f36432b.getLayoutParams().width = qa00.m175859d(vnb.m201953m1() * 250.0f);
        }
    }

    /* JADX INFO: renamed from: h */
    private void m55903h() {
        this.f36433c.setText(R$string.f28304g7);
        m55902g();
        this.f36432b.setImageResource(jbc0.f119280Jb);
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC8994a());
    }

    /* JADX INFO: renamed from: f */
    public final void m55904f(View view) {
        jr50.m146708a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public void m55905i() {
        bnl0.m105525M0(this.f36432b, false);
        if (!NullChecker.m82486a(this.f36435e)) {
            bnl0.m105525M0(this.f36432b, true);
        } else {
            this.f36434d = true;
            this.f36435e.start();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        m55904f(this);
        super.onFinishInflate();
        m55903h();
    }

    @Override // p153l.ugb0
    /* JADX INFO: renamed from: w */
    public void mo55896w(PutongFrag putongFrag) {
        m55905i();
    }

    public OnlineMatchContent(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OnlineMatchContent(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
