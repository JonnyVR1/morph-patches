package com.p051p1.mobile.putong.feed.newui.group.groupdetail.actRender;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import p151v.VDraweeView;
import p153l.f6h;

/* JADX INFO: loaded from: classes13.dex */
public class FeedGroupDetailViewHolder extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f40908a;

    /* JADX INFO: renamed from: b */
    public View f40909b;

    /* JADX INFO: renamed from: c */
    public TextView f40910c;

    /* JADX INFO: renamed from: d */
    public TextView f40911d;

    /* JADX INFO: renamed from: e */
    public TextView f40912e;

    /* JADX INFO: renamed from: f */
    public CoordinatorLayout f40913f;

    /* JADX INFO: renamed from: g */
    public AppBarLayout f40914g;

    /* JADX INFO: renamed from: h */
    public RelativeLayout f40915h;

    /* JADX INFO: renamed from: i */
    public TextView f40916i;

    /* JADX INFO: renamed from: j */
    public TextView f40917j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f40918k;

    /* JADX INFO: renamed from: l */
    public FrameLayout f40919l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f40920m;

    /* JADX INFO: renamed from: n */
    public FrameLayout f40921n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f40922o;

    /* JADX INFO: renamed from: p */
    public FrameLayout f40923p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f40924q;

    /* JADX INFO: renamed from: r */
    public TextView f40925r;

    /* JADX INFO: renamed from: s */
    public LinearLayout f40926s;

    /* JADX INFO: renamed from: t */
    public TextView f40927t;

    /* JADX INFO: renamed from: u */
    public LinearLayout f40928u;

    /* JADX INFO: renamed from: v */
    public TabLayout f40929v;

    /* JADX INFO: renamed from: w */
    public ViewPager f40930w;

    /* JADX INFO: renamed from: x */
    public LinearLayout f40931x;

    public FeedGroupDetailViewHolder(@NonNull Context context) {
        super(context);
        addView(m63174a(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: a */
    public View m63174a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return f6h.m124275b(this, layoutInflater, viewGroup);
    }

    public FeedGroupDetailViewHolder(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        addView(m63174a(LayoutInflater.from(context), this));
    }
}
