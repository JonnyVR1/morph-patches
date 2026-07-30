package com.p000p1.mobile.putong.feed.newui.status.display.statuspage.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import p007l.mdh;
import v.VFrame;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedMineStatusBottomOperationView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VText f4356a;

    /* JADX INFO: renamed from: b */
    public TextView f4357b;

    /* JADX INFO: renamed from: c */
    public TextView f4358c;

    public FeedMineStatusBottomOperationView(Context context) {
        super(context);
        m6870s(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    private void m6870s(Context context) {
        addView(m6871p(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: p */
    public View m6871p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mdh.m11912b(this, layoutInflater, viewGroup);
    }

    public FeedMineStatusBottomOperationView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m6870s(context);
    }

    public FeedMineStatusBottomOperationView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m6870s(context);
    }
}
