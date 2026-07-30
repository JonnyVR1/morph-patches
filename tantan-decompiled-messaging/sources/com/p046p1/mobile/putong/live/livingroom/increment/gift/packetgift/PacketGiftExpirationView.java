package com.p046p1.mobile.putong.live.livingroom.increment.gift.packetgift;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveExpirationItem;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import java.util.Arrays;
import java.util.List;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText;
import p149l.bt0;
import p149l.d30;
import p149l.e51;
import p149l.g560;
import p149l.h1c0;
import p149l.ihs;
import p149l.mmj;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class PacketGiftExpirationView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VFrame f49889a;

    /* JADX INFO: renamed from: b */
    public VLinear f49890b;

    /* JADX INFO: renamed from: c */
    public VText f49891c;

    /* JADX INFO: renamed from: d */
    public VText f49892d;

    /* JADX INFO: renamed from: e */
    public VText f49893e;

    /* JADX INFO: renamed from: f */
    public VText f49894f;

    /* JADX INFO: renamed from: g */
    public List<Integer> f49895g;

    /* JADX INFO: renamed from: h */
    public d30 f49896h;

    /* JADX INFO: renamed from: i */
    public int[] f49897i;

    /* JADX INFO: renamed from: j */
    public boolean f49898j;

    /* JADX INFO: renamed from: k */
    public int f49899k;

    /* JADX INFO: renamed from: l */
    public LiveGiftItemView f49900l;

    /* JADX INFO: renamed from: m */
    public Animator f49901m;

    /* JADX INFO: renamed from: n */
    public Animator f49902n;

    /* JADX INFO: renamed from: o */
    public long f49903o;

    public PacketGiftExpirationView(@NonNull Context context) {
        super(context);
        this.f49895g = Arrays.asList(0, 1, 4, 5);
        this.f49897i = new int[2];
        this.f49898j = true;
        this.f49899k = t100.m186890d(16.0f);
    }

    private int getMaxWidth() {
        int iM208412y0;
        int i;
        if (this.f49898j) {
            iM208412y0 = (xdl0.m208412y0() - this.f49897i[0]) - this.f49900l.getWidth();
            i = this.f49899k;
        } else {
            iM208412y0 = this.f49897i[0];
            i = this.f49899k;
        }
        return iM208412y0 - i;
    }

    /* JADX INFO: renamed from: f */
    public final void m73908f(View view) {
        g560.m124472a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final String m73909g(List<BLiveExpirationItem> list, int i) {
        if (i >= list.size()) {
            return "";
        }
        String strM155401D = mmj.m155401D(list.get(i).info);
        int i2 = list.get(i).num;
        StringBuilder sb = new StringBuilder();
        sb.append(strM155401D);
        sb.append(" x");
        sb.append(i2 > 99 ? "99+" : Integer.valueOf(i2));
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    public final String m73910h(List<BLiveExpirationItem> list, ihs ihsVar) {
        return vwb.m200296J(list) ? String.format(getContext().getString(R$string.f47453pa), ihsVar.m136283h().getLocalName()) : getContext().getString(R$string.f47409na);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m73911i() {
        Context context = getContext();
        if (context instanceof Act) {
            Act act = (Act) context;
            if (!act.isFinishing() && !act.isDestroyed()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m73912j() {
        m73923u();
        m73922t();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m73913k() {
        if (m73911i()) {
            m73921s();
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ boolean m73914l(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 1 && action != 3) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f49903o;
        if (jCurrentTimeMillis >= 400) {
            m73921s();
            return false;
        }
        e51.m114743H(getContext(), new Runnable() { // from class: l.b560
            @Override // java.lang.Runnable
            public final void run() {
                this.f73443a.m73913k();
            }
        }, 400 - jCurrentTimeMillis);
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m73915m() {
        this.f49896h.call();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m73916n() {
        xdl0.m208345M0(this.f49890b, true);
    }

    /* JADX INFO: renamed from: o */
    public final void m73917o(Animator animator) {
        if (animator == null || !animator.isRunning()) {
            return;
        }
        animator.removeAllListeners();
        animator.cancel();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m73917o(this.f49901m);
        m73917o(this.f49902n);
        xdl0.m208345M0(this.f49890b, false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73908f(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m73918p(List<BLiveExpirationItem> list, ihs ihsVar) {
        this.f49891c.setText(m73910h(list, ihsVar));
        this.f49891c.setTextColor(vwb.m200296J(list) ? getContext().getResources().getColor(h1c0.f105382l0) : getContext().getResources().getColor(h1c0.f105389n1));
        m73920r(this.f49892d, m73909g(list, 0));
        m73920r(this.f49893e, m73909g(list, 1));
        m73920r(this.f49894f, m73909g(list, 2));
        int maxWidth = getMaxWidth();
        ViewGroup.LayoutParams layoutParams = this.f49889a.getLayoutParams();
        layoutParams.width = maxWidth;
        this.f49889a.setLayoutParams(layoutParams);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: q */
    public void m73919q(ihs ihsVar, LiveGiftItemView liveGiftItemView, int i, d30 d30Var) {
        this.f49900l = liveGiftItemView;
        this.f49896h = d30Var;
        this.f49898j = this.f49895g.contains(Integer.valueOf(i));
        liveGiftItemView.getLocationOnScreen(this.f49897i);
        m73918p(ihsVar.m136283h().interactRules.longPress.expirationInfos, ihsVar);
        e51.m114742G(new Runnable() { // from class: l.e560
            @Override // java.lang.Runnable
            public final void run() {
                this.f89352a.m73912j();
            }
        });
        liveGiftItemView.setOnTouchListener(new View.OnTouchListener() { // from class: l.f560
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f94963a.m73914l(view, motionEvent);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final void m73920r(TextView textView, CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            textView.setText("");
            xdl0.m208344M(textView, false);
        } else {
            textView.setText(charSequence);
            xdl0.m208344M(textView, true);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m73921s() {
        boolean z = this.f49898j;
        VLinear vLinear = this.f49890b;
        Property property = View.TRANSLATION_X;
        if (z) {
            this.f49902n = ObjectAnimator.ofFloat(vLinear, (Property<VLinear, Float>) property, 0.0f, -vLinear.getWidth());
        } else {
            this.f49902n = ObjectAnimator.ofFloat(vLinear, (Property<VLinear, Float>) property, 0.0f, vLinear.getWidth());
        }
        this.f49902n.setDuration(400L);
        bt0.m103733f(this.f49902n, new Runnable() { // from class: l.d560
            @Override // java.lang.Runnable
            public final void run() {
                this.f84378a.m73915m();
            }
        });
        this.f49902n.start();
    }

    /* JADX INFO: renamed from: t */
    public final void m73922t() {
        boolean z = this.f49898j;
        VLinear vLinear = this.f49890b;
        Property property = View.TRANSLATION_X;
        if (z) {
            this.f49901m = ObjectAnimator.ofFloat(vLinear, (Property<VLinear, Float>) property, -vLinear.getWidth(), 0.0f);
        } else {
            this.f49901m = ObjectAnimator.ofFloat(vLinear, (Property<VLinear, Float>) property, vLinear.getWidth(), 0.0f);
        }
        this.f49901m.setDuration(400L);
        bt0.m103749v(this.f49901m, new Runnable() { // from class: l.c560
            @Override // java.lang.Runnable
            public final void run() {
                this.f79340a.m73916n();
            }
        });
        this.f49901m.start();
        this.f49903o = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: u */
    public void m73923u() {
        int height = this.f49897i[1] - ((this.f49890b.getHeight() - this.f49900l.getHeight()) / 2);
        ViewGroup.LayoutParams layoutParams = this.f49889a.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = height;
            if (this.f49898j) {
                layoutParams2.leftMargin = this.f49897i[0] + this.f49900l.getWidth();
                layoutParams2.rightMargin = this.f49899k;
            } else {
                layoutParams2.leftMargin = this.f49899k;
                layoutParams2.rightMargin = xdl0.m208412y0() - this.f49897i[0];
            }
        }
        this.f49889a.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams3 = this.f49890b.getLayoutParams();
        if (layoutParams3 instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams3).gravity = this.f49898j ? 8388611 : 8388613;
        }
        this.f49890b.setLayoutParams(layoutParams3);
    }

    public PacketGiftExpirationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49895g = Arrays.asList(0, 1, 4, 5);
        this.f49897i = new int[2];
        this.f49898j = true;
        this.f49899k = t100.m186890d(16.0f);
    }
}
