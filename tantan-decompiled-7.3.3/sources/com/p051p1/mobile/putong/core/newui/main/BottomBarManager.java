package com.p051p1.mobile.putong.core.newui.main;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.newui.main.BottomBarManager;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.RedPointView;
import p151v.VText;
import p151v.bottombar.C22709a;
import p151v.bottombar.VBottomBar;
import p151v.bottombar.VBottomBarDefaultItem;
import p151v.bottombar.VBottomBarOldItem;
import p151v.bottombar.VBottomBarRippleView;
import p153l.a5d0;
import p153l.a9g0;
import p153l.bnl0;
import p153l.c9c0;
import p153l.dbc0;
import p153l.fo0;
import p153l.gra;
import p153l.gt0;
import p153l.joa;
import p153l.jyb;
import p153l.k3d0;
import p153l.kcg0;
import p153l.kec0;
import p153l.l51;
import p153l.pf60;
import p153l.psd0;
import p153l.qcj;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class BottomBarManager {

    /* JADX INFO: renamed from: a */
    public final VBottomBar f25165a;

    /* JADX INFO: renamed from: b */
    public final Context f25166b;

    /* JADX INFO: renamed from: c */
    public List<VBottomBarDefaultItem> f25167c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public TabName f25168d;

    /* JADX INFO: renamed from: e */
    public boolean f25169e;

    /* JADX INFO: renamed from: f */
    public VBottomBarOldItem f25170f;

    /* JADX INFO: renamed from: g */
    public kcg0 f25171g;

    /* JADX INFO: renamed from: h */
    public Integer f25172h;

    public enum DotType {
        Dot,
        TextDot,
        Num,
        ICON,
        WARNING
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.BottomBarManager$a */
    public static /* synthetic */ class C8240a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f25175a;

        static {
            int[] iArr = new int[DotType.values().length];
            f25175a = iArr;
            try {
                iArr[DotType.Dot.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25175a[DotType.Num.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25175a[DotType.ICON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public BottomBarManager(Context context, VBottomBar vBottomBar) {
        this.f25166b = context;
        this.f25165a = vBottomBar;
        m40655q();
        m40662x();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m40628d(Throwable th) {
    }

    /* JADX INFO: renamed from: A */
    public void m40636A(TabName tabName, boolean z) {
        this.f25165a.m224612n(m40654p(tabName), z);
    }

    /* JADX INFO: renamed from: B */
    public void m40637B(pf60<TabName, Boolean> pf60Var) {
        if (m40645J(pf60Var.f152156a)) {
            Boolean bool = pf60Var.f152157b;
            final boolean z = bool != null && bool.booleanValue();
            TabName tabName = this.f25168d;
            TabName tabName2 = pf60Var.f152156a;
            if (tabName == tabName2 || z) {
                this.f25168d = tabName2;
                if (z == this.f25169e) {
                    return;
                }
                this.f25169e = z;
                Act act = (Act) this.f25166b;
                VBottomBar vBottomBar = this.f25165a;
                if (z) {
                    vBottomBar.setBackgroundResource(c9c0.f80400b);
                    act.setNavigationBarColor(act.getResources().getColor(c9c0.f80400b));
                } else {
                    vBottomBar.setBackgroundResource(c9c0.f80357N);
                    act.setNavigationBarColor(act.getResources().getColor(c9c0.f80407c2));
                }
                jyb.m147537z(this.f25167c, new y20() { // from class: l.bb3
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        ((VBottomBarDefaultItem) obj).setDarkMode(z);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public void m40638C(TabName tabName, boolean z) {
        VBottomBarDefaultItem vBottomBarDefaultItemM40652n = m40652n(tabName);
        if (NullChecker.m82486a(vBottomBarDefaultItemM40652n)) {
            vBottomBarDefaultItemM40652n.f210453d.setVisibility(z ? 0 : 4);
        }
    }

    /* JADX INFO: renamed from: D */
    public void m40639D(boolean z) {
        TabName tabName = TabName.Me;
        if (m40652n(tabName) instanceof VBottomBarOldItem) {
            View childAt = ((VBottomBarOldItem) m40652n(tabName)).f210466k.getChildAt(0);
            if (NullChecker.m82486a(childAt)) {
                if (!CoreModule.f18264c.f20396j0.f20037h0 && z) {
                    m40651m(childAt);
                    CoreModule.f18264c.f20396j0.f20037h0 = true;
                } else if (z) {
                    bnl0.m105524M(childAt, true);
                } else {
                    childAt.setVisibility(4);
                }
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public void m40640E(TabName tabName, int i) {
        VBottomBarDefaultItem vBottomBarDefaultItemM40652n = m40652n(tabName);
        if (NullChecker.m82486a(vBottomBarDefaultItemM40652n)) {
            vBottomBarDefaultItemM40652n.f210454e.setImageResource(i);
            vBottomBarDefaultItemM40652n.f210454e.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m40641F(int i) {
        if (this.f25170f == null) {
            return;
        }
        this.f25172h = Integer.valueOf(i);
        this.f25170f.f210464i.m224626h(i, new int[]{i, i}, new float[]{0.0f, 1.0f});
        if (this.f25170f.isSelected()) {
            l51.m152887G(new Runnable() { // from class: l.hb3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f108561a.m40660v();
                }
            });
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m40642G() {
        if (this.f25170f == null) {
            return;
        }
        this.f25172h = null;
        this.f25170f.f210464i.m224626h(this.f25166b.getResources().getColor(c9c0.f80451r), new int[]{this.f25166b.getResources().getColor(c9c0.f80454s), this.f25166b.getResources().getColor(c9c0.f80457t), this.f25166b.getResources().getColor(c9c0.f80460u), this.f25166b.getResources().getColor(c9c0.f80463v)}, new float[]{0.0f, 0.28f, 0.62f, 1.0f});
        if (this.f25170f.isSelected()) {
            l51.m152887G(new Runnable() { // from class: l.za3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f203534a.m40661w();
                }
            });
        }
    }

    /* JADX INFO: renamed from: H */
    public void m40643H(TabName tabName, int i, @DrawableRes int i2) {
        VBottomBarDefaultItem vBottomBarDefaultItemM40652n = m40652n(tabName);
        if (NullChecker.m82486a(vBottomBarDefaultItemM40652n)) {
            RedPointView redPointView = vBottomBarDefaultItemM40652n.f210452c;
            String strM96571f = a9g0.m96571f(i);
            redPointView.setText(strM96571f);
            redPointView.setVisibility(TextUtils.isEmpty(strM96571f) ? 4 : 0);
            if (a5d0.m96049a(i2)) {
                redPointView.setBackgroundResource(i2);
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public void m40644I(TabName tabName, @DrawableRes int i) {
        VBottomBarDefaultItem vBottomBarDefaultItemM40652n = m40652n(tabName);
        if (NullChecker.m82486a(vBottomBarDefaultItemM40652n) && a5d0.m96049a(i)) {
            vBottomBarDefaultItemM40652n.f210452c.setBackgroundResource(i);
        }
    }

    /* JADX INFO: renamed from: J */
    public boolean m40645J(TabName tabName) {
        return m40652n(tabName) != null;
    }

    /* JADX INFO: renamed from: K */
    public void m40646K(boolean z) {
        VBottomBarDefaultItem vBottomBarDefaultItemM40652n = m40652n(TabName.Moment);
        if (vBottomBarDefaultItemM40652n == null) {
            return;
        }
        C22709a.a aVar = new C22709a.a();
        aVar.f210496a = "刷新";
        int i = dbc0.f86174G5;
        aVar.f210498c = i;
        aVar.f210499d = i;
        vBottomBarDefaultItemM40652n.getInfo().f210495i = aVar;
        if (z) {
            m40664z(vBottomBarDefaultItemM40652n, true);
        } else {
            vBottomBarDefaultItemM40652n.mo224613b();
        }
    }

    /* JADX INFO: renamed from: L */
    public void m40647L(String str, boolean z) {
        VBottomBarDefaultItem vBottomBarDefaultItemM40652n = m40652n(TabName.Me);
        if (vBottomBarDefaultItemM40652n instanceof VBottomBarOldItem) {
            ((VBottomBarOldItem) vBottomBarDefaultItemM40652n).m224621i(str, z);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m40648M() {
        if (this.f25170f == null) {
            return;
        }
        if (!joa.m146396k4()) {
            m40641F(Color.parseColor("#9F64D5"));
        } else if (joa.m146386f4()) {
            m40642G();
        } else {
            m40641F(Color.parseColor("#D19012"));
        }
    }

    /* JADX INFO: renamed from: N */
    public void m40649N(boolean z) {
        VBottomBarDefaultItem vBottomBarDefaultItemM40652n = m40652n(TabName.Moment);
        if (vBottomBarDefaultItemM40652n == null) {
            return;
        }
        vBottomBarDefaultItemM40652n.getInfo().f210495i = null;
        if (z) {
            m40664z(vBottomBarDefaultItemM40652n, false);
        } else {
            vBottomBarDefaultItemM40652n.mo224613b();
        }
    }

    /* JADX INFO: renamed from: l */
    public final VBottomBarOldItem m40650l(C22709a c22709a) {
        return new VBottomBarOldItem(this.f25166b, c22709a) { // from class: com.p1.mobile.putong.core.newui.main.BottomBarManager.1

            /* JADX INFO: renamed from: n */
            public final /* synthetic */ C22709a f25173n;

            {
                this.f25173n = c22709a;
                setInfo(c22709a);
                m224622j();
                mo224613b();
            }

            @Override // p151v.bottombar.VBottomBarOldItem, p151v.bottombar.VBottomBarDefaultItem
            /* JADX INFO: renamed from: d */
            public void mo40665d(boolean z, boolean z2) {
                if (z) {
                    VBottomBarRippleView vBottomBarRippleView = this.f210464i;
                    if (z2) {
                        vBottomBarRippleView.m224627i();
                    } else {
                        vBottomBarRippleView.m224623d();
                    }
                    this.f210451b.setTextColor(BottomBarManager.this.f25172h != null ? BottomBarManager.this.f25172h.intValue() : getResources().getColor(c9c0.f80342I));
                    this.f210451b.setTypeface(null, 1);
                    return;
                }
                this.f210464i.m224624f();
                boolean z3 = this.f210456g;
                VText vText = this.f210451b;
                if (z3) {
                    vText.setTextColor(getResources().getColor(c9c0.f80354M));
                } else {
                    vText.setTextColor(getResources().getColor(c9c0.f80330E));
                }
                this.f210451b.setTypeface(null, 0);
            }
        };
    }

    /* JADX INFO: renamed from: m */
    public void m40651m(final View view) {
        if (view instanceof TextView) {
            ((TextView) view).setText(CoreModule.f18264c.f20396j0.m31648z4() ? R$string.f18384D5 : R$string.f18415E5);
        }
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        Animator animatorM132166l = gt0.m132166l(view, gt0.f106354i, 1500L, 300L, linearInterpolator, 0.0f, 1.0f);
        gt0.m132176v(animatorM132166l, new Runnable() { // from class: l.jb3
            @Override // java.lang.Runnable
            public final void run() {
                bnl0.m105524M(view, true);
            }
        });
        gt0.m132173s(animatorM132166l, gt0.m132170p(view, BLiveGiftItem.TYPE_ROTATION, 300L, 800L, linearInterpolator, 0.0f, -20.0f, 0.0f, 20.0f, 0.0f, -20.0f, 0.0f, 20.0f, 0.0f, -20.0f, 0.0f)).start();
    }

    /* JADX INFO: renamed from: n */
    public VBottomBarDefaultItem m40652n(final TabName tabName) {
        return (VBottomBarDefaultItem) jyb.m147529r(this.f25167c, new qcj() { // from class: l.ab3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((VBottomBarDefaultItem) obj).getTabName(), tabName.toString()));
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public void m40653o(TabName tabName) {
        VBottomBarDefaultItem vBottomBarDefaultItemM40652n = m40652n(tabName);
        if (NullChecker.m82486a(vBottomBarDefaultItemM40652n)) {
            vBottomBarDefaultItemM40652n.f210454e.setImageDrawable(null);
            vBottomBarDefaultItemM40652n.f210454e.setVisibility(4);
        }
    }

    /* JADX INFO: renamed from: p */
    public int m40654p(final TabName tabName) {
        return jyb.m147476G(this.f25167c, new qcj() { // from class: l.ib3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(tabName.toString(), ((VBottomBarDefaultItem) obj).getTabName()));
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final void m40655q() {
        User userMe_ = CoreModule.m30930K().me_();
        User userRiskAuditUser = userMe_.riskAuditUser(CoreModule.m30930K().getUserById("fake_risk_audit_default_" + userMe_.f56859id));
        String str = (NullChecker.m82486a(userRiskAuditUser) && NullChecker.m82486a(userRiskAuditUser.m61308fp()) && NullChecker.m82486a(userRiskAuditUser.m61308fp().profileSmall())) ? userRiskAuditUser.m61308fp().profileSmall().formatted() : null;
        String string = (gra.m131563F0() || gra.m131672d3() || gra.m131617Q1()) ? this.f25166b.getString(R$string.f18916Uj) : this.f25166b.getString(R$string.f19836yi);
        gra.m131778z();
        C22709a c22709a = new C22709a(TabName.Card.toString());
        c22709a.m224644d(this.f25166b.getString(R$string.f18498Gq));
        c22709a.m224643c(dbc0.f86875c0, dbc0.f86908d0);
        VBottomBarOldItem vBottomBarOldItemM224641a = c22709a.m224641a(this.f25166b, true);
        vBottomBarOldItemM224641a.setGrey(gra.m131645X1());
        this.f25167c.add(vBottomBarOldItemM224641a);
        if ((CoreModule.m30934Q().mo68438a().mo134414f() && uqb0.f180396b0.f170326c.getHomeLiveTabPosition() >= 0) || CoreModule.m30934Q().mo68438a().mo134413e()) {
            String strMo68439a7 = uqb0.f180396b0.f170326c.mo68439a7();
            if (TextUtils.isEmpty(strMo68439a7)) {
                strMo68439a7 = this.f25166b.getString(R$string.f18952Vp);
            }
            C22709a c22709a2 = new C22709a(TabName.Live.toString());
            c22709a2.m224644d(strMo68439a7);
            c22709a2.m224643c(dbc0.f86680W, dbc0.f86712X);
            this.f25167c.add(c22709a2.m224641a(this.f25166b, true));
        }
        C22709a c22709a3 = new C22709a(TabName.Meet.toString());
        c22709a3.m224644d(k3d0.m148007c(R$string.f18756P9));
        int i = dbc0.f87146ka;
        c22709a3.m224643c(i, i);
        VBottomBarOldItem vBottomBarOldItemM40650l = m40650l(c22709a3);
        this.f25170f = vBottomBarOldItemM40650l;
        this.f25167c.add(vBottomBarOldItemM40650l);
        m40648M();
        C22709a c22709a4 = new C22709a(TabName.Msg.toString());
        c22709a4.m224644d(string);
        c22709a4.m224643c(dbc0.f86809a0, dbc0.f86842b0);
        this.f25167c.add(c22709a4.m224641a(this.f25166b, true));
        C22709a c22709a5 = new C22709a(TabName.Me.toString());
        c22709a5.m224644d(this.f25166b.getString(R$string.f18886Tj));
        c22709a5.m224643c(dbc0.f86744Y, dbc0.f86776Z);
        c22709a5.m224642b(str);
        VBottomBarOldItem vBottomBarOldItemM224641a2 = c22709a5.m224641a(this.f25166b, true);
        vBottomBarOldItemM224641a2.m224618f(kec0.f125904jf);
        this.f25167c.add(vBottomBarOldItemM224641a2);
        this.f25165a.m224603e(this.f25167c);
        this.f25165a.m224612n(0, false);
    }

    /* JADX INFO: renamed from: r */
    public boolean m40656r() {
        return m40654p(TabName.Msg) >= this.f25167c.size() / 2;
    }

    /* JADX INFO: renamed from: s */
    public boolean m40657s(TabName tabName, DotType dotType) {
        View view;
        VBottomBarDefaultItem vBottomBarDefaultItemM40652n = m40652n(tabName);
        if (vBottomBarDefaultItemM40652n == null) {
            return false;
        }
        int i = C8240a.f25175a[dotType.ordinal()];
        if (i == 1) {
            view = vBottomBarDefaultItemM40652n.f210453d;
        } else if (i != 2) {
            view = i != 3 ? null : vBottomBarDefaultItemM40652n.f210454e;
        } else {
            view = vBottomBarDefaultItemM40652n.f210452c;
        }
        if (NullChecker.m82486a(view)) {
            return bnl0.m105529O0(view);
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public boolean m40658t(TabName tabName) {
        VBottomBarDefaultItem vBottomBarDefaultItemM40652n = m40652n(tabName);
        if (NullChecker.m82486a(vBottomBarDefaultItemM40652n)) {
            return bnl0.m105529O0(vBottomBarDefaultItemM40652n.f210452c);
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m40659u(List list) {
        m40648M();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m40660v() {
        this.f25170f.mo40665d(true, false);
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m40661w() {
        this.f25170f.mo40665d(true, false);
    }

    /* JADX INFO: renamed from: x */
    public final void m40662x() {
        if (this.f25170f == null) {
            return;
        }
        this.f25171g = CoreModule.f18264c.f20297C0.m146427y3().observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.cb3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f80700a.m40659u((List) obj);
            }
        }, new y20() { // from class: l.db3
            @Override // p153l.y20
            public final void call(Object obj) {
                BottomBarManager.m40628d((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y */
    public void m40663y() {
        this.f25165a.setVisibleCallback(null);
        psd0.m173633z(this.f25171g);
    }

    /* JADX INFO: renamed from: z */
    public final void m40664z(final VBottomBarDefaultItem vBottomBarDefaultItem, boolean z) {
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        Animator animatorM132166l = gt0.m132166l(vBottomBarDefaultItem.getIconView(), gt0.f106354i, 0L, 100L, linearInterpolator, 1.0f, 0.1f);
        Animator animatorM132170p = gt0.m132170p(vBottomBarDefaultItem.getIconView(), "alpha", 0L, 100L, linearInterpolator, 1.0f, 0.1f);
        Animator animatorM132166l2 = gt0.m132166l(vBottomBarDefaultItem.getIconView(), gt0.f106354i, 0L, 300L, linearInterpolator, 0.1f, 1.0f);
        Animator animatorM132170p2 = gt0.m132170p(vBottomBarDefaultItem.getIconView(), BLiveGiftItem.TYPE_ROTATION, 100L, 200L, linearInterpolator, 0.0f, 360.0f);
        Animator animatorM132170p3 = gt0.m132170p(vBottomBarDefaultItem.getIconView(), "alpha", 0L, 300L, linearInterpolator, 0.1f, 1.0f);
        Animator animatorM132180z = gt0.m132180z(animatorM132170p, animatorM132166l);
        gt0.m132176v(animatorM132180z, new Runnable() { // from class: l.eb3
            @Override // java.lang.Runnable
            public final void run() {
                vBottomBarDefaultItem.setClickable(false);
            }
        });
        Animator animatorM132180z2 = z ? gt0.m132180z(animatorM132170p2, animatorM132166l2, animatorM132170p3) : gt0.m132180z(animatorM132166l2, animatorM132170p3);
        gt0.m132176v(animatorM132180z2, new Runnable() { // from class: l.fb3
            @Override // java.lang.Runnable
            public final void run() {
                vBottomBarDefaultItem.mo224613b();
            }
        });
        gt0.m132160f(animatorM132180z2, new Runnable() { // from class: l.gb3
            @Override // java.lang.Runnable
            public final void run() {
                vBottomBarDefaultItem.setClickable(true);
            }
        });
        gt0.m132173s(gt0.m132164j(10), animatorM132180z, animatorM132180z2).start();
    }
}
