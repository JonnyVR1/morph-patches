package com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.folder;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import p147v.VRecyclerView;
import p149l.dac0;
import p149l.pti;

/* JADX INFO: loaded from: classes11.dex */
public class FolderSelectView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VRecyclerView f54030a;

    public FolderSelectView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m79000a(View view) {
        pti.m171323a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m79001b(dac0 dac0Var) {
        m79002c(dac0Var, -1);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: c */
    public void m79002c(dac0 dac0Var, int i) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(1);
        if (i != -1) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f54030a.getLayoutParams();
            layoutParams.height = i;
            this.f54030a.setLayoutParams(layoutParams);
        }
        this.f54030a.setLayoutManager(linearLayoutManager);
        this.f54030a.setAdapter(dac0Var);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79000a(this);
    }

    public FolderSelectView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FolderSelectView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
