package com.p000p1.mobile.putong.core.newui.main;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import com.p000p1.mobile.putong.core.newui.main.BottomBarManager;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.bt0;
import l.c4g0;
import l.e30;
import l.e51;
import l.f6c0;
import l.hvc0;
import l.j760;
import l.jo0;
import l.mkd0;
import l.qib0;
import l.t0g0;
import l.upa;
import l.vwb;
import l.w0c0;
import l.w9j;
import l.wwc0;
import l.x2c0;
import l.xdl0;
import l.xma;
import v.RedPointView;
import v.VText;
import v.bottombar.VBottomBar;
import v.bottombar.VBottomBarDefaultItem;
import v.bottombar.VBottomBarOldItem;
import v.bottombar.VBottomBarRippleView;
import v.bottombar.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class BottomBarManager {

    /* JADX INFO: renamed from: a */
    public final VBottomBar f3201a;

    /* JADX INFO: renamed from: b */
    public final Context f3202b;

    /* JADX INFO: renamed from: c */
    public List<VBottomBarDefaultItem> f3203c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public TabName f3204d;

    /* JADX INFO: renamed from: e */
    public boolean f3205e;

    /* JADX INFO: renamed from: f */
    public VBottomBarOldItem f3206f;

    /* JADX INFO: renamed from: g */
    public c4g0 f3207g;

    /* JADX INFO: renamed from: h */
    public Integer f3208h;

    public enum DotType {
        Dot,
        TextDot,
        Num,
        ICON,
        WARNING
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.BottomBarManager$a */
    public static /* synthetic */ class C0253a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f3211a;

        static {
            int[] iArr = new int[DotType.values().length];
            f3211a = iArr;
            try {
                iArr[DotType.Dot.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3211a[DotType.Num.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3211a[DotType.ICON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public BottomBarManager(Context context, VBottomBar vBottomBar) {
        this.f3202b = context;
        this.f3201a = vBottomBar;
        m3728q();
        m3735x();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m3701d(Throwable th) {
    }

    /* JADX INFO: renamed from: A */
    public void m3709A(TabName tabName, boolean z) {
        this.f3201a.n(m3727p(tabName), z);
    }

    /* JADX INFO: renamed from: B */
    public void m3710B(j760<TabName, Boolean> j760Var) {
        if (m3718J((TabName) j760Var.a)) {
            Object obj = j760Var.b;
            final boolean z = obj != null && ((Boolean) obj).booleanValue();
            TabName tabName = this.f3204d;
            Object obj2 = j760Var.a;
            if (tabName == obj2 || z) {
                this.f3204d = (TabName) obj2;
                if (z == this.f3205e) {
                    return;
                }
                this.f3205e = z;
                Act act = this.f3202b;
                VBottomBar vBottomBar = this.f3201a;
                if (z) {
                    vBottomBar.setBackgroundResource(w0c0.b);
                    act.setNavigationBarColor(act.getResources().getColor(w0c0.b));
                } else {
                    vBottomBar.setBackgroundResource(w0c0.N);
                    act.setNavigationBarColor(act.getResources().getColor(w0c0.b2));
                }
                vwb.z(this.f3203c, new e30() { // from class: l.ma3
                    public final void call(Object obj3) {
                        ((VBottomBarDefaultItem) obj3).setDarkMode(z);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public void m3711C(TabName tabName, boolean z) {
        VBottomBarDefaultItem vBottomBarDefaultItemM3725n = m3725n(tabName);
        if (NullChecker.a(vBottomBarDefaultItemM3725n)) {
            vBottomBarDefaultItemM3725n.d.setVisibility(z ? 0 : 4);
        }
    }

    /* JADX INFO: renamed from: D */
    public void m3712D(boolean z) {
        TabName tabName = TabName.Me;
        if (m3725n(tabName) instanceof VBottomBarOldItem) {
            View childAt = m3725n(tabName).k.getChildAt(0);
            if (NullChecker.a(childAt)) {
                if (!CoreModule.c.j0.h0 && z) {
                    m3724m(childAt);
                    CoreModule.c.j0.h0 = true;
                } else if (z) {
                    xdl0.M(childAt, true);
                } else {
                    childAt.setVisibility(4);
                }
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public void m3713E(TabName tabName, int i) {
        VBottomBarDefaultItem vBottomBarDefaultItemM3725n = m3725n(tabName);
        if (NullChecker.a(vBottomBarDefaultItemM3725n)) {
            vBottomBarDefaultItemM3725n.e.setImageResource(i);
            vBottomBarDefaultItemM3725n.e.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m3714F(int i) {
        if (this.f3206f == null) {
            return;
        }
        this.f3208h = Integer.valueOf(i);
        this.f3206f.i.h(i, new int[]{i, i}, new float[]{0.0f, 1.0f});
        if (this.f3206f.isSelected()) {
            e51.G(new Runnable() { // from class: l.sa3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20141a.m3733v();
                }
            });
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m3715G() {
        if (this.f3206f == null) {
            return;
        }
        this.f3208h = null;
        this.f3206f.i.h(this.f3202b.getResources().getColor(w0c0.r), new int[]{this.f3202b.getResources().getColor(w0c0.s), this.f3202b.getResources().getColor(w0c0.t), this.f3202b.getResources().getColor(w0c0.u), this.f3202b.getResources().getColor(w0c0.v)}, new float[]{0.0f, 0.28f, 0.62f, 1.0f});
        if (this.f3206f.isSelected()) {
            e51.G(new Runnable() { // from class: l.ka3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15563a.m3734w();
                }
            });
        }
    }

    /* JADX INFO: renamed from: H */
    public void m3716H(TabName tabName, int i, @DrawableRes int i2) {
        VBottomBarDefaultItem vBottomBarDefaultItemM3725n = m3725n(tabName);
        if (NullChecker.a(vBottomBarDefaultItemM3725n)) {
            RedPointView redPointView = vBottomBarDefaultItemM3725n.c;
            String strF = t0g0.f(i);
            redPointView.setText(strF);
            redPointView.setVisibility(TextUtils.isEmpty(strF) ? 4 : 0);
            if (wwc0.a(i2)) {
                redPointView.setBackgroundResource(i2);
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public void m3717I(TabName tabName, @DrawableRes int i) {
        VBottomBarDefaultItem vBottomBarDefaultItemM3725n = m3725n(tabName);
        if (NullChecker.a(vBottomBarDefaultItemM3725n) && wwc0.a(i)) {
            vBottomBarDefaultItemM3725n.c.setBackgroundResource(i);
        }
    }

    /* JADX INFO: renamed from: J */
    public boolean m3718J(TabName tabName) {
        return m3725n(tabName) != null;
    }

    /* JADX INFO: renamed from: K */
    public void m3719K(boolean z) {
        VBottomBarDefaultItem vBottomBarDefaultItemM3725n = m3725n(TabName.Moment);
        if (vBottomBarDefaultItemM3725n == null) {
            return;
        }
        a.a aVar = new a.a();
        aVar.a = "刷新";
        int i = x2c0.F5;
        aVar.c = i;
        aVar.d = i;
        vBottomBarDefaultItemM3725n.getInfo().i = aVar;
        if (z) {
            m3737z(vBottomBarDefaultItemM3725n, true);
        } else {
            vBottomBarDefaultItemM3725n.b();
        }
    }

    /* JADX INFO: renamed from: L */
    public void m3720L(String str, boolean z) {
        VBottomBarOldItem vBottomBarOldItemM3725n = m3725n(TabName.Me);
        if (vBottomBarOldItemM3725n instanceof VBottomBarOldItem) {
            vBottomBarOldItemM3725n.i(str, z);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m3721M() {
        if (this.f3206f == null) {
            return;
        }
        if (!xma.j4()) {
            m3714F(Color.parseColor("#9F64D5"));
        } else if (xma.e4()) {
            m3715G();
        } else {
            m3714F(Color.parseColor("#D19012"));
        }
    }

    /* JADX INFO: renamed from: N */
    public void m3722N(boolean z) {
        VBottomBarDefaultItem vBottomBarDefaultItemM3725n = m3725n(TabName.Moment);
        if (vBottomBarDefaultItemM3725n == null) {
            return;
        }
        vBottomBarDefaultItemM3725n.getInfo().i = null;
        if (z) {
            m3737z(vBottomBarDefaultItemM3725n, false);
        } else {
            vBottomBarDefaultItemM3725n.b();
        }
    }

    /* JADX INFO: renamed from: l */
    public final VBottomBarOldItem m3723l(a aVar) {
        return new VBottomBarOldItem(this.f3202b, aVar) { // from class: com.p1.mobile.putong.core.newui.main.BottomBarManager.1

            /* JADX INFO: renamed from: n */
            public final /* synthetic */ a f3209n;

            {
                this.f3209n = aVar;
                setInfo(aVar);
                j();
                b();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX INFO: renamed from: d */
            public void m3738d(boolean z, boolean z2) {
                if (z) {
                    VBottomBarRippleView vBottomBarRippleView = ((VBottomBarOldItem) this).i;
                    if (z2) {
                        vBottomBarRippleView.i();
                    } else {
                        vBottomBarRippleView.d();
                    }
                    ((VBottomBarDefaultItem) this).b.setTextColor(BottomBarManager.this.f3208h != null ? BottomBarManager.this.f3208h.intValue() : getResources().getColor(w0c0.I));
                    ((VBottomBarDefaultItem) this).b.setTypeface((Typeface) null, 1);
                    return;
                }
                ((VBottomBarOldItem) this).i.f();
                boolean z3 = ((VBottomBarDefaultItem) this).g;
                VText vText = ((VBottomBarDefaultItem) this).b;
                if (z3) {
                    vText.setTextColor(getResources().getColor(w0c0.M));
                } else {
                    vText.setTextColor(getResources().getColor(w0c0.E));
                }
                ((VBottomBarDefaultItem) this).b.setTypeface((Typeface) null, 0);
            }
        };
    }

    /* JADX INFO: renamed from: m */
    public void m3724m(final View view) {
        if (view instanceof TextView) {
            ((TextView) view).setText(CoreModule.c.j0.z4() ? R.string.B5 : R.string.C5);
        }
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        Animator animatorL = bt0.l(view, bt0.i, 1500L, 300L, linearInterpolator, new float[]{0.0f, 1.0f});
        bt0.v(animatorL, new Runnable() { // from class: l.ua3
            @Override // java.lang.Runnable
            public final void run() {
                xdl0.M(view, true);
            }
        });
        bt0.s(new Animator[]{animatorL, bt0.p(view, "rotation", 300L, 800L, linearInterpolator, new float[]{0.0f, -20.0f, 0.0f, 20.0f, 0.0f, -20.0f, 0.0f, 20.0f, 0.0f, -20.0f, 0.0f})}).start();
    }

    /* JADX INFO: renamed from: n */
    public VBottomBarDefaultItem m3725n(final TabName tabName) {
        return (VBottomBarDefaultItem) vwb.r(this.f3203c, new w9j() { // from class: l.la3
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((VBottomBarDefaultItem) obj).getTabName(), tabName.toString()));
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public void m3726o(TabName tabName) {
        VBottomBarDefaultItem vBottomBarDefaultItemM3725n = m3725n(tabName);
        if (NullChecker.a(vBottomBarDefaultItemM3725n)) {
            vBottomBarDefaultItemM3725n.e.setImageDrawable((Drawable) null);
            vBottomBarDefaultItemM3725n.e.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: p */
    public int m3727p(final TabName tabName) {
        return vwb.G(this.f3203c, new w9j() { // from class: l.ta3
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(tabName.toString(), ((VBottomBarDefaultItem) obj).getTabName()));
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final void m3728q() {
        User userMe_ = CoreModule.K().me_();
        User userRiskAuditUser = userMe_.riskAuditUser(CoreModule.K().getUserById("fake_risk_audit_default_" + ((DbObject) userMe_).id));
        String str = (NullChecker.a(userRiskAuditUser) && NullChecker.a(userRiskAuditUser.fp()) && NullChecker.a(userRiskAuditUser.fp().profileSmall())) ? userRiskAuditUser.fp().profileSmall().formatted() : null;
        String string = (upa.F0() || upa.d3() || upa.Q1()) ? this.f3202b.getString(R.string.yj) : this.f3202b.getString(R.string.di);
        upa.z();
        a aVar = new a(TabName.Card.toString());
        aVar.d(this.f3202b.getString(R.string.lq));
        aVar.c(x2c0.b0, x2c0.c0);
        VBottomBarDefaultItem vBottomBarDefaultItemA = aVar.a(this.f3202b, true);
        vBottomBarDefaultItemA.setGrey(upa.X1());
        this.f3203c.add(vBottomBarDefaultItemA);
        if ((CoreModule.Q().m9040a().m14851f() && qib0.b0.c.getHomeLiveTabPosition() >= 0) || CoreModule.Q().m9040a().m14850e()) {
            String strM9041a7 = qib0.b0.c.m9041a7();
            if (TextUtils.isEmpty(strM9041a7)) {
                strM9041a7 = this.f3202b.getString(R.string.zp);
            }
            a aVar2 = new a(TabName.Live.toString());
            aVar2.d(strM9041a7);
            aVar2.c(x2c0.V, x2c0.W);
            this.f3203c.add(aVar2.a(this.f3202b, true));
        }
        a aVar3 = new a(TabName.Meet.toString());
        aVar3.d(hvc0.c(R.string.G9));
        int i = x2c0.ja;
        aVar3.c(i, i);
        VBottomBarDefaultItem vBottomBarDefaultItemM3723l = m3723l(aVar3);
        this.f3206f = vBottomBarDefaultItemM3723l;
        this.f3203c.add(vBottomBarDefaultItemM3723l);
        m3721M();
        a aVar4 = new a(TabName.Msg.toString());
        aVar4.d(string);
        aVar4.c(x2c0.Z, x2c0.a0);
        this.f3203c.add(aVar4.a(this.f3202b, true));
        a aVar5 = new a(TabName.Me.toString());
        aVar5.d(this.f3202b.getString(R.string.xj));
        aVar5.c(x2c0.X, x2c0.Y);
        aVar5.b(str);
        VBottomBarDefaultItem vBottomBarDefaultItemA2 = aVar5.a(this.f3202b, true);
        vBottomBarDefaultItemA2.f(f6c0.bf);
        this.f3203c.add(vBottomBarDefaultItemA2);
        this.f3201a.e(this.f3203c);
        this.f3201a.n(0, false);
    }

    /* JADX INFO: renamed from: r */
    public boolean m3729r() {
        return m3727p(TabName.Msg) >= this.f3203c.size() / 2;
    }

    /* JADX INFO: renamed from: s */
    public boolean m3730s(TabName tabName, DotType dotType) {
        View view;
        VBottomBarDefaultItem vBottomBarDefaultItemM3725n = m3725n(tabName);
        if (vBottomBarDefaultItemM3725n == null) {
            return false;
        }
        int i = C0253a.f3211a[dotType.ordinal()];
        if (i == 1) {
            view = vBottomBarDefaultItemM3725n.d;
        } else if (i != 2) {
            view = i != 3 ? null : vBottomBarDefaultItemM3725n.e;
        } else {
            view = vBottomBarDefaultItemM3725n.c;
        }
        if (NullChecker.a(view)) {
            return xdl0.O0(view);
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public boolean m3731t(TabName tabName) {
        VBottomBarDefaultItem vBottomBarDefaultItemM3725n = m3725n(tabName);
        if (NullChecker.a(vBottomBarDefaultItemM3725n)) {
            return xdl0.O0(vBottomBarDefaultItemM3725n.c);
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m3732u(List list) {
        m3721M();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m3733v() {
        this.f3206f.d(true, false);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m3734w() {
        this.f3206f.d(true, false);
    }

    /* JADX INFO: renamed from: x */
    public final void m3735x() {
        if (this.f3206f == null) {
            return;
        }
        this.f3207g = CoreModule.c.C0.x3().observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.na3
            public final void call(Object obj) {
                this.f17365a.m3732u((List) obj);
            }
        }, new e30() { // from class: l.oa3
            public final void call(Object obj) {
                BottomBarManager.m3701d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y */
    public void m3736y() {
        this.f3201a.setVisibleCallback((e30) null);
        mkd0.z(this.f3207g);
    }

    /* JADX INFO: renamed from: z */
    public final void m3737z(final VBottomBarDefaultItem vBottomBarDefaultItem, boolean z) {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        Animator animatorL = bt0.l(vBottomBarDefaultItem.getIconView(), bt0.i, 0L, 100L, linearInterpolator, new float[]{1.0f, 0.1f});
        Animator animatorP = bt0.p(vBottomBarDefaultItem.getIconView(), "alpha", 0L, 100L, linearInterpolator, new float[]{1.0f, 0.1f});
        Animator animatorL2 = bt0.l(vBottomBarDefaultItem.getIconView(), bt0.i, 0L, 300L, linearInterpolator, new float[]{0.1f, 1.0f});
        Animator animatorP2 = bt0.p(vBottomBarDefaultItem.getIconView(), "rotation", 100L, 200L, linearInterpolator, new float[]{0.0f, 360.0f});
        Animator animatorP3 = bt0.p(vBottomBarDefaultItem.getIconView(), "alpha", 0L, 300L, linearInterpolator, new float[]{0.1f, 1.0f});
        Animator animatorZ = bt0.z(new Animator[]{animatorP, animatorL});
        bt0.v(animatorZ, new Runnable() { // from class: l.pa3
            @Override // java.lang.Runnable
            public final void run() {
                vBottomBarDefaultItem.setClickable(false);
            }
        });
        Animator animatorZ2 = z ? bt0.z(new Animator[]{animatorP2, animatorL2, animatorP3}) : bt0.z(new Animator[]{animatorL2, animatorP3});
        bt0.v(animatorZ2, new Runnable() { // from class: l.qa3
            @Override // java.lang.Runnable
            public final void run() {
                vBottomBarDefaultItem.b();
            }
        });
        bt0.f(animatorZ2, new Runnable() { // from class: l.ra3
            @Override // java.lang.Runnable
            public final void run() {
                vBottomBarDefaultItem.setClickable(true);
            }
        });
        bt0.s(new Animator[]{bt0.j(10), animatorZ, animatorZ2}).start();
    }
}
