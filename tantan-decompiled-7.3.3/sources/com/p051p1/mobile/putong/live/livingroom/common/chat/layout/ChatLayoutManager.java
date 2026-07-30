package com.p051p1.mobile.putong.live.livingroom.common.chat.layout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;
import p153l.gt4;
import p153l.nsh0;
import p153l.pf60;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class ChatLayoutManager extends RecyclerView.AbstractC0579o {

    /* JADX INFO: renamed from: a */
    public int f49730a;

    /* JADX INFO: renamed from: b */
    public int f49731b;

    /* JADX INFO: renamed from: c */
    public int f49732c;

    /* JADX INFO: renamed from: h */
    public y20<Boolean> f49737h;

    /* JADX INFO: renamed from: l */
    public int f49741l;

    /* JADX INFO: renamed from: n */
    public String f49743n;

    /* JADX INFO: renamed from: o */
    public gt4 f49744o;

    /* JADX INFO: renamed from: q */
    public ValueAnimator f49746q;

    /* JADX INFO: renamed from: r */
    public RecyclerView.C0561a0 f49747r;

    /* JADX INFO: renamed from: w */
    public x20 f49752w;

    /* JADX INFO: renamed from: x */
    public int f49753x;

    /* JADX INFO: renamed from: d */
    public int f49733d = 0;

    /* JADX INFO: renamed from: e */
    public boolean f49734e = false;

    /* JADX INFO: renamed from: f */
    public int f49735f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f49736g = false;

    /* JADX INFO: renamed from: i */
    public boolean f49738i = false;

    /* JADX INFO: renamed from: j */
    public boolean f49739j = false;

    /* JADX INFO: renamed from: k */
    public String f49740k = "scroll_init";

    /* JADX INFO: renamed from: m */
    public int f49742m = 0;

    /* JADX INFO: renamed from: p */
    public final SparseArray<View> f49745p = new SparseArray<>();

    /* JADX INFO: renamed from: s */
    public int f49748s = -1;

    /* JADX INFO: renamed from: t */
    public int f49749t = -1;

    /* JADX INFO: renamed from: u */
    public long f49750u = 0;

    /* JADX INFO: renamed from: v */
    public int f49751v = 0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.chat.layout.ChatLayoutManager$a */
    public class C12909a extends AnimatorListenerAdapter {
        public C12909a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            ChatLayoutManager.this.f49739j = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            ChatLayoutManager.this.f49739j = false;
            if (ChatLayoutManager.this.f49731b != 0) {
                ChatLayoutManager.this.f49731b = 0;
                ChatLayoutManager.this.requestLayout();
            }
        }
    }

    public ChatLayoutManager(y20<Boolean> y20Var, gt4 gt4Var) {
        this.f49737h = y20Var;
        this.f49744o = gt4Var;
    }

    /* JADX INFO: renamed from: A */
    public void m73825A(x20 x20Var) {
        this.f49752w = x20Var;
    }

    /* JADX INFO: renamed from: B */
    public void m73826B() {
        ValueAnimator valueAnimator = this.f49746q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f49745p.clear();
    }

    /* JADX INFO: renamed from: C */
    public final void m73827C(RecyclerView.C0586v c0586v) {
        List<RecyclerView.AbstractC0569e0> listM3471k = c0586v.m3471k();
        for (int i = 0; i < listM3471k.size(); i++) {
            removeAndRecycleView(listM3471k.get(i).itemView, c0586v);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m73828D(RecyclerView.C0586v c0586v, int i) {
        int i2 = i - 1;
        this.f49733d = i2;
        this.f49731b = 0;
        m73853z(c0586v, 0, i2, i, true, true);
    }

    /* JADX INFO: renamed from: E */
    public final void m73829E(RecyclerView.C0586v c0586v, int i) {
        this.f49732c = 0;
        this.f49730a = 0;
        m73853z(c0586v, 0, 0, i, false, true);
    }

    /* JADX INFO: renamed from: F */
    public void m73830F() {
        if (this.f49740k.equals("scroll_init")) {
            return;
        }
        this.f49740k = "scroll_end";
        this.f49737h.call(Boolean.FALSE);
        requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0030 A[PHI: r5
      0x0030: PHI (r5v4 int) = (r5v2 int), (r5v3 int) binds: [B:11:0x002e, B:14:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: G */
    public final void m73831G(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0, int i) {
        int iM73834g = m73834g(i, c0586v);
        if (iM73834g <= 0) {
            return;
        }
        this.f49739j = true;
        this.f49741l = 0;
        this.f49742m = 0;
        ValueAnimator valueAnimator = this.f49746q;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f49746q.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, iM73834g);
        this.f49746q = valueAnimatorOfInt;
        int i2 = (iM73834g / 5) * 12;
        int i3 = 100;
        if (i2 < 100) {
            i2 = i3;
        } else {
            i3 = 1000;
            if (i2 > 1000) {
                i2 = i3;
            }
        }
        valueAnimatorOfInt.setDuration(i2);
        this.f49746q.setInterpolator(new DecelerateInterpolator());
        this.f49746q.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ey4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f96393a.m73851x(valueAnimator2);
            }
        });
        this.f49746q.addListener(new C12909a());
        this.f49746q.start();
    }

    /* JADX INFO: renamed from: H */
    public final boolean m73832H(RecyclerView.C0586v c0586v, int i, int i2, boolean z) {
        int iM73845r = this.f49735f - (z ? this.f49731b : this.f49730a);
        while (iM73845r > 0 && i > -1 && i < i2) {
            View viewM73848u = m73848u(c0586v, i);
            measureChildWithMargins(viewM73848u, 0, 0);
            iM73845r -= m73845r(viewM73848u);
            i = z ? i - 1 : i + 1;
        }
        return iM73845r <= 0;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m73833I(RecyclerView.C0586v c0586v, int i) {
        if (i > 15) {
            return false;
        }
        int iM73845r = this.f49735f;
        for (int i2 = 0; iM73845r >= 0 && i2 < i; i2++) {
            View viewM73848u = m73848u(c0586v, i2);
            measureChildWithMargins(viewM73848u, 0, 0);
            iM73845r -= m73845r(viewM73848u);
        }
        return iM73845r >= 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public boolean canScrollVertically() {
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final int m73834g(int i, RecyclerView.C0586v c0586v) {
        int i2 = this.f49733d;
        int i3 = i - i2;
        int iM73846s = -this.f49731b;
        if (i3 > 0) {
            while (true) {
                i2++;
                if (i2 >= i + 1) {
                    break;
                }
                iM73846s += m73846s(c0586v, i2);
            }
        }
        return iM73846s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public RecyclerView.C0580p generateDefaultLayoutParams() {
        return new RecyclerView.C0580p(-2, -2);
    }

    /* JADX INFO: renamed from: h */
    public boolean m73835h() {
        return this.f49734e;
    }

    /* JADX INFO: renamed from: i */
    public final void m73836i() {
        if (this.f49733d < this.f49744o.m132197e0().size()) {
            this.f49743n = this.f49744o.m132197e0().get(this.f49733d).layoutId;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final void m73837j(RecyclerView.C0561a0 c0561a0) {
        if (this.f49751v != c0561a0.m3361c()) {
            this.f49751v = c0561a0.m3361c();
            long j = this.f49750u + 1;
            this.f49750u = j;
            if (j < 3 || !this.f49740k.equals("scroll_init")) {
                return;
            }
            this.f49740k = "scroll_anim_end";
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m73838k(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0) {
        m73836i();
        String str = this.f49740k;
        str.getClass();
        switch (str) {
            case "scroll_anim_end":
                if (!this.f49736g && !this.f49739j && !this.f49738i && c0561a0.m3361c() - 1 > this.f49733d) {
                    m73831G(c0586v, c0561a0, c0561a0.m3361c() - 1);
                    break;
                }
                break;
            case "scroll_end":
                this.f49736g = false;
                this.f49740k = "scroll_anim_end";
                break;
            case "delete_item_anim":
                int i = this.f49748s;
                if (i < 0 || i > c0561a0.m3361c() - 1) {
                    if (this.f49733d < this.f49747r.m3361c() - 1) {
                        this.f49740k = "idle";
                    } else {
                        this.f49740k = "scroll_end";
                    }
                }
                if (this.f49749t == -1) {
                    this.f49749t = m73846s(c0586v, this.f49748s);
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m73839l(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0, int i, boolean z) {
        this.f49747r = c0561a0;
        m73840m(c0586v, c0561a0, i, z);
        m73827C(c0586v);
        this.f49745p.clear();
    }

    /* JADX INFO: renamed from: m */
    public final void m73840m(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0, int i, boolean z) {
        ChatLayoutManager chatLayoutManager;
        RecyclerView.C0586v c0586v2;
        int i2;
        this.f49735f = getHeight();
        int iM3361c = c0561a0.m3361c();
        if (this.f49739j && !this.f49738i && this.f49740k.equals("scroll_anim_end")) {
            m73842o(this.f49741l - this.f49742m, c0586v, c0561a0.m3361c());
            this.f49742m = this.f49741l;
        }
        if (m73833I(c0586v, iM3361c)) {
            m73829E(c0586v, iM3361c);
            this.f49734e = false;
            return;
        }
        this.f49734e = true;
        if (this.f49740k.equals("scroll_end") || this.f49740k.equals("scroll_init")) {
            chatLayoutManager = this;
            c0586v2 = c0586v;
            chatLayoutManager.m73828D(c0586v2, iM3361c);
        } else {
            if (this.f49733d == 0 && this.f49731b == 0 && this.f49732c == 0 && this.f49730a == 0) {
                m73829E(c0586v, iM3361c);
            } else if (!m73850w() || iM3361c <= 185 || (i2 = this.f49733d) >= 15 || m73832H(c0586v, i2, iM3361c, true)) {
                chatLayoutManager = this;
                c0586v2 = c0586v;
                chatLayoutManager.m73853z(c0586v2, 0, i, iM3361c, z, true);
                chatLayoutManager.m73852y(c0586v2, c0561a0);
            } else {
                m73829E(c0586v, iM3361c);
            }
            chatLayoutManager = this;
            c0586v2 = c0586v;
        }
        chatLayoutManager.m73838k(c0586v2, c0561a0);
    }

    /* JADX INFO: renamed from: n */
    public final int m73841n(RecyclerView.C0561a0 c0561a0) {
        if (this.f49733d > c0561a0.m3361c() - 1) {
            this.f49733d = c0561a0.m3361c() - 1;
        }
        if (this.f49740k.equals("scroll_anim_end") && !TextUtils.isEmpty(this.f49743n) && this.f49744o.getItemCount() > 15) {
            int itemCount = this.f49744o.getItemCount();
            int i = this.f49733d;
            if (itemCount > i) {
                for (int i2 = 0; i2 < 20; i2++) {
                    if (i >= 0 && TextUtils.equals(this.f49744o.m132197e0().get(i).layoutId, this.f49743n)) {
                        this.f49733d = i;
                        return i;
                    }
                    i--;
                }
            }
        }
        return this.f49733d;
    }

    /* JADX INFO: renamed from: o */
    public final int m73842o(int i, RecyclerView.C0586v c0586v, int i2) {
        if (i < 0) {
            int iAbs = Math.abs(i);
            if (this.f49732c == 0 && this.f49730a == 0) {
                return 0;
            }
            if (iAbs < Math.abs(this.f49730a)) {
                if (this.f49732c < 0) {
                    this.f49732c = 0;
                }
                this.f49730a += iAbs;
                return i;
            }
            int iM73846s = iAbs + this.f49730a;
            int i3 = this.f49732c;
            if (i3 <= 0) {
                this.f49732c = 0;
                this.f49730a = 0;
                return i + iM73846s;
            }
            while (iM73846s > 0) {
                if (i3 <= 0) {
                    int iM73846s2 = m73846s(c0586v, i3);
                    if (iM73846s2 > iM73846s) {
                        this.f49732c = 0;
                        this.f49730a = iM73846s - iM73846s2;
                        return i;
                    }
                    this.f49732c = 0;
                    this.f49730a = 0;
                    return i + iM73846s;
                }
                i3--;
                iM73846s -= m73846s(c0586v, i3);
            }
            this.f49730a = iM73846s;
            this.f49732c = i3;
            return i;
        }
        int i4 = i2 - 1;
        if (this.f49733d == i4 && this.f49731b == 0) {
            return 0;
        }
        if (i < Math.abs(this.f49731b)) {
            if (this.f49733d > i4) {
                this.f49733d = i4;
            }
            this.f49731b += i;
            return i;
        }
        int iM73846s3 = this.f49731b + i;
        int i5 = this.f49733d;
        if (i5 >= i4) {
            this.f49733d = i4;
            this.f49731b = 0;
            return i - iM73846s3;
        }
        while (iM73846s3 > 0) {
            if (i5 >= i4) {
                int iM73846s4 = m73846s(c0586v, i5);
                if (iM73846s4 > iM73846s3) {
                    this.f49733d = i4;
                    this.f49731b = iM73846s3 - iM73846s4;
                    return i;
                }
                this.f49733d = i4;
                this.f49731b = 0;
                return i - iM73846s3;
            }
            i5++;
            iM73846s3 -= m73846s(c0586v, i5);
        }
        this.f49731b = iM73846s3;
        this.f49733d = i5;
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void onLayoutChildren(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0) {
        try {
            if (c0561a0.m3361c() == 0) {
                removeAndRecycleAllViews(c0586v);
                return;
            }
            m73837j(c0561a0);
            detachAndScrapAttachedViews(c0586v);
            this.f49745p.clear();
            int iM73841n = m73841n(c0561a0);
            int i = this.f49753x;
            if (i != 0) {
                this.f49753x = 0;
                iM73841n = i;
            }
            m73839l(c0586v, c0561a0, iM73841n, true);
        } catch (Exception e) {
            nsh0.m164608j("[live][chat]", "onLayoutChildren error:" + e.toString());
            CrashHelper.m82479c(e);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public void onScrollStateChanged(int i) {
        x20 x20Var;
        super.onScrollStateChanged(i);
        if (i != 0) {
            this.f49740k = "idle";
            this.f49738i = true;
            return;
        }
        RecyclerView.C0561a0 c0561a0 = this.f49747r;
        if (c0561a0 == null) {
            return;
        }
        int i2 = this.f49733d;
        if (i2 < 0 || i2 >= c0561a0.m3361c() - 1) {
            m73836i();
            this.f49740k = "scroll_anim_end";
            this.f49736g = false;
            this.f49737h.call(Boolean.FALSE);
        } else {
            this.f49736g = true;
            this.f49740k = "idle";
            if (m73849v() && (x20Var = this.f49752w) != null) {
                x20Var.call();
            }
        }
        this.f49738i = false;
    }

    /* JADX INFO: renamed from: p */
    public void m73843p(int i) {
        pf60<Integer, Integer> pf60VarM73847t = m73847t();
        if (pf60VarM73847t.f152157b != null) {
            this.f49753x = (i - getItemCount()) + pf60VarM73847t.f152157b.intValue();
        }
    }

    /* JADX INFO: renamed from: q */
    public final int m73844q(View view) {
        RecyclerView.C0580p c0580p = (RecyclerView.C0580p) view.getLayoutParams();
        return getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) c0580p).leftMargin + ((ViewGroup.MarginLayoutParams) c0580p).rightMargin;
    }

    /* JADX INFO: renamed from: r */
    public final int m73845r(View view) {
        RecyclerView.C0580p c0580p = (RecyclerView.C0580p) view.getLayoutParams();
        return getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) c0580p).topMargin + ((ViewGroup.MarginLayoutParams) c0580p).bottomMargin;
    }

    /* JADX INFO: renamed from: s */
    public final int m73846s(RecyclerView.C0586v c0586v, int i) {
        try {
            View viewM73848u = m73848u(c0586v, i);
            measureChildWithMargins(viewM73848u, 0, 0);
            return m73845r(viewM73848u);
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0579o
    public int scrollVerticallyBy(int i, RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0) {
        int i2;
        if (i == 0 || !m73835h() || ((i < 0 && this.f49732c == 0 && this.f49730a == 0) || (i > 0 && (i2 = this.f49733d) > 0 && i2 == c0561a0.m3361c() - 1 && this.f49731b == 0))) {
            return 0;
        }
        detachAndScrapAttachedViews(c0586v);
        this.f49745p.clear();
        int iM73842o = m73842o(i, c0586v, c0561a0.m3361c());
        m73839l(c0586v, c0561a0, i > 0 ? this.f49733d : this.f49732c, i > 0);
        return iM73842o;
    }

    /* JADX INFO: renamed from: t */
    public pf60<Integer, Integer> m73847t() {
        return new pf60<>(Integer.valueOf(this.f49732c), Integer.valueOf(this.f49733d));
    }

    /* JADX INFO: renamed from: u */
    public final View m73848u(RecyclerView.C0586v c0586v, int i) {
        View view = this.f49745p.get(i);
        if (view != null) {
            return view;
        }
        View viewM3475o = c0586v.m3475o(i);
        this.f49745p.put(i, viewM3475o);
        return viewM3475o;
    }

    /* JADX INFO: renamed from: v */
    public boolean m73849v() {
        return this.f49732c == 0 && this.f49730a == 0;
    }

    /* JADX INFO: renamed from: w */
    public boolean m73850w() {
        return this.f49736g && this.f49740k.equals("idle");
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m73851x(ValueAnimator valueAnimator) {
        this.f49741l = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        requestLayout();
        if (this.f49738i) {
            this.f49746q.cancel();
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m73852y(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0) {
        int i;
        int i2 = this.f49732c;
        if (i2 > 0 && i2 < c0561a0.m3361c()) {
            View viewM73848u = m73848u(c0586v, this.f49732c - 1);
            addView(viewM73848u);
            measureChildWithMargins(viewM73848u, 0, 0);
            layoutDecoratedWithMargins(viewM73848u, 0, -m73845r(viewM73848u), m73844q(viewM73848u), 0);
        }
        if (this.f49733d >= c0561a0.m3361c() - 1 || (i = this.f49733d) <= 0) {
            return;
        }
        View viewM73848u2 = m73848u(c0586v, i + 1);
        addView(viewM73848u2);
        measureChildWithMargins(viewM73848u2, 0, 0);
        int iM73845r = m73845r(viewM73848u2);
        int iM73844q = m73844q(viewM73848u2);
        int i3 = this.f49735f;
        layoutDecoratedWithMargins(viewM73848u2, 0, i3, iM73844q, i3 + iM73845r);
    }

    /* JADX INFO: renamed from: z */
    public final void m73853z(RecyclerView.C0586v c0586v, int i, int i2, int i3, boolean z, boolean z2) {
        ChatLayoutManager chatLayoutManager;
        if (i2 >= i3 || i2 < 0) {
            return;
        }
        View viewM73848u = m73848u(c0586v, i2);
        boolean z3 = false;
        measureChildWithMargins(viewM73848u, 0, 0);
        int iM73845r = m73845r(viewM73848u);
        int iM73844q = m73844q(viewM73848u);
        if (!z ? i + iM73845r + this.f49730a < this.f49735f : i + iM73845r + this.f49731b < this.f49735f) {
            z3 = true;
        }
        boolean z4 = z3;
        if (z2) {
            addView(viewM73848u);
            if (z) {
                int i4 = (this.f49735f - this.f49731b) - i;
                chatLayoutManager = this;
                chatLayoutManager.layoutDecoratedWithMargins(viewM73848u, 0, i4 - iM73845r, iM73844q, i4);
            } else {
                chatLayoutManager = this;
                int i5 = chatLayoutManager.f49730a + i;
                chatLayoutManager.layoutDecoratedWithMargins(viewM73848u, 0, i5, iM73844q, i5 + iM73845r);
            }
        } else {
            chatLayoutManager = this;
        }
        if (z4) {
            chatLayoutManager.m73853z(c0586v, i + iM73845r, z ? i2 - 1 : i2 + 1, i3, z, z2);
        } else if (z) {
            chatLayoutManager.f49730a = -(((i + iM73845r) + chatLayoutManager.f49731b) - chatLayoutManager.f49735f);
            chatLayoutManager.f49732c = i2;
        } else {
            chatLayoutManager.f49731b = -(((i + iM73845r) + chatLayoutManager.f49730a) - chatLayoutManager.f49735f);
            chatLayoutManager.f49733d = i2;
        }
    }
}
