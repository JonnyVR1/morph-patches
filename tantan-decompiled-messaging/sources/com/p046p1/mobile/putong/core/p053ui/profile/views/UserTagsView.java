package com.p046p1.mobile.putong.core.p053ui.profile.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import p147v.VImage;
import p147v.VText;
import p149l.asm;
import p149l.cak0;
import p149l.f6c0;

/* JADX INFO: loaded from: classes4.dex */
public class UserTagsView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f34247a;

    /* JADX INFO: renamed from: b */
    public View f34248b;

    /* JADX INFO: renamed from: c */
    public VText f34249c;

    /* JADX INFO: renamed from: d */
    public ImageView f34250d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f34251e;

    /* JADX INFO: renamed from: f */
    public View f34252f;

    /* JADX INFO: renamed from: g */
    public VText f34253g;

    /* JADX INFO: renamed from: h */
    public ImageView f34254h;

    /* JADX INFO: renamed from: i */
    public VText f34255i;

    /* JADX INFO: renamed from: j */
    public VImage f34256j;

    /* JADX INFO: renamed from: k */
    public ArrayList<View> f34257k;

    /* JADX INFO: renamed from: l */
    public View f34258l;

    public UserTagsView(Context context) {
        super(context);
        this.f34257k = new ArrayList<>();
    }

    /* JADX INFO: renamed from: a */
    public final void m53045a(View view) {
        cak0.m105929a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m53046b() {
        if (this.f34258l != null) {
            return;
        }
        View viewM98599a = asm.m98599a(getContext(), f6c0.f95661Ya, null);
        this.f34258l = viewM98599a;
        m53045a(viewM98599a);
        addView(this.f34258l);
        this.f34257k.add(this.f34251e);
        this.f34257k.add(this.f34247a);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m53046b();
        setLayerType(1, null);
    }

    public UserTagsView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34257k = new ArrayList<>();
    }

    public UserTagsView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34257k = new ArrayList<>();
    }
}
