package com.p051p1.mobile.putong.live.livingroom.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.dhw;
import p153l.gc2;
import p153l.gt0;
import p153l.kcg0;
import p153l.ksq;
import p153l.psd0;
import p153l.qa00;
import p153l.qnp0;
import p153l.x20;
import p153l.xau;
import p153l.y20;

/* JADX INFO: loaded from: classes5.dex */
public class JumpNextView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public CardView f52776a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f52777b;

    /* JADX INFO: renamed from: c */
    public View f52778c;

    /* JADX INFO: renamed from: d */
    public VText f52779d;

    /* JADX INFO: renamed from: e */
    public VText f52780e;

    /* JADX INFO: renamed from: f */
    public VButton f52781f;

    /* JADX INFO: renamed from: g */
    public kcg0 f52782g;

    /* JADX INFO: renamed from: h */
    public y20<Boolean> f52783h;

    /* JADX INFO: renamed from: i */
    public x20 f52784i;

    /* JADX INFO: renamed from: j */
    public Handler f52785j;

    /* JADX INFO: renamed from: k */
    public int f52786k;

    /* JADX INFO: renamed from: l */
    public ValueAnimator f52787l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.JumpNextView$a */
    public class HandlerC13085a extends Handler {
        public HandlerC13085a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            JumpNextView.this.f52786k = message.what;
            int i = JumpNextView.this.f52786k;
            JumpNextView jumpNextView = JumpNextView.this;
            if (i == 0) {
                psd0.m173633z(jumpNextView.f52782g);
                if (JumpNextView.this.f52783h != null) {
                    JumpNextView.this.f52783h.call(Boolean.FALSE);
                    return;
                }
                return;
            }
            if (jumpNextView.f52786k > 0) {
                JumpNextView.this.f52779d.setText(String.format(xau.m209910t(R$string.f47405A0), Integer.valueOf(message.what)));
                JumpNextView.this.f52785j.sendEmptyMessageDelayed(JumpNextView.this.f52786k - 1, 1000L);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.JumpNextView$b */
    public class C13086b implements ValueAnimator.AnimatorUpdateListener {
        public C13086b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            qnp0.m177260c1(JumpNextView.this.f52778c, 0, 0, (qa00.m175859d(156.0f) * (1000 - ((Integer) valueAnimator.getAnimatedValue()).intValue())) / 1000, 0, 0);
        }
    }

    public JumpNextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m77646l();
    }

    private int getMaxCountdown() {
        return 5;
    }

    /* JADX INFO: renamed from: j */
    public final void m77644j(View view) {
        ksq.m151278a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public final void m77645k() {
        ValueAnimator valueAnimator = this.f52787l;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f52787l = null;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m77646l() {
        this.f52785j = new HandlerC13085a(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m77647m(View view) {
        this.f52784i.call();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m77648n(View view) {
        psd0.m173633z(this.f52782g);
        y20<Boolean> y20Var = this.f52783h;
        if (y20Var != null) {
            y20Var.call(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m77649o() {
        qnp0.m177260c1(this.f52778c, 0, 0, qa00.m175859d(150.0f), 0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        psd0.m173633z(this.f52782g);
        this.f52785j.removeCallbacksAndMessages(null);
        m77645k();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77644j(this);
        setOnClickListener(new View.OnClickListener() { // from class: l.gsq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f106322a.m77647m(view);
            }
        });
        bnl0.m105509E0(this.f52781f, new View.OnClickListener() { // from class: l.hsq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f111468a.m77648n(view);
            }
        });
        this.f52778c.setBackground(gc2.m129823b("ff8817", 0));
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m77650p(C4470c c4470c) {
        int i;
        if (c4470c == C4470c.f16269k) {
            this.f52785j.removeCallbacksAndMessages(null);
        } else {
            if (c4470c != C4470c.f16267i || (i = this.f52786k) <= 0) {
                return;
            }
            this.f52785j.sendEmptyMessageDelayed(i - 1, 1000L);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m77651q() {
        m77645k();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(1000, 0);
        this.f52787l = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(((long) getMaxCountdown()) * 1000);
        this.f52787l.setInterpolator(new LinearInterpolator());
        this.f52787l.addUpdateListener(new C13086b());
        gt0.m132160f(this.f52787l, new Runnable() { // from class: l.isq
            @Override // java.lang.Runnable
            public final void run() {
                this.f116693a.m77649o();
            }
        });
        this.f52787l.start();
    }

    /* JADX INFO: renamed from: r */
    public void m77652r(Frag frag) {
        this.f52785j.sendEmptyMessage(getMaxCountdown());
        this.f52782g = frag.lifecycle().subscribe(dhw.m115825d(new y20() { // from class: l.jsq
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122524a.m77650p((C4470c) obj);
            }
        }));
    }

    public void setCloseAction(x20 x20Var) {
        this.f52784i = x20Var;
    }

    public void setJumpAction(y20<Boolean> y20Var) {
        this.f52783h = y20Var;
    }

    public JumpNextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public JumpNextView(Context context) {
        this(context, null);
    }
}
