package com.p046p1.mobile.putong.core.p053ui.gift.opt.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.p053ui.gift.opt.view.GiftPanelTopBar;
import com.tantanapp.common.utils.NullChecker;
import p147v.VFrame;
import p147v.VIcon;
import p147v.VLinear;
import p147v.VMarqueeText;
import p147v.VPager;
import p149l.a1c0;
import p149l.c3c0;
import p149l.dtj;
import p149l.e30;
import p149l.e51;
import p149l.ltj;
import p149l.mji0;
import p149l.stj;
import p149l.x7c0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes10.dex */
public class GiftPanelTopBar extends VFrame {

    /* JADX INFO: renamed from: a */
    public TabLayout f29251a;

    /* JADX INFO: renamed from: b */
    public VMarqueeText f29252b;

    /* JADX INFO: renamed from: c */
    public VLinear f29253c;

    /* JADX INFO: renamed from: d */
    public VIcon f29254d;

    /* JADX INFO: renamed from: e */
    public SvipVerticalTextView f29255e;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.gift.opt.view.GiftPanelTopBar$a */
    public class C8342a implements TabLayout.OnTabSelectedListener {

        /* JADX INFO: renamed from: a */
        public boolean f29256a = false;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ e30 f29257b;

        public C8342a(e30 e30Var) {
            this.f29257b = e30Var;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            GiftPanelTopBar.this.m45509K(tab);
            TextView textView = (TextView) tab.getCustomView();
            if (NullChecker.m81303a(textView)) {
                mji0.m154821o(textView, x7c0.f191346o);
            }
            if (this.f29256a) {
                this.f29257b.call(Integer.valueOf(GiftPanelTopBar.this.f29251a.getSelectedTabPosition()));
            }
            this.f29256a = true;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            GiftPanelTopBar.this.m45509K(tab);
            TextView textView = (TextView) tab.getCustomView();
            if (NullChecker.m81303a(textView)) {
                mji0.m154821o(textView, x7c0.f191347p);
            }
        }
    }

    public GiftPanelTopBar(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public void m45509K(TabLayout.Tab tab) {
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
    public static /* synthetic */ void m45510p(String str, ltj ltjVar, View view) {
        zvf0.m220396r("e_chat_gift_bar_svip_entrance", str);
        CoreModule.f17554l.m94658i().mo33565pr(ltjVar.m96966b(), "p_chat,gift_svipguide", Privilege.greet);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m45513v(String str, final ltj ltjVar, View view) {
        zvf0.m220396r("e_chat_gift_bar_diamond", str);
        CoreModule.m29935P().m94658i().mo33618wh(ltjVar.m96966b(), "p_chat,gift_odiamond", new e30() { // from class: l.rtj
            @Override // p149l.e30
            public final void call(Object obj) {
                ltjVar.m151705t().dismiss();
            }
        }, null, null, Privilege.oDiamondGreetings);
    }

    /* JADX INFO: renamed from: B */
    public final void m45516B(View view) {
        stj.m185958a(this, view);
    }

    /* JADX INFO: renamed from: C */
    public void m45517C(VPager vPager, e30<Integer> e30Var) {
        setTabsVisibility(true);
        this.f29251a.setTabMode(0);
        this.f29251a.setTabIndicatorFullWidth(false);
        this.f29251a.setTabRippleColorResource(a1c0.f67143Y);
        this.f29251a.setTabGravity(0);
        this.f29251a.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C8342a(e30Var));
        this.f29251a.setupWithViewPager(vPager);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m45518E() {
        this.f29255e.setTextColorList(dtj.m113572b());
        this.f29255e.setTextList(dtj.m113573c());
        this.f29255e.setAnimTime(1000L);
        this.f29255e.m45531i();
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m45519F() {
        this.f29255e.setTextList(dtj.m113574d());
        this.f29255e.setAnimTime(1000L);
        this.f29255e.m45531i();
    }

    /* JADX INFO: renamed from: G */
    public void m45520G(final ltj ltjVar) {
        if (CoreModule.m29935P().m94658i().mo158371f() && ltjVar.m151700m()) {
            this.f29253c.setBackgroundResource(c3c0.f78747g0);
            this.f29254d.setImageResource(c3c0.f78756h0);
            final String strM98810L = ltjVar.m151705t().m98810L();
            zvf0.m220402x("e_chat_gift_bar_diamond", strM98810L);
            xdl0.m208344M(this.f29253c, true);
            xdl0.m208329E0(this.f29253c, new View.OnClickListener() { // from class: l.ntj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GiftPanelTopBar.m45513v(strM98810L, ltjVar, view);
                }
            });
            e51.m114742G(new Runnable() { // from class: l.otj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f145594a.m45518E();
                }
            });
            return;
        }
        if (CoreModule.m29935P().m94656g().mo35011Fs()) {
            xdl0.m208344M(this.f29253c, false);
            return;
        }
        final String strM98810L2 = ltjVar.m151705t().m98810L();
        zvf0.m220402x("e_chat_gift_bar_svip_entrance", strM98810L2);
        xdl0.m208344M(this.f29253c, true);
        xdl0.m208329E0(this.f29253c, new View.OnClickListener() { // from class: l.ptj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GiftPanelTopBar.m45510p(strM98810L2, ltjVar, view);
            }
        });
        e51.m114742G(new Runnable() { // from class: l.qtj
            @Override // java.lang.Runnable
            public final void run() {
                this.f156368a.m45519F();
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45516B(this);
        this.f29252b.setText("送个小礼物表达诚意吧");
    }

    public void setTabsVisibility(boolean z) {
        xdl0.m208344M(this.f29252b, !z);
        xdl0.m208344M(this.f29251a, z);
    }

    public void setTips(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        setTabsVisibility(false);
        this.f29252b.setText(str);
    }

    public GiftPanelTopBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GiftPanelTopBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
