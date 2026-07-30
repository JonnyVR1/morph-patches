package com.p046p1.mobile.putong.core.newui.main;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.newui.main.BottomBarManager;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.RedPointView;
import p147v.VText;
import p147v.bottombar.C22594a;
import p147v.bottombar.VBottomBar;
import p147v.bottombar.VBottomBarDefaultItem;
import p147v.bottombar.VBottomBarOldItem;
import p147v.bottombar.VBottomBarRippleView;
import p149l.bt0;
import p149l.c4g0;
import p149l.e30;
import p149l.e51;
import p149l.f6c0;
import p149l.hvc0;
import p149l.j760;
import p149l.jo0;
import p149l.mkd0;
import p149l.qib0;
import p149l.t0g0;
import p149l.upa;
import p149l.vwb;
import p149l.w0c0;
import p149l.w9j;
import p149l.wwc0;
import p149l.x2c0;
import p149l.xdl0;
import p149l.xma;

/* JADX INFO: loaded from: classes11.dex */
public class BottomBarManager {

    /* JADX INFO: renamed from: a */
    public final VBottomBar f24423a;

    /* JADX INFO: renamed from: b */
    public final Context f24424b;

    /* JADX INFO: renamed from: c */
    public List<VBottomBarDefaultItem> f24425c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public TabName f24426d;

    /* JADX INFO: renamed from: e */
    public boolean f24427e;

    /* JADX INFO: renamed from: f */
    public VBottomBarOldItem f24428f;

    /* JADX INFO: renamed from: g */
    public c4g0 f24429g;

    /* JADX INFO: renamed from: h */
    public Integer f24430h;

    public enum DotType {
        Dot,
        TextDot,
        Num,
        ICON,
        WARNING
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.BottomBarManager$a */
    public static /* synthetic */ class C8089a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f24433a;

