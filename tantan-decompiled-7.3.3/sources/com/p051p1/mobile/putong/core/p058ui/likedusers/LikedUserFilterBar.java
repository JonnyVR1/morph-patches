package com.p051p1.mobile.putong.core.p058ui.likedusers;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import p151v.VCheckBox;
import p151v.VRecyclerView;
import p153l.bhr;
import p153l.f9c0;

/* JADX INFO: loaded from: classes3.dex */
public class LikedUserFilterBar extends LinearLayout {

    /* JADX INFO: renamed from: k */
    public static int f30802k = Color.parseColor("#d74d37");

    /* JADX INFO: renamed from: l */
    public static final int f30803l = Color.parseColor("#CC000000");

    /* JADX INFO: renamed from: a */
    public LinearLayout f30804a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f30805b;

    /* JADX INFO: renamed from: c */
    public VCheckBox f30806c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f30807d;

    /* JADX INFO: renamed from: e */
    public VCheckBox f30808e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f30809f;

    /* JADX INFO: renamed from: g */
    public VCheckBox f30810g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f30811h;

    /* JADX INFO: renamed from: i */
    public VCheckBox f30812i;

    /* JADX INFO: renamed from: j */
    public VRecyclerView f30813j;

    public LikedUserFilterBar(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m47958a(View view) {
        bhr.m104366a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47958a(this);
        f30802k = getContext().getResources().getColor(f9c0.f97859d);
    }

    public LikedUserFilterBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LikedUserFilterBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
