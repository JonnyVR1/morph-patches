package com.p051p1.mobile.putong.core.p058ui.gift.opt.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.p058ui.gift.opt.view.GiftPanelTopBar;
import com.tantanapp.common.utils.NullChecker;
import p151v.VFrame;
import p151v.VIcon;
import p151v.VLinear;
import p151v.VMarqueeText;
import p151v.VPager;
import p153l.bnl0;
import p153l.bwj;
import p153l.cgc0;
import p153l.g9c0;
import p153l.i4g0;
import p153l.ibc0;
import p153l.iwj;
import p153l.l51;
import p153l.msi0;
import p153l.tvj;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class GiftPanelTopBar extends VFrame {

    /* JADX INFO: renamed from: a */
    public TabLayout f30099a;

    /* JADX INFO: renamed from: b */
    public VMarqueeText f30100b;

    /* JADX INFO: renamed from: c */
    public VLinear f30101c;

    /* JADX INFO: renamed from: d */
    public VIcon f30102d;

    /* JADX INFO: renamed from: e */
    public SvipVerticalTextView f30103e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.gift.opt.view.GiftPanelTopBar$a */
    public class C8505a implements TabLayout.OnTabSelectedListener {

        /* JADX INFO: renamed from: a */
        public boolean f30104a = false;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ y20 f30105b;

        public C8505a(y20 y20Var) {
            this.f30105b = y20Var;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            GiftPanelTopBar.this.m46692K(tab);
            TextView textView = (TextView) tab.getCustomView();
            if (NullChecker.m82486a(textView)) {
                msi0.m159817o(textView, cgc0.f81659o);
            }
            if (this.f30104a) {
                this.f30105b.call(Integer.valueOf(GiftPanelTopBar.this.f30099a.getSelectedTabPosition()));
            }
            this.f30104a = true;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            GiftPanelTopBar.this.m46692K(tab);
            TextView textView = (TextView) tab.getCustomView();
            if (NullChecker.m82486a(textView)) {
                msi0.m159817o(textView, cgc0.f81660p);
            }
        }
    }

    public GiftPanelTopBar(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public void m46692K(TabLayout.Tab tab) {
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
    public static /* synthetic */ void m46693p(String str, bwj bwjVar, View view) {
        i4g0.m138520r("e_chat_gift_bar_svip_entrance", str);
        CoreModule.f18273l.m143412i().mo34568pr(bwjVar.m140179b(), "p_chat,gift_svipguide", Privilege.greet);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m46696v(String str, final bwj bwjVar, View view) {
        i4g0.m138520r("e_chat_gift_bar_diamond", str);
        CoreModule.m30933P().m143412i().mo34621wh(bwjVar.m140179b(), "p_chat,gift_odiamond", new y20() { // from class: l.hwj
            @Override // p153l.y20
            public final void call(Object obj) {
                bwjVar.m106714t().dismiss();
            }
        }, null, null, Privilege.oDiamondGreetings);
    }

    /* JADX INFO: renamed from: B */
    public final void m46699B(View view) {
        iwj.m142384a(this, view);
    }

    /* JADX INFO: renamed from: C */
    public void m46700C(VPager vPager, y20<Integer> y20Var) {
        setTabsVisibility(true);
        this.f30099a.setTabMode(0);
        this.f30099a.setTabIndicatorFullWidth(false);
        this.f30099a.setTabRippleColorResource(g9c0.f102807Y);
        this.f30099a.setTabGravity(0);
        this.f30099a.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C8505a(y20Var));
        this.f30099a.setupWithViewPager(vPager);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m46701E() {
        this.f30103e.setTextColorList(tvj.m192806b());
        this.f30103e.setTextList(tvj.m192807c());
        this.f30103e.setAnimTime(1000L);
        this.f30103e.m46714i();
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m46702F() {
        this.f30103e.setTextList(tvj.m192808d());
        this.f30103e.setAnimTime(1000L);
        this.f30103e.m46714i();
    }

    /* JADX INFO: renamed from: G */
    public void m46703G(final bwj bwjVar) {
        if (CoreModule.m30933P().m143412i().mo180463f() && bwjVar.m106709m()) {
            this.f30101c.setBackgroundResource(ibc0.f114022g0);
            this.f30102d.setImageResource(ibc0.f114031h0);
            final String strM178298L = bwjVar.m106714t().m178298L();
            i4g0.m138526x("e_chat_gift_bar_diamond", strM178298L);
            bnl0.m105524M(this.f30101c, true);
            bnl0.m105509E0(this.f30101c, new View.OnClickListener() { // from class: l.dwj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GiftPanelTopBar.m46696v(strM178298L, bwjVar, view);
                }
            });
            l51.m152887G(new Runnable() { // from class: l.ewj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f96165a.m46701E();
                }
            });
            return;
        }
        if (CoreModule.m30933P().m143410g().mo36014Fs()) {
            bnl0.m105524M(this.f30101c, false);
            return;
        }
        final String strM178298L2 = bwjVar.m106714t().m178298L();
        i4g0.m138526x("e_chat_gift_bar_svip_entrance", strM178298L2);
        bnl0.m105524M(this.f30101c, true);
        bnl0.m105509E0(this.f30101c, new View.OnClickListener() { // from class: l.fwj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GiftPanelTopBar.m46693p(strM178298L2, bwjVar, view);
            }
        });
        l51.m152887G(new Runnable() { // from class: l.gwj
            @Override // java.lang.Runnable
            public final void run() {
                this.f106838a.m46702F();
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46699B(this);
        this.f30100b.setText("送个小礼物表达诚意吧");
    }

    public void setTabsVisibility(boolean z) {
        bnl0.m105524M(this.f30100b, !z);
        bnl0.m105524M(this.f30099a, z);
    }

    public void setTips(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        setTabsVisibility(false);
        this.f30100b.setText(str);
    }

    public GiftPanelTopBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GiftPanelTopBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
