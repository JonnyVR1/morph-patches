package com.p046p1.mobile.putong.live.livingroom.common.chat.layout;

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
import p149l.d30;
import p149l.e30;
import p149l.gkh0;
import p149l.hs4;
import p149l.j760;

/* JADX INFO: loaded from: classes4.dex */
public class ChatLayoutManager extends RecyclerView.AbstractC0577o {

    /* JADX INFO: renamed from: a */
    public int f48882a;

    /* JADX INFO: renamed from: b */
    public int f48883b;

    /* JADX INFO: renamed from: c */
    public int f48884c;

    /* JADX INFO: renamed from: h */
    public e30<Boolean> f48889h;

    /* JADX INFO: renamed from: l */
    public int f48893l;

    /* JADX INFO: renamed from: n */
    public String f48895n;

    /* JADX INFO: renamed from: o */
    public hs4 f48896o;

    /* JADX INFO: renamed from: q */
    public ValueAnimator f48898q;

    /* JADX INFO: renamed from: r */
    public RecyclerView.C0588z f48899r;

    /* JADX INFO: renamed from: w */
    public d30 f48904w;

    /* JADX INFO: renamed from: x */
    public int f48905x;

    /* JADX INFO: renamed from: d */
    public int f48885d = 0;

    /* JADX INFO: renamed from: e */
    public boolean f48886e = false;

    /* JADX INFO: renamed from: f */
    public int f48887f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f48888g = false;

    /* JADX INFO: renamed from: i */
    public boolean f48890i = false;

    /* JADX INFO: renamed from: j */
    public boolean f48891j = false;

    /* JADX INFO: renamed from: k */
    public String f48892k = "scroll_init";

    /* JADX INFO: renamed from: m */
    public int f48894m = 0;

    /* JADX INFO: renamed from: p */
    public final SparseArray<View> f48897p = new SparseArray<>();

    /* JADX INFO: renamed from: s */
    public int f48900s = -1;

    /* JADX INFO: renamed from: t */
    public int f48901t = -1;

    /* JADX INFO: renamed from: u */
    public long f48902u = 0;

