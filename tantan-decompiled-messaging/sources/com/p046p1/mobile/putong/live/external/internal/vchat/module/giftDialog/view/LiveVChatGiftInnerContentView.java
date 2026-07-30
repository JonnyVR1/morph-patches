package com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import p147v.VRecyclerView;
import p149l.erj;
import p149l.iku;
import p149l.oqj;
import p149l.uju;
import p149l.wxj;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVChatGiftInnerContentView extends VRecyclerView {

    /* JADX INFO: renamed from: c */
    public LiveVChatGiftInnerContentView f45176c;

    /* JADX INFO: renamed from: d */
    public erj f45177d;

    public LiveVChatGiftInnerContentView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: r */
    private void m69412r() {
        this.f45176c.setNestedScrollingEnabled(false);
        this.f45176c.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 4);
        this.f45176c.setLayoutManager(gridLayoutManager);
        gridLayoutManager.setRecycleChildrenOnDetach(false);
    }

    /* JADX INFO: renamed from: G */
    public final void m69413G(View view) {
        iku.m136897a(this, view);
    }

    /* JADX INFO: renamed from: H */
    public void m69414H() {
        wxj.m206016f(this);
    }

    /* JADX INFO: renamed from: I */
    public void m69415I(oqj oqjVar, uju<?> ujuVar) {
        erj erjVar = this.f45177d;
        if (erjVar != null) {
            erjVar.m117846G(oqjVar.f145162a);
            return;
        }
        erj erjVar2 = new erj(ujuVar, oqjVar.f145162a);
        this.f45177d = erjVar2;
        this.f45176c.setAdapter(erjVar2);
    }

    public VRecyclerView getRecyclerView() {
        return this.f45176c;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69413G(this);
        m69412r();
    }

    public LiveVChatGiftInnerContentView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
