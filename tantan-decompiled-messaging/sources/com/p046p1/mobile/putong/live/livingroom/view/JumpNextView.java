package com.p046p1.mobile.putong.live.livingroom.view;

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
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VText;
import p149l.bt0;
import p149l.c4g0;
import p149l.d30;
import p149l.e30;
import p149l.ffw;
import p149l.jqq;
import p149l.mep0;
import p149l.mkd0;
import p149l.t100;
import p149l.w8u;
import p149l.xdl0;
import p149l.zb2;

/* JADX INFO: loaded from: classes5.dex */
public class JumpNextView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public CardView f51928a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f51929b;

    /* JADX INFO: renamed from: c */
    public View f51930c;

    /* JADX INFO: renamed from: d */
    public VText f51931d;

    /* JADX INFO: renamed from: e */
    public VText f51932e;

    /* JADX INFO: renamed from: f */
    public VButton f51933f;

    /* JADX INFO: renamed from: g */
    public c4g0 f51934g;

    /* JADX INFO: renamed from: h */
    public e30<Boolean> f51935h;

    /* JADX INFO: renamed from: i */
    public d30 f51936i;

    /* JADX INFO: renamed from: j */
    public Handler f51937j;

    /* JADX INFO: renamed from: k */
    public int f51938k;

    /* JADX INFO: renamed from: l */
    public ValueAnimator f51939l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.JumpNextView$a */
    public class HandlerC12922a extends Handler {
        public HandlerC12922a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            JumpNextView.this.f51938k = message.what;
            int i = JumpNextView.this.f51938k;
            JumpNextView jumpNextView = JumpNextView.this;
            if (i == 0) {
                mkd0.m154992z(jumpNextView.f51934g);
                if (JumpNextView.this.f51935h != null) {
                    JumpNextView.this.f51935h.call(Boolean.FALSE);
                    return;
                }
                return;
            }
            if (jumpNextView.f51938k > 0) {
                JumpNextView.this.f51931d.setText(String.format(w8u.m202217t(R$string.f46557A0), Integer.valueOf(message.what)));
                JumpNextView.this.f51937j.sendEmptyMessageDelayed(JumpNextView.this.f51938k - 1, 1000L);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.view.JumpNextView$b */
    public class C12923b implements ValueAnimator.AnimatorUpdateListener {
        public C12923b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            mep0.m154301c1(JumpNextView.this.f51930c, 0, 0, (t100.m186890d(156.0f) * (1000 - ((Integer) valueAnimator.getAnimatedValue()).intValue())) / 1000, 0, 0);
        }
    }

    public JumpNextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m76463l();
    }

    private int getMaxCountdown() {
        return 5;
    }

    /* JADX INFO: renamed from: j */
    public final void m76461j(View view) {
        jqq.m142830a(this, view);
    }

    /* JADX INFO: renamed from: k */
    public final void m76462k() {
        ValueAnimator valueAnimator = this.f51939l;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f51939l = null;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m76463l() {
        this.f51937j = new HandlerC12922a(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m76464m(View view) {
        this.f51936i.call();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m76465n(View view) {
        mkd0.m154992z(this.f51934g);
        e30<Boolean> e30Var = this.f51935h;
        if (e30Var != null) {
            e30Var.call(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m76466o() {
        mep0.m154301c1(this.f51930c, 0, 0, t100.m186890d(150.0f), 0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mkd0.m154992z(this.f51934g);
        this.f51937j.removeCallbacksAndMessages(null);
        m76462k();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76461j(this);
        setOnClickListener(new View.OnClickListener() { // from class: l.fqq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98832a.m76464m(view);
            }
        });
        xdl0.m208329E0(this.f51933f, new View.OnClickListener() { // from class: l.gqq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103970a.m76465n(view);
            }
        });
        this.f51930c.setBackground(zb2.m217814b("ff8817", 0));
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m76467p(C4319c c4319c) {
        int i;
        if (c4319c == C4319c.f15550k) {
            this.f51937j.removeCallbacksAndMessages(null);
        } else {
            if (c4319c != C4319c.f15548i || (i = this.f51938k) <= 0) {
                return;
            }
            this.f51937j.sendEmptyMessageDelayed(i - 1, 1000L);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m76468q() {
        m76462k();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(1000, 0);
        this.f51939l = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(((long) getMaxCountdown()) * 1000);
        this.f51939l.setInterpolator(new LinearInterpolator());
        this.f51939l.addUpdateListener(new C12923b());
        bt0.m103733f(this.f51939l, new Runnable() { // from class: l.hqq
            @Override // java.lang.Runnable
            public final void run() {
                this.f109091a.m76466o();
            }
        });
        this.f51939l.start();
    }

    /* JADX INFO: renamed from: r */
    public void m76469r(Frag frag) {
        this.f51937j.sendEmptyMessage(getMaxCountdown());
        this.f51934g = frag.lifecycle().subscribe(ffw.m121193d(new e30() { // from class: l.iqq
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f114538a.m76467p((C4319c) obj);
            }
        }));
    }

    public void setCloseAction(d30 d30Var) {
        this.f51936i = d30Var;
    }

    public void setJumpAction(e30<Boolean> e30Var) {
        this.f51935h = e30Var;
    }

    public JumpNextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public JumpNextView(Context context) {
        this(context, null);
    }
}
