package com.p000p1.mobile.putong.core.p001ui.profile.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import l.asm;
import l.cak0;
import l.f6c0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class UserTagsView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f2069a;

    /* JADX INFO: renamed from: b */
    public View f2070b;

    /* JADX INFO: renamed from: c */
    public VText f2071c;

    /* JADX INFO: renamed from: d */
    public ImageView f2072d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f2073e;

    /* JADX INFO: renamed from: f */
    public View f2074f;

    /* JADX INFO: renamed from: g */
    public VText f2075g;

    /* JADX INFO: renamed from: h */
    public ImageView f2076h;

    /* JADX INFO: renamed from: i */
    public VText f2077i;

    /* JADX INFO: renamed from: j */
    public VImage f2078j;

    /* JADX INFO: renamed from: k */
    public ArrayList<View> f2079k;

    /* JADX INFO: renamed from: l */
    public View f2080l;

    public UserTagsView(Context context) {
        super(context);
        this.f2079k = new ArrayList<>();
    }

    /* JADX INFO: renamed from: a */
    public final void m3603a(View view) {
        cak0.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m3604b() {
        if (this.f2080l != null) {
            return;
        }
        View viewA = asm.a(getContext(), f6c0.Ya, (ViewGroup) null);
        this.f2080l = viewA;
        m3603a(viewA);
        addView(this.f2080l);
        this.f2079k.add(this.f2073e);
        this.f2079k.add(this.f2069a);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m3604b();
        setLayerType(1, null);
    }

    public UserTagsView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2079k = new ArrayList<>();
    }

    public UserTagsView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2079k = new ArrayList<>();
    }
}
