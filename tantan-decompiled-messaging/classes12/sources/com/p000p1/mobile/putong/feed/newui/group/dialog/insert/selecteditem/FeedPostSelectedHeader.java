package com.p000p1.mobile.putong.feed.newui.group.dialog.insert.selecteditem;

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
import l.mji0;
import l.t100;
import org.apmem.tools.layouts.FlowLayout;
import p007l.a8c0;
import p007l.auh;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedPostSelectedHeader extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f1453a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f1454b;

    /* JADX INFO: renamed from: c */
    public VText f1455c;

    /* JADX INFO: renamed from: d */
    public VText f1456d;

    /* JADX INFO: renamed from: e */
    public VText f1457e;

    /* JADX INFO: renamed from: f */
    public FlowLayout f1458f;

    /* JADX INFO: renamed from: g */
    public VText f1459g;

    public FeedPostSelectedHeader(@NonNull Context context) {
        super(context);
        m2886b(context);
    }

    /* JADX INFO: renamed from: a */
    public View m2885a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return auh.m8615b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public final void m2886b(Context context) {
        addView(m2885a(LayoutInflater.from(context), this));
        this.f1453a.setPadding(0, t100.d(16.0f), 0, 0);
        mji0.o(this.f1455c, a8c0.f5654w);
        mji0.o(this.f1459g, a8c0.f5654w);
    }

    public FeedPostSelectedHeader(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m2886b(context);
    }

    public FeedPostSelectedHeader(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2886b(context);
    }

    public FeedPostSelectedHeader(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m2886b(context);
    }
}
