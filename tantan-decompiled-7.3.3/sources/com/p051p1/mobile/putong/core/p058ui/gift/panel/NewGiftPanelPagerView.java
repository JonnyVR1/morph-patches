package com.p051p1.mobile.putong.core.p058ui.gift.panel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.businessdata.NewGiftInfoPanelWrapper;
import com.p051p1.mobile.putong.core.data.CoreGiftInfo;
import com.p051p1.mobile.putong.core.p058ui.gift.HorRecyclerViewIndicator;
import com.p051p1.mobile.putong.data.CoreGiftPanelName;
import java.util.ArrayList;
import p151v.VLinear;
import p153l.b030;
import p153l.f030;
import p153l.jyb;
import p153l.qcj;
import p153l.uz20;

/* JADX INFO: loaded from: classes3.dex */
public class NewGiftPanelPagerView extends VLinear {

    /* JADX INFO: renamed from: c */
    public RecyclerView f30133c;

    /* JADX INFO: renamed from: d */
    public HorRecyclerViewIndicator f30134d;

    /* JADX INFO: renamed from: e */
    public f030 f30135e;

    /* JADX INFO: renamed from: f */
    public b030 f30136f;

    public NewGiftPanelPagerView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: Q */
    public final void m46728Q(View view) {
        uz20.m198718a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public void m46729R(b030 b030Var) {
        this.f30136f = b030Var;
        this.f30135e = new f030(b030Var);
        this.f30133c.setNestedScrollingEnabled(false);
        this.f30133c.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.f30133c.setLayoutManager(linearLayoutManager);
        linearLayoutManager.setRecycleChildrenOnDetach(false);
        this.f30133c.setAdapter(this.f30135e);
    }

    /* JADX INFO: renamed from: S */
    public final boolean m46730S(CoreGiftPanelName coreGiftPanelName) {
        return coreGiftPanelName == CoreGiftPanelName.get("note") || coreGiftPanelName == CoreGiftPanelName.get("greet");
    }

    /* JADX INFO: renamed from: T */
    public void m46731T(NewGiftInfoPanelWrapper newGiftInfoPanelWrapper, int i) {
        int iM147476G;
        ArrayList<CoreGiftInfo> arrayList = newGiftInfoPanelWrapper.giftInfos;
        this.f30135e.m123444M(arrayList, i);
        this.f30134d.m46601b(this.f30133c);
        if (!m46730S(this.f30136f.m101257v().m174331G()) || (iM147476G = jyb.m147476G(arrayList, new qcj() { // from class: l.tz20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((CoreGiftInfo) obj).quota > 0);
            }
        })) <= 1) {
            return;
        }
        this.f30133c.scrollToPosition(iM147476G);
    }

    public f030 getAdapter() {
        return this.f30135e;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46728Q(this);
    }

    public NewGiftPanelPagerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewGiftPanelPagerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
