package com.p046p1.mobile.putong.core.p053ui.profile.exp.item;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.core.p053ui.profile.helpers.performance.PerformanceLogUtil;
import com.p046p1.mobile.putong.core.p053ui.profile.helpers.performance.ProfileLogEntity;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p149l.a1m;
import p149l.d30;
import p149l.dac0;
import p149l.f6c0;
import p149l.mcr;
import p149l.mep0;
import p149l.qkq0;
import p149l.t100;
import p149l.u4c0;
import p149l.w0c0;
import p149l.x2c0;
import p149l.xdl0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.exp.item.a */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8637a {

    /* JADX INFO: renamed from: o */
    public static final AtomicInteger f33234o = new AtomicInteger(1);

    /* JADX INFO: renamed from: a */
    public final mcr f33235a;

    /* JADX INFO: renamed from: b */
    public View f33236b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final a1m f33237c;

    /* JADX INFO: renamed from: d */
    public final int f33238d;

    /* JADX INFO: renamed from: e */
    public View f33239e;

    /* JADX INFO: renamed from: f */
    public ExpProfileIntegrityOptView f33240f;

    /* JADX INFO: renamed from: g */
    public View f33241g;

    /* JADX INFO: renamed from: h */
    public ExpProfileIntegrityOptView.C8636a f33242h;

    /* JADX INFO: renamed from: i */
    public View f33243i;

    /* JADX INFO: renamed from: k */
    public dac0 f33245k;

    /* JADX INFO: renamed from: j */
    public boolean f33244j = false;

    /* JADX INFO: renamed from: l */
    public List<d30> f33246l = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: m */
    public List<d30> f33247m = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: n */
    public boolean f33248n = true;

    public AbstractC8637a(@NonNull a1m a1mVar, mcr mcrVar) {
        this.f33237c = a1mVar;
        this.f33235a = mcrVar;
        AtomicInteger atomicInteger = f33234o;
        if (atomicInteger.get() > 65536) {
            atomicInteger.set(1);
        }
        this.f33238d = atomicInteger.getAndIncrement();
    }

    /* JADX INFO: renamed from: A */
    public View m51144A() {
        return this.f33236b;
    }

    /* JADX INFO: renamed from: B */
    public void m51145B(ExpProfileIntegrityOptView.C8636a c8636a) {
        this.f33242h = c8636a;
    }

    /* JADX INFO: renamed from: C */
    public void m51146C(boolean z) {
        View viewFindViewById = this.f33239e.findViewById(u4c0.f174437qe);
        if (viewFindViewById != null) {
            xdl0.m208344M(viewFindViewById, z);
        }
    }

    /* JADX INFO: renamed from: D */
    public void m51147D(View.OnClickListener onClickListener) {
        xdl0.m208329E0(this.f33239e, onClickListener);
    }

    /* JADX INFO: renamed from: E */
    public void mo51148E() {
    }

    /* JADX INFO: renamed from: F */
    public final void m51149F(dac0 dac0Var, int i, View view) {
        if (!this.f33244j || this.f33248n) {
            int iHashCode = new Object().hashCode();
            ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.CUSTOM;
            PerformanceLogUtil.logBegin(iHashCode, profileLogName, "render by ".concat(getClass().getSimpleName()));
            m51152d(dac0Var);
            if (m51154f() != null) {
                mo51174z();
            }
            this.f33244j = true;
            this.f33248n = false;
            m51156h();
            PerformanceLogUtil.logEnd(iHashCode, profileLogName, "render by ".concat(getClass().getSimpleName()));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m51150b(d30 d30Var) {
        if (m51164p()) {
            d30Var.call();
        } else {
            this.f33246l.add(d30Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m51151c(d30 d30Var) {
        if (m51163o()) {
            d30Var.call();
        } else {
            this.f33247m.add(d30Var);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m51152d(dac0 dac0Var) {
        this.f33245k = dac0Var;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo51153e() {
        return false;
    }

    /* JADX INFO: renamed from: f */
    public User m51154f() {
        return this.f33237c.m94569i2();
    }

    /* JADX INFO: renamed from: g */
    public final void m51155g() {
        Iterator<d30> it = this.f33246l.iterator();
        while (it.hasNext()) {
            it.next().call();
        }
        this.f33246l.clear();
    }

    /* JADX INFO: renamed from: h */
    public void m51156h() {
        Iterator<d30> it = this.f33247m.iterator();
        while (it.hasNext()) {
            it.next().call();
        }
        this.f33247m.clear();
    }

    /* JADX INFO: renamed from: i */
    public Frag m51157i() {
        return m51172x().mo51066J1();
    }

    /* JADX INFO: renamed from: j */
    public final View m51158j(ViewGroup viewGroup) {
        View view = this.f33243i;
        if (view != null) {
            return view;
        }
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.ITEM_INFLATE;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName, getClass().getSimpleName());
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(xdl0.f192403e, xdl0.f192404f));
        View viewMo51173y = mo51173y(viewGroup);
        this.f33236b = viewMo51173y;
        if (viewMo51173y == null) {
            qkq0.m175383a("rootView is Null !!!");
            return null;
        }
        if (viewMo51173y.getParent() != null) {
            ((ViewGroup) this.f33236b.getParent()).removeView(this.f33236b);
        }
        frameLayout.addView(this.f33236b, xdl0.f192403e, xdl0.f192404f);
        mo51165q(this.f33236b);
        m51155g();
        PerformanceLogUtil.logEnd(iHashCode, profileLogName, getClass().getSimpleName());
        this.f33243i = frameLayout;
        return frameLayout;
    }

    /* JADX INFO: renamed from: k */
    public final View m51159k(ViewGroup viewGroup) {
        View view = this.f33243i;
        if (view != null) {
            return view;
        }
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.ITEM_INFLATE;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName, getClass().getSimpleName());
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setBackgroundResource(x2c0.f190700x1);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        View view2 = new View(viewGroup.getContext());
        this.f33241g = view2;
        mep0.m154302d1(view2, t100.f167264m);
        View view3 = this.f33241g;
        int i = xdl0.f192403e;
        frameLayout.addView(view3, i, i);
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        int i2 = t100.f167268q;
        linearLayout.setPadding(0, i2, 0, i2);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(xdl0.f192403e, xdl0.f192404f));
        frameLayout.addView(linearLayout, xdl0.f192403e, xdl0.f192404f);
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(f6c0.f96108z2, (ViewGroup) null);
        this.f33239e = viewInflate;
        TextView textView = (TextView) viewInflate.findViewById(u4c0.f174454re);
        textView.setText(mo51161m());
        if (TextUtils.isEmpty(mo51161m())) {
            frameLayout.setBackgroundResource(x2c0.f190601tu);
        }
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(viewGroup.getResources().getColor(w0c0.f183899x));
        ExpProfileIntegrityOptView expProfileIntegrityOptView = (ExpProfileIntegrityOptView) this.f33239e.findViewById(u4c0.f174446r6);
        this.f33240f = expProfileIntegrityOptView;
        xdl0.m208344M(expProfileIntegrityOptView, false);
        linearLayout.addView(this.f33239e, xdl0.f192403e, xdl0.f192404f);
        View viewMo51173y = mo51173y(viewGroup);
        this.f33236b = viewMo51173y;
        if (viewMo51173y == null) {
            qkq0.m175383a("rootView is Null !!!");
            return null;
        }
        if (viewMo51173y.getParent() != null) {
            ((ViewGroup) this.f33236b.getParent()).removeView(this.f33236b);
        }
        linearLayout.addView(this.f33236b, xdl0.f192403e, xdl0.f192404f);
        mo51165q(this.f33236b);
        m51155g();
        PerformanceLogUtil.logEnd(iHashCode, profileLogName, getClass().getSimpleName());
        this.f33243i = frameLayout;
        return frameLayout;
    }

    /* JADX INFO: renamed from: l */
    public int mo51160l() {
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public String mo51161m() {
        return "";
    }

    /* JADX INFO: renamed from: n */
    public String mo51162n() {
        return "";
    }

    /* JADX INFO: renamed from: o */
    public boolean m51163o() {
        return this.f33244j;
    }

    /* JADX INFO: renamed from: p */
    public boolean m51164p() {
        return this.f33236b != null;
    }

    /* JADX INFO: renamed from: q */
    public void mo51165q(View view) {
    }

    /* JADX INFO: renamed from: r */
    public boolean mo51166r() {
        return true;
    }

    /* JADX INFO: renamed from: s */
    public int m51167s() {
        return this.f33238d;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m51168t(View view, d30 d30Var, View view2) {
        if (NullChecker.m81303a(m51172x().mo51050C2()) && NullChecker.m81303a(m51172x().m94569i2())) {
            view.requestFocus();
            d30Var.call();
            m51172x().mo51056E();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m51169u() {
        this.f33248n = true;
    }

    /* JADX INFO: renamed from: v */
    public void m51170v(final View view, final d30 d30Var, boolean z) {
        if (z) {
            xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.w8f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f185207a.m51168t(view, d30Var, view2);
                }
            });
        } else {
            xdl0.m208329E0(view, null);
        }
    }

    /* JADX INFO: renamed from: w */
    public void mo51171w(List<Media> list) {
    }

    /* JADX INFO: renamed from: x */
    public a1m m51172x() {
        return this.f33237c;
    }

    /* JADX INFO: renamed from: y */
    public abstract View mo51173y(ViewGroup viewGroup);

    /* JADX INFO: renamed from: z */
    public abstract void mo51174z();
}
