package com.p000p1.mobile.putong.core.p001ui.gift.opt.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.p000p1.mobile.putong.core.data.Privilege;
import com.p000p1.mobile.putong.core.p001ui.gift.opt.view.GiftPanelTopBar;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.e30;
import l.e51;
import l.mji0;
import l.xdl0;
import l.zvf0;
import p003l.a1c0;
import p003l.c3c0;
import p003l.dtj;
import p003l.ltj;
import p003l.stj;
import p003l.x7c0;
import v.VFrame;
import v.VIcon;
import v.VLinear;
import v.VMarqueeText;
import v.VPager;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class GiftPanelTopBar extends VFrame {

    /* JADX INFO: renamed from: a */
    public TabLayout f1645a;

    /* JADX INFO: renamed from: b */
    public VMarqueeText f1646b;

    /* JADX INFO: renamed from: c */
    public VLinear f1647c;

    /* JADX INFO: renamed from: d */
    public VIcon f1648d;

    /* JADX INFO: renamed from: e */
    public SvipVerticalTextView f1649e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.gift.opt.view.GiftPanelTopBar$a */
    public class C3117a implements TabLayout.OnTabSelectedListener {

        /* JADX INFO: renamed from: a */
        public boolean f1650a = false;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ e30 f1651b;

        public C3117a(e30 e30Var) {
            this.f1651b = e30Var;
        }

        public void onTabReselected(TabLayout.Tab tab) {
        }

        public void onTabSelected(TabLayout.Tab tab) {
            GiftPanelTopBar.this.m2845K(tab);
            TextView textView = (TextView) tab.getCustomView();
            if (NullChecker.a(textView)) {
                mji0.o(textView, x7c0.f8388o);
            }
            if (this.f1650a) {
                this.f1651b.call(Integer.valueOf(GiftPanelTopBar.this.f1645a.getSelectedTabPosition()));
            }
            this.f1650a = true;
        }

        public void onTabUnselected(TabLayout.Tab tab) {
            GiftPanelTopBar.this.m2845K(tab);
            TextView textView = (TextView) tab.getCustomView();
            if (NullChecker.a(textView)) {
                mji0.o(textView, x7c0.f8389p);
            }
        }
    }

    public GiftPanelTopBar(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K */
    public void m2845K(TabLayout.Tab tab) {
        if (tab.getCustomView() instanceof TextView) {
            return;
        }
        TextView textView = new TextView(getContext());
        textView.setText(tab.getText());
        textView.getPaint().setFakeBoldText(false);
        textView.setGravity(17);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        tab.setCustomView(textView);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m2846p(String str, ltj ltjVar, View view) {
        zvf0.r("e_chat_gift_bar_svip_entrance", str);
        CoreModule.l.i().pr(ltjVar.b(), "p_chat,gift_svipguide", Privilege.greet);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m2849v(String str, final ltj ltjVar, View view) {
        zvf0.r("e_chat_gift_bar_diamond", str);
        CoreModule.P().i().wh(ltjVar.b(), "p_chat,gift_odiamond", new e30() { // from class: l.rtj
            public final void call(Object obj) {
                ltjVar.m7914t().dismiss();
            }
        }, (d30) null, (d30) null, Privilege.oDiamondGreetings);
    }

    /* JADX INFO: renamed from: B */
    public final void m2852B(View view) {
        stj.m9489a(this, view);
    }

    /* JADX INFO: renamed from: C */
    public void m2853C(VPager vPager, e30<Integer> e30Var) {
        setTabsVisibility(true);
        this.f1645a.setTabMode(0);
        this.f1645a.setTabIndicatorFullWidth(false);
        this.f1645a.setTabRippleColorResource(a1c0.f2689Y);
        this.f1645a.setTabGravity(0);
        this.f1645a.addOnTabSelectedListener(new C3117a(e30Var));
        this.f1645a.setupWithViewPager(vPager);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m2854E() {
        this.f1649e.setTextColorList(dtj.m6205b());
        this.f1649e.setTextList(dtj.m6206c());
        this.f1649e.setAnimTime(1000L);
        this.f1649e.m2867i();
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m2855F() {
        this.f1649e.setTextList(dtj.m6207d());
        this.f1649e.setAnimTime(1000L);
        this.f1649e.m2867i();
    }

    /* JADX INFO: renamed from: G */
    public void m2856G(final ltj ltjVar) {
        if (CoreModule.P().i().f() && ltjVar.m7909m()) {
            this.f1647c.setBackgroundResource(c3c0.f3784g0);
            this.f1648d.setImageResource(c3c0.f3793h0);
            final String strM5635L = ltjVar.m7914t().m5635L();
            zvf0.x("e_chat_gift_bar_diamond", strM5635L);
            xdl0.M(this.f1647c, true);
            xdl0.E0(this.f1647c, new View.OnClickListener() { // from class: l.ntj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GiftPanelTopBar.m2849v(strM5635L, ltjVar, view);
                }
            });
            e51.G(new Runnable() { // from class: l.otj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6749a.m2854E();
                }
            });
            return;
        }
        if (CoreModule.P().g().Fs()) {
            xdl0.M(this.f1647c, false);
            return;
        }
        final String strM5635L2 = ltjVar.m7914t().m5635L();
        zvf0.x("e_chat_gift_bar_svip_entrance", strM5635L2);
        xdl0.M(this.f1647c, true);
        xdl0.E0(this.f1647c, new View.OnClickListener() { // from class: l.ptj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GiftPanelTopBar.m2846p(strM5635L2, ltjVar, view);
            }
        });
        e51.G(new Runnable() { // from class: l.qtj
            @Override // java.lang.Runnable
            public final void run() {
                this.f7093a.m2855F();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2852B(this);
        this.f1646b.setText("送个小礼物表达诚意吧");
    }

    public void setTabsVisibility(boolean z) {
        xdl0.M(this.f1646b, !z);
        xdl0.M(this.f1645a, z);
    }

    public void setTips(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        setTabsVisibility(false);
        this.f1646b.setText(str);
    }

    public GiftPanelTopBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GiftPanelTopBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
