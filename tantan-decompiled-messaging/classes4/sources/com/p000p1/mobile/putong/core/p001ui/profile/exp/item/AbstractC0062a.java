package com.p000p1.mobile.putong.core.p001ui.profile.exp.item;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.helpers.performance.PerformanceLogUtil;
import com.p000p1.mobile.putong.core.p001ui.profile.helpers.performance.ProfileLogEntity;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import l.d30;
import l.dac0;
import l.f6c0;
import l.mcr;
import l.mep0;
import l.qkq0;
import l.t100;
import l.u4c0;
import l.w0c0;
import l.x2c0;
import l.xdl0;
import p002l.a1m;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exp.item.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class AbstractC0062a {

    /* JADX INFO: renamed from: o */
    public static final AtomicInteger f1056o = new AtomicInteger(1);

    /* JADX INFO: renamed from: a */
    public final mcr f1057a;

    /* JADX INFO: renamed from: b */
    public View f1058b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final a1m f1059c;

    /* JADX INFO: renamed from: d */
    public final int f1060d;

    /* JADX INFO: renamed from: e */
    public View f1061e;

    /* JADX INFO: renamed from: f */
    public ExpProfileIntegrityOptView f1062f;

    /* JADX INFO: renamed from: g */
    public View f1063g;

    /* JADX INFO: renamed from: h */
    public ExpProfileIntegrityOptView.C0061a f1064h;

    /* JADX INFO: renamed from: i */
    public View f1065i;

    /* JADX INFO: renamed from: k */
    public dac0 f1067k;

    /* JADX INFO: renamed from: j */
    public boolean f1066j = false;

    /* JADX INFO: renamed from: l */
    public List<d30> f1068l = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: m */
    public List<d30> f1069m = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: n */
    public boolean f1070n = true;

    public AbstractC0062a(@NonNull a1m a1mVar, mcr mcrVar) {
        this.f1059c = a1mVar;
        this.f1057a = mcrVar;
        AtomicInteger atomicInteger = f1056o;
        if (atomicInteger.get() > 65536) {
            atomicInteger.set(1);
        }
        this.f1060d = atomicInteger.getAndIncrement();
    }

    /* JADX INFO: renamed from: A */
    public View m1596A() {
        return this.f1058b;
    }

    /* JADX INFO: renamed from: B */
    public void m1597B(ExpProfileIntegrityOptView.C0061a c0061a) {
        this.f1064h = c0061a;
    }

    /* JADX INFO: renamed from: C */
    public void m1598C(boolean z) {
        View viewFindViewById = this.f1061e.findViewById(u4c0.qe);
        if (viewFindViewById != null) {
            xdl0.M(viewFindViewById, z);
        }
    }

    /* JADX INFO: renamed from: D */
    public void m1599D(View.OnClickListener onClickListener) {
        xdl0.E0(this.f1061e, onClickListener);
    }

    /* JADX INFO: renamed from: E */
    public void mo1600E() {
    }

    /* JADX INFO: renamed from: F */
    public final void m1601F(dac0 dac0Var, int i, View view) {
        if (!this.f1066j || this.f1070n) {
            int iHashCode = new Object().hashCode();
            ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.CUSTOM;
            PerformanceLogUtil.logBegin(iHashCode, profileLogName, "render by ".concat(getClass().getSimpleName()));
            m1604d(dac0Var);
            if (m1606f() != null) {
                mo1626z();
            }
            this.f1066j = true;
            this.f1070n = false;
            m1608h();
            PerformanceLogUtil.logEnd(iHashCode, profileLogName, "render by ".concat(getClass().getSimpleName()));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m1602b(d30 d30Var) {
        if (m1616p()) {
            d30Var.call();
        } else {
            this.f1068l.add(d30Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m1603c(d30 d30Var) {
        if (m1615o()) {
            d30Var.call();
        } else {
            this.f1069m.add(d30Var);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1604d(dac0 dac0Var) {
        this.f1067k = dac0Var;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo1605e() {
        return false;
    }

    /* JADX INFO: renamed from: f */
    public User m1606f() {
        return this.f1059c.m9268i2();
    }

    /* JADX INFO: renamed from: g */
    public final void m1607g() {
        Iterator<d30> it = this.f1068l.iterator();
        while (it.hasNext()) {
            it.next().call();
        }
        this.f1068l.clear();
    }

    /* JADX INFO: renamed from: h */
    public void m1608h() {
        Iterator<d30> it = this.f1069m.iterator();
        while (it.hasNext()) {
            it.next().call();
        }
        this.f1069m.clear();
    }

    /* JADX INFO: renamed from: i */
    public Frag m1609i() {
        return m1624x().mo1514J1();
    }

    /* JADX INFO: renamed from: j */
    public final View m1610j(ViewGroup viewGroup) {
        View view = this.f1065i;
        if (view != null) {
            return view;
        }
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.ITEM_INFLATE;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName, getClass().getSimpleName());
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(xdl0.e, xdl0.f));
        View viewMo1625y = mo1625y(viewGroup);
        this.f1058b = viewMo1625y;
        if (viewMo1625y == null) {
            qkq0.a("rootView is Null !!!");
            return null;
        }
        if (viewMo1625y.getParent() != null) {
            ((ViewGroup) this.f1058b.getParent()).removeView(this.f1058b);
        }
        frameLayout.addView(this.f1058b, xdl0.e, xdl0.f);
        mo1617q(this.f1058b);
        m1607g();
        PerformanceLogUtil.logEnd(iHashCode, profileLogName, getClass().getSimpleName());
        this.f1065i = frameLayout;
        return frameLayout;
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [android.view.View, com.p1.mobile.putong.core.ui.profile.exp.item.ExpProfileIntegrityOptView] */
    /* JADX INFO: renamed from: k */
    public final View m1611k(ViewGroup viewGroup) {
        View view = this.f1065i;
        if (view != null) {
            return view;
        }
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.ITEM_INFLATE;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName, getClass().getSimpleName());
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setBackgroundResource(x2c0.x1);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        View view2 = new View(viewGroup.getContext());
        this.f1063g = view2;
        mep0.d1(view2, t100.m);
        View view3 = this.f1063g;
        int i = xdl0.e;
        frameLayout.addView(view3, i, i);
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        int i2 = t100.q;
        linearLayout.setPadding(0, i2, 0, i2);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(xdl0.e, xdl0.f));
        frameLayout.addView(linearLayout, xdl0.e, xdl0.f);
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(f6c0.z2, (ViewGroup) null);
        this.f1061e = viewInflate;
        TextView textView = (TextView) viewInflate.findViewById(u4c0.re);
        textView.setText(mo1613m());
        if (TextUtils.isEmpty(mo1613m())) {
            frameLayout.setBackgroundResource(x2c0.tu);
        }
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(viewGroup.getResources().getColor(w0c0.x));
        ?? r5 = (ExpProfileIntegrityOptView) this.f1061e.findViewById(u4c0.r6);
        this.f1062f = r5;
        xdl0.M((View) r5, false);
        linearLayout.addView(this.f1061e, xdl0.e, xdl0.f);
        View viewMo1625y = mo1625y(viewGroup);
        this.f1058b = viewMo1625y;
        if (viewMo1625y == null) {
            qkq0.a("rootView is Null !!!");
            return null;
        }
        if (viewMo1625y.getParent() != null) {
            ((ViewGroup) this.f1058b.getParent()).removeView(this.f1058b);
        }
        linearLayout.addView(this.f1058b, xdl0.e, xdl0.f);
        mo1617q(this.f1058b);
        m1607g();
        PerformanceLogUtil.logEnd(iHashCode, profileLogName, getClass().getSimpleName());
        this.f1065i = frameLayout;
        return frameLayout;
    }

    /* JADX INFO: renamed from: l */
    public int mo1612l() {
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public String mo1613m() {
        return "";
    }

    /* JADX INFO: renamed from: n */
    public String mo1614n() {
        return "";
    }

    /* JADX INFO: renamed from: o */
    public boolean m1615o() {
        return this.f1066j;
    }

    /* JADX INFO: renamed from: p */
    public boolean m1616p() {
        return this.f1058b != null;
    }

    /* JADX INFO: renamed from: q */
    public void mo1617q(View view) {
    }

    /* JADX INFO: renamed from: r */
    public boolean mo1618r() {
        return true;
    }

    /* JADX INFO: renamed from: s */
    public int m1619s() {
        return this.f1060d;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m1620t(View view, d30 d30Var, View view2) {
        if (NullChecker.a(m1624x().mo1498C2()) && NullChecker.a(m1624x().m9268i2())) {
            view.requestFocus();
            d30Var.call();
            m1624x().mo1504E();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m1621u() {
        this.f1070n = true;
    }

    /* JADX INFO: renamed from: v */
    public void m1622v(final View view, final d30 d30Var, boolean z) {
        if (z) {
            xdl0.E0(view, new View.OnClickListener() { // from class: l.w8f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f21557a.m1620t(view, d30Var, view2);
                }
            });
        } else {
            xdl0.E0(view, (View.OnClickListener) null);
        }
    }

    /* JADX INFO: renamed from: w */
    public void mo1623w(List<Media> list) {
    }

    /* JADX INFO: renamed from: x */
    public a1m m1624x() {
        return this.f1059c;
    }

    /* JADX INFO: renamed from: y */
    public abstract View mo1625y(ViewGroup viewGroup);

    /* JADX INFO: renamed from: z */
    public abstract void mo1626z();
}
