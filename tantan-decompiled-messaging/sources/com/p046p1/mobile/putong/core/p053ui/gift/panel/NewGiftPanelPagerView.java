package com.p046p1.mobile.putong.core.p053ui.gift.panel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.businessdata.NewGiftInfoPanelWrapper;
import com.p046p1.mobile.putong.core.data.CoreGiftInfo;
import com.p046p1.mobile.putong.core.p053ui.gift.HorRecyclerViewIndicator;
import com.p046p1.mobile.putong.data.CoreGiftPanelName;
import java.util.ArrayList;
import p147v.VLinear;
import p149l.kr20;
import p149l.rr20;
import p149l.vr20;
import p149l.vwb;
import p149l.w9j;

/* JADX INFO: loaded from: classes10.dex */
public class NewGiftPanelPagerView extends VLinear {

    /* JADX INFO: renamed from: c */
    public RecyclerView f29285c;

    /* JADX INFO: renamed from: d */
    public HorRecyclerViewIndicator f29286d;

    /* JADX INFO: renamed from: e */
    public vr20 f29287e;

    /* JADX INFO: renamed from: f */
    public rr20 f29288f;

    public NewGiftPanelPagerView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: Q */
    public final void m45545Q(View view) {
        kr20.m146965a(this, view);
    }

    /* JADX INFO: renamed from: R */
    public void m45546R(rr20 rr20Var) {
        this.f29288f = rr20Var;
        this.f29287e = new vr20(rr20Var);
        this.f29285c.setNestedScrollingEnabled(false);
        this.f29285c.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(0);
        this.f29285c.setLayoutManager(linearLayoutManager);
        linearLayoutManager.setRecycleChildrenOnDetach(false);
        this.f29285c.setAdapter(this.f29287e);
    }

    /* JADX INFO: renamed from: S */
    public final boolean m45547S(CoreGiftPanelName coreGiftPanelName) {
        return coreGiftPanelName == CoreGiftPanelName.get("note") || coreGiftPanelName == CoreGiftPanelName.get("greet");
    }

    /* JADX INFO: renamed from: T */
    public void m45548T(NewGiftInfoPanelWrapper newGiftInfoPanelWrapper, int i) {
        int iM200293G;
        ArrayList<CoreGiftInfo> arrayList = newGiftInfoPanelWrapper.giftInfos;
        this.f29287e.m199617M(arrayList, i);
        this.f29286d.m45418b(this.f29285c);
        if (!m45547S(this.f29288f.m180538v().m122795G()) || (iM200293G = vwb.m200293G(arrayList, new w9j() { // from class: l.jr20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((CoreGiftInfo) obj).quota > 0);
            }
        })) <= 1) {
            return;
        }
        this.f29285c.scrollToPosition(iM200293G);
    }

    public vr20 getAdapter() {
        return this.f29287e;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45545Q(this);
    }

    public NewGiftPanelPagerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NewGiftPanelPagerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