    /* JADX INFO: renamed from: v */
    public int f48903v = 0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.chat.layout.ChatLayoutManager$a */
    public class C12746a extends AnimatorListenerAdapter {
        public C12746a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            ChatLayoutManager.this.f48891j = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            ChatLayoutManager.this.f48891j = false;
            if (ChatLayoutManager.this.f48883b != 0) {
                ChatLayoutManager.this.f48883b = 0;
                ChatLayoutManager.this.requestLayout();
            }
        }
    }

    public ChatLayoutManager(e30<Boolean> e30Var, hs4 hs4Var) {
        this.f48889h = e30Var;
        this.f48896o = hs4Var;
    }

    /* JADX INFO: renamed from: A */
    public void m72642A(d30 d30Var) {
        this.f48904w = d30Var;
    }

    /* JADX INFO: renamed from: B */
    public void m72643B() {
        ValueAnimator valueAnimator = this.f48898q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f48897p.clear();
    }

    /* JADX INFO: renamed from: C */
    public final void m72644C(RecyclerView.C0584v c0584v) {
        List<RecyclerView.AbstractC0566d0> listM3462k = c0584v.m3462k();
        for (int i = 0; i < listM3462k.size(); i++) {
            removeAndRecycleView(listM3462k.get(i).itemView, c0584v);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m72645D(RecyclerView.C0584v c0584v, int i) {
        int i2 = i - 1;
        this.f48885d = i2;
        this.f48883b = 0;
        m72670z(c0584v, 0, i2, i, true, true);
    }

    /* JADX INFO: renamed from: E */
    public final void m72646E(RecyclerView.C0584v c0584v, int i) {
        this.f48884c = 0;
        this.f48882a = 0;
        m72670z(c0584v, 0, 0, i, false, true);
    }

    /* JADX INFO: renamed from: F */
    public void m72647F() {
        if (this.f48892k.equals("scroll_init")) {
            return;
        }
        this.f48892k = "scroll_end";
        this.f48889h.call(Boolean.FALSE);
        requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0030 A[PHI: r5
      0x0030: PHI (r5v4 int) = (r5v2 int), (r5v3 int) binds: [B:11:0x002e, B:14:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: G */
    public final void m72648G(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z, int i) {
        int iM72651g = m72651g(i, c0584v);
        if (iM72651g <= 0) {
            return;
        }
        this.f48891j = true;
        this.f48893l = 0;
        this.f48894m = 0;
        ValueAnimator valueAnimator = this.f48898q;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f48898q.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, iM72651g);
        this.f48898q = valueAnimatorOfInt;
        int i2 = (iM72651g / 5) * 12;
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
        this.f48898q.setInterpolator(new DecelerateInterpolator());
        this.f48898q.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.fx4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f99722a.m72668x(valueAnimator2);
            }
        });
        this.f48898q.addListener(new C12746a());
        this.f48898q.start();
    }

    /* JADX INFO: renamed from: H */
    public final boolean m72649H(RecyclerView.C0584v c0584v, int i, int i2, boolean z) {
        int iM72662r = this.f48887f - (z ? this.f48883b : this.f48882a);
        while (iM72662r > 0 && i > -1 && i < i2) {
            View viewM72665u = m72665u(c0584v, i);
            measureChildWithMargins(viewM72665u, 0, 0);
            iM72662r -= m72662r(viewM72665u);
            i = z ? i - 1 : i + 1;
        }
        return iM72662r <= 0;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m72650I(RecyclerView.C0584v c0584v, int i) {
        if (i > 15) {
            return false;
        }
        int iM72662r = this.f48887f;
        for (int i2 = 0; iM72662r >= 0 && i2 < i; i2++) {
            View viewM72665u = m72665u(c0584v, i2);
            measureChildWithMargins(viewM72665u, 0, 0);
            iM72662r -= m72662r(viewM72665u);
        }
        return iM72662r >= 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public boolean canScrollVertically() {
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final int m72651g(int i, RecyclerView.C0584v c0584v) {
        int i2 = this.f48885d;
        int i3 = i - i2;
        int iM72663s = -this.f48883b;
        if (i3 > 0) {
            while (true) {
                i2++;
                if (i2 >= i + 1) {
                    break;
                }
                iM72663s += m72663s(c0584v, i2);
            }
        }
        return iM72663s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public RecyclerView.C0578p generateDefaultLayoutParams() {
        return new RecyclerView.C0578p(-2, -2);
    }

    /* JADX INFO: renamed from: h */
    public boolean m72652h() {
        return this.f48886e;
    }

    /* JADX INFO: renamed from: i */
    public final void m72653i() {
        if (this.f48885d < this.f48896o.m132768e0().size()) {
            this.f48895n = this.f48896o.m132768e0().get(this.f48885d).layoutId;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final void m72654j(RecyclerView.C0588z c0588z) {
        if (this.f48903v != c0588z.m3487c()) {
            this.f48903v = c0588z.m3487c();
            long j = this.f48902u + 1;
            this.f48902u = j;
            if (j < 3 || !this.f48892k.equals("scroll_init")) {
                return;
            }
            this.f48892k = "scroll_anim_end";
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m72655k(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z) {
        m72653i();
        String str = this.f48892k;
        str.getClass();
        switch (str) {
            case "scroll_anim_end":
                if (!this.f48888g && !this.f48891j && !this.f48890i && c0588z.m3487c() - 1 > this.f48885d) {
                    m72648G(c0584v, c0588z, c0588z.m3487c() - 1);
                    break;
                }
                break;
            case "scroll_end":
                this.f48888g = false;
                this.f48892k = "scroll_anim_end";
                break;
            case "delete_item_anim":
                int i = this.f48900s;
                if (i < 0 || i > c0588z.m3487c() - 1) {
                    if (this.f48885d < this.f48899r.m3487c() - 1) {
                        this.f48892k = "idle";
                    } else {
                        this.f48892k = "scroll_end";
                    }
                }
                if (this.f48901t == -1) {
                    this.f48901t = m72663s(c0584v, this.f48900s);
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m72656l(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z, int i, boolean z) {
        this.f48899r = c0588z;
        m72657m(c0584v, c0588z, i, z);
        m72644C(c0584v);
        this.f48897p.clear();
    }

    /* JADX INFO: renamed from: m */
    public final void m72657m(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z, int i, boolean z) {
        ChatLayoutManager chatLayoutManager;
        RecyclerView.C0584v c0584v2;
        int i2;
        this.f48887f = getHeight();
        int iM3487c = c0588z.m3487c();
        if (this.f48891j && !this.f48890i && this.f48892k.equals("scroll_anim_end")) {
            m72659o(this.f48893l - this.f48894m, c0584v, c0588z.m3487c());
            this.f48894m = this.f48893l;
        }
        if (m72650I(c0584v, iM3487c)) {
            m72646E(c0584v, iM3487c);
            this.f48886e = false;
            return;
        }
        this.f48886e = true;
        if (this.f48892k.equals("scroll_end") || this.f48892k.equals("scroll_init")) {
            chatLayoutManager = this;
            c0584v2 = c0584v;
            chatLayoutManager.m72645D(c0584v2, iM3487c);
        } else {
            if (this.f48885d == 0 && this.f48883b == 0 && this.f48884c == 0 && this.f48882a == 0) {
                m72646E(c0584v, iM3487c);
            } else if (!m72667w() || iM3487c <= 185 || (i2 = this.f48885d) >= 15 || m72649H(c0584v, i2, iM3487c, true)) {
                chatLayoutManager = this;
                c0584v2 = c0584v;
                chatLayoutManager.m72670z(c0584v2, 0, i, iM3487c, z, true);
                chatLayoutManager.m72669y(c0584v2, c0588z);
            } else {
                m72646E(c0584v, iM3487c);
            }
            chatLayoutManager = this;
            c0584v2 = c0584v;
        }
        chatLayoutManager.m72655k(c0584v2, c0588z);
    }

    /* JADX INFO: renamed from: n */
    public final int m72658n(RecyclerView.C0588z c0588z) {
        if (this.f48885d > c0588z.m3487c() - 1) {
            this.f48885d = c0588z.m3487c() - 1;
        }
        if (this.f48892k.equals("scroll_anim_end") && !TextUtils.isEmpty(this.f48895n) && this.f48896o.getItemCount() > 15) {
            int itemCount = this.f48896o.getItemCount();
            int i = this.f48885d;
            if (itemCount > i) {
                for (int i2 = 0; i2 < 20; i2++) {
                    if (i >= 0 && TextUtils.equals(this.f48896o.m132768e0().get(i).layoutId, this.f48895n)) {
                        this.f48885d = i;
                        return i;
                    }
                    i--;
                }
            }
        }
        return this.f48885d;
    }

    /* JADX INFO: renamed from: o */
    public final int m72659o(int i, RecyclerView.C0584v c0584v, int i2) {
        if (i < 0) {
            int iAbs = Math.abs(i);
            if (this.f48884c == 0 && this.f48882a == 0) {
                return 0;
            }
            if (iAbs < Math.abs(this.f48882a)) {
                if (this.f48884c < 0) {
                    this.f48884c = 0;
                }
                this.f48882a += iAbs;
                return i;
            }
            int iM72663s = iAbs + this.f48882a;
            int i3 = this.f48884c;
            if (i3 <= 0) {
                this.f48884c = 0;
                this.f48882a = 0;
                return i + iM72663s;
            }
            while (iM72663s > 0) {
                if (i3 <= 0) {
                    int iM72663s2 = m72663s(c0584v, i3);
                    if (iM72663s2 > iM72663s) {
                        this.f48884c = 0;
                        this.f48882a = iM72663s - iM72663s2;
                        return i;
                    }
                    this.f48884c = 0;
                    this.f48882a = 0;
                    return i + iM72663s;
                }
                i3--;
                iM72663s -= m72663s(c0584v, i3);
            }
            this.f48882a = iM72663s;
            this.f48884c = i3;
            return i;
        }
        int i4 = i2 - 1;
        if (this.f48885d == i4 && this.f48883b == 0) {
            return 0;
        }
        if (i < Math.abs(this.f48883b)) {
            if (this.f48885d > i4) {
                this.f48885d = i4;
            }
            this.f48883b += i;
            return i;
        }
        int iM72663s3 = this.f48883b + i;
        int i5 = this.f48885d;
        if (i5 >= i4) {
            this.f48885d = i4;
            this.f48883b = 0;
            return i - iM72663s3;
        }
        while (iM72663s3 > 0) {
            if (i5 >= i4) {
                int iM72663s4 = m72663s(c0584v, i5);
                if (iM72663s4 > iM72663s3) {
                    this.f48885d = i4;
                    this.f48883b = iM72663s3 - iM72663s4;
                    return i;
                }
                this.f48885d = i4;
                this.f48883b = 0;
                return i - iM72663s3;
            }
            i5++;
            iM72663s3 -= m72663s(c0584v, i5);
        }
        this.f48883b = iM72663s3;
        this.f48885d = i5;
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void onLayoutChildren(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z) {
        try {
            if (c0588z.m3487c() == 0) {
                removeAndRecycleAllViews(c0584v);
                return;
            }
            m72654j(c0588z);
            detachAndScrapAttachedViews(c0584v);
            this.f48897p.clear();
            int iM72658n = m72658n(c0588z);
            int i = this.f48905x;
            if (i != 0) {
                this.f48905x = 0;
                iM72658n = i;
            }
            m72656l(c0584v, c0588z, iM72658n, true);
        } catch (Exception e) {
            gkh0.m126627j("[live][chat]", "onLayoutChildren error:" + e.toString());
            CrashHelper.m81296c(e);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void onScrollStateChanged(int i) {
        d30 d30Var;
        super.onScrollStateChanged(i);
        if (i != 0) {
            this.f48892k = "idle";
            this.f48890i = true;
            return;
        }
        RecyclerView.C0588z c0588z = this.f48899r;
        if (c0588z == null) {
            return;
        }
        int i2 = this.f48885d;
        if (i2 < 0 || i2 >= c0588z.m3487c() - 1) {
            m72653i();
            this.f48892k = "scroll_anim_end";
            this.f48888g = false;
            this.f48889h.call(Boolean.FALSE);
        } else {
            this.f48888g = true;
            this.f48892k = "idle";
            if (m72666v() && (d30Var = this.f48904w) != null) {
                d30Var.call();
            }
        }
        this.f48890i = false;
    }

    /* JADX INFO: renamed from: p */
    public void m72660p(int i) {
        j760<Integer, Integer> j760VarM72664t = m72664t();
        if (j760VarM72664t.f116565b != null) {
            this.f48905x = (i - getItemCount()) + j760VarM72664t.f116565b.intValue();
        }
    }

    /* JADX INFO: renamed from: q */
    public final int m72661q(View view) {
        RecyclerView.C0578p c0578p = (RecyclerView.C0578p) view.getLayoutParams();
        return getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) c0578p).leftMargin + ((ViewGroup.MarginLayoutParams) c0578p).rightMargin;
    }

    /* JADX INFO: renamed from: r */
    public final int m72662r(View view) {
        RecyclerView.C0578p c0578p = (RecyclerView.C0578p) view.getLayoutParams();
        return getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) c0578p).topMargin + ((ViewGroup.MarginLayoutParams) c0578p).bottomMargin;
    }

    /* JADX INFO: renamed from: s */
    public final int m72663s(RecyclerView.C0584v c0584v, int i) {
        try {
            View viewM72665u = m72665u(c0584v, i);
            measureChildWithMargins(viewM72665u, 0, 0);
            return m72662r(viewM72665u);
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public int scrollVerticallyBy(int i, RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z) {
        int i2;
        if (i == 0 || !m72652h() || ((i < 0 && this.f48884c == 0 && this.f48882a == 0) || (i > 0 && (i2 = this.f48885d) > 0 && i2 == c0588z.m3487c() - 1 && this.f48883b == 0))) {
            return 0;
        }
        detachAndScrapAttachedViews(c0584v);
        this.f48897p.clear();
        int iM72659o = m72659o(i, c0584v, c0588z.m3487c());
        m72656l(c0584v, c0588z, i > 0 ? this.f48885d : this.f48884c, i > 0);
        return iM72659o;
    }

    /* JADX INFO: renamed from: t */
    public j760<Integer, Integer> m72664t() {
        return new j760<>(Integer.valueOf(this.f48884c), Integer.valueOf(this.f48885d));
    }

    /* JADX INFO: renamed from: u */
    public final View m72665u(RecyclerView.C0584v c0584v, int i) {
        View view = this.f48897p.get(i);
        if (view != null) {
            return view;
        }
        View viewM3466o = c0584v.m3466o(i);
        this.f48897p.put(i, viewM3466o);
        return viewM3466o;
    }

    /* JADX INFO: renamed from: v */
    public boolean m72666v() {
        return this.f48884c == 0 && this.f48882a == 0;
    }

    /* JADX INFO: renamed from: w */
    public boolean m72667w() {
        return this.f48888g && this.f48892k.equals("idle");
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m72668x(ValueAnimator valueAnimator) {
        this.f48893l = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        requestLayout();
        if (this.f48890i) {
            this.f48898q.cancel();
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m72669y(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z) {
        int i;
        int i2 = this.f48884c;
        if (i2 > 0 && i2 < c0588z.m3487c()) {
            View viewM72665u = m72665u(c0584v, this.f48884c - 1);
            addView(viewM72665u);
            measureChildWithMargins(viewM72665u, 0, 0);
            layoutDecoratedWithMargins(viewM72665u, 0, -m72662r(viewM72665u), m72661q(viewM72665u), 0);
        }
        if (this.f48885d >= c0588z.m3487c() - 1 || (i = this.f48885d) <= 0) {
            return;
        }
        View viewM72665u2 = m72665u(c0584v, i + 1);
        addView(viewM72665u2);
        measureChildWithMargins(viewM72665u2, 0, 0);
        int iM72662r = m72662r(viewM72665u2);
        int iM72661q = m72661q(viewM72665u2);
        int i3 = this.f48887f;
        layoutDecoratedWithMargins(viewM72665u2, 0, i3, iM72661q, i3 + iM72662r);
    }

    /* JADX INFO: renamed from: z */
    public final void m72670z(RecyclerView.C0584v c0584v, int i, int i2, int i3, boolean z, boolean z2) {
        ChatLayoutManager chatLayoutManager;
        if (i2 >= i3 || i2 < 0) {
            return;
        }
        View viewM72665u = m72665u(c0584v, i2);
        boolean z3 = false;
        measureChildWithMargins(viewM72665u, 0, 0);
        int iM72662r = m72662r(viewM72665u);
        int iM72661q = m72661q(viewM72665u);
        if (!z ? i + iM72662r + this.f48882a < this.f48887f : i + iM72662r + this.f48883b < this.f48887f) {
            z3 = true;
        }
        boolean z4 = z3;
        if (z2) {
            addView(viewM72665u);
            if (z) {
                int i4 = (this.f48887f - this.f48883b) - i;
                chatLayoutManager = this;
                chatLayoutManager.layoutDecoratedWithMargins(viewM72665u, 0, i4 - iM72662r, iM72661q, i4);
            } else {
                chatLayoutManager = this;
                int i5 = chatLayoutManager.f48882a + i;
                chatLayoutManager.layoutDecoratedWithMargins(viewM72665u, 0, i5, iM72661q, i5 + iM72662r);
            }
        } else {
            chatLayoutManager = this;
        }
        if (z4) {
            chatLayoutManager.m72670z(c0584v, i + iM72662r, z ? i2 - 1 : i2 + 1, i3, z, z2);
        } else if (z) {
            chatLayoutManager.f48882a = -(((i + iM72662r) + chatLayoutManager.f48883b) - chatLayoutManager.f48887f);
            chatLayoutManager.f48884c = i2;
        } else {
            chatLayoutManager.f48883b = -(((i + iM72662r) + chatLayoutManager.f48882a) - chatLayoutManager.f48887f);
            chatLayoutManager.f48885d = i2;
        }
    }
}
