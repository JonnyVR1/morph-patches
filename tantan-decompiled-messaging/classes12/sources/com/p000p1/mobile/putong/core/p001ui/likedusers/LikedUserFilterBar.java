package com.p000p1.mobile.putong.core.p001ui.likedusers;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import l.afr;
import l.z0c0;
import v.VCheckBox;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class LikedUserFilterBar extends LinearLayout {

    /* JADX INFO: renamed from: k */
    public static int f63k = Color.parseColor("#d74d37");

    /* JADX INFO: renamed from: l */
    public static final int f64l = Color.parseColor("#CC000000");

    /* JADX INFO: renamed from: a */
    public LinearLayout f65a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f66b;

    /* JADX INFO: renamed from: c */
    public VCheckBox f67c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f68d;

    /* JADX INFO: renamed from: e */
    public VCheckBox f69e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f70f;

    /* JADX INFO: renamed from: g */
    public VCheckBox f71g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f72h;

    /* JADX INFO: renamed from: i */
    public VCheckBox f73i;

    /* JADX INFO: renamed from: j */
    public VRecyclerView f74j;

    public LikedUserFilterBar(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m447a(View view) {
        afr.a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m447a(this);
        f63k = getContext().getResources().getColor(z0c0.d);
    }

    public LikedUserFilterBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LikedUserFilterBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
