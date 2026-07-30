package com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.folder;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import l.dac0;
import l.pti;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class FolderSelectView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VRecyclerView f7636a;

    public FolderSelectView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m9308a(View view) {
        pti.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m9309b(dac0 dac0Var) {
        m9310c(dac0Var, -1);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: c */
    public void m9310c(dac0 dac0Var, int i) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(1);
        if (i != -1) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f7636a.getLayoutParams();
            layoutParams.height = i;
            this.f7636a.setLayoutParams(layoutParams);
        }
        this.f7636a.setLayoutManager(linearLayoutManager);
        this.f7636a.setAdapter(dac0Var);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m9308a(this);
    }

    public FolderSelectView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FolderSelectView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
