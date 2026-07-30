package com.p000p1.mobile.putong.live.livingroom.common.chat.layout;

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
import l.d30;
import l.e30;
import l.gkh0;
import l.j760;
import p002l.hs4;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ChatLayoutManager extends RecyclerView.o {

    /* JADX INFO: renamed from: a */
    public int f4924a;

    /* JADX INFO: renamed from: b */
    public int f4925b;

    /* JADX INFO: renamed from: c */
    public int f4926c;

    /* JADX INFO: renamed from: h */
    public e30<Boolean> f4931h;

    /* JADX INFO: renamed from: l */
    public int f4935l;

    /* JADX INFO: renamed from: n */
    public String f4937n;

    /* JADX INFO: renamed from: o */
    public hs4 f4938o;

    /* JADX INFO: renamed from: q */
    public ValueAnimator f4940q;

    /* JADX INFO: renamed from: r */
    public RecyclerView.z f4941r;

    /* JADX INFO: renamed from: w */
    public d30 f4946w;

    /* JADX INFO: renamed from: x */
    public int f4947x;

    /* JADX INFO: renamed from: d */
    public int f4927d = 0;

    /* JADX INFO: renamed from: e */
    public boolean f4928e = false;

    /* JADX INFO: renamed from: f */
    public int f4929f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f4930g = false;

    /* JADX INFO: renamed from: i */
    public boolean f4932i = false;

    /* JADX INFO: renamed from: j */
    public boolean f4933j = false;

    /* JADX INFO: renamed from: k */
    public String f4934k = "scroll_init";

    /* JADX INFO: renamed from: m */
    public int f4936m = 0;

    /* JADX INFO: renamed from: p */
    public final SparseArray<View> f4939p = new SparseArray<>();

    /* JADX INFO: renamed from: s */
    public int f4942s = -1;

    /* JADX INFO: renamed from: t */
    public int f4943t = -1;

    /* JADX INFO: renamed from: u */
    public long f4944u = 0;

    /* JADX INFO: renamed from: v */
    public int f4945v = 0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.chat.layout.ChatLayoutManager$a */
    public class C0335a extends AnimatorListenerAdapter {
        public C0335a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            ChatLayoutManager.this.f4933j = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            ChatLayoutManager.this.f4933j = false;
            if (ChatLayoutManager.this.f4925b != 0) {
                ChatLayoutManager.this.f4925b = 0;
                ChatLayoutManager.this.requestLayout();
            }
        }
    }

    public ChatLayoutManager(e30<Boolean> e30Var, hs4 hs4Var) {
        this.f4931h = e30Var;
        this.f4938o = hs4Var;
    }

    /* JADX INFO: renamed from: A */
    public void m6144A(d30 d30Var) {
        this.f4946w = d30Var;
    }

    /* JADX INFO: renamed from: B */
    public void m6145B() {
        ValueAnimator valueAnimator = this.f4940q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f4939p.clear();
    }

    /* JADX INFO: renamed from: C */
    public final void m6146C(RecyclerView.v vVar) {
        List listK = vVar.k();
        for (int i = 0; i < listK.size(); i++) {
            removeAndRecycleView(((RecyclerView.d0) listK.get(i)).itemView, vVar);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m6147D(RecyclerView.v vVar, int i) {
        int i2 = i - 1;
        this.f4927d = i2;
        this.f4925b = 0;
        m6172z(vVar, 0, i2, i, true, true);
    }

    /* JADX INFO: renamed from: E */
    public final void m6148E(RecyclerView.v vVar, int i) {
        this.f4926c = 0;
        this.f4924a = 0;
        m6172z(vVar, 0, 0, i, false, true);
    }

    /* JADX INFO: renamed from: F */
    public void m6149F() {
        if (this.f4934k.equals("scroll_init")) {
            return;
        }
        this.f4934k = "scroll_end";
        this.f4931h.call(Boolean.FALSE);
        requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0030 A[PHI: r5
      0x0030: PHI (r5v4 int) = (r5v2 int), (r5v3 int) binds: [B:11:0x002e, B:14:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: G */
    public final void m6150G(RecyclerView.v vVar, RecyclerView.z zVar, int i) {
        int iM6153g = m6153g(i, vVar);
        if (iM6153g <= 0) {
            return;
        }
        this.f4933j = true;
        this.f4935l = 0;
        this.f4936m = 0;
        ValueAnimator valueAnimator = this.f4940q;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f4940q.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, iM6153g);
        this.f4940q = valueAnimatorOfInt;
        int i2 = (iM6153g / 5) * 12;
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
        this.f4940q.setInterpolator(new DecelerateInterpolator());
        this.f4940q.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.fx4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f10675a.m6170x(valueAnimator2);
            }
        });
        this.f4940q.addListener(new C0335a());
        this.f4940q.start();
    }

    /* JADX INFO: renamed from: H */
    public final boolean m6151H(RecyclerView.v vVar, int i, int i2, boolean z) {
        int iM6164r = this.f4929f - (z ? this.f4925b : this.f4924a);
        while (iM6164r > 0 && i > -1 && i < i2) {
            View viewM6167u = m6167u(vVar, i);
            measureChildWithMargins(viewM6167u, 0, 0);
            iM6164r -= m6164r(viewM6167u);
            i = z ? i - 1 : i + 1;
        }
        return iM6164r <= 0;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m6152I(RecyclerView.v vVar, int i) {
        if (i > 15) {
            return false;
        }
        int iM6164r = this.f4929f;
        for (int i2 = 0; iM6164r >= 0 && i2 < i; i2++) {
            View viewM6167u = m6167u(vVar, i2);
            measureChildWithMargins(viewM6167u, 0, 0);
            iM6164r -= m6164r(viewM6167u);
        }
        return iM6164r >= 0;
    }

    public boolean canScrollVertically() {
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final int m6153g(int i, RecyclerView.v vVar) {
        int i2 = this.f4927d;
        int i3 = i - i2;
        int iM6165s = -this.f4925b;
        if (i3 > 0) {
            while (true) {
                i2++;
                if (i2 >= i + 1) {
                    break;
                }
                iM6165s += m6165s(vVar, i2);
            }
        }
        return iM6165s;
    }

    public RecyclerView.p generateDefaultLayoutParams() {
        return new RecyclerView.p(-2, -2);
    }

    /* JADX INFO: renamed from: h */
    public boolean m6154h() {
        return this.f4928e;
    }

    /* JADX INFO: renamed from: i */
    public final void m6155i() {
        if (this.f4927d < this.f4938o.m14803e0().size()) {
            this.f4937n = this.f4938o.m14803e0().get(this.f4927d).layoutId;
        }
    }

    public boolean isAutoMeasureEnabled() {
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final void m6156j(RecyclerView.z zVar) {
        if (this.f4945v != zVar.c()) {
            this.f4945v = zVar.c();
            long j = this.f4944u + 1;
            this.f4944u = j;
            if (j < 3 || !this.f4934k.equals("scroll_init")) {
                return;
            }
            this.f4934k = "scroll_anim_end";
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m6157k(RecyclerView.v vVar, RecyclerView.z zVar) {
        m6155i();
        String str = this.f4934k;
        str.getClass();
        switch (str) {
            case "scroll_anim_end":
                if (!this.f4930g && !this.f4933j && !this.f4932i && zVar.c() - 1 > this.f4927d) {
                    m6150G(vVar, zVar, zVar.c() - 1);
                    break;
                }
                break;
            case "scroll_end":
                this.f4930g = false;
                this.f4934k = "scroll_anim_end";
                break;
            case "delete_item_anim":
                int i = this.f4942s;
                if (i < 0 || i > zVar.c() - 1) {
                    if (this.f4927d < this.f4941r.c() - 1) {
                        this.f4934k = "idle";
                    } else {
                        this.f4934k = "scroll_end";
                    }
                }
                if (this.f4943t == -1) {
                    this.f4943t = m6165s(vVar, this.f4942s);
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m6158l(RecyclerView.v vVar, RecyclerView.z zVar, int i, boolean z) {
        this.f4941r = zVar;
        m6159m(vVar, zVar, i, z);
        m6146C(vVar);
        this.f4939p.clear();
    }

    /* JADX INFO: renamed from: m */
    public final void m6159m(RecyclerView.v vVar, RecyclerView.z zVar, int i, boolean z) {
        ChatLayoutManager chatLayoutManager;
        RecyclerView.v vVar2;
        int i2;
        this.f4929f = getHeight();
        int iC = zVar.c();
        if (this.f4933j && !this.f4932i && this.f4934k.equals("scroll_anim_end")) {
            m6161o(this.f4935l - this.f4936m, vVar, zVar.c());
            this.f4936m = this.f4935l;
        }
        if (m6152I(vVar, iC)) {
            m6148E(vVar, iC);
            this.f4928e = false;
            return;
        }
        this.f4928e = true;
        if (this.f4934k.equals("scroll_end") || this.f4934k.equals("scroll_init")) {
            chatLayoutManager = this;
            vVar2 = vVar;
            chatLayoutManager.m6147D(vVar2, iC);
        } else {
            if (this.f4927d == 0 && this.f4925b == 0 && this.f4926c == 0 && this.f4924a == 0) {
                m6148E(vVar, iC);
            } else if (!m6169w() || iC <= 185 || (i2 = this.f4927d) >= 15 || m6151H(vVar, i2, iC, true)) {
                chatLayoutManager = this;
                vVar2 = vVar;
                chatLayoutManager.m6172z(vVar2, 0, i, iC, z, true);
                chatLayoutManager.m6171y(vVar2, zVar);
            } else {
                m6148E(vVar, iC);
            }
            chatLayoutManager = this;
            vVar2 = vVar;
        }
        chatLayoutManager.m6157k(vVar2, zVar);
    }

    /* JADX INFO: renamed from: n */
    public final int m6160n(RecyclerView.z zVar) {
        if (this.f4927d > zVar.c() - 1) {
            this.f4927d = zVar.c() - 1;
        }
        if (this.f4934k.equals("scroll_anim_end") && !TextUtils.isEmpty(this.f4937n) && this.f4938o.getItemCount() > 15) {
            int itemCount = this.f4938o.getItemCount();
            int i = this.f4927d;
            if (itemCount > i) {
                for (int i2 = 0; i2 < 20; i2++) {
                    if (i >= 0 && TextUtils.equals(this.f4938o.m14803e0().get(i).layoutId, this.f4937n)) {
                        this.f4927d = i;
                        return i;
                    }
                    i--;
                }
            }
        }
        return this.f4927d;
    }

    /* JADX INFO: renamed from: o */
    public final int m6161o(int i, RecyclerView.v vVar, int i2) {
        if (i < 0) {
            int iAbs = Math.abs(i);
            if (this.f4926c == 0 && this.f4924a == 0) {
                return 0;
            }
            if (iAbs < Math.abs(this.f4924a)) {
                if (this.f4926c < 0) {
                    this.f4926c = 0;
                }
                this.f4924a += iAbs;
                return i;
            }
            int iM6165s = iAbs + this.f4924a;
            int i3 = this.f4926c;
            if (i3 <= 0) {
                this.f4926c = 0;
                this.f4924a = 0;
                return i + iM6165s;
            }
            while (iM6165s > 0) {
                if (i3 <= 0) {
                    int iM6165s2 = m6165s(vVar, i3);
                    if (iM6165s2 > iM6165s) {
                        this.f4926c = 0;
                        this.f4924a = iM6165s - iM6165s2;
                        return i;
                    }
                    this.f4926c = 0;
                    this.f4924a = 0;
                    return i + iM6165s;
                }
                i3--;
                iM6165s -= m6165s(vVar, i3);
            }
            this.f4924a = iM6165s;
            this.f4926c = i3;
            return i;
        }
        int i4 = i2 - 1;
        if (this.f4927d == i4 && this.f4925b == 0) {
            return 0;
        }
        if (i < Math.abs(this.f4925b)) {
            if (this.f4927d > i4) {
                this.f4927d = i4;
            }
            this.f4925b += i;
            return i;
        }
        int iM6165s3 = this.f4925b + i;
        int i5 = this.f4927d;
        if (i5 >= i4) {
            this.f4927d = i4;
            this.f4925b = 0;
            return i - iM6165s3;
        }
        while (iM6165s3 > 0) {
            if (i5 >= i4) {
                int iM6165s4 = m6165s(vVar, i5);
                if (iM6165s4 > iM6165s3) {
                    this.f4927d = i4;
                    this.f4925b = iM6165s3 - iM6165s4;
                    return i;
                }
                this.f4927d = i4;
                this.f4925b = 0;
                return i - iM6165s3;
            }
            i5++;
            iM6165s3 -= m6165s(vVar, i5);
        }
        this.f4925b = iM6165s3;
        this.f4927d = i5;
        return i;
    }

    public void onLayoutChildren(RecyclerView.v vVar, RecyclerView.z zVar) {
        try {
            if (zVar.c() == 0) {
                removeAndRecycleAllViews(vVar);
                return;
            }
            m6156j(zVar);
            detachAndScrapAttachedViews(vVar);
            this.f4939p.clear();
            int iM6160n = m6160n(zVar);
            int i = this.f4947x;
            if (i != 0) {
                this.f4947x = 0;
                iM6160n = i;
            }
            m6158l(vVar, zVar, iM6160n, true);
        } catch (Exception e) {
            gkh0.j("[live][chat]", "onLayoutChildren error:" + e.toString());
            CrashHelper.c(e);
        }
    }

    public void onScrollStateChanged(int i) {
        d30 d30Var;
        super.onScrollStateChanged(i);
        if (i != 0) {
            this.f4934k = "idle";
            this.f4932i = true;
            return;
        }
        RecyclerView.z zVar = this.f4941r;
        if (zVar == null) {
            return;
        }
        int i2 = this.f4927d;
        if (i2 < 0 || i2 >= zVar.c() - 1) {
            m6155i();
            this.f4934k = "scroll_anim_end";
            this.f4930g = false;
            this.f4931h.call(Boolean.FALSE);
        } else {
            this.f4930g = true;
            this.f4934k = "idle";
            if (m6168v() && (d30Var = this.f4946w) != null) {
                d30Var.call();
            }
        }
        this.f4932i = false;
    }

    /* JADX INFO: renamed from: p */
    public void m6162p(int i) {
        j760<Integer, Integer> j760VarM6166t = m6166t();
        if (j760VarM6166t.b != null) {
            this.f4947x = (i - getItemCount()) + ((Integer) j760VarM6166t.b).intValue();
        }
    }

    /* JADX INFO: renamed from: q */
    public final int m6163q(View view) {
        RecyclerView.p layoutParams = view.getLayoutParams();
        return getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    /* JADX INFO: renamed from: r */
    public final int m6164r(View view) {
        RecyclerView.p layoutParams = view.getLayoutParams();
        return getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }

    /* JADX INFO: renamed from: s */
    public final int m6165s(RecyclerView.v vVar, int i) {
        try {
            View viewM6167u = m6167u(vVar, i);
            measureChildWithMargins(viewM6167u, 0, 0);
            return m6164r(viewM6167u);
        } catch (Exception unused) {
            return 0;
        }
    }

    public int scrollVerticallyBy(int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        int i2;
        if (i == 0 || !m6154h() || ((i < 0 && this.f4926c == 0 && this.f4924a == 0) || (i > 0 && (i2 = this.f4927d) > 0 && i2 == zVar.c() - 1 && this.f4925b == 0))) {
            return 0;
        }
        detachAndScrapAttachedViews(vVar);
        this.f4939p.clear();
        int iM6161o = m6161o(i, vVar, zVar.c());
        m6158l(vVar, zVar, i > 0 ? this.f4927d : this.f4926c, i > 0);
        return iM6161o;
    }

    /* JADX INFO: renamed from: t */
    public j760<Integer, Integer> m6166t() {
        return new j760<>(Integer.valueOf(this.f4926c), Integer.valueOf(this.f4927d));
    }

    /* JADX INFO: renamed from: u */
    public final View m6167u(RecyclerView.v vVar, int i) {
        View view = this.f4939p.get(i);
        if (view != null) {
            return view;
        }
        View viewO = vVar.o(i);
        this.f4939p.put(i, viewO);
        return viewO;
    }

    /* JADX INFO: renamed from: v */
    public boolean m6168v() {
        return this.f4926c == 0 && this.f4924a == 0;
    }

    /* JADX INFO: renamed from: w */
    public boolean m6169w() {
        return this.f4930g && this.f4934k.equals("idle");
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m6170x(ValueAnimator valueAnimator) {
        this.f4935l = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        requestLayout();
        if (this.f4932i) {
            this.f4940q.cancel();
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m6171y(RecyclerView.v vVar, RecyclerView.z zVar) {
        int i;
        int i2 = this.f4926c;
        if (i2 > 0 && i2 < zVar.c()) {
            View viewM6167u = m6167u(vVar, this.f4926c - 1);
            addView(viewM6167u);
            measureChildWithMargins(viewM6167u, 0, 0);
            layoutDecoratedWithMargins(viewM6167u, 0, -m6164r(viewM6167u), m6163q(viewM6167u), 0);
        }
        if (this.f4927d >= zVar.c() - 1 || (i = this.f4927d) <= 0) {
            return;
        }
        View viewM6167u2 = m6167u(vVar, i + 1);
        addView(viewM6167u2);
        measureChildWithMargins(viewM6167u2, 0, 0);
        int iM6164r = m6164r(viewM6167u2);
        int iM6163q = m6163q(viewM6167u2);
        int i3 = this.f4929f;
        layoutDecoratedWithMargins(viewM6167u2, 0, i3, iM6163q, i3 + iM6164r);
    }

    /* JADX INFO: renamed from: z */
    public final void m6172z(RecyclerView.v vVar, int i, int i2, int i3, boolean z, boolean z2) {
        ChatLayoutManager chatLayoutManager;
        if (i2 >= i3 || i2 < 0) {
            return;
        }
        View viewM6167u = m6167u(vVar, i2);
        boolean z3 = false;
        measureChildWithMargins(viewM6167u, 0, 0);
        int iM6164r = m6164r(viewM6167u);
        int iM6163q = m6163q(viewM6167u);
        if (!z ? i + iM6164r + this.f4924a < this.f4929f : i + iM6164r + this.f4925b < this.f4929f) {
            z3 = true;
        }
        boolean z4 = z3;
        if (z2) {
            addView(viewM6167u);
            if (z) {
                int i4 = (this.f4929f - this.f4925b) - i;
                chatLayoutManager = this;
                chatLayoutManager.layoutDecoratedWithMargins(viewM6167u, 0, i4 - iM6164r, iM6163q, i4);
            } else {
                chatLayoutManager = this;
                int i5 = chatLayoutManager.f4924a + i;
                chatLayoutManager.layoutDecoratedWithMargins(viewM6167u, 0, i5, iM6163q, i5 + iM6164r);
            }
        } else {
            chatLayoutManager = this;
        }
        if (z4) {
            chatLayoutManager.m6172z(vVar, i + iM6164r, z ? i2 - 1 : i2 + 1, i3, z, z2);
        } else if (z) {
            chatLayoutManager.f4924a = -(((i + iM6164r) + chatLayoutManager.f4925b) - chatLayoutManager.f4929f);
            chatLayoutManager.f4926c = i2;
        } else {
            chatLayoutManager.f4925b = -(((i + iM6164r) + chatLayoutManager.f4924a) - chatLayoutManager.f4929f);
            chatLayoutManager.f4927d = i2;
        }
    }
}
