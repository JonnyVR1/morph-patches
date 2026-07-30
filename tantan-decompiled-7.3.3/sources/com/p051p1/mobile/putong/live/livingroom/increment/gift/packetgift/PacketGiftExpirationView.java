package com.p051p1.mobile.putong.live.livingroom.increment.gift.packetgift;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveExpirationItem;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.LiveGiftItemView;
import java.util.Arrays;
import java.util.List;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.cpj;
import p153l.gt0;
import p153l.jjs;
import p153l.jyb;
import p153l.l51;
import p153l.md60;
import p153l.n9c0;
import p153l.qa00;
import p153l.x20;

/* JADX INFO: loaded from: classes4.dex */
public class PacketGiftExpirationView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VFrame f50737a;

    /* JADX INFO: renamed from: b */
    public VLinear f50738b;

    /* JADX INFO: renamed from: c */
    public VText f50739c;

    /* JADX INFO: renamed from: d */
    public VText f50740d;

    /* JADX INFO: renamed from: e */
    public VText f50741e;

    /* JADX INFO: renamed from: f */
    public VText f50742f;

    /* JADX INFO: renamed from: g */
    public List<Integer> f50743g;

    /* JADX INFO: renamed from: h */
    public x20 f50744h;

    /* JADX INFO: renamed from: i */
    public int[] f50745i;

    /* JADX INFO: renamed from: j */
    public boolean f50746j;

    /* JADX INFO: renamed from: k */
    public int f50747k;

    /* JADX INFO: renamed from: l */
    public LiveGiftItemView f50748l;

    /* JADX INFO: renamed from: m */
    public Animator f50749m;

    /* JADX INFO: renamed from: n */
    public Animator f50750n;

    /* JADX INFO: renamed from: o */
    public long f50751o;

    public PacketGiftExpirationView(@NonNull Context context) {
        super(context);
        this.f50743g = Arrays.asList(0, 1, 4, 5);
        this.f50745i = new int[2];
        this.f50746j = true;
        this.f50747k = qa00.m175859d(16.0f);
    }

    private int getMaxWidth() {
        int iM105592y0;
        int i;
        if (this.f50746j) {
            iM105592y0 = (bnl0.m105592y0() - this.f50745i[0]) - this.f50748l.getWidth();
            i = this.f50747k;
        } else {
            iM105592y0 = this.f50745i[0];
            i = this.f50747k;
        }
        return iM105592y0 - i;
    }

    /* JADX INFO: renamed from: f */
    public final void m75091f(View view) {
        md60.m157959a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final String m75092g(List<BLiveExpirationItem> list, int i) {
        if (i >= list.size()) {
            return "";
        }
        String strM111768D = cpj.m111768D(list.get(i).info);
        int i2 = list.get(i).num;
        StringBuilder sb = new StringBuilder();
        sb.append(strM111768D);
        sb.append(" x");
        sb.append(i2 > 99 ? "99+" : Integer.valueOf(i2));
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    public final String m75093h(List<BLiveExpirationItem> list, jjs jjsVar) {
        return jyb.m147479J(list) ? String.format(getContext().getString(R$string.f48301pa), jjsVar.m145122h().getLocalName()) : getContext().getString(R$string.f48257na);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m75094i() {
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
    public final /* synthetic */ void m75095j() {
        m75106u();
        m75105t();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m75096k() {
        if (m75094i()) {
            m75104s();
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ boolean m75097l(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 1 && action != 3) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f50751o;
        if (jCurrentTimeMillis >= 400) {
            m75104s();
            return false;
        }
        l51.m152888H(getContext(), new Runnable() { // from class: l.hd60
            @Override // java.lang.Runnable
            public final void run() {
                this.f108790a.m75096k();
            }
        }, 400 - jCurrentTimeMillis);
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m75098m() {
        this.f50744h.call();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m75099n() {
        bnl0.m105525M0(this.f50738b, true);
    }

    /* JADX INFO: renamed from: o */
    public final void m75100o(Animator animator) {
        if (animator == null || !animator.isRunning()) {
            return;
        }
        animator.removeAllListeners();
        animator.cancel();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m75100o(this.f50749m);
        m75100o(this.f50750n);
        bnl0.m105525M0(this.f50738b, false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75091f(this);
    }

    /* JADX INFO: renamed from: p */
    public final void m75101p(List<BLiveExpirationItem> list, jjs jjsVar) {
        this.f50739c.setText(m75093h(list, jjsVar));
        this.f50739c.setTextColor(jyb.m147479J(list) ? getContext().getResources().getColor(n9c0.f140843l0) : getContext().getResources().getColor(n9c0.f140850n1));
        m75103r(this.f50740d, m75092g(list, 0));
        m75103r(this.f50741e, m75092g(list, 1));
        m75103r(this.f50742f, m75092g(list, 2));
        int maxWidth = getMaxWidth();
        ViewGroup.LayoutParams layoutParams = this.f50737a.getLayoutParams();
        layoutParams.width = maxWidth;
        this.f50737a.setLayoutParams(layoutParams);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: q */
    public void m75102q(jjs jjsVar, LiveGiftItemView liveGiftItemView, int i, x20 x20Var) {
        this.f50748l = liveGiftItemView;
        this.f50744h = x20Var;
        this.f50746j = this.f50743g.contains(Integer.valueOf(i));
        liveGiftItemView.getLocationOnScreen(this.f50745i);
        m75101p(jjsVar.m145122h().interactRules.longPress.expirationInfos, jjsVar);
        l51.m152887G(new Runnable() { // from class: l.kd60
            @Override // java.lang.Runnable
            public final void run() {
                this.f125156a.m75095j();
            }
        });
        liveGiftItemView.setOnTouchListener(new View.OnTouchListener() { // from class: l.ld60
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f131417a.m75097l(view, motionEvent);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final void m75103r(TextView textView, CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            textView.setText("");
            bnl0.m105524M(textView, false);
        } else {
            textView.setText(charSequence);
            bnl0.m105524M(textView, true);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m75104s() {
        boolean z = this.f50746j;
        VLinear vLinear = this.f50738b;
        Property property = View.TRANSLATION_X;
        if (z) {
            this.f50750n = ObjectAnimator.ofFloat(vLinear, (Property<VLinear, Float>) property, 0.0f, -vLinear.getWidth());
        } else {
            this.f50750n = ObjectAnimator.ofFloat(vLinear, (Property<VLinear, Float>) property, 0.0f, vLinear.getWidth());
        }
        this.f50750n.setDuration(400L);
        gt0.m132160f(this.f50750n, new Runnable() { // from class: l.jd60
            @Override // java.lang.Runnable
            public final void run() {
                this.f120114a.m75098m();
            }
        });
        this.f50750n.start();
    }

    /* JADX INFO: renamed from: t */
    public final void m75105t() {
        boolean z = this.f50746j;
        VLinear vLinear = this.f50738b;
        Property property = View.TRANSLATION_X;
        if (z) {
            this.f50749m = ObjectAnimator.ofFloat(vLinear, (Property<VLinear, Float>) property, -vLinear.getWidth(), 0.0f);
        } else {
            this.f50749m = ObjectAnimator.ofFloat(vLinear, (Property<VLinear, Float>) property, vLinear.getWidth(), 0.0f);
        }
        this.f50749m.setDuration(400L);
        gt0.m132176v(this.f50749m, new Runnable() { // from class: l.id60
            @Override // java.lang.Runnable
            public final void run() {
                this.f114475a.m75099n();
            }
        });
        this.f50749m.start();
        this.f50751o = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: u */
    public void m75106u() {
        int height = this.f50745i[1] - ((this.f50738b.getHeight() - this.f50748l.getHeight()) / 2);
        ViewGroup.LayoutParams layoutParams = this.f50737a.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = height;
            if (this.f50746j) {
                layoutParams2.leftMargin = this.f50745i[0] + this.f50748l.getWidth();
                layoutParams2.rightMargin = this.f50747k;
            } else {
                layoutParams2.leftMargin = this.f50747k;
                layoutParams2.rightMargin = bnl0.m105592y0() - this.f50745i[0];
            }
        }
        this.f50737a.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams3 = this.f50738b.getLayoutParams();
        if (layoutParams3 instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams3).gravity = this.f50746j ? 8388611 : 8388613;
        }
        this.f50738b.setLayoutParams(layoutParams3);
    }

    public PacketGiftExpirationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50743g = Arrays.asList(0, 1, 4, 5);
        this.f50745i = new int[2];
        this.f50746j = true;
        this.f50747k = qa00.m175859d(16.0f);
    }
}
