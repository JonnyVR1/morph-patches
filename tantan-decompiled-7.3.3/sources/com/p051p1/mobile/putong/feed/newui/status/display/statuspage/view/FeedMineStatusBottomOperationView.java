package com.p051p1.mobile.putong.feed.newui.status.display.statuspage.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import p151v.VFrame;
import p151v.VText;
import p153l.bfh;

/* JADX INFO: loaded from: classes13.dex */
public class FeedMineStatusBottomOperationView extends VFrame {

    /* JADX INFO: renamed from: a */
    public VText f43743a;

    /* JADX INFO: renamed from: b */
    public TextView f43744b;

    /* JADX INFO: renamed from: c */
    public TextView f43745c;

    public FeedMineStatusBottomOperationView(Context context) {
        super(context);
        m66907s(context);
    }

    /* JADX INFO: renamed from: s */
    private void m66907s(Context context) {
        addView(m66908p(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: p */
    public View m66908p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return bfh.m103900b(this, layoutInflater, viewGroup);
    }

    public FeedMineStatusBottomOperationView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m66907s(context);
    }

    public FeedMineStatusBottomOperationView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m66907s(context);
    }
}
