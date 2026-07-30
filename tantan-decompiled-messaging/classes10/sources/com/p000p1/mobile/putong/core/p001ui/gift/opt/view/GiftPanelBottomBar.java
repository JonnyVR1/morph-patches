package com.p000p1.mobile.putong.core.p001ui.gift.opt.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.CoreGiftPanelName;
import com.tantanapp.common.utils.NullChecker;
import l.xdl0;
import l.zvf0;
import p003l.atj;
import p003l.ctj;
import v.VFrame;
import v.VPagerCircleIndicator;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class GiftPanelBottomBar extends VFrame {

    /* JADX INFO: renamed from: a */
    public VPagerCircleIndicator f1643a;

    /* JADX INFO: renamed from: b */
    public VText f1644b;

    public GiftPanelBottomBar(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2841s(this);
    }

    /* JADX INFO: renamed from: s */
    public final void m2841s(View view) {
        ctj.m6003a(this, view);
    }

    public final void setIndicatorVisibility(boolean z) {
        xdl0.M0(this.f1643a, z);
    }

    /* JADX INFO: renamed from: u */
    public final void m2842u(final Act act, ViewPager viewPager, @NonNull final atj atjVar) {
        this.f1643a.setViewPager(viewPager);
        atjVar.m5631G();
        CoreGiftPanelName.get("note");
        xdl0.E0(this.f1644b, new View.OnClickListener() { // from class: l.btj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3471a.m2843v(atjVar, act, view);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m2843v(atj atjVar, Act act, View view) {
        zvf0.r("e_chat_gift_bar_recharge", atjVar.m5635L());
        m2844w(act, "p_chat,gift_recharge");
    }

    /* JADX INFO: renamed from: w */
    public final void m2844w(Act act, String str) {
        if (NullChecker.b(act)) {
            CoreModule.P().i().n4(act, str);
        }
    }

    public GiftPanelBottomBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GiftPanelBottomBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
