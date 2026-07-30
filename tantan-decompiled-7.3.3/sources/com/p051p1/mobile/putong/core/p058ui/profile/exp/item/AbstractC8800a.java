package com.p051p1.mobile.putong.core.p058ui.profile.exp.item;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.core.p058ui.profile.helpers.performance.PerformanceLogUtil;
import com.p051p1.mobile.putong.core.p058ui.profile.helpers.performance.ProfileLogEntity;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p153l.adc0;
import p153l.bnl0;
import p153l.c9c0;
import p153l.dbc0;
import p153l.jic0;
import p153l.kec0;
import p153l.ner;
import p153l.qa00;
import p153l.qnp0;
import p153l.t3m;
import p153l.wtq0;
import p153l.x20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exp.item.a */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8800a {

    /* JADX INFO: renamed from: o */
    public static final AtomicInteger f34082o = new AtomicInteger(1);

    /* JADX INFO: renamed from: a */
    public final ner f34083a;

    /* JADX INFO: renamed from: b */
    public View f34084b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final t3m f34085c;

    /* JADX INFO: renamed from: d */
    public final int f34086d;

    /* JADX INFO: renamed from: e */
    public View f34087e;

    /* JADX INFO: renamed from: f */
    public ExpProfileIntegrityOptView f34088f;

    /* JADX INFO: renamed from: g */
    public View f34089g;

    /* JADX INFO: renamed from: h */
    public ExpProfileIntegrityOptView.C8799a f34090h;

    /* JADX INFO: renamed from: i */
    public View f34091i;

    /* JADX INFO: renamed from: k */
    public jic0 f34093k;

    /* JADX INFO: renamed from: j */
    public boolean f34092j = false;

    /* JADX INFO: renamed from: l */
    public List<x20> f34094l = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: m */
    public List<x20> f34095m = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: n */
    public boolean f34096n = true;

    public AbstractC8800a(@NonNull t3m t3mVar, ner nerVar) {
        this.f34085c = t3mVar;
        this.f34083a = nerVar;
        AtomicInteger atomicInteger = f34082o;
        if (atomicInteger.get() > 65536) {
            atomicInteger.set(1);
        }
        this.f34086d = atomicInteger.getAndIncrement();
    }

    /* JADX INFO: renamed from: A */
    public View m52327A() {
        return this.f34084b;
    }

    /* JADX INFO: renamed from: B */
    public void m52328B(ExpProfileIntegrityOptView.C8799a c8799a) {
        this.f34090h = c8799a;
    }

    /* JADX INFO: renamed from: C */
    public void m52329C(boolean z) {
        View viewFindViewById = this.f34087e.findViewById(adc0.f70579te);
        if (viewFindViewById != null) {
            bnl0.m105524M(viewFindViewById, z);
        }
    }

    /* JADX INFO: renamed from: D */
    public void m52330D(View.OnClickListener onClickListener) {
        bnl0.m105509E0(this.f34087e, onClickListener);
    }

    /* JADX INFO: renamed from: E */
    public void mo52331E() {
    }

    /* JADX INFO: renamed from: F */
    public final void m52332F(jic0 jic0Var, int i, View view) {
        if (!this.f34092j || this.f34096n) {
            int iHashCode = new Object().hashCode();
            ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.CUSTOM;
            PerformanceLogUtil.logBegin(iHashCode, profileLogName, "render by ".concat(getClass().getSimpleName()));
            m52335d(jic0Var);
            if (m52337f() != null) {
                mo52357z();
            }
            this.f34092j = true;
            this.f34096n = false;
            m52339h();
            PerformanceLogUtil.logEnd(iHashCode, profileLogName, "render by ".concat(getClass().getSimpleName()));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m52333b(x20 x20Var) {
        if (m52347p()) {
            x20Var.call();
        } else {
            this.f34094l.add(x20Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m52334c(x20 x20Var) {
        if (m52346o()) {
            x20Var.call();
        } else {
            this.f34095m.add(x20Var);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m52335d(jic0 jic0Var) {
        this.f34093k = jic0Var;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo52336e() {
        return false;
    }

    /* JADX INFO: renamed from: f */
    public User m52337f() {
        return this.f34085c.m189086i2();
    }

    /* JADX INFO: renamed from: g */
    public final void m52338g() {
        Iterator<x20> it = this.f34094l.iterator();
        while (it.hasNext()) {
            it.next().call();
        }
        this.f34094l.clear();
    }

    /* JADX INFO: renamed from: h */
    public void m52339h() {
        Iterator<x20> it = this.f34095m.iterator();
        while (it.hasNext()) {
            it.next().call();
        }
        this.f34095m.clear();
    }

    /* JADX INFO: renamed from: i */
    public Frag m52340i() {
        return m52355x().mo52249J1();
    }

    /* JADX INFO: renamed from: j */
    public final View m52341j(ViewGroup viewGroup) {
        View view = this.f34091i;
        if (view != null) {
            return view;
        }
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.ITEM_INFLATE;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName, getClass().getSimpleName());
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(bnl0.f77544e, bnl0.f77545f));
        View viewMo52356y = mo52356y(viewGroup);
        this.f34084b = viewMo52356y;
        if (viewMo52356y == null) {
            wtq0.m207906a("rootView is Null !!!");
            return null;
        }
        if (viewMo52356y.getParent() != null) {
            ((ViewGroup) this.f34084b.getParent()).removeView(this.f34084b);
        }
        frameLayout.addView(this.f34084b, bnl0.f77544e, bnl0.f77545f);
        mo52348q(this.f34084b);
        m52338g();
        PerformanceLogUtil.logEnd(iHashCode, profileLogName, getClass().getSimpleName());
        this.f34091i = frameLayout;
        return frameLayout;
    }

    /* JADX INFO: renamed from: k */
    public final View m52342k(ViewGroup viewGroup) {
        View view = this.f34091i;
        if (view != null) {
            return view;
        }
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.ITEM_INFLATE;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName, getClass().getSimpleName());
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setBackgroundResource(dbc0.f87595y1);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        View view2 = new View(viewGroup.getContext());
        this.f34089g = view2;
        qnp0.m177261d1(view2, qa00.f156326m);
        View view3 = this.f34089g;
        int i = bnl0.f77544e;
        frameLayout.addView(view3, i, i);
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        int i2 = qa00.f156330q;
        linearLayout.setPadding(0, i2, 0, i2);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(bnl0.f77544e, bnl0.f77545f));
        frameLayout.addView(linearLayout, bnl0.f77544e, bnl0.f77545f);
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(kec0.f126163z2, (ViewGroup) null);
        this.f34087e = viewInflate;
        TextView textView = (TextView) viewInflate.findViewById(adc0.f70596ue);
        textView.setText(mo52344m());
        if (TextUtils.isEmpty(mo52344m())) {
            frameLayout.setBackgroundResource(dbc0.f87070hv);
        }
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(viewGroup.getResources().getColor(c9c0.f80469x));
        ExpProfileIntegrityOptView expProfileIntegrityOptView = (ExpProfileIntegrityOptView) this.f34087e.findViewById(adc0.f70571t6);
        this.f34088f = expProfileIntegrityOptView;
        bnl0.m105524M(expProfileIntegrityOptView, false);
        linearLayout.addView(this.f34087e, bnl0.f77544e, bnl0.f77545f);
        View viewMo52356y = mo52356y(viewGroup);
        this.f34084b = viewMo52356y;
        if (viewMo52356y == null) {
            wtq0.m207906a("rootView is Null !!!");
            return null;
        }
        if (viewMo52356y.getParent() != null) {
            ((ViewGroup) this.f34084b.getParent()).removeView(this.f34084b);
        }
        linearLayout.addView(this.f34084b, bnl0.f77544e, bnl0.f77545f);
        mo52348q(this.f34084b);
        m52338g();
        PerformanceLogUtil.logEnd(iHashCode, profileLogName, getClass().getSimpleName());
        this.f34091i = frameLayout;
        return frameLayout;
    }

    /* JADX INFO: renamed from: l */
    public int mo52343l() {
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public String mo52344m() {
        return "";
    }

    /* JADX INFO: renamed from: n */
    public String mo52345n() {
        return "";
    }

    /* JADX INFO: renamed from: o */
    public boolean m52346o() {
        return this.f34092j;
    }

    /* JADX INFO: renamed from: p */
    public boolean m52347p() {
        return this.f34084b != null;
    }

    /* JADX INFO: renamed from: q */
    public void mo52348q(View view) {
    }

    /* JADX INFO: renamed from: r */
    public boolean mo52349r() {
        return true;
    }

    /* JADX INFO: renamed from: s */
    public int m52350s() {
        return this.f34086d;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m52351t(View view, x20 x20Var, View view2) {
        if (NullChecker.m82486a(m52355x().mo52233C2()) && NullChecker.m82486a(m52355x().m189086i2())) {
            view.requestFocus();
            x20Var.call();
            m52355x().mo52239E();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m52352u() {
        this.f34096n = true;
    }

    /* JADX INFO: renamed from: v */
    public void m52353v(final View view, final x20 x20Var, boolean z) {
        if (z) {
            bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.caf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f80584a.m52351t(view, x20Var, view2);
                }
            });
        } else {
            bnl0.m105509E0(view, null);
        }
    }

    /* JADX INFO: renamed from: w */
    public void mo52354w(List<Media> list) {
    }

    /* JADX INFO: renamed from: x */
    public t3m m52355x() {
        return this.f34085c;
    }

    /* JADX INFO: renamed from: y */
    public abstract View mo52356y(ViewGroup viewGroup);

    /* JADX INFO: renamed from: z */
    public abstract void mo52357z();
}
