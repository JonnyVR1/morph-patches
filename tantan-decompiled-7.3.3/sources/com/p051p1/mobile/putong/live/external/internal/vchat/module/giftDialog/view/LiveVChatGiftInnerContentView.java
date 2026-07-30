package com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import p151v.VRecyclerView;
import p153l.etj;
import p153l.jmu;
import p153l.m0k;
import p153l.utj;
import p153l.vlu;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVChatGiftInnerContentView extends VRecyclerView {

    /* JADX INFO: renamed from: c */
    public LiveVChatGiftInnerContentView f46024c;

    /* JADX INFO: renamed from: d */
    public utj f46025d;

    public LiveVChatGiftInnerContentView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: r */
    private void m70595r() {
        this.f46024c.setNestedScrollingEnabled(false);
        this.f46024c.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 4);
        this.f46024c.setLayoutManager(gridLayoutManager);
        gridLayoutManager.setRecycleChildrenOnDetach(false);
    }

    /* JADX INFO: renamed from: G */
    public final void m70596G(View view) {
        jmu.m146169a(this, view);
    }

    /* JADX INFO: renamed from: H */
    public void m70597H() {
        m0k.m156517f(this);
    }

    /* JADX INFO: renamed from: I */
    public void m70598I(etj etjVar, vlu<?> vluVar) {
        utj utjVar = this.f46025d;
        if (utjVar != null) {
            utjVar.m198065G(etjVar.f95758a);
            return;
        }
        utj utjVar2 = new utj(vluVar, etjVar.f95758a);
        this.f46025d = utjVar2;
        this.f46024c.setAdapter(utjVar2);
    }

    public VRecyclerView getRecyclerView() {
        return this.f46024c;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70596G(this);
        m70595r();
    }

    public LiveVChatGiftInnerContentView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
