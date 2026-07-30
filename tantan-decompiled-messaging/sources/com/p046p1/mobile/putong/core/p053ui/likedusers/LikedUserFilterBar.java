package com.p046p1.mobile.putong.core.p053ui.likedusers;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import p147v.VCheckBox;
import p147v.VRecyclerView;
import p149l.afr;
import p149l.z0c0;

/* JADX INFO: loaded from: classes12.dex */
public class LikedUserFilterBar extends LinearLayout {

    /* JADX INFO: renamed from: k */
    public static int f29954k = Color.parseColor("#d74d37");

    /* JADX INFO: renamed from: l */
    public static final int f29955l = Color.parseColor("#CC000000");

    /* JADX INFO: renamed from: a */
    public LinearLayout f29956a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f29957b;

    /* JADX INFO: renamed from: c */
    public VCheckBox f29958c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f29959d;

    /* JADX INFO: renamed from: e */
    public VCheckBox f29960e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f29961f;

    /* JADX INFO: renamed from: g */
    public VCheckBox f29962g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f29963h;

    /* JADX INFO: renamed from: i */
    public VCheckBox f29964i;

    /* JADX INFO: renamed from: j */
    public VRecyclerView f29965j;

    public LikedUserFilterBar(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m46775a(View view) {
        afr.m96267a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46775a(this);
        f29954k = getContext().getResources().getColor(z0c0.f200976d);
    }

    public LikedUserFilterBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LikedUserFilterBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
