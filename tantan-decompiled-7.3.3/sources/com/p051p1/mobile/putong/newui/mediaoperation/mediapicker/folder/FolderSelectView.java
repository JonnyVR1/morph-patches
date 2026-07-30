package com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.folder;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import p151v.VRecyclerView;
import p153l.jic0;
import p153l.lwi;

/* JADX INFO: loaded from: classes10.dex */
public class FolderSelectView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VRecyclerView f54878a;

    public FolderSelectView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m80183a(View view) {
        lwi.m156052a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m80184b(jic0 jic0Var) {
        m80185c(jic0Var, -1);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: c */
    public void m80185c(jic0 jic0Var, int i) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(1);
        if (i != -1) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f54878a.getLayoutParams();
            layoutParams.height = i;
            this.f54878a.setLayoutParams(layoutParams);
        }
        this.f54878a.setLayoutManager(linearLayoutManager);
        this.f54878a.setAdapter(jic0Var);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m80183a(this);
    }

    public FolderSelectView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FolderSelectView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
