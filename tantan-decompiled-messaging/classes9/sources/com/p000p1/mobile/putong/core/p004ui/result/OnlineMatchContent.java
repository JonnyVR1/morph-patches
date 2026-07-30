package com.p000p1.mobile.putong.core.p004ui.result;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.Interpolator;
import android.widget.ScrollView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.pay.R;
import com.tantanapp.common.utils.NullChecker;
import l.bt0;
import l.d3c0;
import l.dj50;
import l.hmb;
import l.t100;
import l.xdl0;
import p006l.q8b0;
import v.VFrame;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class OnlineMatchContent extends ScrollView implements q8b0 {

    /* JADX INFO: renamed from: a */
    public VFrame f5364a;

    /* JADX INFO: renamed from: b */
    public VImage f5365b;

    /* JADX INFO: renamed from: c */
    public VText f5366c;

    /* JADX INFO: renamed from: d */
    public boolean f5367d;

    /* JADX INFO: renamed from: e */
    public Animator f5368e;

    /* JADX INFO: renamed from: f */
    public Animator f5369f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.OnlineMatchContent$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC0267a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.OnlineMatchContent$a$a */
        public class a extends bt0.j {
            public a() {
            }

            public void onAnimationEnd(Animator animator) {
                if (OnlineMatchContent.this.f5367d) {
                    xdl0.M0(OnlineMatchContent.this.f5365b, true);
                    OnlineMatchContent.this.f5369f.start();
                }
            }
        }

        public ViewTreeObserverOnGlobalLayoutListenerC0267a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            OnlineMatchContent onlineMatchContent = OnlineMatchContent.this;
            VFrame vFrame = onlineMatchContent.f5364a;
            Interpolator interpolator = bt0.c;
            onlineMatchContent.f5368e = bt0.p(vFrame, "translationY", 0L, 400L, interpolator, new float[]{-vFrame.getHeight(), 0.0f});
            OnlineMatchContent onlineMatchContent2 = OnlineMatchContent.this;
            VImage vImage = onlineMatchContent2.f5365b;
            onlineMatchContent2.f5369f = bt0.p(vImage, "translationY", 0L, 400L, interpolator, new float[]{vImage.getHeight(), 0.0f});
            OnlineMatchContent.this.f5368e.addListener(new a());
            OnlineMatchContent.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public OnlineMatchContent(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: g */
    private void m8076g() {
        if (xdl0.w0() <= 1280) {
            this.f5364a.getLayoutParams().height = t100.d(hmb.m1() * 260.0f);
            this.f5365b.getLayoutParams().width = t100.d(hmb.m1() * 250.0f);
        }
    }

    /* JADX INFO: renamed from: h */
    private void m8077h() {
        this.f5366c.setText(R.string.g7);
        m8076g();
        this.f5365b.setImageResource(d3c0.Jb);
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0267a());
    }

    /* JADX INFO: renamed from: f */
    public final void m8078f(View view) {
        dj50.a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public void m8079i() {
        xdl0.M0(this.f5365b, false);
        if (!NullChecker.a(this.f5368e)) {
            xdl0.M0(this.f5365b, true);
        } else {
            this.f5367d = true;
            this.f5368e.start();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        m8078f(this);
        super.onFinishInflate();
        m8077h();
    }

    @Override // p006l.q8b0
    /* JADX INFO: renamed from: w */
    public void mo8070w(PutongFrag putongFrag) {
        m8079i();
    }

    public OnlineMatchContent(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OnlineMatchContent(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
