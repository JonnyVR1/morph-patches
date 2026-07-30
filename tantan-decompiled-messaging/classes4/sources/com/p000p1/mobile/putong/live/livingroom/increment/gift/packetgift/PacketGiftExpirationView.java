package com.p000p1.mobile.putong.live.livingroom.increment.gift.packetgift;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveExpirationItem;
import java.util.Arrays;
import java.util.List;
import l.bt0;
import l.d30;
import l.e51;
import l.t100;
import l.vwb;
import l.xdl0;
import p002l.g560;
import p002l.h1c0;
import p002l.ihs;
import p002l.mmj;
import v.VFrame;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class PacketGiftExpirationView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VFrame f5931a;

    /* JADX INFO: renamed from: b */
    public VLinear f5932b;

    /* JADX INFO: renamed from: c */
    public VText f5933c;

    /* JADX INFO: renamed from: d */
    public VText f5934d;

    /* JADX INFO: renamed from: e */
    public VText f5935e;

    /* JADX INFO: renamed from: f */
    public VText f5936f;

    /* JADX INFO: renamed from: g */
    public List<Integer> f5937g;

    /* JADX INFO: renamed from: h */
    public d30 f5938h;

    /* JADX INFO: renamed from: i */
    public int[] f5939i;

    /* JADX INFO: renamed from: j */
    public boolean f5940j;

    /* JADX INFO: renamed from: k */
    public int f5941k;

    /* JADX INFO: renamed from: l */
    public LiveGiftItemView f5942l;

    /* JADX INFO: renamed from: m */
    public Animator f5943m;

    /* JADX INFO: renamed from: n */
    public Animator f5944n;

    /* JADX INFO: renamed from: o */
    public long f5945o;

    public PacketGiftExpirationView(@NonNull Context context) {
        super(context);
        this.f5937g = Arrays.asList(0, 1, 4, 5);
        this.f5939i = new int[2];
        this.f5940j = true;
        this.f5941k = t100.d(16.0f);
    }

    private int getMaxWidth() {
        int iY0;
        int i;
        if (this.f5940j) {
            iY0 = (xdl0.y0() - this.f5939i[0]) - this.f5942l.getWidth();
            i = this.f5941k;
        } else {
            iY0 = this.f5939i[0];
            i = this.f5941k;
        }
        return iY0 - i;
    }

    /* JADX INFO: renamed from: f */
    public final void m7464f(View view) {
        g560.m13630a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final String m7465g(List<BLiveExpirationItem> list, int i) {
        if (i >= list.size()) {
            return "";
        }
        String strM18043D = mmj.m18043D(list.get(i).info);
        int i2 = list.get(i).num;
        StringBuilder sb = new StringBuilder();
        sb.append(strM18043D);
        sb.append(" x");
        sb.append(i2 > 99 ? "99+" : Integer.valueOf(i2));
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    public final String m7466h(List<BLiveExpirationItem> list, ihs ihsVar) {
        return vwb.J(list) ? String.format(getContext().getString(R$string.f3495pa), ihsVar.m15160h().getLocalName()) : getContext().getString(R$string.f3451na);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m7467i() {
        Act context = getContext();
        if (context instanceof Act) {
            Act act = context;
            if (!act.isFinishing() && !act.isDestroyed()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m7468j() {
        m7479u();
        m7478t();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m7469k() {
        if (m7467i()) {
            m7477s();
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ boolean m7470l(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 1 && action != 3) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f5945o;
        if (jCurrentTimeMillis >= 400) {
            m7477s();
            return false;
        }
        e51.H(getContext(), new Runnable() { // from class: l.b560
            @Override // java.lang.Runnable
            public final void run() {
                this.f7987a.m7469k();
            }
        }, 400 - jCurrentTimeMillis);
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m7471m() {
        this.f5938h.call();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m7472n() {
        xdl0.M0(this.f5932b, true);
    }

    /* JADX INFO: renamed from: o */
    public final void m7473o(Animator animator) {
        if (animator == null || !animator.isRunning()) {
            return;
        }
        animator.removeAllListeners();
        animator.cancel();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m7473o(this.f5943m);
        m7473o(this.f5944n);
        xdl0.M0(this.f5932b, false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7464f(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m7474p(List<BLiveExpirationItem> list, ihs ihsVar) {
        this.f5933c.setText(m7466h(list, ihsVar));
        this.f5933c.setTextColor(vwb.J(list) ? getContext().getResources().getColor(h1c0.f11802l0) : getContext().getResources().getColor(h1c0.f11809n1));
        m7476r(this.f5934d, m7465g(list, 0));
        m7476r(this.f5935e, m7465g(list, 1));
        m7476r(this.f5936f, m7465g(list, 2));
        int maxWidth = getMaxWidth();
        ViewGroup.LayoutParams layoutParams = this.f5931a.getLayoutParams();
        layoutParams.width = maxWidth;
        this.f5931a.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: q */
    public void m7475q(ihs ihsVar, LiveGiftItemView liveGiftItemView, int i, d30 d30Var) {
        this.f5942l = liveGiftItemView;
        this.f5938h = d30Var;
        this.f5940j = this.f5937g.contains(Integer.valueOf(i));
        liveGiftItemView.getLocationOnScreen(this.f5939i);
        m7474p(ihsVar.m15160h().interactRules.longPress.expirationInfos, ihsVar);
        e51.G(new Runnable() { // from class: l.e560
            @Override // java.lang.Runnable
            public final void run() {
                this.f9578a.m7468j();
            }
        });
        liveGiftItemView.setOnTouchListener(new View.OnTouchListener() { // from class: l.f560
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f10125a.m7470l(view, motionEvent);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final void m7476r(TextView textView, CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            textView.setText("");
            xdl0.M(textView, false);
        } else {
            textView.setText(charSequence);
            xdl0.M(textView, true);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m7477s() {
        boolean z = this.f5940j;
        VLinear vLinear = this.f5932b;
        Property property = View.TRANSLATION_X;
        if (z) {
            this.f5944n = ObjectAnimator.ofFloat(vLinear, (Property<VLinear, Float>) property, 0.0f, -vLinear.getWidth());
        } else {
            this.f5944n = ObjectAnimator.ofFloat(vLinear, (Property<VLinear, Float>) property, 0.0f, vLinear.getWidth());
        }
        this.f5944n.setDuration(400L);
        bt0.f(this.f5944n, new Runnable() { // from class: l.d560
            @Override // java.lang.Runnable
            public final void run() {
                this.f9061a.m7471m();
            }
        });
        this.f5944n.start();
    }

    /* JADX INFO: renamed from: t */
    public final void m7478t() {
        boolean z = this.f5940j;
        VLinear vLinear = this.f5932b;
        Property property = View.TRANSLATION_X;
        if (z) {
            this.f5943m = ObjectAnimator.ofFloat(vLinear, (Property<VLinear, Float>) property, -vLinear.getWidth(), 0.0f);
        } else {
            this.f5943m = ObjectAnimator.ofFloat(vLinear, (Property<VLinear, Float>) property, vLinear.getWidth(), 0.0f);
        }
        this.f5943m.setDuration(400L);
        bt0.v(this.f5943m, new Runnable() { // from class: l.c560
            @Override // java.lang.Runnable
            public final void run() {
                this.f8487a.m7472n();
            }
        });
        this.f5943m.start();
        this.f5945o = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: u */
    public void m7479u() {
        int height = this.f5939i[1] - ((this.f5932b.getHeight() - this.f5942l.getHeight()) / 2);
        ViewGroup.LayoutParams layoutParams = this.f5931a.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = height;
            if (this.f5940j) {
                layoutParams2.leftMargin = this.f5939i[0] + this.f5942l.getWidth();
                layoutParams2.rightMargin = this.f5941k;
            } else {
                layoutParams2.leftMargin = this.f5941k;
                layoutParams2.rightMargin = xdl0.y0() - this.f5939i[0];
            }
        }
        this.f5931a.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams3 = this.f5932b.getLayoutParams();
        if (layoutParams3 instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams3).gravity = this.f5940j ? 8388611 : 8388613;
        }
        this.f5932b.setLayoutParams(layoutParams3);
    }

    public PacketGiftExpirationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5937g = Arrays.asList(0, 1, 4, 5);
        this.f5939i = new int[2];
        this.f5940j = true;
        this.f5941k = t100.d(16.0f);
    }
}
