package com.p051p1.mobile.putong.feed.newui.group.dialog.insert.selecteditem;

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
import p151v.VText;
import p153l.fgc0;
import p153l.msi0;
import p153l.pvh;
import p153l.qa00;

/* JADX INFO: loaded from: classes13.dex */
public class FeedPostSelectedHeader extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f40840a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f40841b;

    /* JADX INFO: renamed from: c */
    public VText f40842c;

    /* JADX INFO: renamed from: d */
    public VText f40843d;

    /* JADX INFO: renamed from: e */
    public VText f40844e;

    /* JADX INFO: renamed from: f */
    public FlowLayout f40845f;

    /* JADX INFO: renamed from: g */
    public VText f40846g;

    public FeedPostSelectedHeader(@NonNull Context context) {
        super(context);
        m63095b(context);
    }

    /* JADX INFO: renamed from: a */
    public View m63094a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pvh.m173961b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public final void m63095b(Context context) {
        addView(m63094a(LayoutInflater.from(context), this));
        this.f40840a.setPadding(0, qa00.m175859d(16.0f), 0, 0);
        msi0.m159817o(this.f40842c, fgc0.f98920w);
        msi0.m159817o(this.f40846g, fgc0.f98920w);
    }

    public FeedPostSelectedHeader(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m63095b(context);
    }

    public FeedPostSelectedHeader(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m63095b(context);
    }

    public FeedPostSelectedHeader(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m63095b(context);
    }
}
