package com.p046p1.mobile.putong.feed.newui.group.dialog.insert.selecteditem;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.apmem.tools.layouts.FlowLayout;
import p147v.VText;
import p149l.a8c0;
import p149l.auh;
import p149l.mji0;
import p149l.t100;

/* JADX INFO: loaded from: classes12.dex */
public class FeedPostSelectedHeader extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f39992a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f39993b;

    /* JADX INFO: renamed from: c */
    public VText f39994c;

    /* JADX INFO: renamed from: d */
    public VText f39995d;

    /* JADX INFO: renamed from: e */
    public VText f39996e;

    /* JADX INFO: renamed from: f */
    public FlowLayout f39997f;

    /* JADX INFO: renamed from: g */
    public VText f39998g;

    public FeedPostSelectedHeader(@NonNull Context context) {
        super(context);
        m61912b(context);
    }

    /* JADX INFO: renamed from: a */
    public View m61911a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return auh.m98994b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public final void m61912b(Context context) {
        addView(m61911a(LayoutInflater.from(context), this));
        this.f39992a.setPadding(0, t100.m186890d(16.0f), 0, 0);
        mji0.m154821o(this.f39994c, a8c0.f68034w);
        mji0.m154821o(this.f39998g, a8c0.f68034w);
    }

    public FeedPostSelectedHeader(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m61912b(context);
    }

    public FeedPostSelectedHeader(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m61912b(context);
    }

    public FeedPostSelectedHeader(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m61912b(context);
    }
}
