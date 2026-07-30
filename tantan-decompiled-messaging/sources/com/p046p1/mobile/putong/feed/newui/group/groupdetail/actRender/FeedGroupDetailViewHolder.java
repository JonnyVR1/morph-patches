package com.p046p1.mobile.putong.feed.newui.group.groupdetail.actRender;

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
import p147v.VDraweeView;
import p149l.q4h;

/* JADX INFO: loaded from: classes12.dex */
public class FeedGroupDetailViewHolder extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f40060a;

    /* JADX INFO: renamed from: b */
    public View f40061b;

    /* JADX INFO: renamed from: c */
    public TextView f40062c;

    /* JADX INFO: renamed from: d */
    public TextView f40063d;

    /* JADX INFO: renamed from: e */
    public TextView f40064e;

    /* JADX INFO: renamed from: f */
    public CoordinatorLayout f40065f;

    /* JADX INFO: renamed from: g */
    public AppBarLayout f40066g;

    /* JADX INFO: renamed from: h */
    public RelativeLayout f40067h;

    /* JADX INFO: renamed from: i */
    public TextView f40068i;

    /* JADX INFO: renamed from: j */
    public TextView f40069j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f40070k;

    /* JADX INFO: renamed from: l */
    public FrameLayout f40071l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f40072m;

    /* JADX INFO: renamed from: n */
    public FrameLayout f40073n;

    /* JADX INFO: renamed from: o */
    public VDraweeView f40074o;

    /* JADX INFO: renamed from: p */
    public FrameLayout f40075p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f40076q;

    /* JADX INFO: renamed from: r */
    public TextView f40077r;

    /* JADX INFO: renamed from: s */
    public LinearLayout f40078s;

    /* JADX INFO: renamed from: t */
    public TextView f40079t;

    /* JADX INFO: renamed from: u */
    public LinearLayout f40080u;

    /* JADX INFO: renamed from: v */
    public TabLayout f40081v;

    /* JADX INFO: renamed from: w */
    public ViewPager f40082w;

    /* JADX INFO: renamed from: x */
    public LinearLayout f40083x;

    public FeedGroupDetailViewHolder(@NonNull Context context) {
        super(context);
        addView(m61991a(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: a */
    public View m61991a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return q4h.m172935b(this, layoutInflater, viewGroup);
    }

    public FeedGroupDetailViewHolder(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        addView(m61991a(LayoutInflater.from(context), this));
    }
}
