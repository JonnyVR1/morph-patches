package com.p046p1.mobile.putong.core.p053ui.gift.opt.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.CoreGiftPanelName;
import com.tantanapp.common.utils.NullChecker;
import p147v.VFrame;
import p147v.VPagerCircleIndicator;
import p147v.VText;
import p149l.atj;
import p149l.ctj;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes10.dex */
public class GiftPanelBottomBar extends VFrame {

    /* JADX INFO: renamed from: a */
    public VPagerCircleIndicator f29249a;

    /* JADX INFO: renamed from: b */
    public VText f29250b;

    public GiftPanelBottomBar(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45505s(this);
    }

    /* JADX INFO: renamed from: s */
    public final void m45505s(View view) {
        ctj.m108690a(this, view);
    }

    public final void setIndicatorVisibility(boolean z) {
        xdl0.m208345M0(this.f29249a, z);
    }

    /* JADX INFO: renamed from: u */
    public final void m45506u(final Act act, ViewPager viewPager, @NonNull final atj atjVar) {
        this.f29249a.setViewPager(viewPager);
        atjVar.m98806G();
        CoreGiftPanelName.get("note");
        xdl0.m208329E0(this.f29250b, new View.OnClickListener() { // from class: l.btj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f77231a.m45507v(atjVar, act, view);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m45507v(atj atjVar, Act act, View view) {
        zvf0.m220396r("e_chat_gift_bar_recharge", atjVar.m98810L());
        m45508w(act, "p_chat,gift_recharge");
    }

    /* JADX INFO: renamed from: w */
    public final void m45508w(Act act, String str) {
        if (NullChecker.m81304b(act)) {
            CoreModule.m29935P().m94658i().mo158416n4(act, str);
        }
    }

    public GiftPanelBottomBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GiftPanelBottomBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
