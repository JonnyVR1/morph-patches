package com.p000p1.mobile.putong.core.p001ui.gift.panel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.data.CoreGiftInfo;
import com.p000p1.mobile.putong.core.data.GiftSubBizType;
import com.p000p1.mobile.putong.core.p001ui.gift.HorRecyclerViewIndicator;
import com.p1.mobile.putong.core.businessdata.NewGiftInfoPanelWrapper;
import com.p1.mobile.putong.data.CoreGiftPanelName;
import java.util.ArrayList;
import l.vwb;
import l.w9j;
import p003l.kr20;
import p003l.rr20;
import p003l.vr20;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class NewGiftPanelPagerView extends VLinear {

    /* JADX INFO: renamed from: c */
    public RecyclerView f1679c;

    /* JADX INFO: renamed from: d */
    public HorRecyclerViewIndicator f1680d;

    /* JADX INFO: renamed from: e */
    public vr20 f1681e;

    /* JADX INFO: renamed from: f */
    public rr20 f1682f;

    public NewGiftPanelPagerView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: Q */
    public final void m2881Q(View view) {
        kr20.m7634a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R */
    public void m2882R(rr20 rr20Var) {
        this.f1682f = rr20Var;
        this.f1681e = new vr20(rr20Var);
        this.f1679c.setNestedScrollingEnabled(false);
        this.f1679c.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.f1679c.setLayoutManager(linearLayoutManager);
        linearLayoutManager.setRecycleChildrenOnDetach(false);
        this.f1679c.setAdapter(this.f1681e);
    }

    /* JADX INFO: renamed from: S */
    public final boolean m2883S(CoreGiftPanelName coreGiftPanelName) {
        return coreGiftPanelName == CoreGiftPanelName.get("note") || coreGiftPanelName == CoreGiftPanelName.get(GiftSubBizType.greet);
    }

    /* JADX INFO: renamed from: T */
    public void m2884T(NewGiftInfoPanelWrapper newGiftInfoPanelWrapper, int i) {
        int iG;
        ArrayList arrayList = newGiftInfoPanelWrapper.giftInfos;
        this.f1681e.m10269M(arrayList, i);
        this.f1680d.m2745b(this.f1679c);
        if (!m2883S(this.f1682f.m9175v().m6496G()) || (iG = vwb.G(arrayList, new w9j() { // from class: l.jr20
            public final Object call(Object obj) {
                return Boolean.valueOf(((CoreGiftInfo) obj).quota > 0);
            }
        })) <= 1) {
            return;
        }
        this.f1679c.scrollToPosition(iG);
    }

    public vr20 getAdapter() {
        return this.f1681e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2881Q(this);
    }

    public NewGiftPanelPagerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewGiftPanelPagerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
