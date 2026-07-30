package com.p051p1.mobile.putong.core.p058ui.gift.opt.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.CoreGiftPanelName;
import com.tantanapp.common.utils.NullChecker;
import p151v.VFrame;
import p151v.VPagerCircleIndicator;
import p151v.VText;
import p153l.bnl0;
import p153l.i4g0;
import p153l.qvj;
import p153l.svj;

/* JADX INFO: loaded from: classes3.dex */
public class GiftPanelBottomBar extends VFrame {

    /* JADX INFO: renamed from: a */
    public VPagerCircleIndicator f30097a;

    /* JADX INFO: renamed from: b */
    public VText f30098b;

    public GiftPanelBottomBar(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46688s(this);
    }

    /* JADX INFO: renamed from: s */
    public final void m46688s(View view) {
        svj.m188209a(this, view);
    }

    public final void setIndicatorVisibility(boolean z) {
        bnl0.m105525M0(this.f30097a, z);
    }

    /* JADX INFO: renamed from: u */
    public final void m46689u(final Act act, ViewPager viewPager, @NonNull final qvj qvjVar) {
        this.f30097a.setViewPager(viewPager);
        qvjVar.m178294G();
        CoreGiftPanelName.get("note");
        bnl0.m105509E0(this.f30098b, new View.OnClickListener() { // from class: l.rvj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165019a.m46690v(qvjVar, act, view);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m46690v(qvj qvjVar, Act act, View view) {
        i4g0.m138520r("e_chat_gift_bar_recharge", qvjVar.m178298L());
        m46691w(act, "p_chat,gift_recharge");
    }

    /* JADX INFO: renamed from: w */
    public final void m46691w(Act act, String str) {
        if (NullChecker.m82487b(act)) {
            CoreModule.m30933P().m143412i().mo180508n4(act, str);
        }
    }

    public GiftPanelBottomBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GiftPanelBottomBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