        static {
            int[] iArr = new int[DotType.values().length];
            f24433a = iArr;
            try {
                iArr[DotType.Dot.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24433a[DotType.Num.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24433a[DotType.ICON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public BottomBarManager(Context context, VBottomBar vBottomBar) {
        this.f24424b = context;
        this.f24423a = vBottomBar;
        m39652q();
        m39659x();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m39625d(Throwable th) {
    }

    /* JADX INFO: renamed from: A */
    public void m39633A(TabName tabName, boolean z) {
        this.f24423a.m223366n(m39651p(tabName), z);
    }

    /* JADX INFO: renamed from: B */
    public void m39634B(j760<TabName, Boolean> j760Var) {
        if (m39642J(j760Var.f116564a)) {
            Boolean bool = j760Var.f116565b;
            final boolean z = bool != null && bool.booleanValue();
            TabName tabName = this.f24426d;
            TabName tabName2 = j760Var.f116564a;
            if (tabName == tabName2 || z) {
                this.f24426d = tabName2;
                if (z == this.f24427e) {
                    return;
                }
                this.f24427e = z;
                Act act = (Act) this.f24424b;
                VBottomBar vBottomBar = this.f24423a;
                if (z) {
                    vBottomBar.setBackgroundResource(w0c0.f183831b);
                    act.setNavigationBarColor(act.getResources().getColor(w0c0.f183831b));
                } else {
                    vBottomBar.setBackgroundResource(w0c0.f183788N);
                    act.setNavigationBarColor(act.getResources().getColor(w0c0.f183834b2));
                }
                vwb.m200354z(this.f24425c, new e30() { // from class: l.ma3
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ((VBottomBarDefaultItem) obj).setDarkMode(z);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public void m39635C(TabName tabName, boolean z) {
        VBottomBarDefaultItem vBottomBarDefaultItemM39649n = m39649n(tabName);
        if (NullChecker.m81303a(vBottomBarDefaultItemM39649n)) {
            vBottomBarDefaultItemM39649n.f209531d.setVisibility(z ? 0 : 4);
        }
    }

    /* JADX INFO: renamed from: D */
    public void m39636D(boolean z) {
        TabName tabName = TabName.Me;
        if (m39649n(tabName) instanceof VBottomBarOldItem) {
            View childAt = ((VBottomBarOldItem) m39649n(tabName)).f209544k.getChildAt(0);
            if (NullChecker.m81303a(childAt)) {
                if (!CoreModule.f17545c.f19654j0.f19295h0 && z) {
                    m39648m(childAt);
                    CoreModule.f17545c.f19654j0.f19295h0 = true;
                } else if (z) {
                    xdl0.m208344M(childAt, true);
                } else {
                    childAt.setVisibility(4);
                }
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public void m39637E(TabName tabName, int i) {
        VBottomBarDefaultItem vBottomBarDefaultItemM39649n = m39649n(tabName);
        if (NullChecker.m81303a(vBottomBarDefaultItemM39649n)) {
            vBottomBarDefaultItemM39649n.f209532e.setImageResource(i);
            vBottomBarDefaultItemM39649n.f209532e.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m39638F(int i) {
        if (this.f24428f == null) {
            return;
        }
        this.f24430h = Integer.valueOf(i);
        this.f24428f.f209542i.m223380h(i, new int[]{i, i}, new float[]{0.0f, 1.0f});
        if (this.f24428f.isSelected()) {
            e51.m114742G(new Runnable() { // from class: l.sa3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f163254a.m39657v();
                }
            });
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m39639G() {
        if (this.f24428f == null) {
            return;
        }
        this.f24430h = null;
        this.f24428f.f209542i.m223380h(this.f24424b.getResources().getColor(w0c0.f183881r), new int[]{this.f24424b.getResources().getColor(w0c0.f183884s), this.f24424b.getResources().getColor(w0c0.f183887t), this.f24424b.getResources().getColor(w0c0.f183890u), this.f24424b.getResources().getColor(w0c0.f183893v)}, new float[]{0.0f, 0.28f, 0.62f, 1.0f});
        if (this.f24428f.isSelected()) {
            e51.m114742G(new Runnable() { // from class: l.ka3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f122092a.m39658w();
                }
            });
        }
    }

    /* JADX INFO: renamed from: H */
    public void m39640H(TabName tabName, int i, @DrawableRes int i2) {
        VBottomBarDefaultItem vBottomBarDefaultItemM39649n = m39649n(tabName);
        if (NullChecker.m81303a(vBottomBarDefaultItemM39649n)) {
            RedPointView redPointView = vBottomBarDefaultItemM39649n.f209530c;
            String strM186865f = t0g0.m186865f(i);
            redPointView.setText(strM186865f);
            redPointView.setVisibility(TextUtils.isEmpty(strM186865f) ? 4 : 0);
            if (wwc0.m205855a(i2)) {
                redPointView.setBackgroundResource(i2);
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public void m39641I(TabName tabName, @DrawableRes int i) {
        VBottomBarDefaultItem vBottomBarDefaultItemM39649n = m39649n(tabName);
        if (NullChecker.m81303a(vBottomBarDefaultItemM39649n) && wwc0.m205855a(i)) {
            vBottomBarDefaultItemM39649n.f209530c.setBackgroundResource(i);
        }
    }

    /* JADX INFO: renamed from: J */
    public boolean m39642J(TabName tabName) {
        return m39649n(tabName) != null;
    }

    /* JADX INFO: renamed from: K */
    public void m39643K(boolean z) {
        VBottomBarDefaultItem vBottomBarDefaultItemM39649n = m39649n(TabName.Moment);
        if (vBottomBarDefaultItemM39649n == null) {
            return;
        }
        C22594a.a aVar = new C22594a.a();
        aVar.f209574a = "刷新";
        int i = x2c0.f189319F5;
        aVar.f209576c = i;
        aVar.f209577d = i;
        vBottomBarDefaultItemM39649n.getInfo().f209573i = aVar;
        if (z) {
            m39661z(vBottomBarDefaultItemM39649n, true);
        } else {
            vBottomBarDefaultItemM39649n.mo223367b();
        }
    }

    /* JADX INFO: renamed from: L */
    public void m39644L(String str, boolean z) {
        VBottomBarDefaultItem vBottomBarDefaultItemM39649n = m39649n(TabName.Me);
        if (vBottomBarDefaultItemM39649n instanceof VBottomBarOldItem) {
            ((VBottomBarOldItem) vBottomBarDefaultItemM39649n).m223375i(str, z);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m39645M() {
        if (this.f24428f == null) {
            return;
        }
        if (!xma.m210081j4()) {
            m39638F(Color.parseColor("#9F64D5"));
        } else if (xma.m210071e4()) {
            m39639G();
        } else {
            m39638F(Color.parseColor("#D19012"));
        }
    }

    /* JADX INFO: renamed from: N */
    public void m39646N(boolean z) {
        VBottomBarDefaultItem vBottomBarDefaultItemM39649n = m39649n(TabName.Moment);
        if (vBottomBarDefaultItemM39649n == null) {
            return;
        }
        vBottomBarDefaultItemM39649n.getInfo().f209573i = null;
        if (z) {
            m39661z(vBottomBarDefaultItemM39649n, false);
        } else {
            vBottomBarDefaultItemM39649n.mo223367b();
        }
    }

    /* JADX INFO: renamed from: l */
    public final VBottomBarOldItem m39647l(C22594a c22594a) {
        return new VBottomBarOldItem(this.f24424b, c22594a) { // from class: com.p1.mobile.putong.core.newui.main.BottomBarManager.1

            /* JADX INFO: renamed from: n */
            public final /* synthetic */ C22594a f24431n;

            {
                this.f24431n = c22594a;
                setInfo(c22594a);
                m223376j();
                mo223367b();
            }

            @Override // p147v.bottombar.VBottomBarOldItem, p147v.bottombar.VBottomBarDefaultItem
            /* JADX INFO: renamed from: d */
            public void mo39662d(boolean z, boolean z2) {
                if (z) {
                    VBottomBarRippleView vBottomBarRippleView = this.f209542i;
                    if (z2) {
                        vBottomBarRippleView.m223381i();
                    } else {
                        vBottomBarRippleView.m223377d();
                    }
                    this.f209529b.setTextColor(BottomBarManager.this.f24430h != null ? BottomBarManager.this.f24430h.intValue() : getResources().getColor(w0c0.f183773I));
                    this.f209529b.setTypeface(null, 1);
                    return;
                }
                this.f209542i.m223378f();
                boolean z3 = this.f209534g;
                VText vText = this.f209529b;
                if (z3) {
                    vText.setTextColor(getResources().getColor(w0c0.f183785M));
                } else {
                    vText.setTextColor(getResources().getColor(w0c0.f183761E));
                }
                this.f209529b.setTypeface(null, 0);
            }
        };
    }

    /* JADX INFO: renamed from: m */
    public void m39648m(final View view) {
        if (view instanceof TextView) {
            ((TextView) view).setText(CoreModule.f17545c.f19654j0.m30645z4() ? R$string.f17602B5 : R$string.f17632C5);
        }
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        Animator animatorM103739l = bt0.m103739l(view, bt0.f77162i, 1500L, 300L, linearInterpolator, 0.0f, 1.0f);
        bt0.m103749v(animatorM103739l, new Runnable() { // from class: l.ua3
            @Override // java.lang.Runnable
            public final void run() {
                xdl0.m208344M(view, true);
            }
        });
        bt0.m103746s(animatorM103739l, bt0.m103743p(view, BLiveGiftItem.TYPE_ROTATION, 300L, 800L, linearInterpolator, 0.0f, -20.0f, 0.0f, 20.0f, 0.0f, -20.0f, 0.0f, 20.0f, 0.0f, -20.0f, 0.0f)).start();
    }

    /* JADX INFO: renamed from: n */
    public VBottomBarDefaultItem m39649n(final TabName tabName) {
        return (VBottomBarDefaultItem) vwb.m200346r(this.f24425c, new w9j() { // from class: l.la3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((VBottomBarDefaultItem) obj).getTabName(), tabName.toString()));
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public void m39650o(TabName tabName) {
        VBottomBarDefaultItem vBottomBarDefaultItemM39649n = m39649n(tabName);
        if (NullChecker.m81303a(vBottomBarDefaultItemM39649n)) {
            vBottomBarDefaultItemM39649n.f209532e.setImageDrawable(null);
            vBottomBarDefaultItemM39649n.f209532e.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: p */
    public int m39651p(final TabName tabName) {
        return vwb.m200293G(this.f24425c, new w9j() { // from class: l.ta3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(tabName.toString(), ((VBottomBarDefaultItem) obj).getTabName()));
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final void m39652q() {
        User userMe_ = CoreModule.m29932K().me_();
        User userRiskAuditUser = userMe_.riskAuditUser(CoreModule.m29932K().getUserById("fake_risk_audit_default_" + userMe_.f56011id));
        String str = (NullChecker.m81303a(userRiskAuditUser) && NullChecker.m81303a(userRiskAuditUser.m60124fp()) && NullChecker.m81303a(userRiskAuditUser.m60124fp().profileSmall())) ? userRiskAuditUser.m60124fp().profileSmall().formatted() : null;
        String string = (upa.m194632F0() || upa.m194741d3() || upa.m194686Q1()) ? this.f24424b.getString(R$string.f19098yj) : this.f24424b.getString(R$string.f18458di);
        upa.m194847z();
        C22594a c22594a = new C22594a(TabName.Card.toString());
        c22594a.m223398d(this.f24424b.getString(R$string.f18711lq));
        c22594a.m223397c(x2c0.f189998b0, x2c0.f190030c0);
        VBottomBarOldItem vBottomBarOldItemM223395a = c22594a.m223395a(this.f24424b, true);
        vBottomBarOldItemM223395a.setGrey(upa.m194714X1());
        this.f24425c.add(vBottomBarOldItemM223395a);
        if ((CoreModule.m29936Q().mo67255a().mo124839f() && qib0.f154713b0.f139232c.getHomeLiveTabPosition() >= 0) || CoreModule.m29936Q().mo67255a().mo124838e()) {
            String strMo67256a7 = qib0.f154713b0.f139232c.mo67256a7();
            if (TextUtils.isEmpty(strMo67256a7)) {
                strMo67256a7 = this.f24424b.getString(R$string.f19134zp);
            }
            C22594a c22594a2 = new C22594a(TabName.Live.toString());
            c22594a2.m223398d(strMo67256a7);
            c22594a2.m223397c(x2c0.f189810V, x2c0.f189841W);
            this.f24425c.add(c22594a2.m223395a(this.f24424b, true));
        }
        C22594a c22594a3 = new C22594a(TabName.Meet.toString());
        c22594a3.m223398d(hvc0.m133156c(R$string.f17756G9));
        int i = x2c0.f190261ja;
        c22594a3.m223397c(i, i);
        VBottomBarOldItem vBottomBarOldItemM39647l = m39647l(c22594a3);
        this.f24428f = vBottomBarOldItemM39647l;
        this.f24425c.add(vBottomBarOldItemM39647l);
        m39645M();
        C22594a c22594a4 = new C22594a(TabName.Msg.toString());
        c22594a4.m223398d(string);
        c22594a4.m223397c(x2c0.f189934Z, x2c0.f189966a0);
        this.f24425c.add(c22594a4.m223395a(this.f24424b, true));
        C22594a c22594a5 = new C22594a(TabName.Me.toString());
        c22594a5.m223398d(this.f24424b.getString(R$string.f19068xj));
        c22594a5.m223397c(x2c0.f189872X, x2c0.f189903Y);
        c22594a5.m223396b(str);
        VBottomBarOldItem vBottomBarOldItemM223395a2 = c22594a5.m223395a(this.f24424b, true);
        vBottomBarOldItemM223395a2.m223372f(f6c0.f95715bf);
        this.f24425c.add(vBottomBarOldItemM223395a2);
        this.f24423a.m223357e(this.f24425c);
        this.f24423a.m223366n(0, false);
    }

    /* JADX INFO: renamed from: r */
    public boolean m39653r() {
        return m39651p(TabName.Msg) >= this.f24425c.size() / 2;
    }

    /* JADX INFO: renamed from: s */
    public boolean m39654s(TabName tabName, DotType dotType) {
        View view;
        VBottomBarDefaultItem vBottomBarDefaultItemM39649n = m39649n(tabName);
        if (vBottomBarDefaultItemM39649n == null) {
            return false;
        }
        int i = C8089a.f24433a[dotType.ordinal()];
        if (i == 1) {
            view = vBottomBarDefaultItemM39649n.f209531d;
        } else if (i != 2) {
            view = i != 3 ? null : vBottomBarDefaultItemM39649n.f209532e;
        } else {
            view = vBottomBarDefaultItemM39649n.f209530c;
        }
        if (NullChecker.m81303a(view)) {
            return xdl0.m208349O0(view);
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public boolean m39655t(TabName tabName) {
        VBottomBarDefaultItem vBottomBarDefaultItemM39649n = m39649n(tabName);
        if (NullChecker.m81303a(vBottomBarDefaultItemM39649n)) {
            return xdl0.m208349O0(vBottomBarDefaultItemM39649n.f209530c);
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m39656u(List list) {
        m39645M();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m39657v() {
        this.f24428f.mo39662d(true, false);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m39658w() {
        this.f24428f.mo39662d(true, false);
    }

    /* JADX INFO: renamed from: x */
    public final void m39659x() {
        if (this.f24428f == null) {
            return;
        }
        this.f24429g = CoreModule.f17545c.f19555C0.m210114x3().observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.na3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137858a.m39656u((List) obj);
            }
        }, new e30() { // from class: l.oa3
            @Override // p149l.e30
            public final void call(Object obj) {
                BottomBarManager.m39625d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y */
    public void m39660y() {
        this.f24423a.setVisibleCallback(null);
        mkd0.m154992z(this.f24429g);
    }

    /* JADX INFO: renamed from: z */
    public final void m39661z(final VBottomBarDefaultItem vBottomBarDefaultItem, boolean z) {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        Animator animatorM103739l = bt0.m103739l(vBottomBarDefaultItem.getIconView(), bt0.f77162i, 0L, 100L, linearInterpolator, 1.0f, 0.1f);
        Animator animatorM103743p = bt0.m103743p(vBottomBarDefaultItem.getIconView(), "alpha", 0L, 100L, linearInterpolator, 1.0f, 0.1f);
        Animator animatorM103739l2 = bt0.m103739l(vBottomBarDefaultItem.getIconView(), bt0.f77162i, 0L, 300L, linearInterpolator, 0.1f, 1.0f);
        Animator animatorM103743p2 = bt0.m103743p(vBottomBarDefaultItem.getIconView(), BLiveGiftItem.TYPE_ROTATION, 100L, 200L, linearInterpolator, 0.0f, 360.0f);
        Animator animatorM103743p3 = bt0.m103743p(vBottomBarDefaultItem.getIconView(), "alpha", 0L, 300L, linearInterpolator, 0.1f, 1.0f);
        Animator animatorM103753z = bt0.m103753z(animatorM103743p, animatorM103739l);
        bt0.m103749v(animatorM103753z, new Runnable() { // from class: l.pa3
            @Override // java.lang.Runnable
            public final void run() {
                vBottomBarDefaultItem.setClickable(false);
            }
        });
        Animator animatorM103753z2 = z ? bt0.m103753z(animatorM103743p2, animatorM103739l2, animatorM103743p3) : bt0.m103753z(animatorM103739l2, animatorM103743p3);
        bt0.m103749v(animatorM103753z2, new Runnable() { // from class: l.qa3
            @Override // java.lang.Runnable
            public final void run() {
                vBottomBarDefaultItem.mo223367b();
            }
        });
        bt0.m103733f(animatorM103753z2, new Runnable() { // from class: l.ra3
            @Override // java.lang.Runnable
            public final void run() {
                vBottomBarDefaultItem.setClickable(true);
            }
        });
        bt0.m103746s(bt0.m103737j(10), animatorM103753z, animatorM103753z2).start();
    }
}
