package com.p046p1.mobile.putong.core.newui.voicecall;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.message.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p149l.c3c0;
import p149l.c4g0;
import p149l.d30;
import p149l.e30;
import p149l.jo0;
import p149l.l6c0;
import p149l.mkd0;
import p149l.ssm0;
import p149l.tqm0;
import p149l.w9j;
import p149l.xdl0;
import p149l.xhx;
import p149l.y4c0;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceCallView extends FrameLayout {

    /* JADX INFO: renamed from: m */
    public static int f27047m = 300;

    /* JADX INFO: renamed from: n */
    public static int f27048n;

    /* JADX INFO: renamed from: o */
    public static int f27049o;

    /* JADX INFO: renamed from: p */
    public static int f27050p;

    /* JADX INFO: renamed from: q */
    public static int f27051q;

    /* JADX INFO: renamed from: r */
    public static List<d30> f27052r = new ArrayList();

    /* JADX INFO: renamed from: a */
    public boolean f27053a;

    /* JADX INFO: renamed from: b */
    public int f27054b;

    /* JADX INFO: renamed from: c */
    public int f27055c;

    /* JADX INFO: renamed from: d */
    public int f27056d;

    /* JADX INFO: renamed from: e */
    public int f27057e;

    /* JADX INFO: renamed from: f */
    public ValueAnimator f27058f;

    /* JADX INFO: renamed from: g */
    public c4g0 f27059g;

    /* JADX INFO: renamed from: h */
    public TextView f27060h;

    /* JADX INFO: renamed from: i */
    public ImageView f27061i;

    /* JADX INFO: renamed from: j */
    public c4g0 f27062j;

    /* JADX INFO: renamed from: k */
    public d30 f27063k;

    /* JADX INFO: renamed from: l */
    public GestureDetector f27064l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.voicecall.VoiceCallView$a */
    public class C8257a extends GestureDetector.SimpleOnGestureListener {
        public C8257a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (VoiceCallView.this.f27053a) {
                return true;
            }
            VoiceCallView.this.performClick();
            return true;
        }
    }

    public VoiceCallView(Context context) {
        super(context);
        this.f27063k = new d30() { // from class: l.tsm0
            @Override // p149l.d30
            public final void call() {
                this.f171946a.m43840n();
            }
        };
        this.f27064l = new GestureDetector(getContext(), new C8257a());
        m43836j();
    }

    /* JADX INFO: renamed from: h */
    public final void m43834h() {
        this.f27059g = tqm0.m190131p().m190137i().observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.usm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f177992a.m43838l((Integer) obj);
            }
        }));
        this.f27062j = xhx.m208850C().f192943l.filter(new w9j() { // from class: l.vsm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Long) obj).longValue() > 0);
            }
        }).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.wsm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187950a.m43839m((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void m43840n() {
        if (f27050p == 0 && f27051q == 0) {
            return;
        }
        if (getLeft() == f27050p && getTop() == f27051q) {
            return;
        }
        if (NullChecker.m81303a(getLayoutParams()) && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.leftMargin = f27050p;
            marginLayoutParams.topMargin = f27051q;
        }
        int i = f27050p;
        layout(i, f27051q, getWidth() + i, f27051q + getHeight());
        m43842p();
    }

    /* JADX INFO: renamed from: j */
    public final void m43836j() {
        View.inflate(getContext(), l6c0.f126267B4, this);
        this.f27060h = (TextView) findViewById(y4c0.f196020O4);
        this.f27061i = (ImageView) findViewById(y4c0.f196159k1);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m43837k() {
        if (NullChecker.m81303a(getParent())) {
            ((ViewGroup) getParent()).removeView(this);
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m43838l(Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            this.f27060h.setText(R$string.f20795K6);
            this.f27060h.setEnabled(false);
            this.f27061i.setImageResource(c3c0.f78558K0);
            postDelayed(new Runnable() { // from class: l.ysm0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f199795a.m43837k();
                }
            }, 1000L);
            return;
        }
        if (iIntValue == 1 || iIntValue == 2) {
            this.f27060h.setText(R$string.f20803L6);
            this.f27061i.setImageResource(c3c0.f78549J0);
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m43839m(Long l2) {
        if (tqm0.m190131p().m190140l() == 3) {
            this.f27060h.setText(ssm0.m185758b(l2.longValue()));
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m43841o(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        f27050p = iIntValue;
        layout(iIntValue, getTop(), this.f27054b + iIntValue, getBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        f27052r.add(this.f27063k);
        m43834h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f27052r.remove(this.f27063k);
        mkd0.m154992z(this.f27059g);
        mkd0.m154992z(this.f27062j);
        if (NullChecker.m81303a(this.f27058f)) {
            this.f27058f.cancel();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m43840n();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f27054b = i;
        this.f27055c = i2;
        this.f27056d = xdl0.m208412y0();
        this.f27057e = xdl0.m208408w0();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f27064l.onTouchEvent(motionEvent);
        int i = 0;
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f27053a = false;
            f27048n = (int) motionEvent.getX();
            f27049o = (int) motionEvent.getY();
        } else if (action == 1) {
            setPressed(false);
            m43843q();
            this.f27053a = false;
        } else if (action == 2) {
            float x = motionEvent.getX() - f27048n;
            float y = motionEvent.getY() - f27049o;
            if (Math.abs(x) > 10.0f || Math.abs(y) > 10.0f) {
                this.f27053a = true;
                int left = (int) (getLeft() + x);
                int i2 = this.f27054b + left;
                int top = (int) (getTop() + y);
                int i3 = this.f27055c;
                int i4 = top + i3;
                if (left < 0) {
                    i2 = this.f27054b;
                    left = 0;
                } else {
                    int i5 = this.f27056d;
                    if (i2 > i5) {
                        left = i5 - this.f27054b;
                        i2 = i5;
                    }
                }
                if (top >= 0) {
                    int i6 = this.f27057e;
                    if (i4 > i6) {
                        int i7 = i6 - i3;
                        i3 = i6;
                        i = i7;
                    } else {
                        i = top;
                        i3 = i4;
                    }
                }
                f27050p = left;
                f27051q = i;
                layout(left, i, i2, i3);
            }
        } else if (action == 3) {
            setPressed(false);
            m43843q();
            this.f27053a = false;
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m43842p() {
        if (f27052r.isEmpty()) {
            return;
        }
        Iterator<d30> it = f27052r.iterator();
        while (it.hasNext()) {
            it.next().call();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m43843q() {
        if (getLeft() == 0 || getLeft() == this.f27056d - getWidth()) {
            return;
        }
        if (getLeft() + (getWidth() / 2) < this.f27056d / 2) {
            this.f27058f = ValueAnimator.ofInt(getLeft(), 0);
        } else {
            this.f27058f = ValueAnimator.ofInt(getLeft(), this.f27056d - this.f27054b);
        }
        this.f27058f.setDuration(f27047m);
        this.f27058f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.xsm0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f194290a.m43841o(valueAnimator);
            }
        });
        this.f27058f.start();
    }

    public VoiceCallView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27063k = new d30() { // from class: l.tsm0
            @Override // p149l.d30
            public final void call() {
                this.f171946a.m43840n();
            }
        };
        this.f27064l = new GestureDetector(getContext(), new C8257a());
        m43836j();
    }

    public VoiceCallView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27063k = new d30() { // from class: l.tsm0
            @Override // p149l.d30
            public final void call() {
                this.f171946a.m43840n();
            }
        };
        this.f27064l = new GestureDetector(getContext(), new C8257a());
        m43836j();
    }
}
